package com.sonoptek.pvus_android.list;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.sonoptek.pvus_android.MyApplication;

/* JADX INFO: loaded from: classes.dex */
public class SwipeLayout extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f6055w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f6056x = 0.5f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f6057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f6058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f6060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f6061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VelocityTracker f6071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f6072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f6073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f6075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f6076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f6077v;

    public interface a {
        void a(View view);
    }

    public interface b {
        void a(View view);
    }

    public interface c {
        void a(View view, boolean z3);
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    public void a(View view) {
        this.f6061f.addView(view);
        view.setOnClickListener(this);
    }

    public void b() {
        this.f6057b.startScroll(getScrollX(), getScrollY(), -getScrollX(), 0, this.f6059d);
        invalidate();
        this.f6067l = false;
        c cVar = this.f6076u;
        if (cVar != null) {
            cVar.a(this, false);
        }
    }

    public final void c() {
        this.f6058c = getContext();
        this.f6060e = new AccelerateDecelerateInterpolator();
        this.f6057b = new Scroller(this.f6058c, this.f6060e);
        WindowManager windowManager = (WindowManager) this.f6058c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f6063h = (int) (MyApplication.s() * 350.0f);
        this.f6064i = displayMetrics.heightPixels;
        this.f6066k = ViewConfiguration.get(this.f6058c).getScaledTouchSlop();
        setClickable(true);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6057b.computeScrollOffset()) {
            scrollTo(this.f6057b.getCurrX(), this.f6057b.getCurrY());
            invalidate();
        }
    }

    public final void d(MotionEvent motionEvent) {
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.f6071p = velocityTrackerObtain;
        velocityTrackerObtain.addMovement(motionEvent);
        this.f6072q = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6068m = (int) motionEvent.getX();
            this.f6069n = (int) motionEvent.getY();
            this.f6070o = false;
        } else if (action == 2) {
            int x3 = (int) (this.f6068m - motionEvent.getX());
            int y3 = (int) (this.f6069n - motionEvent.getY());
            if (!this.f6070o) {
                if ((this.f6061f.getChildCount() > 0 && x3 > this.f6066k) || (getScrollX() > 0 && Math.abs(x3) > this.f6066k)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f6068m = (int) motionEvent.getX();
                    this.f6070o = true;
                    d(motionEvent);
                    b bVar = this.f6077v;
                    if (bVar != null) {
                        bVar.a(this);
                    }
                }
                if (Math.abs(y3) > this.f6066k) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return this.f6067l;
    }

    public void f() {
        this.f6057b.startScroll(getScrollX(), getScrollY(), this.f6065j - getScrollX(), 0, this.f6059d);
        invalidate();
        this.f6067l = true;
        c cVar = this.f6076u;
        if (cVar != null) {
            cVar.a(this, true);
        }
    }

    public void g() {
        this.f6061f.removeAllViews();
    }

    public void h(int i4) {
        if (this.f6061f.getChildCount() > i4) {
            this.f6061f.removeViewAt(i4);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b();
        a aVar = this.f6075t;
        if (aVar != null) {
            aVar.a(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            this.f6062g = getChildAt(0);
        }
        LinearLayout linearLayout = new LinearLayout(this.f6058c);
        this.f6061f = linearLayout;
        linearLayout.setOrientation(0);
        this.f6061f.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        addView(this.f6061f);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            int x3 = (int) (this.f6068m - motionEvent.getX());
            if (this.f6061f.getChildCount() > 0 && x3 > this.f6066k) {
                return true;
            }
            if (getScrollX() > 0 && Math.abs(x3) > this.f6066k) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt == this.f6061f) {
                this.f6065j = childAt.getMeasuredWidth();
                int i9 = this.f6063h;
                childAt.layout(i9, 0, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, this.f6063h, childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int measuredHeight;
        int measuredWidth;
        View view = this.f6062g;
        if (view != null) {
            measureChild(view, View.MeasureSpec.makeMeasureSpec(this.f6063h, w.b.f12287g), i5);
            measuredHeight = this.f6062g.getMeasuredHeight();
            measuredWidth = this.f6062g.getMeasuredWidth();
        } else {
            measuredHeight = 0;
            measuredWidth = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != this.f6062g) {
                measureChild(childAt, i4, View.MeasureSpec.makeMeasureSpec(measuredHeight, w.b.f12287g));
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            if ((getScrollX() > 0 && getScrollX() >= this.f6065j * this.f6074s) || (getScrollX() > 0 && this.f6072q < (-this.f6073r))) {
                f();
            } else if ((getScrollX() > 0 && this.f6072q > this.f6073r) || (getScrollX() > 0 && getScrollX() < this.f6065j * this.f6074s)) {
                b();
            }
            if (this.f6070o) {
                this.f6071p.clear();
                this.f6071p.recycle();
                this.f6071p = null;
                this.f6072q = 0.0f;
                return true;
            }
        } else if (action == 2 && this.f6070o) {
            this.f6071p.computeCurrentVelocity(100);
            this.f6072q = this.f6071p.getXVelocity();
            int x3 = (int) (this.f6068m - motionEvent.getX());
            if (getScrollX() + x3 <= 0) {
                x3 = -getScrollX();
            }
            int scrollX = getScrollX() + x3;
            int i4 = this.f6065j;
            if (scrollX > i4) {
                x3 = i4 - getScrollX();
            }
            scrollBy(x3, getScrollY());
            this.f6068m = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnMenuClickListener(a aVar) {
        this.f6075t = aVar;
    }

    public void setOnStartScrollListener(b bVar) {
        this.f6077v = bVar;
    }

    public void setOnSwitchScrollListener(c cVar) {
        this.f6076u = cVar;
    }

    public void setScrollDelay(int i4) {
        this.f6059d = i4;
    }

    public void setSpeedThreshold(int i4) {
        this.f6073r = i4;
    }

    public void setSwitchPercent(float f4) {
        if (f4 <= 0.0f || f4 >= 1.0f) {
            f4 = 0.5f;
        }
        this.f6074s = f4;
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6059d = 100;
        this.f6073r = 100.0f;
        this.f6074s = 0.5f;
        c();
    }
}
