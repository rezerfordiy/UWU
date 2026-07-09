package n2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends x0 {
    public static final /* synthetic */ boolean V = false;
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
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    public class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9356c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9360g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9363j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f9365l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f9366m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9367n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f9370q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f9372s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9374u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f9375v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9376w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9378y;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f9357d = new float[16];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9361h = 16;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9362i = 60;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int[] f9364k = new int[16];

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int[] f9368o = new int[9];

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f9369p = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int[] f9371r = new int[16];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int[] f9373t = new int[16];

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int[] f9377x = new int[9];

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int[] f9379z = new int[16];
        public boolean A = false;

        public a() {
        }
    }

    public i0() {
        this.A = new a();
    }

    public int A0() {
        return this.J;
    }

    public String A1() {
        return this.f9522b + "_COLOR_BD_STEER_INDEX";
    }

    public int B0() {
        return this.R;
    }

    public String B1() {
        return this.f9522b + "_COLOR_BD_VOLUME_INDEX";
    }

    public int C0() {
        return this.T;
    }

    public f C1() {
        return new f();
    }

    public int D0() {
        return this.S;
    }

    public k0 D1() {
        return null;
    }

    public int E0() {
        return this.Q;
    }

    public n1 E1() {
        return new n1(this.f9527g.f9535f, 32);
    }

    public int F0() {
        return this.O;
    }

    public boolean F1() {
        return false;
    }

    public int G0() {
        return this.U;
    }

    public void G1(int i4) {
        this.I = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_PRF", s0.a.f11071l + i4);
        }
        o1.d(null).i(o1(), this.I);
    }

    public int H0() {
        return this.M;
    }

    public void H1(int i4) {
        this.L = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_darkPassFilter", s0.a.f11071l + i4);
        }
    }

    public int I0() {
        return this.P;
    }

    public void I1(int i4) {
        this.F = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_FOCUS_POS", s0.a.f11071l + i4);
        }
        o1.d(null).i(k1(), i4);
    }

    public int J0() {
        return this.N;
    }

    public void J1(int i4) {
        this.G = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_gain", s0.a.f11071l + i4);
        }
        o1.d(null).i(l1(), i4);
    }

    public int K0(byte b4) {
        return b4 & 15;
    }

    public void K1(int i4) {
        this.E = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_LINE_END", s0.a.f11071l + i4);
        }
        o1.d(null).i(m1(), i4);
    }

    public int L0() {
        return 0;
    }

    public void L1(int i4) {
        this.D = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_LINE_START", s0.a.f11071l + i4);
        }
        o1.d(null).i(n1(), i4);
    }

    public i0 M0() {
        return null;
    }

    public void M1(int i4) {
        this.K = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_simplify", s0.a.f11071l + i4);
        }
    }

    public int N0() {
        return this.A.f9358e;
    }

    public void N1(int i4) {
        this.B = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_START_POINT", s0.a.f11071l + i4);
        }
        o1.d(null).i(p1(), this.B);
    }

    public float O0() {
        return this.A.f9365l;
    }

    public void O1(int i4) {
        this.H = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_STEER_INDEX", s0.a.f11071l + i4);
        }
        o1.d(null).i(q1(), i4);
    }

    public int P0() {
        return this.A.f9356c;
    }

    public void P1(int i4) {
        this.C = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BC_VOLUME", s0.a.f11071l + i4);
        }
        o1.d(null).i(r1(), this.C);
    }

    public float Q0(int i4) {
        return this.A.f9357d[i4];
    }

    public void Q1(int i4) {
        this.J = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bc_WF", s0.a.f11071l + i4);
        }
        o1.d(null).i(s1(), this.J);
    }

    public int R0() {
        return this.A.f9360g;
    }

    public void R1(int i4) {
        this.R = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bd_angle", s0.a.f11071l + i4);
        }
        o1.d(null).i(t1(), i4);
    }

    public int S0() {
        return this.A.f9359f;
    }

    public void S1(int i4) {
        this.T = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_DYNAMIC_RANGE", s0.a.f11071l + i4);
        }
        o1.d(null).i(u1(), i4);
    }

    public int T0(int i4) {
        return this.A.f9364k[i4];
    }

    public void T1(int i4) {
        this.S = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_FOCUS_POS", s0.a.f11071l + i4);
        }
        o1.d(null).i(v1(), i4);
    }

    public int U0() {
        return this.A.f9363j;
    }

    public void U1(int i4) {
        this.Q = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_GAIN", s0.a.f11071l + i4);
        }
        o1.d(null).i(w1(), i4);
    }

    @Override // n2.x0
    public int V() {
        return this.f9683s.f9691b == 0 ? W0() : super.V();
    }

    public int V0(int i4) {
        return this.A.f9368o[i4];
    }

    public void V1(int i4) {
        this.O = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_LINE_POS", s0.a.f11071l + i4);
        }
        o1.d(null).i(x1(), i4);
    }

    @Override // n2.x0
    public int W(int i4) {
        return this.f9683s.f9691b == 0 ? V0(i4) : super.W(i4);
    }

    public int W0() {
        return this.A.f9367n;
    }

    public void W1(int i4) {
        this.U = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "bd_PRF", s0.a.f11071l + i4);
        }
        o1.d(null).i(y1(), this.U);
    }

    public int X0() {
        return this.A.f9366m;
    }

    public void X1(int i4) {
        this.M = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_START_POINT", s0.a.f11071l + i4);
        }
        o1.d(null).i(z1(), i4);
    }

    public float Y0() {
        return this.A.f9375v;
    }

    public void Y1(int i4) {
        this.P = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_STEER_INDEX", s0.a.f11071l + i4);
        }
        o1.d(null).i(A1(), i4);
    }

    public int Z0() {
        return this.A.f9370q;
    }

    public void Z1(int i4) {
        this.N = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "COLOR_BD_VOLUME_INDEX", s0.a.f11071l + i4);
        }
        o1.d(null).i(B1(), i4);
    }

    public float a1(int i4) {
        return this.A.f9371r[i4];
    }

    public int b1(int i4) {
        if (i4 < 0 || i4 > this.A.f9372s) {
            i4 = 0;
        }
        return this.A.f9373t[i4];
    }

    public int c1() {
        return this.A.f9372s;
    }

    public int d1(int i4) {
        return this.A.f9377x[i4];
    }

    public int e1() {
        return this.A.f9376w;
    }

    public int f1(int i4) {
        return b1(i4);
    }

    public int g1(int i4) {
        return this.A.f9379z[i4];
    }

    public int h1() {
        return this.A.f9378y;
    }

    @Override // n2.x0
    public ca i0() {
        return new ca();
    }

    public int i1() {
        return this.A.f9374u;
    }

    public int j1(int i4) {
        if (i4 < 0 || i4 > this.A.f9372s) {
            i4 = 0;
        }
        a aVar = this.A;
        return aVar.f9373t[i4] / aVar.f9374u;
    }

    public String k1() {
        return this.f9522b + "_COLOR_BC_FOCUS_POS";
    }

    @Override // n2.p1
    public boolean l() {
        return true;
    }

    public String l1() {
        return this.f9522b + "_COLOR_BC_GAIN";
    }

    @Override // n2.p1
    public boolean m() {
        return true;
    }

    public String m1() {
        return this.f9522b + "_COLOR_BC_LINE_ENDVERSION_2";
    }

    public String n1() {
        return this.f9522b + "_COLOR_BC_LINE_STARTVERSION_2";
    }

    public String o1() {
        return this.f9522b + "_COLOR_BC_PRF_INDEX";
    }

    public String p1() {
        return this.f9522b + "_COLOR_BC_START_POINTVERSION_2";
    }

    public int q0() {
        return this.L;
    }

    public String q1() {
        return this.f9522b + "_COLOR_BC_STEER_INDEX";
    }

    public int r0() {
        return this.F;
    }

    public String r1() {
        return this.f9522b + "_COLOR_BC_VOLUMEVERSION_2";
    }

    public int s0() {
        return this.G;
    }

    public String s1() {
        return this.f9522b + "_COLOR_BC_WF_INDEX";
    }

    public int t0() {
        return this.E;
    }

    public String t1() {
        return this.f9522b + "_COLOR_BD_ANGLE";
    }

    public int u0() {
        return this.D;
    }

    public String u1() {
        return this.f9522b + "_COLOR_BD_DYNAMIC_RANGE";
    }

    public int v0() {
        return this.I;
    }

    public String v1() {
        return this.f9522b + "_COLOR_BD_FOCUS_POS";
    }

    public int w0() {
        return this.K;
    }

    public String w1() {
        return this.f9522b + "_COLOR_BD_GAIN";
    }

    @Override // n2.x0, n2.b1, n2.p1
    public void x() {
        o1 o1VarD = o1.d(null);
        this.B = o1VarD.e(p1(), 80);
        this.C = o1VarD.e(r1(), 256);
        int i4 = this.A.f9362i;
        if (i4 == 0) {
            i4 = 64;
        }
        int i5 = (i4 / 2) - 2;
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - i5);
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + i5);
        this.F = o1VarD.e(k1(), 3);
        this.G = o1VarD.e(l1(), 75);
        this.H = o1VarD.e(q1(), 0);
        this.I = o1VarD.e(o1(), 0);
        this.J = o1VarD.e(s1(), 5);
        this.M = o1VarD.e(z1(), 50);
        this.N = o1VarD.e(B1(), 0);
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
        this.P = o1VarD.e(A1(), 0);
        this.Q = o1VarD.e(w1(), 80);
        this.R = o1VarD.e(t1(), 0);
        this.S = o1VarD.e(v1(), 2);
        this.T = o1VarD.e(u1(), 60);
        this.U = o1VarD.e(y1(), 0);
    }

    public int x0() {
        return this.B;
    }

    public String x1() {
        return this.f9522b + "_COLOR_BD_LINE_POS";
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        h0 h0Var = new h0();
        if (t()) {
            u uVar = new u(h0Var);
            uVar.o(new w());
            h0Var.U(uVar);
        }
        h0Var.f9561c = this;
        h0Var.y(this.f9527g.f9535f / 2);
        h0Var.f9562d = E1();
        h0Var.B = D1();
        h0Var.A = i0();
        h0Var.J = C1();
        h0Var.q0(L0());
        return h0Var;
    }

    public int y0() {
        return this.H;
    }

    public String y1() {
        return this.f9522b + "_COLOR_BD_PRF_INDEX";
    }

    public int z0() {
        return this.C;
    }

    public String z1() {
        return this.f9522b + "_COLOR_BD_START_POINT";
    }

    public i0(String str) {
        super(str);
        this.A = new a();
    }
}
