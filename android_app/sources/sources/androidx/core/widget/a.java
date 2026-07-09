package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import c.j0;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int A = 1;
    public static final int B = 315;
    public static final int C = 1575;
    public static final float D = Float.MAX_VALUE;
    public static final float E = 0.2f;
    public static final float F = 1.0f;
    public static final int G = ViewConfiguration.getTapTimeout();
    public static final int H = 500;
    public static final int I = 500;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f3456s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f3457t = Float.MAX_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f3458u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f3459v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f3460w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f3461x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f3462y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f3463z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f3467e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3471i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3480r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0019a f3464b = new C0019a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f3465c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f3468f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3469g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f3472j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f3473k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f3474l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C0019a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f3484d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f3490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3491k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f3485e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f3489i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f3486f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3487g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3488h = 0;

        public void a() {
            if (this.f3486f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j4 = jCurrentAnimationTimeMillis - this.f3486f;
            this.f3486f = jCurrentAnimationTimeMillis;
            float f4 = j4 * fG;
            this.f3487g = (int) (this.f3483c * f4);
            this.f3488h = (int) (f4 * this.f3484d);
        }

        public int b() {
            return this.f3487g;
        }

        public int c() {
            return this.f3488h;
        }

        public int d() {
            float f4 = this.f3483c;
            return (int) (f4 / Math.abs(f4));
        }

        public final float e(long j4) {
            if (j4 < this.f3485e) {
                return 0.0f;
            }
            long j5 = this.f3489i;
            if (j5 < 0 || j4 < j5) {
                return a.e((j4 - r0) / this.f3481a, 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f3490j;
            return (1.0f - f4) + (f4 * a.e((j4 - j5) / this.f3491k, 0.0f, 1.0f));
        }

        public int f() {
            float f4 = this.f3484d;
            return (int) (f4 / Math.abs(f4));
        }

        public final float g(float f4) {
            return ((-4.0f) * f4 * f4) + (f4 * 4.0f);
        }

        public boolean h() {
            return this.f3489i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3489i + ((long) this.f3491k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3491k = a.f((int) (jCurrentAnimationTimeMillis - this.f3485e), 0, this.f3482b);
            this.f3490j = e(jCurrentAnimationTimeMillis);
            this.f3489i = jCurrentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f3482b = i4;
        }

        public void k(int i4) {
            this.f3481a = i4;
        }

        public void l(float f4, float f5) {
            this.f3483c = f4;
            this.f3484d = f5;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3485e = jCurrentAnimationTimeMillis;
            this.f3489i = -1L;
            this.f3486f = jCurrentAnimationTimeMillis;
            this.f3490j = 0.5f;
            this.f3487g = 0;
            this.f3488h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f3478p) {
                if (aVar.f3476n) {
                    aVar.f3476n = false;
                    aVar.f3464b.m();
                }
                C0019a c0019a = a.this.f3464b;
                if (c0019a.h() || !a.this.x()) {
                    a.this.f3478p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f3477o) {
                    aVar2.f3477o = false;
                    aVar2.c();
                }
                c0019a.a();
                a.this.l(c0019a.b(), c0019a.c());
                z1.n1(a.this.f3466d, this);
            }
        }
    }

    public a(@j0 View view) {
        this.f3466d = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        r(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        s(f6, f6);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    public static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    public static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3466d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i4, float f4, float f5, float f6) {
        float fH = h(this.f3468f[i4], f5, this.f3469g[i4], f4);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f3472j[i4];
        float f8 = this.f3473k[i4];
        float f9 = this.f3474l[i4];
        float f10 = f7 * f6;
        return fH > 0.0f ? e(fH * f10, f8, f9) : -e((-fH) * f10, f8, f9);
    }

    public final float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f3470h;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f3478p && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    public final float h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float fE = e(f4 * f5, 0.0f, f6);
        float fG = g(f5 - f7, fE) - g(f7, fE);
        if (fG < 0.0f) {
            interpolation = -this.f3465c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f3465c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public boolean i() {
        return this.f3479q;
    }

    public boolean j() {
        return this.f3480r;
    }

    public final void k() {
        if (this.f3476n) {
            this.f3478p = false;
        } else {
            this.f3464b.i();
        }
    }

    public abstract void l(int i4, int i5);

    @j0
    public a m(int i4) {
        this.f3471i = i4;
        return this;
    }

    @j0
    public a n(int i4) {
        this.f3470h = i4;
        return this;
    }

    public a o(boolean z3) {
        if (this.f3479q && !z3) {
            k();
        }
        this.f3479q = z3;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3479q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.f3477o = r2
            r5.f3475m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3466d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3466d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3464b
            r7.l(r0, r6)
            boolean r6 = r5.f3478p
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.f3480r
            if (r6 == 0) goto L61
            boolean r6 = r5.f3478p
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z3) {
        this.f3480r = z3;
        return this;
    }

    @j0
    public a q(float f4, float f5) {
        float[] fArr = this.f3469g;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @j0
    public a r(float f4, float f5) {
        float[] fArr = this.f3474l;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @j0
    public a s(float f4, float f5) {
        float[] fArr = this.f3473k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @j0
    public a t(int i4) {
        this.f3464b.j(i4);
        return this;
    }

    @j0
    public a u(int i4) {
        this.f3464b.k(i4);
        return this;
    }

    @j0
    public a v(float f4, float f5) {
        float[] fArr = this.f3468f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @j0
    public a w(float f4, float f5) {
        float[] fArr = this.f3472j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public boolean x() {
        C0019a c0019a = this.f3464b;
        int iF = c0019a.f();
        int iD = c0019a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public final void y() {
        int i4;
        if (this.f3467e == null) {
            this.f3467e = new b();
        }
        this.f3478p = true;
        this.f3476n = true;
        if (this.f3475m || (i4 = this.f3471i) <= 0) {
            this.f3467e.run();
        } else {
            z1.o1(this.f3466d, this.f3467e, i4);
        }
        this.f3475m = true;
    }
}
