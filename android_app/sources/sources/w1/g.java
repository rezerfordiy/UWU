package w1;

import android.content.Context;
import android.os.AsyncTask;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import n2.a0;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static g f12546r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ boolean f12547s0 = false;
    public Allocation A;
    public Allocation B;
    public Allocation C;
    public Allocation D;
    public Allocation E;
    public Allocation F;
    public Allocation G;
    public Allocation H;
    public Allocation I;
    public Allocation J;
    public Allocation K;
    public Allocation L;
    public Allocation M;
    public Allocation N;
    public Allocation O;
    public Allocation P;
    public Allocation Q;
    public Allocation R;
    public Allocation S;
    public Allocation T;
    public Allocation U;
    public Allocation V;
    public Allocation W;
    public Allocation X;
    public Allocation Y;
    public Allocation Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Allocation f12549a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f12550b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Allocation f12551b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Allocation f12553c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Allocation f12555d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Allocation f12557e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12558f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Allocation f12559f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Allocation f12560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f12564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f12566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f12568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12580q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f12581q0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ScriptIntrinsicBlur f12583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12584t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12585u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Allocation f12586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Allocation f12587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Allocation f12588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Allocation f12589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Allocation f12590z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RenderScript f12548a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f12552c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12554d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12556e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b[] f12582r = new b[4];

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f12561g0 = -1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f12563h0 = -1.0f;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public byte[] f12565i0 = null;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public byte[] f12567j0 = null;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f12569k0 = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f12571l0 = -1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f12573m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f12575n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f12577o0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f12579p0 = false;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f12592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f12595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f12596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f12597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f12598h;

        public b() {
        }
    }

    public class c extends AsyncTask<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f12602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f12603d;

        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            g.this.F(7);
            if (g.this.D(this.f12600a, this.f12601b)) {
                return 0;
            }
            g.this.E();
            g.this.f12586v.copy2DRangeFrom(0, 0, this.f12601b, this.f12600a, this.f12602c);
            g.this.v();
            g.this.r();
            g.this.K();
            g.this.I();
            g.this.P();
            g.this.C();
            g gVar = g.this;
            gVar.c(gVar.f12559f0, g.this.f12587w);
            g.this.f12587w.copy2DRangeTo(0, 0, this.f12601b, this.f12600a, this.f12603d);
            return 0;
        }

        public byte[] b() {
            return this.f12603d;
        }

        public void c(byte[] bArr, int i4, int i5) {
            if (bArr.length != i4 * i5) {
                return;
            }
            this.f12602c = bArr;
            this.f12600a = i4;
            this.f12601b = i5;
            this.f12603d = new byte[i4 * i5];
        }
    }

    public static synchronized g y() {
        if (f12546r0 == null) {
            g gVar = new g();
            f12546r0 = gVar;
            gVar.L(0);
            f12546r0.J(0);
        }
        return f12546r0;
    }

    public boolean A() {
        return this.f12556e;
    }

    public final void B(double[] dArr, int i4, double d4, double d5, double d6, double d7) {
        double d8 = d5 - d4;
        int i5 = i4 - 1;
        double d9 = d8 / ((double) i5);
        dArr[0] = d4;
        dArr[i5] = d5;
        for (int i6 = 1; i6 < i5; i6++) {
            dArr[i6] = d4 + (((double) i6) * d9);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            dArr[i7] = d4 + (d8 / (Math.exp(((-d7) * 4.0d) * (dArr[i7] - d6)) + 1.0d));
        }
        if (i4 > 0) {
            double d10 = dArr[0];
            double d11 = dArr[i5];
            for (int i8 = 0; i8 < i4; i8++) {
                dArr[i8] = d4 + (((dArr[i8] - d10) * d8) / (d11 - d10));
            }
        }
    }

    public final void C() {
        this.f12550b.O1(this.f12564i);
        this.f12550b.P1(this.f12566j);
        this.f12550b.E1();
        this.f12550b.x(this.f12559f0);
        this.f12550b.V(this.f12557e0, this.f12559f0);
    }

    public final boolean D(int i4, int i5) {
        if (this.f12586v != null && this.f12584t == i4 && this.f12585u == i5) {
            return false;
        }
        if (this.f12583s == null) {
            RenderScript renderScript = this.f12548a;
            this.f12583s = ScriptIntrinsicBlur.create(renderScript, Element.U8(renderScript));
        }
        this.f12584t = i4;
        this.f12585u = i5;
        this.f12550b.S1(i4);
        this.f12550b.V1(this.f12585u);
        RenderScript renderScript2 = this.f12548a;
        Type typeCreateXY = Type.createXY(renderScript2, Element.U8(renderScript2), this.f12585u, this.f12584t);
        this.f12586v = Allocation.createTyped(this.f12548a, typeCreateXY);
        this.f12587w = Allocation.createTyped(this.f12548a, typeCreateXY);
        RenderScript renderScript3 = this.f12548a;
        Type typeCreateXY2 = Type.createXY(renderScript3, Element.I32(renderScript3), this.f12585u, this.f12584t);
        RenderScript renderScript4 = this.f12548a;
        Type typeCreateXY3 = Type.createXY(renderScript4, Element.I32(renderScript4), this.f12585u / 4, this.f12584t / 2);
        RenderScript renderScript5 = this.f12548a;
        Type typeCreateXY4 = Type.createXY(renderScript5, Element.I32(renderScript5), this.f12585u / 2, this.f12584t / 2);
        this.f12588x = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.f12589y = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.f12590z = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.A = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.B = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.C = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.D = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.E = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.F = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.G = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.H = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.I = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.J = Allocation.createTyped(this.f12548a, typeCreateXY3);
        this.K = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.M = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.L = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.N = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.O = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.P = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.Q = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.R = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.S = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.U = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.V = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.T = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.W = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.X = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.Y = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.Z = Allocation.createTyped(this.f12548a, typeCreateXY4);
        this.f12549a0 = Allocation.createTyped(this.f12548a, typeCreateXY);
        this.f12551b0 = Allocation.createTyped(this.f12548a, typeCreateXY);
        this.f12553c0 = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.f12555d0 = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.f12557e0 = Allocation.createTyped(this.f12548a, typeCreateXY2);
        this.f12559f0 = Allocation.createTyped(this.f12548a, typeCreateXY2);
        return true;
    }

    public final void E() {
        float f4 = this.f12576o;
        if (f4 == this.f12561g0 && this.f12578p == this.f12563h0) {
            return;
        }
        this.f12561g0 = f4;
        float f5 = this.f12578p;
        this.f12563h0 = f5;
        double[] dArr = new double[136];
        B(dArr, 136, 0.0d, 1.0d, f4, f5);
        int[] iArr = new int[136];
        int[] iArr2 = new int[136];
        for (int i4 = 0; i4 < 136; i4++) {
            double d4 = dArr[i4];
            iArr[i4] = (int) ((15.0d * d4) + 0.5d);
            iArr2[i4] = (int) ((d4 * 256.0d) + 0.5d);
        }
        this.Q.copy1DRangeFrom(0, 136, iArr);
        this.R.copy1DRangeFrom(0, 136, iArr2);
    }

    public final void F(int i4) {
        if (i4 != this.f12558f || this.f12560g == null) {
            this.f12558f = i4;
            this.f12550b.R1(i4);
            RenderScript renderScript = this.f12548a;
            Element elementI32 = Element.I32(renderScript);
            int i5 = this.f12558f;
            this.f12560g = Allocation.createTyped(this.f12548a, Type.createX(renderScript, elementI32, i5 * 256 * i5 * 3));
            int[] iArrE = d.b().e();
            Allocation allocation = this.f12560g;
            int i6 = this.f12558f;
            allocation.copy1DRangeFrom(0, i6 * i6 * 16 * 16 * 3, iArrE);
            this.f12550b.A(this.f12560g);
        }
    }

    public void G(Context context) {
        if (this.f12548a == null) {
            RenderScript renderScriptCreate = RenderScript.create(context);
            H(renderScriptCreate, new a0(renderScriptCreate));
        }
    }

    public void H(RenderScript renderScript, a0 a0Var) {
        this.f12548a = renderScript;
        this.f12550b = a0Var;
        this.f12552c.k(renderScript);
    }

    public final void I() {
        this.f12550b.U1(this.f12572m);
        this.f12550b.m(this.Z);
        this.f12550b.y(this.Y);
        this.f12550b.X(this.D, this.Z);
        this.f12550b.H1();
        a0 a0Var = this.f12550b;
        Allocation allocation = this.Y;
        a0Var.R(allocation, allocation);
    }

    public final void J(int i4) {
        b bVar;
        if (i4 == 1) {
            bVar = new b();
            bVar.f12591a = 5;
            bVar.f12592b = 0.1f;
            bVar.f12593c = 3.5f;
            bVar.f12594d = 1;
        } else {
            if (i4 == 2) {
                bVar = new b();
                bVar.f12591a = 5;
                bVar.f12592b = 0.1f;
                bVar.f12593c = 3.5f;
                bVar.f12594d = 2;
                bVar.f12595e = 1.2f;
                bVar.f12596f = 5.0f;
                bVar.f12597g = 1.8f;
                bVar.f12598h = 1.0f;
                N(0, bVar);
                bVar.f12595e = 1.4f;
                bVar.f12597g = 1.6f;
                N(1, bVar);
                bVar.f12595e = 1.6f;
                bVar.f12597g = 1.3f;
                N(2, bVar);
                bVar.f12595e = 1.8f;
                bVar.f12597g = 1.15f;
                N(3, bVar);
            }
            bVar = new b();
            bVar.f12591a = 15;
            bVar.f12592b = 0.2f;
            bVar.f12593c = 1.5f;
            bVar.f12594d = 0;
        }
        bVar.f12595e = 1.0f;
        bVar.f12596f = 5.0f;
        bVar.f12597g = 1.8f;
        bVar.f12598h = 1.0f;
        N(0, bVar);
        bVar.f12595e = 1.1f;
        bVar.f12597g = 1.6f;
        N(1, bVar);
        bVar.f12595e = 1.2f;
        bVar.f12597g = 1.3f;
        N(2, bVar);
        bVar.f12595e = 1.3f;
        bVar.f12597g = 1.15f;
        N(3, bVar);
    }

    public final void K() {
        this.f12550b.T1(this.f12574n);
        this.f12550b.v(this.Q);
        this.f12550b.w(this.R);
        this.f12550b.c(this.S);
        this.f12550b.f(this.T);
        this.f12550b.l(this.W);
        this.f12550b.h(this.X);
        this.f12550b.Z(this.N, this.T);
        this.f12550b.F1();
        a0 a0Var = this.f12550b;
        Allocation allocation = this.S;
        a0Var.R(allocation, allocation);
    }

    public void L(int i4) {
        this.f12562h = i4;
        if (i4 < 0) {
            this.f12562h = 0;
        } else if (i4 > 4) {
            this.f12562h = 4;
        }
    }

    public void M(int i4) {
        if (i4 < 0 || i4 > 3) {
            i4 = 0;
        }
        if (i4 != this.f12580q) {
            this.f12580q = i4;
            J(i4);
        }
    }

    public final void N(int i4, b bVar) {
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        b bVar2 = new b();
        bVar2.f12591a = bVar.f12591a;
        bVar2.f12592b = bVar.f12592b;
        bVar2.f12593c = bVar.f12593c;
        bVar2.f12594d = bVar.f12594d;
        bVar2.f12595e = bVar.f12595e;
        bVar2.f12596f = bVar.f12596f;
        bVar2.f12597g = bVar.f12597g;
        bVar2.f12598h = bVar.f12598h;
        this.f12582r[i4] = bVar2;
    }

    public void O(boolean z3) {
        this.f12556e = z3;
    }

    public final void P() {
        this.f12550b.Q1(this.f12570l);
        this.f12550b.N(this.Y, this.f12549a0);
        u(this.f12549a0, this.f12587w, this.f12568k);
        this.f12550b.f0(this.f12587w, this.f12555d0);
        this.f12550b.z(this.f12555d0);
        this.f12550b.a(this.f12557e0);
        this.f12550b.b0(this.Y, this.f12557e0);
    }

    public final void Q() {
        this.f12550b.h(this.X);
        this.f12550b.l(this.W);
        this.f12550b.n(this.V);
        this.f12550b.u(this.U);
        this.f12550b.L1();
        a0 a0Var = this.f12550b;
        Allocation allocation = this.U;
        a0Var.R(allocation, allocation);
    }

    public final void R() {
        b bVar = this.f12582r[this.f12562h - 1];
        this.f12574n = bVar.f12591a;
        this.f12576o = bVar.f12592b;
        this.f12578p = bVar.f12593c;
        this.f12572m = bVar.f12594d;
        this.f12570l = bVar.f12595e;
        this.f12568k = bVar.f12596f;
        this.f12564i = bVar.f12597g;
        this.f12566j = bVar.f12598h;
    }

    public byte[] a(byte[] bArr, int i4, int i5) {
        if (bArr.length != i4 * i5) {
            return null;
        }
        byte[] bArr2 = this.f12565i0;
        if (bArr2 != null && bArr2.length == bArr.length && this.f12569k0 == this.f12562h && this.f12571l0 == this.f12580q) {
            boolean z3 = false;
            int i6 = 0;
            while (true) {
                byte[] bArr3 = this.f12565i0;
                if (i6 >= bArr3.length) {
                    z3 = true;
                    break;
                }
                if (bArr3[i6] != bArr[i6]) {
                    break;
                }
                i6++;
            }
            if (z3) {
                return this.f12567j0;
            }
        }
        int i7 = this.f12580q;
        this.f12571l0 = i7;
        int i8 = this.f12562h;
        this.f12569k0 = i8;
        this.f12565i0 = bArr;
        if (i8 == 0) {
            this.f12567j0 = bArr;
            return bArr;
        }
        if (this.f12556e) {
            return b(bArr, i4, i5);
        }
        byte[] bArrA = this.f12552c.a(bArr, i4, i5, i7, i8);
        if (bArrA == null) {
            bArrA = t(bArr, i4, i5);
        }
        this.f12567j0 = bArrA;
        return bArrA;
    }

    public byte[] b(byte[] bArr, int i4, int i5) {
        byte[] bArrT;
        if (this.f12554d) {
            if (this.f12577o0 == 0 && this.f12573m0 > 10) {
                this.f12577o0 = System.currentTimeMillis();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            bArrT = this.f12552c.a(bArr, i4, i5, this.f12580q, this.f12562h);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f12573m0++;
            if (this.f12577o0 > 0) {
                this.f12575n0 += jCurrentTimeMillis2 - jCurrentTimeMillis;
                float fCurrentTimeMillis = (System.currentTimeMillis() - this.f12577o0) + 0.0f;
                if (fCurrentTimeMillis >= 2000.0f) {
                    if (this.f12575n0 / fCurrentTimeMillis > 0.8f) {
                        this.f12554d = false;
                    }
                    this.f12573m0 = 10;
                    this.f12575n0 = 0L;
                    this.f12577o0 = 0L;
                }
            }
        } else {
            bArrT = null;
        }
        if (bArrT == null) {
            bArrT = t(bArr, i4, i5);
        }
        this.f12567j0 = bArrT;
        return bArrT;
    }

    public final void c(Allocation allocation, Allocation allocation2) {
        this.f12550b.N(allocation, allocation2);
    }

    public final void d(Allocation allocation, Allocation allocation2) {
        this.f12550b.f0(allocation, allocation2);
    }

    public final void r() {
        this.f12550b.F(this.E);
        this.f12550b.B(this.F);
        this.f12550b.D(this.G);
        this.f12550b.G(this.H);
        this.f12550b.C(this.I);
        this.f12550b.E(this.J);
        this.f12550b.i(this.N);
        this.f12550b.e(this.O);
        this.f12550b.g(this.P);
        this.f12550b.j(this.C);
        this.f12550b.k(this.D);
        this.f12550b.N1(2);
        this.f12550b.M1();
        a0 a0Var = this.f12550b;
        Allocation allocation = this.C;
        a0Var.J(allocation, allocation);
        a0 a0Var2 = this.f12550b;
        Allocation allocation2 = this.D;
        a0Var2.L(allocation2, allocation2);
        a0 a0Var3 = this.f12550b;
        Allocation allocation3 = this.E;
        a0Var3.H(allocation3, allocation3);
        a0 a0Var4 = this.f12550b;
        Allocation allocation4 = this.H;
        a0Var4.d0(allocation4, allocation4);
        this.f12550b.K1();
        a0 a0Var5 = this.f12550b;
        Allocation allocation5 = this.H;
        a0Var5.P(allocation5, allocation5);
        this.f12550b.I1();
        a0 a0Var6 = this.f12550b;
        Allocation allocation6 = this.I;
        a0Var6.P(allocation6, allocation6);
        this.f12550b.J1();
        a0 a0Var7 = this.f12550b;
        Allocation allocation7 = this.J;
        a0Var7.P(allocation7, allocation7);
    }

    public void s(boolean z3) {
        this.f12554d = z3;
    }

    public final byte[] t(byte[] bArr, int i4, int i5) {
        if (bArr.length != i4 * i5) {
            return bArr;
        }
        R();
        c cVar = new c();
        cVar.c(bArr, i4, i5);
        try {
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Integer[0]);
            cVar.get();
        } catch (Exception unused) {
        }
        return cVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v3 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.renderscript.Allocation r3, android.renderscript.Allocation r4, float r5) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
        L6:
            r5 = r0
            goto Lf
        L8:
            r0 = 1103626240(0x41c80000, float:25.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf
            goto L6
        Lf:
            android.renderscript.ScriptIntrinsicBlur r0 = r2.f12583s
            r0.setRadius(r5)
            android.renderscript.ScriptIntrinsicBlur r5 = r2.f12583s
            r5.setInput(r3)
            android.renderscript.ScriptIntrinsicBlur r3 = r2.f12583s
            r3.forEach(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g.u(android.renderscript.Allocation, android.renderscript.Allocation, float):void");
    }

    public final void v() {
        d(this.f12586v, this.f12589y);
        u(this.f12586v, this.f12587w, 4.515f);
        d(this.f12587w, this.f12590z);
        u(this.f12586v, this.f12587w, 12.495f);
        d(this.f12587w, this.A);
        u(this.f12586v, this.f12587w, 20.66f);
        d(this.f12587w, this.B);
        this.f12550b.p(this.f12589y);
        this.f12550b.t(this.f12590z);
        this.f12550b.q(this.A);
        this.f12550b.r(this.B);
    }

    public int w() {
        return this.f12562h;
    }

    public int x() {
        return this.f12580q;
    }

    public boolean z() {
        return this.f12554d;
    }
}
