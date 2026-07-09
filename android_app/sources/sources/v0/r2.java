package v0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12150a = "ViewParentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int[] f12151b;

    public static int[] a() {
        int[] iArr = f12151b;
        if (iArr == null) {
            f12151b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f12151b;
    }

    public static void b(ViewParent viewParent, View view, View view2, int i4) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i4);
    }

    public static boolean c(ViewParent viewParent, View view, float f4, float f5, boolean z3) {
        try {
            return viewParent.onNestedFling(view, f4, f5, z3);
        } catch (AbstractMethodError e4) {
            Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public static boolean d(ViewParent viewParent, View view, float f4, float f5) {
        try {
            return viewParent.onNestedPreFling(view, f4, f5);
        } catch (AbstractMethodError e4) {
            Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public static void e(ViewParent viewParent, View view, int i4, int i5, int[] iArr) {
        f(viewParent, view, i4, i5, iArr, 0);
    }

    public static void f(ViewParent viewParent, View view, int i4, int i5, int[] iArr, int i6) {
        if (viewParent instanceof u0) {
            ((u0) viewParent).l(view, i4, i5, iArr, i6);
            return;
        }
        if (i6 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i4, i5, iArr);
            } catch (AbstractMethodError e4) {
                Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e4);
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int i4, int i5, int i6, int i7) {
        i(viewParent, view, i4, i5, i6, i7, 0, a());
    }

    public static void h(ViewParent viewParent, View view, int i4, int i5, int i6, int i7, int i8) {
        i(viewParent, view, i4, i5, i6, i7, i8, a());
    }

    public static void i(ViewParent viewParent, View view, int i4, int i5, int i6, int i7, int i8, @c.j0 int[] iArr) {
        if (viewParent instanceof v0) {
            ((v0) viewParent).p(view, i4, i5, i6, i7, i8, iArr);
            return;
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (viewParent instanceof u0) {
            ((u0) viewParent).r(view, i4, i5, i6, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                viewParent.onNestedScroll(view, i4, i5, i6, i7);
            } catch (AbstractMethodError e4) {
                Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e4);
            }
        }
    }

    public static void j(ViewParent viewParent, View view, View view2, int i4) {
        k(viewParent, view, view2, i4, 0);
    }

    public static void k(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof u0) {
            ((u0) viewParent).h(view, view2, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i4);
            } catch (AbstractMethodError e4) {
                Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e4);
            }
        }
    }

    public static boolean l(ViewParent viewParent, View view, View view2, int i4) {
        return m(viewParent, view, view2, i4, 0);
    }

    public static boolean m(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof u0) {
            return ((u0) viewParent).s(view, view2, i4, i5);
        }
        if (i5 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i4);
        } catch (AbstractMethodError e4) {
            Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e4);
            return false;
        }
    }

    public static void n(ViewParent viewParent, View view) {
        o(viewParent, view, 0);
    }

    public static void o(ViewParent viewParent, View view, int i4) {
        if (viewParent instanceof u0) {
            ((u0) viewParent).k(view, i4);
            return;
        }
        if (i4 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e4) {
                Log.e(f12150a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e4);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
