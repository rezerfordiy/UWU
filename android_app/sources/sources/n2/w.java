package n2;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9650l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9651m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9652n = 672000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f9660h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f9653a = new s(672000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9654b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f9655c = new byte[672000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9656d = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9661i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9662j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9663k = 0;

    public interface a {
        void c(byte[] bArr);
    }

    public final boolean a() {
        boolean z3;
        int i4 = 0;
        if (this.f9653a.i() < 8) {
            return false;
        }
        int i5 = 0;
        while (true) {
            if (i5 > this.f9653a.i() - 8) {
                z3 = false;
                break;
            }
            if (this.f9653a.e(i5) == 90 && this.f9653a.e(i5 + 1) == -91 && this.f9653a.e(i5 + 2) == -1 && this.f9653a.e(i5 + 3) == 0 && this.f9653a.e(i5 + 4) == 90 && this.f9653a.e(i5 + 5) == -91 && this.f9653a.e(i5 + 6) == -1 && this.f9653a.e(i5 + 7) == 0) {
                i4 = i5;
                z3 = true;
                break;
            }
            i5++;
        }
        if (i4 > 0) {
            this.f9653a.j(i4);
        }
        return z3;
    }

    public final void b(byte[] bArr) {
        a aVar = this.f9660h;
        if (aVar != null) {
            aVar.c(bArr);
        }
    }

    public void c(byte[] bArr) {
        this.f9653a.h(bArr);
        while (a() && this.f9653a.i() >= 525) {
            if ((this.f9653a.e(8) & 255) == 255) {
                int i4 = this.f9656d;
                if (i4 > 0) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(this.f9655c, 0, bArr2, 0, i4);
                    b(bArr2);
                }
                this.f9656d = 0;
            }
            this.f9653a.g(this.f9655c, this.f9656d, 525);
            this.f9656d += 525;
        }
    }

    public void d() {
        this.f9653a = null;
        this.f9655c = null;
        this.f9657e = 0;
        this.f9659g = 0;
    }
}
