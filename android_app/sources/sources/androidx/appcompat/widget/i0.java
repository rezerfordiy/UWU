package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import e.a;
import java.lang.reflect.Field;
import v0.s2;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends ListView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f1723p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f1724q = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Field f1731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f1732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s2 f1736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.core.widget.g f1737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f1738o;

    public static class a extends g.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1739c;

        public a(Drawable drawable) {
            super(drawable);
            this.f1739c = true;
        }

        public void c(boolean z3) {
            this.f1739c = z3;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1739c) {
                super.draw(canvas);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            if (this.f1739c) {
                super.setHotspot(f4, f5);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f1739c) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1739c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            if (this.f1739c) {
                return super.setVisible(z3, z4);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void a() {
            i0 i0Var = i0.this;
            i0Var.f1738o = null;
            i0Var.removeCallbacks(this);
        }

        public void b() {
            i0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = i0.this;
            i0Var.f1738o = null;
            i0Var.drawableStateChanged();
        }
    }

    public i0(@c.j0 Context context, boolean z3) {
        super(context, null, a.c.f6851n1);
        this.f1725b = new Rect();
        this.f1726c = 0;
        this.f1727d = 0;
        this.f1728e = 0;
        this.f1729f = 0;
        this.f1734k = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1731h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final void a() {
        this.f1735l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1730g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        s2 s2Var = this.f1736m;
        if (s2Var != null) {
            s2Var.c();
            this.f1736m = null;
        }
    }

    public final void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f1725b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1725b);
        selector.draw(canvas);
    }

    public int d(int i4, boolean z3) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z3) {
                    iMin = Math.max(0, i4);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i4, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i4 >= 0 && i4 < count) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1738o != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        m();
    }

    public int e(int i4, int i5, int i6, int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        View view = null;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i4, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, w.b.f12287g) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                return (i8 < 0 || i9 <= i8 || i11 <= 0 || measuredHeight == i7) ? i7 : i11;
            }
            if (i8 >= 0 && i9 >= i8) {
                i11 = measuredHeight;
            }
            i9++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.j(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.g r9 = r7.f1737n
            if (r9 != 0) goto L5a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f1737n = r9
        L5a:
            androidx.core.widget.g r9 = r7.f1737n
            r9.o(r1)
            androidx.core.widget.g r9 = r7.f1737n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.g r8 = r7.f1737n
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.f(android.view.MotionEvent, int):boolean");
    }

    public final void g(int i4, View view) {
        Rect rect = this.f1725b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1726c;
        rect.top -= this.f1727d;
        rect.right += this.f1728e;
        rect.bottom += this.f1729f;
        try {
            boolean z3 = this.f1731h.getBoolean(this);
            if (view.isEnabled() != z3) {
                this.f1731h.set(this, Boolean.valueOf(!z3));
                if (i4 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    public final void h(int i4, View view) {
        Drawable selector = getSelector();
        boolean z3 = (selector == null || i4 == -1) ? false : true;
        if (z3) {
            selector.setVisible(false, false);
        }
        g(i4, view);
        if (z3) {
            Rect rect = this.f1725b;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            h0.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1734k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1734k || super.hasWindowFocus();
    }

    public final void i(int i4, View view, float f4, float f5) {
        h(i4, view);
        Drawable selector = getSelector();
        if (selector == null || i4 == -1) {
            return;
        }
        h0.a.k(selector, f4, f5);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1734k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1734k && this.f1733j) || super.isInTouchMode();
    }

    public final void j(View view, int i4, float f4, float f5) {
        View childAt;
        this.f1735l = true;
        drawableHotspotChanged(f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f1730g;
        if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1730g = i4;
        view.drawableHotspotChanged(f4 - view.getLeft(), f5 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i4, view, f4, f5);
        k(false);
        refreshDrawableState();
    }

    public final void k(boolean z3) {
        a aVar = this.f1732i;
        if (aVar != null) {
            aVar.c(z3);
        }
    }

    public final boolean l() {
        return this.f1735l;
    }

    public final void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1738o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@c.j0 MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1738o == null) {
            b bVar = new b();
            this.f1738o = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1730g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1738o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f1733j = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1732i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1726c = rect.left;
        this.f1727d = rect.top;
        this.f1728e = rect.right;
        this.f1729f = rect.bottom;
    }
}
