package w1;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static h f12605n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f12612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f12613h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12618m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12606a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12607b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12608c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12609d = 13;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12610e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12611f = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double[] f12614i = new double[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double[] f12615j = new double[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f12616k = new double[16];

    public static synchronized h b() {
        if (f12605n == null) {
            h hVar = new h();
            f12605n = hVar;
            hVar.a();
        }
        return f12605n;
    }

    public final void a() {
        if (this.f12612g != null) {
            return;
        }
        int i4 = this.f12610e;
        int i5 = this.f12611f;
        int i6 = this.f12609d;
        this.f12612g = new int[i4 * i5 * i6 * i6 * 3];
        this.f12613h = new int[i4 * i5 * 3];
        h(this.f12606a);
        for (int i7 = 0; i7 < this.f12610e; i7++) {
            for (int i8 = 0; i8 < this.f12611f; i8++) {
                g(i7, i8, this.f12606a);
            }
        }
        h(this.f12607b);
        for (int i9 = 0; i9 < this.f12610e; i9++) {
            for (int i10 = 0; i10 < this.f12611f; i10++) {
                g(i9, i10, this.f12607b);
            }
        }
        h(this.f12608c);
        for (int i11 = 0; i11 < this.f12610e; i11++) {
            for (int i12 = 0; i12 < this.f12611f; i12++) {
                g(i11, i12, this.f12608c);
            }
        }
    }

    public int c() {
        return this.f12609d;
    }

    public int[] d(int i4, int i5) {
        int i6 = this.f12609d;
        int[] iArr = new int[i6 * i6];
        System.arraycopy(this.f12612g, ((i4 * this.f12611f) + i5) * i6 * i6, iArr, 0, i6 * i6);
        return iArr;
    }

    public int[] e() {
        return this.f12612g;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[LOOP:3: B:33:0x00d8->B:35:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[LOOP:4: B:37:0x00ec->B:39:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[LOOP:5: B:41:0x00fe->B:43:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[EDGE_INSN: B:48:0x00cb->B:27:0x00cb BREAK  A[LOOP:2: B:18:0x00b6->B:26:0x00c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb A[EDGE_INSN: B:52:0x00eb->B:36:0x00eb BREAK  A[LOOP:3: B:33:0x00d8->B:35:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[EDGE_INSN: B:53:0x00fd->B:40:0x00fd BREAK  A[LOOP:4: B:37:0x00ec->B:39:0x00f1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.h.g(int, int, int):void");
    }

    public final void h(int i4) {
        f(this.f12614i, this.f12610e, 0.0d, 1.0d, 1.0d, 0.5d);
        f(this.f12615j, this.f12610e, 0.0d, 1.0d, 1.0d, 0.5d);
        double d4 = i4 == this.f12607b ? 8.0d : i4 == this.f12608c ? 6.0d : 10.0d;
        double d5 = 3.0d * d4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f12610e; i6++) {
            double[] dArr = this.f12614i;
            dArr[i6] = (dArr[i6] * (d5 - d4)) + d4;
            double[] dArr2 = this.f12615j;
            dArr2[i6] = d4 - (dArr2[i6] * (d4 - 1.0d));
        }
        while (true) {
            int i7 = this.f12611f;
            if (i5 >= i7) {
                this.f12617l = 127;
                this.f12618m = 4194304;
                return;
            } else {
                this.f12616k[i5] = (180.0d / ((double) i7)) * ((double) i5);
                i5++;
            }
        }
    }
}
