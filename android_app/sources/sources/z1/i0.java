package z1;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f13318a;

    public static i0 b(i iVar) {
        i0 i0Var = new i0();
        i0Var.f13318a = iVar;
        return i0Var;
    }

    @Override // z1.k
    public m2.y a(m2.y yVar, m2.u uVar, int i4) {
        yVar.f8915b = this.f13318a.x(yVar.f8916c, uVar.f8883a, yVar.f8917d, yVar.f8918e, yVar.f8919f, yVar.f8920g, i4);
        return yVar;
    }
}
