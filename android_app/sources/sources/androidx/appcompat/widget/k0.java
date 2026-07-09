package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f1772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f1773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f1774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f1777j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = k0.this.f1772e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.e();
        }
    }

    public k0(View view) {
        this.f1772e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1769b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1770c = tapTimeout;
        this.f1771d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    public final void a() {
        Runnable runnable = this.f1774g;
        if (runnable != null) {
            this.f1772e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1773f;
        if (runnable2 != null) {
            this.f1772e.removeCallbacks(runnable2);
        }
    }

    public abstract k.f b();

    public boolean c() {
        k.f fVarB = b();
        if (fVarB == null || fVarB.c()) {
            return true;
        }
        fVarB.e();
        return true;
    }

    public boolean d() {
        k.f fVarB = b();
        if (fVarB == null || !fVarB.c()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f1772e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1775h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        i0 i0Var;
        View view = this.f1772e;
        k.f fVarB = b();
        if (fVarB == null || !fVarB.c() || (i0Var = (i0) fVarB.p()) == null || !i0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(i0Var, motionEventObtainNoHistory);
        boolean zF = i0Var.f(motionEventObtainNoHistory, this.f1776i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zF && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1772e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1776i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1769b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1776i = r6
            java.lang.Runnable r6 = r5.f1773f
            if (r6 != 0) goto L52
            androidx.appcompat.widget.k0$a r6 = new androidx.appcompat.widget.k0$a
            r6.<init>()
            r5.f1773f = r6
        L52:
            java.lang.Runnable r6 = r5.f1773f
            int r1 = r5.f1770c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1774g
            if (r6 != 0) goto L65
            androidx.appcompat.widget.k0$b r6 = new androidx.appcompat.widget.k0$b
            r6.<init>()
            r5.f1774g = r6
        L65:
            java.lang.Runnable r6 = r5.f1774g
            int r1 = r5.f1771d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1777j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1777j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f1775h;
        if (z4) {
            z3 = f(motionEvent) || !d();
        } else {
            z3 = g(motionEvent) && c();
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1772e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1775h = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1775h = false;
        this.f1776i = -1;
        Runnable runnable = this.f1773f;
        if (runnable != null) {
            this.f1772e.removeCallbacks(runnable);
        }
    }
}
