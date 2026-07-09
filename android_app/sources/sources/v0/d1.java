package v0;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public static boolean a(ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(ScaleGestureDetector scaleGestureDetector, boolean z3) {
        scaleGestureDetector.setQuickScaleEnabled(z3);
    }

    @Deprecated
    public static void d(Object obj, boolean z3) {
        c((ScaleGestureDetector) obj, z3);
    }
}
