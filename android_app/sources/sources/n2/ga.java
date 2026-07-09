package n2;

import java.util.Arrays;
import java.util.Date;
import n2.p1;
import o2.b;

/* JADX INFO: loaded from: classes.dex */
public class ga extends h0 {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ boolean f9287u0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f9304s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f9305t0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f9288c0 = 128;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f9289d0 = 32;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f9290e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f9291f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public byte f9292g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public byte f9293h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f9294i0 = false;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f9295j0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ma f9297l0 = null;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f9298m0 = false;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f9299n0 = 2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f9300o0 = 80;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public byte[] f9301p0 = new byte[128];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f9302q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f9303r0 = 512;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public a f9296k0 = new a();

    public class a implements b.InterfaceC0091b {
        public a() {
        }

        @Override // o2.b.InterfaceC0091b
        public void c() {
            ga.this.i();
            o2.b.g(null).d(ga.this.f9296k0);
            ga.this.u(false);
        }

        @Override // o2.b.InterfaceC0091b
        public void d() {
        }
    }

    public ga() {
        o2.b.g(null).l(this.f9296k0);
    }

    @Override // n2.a1, n2.r0
    public void A(boolean z3) {
        this.f9298m0 = z3;
        ma maVar = this.f9297l0;
        if (maVar != null) {
            maVar.b(z3);
        }
        x(null);
    }

    @Override // n2.h0, n2.a1, n2.r0
    public void D(int i4) {
        if (i4 >= 0) {
            p1 p1Var = this.f9561c;
            if (i4 > p1Var.f9527g.f9538i.length - 1) {
                return;
            }
            this.f9299n0 = i4;
            p1Var.I(i4);
        }
    }

    @Override // n2.a1, n2.r0
    public void E() {
        boolean z3 = !this.f9298m0;
        this.f9298m0 = z3;
        this.f9297l0.b(z3);
        x(null);
    }

    public void M1(boolean z3, int i4) {
        this.f9304s0 = z3;
        this.f9305t0 = i4;
    }

    public final byte N1(byte b4) {
        int[] iArr = {0, 7, 12, 16, 20, 25, 30, 35};
        int i4 = 0;
        if ((b4 & 128) == 0) {
            return (byte) 0;
        }
        int i5 = b4 & 127;
        int i6 = i5 - iArr[0];
        for (int i7 = 1; i7 < 6; i7++) {
            int i8 = i5 - iArr[i7];
            if (i8 < 0) {
                i8 = -i8;
            }
            if (i8 < i6) {
                i4 = i7;
                i6 = i8;
            }
        }
        return (byte) (i4 & 255);
    }

    public String O1() {
        String strK = o2.b.k();
        if (strK == null || strK.isEmpty() || strK.length() < 10) {
            return s0.a.f11071l;
        }
        for (char c4 : strK.substring(0, 7).toCharArray()) {
            if (c4 < 'A' || c4 > 'Z') {
                return s0.a.f11071l;
            }
        }
        try {
            int i4 = Integer.parseInt(strK.substring(7));
            return (i4 > 999) | (i4 < 0) ? s0.a.f11071l : strK;
        } catch (Exception unused) {
            return s0.a.f11071l;
        }
    }

    public void P1(int i4, int i5) {
        this.f9288c0 = i4;
        this.f9289d0 = i5;
    }

    public void Q1(String str) {
        this.f9297l0.u(e1.a(str));
    }

    public ja R1() {
        return (ja) this.f9561c;
    }

    @Override // n2.a1, n2.r0
    public void e() {
        if (this.f9297l0 == null) {
            ma maVar = new ma(this);
            this.f9297l0 = maVar;
            maVar.o();
        }
    }

    @Override // n2.a1, n2.r0
    public void f() {
        ma maVar = this.f9297l0;
        if (maVar != null) {
            maVar.o();
        }
    }

    @Override // n2.h0, n2.a1, n2.r0
    public void g() {
        int i4 = this.f9300o0;
        if (i4 > 30) {
            this.f9300o0 = i4 - 1;
        }
        z(this.f9300o0);
    }

    @Override // n2.a1, n2.r0
    public void h() {
        D(this.f9299n0 - 1);
    }

    @Override // n2.a1, n2.r0
    public void i() {
        ma maVar = this.f9297l0;
        if (maVar != null) {
            maVar.t();
        }
    }

    @Override // n2.h0, n2.a1, n2.r0
    public int l() {
        return this.f9300o0;
    }

    @Override // n2.a1, n2.r0
    public int n() {
        return this.f9299n0;
    }

    @Override // n2.h0, n2.a1, n2.r0
    public void o() {
        int i4 = this.f9300o0;
        if (i4 < 105) {
            this.f9300o0 = i4 + 1;
        }
        z(this.f9300o0);
    }

    @Override // n2.a1, n2.r0
    public void p() {
        D(this.f9299n0 + 1);
    }

    @Override // n2.a1, n2.r0
    public boolean q() {
        ma maVar = this.f9297l0;
        if (maVar != null) {
            return maVar.j();
        }
        return false;
    }

    @Override // n2.a1, n2.r0
    public boolean r() {
        return this.f9298m0;
    }

    @Override // n2.h0, n2.w0, n2.a1, n2.r0
    public void u(boolean z3) {
        super.u(z3);
    }

    @Override // n2.h0, n2.w0, n2.a1, n2.r0
    public byte[] v(int i4) {
        ma maVar;
        int i5;
        int iM = m();
        if (iM == 0 || iM == 1) {
            maVar = this.f9297l0;
            i5 = this.f9288c0;
        } else {
            maVar = this.f9297l0;
            i5 = this.f9288c0 + this.f9289d0;
        }
        maVar.r(i5);
        this.f9297l0.s(((ja) this.f9561c).b2(iM, f0()));
        byte[] bArr = new byte[512];
        bArr[0] = 85;
        bArr[1] = -86;
        byte b4 = 2;
        if (r()) {
            bArr[2] = 1;
        } else {
            bArr[2] = 0;
        }
        bArr[3] = (byte) (n() & 255);
        bArr[4] = (byte) (Math.max(Math.min((int) ((((Math.max(Math.min(l(), 105), 30) - 30) / 75.0f) * 127.0f) + 0.5f), 127), 0) & 255);
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 85;
        bArr[9] = -86;
        bArr[10] = this.C.g();
        bArr[11] = 0;
        bArr[12] = (byte) (this.C.i() & 255);
        bArr[13] = this.C.f();
        bArr[14] = this.C.c();
        bArr[15] = this.C.a();
        bArr[16] = this.C.h();
        bArr[17] = this.C.e();
        bArr[18] = this.C.d();
        if (m() == 7 && !((ja) this.f9561c).c2()) {
            bArr[19] = 0;
            this.f9290e0 = 0;
        } else if (m() != 0 || (this.C.b() & 128) == 0) {
            if (this.C.c() != 0) {
                int i6 = i4 % 3;
                bArr[19] = R1().a2(i6);
                bArr[20] = 0;
                this.f9290e0 = this.f9291f0;
                this.f9291f0 = L1().W(i6);
            } else {
                bArr[19] = 0;
                bArr[20] = 0;
                this.f9290e0 = 0;
            }
            this.f9294i0 = false;
        } else {
            int i7 = i4 % 2;
            this.f9290e0 = this.f9291f0;
            if (i7 == 0) {
                bArr[19] = 0;
                this.f9291f0 = 0;
                this.f9294i0 = true;
                bArr[20] = 0;
            } else {
                bArr[19] = 7;
                this.f9291f0 = 7;
                this.f9294i0 = false;
                byte b5 = this.C.b();
                this.f9292g0 = this.f9293h0;
                byte bN1 = N1(b5);
                this.f9293h0 = bN1;
                bArr[20] = bN1;
            }
        }
        bArr[20] = 0;
        bArr[21] = 0;
        bArr[22] = 0;
        bArr[23] = 0;
        if (m() == 0 || m() == 1) {
            b4 = 0;
        } else if (m() != 7) {
            b4 = 1;
        }
        bArr[60] = b4;
        bArr[61] = b4;
        bArr[62] = b4;
        bArr[63] = b4;
        bArr[32] = 85;
        bArr[33] = -86;
        int iH = this.K.h() & 255;
        byte bJ = this.K.j();
        int i8 = iH + (-4) > 0 ? iH - 4 : 0;
        int i9 = bJ + 32;
        if (i9 >= 255) {
            i9 = 255;
        }
        bArr[34] = (byte) i8;
        bArr[35] = (byte) i9;
        bArr[36] = this.K.b();
        bArr[37] = this.K.i();
        bArr[38] = this.K.f();
        bArr[39] = (byte) (this.K.c() + 30);
        if (this.f9304s0) {
            int i10 = (((byte) (this.f9305t0 & 255)) & 255) - 1;
            byte bD = (byte) (i10 - (this.K.d() & 255));
            byte bE = (byte) (i10 - (this.K.e() & 255));
            bArr[40] = (byte) (bD & 255);
            bArr[41] = (byte) (bE & 255);
        } else {
            bArr[40] = this.K.e();
            bArr[41] = this.K.d();
        }
        bArr[42] = this.K.g();
        bArr[43] = this.K.k();
        bArr[64] = 85;
        bArr[65] = -86;
        if (this.f9304s0) {
            bArr[66] = (byte) ((((byte) this.f9305t0) - 1) - this.L.e());
        } else {
            bArr[66] = this.L.e();
        }
        bArr[67] = this.L.h();
        bArr[68] = this.L.g();
        bArr[69] = this.L.i();
        bArr[70] = this.L.b();
        bArr[71] = this.L.c();
        bArr[72] = (byte) (this.L.d() + 30);
        bArr[73] = this.L.f();
        for (int i11 = 0; i11 < 128; i11++) {
            bArr[i11 + 128] = this.f9301p0[i11];
        }
        return bArr;
    }

    @Override // n2.h0, n2.w0, n2.a1, n2.r0
    public void w(byte[] bArr) {
        byte[] bArr2;
        m2.d0 d0Var;
        k0 k0Var;
        int i4;
        e1 e1Var;
        if (this.f9298m0) {
            int i5 = this.f9288c0;
            if (i5 * 512 > bArr.length) {
                return;
            }
            int i6 = i5 * 512;
            byte[] bArrG = new byte[i6];
            int iH = 0;
            System.arraycopy(bArr, 0, bArrG, 0, i6);
            int i7 = i6 + 0;
            byte[] bArr3 = null;
            if (bArr.length > i7) {
                int i8 = this.f9289d0 * 512;
                bArr2 = new byte[i8];
                System.arraycopy(bArr, i7, bArr2, 0, i8);
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                int i9 = 0;
                while (i9 < 32) {
                    int i10 = i9 * 512;
                    i9++;
                    Arrays.copyOfRange(bArr2, i10, i9 * 512);
                }
            }
            ca caVar = this.A;
            if (caVar != null) {
                bArrG = caVar.a(bArrG);
            }
            m2.u uVar = new m2.u();
            uVar.f8883a = bArrG;
            int iM = m();
            if ((iM == 7 ? ((ja) this.f9561c).c2() : true) && this.B != null) {
                if (this.f9294i0) {
                    this.B.e(bArrG, (int) x0().T(this.f9292g0), this.f9299n0);
                } else {
                    if (this.C.c() != 0) {
                        int i11 = this.f9290e0;
                        bArrG = this.B.g(bArrG, i11, n());
                        uVar.f8903u = i11;
                    }
                    bArr3 = bArrG;
                }
                if (bArr3 == null) {
                    return;
                } else {
                    bArrG = bArr3;
                }
            }
            if (iM == 0 || iM == 1) {
                if (bArr2 != null) {
                    return;
                }
                d0Var = new m2.d0();
                if ((W() & 128) != 0 && (k0Var = this.B) != null && k0Var.m()) {
                    iH = this.B.h();
                }
            } else {
                if (bArr2 == null) {
                    return;
                }
                if (5 == m()) {
                    d0Var = h1(bArr2, bArrG);
                } else if (6 == m()) {
                    d0Var = j1(bArr2, bArrG);
                } else if (7 != m()) {
                    return;
                } else {
                    d0Var = i1(bArr2);
                }
            }
            p1 p1VarM0 = ((i0) this.f9561c).M0();
            if (p1VarM0 == null) {
                p1VarM0 = this.f9561c;
            }
            d0Var.f8788e = new Date();
            d0Var.f8784a = p1VarM0.f9522b;
            d0Var.f8785b = p1VarM0.f9524d;
            d0Var.f8786c = this.f9561c.K();
            uVar.f8894l = true;
            uVar.f8902t = iH;
            uVar.f8885c = this.f9561c.w();
            uVar.f8886d = this.f9561c.E();
            p1.a aVar = this.f9561c.f9527g;
            uVar.f8889g = aVar.f9531b;
            uVar.f8890h = aVar.f9532c;
            uVar.f8893k = aVar.f9539j;
            uVar.f8892j = l();
            uVar.f8887e = this.f9561c.f9527g.f9537h[n()];
            uVar.f8891i = this.f9561c.f9527g.f9538i[n()];
            uVar.f8888f = this.f9561c.F(n());
            uVar.f8896n = Y();
            uVar.f8898p = f0();
            uVar.f8897o = x0().f9683s.f9693d[c0()];
            uVar.f8895m = Z();
            uVar.f8900r = X();
            uVar.f8899q = f0() ? x0().f9683s.f9697h : x0().f9683s.f9696g;
            p1.a aVar2 = p1VarM0.f9527g;
            int i12 = aVar2.f9535f;
            if (i12 <= 0 || (i4 = aVar2.f9536g) <= 0 || i12 * i4 != bArrG.length) {
                return;
            }
            w1.g gVarY = w1.g.y();
            gVarY.L(uVar.f8895m);
            gVarY.M(a0());
            p1.a aVar3 = p1VarM0.f9527g;
            uVar.f8884b = gVarY.a(bArrG, aVar3.f9535f, aVar3.f9536g);
            d0Var.f8789f.put("b_data", uVar);
            if (this.f9564f != 1) {
                e1 e1Var2 = this.f9560b;
                if (e1Var2 == null || !this.f9298m0) {
                    return;
                }
                e1Var2.v(d0Var);
                return;
            }
            m2.w wVarA = m2.w.a(d0Var, k());
            if (wVarA == null || (e1Var = this.f9560b) == null || !this.f9298m0) {
                return;
            }
            e1Var.v(wVarA);
        }
    }

    @Override // n2.w0
    public void w0(int i4, int i5) {
        super.w0(i4, i5);
        float[] fArr = new float[128];
        int i6 = 0;
        int i7 = 0;
        while (i6 < 7) {
            float f4 = this.D.f9666c[i6];
            i6++;
            float f5 = (r3[i6] - f4) / 18.0f;
            for (int i8 = 0; i8 < 18; i8++) {
                float f6 = (i8 * f5) + f4;
                if (f6 > 255.0f) {
                    f6 = 255.0f;
                } else if (f6 < 0.0d) {
                    f6 = 0.0f;
                }
                fArr[i7] = f6;
                i7++;
            }
        }
        while (i7 < 128) {
            fArr[i7] = this.D.f9666c[7];
            i7++;
        }
        float[] fArr2 = new float[128];
        for (int i9 = 0; i9 < 2; i9++) {
            for (int i10 = 0; i10 < 128; i10++) {
                fArr2[i10] = fArr[i10];
            }
            int i11 = 1;
            while (i11 < 127) {
                int i12 = i11 + 1;
                fArr[i11] = ((fArr2[i11 - 1] + fArr2[i11]) + fArr2[i12]) / 3.0f;
                i11 = i12;
            }
        }
        for (int i13 = 0; i13 < 128; i13++) {
            this.f9301p0[i13] = (byte) (((int) fArr[i13]) & 255);
        }
    }

    @Override // n2.h0, n2.a1, n2.r0
    public void x(byte[] bArr) {
        if (bArr != null) {
            byte b4 = (bArr[0] == 90 && bArr[1] == -91) ? bArr[2] : (byte) 0;
            if (b4 != 1 || this.f9298m0) {
                if (b4 == 2 && this.f9298m0) {
                    this.f9302q0 = true;
                    A(false);
                }
            } else if (this.f9302q0) {
                this.f9302q0 = false;
            } else {
                A(true);
            }
        }
        e1 e1Var = this.f9560b;
        if (e1Var != null) {
            e1Var.w(this.f9298m0);
        }
    }

    @Override // n2.h0, n2.a1, n2.r0
    public void z(int i4) {
        if (i4 >= 30 && i4 <= 105) {
            this.f9300o0 = i4;
        }
        this.f9561c.H(i4);
    }
}
