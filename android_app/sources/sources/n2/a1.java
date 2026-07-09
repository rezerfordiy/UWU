package n2;

import java.util.Date;
import n2.p1;
import n2.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends r0 implements t.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9070q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9075v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9079z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f9062i = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9071r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9072s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9073t = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9076w = false;

    @Override // n2.r0
    public void A(boolean z3) {
        this.f9066m = z3;
        this.f9067n = 8;
    }

    @Override // n2.r0
    public void C(int i4) {
        p1 p1Var = this.f9561c;
        if (p1Var == null) {
            return;
        }
        if (i4 <= 0 || i4 > 13) {
            if (!p1Var.k()) {
                return;
            }
            if (i4 == 40 || i4 == 44 || i4 == 48 || i4 == 149 || i4 == 153 || i4 == 157 || i4 == 161 || i4 == 165) {
                this.f9070q = i4;
            }
            if (!s() || i4 != 36) {
                return;
            }
        }
        this.f9070q = i4;
    }

    @Override // n2.r0
    public void D(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 3) {
            i4 = 3;
        }
        this.f9069p = i4;
        this.f9561c.I(i4);
    }

    @Override // n2.r0
    public void E() {
        A(!this.f9063j);
    }

    public final byte[] F(int i4) {
        byte[] bArr = {90, -91, 0, 0};
        int i5 = this.f9067n;
        if (i5 > 0) {
            this.f9067n = i5 - 1;
        } else {
            this.f9066m = this.f9063j;
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.f9066m) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        bArr[2] = (byte) (bArr[2] | ((byte) (this.f9069p & 3)));
        bArr[3] = (byte) ((((int) ((((((double) this.f9068o) - 30.0d) / 75.0d) * 127.0d) + 0.5d)) & 127) | bArr[3]);
        if (!this.f9561c.f9523c.startsWith("SS-6H ") && !this.f9561c.f9523c.startsWith("US-1H ")) {
            return bArr;
        }
        byte[] bArr2 = new byte[8];
        for (int i6 = 0; i6 < 4; i6++) {
            bArr2[i6] = bArr[i6];
            bArr2[4] = (byte) (bArr2[4] | (this.f9069p & 255));
        }
        return bArr2;
    }

    public final byte[] G(int i4) {
        int i5 = this.f9070q;
        if (i5 <= 0) {
            return null;
        }
        byte[] bArr = {92, -59, (byte) i5, (byte) i5};
        p1 p1Var = this.f9561c;
        if (p1Var != null && p1Var.k()) {
            bArr[3] = 0;
        }
        this.f9070q = 0;
        return bArr;
    }

    public void H(boolean z3) {
        if (s()) {
            if (z3) {
                this.f9074u = 1;
            } else {
                this.f9074u = 0;
            }
            this.f9075v = true;
        }
    }

    public void I(boolean z3) {
        if (s()) {
            if (z3) {
                this.f9077x = 1;
            } else {
                this.f9077x = 0;
            }
            this.f9076w = true;
        }
    }

    public boolean J() {
        if (this.f9063j) {
            return this.f9067n > 0 && !this.f9066m;
        }
        return true;
    }

    public byte[] K(int i4) {
        if (!this.f9079z) {
            return null;
        }
        this.f9079z = false;
        int[] iArr = {85, 170, 255, 0, 16, 0, 130, 0, (byte) (this.f9078y & 255), 0, 0, 0, 0, 0, 0, 0};
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            i5 += iArr[i6];
        }
        iArr[5] = (0 - i5) & 255;
        return r.b(iArr);
    }

    public byte[] L(int i4) {
        if (!this.f9075v) {
            return null;
        }
        this.f9075v = false;
        int[] iArr = {85, 170, 255, 0, 16, 0, 132, 0, (byte) (this.f9074u & 255), 0, 0, 0, 0, 0, 0, 0};
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            i5 += iArr[i6];
        }
        iArr[5] = (0 - i5) & 255;
        return r.b(iArr);
    }

    public byte[] M(int i4) {
        return s() ? Q(i4) : F(i4);
    }

    public byte[] N(int i4) {
        int i5 = this.f9073t;
        if (i5 < 0) {
            return null;
        }
        int[] iArr = {85, 170, 255, 0, 16, 0, 133, 0, (byte) (i5 & 255), 0, 0, 0, 0, 0, 0, 0};
        int i6 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            i6 += iArr[i7];
        }
        iArr[5] = (0 - i6) & 255;
        byte[] bArrB = r.b(iArr);
        this.f9073t = -1;
        return bArrB;
    }

    public byte[] O(int i4) {
        if (!this.f9076w) {
            return null;
        }
        this.f9076w = false;
        int[] iArr = {85, 170, 255, 0, 16, 0, 242, 0, (byte) (this.f9077x & 255), 0, 0, 0, 0, 0, 0, 0};
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            i5 += iArr[i6];
        }
        iArr[5] = (0 - i5) & 255;
        return r.b(iArr);
    }

    public byte[] P(int i4) {
        return s() ? R(i4) : G(i4);
    }

    public final byte[] Q(int i4) {
        int i5 = this.f9067n;
        if (i5 <= 0 && i4 % 2 != 0) {
            return null;
        }
        if (i5 > 0) {
            this.f9067n = i5 - 1;
        } else {
            this.f9066m = this.f9063j;
        }
        int[] iArr = {85, 170, 255, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, this.f9067n & 255, (this.f9066m ? 1 : 0) & 255, 1, this.f9068o & 255, 1, this.f9069p & 3 & 255, 0, 0, 0, 0};
        int i6 = 0;
        for (int i7 = 0; i7 < 24; i7++) {
            i6 += iArr[i7];
        }
        iArr[5] = (0 - i6) & 255;
        return r.b(iArr);
    }

    public final byte[] R(int i4) {
        int i5 = this.f9070q;
        if (i5 <= 0) {
            return null;
        }
        this.f9070q = 0;
        int[] iArr = {85, 170, 255, 0, 16, 0, 129, 0, i5, 0, 0, 0, 0, 0, 0, 0};
        int i6 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            i6 += iArr[i7];
        }
        iArr[5] = (0 - i6) & 255;
        return r.b(iArr);
    }

    public void S(boolean z3) {
    }

    public void T(int i4) {
        if (s()) {
            this.f9078y = i4;
            this.f9079z = true;
        }
    }

    public void U(u0 u0Var) {
        this.f9062i = u0Var;
        this.f9071r = u0Var.g().equals("NT");
    }

    public void V(int i4) {
        this.f9073t = i4;
    }

    @Override // n2.t.a
    public byte[] a(int i4) {
        byte[] bArrP = P(i4);
        byte[] bArrM = M(i4);
        byte[] bArrN = N(i4);
        byte[] bArrL = L(i4);
        return r0.t(K(i4), r0.t(O(i4), r0.t(bArrL, r0.t(bArrN, r0.t(bArrP, bArrM)))));
    }

    @Override // n2.t.a
    public void b(byte[] bArr) {
        if (this.f9063j) {
            if ((this.f9066m || this.f9067n <= 0) && bArr.length == 67725) {
                byte[] bArr2 = new byte[this.f9561c.w() * this.f9561c.E()];
                for (int i4 = 1; i4 <= 128; i4++) {
                    byte[] bArr3 = new byte[512];
                    for (int i5 = 0; i5 < 512; i5++) {
                        bArr3[i5] = (byte) (bArr[(i4 * 525) + 12 + i5] & 255);
                    }
                    System.arraycopy(bArr3, 0, bArr2, (i4 - 1) * 512, 512);
                }
                m2.d0 d0Var = new m2.d0();
                d0Var.f8788e = new Date();
                p1 p1Var = this.f9561c;
                d0Var.f8784a = p1Var.f9522b;
                d0Var.f8785b = p1Var.f9524d;
                d0Var.f8786c = p1Var.K();
                m2.u uVar = new m2.u();
                uVar.f8883a = bArr2;
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
                d0Var.f8789f.put("b_data", uVar);
                if (this.f9564f == 1) {
                    d0Var = m2.w.a(d0Var, k());
                }
                e1 e1Var = this.f9560b;
                if (e1Var != null) {
                    e1Var.v(d0Var);
                }
            }
        }
    }

    @Override // n2.t.a
    public void c(byte[] bArr) {
        e1 e1Var;
        if (bArr.length == 512) {
            int i4 = bArr[10] & 255 & 3;
            int i5 = bArr[11] & 255 & 127;
            int i6 = bArr[12] & 255;
            boolean z3 = this.f9063j;
            this.f9063j = i4 > 0;
            this.f9065l = i6;
            this.f9064k = i5;
            boolean z4 = this.f9063j;
            if (z3 == z4 || (e1Var = this.f9560b) == null) {
                return;
            }
            e1Var.w(z4);
        }
    }

    @Override // n2.t.a
    public void d(boolean z3) {
        e1 e1Var = this.f9560b;
        if (e1Var != null) {
            e1Var.u(z3);
        }
        if (z3) {
            p1 p1Var = this.f9561c;
            int i4 = p1Var.f9528h;
            int i5 = p1Var.f9529i;
            D(i4);
            z(i5);
        }
    }

    @Override // n2.r0
    public void e() {
        if (this.f9062i == null) {
            this.f9062i = new s0(this);
        }
        this.f9062i.j();
    }

    @Override // n2.r0
    public void f() {
        super.f();
        this.f9062i.j();
    }

    @Override // n2.r0
    public void g() {
        int i4 = this.f9068o;
        if (i4 > 30) {
            this.f9068o = i4 - 1;
        }
        this.f9561c.H(this.f9068o);
    }

    @Override // n2.r0
    public void h() {
        D(this.f9065l - 1);
    }

    @Override // n2.r0
    public void i() {
        super.i();
        this.f9062i.k();
    }

    @Override // n2.r0
    public void j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("gain")) {
                z(Integer.parseInt(jSONObject.getString("gain")));
            }
            if (jSONObject.isNull("zoom")) {
                return;
            }
            D(Integer.parseInt(jSONObject.getString("zoom")));
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    @Override // n2.r0
    public int l() {
        return this.f9064k;
    }

    @Override // n2.r0
    public int n() {
        return this.f9065l;
    }

    @Override // n2.r0
    public void o() {
        int i4 = this.f9068o;
        if (i4 < 105) {
            this.f9068o = i4 + 1;
        }
        this.f9561c.H(this.f9068o);
    }

    @Override // n2.r0
    public void p() {
        D(this.f9065l + 1);
    }

    @Override // n2.r0
    public boolean q() {
        u0 u0Var = this.f9062i;
        if (u0Var != null) {
            return u0Var.i();
        }
        return false;
    }

    @Override // n2.r0
    public boolean r() {
        return this.f9063j;
    }

    @Override // n2.r0
    public boolean s() {
        return this.f9071r;
    }

    @Override // n2.r0
    public void u(boolean z3) {
        if (s()) {
            return;
        }
        super.u(z3);
        if (z3) {
            int iE = this.f9561c.e();
            int iF = this.f9561c.f();
            z(iE);
            D(iF);
            A(false);
        }
    }

    @Override // n2.r0
    public byte[] v(int i4) {
        return r0.t(P(i4), M(i4));
    }

    @Override // n2.r0
    public void w(byte[] bArr) {
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
        d0Var.f8789f.put("b_data", uVar);
        if (this.f9564f == 1) {
            d0Var = m2.w.a(d0Var, k());
        }
        e1 e1Var = this.f9560b;
        if (e1Var != null) {
            e1Var.v(d0Var);
        }
    }

    @Override // n2.r0
    public void x(byte[] bArr) {
        if (bArr.length >= 4 && bArr[0] == 90 && bArr[1] == -91) {
            boolean z3 = this.f9063j;
            byte b4 = bArr[2];
            if ((b4 & 128) != 0) {
                this.f9063j = true;
            } else {
                this.f9063j = false;
            }
            this.f9065l = b4 & 3;
            this.f9064k = (int) (((((double) (bArr[3] & 127)) / 127.0d) * 75.0d) + 30.0d + 0.5d);
            boolean z4 = this.f9063j;
            if (z3 != z4) {
                S(z4);
                e1 e1Var = this.f9560b;
                if (e1Var != null) {
                    e1Var.w(this.f9063j);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v3 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // n2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r2) {
        /*
            r1 = this;
            r0 = 105(0x69, float:1.47E-43)
            if (r2 <= r0) goto L6
        L4:
            r2 = r0
            goto Lb
        L6:
            r0 = 30
            if (r2 >= r0) goto Lb
            goto L4
        Lb:
            r1.f9068o = r2
            n2.p1 r0 = r1.f9561c
            r0.H(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a1.z(int):void");
    }
}
