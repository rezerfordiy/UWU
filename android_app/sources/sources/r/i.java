package r;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10566h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q.b f10567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.widget.a f10569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10571e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10572f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<r> f10573g = new ArrayList<>();

    public class a implements Comparator<r> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(r rVar, r rVar2) {
            return Integer.compare(rVar.f10592a, rVar2.f10592a);
        }
    }

    public static class b extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setAlpha(a(f4));
        }
    }

    public static class c extends i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f10575i = new float[1];

        @Override // r.i
        public void g(View view, float f4) {
            this.f10575i[0] = a(f4);
            this.f10569c.m(view, this.f10575i);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f10576n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f10577o = "CycleOscillator";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10578a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f10580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double[] f10581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f10582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f10583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f10584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q.b f10586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double[] f10587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double[] f10588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f10589l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q.g f10579b = new q.g();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f10590m = new HashMap<>();

        public d(int i4, int i5, int i6) {
            this.f10585h = i4;
            this.f10578a = i5;
            this.f10579b.g(i4);
            this.f10580c = new float[i6];
            this.f10581d = new double[i6];
            this.f10582e = new float[i6];
            this.f10583f = new float[i6];
            this.f10584g = new float[i6];
        }

        public final androidx.constraintlayout.widget.a a(String str, a.b bVar) {
            if (!this.f10590m.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, bVar);
                this.f10590m.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f10590m.get(str);
            if (aVar2.d() == bVar) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.d().name());
        }

        public double b(float f4) {
            q.b bVar = this.f10586i;
            if (bVar != null) {
                double d4 = f4;
                bVar.g(d4, this.f10588k);
                this.f10586i.d(d4, this.f10587j);
            } else {
                double[] dArr = this.f10588k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d5 = f4;
            double dE = this.f10579b.e(d5);
            double d6 = this.f10579b.d(d5);
            double[] dArr2 = this.f10588k;
            return dArr2[0] + (dE * dArr2[1]) + (d6 * this.f10587j[1]);
        }

        public double c(float f4) {
            q.b bVar = this.f10586i;
            if (bVar != null) {
                bVar.d(f4, this.f10587j);
            } else {
                double[] dArr = this.f10587j;
                dArr[0] = this.f10583f[0];
                dArr[1] = this.f10580c[0];
            }
            return this.f10587j[0] + (this.f10579b.e(f4) * this.f10587j[1]);
        }

        public void d(int i4, int i5, float f4, float f5, float f6) {
            this.f10581d[i4] = ((double) i5) / 100.0d;
            this.f10582e[i4] = f4;
            this.f10583f[i4] = f5;
            this.f10580c[i4] = f6;
        }

        public void e(float f4) {
            this.f10589l = f4;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f10581d.length, 2);
            float[] fArr = this.f10580c;
            this.f10587j = new double[fArr.length + 1];
            this.f10588k = new double[fArr.length + 1];
            if (this.f10581d[0] > 0.0d) {
                this.f10579b.a(0.0d, this.f10582e[0]);
            }
            double[] dArr2 = this.f10581d;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f10579b.a(1.0d, this.f10582e[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                dArr[i4][0] = this.f10583f[i4];
                int i5 = 0;
                while (true) {
                    if (i5 < this.f10580c.length) {
                        dArr[i5][1] = r4[i5];
                        i5++;
                    }
                }
                this.f10579b.a(this.f10581d[i4], this.f10582e[i4]);
            }
            this.f10579b.f();
            double[] dArr3 = this.f10581d;
            this.f10586i = dArr3.length > 1 ? q.b.a(0, dArr3, dArr) : null;
        }
    }

    public static class e extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setElevation(a(f4));
        }
    }

    public static class f {
        public static int a(int[] iArr, float[] fArr, int i4, int i5) {
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

        public static void b(int[] iArr, float[] fArr, int i4, int i5) {
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
                    int iA = a(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iA - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iA + 1;
                }
            }
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

    public static class g {
        public static int a(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, fArr2, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, fArr2, i7, i5);
            return i7;
        }

        public static void b(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
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
                    int iA = a(iArr, fArr, fArr2, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = iA - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = iA + 1;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
            float f5 = fArr2[i4];
            fArr2[i4] = fArr2[i5];
            fArr2[i5] = f5;
        }
    }

    public static class h extends i {
        @Override // r.i
        public void g(View view, float f4) {
        }

        public void k(View view, float f4, double d4, double d5) {
            view.setRotation(a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* JADX INFO: renamed from: r.i$i, reason: collision with other inner class name */
    public static class C0105i extends i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f10591i = false;

        @Override // r.i
        public void g(View view, float f4) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f4));
                return;
            }
            if (this.f10591i) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f10591i = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f4)));
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    Log.e(i.f10566h, "unable to setProgress", e4);
                }
            }
        }
    }

    public static class j extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setRotation(a(f4));
        }
    }

    public static class k extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setRotationX(a(f4));
        }
    }

    public static class l extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setRotationY(a(f4));
        }
    }

    public static class m extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setScaleX(a(f4));
        }
    }

    public static class n extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setScaleY(a(f4));
        }
    }

    public static class o extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setTranslationX(a(f4));
        }
    }

    public static class p extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setTranslationY(a(f4));
        }
    }

    public static class q extends i {
        @Override // r.i
        public void g(View view, float f4) {
            view.setTranslationZ(a(f4));
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f10593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f10594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f10595d;

        public r(int i4, float f4, float f5, float f6) {
            this.f10592a = i4;
            this.f10593b = f6;
            this.f10594c = f5;
            this.f10595d = f4;
        }
    }

    public static i d(String str) {
        if (str.startsWith(r.e.f10515x)) {
            return new c();
        }
        switch (str) {
            case "rotationX":
                return new k();
            case "rotationY":
                return new l();
            case "translationX":
                return new o();
            case "translationY":
                return new p();
            case "translationZ":
                return new q();
            case "progress":
                return new C0105i();
            case "scaleX":
                return new m();
            case "scaleY":
                return new n();
            case "waveVariesBy":
                return new b();
            case "rotation":
                return new j();
            case "elevation":
                return new e();
            case "transitionPathRotate":
                return new h();
            case "alpha":
                return new b();
            case "waveOffset":
                return new b();
            default:
                return null;
        }
    }

    public float a(float f4) {
        return (float) this.f10568b.c(f4);
    }

    public q.b b() {
        return this.f10567a;
    }

    public float c(float f4) {
        return (float) this.f10568b.b(f4);
    }

    public void e(int i4, int i5, int i6, float f4, float f5, float f6) {
        this.f10573g.add(new r(i4, f4, f5, f6));
        if (i6 != -1) {
            this.f10572f = i6;
        }
        this.f10571e = i5;
    }

    public void f(int i4, int i5, int i6, float f4, float f5, float f6, androidx.constraintlayout.widget.a aVar) {
        this.f10573g.add(new r(i4, f4, f5, f6));
        if (i6 != -1) {
            this.f10572f = i6;
        }
        this.f10571e = i5;
        this.f10569c = aVar;
    }

    public abstract void g(View view, float f4);

    public void h(String str) {
        this.f10570d = str;
    }

    @TargetApi(19)
    public void i(float f4) {
        int size = this.f10573g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f10573g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.f10568b = new d(this.f10571e, this.f10572f, size);
        int i4 = 0;
        for (r rVar : this.f10573g) {
            float f5 = rVar.f10595d;
            dArr[i4] = ((double) f5) * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f6 = rVar.f10593b;
            dArr3[0] = f6;
            float f7 = rVar.f10594c;
            dArr3[1] = f7;
            this.f10568b.d(i4, rVar.f10592a, f5, f7, f6);
            i4++;
        }
        this.f10568b.e(f4);
        this.f10567a = q.b.a(0, dArr, dArr2);
    }

    public boolean j() {
        return this.f10572f == 1;
    }

    public String toString() {
        String str = this.f10570d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<r> it = this.f10573g.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f10592a + " , " + decimalFormat.format(r3.f10593b) + "] ";
        }
        return str;
    }
}
