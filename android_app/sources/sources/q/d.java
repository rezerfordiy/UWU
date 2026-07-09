package q;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[][] f10162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f10164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f10165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[][] f10166f;

    public static class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final double f10167e = 0.3333333333333333d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final double f10168f = 0.5d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f10169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f10170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f10171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f10172d;

        public a(double d4, double d5, double d6, double d7) {
            this.f10169a = d4;
            this.f10170b = d5;
            this.f10171c = d6;
            this.f10172d = d7;
        }

        public double a(double d4) {
            return (((((this.f10172d * d4) + this.f10171c) * d4) + this.f10170b) * d4) + this.f10169a;
        }

        public double b(double d4) {
            return (((this.f10172d * 0.3333333333333333d * d4) + (this.f10171c * 0.5d)) * d4) + this.f10170b;
        }
    }

    public d() {
    }

    public static a[] b(int i4, double[] dArr) {
        double[] dArr2 = new double[i4];
        double[] dArr3 = new double[i4];
        double[] dArr4 = new double[i4];
        int i5 = i4 - 1;
        int i6 = 0;
        dArr2[0] = 0.5d;
        int i7 = 1;
        for (int i8 = 1; i8 < i5; i8++) {
            dArr2[i8] = 1.0d / (4.0d - dArr2[i8 - 1]);
        }
        int i9 = i5 - 1;
        dArr2[i5] = 1.0d / (2.0d - dArr2[i9]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i7 < i5) {
            int i10 = i7 + 1;
            int i11 = i7 - 1;
            dArr3[i7] = (((dArr[i10] - dArr[i11]) * 3.0d) - dArr3[i11]) * dArr2[i7];
            i7 = i10;
        }
        double d4 = (((dArr[i5] - dArr[i9]) * 3.0d) - dArr3[i9]) * dArr2[i5];
        dArr3[i5] = d4;
        dArr4[i5] = d4;
        while (i9 >= 0) {
            dArr4[i9] = dArr3[i9] - (dArr2[i9] * dArr4[i9 + 1]);
            i9--;
        }
        a[] aVarArr = new a[i5];
        while (i6 < i5) {
            double d5 = dArr[i6];
            double d6 = dArr4[i6];
            int i12 = i6 + 1;
            double d7 = dArr[i12];
            double d8 = dArr4[i12];
            aVarArr[i6] = new a((float) d5, d6, (((d7 - d5) * 3.0d) - (d6 * 2.0d)) - d8, ((d5 - d7) * 2.0d) + d6 + d8);
            i6 = i12;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i4;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d4 = 0.0d;
        double d5 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i4 = 0;
            if (d5 >= 1.0d) {
                break;
            }
            double d6 = 0.0d;
            while (i4 < aVarArr.length) {
                double d7 = dArr[i4];
                double dA = aVarArr[i4].a(d5);
                dArr[i4] = dA;
                double d8 = d7 - dA;
                d6 += d8 * d8;
                i4++;
            }
            if (d5 > 0.0d) {
                dSqrt += Math.sqrt(d6);
            }
            d5 += 0.1d;
        }
        while (i4 < aVarArr.length) {
            double d9 = dArr[i4];
            double dA2 = aVarArr[i4].a(1.0d);
            dArr[i4] = dA2;
            double d10 = d9 - dA2;
            d4 += d10 * d10;
            i4++;
        }
        return dSqrt + Math.sqrt(d4);
    }

    public double c(double d4, int i4) {
        double[] dArr;
        double d5 = d4 * this.f10165e;
        int i5 = 0;
        while (true) {
            dArr = this.f10164d;
            if (i5 >= dArr.length - 1) {
                break;
            }
            double d6 = dArr[i5];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i5++;
        }
        return this.f10162b[i4][i5].a(d5 / dArr[i5]);
    }

    public void d(double d4, double[] dArr) {
        double d5 = d4 * this.f10165e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f10164d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d6 = dArr2[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f10162b[i5][i4].a(d5 / this.f10164d[i4]);
        }
    }

    public void e(double d4, float[] fArr) {
        double d5 = d4 * this.f10165e;
        int i4 = 0;
        while (true) {
            double[] dArr = this.f10164d;
            if (i4 >= dArr.length - 1) {
                break;
            }
            double d6 = dArr[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = (float) this.f10162b[i5][i4].a(d5 / this.f10164d[i4]);
        }
    }

    public void f(double d4, double[] dArr) {
        double d5 = d4 * this.f10165e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f10164d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d6 = dArr2[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f10162b[i5][i4].b(d5 / this.f10164d[i4]);
        }
    }

    public void g(double[][] dArr) {
        int i4;
        int length = dArr[0].length;
        this.f10163c = length;
        int length2 = dArr.length;
        this.f10161a = length2;
        this.f10166f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f10162b = new a[this.f10163c][];
        for (int i5 = 0; i5 < this.f10163c; i5++) {
            for (int i6 = 0; i6 < this.f10161a; i6++) {
                this.f10166f[i5][i6] = dArr[i6][i5];
            }
        }
        int i7 = 0;
        while (true) {
            i4 = this.f10163c;
            if (i7 >= i4) {
                break;
            }
            a[][] aVarArr = this.f10162b;
            double[] dArr2 = this.f10166f[i7];
            aVarArr[i7] = b(dArr2.length, dArr2);
            i7++;
        }
        this.f10164d = new double[this.f10161a - 1];
        this.f10165e = 0.0d;
        a[] aVarArr2 = new a[i4];
        for (int i8 = 0; i8 < this.f10164d.length; i8++) {
            for (int i9 = 0; i9 < this.f10163c; i9++) {
                aVarArr2[i9] = this.f10162b[i9][i8];
            }
            double d4 = this.f10165e;
            double[] dArr3 = this.f10164d;
            double dA = a(aVarArr2);
            dArr3[i8] = dA;
            this.f10165e = d4 + dA;
        }
    }

    public d(double[][] dArr) {
        g(dArr);
    }
}
