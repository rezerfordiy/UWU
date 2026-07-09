package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1822i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1823a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1824b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1825c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1826d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1827e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1828f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1829g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1830h = false;

    public int a() {
        return this.f1829g ? this.f1823a : this.f1824b;
    }

    public int b() {
        return this.f1823a;
    }

    public int c() {
        return this.f1824b;
    }

    public int d() {
        return this.f1829g ? this.f1824b : this.f1823a;
    }

    public void e(int i4, int i5) {
        this.f1830h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f1827e = i4;
            this.f1823a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1828f = i5;
            this.f1824b = i5;
        }
    }

    public void f(boolean z3) {
        int i4;
        if (z3 == this.f1829g) {
            return;
        }
        this.f1829g = z3;
        if (this.f1830h) {
            if (z3) {
                int i5 = this.f1826d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f1827e;
                }
                this.f1823a = i5;
                i4 = this.f1825c;
                if (i4 == Integer.MIN_VALUE) {
                }
            } else {
                int i6 = this.f1825c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = this.f1827e;
                }
                this.f1823a = i6;
                i4 = this.f1826d;
                if (i4 == Integer.MIN_VALUE) {
                }
            }
            this.f1824b = i4;
        }
        this.f1823a = this.f1827e;
        i4 = this.f1828f;
        this.f1824b = i4;
    }

    public void g(int i4, int i5) {
        this.f1825c = i4;
        this.f1826d = i5;
        this.f1830h = true;
        if (this.f1829g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f1823a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f1824b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f1823a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1824b = i5;
        }
    }
}
