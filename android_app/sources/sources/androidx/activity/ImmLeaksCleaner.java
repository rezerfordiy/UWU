package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import c.g0;
import c.j0;
import c.o0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@o0(19)
final class ImmLeaksCleaner implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f542b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f543c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f544d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f548h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f549a;

    public ImmLeaksCleaner(Activity activity) {
        this.f549a = activity;
    }

    @g0
    public static void h() {
        try {
            f545e = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f547g = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f548h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f546f = declaredField3;
            declaredField3.setAccessible(true);
            f545e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.j
    public void d(@j0 l lVar, @j0 i.b bVar) {
        if (bVar != i.b.ON_DESTROY) {
            return;
        }
        if (f545e == 0) {
            h();
        }
        if (f545e == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f549a.getSystemService("input_method");
            try {
                Object obj = f546f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f547g.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f548h.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
