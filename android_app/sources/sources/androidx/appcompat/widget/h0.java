package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1716c = "DrawableUtils";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class<?> f1718e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1719f = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1714a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1715b = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rect f1717d = new Rect();

    static {
        try {
            f1718e = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@c.j0 Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof h0.n) {
                drawable2 = ((h0.n) drawable).a();
            } else if (drawable instanceof g.c) {
                drawable2 = ((g.c) drawable).a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    public static void b(@c.j0 Drawable drawable) {
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1714a);
        } else {
            drawable.setState(f1715b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect d(android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.d(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static PorterDuff.Mode e(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
