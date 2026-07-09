package n2;

/* JADX INFO: loaded from: classes.dex */
public class m1 extends i0 {
    public boolean W;

    public m1() {
    }

    @Override // n2.p1
    public String K() {
        return super.K() + (this.W ? "_PAON" : "_PAOFF");
    }

    public void a2(boolean z3) {
        this.W = z3;
    }

    @Override // n2.p1
    public boolean c() {
        return true;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public r0 y() {
        l1 l1Var = new l1();
        if (t()) {
            u uVar = new u(l1Var);
            uVar.o(new w());
            l1Var.U(uVar);
        }
        l1Var.f9562d = E1();
        l1Var.B = D1();
        l1Var.J = C1();
        l1Var.A = i0();
        l1Var.f9561c = this;
        l1Var.q0(L0());
        l1Var.y(this.f9527g.f9535f / 2);
        return l1Var;
    }

    public m1(String str) {
        super(str);
    }
}
