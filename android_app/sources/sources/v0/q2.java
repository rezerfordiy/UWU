package v0;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12140b = 1;

    public static int a(@c.j0 ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@c.j0 ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean c(@c.j0 ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@c.j0 ViewGroup viewGroup, int i4) {
        viewGroup.setLayoutMode(i4);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z3) {
        viewGroup.setMotionEventSplittingEnabled(z3);
    }

    public static void g(@c.j0 ViewGroup viewGroup, boolean z3) {
        viewGroup.setTransitionGroup(z3);
    }
}
