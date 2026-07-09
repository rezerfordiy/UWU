package v0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface w0 {
    int getNestedScrollAxes();

    boolean onNestedFling(@c.j0 View view, float f4, float f5, boolean z3);

    boolean onNestedPreFling(@c.j0 View view, float f4, float f5);

    void onNestedPreScroll(@c.j0 View view, int i4, int i5, @c.j0 int[] iArr);

    void onNestedScroll(@c.j0 View view, int i4, int i5, int i6, int i7);

    void onNestedScrollAccepted(@c.j0 View view, @c.j0 View view2, int i4);

    boolean onStartNestedScroll(@c.j0 View view, @c.j0 View view2, int i4);

    void onStopNestedScroll(@c.j0 View view);
}
