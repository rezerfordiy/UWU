# MedVision-V0-7B
**MedVision-V0-7B** это VLM для количественного анализа медицинских изображений. Представляет собой до обученную модель **Qwen/Qwen2.5-VL-7B-Instruct** на датасете [[#MedVision_Dataset|MedVision]], для выполнения трех количественных задач, не опирающихся на сторонние ресурсы
- Обнаружение - локализация и идентификация анатомических структур и аномалий. ( bounding boxes) 
- Оценка размеров опухоли/поражений (T/L) - двунаправленный измерения по большой и малой осям
- Измерение углов/расстояний (A/D) - например, углы сочленений и структруные расстояния
Модель думает в физических единицах. Она оценивает ориентирные и конечный координаты, потом преобразует их в действительные измерения, используя размеры пикселей и изображения в промпте. 
 Рассуждения модели выводятся внутри тегов `<think>...</think>`, а итоговый ответ - внутри `<answer>...</answer>`

# MedVision_Dataset 
- [https://medvision-vlm.github.io/explorer.html](https://medvision-vlm.github.io/explorer.html)
- 22 датасета, 29K 3D изображений, 24.3M/45.3M single-/multi-instance annotations.
- CT, MRI, X-ray, ultrasound (US), PET только те изображения, у которых в метаданных файла содержится информация о физическом размере пикселя.
- abdomen, brain, heart, kidney, knee, head & neck, tooth, fetal brain, whole body, and more.
- Annotation types: bounding boxes, T/L size (major and minor axis lengths of a fitted ellipse), and angle/distance (derived from human-annotated landmarks).
- Все измерения представлены в клинически осмысленных физических единицах
- Medical volumes follow standard RAS+ orientation and support axial, coronal, and sagittal views.
  - RAS+ — это стандартная система координат для 3D‑медицинских изображений:
    - R = Right (право)
    - A = Anterior (перед)
    - S = Superior (верх)  
        Направления осей положительные в этих направлениях.
    - Поддерживаются три классические проекции:
    - axial — аксиальная (поперечная),
    - coronal — корональная (фронтальная),
    - sagittal — сагиттальная (профильная).
- 70% train / 30% test на уровне пациентов
## Подвыборка

| Задача                            | Семплы |
| --------------------------------- | ------ |
| Обнаружение                       | 110K   |
| Оценка размеров опухоли/поражений | 5.5K   |
| Измерение углов/расстояний        | 5.5K   |
| Итого                             | 121K   |
## Условия 
1. При обучении модели использовались только аксиальные (поперечные) срезы объёмных медицинских изображений. 
	Срезы в корональной (фронтальной) и сагиттальной (профильной) плоскостях намеренно исключены из обучающей выборки, чтобы проверить, сможет ли модель, обученная на одной плоскости, корректно работать со срезами в других плоскостях, которые она никогда не видела во время тренировки. 
2. Задача обнаружения при обучении попадается гораздо реже, чтобы гарантировать баланс.
3. Каждый обучающий пример состоит из:
   - Изображения  512×512 
   - Вопроса, который описывает, какую задачу нужно выполнить
   - Ожидаемого ответа — эталонного ответа, который модель должна сгенерировать.
# Training Recipe
Обучение MedVision-V0 имеет две стадии
- supervised fine-tuning (SFT) с пошаговыми рассуждениями 
- reinforcement fine-tuning (RFT) с использованием алгоритма GRPO
## Supervised fine-tuning (SFT) с пошаговыми рассуждениями 
Модель изучает необходимые форматы ответов и шаблоны рассуждений. Каждый обучающий ответ включает пошаговый алгоритм рассуждений внутри `<think>...</think>`, за которым следует окончательный результат внутри `<answer>...</answer>`. Текст рассуждений генерируется путем вставки известных правильных промежуточных значений (например, координат ориентиров) в структурированные шаблоны, поэтому модель учится сначала локализовать, а затем вычислять.

| Параметр              | Значение                                                        |
| --------------------- | --------------------------------------------------------------- |
| Метод                 | Full fine-tuning (all parameters)                               |
| Данные                | 121K multi-task CoT samples (110K detect / 5.5K T/L / 5.5K A/D) |
| Размер изображения    | 512×512                                                         |
| Эпохи                 | 3                                                               |
| Per-device batch size | 8                                                               |
| Накопление градиента  | 8                                                               |
| GPUs                  | 4                                                               |
| Итоговый размер батча | 256                                                             |
| Точность              | bf16 mixed precision (FSDP `FULL_SHARD`)                        |
| Optimization          | Flash-Attention 2, gradient checkpointing                       |
| Sampler               | искусственно увеличивает вероятность выбора из  (T/L и A/D)     |

## Reinforcement fine-tuning (RFT) с использованием алгоритма GRPO
Далее модель обучается с подкреплением по алгоритму GRPO ([Реализация](https://github.com/YongchengYAO/verl/tree/medvision-rl) ).
Используются те же 121К, но из них убраны пошаговые рассуждения, и модель учится на основе получаемых оценок за свои ответы. 
Задачи тренируются последовательно: сначала A/D, затем T/L и в конце Обнаружение.

Помимо стандартных оценок формата и ответа GRPO, для задач T/L и A/D вводятся промежуточные оценки точности, которые поощряют правильные промежуточные шаги (например, точные координаты ориентиров); 
Все оценки вычисляются как $e^{-x}$, где $x$ — ошибка предсказания, а итоговая награда рассчитывается по формуле
$$
r = r_{format} + r_{process} \cdot r_{answer}
$$

 Такое сочетание способствует тому, что оценка за итоговый ответ вносит существенный вклад только в том случае, если промежуточный шаг локализации также выполнен правильно.
 
  SFT даёт значительный прирост относительно базовой модели на всех трёх задачах, а дополнительный этап RFT обеспечивает дальнейшие стабильные улучшения, включая обобщение на не встречавшиеся при обучении плоскости изображений и на невиданные анатомические цели.
# Использование
MedVision-V0-7B построена на основе `Qwen2.5-VL-7B-Instruct` и загружается со стандартным `API Qwen2_5_VLForConditionalGeneration` / `AutoProcessor`. Особенностью этой модели является формат промптов и выходных данных, на которых она обучалась. 
## Требуемый формат выходных данных (общий для всех трех задач)
Используйте этот системный промпт для каждого запроса (она же используется во время тестирования производительности, с помощью флага `--use_system_prompt`):
```text
A conversation between a User and an Assistant. The User asks a question, and the Assistant solves it. The Assistant first thinks through the reasoning process internally, then provides the User with the answer. The reasoning process and the final answer must be enclosed within <think> </think> and <answer> </answer> tags, respectively. For example: <think> reasoning process here </think> <answer> answer here </answer>. Within the <think> </think> tags, report the reasoning process for each step inside <step-k-reasoning> </step-k-reasoning> tags, followed by the intermediate results in <step-k-answer> </step-k-answer> tags. For example: <think> <step-1-reasoning> reasoning for step 1 </step-1-reasoning> <step-1-answer> intermediate result from step 1 </step-1-answer> </think>.

```

## Формат промптов и ответов для всех задач

Выпущенная модель была обучена и протестирована с использованием chain-of-thought prompts, приведенными ниже. 
Каждый промпт содержит до четырех блоков
- `Task:`
- `Additional information:`
- `Format requirement:`
- `Reasoning steps:`
Источники:
- [`medvision_utils.py`](https://github.com/YongchengYAO/MedVision/blob/master/src/medvision_bm/medvision_lmms_eval/lmms_eval/tasks/medvision/medvision_utils.py) 
- [`sft_prompts.py`](https://github.com/YongchengYAO/MedVision/blob/master/src/medvision_bm/sft/sft_prompts.py) 

### Кратко

| Задача                            | `Additional information:`? | Что внутри `<answer>`                                                                                                                                                             | Пример ответа                          |
| --------------------------------- | -------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------- |
| Обнаружение                       | no                         | 4 decimal, разделенные запятой,  `x0,y0,x1,y1` - относительные координаты $\in [0, 1]$ , с началом координат в нижнем левом углу изображения. <br>Без физических единиц измерения | `<answer>0.31,0.42,0.55,0.68</answer>` |
| Оценка размеров опухоли/поражений | yes                        | 2 числа: большая ось, потом малая ось, в реальных физических единицах                                                                                                             | `<answer>(24.13, 11.07)</answer>`      |
| Измерение углов/расстояний        | yes                        | одно число (угол в градусах или расстояние в mm).                                                                                                                                 | `<answer>3.42</answer>`                |

### Обнаружение 
(doc_to_text_BoxCoordinate_CoT) без `Additional information:` блока:
```text
Task:
Given the input medical image: <image_description>, return the coordinates of the lower-left and upper-right corners of the bounding box for the <label>.
Format requirement:
The reasoning process and the final answer must be enclosed within <think> </think> and <answer> </answer> tags, respectively. For example: <think> reasoning process here </think> <answer> answer here </answer>. The answer should be four decimal numbers separated by commas without any units or additional text. The first two numbers are the coordinates of the lower-left corner and the last two numbers are the coordinates of the upper-right corner of the bounding box. Use relative coordinates in the image space, where the origin is at the lower-left corner of the image. Relative coordinates should be values between 0 and 1, representing the relative positions in the image.
Reasoning steps:
Step 1: Identify the relative coordinates of the bounding box. The relative coordinates must be written as (x, y), where x is the relative position in width and y is the relative position in height. Report the reasoning process and final answer within <think> </think> and <answer> </answer> tags, respectively. Inside <think> </think>, include reasoning and step results using <step-k-reasoning> </step-k-reasoning> and <step-k-answer> </step-k-answer> tags.
Follow the reasoning steps to get the final answer in the required format.

```

### T/L 
(doc_to_text_TumorLesionSize_CoT):
```text
Task:
Given the input medical image: <image_description>, estimate the major and minor axis lengths of the ellipse enclosing the <label>, in <unit>.
Additional information:
The image size is <W> pixels (width) x <H> pixels (height).
The pixel size for this image is <pw> <unit> (width) x <ph> <unit> (height).
Format requirement:
The final answer must be enclosed within <answer> </answer> tags. The answer should consist of two decimal numbers separated by a comma, without units or extra text. The first number is the major axis length, and the second is the minor axis length.
Reasoning steps:
Step 1: Identify the major axis (the longest diameter) of the ellipse enclosing the target region. Find its two endpoints and record their relative coordinates in the format (x, y) = (relative position in width direction, relative position in height direction). Denote the endpoints as (x1_major, y1_major) and (x2_major, y2_major). Step 2: Identify the minor axis (the shortest diameter) of the ellipse. Find its two endpoints and record their relative coordinates in the same (x, y) format. Denote them as (x1_minor, y1_minor) and (x2_minor, y2_minor). Step 3: Given the pixel dimensions (pixel_width, pixel_height) and image size (image_width, image_height), compute the physical length of the major axis using: major_axis_length = sqrt(((x2_major - x1_major) * image_width * pixel_width)^2 + ((y2_major - y1_major) * image_height * pixel_height)^2). Step 4: Similarly, compute the physical length of the minor axis using: minor_axis_length = sqrt(((x2_minor - x1_minor) * image_width * pixel_width)^2 + ((y2_minor - y1_minor) * image_height * pixel_height)^2). Report the reasoning process and final answer within <think> </think> and <answer> </answer> tags, respectively. Inside <think> </think>, include reasoning and step results using <step-k-reasoning> </step-k-reasoning> and <step-k-answer> </step-k-answer> tags.
Follow the reasoning steps to get the final answer in the required format.

```

### A/D 
(doc_to_text_BiometricsFromLandmarks_CoT) - `Task:` линия и `Reasoning steps:` отличаются от метрики (расстояние или угол)
```text
Task:
Given the input medical image: <image_description>, <task line>
Additional information:
The image size is <W> pixels (width) x <H> pixels (height).
The pixel size for this image is <pw> <unit> (width) x <ph> <unit> (height).
Format requirement:
The final answer must be enclosed within <answer> </answer> tags. The answer should be a single decimal number without units or extra text.
Reasoning steps:
<reasoning steps>
Follow the reasoning steps to get the final answer in the required format.

```
#### Расстояние
- `<task line>`: `estimate the distance of <name> in <unit>, which is the distance between 2 landmark points: (landmark 1) <p1>, (landmark 2) <p2>.`
- `<reasoning steps>`: `Step 1: Identify the landmark 1 and record its relative coordinates in the format (x, y) = (relative position in width direction, relative position in height direction). Denote the coordinates as (x1, y1). Step 2: Identify the landmark 2 and record its relative coordinates in the same (x, y) format. Denote the coordinates as (x2, y2). Step 3: Given the pixel dimensions (pixel_width, pixel_height) and image size (image_width, image_height), compute the physical distance between the two landmarks using: distance = sqrt(((x2 - x1) * image_width * pixel_width)^2 + ((y2 - y1) * image_height * pixel_height)^2). Report the reasoning process and final answer within <think> </think> and <answer> </answer> tags, respectively. Inside <think> </think>, include reasoning and step results using <step-k-reasoning> </step-k-reasoning> and <step-k-answer> </step-k-answer> tags.`
#### Угол
- `<task line>`: `estimate the angle of <name> in <unit>, which is the angle between 2 lines: (line 1) the line connecting <l1p1> and <l1p2>, (line 2) the line connecting <l2p1> and <l2p2>.`
- `<reasoning steps>`: `Step 1: Identify line 1 and record the relative coordinates of its two endpoints in the format (x, y) = (relative position in width direction, relative position in height direction). Denote the endpoints as (x1_line1, y1_line1) and (x2_line1, y2_line1). Step 2: Identify line 2 and record the relative coordinates of its two endpoints in the same (x, y) format. Denote them as (x1_line2, y1_line2) and (x2_line2, y2_line2). Step 3: Given the pixel dimensions (pixel_width, pixel_height) and image size (image_width, image_height), compute the angle between the two lines using the formula: angle = arccos(|A · B| / (||A|| ||B||)), where A and B are the vectors of the two lines computed from the physical coordinates of their endpoints. A = ((x2_line1 - x1_line1) * image_width * pixel_width, (y2_line1 - y1_line1) * image_height * pixel_height) and B = ((x2_line2 - x1_line2) * image_width * pixel_width, (y2_line2 - y1_line2) * image_height * pixel_height). Denote A=(Ax, Ay) and B=(Bx, By). Then, angle = arccos(|Ax*Bx + Ay*By| / (sqrt(Ax^2 + Ay^2) * sqrt(Bx^2 + By^2))). Report the reasoning process and final answer within <think> </think> and <answer> </answer> tags, respectively. Inside <think> </think>, include reasoning and step results using <step-k-reasoning> </step-k-reasoning> and <step-k-answer> </step-k-answer> tags.`
## Быстрый старт
##
#

#