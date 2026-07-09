package r;

import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import c.j0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r implements Comparable<r> {
    public static final int A = 2;
    public static final int B = 3;
    public static String[] C = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f10701q = "MotionPaths";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f10702r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f10703s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f10704t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f10705u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f10706v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f10707w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f10708x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f10709y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f10710z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q.c f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f10722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double[] f10724o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f10725p;

    public r() {
        this.f10712c = 0;
        this.f10719j = Float.NaN;
        this.f10720k = Float.NaN;
        this.f10721l = e.f10497f;
        this.f10722m = new LinkedHashMap<>();
        this.f10723n = 0;
        this.f10724o = new double[18];
        this.f10725p = new double[18];
    }

    public static final float r(float f4, float f5, float f6, float f7, float f8, float f9) {
        return (((f8 - f6) * f5) - ((f9 - f7) * f4)) + f6;
    }

    public static final float s(float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((f8 - f6) * f4) + ((f9 - f7) * f5) + f7;
    }

    public void a(d.a aVar) {
        this.f10711b = q.c.c(aVar.f2464c.f2540c);
        d.c cVar = aVar.f2464c;
        this.f10721l = cVar.f2541d;
        this.f10719j = cVar.f2544g;
        this.f10712c = cVar.f2542e;
        this.f10720k = aVar.f2463b.f2549e;
        for (String str : aVar.f2467f.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f2467f.get(str);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.f10722m.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@j0 r rVar) {
        return Float.compare(this.f10714e, rVar.f10714e);
    }

    public final boolean c(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    public void d(r rVar, boolean[] zArr, String[] strArr, boolean z3) {
        zArr[0] = zArr[0] | c(this.f10714e, rVar.f10714e);
        zArr[1] = zArr[1] | c(this.f10715f, rVar.f10715f) | z3;
        zArr[2] = z3 | c(this.f10716g, rVar.f10716g) | zArr[2];
        zArr[3] = zArr[3] | c(this.f10717h, rVar.f10717h);
        zArr[4] = c(this.f10718i, rVar.f10718i) | zArr[4];
    }

    public void e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f10714e, this.f10715f, this.f10716g, this.f10717h, this.f10718i, this.f10719j};
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 < 6) {
                dArr[i4] = fArr[r4];
                i4++;
            }
        }
    }

    public void f(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f10717h;
        float f5 = this.f10718i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f6 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 3) {
                f4 = f6;
            } else if (i6 == 4) {
                f5 = f6;
            }
        }
        fArr[i4] = f4;
        fArr[i4 + 1] = f5;
    }

    public void g(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f10715f;
        float f5 = this.f10716g;
        float f6 = this.f10717h;
        float f7 = this.f10718i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        fArr[i4] = f4 + (f6 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f5 + (f7 / 2.0f) + 0.0f;
    }

    public int h(String str, double[] dArr, int i4) {
        androidx.constraintlayout.widget.a aVar = this.f10722m.get(str);
        if (aVar.g() == 1) {
            dArr[i4] = aVar.e();
            return 1;
        }
        int iG = aVar.g();
        aVar.f(new float[iG]);
        int i5 = 0;
        while (i5 < iG) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return iG;
    }

    public int i(String str) {
        return this.f10722m.get(str).g();
    }

    public void j(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f10715f;
        float f5 = this.f10716g;
        float f6 = this.f10717h;
        float f7 = this.f10718i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f8;
            } else if (i6 == 2) {
                f5 = f8;
            } else if (i6 == 3) {
                f6 = f8;
            } else if (i6 == 4) {
                f7 = f8;
            }
        }
        float f9 = f6 + f4;
        float f10 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i7 = i4 + 1;
        fArr[i4] = f4 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f5 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f9 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f5 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f9 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f10 + 0.0f;
        fArr[i12] = f4 + 0.0f;
        fArr[i12 + 1] = f10 + 0.0f;
    }

    public boolean k(String str) {
        return this.f10722m.containsKey(str);
    }

    public void l(k kVar, r rVar, r rVar2) {
        float f4 = kVar.f10516a / 100.0f;
        this.f10713d = f4;
        this.f10712c = kVar.C;
        float f5 = Float.isNaN(kVar.D) ? f4 : kVar.D;
        float f6 = Float.isNaN(kVar.E) ? f4 : kVar.E;
        float f7 = rVar2.f10717h;
        float f8 = rVar.f10717h;
        float f9 = rVar2.f10718i;
        float f10 = rVar.f10718i;
        this.f10714e = this.f10713d;
        float f11 = rVar.f10715f;
        float f12 = rVar.f10716g;
        float f13 = (rVar2.f10715f + (f7 / 2.0f)) - ((f8 / 2.0f) + f11);
        float f14 = (rVar2.f10716g + (f9 / 2.0f)) - (f12 + (f10 / 2.0f));
        float f15 = ((f7 - f8) * f5) / 2.0f;
        this.f10715f = (int) ((f11 + (f13 * f4)) - f15);
        float f16 = ((f9 - f10) * f6) / 2.0f;
        this.f10716g = (int) ((f12 + (f14 * f4)) - f16);
        this.f10717h = (int) (f8 + r9);
        this.f10718i = (int) (f10 + r12);
        float f17 = Float.isNaN(kVar.F) ? f4 : kVar.F;
        float f18 = Float.isNaN(kVar.I) ? 0.0f : kVar.I;
        if (!Float.isNaN(kVar.G)) {
            f4 = kVar.G;
        }
        float f19 = Float.isNaN(kVar.H) ? 0.0f : kVar.H;
        this.f10723n = 2;
        this.f10715f = (int) (((rVar.f10715f + (f17 * f13)) + (f19 * f14)) - f15);
        this.f10716g = (int) (((rVar.f10716g + (f13 * f18)) + (f14 * f4)) - f16);
        this.f10711b = q.c.c(kVar.A);
        this.f10721l = kVar.B;
    }

    public void m(k kVar, r rVar, r rVar2) {
        float f4 = kVar.f10516a / 100.0f;
        this.f10713d = f4;
        this.f10712c = kVar.C;
        float f5 = Float.isNaN(kVar.D) ? f4 : kVar.D;
        float f6 = Float.isNaN(kVar.E) ? f4 : kVar.E;
        float f7 = rVar2.f10717h - rVar.f10717h;
        float f8 = rVar2.f10718i - rVar.f10718i;
        this.f10714e = this.f10713d;
        if (!Float.isNaN(kVar.F)) {
            f4 = kVar.F;
        }
        float f9 = rVar.f10715f;
        float f10 = rVar.f10717h;
        float f11 = rVar.f10716g;
        float f12 = rVar.f10718i;
        float f13 = (rVar2.f10715f + (rVar2.f10717h / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (rVar2.f10716g + (rVar2.f10718i / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f4;
        float f16 = (f7 * f5) / 2.0f;
        this.f10715f = (int) ((f9 + f15) - f16);
        float f17 = f4 * f14;
        float f18 = (f8 * f6) / 2.0f;
        this.f10716g = (int) ((f11 + f17) - f18);
        this.f10717h = (int) (f10 + r7);
        this.f10718i = (int) (f12 + r8);
        float f19 = Float.isNaN(kVar.G) ? 0.0f : kVar.G;
        this.f10723n = 1;
        float f20 = (int) ((rVar.f10715f + f15) - f16);
        float f21 = (int) ((rVar.f10716g + f17) - f18);
        this.f10715f = f20 + ((-f14) * f19);
        this.f10716g = f21 + (f13 * f19);
        this.f10711b = q.c.c(kVar.A);
        this.f10721l = kVar.B;
    }

    public void n(int i4, int i5, k kVar, r rVar, r rVar2) {
        float f4 = kVar.f10516a / 100.0f;
        this.f10713d = f4;
        this.f10712c = kVar.C;
        float f5 = Float.isNaN(kVar.D) ? f4 : kVar.D;
        float f6 = Float.isNaN(kVar.E) ? f4 : kVar.E;
        float f7 = rVar2.f10717h;
        float f8 = rVar.f10717h;
        float f9 = rVar2.f10718i;
        float f10 = rVar.f10718i;
        this.f10714e = this.f10713d;
        float f11 = rVar.f10715f;
        float f12 = rVar.f10716g;
        float f13 = rVar2.f10715f + (f7 / 2.0f);
        float f14 = rVar2.f10716g + (f9 / 2.0f);
        float f15 = (f7 - f8) * f5;
        this.f10715f = (int) ((f11 + ((f13 - ((f8 / 2.0f) + f11)) * f4)) - (f15 / 2.0f));
        float f16 = (f9 - f10) * f6;
        this.f10716g = (int) ((f12 + ((f14 - (f12 + (f10 / 2.0f))) * f4)) - (f16 / 2.0f));
        this.f10717h = (int) (f8 + f15);
        this.f10718i = (int) (f10 + f16);
        this.f10723n = 3;
        if (!Float.isNaN(kVar.F)) {
            this.f10715f = (int) (kVar.F * ((int) (i4 - this.f10717h)));
        }
        if (!Float.isNaN(kVar.G)) {
            this.f10716g = (int) (kVar.G * ((int) (i5 - this.f10718i)));
        }
        this.f10711b = q.c.c(kVar.A);
        this.f10721l = kVar.B;
    }

    public void o(float f4, float f5, float f6, float f7) {
        this.f10715f = f4;
        this.f10716g = f5;
        this.f10717h = f6;
        this.f10718i = f7;
    }

    public void p(float f4, float f5, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f10 = (float) dArr[i4];
            double d4 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f6 = f10;
            } else if (i5 == 2) {
                f8 = f10;
            } else if (i5 == 3) {
                f7 = f10;
            } else if (i5 == 4) {
                f9 = f10;
            }
        }
        float f11 = f6 - ((0.0f * f7) / 2.0f);
        float f12 = f8 - ((0.0f * f9) / 2.0f);
        fArr[0] = (f11 * (1.0f - f4)) + (((f7 * 1.0f) + f11) * f4) + 0.0f;
        fArr[1] = (f12 * (1.0f - f5)) + (((f9 * 1.0f) + f12) * f5) + 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.r.q(android.view.View, int[], double[], double[], double[]):void");
    }

    public r(int i4, int i5, k kVar, r rVar, r rVar2) {
        this.f10712c = 0;
        this.f10719j = Float.NaN;
        this.f10720k = Float.NaN;
        this.f10721l = e.f10497f;
        this.f10722m = new LinkedHashMap<>();
        this.f10723n = 0;
        this.f10724o = new double[18];
        this.f10725p = new double[18];
        int i6 = kVar.J;
        if (i6 == 1) {
            m(kVar, rVar, rVar2);
        } else if (i6 != 2) {
            l(kVar, rVar, rVar2);
        } else {
            n(i4, i5, kVar, rVar, rVar2);
        }
    }
}
