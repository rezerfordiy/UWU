package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.k {
    public static final String O = "ActionMenuView";
    public static final int P = 56;
    public static final int Q = 4;
    public androidx.appcompat.view.menu.e C;
    public Context D;
    public int E;
    public boolean F;
    public ActionMenuPresenter G;
    public j.a H;
    public e.a I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public d N;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1305f;

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1300a = false;
        }

        public LayoutParams(int i4, int i5, boolean z3) {
            super(i4, i5);
            this.f1300a = z3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f1300a = layoutParams.f1300a;
        }
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a();

        boolean c();
    }

    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public void b(@c.j0 androidx.appcompat.view.menu.e eVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@c.j0 androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@c.j0 androidx.appcompat.view.menu.e eVar, @c.j0 MenuItem menuItem) {
            d dVar = ActionMenuView.this.N;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@c.j0 androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.I;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@c.j0 Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L28
            boolean r9 = r9.h()
            if (r9 == 0) goto L28
            r9 = r1
            goto L29
        L28:
            r9 = r2
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r2
        L4d:
            boolean r7 = r0.f1300a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            r0.f1303d = r1
            r0.f1301b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.L(android.view.View, int, int, int, int):int");
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.C();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public LayoutParams F() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f1300a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean G(int i4) {
        boolean zA = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).c();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean K() {
        return this.F;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void M(int i4, int i5) {
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.L;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int iMax = 0;
        int i16 = 0;
        boolean z6 = false;
        int i17 = 0;
        int iMax2 = 0;
        int i18 = 0;
        long j4 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            int i19 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i20 = i17 + 1;
                if (z7) {
                    int i21 = this.M;
                    i10 = i20;
                    r14 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i10 = i20;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f1305f = r14;
                layoutParams.f1302c = r14;
                layoutParams.f1301b = r14;
                layoutParams.f1303d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f1304e = z7 && ((ActionMenuItemView) childAt).h();
                int iL = L(childAt, i15, layoutParams.f1300a ? 1 : i13, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (layoutParams.f1303d) {
                    i18++;
                }
                if (layoutParams.f1300a) {
                    z6 = true;
                }
                i13 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j4 |= (long) (1 << i16);
                    iMax = iMax;
                }
                i17 = i10;
            }
            i16++;
            size2 = i19;
        }
        int i22 = size2;
        boolean z8 = z6 && i17 == 2;
        boolean z9 = false;
        while (i18 > 0 && i13 > 0) {
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j5 = 0;
            while (i25 < childCount) {
                boolean z10 = z9;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i25).getLayoutParams();
                int i26 = iMax;
                if (layoutParams2.f1303d) {
                    int i27 = layoutParams2.f1301b;
                    if (i27 < i23) {
                        j5 = 1 << i25;
                        i23 = i27;
                        i24 = 1;
                    } else if (i27 == i23) {
                        i24++;
                        j5 |= 1 << i25;
                    }
                }
                i25++;
                iMax = i26;
                z9 = z10;
            }
            z3 = z9;
            i8 = iMax;
            j4 |= j5;
            if (i24 > i13) {
                i6 = mode;
                i7 = i11;
                break;
            }
            int i28 = i23 + 1;
            int i29 = 0;
            while (i29 < childCount) {
                View childAt2 = getChildAt(i29);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i30 = i11;
                int i31 = mode;
                long j6 = 1 << i29;
                if ((j5 & j6) == 0) {
                    if (layoutParams3.f1301b == i28) {
                        j4 |= j6;
                    }
                    z5 = z8;
                } else {
                    if (z8 && layoutParams3.f1304e && i13 == 1) {
                        int i32 = this.M;
                        z5 = z8;
                        childAt2.setPadding(i32 + i15, 0, i32, 0);
                    } else {
                        z5 = z8;
                    }
                    layoutParams3.f1301b++;
                    layoutParams3.f1305f = true;
                    i13--;
                }
                i29++;
                mode = i31;
                i11 = i30;
                z8 = z5;
            }
            iMax = i8;
            z9 = true;
        }
        i6 = mode;
        i7 = i11;
        z3 = z9;
        i8 = iMax;
        boolean z11 = !z6 && i17 == 1;
        if (i13 <= 0 || j4 == 0 || (i13 >= i17 - 1 && !z11 && iMax2 <= 1)) {
            i9 = 0;
            z4 = z3;
        } else {
            float fBitCount = Long.bitCount(j4);
            if (z11) {
                i9 = 0;
            } else {
                i9 = 0;
                if ((j4 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1304e) {
                    fBitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j4 & ((long) (1 << i33))) != 0 && !((LayoutParams) getChildAt(i33).getLayoutParams()).f1304e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i13 * i15) / fBitCount) : i9;
            z4 = z3;
            for (int i35 = i9; i35 < childCount; i35++) {
                if ((j4 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f1302c = i34;
                        layoutParams4.f1305f = true;
                        if (i35 == 0 && !layoutParams4.f1304e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i34) / 2;
                        }
                        z4 = true;
                    } else if (layoutParams4.f1300a) {
                        layoutParams4.f1302c = i34;
                        layoutParams4.f1305f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i34) / 2;
                        z4 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i34 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            for (int i36 = i9; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f1305f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1301b * i15) + layoutParams5.f1302c, w.b.f12287g), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i7, i6 != 1073741824 ? i8 : i22);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.e N() {
        return this.C;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void O(j.a aVar, e.a aVar2) {
        this.H = aVar;
        this.I = aVar2;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.R();
    }

    @Override // androidx.appcompat.view.menu.e.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.C.O(hVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.C = eVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.C == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.C = eVar;
            eVar.X(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.G = actionMenuPresenter;
            actionMenuPresenter.P(true);
            ActionMenuPresenter actionMenuPresenter2 = this.G;
            j.a bVar = this.H;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.l(bVar);
            this.C.c(this.G, this.D);
            this.G.N(this);
        }
        return this.C;
    }

    @c.k0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.G.E();
    }

    public int getPopupTheme() {
        return this.E;
    }

    @Override // androidx.appcompat.view.menu.k
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n(false);
            if (this.G.I()) {
                this.G.F();
                this.G.R();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.J) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i4;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zB = l1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1300a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    G(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1300a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1300a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i4, int i5) {
        androidx.appcompat.view.menu.e eVar;
        boolean z3 = this.J;
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.J = z4;
        if (z3 != z4) {
            this.K = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.J && (eVar = this.C) != null && size != this.K) {
            this.K = size;
            eVar.N(true);
        }
        int childCount = getChildCount();
        if (this.J && childCount > 0) {
            M(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z3) {
        this.G.L(z3);
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.N = dVar;
    }

    public void setOverflowIcon(@c.k0 Drawable drawable) {
        getMenu();
        this.G.O(drawable);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z3) {
        this.F = z3;
    }

    public void setPopupTheme(@c.v0 int i4) {
        if (this.E != i4) {
            this.E = i4;
            if (i4 == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    @c.r0({r0.a.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.G = actionMenuPresenter;
        actionMenuPresenter.N(this);
    }

    public ActionMenuView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.L = (int) (56.0f * f4);
        this.M = (int) (f4 * 4.0f);
        this.D = context;
        this.E = 0;
    }
}
