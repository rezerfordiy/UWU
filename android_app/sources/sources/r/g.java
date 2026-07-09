package r;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f10542a = new HashMap<>();

    public float a(Object obj, String str, int i4) {
        if (!this.f10542a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> map = this.f10542a.get(obj);
        if (!map.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = map.get(str);
        if (fArr.length > i4) {
            return fArr[i4];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i4, float f4) {
        HashMap<String, float[]> map;
        if (this.f10542a.containsKey(obj)) {
            map = this.f10542a.get(obj);
            if (map.containsKey(str)) {
                float[] fArrCopyOf = map.get(str);
                if (fArrCopyOf.length <= i4) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, i4 + 1);
                }
                fArrCopyOf[i4] = f4;
                map.put(str, fArrCopyOf);
                return;
            }
            float[] fArr = new float[i4 + 1];
            fArr[i4] = f4;
            map.put(str, fArr);
        } else {
            map = new HashMap<>();
            float[] fArr2 = new float[i4 + 1];
            fArr2[i4] = f4;
            map.put(str, fArr2);
        }
        this.f10542a.put(obj, map);
    }
}
