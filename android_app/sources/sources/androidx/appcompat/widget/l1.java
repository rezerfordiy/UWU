package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import c.r0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1789a = "ViewUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1790b;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1790b = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1790b.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d(f1789a, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1790b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e4) {
                Log.d(f1789a, "Could not invoke computeFitSystemWindows", e4);
            }
        }
    }

    public static boolean b(View view) {
        return z1.X(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.d(f1789a, "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d(f1789a, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            e = e5;
            Log.d(f1789a, "Could not invoke makeOptionalFitsSystemWindows", e);
        }
    }
}
