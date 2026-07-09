package z1;

import java.util.HashMap;
import java.util.Map;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Map<String, Object>> f13847a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f13849c;

    public static u0 g(int i4, int i5) {
        u0 u0Var = new u0();
        u0Var.i(n0.e.MODE_B.toString(), i4, i5, 0);
        return u0Var;
    }

    public static u0 h(int i4, int i5, int i6) {
        u0 u0Var = new u0();
        u0Var.i(n0.e.MODE_B.toString(), i4, i5, 0);
        u0Var.i(n0.e.MODE_BM.toString(), i4, i5, 0);
        u0Var.i(n0.e.MODE_BC.toString(), i4, i5, i6);
        u0Var.i(n0.e.MODE_BP.toString(), i4, i5, i6);
        u0Var.i(n0.e.MODE_BD.toString(), i4, i5, i6);
        return u0Var;
    }

    @Override // z1.r
    public String[] a() {
        return new String[0];
    }

    @Override // z1.r
    public Map<String, Object> b(String[] strArr) {
        return null;
    }

    @Override // z1.r
    public byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f13848b;
        }
        return bArr;
    }

    @Override // z1.r
    public boolean d(byte[] bArr, String str) {
        synchronized (this) {
            this.f13847a.containsKey(str);
            Map<String, Object> map = this.f13847a.get(str);
            if (map == null) {
                this.f13849c = null;
                this.f13848b = null;
                return false;
            }
            int i4 = Integer.parseInt(map.get("samplePerLine").toString());
            int i5 = Integer.parseInt(map.get("linePerFrame").toString());
            int i6 = Integer.parseInt(map.get("suffixLine").toString());
            if ((i5 + i6) * i4 != bArr.length) {
                this.f13849c = null;
                this.f13848b = null;
                return false;
            }
            byte[] bArr2 = new byte[i5 * i4];
            this.f13848b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            if (i6 <= 0) {
                this.f13849c = null;
            } else {
                byte[] bArr3 = new byte[i4 * i6];
                this.f13849c = bArr3;
                System.arraycopy(bArr, this.f13848b.length, bArr3, 0, bArr3.length);
            }
            return true;
        }
    }

    @Override // z1.r
    public byte[] e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f13849c;
        }
        return bArr;
    }

    @Override // z1.r
    public Map<String, Object> f(byte[] bArr, String str) {
        return null;
    }

    public void i(String str, int i4, int i5, int i6) {
        HashMap map = new HashMap();
        map.put("samplePerLine", Integer.valueOf(i4));
        map.put("linePerFrame", Integer.valueOf(i5));
        map.put("suffixLine", Integer.valueOf(i6));
        this.f13847a.put(str, map);
    }
}
