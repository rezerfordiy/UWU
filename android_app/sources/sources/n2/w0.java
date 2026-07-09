package n2;

import java.util.Date;
import n2.p1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends a1 {
    public ca A;
    public k0 B;
    public boolean E;
    public int F;
    public float H;
    public int I;
    public k C = new k();
    public a D = new a();
    public int G = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f9664a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f9665b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f9666c = new int[8];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f9667d = new byte[2];
    }

    public byte W() {
        byte b4 = this.C.b();
        if ((b4 & 128) != 0) {
            return b4;
        }
        return (byte) 0;
    }

    public boolean X() {
        return this.C.c() == 1;
    }

    public int Y() {
        return this.C.i();
    }

    public int Z() {
        return this.F;
    }

    @Override // n2.a1, n2.t.a
    public byte[] a(int i4) {
        byte[] bArrA = super.a(i4);
        byte[] bArrK0 = k0(i4);
        return r0.t(r0.t(bArrA, bArrK0), i0(i4));
    }

    public int a0() {
        return this.G;
    }

    @Override // n2.a1, n2.t.a
    public void b(byte[] bArr) {
        e1 e1Var;
        if (this.f9063j) {
            if ((this.f9066m || this.f9067n <= 0) && bArr.length == (this.f9561c.w() + 1) * 525) {
                byte[] bArrA = new byte[this.f9561c.w() * this.f9561c.E()];
                for (int i4 = 1; i4 <= this.f9561c.w(); i4++) {
                    byte[] bArr2 = new byte[512];
                    for (int i5 = 0; i5 < 512; i5++) {
                        bArr2[i5] = (byte) (bArr[(i4 * 525) + 12 + i5] & 255);
                    }
                    System.arraycopy(bArr2, 0, bArrA, (i4 - 1) * 512, 512);
                }
                ca caVar = this.A;
                if (caVar != null) {
                    bArrA = caVar.a(bArrA);
                }
                m2.d0 d0Var = new m2.d0();
                d0Var.f8788e = new Date();
                p1 p1Var = this.f9561c;
                d0Var.f8784a = p1Var.f9522b;
                d0Var.f8785b = p1Var.f9524d;
                d0Var.f8786c = p1Var.K();
                m2.u uVar = new m2.u();
                uVar.f8883a = bArrA;
                uVar.f8894l = true;
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
                uVar.f8899q = f0() ? x0().f9683s.f9697h : x0().f9683s.f9696g;
                uVar.f8897o = x0().f9683s.f9693d[c0()];
                uVar.f8895m = Z();
                uVar.f8900r = X();
                w1.g gVarY = w1.g.y();
                gVarY.L(uVar.f8895m);
                gVarY.M(a0());
                p1.a aVar2 = this.f9561c.f9527g;
                uVar.f8884b = gVarY.a(bArrA, aVar2.f9535f, aVar2.f9536g);
                d0Var.f8789f.put("b_data", uVar);
                if (this.f9564f == 1) {
                    d0Var = m2.w.a(d0Var, k());
                    e1Var = this.f9560b;
                    if (e1Var == null) {
                        return;
                    }
                } else {
                    e1Var = this.f9560b;
                    if (e1Var == null) {
                        return;
                    }
                }
                e1Var.v(d0Var);
            }
        }
    }

    public int b0() {
        return this.C.d() & 255;
    }

    public int c0() {
        return this.C.e() & 255;
    }

    @Override // n2.a1, n2.t.a
    public void d(boolean z3) {
        if (z3) {
            x0 x0Var = (x0) this.f9561c;
            boolean zQ = x0Var.Q();
            int iN = x0Var.N();
            int iP = x0Var.P();
            int iO = x0Var.O();
            boolean zM = x0Var.M();
            v0(zQ);
            o0(iN);
            s0(iP);
            p0(iO);
            n0(zM);
            for (int i4 = 0; i4 < 8; i4++) {
                w0(x0Var.R(i4), i4);
            }
        }
        super.d(z3);
    }

    public int d0() {
        return this.C.f() & 255;
    }

    public int e0() {
        return this.C.g() & 255;
    }

    public boolean f0() {
        return this.C.h() == 1;
    }

    public int g0(int i4) {
        if (i4 < 0 || i4 >= 8) {
            return 0;
        }
        return this.D.f9666c[i4];
    }

    public boolean h0() {
        return true;
    }

    public byte[] i0(int i4) {
        if (i4 % 4 != 0) {
            return null;
        }
        return s() ? this.C.k() : this.C.j();
    }

    @Override // n2.a1, n2.r0
    public void j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("harmonic")) {
                boolean z3 = Integer.parseInt(jSONObject.getString("harmonic")) == 1;
                if (h0()) {
                    v0(z3);
                } else {
                    v0(false);
                }
            }
            if (!jSONObject.isNull("dr")) {
                o0(Integer.parseInt(jSONObject.getString("dr")));
            }
            if (!jSONObject.isNull("enhance")) {
                p0(Integer.parseInt(jSONObject.getString("enhance")));
            }
            if (!jSONObject.isNull("focus")) {
                s0(Integer.parseInt(jSONObject.getString("focus")));
            }
            if (!jSONObject.isNull("compound")) {
                n0(Integer.parseInt(jSONObject.getString("compound")) > 0);
            }
            if (!jSONObject.isNull("acousticalPower")) {
                l0(Integer.parseInt(jSONObject.getString("acousticalPower")));
            }
            if (!jSONObject.isNull("ENH_VGAIN_0")) {
                this.D.f9666c[0] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_0"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_1")) {
                this.D.f9666c[1] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_1"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_2")) {
                this.D.f9666c[2] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_2"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_3")) {
                this.D.f9666c[3] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_3"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_4")) {
                this.D.f9666c[4] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_4"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_5")) {
                this.D.f9666c[5] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_5"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_6")) {
                this.D.f9666c[6] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_6"));
                this.E = true;
            }
            if (!jSONObject.isNull("ENH_VGAIN_7")) {
                this.D.f9666c[7] = Integer.parseInt(jSONObject.getString("ENH_VGAIN_7"));
                this.E = true;
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        super.j(jSONObject);
    }

    public byte[] j0(int i4) {
        if (i4 % 10 != 0 || !this.E) {
            return null;
        }
        this.E = false;
        a aVar = this.D;
        int[] iArr = aVar.f9666c;
        byte[] bArr = aVar.f9667d;
        return new byte[]{94, -27, aVar.f9664a, aVar.f9665b, (byte) (iArr[0] & 255), (byte) (iArr[1] & 255), (byte) (iArr[2] & 255), (byte) (iArr[3] & 255), (byte) (iArr[4] & 255), (byte) (iArr[5] & 255), (byte) (iArr[6] & 255), (byte) (iArr[7] & 255), (byte) (bArr[0] & 255), (byte) (bArr[1] & 255), 0, 0};
    }

    public byte[] k0(int i4) {
        if (i4 % 10 != 0 || !this.E) {
            return null;
        }
        this.E = false;
        int[] iArr = this.D.f9666c;
        byte[] bArr = {85, -86, -1, 0, (byte) 24, 0, z1.l1.f13563q, 0, (byte) (iArr[0] & 255), (byte) (iArr[1] & 255), (byte) (iArr[2] & 255), (byte) (iArr[3] & 255), (byte) (iArr[4] & 255), (byte) (iArr[5] & 255), (byte) (iArr[6] & 255), (byte) (iArr[7] & 255), 0, 0, 0, 0, 0, 0, 0, 0};
        int i5 = 0;
        for (int i6 = 0; i6 < 24; i6++) {
            i5 += bArr[i6];
        }
        bArr[5] = (byte) ((0 - i5) & 255);
        return bArr;
    }

    public void l0(int i4) {
        this.C.l((byte) (i4 & 255));
        x0().j0(i4);
    }

    public void m0(boolean z3, float f4, int i4) {
        k0 k0Var;
        if (z3 && (i4 < -76 || i4 > -50)) {
            f4 = 0.0f;
            z3 = false;
            i4 = 0;
        }
        byte b4 = z3 ? (byte) (((byte) (0 | ((i4 + 90) & 127))) | 128) : (byte) 0;
        k0 k0Var2 = this.B;
        if (k0Var2 != null) {
            k0Var2.c(z3);
        }
        this.C.m(b4);
        if (!z3 || (k0Var = this.B) == null) {
            return;
        }
        k0Var.n(f4, i4);
    }

    public void n0(boolean z3) {
        this.C.n(z3 ? (byte) 1 : (byte) 0);
        x0().k0(z3);
    }

    public void o0(int i4) {
        this.C.u(i4);
        x0().l0(i4);
    }

    public void p0(int i4) {
        if (i4 < 0 || i4 > 4) {
            return;
        }
        this.F = i4;
        x0().m0(i4);
    }

    public void q0(int i4) {
        this.G = i4;
    }

    public void r0(int i4) {
        this.C.o((byte) (i4 & 255));
    }

    public void s0(int i4) {
        this.C.p((byte) (i4 & 255));
        x0().n0(i4);
    }

    public void t0(int i4) {
        this.C.q((byte) (i4 & 255));
    }

    @Override // n2.a1, n2.r0
    public void u(boolean z3) {
        if (z3) {
            x0 x0Var = (x0) this.f9561c;
            boolean zQ = x0Var.Q();
            int iN = x0Var.N();
            int iP = x0Var.P();
            int iO = x0Var.O();
            boolean zM = x0Var.M();
            v0(zQ);
            o0(iN);
            s0(iP);
            p0(iO);
            n0(zM);
            for (int i4 = 0; i4 < 8; i4++) {
                w0(x0Var.R(i4), i4);
            }
        }
        super.u(z3);
    }

    public void u0(int i4) {
        this.C.r((byte) (i4 & 255));
    }

    @Override // n2.a1, n2.r0
    public byte[] v(int i4) {
        byte[] bArrV = super.v(i4);
        byte[] bArrJ0 = j0(i4);
        return r0.t(r0.t(bArrV, bArrJ0), i0(i4));
    }

    public void v0(boolean z3) {
        this.C.s(z3 ? (byte) 1 : (byte) 0);
        x0().o0(z3);
    }

    @Override // n2.a1, n2.r0
    public void w(byte[] bArr) {
        int i4;
        e1 e1Var;
        k0 k0Var;
        if (J() || this.f9562d.a(bArr) < 2) {
            return;
        }
        m2.d0 d0Var = new m2.d0();
        d0Var.f8788e = this.f9562d.f9502n;
        p1 p1Var = this.f9561c;
        d0Var.f8784a = p1Var.f9522b;
        d0Var.f8785b = p1Var.f9524d;
        d0Var.f8786c = p1Var.K();
        m2.u uVar = new m2.u();
        uVar.f8883a = this.f9562d.h();
        uVar.f8894l = true;
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
        uVar.f8899q = f0() ? x0().f9683s.f9697h : x0().f9683s.f9696g;
        uVar.f8897o = x0().f9683s.f9693d[c0()];
        uVar.f8895m = Z();
        uVar.f8900r = X();
        byte[] bArrC = this.f9561c.C(this.f9562d.h());
        ca caVar = this.A;
        if (caVar != null) {
            bArrC = caVar.a(bArrC);
        }
        if (this.B != null) {
            byte bD = this.f9562d.d();
            int iN = n();
            if ((bD & 8) != 0) {
                this.B.e(bArrC, (int) x0().T((byte) (bD & 7)), iN);
                bArrC = null;
            } else if ((bD & 128) != 0) {
                byte b4 = (byte) ((bD & 112) >> 4);
                bArrC = this.B.f(bArrC, b4, iN);
                uVar.f8903u = b4;
            }
        }
        if (bArrC != null) {
            uVar.f8902t = 0;
            if ((W() & 128) != 0 && (k0Var = this.B) != null && k0Var.m()) {
                uVar.f8902t = this.B.h();
            }
            p1.a aVar2 = this.f9561c.f9527g;
            int i5 = aVar2.f9535f;
            if (i5 <= 0 || (i4 = aVar2.f9536g) <= 0 || i5 * i4 != bArrC.length) {
                return;
            }
            w1.g gVarY = w1.g.y();
            gVarY.L(uVar.f8895m);
            gVarY.M(a0());
            p1.a aVar3 = this.f9561c.f9527g;
            uVar.f8884b = gVarY.a(bArrC, aVar3.f9535f, aVar3.f9536g);
            d0Var.f8789f.put("b_data", uVar);
            if (this.f9564f == 1) {
                d0Var = m2.w.a(d0Var, k());
                e1Var = this.f9560b;
                if (e1Var == null) {
                    return;
                }
            } else {
                e1Var = this.f9560b;
                if (e1Var == null) {
                    return;
                }
            }
            e1Var.v(d0Var);
        }
    }

    public void w0(int i4, int i5) {
        if (i5 < 0 || i5 >= 8) {
            return;
        }
        this.D.f9666c[i5] = i4;
        this.E = true;
        x0().p0(i4, i5);
    }

    public x0 x0() {
        return (x0) this.f9561c;
    }
}
