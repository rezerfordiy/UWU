package n2;

import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static x f9668k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9669l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9670m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9671n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ boolean f9672o = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9677e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9682j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9673a = 7;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9674b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9675c = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f9678f = new double[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double[] f9679g = new double[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double[] f9680h = new double[16];

    public static synchronized x b() {
        if (f9668k == null) {
            x xVar = new x();
            f9668k = xVar;
            xVar.a();
        }
        return f9668k;
    }

    public final void a() {
        if (this.f9676d != null) {
            return;
        }
        this.f9676d = new int[37632];
        this.f9677e = new int[Tag.Receiver];
        h(0);
        for (int i4 = 0; i4 < 16; i4++) {
            for (int i5 = 0; i5 < 16; i5++) {
                g(i4, i5, 0);
            }
        }
        h(1);
        for (int i6 = 0; i6 < 16; i6++) {
            for (int i7 = 0; i7 < 16; i7++) {
                g(i6, i7, 1);
            }
        }
        h(2);
        for (int i8 = 0; i8 < 16; i8++) {
            for (int i9 = 0; i9 < 16; i9++) {
                g(i8, i9, 2);
            }
        }
    }

    public int c() {
        return 7;
    }

    public int[] d(int i4, int i5) {
        int[] iArr = new int[49];
        System.arraycopy(this.f9676d, ((i4 * 16) + i5) * 7 * 7, iArr, 0, 49);
        return iArr;
    }

    public int[] e() {
        return this.f9676d;
    }

    public final void f(double[] dArr, int i4, double d4, double d5, double d6, double d7) {
        double d8 = d5 - d4;
        int i5 = i4 - 1;
        double d9 = d8 / ((double) i5);
        dArr[0] = d4;
        dArr[i5] = d5;
        for (int i6 = 1; i6 < i5; i6++) {
            dArr[i6] = d4 + (((double) i6) * d9);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            dArr[i7] = d4 + (d8 / (Math.exp(((-d7) * 4.0d) * (dArr[i7] - d6)) + 1.0d));
        }
        if (i4 > 0) {
            double d10 = dArr[0];
            double d11 = dArr[i5];
            for (int i8 = 0; i8 < i4; i8++) {
                dArr[i8] = d4 + (((dArr[i8] - d10) * d8) / (d11 - d10));
            }
        }
    }

    public final void g(int i4, int i5, int i6) {
        int i7 = (i4 * 16) + i5;
        if (i6 == 1) {
            i7 += 256;
        } else if (i6 == 2) {
            i7 += 512;
        }
        int i8 = 7;
        int i9 = i7 * 7 * 7;
        double d4 = this.f9678f[i4];
        double d5 = d4 * d4;
        double d6 = this.f9679g[i4];
        double d7 = d6 * d6;
        long j4 = -4609115380302729960L;
        double d8 = (this.f9680h[i5] * (-3.141592653589793d)) / 180.0d;
        double[] dArr = new double[49];
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = 0;
            while (i12 < i8) {
                double d9 = i10 - 3;
                int i13 = i9;
                double d10 = i12 - 3;
                double dCos = (Math.cos(d8) * d9) + (Math.sin(d8) * d10);
                int i14 = i10;
                double dCos2 = ((-Math.sin(d8)) * d9) + (Math.cos(d8) * d10);
                dArr[i11] = Math.exp((((dCos * dCos) / d5) + ((dCos2 * dCos2) / d7)) * (-3.141592653589793d));
                i11++;
                i12++;
                j4 = -4609115380302729960L;
                i10 = i14;
                i7 = i7;
                i9 = i13;
                i8 = 7;
            }
            i10++;
            i7 = i7;
            i9 = i9;
            i8 = 7;
        }
        int i15 = i9;
        int i16 = i7;
        double d11 = dArr[0];
        double d12 = d11;
        for (int i17 = 1; i17 < 49; i17++) {
            double d13 = dArr[i17];
            if (d13 < d11) {
                d11 = d13;
            } else if (d13 > d12) {
                d12 = d13;
            }
        }
        double d14 = 0.0d;
        if (d11 < 0.0d) {
            double d15 = -d11;
            if (d15 > d12) {
                d12 = d15;
            }
        }
        for (int i18 = 0; i18 < 49; i18++) {
            double d16 = dArr[i18] / d12;
            dArr[i18] = d16;
            dArr[i18] = d16 * ((double) this.f9681i);
        }
        for (int i19 = 0; i19 < 49; i19++) {
            this.f9676d[i15 + i19] = (int) dArr[i19];
        }
        for (int i20 = 0; i20 < 49; i20++) {
            d14 += dArr[i20];
        }
        this.f9677e[i16] = (int) ((((double) this.f9682j) / d14) + 0.5d);
    }

    public final void h(int i4) {
        f(this.f9678f, 16, 0.0d, 1.0d, 1.0d, 0.5d);
        f(this.f9679g, 16, 0.0d, 1.0d, 1.0d, 0.5d);
        double d4 = i4 == 1 ? 4.0d : i4 == 2 ? 3.0d : 5.0d;
        double d5 = 3.0d * d4;
        for (int i5 = 0; i5 < 16; i5++) {
            double[] dArr = this.f9678f;
            dArr[i5] = (dArr[i5] * (d5 - d4)) + d4;
            double[] dArr2 = this.f9679g;
            dArr2[i5] = d4 - (dArr2[i5] * (d4 - 1.0d));
        }
        for (int i6 = 0; i6 < 16; i6++) {
            this.f9680h[i6] = ((double) i6) * 11.25d;
        }
        this.f9681i = 127;
        this.f9682j = 4194304;
    }
}
