package p;

/* JADX INFO: loaded from: classes.dex */
public final class c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E[] f9990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9993d;

    public c() {
        this(8);
    }

    public void a(E e4) {
        int i4 = (this.f9991b - 1) & this.f9993d;
        this.f9991b = i4;
        this.f9990a[i4] = e4;
        if (i4 == this.f9992c) {
            d();
        }
    }

    public void b(E e4) {
        E[] eArr = this.f9990a;
        int i4 = this.f9992c;
        eArr[i4] = e4;
        int i5 = this.f9993d & (i4 + 1);
        this.f9992c = i5;
        if (i5 == this.f9991b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.f9990a;
        int length = eArr.length;
        int i4 = this.f9991b;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i6];
        System.arraycopy(eArr, i4, eArr2, 0, i5);
        System.arraycopy(this.f9990a, 0, eArr2, i5, this.f9991b);
        this.f9990a = eArr2;
        this.f9991b = 0;
        this.f9992c = length;
        this.f9993d = i6 - 1;
    }

    public E e(int i4) {
        if (i4 < 0 || i4 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f9990a[this.f9993d & (this.f9991b + i4)];
    }

    public E f() {
        int i4 = this.f9991b;
        if (i4 != this.f9992c) {
            return this.f9990a[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i4 = this.f9991b;
        int i5 = this.f9992c;
        if (i4 != i5) {
            return this.f9990a[(i5 - 1) & this.f9993d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f9991b == this.f9992c;
    }

    public E i() {
        int i4 = this.f9991b;
        if (i4 == this.f9992c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f9990a;
        E e4 = eArr[i4];
        eArr[i4] = null;
        this.f9991b = (i4 + 1) & this.f9993d;
        return e4;
    }

    public E j() {
        int i4 = this.f9991b;
        int i5 = this.f9992c;
        if (i4 == i5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.f9993d & (i5 - 1);
        E[] eArr = this.f9990a;
        E e4 = eArr[i6];
        eArr[i6] = null;
        this.f9992c = i6;
        return e4;
    }

    public void k(int i4) {
        int i5;
        if (i4 <= 0) {
            return;
        }
        if (i4 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.f9992c;
        int i7 = i4 < i6 ? i6 - i4 : 0;
        int i8 = i7;
        while (true) {
            i5 = this.f9992c;
            if (i8 >= i5) {
                break;
            }
            this.f9990a[i8] = null;
            i8++;
        }
        int i9 = i5 - i7;
        int i10 = i4 - i9;
        this.f9992c = i5 - i9;
        if (i10 > 0) {
            int length = this.f9990a.length;
            this.f9992c = length;
            int i11 = length - i10;
            for (int i12 = i11; i12 < this.f9992c; i12++) {
                this.f9990a[i12] = null;
            }
            this.f9992c = i11;
        }
    }

    public void l(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f9990a.length;
        int i5 = this.f9991b;
        if (i4 < length - i5) {
            length = i5 + i4;
        }
        while (i5 < length) {
            this.f9990a[i5] = null;
            i5++;
        }
        int i6 = this.f9991b;
        int i7 = length - i6;
        int i8 = i4 - i7;
        this.f9991b = this.f9993d & (i6 + i7);
        if (i8 > 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                this.f9990a[i9] = null;
            }
            this.f9991b = i8;
        }
    }

    public int m() {
        return (this.f9992c - this.f9991b) & this.f9993d;
    }

    public c(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
        this.f9993d = i4 - 1;
        this.f9990a = (E[]) new Object[i4];
    }
}
