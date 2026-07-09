package z1;

/* JADX INFO: loaded from: classes.dex */
public class l2 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f13583a;

    public static l2 b(i iVar) {
        l2 l2Var = new l2();
        l2Var.f13583a = iVar;
        return l2Var;
    }

    @Override // z1.k7
    public m2.c0 a(m2.c0 c0Var, m2.u uVar, int i4) {
        c0Var.f8728b = this.f13583a.z(c0Var.f8729c, uVar.f8883a, c0Var.f8730d, c0Var.f8731e, c0Var.f8732f, c0Var.f8733g, i4);
        return c0Var;
    }
}
