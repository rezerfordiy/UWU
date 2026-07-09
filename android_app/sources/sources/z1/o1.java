package z1;

import z1.n0;
import z1.p1;

/* JADX INFO: loaded from: classes.dex */
public class o1 {

    public interface a {
        int I2();

        float Q0();

        float R1();

        boolean V0();

        void q0(boolean z3, float f4, float f5);
    }

    public interface b {
        boolean L1();

        void v1(boolean z3);
    }

    public interface c {
        void M(int i4);

        int w();
    }

    public interface d {
        void H(int i4);

        int m();
    }

    public interface e {
        boolean P0();

        void f2(boolean z3);
    }

    public interface f {
        void O2(int i4);

        int n1();
    }

    public static class g extends p0 implements p1.b, p1.a, a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f13750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f13751m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f13752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13753o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f13754p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f13755q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f13756r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f13757s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f13758t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f13759u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int[] f13760v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f13761w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13762x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f13763y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f13764z;

        public g(float f4, float f5, int[] iArr, float f6, float f7, boolean z3, boolean z4, boolean z5, float f8) {
            this.f13821e = n0.c.BIOPSY_ENHANCE.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13756r = f4;
            this.f13757s = f5;
            this.f13760v = iArr;
            this.f13758t = f6;
            this.f13759u = f7;
            this.f13750l = z5;
            this.f13751m = f8;
            this.f13753o = z5;
            this.f13754p = f8;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.p1.a
        public float D2() {
            return this.f13751m;
        }

        @Override // z1.p1.a
        public float I1() {
            return this.f13762x;
        }

        @Override // z1.o1.a
        public int I2() {
            return this.f13764z;
        }

        @Override // z1.p1.b
        public float J0() {
            return this.f13818b ? this.f13755q : this.f13752n;
        }

        @Override // z1.p1.a
        public float J1() {
            return this.f13752n;
        }

        @Override // z1.p1.b
        public float K2() {
            return this.f13759u;
        }

        @Override // z1.p1.a
        public void N2(boolean z3, float f4, float f5) {
            q qVar;
            int[] iArr;
            if (this.f13819c) {
                this.f13750l = z3;
                this.f13751m = f4;
                this.f13752n = f5;
                float fAbs = f4 < 0.0f ? Math.abs(90.0f + f4) : 90.0f - f4;
                int i4 = 0;
                float f6 = 100.0f;
                int i5 = 0;
                while (true) {
                    iArr = this.f13760v;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    float f7 = iArr[i4];
                    if (f4 * f7 <= 0.0f) {
                        float fAbs2 = Math.abs(Math.abs(f7) - fAbs);
                        if (fAbs2 < f6) {
                            i5 = i4;
                            f6 = fAbs2;
                        }
                    }
                    i4++;
                }
                this.f13761w = iArr[i5];
                this.f13762x = i5;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.p1.b
        public float P1() {
            return this.f13757s;
        }

        @Override // z1.o1.a
        public float Q0() {
            return this.f13754p;
        }

        @Override // z1.o1.a
        public float R1() {
            return this.f13755q;
        }

        @Override // z1.o1.a
        public boolean V0() {
            return this.f13753o;
        }

        @Override // z1.p1.b
        public float X1() {
            return this.f13756r;
        }

        public a d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.p1.b
        public float f1() {
            return this.f13758t;
        }

        @Override // z1.p1.b
        public float k2() {
            return this.f13818b ? this.f13754p : this.f13751m;
        }

        @Override // z1.p1.b
        public boolean m2() {
            return this.f13818b ? this.f13753o : this.f13750l;
        }

        @Override // z1.o1.a
        public void q0(boolean z3, float f4, float f5) {
            this.f13753o = z3;
            this.f13754p = f4;
            this.f13755q = f5;
        }

        @Override // z1.p1.a
        public boolean y2() {
            return this.f13750l;
        }

        @Override // z1.p1.b
        public float z0() {
            return this.f13818b ? this.f13763y : this.f13761w;
        }
    }

    public static class h extends p0 implements p1.d, p1.c, b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f13765l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f13766m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f13767n;

        public h(int[] iArr, boolean z3, boolean z4, boolean z5) {
            this.f13821e = n0.c.COMPOUND.toString();
            this.f13765l = iArr;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13766m = z5;
            this.f13767n = z5;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.o1.b
        public boolean L1() {
            return this.f13767n;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            h hVar = (h) n0Var;
            if (this.f13819c && hVar.f13819c) {
                this.f13766m = hVar.f13766m;
            }
            if (this.f13818b && hVar.f13818b) {
                this.f13767n = hVar.f13767n;
            }
            H0();
        }

        @Override // z1.p1.d
        public int[] W() {
            return this.f13765l;
        }

        @Override // z1.p0, z1.p1.c
        public void d0(boolean z3) {
            q qVar;
            if (this.f13819c) {
                this.f13766m = z3;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        public b d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.p1.d
        public boolean n2() {
            return this.f13818b ? this.f13767n : this.f13766m;
        }

        @Override // z1.p1.c
        public boolean u1() {
            return this.f13766m;
        }

        @Override // z1.o1.b
        public void v1(boolean z3) {
            if (!this.f13818b || this.f13767n == z3) {
                return;
            }
            this.f13767n = z3;
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class i extends p0 implements p1.f, p1.e, c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13768l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13769m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13770n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13771o;

        public i(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.c.DYNAMIC_RANGE.toString();
            this.f13768l = i4;
            this.f13769m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13770n = i6;
            this.f13771o = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.p1.f
        public int B() {
            return this.f13818b ? this.f13771o : this.f13770n;
        }

        @Override // z1.p1.e
        public void G(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f13770n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.p1.f
        public int K() {
            return this.f13769m;
        }

        @Override // z1.o1.c
        public void M(int i4) {
            if (!this.f13818b || this.f13771o == i4) {
                return;
            }
            this.f13771o = i4;
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            i iVar = (i) n0Var;
            if (this.f13819c && iVar.f13819c && (i5 = iVar.f13770n) >= this.f13768l && i5 <= this.f13769m) {
                this.f13770n = i5;
            }
            if (this.f13818b && iVar.f13818b && (i4 = iVar.f13771o) >= this.f13768l && i4 <= this.f13769m) {
                this.f13771o = i4;
            }
            H0();
        }

        public c d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.p1.f
        public int r() {
            return this.f13768l;
        }

        @Override // z1.p1.e
        public int v() {
            return this.f13770n;
        }

        @Override // z1.o1.c
        public int w() {
            return this.f13771o;
        }
    }

    public static class j extends p0 implements p1.h, p1.g, d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static int f13772q;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13774m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[][] f13775n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13776o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13777p;

        public j(float[][] fArr, int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.c.FOCUS.toString();
            this.f13775n = fArr;
            this.f13773l = i4;
            this.f13774m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13776o = i6;
            this.f13777p = i6;
            this.f13824h = 0;
            this.f13825i = false;
            this.f13826j = d3();
            if (z3) {
                this.f13817a = true;
            }
        }

        public static void f3() {
            f13772q++;
        }

        @Override // z1.o1.d
        public void H(int i4) {
            if (!this.f13818b || this.f13777p == i4) {
                return;
            }
            this.f13777p = i4;
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            j jVar = (j) n0Var;
            if (jVar.f13826j != this.f13826j) {
                return;
            }
            if (this.f13819c && jVar.f13819c) {
                this.f13776o = jVar.f13776o;
            }
            if (this.f13818b && jVar.f13818b) {
                this.f13777p = jVar.f13777p;
            }
            H0();
        }

        @Override // z1.p1.h
        public int a() {
            return this.f13818b ? this.f13777p : this.f13776o;
        }

        @Override // z1.p1.h
        public int b() {
            return this.f13773l;
        }

        public int d3() {
            return f13772q;
        }

        @Override // z1.p1.h
        public int e() {
            return this.f13774m;
        }

        public float e3(int i4) {
            float f4 = 0.0f;
            int i5 = 0;
            for (float f5 : f(i4)) {
                f4 += f5;
                i5++;
            }
            return f4 / i5;
        }

        @Override // z1.p1.h
        public float[] f(int i4) {
            if (i4 < 0) {
                return null;
            }
            float[][] fArr = this.f13775n;
            if (i4 > fArr.length) {
                return null;
            }
            return fArr[i4];
        }

        @Override // z1.p1.g
        public void g(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f13776o = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        public d g3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.p1.g
        public int l() {
            return this.f13776o;
        }

        @Override // z1.o1.d
        public int m() {
            return this.f13777p;
        }
    }

    public static class k extends p0 implements p1.j, p1.i, e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f13778l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f13779m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f13780n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13781o;

        public k(float f4, float f5, boolean z3, boolean z4, boolean z5) {
            this.f13821e = n0.c.HARMONIC.toString();
            this.f13778l = f4;
            this.f13779m = f5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13780n = z5;
            this.f13781o = z5;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.p1.j
        public boolean H1() {
            return this.f13818b ? this.f13781o : this.f13780n;
        }

        @Override // z1.o1.e
        public boolean P0() {
            return this.f13781o;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            k kVar = (k) n0Var;
            if (this.f13819c && kVar.f13819c && !this.f13820d && !kVar.f13820d) {
                this.f13780n = kVar.f13780n;
            }
            if (this.f13818b && kVar.f13818b) {
                this.f13781o = kVar.f13781o;
            }
            H0();
            X2();
        }

        @Override // z1.p1.i
        public void Y0(boolean z3) {
            if (this.f13819c) {
                this.f13780n = z3;
                H0();
            }
            if (!this.f13819c || this.f13818b) {
                return;
            }
            X2();
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.p1.j
        public float Y1(boolean z3) {
            return z3 ? this.f13779m : this.f13778l;
        }

        public e d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.o1.e
        public void f2(boolean z3) {
            if (!this.f13818b || this.f13781o == z3) {
                return;
            }
            this.f13781o = z3;
            X2();
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.p1.i
        public boolean w0() {
            return this.f13780n;
        }
    }

    public static class l extends p0 implements p1.l, p1.k, f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13782l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13783m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13784n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13785o;

        public l(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.c.IMAGE_ENHANCE.toString();
            this.f13782l = i4;
            this.f13783m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13784n = i6;
            this.f13785o = i6;
        }

        @Override // z1.p1.k
        public void C2(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f13784n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.p1.l
        public int J2() {
            return this.f13783m;
        }

        @Override // z1.p1.l
        public int O0() {
            return this.f13818b ? this.f13785o : this.f13784n;
        }

        @Override // z1.o1.f
        public void O2(int i4) {
            if (!this.f13818b || this.f13785o == i4) {
                return;
            }
            this.f13785o = i4;
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            l lVar = (l) n0Var;
            if (this.f13819c && lVar.f13819c && (i5 = lVar.f13784n) >= this.f13782l && i5 <= this.f13783m) {
                this.f13784n = i5;
            }
            if (this.f13818b && lVar.f13818b && (i4 = lVar.f13785o) >= this.f13782l && i4 <= this.f13783m) {
                this.f13785o = i4;
            }
            H0();
        }

        public f d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.o1.f
        public int n1() {
            return this.f13785o;
        }

        @Override // z1.p1.k
        public int r0() {
            return this.f13784n;
        }

        @Override // z1.p1.l
        public int u0() {
            return this.f13782l;
        }
    }

    public static class m extends p0 implements p1.n, p1.m, n {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f13786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int[] f13787m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13788n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13789o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13790p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f13791q;

        public m(int i4, int i5, int i6, int i7, boolean z3, boolean z4, int[] iArr) {
            this.f13821e = n0.c.VGAIN.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13788n = i4;
            this.f13789o = i5;
            this.f13790p = i6;
            this.f13791q = i7;
            this.f13786l = iArr;
            this.f13787m = iArr;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.p1.m
        public int[] F2() {
            return this.f13786l;
        }

        @Override // z1.p1.n
        public int L0() {
            return this.f13788n;
        }

        @Override // z1.p1.n
        public int M0() {
            return this.f13791q;
        }

        @Override // z1.p1.n
        public int O1() {
            return this.f13790p;
        }

        @Override // z1.p1.n
        public int[] P2() {
            return this.f13818b ? this.f13787m : this.f13786l;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            m mVar = (m) n0Var;
            if (this.f13819c && mVar.f13819c) {
                this.f13786l = mVar.f13786l;
            }
            if (this.f13818b && mVar.f13818b) {
                this.f13787m = mVar.f13787m;
            }
            H0();
        }

        @Override // z1.p1.m
        public void X(int i4, int i5) {
            q qVar;
            boolean z3 = this.f13819c;
            if (z3) {
                this.f13786l[i5] = i4;
            }
            if (z3 && !this.f13818b && (qVar = this.f13822f) != null) {
                qVar.d(this);
            }
            H0();
        }

        @Override // z1.o1.n
        public void c0(int[] iArr) {
            this.f13787m = iArr;
        }

        public n d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.p1.n
        public int h0() {
            return this.f13789o;
        }

        @Override // z1.o1.n
        public int[] x0() {
            return this.f13787m;
        }
    }

    public interface n {
        void c0(int[] iArr);

        int[] x0();
    }
}
