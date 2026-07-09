package q;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10177g = "MonotonicCurveFit";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f10178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[][] f10179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[][] f10180f;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        int i4 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                double d4 = dArr[i7] - dArr[i6];
                double[] dArr5 = dArr3[i6];
                double d5 = (dArr2[i7][i5] - dArr2[i6][i5]) / d4;
                dArr5[i5] = d5;
                if (i6 == 0) {
                    dArr4[i6][i5] = d5;
                } else {
                    dArr4[i6][i5] = (dArr3[i6 - 1][i5] + d5) * 0.5d;
                }
                i6 = i7;
            }
            dArr4[i4][i5] = dArr3[length - 2][i5];
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < length2; i9++) {
                double d6 = dArr3[i8][i9];
                if (d6 == 0.0d) {
                    dArr4[i8][i9] = 0.0d;
                    dArr4[i8 + 1][i9] = 0.0d;
                } else {
                    double d7 = dArr4[i8][i9] / d6;
                    int i10 = i8 + 1;
                    double d8 = dArr4[i10][i9] / d6;
                    double dHypot = Math.hypot(d7, d8);
                    if (dHypot > 9.0d) {
                        double d9 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i8];
                        double[] dArr7 = dArr3[i8];
                        dArr6[i9] = d7 * d9 * dArr7[i9];
                        dArr4[i10][i9] = d9 * d8 * dArr7[i9];
                    }
                }
            }
        }
        this.f10178d = dArr;
        this.f10179e = dArr2;
        this.f10180f = dArr4;
    }

    public static double i(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d5 * 6.0d;
        double d12 = 3.0d * d4;
        return ((((((((((-6.0d) * d10) * d7) + (d11 * d7)) + ((6.0d * d10) * d6)) - (d11 * d6)) + ((d12 * d9) * d10)) + ((d12 * d8) * d10)) - (((2.0d * d4) * d9) * d5)) - (((4.0d * d4) * d8) * d5)) + (d4 * d8);
    }

    public static double j(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d10 * d5;
        double d12 = 3.0d * d10;
        double d13 = ((((((-2.0d) * d11) * d7) + (d12 * d7)) + ((d11 * 2.0d) * d6)) - (d12 * d6)) + d6;
        double d14 = d4 * d9;
        double d15 = d4 * d8;
        return ((((d13 + (d14 * d11)) + (d11 * d15)) - (d14 * d10)) - (((d4 * 2.0d) * d8) * d10)) + (d15 * d5);
    }

    @Override // q.b
    public double c(double d4, int i4) {
        double[] dArr = this.f10178d;
        int length = dArr.length;
        int i5 = 0;
        if (d4 <= dArr[0]) {
            return this.f10179e[0][i4];
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            return this.f10179e[i6][i4];
        }
        while (i5 < i6) {
            double[] dArr2 = this.f10178d;
            double d5 = dArr2[i5];
            if (d4 == d5) {
                return this.f10179e[i5][i4];
            }
            int i7 = i5 + 1;
            double d6 = dArr2[i7];
            if (d4 < d6) {
                double d7 = d6 - d5;
                double d8 = (d4 - d5) / d7;
                double[][] dArr3 = this.f10179e;
                double d9 = dArr3[i5][i4];
                double d10 = dArr3[i7][i4];
                double[][] dArr4 = this.f10180f;
                return j(d7, d8, d9, d10, dArr4[i5][i4], dArr4[i7][i4]);
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // q.b
    public void d(double d4, double[] dArr) {
        double[] dArr2 = this.f10178d;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f10179e[0].length;
        if (d4 <= dArr2[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                dArr[i5] = this.f10179e[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr2[i6]) {
            while (i4 < length2) {
                dArr[i4] = this.f10179e[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10178d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f10179e[i7][i8];
                }
            }
            double[] dArr3 = this.f10178d;
            int i9 = i7 + 1;
            double d5 = dArr3[i9];
            if (d4 < d5) {
                double d6 = dArr3[i7];
                double d7 = d5 - d6;
                double d8 = (d4 - d6) / d7;
                while (i4 < length2) {
                    double[][] dArr4 = this.f10179e;
                    double d9 = dArr4[i7][i4];
                    double d10 = dArr4[i9][i4];
                    double[][] dArr5 = this.f10180f;
                    dArr[i4] = j(d7, d8, d9, d10, dArr5[i7][i4], dArr5[i9][i4]);
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // q.b
    public void e(double d4, float[] fArr) {
        double[] dArr = this.f10178d;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f10179e[0].length;
        if (d4 <= dArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = (float) this.f10179e[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            while (i4 < length2) {
                fArr[i4] = (float) this.f10179e[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10178d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f10179e[i7][i8];
                }
            }
            double[] dArr2 = this.f10178d;
            int i9 = i7 + 1;
            double d5 = dArr2[i9];
            if (d4 < d5) {
                double d6 = dArr2[i7];
                double d7 = d5 - d6;
                double d8 = (d4 - d6) / d7;
                while (i4 < length2) {
                    double[][] dArr3 = this.f10179e;
                    double d9 = dArr3[i7][i4];
                    double d10 = dArr3[i9][i4];
                    double[][] dArr4 = this.f10180f;
                    fArr[i4] = (float) j(d7, d8, d9, d10, dArr4[i7][i4], dArr4[i9][i4]);
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // q.b
    public double f(double d4, int i4) {
        double[] dArr = this.f10178d;
        int length = dArr.length;
        int i5 = 0;
        double d5 = dArr[0];
        if (d4 >= d5) {
            d5 = dArr[length - 1];
            if (d4 < d5) {
                d5 = d4;
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f10178d;
            int i6 = i5 + 1;
            double d6 = dArr2[i6];
            if (d5 <= d6) {
                double d7 = dArr2[i5];
                double d8 = d6 - d7;
                double[][] dArr3 = this.f10179e;
                double d9 = dArr3[i5][i4];
                double d10 = dArr3[i6][i4];
                double[][] dArr4 = this.f10180f;
                return i(d8, (d5 - d7) / d8, d9, d10, dArr4[i5][i4], dArr4[i6][i4]) / d8;
            }
            i5 = i6;
        }
        return 0.0d;
    }

    @Override // q.b
    public void g(double d4, double[] dArr) {
        double[] dArr2 = this.f10178d;
        int length = dArr2.length;
        int length2 = this.f10179e[0].length;
        double d5 = dArr2[0];
        if (d4 > d5) {
            d5 = dArr2[length - 1];
            if (d4 < d5) {
                d5 = d4;
            }
        }
        int i4 = 0;
        while (i4 < length - 1) {
            double[] dArr3 = this.f10178d;
            int i5 = i4 + 1;
            double d6 = dArr3[i5];
            if (d5 <= d6) {
                double d7 = dArr3[i4];
                double d8 = d6 - d7;
                double d9 = (d5 - d7) / d8;
                for (int i6 = 0; i6 < length2; i6++) {
                    double[][] dArr4 = this.f10179e;
                    double d10 = dArr4[i4][i6];
                    double d11 = dArr4[i5][i6];
                    double[][] dArr5 = this.f10180f;
                    dArr[i6] = i(d8, d9, d10, d11, dArr5[i4][i6], dArr5[i5][i6]) / d8;
                }
                return;
            }
            i4 = i5;
        }
    }

    @Override // q.b
    public double[] h() {
        return this.f10178d;
    }
}
