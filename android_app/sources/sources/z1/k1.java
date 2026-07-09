package z1;

import z1.b0;
import z1.c2;
import z1.g0;
import z1.n0;
import z1.o1;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class k1 extends i1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ boolean f13482j = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f13483c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f13484d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f13485e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f13486f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f13487g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13489i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13499j;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13508i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13509j;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13516g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13517h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13518i;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f13525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13526h;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f13527a = new int[8];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13528b;
    }

    @Override // z1.i1
    public byte[] b(d1 d1Var, String str) {
        return h(d1Var, str.equals(u5.d.HEART_BEAT.toString()));
    }

    public byte[] c(int[] iArr, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        iArr[5] = (0 - i5) & 255;
        return h7.f(iArr);
    }

    public byte[] d(d1 d1Var) {
        b0.e eVar = (b0.e) d1Var.e(n0.a.AP.toString());
        if (!eVar.flag()) {
            return null;
        }
        eVar.g0();
        return c(new int[]{85, 170, 255, 0, 16, 0, 130, 0, (byte) (eVar.d3() & 255), 0, 0, 0, 0, 0, 0, 0}, 16);
    }

    public byte[] e(d1 d1Var) {
        g0.h hVar = (g0.h) d1Var.e(n0.b.COLOR_POWER_GAIN.toString());
        g0.g gVar = (g0.g) d1Var.e(n0.b.COLOR_POWER_FOCUS.toString());
        g0.i iVar = (g0.i) d1Var.e(n0.b.COLOR_POWER_PRF.toString());
        g0.k kVar = (g0.k) d1Var.e(n0.b.COLOR_POWER_WF.toString());
        g0.j jVar = (g0.j) d1Var.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
        if (hVar == null) {
            return null;
        }
        if (!hVar.flag() && !gVar.flag() && !iVar.flag() && !kVar.flag() && !jVar.flag()) {
            return null;
        }
        this.f13486f.f13505f = hVar.k();
        if (hVar.flag()) {
            hVar.g0();
        }
        this.f13486f.f13502c = gVar.a();
        if (gVar.flag()) {
            gVar.g0();
        }
        this.f13486f.f13508i = iVar.y();
        if (iVar.flag()) {
            iVar.g0();
        }
        this.f13486f.f13509j = kVar.A2();
        if (kVar.flag()) {
            kVar.g0();
        }
        this.f13486f.f13506g = jVar.v0();
        this.f13486f.f13507h = jVar.W0();
        this.f13486f.f13500a = jVar.R0();
        this.f13486f.f13501b = (jVar.Z0() - jVar.R0()) + 1;
        this.f13486f.f13503d = jVar.o();
        if (jVar.flag()) {
            jVar.g0();
        }
        String strJ2 = ((b0.n) d1Var.e(n0.a.MODE.toString())).j2();
        if (strJ2.equals(n0.e.MODE_BC.toString())) {
            this.f13486f.f13504e = 0;
        } else if (strJ2.equals(n0.e.MODE_BP.toString())) {
            this.f13486f.f13504e = 1;
        }
        int[] iArr = new int[24];
        iArr[0] = 85;
        iArr[1] = 170;
        iArr[2] = 255;
        iArr[3] = 0;
        iArr[4] = 24;
        iArr[5] = 0;
        iArr[6] = 32;
        iArr[7] = 0;
        b bVar = this.f13486f;
        iArr[8] = bVar.f13500a / 2;
        iArr[9] = bVar.f13501b / 2;
        iArr[10] = bVar.f13502c;
        iArr[11] = bVar.f13503d;
        iArr[12] = bVar.f13504e;
        iArr[13] = bVar.f13505f;
        iArr[14] = bVar.f13508i;
        iArr[15] = bVar.f13509j;
        if (this.f13488h) {
            int i4 = this.f13489i;
            iArr[16] = (i4 - 1) - bVar.f13507h;
            iArr[17] = (i4 - 1) - bVar.f13506g;
        } else {
            iArr[16] = bVar.f13506g;
            iArr[17] = bVar.f13507h;
        }
        iArr[18] = 0;
        iArr[19] = 0;
        iArr[20] = 0;
        iArr[21] = 0;
        iArr[22] = 0;
        iArr[23] = 0;
        return c(iArr, 24);
    }

    public byte[] f(d1 d1Var) {
        c cVar;
        int iE0;
        g0.t tVar = (g0.t) d1Var.e(n0.f.PW_VOLUME.toString());
        g0.s sVar = (g0.s) d1Var.e(n0.f.PW_STEER.toString());
        g0.p pVar = (g0.p) d1Var.e(n0.f.PW_GAIN.toString());
        g0.q qVar = (g0.q) d1Var.e(n0.f.PW_PRF.toString());
        g0.m mVar = (g0.m) d1Var.e(n0.f.PW_DYNAMIC_RANGE.toString());
        if (tVar == null) {
            return null;
        }
        if (!tVar.flag() && !sVar.flag() && !pVar.flag() && !qVar.flag() && !mVar.flag()) {
            return null;
        }
        if (this.f13488h) {
            cVar = this.f13487g;
            iE0 = (this.f13489i - 1) - tVar.E0();
        } else {
            cVar = this.f13487g;
            iE0 = tVar.E0();
        }
        cVar.f13510a = iE0;
        this.f13487g.f13513d = tVar.G0(tVar.B1());
        this.f13487g.f13512c = tVar.B2();
        if (tVar.flag()) {
            tVar.g0();
        }
        this.f13487g.f13511b = sVar.o();
        if (sVar.flag()) {
            sVar.g0();
        }
        this.f13487g.f13514e = mVar.B();
        if (mVar.flag()) {
            mVar.g0();
        }
        this.f13487g.f13516g = pVar.k();
        if (pVar.flag()) {
            pVar.g0();
        }
        this.f13487g.f13517h = qVar.y();
        if (qVar.flag()) {
            qVar.g0();
        }
        c cVar2 = this.f13487g;
        return c(new int[]{85, 170, 255, 0, 24, 0, 48, 0, cVar2.f13510a, cVar2.f13511b, cVar2.f13512c / 2, cVar2.f13513d, cVar2.f13514e, cVar2.f13515f, cVar2.f13516g, cVar2.f13517h, 0, 0, 0, 0, 0, 0, 0, 0}, 24);
    }

    public byte[] g(d1 d1Var, boolean z3) {
        if (!z3) {
            a aVar = this.f13483c;
            if (aVar.f13491b <= 0 && aVar.f13493d <= 0 && aVar.f13497h <= 0 && aVar.f13495f <= 0 && aVar.f13498i <= 0) {
                return null;
            }
        }
        b0.h hVar = (b0.h) d1Var.e(n0.a.BUILD_IN_PA.toString());
        if (hVar != null) {
            this.f13483c.f13490a = hVar.b1();
            if (hVar.flag()) {
                hVar.g0();
                this.f13483c.f13491b = 8;
            }
            a aVar2 = this.f13483c;
            int i4 = aVar2.f13491b;
            if (i4 > 0) {
                aVar2.f13491b = i4 - 1;
            }
        }
        b0.n nVar = (b0.n) d1Var.e(n0.a.MODE.toString());
        if (nVar != null) {
            if (nVar.flag()) {
                nVar.g0();
                this.f13483c.f13498i = 8;
            }
            a aVar3 = this.f13483c;
            int i5 = aVar3.f13498i;
            if (i5 > 0) {
                aVar3.f13498i = i5 - 1;
            }
            String strX0 = nVar.X0();
            if (strX0.equals(n0.e.MODE_B.toString()) || strX0.equals(n0.e.MODE_BM.toString())) {
                this.f13483c.f13499j = 0;
            } else if (strX0.equals(n0.e.MODE_BC.toString())) {
                this.f13483c.f13499j = 1;
            } else if (strX0.equals(n0.e.MODE_BP.toString())) {
                this.f13483c.f13499j = 2;
            } else if (strX0.equals(n0.e.MODE_BD.toString())) {
                this.f13483c.f13499j = 3;
            }
        }
        b0.k kVar = (b0.k) d1Var.e(n0.a.LIVE.toString());
        this.f13483c.f13492c = kVar.T();
        if (kVar.flag()) {
            kVar.g0();
            this.f13483c.f13493d = 8;
        }
        a aVar4 = this.f13483c;
        int i6 = aVar4.f13493d;
        if (i6 > 0) {
            aVar4.f13493d = i6 - 1;
        }
        b0.p pVar = (b0.p) d1Var.e(n0.a.ZOOM.toString());
        this.f13483c.f13494e = pVar.A0();
        if (pVar.flag()) {
            pVar.g0();
            this.f13483c.f13495f = 8;
        }
        a aVar5 = this.f13483c;
        int i7 = aVar5.f13495f;
        if (i7 > 0) {
            aVar5.f13495f = i7 - 1;
        }
        b0.i iVar = (b0.i) d1Var.e(n0.a.GAIN.toString());
        this.f13483c.f13496g = iVar.h();
        if (iVar.flag()) {
            iVar.g0();
            this.f13483c.f13497h = 8;
        }
        a aVar6 = this.f13483c;
        int i8 = aVar6.f13497h;
        if (i8 > 0) {
            aVar6.f13497h = i8 - 1;
        }
        return c(new int[]{85, 170, 255, 0, 24, 0, 0, 0, 0, 0, 0, 0, aVar6.f13498i, aVar6.f13499j, aVar6.f13493d, aVar6.f13492c ? 1 : 0, aVar6.f13497h, aVar6.f13496g, aVar6.f13495f, aVar6.f13494e, aVar6.f13491b, aVar6.f13490a ? 1 : 0, 0, 0}, 24);
    }

    public byte[] h(d1 d1Var, boolean z3) {
        return a(a(a(a(a(a(a(g(d1Var, z3), i(d1Var)), k(d1Var)), j(d1Var)), e(d1Var)), f(d1Var)), l(d1Var)), d(d1Var));
    }

    public byte[] i(c1 c1Var) {
        o1.i iVar = (o1.i) c1Var.e(n0.c.DYNAMIC_RANGE.toString());
        o1.k kVar = (o1.k) c1Var.e(n0.c.HARMONIC.toString());
        o1.j jVar = (o1.j) c1Var.e(n0.c.FOCUS.toString());
        o1.h hVar = (o1.h) c1Var.e(n0.c.COMPOUND.toString());
        if (!iVar.flag() && !kVar.flag() && !jVar.flag() && !hVar.flag()) {
            return null;
        }
        this.f13484d.f13521c = iVar.v();
        if (iVar.flag()) {
            iVar.g0();
        }
        this.f13484d.f13519a = kVar.w0();
        if (kVar.flag()) {
            kVar.g0();
        }
        this.f13484d.f13523e = jVar.l();
        if (jVar.flag()) {
            jVar.g0();
        }
        this.f13484d.f13525g = hVar.u1();
        if (hVar.flag()) {
            hVar.g0();
        }
        d dVar = this.f13484d;
        return c(new int[]{85, 170, 255, 0, 24, 0, 16, 0, dVar.f13521c, dVar.f13525g ? 1 : 0, dVar.f13523e, dVar.f13519a ? 1 : 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 24);
    }

    public byte[] j(d1 d1Var) {
        b0.o oVar = (b0.o) d1Var.e(n0.a.TRANSDUCER.toString());
        if (!oVar.flag()) {
            return null;
        }
        int iB0 = oVar.B0();
        oVar.g0();
        return c(new int[]{85, 170, 255, 0, 12, 0, 1, 0, 1, iB0, 0, 0}, 12);
    }

    public byte[] k(c1 c1Var) {
        o1.m mVar = (o1.m) c1Var.e(n0.c.VGAIN.toString());
        if (!mVar.flag()) {
            return null;
        }
        int[] iArrP2 = mVar.P2();
        return c(new int[]{85, 170, 255, 0, 24, 0, 17, 0, iArrP2[0], iArrP2[1], iArrP2[2], iArrP2[3], iArrP2[4], iArrP2[5], iArrP2[6], iArrP2[7], 0, 0, 0, 0, 0, 0, 0, 0}, 24);
    }

    public byte[] l(d1 d1Var) {
        c2.a aVar = (c2.a) d1Var.e(n0.d.WIFI_CHANNEL.toString());
        if (!aVar.flag()) {
            return null;
        }
        int iF0 = aVar.F0();
        aVar.g0();
        return c(new int[]{85, 170, 255, 0, 16, 0, 129, 0, iF0, 0, 0, 0, 0, 0, 0, 0}, 16);
    }

    public void m(boolean z3, int i4) {
        this.f13488h = z3;
        this.f13489i = i4;
    }
}
