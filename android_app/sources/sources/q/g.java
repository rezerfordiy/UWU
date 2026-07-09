package q;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f10181g = "Oscillator";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10182h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10183i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10184j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f10185k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f10186l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f10187m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f10188n = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f10191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10192d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f10189a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f10190b = new double[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f10193e = 6.283185307179586d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10194f = false;

    public void a(double d4, float f4) {
        int length = this.f10189a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f10190b, d4);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f10190b = Arrays.copyOf(this.f10190b, length);
        this.f10189a = Arrays.copyOf(this.f10189a, length);
        this.f10191c = new double[length];
        double[] dArr = this.f10190b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f10190b[iBinarySearch] = d4;
        this.f10189a[iBinarySearch] = f4;
        this.f10194f = false;
    }

    public double b(double d4) {
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f10190b, d4);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.f10189a;
        float f4 = fArr[i4];
        int i5 = i4 - 1;
        float f5 = fArr[i5];
        double d5 = f4 - f5;
        double[] dArr = this.f10190b;
        double d6 = dArr[i4];
        double d7 = dArr[i5];
        double d8 = d5 / (d6 - d7);
        return (((double) f5) - (d8 * d7)) + (d4 * d8);
    }

    public double c(double d4) {
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f10190b, d4);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.f10189a;
        float f4 = fArr[i4];
        int i5 = i4 - 1;
        float f5 = fArr[i5];
        double d5 = f4 - f5;
        double[] dArr = this.f10190b;
        double d6 = dArr[i4];
        double d7 = dArr[i5];
        double d8 = d5 / (d6 - d7);
        return this.f10191c[i5] + ((((double) f5) - (d8 * d7)) * (d4 - d7)) + ((d8 * ((d4 * d4) - (d7 * d7))) / 2.0d);
    }

    public double d(double d4) {
        double dB;
        double dSignum;
        double dB2;
        double dB3;
        double dSin;
        switch (this.f10192d) {
            case 1:
                return 0.0d;
            case 2:
                dB = b(d4) * 4.0d;
                dSignum = Math.signum((((c(d4) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return dB * dSignum;
            case 3:
                dB2 = b(d4);
                return dB2 * 2.0d;
            case 4:
                dB2 = -b(d4);
                return dB2 * 2.0d;
            case 5:
                dB3 = (-this.f10193e) * b(d4);
                dSin = Math.sin(this.f10193e * c(d4));
                return dB3 * dSin;
            case 6:
                dB = b(d4) * 4.0d;
                dSignum = (((c(d4) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return dB * dSignum;
            default:
                dB3 = this.f10193e * b(d4);
                dSin = Math.cos(this.f10193e * c(d4));
                return dB3 * dSin;
        }
    }

    public double e(double d4) {
        double dAbs;
        switch (this.f10192d) {
            case 1:
                return Math.signum(0.5d - (c(d4) % 1.0d));
            case 2:
                dAbs = Math.abs((((c(d4) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c(d4) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((c(d4) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f10193e * c(d4));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((c(d4) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(this.f10193e * c(d4));
        }
        return 1.0d - dAbs;
    }

    public void f() {
        double d4 = 0.0d;
        int i4 = 0;
        while (true) {
            float[] fArr = this.f10189a;
            if (i4 >= fArr.length) {
                break;
            }
            d4 += (double) fArr[i4];
            i4++;
        }
        double d5 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr2 = this.f10189a;
            if (i5 >= fArr2.length) {
                break;
            }
            int i6 = i5 - 1;
            float f4 = (fArr2[i6] + fArr2[i5]) / 2.0f;
            double[] dArr = this.f10190b;
            d5 += (dArr[i5] - dArr[i6]) * ((double) f4);
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr3 = this.f10189a;
            if (i7 >= fArr3.length) {
                break;
            }
            fArr3[i7] = (float) (((double) fArr3[i7]) * (d4 / d5));
            i7++;
        }
        this.f10191c[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr4 = this.f10189a;
            if (i8 >= fArr4.length) {
                this.f10194f = true;
                return;
            }
            int i9 = i8 - 1;
            float f5 = (fArr4[i9] + fArr4[i8]) / 2.0f;
            double[] dArr2 = this.f10190b;
            double d6 = dArr2[i8] - dArr2[i9];
            double[] dArr3 = this.f10191c;
            dArr3[i8] = dArr3[i9] + (d6 * ((double) f5));
            i8++;
        }
    }

    public void g(int i4) {
        this.f10192d = i4;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f10190b) + " period=" + Arrays.toString(this.f10189a);
    }
}
