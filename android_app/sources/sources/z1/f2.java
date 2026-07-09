package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f2 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, j0> f13131a = new HashMap();

    @Override // z1.p
    public byte[] a(byte[] bArr, float f4, int i4, String str) {
        j0 j0Var = this.f13131a.containsKey(str) ? this.f13131a.get(str) : this.f13131a.get("_master_compounder");
        if (j0Var == null) {
            j0Var = this.f13131a.get("_master_compounder");
        }
        return j0Var == null ? bArr : j0Var.a(bArr, f4, i4, str);
    }

    @Override // z1.p
    public byte[] b(byte[] bArr, float f4, int i4, String str, boolean z3, boolean z4, float f5, float f6) {
        j0 j0Var = this.f13131a.containsKey(str) ? this.f13131a.get(str) : this.f13131a.get("_master_compounder");
        if (j0Var == null) {
            j0Var = this.f13131a.get("_master_compounder");
        }
        return j0Var == null ? bArr : j0Var.b(bArr, f4, i4, str, z3, z4, f5, f6);
    }

    public void c(j0 j0Var, String str) {
        this.f13131a.put(str, j0Var);
    }

    public void d(j0 j0Var) {
        this.f13131a.put("_master_compounder", j0Var);
    }
}
