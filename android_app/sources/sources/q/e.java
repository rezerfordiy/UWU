package q;

/* JADX INFO: loaded from: classes.dex */
public class e extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10173g = "LinearCurveFit";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f10174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[][] f10175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f10176f;

    public e(double[] dArr, double[][] dArr2) {
        this.f10176f = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f10174d = dArr;
        this.f10175e = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i4 = 0;
        double d4 = 0.0d;
        while (true) {
            double d5 = d4;
            if (i4 >= dArr.length) {
                this.f10176f = 0.0d;
                return;
            }
            double d6 = dArr2[i4][0];
            if (i4 > 0) {
                Math.hypot(d6 - d4, d6 - d5);
            }
            i4++;
            d4 = d6;
        }
    }

    @Override // q.b
    public double c(double d4, int i4) {
        double[] dArr = this.f10174d;
        int length = dArr.length;
        int i5 = 0;
        if (d4 <= dArr[0]) {
            return this.f10175e[0][i4];
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            return this.f10175e[i6][i4];
        }
        while (i5 < i6) {
            double[] dArr2 = this.f10174d;
            double d5 = dArr2[i5];
            if (d4 == d5) {
                return this.f10175e[i5][i4];
            }
            int i7 = i5 + 1;
            double d6 = dArr2[i7];
            if (d4 < d6) {
                double d7 = (d4 - d5) / (d6 - d5);
                double[][] dArr3 = this.f10175e;
                return (dArr3[i5][i4] * (1.0d - d7)) + (dArr3[i7][i4] * d7);
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // q.b
    public void d(double d4, double[] dArr) {
        double[] dArr2 = this.f10174d;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f10175e[0].length;
        if (d4 <= dArr2[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                dArr[i5] = this.f10175e[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr2[i6]) {
            while (i4 < length2) {
                dArr[i4] = this.f10175e[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10174d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f10175e[i7][i8];
                }
            }
            double[] dArr3 = this.f10174d;
            int i9 = i7 + 1;
            double d5 = dArr3[i9];
            if (d4 < d5) {
                double d6 = dArr3[i7];
                double d7 = (d4 - d6) / (d5 - d6);
                while (i4 < length2) {
                    double[][] dArr4 = this.f10175e;
                    dArr[i4] = (dArr4[i7][i4] * (1.0d - d7)) + (dArr4[i9][i4] * d7);
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // q.b
    public void e(double d4, float[] fArr) {
        double[] dArr = this.f10174d;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f10175e[0].length;
        if (d4 <= dArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = (float) this.f10175e[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            while (i4 < length2) {
                fArr[i4] = (float) this.f10175e[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10174d[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f10175e[i7][i8];
                }
            }
            double[] dArr2 = this.f10174d;
            int i9 = i7 + 1;
            double d5 = dArr2[i9];
            if (d4 < d5) {
                double d6 = dArr2[i7];
                double d7 = (d4 - d6) / (d5 - d6);
                while (i4 < length2) {
                    double[][] dArr3 = this.f10175e;
                    fArr[i4] = (float) ((dArr3[i7][i4] * (1.0d - d7)) + (dArr3[i9][i4] * d7));
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // q.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f10174d
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f10174d
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f10175e
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.f(double, int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // q.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f10174d
            int r1 = r0.length
            double[][] r2 = r12.f10175e
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f10174d
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f10175e
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.g(double, double[]):void");
    }

    @Override // q.b
    public double[] h() {
        return this.f10174d;
    }

    public final double i(double d4) {
        if (Double.isNaN(this.f10176f)) {
            return 0.0d;
        }
        double[] dArr = this.f10174d;
        int length = dArr.length;
        if (d4 <= dArr[0]) {
            return 0.0d;
        }
        int i4 = length - 1;
        if (d4 >= dArr[i4]) {
            return this.f10176f;
        }
        double dHypot = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        int i5 = 0;
        while (i5 < i4) {
            double[] dArr2 = this.f10175e[i5];
            double d7 = dArr2[0];
            double d8 = dArr2[1];
            if (i5 > 0) {
                dHypot += Math.hypot(d7 - d5, d8 - d6);
            }
            double[] dArr3 = this.f10174d;
            double d9 = dArr3[i5];
            if (d4 == d9) {
                return dHypot;
            }
            int i6 = i5 + 1;
            double d10 = dArr3[i6];
            if (d4 < d10) {
                double d11 = (d4 - d9) / (d10 - d9);
                double[][] dArr4 = this.f10175e;
                double[] dArr5 = dArr4[i5];
                double d12 = dArr5[0];
                double[] dArr6 = dArr4[i6];
                double d13 = 1.0d - d11;
                return dHypot + Math.hypot(d8 - ((dArr5[1] * d13) + (dArr6[1] * d11)), d7 - ((d12 * d13) + (dArr6[0] * d11)));
            }
            i5 = i6;
            d5 = d7;
            d6 = d8;
        }
        return 0.0d;
    }
}
