package v0;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12194a = 8388608;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12195b = 8388611;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12196c = 8388613;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12197d = 8388615;

    public static void a(int i4, int i5, int i6, Rect rect, int i7, int i8, Rect rect2, int i9) {
        Gravity.apply(i4, i5, i6, rect, i7, i8, rect2, i9);
    }

    public static void b(int i4, int i5, int i6, Rect rect, Rect rect2, int i7) {
        Gravity.apply(i4, i5, i6, rect, rect2, i7);
    }

    public static void c(int i4, Rect rect, Rect rect2, int i5) {
        Gravity.applyDisplay(i4, rect, rect2, i5);
    }

    public static int d(int i4, int i5) {
        return Gravity.getAbsoluteGravity(i4, i5);
    }
}
