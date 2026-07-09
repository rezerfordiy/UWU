package z1;

import java.lang.reflect.Array;
import java.util.Iterator;
import z1.b0;
import z1.g0;
import z1.n0;
import z1.o1;

/* JADX INFO: loaded from: classes.dex */
public class u1 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f13852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f13854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f13856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f13858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13859j;

    public enum a {
        COLORFOCUS_DEFAULT("colorfocus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13862b;

        a(String str) {
            this.f13862b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13862b;
        }
    }

    public static class b {
        public int A;
        public int C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13864b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13871i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f13873k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13874l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13877o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f13879q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f13880r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f13881s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13883u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13885w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13886x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f13887y;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f13865c = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f13872j = new int[16];

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float[] f13875m = new float[4];

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int[] f13878p = new int[9];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f13882t = new float[16];

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int[] f13884v = new int[16];

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float[] f13888z = new float[4];
        public int[] B = new int[9];
        public int[] D = new int[16];
    }

    public enum c {
        FOCUS_DEFAULT("focus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13891b;

        c(String str) {
            this.f13891b = str;
        }
    }

    public enum d {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13895b;

        d(String str) {
            this.f13895b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13895b;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13900e;
    }

    public enum f {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13904b;

        f(String str) {
            this.f13904b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13904b;
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13905a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13908d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f13912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f13913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f13914j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f13906b = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f13909e = new int[16];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f13910f = new int[4];

        public g() {
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[][] f13918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[][] f13920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f13921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f13922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13923h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f13924i;

        public h() {
            Class cls = Float.TYPE;
            this.f13918c = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f13920e = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f13924i = new int[9];
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f13925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f13928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13930f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f13935k;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f13931g = new float[8];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int[] f13932h = new int[8];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f13933i = new float[8];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f13934j = new int[256];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f13936l = new int[8];
    }

    public enum j {
        MODE_B("mode_b"),
        MODE_BM("mode_bm"),
        MODE_BC("mode_bc"),
        MODE_BP("mode_bp"),
        MODE_BD("mode_bd");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13943b;

        j(String str) {
            this.f13943b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13943b;
        }
    }

    public class k extends r0 {
        public k() {
        }

        @Override // z1.r0
        public void b() {
            g0.j jVar = (g0.j) c(n0.b.COLOR_POWER_QUADRANGLE.toString());
            int iR0 = (jVar.R0() + jVar.Z0()) / 2;
            b0.p pVar = (b0.p) c(n0.a.ZOOM.toString());
            float fV = iR0 * pVar.V(pVar.a2());
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            g0.g gVar = (g0.g) o0VarG.f13749a.get(n0.b.COLOR_POWER_FOCUS.toString());
            int iE = gVar.e();
            float f4 = 99999.9f;
            int i4 = -1;
            for (int iB = gVar.b(); iB <= iE; iB++) {
                float fD3 = gVar.d3(iB);
                float f5 = fD3 >= fV ? fD3 - fV : fV - fD3;
                if (f5 < f4) {
                    i4 = iB;
                    f4 = f5;
                }
            }
            if (i4 == -1 || i4 == gVar.a()) {
                return;
            }
            gVar.g(i4);
        }

        @Override // z1.r0
        public o0 g() {
            g0.j jVar = (g0.j) c(n0.b.COLOR_POWER_QUADRANGLE.toString());
            b0.p pVar = (b0.p) c(n0.a.ZOOM.toString());
            if (jVar.f13825i && pVar.f13825i) {
                return d(c.FOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class l extends r0 {
        public l() {
        }

        @Override // z1.r0
        public void b() {
            g0.j jVar = (g0.j) c(n0.b.COLOR_POWER_QUADRANGLE.toString());
            int iR0 = (jVar.R0() + jVar.Z0()) / 2;
            b0.p pVar = (b0.p) c(n0.a.ZOOM.toString());
            float fV = iR0 * pVar.V(pVar.a2());
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            o1.j jVar2 = (o1.j) o0VarG.f13749a.get(n0.c.FOCUS.toString());
            int iE = jVar2.e();
            float f4 = 99999.9f;
            int i4 = -1;
            for (int iB = jVar2.b(); iB <= iE; iB++) {
                float fE3 = jVar2.e3(iB);
                float f5 = fE3 >= fV ? fE3 - fV : fV - fE3;
                if (f5 < f4) {
                    i4 = iB;
                    f4 = f5;
                }
            }
            if (i4 == -1 || i4 == jVar2.a()) {
                return;
            }
            jVar2.g(i4);
        }

        @Override // z1.r0
        public o0 g() {
            g0.j jVar = (g0.j) c(n0.b.COLOR_POWER_QUADRANGLE.toString());
            b0.p pVar = (b0.p) c(n0.a.ZOOM.toString());
            o1.k kVar = (o1.k) c(n0.c.HARMONIC.toString());
            if (jVar.f13825i && pVar.f13825i && kVar.f13825i) {
                return d((kVar.H1() ? d.HARMONIC_ON : d.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class m extends r0 {
        public m() {
        }

        @Override // z1.r0
        public void b() {
            g0.g gVar = (g0.g) c(n0.b.COLOR_POWER_FOCUS.toString());
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            g0.f fVar = (g0.f) o0VarG.f13749a.get(n0.b.COLOR_F0.toString());
            if (fVar.f13825i) {
                fVar.d3(gVar.a());
            }
        }

        @Override // z1.r0
        public o0 g() {
            if (((g0.g) c(n0.b.COLOR_POWER_FOCUS.toString())).f13825i) {
                return d(a.COLORFOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class n extends r0 {
        public n() {
        }

        @Override // z1.r0
        public o0 g() {
            o1.k kVar = (o1.k) c(n0.c.HARMONIC.toString());
            if (kVar.f13825i) {
                return d((kVar.H1() ? f.HARMONIC_ON : f.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class o extends r0 {
        public o() {
        }

        @Override // z1.r0
        public o0 g() {
            j jVar;
            b0.n nVar = (b0.n) c(n0.a.MODE.toString());
            if (!nVar.f13825i) {
                return null;
            }
            String strJ2 = nVar.j2();
            if (strJ2.equals(n0.e.MODE_B.toString()) || strJ2.equals(n0.e.MODE_BM.toString())) {
                jVar = j.MODE_B;
            } else if (strJ2.equals(n0.e.MODE_BC.toString())) {
                jVar = j.MODE_BC;
            } else if (strJ2.equals(n0.e.MODE_BP.toString())) {
                jVar = j.MODE_BP;
            } else {
                if (!strJ2.equals(n0.e.MODE_BD.toString())) {
                    return null;
                }
                jVar = j.MODE_BD;
            }
            return d(jVar.toString());
        }
    }

    public class p extends r0 {
        public p() {
        }

        @Override // z1.r0
        public void b() {
            g0.o oVar = (g0.o) c(n0.f.PW_FOCUS.toString());
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            g0.n nVar = (g0.n) o0VarG.f13749a.get(n0.f.PW_F0.toString());
            if (nVar.f13825i) {
                nVar.d3(oVar.a());
            }
        }

        @Override // z1.r0
        public o0 g() {
            if (((g0.o) c(n0.f.PW_FOCUS.toString())).f13825i) {
                return d(t.PWFOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class q extends r0 {
        public q() {
        }

        @Override // z1.r0
        public void b() {
            g0.t tVar = (g0.t) c(n0.f.PW_VOLUME.toString());
            float fI1 = (tVar.i1() + tVar.l1()) / 2.0f;
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            o1.j jVar = (o1.j) o0VarG.f13749a.get(n0.c.FOCUS.toString());
            int iE = jVar.e();
            float f4 = 99999.9f;
            int i4 = -1;
            for (int iB = jVar.b(); iB <= iE; iB++) {
                float fE3 = fI1 - jVar.e3(iB);
                if (fE3 <= 0.0f) {
                    fE3 = -fE3;
                }
                if (fE3 < f4) {
                    i4 = iB;
                    f4 = fE3;
                }
            }
            if (i4 == -1 || i4 == jVar.a()) {
                return;
            }
            jVar.g(i4);
        }

        @Override // z1.r0
        public o0 g() {
            g0.t tVar = (g0.t) c(n0.f.PW_VOLUME.toString());
            o1.k kVar = (o1.k) c(n0.c.HARMONIC.toString());
            if (tVar.f13825i && kVar.f13825i) {
                return d((kVar.H1() ? u.HARMONIC_ON : u.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class r extends r0 {
        public r() {
        }

        @Override // z1.r0
        public void b() {
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            g0.t tVar = (g0.t) c(n0.f.PW_VOLUME.toString());
            float fI1 = (tVar.i1() + tVar.l1()) / 2.0f;
            g0.o oVar = (g0.o) o0VarG.f13749a.get(n0.f.PW_FOCUS.toString());
            float f4 = 999999.0f;
            int i4 = -1;
            for (int iB = oVar.b(); iB <= oVar.e(); iB++) {
                float fD3 = fI1 - oVar.d3(iB);
                if (fD3 <= 0.0f) {
                    fD3 = -fD3;
                }
                if (fD3 < f4) {
                    i4 = iB;
                    f4 = fD3;
                }
            }
            if (i4 == -1 || i4 == oVar.a()) {
                return;
            }
            oVar.g(i4);
        }

        @Override // z1.r0
        public o0 g() {
            if (((g0.t) c(n0.f.PW_VOLUME.toString())).f13825i) {
                return d(v.PWFOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class s extends r0 {
        public s() {
        }

        @Override // z1.r0
        public void b() {
            b0.p pVar = (b0.p) c(n0.a.ZOOM.toString());
            o0 o0VarG = g();
            if (o0VarG == null) {
                return;
            }
            ((g0.t) o0VarG.f13749a.get(n0.f.PW_VOLUME.toString())).e3(pVar.V(pVar.a2()));
        }

        @Override // z1.r0
        public o0 g() {
            if (((b0.p) c(n0.a.ZOOM.toString())).f13825i) {
                return d(w.ZOOM_DEFAULT.toString());
            }
            return null;
        }
    }

    public enum t {
        PWFOCUS_DEFAULT("pwfocus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13955b;

        t(String str) {
            this.f13955b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13955b;
        }
    }

    public enum u {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13959b;

        u(String str) {
            this.f13959b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13959b;
        }
    }

    public enum v {
        PWFOCUS_DEFAULT("pw_focus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13962b;

        v(String str) {
            this.f13962b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13962b;
        }
    }

    public enum w {
        ZOOM_DEFAULT("zoom_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13965b;

        w(String str) {
            this.f13965b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13965b;
        }
    }

    @Override // z1.x1
    public z1 a(String str) {
        return new z1(str, h());
    }

    public p0[] b() {
        float[] fArr;
        int[] iArr;
        float[] fArr2;
        i iVar = this.f13850a;
        b0.g gVar = new b0.g(iVar.f13929e, iVar.f13930f, iVar.f13925a, iVar.f13926b);
        b0.j jVar = new b0.j(this.f13850a.f13934j);
        b0.i iVar2 = new b0.i(30, 105, true, true, 80);
        float[] fArr3 = new float[4];
        System.arraycopy(this.f13850a.f13931g, 0, fArr3, 0, 4);
        int[] iArr2 = new int[4];
        System.arraycopy(this.f13850a.f13932h, 0, iArr2, 0, 4);
        float[] fArr4 = new float[4];
        System.arraycopy(this.f13850a.f13933i, 0, fArr4, 0, 4);
        i iVar3 = this.f13850a;
        float[] fArr5 = iVar3.f13933i;
        if (fArr5[5] > 0.0f) {
            fArr = iVar3.f13931g;
            iArr = iVar3.f13932h;
            fArr2 = fArr5;
        } else {
            fArr = fArr3;
            iArr = iArr2;
            fArr2 = fArr4;
        }
        b0.p pVar = new b0.p(fArr.length, fArr, iArr, fArr2, true, true, 2);
        b0.f fVar = new b0.f(this.f13850a.f13929e / 2);
        e eVar = this.f13858i;
        if (eVar != null) {
            fVar.e3(eVar.f13896a / 2);
        }
        b0.e eVar2 = new b0.e(true, 1);
        return this.f13859j ? new p0[]{jVar, iVar2, pVar, fVar, eVar2} : new p0[]{gVar, jVar, iVar2, pVar, fVar, eVar2};
    }

    public o0 c() {
        o0 o0VarH;
        j jVar;
        b bVar;
        int i4;
        int i5;
        o0 o0VarH2;
        char c4;
        o0 o0VarH3;
        int i6;
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        o1.k kVar = null;
        for (p0 p0Var2 : g()) {
            if (p0Var2.f13821e.equals(n0.c.HARMONIC.toString())) {
                kVar = (o1.k) p0Var2;
            } else {
                o0Var.a(p0Var2);
            }
        }
        n0.e eVar = n0.e.MODE_B;
        b0.n nVar = new b0.n(new String[]{eVar.toString(), n0.e.MODE_BM.toString(), n0.e.MODE_BC.toString(), n0.e.MODE_BP.toString(), n0.e.MODE_BD.toString()}, true, false, eVar.toString());
        o0Var.a(nVar);
        o oVar = new o();
        nVar.Z2(oVar);
        if (this.f13859j) {
            int i7 = this.f13858i.f13896a;
            i iVar = this.f13850a;
            b0.g gVar = new b0.g(i7, iVar.f13930f, iVar.f13925a, iVar.f13926b);
            oVar.f(o0.h(gVar, kVar), j.MODE_B.toString());
            o0VarH = o0.h(gVar, kVar);
            jVar = j.MODE_BM;
        } else {
            o0VarH = o0.h(kVar);
            jVar = j.MODE_B;
        }
        oVar.f(o0VarH, jVar.toString());
        o0Var.a(new g0.k(0, this.f13856g.f13876n - 1, true, false, 0));
        o0Var.a(new g0.i(this.f13856g.f13872j, 0, this.f13856g.f13871i - 1, true, false, 0));
        o0Var.a(new g0.h(0, 100, true, false, 40));
        float[] fArr = new float[this.f13856g.f13877o];
        int i8 = 0;
        while (true) {
            bVar = this.f13856g;
            i4 = bVar.f13877o;
            if (i8 >= i4) {
                break;
            }
            fArr[i8] = bVar.f13878p[i8];
            i8++;
        }
        int i9 = bVar.f13866d;
        i iVar2 = this.f13850a;
        int i10 = iVar2.f13930f;
        int i11 = iVar2.f13929e;
        g0.j jVar2 = new g0.j(fArr, 0, i4 - 1, i9, i10 - 10, 0, i11 - 1, bVar.f13867e, bVar.f13868f, bVar.f13869g, bVar.f13870h, true, false, 0, (i11 / 2) - 16, (i11 / 2) + 16, (i10 / 2) - 24, (i10 / 2) + 24);
        o0Var.a(jVar2);
        k kVar2 = new k();
        b0.p pVar = (b0.p) o0Var.f13749a.get(n0.a.ZOOM.toString());
        jVar2.Z2(kVar2);
        pVar.Z2(kVar2);
        b bVar2 = this.f13856g;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, bVar2.f13864b, bVar2.f13865c.length);
        int i12 = 0;
        while (true) {
            i5 = this.f13856g.f13864b;
            if (i12 >= i5) {
                break;
            }
            fArr2[i12] = new float[]{(int) r9.f13865c[i12]};
            i12++;
        }
        g0.g gVar2 = new g0.g(fArr2, 0, i5 - 1, true, false, 0);
        gVar2.b3(true);
        kVar2.f(o0.h(gVar2), c.FOCUS_DEFAULT.toString());
        g0.f fVar = new g0.f(this.f13856g.f13873k);
        if (this.f13856g.f13874l > 1) {
            m mVar = new m();
            gVar2.Z2(mVar);
            b bVar3 = this.f13856g;
            fVar.e3(bVar3.f13875m, bVar3.f13874l);
            mVar.f(o0.h(fVar), a.COLORFOCUS_DEFAULT.toString());
        }
        o0Var.a(fVar);
        h hVar = this.f13852c;
        o1.k kVar3 = new o1.k(hVar.f13921f, hVar.f13922g, true, false, false);
        if (!this.f13856g.f13879q) {
            kVar3.f13820d = true;
            kVar3.Y0(false);
        }
        if (this.f13859j) {
            int i13 = this.f13858i.f13897b;
            i iVar3 = this.f13850a;
            b0.g gVar3 = new b0.g(i13, iVar3.f13930f, iVar3.f13925a, iVar3.f13926b);
            oVar.f(o0.h(gVar3, kVar3), j.MODE_BC.toString());
            o0VarH2 = o0.h(gVar3, kVar3);
        } else {
            oVar.f(o0.h(kVar3), j.MODE_BC.toString());
            o0VarH2 = o0.h(kVar3);
        }
        oVar.f(o0VarH2, j.MODE_BP.toString());
        l lVar = new l();
        kVar3.Z2(lVar);
        pVar.Z2(lVar);
        jVar2.Z2(lVar);
        h hVar2 = this.f13852c;
        float[][] fArr3 = hVar2.f13918c;
        float[][] fArr4 = hVar2.f13920e;
        o1.j.f3();
        o1.j jVar3 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar3.b3(true);
        o1.j jVar4 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar4.b3(true);
        lVar.f(o0.h(jVar3), d.HARMONIC_OFF.toString());
        lVar.f(o0.h(jVar4), d.HARMONIC_ON.toString());
        int i14 = this.f13856g.f13883u;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int i15 = 0;
        while (true) {
            b bVar4 = this.f13856g;
            if (i15 >= bVar4.f13883u) {
                break;
            }
            int[] iArr4 = bVar4.f13884v;
            iArr[i15] = iArr4[i15];
            iArr2[i15] = iArr4[i15];
            iArr3[i15] = iArr4[i15] / bVar4.f13885w;
            i15++;
        }
        o0Var.a(new g0.q(iArr, 0, this.f13856g.f13883u - 1, iArr2, iArr3, true, false, 0));
        o0Var.a(new g0.s(this.f13856g.B, 0, this.f13856g.A - 1, true, false, 0));
        o0Var.a(new g0.p(0, 100, true, false, 40));
        o0Var.a(new g0.l(0.0f));
        o0Var.a(new g0.r());
        o0Var.a(new g0.m(40, 100, true, false, 40));
        h hVar3 = this.f13852c;
        o1.k kVar4 = new o1.k(hVar3.f13921f, hVar3.f13922g, true, false, false);
        if (!this.f13856g.f13880r) {
            kVar3.f13820d = true;
            kVar3.Y0(false);
        }
        if (this.f13859j) {
            int i16 = this.f13858i.f13899d;
            i iVar4 = this.f13850a;
            b0.g gVar4 = new b0.g(i16, iVar4.f13930f, iVar4.f13925a, iVar4.f13926b);
            c4 = 0;
            o0VarH3 = o0.h(gVar4, kVar4);
        } else {
            c4 = 0;
            o0VarH3 = o0.h(kVar4);
        }
        oVar.f(o0VarH3, j.MODE_BD.toString());
        s sVar = new s();
        pVar.Z2(sVar);
        g0.t tVarI = i();
        p0[] p0VarArr = new p0[1];
        p0VarArr[c4] = tVarI;
        sVar.f(o0.h(p0VarArr), w.ZOOM_DEFAULT.toString());
        r rVar = new r();
        tVarI.Z2(rVar);
        float[][] fArr5 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f13856g.f13881s, 1);
        int i17 = 0;
        while (true) {
            b bVar5 = this.f13856g;
            i6 = bVar5.f13881s;
            if (i17 >= i6) {
                break;
            }
            fArr5[i17][0] = bVar5.f13882t[i17];
            i17++;
        }
        g0.o oVar2 = new g0.o(fArr5, 0, i6 - 1, true, false, 0);
        rVar.f(o0.h(oVar2), v.PWFOCUS_DEFAULT.toString());
        g0.n nVar2 = new g0.n(this.f13856g.f13887y);
        if (this.f13856g.f13886x > 1) {
            p pVar2 = new p();
            oVar2.Z2(pVar2);
            b bVar6 = this.f13856g;
            nVar2.e3(bVar6.f13888z, bVar6.f13886x);
            pVar2.f(o0.h(nVar2), t.PWFOCUS_DEFAULT.toString());
        }
        o0Var.a(nVar2);
        q qVar = new q();
        tVarI.Z2(qVar);
        kVar4.Z2(qVar);
        o1.j.f3();
        o1.j jVar5 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar5.b3(true);
        o1.j jVar6 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar6.b3(true);
        qVar.f(o0.h(jVar5), u.HARMONIC_OFF.toString());
        qVar.f(o0.h(jVar6), u.HARMONIC_ON.toString());
        Iterator<String> it = o0Var.f13749a.keySet().iterator();
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(",");
        }
        return o0Var;
    }

    public o0 d() {
        return null;
    }

    public o0 e() {
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        for (p0 p0Var2 : g()) {
            o0Var.a(p0Var2);
        }
        return o0Var;
    }

    public o0 f() {
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        return o0Var;
    }

    public p0[] g() {
        boolean z3;
        o1.l lVar = new o1.l(0, 4, true, false, 0);
        o1.i iVar = new o1.i(40, 110, true, false, 80);
        int[] iArr = new int[1];
        h hVar = this.f13852c;
        if (hVar.f13923h >= 3) {
            iArr = hVar.f13924i;
        }
        o1.h hVar2 = iArr.length > 1 ? new o1.h(iArr, true, false, true) : new o1.h(iArr, false, false, false);
        o1.m mVar = new o1.m(0, 255, 0, 7, true, false, new int[]{128, 128, 128, 128, 128, 128, 128, 128});
        h hVar3 = this.f13852c;
        o1.k kVar = new o1.k(hVar3.f13921f, hVar3.f13922g, true, false, false);
        n nVar = new n();
        kVar.Z2(nVar);
        h hVar4 = this.f13852c;
        float[][] fArr = hVar4.f13918c;
        float[][] fArr2 = hVar4.f13920e;
        o1.j jVar = new o1.j(fArr, 0, 3, true, false, 0);
        o1.j jVar2 = new o1.j(fArr2, 0, 3, true, false, 0);
        nVar.f(o0.h(jVar), f.HARMONIC_OFF.toString());
        nVar.f(o0.h(jVar2), f.HARMONIC_ON.toString());
        int i4 = this.f13852c.f13923h;
        int[] iArr2 = new int[i4];
        if (i4 > 5) {
            int i5 = 0;
            while (true) {
                h hVar5 = this.f13852c;
                if (i5 >= hVar5.f13923h) {
                    break;
                }
                int i6 = hVar5.f13924i[i5];
                if (i6 > -90 && i6 < 90) {
                    iArr2[i5] = i6;
                }
                i5++;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        return new p0[]{lVar, iVar, hVar2, mVar, kVar, new o1.g(-85.0f, 85.0f, iArr2, 0.0f, 100.0f, z3, false, false, 0.0f)};
    }

    public o0 h() {
        boolean z3 = this.f13853d;
        return (z3 || this.f13855f || this.f13857h) ? (!z3 || this.f13855f || this.f13857h) ? this.f13857h ? c() : this.f13855f ? d() : f() : e() : f();
    }

    public g0.t i() {
        float f4 = 770000.0f / this.f13850a.f13935k;
        float f5 = r1.f13936l[3] * f4;
        int i4 = this.f13856g.C;
        int[] iArr = new int[i4];
        float[] fArr = new float[i4];
        float f6 = 0.0f;
        int i5 = 0;
        while (true) {
            b bVar = this.f13856g;
            if (i5 >= bVar.C) {
                int i6 = (this.f13850a.f13930f - ((int) (((double) (f6 / f5)) + 0.5d))) - 1;
                int i7 = this.f13856g.C - 1;
                int i8 = this.f13850a.f13929e;
                return new g0.t(iArr, fArr, 0, i7, 0, i6, 0, i8 - 1, true, false, f4 * r2.f13936l[0], 0, ((i6 + 0) / 3) + 0, (i8 - 1) / 2);
            }
            iArr[i5] = bVar.D[i5];
            float f7 = r9[i5] * f4;
            fArr[i5] = f7;
            if (f7 > f6) {
                f6 = f7;
            }
            i5++;
        }
    }
}
