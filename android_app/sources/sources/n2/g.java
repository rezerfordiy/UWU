package n2;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f9254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f9255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f9256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f9257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f9258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f9259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f9260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f9261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9265m;

    public void a(boolean z3, int i4) {
        this.f9264l = z3;
        this.f9265m = i4;
    }

    public byte b() {
        return this.f9258f;
    }

    public byte c() {
        return this.f9259g;
    }

    public byte d() {
        return this.f9260h;
    }

    public byte e() {
        return this.f9253a;
    }

    public byte f() {
        return this.f9261i;
    }

    public byte g() {
        return this.f9255c;
    }

    public byte h() {
        return this.f9254b;
    }

    public byte i() {
        return this.f9257e;
    }

    public byte j() {
        return this.f9256d;
    }

    public int k() {
        return this.f9262j;
    }

    public byte[] l() {
        if (!this.f9263k) {
            return null;
        }
        this.f9263k = false;
        byte[] bArr = new byte[16];
        bArr[0] = 89;
        bArr[1] = -107;
        bArr[2] = 0;
        bArr[3] = 0;
        if (this.f9264l) {
            bArr[4] = (byte) ((((byte) this.f9265m) - 1) - this.f9253a);
        } else {
            bArr[4] = this.f9253a;
        }
        bArr[5] = this.f9254b;
        bArr[6] = this.f9255c;
        bArr[7] = this.f9257e;
        bArr[8] = this.f9258f;
        bArr[9] = this.f9259g;
        bArr[10] = this.f9260h;
        bArr[11] = this.f9261i;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
        int i4 = 0;
        for (int i5 = 0; i5 <= 15; i5++) {
            i4 += bArr[i5] & 255;
        }
        bArr[15] = (byte) ((0 - (i4 & 255)) & 255);
        return bArr;
    }

    public byte[] m() {
        if (!this.f9263k) {
            return null;
        }
        this.f9263k = false;
        byte[] bArr = new byte[24];
        bArr[0] = 85;
        bArr[1] = -86;
        bArr[2] = -1;
        bArr[3] = 0;
        bArr[4] = (byte) 24;
        bArr[5] = 0;
        bArr[6] = z1.l1.f13569w;
        bArr[7] = 0;
        if (this.f9264l) {
            bArr[8] = (byte) ((((byte) this.f9265m) - 1) - this.f9253a);
        } else {
            bArr[8] = this.f9253a;
        }
        bArr[9] = this.f9254b;
        bArr[10] = this.f9255c;
        bArr[11] = this.f9257e;
        bArr[12] = this.f9258f;
        bArr[13] = this.f9259g;
        bArr[14] = this.f9260h;
        bArr[15] = this.f9261i;
        bArr[16] = 0;
        bArr[17] = 0;
        bArr[18] = 0;
        bArr[19] = 0;
        bArr[20] = 0;
        bArr[21] = 0;
        bArr[22] = 0;
        bArr[23] = 0;
        int i4 = 0;
        for (int i5 = 0; i5 <= 15; i5++) {
            i4 += bArr[i5] & 255;
        }
        bArr[5] = (byte) ((0 - (i4 & 255)) & 255);
        return bArr;
    }

    public void n(byte b4) {
        this.f9258f = b4;
        this.f9263k = true;
    }

    public void o(byte b4) {
        this.f9259g = b4;
        this.f9263k = true;
    }

    public void p(byte b4) {
        this.f9260h = b4;
        this.f9263k = true;
    }

    public void q(byte b4) {
        this.f9253a = b4;
        this.f9263k = true;
    }

    public void r(byte b4) {
        this.f9261i = b4;
        this.f9263k = true;
    }

    public void s(byte b4) {
        this.f9255c = b4;
        this.f9263k = true;
    }

    public void t(byte b4) {
        this.f9254b = b4;
        this.f9263k = true;
    }

    public void u(byte b4) {
        this.f9257e = b4;
        this.f9263k = true;
    }

    public void v(byte b4) {
        this.f9256d = b4;
        this.f9263k = true;
    }

    public void w(boolean z3) {
        this.f9263k = z3;
    }

    public void x(int i4) {
        this.f9262j = i4;
    }
}
