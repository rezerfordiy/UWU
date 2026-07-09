package n2;

/* JADX INFO: loaded from: classes.dex */
public class ia extends ja {
    public boolean W;
    public boolean X;

    public ia() {
        this.W = false;
    }

    @Override // n2.p1
    public String K() {
        return super.K() + (this.X ? "_PAON" : "_PAOFF");
    }

    @Override // n2.p1
    public boolean c() {
        return true;
    }

    public boolean d2() {
        return this.X;
    }

    public void e2(boolean z3) {
        this.X = z3;
    }

    @Override // n2.ja, n2.i0, n2.x0, n2.b1, n2.p1
    public r0 y() {
        ha haVar = new ha();
        haVar.f9562d = E1();
        haVar.B = D1();
        haVar.J = C1();
        haVar.A = i0();
        haVar.f9561c = this;
        haVar.q0(L0());
        return haVar;
    }

    public ia(String str) {
        super(str);
        this.W = false;
    }
}
