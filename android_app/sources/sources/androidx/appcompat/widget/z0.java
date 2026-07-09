package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY})
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1930a = "ThemeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1931b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1932c = {-16842910};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1933d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1934e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1935f = {R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1936g = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f1937h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f1938i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f1939j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1940k = new int[1];

    public static void a(@c.j0 View view, @c.j0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a.n.f7375f1);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(a.n.f7447t3)) {
                Log.e(f1930a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @c.j0
    public static ColorStateList b(int i4, int i5) {
        return new ColorStateList(new int[][]{f1932c, f1939j}, new int[]{i5, i4});
    }

    public static int c(@c.j0 Context context, int i4) {
        ColorStateList colorStateListF = f(context, i4);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f1932c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, i4, typedValueG.getFloat());
    }

    public static int d(@c.j0 Context context, int i4) {
        int[] iArr = f1940k;
        iArr[0] = i4;
        e1 e1VarF = e1.F(context, null, iArr);
        try {
            return e1VarF.c(0, 0);
        } finally {
            e1VarF.I();
        }
    }

    public static int e(@c.j0 Context context, int i4, float f4) {
        return g0.p0.B(d(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    @c.k0
    public static ColorStateList f(@c.j0 Context context, int i4) {
        int[] iArr = f1940k;
        iArr[0] = i4;
        e1 e1VarF = e1.F(context, null, iArr);
        try {
            return e1VarF.d(0);
        } finally {
            e1VarF.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f1931b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
