package z1;

import java.util.ArrayList;
import java.util.Iterator;
import z1.b0;
import z1.c2;
import z1.g0;
import z1.n0;
import z1.o1;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class j1 extends i1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13359h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13363l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f13354c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13355d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f13356e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f13357f = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13360i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13361j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13362k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13364m = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13371g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13372h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13373i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13374j;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13382h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13383i;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13389f;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13396g;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f13397a = new int[8];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13398b;
    }

    @Override // z1.i1
    public byte[] b(d1 d1Var, String str) {
        if (str.equals(u5.d.MAGNETIC_PARAMS_CONTROL.toString())) {
            return c(d1Var);
        }
        if (str.equals(u5.d.HEART_BEAT.toString())) {
            return f(d1Var, true);
        }
        return null;
    }

    public byte[] c(c1 c1Var) {
        int size;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) -91);
        arrayList.add((byte) 90);
        arrayList.add((byte) 0);
        arrayList.add((byte) 0);
        arrayList.add(Byte.valueOf(l1.f13562p));
        arrayList.add((byte) 0);
        ArrayList arrayList2 = new ArrayList();
        b0.m mVar = (b0.m) c1Var.e(n0.a.MAGNETIC_READ.toString());
        if (mVar == null || !mVar.flag()) {
            size = 0;
        } else {
            mVar.g0();
            arrayList2 = new ArrayList();
            arrayList2.add((byte) 0);
            arrayList2.add((byte) 0);
            size = arrayList2.size() + 6;
            if (mVar.d3()) {
                arrayList2.add(0, (byte) 1);
            } else {
                arrayList2.add(0, (byte) 0);
            }
            arrayList2.remove(1);
        }
        b0.l lVar = (b0.l) c1Var.e(n0.a.MAGNETIC_CALIBRATION_SET.toString());
        if (lVar != null && lVar.flag()) {
            lVar.g0();
            arrayList2.clear();
            if (lVar.g3() != null) {
                for (byte b4 : lVar.g3()) {
                    arrayList2.add(Byte.valueOf(b4));
                }
            }
            arrayList2.add(0, (byte) 0);
            arrayList2.add(0, (byte) 0);
            arrayList2.add(0, (byte) 0);
            arrayList2.add(0, (byte) 0);
            arrayList2.add(0, (byte) 0);
            size = arrayList2.size() + 6;
            arrayList.add(4, Byte.valueOf(l1.f13563q));
            arrayList.remove(5);
        }
        if (arrayList2.size() == 0) {
            return null;
        }
        arrayList.addAll(arrayList2);
        arrayList.add(2, Byte.valueOf((byte) ((65280 & size) >> 8)));
        arrayList.remove(3);
        arrayList.add(3, Byte.valueOf((byte) (size & 255)));
        arrayList.remove(4);
        Iterator it = arrayList.iterator();
        long jByteValue = 0;
        while (it.hasNext()) {
            jByteValue += (long) ((Byte) it.next()).byteValue();
        }
        arrayList.add(5, Byte.valueOf((byte) (0 - ((byte) (jByteValue & 255)))));
        arrayList.remove(6);
        byte[] bArr = new byte[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            bArr[i4] = ((Byte) arrayList.get(i4)).byteValue();
        }
        return bArr;
    }

    public byte[] d(d1 d1Var) {
        int i4 = this.f13362k + 1;
        this.f13362k = i4;
        if (i4 % 2 != 0) {
            return null;
        }
        g0.h hVar = (g0.h) d1Var.e(n0.b.COLOR_POWER_GAIN.toString());
        g0.g gVar = (g0.g) d1Var.e(n0.b.COLOR_POWER_FOCUS.toString());
        g0.i iVar = (g0.i) d1Var.e(n0.b.COLOR_POWER_PRF.toString());
        g0.k kVar = (g0.k) d1Var.e(n0.b.COLOR_POWER_WF.toString());
        g0.j jVar = (g0.j) d1Var.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
        b0.n nVar = (b0.n) d1Var.e(n0.a.MODE.toString());
        if (hVar == null) {
            return null;
        }
        if (!hVar.flag() && !gVar.flag() && !iVar.flag() && !kVar.flag() && !jVar.flag() && !nVar.flag()) {
            return null;
        }
        this.f13356e.f13370f = hVar.k();
        if (hVar.flag()) {
            hVar.g0();
        }
        this.f13356e.f13367c = gVar.a();
        if (gVar.flag()) {
            gVar.g0();
        }
        this.f13356e.f13373i = iVar.y();
        if (iVar.flag()) {
            iVar.g0();
        }
        this.f13356e.f13374j = kVar.A2();
        if (kVar.flag()) {
            kVar.g0();
        }
        this.f13356e.f13371g = jVar.v0();
        this.f13356e.f13372h = jVar.W0();
        this.f13356e.f13365a = jVar.R0();
        this.f13356e.f13366b = (jVar.Z0() - jVar.R0()) + 1;
        this.f13356e.f13368d = jVar.o();
        if (this.f13320a != null) {
            b0.o oVar = (b0.o) d1Var.e(n0.a.TRANSDUCER.toString());
            this.f13356e.f13368d = this.f13320a.a(jVar.x(jVar.o()), oVar != null ? oVar.o1() : 0);
        }
        if (jVar.flag()) {
            jVar.g0();
        }
        String strJ2 = nVar.j2();
        if (strJ2.equals(n0.e.MODE_BC.toString())) {
            this.f13356e.f13369e = 0;
        } else if (strJ2.equals(n0.e.MODE_BP.toString())) {
            this.f13356e.f13369e = 1;
        }
        byte[] bArr = new byte[16];
        bArr[0] = 88;
        bArr[1] = -123;
        bArr[2] = 0;
        bArr[3] = 0;
        a aVar = this.f13356e;
        bArr[4] = (byte) (aVar.f13365a / 2);
        bArr[5] = (byte) (aVar.f13366b / 2);
        bArr[6] = (byte) aVar.f13367c;
        bArr[7] = (byte) aVar.f13368d;
        bArr[8] = (byte) aVar.f13369e;
        bArr[9] = (byte) aVar.f13370f;
        bArr[10] = (byte) aVar.f13373i;
        bArr[11] = (byte) aVar.f13374j;
        if (this.f13358g) {
            int i5 = this.f13359h - 1;
            int i6 = i5 - aVar.f13372h;
            int i7 = i5 - aVar.f13371g;
            if (i6 < 0) {
                i6 = 0;
            }
            bArr[12] = (byte) i6;
            if (i7 <= i5) {
                i5 = i7;
            }
            bArr[13] = (byte) i5;
        } else {
            bArr[12] = (byte) aVar.f13371g;
            bArr[13] = (byte) aVar.f13372h;
        }
        bArr[14] = 0;
        bArr[15] = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            i8 += bArr[i9];
        }
        bArr[15] = (byte) ((0 - i8) & 255);
        return bArr;
    }

    public byte[] e(d1 d1Var) {
        b bVar;
        int iE0;
        int i4 = this.f13363l + 1;
        this.f13363l = i4;
        if (i4 % 2 != 0) {
            return null;
        }
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
        if (this.f13358g) {
            bVar = this.f13357f;
            iE0 = (this.f13359h - 1) - tVar.E0();
        } else {
            bVar = this.f13357f;
            iE0 = tVar.E0();
        }
        bVar.f13375a = iE0;
        this.f13357f.f13378d = tVar.G0(tVar.B1());
        this.f13357f.f13377c = tVar.B2();
        if (tVar.flag()) {
            tVar.g0();
        }
        this.f13357f.f13376b = sVar.o();
        if (this.f13320a != null) {
            b0.o oVar = (b0.o) d1Var.e(n0.a.TRANSDUCER.toString());
            this.f13356e.f13368d = this.f13320a.a(sVar.x(sVar.o()), oVar != null ? oVar.o1() : 0);
        }
        if (sVar.flag()) {
            sVar.g0();
        }
        this.f13357f.f13379e = mVar.B();
        if (mVar.flag()) {
            mVar.g0();
        }
        this.f13357f.f13381g = pVar.k();
        if (pVar.flag()) {
            pVar.g0();
        }
        this.f13357f.f13382h = qVar.y();
        if (qVar.flag()) {
            qVar.g0();
        }
        byte[] bArr = new byte[16];
        bArr[0] = 89;
        bArr[1] = -107;
        bArr[2] = 0;
        bArr[3] = 0;
        if (this.f13358g) {
            bArr[4] = (byte) ((this.f13359h - 1) - this.f13357f.f13375a);
        } else {
            bArr[4] = (byte) this.f13357f.f13375a;
        }
        b bVar2 = this.f13357f;
        bArr[5] = (byte) bVar2.f13376b;
        bArr[6] = (byte) ((bVar2.f13377c / 2) & 255);
        bArr[7] = (byte) bVar2.f13378d;
        bArr[8] = (byte) bVar2.f13379e;
        bArr[9] = (byte) bVar2.f13380f;
        bArr[10] = (byte) bVar2.f13381g;
        bArr[11] = (byte) bVar2.f13382h;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            i5 += bArr[i6];
        }
        bArr[15] = (byte) ((0 - i5) & 255);
        return bArr;
    }

    public byte[] f(d1 d1Var, boolean z3) {
        byte[] bArrA = a(a(a(a(a(h(d1Var, z3), g(d1Var)), i(d1Var)), d(d1Var)), e(d1Var)), j(d1Var));
        b0.n nVar = (b0.n) d1Var.e(n0.a.MODE.toString());
        if (nVar != null && nVar.flag()) {
            nVar.g0();
        }
        return bArrA;
    }

    public byte[] g(d1 d1Var) {
        o1.i iVar;
        boolean z3;
        int i4 = this.f13360i + 1;
        this.f13360i = i4;
        if (i4 % 2 != 0 || (iVar = (o1.i) d1Var.e(n0.c.DYNAMIC_RANGE.toString())) == null) {
            return null;
        }
        this.f13355d.f13385b = iVar.v();
        if (iVar.flag()) {
            iVar.g0();
            z3 = true;
        } else {
            z3 = false;
        }
        o1.j jVar = (o1.j) d1Var.e(n0.c.FOCUS.toString());
        this.f13355d.f13386c = jVar.l();
        if (jVar.flag()) {
            jVar.g0();
            z3 = true;
        }
        o1.h hVar = (o1.h) d1Var.e(n0.c.COMPOUND.toString());
        this.f13355d.f13387d = hVar.u1();
        if (hVar.flag()) {
            hVar.g0();
            z3 = true;
        }
        o1.k kVar = (o1.k) d1Var.e(n0.c.HARMONIC.toString());
        this.f13355d.f13384a = kVar.w0();
        if (kVar.flag()) {
            kVar.g0();
            z3 = true;
        }
        o1.g gVar = (o1.g) d1Var.e(n0.c.BIOPSY_ENHANCE.toString());
        if (gVar != null) {
            boolean zY2 = gVar.y2();
            int iI1 = (int) gVar.I1();
            if (zY2) {
                this.f13355d.f13388e = (iI1 & 127) | 128;
            } else {
                this.f13355d.f13388e = 0;
            }
            if (gVar.flag()) {
                gVar.g0();
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        byte[] bArr = new byte[16];
        bArr[0] = 95;
        bArr[1] = -11;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        c cVar = this.f13355d;
        bArr[5] = (byte) cVar.f13388e;
        bArr[6] = (byte) cVar.f13385b;
        bArr[7] = 0;
        bArr[8] = 0;
        if (cVar.f13387d) {
            bArr[8] = 1;
        }
        bArr[9] = 0;
        bArr[10] = 0;
        if (cVar.f13384a) {
            bArr[10] = 1;
        }
        bArr[11] = (byte) cVar.f13386c;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            i5 += bArr[i6];
        }
        bArr[15] = (byte) ((0 - i5) & 255);
        return bArr;
    }

    public byte[] h(d1 d1Var, boolean z3) {
        b0.n nVar;
        if (!z3 || (nVar = (b0.n) d1Var.e(n0.a.MODE.toString())) == null) {
            return null;
        }
        String strX0 = nVar.X0();
        this.f13354c.f13390a = 0;
        if (strX0.equals(n0.e.MODE_BC.toString()) || strX0.equals(n0.e.MODE_BP.toString())) {
            this.f13354c.f13390a = 2;
        } else if (strX0.equals(n0.e.MODE_BD.toString())) {
            this.f13354c.f13390a = 3;
        }
        b0.k kVar = (b0.k) d1Var.e(n0.a.LIVE.toString());
        this.f13354c.f13391b = kVar.T();
        if (kVar.flag()) {
            kVar.g0();
            this.f13354c.f13392c = 8;
        }
        b0.p pVar = (b0.p) d1Var.e(n0.a.ZOOM.toString());
        this.f13354c.f13395f = pVar.A0();
        if (pVar.flag()) {
            pVar.g0();
            this.f13354c.f13396g = 8;
        }
        b0.i iVar = (b0.i) d1Var.e(n0.a.GAIN.toString());
        this.f13354c.f13393d = iVar.h();
        if (iVar.flag()) {
            iVar.g0();
            this.f13354c.f13394e = 8;
        }
        byte[] bArr = {90, -91, 0, 0};
        byte b4 = bArr[2];
        d dVar = this.f13354c;
        byte b5 = (byte) (b4 | ((dVar.f13390a & 255) << 2));
        bArr[2] = b5;
        if (dVar.f13391b) {
            bArr[2] = (byte) (b5 | 128);
        }
        int i4 = dVar.f13392c;
        if (i4 > 0) {
            dVar.f13392c = i4 - 1;
        } else {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        byte b6 = (byte) (bArr[2] | (dVar.f13395f & 7));
        bArr[2] = b6;
        int i5 = dVar.f13396g;
        if (i5 > 0) {
            bArr[2] = (byte) (b6 | l1.f13562p);
            dVar.f13396g = i5 - 1;
        }
        byte b7 = (byte) (bArr[3] | (dVar.f13393d & 127));
        bArr[3] = b7;
        int i6 = dVar.f13394e;
        if (i6 > 0) {
            bArr[3] = (byte) (b7 | 128);
            dVar.f13394e = i6 - 1;
        }
        byte b8 = bArr[2];
        b0.h hVar = (b0.h) d1Var.e(n0.a.BUILD_IN_PA.toString());
        if (hVar != null) {
            b8 = (byte) (hVar.b1() ? b8 | l1.f13570x : b8 & 191);
        }
        bArr[2] = b8;
        return bArr;
    }

    public byte[] i(d1 d1Var) {
        int i4 = this.f13361j + 1;
        this.f13361j = i4;
        byte[] bArr = null;
        if (i4 % 5 != 0) {
            return null;
        }
        o1.m mVar = (o1.m) d1Var.e(n0.c.VGAIN.toString());
        if (mVar != null && mVar.flag()) {
            mVar.g0();
            int[] iArrP2 = mVar.P2();
            bArr = new byte[]{94, -27, 0, 0, (byte) iArrP2[0], (byte) iArrP2[1], (byte) iArrP2[2], (byte) iArrP2[3], (byte) iArrP2[4], (byte) iArrP2[5], (byte) iArrP2[6], (byte) iArrP2[7], 0, 0, 0, 0};
            int i5 = 0;
            for (int i6 = 0; i6 < 16; i6++) {
                i5 += bArr[i6];
            }
            bArr[15] = (byte) ((0 - i5) & 255);
        }
        return bArr;
    }

    public byte[] j(d1 d1Var) {
        c2.a aVar;
        int i4 = this.f13364m + 1;
        this.f13364m = i4;
        if (i4 % 4 != 0 || (aVar = (c2.a) d1Var.e(n0.d.WIFI_CHANNEL.toString())) == null || !aVar.flag()) {
            return null;
        }
        int iF0 = aVar.F0();
        aVar.g0();
        return new byte[]{92, -59, (byte) iF0, 0};
    }

    public void k(boolean z3, int i4) {
        this.f13358g = z3;
        this.f13359h = i4;
    }
}
