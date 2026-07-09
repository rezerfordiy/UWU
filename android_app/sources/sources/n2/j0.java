package n2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends x0 {
    public a A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;

    public class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9393b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9396e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f9399h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f9394c = new float[16];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f9397f = new int[16];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f9398g = new int[4];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9400i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9401j = false;

        public a() {
        }
    }

    public j0() {
        this.A = new a();
    }

    public int A0() {
        return this.M;
    }

    public int B0() {
        return this.K;
    }

    public int C0() {
        return this.I;
    }

    public int D0() {
        return this.L;
    }

    public int E0() {
        return this.J;
    }

    public float[] F0(int i4) {
        return new float[]{this.A.f9394c[i4]};
    }

    public String G0() {
        return this.f9522b + "_COLOR_BC_FOCUS_POS";
    }

    public String H0() {
        return this.f9522b + "_COLOR_BC_GAIN";
    }

    public String I0() {
        return this.f9522b + "_COLOR_BC_LINE_END";
    }

    public String J0() {
        return this.f9522b + "_COLOR_BC_LINE_START";
    }

    public String K0() {
        return this.f9522b + "_COLOR_BC_START_POINT";
    }

    public String L0() {
        return this.f9522b + "_COLOR_BC_STEER";
    }

    public String M0() {
        return this.f9522b + "_COLOR_BC_VOLUME";
    }

    public String N0() {
        return this.f9522b + "_COLOR_BD_ANGLE";
    }

    public String O0() {
        return this.f9522b + "_COLOR_BD_DYNAMIC_RANGE";
    }

    public String P0() {
        return this.f9522b + "_COLOR_BD_FOCUS_POS";
    }

    public String Q0() {
        return this.f9522b + "_COLOR_BD_GAIN";
    }

    public String R0() {
        return this.f9522b + "_COLOR_BD_LINE_POS";
    }

    public String S0() {
        return this.f9522b + "_COLOR_BD_START_POINT";
    }

    public String T0() {
        return this.f9522b + "_COLOR_BD_STEER";
    }

    public String U0() {
        return this.f9522b + "_COLOR_BD_VOLUME";
    }

    public void V0(int i4) {
        this.F = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_Focus", s0.a.f11071l + i4);
        }
    }

    public void W0(int i4) {
        this.G = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_gain", s0.a.f11071l + i4);
        }
    }

    public void X0(int i4) {
        this.E = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_LINE_END", s0.a.f11071l + i4);
        }
    }

    public void Y0(int i4) {
        this.D = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_LINE_START", s0.a.f11071l + i4);
        }
    }

    public void Z0(int i4) {
        this.B = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_LINE_START", s0.a.f11071l + i4);
        }
    }

    public void a1(int i4) {
        this.H = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_STEER", s0.a.f11071l + i4);
        }
    }

    public void b1(int i4) {
        this.C = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_VOLUME", s0.a.f11071l + i4);
        }
    }

    public void c1(int i4) {
        this.N = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_ANGLE", s0.a.f11071l + i4);
        }
    }

    public void d1(int i4) {
        this.P = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_DYNAMIC_RANGE", s0.a.f11071l + i4);
        }
    }

    public void e1(int i4) {
        this.O = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_FOCUS_POS", s0.a.f11071l + i4);
        }
    }

    public void f1(int i4) {
        this.M = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_ANGLE", s0.a.f11071l + i4);
        }
    }

    public void g1(int i4) {
        this.K = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_LINE_POS", s0.a.f11071l + i4);
        }
    }

    public void h1(int i4) {
        this.I = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_START_POINT", s0.a.f11071l + i4);
        }
    }

    public void i1(int i4) {
        this.L = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_STEER_INDEX", s0.a.f11071l + i4);
        }
    }

    public void j1(int i4) {
        this.J = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_VOLUME", s0.a.f11071l + i4);
        }
    }

    @Override // n2.p1
    public boolean m() {
        return true;
    }

    public int q0() {
        return this.F;
    }

    public int r0() {
        return this.G;
    }

    public int s0() {
        return this.E;
    }

    public int t0() {
        return this.D;
    }

    public int u0() {
        return this.B;
    }

    public int v0() {
        return this.H;
    }

    public int w0() {
        return this.C;
    }

    public int x0() {
        return this.N;
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        g0 g0Var = new g0();
        g0Var.f9562d = new n1(this.f9527g.f9535f, 32);
        g0Var.f9561c = this;
        g0Var.y(this.f9527g.f9535f / 2);
        return g0Var;
    }

    public int y0() {
        return this.P;
    }

    public int z0() {
        return this.O;
    }

    public j0(String str) {
        super(str);
        this.A = new a();
        o1 o1VarD = o1.d(null);
        this.B = o1VarD.e(K0(), 50);
        this.C = o1VarD.e(M0(), 100);
        this.D = o1VarD.e(J0(), 48);
        this.E = o1VarD.e(I0(), 80);
        this.F = o1VarD.e(G0(), 0);
        this.G = o1VarD.e(H0(), 160);
        this.H = o1VarD.e(L0(), 0);
        this.I = o1VarD.e(S0(), 50);
        this.J = o1VarD.e(U0(), 64);
        this.K = o1VarD.e(R0(), 64);
        this.L = o1VarD.e(T0(), 0);
        this.M = o1VarD.e(Q0(), 140);
        this.N = o1VarD.e(N0(), 0);
        this.O = o1VarD.e(P0(), 0);
        this.P = o1VarD.e(O0(), 60);
    }
}
