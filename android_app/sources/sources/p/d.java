package p;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9997d;

    public d() {
        this(8);
    }

    public void a(int i4) {
        int i5 = (this.f9995b - 1) & this.f9997d;
        this.f9995b = i5;
        this.f9994a[i5] = i4;
        if (i5 == this.f9996c) {
            d();
        }
    }

    public void b(int i4) {
        int[] iArr = this.f9994a;
        int i5 = this.f9996c;
        iArr[i5] = i4;
        int i6 = this.f9997d & (i5 + 1);
        this.f9996c = i6;
        if (i6 == this.f9995b) {
            d();
        }
    }

    public void c() {
        this.f9996c = this.f9995b;
    }

    public final void d() {
        int[] iArr = this.f9994a;
        int length = iArr.length;
        int i4 = this.f9995b;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i6];
        System.arraycopy(iArr, i4, iArr2, 0, i5);
        System.arraycopy(this.f9994a, 0, iArr2, i5, this.f9995b);
        this.f9994a = iArr2;
        this.f9995b = 0;
        this.f9996c = length;
        this.f9997d = i6 - 1;
    }

    public int e(int i4) {
        if (i4 < 0 || i4 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f9994a[this.f9997d & (this.f9995b + i4)];
    }

    public int f() {
        int i4 = this.f9995b;
        if (i4 != this.f9996c) {
            return this.f9994a[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int i4 = this.f9995b;
        int i5 = this.f9996c;
        if (i4 != i5) {
            return this.f9994a[(i5 - 1) & this.f9997d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f9995b == this.f9996c;
    }

    public int i() {
        int i4 = this.f9995b;
        if (i4 == this.f9996c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i5 = this.f9994a[i4];
        this.f9995b = (i4 + 1) & this.f9997d;
        return i5;
    }

    public int j() {
        int i4 = this.f9995b;
        int i5 = this.f9996c;
        if (i4 == i5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.f9997d & (i5 - 1);
        int i7 = this.f9994a[i6];
        this.f9996c = i6;
        return i7;
    }

    public void k(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f9996c = this.f9997d & (this.f9996c - i4);
    }

    public void l(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f9995b = this.f9997d & (this.f9995b + i4);
    }

    public int m() {
        return (this.f9996c - this.f9995b) & this.f9997d;
    }

    public d(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
        this.f9997d = i4 - 1;
        this.f9994a = new int[i4];
    }
}
