package t3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f11518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Class<?>, List<c>> f11519b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Class<?>, List<a>> f11520c = new HashMap();

    public j(Class<?> cls) {
        this.f11518a = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        for (Class<?> cls2 : j(cls)) {
            for (Method method : cls2.getDeclaredMethods()) {
                a(new c(method), this.f11519b);
            }
            for (Field field : cls2.getDeclaredFields()) {
                a(new a(field), this.f11520c);
            }
        }
    }

    public final <T extends b<T>> void a(T t4, Map<Class<?>, List<T>> map) {
        for (Annotation annotation : t4.a()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            List<T> listD = d(map, clsAnnotationType);
            if (t4.b(listD)) {
                return;
            }
            if (l(clsAnnotationType)) {
                listD.add(0, t4);
            } else {
                listD.add(t4);
            }
        }
    }

    public <T> List<T> b(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = c(cls).iterator();
        while (it.hasNext()) {
            try {
                Object objD = it.next().d(obj);
                if (cls2.isInstance(objD)) {
                    arrayList.add(cls2.cast(objD));
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e4);
            }
        }
        return arrayList;
    }

    public List<a> c(Class<? extends Annotation> cls) {
        return d(this.f11520c, cls);
    }

    public final <T> List<T> d(Map<Class<?>, List<T>> map, Class<? extends Annotation> cls) {
        if (!map.containsKey(cls)) {
            map.put(cls, new ArrayList());
        }
        return map.get(cls);
    }

    public List<c> e(Class<? extends Annotation> cls) {
        return d(this.f11519b, cls);
    }

    public Annotation[] f() {
        Class<?> cls = this.f11518a;
        return cls == null ? new Annotation[0] : cls.getAnnotations();
    }

    public Class<?> g() {
        return this.f11518a;
    }

    public String h() {
        Class<?> cls = this.f11518a;
        return cls == null ? "null" : cls.getName();
    }

    public Constructor<?> i() {
        Constructor<?>[] constructors = this.f11518a.getConstructors();
        w2.c.s(1L, constructors.length);
        return constructors[0];
    }

    public final List<Class<?>> j(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public boolean k() {
        return this.f11518a.isMemberClass() && !Modifier.isStatic(this.f11518a.getModifiers());
    }

    public final boolean l(Class<? extends Annotation> cls) {
        return cls.equals(w2.e.class) || cls.equals(w2.f.class);
    }
}
