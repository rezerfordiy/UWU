package n2;

import java.io.Serializable;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends b1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f9683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f9689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9690z;

    public class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[][] f9693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[][] f9695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f9696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f9697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f9699j;

        public a() {
            Class cls = Float.TYPE;
            this.f9693d = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f9695f = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f9699j = new int[9];
        }
    }

    public x0() {
        this.f9683s = new a();
        this.f9689y = new int[8];
    }

    public int L() {
        return this.f9687w;
    }

    public boolean M() {
        return this.f9688x;
    }

    public int N() {
        return this.f9685u;
    }

    public int O() {
        return this.f9690z;
    }

    public int P() {
        return this.f9686v;
    }

    public boolean Q() {
        return this.f9684t;
    }

    public int R(int i4) {
        if (i4 < 0 || i4 >= 8) {
            return 128;
        }
        return this.f9689y[i4];
    }

    public float[] S(boolean z3, int i4) {
        float[] fArr;
        int i5 = 0;
        if (z3) {
            int i6 = this.f9683s.f9694e;
            fArr = new float[i6];
            while (i5 < i6) {
                fArr[i5] = this.f9683s.f9695f[i4][i5];
                i5++;
            }
        } else {
            int i7 = this.f9683s.f9692c;
            fArr = new float[i7];
            while (i5 < i7) {
                fArr[i5] = this.f9683s.f9693d[i4][i5];
                i5++;
            }
        }
        return fArr;
    }

    public float T(int i4) {
        return 0.0f;
    }

    public float U() {
        return 0.0f;
    }

    public int V() {
        a aVar = this.f9683s;
        if (aVar.f9691b < 1) {
            return 1;
        }
        return aVar.f9698i;
    }

    public int W(int i4) {
        a aVar = this.f9683s;
        if (aVar.f9691b >= 1 && i4 >= 0 && i4 < aVar.f9698i) {
            return aVar.f9699j[i4];
        }
        return 0;
    }

    public int X() {
        return this.f9683s.f9692c;
    }

    public int Y() {
        return 4;
    }

    public float Z(int i4, int i5) {
        if (i4 < 0 || i4 >= 4 || i5 < 0 || i5 >= X()) {
            return 0.0f;
        }
        return this.f9683s.f9693d[i4][i5];
    }

    public float a0() {
        return 0.0f;
    }

    public String b0() {
        return this.f9522b + "_ENH_ACOUSTICAL_POWER";
    }

    public String c0() {
        return this.f9522b + "_ENH_COMPOUND";
    }

    public String d0() {
        return this.f9522b + "_ENH_DYNAMIC_RANGE";
    }

    public String e0() {
        return this.f9522b + "_ENH_ENHANCE_LEVEL";
    }

    public String f0() {
        return this.f9522b + "_ENH_FOCUS_POS";
    }

    public String g0() {
        return this.f9522b + "_ENH_HARMONIC";
    }

    public String h0(int i4) {
        return this.f9522b + "_ENH_VGAIN_" + i4;
    }

    public ca i0() {
        return null;
    }

    public void j0(int i4) {
        this.f9687w = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "acousticalPower", s0.a.f11071l + i4);
        }
        o1.d(null).i(b0(), i4);
    }

    public void k0(boolean z3) {
        this.f9688x = z3;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "compound", s0.a.f11071l + (z3 ? 1 : 0));
        }
        o1.d(null).g(c0(), this.f9688x);
    }

    public void l0(int i4) {
        this.f9685u = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "dr", s0.a.f11071l + i4);
        }
        o1.d(null).i(d0(), this.f9685u);
    }

    public void m0(int i4) {
        if (i4 < 0 || i4 > 4) {
            return;
        }
        this.f9690z = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "enhance", s0.a.f11071l + i4);
        }
        o1.d(null).i(e0(), i4);
    }

    @Override // n2.p1
    public boolean n() {
        return true;
    }

    public void n0(int i4) {
        this.f9686v = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "focus", s0.a.f11071l + i4);
        }
        o1.d(null).i(f0(), this.f9686v);
    }

    public void o0(boolean z3) {
        this.f9684t = z3;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "harmonic", s0.a.f11071l + (z3 ? 1 : 0));
        }
        o1.d(null).g(g0(), this.f9684t);
    }

    public void p0(int i4, int i5) {
        if (i5 < 0 || i5 >= 8) {
            return;
        }
        this.f9689y[i5] = i4;
        z0 z0Var = p1.f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "ENH_VGAIN_" + i5, s0.a.f11071l + i4);
        }
        o1.d(null).i(h0(i5), this.f9689y[i5]);
    }

    @Override // n2.b1, n2.p1
    public void x() {
    }

    @Override // n2.b1, n2.p1
    public r0 y() {
        w0 w0Var = new w0();
        w0Var.f9562d = new n1(this.f9527g.f9535f, 0);
        w0Var.f9561c = this;
        w0Var.A = i0();
        w0Var.y(this.f9527g.f9535f / 2);
        return w0Var;
    }

    public x0(String str) {
        super(str);
        this.f9683s = new a();
        this.f9689y = new int[8];
        o1 o1VarD = o1.d(null);
        this.f9685u = o1VarD.e(d0(), 70);
        this.f9690z = o1VarD.e(e0(), 2);
        this.f9686v = o1VarD.e(f0(), 3);
        this.f9684t = o1VarD.b(g0(), true);
        for (int i4 = 0; i4 < 8; i4++) {
            this.f9689y[i4] = o1VarD.e(h0(i4), 127);
        }
    }
}
