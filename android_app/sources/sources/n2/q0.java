package n2;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends x0 {
    public int A;

    public q0() {
        this.A = 0;
    }

    @Override // n2.p1
    public String K() {
        return super.K() + "_" + this.A;
    }

    public void q0(int i4) {
        this.A = i4;
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        p0 p0Var = new p0();
        p0Var.f9562d = new n1(this.f9527g.f9535f, 0);
        p0Var.f9561c = this;
        p0Var.y(this.f9527g.f9535f / 2);
        return p0Var;
    }

    public q0(String str) {
        super(str);
        this.A = 0;
    }
}
