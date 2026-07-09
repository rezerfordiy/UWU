package z1;

/* JADX INFO: loaded from: classes.dex */
public class j2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f13399i = 255;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13400j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f13401k = 672000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f13402a = new f0(672000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f13404c = new byte[672000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13405d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h2 f13409h;

    public final boolean a() {
        boolean z3;
        int i4 = 0;
        if (this.f13402a.i() < 8) {
            return false;
        }
        int i5 = 0;
        while (true) {
            if (i5 > this.f13402a.i() - 8) {
                z3 = false;
                break;
            }
            if (this.f13402a.e(i5) == 90 && this.f13402a.e(i5 + 1) == -91 && this.f13402a.e(i5 + 2) == -1 && this.f13402a.e(i5 + 3) == 0 && this.f13402a.e(i5 + 4) == 90 && this.f13402a.e(i5 + 5) == -91 && this.f13402a.e(i5 + 6) == -1 && this.f13402a.e(i5 + 7) == 0) {
                i4 = i5;
                z3 = true;
                break;
            }
            i5++;
        }
        if (i4 > 0) {
            this.f13402a.j(i4);
        }
        return z3;
    }

    public final void b(byte[] bArr) {
        h2 h2Var = this.f13409h;
        if (h2Var != null) {
            h2Var.a(bArr, 0);
        }
    }

    public void c(byte[] bArr) {
        this.f13402a.h(bArr);
        while (a() && this.f13402a.i() >= 525) {
            if ((this.f13402a.e(8) & 255) == 255) {
                int i4 = this.f13405d;
                if (i4 > 0) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(this.f13404c, 0, bArr2, 0, i4);
                    b(bArr2);
                }
                this.f13405d = 0;
            }
            this.f13402a.g(this.f13404c, this.f13405d, 525);
            this.f13405d += 525;
        }
    }

    public void d() {
        this.f13402a = null;
        this.f13404c = null;
        this.f13406e = 0;
        this.f13408g = 0;
    }
}
