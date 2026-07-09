package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f991d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f992e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f993f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f994g = 0.017453292f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f995h = 9.0E-4f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f996i = -0.10471976f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f997j = 0.0334196f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f998k = 3.49066E-4f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f999l = 5.236E-6f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f1000m = 0.4092797f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f1001n = 946728000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1004c;

    public static o b() {
        if (f991d == null) {
            f991d = new o();
        }
        return f991d;
    }

    public void a(long j4, double d4, double d5) {
        double d6 = (0.01720197f * ((j4 - f1001n) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d5) / 360.0d) + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d4;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f1004c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f1002a = Math.round((dRound + dAcos) * 8.64E7d) + f1001n;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + f1001n;
                this.f1003b = jRound;
                if (jRound >= j4 || this.f1002a <= j4) {
                    this.f1004c = 1;
                    return;
                } else {
                    this.f1004c = 0;
                    return;
                }
            }
            this.f1004c = 0;
        }
        this.f1002a = -1L;
        this.f1003b = -1L;
    }
}
