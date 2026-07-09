package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.r0;
import e.a;
import v0.s2;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f1234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f1235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f1236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f1238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f1239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f1240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1244v;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.b f1245b;

        public a(j.b bVar) {
            this.f1245b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1245b.c();
        }
    }

    public ActionBarContextView(@c.j0 Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void c(int i4) {
        super.c(i4);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.a
    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.f1602e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.F();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1234l;
    }

    public CharSequence getTitle() {
        return this.f1233k;
    }

    @Override // androidx.appcompat.widget.a
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f1602e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.I();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ s2 n(int i4, long j4) {
        return super.n(i4, j4);
    }

    @Override // androidx.appcompat.widget.a
    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f1602e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.R();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1602e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.F();
            this.f1602e.G();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1233k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean zB = l1.b(this);
        int paddingRight = zB ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1235m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1235m.getLayoutParams();
            int i8 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iK = androidx.appcompat.widget.a.k(paddingRight, i8, zB);
            paddingRight = androidx.appcompat.widget.a.k(iK + l(this.f1235m, iK, paddingTop, paddingTop2, zB), i9, zB);
        }
        int iL = paddingRight;
        LinearLayout linearLayout = this.f1238p;
        if (linearLayout != null && this.f1237o == null && linearLayout.getVisibility() != 8) {
            iL += l(this.f1238p, iL, paddingTop, paddingTop2, zB);
        }
        int i10 = iL;
        View view2 = this.f1237o;
        if (view2 != null) {
            l(view2, i10, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1601d;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int i6 = w.b.f12287g;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f1603f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1235m;
        if (view != null) {
            int iJ = j(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1235m.getLayoutParams();
            paddingLeft = iJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1601d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = j(this.f1601d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1238p;
        if (linearLayout != null && this.f1237o == null) {
            if (this.f1243u) {
                this.f1238p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1238p.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f1238p.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = j(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1237o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            if (i9 == -2) {
                i6 = Integer.MIN_VALUE;
            }
            if (i9 >= 0) {
                iMin = Math.min(i9, iMin);
            }
            this.f1237o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f1603f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f1235m == null) {
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(j.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1235m
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1244v
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1235m = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f1235m
            goto L15
        L22:
            android.view.View r0 = r3.f1235m
            int r1 = e.a.h.W
            android.view.View r0 = r0.findViewById(r1)
            r3.f1236n = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.f1602e
            if (r0 == 0) goto L41
            r0.C()
        L41:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1602e = r0
            r1 = 1
            r0.P(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.f1602e
            android.content.Context r2 = r3.f1600c
            r4.c(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.f1602e
            androidx.appcompat.view.menu.k r4 = r4.d(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1601d = r4
            r1 = 0
            v0.z1.G1(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1601d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.q(j.b):void");
    }

    public final void r() {
        if (this.f1238p == null) {
            LayoutInflater.from(getContext()).inflate(a.k.f7172a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1238p = linearLayout;
            this.f1239q = (TextView) linearLayout.findViewById(a.h.N);
            this.f1240r = (TextView) this.f1238p.findViewById(a.h.M);
            if (this.f1241s != 0) {
                this.f1239q.setTextAppearance(getContext(), this.f1241s);
            }
            if (this.f1242t != 0) {
                this.f1240r.setTextAppearance(getContext(), this.f1242t);
            }
        }
        this.f1239q.setText(this.f1233k);
        this.f1240r.setText(this.f1234l);
        boolean z3 = !TextUtils.isEmpty(this.f1233k);
        boolean z4 = !TextUtils.isEmpty(this.f1234l);
        int i4 = 0;
        this.f1240r.setVisibility(z4 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1238p;
        if (!z3 && !z4) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.f1238p.getParent() == null) {
            addView(this.f1238p);
        }
    }

    public boolean s() {
        return this.f1243u;
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i4) {
        this.f1603f = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1237o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1237o = view;
        if (view != null && (linearLayout = this.f1238p) != null) {
            removeView(linearLayout);
            this.f1238p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1234l = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1233k = charSequence;
        r();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f1243u) {
            requestLayout();
        }
        this.f1243u = z3;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f1237o = null;
        this.f1601d = null;
        this.f1602e = null;
        View view = this.f1236n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.C);
    }

    public ActionBarContextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        e1 e1VarG = e1.G(context, attributeSet, a.n.J, i4, 0);
        z1.G1(this, e1VarG.h(a.n.K));
        this.f1241s = e1VarG.u(a.n.P, 0);
        this.f1242t = e1VarG.u(a.n.O, 0);
        this.f1603f = e1VarG.q(a.n.N, 0);
        this.f1244v = e1VarG.u(a.n.M, a.k.f7177f);
        e1VarG.I();
    }
}
