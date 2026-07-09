package r;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10736k = "SplineSet";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f10737l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f10738m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f10739n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static float f10740o = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q.b f10741a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10746f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10749i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10742b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10743c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f10744d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f10747g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10748h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10750j = Float.NaN;

    public static class a extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setAlpha(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class b extends u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f10751p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f10752q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public SparseArray<float[]> f10753r = new SparseArray<>();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float[] f10754s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f10755t;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f10751p = str.split(",")[1];
            this.f10752q = sparseArray;
        }

        @Override // r.u
        public void f(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            this.f10741a.e(f4, this.f10754s);
            float[] fArr = this.f10754s;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f10749i;
            if (Float.isNaN(this.f10750j)) {
                float fA = gVar.a(view, this.f10751p, 0);
                this.f10750j = fA;
                if (Float.isNaN(fA)) {
                    this.f10750j = 0.0f;
                }
            }
            float f7 = (float) ((((double) this.f10750j) + ((j5 * 1.0E-9d) * ((double) f5))) % 1.0d);
            this.f10750j = f7;
            this.f10749i = j4;
            float fA2 = a(f7);
            this.f10748h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f10755t;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z3 = this.f10748h;
                float f8 = this.f10754s[i4];
                this.f10748h = z3 | (((double) f8) != 0.0d);
                fArr2[i4] = (f8 * fA2) + f6;
                i4++;
            }
            this.f10752q.valueAt(0).m(view, this.f10755t);
            if (f5 != 0.0f) {
                this.f10748h = true;
            }
            return this.f10748h;
        }

        @Override // r.u
        public void j(int i4) {
            int size = this.f10752q.size();
            int iG = this.f10752q.valueAt(0).g();
            double[] dArr = new double[size];
            int i5 = iG + 2;
            this.f10754s = new float[i5];
            this.f10755t = new float[iG];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.f10752q.keyAt(i6);
                androidx.constraintlayout.widget.a aVarValueAt = this.f10752q.valueAt(i6);
                float[] fArrValueAt = this.f10753r.valueAt(i6);
                dArr[i6] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.f(this.f10754s);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f10754s.length) {
                        dArr2[i6][i7] = r7[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[iG] = fArrValueAt[0];
                dArr3[iG + 1] = fArrValueAt[1];
            }
            this.f10741a = q.b.a(i4, dArr, dArr2);
        }

        public void k(int i4, androidx.constraintlayout.widget.a aVar, float f4, int i5, float f5) {
            this.f10752q.append(i4, aVar);
            this.f10753r.append(i4, new float[]{f4, f5});
            this.f10742b = Math.max(this.f10742b, i5);
        }
    }

    public static class c extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setElevation(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class d extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            return this.f10748h;
        }

        public boolean k(View view, r.g gVar, float f4, long j4, double d4, double d5) {
            view.setRotation(b(f4, j4, view, gVar) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
            return this.f10748h;
        }
    }

    public static class e extends u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10756p = false;

        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(b(f4, j4, view, gVar));
            } else {
                if (this.f10756p) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f10756p = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(b(f4, j4, view, gVar)));
                    } catch (IllegalAccessException | InvocationTargetException e4) {
                        Log.e("SplineSet", "unable to setProgress", e4);
                    }
                }
            }
            return this.f10748h;
        }
    }

    public static class f extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setRotation(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class g extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setRotationX(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class h extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setRotationY(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class i extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setScaleX(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class j extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setScaleY(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class k {
        public static void a(int[] iArr, float[][] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = i6 - 1;
                int i8 = iArr2[i7];
                i6 = i7 - 1;
                int i9 = iArr2[i6];
                if (i8 < i9) {
                    int iB = b(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iB - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iB + 1;
                }
            }
        }

        public static int b(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, i7, i5);
            return i7;
        }

        public static void c(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    public static class l extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setTranslationX(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class m extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setTranslationY(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static class n extends u {
        @Override // r.u
        public boolean g(View view, float f4, long j4, r.g gVar) {
            view.setTranslationZ(b(f4, j4, view, gVar));
            return this.f10748h;
        }
    }

    public static u d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static u e(String str, long j4) {
        u gVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new l();
                break;
            case "translationY":
                gVar = new m();
                break;
            case "translationZ":
                gVar = new n();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.h(j4);
        return gVar;
    }

    public float a(float f4) {
        float fAbs;
        switch (this.f10742b) {
            case 1:
                return Math.signum(f4 * f10740o);
            case 2:
                fAbs = Math.abs(f4);
                break;
            case 3:
                return (((f4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f4 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f4 * f10740o);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f4 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f4 * f10740o);
        }
        return 1.0f - fAbs;
    }

    public float b(float f4, long j4, View view, r.g gVar) {
        this.f10741a.e(f4, this.f10747g);
        float[] fArr = this.f10747g;
        float f5 = fArr[1];
        if (f5 == 0.0f) {
            this.f10748h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f10750j)) {
            float fA = gVar.a(view, this.f10746f, 0);
            this.f10750j = fA;
            if (Float.isNaN(fA)) {
                this.f10750j = 0.0f;
            }
        }
        float f6 = (float) ((((double) this.f10750j) + (((j4 - this.f10749i) * 1.0E-9d) * ((double) f5))) % 1.0d);
        this.f10750j = f6;
        gVar.b(view, this.f10746f, 0, f6);
        this.f10749i = j4;
        float f7 = this.f10747g[0];
        float fA2 = (a(this.f10750j) * f7) + this.f10747g[2];
        this.f10748h = (f7 == 0.0f && f5 == 0.0f) ? false : true;
        return fA2;
    }

    public q.b c() {
        return this.f10741a;
    }

    public void f(int i4, float f4, float f5, int i5, float f6) {
        int[] iArr = this.f10743c;
        int i6 = this.f10745e;
        iArr[i6] = i4;
        float[] fArr = this.f10744d[i6];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        this.f10742b = Math.max(this.f10742b, i5);
        this.f10745e++;
    }

    public abstract boolean g(View view, float f4, long j4, r.g gVar);

    public void h(long j4) {
        this.f10749i = j4;
    }

    public void i(String str) {
        this.f10746f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r12) {
        /*
            r11 = this;
            int r0 = r11.f10745e
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Error no points added to "
            r12.append(r0)
            java.lang.String r0 = r11.f10746f
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r12)
            return
        L1d:
            int[] r1 = r11.f10743c
            float[][] r2 = r11.f10744d
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            r.u.k.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.f10743c
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 3
            int[] r1 = new int[]{r1, r2}
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r5 = r2
        L4f:
            int r6 = r11.f10745e
            if (r2 >= r6) goto L88
            if (r2 <= 0) goto L60
            int[] r6 = r11.f10743c
            r7 = r6[r2]
            int r8 = r2 + (-1)
            r6 = r6[r8]
            if (r7 != r6) goto L60
            goto L85
        L60:
            int[] r6 = r11.f10743c
            r6 = r6[r2]
            double r6 = (double) r6
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r6 = r6 * r8
            r0[r5] = r6
            r6 = r1[r5]
            float[][] r7 = r11.f10744d
            r7 = r7[r2]
            r8 = r7[r4]
            double r8 = (double) r8
            r6[r4] = r8
            r8 = r7[r3]
            double r8 = (double) r8
            r6[r3] = r8
            r8 = 2
            r7 = r7[r8]
            double r9 = (double) r7
            r6[r8] = r9
            int r5 = r5 + 1
        L85:
            int r2 = r2 + 1
            goto L4f
        L88:
            q.b r12 = q.b.a(r12, r0, r1)
            r11.f10741a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.u.j(int):void");
    }

    public String toString() {
        String str = this.f10746f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f10745e; i4++) {
            str = str + "[" + this.f10743c[i4] + " , " + decimalFormat.format(this.f10744d[i4]) + "] ";
        }
        return str;
    }
}
