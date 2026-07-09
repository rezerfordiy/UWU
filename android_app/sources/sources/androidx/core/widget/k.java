package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverScroller f3505a;

    public k(Context context, Interpolator interpolator) {
        this.f3505a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static k c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static k d(Context context, Interpolator interpolator) {
        return new k(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f3505a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f3505a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f3505a.fling(i4, i5, i6, i7, i8, i9, i10, i11);
    }

    @Deprecated
    public void f(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f3505a.fling(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
    }

    @Deprecated
    public float g() {
        return this.f3505a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f3505a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f3505a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f3505a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f3505a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f3505a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f3505a.isOverScrolled();
    }

    @Deprecated
    public void n(int i4, int i5, int i6) {
        this.f3505a.notifyHorizontalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public void o(int i4, int i5, int i6) {
        this.f3505a.notifyVerticalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public boolean p(int i4, int i5, int i6, int i7, int i8, int i9) {
        return this.f3505a.springBack(i4, i5, i6, i7, i8, i9);
    }

    @Deprecated
    public void q(int i4, int i5, int i6, int i7) {
        this.f3505a.startScroll(i4, i5, i6, i7);
    }

    @Deprecated
    public void r(int i4, int i5, int i6, int i7, int i8) {
        this.f3505a.startScroll(i4, i5, i6, i7, i8);
    }
}
