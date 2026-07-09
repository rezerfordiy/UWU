package q;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10140b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10141c = 2;

    public static class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f10142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f10143e;

        public a(double d4, double[] dArr) {
            this.f10142d = d4;
            this.f10143e = dArr;
        }

        @Override // q.b
        public double c(double d4, int i4) {
            return this.f10143e[i4];
        }

        @Override // q.b
        public void d(double d4, double[] dArr) {
            double[] dArr2 = this.f10143e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // q.b
        public void e(double d4, float[] fArr) {
            int i4 = 0;
            while (true) {
                double[] dArr = this.f10143e;
                if (i4 >= dArr.length) {
                    return;
                }
                fArr[i4] = (float) dArr[i4];
                i4++;
            }
        }

        @Override // q.b
        public double f(double d4, int i4) {
            return 0.0d;
        }

        @Override // q.b
        public void g(double d4, double[] dArr) {
            for (int i4 = 0; i4 < this.f10143e.length; i4++) {
                dArr[i4] = 0.0d;
            }
        }

        @Override // q.b
        public double[] h() {
            return new double[]{this.f10142d};
        }
    }

    public static b a(int i4, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i4 = 2;
        }
        return i4 != 0 ? i4 != 2 ? new e(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new f(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new q.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d4, int i4);

    public abstract void d(double d4, double[] dArr);

    public abstract void e(double d4, float[] fArr);

    public abstract double f(double d4, int i4);

    public abstract void g(double d4, double[] dArr);

    public abstract double[] h();
}
