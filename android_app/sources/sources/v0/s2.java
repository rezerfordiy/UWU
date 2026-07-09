package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12181e = 2113929216;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<View> f12182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f12183b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f12184c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12185d = -1;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t2 f12186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f12187b;

        public a(t2 t2Var, View view) {
            this.f12186a = t2Var;
            this.f12187b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12186a.c(this.f12187b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12186a.a(this.f12187b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f12186a.b(this.f12187b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v2 f12189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f12190b;

        public b(v2 v2Var, View view) {
            this.f12189a = v2Var;
            this.f12190b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12189a.a(this.f12190b);
        }
    }

    public static class c implements t2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s2 f12192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12193b;

        public c(s2 s2Var) {
            this.f12192a = s2Var;
        }

        @Override // v0.t2
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i4 = this.f12192a.f12185d;
            if (i4 > -1) {
                view.setLayerType(i4, null);
                this.f12192a.f12185d = -1;
            }
            s2 s2Var = this.f12192a;
            Runnable runnable = s2Var.f12184c;
            if (runnable != null) {
                s2Var.f12184c = null;
                runnable.run();
            }
            Object tag = view.getTag(s2.f12181e);
            t2 t2Var = tag instanceof t2 ? (t2) tag : null;
            if (t2Var != null) {
                t2Var.a(view);
            }
            this.f12193b = true;
        }

        @Override // v0.t2
        public void b(View view) {
            this.f12193b = false;
            if (this.f12192a.f12185d > -1) {
                view.setLayerType(2, null);
            }
            s2 s2Var = this.f12192a;
            Runnable runnable = s2Var.f12183b;
            if (runnable != null) {
                s2Var.f12183b = null;
                runnable.run();
            }
            Object tag = view.getTag(s2.f12181e);
            t2 t2Var = tag instanceof t2 ? (t2) tag : null;
            if (t2Var != null) {
                t2Var.b(view);
            }
        }

        @Override // v0.t2
        public void c(View view) {
            Object tag = view.getTag(s2.f12181e);
            t2 t2Var = tag instanceof t2 ? (t2) tag : null;
            if (t2Var != null) {
                t2Var.c(view);
            }
        }
    }

    public s2(View view) {
        this.f12182a = new WeakReference<>(view);
    }

    public s2 A(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationYBy(f4);
        }
        return this;
    }

    public s2 B(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationZ(f4);
        }
        return this;
    }

    public s2 C(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationZBy(f4);
        }
        return this;
    }

    public s2 D(Runnable runnable) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public s2 E() {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public s2 F(Runnable runnable) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public s2 G(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().x(f4);
        }
        return this;
    }

    public s2 H(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().xBy(f4);
        }
        return this;
    }

    public s2 I(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().y(f4);
        }
        return this;
    }

    public s2 J(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().yBy(f4);
        }
        return this;
    }

    public s2 K(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().z(f4);
        }
        return this;
    }

    public s2 L(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().zBy(f4);
        }
        return this;
    }

    public s2 a(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    public s2 b(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().alphaBy(f4);
        }
        return this;
    }

    public void c() {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f12182a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator e() {
        View view = this.f12182a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long f() {
        View view = this.f12182a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public s2 g(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotation(f4);
        }
        return this;
    }

    public s2 h(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotationBy(f4);
        }
        return this;
    }

    public s2 i(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotationX(f4);
        }
        return this;
    }

    public s2 j(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotationXBy(f4);
        }
        return this;
    }

    public s2 k(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotationY(f4);
        }
        return this;
    }

    public s2 l(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().rotationYBy(f4);
        }
        return this;
    }

    public s2 m(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().scaleX(f4);
        }
        return this;
    }

    public s2 n(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().scaleXBy(f4);
        }
        return this;
    }

    public s2 o(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().scaleY(f4);
        }
        return this;
    }

    public s2 p(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().scaleYBy(f4);
        }
        return this;
    }

    public s2 q(long j4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    public s2 r(Interpolator interpolator) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public s2 s(t2 t2Var) {
        View view = this.f12182a.get();
        if (view != null) {
            t(view, t2Var);
        }
        return this;
    }

    public final void t(View view, t2 t2Var) {
        if (t2Var != null) {
            view.animate().setListener(new a(t2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public s2 u(long j4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    public s2 v(v2 v2Var) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().setUpdateListener(v2Var != null ? new b(v2Var, view) : null);
        }
        return this;
    }

    public void w() {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public s2 x(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationX(f4);
        }
        return this;
    }

    public s2 y(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationXBy(f4);
        }
        return this;
    }

    public s2 z(float f4) {
        View view = this.f12182a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }
}
