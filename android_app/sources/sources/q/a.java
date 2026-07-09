package q;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10109f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10110g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10111h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10112i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10113j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f10114k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f10115l = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f10116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0099a[] f10117e;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    public static class C0099a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f10118s = "Arc";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static double[] f10119t = new double[91];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final double f10120u = 0.001d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f10121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f10122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f10123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f10124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f10125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f10126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f10127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f10128h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f10129i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f10130j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f10131k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f10132l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f10133m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f10134n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f10135o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f10136p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f10137q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f10138r;

        public C0099a(int i4, double d4, double d5, double d6, double d7, double d8, double d9) {
            this.f10138r = false;
            this.f10137q = i4 == 1;
            this.f10123c = d4;
            this.f10124d = d5;
            this.f10129i = 1.0d / (d5 - d4);
            if (3 == i4) {
                this.f10138r = true;
            }
            double d10 = d8 - d6;
            double d11 = d9 - d7;
            if (!this.f10138r && Math.abs(d10) >= 0.001d && Math.abs(d11) >= 0.001d) {
                this.f10121a = new double[101];
                boolean z3 = this.f10137q;
                this.f10130j = d10 * ((double) (z3 ? -1 : 1));
                this.f10131k = d11 * ((double) (z3 ? 1 : -1));
                this.f10132l = z3 ? d8 : d6;
                this.f10133m = z3 ? d7 : d9;
                a(d6, d7, d8, d9);
                this.f10134n = this.f10122b * this.f10129i;
                return;
            }
            this.f10138r = true;
            this.f10125e = d6;
            this.f10126f = d8;
            this.f10127g = d7;
            this.f10128h = d9;
            double dHypot = Math.hypot(d11, d10);
            this.f10122b = dHypot;
            this.f10134n = dHypot * this.f10129i;
            double d12 = this.f10124d;
            double d13 = this.f10123c;
            this.f10132l = d10 / (d12 - d13);
            this.f10133m = d11 / (d12 - d13);
        }

        public final void a(double d4, double d5, double d6, double d7) {
            double dHypot;
            double d8 = d6 - d4;
            double d9 = d5 - d7;
            int i4 = 0;
            double d10 = 0.0d;
            double d11 = 0.0d;
            double d12 = 0.0d;
            while (true) {
                if (i4 >= f10119t.length) {
                    break;
                }
                double d13 = d10;
                double radians = Math.toRadians((((double) i4) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d8;
                double dCos = Math.cos(radians) * d9;
                if (i4 > 0) {
                    dHypot = Math.hypot(dSin - d11, dCos - d12) + d13;
                    f10119t[i4] = dHypot;
                } else {
                    dHypot = d13;
                }
                i4++;
                d12 = dCos;
                d10 = dHypot;
                d11 = dSin;
            }
            double d14 = d10;
            this.f10122b = d14;
            int i5 = 0;
            while (true) {
                double[] dArr = f10119t;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / d14;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.f10121a.length) {
                    return;
                }
                double length = ((double) i6) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f10119t, length);
                if (iBinarySearch >= 0) {
                    this.f10121a[i6] = iBinarySearch / (f10119t.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f10121a[i6] = 0.0d;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    double[] dArr2 = f10119t;
                    double d15 = dArr2[i8];
                    this.f10121a[i6] = (((double) i8) + ((length - d15) / (dArr2[i7 - 1] - d15))) / ((double) (dArr2.length - 1));
                }
                i6++;
            }
        }

        public double b() {
            double d4 = this.f10130j * this.f10136p;
            double dHypot = this.f10134n / Math.hypot(d4, (-this.f10131k) * this.f10135o);
            if (this.f10137q) {
                d4 = -d4;
            }
            return d4 * dHypot;
        }

        public double c() {
            double d4 = this.f10130j * this.f10136p;
            double d5 = (-this.f10131k) * this.f10135o;
            double dHypot = this.f10134n / Math.hypot(d4, d5);
            return this.f10137q ? (-d5) * dHypot : d5 * dHypot;
        }

        public double d(double d4) {
            return this.f10132l;
        }

        public double e(double d4) {
            return this.f10133m;
        }

        public double f(double d4) {
            double d5 = (d4 - this.f10123c) * this.f10129i;
            double d6 = this.f10125e;
            return d6 + (d5 * (this.f10126f - d6));
        }

        public double g(double d4) {
            double d5 = (d4 - this.f10123c) * this.f10129i;
            double d6 = this.f10127g;
            return d6 + (d5 * (this.f10128h - d6));
        }

        public double h() {
            return this.f10132l + (this.f10130j * this.f10135o);
        }

        public double i() {
            return this.f10133m + (this.f10131k * this.f10136p);
        }

        public double j(double d4) {
            if (d4 <= 0.0d) {
                return 0.0d;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f10121a;
            double length = d4 * ((double) (dArr.length - 1));
            int i4 = (int) length;
            double d5 = length - ((double) i4);
            double d6 = dArr[i4];
            return d6 + (d5 * (dArr[i4 + 1] - d6));
        }

        public void k(double d4) {
            double dJ = j((this.f10137q ? this.f10124d - d4 : d4 - this.f10123c) * this.f10129i) * 1.5707963267948966d;
            this.f10135o = Math.sin(dJ);
            this.f10136p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f10116d = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            q.a$a[] r2 = new q.a.C0099a[r2]
            r0.f10117e = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            q.a$a[] r7 = r0.f10117e
            int r8 = r7.length
            if (r4 >= r8) goto L4d
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            r10 = 2
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            q.a$a r22 = new q.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.<init>(int[], double[], double[][]):void");
    }

    @Override // q.b
    public double c(double d4, int i4) {
        C0099a[] c0099aArr = this.f10117e;
        int i5 = 0;
        double d5 = c0099aArr[0].f10123c;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > c0099aArr[c0099aArr.length - 1].f10124d) {
            d4 = c0099aArr[c0099aArr.length - 1].f10124d;
        }
        while (true) {
            C0099a[] c0099aArr2 = this.f10117e;
            if (i5 >= c0099aArr2.length) {
                return Double.NaN;
            }
            C0099a c0099a = c0099aArr2[i5];
            if (d4 <= c0099a.f10124d) {
                if (c0099a.f10138r) {
                    return i4 == 0 ? c0099a.f(d4) : c0099a.g(d4);
                }
                c0099a.k(d4);
                C0099a[] c0099aArr3 = this.f10117e;
                return i4 == 0 ? c0099aArr3[i5].h() : c0099aArr3[i5].i();
            }
            i5++;
        }
    }

    @Override // q.b
    public void d(double d4, double[] dArr) {
        C0099a[] c0099aArr = this.f10117e;
        double d5 = c0099aArr[0].f10123c;
        if (d4 < d5) {
            d4 = d5;
        }
        if (d4 > c0099aArr[c0099aArr.length - 1].f10124d) {
            d4 = c0099aArr[c0099aArr.length - 1].f10124d;
        }
        int i4 = 0;
        while (true) {
            C0099a[] c0099aArr2 = this.f10117e;
            if (i4 >= c0099aArr2.length) {
                return;
            }
            C0099a c0099a = c0099aArr2[i4];
            if (d4 <= c0099a.f10124d) {
                if (c0099a.f10138r) {
                    dArr[0] = c0099a.f(d4);
                    dArr[1] = this.f10117e[i4].g(d4);
                    return;
                } else {
                    c0099a.k(d4);
                    dArr[0] = this.f10117e[i4].h();
                    dArr[1] = this.f10117e[i4].i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // q.b
    public void e(double d4, float[] fArr) {
        C0099a[] c0099aArr = this.f10117e;
        double d5 = c0099aArr[0].f10123c;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > c0099aArr[c0099aArr.length - 1].f10124d) {
            d4 = c0099aArr[c0099aArr.length - 1].f10124d;
        }
        int i4 = 0;
        while (true) {
            C0099a[] c0099aArr2 = this.f10117e;
            if (i4 >= c0099aArr2.length) {
                return;
            }
            C0099a c0099a = c0099aArr2[i4];
            if (d4 <= c0099a.f10124d) {
                if (c0099a.f10138r) {
                    fArr[0] = (float) c0099a.f(d4);
                    fArr[1] = (float) this.f10117e[i4].g(d4);
                    return;
                } else {
                    c0099a.k(d4);
                    fArr[0] = (float) this.f10117e[i4].h();
                    fArr[1] = (float) this.f10117e[i4].i();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // q.b
    public double f(double d4, int i4) {
        C0099a[] c0099aArr = this.f10117e;
        int i5 = 0;
        double d5 = c0099aArr[0].f10123c;
        if (d4 < d5) {
            d4 = d5;
        }
        if (d4 > c0099aArr[c0099aArr.length - 1].f10124d) {
            d4 = c0099aArr[c0099aArr.length - 1].f10124d;
        }
        while (true) {
            C0099a[] c0099aArr2 = this.f10117e;
            if (i5 >= c0099aArr2.length) {
                return Double.NaN;
            }
            C0099a c0099a = c0099aArr2[i5];
            if (d4 <= c0099a.f10124d) {
                if (c0099a.f10138r) {
                    return i4 == 0 ? c0099a.d(d4) : c0099a.e(d4);
                }
                c0099a.k(d4);
                C0099a[] c0099aArr3 = this.f10117e;
                return i4 == 0 ? c0099aArr3[i5].b() : c0099aArr3[i5].c();
            }
            i5++;
        }
    }

    @Override // q.b
    public void g(double d4, double[] dArr) {
        C0099a[] c0099aArr = this.f10117e;
        double d5 = c0099aArr[0].f10123c;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > c0099aArr[c0099aArr.length - 1].f10124d) {
            d4 = c0099aArr[c0099aArr.length - 1].f10124d;
        }
        int i4 = 0;
        while (true) {
            C0099a[] c0099aArr2 = this.f10117e;
            if (i4 >= c0099aArr2.length) {
                return;
            }
            C0099a c0099a = c0099aArr2[i4];
            if (d4 <= c0099a.f10124d) {
                if (c0099a.f10138r) {
                    dArr[0] = c0099a.d(d4);
                    dArr[1] = this.f10117e[i4].e(d4);
                    return;
                } else {
                    c0099a.k(d4);
                    dArr[0] = this.f10117e[i4].b();
                    dArr[1] = this.f10117e[i4].c();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // q.b
    public double[] h() {
        return this.f10116d;
    }
}
