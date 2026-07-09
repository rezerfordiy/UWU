package v0;

import android.R;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12083b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12084c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12085d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12086a;

    @c.o0(20)
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.j0
        public final Window f12087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c.k0
        public final View f12088b;

        /* JADX INFO: renamed from: v0.h5$a$a, reason: collision with other inner class name */
        public class RunnableC0123a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f12089b;

            public RunnableC0123a(View view) {
                this.f12089b = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) this.f12089b.getContext().getSystemService("input_method")).showSoftInput(this.f12089b, 0);
            }
        }

        public a(@c.j0 Window window, @c.k0 View view) {
            this.f12087a = window;
            this.f12088b = view;
        }

        @Override // v0.h5.e
        public void a(f fVar) {
        }

        @Override // v0.h5.e
        public void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, o3 o3Var) {
        }

        @Override // v0.h5.e
        public int c() {
            return 0;
        }

        @Override // v0.h5.e
        public void d(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    l(i5);
                }
            }
        }

        @Override // v0.h5.e
        public void g(@c.j0 f fVar) {
        }

        @Override // v0.h5.e
        public void j(int i4) {
            if (i4 == 0) {
                p(6144);
                return;
            }
            if (i4 == 1) {
                p(4096);
                m(2048);
            } else {
                if (i4 != 2) {
                    return;
                }
                p(2048);
                m(4096);
            }
        }

        @Override // v0.h5.e
        public void k(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    o(i5);
                }
            }
        }

        public final void l(int i4) {
            if (i4 == 1) {
                m(4);
            } else if (i4 == 2) {
                m(2);
            } else {
                if (i4 != 8) {
                    return;
                }
                ((InputMethodManager) this.f12087a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f12087a.getDecorView().getWindowToken(), 0);
            }
        }

        public void m(int i4) {
            View decorView = this.f12087a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        public void n(int i4) {
            this.f12087a.addFlags(i4);
        }

        public final void o(int i4) {
            if (i4 == 1) {
                p(4);
                q(1024);
                return;
            }
            if (i4 == 2) {
                p(2);
                return;
            }
            if (i4 != 8) {
                return;
            }
            View currentFocus = this.f12088b;
            if (currentFocus == null || !(currentFocus.isInEditMode() || currentFocus.onCheckIsTextEditor())) {
                currentFocus = this.f12087a.getCurrentFocus();
            } else {
                currentFocus.requestFocus();
            }
            if (currentFocus == null) {
                currentFocus = this.f12087a.findViewById(R.id.content);
            }
            if (currentFocus == null || !currentFocus.hasWindowFocus()) {
                return;
            }
            currentFocus.post(new RunnableC0123a(currentFocus));
        }

        public void p(int i4) {
            View decorView = this.f12087a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        public void q(int i4) {
            this.f12087a.clearFlags(i4);
        }
    }

    @c.o0(23)
    public static class b extends a {
        public b(@c.j0 Window window, @c.k0 View view) {
            super(window, view);
        }

        @Override // v0.h5.e
        public boolean f() {
            return (this.f12087a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // v0.h5.e
        public void i(boolean z3) {
            if (!z3) {
                p(8192);
                return;
            }
            q(67108864);
            n(Integer.MIN_VALUE);
            m(8192);
        }
    }

    @c.o0(26)
    public static class c extends b {
        public c(@c.j0 Window window, @c.k0 View view) {
            super(window, view);
        }

        @Override // v0.h5.e
        public boolean e() {
            return (this.f12087a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // v0.h5.e
        public void h(boolean z3) {
            if (!z3) {
                p(16);
                return;
            }
            q(134217728);
            n(Integer.MIN_VALUE);
            m(16);
        }
    }

    @c.o0(30)
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h5 f12091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f12092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p.i<f, WindowInsetsController$OnControllableInsetsChangedListener> f12093c;

        public class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public b4 f12094a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o3 f12095b;

            public a(o3 o3Var) {
                this.f12095b = o3Var;
            }

            public void onCancelled(@c.k0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f12095b.c(windowInsetsAnimationController == null ? null : this.f12094a);
            }

            public void onFinished(@c.j0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f12095b.a(this.f12094a);
            }

            public void onReady(@c.j0 WindowInsetsAnimationController windowInsetsAnimationController, int i4) {
                b4 b4Var = new b4(windowInsetsAnimationController);
                this.f12094a = b4Var;
                this.f12095b.b(b4Var, i4);
            }
        }

        public class b implements WindowInsetsController$OnControllableInsetsChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f12097a;

            public b(f fVar) {
                this.f12097a = fVar;
            }

            public void onControllableInsetsChanged(@c.j0 WindowInsetsController windowInsetsController, int i4) {
                d dVar = d.this;
                if (dVar.f12092b == windowInsetsController) {
                    this.f12097a.a(dVar.f12091a, i4);
                }
            }
        }

        public d(@c.j0 Window window, @c.j0 h5 h5Var) {
            this(window.getInsetsController(), h5Var);
        }

        @Override // v0.h5.e
        public void a(@c.j0 f fVar) {
            if (this.f12093c.containsKey(fVar)) {
                return;
            }
            b bVar = new b(fVar);
            this.f12093c.put(fVar, bVar);
            this.f12092b.addOnControllableInsetsChangedListener(bVar);
        }

        @Override // v0.h5.e
        public void b(int i4, long j4, @c.k0 Interpolator interpolator, @c.k0 CancellationSignal cancellationSignal, @c.j0 o3 o3Var) {
            this.f12092b.controlWindowInsetsAnimation(i4, j4, interpolator, cancellationSignal, new a(o3Var));
        }

        @Override // v0.h5.e
        public int c() {
            return this.f12092b.getSystemBarsBehavior();
        }

        @Override // v0.h5.e
        public void d(int i4) {
            this.f12092b.hide(i4);
        }

        @Override // v0.h5.e
        public boolean e() {
            return (this.f12092b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // v0.h5.e
        public boolean f() {
            return (this.f12092b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // v0.h5.e
        public void g(@c.j0 f fVar) {
            WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListenerA = j5.a(this.f12093c.remove(fVar));
            if (windowInsetsController$OnControllableInsetsChangedListenerA != null) {
                this.f12092b.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListenerA);
            }
        }

        @Override // v0.h5.e
        public void h(boolean z3) {
            if (z3) {
                this.f12092b.setSystemBarsAppearance(16, 16);
            } else {
                this.f12092b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // v0.h5.e
        public void i(boolean z3) {
            if (z3) {
                this.f12092b.setSystemBarsAppearance(8, 8);
            } else {
                this.f12092b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // v0.h5.e
        public void j(int i4) {
            this.f12092b.setSystemBarsBehavior(i4);
        }

        @Override // v0.h5.e
        public void k(int i4) {
            this.f12092b.show(i4);
        }

        public d(@c.j0 WindowInsetsController windowInsetsController, @c.j0 h5 h5Var) {
            this.f12093c = new p.i<>();
            this.f12092b = windowInsetsController;
            this.f12091a = h5Var;
        }
    }

    public static class e {
        public void a(f fVar) {
        }

        public void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, o3 o3Var) {
        }

        public int c() {
            return 0;
        }

        public void d(int i4) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void g(@c.j0 f fVar) {
        }

        public void h(boolean z3) {
        }

        public void i(boolean z3) {
        }

        public void j(int i4) {
        }

        public void k(int i4) {
        }
    }

    public interface f {
        void a(@c.j0 h5 h5Var, int i4);
    }

    public h5(@c.j0 Window window, @c.j0 View view) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f12086a = new d(window, this);
        } else {
            this.f12086a = i4 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    @c.o0(30)
    @c.j0
    public static h5 l(@c.j0 WindowInsetsController windowInsetsController) {
        return new h5(windowInsetsController);
    }

    public void a(@c.j0 f fVar) {
        this.f12086a.a(fVar);
    }

    public void b(int i4, long j4, @c.k0 Interpolator interpolator, @c.k0 CancellationSignal cancellationSignal, @c.j0 o3 o3Var) {
        this.f12086a.b(i4, j4, interpolator, cancellationSignal, o3Var);
    }

    public int c() {
        return this.f12086a.c();
    }

    public void d(int i4) {
        this.f12086a.d(i4);
    }

    public boolean e() {
        return this.f12086a.e();
    }

    public boolean f() {
        return this.f12086a.f();
    }

    public void g(@c.j0 f fVar) {
        this.f12086a.g(fVar);
    }

    public void h(boolean z3) {
        this.f12086a.h(z3);
    }

    public void i(boolean z3) {
        this.f12086a.i(z3);
    }

    public void j(int i4) {
        this.f12086a.j(i4);
    }

    public void k(int i4) {
        this.f12086a.k(i4);
    }

    @c.o0(30)
    public h5(@c.j0 WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f12086a = new d(windowInsetsController, this);
        } else {
            this.f12086a = new e();
        }
    }
}
