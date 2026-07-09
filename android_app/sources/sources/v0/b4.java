package v0;

import android.os.Build;
import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: classes.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11990a;

    @c.o0(30)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsAnimationController f11991a;

        public a(@c.j0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f11991a = windowInsetsAnimationController;
        }

        @Override // v0.b4.b
        public void a(boolean z3) {
            this.f11991a.finish(z3);
        }

        @Override // v0.b4.b
        public float b() {
            return this.f11991a.getCurrentAlpha();
        }

        @Override // v0.b4.b
        public float c() {
            return this.f11991a.getCurrentFraction();
        }

        @Override // v0.b4.b
        @c.j0
        public g0.r0 d() {
            return g0.r0.g(this.f11991a.getCurrentInsets());
        }

        @Override // v0.b4.b
        @c.j0
        public g0.r0 e() {
            return g0.r0.g(this.f11991a.getHiddenStateInsets());
        }

        @Override // v0.b4.b
        @c.j0
        public g0.r0 f() {
            return g0.r0.g(this.f11991a.getShownStateInsets());
        }

        @Override // v0.b4.b
        public int g() {
            return this.f11991a.getTypes();
        }

        @Override // v0.b4.b
        public boolean h() {
            return this.f11991a.isCancelled();
        }

        @Override // v0.b4.b
        public boolean i() {
            return this.f11991a.isFinished();
        }

        @Override // v0.b4.b
        public boolean j() {
            return this.f11991a.isReady();
        }

        @Override // v0.b4.b
        public void k(@c.k0 g0.r0 r0Var, float f4, float f5) {
            this.f11991a.setInsetsAndAlpha(r0Var == null ? null : r0Var.h(), f4, f5);
        }
    }

    public static class b {
        public void a(boolean z3) {
        }

        public float b() {
            return 0.0f;
        }

        @c.t(from = 0.0d, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @c.j0
        public g0.r0 d() {
            return g0.r0.f7802e;
        }

        @c.j0
        public g0.r0 e() {
            return g0.r0.f7802e;
        }

        @c.j0
        public g0.r0 f() {
            return g0.r0.f7802e;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(@c.k0 g0.r0 r0Var, @c.t(from = 0.0d, to = 1.0d) float f4, @c.t(from = 0.0d, to = 1.0d) float f5) {
        }
    }

    public b4() {
        if (Build.VERSION.SDK_INT < 30) {
            this.f11990a = new b();
            return;
        }
        throw new UnsupportedOperationException("On API 30+, the constructor taking a " + p3.a().getSimpleName() + " as parameter");
    }

    public void a(boolean z3) {
        this.f11990a.a(z3);
    }

    public float b() {
        return this.f11990a.b();
    }

    @c.t(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f11990a.c();
    }

    @c.j0
    public g0.r0 d() {
        return this.f11990a.d();
    }

    @c.j0
    public g0.r0 e() {
        return this.f11990a.e();
    }

    @c.j0
    public g0.r0 f() {
        return this.f11990a.f();
    }

    public int g() {
        return this.f11990a.g();
    }

    public boolean h() {
        return this.f11990a.h();
    }

    public boolean i() {
        return this.f11990a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@c.k0 g0.r0 r0Var, @c.t(from = 0.0d, to = 1.0d) float f4, @c.t(from = 0.0d, to = 1.0d) float f5) {
        this.f11990a.k(r0Var, f4, f5);
    }

    @c.o0(30)
    public b4(@c.j0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f11990a = new a(windowInsetsAnimationController);
    }
}
