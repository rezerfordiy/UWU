package n2;

import n2.p1;
import n2.x0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends w0 {
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 0;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f9330a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ boolean f9331b0 = false;
    public f J;
    public e K = new e();
    public g L = new g();
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;

    public int A0() {
        int iC = this.K.c() & 255;
        if (iC < 0) {
            return 0;
        }
        if (iC > 100) {
            return 100;
        }
        return iC;
    }

    public void A1(int i4) {
        this.K.w((byte) (i4 & 255));
        L1().Q1(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    @Override // n2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(int r7) {
        /*
            r6 = this;
            n2.p1 r0 = r6.f9561c
            n2.i0 r0 = (n2.i0) r0
            r1 = 0
            if (r7 == 0) goto L4f
            r2 = 1
            r3 = 0
            if (r7 == r2) goto L47
            r4 = 5
            r5 = 2
            if (r7 == r4) goto L32
            r4 = 6
            if (r7 == r4) goto L25
            r2 = 7
            if (r7 == r2) goto L16
            goto L53
        L16:
            r6.f9564f = r7
            r7 = 3
            r6.M = r7
            n2.i0$a r7 = r0.A
            boolean r7 = r7.A
            if (r7 != 0) goto L4b
            r6.v0(r1)
            goto L4b
        L25:
            r6.f9564f = r7
            r6.M = r5
            r6.N = r2
            n2.i0$a r7 = r0.A
            boolean r7 = r7.f9369p
            if (r7 != 0) goto L41
            goto L3e
        L32:
            r6.f9564f = r7
            r6.M = r5
            r6.N = r1
            n2.i0$a r7 = r0.A
            boolean r7 = r7.f9369p
            if (r7 != 0) goto L41
        L3e:
            r6.v0(r1)
        L41:
            int r7 = r6.N
            r6.v1(r7)
            goto L4b
        L47:
            r6.f9564f = r7
            r6.M = r1
        L4b:
            r6.m0(r1, r3, r1)
            goto L53
        L4f:
            r6.f9564f = r7
            r6.M = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.B(int):void");
    }

    public synchronized int B0() {
        return this.K.d() & 255;
    }

    public void B1(int i4) {
        this.L.x(i4);
        L1().R1(i4);
    }

    public synchronized int C0() {
        return this.K.e() & 255;
    }

    public void C1(int i4) {
        this.L.n((byte) (i4 & 255));
        L1().S1(i4);
    }

    @Override // n2.a1, n2.r0
    public void D(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 3) {
            i4 = 3;
        }
        super.D(i4);
        this.S = i4;
        this.R = 8;
    }

    public int D0() {
        return this.K.f() & 255;
    }

    public void D1(int i4) {
        this.L.o((byte) (i4 & 255));
        L1().T1(i4);
    }

    public int E0() {
        return L1().T0(F0());
    }

    public void E1(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 100) {
            i4 = 100;
        }
        this.L.p((byte) (i4 & 255));
        L1().U1(i4);
    }

    public int F0() {
        return this.K.g() & 255;
    }

    public void F1(int i4) {
        if (i4 < 0) {
            return;
        }
        if (i4 >= this.f9561c.w()) {
            i4 = this.f9561c.w() - 1;
        }
        this.L.q((byte) (i4 & 255));
        L1().V1(i4);
    }

    public int G0() {
        return (this.K.h() & 255) * 2;
    }

    public void G1(int i4) {
        if (i4 >= T0() - 1) {
            i4 = T0() - 1;
        }
        this.L.r((byte) (i4 & 255));
        L1().W1(i4);
    }

    public int H0() {
        return L1().V0(I0());
    }

    public void H1(int i4) {
        if (i4 < 20) {
            i4 = 20;
        } else if (i4 > (this.f9561c.E() - 1) - 16) {
            i4 = (this.f9561c.E() - 1) - 16;
        }
        this.L.s((byte) ((i4 / 2) & 255));
        L1().X1(i4);
        int iB1 = b1();
        D1(p1(i4, iB1));
        K1(q1(i4, iB1));
    }

    public int I0() {
        return this.K.i() & 255;
    }

    public void I1(int i4) {
        if (i4 >= L1().e1()) {
            i4 = 0;
        }
        this.L.t((byte) (i4 & 255));
        L1().Y1(i4);
    }

    public int J0() {
        return L1().W0();
    }

    public void J1(int i4) {
        if (i4 < 0 || i4 >= L1().h1()) {
            return;
        }
        L1().Z1(i4);
        this.L.v((byte) (i4 & 255));
        this.L.u((byte) (L1().g1(i4) & 255));
        int iB1 = b1();
        int iU0 = U0();
        D1(p1(iU0, iB1));
        K1(q1(iU0, iB1));
    }

    public int K0() {
        return (this.K.j() & 255) * 2;
    }

    public void K1(int i4) {
        this.C.p((byte) (i4 & 255));
    }

    public int L0() {
        return this.K.k() & 255;
    }

    public i0 L1() {
        return (i0) this.f9561c;
    }

    @Override // n2.a1
    public byte[] M(int i4) {
        return s() ? m1(i4) : y0(i4);
    }

    public int M0() {
        return L1().X0();
    }

    public int N0() {
        return this.L.k();
    }

    public int O0() {
        return this.L.c() & 255;
    }

    public int P0() {
        int iD = this.L.d() & 255;
        if (iD < 0) {
            return 0;
        }
        if (iD > 100) {
            return 100;
        }
        return iD;
    }

    public int Q0() {
        return this.L.e() & 255;
    }

    public int R0() {
        return L1().b1(S0());
    }

    @Override // n2.a1
    public void S(boolean z3) {
        super.S(z3);
    }

    public int S0() {
        return this.L.f() & 255;
    }

    public int T0() {
        return L1().c1();
    }

    public int U0() {
        return (this.L.g() & 255) * 2;
    }

    public int V0() {
        return L1().d1(X0());
    }

    public int W0(int i4) {
        return L1().d1(i4);
    }

    public int X0() {
        return this.L.h() & 255;
    }

    public int Y0() {
        return L1().e1();
    }

    public int Z0() {
        return R0();
    }

    @Override // n2.w0, n2.a1, n2.t.a
    public byte[] a(int i4) {
        byte[] bArrA = super.a(i4);
        byte[] bArrF1 = f1(i4);
        return r0.t(r0.t(bArrA, bArrF1), g1(i4));
    }

    public int a1() {
        return L1().g1(c1());
    }

    @Override // n2.w0, n2.a1, n2.t.a
    public void b(byte[] bArr) {
        int iA;
        m2.d0 d0Var;
        p1.a aVar;
        int i4;
        int i5;
        e1 e1Var;
        if (J() || (iA = this.f9562d.a(bArr)) < 2) {
            return;
        }
        byte[] bArrH = this.f9562d.h();
        byte[] bArrI = this.f9562d.i();
        ca caVar = this.A;
        if (caVar != null) {
            bArrH = caVar.a(bArrH);
        }
        int iM = m();
        m2.u uVar = new m2.u();
        uVar.f8883a = bArrH;
        if (this.B != null) {
            byte bD = this.f9562d.d();
            int iN = n();
            if ((bD & 8) != 0) {
                this.B.e(bArrH, (int) x0().T((byte) (bD & 7)), iN);
                bArrH = null;
            } else if ((bD & 128) != 0) {
                int iW = L1().W(L1().K0(bD));
                bArrH = this.B.g(bArrH, iW, iN);
                uVar.f8903u = iW;
            }
        }
        if (iM == 0 || iM == 1) {
            if (iA == 3) {
                return;
            } else {
                d0Var = new m2.d0();
            }
        } else {
            if (bArrI == null) {
                return;
            }
            if (5 == m()) {
                d0Var = h1(bArrI, bArrH);
            } else if (6 == m()) {
                d0Var = j1(bArrI, bArrH);
            } else if (7 != m()) {
                return;
            } else {
                d0Var = i1(bArrI);
            }
        }
        i0 i0Var = (i0) this.f9561c;
        p1 p1VarM0 = i0Var.M0();
        if (p1VarM0 == null) {
            p1VarM0 = this.f9561c;
        }
        d0Var.f8788e = this.f9562d.f9502n;
        d0Var.f8784a = p1VarM0.f9522b;
        d0Var.f8785b = p1VarM0.f9524d;
        d0Var.f8786c = this.f9561c.K();
        uVar.f8894l = true;
        uVar.f8885c = this.f9561c.w();
        uVar.f8886d = this.f9561c.E();
        p1.a aVar2 = this.f9561c.f9527g;
        uVar.f8889g = aVar2.f9531b;
        uVar.f8890h = aVar2.f9532c;
        uVar.f8893k = aVar2.f9539j;
        uVar.f8892j = l();
        uVar.f8887e = this.f9561c.f9527g.f9537h[n()];
        uVar.f8891i = this.f9561c.f9527g.f9538i[n()];
        uVar.f8888f = this.f9561c.F(n());
        uVar.f8896n = Y();
        uVar.f8898p = f0();
        boolean zF0 = f0();
        x0.a aVar3 = i0Var.f9683s;
        uVar.f8899q = zF0 ? aVar3.f9697h : aVar3.f9696g;
        uVar.f8897o = x0().f9683s.f9693d[c0()];
        uVar.f8895m = Z();
        uVar.f8900r = X();
        if (bArrH == null || (i4 = (aVar = p1VarM0.f9527g).f9535f) <= 0 || (i5 = aVar.f9536g) <= 0 || i4 * i5 != bArrH.length) {
            return;
        }
        w1.g gVarY = w1.g.y();
        gVarY.L(uVar.f8895m);
        gVarY.M(a0());
        p1.a aVar4 = p1VarM0.f9527g;
        uVar.f8884b = gVarY.a(bArrH, aVar4.f9535f, aVar4.f9536g);
        d0Var.f8789f.put("b_data", uVar);
        if (this.f9564f == 1) {
            d0Var = m2.w.a(d0Var, k());
            if (d0Var == null || (e1Var = this.f9560b) == null) {
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

    public int b1() {
        int i4 = this.L.i() & 255;
        int i5 = this.f9561c.f9527g.f9541l[n()];
        if (i5 == 0) {
            return 1;
        }
        return (i4 + (i5 / 2)) / i5;
    }

    @Override // n2.a1, n2.t.a
    public void c(byte[] bArr) {
        super.c(bArr);
        if (s()) {
            k1(bArr);
        } else {
            l1(bArr);
        }
        if (bArr.length == 512) {
            this.Q = (byte) (bArr[11] & 127);
        }
    }

    public int c1() {
        return this.L.j() & 255;
    }

    @Override // n2.w0, n2.a1, n2.t.a
    public void d(boolean z3) {
        if (z3) {
            int iX0 = L1().x0();
            int iZ0 = L1().z0();
            int iU0 = L1().u0();
            int iT0 = L1().t0();
            int iS0 = L1().s0();
            int iY0 = L1().y0();
            int iR0 = L1().r0();
            int iV0 = L1().v0();
            int iA0 = L1().A0();
            x1(iX0, iZ0);
            u1(iU0, iT0);
            t1(iS0);
            z1(iY0);
            s1(iR0);
            w1(iV0);
            A1(iA0);
            int iH0 = L1().H0();
            int iJ0 = L1().J0();
            int iF0 = L1().F0();
            int iI0 = L1().I0();
            int iE0 = L1().E0();
            int iB0 = L1().B0();
            int iC0 = L1().C0();
            int iD0 = L1().D0();
            int iG0 = L1().G0();
            H1(iH0);
            J1(iJ0);
            I1(iI0);
            F1(iF0);
            E1(iE0);
            B1(iB0);
            C1(iC0);
            D1(iD0);
            G1(iG0);
        }
        super.d(z3);
    }

    public int d1() {
        return L1().h1();
    }

    public int e1() {
        return L1().j1(S0());
    }

    public byte[] f1(int i4) {
        if (i4 % 5 != 0) {
            return null;
        }
        if (((i0) this.f9561c).F1()) {
            this.K.a(true, this.f9561c.w());
        } else {
            this.K.a(false, 0);
        }
        return s() ? this.K.m() : this.K.l();
    }

    @Override // n2.a1, n2.r0
    public void g() {
        int i4 = this.P;
        if (i4 > 30) {
            z(i4 - 1);
        }
    }

    public byte[] g1(int i4) {
        if (i4 % 5 != 0) {
            return null;
        }
        if (((i0) this.f9561c).F1()) {
            this.L.a(true, this.f9561c.w());
        } else {
            this.L.a(false, 0);
        }
        return s() ? this.L.m() : this.L.l();
    }

    @Override // n2.w0
    public boolean h0() {
        i0 i0Var = (i0) this.f9561c;
        int i4 = this.f9564f;
        if (i4 == 5 || i4 == 6) {
            return i0Var.A.f9369p;
        }
        if (i4 == 7) {
            return i0Var.A.A;
        }
        return true;
    }

    public m2.d0 h1(byte[] bArr, byte[] bArr2) {
        m2.d0 d0Var = new m2.d0();
        int iC0 = C0();
        int iB0 = B0();
        ca caVar = this.A;
        if (caVar != null) {
            bArr = caVar.b(bArr, iC0, iB0);
        }
        m2.y yVar = new m2.y();
        yVar.f8919f = G0();
        yVar.f8920g = G0() + K0();
        yVar.f8925l = L1().O0();
        yVar.f8922i = A0();
        yVar.f8926m = L0();
        yVar.f8924k = E0();
        yVar.f8923j = new float[]{L1().Q0(z0())};
        yVar.f8917d = C0();
        yVar.f8918e = B0();
        yVar.f8919f = G0();
        yVar.f8920g = G0() + K0();
        yVar.f8921h = H0();
        yVar.f8915b = this.J.x(bArr, bArr2, yVar.f8917d, yVar.f8918e, yVar.f8919f, yVar.f8920g, F0());
        yVar.f8916c = bArr;
        d0Var.f8789f.put("color_data", yVar);
        return d0Var;
    }

    public m2.d0 i1(byte[] bArr) {
        m2.d0 d0Var = new m2.d0();
        m2.b0 b0Var = new m2.b0();
        b0Var.f8719j = L1().Y0();
        b0Var.f8718i = R0();
        b0Var.f8723n = R0();
        b0Var.f8725p = e1();
        b0Var.f8717h = new float[]{((i0) this.f9561c).A.f9371r[O0()]};
        b0Var.f8711b = V0();
        b0Var.f8716g = P0();
        b0Var.f8721l = Y();
        int iU0 = U0();
        b0Var.f8713d = iU0;
        b0Var.f8714e = iU0 + b1();
        b0Var.f8715f = (((b1() / L1().f9527g.a(n())) * 1560.0f) / 2.0f) * 1000.0f;
        b0Var.f8712c = Q0();
        b0Var.f8722m = bArr;
        b0Var.f8720k = N0();
        b0Var.f8724o = n1(bArr);
        int length = ((bArr.length / 512) - 8) * 512;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 4096, bArr2, 0, length);
        b0Var.f8726q = bArr2;
        d0Var.f8789f.put("pw_data", b0Var);
        return d0Var;
    }

    @Override // n2.w0, n2.a1, n2.r0
    public void j(JSONObject jSONObject) {
        String str;
        int iU0;
        int iT0;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.isNull("bc_darkPassFilter")) {
                str = "COLOR_BD_STEER_INDEX";
            } else {
                str = "COLOR_BD_STEER_INDEX";
                if (Integer.parseInt(jSONObject.getString("bc_darkPassFilter")) == 1) {
                    r1(true, -1);
                } else {
                    r1(false, -1);
                }
            }
            if (!jSONObject.isNull("bc_simplify")) {
                if (Integer.parseInt(jSONObject.getString("bc_simplify")) == 1) {
                    y1(true);
                } else {
                    y1(false);
                }
            }
            if (!jSONObject.isNull("bc_PRF")) {
                w1(Integer.parseInt(jSONObject.getString("bc_PRF")));
            }
            if (!jSONObject.isNull("bd_PRF")) {
                G1(Integer.parseInt(jSONObject.getString("bd_PRF")));
            }
            if (!jSONObject.isNull("bc_WF")) {
                A1(Integer.parseInt(jSONObject.getString("bc_WF")));
            }
            if (!jSONObject.isNull("COLOR_BC_VOLUME") && !jSONObject.isNull("COLOR_BC_START_POINT")) {
                x1(Integer.parseInt(jSONObject.getString("COLOR_BC_START_POINT")), Integer.parseInt(jSONObject.getString("COLOR_BC_VOLUME")));
            }
            if (!jSONObject.isNull("bc_gain")) {
                t1(Integer.parseInt(jSONObject.getString("bc_gain")));
            }
            if (!jSONObject.isNull("COLOR_BC_FOCUS_POS")) {
                s1(Integer.parseInt(jSONObject.getString("COLOR_BC_FOCUS_POS")));
            }
            if (jSONObject.isNull("COLOR_BC_LINE_START") || jSONObject.isNull("COLOR_BC_LINE_END")) {
                iU0 = L1().u0();
                iT0 = L1().t0();
            } else {
                iU0 = Integer.parseInt(jSONObject.getString("COLOR_BC_LINE_START"));
                iT0 = Integer.parseInt(jSONObject.getString("COLOR_BC_LINE_END"));
                if (iT0 - iU0 > L1().A.f9362i - 4) {
                    iU0 = (L1().w() / 2) - ((L1().A.f9362i / 2) - 2);
                    iT0 = (L1().w() / 2) + ((L1().A.f9362i / 2) - 2);
                }
            }
            u1(iU0, iT0);
            if (!jSONObject.isNull("COLOR_BC_STEER_INDEX")) {
                z1(Integer.parseInt(jSONObject.getString("COLOR_BC_STEER_INDEX")));
            }
            String str2 = str;
            if (!jSONObject.isNull(str2)) {
                I1(Integer.parseInt(jSONObject.getString(str2)));
            }
            if (!jSONObject.isNull("COLOR_BD_START_POINT")) {
                H1(Integer.parseInt(jSONObject.getString("COLOR_BD_START_POINT")));
            }
            F1(!jSONObject.isNull("COLOR_BD_LINE_POS") ? Integer.parseInt(jSONObject.getString("COLOR_BD_LINE_POS")) : L1().F0());
            if (!jSONObject.isNull("COLOR_BD_GAIN")) {
                E1(Integer.parseInt(jSONObject.getString("COLOR_BD_GAIN")));
            }
            if (!jSONObject.isNull("bd_angle")) {
                B1(Integer.parseInt(jSONObject.getString("bd_angle")));
            }
            if (!jSONObject.isNull("COLOR_BD_DYNAMIC_RANGE")) {
                C1(Integer.parseInt(jSONObject.getString("COLOR_BD_DYNAMIC_RANGE")));
            }
            if (!jSONObject.isNull("COLOR_BD_FOCUS_POS")) {
                D1(Integer.parseInt(jSONObject.getString("COLOR_BD_FOCUS_POS")));
            }
            if (!jSONObject.isNull("COLOR_BD_VOLUME_INDEX")) {
                J1(Integer.parseInt(jSONObject.getString("COLOR_BD_VOLUME_INDEX")));
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        super.j(jSONObject);
    }

    public m2.d0 j1(byte[] bArr, byte[] bArr2) {
        m2.d0 d0Var = new m2.d0();
        int iC0 = C0();
        int iB0 = B0();
        ca caVar = this.A;
        if (caVar != null) {
            bArr = caVar.b(bArr, iC0, iB0);
        }
        m2.c0 c0Var = new m2.c0();
        c0Var.f8735i = A0();
        c0Var.f8738l = L0();
        c0Var.f8737k = E0();
        c0Var.f8735i = A0();
        c0Var.f8736j = new float[]{L1().Q0(z0())};
        c0Var.f8730d = C0();
        c0Var.f8731e = B0();
        c0Var.f8732f = G0();
        c0Var.f8733g = G0() + K0();
        c0Var.f8734h = H0();
        c0Var.f8728b = this.J.z(bArr, bArr2, c0Var.f8730d, c0Var.f8731e, c0Var.f8732f, c0Var.f8733g, F0());
        c0Var.f8729c = bArr;
        d0Var.f8789f.put("power_data", c0Var);
        return d0Var;
    }

    public void k1(byte[] bArr) {
        if (bArr.length == 512) {
            byte[] bArr2 = new byte[bArr.length];
            byte[] bArr3 = new byte[256];
            System.arraycopy(bArr, 256, bArr3, 0, 256);
            if (bArr3[0] == 85) {
                byte b4 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    b4 = (byte) (b4 + bArr3[i4]);
                }
                if (b4 == 0 && (bArr3[6] & 255) == 161) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("SAVE_BUTTON", "CLICKED");
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                    e1 e1Var = this.f9560b;
                    if (e1Var != null) {
                        e1Var.y(jSONObject.toString());
                    }
                }
            }
        }
    }

    @Override // n2.a1, n2.r0
    public int l() {
        return this.Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l1(byte[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 8
            if (r0 >= r1) goto L6
            return
        L6:
            r0 = 0
            r2 = r0
        L8:
            int r3 = r8.length
            int r3 = r3 - r1
            r4 = 255(0xff, float:3.57E-43)
            if (r2 > r3) goto L34
            int r3 = r2 + 0
            r5 = r8[r3]
            r5 = r5 & r4
            r6 = 85
            if (r5 != r6) goto L31
            int r5 = r2 + 1
            r5 = r8[r5]
            r5 = r5 & r4
            r6 = 170(0xaa, float:2.38E-43)
            if (r5 != r6) goto L31
            int r5 = r2 + 2
            r5 = r8[r5]
            r5 = r5 & r4
            if (r5 != r4) goto L31
            int r5 = r2 + 3
            r5 = r8[r5]
            r5 = r5 & r4
            if (r5 != 0) goto L31
            if (r2 <= 0) goto L34
            goto L35
        L31:
            int r2 = r2 + 1
            goto L8
        L34:
            r3 = r0
        L35:
            int r1 = r8.length
            int r1 = r1 - r3
            byte[] r2 = new byte[r1]
        L39:
            if (r0 >= r1) goto L44
            int r5 = r0 + r3
            r5 = r8[r5]
            r2[r0] = r5
            int r0 = r0 + 1
            goto L39
        L44:
            int r0 = r8.length
            int r0 = r0 - r3
            r1 = 4
            if (r0 <= r1) goto L4c
            r0 = r2[r1]
            goto L4f
        L4c:
            r0 = 999999(0xf423f, float:1.401297E-39)
        L4f:
            int r8 = r8.length
            int r8 = r8 - r3
            if (r8 < r0) goto L77
            r8 = 6
            r8 = r2[r8]
            r8 = r8 & r4
            r0 = 161(0xa1, float:2.26E-43)
            if (r8 != r0) goto L77
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r0 = "SAVE_BUTTON"
            java.lang.String r1 = "CLICKED"
            r8.put(r0, r1)     // Catch: org.json.JSONException -> L68
            goto L6c
        L68:
            r0 = move-exception
            r0.printStackTrace()
        L6c:
            n2.e1 r0 = r7.f9560b
            if (r0 == 0) goto L77
            java.lang.String r8 = r8.toString()
            r0.y(r8)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.l1(byte[]):void");
    }

    @Override // n2.r0
    public int m() {
        return this.f9564f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m1(int r9) {
        /*
            r8 = this;
            byte[] r9 = super.M(r9)
            if (r9 != 0) goto L8
            r9 = 0
            return r9
        L8:
            int r0 = r8.f9564f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r2
        L11:
            if (r0 != r1) goto L15
            r4 = r1
            goto L16
        L15:
            r4 = r2
        L16:
            r3 = r3 | r4
            r4 = 3
            r5 = 5
            if (r3 == 0) goto L1d
        L1b:
            r0 = r2
            goto L2a
        L1d:
            if (r0 != r5) goto L21
            r0 = r1
            goto L2a
        L21:
            r3 = 6
            if (r0 != r3) goto L26
            r0 = 2
            goto L2a
        L26:
            r3 = 7
            if (r0 != r3) goto L1b
            r0 = r4
        L2a:
            int r3 = r8.O
            if (r3 <= 0) goto L32
            int r3 = r3 - r1
            r8.O = r3
            goto L40
        L32:
            int r3 = r8.P
            int r6 = r8.Q
            if (r3 == r6) goto L3f
            r8.P = r6
            n2.p1 r3 = r8.f9561c
            r3.H(r6)
        L3f:
            r3 = r2
        L40:
            int r6 = r8.R
            if (r6 <= 0) goto L48
            int r6 = r6 - r1
            r8.R = r6
            goto L58
        L48:
            int r6 = r8.n()
            int r7 = r8.S
            if (r7 == r6) goto L57
            r8.S = r6
            n2.p1 r7 = r8.f9561c
            r7.I(r6)
        L57:
            r6 = r2
        L58:
            r7 = 12
            r9[r7] = r1
            r1 = 13
            byte r0 = (byte) r0
            r9[r1] = r0
            r0 = 16
            byte r1 = (byte) r3
            r9[r0] = r1
            int r0 = r8.P
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 17
            r9[r1] = r0
            r0 = 18
            byte r1 = (byte) r6
            r9[r0] = r1
            int r0 = r8.S
            r0 = r0 & r4
            byte r0 = (byte) r0
            r1 = 19
            r9[r1] = r0
            r9[r5] = r2
            r0 = r2
            r1 = r0
        L80:
            int r3 = r9.length
            if (r0 >= r3) goto L89
            r3 = r9[r0]
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L80
        L89:
            int r2 = r2 - r1
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r5] = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.m1(int):byte[]");
    }

    public byte[] n1(byte[] bArr) {
        boolean z3;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[4096];
        System.arraycopy(bArr, 0, bArr2, 0, 4096);
        byte[] bArr3 = new byte[4096];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 8;
            if (i4 >= 8) {
                int i7 = i5 * 512;
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr3, 0, bArr4, 0, i7);
                return bArr4;
            }
            while (true) {
                if (i6 >= 24) {
                    z3 = true;
                    break;
                }
                if (bArr2[(i4 * 512) + i6] != -1) {
                    z3 = false;
                    break;
                }
                i6++;
            }
            if (!z3) {
                System.arraycopy(bArr2, i4 * 512, bArr3, i5 * 512, 512);
                i5++;
            }
            i4++;
        }
    }

    @Override // n2.a1, n2.r0
    public void o() {
        int i4 = this.P;
        if (i4 < 105) {
            z(i4 + 1);
        }
    }

    public int o1(int i4, int i5) {
        float fG = (i4 + (i5 / 2)) * this.f9561c.G(n());
        int iP0 = L1().P0();
        float f4 = 1000000.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < iP0; i7++) {
            float fAbs = Math.abs(L1().Q0(i7) - fG);
            if (fAbs < f4) {
                i6 = i7;
                f4 = fAbs;
            }
        }
        return i6;
    }

    public int p1(int i4, int i5) {
        float fG = (i4 + (i5 / 2)) * this.f9561c.G(n());
        int iZ0 = L1().Z0();
        float f4 = 1000000.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < iZ0; i7++) {
            float fA1 = L1().a1(i7) - fG;
            if (fA1 < 0.0f) {
                fA1 = -fA1;
            }
            if (fA1 < f4) {
                i6 = i7;
                f4 = fA1;
            }
        }
        return i6;
    }

    public int q1(int i4, int i5) {
        float fG = (i4 + (i5 / 2)) * this.f9561c.G(n());
        int iY = L1().Y();
        int iX = L1().X();
        float f4 = 1000000.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < iY; i7++) {
            float fZ = 0.0f;
            for (int i8 = 0; i8 < iX; i8++) {
                fZ += L1().Z(i7, i8);
            }
            float f5 = (fZ / iX) - fG;
            if (f5 < 0.0f) {
                f5 = -f5;
            }
            if (f5 < f4) {
                i6 = i7;
                f4 = f5;
            }
        }
        return i6;
    }

    public void r1(boolean z3, int i4) {
        this.J.d(z3, i4);
    }

    public void s1(int i4) {
        this.K.n((byte) (i4 & 255));
        L1().I1(i4);
    }

    public void t1(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 100) {
            i4 = 100;
        }
        this.K.o((byte) (i4 & 255));
        L1().J1(i4);
    }

    @Override // n2.w0, n2.a1, n2.r0
    public void u(boolean z3) {
        if (z3) {
            int iX0 = L1().x0();
            int iZ0 = L1().z0();
            int iU0 = L1().u0();
            int iT0 = L1().t0();
            int iS0 = L1().s0();
            int iY0 = L1().y0();
            int iR0 = L1().r0();
            int iV0 = L1().v0();
            int iA0 = L1().A0();
            x1(iX0, iZ0);
            u1(iU0, iT0);
            t1(iS0);
            z1(iY0);
            s1(iR0);
            w1(iV0);
            A1(iA0);
            int iH0 = L1().H0();
            int iJ0 = L1().J0();
            int iF0 = L1().F0();
            int iI0 = L1().I0();
            int iE0 = L1().E0();
            int iB0 = L1().B0();
            int iC0 = L1().C0();
            int iD0 = L1().D0();
            L1().G0();
            H1(iH0);
            J1(iJ0);
            I1(iI0);
            F1(iF0);
            E1(iE0);
            B1(iB0);
            C1(iC0);
            D1(iD0);
        }
        super.u(z3);
    }

    public synchronized void u1(int i4, int i5) {
        if (i5 > i4) {
            i5 = i4;
            i4 = i5;
        }
        int i6 = i4 - i5;
        if (i6 < L1().A.f9361h) {
            return;
        }
        if (i6 > L1().A.f9362i - 4) {
            int i7 = i6 - (L1().A.f9362i - 4);
            i4 -= i7 / 2;
            i5 += i7 / 2;
        }
        if (i5 < 0) {
            return;
        }
        if (i4 >= this.f9561c.f9527g.f9535f - 1) {
            return;
        }
        this.K.q((byte) (i5 & 255));
        this.K.p((byte) (i4 & 255));
        L1().L1(i5);
        L1().K1(i4);
    }

    @Override // n2.w0, n2.a1, n2.r0
    public byte[] v(int i4) {
        byte[] bArrV = super.v(i4);
        byte[] bArrF1 = f1(i4);
        return r0.t(r0.t(bArrV, bArrF1), g1(i4));
    }

    public void v1(int i4) {
        this.K.r((byte) (i4 & 255));
    }

    @Override // n2.w0, n2.a1, n2.r0
    public void w(byte[] bArr) {
        int iA;
        m2.d0 d0Var;
        k0 k0Var;
        e1 e1Var;
        if (J() || (iA = this.f9562d.a(bArr)) < 2) {
            return;
        }
        byte bD = this.f9562d.d();
        byte[] bArrH = this.f9562d.h();
        byte[] bArrI = this.f9562d.i();
        ca caVar = this.A;
        if (caVar != null) {
            bArrH = caVar.a(bArrH);
        }
        int iM = m();
        m2.u uVar = new m2.u();
        uVar.f8883a = bArrH;
        int iH = 0;
        uVar.f8900r = false;
        if (this.B != null) {
            if ((bD & 128) != 0) {
                int iW = L1().W(L1().K0(bD));
                bArrH = this.B.g(bArrH, iW, n());
                uVar.f8903u = iW;
                uVar.f8900r = true;
            }
            if (bArrH == null) {
                return;
            }
        }
        if (iM == 0 || iM == 1) {
            if (iA == 3) {
                return;
            }
            d0Var = new m2.d0();
            if ((W() & 128) != 0 && (k0Var = this.B) != null && k0Var.m()) {
                iH = this.B.h();
            }
        } else {
            if (bArrI == null) {
                return;
            }
            if (5 == m()) {
                if (B0() <= this.f9561c.w()) {
                    d0Var = h1(bArrI, bArrH);
                }
                int iB0 = (B0() - C0()) / 2;
                u1((this.f9561c.w() / 2) - iB0, (this.f9561c.w() / 2) + iB0);
                return;
            }
            if (6 == m()) {
                if (B0() <= this.f9561c.w()) {
                    d0Var = j1(bArrI, bArrH);
                }
                int iB02 = (B0() - C0()) / 2;
                u1((this.f9561c.w() / 2) - iB02, (this.f9561c.w() / 2) + iB02);
                return;
            }
            if (7 != m()) {
                return;
            } else {
                d0Var = i1(this.f9562d.j());
            }
        }
        if (bArrH.length == 0) {
            return;
        }
        i0 i0Var = (i0) this.f9561c;
        p1 p1VarM0 = i0Var.M0();
        if (p1VarM0 == null) {
            p1VarM0 = this.f9561c;
        }
        d0Var.f8788e = this.f9562d.f9502n;
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
        boolean zF0 = f0();
        x0.a aVar2 = i0Var.f9683s;
        uVar.f8899q = zF0 ? aVar2.f9697h : aVar2.f9696g;
        uVar.f8897o = x0().f9683s.f9693d[c0()];
        uVar.f8895m = Z();
        uVar.f8900r = X();
        w1.g gVarY = w1.g.y();
        gVarY.L(uVar.f8895m);
        gVarY.M(a0());
        p1.a aVar3 = p1VarM0.f9527g;
        uVar.f8884b = gVarY.a(bArrH, aVar3.f9535f, aVar3.f9536g);
        d0Var.f8789f.put("b_data", uVar);
        if (this.f9564f == 1) {
            d0Var = m2.w.a(d0Var, k());
            if (d0Var == null || (e1Var = this.f9560b) == null) {
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

    public void w1(int i4) {
        this.K.s((byte) (i4 & 255));
        L1().G1(i4);
    }

    @Override // n2.a1, n2.r0
    public void x(byte[] bArr) {
        super.x(bArr);
        l1(bArr);
        if (bArr.length >= 4 && bArr[0] == 90 && bArr[1] == -91) {
            this.Q = bArr[3] & 127;
        }
    }

    public void x1(int i4, int i5) {
        int iN0 = L1().N0();
        int iS0 = L1().S0();
        int iR0 = L1().R0();
        if (i4 < iN0) {
            i4 = iN0;
        }
        if (i5 < iS0) {
            i5 = iS0;
        } else if (i5 > iR0) {
            i5 = iR0;
        }
        if (i4 + i5 >= this.f9561c.f9527g.f9536g) {
            return;
        }
        this.K.t((byte) ((i4 / 2) & 255));
        this.K.v((byte) ((i5 / 2) & 255));
        s1(o1(i4, i5));
        K1(q1(i4, i5));
        L1().N1(i4);
        L1().P1(i5);
    }

    public byte[] y0(int i4) {
        byte[] bArrM = super.M(i4);
        if (bArrM != null && bArrM.length >= 4) {
            int i5 = this.f9564f;
            byte b4 = (byte) ((((i5 == 5 || i5 == 6) ? 2 : i5 != 7 ? 0 : 3) << 2) | bArrM[2]);
            bArrM[2] = b4;
            byte b5 = (byte) (b4 & (-20));
            bArrM[2] = b5;
            bArrM[2] = (byte) (b5 | (this.S & 3));
            bArrM[3] = 0;
            int i6 = this.P;
            byte b6 = (byte) ((i6 & 127) | 0);
            bArrM[3] = b6;
            int i7 = this.O;
            if (i7 > 0) {
                this.O = i7 - 1;
                bArrM[3] = (byte) (b6 | 128);
            } else {
                int i8 = this.Q;
                if (i6 != i8) {
                    this.P = i8;
                    this.f9561c.H(i8);
                }
            }
            int i9 = this.R;
            if (i9 > 0) {
                this.R = i9 - 1;
                bArrM[2] = (byte) (bArrM[2] | z1.l1.f13562p);
            } else {
                int iN = n();
                if (this.S != iN) {
                    this.S = iN;
                    this.f9561c.I(iN);
                }
            }
        }
        return bArrM;
    }

    public void y1(boolean z3) {
        z0 z0Var;
        String strK;
        String str;
        this.J.f9225a = z3;
        if (z3) {
            z0Var = p1.f9515l;
            strK = this.f9561c.K();
            str = "1";
        } else {
            z0Var = p1.f9515l;
            strK = this.f9561c.K();
            str = "0";
        }
        z0Var.a(strK, "bc_simplify", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // n2.a1, n2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r2) {
        /*
            r1 = this;
            r0 = 30
            if (r2 >= r0) goto L6
        L4:
            r2 = r0
            goto Lb
        L6:
            r0 = 105(0x69, float:1.47E-43)
            if (r2 <= r0) goto Lb
            goto L4
        Lb:
            super.z(r2)
            r1.P = r2
            r2 = 8
            r1.O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.z(int):void");
    }

    public int z0() {
        return this.K.b() & 255;
    }

    public void z1(int i4) {
        if (i4 >= L1().W0()) {
            i4 = 0;
        }
        this.K.u((byte) (i4 & 255));
        L1().O1(i4);
    }
}
