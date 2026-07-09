package n2;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9567c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9568d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9569e = 0;

    public s(int i4) {
        this.f9566b = i4;
        this.f9565a = new byte[i4];
    }

    public int a() {
        return this.f9566b;
    }

    public void b() {
        this.f9567c = 0;
        this.f9568d = 0;
        this.f9569e = 0;
    }

    public boolean c() {
        return this.f9569e == 0;
    }

    public boolean d() {
        return this.f9569e == this.f9566b;
    }

    public byte e(int i4) {
        if (i4 < 0 || i4 >= this.f9569e) {
            return (byte) 0;
        }
        return this.f9565a[(this.f9567c + i4) % this.f9566b];
    }

    public int f(byte[] bArr, int i4) {
        return g(bArr, 0, i4);
    }

    public int g(byte[] bArr, int i4, int i5) {
        if (bArr == null || i4 < 0 || i5 <= 0 || i4 + i5 > bArr.length || i5 > this.f9569e) {
            return 0;
        }
        int i6 = this.f9566b;
        int i7 = this.f9567c;
        int i8 = i6 - i7;
        if (i5 <= i8) {
            System.arraycopy(this.f9565a, i7, bArr, i4, i5);
            this.f9567c = (this.f9567c + i5) % this.f9566b;
        } else {
            System.arraycopy(this.f9565a, i7, bArr, i4, i8);
            int i9 = i5 - i8;
            System.arraycopy(this.f9565a, 0, bArr, i4 + i8, i9);
            this.f9567c = i9;
        }
        this.f9569e -= i5;
        return i5;
    }

    public int h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        int length = bArr.length;
        int i4 = this.f9566b;
        if (length > i4 - this.f9569e) {
            return 0;
        }
        int i5 = this.f9568d;
        int i6 = i4 - i5;
        if (length <= i6) {
            System.arraycopy(bArr, 0, this.f9565a, i5, length);
            this.f9568d = (this.f9568d + length) % this.f9566b;
        } else {
            System.arraycopy(bArr, 0, this.f9565a, i5, i6);
            int i7 = length - i6;
            System.arraycopy(bArr, i6, this.f9565a, 0, i7);
            this.f9568d = i7;
        }
        this.f9569e += length;
        return length;
    }

    public int i() {
        return this.f9569e;
    }

    public int j(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        int i5 = this.f9569e;
        if (i4 > i5) {
            i4 = i5;
        }
        this.f9567c = (this.f9567c + i4) % this.f9566b;
        this.f9569e = i5 - i4;
        return i4;
    }
}
