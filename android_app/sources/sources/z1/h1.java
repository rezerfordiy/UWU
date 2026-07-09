package z1;

import z1.n0;
import z1.u5;
import z1.v0;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends f1 implements q, u5.c, v0.b {
    public h1(u5 u5Var) {
        super(u5Var);
    }

    @Override // z1.f1, z1.d1, z1.c1
    public n0 e(String str) {
        return f(str, g());
    }

    @Override // z1.c1
    public int g() {
        s1 s1Var = (s1) this.f12987k.a(n0.a.IMAGEUNITCHECKER.toString());
        return s1Var.h3().size() == 1 ? s1Var.h3().get(0).intValue() : this.f12953c;
    }

    @Override // z1.f1, z1.d1
    public void w(q0 q0Var) {
        super.w(q0Var);
    }

    @Override // z1.f1, z1.d1
    public void x(v0 v0Var) {
        this.f12982f = v0Var;
        v0Var.f13977a = this;
    }
}
