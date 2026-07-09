package v;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11931d;

    public boolean a(int i4, int i5) {
        int i6;
        int i7 = this.f11928a;
        return i4 >= i7 && i4 < i7 + this.f11930c && i5 >= (i6 = this.f11929b) && i5 < i6 + this.f11931d;
    }

    public int b() {
        return (this.f11928a + this.f11930c) / 2;
    }

    public int c() {
        return (this.f11929b + this.f11931d) / 2;
    }

    public void d(int i4, int i5) {
        this.f11928a -= i4;
        this.f11929b -= i5;
        this.f11930c += i4 * 2;
        this.f11931d += i5 * 2;
    }

    public boolean e(l lVar) {
        int i4;
        int i5;
        int i6 = this.f11928a;
        int i7 = lVar.f11928a;
        return i6 >= i7 && i6 < i7 + lVar.f11930c && (i4 = this.f11929b) >= (i5 = lVar.f11929b) && i4 < i5 + lVar.f11931d;
    }

    public void f(int i4, int i5, int i6, int i7) {
        this.f11928a = i4;
        this.f11929b = i5;
        this.f11930c = i6;
        this.f11931d = i7;
    }
}
