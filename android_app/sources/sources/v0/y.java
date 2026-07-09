package v0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.resolveLayoutDirection(i4);
    }

    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setLayoutDirection(i4);
    }

    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginEnd(i4);
    }

    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginStart(i4);
    }
}
