package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.e;
import c.j0;
import c.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r.p;
import r.q;
import v.d;
import v.e;
import v.m;
import v0.v0;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements v0 {
    public static final int X0 = 0;
    public static final int Y0 = 1;
    public static final int Z0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f1975a1 = 3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f1976b1 = 4;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f1977c1 = 5;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f1978d1 = "MotionLayout";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final boolean f1979e1 = false;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static boolean f1980f1 = false;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f1981g1 = 0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f1982h1 = 1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f1983i1 = 2;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f1984j1 = 50;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f1985k1 = 0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f1986l1 = 1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f1987m1 = 2;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f1988n1 = 3;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final float f1989o1 = 1.0E-5f;
    public int A0;
    public long B0;
    public float C0;
    public int D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public androidx.constraintlayout.motion.widget.a H;
    public int H0;
    public Interpolator I;
    public int I0;
    public float J;
    public int J0;
    public int K;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public float N0;
    public int O;
    public r.g O0;
    public boolean P;
    public boolean P0;
    public HashMap<View, p> Q;
    public h Q0;
    public long R;
    public j R0;
    public float S;
    public e S0;
    public float T;
    public boolean T0;
    public float U;
    public RectF U0;
    public long V;
    public View V0;
    public float W;
    public ArrayList<Integer> W0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1990a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1991b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1992c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f1993d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f1994e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f1995f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1996g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public d f1997h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f1998i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public q.h f1999j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c f2000k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public r.d f2001l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2002m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f2003n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f2004o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f2005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f2007r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f2008s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f2009t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f2010u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f2011v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f2012w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList<MotionHelper> f2013x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList<MotionHelper> f2014y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList<i> f2015z0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2016b;

        public a(View view) {
            this.f2016b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2016b.setNestedScrollingEnabled(true);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2018a;

        static {
            int[] iArr = new int[j.values().length];
            f2018a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2018a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2018a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2018a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2019a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2020b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2021c;

        public c() {
        }

        @Override // r.q
        public float a() {
            return MotionLayout.this.J;
        }

        public void b(float f4, float f5, float f6) {
            this.f2019a = f4;
            this.f2020b = f5;
            this.f2021c = f6;
        }

        @Override // r.q, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            float f6 = this.f2019a;
            if (f6 > 0.0f) {
                float f7 = this.f2021c;
                if (f6 / f7 < f4) {
                    f4 = f6 / f7;
                }
                MotionLayout.this.J = f6 - (f7 * f4);
                f5 = (f6 * f4) - (((f7 * f4) * f4) / 2.0f);
            } else {
                float f8 = this.f2021c;
                if ((-f6) / f8 < f4) {
                    f4 = (-f6) / f8;
                }
                MotionLayout.this.J = (f8 * f4) + f6;
                f5 = (f6 * f4) + (((f8 * f4) * f4) / 2.0f);
            }
            return f5 + this.f2020b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f2023v = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f2024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f2025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f2026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f2027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f2028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f2029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Paint f2030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Paint f2031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Paint f2032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f2033j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DashPathEffect f2039p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2040q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2043t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f2034k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f2035l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f2036m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f2037n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f2038o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Rect f2041r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f2042s = false;

        public d() {
            this.f2043t = 1;
            Paint paint = new Paint();
            this.f2028e = paint;
            paint.setAntiAlias(true);
            this.f2028e.setColor(-21965);
            this.f2028e.setStrokeWidth(2.0f);
            this.f2028e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2029f = paint2;
            paint2.setAntiAlias(true);
            this.f2029f.setColor(-2067046);
            this.f2029f.setStrokeWidth(2.0f);
            this.f2029f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2030g = paint3;
            paint3.setAntiAlias(true);
            this.f2030g.setColor(-13391360);
            this.f2030g.setStrokeWidth(2.0f);
            this.f2030g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2031h = paint4;
            paint4.setAntiAlias(true);
            this.f2031h.setColor(-13391360);
            this.f2031h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2033j = new float[8];
            Paint paint5 = new Paint();
            this.f2032i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f2039p = dashPathEffect;
            this.f2030g.setPathEffect(dashPathEffect);
            this.f2026c = new float[100];
            this.f2025b = new int[50];
            if (this.f2042s) {
                this.f2028e.setStrokeWidth(8.0f);
                this.f2032i.setStrokeWidth(8.0f);
                this.f2029f.setStrokeWidth(8.0f);
                this.f2043t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, p> map, int i4, int i5) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i5 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.M) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f2031h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f2028e);
            }
            for (p pVar : map.values()) {
                int iL = pVar.l();
                if (i5 > 0 && iL == 0) {
                    iL = 1;
                }
                if (iL != 0) {
                    this.f2040q = pVar.e(this.f2026c, this.f2025b);
                    if (iL >= 1) {
                        int i6 = i4 / 16;
                        float[] fArr = this.f2024a;
                        if (fArr == null || fArr.length != i6 * 2) {
                            this.f2024a = new float[i6 * 2];
                            this.f2027d = new Path();
                        }
                        int i7 = this.f2043t;
                        canvas.translate(i7, i7);
                        this.f2028e.setColor(1996488704);
                        this.f2032i.setColor(1996488704);
                        this.f2029f.setColor(1996488704);
                        this.f2030g.setColor(1996488704);
                        pVar.f(this.f2024a, i6);
                        b(canvas, iL, this.f2040q, pVar);
                        this.f2028e.setColor(-21965);
                        this.f2029f.setColor(-2067046);
                        this.f2032i.setColor(-2067046);
                        this.f2030g.setColor(-13391360);
                        int i8 = this.f2043t;
                        canvas.translate(-i8, -i8);
                        b(canvas, iL, this.f2040q, pVar);
                        if (iL == 5) {
                            j(canvas, pVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i4, int i5, p pVar) {
            if (i4 == 4) {
                d(canvas);
            }
            if (i4 == 2) {
                g(canvas);
            }
            if (i4 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i4, i5, pVar);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f2024a, this.f2028e);
        }

        public final void d(Canvas canvas) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f2040q; i4++) {
                int i5 = this.f2025b[i4];
                if (i5 == 1) {
                    z3 = true;
                }
                if (i5 == 2) {
                    z4 = true;
                }
            }
            if (z3) {
                g(canvas);
            }
            if (z4) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f2024a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f4, f6), Math.max(f5, f7), Math.max(f4, f6), Math.max(f5, f7), this.f2030g);
            canvas.drawLine(Math.min(f4, f6), Math.min(f5, f7), Math.min(f4, f6), Math.max(f5, f7), this.f2030g);
        }

        public final void f(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f2024a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float fMin = Math.min(f6, f8);
            float fMax = Math.max(f7, f9);
            float fMin2 = f4 - Math.min(f6, f8);
            float fMax2 = Math.max(f7, f9) - f5;
            String str = s0.a.f11071l + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f8 - f6))) + 0.5d)) / 100.0f);
            m(str, this.f2031h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f2041r.width() / 2)) + fMin, f5 - 20.0f, this.f2031h);
            canvas.drawLine(f4, f5, Math.min(f6, f8), f5, this.f2030g);
            String str2 = s0.a.f11071l + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f9 - f7))) + 0.5d)) / 100.0f);
            m(str2, this.f2031h);
            canvas.drawText(str2, f4 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f2041r.height() / 2)), this.f2031h);
            canvas.drawLine(f4, f5, f4, Math.max(f7, f9), this.f2030g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f2024a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2030g);
        }

        public final void h(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f2024a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f6 - f8, f7 - f9);
            float f10 = f8 - f6;
            float f11 = f9 - f7;
            float f12 = (((f4 - f6) * f10) + ((f5 - f7) * f11)) / (fHypot * fHypot);
            float f13 = f6 + (f10 * f12);
            float f14 = f7 + (f12 * f11);
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f13, f14);
            float fHypot2 = (float) Math.hypot(f13 - f4, f14 - f5);
            String str = s0.a.f11071l + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m(str, this.f2031h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f2041r.width() / 2), -20.0f, this.f2031h);
            canvas.drawLine(f4, f5, f13, f14, this.f2030g);
        }

        public final void i(Canvas canvas, float f4, float f5, int i4, int i5) {
            String str = s0.a.f11071l + (((int) (((double) (((f4 - (i4 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i4))) + 0.5d)) / 100.0f);
            m(str, this.f2031h);
            canvas.drawText(str, ((f4 / 2.0f) - (this.f2041r.width() / 2)) + 0.0f, f5 - 20.0f, this.f2031h);
            canvas.drawLine(f4, f5, Math.min(0.0f, 1.0f), f5, this.f2030g);
            String str2 = s0.a.f11071l + (((int) (((double) (((f5 - (i5 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i5))) + 0.5d)) / 100.0f);
            m(str2, this.f2031h);
            canvas.drawText(str2, f4 + 5.0f, 0.0f - ((f5 / 2.0f) - (this.f2041r.height() / 2)), this.f2031h);
            canvas.drawLine(f4, f5, f4, Math.max(0.0f, 1.0f), this.f2030g);
        }

        public final void j(Canvas canvas, p pVar) {
            this.f2027d.reset();
            for (int i4 = 0; i4 <= 50; i4++) {
                pVar.g(i4 / 50, this.f2033j, 0);
                Path path = this.f2027d;
                float[] fArr = this.f2033j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2027d;
                float[] fArr2 = this.f2033j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2027d;
                float[] fArr3 = this.f2033j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2027d;
                float[] fArr4 = this.f2033j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2027d.close();
            }
            this.f2028e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2027d, this.f2028e);
            canvas.translate(-2.0f, -2.0f);
            this.f2028e.setColor(l0.a.f8429c);
            canvas.drawPath(this.f2027d, this.f2028e);
        }

        public final void k(Canvas canvas, int i4, int i5, p pVar) {
            int width;
            int height;
            int i6;
            float f4;
            float f5;
            View view = pVar.f10675a;
            if (view != null) {
                width = view.getWidth();
                height = pVar.f10675a.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i7 = 1; i7 < i5 - 1; i7++) {
                if (i4 != 4 || this.f2025b[i7 - 1] != 0) {
                    float[] fArr = this.f2026c;
                    int i8 = i7 * 2;
                    float f6 = fArr[i8];
                    float f7 = fArr[i8 + 1];
                    this.f2027d.reset();
                    this.f2027d.moveTo(f6, f7 + 10.0f);
                    this.f2027d.lineTo(f6 + 10.0f, f7);
                    this.f2027d.lineTo(f6, f7 - 10.0f);
                    this.f2027d.lineTo(f6 - 10.0f, f7);
                    this.f2027d.close();
                    int i9 = i7 - 1;
                    pVar.o(i9);
                    if (i4 == 4) {
                        int i10 = this.f2025b[i9];
                        if (i10 == 1) {
                            h(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else if (i10 == 2) {
                            f(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else {
                            if (i10 == 3) {
                                i6 = 3;
                                f4 = f7;
                                f5 = f6;
                                i(canvas, f6 - 0.0f, f7 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f2027d, this.f2032i);
                        }
                        i6 = 3;
                        f4 = f7;
                        f5 = f6;
                        canvas.drawPath(this.f2027d, this.f2032i);
                    } else {
                        i6 = 3;
                        f4 = f7;
                        f5 = f6;
                    }
                    if (i4 == 2) {
                        h(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (i4 == i6) {
                        f(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (i4 == 6) {
                        i(canvas, f5 - 0.0f, f4 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f2027d, this.f2032i);
                }
            }
            float[] fArr2 = this.f2024a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2029f);
                float[] fArr3 = this.f2024a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2029f);
            }
        }

        public final void l(Canvas canvas, float f4, float f5, float f6, float f7) {
            canvas.drawRect(f4, f5, f6, f7, this.f2030g);
            canvas.drawLine(f4, f5, f6, f7, this.f2030g);
        }

        public void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f2041r);
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v.f f2045a = new v.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v.f f2046b = new v.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f2047c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f2048d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2050f;

        public e() {
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.Q.clear();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = MotionLayout.this.getChildAt(i4);
                MotionLayout.this.Q.put(childAt, new p(childAt));
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = MotionLayout.this.getChildAt(i5);
                p pVar = MotionLayout.this.Q.get(childAt2);
                if (pVar != null) {
                    if (this.f2047c != null) {
                        v.e eVarF = f(this.f2045a, childAt2);
                        if (eVarF != null) {
                            pVar.G(eVarF, this.f2047c);
                        } else if (MotionLayout.this.f1996g0 != 0) {
                            Log.e(MotionLayout.f1978d1, r.c.g() + "no widget for  " + r.c.k(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f2048d != null) {
                        v.e eVarF2 = f(this.f2046b, childAt2);
                        if (eVarF2 != null) {
                            pVar.D(eVarF2, this.f2048d);
                        } else if (MotionLayout.this.f1996g0 != 0) {
                            Log.e(MotionLayout.f1978d1, r.c.g() + "no widget for  " + r.c.k(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        public void b(v.f fVar, v.f fVar2) {
            ArrayList<v.e> arrayListP1 = fVar.P1();
            HashMap<v.e, v.e> map = new HashMap<>();
            map.put(fVar, fVar2);
            fVar2.P1().clear();
            fVar2.n(fVar, map);
            for (v.e eVar : arrayListP1) {
                v.e aVar = eVar instanceof v.a ? new v.a() : eVar instanceof v.h ? new v.h() : eVar instanceof v.g ? new v.g() : eVar instanceof v.i ? new v.j() : new v.e();
                fVar2.a(aVar);
                map.put(eVar, aVar);
            }
            for (v.e eVar2 : arrayListP1) {
                map.get(eVar2).n(eVar2, map);
            }
        }

        public final void c(String str, v.f fVar) {
            String str2 = str + " " + r.c.k((View) fVar.w());
            Log.v(MotionLayout.f1978d1, str2 + "  ========= " + fVar);
            int size = fVar.P1().size();
            for (int i4 = 0; i4 < size; i4++) {
                String str3 = str2 + "[" + i4 + "] ";
                v.e eVar = fVar.P1().get(i4);
                StringBuilder sb = new StringBuilder();
                sb.append(s0.a.f11071l);
                sb.append(eVar.K.f11767f != null ? "T" : "_");
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(eVar.M.f11767f != null ? "B" : "_");
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(eVar.J.f11767f != null ? "L" : "_");
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(eVar.L.f11767f != null ? "R" : "_");
                String string4 = sb4.toString();
                View view = (View) eVar.w();
                String strK = r.c.k(view);
                if (view instanceof TextView) {
                    strK = strK + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(MotionLayout.f1978d1, str3 + "  " + strK + " " + eVar + " " + string4);
            }
            Log.v(MotionLayout.f1978d1, str2 + " done. ");
        }

        public final void d(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(layoutParams.f2292q != -1 ? "SS" : "__");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(layoutParams.f2291p != -1 ? "|SE" : "|__");
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append(layoutParams.f2293r != -1 ? "|ES" : "|__");
            String string3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            sb4.append(layoutParams.f2294s != -1 ? "|EE" : "|__");
            String string4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            sb5.append(layoutParams.f2267d != -1 ? "|LL" : "|__");
            String string5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string5);
            sb6.append(layoutParams.f2269e != -1 ? "|LR" : "|__");
            String string6 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string6);
            sb7.append(layoutParams.f2271f != -1 ? "|RL" : "|__");
            String string7 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            sb8.append(layoutParams.f2273g != -1 ? "|RR" : "|__");
            String string8 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(string8);
            sb9.append(layoutParams.f2275h != -1 ? "|TT" : "|__");
            String string9 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string9);
            sb10.append(layoutParams.f2277i != -1 ? "|TB" : "|__");
            String string10 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(string10);
            sb11.append(layoutParams.f2279j != -1 ? "|BT" : "|__");
            String string11 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(string11);
            sb12.append(layoutParams.f2281k != -1 ? "|BB" : "|__");
            Log.v(MotionLayout.f1978d1, str + sb12.toString());
        }

        public final void e(String str, v.e eVar) {
            String string;
            String string2;
            String string3;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String string4 = "__";
            if (eVar.K.f11767f != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                sb2.append(eVar.K.f11767f.f11766e == d.b.TOP ? "T" : "B");
                string = sb2.toString();
            } else {
                string = "__";
            }
            sb.append(string);
            String string5 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string5);
            if (eVar.M.f11767f != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("B");
                sb4.append(eVar.M.f11767f.f11766e == d.b.TOP ? "T" : "B");
                string2 = sb4.toString();
            } else {
                string2 = "__";
            }
            sb3.append(string2);
            String string6 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string6);
            if (eVar.J.f11767f != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("L");
                sb6.append(eVar.J.f11767f.f11766e == d.b.LEFT ? "L" : "R");
                string3 = sb6.toString();
            } else {
                string3 = "__";
            }
            sb5.append(string3);
            String string7 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string7);
            if (eVar.L.f11767f != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("R");
                sb8.append(eVar.L.f11767f.f11766e == d.b.LEFT ? "L" : "R");
                string4 = sb8.toString();
            }
            sb7.append(string4);
            Log.v(MotionLayout.f1978d1, str + sb7.toString() + " ---  " + eVar);
        }

        public v.e f(v.f fVar, View view) {
            if (fVar.w() == view) {
                return fVar;
            }
            ArrayList<v.e> arrayListP1 = fVar.P1();
            int size = arrayListP1.size();
            for (int i4 = 0; i4 < size; i4++) {
                v.e eVar = arrayListP1.get(i4);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        public void g(v.f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f2047c = dVar;
            this.f2048d = dVar2;
            this.f2045a = new v.f();
            this.f2046b = new v.f();
            this.f2045a.y2(MotionLayout.this.f2227d.k2());
            this.f2046b.y2(MotionLayout.this.f2227d.k2());
            this.f2045a.T1();
            this.f2046b.T1();
            b(MotionLayout.this.f2227d, this.f2045a);
            b(MotionLayout.this.f2227d, this.f2046b);
            if (MotionLayout.this.U > 0.5d) {
                if (dVar != null) {
                    l(this.f2045a, dVar);
                }
                l(this.f2046b, dVar2);
            } else {
                l(this.f2046b, dVar2);
                if (dVar != null) {
                    l(this.f2045a, dVar);
                }
            }
            this.f2045a.B2(MotionLayout.this.o());
            this.f2045a.D2();
            this.f2046b.B2(MotionLayout.this.o());
            this.f2046b.D2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    v.f fVar2 = this.f2045a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar2.i1(bVar);
                    this.f2046b.i1(bVar);
                }
                if (layoutParams.height == -2) {
                    v.f fVar3 = this.f2045a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar3.D1(bVar2);
                    this.f2046b.D1(bVar2);
                }
            }
        }

        public boolean h(int i4, int i5) {
            return (i4 == this.f2049e && i5 == this.f2050f) ? false : true;
        }

        public void i(int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.L0 = mode;
            motionLayout.M0 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.L == motionLayout2.getStartState()) {
                MotionLayout.this.w(this.f2046b, optimizationLevel, i4, i5);
                if (this.f2047c != null) {
                    MotionLayout.this.w(this.f2045a, optimizationLevel, i4, i5);
                }
            } else {
                if (this.f2047c != null) {
                    MotionLayout.this.w(this.f2045a, optimizationLevel, i4, i5);
                }
                MotionLayout.this.w(this.f2046b, optimizationLevel, i4, i5);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.L0 = mode;
                motionLayout3.M0 = mode2;
                if (motionLayout3.L == motionLayout3.getStartState()) {
                    MotionLayout.this.w(this.f2046b, optimizationLevel, i4, i5);
                    if (this.f2047c != null) {
                        MotionLayout.this.w(this.f2045a, optimizationLevel, i4, i5);
                    }
                } else {
                    if (this.f2047c != null) {
                        MotionLayout.this.w(this.f2045a, optimizationLevel, i4, i5);
                    }
                    MotionLayout.this.w(this.f2046b, optimizationLevel, i4, i5);
                }
                MotionLayout.this.H0 = this.f2045a.j0();
                MotionLayout.this.I0 = this.f2045a.D();
                MotionLayout.this.J0 = this.f2046b.j0();
                MotionLayout.this.K0 = this.f2046b.D();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.G0 = (motionLayout4.H0 == motionLayout4.J0 && motionLayout4.I0 == motionLayout4.K0) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i6 = motionLayout5.H0;
            int i7 = motionLayout5.I0;
            int i8 = motionLayout5.L0;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                i6 = (int) (i6 + (motionLayout5.N0 * (motionLayout5.J0 - i6)));
            }
            int i9 = motionLayout5.M0;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) (i7 + (motionLayout5.N0 * (motionLayout5.K0 - i7)));
            }
            MotionLayout.this.v(i4, i5, i6, i7, this.f2045a.t2() || this.f2046b.t2(), this.f2045a.r2() || this.f2046b.r2());
        }

        public void j() {
            i(MotionLayout.this.N, MotionLayout.this.O);
            MotionLayout.this.E0();
        }

        public void k(int i4, int i5) {
            this.f2049e = i4;
            this.f2050f = i5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void l(v.f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray<v.e> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            for (v.e eVar : fVar.P1()) {
                sparseArray.put(((View) eVar.w()).getId(), eVar);
            }
            for (v.e eVar2 : fVar.P1()) {
                View view = (View) eVar2.w();
                dVar.o(view.getId(), layoutParams);
                eVar2.H1(dVar.l0(view.getId()));
                eVar2.d1(dVar.f0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    dVar.m((ConstraintHelper) view, eVar2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).y();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.c(false, view, eVar2, layoutParams, sparseArray);
                eVar2.G1(dVar.k0(view.getId()) == 1 ? view.getVisibility() : dVar.j0(view.getId()));
            }
            for (v.e eVar3 : fVar.P1()) {
                if (eVar3 instanceof m) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) eVar3.w();
                    v.i iVar = (v.i) eVar3;
                    constraintHelper.x(fVar, iVar, sparseArray);
                    ((m) iVar).R1();
                }
            }
        }
    }

    public interface f {
        float a(int i4);

        void b(MotionEvent motionEvent);

        float c();

        void clear();

        float d();

        void e(int i4, float f4);

        void f();

        void g(int i4);

        float h(int i4);
    }

    public static class g implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static g f2052b = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f2053a;

        public static g i() {
            f2052b.f2053a = VelocityTracker.obtain();
            return f2052b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float a(int i4) {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i4);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float c() {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void clear() {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float d() {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void e(int i4, float f4) {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i4, f4);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void f() {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2053a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void g(int i4) {
            VelocityTracker velocityTracker = this.f2053a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i4);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float h(int i4) {
            if (this.f2053a != null) {
                return h(i4);
            }
            return 0.0f;
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2054a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2055b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2056c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2057d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2058e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f2059f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2060g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f2061h = "motion.EndState";

        public h() {
        }

        public void a() {
            int i4 = this.f2056c;
            if (i4 != -1 || this.f2057d != -1) {
                if (i4 == -1) {
                    MotionLayout.this.I0(this.f2057d);
                } else {
                    int i5 = this.f2057d;
                    if (i5 == -1) {
                        MotionLayout.this.A(i4, -1, -1);
                    } else {
                        MotionLayout.this.D0(i4, i5);
                    }
                }
                MotionLayout.this.setState(j.SETUP);
            }
            if (Float.isNaN(this.f2055b)) {
                if (Float.isNaN(this.f2054a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f2054a);
            } else {
                MotionLayout.this.C0(this.f2054a, this.f2055b);
                this.f2054a = Float.NaN;
                this.f2055b = Float.NaN;
                this.f2056c = -1;
                this.f2057d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2054a);
            bundle.putFloat("motion.velocity", this.f2055b);
            bundle.putInt("motion.StartState", this.f2056c);
            bundle.putInt("motion.EndState", this.f2057d);
            return bundle;
        }

        public void c() {
            this.f2057d = MotionLayout.this.M;
            this.f2056c = MotionLayout.this.K;
            this.f2055b = MotionLayout.this.getVelocity();
            this.f2054a = MotionLayout.this.getProgress();
        }

        public void d(int i4) {
            this.f2057d = i4;
        }

        public void e(float f4) {
            this.f2054a = f4;
        }

        public void f(int i4) {
            this.f2056c = i4;
        }

        public void g(Bundle bundle) {
            this.f2054a = bundle.getFloat("motion.progress");
            this.f2055b = bundle.getFloat("motion.velocity");
            this.f2056c = bundle.getInt("motion.StartState");
            this.f2057d = bundle.getInt("motion.EndState");
        }

        public void h(float f4) {
            this.f2055b = f4;
        }
    }

    public interface i {
        void a(MotionLayout motionLayout, int i4, int i5);

        void b(MotionLayout motionLayout, int i4, boolean z3, float f4);

        void c(MotionLayout motionLayout, int i4, int i5, float f4);

        void d(MotionLayout motionLayout, int i4);
    }

    public enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@j0 Context context) {
        super(context);
        this.J = 0.0f;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.Q = new HashMap<>();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0.0f;
        this.f1991b0 = false;
        this.f1992c0 = false;
        this.f1996g0 = 0;
        this.f1998i0 = false;
        this.f1999j0 = new q.h();
        this.f2000k0 = new c();
        this.f2002m0 = true;
        this.f2007r0 = false;
        this.f2012w0 = false;
        this.f2013x0 = null;
        this.f2014y0 = null;
        this.f2015z0 = null;
        this.A0 = 0;
        this.B0 = -1L;
        this.C0 = 0.0f;
        this.D0 = 0;
        this.E0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.O0 = new r.g();
        this.P0 = false;
        this.R0 = j.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = new ArrayList<>();
        t0(null);
    }

    public static boolean M0(float f4, float f5, float f6) {
        if (f4 > 0.0f) {
            float f7 = f4 / f6;
            return f5 + ((f4 * f7) - (((f6 * f7) * f7) / 2.0f)) > 1.0f;
        }
        float f8 = (-f4) / f6;
        return f5 + ((f4 * f8) + (((f6 * f8) * f8) / 2.0f)) < 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void A(int i4, int i5, int i6) {
        setState(j.SETUP);
        this.L = i4;
        this.K = -1;
        this.M = -1;
        androidx.constraintlayout.widget.b bVar = this.f2235l;
        if (bVar != null) {
            bVar.e(i4, i5, i6);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null) {
            aVar.k(i4).l(this);
        }
    }

    public void A0() {
        this.S0.j();
        invalidate();
    }

    public boolean B0(i iVar) {
        ArrayList<i> arrayList = this.f2015z0;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(iVar);
    }

    public void C0(float f4, float f5) {
        if (isAttachedToWindow()) {
            setProgress(f4);
            setState(j.MOVING);
            this.J = f5;
            Y(1.0f);
            return;
        }
        if (this.Q0 == null) {
            this.Q0 = new h();
        }
        this.Q0.e(f4);
        this.Q0.h(f5);
    }

    public void D0(int i4, int i5) {
        if (!isAttachedToWindow()) {
            if (this.Q0 == null) {
                this.Q0 = new h();
            }
            this.Q0.f(i4);
            this.Q0.d(i5);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null) {
            this.K = i4;
            this.M = i5;
            aVar.a0(i4, i5);
            this.S0.g(this.f2227d, this.H.k(i4), this.H.k(i5));
            A0();
            this.U = 0.0f;
            H0();
        }
    }

    public final void E0() {
        int childCount = getChildCount();
        this.S0.a();
        boolean z3 = true;
        this.f1991b0 = true;
        int width = getWidth();
        int height = getHeight();
        int iJ = this.H.j();
        int i4 = 0;
        if (iJ != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                p pVar = this.Q.get(getChildAt(i5));
                if (pVar != null) {
                    pVar.E(iJ);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            p pVar2 = this.Q.get(getChildAt(i6));
            if (pVar2 != null) {
                this.H.v(pVar2);
                pVar2.I(width, height, this.S, getNanoTime());
            }
        }
        float fC = this.H.C();
        if (fC != 0.0f) {
            boolean z4 = ((double) fC) < 0.0d;
            float fAbs = Math.abs(fC);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    z3 = false;
                    break;
                }
                p pVar3 = this.Q.get(getChildAt(i7));
                if (!Float.isNaN(pVar3.f10685k)) {
                    break;
                }
                float fM = pVar3.m();
                float fN = pVar3.n();
                float f4 = z4 ? fN - fM : fN + fM;
                fMin2 = Math.min(fMin2, f4);
                fMax2 = Math.max(fMax2, f4);
                i7++;
            }
            if (!z3) {
                while (i4 < childCount) {
                    p pVar4 = this.Q.get(getChildAt(i4));
                    float fM2 = pVar4.m();
                    float fN2 = pVar4.n();
                    float f5 = z4 ? fN2 - fM2 : fN2 + fM2;
                    pVar4.f10687m = 1.0f / (1.0f - fAbs);
                    pVar4.f10686l = fAbs - (((f5 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i4++;
                }
                return;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                p pVar5 = this.Q.get(getChildAt(i8));
                if (!Float.isNaN(pVar5.f10685k)) {
                    fMin = Math.min(fMin, pVar5.f10685k);
                    fMax = Math.max(fMax, pVar5.f10685k);
                }
            }
            while (i4 < childCount) {
                p pVar6 = this.Q.get(getChildAt(i4));
                if (!Float.isNaN(pVar6.f10685k)) {
                    pVar6.f10687m = 1.0f / (1.0f - fAbs);
                    float f6 = pVar6.f10685k;
                    pVar6.f10686l = fAbs - (z4 ? ((fMax - f6) / (fMax - fMin)) * fAbs : ((f6 - fMin) * fAbs) / (fMax - fMin));
                }
                i4++;
            }
        }
    }

    public void F0(int i4, float f4, float f5) {
        Interpolator interpolator;
        if (this.H == null || this.U == f4) {
            return;
        }
        this.f1998i0 = true;
        this.R = getNanoTime();
        float fP = this.H.p() / 1000.0f;
        this.S = fP;
        this.W = f4;
        this.f1991b0 = true;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            if (i4 != 4) {
                if (i4 == 5) {
                    if (!M0(f5, this.U, this.H.w())) {
                        this.f1999j0.c(this.U, f4, f5, this.S, this.H.w(), this.H.x());
                        this.J = 0.0f;
                    }
                }
                this.f1990a0 = false;
                this.R = getNanoTime();
                invalidate();
            }
            this.f2000k0.b(f5, this.U, this.H.w());
            interpolator = this.f2000k0;
            this.I = interpolator;
            this.f1990a0 = false;
            this.R = getNanoTime();
            invalidate();
        }
        if (i4 == 1) {
            f4 = 0.0f;
        } else if (i4 == 2) {
            f4 = 1.0f;
        }
        this.f1999j0.c(this.U, f4, f5, fP, this.H.w(), this.H.x());
        int i5 = this.L;
        this.W = f4;
        this.L = i5;
        interpolator = this.f1999j0;
        this.I = interpolator;
        this.f1990a0 = false;
        this.R = getNanoTime();
        invalidate();
    }

    public void G0() {
        Y(1.0f);
    }

    public void H0() {
        Y(0.0f);
    }

    public void I0(int i4) {
        if (isAttachedToWindow()) {
            J0(i4, -1, -1);
            return;
        }
        if (this.Q0 == null) {
            this.Q0 = new h();
        }
        this.Q0.d(i4);
    }

    public void J0(int i4, int i5, int i6) {
        androidx.constraintlayout.widget.f fVar;
        int iA;
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null && (fVar = aVar.f2075b) != null && (iA = fVar.a(this.L, i4, i5, i6)) != -1) {
            i4 = iA;
        }
        int i7 = this.L;
        if (i7 == i4) {
            return;
        }
        if (this.K == i4) {
            Y(0.0f);
            return;
        }
        if (this.M == i4) {
            Y(1.0f);
            return;
        }
        this.M = i4;
        if (i7 != -1) {
            D0(i7, i4);
            Y(1.0f);
            this.U = 0.0f;
            G0();
            return;
        }
        this.f1998i0 = false;
        this.W = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.V = getNanoTime();
        this.R = getNanoTime();
        this.f1990a0 = false;
        this.I = null;
        this.S = this.H.p() / 1000.0f;
        this.K = -1;
        this.H.a0(-1, this.M);
        this.H.D();
        int childCount = getChildCount();
        this.Q.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            this.Q.put(childAt, new p(childAt));
        }
        this.f1991b0 = true;
        this.S0.g(this.f2227d, null, this.H.k(i4));
        A0();
        this.S0.a();
        c0();
        int width = getWidth();
        int height = getHeight();
        for (int i9 = 0; i9 < childCount; i9++) {
            p pVar = this.Q.get(getChildAt(i9));
            this.H.v(pVar);
            pVar.I(width, height, this.S, getNanoTime());
        }
        float fC = this.H.C();
        if (fC != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                p pVar2 = this.Q.get(getChildAt(i10));
                float fN = pVar2.n() + pVar2.m();
                fMin = Math.min(fMin, fN);
                fMax = Math.max(fMax, fN);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                p pVar3 = this.Q.get(getChildAt(i11));
                float fM = pVar3.m();
                float fN2 = pVar3.n();
                pVar3.f10687m = 1.0f / (1.0f - fC);
                pVar3.f10686l = fC - ((((fM + fN2) - fMin) * fC) / (fMax - fMin));
            }
        }
        this.T = 0.0f;
        this.U = 0.0f;
        this.f1991b0 = true;
        invalidate();
    }

    public void K0() {
        this.S0.g(this.f2227d, this.H.k(this.K), this.H.k(this.M));
        A0();
    }

    public void L0(int i4, androidx.constraintlayout.widget.d dVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null) {
            aVar.W(i4, dVar);
        }
        K0();
        if (this.L == i4) {
            dVar.l(this);
        }
    }

    public void X(i iVar) {
        if (this.f2015z0 == null) {
            this.f2015z0 = new ArrayList<>();
        }
        this.f2015z0.add(iVar);
    }

    public void Y(float f4) {
        if (this.H == null) {
            return;
        }
        float f5 = this.U;
        float f6 = this.T;
        if (f5 != f6 && this.f1990a0) {
            this.U = f6;
        }
        float f7 = this.U;
        if (f7 == f4) {
            return;
        }
        this.f1998i0 = false;
        this.W = f4;
        this.S = r0.p() / 1000.0f;
        setProgress(this.W);
        this.I = this.H.t();
        this.f1990a0 = false;
        this.R = getNanoTime();
        this.f1991b0 = true;
        this.T = f7;
        this.U = f7;
        invalidate();
    }

    public final void Z() {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            Log.e(f1978d1, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iD = aVar.D();
        androidx.constraintlayout.motion.widget.a aVar2 = this.H;
        a0(iD, aVar2.k(aVar2.D()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (a.b bVar : this.H.o()) {
            if (bVar == this.H.f2076c) {
                Log.v(f1978d1, "CHECK: CURRENT");
            }
            b0(bVar);
            int iG = bVar.G();
            int iZ = bVar.z();
            String strI = r.c.i(getContext(), iG);
            String strI2 = r.c.i(getContext(), iZ);
            if (sparseIntArray.get(iG) == iZ) {
                Log.e(f1978d1, "CHECK: two transitions with the same start and end " + strI + "->" + strI2);
            }
            if (sparseIntArray2.get(iZ) == iG) {
                Log.e(f1978d1, "CHECK: you can't have reverse transitions" + strI + "->" + strI2);
            }
            sparseIntArray.put(iG, iZ);
            sparseIntArray2.put(iZ, iG);
            if (this.H.k(iG) == null) {
                Log.e(f1978d1, " no such constraintSetStart " + strI);
            }
            if (this.H.k(iZ) == null) {
                Log.e(f1978d1, " no such constraintSetEnd " + strI);
            }
        }
    }

    public final void a0(int i4, androidx.constraintlayout.widget.d dVar) {
        String strI = r.c.i(getContext(), i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(f1978d1, "CHECK: " + strI + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.d0(id) == null) {
                Log.w(f1978d1, "CHECK: " + strI + " NO CONSTRAINTS for " + r.c.k(childAt));
            }
        }
        int[] iArrG0 = dVar.g0();
        for (int i6 = 0; i6 < iArrG0.length; i6++) {
            int i7 = iArrG0[i6];
            String strI2 = r.c.i(getContext(), i7);
            if (findViewById(iArrG0[i6]) == null) {
                Log.w(f1978d1, "CHECK: " + strI + " NO View matches id " + strI2);
            }
            if (dVar.f0(i7) == -1) {
                Log.w(f1978d1, "CHECK: " + strI + "(" + strI2 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.l0(i7) == -1) {
                Log.w(f1978d1, "CHECK: " + strI + "(" + strI2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    public final void b0(a.b bVar) {
        Log.v(f1978d1, "CHECK: transition = " + bVar.u(getContext()));
        Log.v(f1978d1, "CHECK: transition.setDuration = " + bVar.y());
        if (bVar.G() == bVar.z()) {
            Log.e(f1978d1, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public final void c0() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            p pVar = this.Q.get(childAt);
            if (pVar != null) {
                pVar.F(childAt);
            }
        }
    }

    public final void d0() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            Log.v(f1978d1, " " + r.c.g() + " " + r.c.k(this) + " " + r.c.i(getContext(), this.L) + " " + r.c.k(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void e0(boolean z3) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return;
        }
        aVar.i(z3);
    }

    public void f0(int i4, boolean z3) {
        boolean z4;
        a.b bVarQ0 = q0(i4);
        if (z3) {
            z4 = true;
        } else {
            androidx.constraintlayout.motion.widget.a aVar = this.H;
            if (bVarQ0 == aVar.f2076c) {
                Iterator<a.b> it = aVar.G(this.L).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.b next = it.next();
                    if (next.I()) {
                        this.H.f2076c = next;
                        break;
                    }
                }
            }
            z4 = false;
        }
        bVarQ0.M(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0208 A[PHI: r2
      0x0208: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:146:0x0215, B:139:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(boolean r23) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.g0(boolean):void");
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.n();
    }

    public int getCurrentState() {
        return this.L;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.o();
    }

    public r.d getDesignTool() {
        if (this.f2001l0 == null) {
            this.f2001l0 = new r.d(this);
        }
        return this.f2001l0;
    }

    public int getEndState() {
        return this.M;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.U;
    }

    public int getStartState() {
        return this.K;
    }

    public float getTargetPosition() {
        return this.W;
    }

    public Bundle getTransitionState() {
        if (this.Q0 == null) {
            this.Q0 = new h();
        }
        this.Q0.c();
        return this.Q0.b();
    }

    public long getTransitionTimeMs() {
        if (this.H != null) {
            this.S = r0.p() / 1000.0f;
        }
        return (long) (this.S * 1000.0f);
    }

    public float getVelocity() {
        return this.J;
    }

    @Override // v0.u0
    public void h(View view, View view2, int i4, int i5) {
    }

    public final void h0() {
        boolean z3;
        float fSignum = Math.signum(this.W - this.U);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.I;
        float interpolation = this.U + (!(interpolator instanceof q.h) ? (((nanoTime - this.V) * fSignum) * 1.0E-9f) / this.S : 0.0f);
        if (this.f1990a0) {
            interpolation = this.W;
        }
        if ((fSignum <= 0.0f || interpolation < this.W) && (fSignum > 0.0f || interpolation > this.W)) {
            z3 = false;
        } else {
            interpolation = this.W;
            z3 = true;
        }
        if (interpolator != null && !z3) {
            interpolation = this.f1998i0 ? interpolator.getInterpolation((nanoTime - this.R) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.W) || (fSignum <= 0.0f && interpolation <= this.W)) {
            interpolation = this.W;
        }
        this.N0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            p pVar = this.Q.get(childAt);
            if (pVar != null) {
                pVar.y(childAt, interpolation, nanoTime2, this.O0);
            }
        }
        if (this.G0) {
            requestLayout();
        }
    }

    public final void i0() {
        ArrayList<i> arrayList;
        if ((this.f1993d0 == null && ((arrayList = this.f2015z0) == null || arrayList.isEmpty())) || this.E0 == this.T) {
            return;
        }
        if (this.D0 != -1) {
            i iVar = this.f1993d0;
            if (iVar != null) {
                iVar.a(this, this.K, this.M);
            }
            ArrayList<i> arrayList2 = this.f2015z0;
            if (arrayList2 != null) {
                Iterator<i> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.K, this.M);
                }
            }
            this.F0 = true;
        }
        this.D0 = -1;
        float f4 = this.T;
        this.E0 = f4;
        i iVar2 = this.f1993d0;
        if (iVar2 != null) {
            iVar2.c(this, this.K, this.M, f4);
        }
        ArrayList<i> arrayList3 = this.f2015z0;
        if (arrayList3 != null) {
            Iterator<i> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().c(this, this.K, this.M, this.T);
            }
        }
        this.F0 = true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j0() {
        int iIntValue;
        ArrayList<i> arrayList;
        if ((this.f1993d0 != null || ((arrayList = this.f2015z0) != null && !arrayList.isEmpty())) && this.D0 == -1) {
            this.D0 = this.L;
            if (this.W0.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = this.W0.get(r0.size() - 1).intValue();
            }
            int i4 = this.L;
            if (iIntValue != i4 && i4 != -1) {
                this.W0.add(Integer.valueOf(i4));
            }
        }
        y0();
    }

    @Override // v0.u0
    public void k(View view, int i4) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return;
        }
        float f4 = this.f2008s0;
        float f5 = this.f2011v0;
        aVar.R(f4 / f5, this.f2009t0 / f5);
    }

    public final void k0(MotionLayout motionLayout, int i4, int i5) {
        i iVar = this.f1993d0;
        if (iVar != null) {
            iVar.a(this, i4, i5);
        }
        ArrayList<i> arrayList = this.f2015z0;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(motionLayout, i4, i5);
            }
        }
    }

    @Override // v0.u0
    public void l(View view, int i4, int i5, int[] iArr, int i6) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVarH;
        int iM;
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null || (bVar = aVar.f2076c) == null || !bVar.I()) {
            return;
        }
        a.b bVar2 = this.H.f2076c;
        if (bVar2 == null || !bVar2.I() || (bVarH = bVar2.H()) == null || (iM = bVarH.m()) == -1 || view.getId() == iM) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.H;
            if (aVar2 != null && aVar2.y()) {
                float f4 = this.T;
                if ((f4 == 1.0f || f4 == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (bVar2.H() != null && (this.H.f2076c.H().e() & 1) != 0) {
                float fA = this.H.A(i4, i5);
                float f5 = this.U;
                if ((f5 <= 0.0f && fA < 0.0f) || (f5 >= 1.0f && fA > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f6 = this.T;
            long nanoTime = getNanoTime();
            float f7 = i4;
            this.f2008s0 = f7;
            float f8 = i5;
            this.f2009t0 = f8;
            this.f2011v0 = (float) ((nanoTime - this.f2010u0) * 1.0E-9d);
            this.f2010u0 = nanoTime;
            this.H.Q(f7, f8);
            if (f6 != this.T) {
                iArr[0] = i4;
                iArr[1] = i5;
            }
            g0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f2007r0 = true;
        }
    }

    public void l0(int i4, boolean z3, float f4) {
        i iVar = this.f1993d0;
        if (iVar != null) {
            iVar.b(this, i4, z3, f4);
        }
        ArrayList<i> arrayList = this.f2015z0;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this, i4, z3, f4);
            }
        }
    }

    public void m0(int i4, float f4, float f5, float f6, float[] fArr) {
        String resourceName;
        HashMap<View, p> map = this.Q;
        View viewJ = j(i4);
        p pVar = map.get(viewJ);
        if (pVar != null) {
            pVar.k(f4, f5, f6, fArr);
            float y3 = viewJ.getY();
            this.f1994e0 = f4;
            this.f1995f0 = y3;
            return;
        }
        if (viewJ == null) {
            resourceName = s0.a.f11071l + i4;
        } else {
            resourceName = viewJ.getContext().getResources().getResourceName(i4);
        }
        Log.w(f1978d1, "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.d n0(int i4) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.k(i4);
    }

    public String o0(int i4) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.M(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a.b bVar;
        int i4;
        super.onAttachedToWindow();
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null && (i4 = this.L) != -1) {
            androidx.constraintlayout.widget.d dVarK = aVar.k(i4);
            this.H.U(this);
            if (dVarK != null) {
                dVarK.l(this);
            }
            this.K = this.L;
        }
        x0();
        h hVar = this.Q0;
        if (hVar != null) {
            hVar.a();
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.H;
        if (aVar2 == null || (bVar = aVar2.f2076c) == null || bVar.x() != 4) {
            return;
        }
        G0();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVarH;
        int iM;
        RectF rectFL;
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null && this.P && (bVar = aVar.f2076c) != null && bVar.I() && (bVarH = bVar.H()) != null && ((motionEvent.getAction() != 0 || (rectFL = bVarH.l(this, new RectF())) == null || rectFL.contains(motionEvent.getX(), motionEvent.getY())) && (iM = bVarH.m()) != -1)) {
            View view = this.V0;
            if (view == null || view.getId() != iM) {
                this.V0 = findViewById(iM);
            }
            if (this.V0 != null) {
                this.U0.set(r0.getLeft(), this.V0.getTop(), this.V0.getRight(), this.V0.getBottom());
                if (this.U0.contains(motionEvent.getX(), motionEvent.getY()) && !s0(0.0f, 0.0f, this.V0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.P0 = true;
        try {
            if (this.H == null) {
                super.onLayout(z3, i4, i5, i6, i7);
                return;
            }
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.f2005p0 != i8 || this.f2006q0 != i9) {
                A0();
                g0(true);
            }
            this.f2005p0 = i8;
            this.f2006q0 = i9;
            this.f2003n0 = i8;
            this.f2004o0 = i9;
        } finally {
            this.P0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.H == null) {
            super.onMeasure(i4, i5);
            return;
        }
        boolean z3 = false;
        boolean z4 = (this.N == i4 && this.O == i5) ? false : true;
        if (this.T0) {
            this.T0 = false;
            x0();
            y0();
            z4 = true;
        }
        if (this.f2232i) {
            z4 = true;
        }
        this.N = i4;
        this.O = i5;
        int iD = this.H.D();
        int iQ = this.H.q();
        if ((z4 || this.S0.h(iD, iQ)) && this.K != -1) {
            super.onMeasure(i4, i5);
            this.S0.g(this.f2227d, this.H.k(iD), this.H.k(iQ));
            this.S0.j();
            this.S0.k(iD, iQ);
        } else {
            z3 = true;
        }
        if (this.G0 || z3) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iJ0 = this.f2227d.j0() + getPaddingLeft() + getPaddingRight();
            int iD2 = this.f2227d.D() + paddingTop;
            int i6 = this.L0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                iJ0 = (int) (this.H0 + (this.N0 * (this.J0 - r7)));
                requestLayout();
            }
            int i7 = this.M0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                iD2 = (int) (this.I0 + (this.N0 * (this.K0 - r7)));
                requestLayout();
            }
            setMeasuredDimension(iJ0, iD2);
        }
        h0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar != null) {
            aVar.Z(o());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null || !this.P || !aVar.e0()) {
            return super.onTouchEvent(motionEvent);
        }
        a.b bVar = this.H.f2076c;
        if (bVar != null && !bVar.I()) {
            return super.onTouchEvent(motionEvent);
        }
        this.H.S(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2015z0 == null) {
                this.f2015z0 = new ArrayList<>();
            }
            this.f2015z0.add(motionHelper);
            if (motionHelper.A()) {
                if (this.f2013x0 == null) {
                    this.f2013x0 = new ArrayList<>();
                }
                this.f2013x0.add(motionHelper);
            }
            if (motionHelper.z()) {
                if (this.f2014y0 == null) {
                    this.f2014y0 = new ArrayList<>();
                }
                this.f2014y0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f2013x0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2014y0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // v0.v0
    public void p(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (this.f2007r0 || i4 != 0 || i5 != 0) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
        }
        this.f2007r0 = false;
    }

    public void p0(boolean z3) {
        this.f1996g0 = z3 ? 2 : 1;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void q(int i4) {
        if (i4 == 0) {
            this.H = null;
            return;
        }
        try {
            this.H = new androidx.constraintlayout.motion.widget.a(getContext(), this, i4);
            if (isAttachedToWindow()) {
                this.H.U(this);
                this.S0.g(this.f2227d, this.H.k(this.K), this.H.k(this.M));
                A0();
                this.H.Z(o());
            }
        } catch (Exception e4) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e4);
        }
    }

    public a.b q0(int i4) {
        return this.H.E(i4);
    }

    @Override // v0.u0
    public void r(View view, int i4, int i5, int i6, int i7, int i8) {
    }

    public void r0(View view, float f4, float f5, float[] fArr, int i4) {
        float interpolation;
        float fA = this.J;
        float f6 = this.U;
        if (this.I != null) {
            float fSignum = Math.signum(this.W - f6);
            float interpolation2 = this.I.getInterpolation(this.U + 1.0E-5f);
            interpolation = this.I.getInterpolation(this.U);
            fA = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.S;
        } else {
            interpolation = f6;
        }
        Interpolator interpolator = this.I;
        if (interpolator instanceof q) {
            fA = ((q) interpolator).a();
        }
        p pVar = this.Q.get(view);
        if ((i4 & 1) == 0) {
            pVar.s(interpolation, view.getWidth(), view.getHeight(), f4, f5, fArr);
        } else {
            pVar.k(interpolation, f4, f5, fArr);
        }
        if (i4 < 2) {
            fArr[0] = fArr[0] * fA;
            fArr[1] = fArr[1] * fA;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (this.G0 || this.L != -1 || (aVar = this.H) == null || (bVar = aVar.f2076c) == null || bVar.C() != 0) {
            super.requestLayout();
        }
    }

    @Override // v0.u0
    public boolean s(View view, View view2, int i4, int i5) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        return (aVar == null || (bVar = aVar.f2076c) == null || bVar.H() == null || (this.H.f2076c.H().e() & 2) != 0) ? false : true;
    }

    public final boolean s0(float f4, float f5, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (s0(view.getLeft() + f4, view.getTop() + f5, viewGroup.getChildAt(i4), motionEvent)) {
                    return true;
                }
            }
        }
        this.U0.set(view.getLeft() + f4, view.getTop() + f5, f4 + view.getRight(), f5 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.U0.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDebugMode(int i4) {
        this.f1996g0 = i4;
        invalidate();
    }

    public void setInteractionEnabled(boolean z3) {
        this.P = z3;
    }

    public void setInterpolatedProgress(float f4) {
        if (this.H != null) {
            setState(j.MOVING);
            Interpolator interpolatorT = this.H.t();
            if (interpolatorT != null) {
                setProgress(interpolatorT.getInterpolation(f4));
                return;
            }
        }
        setProgress(f4);
    }

    public void setOnHide(float f4) {
        ArrayList<MotionHelper> arrayList = this.f2014y0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f2014y0.get(i4).setProgress(f4);
            }
        }
    }

    public void setOnShow(float f4) {
        ArrayList<MotionHelper> arrayList = this.f2013x0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f2013x0.get(i4).setProgress(f4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.U == 0.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.f2066e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.U == 1.0f) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto Lb
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L29
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r5.Q0
            if (r0 != 0) goto L23
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = new androidx.constraintlayout.motion.widget.MotionLayout$h
            r0.<init>()
            r5.Q0 = r0
        L23:
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r5.Q0
            r0.e(r6)
            return
        L29:
            if (r1 > 0) goto L38
            int r1 = r5.K
            r5.L = r1
            float r1 = r5.U
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4f
        L35:
            androidx.constraintlayout.motion.widget.MotionLayout$j r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            goto L4c
        L38:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L47
            int r0 = r5.M
            r5.L = r0
            float r0 = r5.U
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4f
            goto L35
        L47:
            r0 = -1
            r5.L = r0
            androidx.constraintlayout.motion.widget.MotionLayout$j r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.MOVING
        L4c:
            r5.setState(r0)
        L4f:
            androidx.constraintlayout.motion.widget.a r0 = r5.H
            if (r0 != 0) goto L54
            return
        L54:
            r0 = 1
            r5.f1990a0 = r0
            r5.W = r6
            r5.T = r6
            r1 = -1
            r5.V = r1
            r5.R = r1
            r6 = 0
            r5.I = r6
            r5.f1991b0 = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        this.H = aVar;
        aVar.Z(o());
        A0();
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.L == -1) {
            return;
        }
        j jVar3 = this.R0;
        this.R0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            i0();
        }
        int i4 = b.f2018a[jVar3.ordinal()];
        if (i4 == 1 || i4 == 2) {
            if (jVar == jVar4) {
                i0();
            }
            if (jVar != jVar2) {
                return;
            }
        } else if (i4 != 3 || jVar != jVar2) {
            return;
        }
        j0();
    }

    public void setTransition(int i4) {
        if (this.H != null) {
            a.b bVarQ0 = q0(i4);
            this.K = bVarQ0.G();
            this.M = bVarQ0.z();
            if (!isAttachedToWindow()) {
                if (this.Q0 == null) {
                    this.Q0 = new h();
                }
                this.Q0.f(this.K);
                this.Q0.d(this.M);
                return;
            }
            int i5 = this.L;
            float f4 = i5 == this.K ? 0.0f : i5 == this.M ? 1.0f : Float.NaN;
            this.H.b0(bVarQ0);
            this.S0.g(this.f2227d, this.H.k(this.K), this.H.k(this.M));
            A0();
            this.U = Float.isNaN(f4) ? 0.0f : f4;
            if (!Float.isNaN(f4)) {
                setProgress(f4);
                return;
            }
            Log.v(f1978d1, r.c.g() + " transitionToStart ");
            H0();
        }
    }

    public void setTransitionDuration(int i4) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            Log.e(f1978d1, "MotionScene not defined");
        } else {
            aVar.X(i4);
        }
    }

    public void setTransitionListener(i iVar) {
        this.f1993d0 = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.Q0 == null) {
            this.Q0 = new h();
        }
        this.Q0.g(bundle);
        if (isAttachedToWindow()) {
            this.Q0.a();
        }
    }

    public final void t0(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        int i4;
        f1980f1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.Cf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z3 = true;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == e.m.Ff) {
                    this.H = new androidx.constraintlayout.motion.widget.a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == e.m.Ef) {
                    this.L = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == e.m.Hf) {
                    this.W = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1991b0 = true;
                } else if (index == e.m.Df) {
                    z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                } else if (index == e.m.If) {
                    if (this.f1996g0 == 0) {
                        i4 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        this.f1996g0 = i4;
                    }
                } else if (index == e.m.Gf) {
                    i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.f1996g0 = i4;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.H == null) {
                Log.e(f1978d1, "WARNING NO app:layoutDescription tag");
            }
            if (!z3) {
                this.H = null;
            }
        }
        if (this.f1996g0 != 0) {
            Z();
        }
        if (this.L != -1 || (aVar = this.H) == null) {
            return;
        }
        this.L = aVar.D();
        this.K = this.H.D();
        this.M = this.H.q();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return r.c.i(context, this.K) + "->" + r.c.i(context, this.M) + " (pos:" + this.U + " Dpos/Dt:" + this.J;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void u(int i4) {
        this.f2235l = null;
    }

    public boolean u0() {
        return this.P;
    }

    public int v0(String str) {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.L(str);
    }

    public f w0() {
        return g.i();
    }

    public void x0() {
        androidx.constraintlayout.motion.widget.a aVar = this.H;
        if (aVar == null) {
            return;
        }
        if (aVar.g(this, this.L)) {
            requestLayout();
            return;
        }
        int i4 = this.L;
        if (i4 != -1) {
            this.H.e(this, i4);
        }
        if (this.H.e0()) {
            this.H.c0();
        }
    }

    public final void y0() {
        ArrayList<i> arrayList;
        if (this.f1993d0 == null && ((arrayList = this.f2015z0) == null || arrayList.isEmpty())) {
            return;
        }
        this.F0 = false;
        for (Integer num : this.W0) {
            i iVar = this.f1993d0;
            if (iVar != null) {
                iVar.d(this, num.intValue());
            }
            ArrayList<i> arrayList2 = this.f2015z0;
            if (arrayList2 != null) {
                Iterator<i> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().d(this, num.intValue());
                }
            }
        }
        this.W0.clear();
    }

    @Deprecated
    public void z0() {
        Log.e(f1978d1, "This method is deprecated. Please call rebuildScene() instead.");
        A0();
    }

    public MotionLayout(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 0.0f;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.Q = new HashMap<>();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0.0f;
        this.f1991b0 = false;
        this.f1992c0 = false;
        this.f1996g0 = 0;
        this.f1998i0 = false;
        this.f1999j0 = new q.h();
        this.f2000k0 = new c();
        this.f2002m0 = true;
        this.f2007r0 = false;
        this.f2012w0 = false;
        this.f2013x0 = null;
        this.f2014y0 = null;
        this.f2015z0 = null;
        this.A0 = 0;
        this.B0 = -1L;
        this.C0 = 0.0f;
        this.D0 = 0;
        this.E0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.O0 = new r.g();
        this.P0 = false;
        this.R0 = j.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = new ArrayList<>();
        t0(attributeSet);
    }

    public void setTransition(a.b bVar) {
        this.H.b0(bVar);
        setState(j.SETUP);
        float f4 = this.L == this.H.q() ? 1.0f : 0.0f;
        this.U = f4;
        this.T = f4;
        this.W = f4;
        this.V = bVar.J(1) ? -1L : getNanoTime();
        int iD = this.H.D();
        int iQ = this.H.q();
        if (iD == this.K && iQ == this.M) {
            return;
        }
        this.K = iD;
        this.M = iQ;
        this.H.a0(iD, iQ);
        this.S0.g(this.f2227d, this.H.k(this.K), this.H.k(this.M));
        this.S0.k(this.K, this.M);
        this.S0.j();
        A0();
    }

    public MotionLayout(@j0 Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.J = 0.0f;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.Q = new HashMap<>();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0.0f;
        this.f1991b0 = false;
        this.f1992c0 = false;
        this.f1996g0 = 0;
        this.f1998i0 = false;
        this.f1999j0 = new q.h();
        this.f2000k0 = new c();
        this.f2002m0 = true;
        this.f2007r0 = false;
        this.f2012w0 = false;
        this.f2013x0 = null;
        this.f2014y0 = null;
        this.f2015z0 = null;
        this.A0 = 0;
        this.B0 = -1L;
        this.C0 = 0.0f;
        this.D0 = 0;
        this.E0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.O0 = new r.g();
        this.P0 = false;
        this.R0 = j.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = new ArrayList<>();
        t0(attributeSet);
    }
}
