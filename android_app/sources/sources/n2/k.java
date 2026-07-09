package n2;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f9408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f9409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f9411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f9412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f9413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f9414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f9415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f9416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9417j;

    public byte a() {
        return this.f9413f;
    }

    public byte b() {
        return this.f9409b;
    }

    public byte c() {
        return this.f9412e;
    }

    public byte d() {
        return this.f9416i;
    }

    public byte e() {
        return this.f9415h;
    }

    public byte f() {
        return this.f9411d;
    }

    public byte g() {
        return this.f9408a;
    }

    public byte h() {
        return this.f9414g;
    }

    public int i() {
        return this.f9410c;
    }

    public byte[] j() {
        if (!this.f9417j) {
            return null;
        }
        this.f9417j = false;
        byte[] bArr = {95, -11, 0, 0, this.f9408a, this.f9409b, (byte) (this.f9410c & 255), this.f9411d, this.f9412e, this.f9413f, this.f9414g, this.f9415h, this.f9416i, 0, 0, 0};
        int i4 = 0;
        for (int i5 = 0; i5 <= 15; i5++) {
            i4 += bArr[i5] & 255;
        }
        bArr[15] = (byte) ((0 - (i4 & 255)) & 255);
        return bArr;
    }

    public byte[] k() {
        if (!this.f9417j) {
            return null;
        }
        this.f9417j = false;
        byte[] bArr = {85, -86, -1, 0, (byte) 24, 0, z1.l1.f13562p, 0, (byte) (this.f9410c & 255), this.f9412e, this.f9415h, this.f9414g, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i4 = 0;
        for (int i5 = 0; i5 < 24; i5++) {
            i4 += bArr[i5];
        }
        bArr[5] = (byte) ((0 - i4) & 255);
        return bArr;
    }

    public void l(byte b4) {
        this.f9413f = b4;
        this.f9417j = true;
    }

    public void m(byte b4) {
        this.f9409b = b4;
        this.f9417j = true;
    }

    public void n(byte b4) {
        this.f9412e = b4;
        this.f9417j = true;
    }

    public void o(byte b4) {
        this.f9416i = b4;
        this.f9417j = true;
    }

    public void p(byte b4) {
        this.f9415h = b4;
        this.f9417j = true;
    }

    public void q(byte b4) {
        this.f9411d = b4;
        this.f9417j = true;
    }

    public void r(byte b4) {
        this.f9408a = b4;
        this.f9417j = true;
    }

    public void s(byte b4) {
        this.f9414g = b4;
        this.f9417j = true;
    }

    public void t(boolean z3) {
        this.f9417j = z3;
    }

    public void u(int i4) {
        this.f9410c = i4;
        this.f9417j = true;
    }
}
