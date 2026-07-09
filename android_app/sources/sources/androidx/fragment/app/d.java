package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.w;
import c.j0;
import e1.a;
import p0.b;
import v0.b1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    public class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f3890a;

        public a(Fragment fragment) {
            this.f3890a = fragment;
        }

        @Override // p0.b.a
        public void a() {
            if (this.f3890a.p() != null) {
                View viewP = this.f3890a.p();
                this.f3890a.Y1(null);
                viewP.clearAnimation();
            }
            this.f3890a.a2(null);
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f3892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w.g f3893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p0.b f3894d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3892b.p() != null) {
                    b.this.f3892b.Y1(null);
                    b bVar = b.this;
                    bVar.f3893c.a(bVar.f3892b, bVar.f3894d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, w.g gVar, p0.b bVar) {
            this.f3891a = viewGroup;
            this.f3892b = fragment;
            this.f3893c = gVar;
            this.f3894d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3891a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f3898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w.g f3899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p0.b f3900e;

        public c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, p0.b bVar) {
            this.f3896a = viewGroup;
            this.f3897b = view;
            this.f3898c = fragment;
            this.f3899d = gVar;
            this.f3900e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3896a.endViewTransition(this.f3897b);
            Animator animatorQ = this.f3898c.q();
            this.f3898c.a2(null);
            if (animatorQ == null || this.f3896a.indexOfChild(this.f3897b) >= 0) {
                return;
            }
            this.f3899d.a(this.f3898c, this.f3900e);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    public static class C0022d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f3901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f3902b;

        public C0022d(Animator animator) {
            this.f3901a = null;
            this.f3902b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public C0022d(Animation animation) {
            this.f3901a = animation;
            this.f3902b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f3903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f3904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3907f;

        public e(@j0 Animation animation, @j0 ViewGroup viewGroup, @j0 View view) {
            super(false);
            this.f3907f = true;
            this.f3903b = viewGroup;
            this.f3904c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, @j0 Transformation transformation) {
            this.f3907f = true;
            if (this.f3905d) {
                return !this.f3906e;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f3905d = true;
                b1.a(this.f3903b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3905d || !this.f3907f) {
                this.f3903b.endViewTransition(this.f3904c);
                this.f3906e = true;
            } else {
                this.f3907f = false;
                this.f3903b.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, @j0 Transformation transformation, float f4) {
            this.f3907f = true;
            if (this.f3905d) {
                return !this.f3906e;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f3905d = true;
                b1.a(this.f3903b, this);
            }
            return true;
        }
    }

    public static void a(@j0 Fragment fragment, @j0 C0022d c0022d, @j0 w.g gVar) {
        View view = fragment.I;
        ViewGroup viewGroup = fragment.H;
        viewGroup.startViewTransition(view);
        p0.b bVar = new p0.b();
        bVar.d(new a(fragment));
        gVar.b(fragment, bVar);
        if (c0022d.f3901a != null) {
            e eVar = new e(c0022d.f3901a, viewGroup, view);
            fragment.Y1(fragment.I);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.I.startAnimation(eVar);
            return;
        }
        Animator animator = c0022d.f3902b;
        fragment.a2(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.I);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z3, boolean z4) {
        return z4 ? z3 ? fragment.N() : fragment.O() : z3 ? fragment.v() : fragment.y();
    }

    public static C0022d c(@j0 Context context, @j0 Fragment fragment, boolean z3, boolean z4) {
        int iJ = fragment.J();
        int iB = b(fragment, z3, z4);
        boolean z5 = false;
        fragment.Z1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            int i4 = a.g.f7570u0;
            if (viewGroup.getTag(i4) != null) {
                fragment.H.setTag(i4, null);
            }
        }
        ViewGroup viewGroup2 = fragment.H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationI0 = fragment.I0(iJ, z3, iB);
        if (animationI0 != null) {
            return new C0022d(animationI0);
        }
        Animator animatorJ0 = fragment.J0(iJ, z3, iB);
        if (animatorJ0 != null) {
            return new C0022d(animatorJ0);
        }
        if (iB == 0 && iJ != 0) {
            iB = d(iJ, z3);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new C0022d(animationLoadAnimation);
                    }
                    z5 = true;
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            if (!z5) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new C0022d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e5) {
                    if (zEquals) {
                        throw e5;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new C0022d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    @c.a
    public static int d(int i4, boolean z3) {
        if (i4 == 4097) {
            return z3 ? a.b.f7477e : a.b.f7478f;
        }
        if (i4 == 4099) {
            return z3 ? a.b.f7475c : a.b.f7476d;
        }
        if (i4 != 8194) {
            return -1;
        }
        return z3 ? a.b.f7473a : a.b.f7474b;
    }
}
