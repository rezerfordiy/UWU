package z1;

import java.util.ArrayList;
import java.util.List;
import z1.h0;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    public interface a {
        void H(int i4);

        int m();
    }

    public interface b {
        void c(int i4);

        int d();
    }

    public interface c {
        void E(int i4);

        int s();
    }

    public interface d {
        int A();

        void F(int i4);

        int K1();

        int N0();

        int d2();

        void g2(int i4, int i5, int i6, int i7);

        int j1();
    }

    public interface e {
        void k1(int i4);

        int t0();
    }

    public static class f extends p0 implements h0.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f13176l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<Float> f13177m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13178n = 0;

        public f(float f4) {
            this.f13821e = n0.b.COLOR_F0.toString();
            this.f13176l = f4;
        }

        public int A1() {
            List<Float> list = this.f13177m;
            if (list != null) {
                return list.size();
            }
            return 1;
        }

        public float d3(int i4) {
            if (i4 < 0 || i4 >= this.f13177m.size()) {
                return -1.0f;
            }
            this.f13178n = i4;
            return this.f13177m.get(i4).floatValue();
        }

        public void e3(float[] fArr, int i4) {
            if (this.f13177m == null) {
                this.f13177m = new ArrayList();
            }
            this.f13177m.clear();
            for (int i5 = 0; i5 < i4; i5++) {
                this.f13177m.add(Float.valueOf(fArr[i5]));
            }
        }

        @Override // z1.h0.a
        public float z() {
            List<Float> list = this.f13177m;
            return list != null ? list.get(this.f13178n).floatValue() : this.f13176l;
        }
    }

    public static class g extends p0 implements h0.c, h0.b, a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13179l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13180m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[][] f13181n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13182o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13183p;

        public g(float[][] fArr, int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.b.COLOR_POWER_FOCUS.toString();
            this.f13181n = fArr;
            this.f13179l = i4;
            this.f13180m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13182o = i6;
            this.f13183p = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.g0.a
        public void H(int i4) {
            if (!this.f13818b || this.f13183p == i4) {
                return;
            }
            this.f13183p = i4;
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            g gVar = (g) n0Var;
            if (this.f13819c && gVar.f13819c) {
                this.f13182o = gVar.f13182o;
            }
            if (this.f13818b && gVar.f13818b) {
                this.f13183p = gVar.f13183p;
            }
            X2();
            H0();
        }

        @Override // z1.p0, z1.n0
        public n0 U2() {
            if (this.f13819c) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.c
        public int a() {
            return this.f13818b ? this.f13183p : this.f13182o;
        }

        @Override // z1.h0.c
        public int b() {
            return this.f13179l;
        }

        public float d3(int i4) {
            float f4 = 0.0f;
            int i5 = 0;
            for (float f5 : f(i4)) {
                f4 += f5;
                i5++;
            }
            return f4 / i5;
        }

        @Override // z1.h0.c
        public int e() {
            return this.f13180m;
        }

        public a e3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.c
        public float[] f(int i4) {
            if (i4 < 0) {
                return null;
            }
            float[][] fArr = this.f13181n;
            if (i4 >= fArr.length) {
                return null;
            }
            return fArr[i4];
        }

        @Override // z1.h0.b
        public void g(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13182o = i4;
                X2();
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.b
        public int l() {
            return this.f13182o;
        }

        @Override // z1.g0.a
        public int m() {
            return this.f13183p;
        }
    }

    public static class h extends p0 implements h0.e, h0.d, b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13187o;

        public h(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.b.COLOR_POWER_GAIN.toString();
            this.f13184l = i4;
            this.f13185m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13186n = i6;
            this.f13187o = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            h hVar = (h) n0Var;
            if (this.f13819c && hVar.f13819c && (i5 = hVar.f13186n) >= this.f13184l && i5 <= this.f13185m) {
                this.f13186n = i5;
            }
            if (this.f13818b && hVar.f13818b && (i4 = hVar.f13187o) >= this.f13184l && i4 <= this.f13185m) {
                this.f13187o = i4;
            }
            H0();
        }

        @Override // z1.g0.b
        public void c(int i4) {
            if (!this.f13818b || this.f13187o == i4) {
                return;
            }
            this.f13187o = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.g0.b
        public int d() {
            return this.f13187o;
        }

        public b d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.d
        public int h() {
            return this.f13186n;
        }

        @Override // z1.h0.d
        public void i(int i4) {
            z1.q qVar;
            if (i4 < this.f13184l) {
                i4 = this.f13185m;
            }
            int i5 = this.f13185m;
            if (i4 > i5) {
                i4 = i5;
            }
            if (this.f13819c) {
                this.f13186n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.e
        public int j() {
            return this.f13185m;
        }

        @Override // z1.h0.e
        public int k() {
            return this.f13818b ? this.f13187o : this.f13186n;
        }

        @Override // z1.h0.e
        public int n() {
            return this.f13184l;
        }
    }

    public static class i extends p0 implements h0.g, h0.f, c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ boolean f13188q = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13189l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13190m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int[] f13191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13192o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13193p;

        public i(int[] iArr, int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.b.COLOR_POWER_PRF.toString();
            this.f13191n = iArr;
            this.f13189l = i4;
            this.f13190m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13192o = i6;
            this.f13193p = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.h0.g
        public int D() {
            return this.f13190m;
        }

        @Override // z1.g0.c
        public void E(int i4) {
            if (!this.f13818b || this.f13193p == i4) {
                return;
            }
            this.f13193p = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.f
        public int L() {
            return this.f13192o;
        }

        @Override // z1.h0.g
        public int N(int i4) {
            if (i4 < this.f13189l || i4 > this.f13190m) {
                return 0;
            }
            return this.f13191n[i4];
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            i iVar = (i) n0Var;
            if (this.f13819c && iVar.f13819c && (i5 = iVar.f13192o) >= this.f13189l && i5 <= this.f13190m) {
                this.f13192o = i5;
            }
            if (this.f13818b && iVar.f13818b && (i4 = iVar.f13193p) >= this.f13189l && i4 <= this.f13190m) {
                this.f13193p = i4;
            }
            H0();
        }

        public c d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.f
        public void q(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13192o = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.g0.c
        public int s() {
            return this.f13193p;
        }

        @Override // z1.h0.g
        public int u() {
            return this.f13189l;
        }

        @Override // z1.h0.g
        public int y() {
            return this.f13818b ? this.f13193p : this.f13192o;
        }
    }

    public static class j extends p0 implements h0.i, h0.h, d {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13194l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13195m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[] f13196n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13197o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13198p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f13199q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f13200r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f13201s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13202t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13203u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13204v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13205w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13206x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13207y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f13208z;

        public j(float[] fArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z3, boolean z4, int i14, int i15, int i16, int i17, int i18) {
            this.f13821e = n0.b.COLOR_POWER_QUADRANGLE.toString();
            this.f13196n = fArr;
            this.f13194l = i4;
            this.f13195m = i5;
            this.f13197o = i6;
            this.f13198p = i7;
            this.f13199q = i8;
            this.f13200r = i9;
            this.f13203u = i12;
            this.f13201s = i10;
            this.f13204v = i13;
            this.f13202t = i11;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13206x = i14;
            this.f13205w = i14;
            this.C = i15;
            this.f13207y = i15;
            this.D = i16;
            this.f13208z = i16;
            this.E = i17;
            this.A = i17;
            this.F = i18;
            this.B = i18;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.g0.d
        public int A() {
            return this.f13206x;
        }

        @Override // z1.h0.h
        public int C() {
            return this.f13205w;
        }

        @Override // z1.g0.d
        public void F(int i4) {
            if (!this.f13818b || this.f13206x == i4) {
                return;
            }
            this.f13206x = i4;
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.i
        public int G1() {
            return this.f13197o;
        }

        @Override // z1.h0.h
        public int G2() {
            return this.f13207y;
        }

        @Override // z1.h0.h
        public void I(int i4) {
            if (this.f13819c) {
                this.f13205w = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b) {
                return;
            }
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.i
        public int J() {
            return this.f13195m;
        }

        @Override // z1.g0.d
        public int K1() {
            return this.F;
        }

        @Override // z1.g0.d
        public int N0() {
            return this.D;
        }

        @Override // z1.h0.i
        public int N1() {
            return this.f13201s;
        }

        @Override // z1.h0.i
        public int P() {
            return this.f13200r;
        }

        @Override // z1.h0.h
        public int Q2() {
            return this.A;
        }

        @Override // z1.h0.i
        public int R0() {
            return this.f13818b ? this.E : this.A;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            j jVar = (j) n0Var;
            if (this.f13819c && jVar.f13819c && (i5 = jVar.f13205w) >= this.f13194l && i5 <= this.f13195m) {
                this.f13205w = i5;
                this.f13207y = jVar.f13207y;
                this.f13208z = jVar.f13208z;
                this.A = jVar.A;
                this.B = jVar.B;
            }
            if (this.f13818b && jVar.f13818b && (i4 = jVar.f13206x) >= this.f13194l && i4 <= this.f13195m) {
                this.f13206x = i4;
                this.C = jVar.C;
                this.D = jVar.D;
                this.E = jVar.E;
                this.F = jVar.F;
            }
            H0();
            X2();
        }

        @Override // z1.h0.i
        public int W0() {
            return this.f13818b ? this.D : this.f13208z;
        }

        @Override // z1.h0.i
        public int Y() {
            return this.f13204v - 2;
        }

        @Override // z1.h0.h
        public void Z(int i4, int i5, int i6, int i7) {
            int i8;
            if (i4 < q1()) {
                i4 = q1();
            }
            if (i5 > P()) {
                i5 = P();
            }
            if (i6 < G1()) {
                i6 = G1();
            }
            if (i7 > p2()) {
                i7 = p2();
            }
            int i9 = i5 - i4;
            if (i9 <= Y() && i9 > 5 && (i8 = i7 - i6) <= s2() && i8 > 5) {
                if (this.f13819c) {
                    this.f13207y = i4;
                    this.f13208z = i5;
                    this.A = i6;
                    this.B = i7;
                    H0();
                }
                if (!this.f13819c || this.f13818b) {
                    return;
                }
                X2();
                z1.q qVar = this.f13822f;
                if (qVar != null) {
                    qVar.d(this);
                }
            }
        }

        @Override // z1.h0.i
        public int Z0() {
            return this.f13818b ? this.F : this.B;
        }

        @Override // z1.h0.h
        public int a1() {
            return this.B;
        }

        @Override // z1.g0.d
        public int d2() {
            return this.C;
        }

        public d d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.g0.d
        public void g2(int i4, int i5, int i6, int i7) {
            if (this.f13818b) {
                if (this.C == i4 && this.D == i5 && this.E == i6 && this.F == i7) {
                    return;
                }
                this.C = i4;
                this.D = i5;
                this.E = i6;
                this.F = i7;
                z1.q qVar = this.f13822f;
                if (qVar != null) {
                    qVar.d(this);
                }
            }
        }

        @Override // z1.h0.i
        public int j0() {
            return this.f13203u;
        }

        @Override // z1.g0.d
        public int j1() {
            return this.E;
        }

        @Override // z1.h0.i
        public int o() {
            return this.f13818b ? this.f13206x : this.f13205w;
        }

        @Override // z1.h0.i
        public int p2() {
            return this.f13198p;
        }

        @Override // z1.h0.i
        public int q1() {
            return this.f13199q;
        }

        @Override // z1.h0.i
        public int s2() {
            return this.f13202t;
        }

        @Override // z1.h0.i
        public int t() {
            return this.f13194l;
        }

        @Override // z1.h0.i
        public int v0() {
            return this.f13818b ? this.C : this.f13207y;
        }

        @Override // z1.h0.i
        public float x(int i4) {
            if (i4 < this.f13194l || i4 > this.f13195m) {
                return 0.0f;
            }
            return this.f13196n[i4];
        }

        @Override // z1.h0.h
        public int z2() {
            return this.f13208z;
        }
    }

    public static class k extends p0 implements h0.k, h0.j, e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13209l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13210m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13211n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13212o;

        public k(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.b.COLOR_POWER_WF.toString();
            this.f13209l = i4;
            this.f13210m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13211n = i6;
            this.f13212o = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.h0.k
        public int A2() {
            return this.f13818b ? this.f13212o : this.f13211n;
        }

        @Override // z1.h0.j
        public void D1(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13211n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            k kVar = (k) n0Var;
            if (this.f13819c && kVar.f13819c && (i5 = kVar.f13211n) >= this.f13209l && i5 <= this.f13210m) {
                this.f13211n = i5;
            }
            if (this.f13818b && kVar.f13818b && (i4 = kVar.f13212o) >= this.f13209l && i4 <= this.f13210m) {
                this.f13212o = i4;
            }
            H0();
        }

        @Override // z1.h0.j
        public int c2() {
            return this.f13211n;
        }

        public e d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.g0.e
        public void k1(int i4) {
            if (!this.f13818b || this.f13212o == i4) {
                return;
            }
            this.f13212o = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.k
        public int m0() {
            return this.f13210m;
        }

        @Override // z1.h0.k
        public int r1() {
            return this.f13209l;
        }

        @Override // z1.g0.e
        public int t0() {
            return this.f13212o;
        }
    }

    public static class l extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f13213l;

        public l(float f4) {
            this.f13821e = n0.f.PW_ANGLE.toString();
            this.f13213l = f4;
        }

        public float d3() {
            return this.f13213l;
        }

        public void e3(float f4) {
            this.f13213l = f4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class m extends p0 implements h0.m, h0.l, u {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13214l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13215m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13216n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13217o;

        public m(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.f.PW_DYNAMIC_RANGE.toString();
            this.f13214l = i4;
            this.f13215m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13217o = i6;
            this.f13216n = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.h0.m
        public int B() {
            return this.f13818b ? this.f13217o : this.f13216n;
        }

        @Override // z1.h0.l
        public void G(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13216n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.m
        public int K() {
            return this.f13215m;
        }

        @Override // z1.g0.u
        public void M(int i4) {
            if (!this.f13818b || this.f13217o == i4) {
                return;
            }
            this.f13217o = i4;
            z1.q qVar = this.f13822f;
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
            m mVar = (m) n0Var;
            if (this.f13819c && mVar.f13819c && (i5 = mVar.f13216n) >= this.f13214l && i5 <= this.f13215m) {
                this.f13216n = mVar.f13217o;
            }
            if (this.f13818b && mVar.f13818b && (i4 = mVar.f13217o) >= this.f13214l && i4 <= this.f13215m) {
                this.f13217o = i4;
            }
            H0();
        }

        public u d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.m
        public int r() {
            return this.f13214l;
        }

        @Override // z1.h0.l
        public int v() {
            return this.f13216n;
        }

        @Override // z1.g0.u
        public int w() {
            return this.f13217o;
        }
    }

    public static class n extends p0 implements h0.n {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f13218l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<Float> f13219m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13220n = 0;

        public n(float f4) {
            this.f13821e = n0.f.PW_F0.toString();
            this.f13218l = f4;
        }

        @Override // z1.h0.n
        public int A1() {
            List<Float> list = this.f13219m;
            if (list != null) {
                return list.size();
            }
            return 1;
        }

        public float d3(int i4) {
            if (i4 < 0 || i4 >= this.f13219m.size()) {
                return -1.0f;
            }
            this.f13220n = i4;
            return this.f13219m.get(i4).floatValue();
        }

        public void e3(float[] fArr, int i4) {
            if (this.f13219m == null) {
                this.f13219m = new ArrayList();
            }
            this.f13219m.clear();
            for (int i5 = 0; i5 < i4; i5++) {
                this.f13219m.add(Float.valueOf(fArr[i5]));
            }
        }

        @Override // z1.h0.n
        public float z() {
            List<Float> list = this.f13219m;
            return list != null ? list.get(this.f13220n).floatValue() : this.f13218l;
        }
    }

    public static class o extends p0 implements h0.p, h0.o, v {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13221l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13222m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[][] f13223n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13224o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13225p;

        public o(float[][] fArr, int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.f.PW_FOCUS.toString();
            this.f13223n = fArr;
            this.f13221l = i4;
            this.f13222m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13224o = i6;
            this.f13225p = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            o oVar = (o) n0Var;
            if (this.f13819c && oVar.f13819c) {
                this.f13224o = oVar.f13224o;
            }
            if (this.f13818b && oVar.f13818b) {
                this.f13225p = oVar.f13225p;
            }
            H0();
        }

        @Override // z1.g0.v
        public void T0(int i4) {
            if (!this.f13818b || this.f13225p == i4) {
                return;
            }
            this.f13225p = i4;
            f3();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.p
        public int a() {
            return this.f13818b ? this.f13225p : this.f13224o;
        }

        @Override // z1.h0.p
        public int b() {
            return this.f13221l;
        }

        public float d3(int i4) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (float f6 : f(i4)) {
                f4 += f6;
                f5 += 1.0f;
            }
            return f4 / f5;
        }

        @Override // z1.h0.p
        public int e() {
            return this.f13222m;
        }

        public v e3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.p
        public float[] f(int i4) {
            if (i4 < 0) {
                return null;
            }
            float[][] fArr = this.f13223n;
            if (i4 >= fArr.length) {
                return null;
            }
            return fArr[i4];
        }

        public void f3() {
            X2();
        }

        @Override // z1.h0.o
        public void g(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13224o = i4;
                f3();
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.o
        public int l() {
            return this.f13224o;
        }

        @Override // z1.g0.v
        public int m() {
            return this.f13225p;
        }
    }

    public static class p extends p0 implements h0.r, h0.q, w {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13226l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13227m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13228n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13229o;

        public p(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.f.PW_GAIN.toString();
            this.f13226l = i4;
            this.f13227m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13228n = i6;
            this.f13229o = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            p pVar = (p) n0Var;
            if (this.f13819c && pVar.f13819c && (i5 = pVar.f13228n) >= this.f13226l && i5 <= this.f13227m) {
                this.f13228n = i5;
            }
            if (this.f13818b && pVar.f13818b && (i4 = pVar.f13229o) >= this.f13226l && i4 <= this.f13227m) {
                this.f13229o = i4;
            }
            H0();
        }

        @Override // z1.g0.w
        public void c(int i4) {
            if (!this.f13818b || this.f13229o == i4) {
                return;
            }
            this.f13229o = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.g0.w
        public int d() {
            return this.f13229o;
        }

        public w d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.q
        public int h() {
            return this.f13228n;
        }

        @Override // z1.h0.q
        public void i(int i4) {
            z1.q qVar;
            int i5 = this.f13226l;
            if (i4 < i5) {
                i4 = i5;
            }
            int i6 = this.f13227m;
            if (i4 > i6) {
                i4 = i6;
            }
            if (this.f13819c) {
                this.f13228n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.r
        public int j() {
            return this.f13227m;
        }

        @Override // z1.h0.r
        public int k() {
            return this.f13818b ? this.f13229o : this.f13228n;
        }

        @Override // z1.h0.r
        public int n() {
            return this.f13226l;
        }
    }

    public static class q extends p0 implements h0.t, h0.s, x {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ boolean f13230s = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13231l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13232m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int[] f13233n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int[] f13234o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int[] f13235p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f13236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f13237r;

        public q(int[] iArr, int i4, int i5, int[] iArr2, int[] iArr3, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.f.PW_PRF.toString();
            this.f13233n = iArr;
            this.f13234o = iArr2;
            this.f13235p = iArr3;
            this.f13231l = i4;
            this.f13232m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13236q = i6;
            this.f13237r = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.h0.t
        public int D() {
            return this.f13232m;
        }

        @Override // z1.g0.x
        public void E(int i4) {
            if (!this.f13818b || this.f13237r == i4) {
                return;
            }
            this.f13237r = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.s
        public int L() {
            return this.f13236q;
        }

        @Override // z1.h0.t
        public int N(int i4) {
            if (i4 < this.f13231l || i4 > this.f13232m) {
                return 0;
            }
            return this.f13233n[i4];
        }

        @Override // z1.h0.t
        public float S0(int i4) {
            if (i4 < this.f13231l || i4 > this.f13232m) {
                return 0.0f;
            }
            return this.f13234o[i4];
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            q qVar = (q) n0Var;
            if (this.f13819c && qVar.f13819c && (i5 = qVar.f13236q) >= this.f13231l && i5 <= this.f13232m) {
                this.f13236q = i5;
            }
            if (this.f13818b && qVar.f13818b && (i4 = qVar.f13237r) >= this.f13231l && i4 <= this.f13232m) {
                this.f13237r = i4;
            }
            H0();
        }

        public x d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.t
        public float i2(int i4) {
            if (i4 < this.f13231l || i4 > this.f13232m) {
                return 0.0f;
            }
            return this.f13235p[i4];
        }

        @Override // z1.h0.s
        public void q(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13236q = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.g0.x
        public int s() {
            return this.f13237r;
        }

        @Override // z1.h0.t
        public int u() {
            return this.f13231l;
        }

        @Override // z1.h0.t
        public int y() {
            return this.f13818b ? this.f13237r : this.f13236q;
        }
    }

    public static class r extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f13238l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13239m = 5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13240n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13241o;

        public r() {
            this.f13821e = n0.f.PW_SINGLE_TASK.toString();
        }

        public void d3() {
            int i4 = this.f13240n + 1;
            this.f13240n = i4;
            if (i4 > this.f13239m) {
                this.f13241o = true;
            }
        }

        public int e3() {
            return this.f13239m;
        }

        public boolean f3() {
            return this.f13238l;
        }

        public boolean g3() {
            return this.f13241o;
        }

        public void h3() {
            this.f13241o = false;
            this.f13240n = 0;
        }

        public void i3(int i4) {
            this.f13239m = i4;
        }

        public void j3(int i4) {
            if (i4 <= 3 || !this.f13238l) {
                this.f13241o = false;
                this.f13240n = 0;
            }
            this.f13238l = i4 > 3;
        }
    }

    public static class s extends p0 implements h0.v, h0.u, y {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ boolean f13242q = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13243l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13244m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int[] f13245n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13246o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13247p;

        public s(int[] iArr, int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.f.PW_STEER.toString();
            this.f13245n = iArr;
            this.f13243l = i4;
            this.f13244m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13246o = i6;
            this.f13247p = i6;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.g0.y
        public int A() {
            return this.f13247p;
        }

        @Override // z1.h0.u
        public int C() {
            return this.f13246o;
        }

        @Override // z1.g0.y
        public void F(int i4) {
            if (!this.f13818b || this.f13247p == i4) {
                return;
            }
            this.f13247p = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.u
        public void I(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13246o = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.v
        public int J() {
            return this.f13244m;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            int i4;
            int i5;
            if (n0Var == null || n0Var == this) {
                return;
            }
            s sVar = (s) n0Var;
            if (this.f13819c && sVar.f13819c && (i5 = sVar.f13246o) >= this.f13243l && i5 <= this.f13244m) {
                this.f13246o = i5;
            }
            if (this.f13818b && sVar.f13818b && (i4 = sVar.f13247p) >= this.f13243l && i4 <= this.f13244m) {
                this.f13247p = i4;
            }
            H0();
        }

        public y d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.h0.v
        public int o() {
            return this.f13818b ? this.f13247p : this.f13246o;
        }

        @Override // z1.h0.v
        public int t() {
            return this.f13243l;
        }

        @Override // z1.h0.v
        public int x(int i4) {
            if (i4 < this.f13243l || i4 > this.f13244m) {
                return 0;
            }
            return this.f13245n[i4];
        }
    }

    public static class t extends p0 implements h0.x, h0.w, z {
        public static final /* synthetic */ boolean A = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13248l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f13249m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13251o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f13252p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float[] f13253q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int[] f13254r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f13255s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13256t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13257u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13258v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13259w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13260x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13261y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f13262z;

        public t(int[] iArr, float[] fArr, int i4, int i5, int i6, int i7, int i8, int i9, boolean z3, boolean z4, float f4, int i10, int i11, int i12) {
            this.f13821e = n0.f.PW_VOLUME.toString();
            this.f13254r = iArr;
            this.f13253q = fArr;
            this.f13248l = i4;
            this.f13249m = i5;
            this.f13250n = i6;
            this.f13251o = i7;
            this.f13261y = i8;
            this.f13262z = i9;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f13256t = i10;
            this.f13255s = i10;
            this.f13258v = i11;
            this.f13257u = i11;
            this.f13260x = i12;
            this.f13259w = i12;
            this.f13252p = f4;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.h0.x
        public int B1() {
            return this.f13818b ? this.f13256t : this.f13255s;
        }

        @Override // z1.h0.x
        public int B2() {
            return this.f13818b ? this.f13258v : this.f13257u;
        }

        @Override // z1.h0.x
        public int E0() {
            return this.f13818b ? this.f13260x : this.f13259w;
        }

        @Override // z1.h0.x
        public int E1() {
            return this.f13251o;
        }

        @Override // z1.h0.x
        public int G0(int i4) {
            if (i4 < this.f13248l || i4 > this.f13249m) {
                return 0;
            }
            return this.f13254r[i4];
        }

        @Override // z1.g0.z
        public void I0(int i4) {
            if (!this.f13818b || this.f13260x == i4) {
                return;
            }
            this.f13260x = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.w
        public int K0() {
            return this.f13257u;
        }

        @Override // z1.h0.w
        public void M1(int i4) {
            if (this.f13819c) {
                this.f13257u = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b) {
                return;
            }
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.x
        public float O(int i4) {
            return b0(i4) / this.f13252p;
        }

        @Override // z1.h0.x
        public int R() {
            return this.f13262z;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            t tVar = (t) n0Var;
            if (this.f13819c && tVar.f13819c) {
                int i4 = tVar.f13255s;
                if (i4 >= this.f13248l && i4 <= this.f13249m) {
                    this.f13255s = i4;
                }
                int i5 = tVar.f13257u;
                if (i5 >= this.f13250n && i5 <= this.f13251o) {
                    this.f13257u = i5;
                }
                this.f13259w = tVar.f13259w;
            }
            if (this.f13818b && tVar.f13818b) {
                int i6 = tVar.f13256t;
                if (i6 >= this.f13248l && i6 <= this.f13249m) {
                    this.f13256t = i6;
                }
                int i7 = tVar.f13258v;
                if (i7 >= this.f13250n && i7 <= this.f13251o) {
                    this.f13258v = i7;
                }
                this.f13260x = tVar.f13260x;
            }
            H0();
            X2();
        }

        @Override // z1.h0.x
        public int T1() {
            return this.f13250n;
        }

        @Override // z1.g0.z
        public void U(int i4) {
            if (!this.f13818b || this.f13256t == i4) {
                return;
            }
            this.f13256t = i4;
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.h0.x
        public int U0() {
            return this.f13261y;
        }

        @Override // z1.h0.x
        public float b0(int i4) {
            if (i4 < this.f13248l || i4 > this.f13249m) {
                return 0.0f;
            }
            return this.f13253q[i4];
        }

        @Override // z1.g0.z
        public void b2(int i4) {
            if (!this.f13818b || this.f13258v == i4) {
                return;
            }
            this.f13258v = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        public z d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.g0.z
        public int e1() {
            return this.f13258v;
        }

        @Override // z1.h0.w
        public int e2() {
            return this.f13255s;
        }

        public void e3(float f4) {
            if (this.f13252p != f4) {
                this.f13252p = f4;
                X2();
                z1.q qVar = this.f13822f;
                if (qVar != null) {
                    qVar.d(this);
                }
            }
        }

        @Override // z1.g0.z
        public int h2() {
            return this.f13260x;
        }

        @Override // z1.h0.x
        public float i1() {
            return B2() * this.f13252p;
        }

        @Override // z1.h0.x
        public float l1() {
            return v2() * this.f13252p;
        }

        @Override // z1.h0.w
        public void t2(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13259w = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.x
        public float v2() {
            return O(B1()) + B2();
        }

        @Override // z1.g0.z
        public int w1() {
            return this.f13256t;
        }

        @Override // z1.h0.w
        public int w2() {
            return this.f13259w;
        }

        @Override // z1.h0.x
        public int y0() {
            return this.f13249m;
        }

        @Override // z1.h0.w
        public void y1(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f13255s = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.h0.x
        public int z1() {
            return this.f13248l;
        }
    }

    public interface u {
        void M(int i4);

        int w();
    }

    public interface v {
        void T0(int i4);

        int m();
    }

    public interface w {
        void c(int i4);

        int d();
    }

    public interface x {
        void E(int i4);

        int s();
    }

    public interface y {
        int A();

        void F(int i4);
    }

    public interface z {
        void I0(int i4);

        void U(int i4);

        void b2(int i4);

        int e1();

        int h2();

        int w1();
    }
}
