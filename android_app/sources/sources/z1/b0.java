package z1;

import java.util.List;
import z1.c0;
import z1.n0;
import z1.z1;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    public interface a {
        void F1(boolean z3);

        boolean Z1();
    }

    public interface b {
        void c(int i4);

        int d();
    }

    public interface c {
        void L2(boolean z3);

        boolean h1();
    }

    public interface d {
        String C0();

        void m1(String str);
    }

    public static class e extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f12902l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12903m;

        public e(boolean z3, int i4) {
            this.f13821e = n0.a.AP.toString();
            this.f12903m = i4;
            this.f12902l = z3;
        }

        public int d3() {
            return this.f12903m;
        }

        public boolean e3() {
            return this.f12902l;
        }

        public void f3(boolean z3) {
            this.f12902l = z3;
        }

        public void g3(int i4) {
            this.f12903m = i4;
            H0();
        }
    }

    public static class f extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12904l;

        public f(int i4) {
            this.f13821e = n0.a.BM_LINE.toString();
            this.f12904l = i4;
        }

        public int d3() {
            return this.f12904l;
        }

        public void e3(int i4) {
            z1.q qVar;
            this.f12904l = i4;
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }
    }

    public static class g extends p0 implements c0.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12905l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12906m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f12907n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f12908o;

        public g(int i4, int i5, float f4, float f5) {
            this.f13821e = n0.a.BASE.toString();
            this.f12905l = i4;
            this.f12906m = i5;
            this.f12907n = f4;
            this.f12908o = f5;
            this.f13819c = true;
        }

        @Override // z1.c0.a
        public int S() {
            return this.f12906m;
        }

        @Override // z1.c0.a
        public float a0() {
            return this.f12907n;
        }

        @Override // z1.c0.a
        public int u2() {
            return this.f12905l;
        }

        @Override // z1.c0.a
        public float x1() {
            return this.f12908o;
        }
    }

    public static class h extends p0 implements c0.c, c0.b, a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<z1> f12909l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f12910m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f12911n;

        public h(boolean z3, boolean z4, List<z1> list, boolean z5) {
            this.f13821e = n0.a.BUILD_IN_PA.toString();
            this.f12909l = list;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12910m = z5;
            this.f12911n = z5;
        }

        @Override // z1.b0.a
        public void F1(boolean z3) {
            if (!this.f13818b || this.f12911n == z3) {
                return;
            }
            this.f12911n = z3;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.c0.c
        public boolean S1() {
            return this.f13818b ? this.f12911n : this.f12910m;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            h hVar = (h) n0Var;
            if (this.f13819c && hVar.f13819c) {
                this.f12910m = hVar.f12910m;
            }
            if (this.f13818b && hVar.f13818b) {
                this.f12911n = hVar.f12911n;
            }
            H0();
        }

        @Override // z1.c0.c
        public String W1(boolean z3) {
            z1 z1Var;
            if (z3) {
                if (this.f12909l.size() < 2) {
                    return s0.a.f11071l;
                }
                z1Var = this.f12909l.get(1);
            } else {
                if (this.f12909l.size() < 1) {
                    return s0.a.f11071l;
                }
                z1Var = this.f12909l.get(0);
            }
            return z1Var.a();
        }

        @Override // z1.b0.a
        public boolean Z1() {
            return false;
        }

        @Override // z1.c0.b
        public boolean b1() {
            return this.f12910m;
        }

        @Override // z1.c0.b
        public void d1(boolean z3) {
            z1.q qVar;
            if (this.f13819c) {
                this.f12910m = z3;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        public a d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        public void e3(boolean z3, int i4) {
            for (z1 z1Var : this.f12909l) {
                if (z1Var.f14214a.endsWith(z1.a.BUILD_IN_PA.toString())) {
                    x xVar = (x) z1Var.f14216c;
                    i0 i0Var = (i0) xVar.f14124b;
                    l2 l2Var = (l2) xVar.f14125c;
                    i0Var.f13318a.d(z3, i4);
                    l2Var.f13583a.d(z3, i4);
                    return;
                }
            }
        }

        public void f3(boolean z3) {
            for (z1 z1Var : this.f12909l) {
                if (z1Var.f14214a.endsWith(z1.a.BUILD_IN_PA.toString())) {
                    x xVar = (x) z1Var.f14216c;
                    i0 i0Var = (i0) xVar.f14124b;
                    l2 l2Var = (l2) xVar.f14125c;
                    i0Var.f13318a.f13301a = z3;
                    l2Var.f13583a.f13301a = z3;
                    return;
                }
            }
        }
    }

    public static class i extends p0 implements c0.e, c0.d, b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12912l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12913m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f12914n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12915o;

        public i(int i4, int i5, boolean z3, boolean z4, int i6) {
            this.f13821e = n0.a.GAIN.toString();
            this.f12912l = i4;
            this.f12913m = i5;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12914n = i6;
            this.f12915o = i6;
            if (z4) {
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
            i iVar = (i) n0Var;
            if (this.f13819c && iVar.f13819c && (i5 = iVar.f12914n) >= this.f12912l && i5 <= this.f12913m) {
                this.f12914n = i5;
            }
            if (this.f13818b && iVar.f13818b && (i4 = iVar.f12915o) >= this.f12912l && i4 <= this.f12913m) {
                this.f12915o = i4;
            }
            H0();
        }

        @Override // z1.b0.b
        public void c(int i4) {
            if (!this.f13818b || this.f12915o == i4 || i4 < this.f12912l || i4 > this.f12913m) {
                return;
            }
            this.f12915o = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.b0.b
        public int d() {
            return this.f12915o;
        }

        public b d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.c0.d
        public int h() {
            return this.f12914n;
        }

        @Override // z1.c0.d
        public void i(int i4) {
            z1.q qVar;
            int i5 = this.f12912l;
            if (i4 < i5) {
                i4 = i5;
            }
            int i6 = this.f12913m;
            if (i4 > i6) {
                i4 = i6;
            }
            if (this.f13819c) {
                this.f12914n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.c0.e
        public int j() {
            return this.f12913m;
        }

        @Override // z1.c0.e
        public int k() {
            return this.f13818b ? this.f12915o : this.f12914n;
        }

        @Override // z1.c0.e
        public int n() {
            return this.f12912l;
        }
    }

    public static class j extends p0 implements c0.f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f12916l;

        public j(int[] iArr) {
            this.f13821e = n0.a.GRAY_MAP.toString();
            this.f12916l = iArr;
        }

        @Override // z1.c0.f
        public int[] g1() {
            return this.f12916l;
        }
    }

    public static class k extends p0 implements c0.h, c0.g, c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f12917l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f12918m;

        public k(boolean z3, boolean z4, boolean z5) {
            this.f13821e = n0.a.LIVE.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12917l = z5;
            this.f12918m = z5;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.c0.h
        public boolean H2() {
            return this.f13818b ? this.f12918m : this.f12917l;
        }

        @Override // z1.b0.c
        public void L2(boolean z3) {
            if (!this.f13818b || this.f12918m == z3) {
                return;
            }
            this.f12918m = z3;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.c0.g
        public boolean T() {
            return this.f12917l;
        }

        public c d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.b0.c
        public boolean h1() {
            return this.f12918m;
        }

        @Override // z1.c0.g
        public void p(boolean z3) {
            z1.q qVar;
            if (this.f13819c) {
                this.f12917l = z3;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }
    }

    public static class l extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f12919l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte[] f12920m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public byte[] f12921n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public byte[] f12922o;

        public l(boolean z3, boolean z4, byte[] bArr) {
            this.f13821e = n0.a.MAGNETIC_CALIBRATION_SET.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12919l = bArr;
            this.f12920m = bArr;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var != null) {
                l lVar = (l) n0Var;
                if (this.f13819c && lVar.f13819c) {
                    this.f12919l = lVar.f12919l;
                }
                if (this.f13818b && lVar.f13818b) {
                    this.f12920m = lVar.f12920m;
                }
                H0();
            }
        }

        public byte[] d3() {
            return this.f13818b ? this.f12920m : this.f12919l;
        }

        public byte[] e3() {
            return this.f12922o;
        }

        public byte[] f3() {
            return this.f12921n;
        }

        public byte[] g3() {
            return this.f12919l;
        }

        public byte[] h3() {
            return this.f12920m;
        }

        public void i3(byte[] bArr) {
            z1.q qVar;
            if (this.f13819c) {
                this.f12919l = bArr;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        public void j3(byte[] bArr) {
            this.f12922o = bArr;
        }

        public void k3(byte[] bArr) {
            this.f12921n = bArr;
        }

        public void l3(byte[] bArr) {
            if (!this.f13818b || this.f12920m == bArr) {
                return;
            }
            this.f12920m = bArr;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class m extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f12923l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f12924m;

        public m(boolean z3, boolean z4, boolean z5) {
            this.f13821e = n0.a.MAGNETIC_READ.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12923l = z5;
            this.f12924m = z5;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var != null) {
                m mVar = (m) n0Var;
                if (this.f13819c && mVar.f13819c) {
                    this.f12923l = mVar.f12923l;
                }
                if (this.f13818b && mVar.f13818b) {
                    this.f12924m = mVar.f12924m;
                }
                H0();
            }
        }

        public boolean d3() {
            return this.f13818b ? this.f12924m : this.f12923l;
        }

        public boolean e3() {
            return this.f12923l;
        }

        public boolean f3() {
            return this.f12924m;
        }

        public void g3(boolean z3) {
            z1.q qVar;
            if (this.f13819c) {
                this.f12923l = z3;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        public void h3(boolean z3) {
            if (!this.f13818b || this.f12924m == z3) {
                return;
            }
            this.f12924m = z3;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class n extends p0 implements c0.j, c0.i, d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String[] f12925l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f12926m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f12927n;

        public n(String[] strArr, boolean z3, boolean z4, String str) {
            this.f13821e = n0.a.MODE.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12925l = strArr;
            this.f12926m = str;
            this.f12927n = str;
        }

        @Override // z1.b0.d
        public String C0() {
            return this.f13818b ? this.f12927n : n0.e.MODE_B.toString();
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            n nVar = (n) n0Var;
            if (this.f13819c && nVar.f13819c) {
                this.f12926m = nVar.f12926m;
            }
            if (this.f13818b && nVar.f13818b) {
                this.f12927n = nVar.f12927n;
            }
            H0();
            X2();
        }

        @Override // z1.c0.j
        public String[] U1() {
            return this.f12925l;
        }

        @Override // z1.n0
        public Object V2() {
            return j2();
        }

        @Override // z1.c0.i
        public String X0() {
            return this.f12926m;
        }

        public d d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.c0.j
        public String j2() {
            return this.f13818b ? this.f12927n : this.f12926m;
        }

        @Override // z1.b0.d
        public void m1(String str) {
            if (!this.f13818b || this.f12927n.startsWith("mode")) {
                return;
            }
            this.f12927n = str;
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.c0.i
        public void p0(String str) {
            if (this.f13819c) {
                this.f12926m = str;
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

    public static class o extends p0 implements c0.l, c0.k, q {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<g7> f12928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12929m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f12930n;

        public o(boolean z3, boolean z4, List<g7> list, int i4) {
            this.f13821e = n0.a.TRANSDUCER.toString();
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12928l = list;
            this.f12929m = i4;
            this.f12930n = i4;
        }

        @Override // z1.c0.k
        public int B0() {
            return this.f12929m;
        }

        @Override // z1.c0.l
        public boolean Q(int i4) {
            return i4 >= 0 && i4 <= l2() && this.f12928l.get(i4).b() != null;
        }

        @Override // z1.b0.q
        public int c1() {
            return this.f12930n;
        }

        public q d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.c0.k
        public void e0(int i4) {
            z1.q qVar;
            if (this.f13819c) {
                this.f12929m = i4;
                H0();
            }
            if (this.f13819c && this.f13818b && (qVar = this.f13822f) != null) {
                qVar.d(this);
            }
        }

        @Override // z1.c0.l
        public int l2() {
            return this.f12928l.size() - 1;
        }

        @Override // z1.c0.l
        public String n0(int i4) {
            return (i4 < 0 || i4 > l2()) ? s0.a.f11071l : this.f12928l.get(i4).e();
        }

        @Override // z1.c0.l
        public int o1() {
            return this.f13818b ? this.f12930n : this.f12929m;
        }

        @Override // z1.c0.l
        public int q2() {
            return 0;
        }

        @Override // z1.b0.q
        public void s1(int i4) {
            if (!this.f13818b || this.f12930n == i4) {
                return;
            }
            this.f12930n = i4;
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class p extends p0 implements c0.n, c0.m, r {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ boolean f12931r = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float[] f12933m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[] f12934n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int[] f12935o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f12936p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f12937q;

        public p(int i4, float[] fArr, int[] iArr, float[] fArr2, boolean z3, boolean z4, int i5) {
            this.f13821e = n0.a.ZOOM.toString();
            this.f12932l = i4;
            this.f12933m = fArr;
            this.f12935o = iArr;
            this.f12934n = fArr2;
            this.f13819c = z3;
            this.f13818b = z4;
            this.f12936p = i5;
            this.f12937q = i5;
            if (z3) {
                this.f13817a = true;
            }
        }

        @Override // z1.c0.m
        public int A0() {
            return this.f12936p;
        }

        @Override // z1.b0.r
        public void C1(int i4) {
            if (!this.f13818b || this.f12937q == i4 || i4 < E2() || i4 > f0()) {
                return;
            }
            this.f12937q = i4;
            X2();
            z1.q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.c0.n
        public int E2() {
            return 0;
        }

        @Override // z1.n0
        public void S2(n0 n0Var) {
            if (n0Var == null || n0Var == this) {
                return;
            }
            p pVar = (p) n0Var;
            if (this.f13819c && pVar.f13819c && pVar.f12936p >= E2() && pVar.f12936p <= f0()) {
                this.f12936p = pVar.f12936p;
            }
            if (this.f13818b && pVar.f13818b && pVar.f12937q >= E2() && pVar.f12937q <= f0()) {
                this.f12937q = pVar.f12937q;
            }
            H0();
            X2();
        }

        @Override // z1.c0.n
        public float V(int i4) {
            return 770000.0f / o0(i4);
        }

        @Override // z1.c0.n
        public int a2() {
            return this.f13818b ? this.f12937q : this.f12936p;
        }

        public r d3() {
            if (this.f13818b) {
                return this;
            }
            return null;
        }

        @Override // z1.c0.n
        public int f0() {
            return this.f12932l - 1;
        }

        @Override // z1.c0.n
        public int k0(int i4) {
            if (i4 < 0 || i4 >= this.f12932l) {
                return 0;
            }
            return this.f12935o[i4];
        }

        @Override // z1.c0.n
        public float l0(int i4) {
            if (i4 < 0 || i4 >= this.f12932l) {
                return 0.0f;
            }
            return this.f12934n[i4];
        }

        @Override // z1.c0.n
        public float o0(int i4) {
            if (i4 < 0 || i4 >= this.f12932l) {
                return 0.0f;
            }
            return this.f12933m[i4];
        }

        @Override // z1.c0.m
        public void o2(int i4) {
            z1.q qVar;
            if (i4 < 0 || i4 >= this.f12932l) {
                return;
            }
            if (this.f13819c) {
                this.f12936p = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.b0.r
        public int r2() {
            return this.f12937q;
        }
    }

    public interface q {
        int c1();

        void s1(int i4);
    }

    public interface r {
        void C1(int i4);

        int r2();
    }
}
