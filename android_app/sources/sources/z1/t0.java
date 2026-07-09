package z1;

import java.util.HashMap;
import java.util.Map;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Map<String, Integer>> f13844a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f13846c;

    public static t0 g(int i4, int i5) {
        t0 t0Var = new t0();
        t0Var.i(n0.e.MODE_B.toString(), i4, i5, 0);
        return t0Var;
    }

    public static t0 h(int i4, int i5, int i6) {
        t0 t0Var = new t0();
        t0Var.i(n0.e.MODE_B.toString(), i4, i5, 0);
        t0Var.i(n0.e.MODE_BM.toString(), i4, i5, 0);
        t0Var.i(n0.e.MODE_BC.toString(), i4, i5, i6);
        t0Var.i(n0.e.MODE_BP.toString(), i4, i5, i6);
        t0Var.i(n0.e.MODE_BD.toString(), i4, i5, i6);
        return t0Var;
    }

    @Override // z1.r
    public String[] a() {
        return new String[]{n0.a.MODE.toString()};
    }

    @Override // z1.r
    public Map<String, Object> b(String[] strArr) {
        return new HashMap();
    }

    @Override // z1.r
    public byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f13845b;
        }
        return bArr;
    }

    @Override // z1.r
    public boolean d(byte[] bArr, String str) {
        synchronized (this) {
            if (bArr == null) {
                return false;
            }
            Map<String, Integer> map = this.f13844a.get(str);
            if (map == null) {
                this.f13846c = null;
                this.f13845b = null;
                return false;
            }
            int iIntValue = map.get("samplePerLine").intValue();
            int iIntValue2 = map.get("linePerFrame").intValue();
            int iIntValue3 = map.get("suffixLine").intValue();
            if ((iIntValue2 + iIntValue3) * iIntValue != bArr.length) {
                this.f13846c = null;
                this.f13845b = null;
                return false;
            }
            int i4 = iIntValue2 * iIntValue;
            byte[] bArr2 = new byte[i4];
            this.f13845b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            if (iIntValue3 <= 0) {
                this.f13846c = null;
            } else {
                int i5 = iIntValue * iIntValue3;
                byte[] bArr3 = new byte[i5];
                this.f13846c = bArr3;
                System.arraycopy(bArr, this.f13845b.length, bArr3, 0, i5);
            }
            return true;
        }
    }

    @Override // z1.r
    public byte[] e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f13846c;
        }
        return bArr;
    }

    @Override // z1.r
    public Map<String, Object> f(byte[] bArr, String str) {
        HashMap map = new HashMap();
        if (!d(bArr, str)) {
            return null;
        }
        map.put("b_data", c());
        if (e() != null) {
            map.put("suffix_data", e());
        }
        return map;
    }

    public void i(String str, int i4, int i5, int i6) {
        HashMap map = new HashMap();
        map.put("samplePerLine", Integer.valueOf(i4));
        map.put("linePerFrame", Integer.valueOf(i5));
        map.put("suffixLine", Integer.valueOf(i6));
        this.f13844a.put(str, map);
    }
}
