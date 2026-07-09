package z1;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13128c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13129d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13130e = 0;

    public f0(int i4) {
        this.f13127b = i4;
        this.f13126a = new byte[i4];
    }

    public int a() {
        return this.f13127b;
    }

    public void b() {
        this.f13128c = 0;
        this.f13129d = 0;
        this.f13130e = 0;
    }

    public boolean c() {
        return this.f13130e == 0;
    }

    public boolean d() {
        return this.f13130e == this.f13127b;
    }

    public byte e(int i4) {
        if (i4 < 0 || i4 >= this.f13130e) {
            return (byte) 0;
        }
        return this.f13126a[(this.f13128c + i4) % this.f13127b];
    }

    public int f(byte[] bArr, int i4) {
        return g(bArr, 0, i4);
    }

    public int g(byte[] bArr, int i4, int i5) {
        if (bArr == null || i4 < 0 || i5 <= 0 || i4 + i5 > bArr.length || i5 > this.f13130e) {
            return 0;
        }
        int i6 = this.f13127b;
        int i7 = this.f13128c;
        int i8 = i6 - i7;
        if (i5 <= i8) {
            System.arraycopy(this.f13126a, i7, bArr, i4, i5);
            this.f13128c = (this.f13128c + i5) % this.f13127b;
        } else {
            System.arraycopy(this.f13126a, i7, bArr, i4, i8);
            int i9 = i5 - i8;
            System.arraycopy(this.f13126a, 0, bArr, i4 + i8, i9);
            this.f13128c = i9;
        }
        this.f13130e -= i5;
        return i5;
    }

    public int h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        int length = bArr.length;
        int i4 = this.f13127b;
        if (length > i4 - this.f13130e) {
            return 0;
        }
        int i5 = this.f13129d;
        int i6 = i4 - i5;
        if (length <= i6) {
            System.arraycopy(bArr, 0, this.f13126a, i5, length);
            this.f13129d = (this.f13129d + length) % this.f13127b;
        } else {
            System.arraycopy(bArr, 0, this.f13126a, i5, i6);
            int i7 = length - i6;
            System.arraycopy(bArr, i6, this.f13126a, 0, i7);
            this.f13129d = i7;
        }
        this.f13130e += length;
        return length;
    }

    public int i() {
        return this.f13130e;
    }

    public int j(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        int i5 = this.f13130e;
        if (i4 > i5) {
            i4 = i5;
        }
        this.f13128c = (this.f13128c + i4) % this.f13127b;
        this.f13130e = i5 - i4;
        return i4;
    }
}
