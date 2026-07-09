package v0;

/* JADX INFO: loaded from: classes.dex */
public interface s0 {
    boolean dispatchNestedFling(float f4, float f5, boolean z3);

    boolean dispatchNestedPreFling(float f4, float f5);

    boolean dispatchNestedPreScroll(int i4, int i5, @c.k0 int[] iArr, @c.k0 int[] iArr2);

    boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @c.k0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z3);

    boolean startNestedScroll(int i4);

    void stopNestedScroll();
}
