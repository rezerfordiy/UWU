package com.sonoptek.pvus_android.matrix_view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MatrixView extends ImageView {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f6123f0 = 35;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f6124g0 = 340;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final float f6125h0 = 5.0f;
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public float I;
    public float J;
    public RectF K;
    public RectF L;
    public RectF M;
    public RectF N;
    public RectF O;
    public PointF P;
    public PointF Q;
    public PointF R;
    public l S;
    public RectF T;
    public h2.a U;
    public long V;
    public Runnable W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public View.OnLongClickListener f6126a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6127b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h2.b f6128b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6129c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ScaleGestureDetector.OnScaleGestureListener f6130c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6131d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Runnable f6132d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6133e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public GestureDetector.OnGestureListener f6134e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Matrix f6138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f6139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Matrix f6140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f6141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h2.c f6142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GestureDetector f6143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ScaleGestureDetector f6144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View.OnClickListener f6145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f6146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6150u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6154y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6155z;

    public class a implements h2.b {
        public a() {
        }

        @Override // h2.b
        public void a(float f4, float f5, float f6) {
            MatrixView.c(MatrixView.this, f4);
            if (MatrixView.this.A) {
                MatrixView.y(MatrixView.this, f4);
                MatrixView.this.f6139j.postRotate(f4, f5, f6);
            } else if (Math.abs(MatrixView.this.D) >= MatrixView.this.f6127b) {
                MatrixView.this.A = true;
                MatrixView.this.D = 0.0f;
            }
        }
    }

    public class b implements ScaleGestureDetector.OnScaleGestureListener {
        public b() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            MatrixView.Z(MatrixView.this, scaleFactor);
            MatrixView.this.f6139j.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            MatrixView.this.p0();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MatrixView.this.f6145p != null) {
                MatrixView.this.f6145p.onClick(MatrixView.this);
            }
        }
    }

    public class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            float f4;
            float f5;
            MatrixView.this.S.e();
            float fWidth = MatrixView.this.M.left + (MatrixView.this.M.width() / 2.0f);
            float fHeight = MatrixView.this.M.top + (MatrixView.this.M.height() / 2.0f);
            MatrixView.this.Q.set(fWidth, fHeight);
            MatrixView.this.R.set(fWidth, fHeight);
            MatrixView.this.G = 0;
            MatrixView.this.H = 0;
            if (MatrixView.this.f6155z) {
                f4 = MatrixView.this.F;
                f5 = 1.0f;
            } else {
                float f6 = MatrixView.this.F;
                float f7 = MatrixView.this.f6131d;
                MatrixView.this.Q.set(motionEvent.getX(), motionEvent.getY());
                f4 = f6;
                f5 = f7;
            }
            MatrixView.this.f6141l.reset();
            MatrixView.this.f6141l.postTranslate(-MatrixView.this.L.left, -MatrixView.this.L.top);
            MatrixView.this.f6141l.postTranslate(MatrixView.this.R.x, MatrixView.this.R.y);
            MatrixView.this.f6141l.postTranslate(-MatrixView.this.I, -MatrixView.this.J);
            MatrixView.this.f6141l.postRotate(MatrixView.this.E, MatrixView.this.R.x, MatrixView.this.R.y);
            MatrixView.this.f6141l.postScale(f5, f5, MatrixView.this.Q.x, MatrixView.this.Q.y);
            MatrixView.this.f6141l.postTranslate(MatrixView.this.G, MatrixView.this.H);
            MatrixView.this.f6141l.mapRect(MatrixView.this.N, MatrixView.this.L);
            MatrixView matrixView = MatrixView.this;
            matrixView.m0(matrixView.N);
            MatrixView.this.f6155z = !r2.f6155z;
            MatrixView.this.S.j(f4, f5);
            MatrixView.this.S.d();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            MatrixView.this.f6150u = false;
            MatrixView.this.f6147r = false;
            MatrixView.this.A = false;
            MatrixView matrixView = MatrixView.this;
            matrixView.removeCallbacks(matrixView.f6132d0);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
            if (MatrixView.this.f6147r) {
                return false;
            }
            if ((!MatrixView.this.B && !MatrixView.this.C) || MatrixView.this.S.f6170b) {
                return false;
            }
            float f6 = (((float) Math.round(MatrixView.this.M.left)) >= MatrixView.this.K.left || ((float) Math.round(MatrixView.this.M.right)) <= MatrixView.this.K.right) ? 0.0f : f4;
            float f7 = (((float) Math.round(MatrixView.this.M.top)) >= MatrixView.this.K.top || ((float) Math.round(MatrixView.this.M.bottom)) <= MatrixView.this.K.bottom) ? 0.0f : f5;
            if (MatrixView.this.A || MatrixView.this.E % 90.0f != 0.0f) {
                float f8 = ((int) (MatrixView.this.E / 90.0f)) * 90;
                float f9 = MatrixView.this.E % 90.0f;
                if (f9 > 45.0f) {
                    f8 += 90.0f;
                } else if (f9 < -45.0f) {
                    f8 -= 90.0f;
                }
                MatrixView.this.S.h((int) MatrixView.this.E, (int) f8);
                MatrixView.this.E = f8;
            }
            MatrixView matrixView = MatrixView.this;
            matrixView.m0(matrixView.M);
            MatrixView.this.S.g(f6, f7);
            MatrixView.this.S.d();
            return super.onFling(motionEvent, motionEvent2, f4, f5);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (MatrixView.this.f6126a0 != null) {
                MatrixView.this.f6126a0.onLongClick(MatrixView.this);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
            if (MatrixView.this.S.f6170b) {
                MatrixView.this.S.e();
            }
            if (MatrixView.this.h0(f4)) {
                if (f4 < 0.0f && MatrixView.this.M.left - f4 > MatrixView.this.K.left) {
                    f4 = MatrixView.this.M.left;
                }
                if (f4 > 0.0f && MatrixView.this.M.right - f4 < MatrixView.this.K.right) {
                    f4 = MatrixView.this.M.right - MatrixView.this.K.right;
                }
                MatrixView.this.f6139j.postTranslate(-f4, 0.0f);
                MatrixView.s(MatrixView.this, f4);
            } else if (MatrixView.this.B || MatrixView.this.f6147r || MatrixView.this.f6150u) {
                MatrixView.this.j0();
                if (!MatrixView.this.f6147r) {
                    if (f4 < 0.0f && MatrixView.this.M.left - f4 > MatrixView.this.O.left) {
                        MatrixView matrixView = MatrixView.this;
                        f4 = matrixView.K0(matrixView.M.left - MatrixView.this.O.left, f4);
                    }
                    if (f4 > 0.0f && MatrixView.this.M.right - f4 < MatrixView.this.O.right) {
                        MatrixView matrixView2 = MatrixView.this;
                        f4 = matrixView2.K0(matrixView2.M.right - MatrixView.this.O.right, f4);
                    }
                }
                MatrixView.s(MatrixView.this, f4);
                MatrixView.this.f6139j.postTranslate(-f4, 0.0f);
                MatrixView.this.f6150u = true;
            }
            if (MatrixView.this.i0(f5)) {
                if (f5 < 0.0f && MatrixView.this.M.top - f5 > MatrixView.this.K.top) {
                    f5 = MatrixView.this.M.top;
                }
                if (f5 > 0.0f && MatrixView.this.M.bottom - f5 < MatrixView.this.K.bottom) {
                    f5 = MatrixView.this.M.bottom - MatrixView.this.K.bottom;
                }
                MatrixView.this.f6139j.postTranslate(0.0f, -f5);
                MatrixView.D(MatrixView.this, f5);
            } else if (MatrixView.this.C || MatrixView.this.f6150u || MatrixView.this.f6147r) {
                MatrixView.this.j0();
                if (!MatrixView.this.f6147r) {
                    if (f5 < 0.0f && MatrixView.this.M.top - f5 > MatrixView.this.O.top) {
                        MatrixView matrixView3 = MatrixView.this;
                        f5 = matrixView3.L0(matrixView3.M.top - MatrixView.this.O.top, f5);
                    }
                    if (f5 > 0.0f && MatrixView.this.M.bottom - f5 < MatrixView.this.O.bottom) {
                        MatrixView matrixView4 = MatrixView.this;
                        f5 = matrixView4.L0(matrixView4.M.bottom - MatrixView.this.O.bottom, f5);
                    }
                }
                MatrixView.this.f6139j.postTranslate(0.0f, -f5);
                MatrixView.D(MatrixView.this, f5);
                MatrixView.this.f6150u = true;
            }
            MatrixView.this.p0();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            MatrixView matrixView = MatrixView.this;
            matrixView.postDelayed(matrixView.f6132d0, 250L);
            return false;
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f6160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f6161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f6162d;

        public e(float f4, float f5, g gVar) {
            this.f6160b = f4;
            this.f6161c = f5;
            this.f6162d = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatrixView.this.S.f(1.0f, 1.0f, this.f6160b - 1.0f, this.f6161c - 1.0f, MatrixView.this.f6129c / 2, this.f6162d);
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6164a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f6164a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6164a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6164a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6164a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6164a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6164a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6164a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface g {
        float a();
    }

    public class h implements g {
        public h() {
        }

        @Override // com.sonoptek.pvus_android.matrix_view.MatrixView.g
        public float a() {
            return MatrixView.this.M.bottom;
        }
    }

    public class i implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Interpolator f6166a;

        public i() {
            this.f6166a = new DecelerateInterpolator();
        }

        public void a(Interpolator interpolator) {
            this.f6166a = interpolator;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            Interpolator interpolator = this.f6166a;
            return interpolator != null ? interpolator.getInterpolation(f4) : f4;
        }

        public /* synthetic */ i(MatrixView matrixView, a aVar) {
            this();
        }
    }

    public class j implements g {
        public j() {
        }

        @Override // com.sonoptek.pvus_android.matrix_view.MatrixView.g
        public float a() {
            return (MatrixView.this.M.top + MatrixView.this.M.bottom) / 2.0f;
        }
    }

    public class k implements g {
        public k() {
        }

        @Override // com.sonoptek.pvus_android.matrix_view.MatrixView.g
        public float a() {
            return MatrixView.this.M.top;
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public OverScroller f6171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OverScroller f6172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Scroller f6173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Scroller f6174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Scroller f6175g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public g f6176h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6177i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6179k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6180l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public RectF f6181m = new RectF();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public i f6182n;

        public l() {
            this.f6182n = new i(MatrixView.this, null);
            Context context = MatrixView.this.getContext();
            this.f6171c = new OverScroller(context, this.f6182n);
            this.f6173e = new Scroller(context, this.f6182n);
            this.f6172d = new OverScroller(context, this.f6182n);
            this.f6174f = new Scroller(context, this.f6182n);
            this.f6175g = new Scroller(context, this.f6182n);
        }

        public final void a() {
            MatrixView.this.f6139j.reset();
            MatrixView.this.f6139j.postTranslate(-MatrixView.this.L.left, -MatrixView.this.L.top);
            MatrixView.this.f6139j.postTranslate(MatrixView.this.R.x, MatrixView.this.R.y);
            MatrixView.this.f6139j.postTranslate(-MatrixView.this.I, -MatrixView.this.J);
            MatrixView.this.f6139j.postRotate(MatrixView.this.E, MatrixView.this.R.x, MatrixView.this.R.y);
            MatrixView.this.f6139j.postScale(MatrixView.this.F, MatrixView.this.F, MatrixView.this.Q.x, MatrixView.this.Q.y);
            MatrixView.this.f6139j.postTranslate(MatrixView.this.G, MatrixView.this.H);
            MatrixView.this.p0();
        }

        public final void b() {
            if (this.f6170b) {
                MatrixView.this.post(this);
            }
        }

        public void c(Interpolator interpolator) {
            this.f6182n.a(interpolator);
        }

        public void d() {
            this.f6170b = true;
            b();
        }

        public void e() {
            MatrixView.this.removeCallbacks(this);
            this.f6171c.abortAnimation();
            this.f6173e.abortAnimation();
            this.f6172d.abortAnimation();
            this.f6175g.abortAnimation();
            this.f6170b = false;
        }

        public void f(float f4, float f5, float f6, float f7, int i4, g gVar) {
            this.f6174f.startScroll((int) (f4 * 10000.0f), (int) (f5 * 10000.0f), (int) (f6 * 10000.0f), (int) (f7 * 10000.0f), i4);
            this.f6176h = gVar;
        }

        public void g(float f4, float f5) {
            int i4;
            int i5;
            int i6;
            int i7;
            this.f6177i = f4 < 0.0f ? Integer.MAX_VALUE : 0;
            RectF rectF = MatrixView.this.M;
            int iAbs = (int) (f4 > 0.0f ? Math.abs(rectF.left) : rectF.right - MatrixView.this.K.right);
            if (f4 < 0.0f) {
                iAbs = ActivityChooserView.f.f1331h - iAbs;
            }
            int i8 = f4 < 0.0f ? iAbs : 0;
            int i9 = f4 < 0.0f ? Integer.MAX_VALUE : iAbs;
            if (f4 < 0.0f) {
                iAbs = ActivityChooserView.f.f1331h - i8;
            }
            this.f6178j = f5 < 0.0f ? Integer.MAX_VALUE : 0;
            RectF rectF2 = MatrixView.this.M;
            int iAbs2 = (int) (f5 > 0.0f ? Math.abs(rectF2.top) : rectF2.bottom - MatrixView.this.K.bottom);
            if (f5 < 0.0f) {
                iAbs2 = ActivityChooserView.f.f1331h - iAbs2;
            }
            int i10 = f5 < 0.0f ? iAbs2 : 0;
            int i11 = f5 < 0.0f ? Integer.MAX_VALUE : iAbs2;
            if (f5 < 0.0f) {
                iAbs2 = ActivityChooserView.f.f1331h - i10;
            }
            if (f4 == 0.0f) {
                i4 = 0;
                i5 = 0;
            } else {
                i4 = i8;
                i5 = i9;
            }
            if (f5 == 0.0f) {
                i6 = 0;
                i7 = 0;
            } else {
                i6 = i10;
                i7 = i11;
            }
            this.f6172d.fling(this.f6177i, this.f6178j, (int) f4, (int) f5, i4, i5, i6, i7, Math.abs(iAbs) < MatrixView.this.f6135f * 2 ? 0 : MatrixView.this.f6135f, Math.abs(iAbs2) >= MatrixView.this.f6135f * 2 ? MatrixView.this.f6135f : 0);
        }

        public void h(int i4, int i5) {
            this.f6175g.startScroll(i4, 0, i5 - i4, 0, MatrixView.this.f6129c);
        }

        public void i(int i4, int i5, int i6) {
            this.f6175g.startScroll(i4, 0, i5 - i4, 0, i6);
        }

        public void j(float f4, float f5) {
            this.f6173e.startScroll((int) (f4 * 10000.0f), 0, (int) ((f5 - f4) * 10000.0f), 0, MatrixView.this.f6129c);
        }

        public void k(int i4, int i5, int i6, int i7) {
            this.f6179k = 0;
            this.f6180l = 0;
            this.f6171c.startScroll(0, 0, i6, i7, MatrixView.this.f6129c);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            boolean z4 = false;
            boolean z5 = true;
            if (this.f6173e.computeScrollOffset()) {
                MatrixView.this.F = this.f6173e.getCurrX() / 10000.0f;
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f6171c.computeScrollOffset()) {
                int currX = this.f6171c.getCurrX() - this.f6179k;
                int currY = this.f6171c.getCurrY() - this.f6180l;
                MatrixView.q(MatrixView.this, currX);
                MatrixView.B(MatrixView.this, currY);
                this.f6179k = this.f6171c.getCurrX();
                this.f6180l = this.f6171c.getCurrY();
                z3 = false;
            }
            if (this.f6172d.computeScrollOffset()) {
                int currX2 = this.f6172d.getCurrX() - this.f6177i;
                int currY2 = this.f6172d.getCurrY() - this.f6178j;
                this.f6177i = this.f6172d.getCurrX();
                this.f6178j = this.f6172d.getCurrY();
                MatrixView.q(MatrixView.this, currX2);
                MatrixView.B(MatrixView.this, currY2);
                z3 = false;
            }
            if (this.f6175g.computeScrollOffset()) {
                MatrixView.this.E = this.f6175g.getCurrX();
                z3 = false;
            }
            if (this.f6174f.computeScrollOffset() || MatrixView.this.T != null) {
                float currX3 = this.f6174f.getCurrX() / 10000.0f;
                float currY3 = this.f6174f.getCurrY() / 10000.0f;
                MatrixView.this.f6141l.setScale(currX3, currY3, (MatrixView.this.M.left + MatrixView.this.M.right) / 2.0f, this.f6176h.a());
                MatrixView.this.f6141l.mapRect(this.f6181m, MatrixView.this.M);
                if (currX3 == 1.0f) {
                    this.f6181m.left = MatrixView.this.K.left;
                    this.f6181m.right = MatrixView.this.K.right;
                }
                if (currY3 == 1.0f) {
                    this.f6181m.top = MatrixView.this.K.top;
                    this.f6181m.bottom = MatrixView.this.K.bottom;
                }
                MatrixView.this.T = this.f6181m;
            }
            if (!z3) {
                a();
                b();
                return;
            }
            this.f6170b = false;
            if (MatrixView.this.B) {
                if (MatrixView.this.M.left > 0.0f) {
                    MatrixView matrixView = MatrixView.this;
                    MatrixView.s(matrixView, matrixView.M.left);
                } else if (MatrixView.this.M.right < MatrixView.this.K.width()) {
                    MatrixView matrixView2 = MatrixView.this;
                    MatrixView.r(matrixView2, (int) (matrixView2.K.width() - MatrixView.this.M.right));
                }
                z4 = true;
            }
            if (!MatrixView.this.C) {
                z5 = z4;
            } else if (MatrixView.this.M.top > 0.0f) {
                MatrixView matrixView3 = MatrixView.this;
                MatrixView.D(matrixView3, matrixView3.M.top);
            } else if (MatrixView.this.M.bottom < MatrixView.this.K.height()) {
                MatrixView matrixView4 = MatrixView.this;
                MatrixView.C(matrixView4, (int) (matrixView4.K.height() - MatrixView.this.M.bottom));
            }
            if (z5) {
                a();
            }
            MatrixView.this.invalidate();
            if (MatrixView.this.W != null) {
                MatrixView.this.W.run();
                MatrixView.this.W = null;
            }
        }
    }

    public MatrixView(Context context) {
        super(context);
        this.f6133e = 0;
        this.f6135f = 0;
        this.f6136g = 0;
        this.f6137h = 500;
        this.f6138i = new Matrix();
        this.f6139j = new Matrix();
        this.f6140k = new Matrix();
        this.f6141l = new Matrix();
        this.f6151v = false;
        this.f6152w = false;
        this.F = 1.0f;
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = new PointF();
        this.S = new l();
        this.f6128b0 = new a();
        this.f6130c0 = new b();
        this.f6132d0 = new c();
        this.f6134e0 = new d();
        v0();
    }

    public static /* synthetic */ int B(MatrixView matrixView, int i4) {
        int i5 = matrixView.H + i4;
        matrixView.H = i5;
        return i5;
    }

    public static /* synthetic */ int C(MatrixView matrixView, int i4) {
        int i5 = matrixView.H - i4;
        matrixView.H = i5;
        return i5;
    }

    public static /* synthetic */ int D(MatrixView matrixView, float f4) {
        int i4 = (int) (matrixView.H - f4);
        matrixView.H = i4;
        return i4;
    }

    public static /* synthetic */ float Z(MatrixView matrixView, float f4) {
        float f5 = matrixView.F * f4;
        matrixView.F = f5;
        return f5;
    }

    public static /* synthetic */ float c(MatrixView matrixView, float f4) {
        float f5 = matrixView.D + f4;
        matrixView.D = f5;
        return f5;
    }

    public static /* synthetic */ int q(MatrixView matrixView, int i4) {
        int i5 = matrixView.G + i4;
        matrixView.G = i5;
        return i5;
    }

    public static int q0(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        return intrinsicHeight <= 0 ? drawable.getBounds().height() : intrinsicHeight;
    }

    public static /* synthetic */ int r(MatrixView matrixView, int i4) {
        int i5 = matrixView.G - i4;
        matrixView.G = i5;
        return i5;
    }

    public static int r0(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        return intrinsicWidth <= 0 ? drawable.getBounds().width() : intrinsicWidth;
    }

    public static /* synthetic */ int s(MatrixView matrixView, float f4) {
        int i4 = (int) (matrixView.G - f4);
        matrixView.G = i4;
        return i4;
    }

    public static h2.a s0(ImageView imageView) {
        int[] iArr = new int[2];
        t0(imageView, iArr);
        Drawable drawable = imageView.getDrawable();
        Matrix imageMatrix = imageView.getImageMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, r0(drawable), q0(drawable));
        imageMatrix.mapRect(rectF);
        int i4 = iArr[0];
        float f4 = i4 + rectF.left;
        int i5 = iArr[1];
        RectF rectF2 = new RectF(f4, i5 + rectF.top, i4 + rectF.right, i5 + rectF.bottom);
        RectF rectF3 = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
        return new h2.a(rectF2, rectF, rectF3, new RectF(rectF3), new PointF(rectF3.width() / 2.0f, rectF3.height() / 2.0f), 1.0f, 0.0f, imageView.getScaleType());
    }

    public static void t0(View view, int[] iArr) {
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        while (true) {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                iArr[0] = (int) (iArr[0] + 0.5f);
                iArr[1] = (int) (iArr[1] + 0.5f);
                return;
            }
            view = (View) parent;
            if (view.getId() == 16908290) {
                return;
            }
            iArr[0] = iArr[0] - view.getScrollX();
            iArr[1] = iArr[1] - view.getScrollY();
            iArr[0] = iArr[0] + view.getLeft();
            iArr[1] = iArr[1] + view.getTop();
        }
    }

    public static /* synthetic */ float y(MatrixView matrixView, float f4) {
        float f5 = matrixView.E + f4;
        matrixView.E = f5;
        return f5;
    }

    public final void A0() {
        if (this.M.width() < this.K.width()) {
            float fWidth = this.K.width() / this.M.width();
            this.F = fWidth;
            Matrix matrix = this.f6139j;
            PointF pointF = this.P;
            matrix.postScale(fWidth, fWidth, pointF.x, pointF.y);
            p0();
            J0();
        }
    }

    public final void B0() {
        A0();
        float f4 = this.K.bottom - this.M.bottom;
        this.H = (int) (this.H + f4);
        this.f6139j.postTranslate(0.0f, f4);
        p0();
        J0();
    }

    public final void C0() {
        A0();
        float f4 = -this.M.top;
        this.f6139j.postTranslate(0.0f, f4);
        p0();
        J0();
        this.H = (int) (this.H + f4);
    }

    public final void D0() {
        float fWidth = this.K.width() / this.M.width();
        float fHeight = this.K.height() / this.M.height();
        Matrix matrix = this.f6139j;
        PointF pointF = this.P;
        matrix.postScale(fWidth, fHeight, pointF.x, pointF.y);
        p0();
        J0();
    }

    public final boolean E0(RectF rectF) {
        return Math.abs(((float) Math.round(rectF.top)) - ((this.K.height() - rectF.height()) / 2.0f)) < 1.0f;
    }

    public final boolean F0(RectF rectF) {
        return Math.abs(((float) Math.round(rectF.left)) - ((this.K.width() - rectF.width()) / 2.0f)) < 1.0f;
    }

    public final void G0(RectF rectF, RectF rectF2, RectF rectF3) {
        float f4 = rectF.left;
        float f5 = rectF2.left;
        if (f4 <= f5) {
            f4 = f5;
        }
        float f6 = rectF.right;
        float f7 = rectF2.right;
        if (f6 >= f7) {
            f6 = f7;
        }
        if (f4 > f6) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        float f8 = rectF.top;
        float f9 = rectF2.top;
        if (f8 <= f9) {
            f8 = f9;
        }
        float f10 = rectF.bottom;
        float f11 = rectF2.bottom;
        if (f10 >= f11) {
            f10 = f11;
        }
        if (f8 > f10) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            rectF3.set(f4, f8, f6, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r1
      0x003d: PHI (r1v21 float) = (r1v4 float), (r1v5 float) binds: [B:17:0x003b, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            r6 = this;
            com.sonoptek.pvus_android.matrix_view.MatrixView$l r0 = r6.S
            boolean r1 = r0.f6170b
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r6.A
            r2 = 1119092736(0x42b40000, float:90.0)
            if (r1 != 0) goto L15
            float r1 = r6.E
            float r1 = r1 % r2
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L35
        L15:
            float r1 = r6.E
            float r3 = r1 / r2
            int r3 = (int) r3
            int r3 = r3 * 90
            float r3 = (float) r3
            float r4 = r1 % r2
            r5 = 1110704128(0x42340000, float:45.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L27
            float r3 = r3 + r2
            goto L2e
        L27:
            r5 = -1036779520(0xffffffffc2340000, float:-45.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L2e
            float r3 = r3 - r2
        L2e:
            int r1 = (int) r1
            int r2 = (int) r3
            r0.h(r1, r2)
            r6.E = r3
        L35:
            float r0 = r6.F
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L44
        L3d:
            com.sonoptek.pvus_android.matrix_view.MatrixView$l r2 = r6.S
            r2.j(r0, r1)
            r0 = r1
            goto L4b
        L44:
            float r1 = r6.f6131d
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L4b
            goto L3d
        L4b:
            android.graphics.RectF r1 = r6.M
            float r2 = r1.left
            float r1 = r1.width()
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r2 = r2 + r1
            android.graphics.RectF r1 = r6.M
            float r4 = r1.top
            float r1 = r1.height()
            float r1 = r1 / r3
            float r4 = r4 + r1
            android.graphics.PointF r1 = r6.Q
            r1.set(r2, r4)
            android.graphics.PointF r1 = r6.R
            r1.set(r2, r4)
            r1 = 0
            r6.G = r1
            r6.H = r1
            android.graphics.Matrix r1 = r6.f6141l
            r1.reset()
            android.graphics.Matrix r1 = r6.f6141l
            android.graphics.RectF r3 = r6.L
            float r5 = r3.left
            float r5 = -r5
            float r3 = r3.top
            float r3 = -r3
            r1.postTranslate(r5, r3)
            android.graphics.Matrix r1 = r6.f6141l
            float r3 = r6.I
            float r3 = r2 - r3
            float r5 = r6.J
            float r5 = r4 - r5
            r1.postTranslate(r3, r5)
            android.graphics.Matrix r1 = r6.f6141l
            r1.postScale(r0, r0, r2, r4)
            android.graphics.Matrix r0 = r6.f6141l
            float r1 = r6.E
            r0.postRotate(r1, r2, r4)
            android.graphics.Matrix r0 = r6.f6141l
            android.graphics.RectF r1 = r6.N
            android.graphics.RectF r2 = r6.L
            r0.mapRect(r1, r2)
            android.graphics.RectF r0 = r6.N
            r6.m0(r0)
            com.sonoptek.pvus_android.matrix_view.MatrixView$l r0 = r6.S
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.matrix_view.MatrixView.H0():void");
    }

    public final void I0() {
        this.f6139j.reset();
        p0();
        this.F = 1.0f;
        this.G = 0;
        this.H = 0;
    }

    public final void J0() {
        Drawable drawable = getDrawable();
        this.L.set(0.0f, 0.0f, r0(drawable), q0(drawable));
        this.f6138i.set(this.f6140k);
        this.f6138i.mapRect(this.L);
        this.I = this.L.width() / 2.0f;
        this.J = this.L.height() / 2.0f;
        this.F = 1.0f;
        this.G = 0;
        this.H = 0;
        this.f6139j.reset();
    }

    public final float K0(float f4, float f5) {
        return f5 * (Math.abs(Math.abs(f4) - this.f6136g) / this.f6136g);
    }

    public final float L0(float f4, float f5) {
        return f5 * (Math.abs(Math.abs(f4) - this.f6136g) / this.f6136g);
    }

    public void M0(float f4) {
        this.E += f4;
        RectF rectF = this.K;
        int iWidth = (int) (rectF.left + (rectF.width() / 2.0f));
        RectF rectF2 = this.K;
        this.f6139j.postRotate(f4, iWidth, (int) (rectF2.top + (rectF2.height() / 2.0f)));
        p0();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f6147r) {
            return true;
        }
        return h0(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        if (this.f6147r) {
            return true;
        }
        return i0(i4);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f6151v) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (motionEvent.getPointerCount() >= 2) {
            this.f6147r = true;
        }
        this.f6143n.onTouchEvent(motionEvent);
        if (this.f6152w) {
            this.f6142m.b(motionEvent);
        }
        this.f6144o.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            H0();
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        RectF rectF = this.T;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.T = null;
        }
        super.draw(canvas);
    }

    public void f0(h2.a aVar) {
        if (!this.f6153x) {
            this.U = aVar;
            this.V = System.currentTimeMillis();
            return;
        }
        I0();
        h2.a info = getInfo();
        float fWidth = aVar.f8028b.width() / info.f8028b.width();
        float fHeight = aVar.f8028b.height() / info.f8028b.height();
        if (fWidth >= fHeight) {
            fWidth = fHeight;
        }
        RectF rectF = aVar.f8027a;
        float fWidth2 = rectF.left + (rectF.width() / 2.0f);
        RectF rectF2 = aVar.f8027a;
        float fHeight2 = rectF2.top + (rectF2.height() / 2.0f);
        RectF rectF3 = info.f8027a;
        float fWidth3 = rectF3.left + (rectF3.width() / 2.0f);
        RectF rectF4 = info.f8027a;
        float fHeight3 = rectF4.top + (rectF4.height() / 2.0f);
        this.f6139j.reset();
        float f4 = fWidth2 - fWidth3;
        float f5 = fHeight2 - fHeight3;
        this.f6139j.postTranslate(f4, f5);
        this.f6139j.postScale(fWidth, fWidth, fWidth2, fHeight2);
        this.f6139j.postRotate(aVar.f8033g, fWidth2, fHeight2);
        p0();
        this.Q.set(fWidth2, fHeight2);
        this.R.set(fWidth2, fHeight2);
        this.S.k(0, 0, (int) (-f4), (int) (-f5));
        this.S.j(fWidth, 1.0f);
        this.S.h((int) aVar.f8033g, 0);
        if (aVar.f8029c.width() < aVar.f8028b.width() || aVar.f8029c.height() < aVar.f8028b.height()) {
            float fWidth4 = aVar.f8029c.width() / aVar.f8028b.width();
            float fHeight4 = aVar.f8029c.height() / aVar.f8028b.height();
            if (fWidth4 > 1.0f) {
                fWidth4 = 1.0f;
            }
            if (fHeight4 > 1.0f) {
                fHeight4 = 1.0f;
            }
            ImageView.ScaleType scaleType = aVar.f8034h;
            g kVar = scaleType == ImageView.ScaleType.FIT_START ? new k() : scaleType == ImageView.ScaleType.FIT_END ? new h() : new j();
            this.S.f(fWidth4, fHeight4, 1.0f - fWidth4, 1.0f - fHeight4, this.f6129c / 3, kVar);
            Matrix matrix = this.f6141l;
            RectF rectF5 = this.M;
            matrix.setScale(fWidth4, fHeight4, (rectF5.left + rectF5.right) / 2.0f, kVar.a());
            this.f6141l.mapRect(this.S.f6181m, this.M);
            this.T = this.S.f6181m;
        }
        this.S.d();
    }

    public void g0(h2.a aVar, Runnable runnable) {
        if (this.f6153x) {
            this.S.e();
            this.G = 0;
            this.H = 0;
            RectF rectF = aVar.f8027a;
            float fWidth = rectF.left + (rectF.width() / 2.0f);
            RectF rectF2 = aVar.f8027a;
            float fHeight = rectF2.top + (rectF2.height() / 2.0f);
            PointF pointF = this.Q;
            RectF rectF3 = this.M;
            float fWidth2 = rectF3.left + (rectF3.width() / 2.0f);
            RectF rectF4 = this.M;
            pointF.set(fWidth2, rectF4.top + (rectF4.height() / 2.0f));
            this.R.set(this.Q);
            Matrix matrix = this.f6139j;
            float f4 = -this.E;
            PointF pointF2 = this.Q;
            matrix.postRotate(f4, pointF2.x, pointF2.y);
            this.f6139j.mapRect(this.M, this.L);
            float fWidth3 = aVar.f8028b.width() / this.L.width();
            float fHeight2 = aVar.f8028b.height() / this.L.height();
            if (fWidth3 <= fHeight2) {
                fWidth3 = fHeight2;
            }
            Matrix matrix2 = this.f6139j;
            float f5 = this.E;
            PointF pointF3 = this.Q;
            matrix2.postRotate(f5, pointF3.x, pointF3.y);
            this.f6139j.mapRect(this.M, this.L);
            this.E %= 360.0f;
            l lVar = this.S;
            PointF pointF4 = this.Q;
            lVar.k(0, 0, (int) (fWidth - pointF4.x), (int) (fHeight - pointF4.y));
            this.S.j(this.F, fWidth3);
            this.S.i((int) this.E, (int) aVar.f8033g, (this.f6129c * 2) / 3);
            if (aVar.f8029c.width() < aVar.f8027a.width() || aVar.f8029c.height() < aVar.f8027a.height()) {
                float fWidth4 = aVar.f8029c.width() / aVar.f8027a.width();
                float fHeight3 = aVar.f8029c.height() / aVar.f8027a.height();
                if (fWidth4 > 1.0f) {
                    fWidth4 = 1.0f;
                }
                if (fHeight3 > 1.0f) {
                    fHeight3 = 1.0f;
                }
                ImageView.ScaleType scaleType = aVar.f8034h;
                postDelayed(new e(fWidth4, fHeight3, scaleType == ImageView.ScaleType.FIT_START ? new k() : scaleType == ImageView.ScaleType.FIT_END ? new h() : new j()), this.f6129c / 2);
            }
            this.W = runnable;
            this.S.d();
        }
    }

    public int getAnimaDuring() {
        return this.f6129c;
    }

    public int getDefaultAnimaDuring() {
        return f6124g0;
    }

    public h2.a getInfo() {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        t0(this, iArr);
        int i4 = iArr[0];
        RectF rectF2 = this.M;
        float f4 = i4 + rectF2.left;
        int i5 = iArr[1];
        rectF.set(f4, i5 + rectF2.top, i4 + rectF2.right, i5 + rectF2.bottom);
        return new h2.a(rectF, this.M, this.K, this.L, this.P, this.F, this.E, this.f6146q);
    }

    public float getMaxScale() {
        return this.f6131d;
    }

    public boolean h0(float f4) {
        if (this.M.width() <= this.K.width()) {
            return false;
        }
        if (f4 >= 0.0f || Math.round(this.M.left) - f4 < this.K.left) {
            return f4 <= 0.0f || ((float) Math.round(this.M.right)) - f4 > this.K.right;
        }
        return false;
    }

    public boolean i0(float f4) {
        if (this.M.height() <= this.K.height()) {
            return false;
        }
        if (f4 >= 0.0f || Math.round(this.M.top) - f4 < this.K.top) {
            return f4 <= 0.0f || ((float) Math.round(this.M.bottom)) - f4 > this.K.bottom;
        }
        return false;
    }

    public final void j0() {
        if (this.f6150u) {
            return;
        }
        G0(this.K, this.M, this.O);
    }

    public void k0() {
        this.f6152w = false;
    }

    public void l0() {
        this.f6151v = false;
    }

    public final void m0(RectF rectF) {
        float f4;
        int i4;
        int i5 = 0;
        if (rectF.width() <= this.K.width()) {
            i4 = !F0(rectF) ? -((int) (((this.K.width() - rectF.width()) / 2.0f) - rectF.left)) : 0;
        } else {
            float f5 = rectF.left;
            RectF rectF2 = this.K;
            float f6 = rectF2.left;
            if (f5 > f6) {
                f4 = f5 - f6;
            } else {
                float f7 = rectF.right;
                float f8 = rectF2.right;
                if (f7 < f8) {
                    f4 = f7 - f8;
                }
            }
            i4 = (int) f4;
        }
        if (rectF.height() > this.K.height()) {
            float f9 = rectF.top;
            RectF rectF3 = this.K;
            float f10 = rectF3.top;
            if (f9 > f10) {
                i5 = (int) (f9 - f10);
            } else {
                float f11 = rectF.bottom;
                float f12 = rectF3.bottom;
                if (f11 < f12) {
                    i5 = (int) (f11 - f12);
                }
            }
        } else if (!E0(rectF)) {
            i5 = -((int) (((this.K.height() - rectF.height()) / 2.0f) - rectF.top));
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (!this.S.f6172d.isFinished()) {
            this.S.f6172d.abortAnimation();
        }
        this.S.k(this.G, this.H, -i4, -i5);
    }

    public void n0() {
        this.f6151v = true;
    }

    public void o0() {
        this.f6152w = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        if (!this.f6148s) {
            super.onMeasure(i4, i5);
            return;
        }
        Drawable drawable = getDrawable();
        int iR0 = r0(drawable);
        int iQ0 = q0(drawable);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i6 = layoutParams.width;
        if (i6 != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || iR0 <= size) : mode == 0) {
            size = iR0;
        }
        int i7 = layoutParams.height;
        if (i7 != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || iQ0 <= size2) : mode2 == 0) {
            size2 = iQ0;
        }
        if (this.f6154y) {
            float f4 = iR0;
            float f5 = iQ0;
            float f6 = size;
            float f7 = size2;
            if (f4 / f5 != f6 / f7) {
                float f8 = f7 / f5;
                float f9 = f6 / f4;
                if (f8 >= f9) {
                    f8 = f9;
                }
                if (i6 != -1) {
                    size = (int) (f4 * f8);
                }
                if (i7 != -1) {
                    size2 = (int) (f5 * f8);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.K.set(0.0f, 0.0f, i4, i5);
        this.P.set(i4 / 2, i5 / 2);
        if (this.f6149t) {
            return;
        }
        this.f6149t = true;
        w0();
    }

    public final void p0() {
        this.f6140k.set(this.f6138i);
        this.f6140k.postConcat(this.f6139j);
        setImageMatrix(this.f6140k);
        this.f6139j.mapRect(this.M, this.L);
        this.B = this.M.width() > this.K.width();
        this.C = this.M.height() > this.K.height();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z3) {
        super.setAdjustViewBounds(z3);
        this.f6154y = z3;
    }

    public void setAnimaDuring(int i4) {
        this.f6129c = i4;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.f6148s = false;
        } else if (u0(drawable)) {
            if (!this.f6148s) {
                this.f6148s = true;
            }
            w0();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i4);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.S.c(interpolator);
    }

    public void setMaxAnimFromWaiteTime(int i4) {
        this.f6137h = i4;
    }

    public void setMaxScale(float f4) {
        this.f6131d = f4;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f6145p = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6126a0 = onLongClickListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX || scaleType == this.f6146q) {
            return;
        }
        this.f6146q = scaleType;
        if (this.f6153x) {
            w0();
        }
    }

    public final boolean u0(Drawable drawable) {
        if (drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) {
            return true;
        }
        if (drawable.getMinimumWidth() <= 0 || drawable.getMinimumHeight() <= 0) {
            return drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0;
        }
        return true;
    }

    public final void v0() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.f6146q == null) {
            this.f6146q = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.f6142m = new h2.c(this.f6128b0);
        this.f6143n = new GestureDetector(getContext(), this.f6134e0);
        this.f6144o = new ScaleGestureDetector(getContext(), this.f6130c0);
        float f4 = getResources().getDisplayMetrics().density;
        int i4 = (int) (30.0f * f4);
        this.f6133e = i4;
        this.f6135f = i4;
        this.f6136g = (int) (f4 * 140.0f);
        this.f6127b = 35;
        this.f6129c = f6124g0;
        this.f6131d = 5.0f;
    }

    public final void w0() {
        if (this.f6148s && this.f6149t) {
            this.f6138i.reset();
            this.f6139j.reset();
            this.f6155z = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int iR0 = r0(drawable);
            int iQ0 = q0(drawable);
            float f4 = iR0;
            float f5 = iQ0;
            this.L.set(0.0f, 0.0f, f4, f5);
            int i4 = (width - iR0) / 2;
            int i5 = (height - iQ0) / 2;
            float f6 = iR0 > width ? width / f4 : 1.0f;
            float f7 = iQ0 > height ? height / f5 : 1.0f;
            if (f6 >= f7) {
                f6 = f7;
            }
            this.f6138i.reset();
            this.f6138i.postTranslate(i4, i5);
            Matrix matrix = this.f6138i;
            PointF pointF = this.P;
            matrix.postScale(f6, f6, pointF.x, pointF.y);
            this.f6138i.mapRect(this.L);
            this.I = this.L.width() / 2.0f;
            this.J = this.L.height() / 2.0f;
            this.Q.set(this.P);
            this.R.set(this.Q);
            p0();
            switch (f.f6164a[this.f6146q.ordinal()]) {
                case 1:
                    x0();
                    break;
                case 2:
                    y0();
                    break;
                case 3:
                    z0();
                    break;
                case 4:
                    A0();
                    break;
                case 5:
                    C0();
                    break;
                case 6:
                    B0();
                    break;
                case 7:
                    D0();
                    break;
            }
            this.f6153x = true;
            if (this.U != null && System.currentTimeMillis() - this.V < this.f6137h) {
                f0(this.U);
            }
            this.U = null;
        }
    }

    public final void x0() {
        if (this.f6148s && this.f6149t) {
            Drawable drawable = getDrawable();
            int iR0 = r0(drawable);
            int iQ0 = q0(drawable);
            float f4 = iR0;
            if (f4 > this.K.width() || iQ0 > this.K.height()) {
                float fWidth = f4 / this.M.width();
                float fHeight = iQ0 / this.M.height();
                if (fWidth <= fHeight) {
                    fWidth = fHeight;
                }
                this.F = fWidth;
                Matrix matrix = this.f6139j;
                PointF pointF = this.P;
                matrix.postScale(fWidth, fWidth, pointF.x, pointF.y);
                p0();
                J0();
            }
        }
    }

    public final void y0() {
        if (this.M.width() < this.K.width() || this.M.height() < this.K.height()) {
            float fWidth = this.K.width() / this.M.width();
            float fHeight = this.K.height() / this.M.height();
            if (fWidth <= fHeight) {
                fWidth = fHeight;
            }
            this.F = fWidth;
            Matrix matrix = this.f6139j;
            PointF pointF = this.P;
            matrix.postScale(fWidth, fWidth, pointF.x, pointF.y);
            p0();
            J0();
        }
    }

    public final void z0() {
        if (this.M.width() > this.K.width() || this.M.height() > this.K.height()) {
            float fWidth = this.K.width() / this.M.width();
            float fHeight = this.K.height() / this.M.height();
            if (fWidth >= fHeight) {
                fWidth = fHeight;
            }
            this.F = fWidth;
            Matrix matrix = this.f6139j;
            PointF pointF = this.P;
            matrix.postScale(fWidth, fWidth, pointF.x, pointF.y);
            p0();
            J0();
        }
    }

    public MatrixView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6133e = 0;
        this.f6135f = 0;
        this.f6136g = 0;
        this.f6137h = 500;
        this.f6138i = new Matrix();
        this.f6139j = new Matrix();
        this.f6140k = new Matrix();
        this.f6141l = new Matrix();
        this.f6151v = false;
        this.f6152w = false;
        this.F = 1.0f;
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = new PointF();
        this.S = new l();
        this.f6128b0 = new a();
        this.f6130c0 = new b();
        this.f6132d0 = new c();
        this.f6134e0 = new d();
        v0();
    }

    public MatrixView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6133e = 0;
        this.f6135f = 0;
        this.f6136g = 0;
        this.f6137h = 500;
        this.f6138i = new Matrix();
        this.f6139j = new Matrix();
        this.f6140k = new Matrix();
        this.f6141l = new Matrix();
        this.f6151v = false;
        this.f6152w = false;
        this.F = 1.0f;
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = new PointF();
        this.S = new l();
        this.f6128b0 = new a();
        this.f6130c0 = new b();
        this.f6132d0 = new c();
        this.f6134e0 = new d();
        v0();
    }
}
