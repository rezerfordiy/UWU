package r;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10726f = "SplineSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q.b f10727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10728b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f10729c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10731e;

    public static class a extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setAlpha(a(f4));
        }
    }

    public static class b extends t {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f10732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f10733h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f10734i;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f10732g = str.split(",")[1];
            this.f10733h = sparseArray;
        }

        @Override // r.t
        public void f(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // r.t
        public void g(View view, float f4) {
            this.f10727a.e(f4, this.f10734i);
            this.f10733h.valueAt(0).m(view, this.f10734i);
        }

        @Override // r.t
        public void i(int i4) {
            int size = this.f10733h.size();
            int iG = this.f10733h.valueAt(0).g();
            double[] dArr = new double[size];
            this.f10734i = new float[iG];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iG);
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f10733h.keyAt(i5);
                androidx.constraintlayout.widget.a aVarValueAt = this.f10733h.valueAt(i5);
                dArr[i5] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.f(this.f10734i);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f10734i.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f10727a = q.b.a(i4, dArr, dArr2);
        }

        public void j(int i4, androidx.constraintlayout.widget.a aVar) {
            this.f10733h.append(i4, aVar);
        }
    }

    public static class c extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setElevation(a(f4));
        }
    }

    public static class d extends t {
        @Override // r.t
        public void g(View view, float f4) {
        }

        public void j(View view, float f4, double d4, double d5) {
            view.setRotation(a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    public static class e extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setPivotX(a(f4));
        }
    }

    public static class f extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setPivotY(a(f4));
        }
    }

    public static class g extends t {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f10735g = false;

        @Override // r.t
        public void g(View view, float f4) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f4));
                return;
            }
            if (this.f10735g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f10735g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f4)));
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    Log.e("SplineSet", "unable to setProgress", e4);
                }
            }
        }
    }

    public static class h extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setRotation(a(f4));
        }
    }

    public static class i extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setRotationX(a(f4));
        }
    }

    public static class j extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setRotationY(a(f4));
        }
    }

    public static class k extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setScaleX(a(f4));
        }
    }

    public static class l extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setScaleY(a(f4));
        }
    }

    public static class m {
        public static void a(int[] iArr, float[] fArr, int i4, int i5) {
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

        public static int b(int[] iArr, float[] fArr, int i4, int i5) {
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

        public static void c(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    public static class n extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setTranslationX(a(f4));
        }
    }

    public static class o extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setTranslationY(a(f4));
        }
    }

    public static class p extends t {
        @Override // r.t
        public void g(View view, float f4) {
            view.setTranslationZ(a(f4));
        }
    }

    public static t d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static t e(String str) {
        str.hashCode();
        switch (str) {
        }
        return new a();
    }

    public float a(float f4) {
        return (float) this.f10727a.c(f4, 0);
    }

    public q.b b() {
        return this.f10727a;
    }

    public float c(float f4) {
        return (float) this.f10727a.f(f4, 0);
    }

    public void f(int i4, float f4) {
        int[] iArr = this.f10728b;
        if (iArr.length < this.f10730d + 1) {
            this.f10728b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f10729c;
            this.f10729c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f10728b;
        int i5 = this.f10730d;
        iArr2[i5] = i4;
        this.f10729c[i5] = f4;
        this.f10730d = i5 + 1;
    }

    public abstract void g(View view, float f4);

    public void h(String str) {
        this.f10731e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r10) {
        /*
            r9 = this;
            int r0 = r9.f10730d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f10728b
            float[] r2 = r9.f10729c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            r.t.m.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f10730d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f10728b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            int[] r1 = new int[]{r1, r3}
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L34:
            int r5 = r9.f10730d
            if (r2 >= r5) goto L60
            if (r2 <= 0) goto L45
            int[] r5 = r9.f10728b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L45
            goto L5d
        L45:
            int[] r5 = r9.f10728b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f10729c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L5d:
            int r2 = r2 + 1
            goto L34
        L60:
            q.b r10 = q.b.a(r10, r0, r1)
            r9.f10727a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.t.i(int):void");
    }

    public String toString() {
        String str = this.f10731e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f10730d; i4++) {
            str = str + "[" + this.f10728b[i4] + " , " + decimalFormat.format(this.f10729c[i4]) + "] ";
        }
        return str;
    }
}
