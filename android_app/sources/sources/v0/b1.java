package v0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f11987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f11988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f11989d;

    public b1(View view, Runnable runnable) {
        this.f11987b = view;
        this.f11988c = view.getViewTreeObserver();
        this.f11989d = runnable;
    }

    @c.j0
    public static b1 a(@c.j0 View view, @c.j0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        b1 b1Var = new b1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b1Var);
        view.addOnAttachStateChangeListener(b1Var);
        return b1Var;
    }

    public void b() {
        (this.f11988c.isAlive() ? this.f11988c : this.f11987b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f11987b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f11989d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f11988c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
