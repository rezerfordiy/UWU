package z1;

import z1.b0;
import z1.g0;
import z1.j1;
import z1.k1;
import z1.n0;
import z1.o1;

/* JADX INFO: loaded from: classes.dex */
public class m1 extends i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f13637m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13644i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.d f13638c = new j1.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k1.d f13639d = new k1.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k1.b f13640e = new k1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1.c f13641f = new k1.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f13642g = new byte[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13645j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f13646k = {0, 1, 3};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13647l = 0;

    public static int c() {
        return f13637m;
    }

    public static void g(int i4) {
        f13637m = i4;
    }

    @Override // z1.i1
    public byte[] b(d1 d1Var, String str) {
        byte[] bArrF = f(d1Var, this.f13645j);
        this.f13645j++;
        return bArrF;
    }

    public int d() {
        return this.f13647l;
    }

    public byte e(int i4) {
        if (i4 < 0 || i4 > 2) {
            return (byte) 0;
        }
        return this.f13646k[i4];
    }

    public byte[] f(d1 d1Var, int i4) {
        b0.n nVar = (b0.n) d1Var.e(n0.a.MODE.toString());
        if (nVar == null) {
            return null;
        }
        String strX0 = nVar.X0();
        byte[] bArr = new byte[512];
        bArr[0] = 85;
        bArr[1] = -86;
        b0.k kVar = (b0.k) d1Var.e(n0.a.LIVE.toString());
        this.f13638c.f13391b = kVar.T();
        if (kVar.flag()) {
            kVar.g0();
            this.f13638c.f13392c = 8;
        }
        if (this.f13638c.f13391b) {
            bArr[2] = 1;
        } else {
            bArr[2] = 0;
        }
        b0.p pVar = (b0.p) d1Var.e(n0.a.ZOOM.toString());
        if (pVar == null) {
            return null;
        }
        this.f13638c.f13395f = pVar.A0();
        if (pVar.flag()) {
            pVar.g0();
        }
        j1.d dVar = this.f13638c;
        dVar.f13396g = 8;
        bArr[3] = (byte) (dVar.f13395f & 255);
        b0.i iVar = (b0.i) d1Var.e(n0.a.GAIN.toString());
        if (iVar != null) {
            this.f13638c.f13393d = iVar.h();
            if (iVar.flag()) {
                iVar.g0();
                this.f13638c.f13394e = 8;
            }
        }
        bArr[4] = (byte) (Math.max(Math.min((int) ((((Math.max(Math.min(this.f13638c.f13393d, 105), 30) - 30) / 75.0f) * 127.0f) + 0.5f), 127), 0) & 255);
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 85;
        bArr[9] = -86;
        bArr[10] = 0;
        bArr[11] = 0;
        o1.i iVar2 = (o1.i) d1Var.e(n0.c.DYNAMIC_RANGE.toString());
        if (iVar2 != null) {
            this.f13639d.f13521c = iVar2.v();
            bArr[12] = (byte) (this.f13639d.f13521c & 255);
        }
        bArr[13] = 0;
        o1.h hVar = (o1.h) d1Var.e(n0.c.COMPOUND.toString());
        if (hVar != null) {
            this.f13639d.f13525g = hVar.u1();
            bArr[14] = this.f13639d.f13525g ? (byte) 1 : (byte) 0;
        }
        bArr[15] = 0;
        o1.k kVar2 = (o1.k) d1Var.e(n0.c.HARMONIC.toString());
        if (kVar2 != null) {
            this.f13639d.f13519a = kVar2.w0();
            bArr[16] = this.f13639d.f13519a ? (byte) 1 : (byte) 0;
        }
        o1.j jVar = (o1.j) d1Var.e(n0.c.FOCUS.toString());
        if (jVar != null) {
            this.f13639d.f13523e = jVar.l();
            bArr[17] = (byte) this.f13639d.f13523e;
            bArr[18] = (byte) (jVar.e() - 1);
        }
        if (this.f13639d.f13525g) {
            int i5 = i4 % 3;
            bArr[19] = e(i5);
            f13637m = this.f13647l;
            this.f13647l = e(i5);
        } else {
            bArr[19] = 0;
        }
        bArr[20] = 0;
        bArr[21] = 0;
        bArr[22] = 0;
        bArr[23] = 0;
        byte b4 = strX0.equals(n0.e.MODE_B.toString()) | strX0.equals(n0.e.MODE_BM.toString()) ? (byte) 0 : strX0.equals(n0.e.MODE_BD.toString()) | strX0.equals(n0.e.MODE_CW.toString()) ? (byte) 2 : (byte) 1;
        bArr[60] = b4;
        bArr[61] = b4;
        bArr[62] = b4;
        bArr[63] = b4;
        bArr[32] = 85;
        bArr[33] = -86;
        g0.j jVar2 = (g0.j) d1Var.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
        this.f13640e.f13506g = jVar2.v0();
        this.f13640e.f13507h = jVar2.W0();
        this.f13640e.f13500a = jVar2.R0();
        this.f13640e.f13501b = (jVar2.Z0() - jVar2.R0()) + 1;
        this.f13640e.f13503d = jVar2.o();
        k1.b bVar = this.f13640e;
        int i6 = bVar.f13500a;
        int i7 = bVar.f13501b;
        int i8 = i6 + (-4) > 0 ? i6 - 4 : 0;
        int i9 = i7 + 32;
        if (i9 >= 255) {
            i9 = 255;
        }
        bArr[34] = (byte) (i8 / 2);
        bArr[35] = (byte) (i9 / 2);
        g0.g gVar = (g0.g) d1Var.e(n0.b.COLOR_POWER_FOCUS.toString());
        if (gVar != null) {
            this.f13640e.f13502c = gVar.a();
            bArr[36] = (byte) gVar.a();
        }
        bArr[37] = (byte) this.f13640e.f13503d;
        if (strX0.equals(n0.e.MODE_BC.toString())) {
            this.f13640e.f13504e = 0;
        } else if (strX0.equals(n0.e.MODE_BP.toString())) {
            this.f13640e.f13504e = 1;
        }
        bArr[38] = (byte) this.f13640e.f13504e;
        g0.h hVar2 = (g0.h) d1Var.e(n0.b.COLOR_POWER_GAIN.toString());
        if (hVar2 != null) {
            this.f13640e.f13505f = hVar2.k();
            if (hVar2.flag()) {
                hVar2.g0();
            }
        }
        bArr[39] = (byte) this.f13640e.f13505f;
        int iU2 = ((b0.g) d1Var.e(n0.a.BASE.toString())).u2();
        if (this.f13643h) {
            int i10 = (((byte) (iU2 & 255)) & 255) - 1;
            k1.b bVar2 = this.f13640e;
            byte b5 = (byte) (i10 - (bVar2.f13507h & 255));
            byte b6 = (byte) (i10 - (bVar2.f13506g & 255));
            bArr[40] = (byte) (b5 & 255);
            bArr[41] = (byte) (b6 & 255);
        } else {
            k1.b bVar3 = this.f13640e;
            bArr[40] = (byte) bVar3.f13506g;
            bArr[41] = (byte) bVar3.f13507h;
        }
        g0.i iVar3 = (g0.i) d1Var.e(n0.b.COLOR_POWER_PRF.toString());
        if (iVar3 != null) {
            this.f13640e.f13508i = iVar3.y();
            if (iVar3.flag()) {
                iVar3.g0();
            }
        }
        bArr[42] = (byte) this.f13640e.f13508i;
        g0.k kVar3 = (g0.k) d1Var.e(n0.b.COLOR_POWER_WF.toString());
        this.f13640e.f13509j = kVar3.A2();
        if (kVar3.flag()) {
            kVar3.g0();
        }
        bArr[43] = (byte) this.f13640e.f13509j;
        bArr[64] = 85;
        bArr[65] = -86;
        g0.t tVar = (g0.t) d1Var.e(n0.f.PW_VOLUME.toString());
        g0.o oVar = (g0.o) d1Var.e(n0.f.PW_FOCUS.toString());
        g0.s sVar = (g0.s) d1Var.e(n0.f.PW_STEER.toString());
        g0.p pVar2 = (g0.p) d1Var.e(n0.f.PW_GAIN.toString());
        g0.q qVar = (g0.q) d1Var.e(n0.f.PW_PRF.toString());
        g0.m mVar = (g0.m) d1Var.e(n0.f.PW_DYNAMIC_RANGE.toString());
        if (tVar != null) {
            if (this.f13643h) {
                this.f13641f.f13510a = (this.f13644i - 1) - tVar.E0();
            } else {
                this.f13641f.f13510a = tVar.E0();
            }
            this.f13641f.f13513d = tVar.G0(tVar.B1());
            this.f13641f.f13512c = tVar.B2();
            if (tVar.flag()) {
                tVar.g0();
            }
            if (this.f13643h) {
                this.f13641f.f13510a = (this.f13644i - 1) - tVar.E0();
                bArr[66] = (byte) this.f13641f.f13510a;
            } else {
                bArr[66] = (byte) tVar.E0();
            }
            if (tVar.flag()) {
                tVar.g0();
            }
        }
        if (sVar != null) {
            this.f13641f.f13511b = sVar.o();
            if (sVar.flag()) {
                sVar.g0();
            }
        }
        k1.c cVar = this.f13641f;
        bArr[67] = (byte) cVar.f13511b;
        bArr[68] = (byte) (cVar.f13512c / 2);
        bArr[69] = (byte) cVar.f13513d;
        if (mVar != null) {
            cVar.f13514e = mVar.B();
            if (mVar.flag()) {
                mVar.g0();
            }
        }
        k1.c cVar2 = this.f13641f;
        bArr[70] = (byte) cVar2.f13514e;
        if (oVar != null) {
            cVar2.f13515f = oVar.a();
            if (oVar.flag()) {
                oVar.g0();
            }
        }
        k1.c cVar3 = this.f13641f;
        bArr[71] = (byte) cVar3.f13515f;
        if (pVar2 != null) {
            cVar3.f13516g = pVar2.k();
            if (pVar2.flag()) {
                pVar2.g0();
            }
        }
        k1.c cVar4 = this.f13641f;
        bArr[72] = (byte) cVar4.f13516g;
        if (qVar != null) {
            cVar4.f13517h = qVar.y();
            if (qVar.flag()) {
                qVar.g0();
            }
        }
        bArr[73] = (byte) this.f13641f.f13517h;
        o1.m mVar2 = (o1.m) d1Var.e(n0.c.VGAIN.toString());
        int[] iArrP2 = new int[8];
        if (mVar2 != null) {
            iArrP2 = mVar2.P2();
        }
        float[] fArr = new float[128];
        int i11 = 0;
        int i12 = 0;
        while (i11 < 7) {
            float f4 = iArrP2[i11];
            i11++;
            float f5 = (iArrP2[i11] - f4) / 18.0f;
            for (int i13 = 0; i13 < 18; i13++) {
                float f6 = (i13 * f5) + f4;
                if (f6 > 255.0f) {
                    f6 = 255.0f;
                } else if (f6 < 0.0d) {
                    f6 = 0.0f;
                }
                fArr[i12] = f6;
                i12++;
            }
        }
        while (i12 < 128) {
            fArr[i12] = iArrP2[7];
            i12++;
        }
        float[] fArr2 = new float[128];
        for (int i14 = 0; i14 < 2; i14++) {
            for (int i15 = 0; i15 < 128; i15++) {
                fArr2[i15] = fArr[i15];
            }
            int i16 = 1;
            while (i16 < 127) {
                int i17 = i16 + 1;
                fArr[i16] = ((fArr2[i16 - 1] + fArr2[i16]) + fArr2[i17]) / 3.0f;
                i16 = i17;
            }
        }
        for (int i18 = 0; i18 < 128; i18++) {
            this.f13642g[i18] = (byte) (((int) fArr[i18]) & 255);
        }
        for (int i19 = 0; i19 < 128; i19++) {
            bArr[i19 + 128] = this.f13642g[i19];
        }
        return bArr;
    }

    public void h(int i4) {
        this.f13647l = i4;
    }
}
