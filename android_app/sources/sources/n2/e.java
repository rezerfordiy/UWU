package n2;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f9170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f9171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f9172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f9173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f9174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f9175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f9176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f9177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f9178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9181m;

    public void a(boolean z3, int i4) {
        this.f9180l = z3;
        this.f9181m = i4;
    }

    public byte b() {
        return this.f9171c;
    }

    public byte c() {
        return this.f9174f;
    }

    public byte d() {
        return this.f9176h;
    }

    public byte e() {
        return this.f9175g;
    }

    public byte f() {
        return this.f9173e;
    }

    public byte g() {
        return this.f9177i;
    }

    public byte h() {
        return this.f9169a;
    }

    public byte i() {
        return this.f9172d;
    }

    public byte j() {
        return this.f9170b;
    }

    public byte k() {
        return this.f9178j;
    }

    public byte[] l() {
        if (!this.f9179k) {
            return null;
        }
        this.f9179k = false;
        byte[] bArr = new byte[16];
        bArr[0] = 88;
        bArr[1] = -123;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = this.f9169a;
        bArr[5] = this.f9170b;
        bArr[6] = this.f9171c;
        bArr[7] = this.f9172d;
        bArr[8] = this.f9173e;
        bArr[9] = this.f9174f;
        bArr[10] = this.f9177i;
        bArr[11] = this.f9178j;
        if (this.f9180l) {
            int i4 = (((byte) (this.f9181m & 255)) & 255) - 1;
            byte b4 = (byte) (i4 - (this.f9176h & 255));
            byte b5 = (byte) (i4 - (this.f9175g & 255));
            bArr[12] = (byte) (b4 & 255);
            bArr[13] = (byte) (b5 & 255);
        } else {
            bArr[12] = this.f9175g;
            bArr[13] = this.f9176h;
        }
        bArr[14] = 0;
        bArr[15] = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 15; i6++) {
            i5 += bArr[i6] & 255;
        }
        bArr[15] = (byte) ((0 - (i5 & 255)) & 255);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < 16; i7++) {
            stringBuffer.append("  " + ((int) bArr[i7]));
        }
        return bArr;
    }

    public byte[] m() {
        if (!this.f9179k) {
            return null;
        }
        this.f9179k = false;
        byte[] bArr = new byte[24];
        bArr[0] = 85;
        bArr[1] = -86;
        bArr[2] = -1;
        bArr[3] = 0;
        bArr[4] = (byte) 24;
        bArr[5] = 0;
        bArr[6] = 32;
        bArr[7] = 0;
        bArr[8] = this.f9169a;
        bArr[9] = this.f9170b;
        bArr[10] = this.f9171c;
        bArr[11] = this.f9172d;
        bArr[12] = this.f9173e;
        bArr[13] = this.f9174f;
        bArr[14] = this.f9177i;
        bArr[15] = this.f9178j;
        if (this.f9180l) {
            int i4 = (((byte) (this.f9181m & 255)) & 255) - 1;
            byte b4 = (byte) (i4 - (this.f9176h & 255));
            byte b5 = (byte) (i4 - (this.f9175g & 255));
            bArr[16] = (byte) (b4 & 255);
            bArr[17] = (byte) (b5 & 255);
        } else {
            bArr[16] = this.f9175g;
            bArr[17] = this.f9176h;
        }
        bArr[18] = 0;
        bArr[19] = 0;
        bArr[20] = 0;
        bArr[21] = 0;
        bArr[22] = 0;
        bArr[23] = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 24; i6++) {
            i5 += bArr[i6];
        }
        bArr[5] = (byte) ((0 - i5) & 255);
        return bArr;
    }

    public void n(byte b4) {
        this.f9171c = b4;
        this.f9179k = true;
    }

    public void o(byte b4) {
        this.f9174f = b4;
        this.f9179k = true;
    }

    public void p(byte b4) {
        this.f9176h = b4;
        this.f9179k = true;
    }

    public void q(byte b4) {
        this.f9175g = b4;
        this.f9179k = true;
    }

    public void r(byte b4) {
        this.f9173e = b4;
        this.f9179k = true;
    }

    public void s(byte b4) {
        this.f9177i = b4;
        this.f9179k = true;
    }

    public void t(byte b4) {
        this.f9169a = b4;
        this.f9179k = true;
    }

    public void u(byte b4) {
        this.f9172d = b4;
        this.f9179k = true;
    }

    public void v(byte b4) {
        this.f9170b = b4;
        this.f9179k = true;
    }

    public void w(byte b4) {
        this.f9178j = b4;
        this.f9179k = true;
    }

    public void x(boolean z3) {
        this.f9179k = z3;
    }
}
