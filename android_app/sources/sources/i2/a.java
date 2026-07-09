package i2;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static ArrayList<Integer> a(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] iArr = new int[i4];
        float[] fArr = new float[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = 0;
            for (int i12 = i8; i12 < i9; i12++) {
                i11 += bArr[(i10 * i5) + i12] & 255;
            }
            iArr[i10] = i11;
        }
        for (int i13 = 5; i13 < i4; i13++) {
            float f4 = (i9 - i8) / 1.0f;
            if (iArr[i13] / f4 >= i6) {
                float fPow = 0.0f;
                for (int i14 = i8; i14 < i9; i14++) {
                    fPow += (float) Math.pow((bArr[(i13 * i5) + i14] & 255) - r6, 2.0d);
                }
                float f5 = fPow / f4;
                fArr[i13] = f5;
                if (f5 < i7) {
                    arrayList.add(Integer.valueOf(i13));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> b(ArrayList<Integer> arrayList, int i4, int i5) {
        if (arrayList.size() == 0) {
            return null;
        }
        Collections.sort(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int iIntValue = arrayList.get(0).intValue();
        int i6 = 1;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7).intValue() - arrayList.get(i7 - 1).intValue() < i4) {
                iIntValue += arrayList.get(i7).intValue();
                i6++;
            } else {
                if (i6 > i5) {
                    arrayList2.add(Integer.valueOf(iIntValue / i6));
                }
                iIntValue = 0;
                i6 = 0;
            }
        }
        if (i6 > i5) {
            arrayList2.add(Integer.valueOf(iIntValue / i6));
        }
        return arrayList2;
    }
}
