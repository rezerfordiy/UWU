package z1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import org.dcm4che3.data.Tag;
import z1.b0;
import z1.g0;
import z1.n0;
import z1.o1;
import z1.u1;

/* JADX INFO: loaded from: classes.dex */
public class w1 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f13998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f14000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f14002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f14004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14005j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14007b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14013h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14014i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f14016k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14017l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f14018m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f14020o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f14021p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f14022q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f14024s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14026u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f14027v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14028w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14030y;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f14008c = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f14015j = new int[16];

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int[] f14019n = new int[9];

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float[] f14023r = new float[16];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int[] f14025t = new int[16];

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int[] f14029x = new int[9];

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int[] f14031z = new int[16];
    }

    public enum b {
        FOCUS_DEFAULT("focus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14034b;

        b(String str) {
            this.f14034b = str;
        }
    }

    public enum c {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14038b;

        c(String str) {
            this.f14038b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14038b;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14043e;
    }

    public enum e {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14047b;

        e(String str) {
            this.f14047b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14047b;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14051d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f14055h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f14056i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f14057j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f14049b = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f14052e = new int[16];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f14053f = new int[4];

        public f() {
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[][] f14061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[][] f14063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f14064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f14065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f14067i;

        public g() {
            Class cls = Float.TYPE;
            this.f14061c = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f14063e = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
            this.f14067i = new int[9];
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f14068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14073f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f14078k;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f14074g = new float[8];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int[] f14075h = new int[8];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f14076i = new float[8];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f14077j = new int[256];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f14079l = new int[8];
    }

    public class i extends r0 {
        public i() {
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
                return d(b.FOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class j extends r0 {
        public j() {
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
                return d((kVar.H1() ? c.HARMONIC_ON : c.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class k extends r0 {
        public k() {
        }

        @Override // z1.r0
        public o0 g() {
            o1.k kVar = (o1.k) c(n0.c.HARMONIC.toString());
            if (kVar.f13825i) {
                return d((kVar.H1() ? e.HARMONIC_ON : e.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class l extends r0 {
        public l() {
        }

        @Override // z1.r0
        public o0 g() {
            u1.j jVar;
            b0.n nVar = (b0.n) c(n0.a.MODE.toString());
            if (!nVar.f13825i) {
                return null;
            }
            String strJ2 = nVar.j2();
            if (strJ2.equals(n0.e.MODE_B.toString()) || strJ2.equals(n0.e.MODE_BM.toString())) {
                jVar = u1.j.MODE_B;
            } else if (strJ2.equals(n0.e.MODE_BC.toString())) {
                jVar = u1.j.MODE_BC;
            } else if (strJ2.equals(n0.e.MODE_BP.toString())) {
                jVar = u1.j.MODE_BP;
            } else {
                if (!strJ2.equals(n0.e.MODE_BD.toString())) {
                    return null;
                }
                jVar = u1.j.MODE_BD;
            }
            return d(jVar.toString());
        }
    }

    public class m extends r0 {
        public m() {
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
                return d((kVar.H1() ? p.HARMONIC_ON : p.HARMONIC_OFF).toString());
            }
            return null;
        }
    }

    public class n extends r0 {
        public n() {
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
                return d(q.PWFOCUS_DEFAULT.toString());
            }
            return null;
        }
    }

    public class o extends r0 {
        public o() {
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
                return d(r.ZOOM_DEFAULT.toString());
            }
            return null;
        }
    }

    public enum p {
        HARMONIC_OFF("harmonic_off"),
        HARMONIC_ON("harmonic_on");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14090b;

        p(String str) {
            this.f14090b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14090b;
        }
    }

    public enum q {
        PWFOCUS_DEFAULT("pw_focus_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14093b;

        q(String str) {
            this.f14093b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14093b;
        }
    }

    public enum r {
        ZOOM_DEFAULT("zoom_default");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14096b;

        r(String str) {
            this.f14096b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14096b;
        }
    }

    @Override // z1.x1
    public /* bridge */ /* synthetic */ z1 a(String str) {
        return super.a(str);
    }

    public p0[] b() {
        int[] iArr;
        float[] fArr;
        h hVar = this.f13996a;
        b0.g gVar = new b0.g(hVar.f14072e, hVar.f14073f, hVar.f14068a, hVar.f14069b);
        b0.j jVar = new b0.j(this.f13996a.f14077j);
        b0.i iVar = new b0.i(30, 105, true, true, 80);
        b0.m mVar = new b0.m(true, false, true);
        mVar.g0();
        byte[] bArr = new byte[Tag.MoveDestination];
        Arrays.fill(bArr, (byte) 21);
        b0.l lVar = new b0.l(true, false, bArr);
        lVar.g0();
        float[] fArr2 = new float[4];
        System.arraycopy(this.f13996a.f14074g, 0, fArr2, 0, 4);
        int[] iArr2 = new int[4];
        System.arraycopy(this.f13996a.f14075h, 0, iArr2, 0, 4);
        float[] fArr3 = new float[4];
        System.arraycopy(this.f13996a.f14076i, 0, fArr3, 0, 4);
        h hVar2 = this.f13996a;
        float[] fArr4 = hVar2.f14076i;
        if (fArr4[5] > 0.0f) {
            fArr2 = hVar2.f14074g;
            iArr = hVar2.f14075h;
            fArr = fArr4;
        } else {
            iArr = iArr2;
            fArr = fArr3;
        }
        b0.p pVar = new b0.p(fArr2.length, fArr2, iArr, fArr, true, true, 2);
        b0.f fVar = new b0.f(this.f13996a.f14072e / 2);
        d dVar = this.f14004i;
        if (dVar != null) {
            fVar.e3(dVar.f14039a / 2);
        }
        return this.f14005j ? new p0[]{jVar, iVar, pVar, fVar, mVar, lVar} : new p0[]{gVar, jVar, iVar, pVar, fVar, mVar, lVar};
    }

    public o0 c() {
        o0 o0VarH;
        u1.j jVar;
        a aVar;
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
        l lVar = new l();
        nVar.Z2(lVar);
        if (this.f14005j) {
            int i7 = this.f14004i.f14039a;
            h hVar = this.f13996a;
            b0.g gVar = new b0.g(i7, hVar.f14073f, hVar.f14068a, hVar.f14069b);
            lVar.f(o0.h(gVar, kVar), u1.j.MODE_B.toString());
            o0VarH = o0.h(gVar, kVar);
            jVar = u1.j.MODE_BM;
        } else {
            o0VarH = o0.h(kVar);
            jVar = u1.j.MODE_B;
        }
        lVar.f(o0VarH, jVar.toString());
        o0Var.a(new g0.f(this.f14002g.f14016k));
        o0Var.a(new g0.k(0, this.f14002g.f14017l - 1, true, false, 0));
        o0Var.a(new g0.i(this.f14002g.f14015j, 0, this.f14002g.f14014i - 1, true, false, 0));
        o0Var.a(new g0.h(0, 100, true, false, 40));
        float[] fArr = new float[this.f14002g.f14018m];
        int i8 = 0;
        while (true) {
            aVar = this.f14002g;
            i4 = aVar.f14018m;
            if (i8 >= i4) {
                break;
            }
            fArr[i8] = aVar.f14019n[i8];
            i8++;
        }
        int i9 = aVar.f14009d;
        h hVar2 = this.f13996a;
        int i10 = hVar2.f14073f;
        int i11 = hVar2.f14072e;
        g0.j jVar2 = new g0.j(fArr, 0, i4 - 1, i9, i10 - 10, 0, i11 - 1, aVar.f14010e, aVar.f14011f, aVar.f14012g, aVar.f14013h, true, false, 0, (i11 / 2) - 16, (i11 / 2) + 16, (i10 / 2) - 24, (i10 / 2) + 24);
        o0Var.a(jVar2);
        i iVar = new i();
        b0.p pVar = (b0.p) o0Var.f13749a.get(n0.a.ZOOM.toString());
        jVar2.Z2(iVar);
        pVar.Z2(iVar);
        a aVar2 = this.f14002g;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, aVar2.f14007b, aVar2.f14008c.length);
        int i12 = 0;
        while (true) {
            i5 = this.f14002g.f14007b;
            if (i12 >= i5) {
                break;
            }
            fArr2[i12] = new float[]{(int) r9.f14008c[i12]};
            i12++;
        }
        g0.g gVar2 = new g0.g(fArr2, 0, i5 - 1, true, false, 0);
        gVar2.b3(true);
        iVar.f(o0.h(gVar2), b.FOCUS_DEFAULT.toString());
        g gVar3 = this.f13998c;
        o1.k kVar2 = new o1.k(gVar3.f14064f, gVar3.f14065g, true, false, false);
        if (!this.f14002g.f14020o) {
            kVar2.f13820d = true;
            kVar2.Y0(false);
        }
        if (this.f14005j) {
            int i13 = this.f14004i.f14040b;
            h hVar3 = this.f13996a;
            b0.g gVar4 = new b0.g(i13, hVar3.f14073f, hVar3.f14068a, hVar3.f14069b);
            lVar.f(o0.h(gVar4, kVar2), u1.j.MODE_BC.toString());
            o0VarH2 = o0.h(gVar4, kVar2);
        } else {
            lVar.f(o0.h(kVar2), u1.j.MODE_BC.toString());
            o0VarH2 = o0.h(kVar2);
        }
        lVar.f(o0VarH2, u1.j.MODE_BP.toString());
        j jVar3 = new j();
        kVar2.Z2(jVar3);
        pVar.Z2(jVar3);
        jVar2.Z2(jVar3);
        g gVar5 = this.f13998c;
        float[][] fArr3 = gVar5.f14061c;
        float[][] fArr4 = gVar5.f14063e;
        o1.j.f3();
        o1.j jVar4 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar4.b3(true);
        o1.j jVar5 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar5.b3(true);
        jVar3.f(o0.h(jVar4), c.HARMONIC_OFF.toString());
        jVar3.f(o0.h(jVar5), c.HARMONIC_ON.toString());
        o0Var.a(new g0.n(this.f14002g.f14027v));
        int i14 = this.f14002g.f14024s;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int i15 = 0;
        while (true) {
            a aVar3 = this.f14002g;
            if (i15 >= aVar3.f14024s) {
                break;
            }
            int[] iArr4 = aVar3.f14025t;
            iArr[i15] = iArr4[i15];
            iArr2[i15] = iArr4[i15];
            iArr3[i15] = iArr4[i15] / aVar3.f14026u;
            i15++;
        }
        o0Var.a(new g0.q(iArr, 0, this.f14002g.f14024s - 1, iArr2, iArr3, true, false, 0));
        o0Var.a(new g0.s(this.f14002g.f14029x, 0, this.f14002g.f14028w - 1, true, false, 0));
        o0Var.a(new g0.p(0, 100, true, false, 40));
        o0Var.a(new g0.l(0.0f));
        o0Var.a(new g0.r());
        o0Var.a(new g0.m(40, 100, true, false, 40));
        g gVar6 = this.f13998c;
        o1.k kVar3 = new o1.k(gVar6.f14064f, gVar6.f14065g, true, false, false);
        if (this.f14005j) {
            int i16 = this.f14004i.f14042d;
            h hVar4 = this.f13996a;
            b0.g gVar7 = new b0.g(i16, hVar4.f14073f, hVar4.f14068a, hVar4.f14069b);
            c4 = 0;
            o0VarH3 = o0.h(gVar7, kVar3);
        } else {
            c4 = 0;
            o0VarH3 = o0.h(kVar3);
        }
        lVar.f(o0VarH3, u1.j.MODE_BD.toString());
        o oVar = new o();
        pVar.Z2(oVar);
        g0.t tVarJ = j();
        p0[] p0VarArr = new p0[1];
        p0VarArr[c4] = tVarJ;
        oVar.f(o0.h(p0VarArr), r.ZOOM_DEFAULT.toString());
        n nVar2 = new n();
        tVarJ.Z2(nVar2);
        float[][] fArr5 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f14002g.f14022q, 1);
        int i17 = 0;
        while (true) {
            a aVar4 = this.f14002g;
            i6 = aVar4.f14022q;
            if (i17 >= i6) {
                break;
            }
            fArr5[i17][0] = aVar4.f14023r[i17];
            i17++;
        }
        nVar2.f(o0.h(new g0.o(fArr5, 0, i6 - 1, true, false, 0)), q.PWFOCUS_DEFAULT.toString());
        m mVar = new m();
        tVarJ.Z2(mVar);
        kVar3.Z2(mVar);
        o1.j.f3();
        o1.j jVar6 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar6.b3(true);
        o1.j jVar7 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar7.b3(true);
        mVar.f(o0.h(jVar6), p.HARMONIC_OFF.toString());
        mVar.f(o0.h(jVar7), p.HARMONIC_ON.toString());
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
        g gVar = this.f13998c;
        if (gVar.f14066h >= 3) {
            iArr = gVar.f14067i;
        }
        o1.h hVar = iArr.length > 1 ? new o1.h(iArr, true, false, true) : new o1.h(iArr, false, false, false);
        o1.m mVar = new o1.m(0, 255, 0, 7, true, false, new int[]{128, 128, 128, 128, 128, 128, 128, 128});
        g gVar2 = this.f13998c;
        o1.k kVar = new o1.k(gVar2.f14064f, gVar2.f14065g, true, false, false);
        k kVar2 = new k();
        kVar.Z2(kVar2);
        g gVar3 = this.f13998c;
        float[][] fArr = gVar3.f14061c;
        float[][] fArr2 = gVar3.f14063e;
        o1.j jVar = new o1.j(fArr, 0, 3, true, false, 0);
        o1.j jVar2 = new o1.j(fArr2, 0, 3, true, false, 0);
        kVar2.f(o0.h(jVar), e.HARMONIC_OFF.toString());
        kVar2.f(o0.h(jVar2), e.HARMONIC_ON.toString());
        int i4 = this.f13998c.f14066h;
        int[] iArr2 = new int[i4];
        if (i4 > 5) {
            int i5 = 0;
            while (true) {
                g gVar4 = this.f13998c;
                if (i5 >= gVar4.f14066h) {
                    break;
                }
                int i6 = gVar4.f14067i[i5];
                if (i6 > -90 && i6 < 90) {
                    iArr2[i5] = i6;
                }
                i5++;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        return new p0[]{lVar, iVar, hVar, mVar, kVar, new o1.g(-85.0f, 85.0f, iArr2, 0.0f, 100.0f, z3, false, false, 0.0f)};
    }

    public o0 h() {
        boolean z3 = this.f13999d;
        return (z3 || this.f14001f || this.f14003h) ? (!z3 || this.f14001f || this.f14003h) ? this.f14003h ? c() : this.f14001f ? d() : f() : e() : f();
    }

    public z1 i(String str) {
        return new z1(str, h());
    }

    public g0.t j() {
        float f4 = 770000.0f / this.f13996a.f14078k;
        float f5 = r1.f14079l[3] * f4;
        int i4 = this.f14002g.f14030y;
        int[] iArr = new int[i4];
        float[] fArr = new float[i4];
        float f6 = 0.0f;
        int i5 = 0;
        while (true) {
            a aVar = this.f14002g;
            if (i5 >= aVar.f14030y) {
                int i6 = (this.f13996a.f14073f - ((int) (((double) (f6 / f5)) + 0.5d))) - 1;
                int i7 = this.f14002g.f14030y - 1;
                int i8 = this.f13996a.f14072e;
                return new g0.t(iArr, fArr, 0, i7, 0, i6, 0, i8 - 1, true, false, f4 * r2.f14079l[0], 0, ((i6 + 0) / 3) + 0, (i8 - 1) / 2);
            }
            iArr[i5] = aVar.f14031z[i5];
            float f7 = r9[i5] * f4;
            fArr[i5] = f7;
            if (f7 > f6) {
                f6 = f7;
            }
            i5++;
        }
    }
}
