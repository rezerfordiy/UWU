package v0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12234a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12235b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12236c = 10;

    @c.o0(16)
    public static class a {
        public static void a(@c.j0 Window window, boolean z3) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @c.o0(30)
    public static class b {
        public static h5 a(@c.j0 Window window) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                return h5.l(insetsController);
            }
            return null;
        }

        public static void b(@c.j0 Window window, boolean z3) {
            window.setDecorFitsSystemWindows(z3);
        }
    }

    @c.k0
    public static h5 a(@c.j0 Window window, @c.j0 View view) {
        return Build.VERSION.SDK_INT >= 30 ? b.a(window) : new h5(window, view);
    }

    @c.j0
    public static <T extends View> T b(@c.j0 Window window, @c.y int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(i4);
        }
        T t4 = (T) window.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@c.j0 Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(window, z3);
        } else {
            a.a(window, z3);
        }
    }
}
