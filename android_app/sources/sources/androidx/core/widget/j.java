package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import c.j0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3498a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f3499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f3501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f3503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3504g;

    public static boolean a(@j0 PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(@j0 PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(@j0 PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    public static void d(@j0 PopupWindow popupWindow, int i4) {
        popupWindow.setWindowLayoutType(i4);
    }

    public static void e(@j0 PopupWindow popupWindow, @j0 View view, int i4, int i5, int i6) {
        popupWindow.showAsDropDown(view, i4, i5, i6);
    }
}
