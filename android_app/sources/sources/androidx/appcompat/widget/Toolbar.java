package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import c.r0;
import e.a;
import java.util.ArrayList;
import java.util.List;
import org.dcm4che3.data.Tag;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public static final String Q = "Toolbar";
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public e H;
    public final ActionMenuView.d I;
    public f1 J;
    public ActionMenuPresenter K;
    public d L;
    public j.a M;
    public e.a N;
    public boolean O;
    public final Runnable P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f1556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f1557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f1558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f1559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f1560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f1563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f1565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f1575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f1580z;

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f1581c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f1582d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f1583e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1584b;

        public LayoutParams(int i4) {
            this(-2, -1, i4);
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1584b = 0;
            this.f745a = Tag.ReferencedSurfaceDataSequence;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5);
            this.f1584b = 0;
            this.f745a = i6;
        }

        public LayoutParams(@c.j0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1584b = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1584b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1584b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1584b = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1584b = 0;
            this.f1584b = layoutParams.f1584b;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1586d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1585c);
            parcel.writeInt(this.f1586d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1585c = parcel.readInt();
            this.f1586d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements ActionMenuView.d {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            e eVar = Toolbar.this.H;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public class d implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f1591c;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.j
        public androidx.appcompat.view.menu.k d(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable g() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void h(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1590b;
            if (eVar2 != null && (hVar = this.f1591c) != null) {
                eVar2.g(hVar);
            }
            this.f1590b = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            KeyEvent.Callback callback = Toolbar.this.f1564j;
            if (callback instanceof j.c) {
                ((j.c) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1564j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1563i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1564j = null;
            toolbar3.a();
            this.f1591c = null;
            Toolbar.this.requestLayout();
            hVar.t(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1563i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1563i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1563i);
            }
            Toolbar.this.f1564j = hVar.getActionView();
            this.f1591c = hVar;
            ViewParent parent2 = Toolbar.this.f1564j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1564j);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.f745a = (toolbar4.f1569o & 112) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.f1584b = 2;
                toolbar4.f1564j.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1564j);
            }
            Toolbar.this.H();
            Toolbar.this.requestLayout();
            hVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.f1564j;
            if (callback instanceof j.c) {
                ((j.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(j.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean m(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void n(boolean z3) {
            if (this.f1591c != null) {
                androidx.appcompat.view.menu.e eVar = this.f1590b;
                boolean z4 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        if (this.f1590b.getItem(i4) == this.f1591c) {
                            z4 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (z4) {
                    return;
                }
                j(this.f1590b, this.f1591c);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@c.j0 Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new j.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1556b;
        return actionMenuView != null && actionMenuView.J();
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean B() {
        Layout layout;
        TextView textView = this.f1557c;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i4 = 0; i4 < lineCount; i4++) {
            if (layout.getEllipsisCount(i4) > 0) {
                return true;
            }
        }
        return false;
    }

    public final int C(View view, int i4, int[] iArr, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int iQ = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public final int D(View view, int i4, int[] iArr, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iQ = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int E(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, w.b.f12287g);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        removeCallbacks(this.P);
        post(this.P);
    }

    public void H() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f1584b != 2 && childAt != this.f1556b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void I(int i4, int i5) {
        h();
        this.f1575u.e(i4, i5);
    }

    public void J(int i4, int i5) {
        h();
        this.f1575u.g(i4, i5);
    }

    @c.r0({r0.a.LIBRARY})
    public void K(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.f1556b == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarN = this.f1556b.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.S(this.K);
            eVarN.S(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        actionMenuPresenter.L(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.f1565k);
            eVar.c(this.L, this.f1565k);
        } else {
            actionMenuPresenter.h(this.f1565k, null);
            this.L.h(this.f1565k, null);
            actionMenuPresenter.n(true);
            this.L.n(true);
        }
        this.f1556b.setPopupTheme(this.f1566l);
        this.f1556b.setPresenter(actionMenuPresenter);
        this.K = actionMenuPresenter;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void L(j.a aVar, e.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f1556b;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, @c.v0 int i4) {
        this.f1568n = i4;
        TextView textView = this.f1558d;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void N(int i4, int i5, int i6, int i7) {
        this.f1571q = i4;
        this.f1573s = i5;
        this.f1572r = i6;
        this.f1574t = i7;
        requestLayout();
    }

    public void O(Context context, @c.v0 int i4) {
        this.f1567m = i4;
        TextView textView = this.f1557c;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public final boolean P() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f1556b;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public final void b(List<View> list, int i4) {
        boolean z3 = z1.X(this) == 1;
        int childCount = getChildCount();
        int iD = v0.t.d(i4, z1.X(this));
        list.clear();
        if (!z3) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1584b == 0 && Q(childAt) && p(layoutParams.f745a) == iD) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1584b == 0 && Q(childAt2) && p(layoutParams2.f745a) == iD) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParamsGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParamsGenerateDefaultLayoutParams.f1584b = 1;
        if (!z3 || this.f1564j == null) {
            addView(view, layoutParamsGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1556b) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.L;
        androidx.appcompat.view.menu.h hVar = dVar == null ? null : dVar.f1591c;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1556b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.f1563i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, a.c.a4);
            this.f1563i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1561g);
            this.f1563i.setContentDescription(this.f1562h);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f745a = (this.f1569o & 112) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f1584b = 2;
            this.f1563i.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.f1563i.setOnClickListener(new c());
        }
    }

    @c.k0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1563i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @c.k0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1563i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t0 t0Var = this.f1575u;
        if (t0Var != null) {
            return t0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f1577w;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t0 t0Var = this.f1575u;
        if (t0Var != null) {
            return t0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        t0 t0Var = this.f1575u;
        if (t0Var != null) {
            return t0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        t0 t0Var = this.f1575u;
        if (t0Var != null) {
            return t0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f1576v;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.f1556b;
        return actionMenuView != null && (eVarN = actionMenuView.N()) != null && eVarN.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1577w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return z1.X(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return z1.X(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1576v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1560f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1560f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1556b.getMenu();
    }

    @c.k0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1559e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @c.k0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1559e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.K;
    }

    @c.k0
    public Drawable getOverflowIcon() {
        j();
        return this.f1556b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1565k;
    }

    public int getPopupTheme() {
        return this.f1566l;
    }

    public CharSequence getSubtitle() {
        return this.f1580z;
    }

    @c.k0
    @c.r0({r0.a.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f1558d;
    }

    public CharSequence getTitle() {
        return this.f1579y;
    }

    public int getTitleMarginBottom() {
        return this.f1574t;
    }

    public int getTitleMarginEnd() {
        return this.f1572r;
    }

    public int getTitleMarginStart() {
        return this.f1571q;
    }

    public int getTitleMarginTop() {
        return this.f1573s;
    }

    @c.k0
    @c.r0({r0.a.TESTS})
    public final TextView getTitleTextView() {
        return this.f1557c;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public b0 getWrapper() {
        if (this.J == null) {
            this.J = new f1(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.f1575u == null) {
            this.f1575u = new t0();
        }
    }

    public final void i() {
        if (this.f1560f == null) {
            this.f1560f = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1556b.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1556b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f1556b.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f1565k);
        }
    }

    public final void k() {
        if (this.f1556b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1556b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1566l);
            this.f1556b.setOnMenuItemClickListener(this.I);
            this.f1556b.O(this.M, this.N);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f745a = (this.f1569o & 112) | 8388613;
            this.f1556b.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            c(this.f1556b, false);
        }
    }

    public final void l() {
        if (this.f1559e == null) {
            this.f1559e = new AppCompatImageButton(getContext(), null, a.c.a4);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f745a = (this.f1569o & 112) | 8388611;
            this.f1559e.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        boolean zB = l1.b(this);
        int i6 = !zB ? 1 : 0;
        if (Q(this.f1559e)) {
            F(this.f1559e, i4, 0, i5, 0, this.f1570p);
            measuredWidth = this.f1559e.getMeasuredWidth() + s(this.f1559e);
            iMax = Math.max(0, this.f1559e.getMeasuredHeight() + t(this.f1559e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1559e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f1563i)) {
            F(this.f1563i, i4, 0, i5, 0, this.f1570p);
            measuredWidth = this.f1563i.getMeasuredWidth() + s(this.f1563i);
            iMax = Math.max(iMax, this.f1563i.getMeasuredHeight() + t(this.f1563i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1563i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f1556b)) {
            F(this.f1556b, i4, iMax3, i5, 0, this.f1570p);
            measuredWidth2 = this.f1556b.getMeasuredWidth() + s(this.f1556b);
            iMax = Math.max(iMax, this.f1556b.getMeasuredHeight() + t(this.f1556b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1556b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i6] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f1564j)) {
            iMax4 += E(this.f1564j, i4, iMax4, i5, 0, iArr);
            iMax = Math.max(iMax, this.f1564j.getMeasuredHeight() + t(this.f1564j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1564j.getMeasuredState());
        }
        if (Q(this.f1560f)) {
            iMax4 += E(this.f1560f, i4, iMax4, i5, 0, iArr);
            iMax = Math.max(iMax, this.f1560f.getMeasuredHeight() + t(this.f1560f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1560f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((LayoutParams) childAt.getLayoutParams()).f1584b == 0 && Q(childAt)) {
                iMax4 += E(childAt, i4, iMax4, i5, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i8 = this.f1573s + this.f1574t;
        int i9 = this.f1571q + this.f1572r;
        if (Q(this.f1557c)) {
            E(this.f1557c, i4, iMax4 + i9, i5, i8, iArr);
            int measuredWidth3 = this.f1557c.getMeasuredWidth() + s(this.f1557c);
            measuredHeight = this.f1557c.getMeasuredHeight() + t(this.f1557c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1557c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (Q(this.f1558d)) {
            iMax2 = Math.max(iMax2, E(this.f1558d, i4, iMax4 + i9, i5, measuredHeight + i8, iArr));
            measuredHeight += this.f1558d.getMeasuredHeight() + t(this.f1558d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1558d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1556b;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i4 = savedState.f1585c;
        if (i4 != 0 && this.L != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i4)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1586d) {
            G();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        h();
        this.f1575u.f(i4 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (hVar = dVar.f1591c) != null) {
            savedState.f1585c = hVar.getItemId();
        }
        savedState.f1586d = A();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(int i4) {
        int iX = z1.X(this);
        int iD = v0.t.d(i4, iX) & 7;
        return (iD == 1 || iD == 3 || iD == 5) ? iD : iX == 1 ? 5 : 3;
    }

    public final int q(View view, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int iR = r(layoutParams.f745a);
        if (iR == 48) {
            return getPaddingTop() - i5;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i6) {
            iMax = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i7 < i8) {
                iMax = Math.max(0, iMax - (i8 - i7));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i4) {
        int i5 = i4 & 112;
        return (i5 == 16 || i5 == 48 || i5 == 80) ? i5 : this.f1578x & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return v0.y.c(marginLayoutParams) + v0.y.b(marginLayoutParams);
    }

    public void setCollapseContentDescription(@c.u0 int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(@c.s int i4) {
        setCollapseIcon(f.a.d(getContext(), i4));
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z3) {
        this.O = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f1577w) {
            this.f1577w = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f1576v) {
            this.f1576v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@c.s int i4) {
        setLogo(f.a.d(getContext(), i4));
    }

    public void setLogoDescription(@c.u0 int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(@c.u0 int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(@c.s int i4) {
        setNavigationIcon(f.a.d(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1559e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.H = eVar;
    }

    public void setOverflowIcon(@c.k0 Drawable drawable) {
        j();
        this.f1556b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@c.v0 int i4) {
        if (this.f1566l != i4) {
            this.f1566l = i4;
            if (i4 == 0) {
                this.f1565k = getContext();
            } else {
                this.f1565k = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(@c.u0 int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(@c.l int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(@c.u0 int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f1574t = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f1572r = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f1571q = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f1573s = i4;
        requestLayout();
    }

    public void setTitleTextColor(@c.l int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int measuredWidth = 0;
        while (i6 < size) {
            View view = list.get(i6);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i4;
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i5;
            int iMax = Math.max(0, i7);
            int iMax2 = Math.max(0, i8);
            int iMax3 = Math.max(0, -i7);
            int iMax4 = Math.max(0, -i8);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i6++;
            i5 = iMax4;
            i4 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f1591c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1556b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(@c.h0 int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public final boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean z() {
        ActionMenuView actionMenuView = this.f1556b;
        return actionMenuView != null && actionMenuView.I();
    }

    public Toolbar(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.b4);
    }

    public void setCollapseContentDescription(@c.k0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1563i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@c.k0 Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1563i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1563i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1561g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1560f)) {
                c(this.f1560f, true);
            }
        } else {
            ImageView imageView = this.f1560f;
            if (imageView != null && y(imageView)) {
                removeView(this.f1560f);
                this.F.remove(this.f1560f);
            }
        }
        ImageView imageView2 = this.f1560f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1560f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@c.k0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1559e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@c.k0 Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f1559e)) {
                c(this.f1559e, true);
            }
        } else {
            ImageButton imageButton = this.f1559e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1559e);
                this.F.remove(this.f1559e);
            }
        }
        ImageButton imageButton2 = this.f1559e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1558d;
            if (textView != null && y(textView)) {
                removeView(this.f1558d);
                this.F.remove(this.f1558d);
            }
        } else {
            if (this.f1558d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1558d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1558d.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f1568n;
                if (i4 != 0) {
                    this.f1558d.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1558d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1558d)) {
                c(this.f1558d, true);
            }
        }
        TextView textView2 = this.f1558d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1580z = charSequence;
    }

    public void setSubtitleTextColor(@c.j0 ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f1558d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1557c;
            if (textView != null && y(textView)) {
                removeView(this.f1557c);
                this.F.remove(this.f1557c);
            }
        } else {
            if (this.f1557c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1557c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1557c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f1567m;
                if (i4 != 0) {
                    this.f1557c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1557c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1557c)) {
                c(this.f1557c, true);
            }
        }
        TextView textView2 = this.f1557c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1579y = charSequence;
    }

    public void setTitleTextColor(@c.j0 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1557c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1578x = Tag.ReferencedSurfaceDataSequence;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = a.n.q7;
        e1 e1VarG = e1.G(context2, attributeSet, iArr, i4, 0);
        z1.x1(this, context, iArr, attributeSet, e1VarG.B(), i4, 0);
        this.f1567m = e1VarG.u(a.n.T7, 0);
        this.f1568n = e1VarG.u(a.n.K7, 0);
        this.f1578x = e1VarG.p(a.n.r7, this.f1578x);
        this.f1569o = e1VarG.p(a.n.t7, 48);
        int iF = e1VarG.f(a.n.N7, 0);
        int i5 = a.n.S7;
        iF = e1VarG.C(i5) ? e1VarG.f(i5, iF) : iF;
        this.f1574t = iF;
        this.f1573s = iF;
        this.f1572r = iF;
        this.f1571q = iF;
        int iF2 = e1VarG.f(a.n.Q7, -1);
        if (iF2 >= 0) {
            this.f1571q = iF2;
        }
        int iF3 = e1VarG.f(a.n.P7, -1);
        if (iF3 >= 0) {
            this.f1572r = iF3;
        }
        int iF4 = e1VarG.f(a.n.R7, -1);
        if (iF4 >= 0) {
            this.f1573s = iF4;
        }
        int iF5 = e1VarG.f(a.n.O7, -1);
        if (iF5 >= 0) {
            this.f1574t = iF5;
        }
        this.f1570p = e1VarG.g(a.n.E7, -1);
        int iF6 = e1VarG.f(a.n.A7, Integer.MIN_VALUE);
        int iF7 = e1VarG.f(a.n.w7, Integer.MIN_VALUE);
        int iG = e1VarG.g(a.n.y7, 0);
        int iG2 = e1VarG.g(a.n.z7, 0);
        h();
        this.f1575u.e(iG, iG2);
        if (iF6 != Integer.MIN_VALUE || iF7 != Integer.MIN_VALUE) {
            this.f1575u.g(iF6, iF7);
        }
        this.f1576v = e1VarG.f(a.n.B7, Integer.MIN_VALUE);
        this.f1577w = e1VarG.f(a.n.x7, Integer.MIN_VALUE);
        this.f1561g = e1VarG.h(a.n.v7);
        this.f1562h = e1VarG.x(a.n.u7);
        CharSequence charSequenceX = e1VarG.x(a.n.M7);
        if (!TextUtils.isEmpty(charSequenceX)) {
            setTitle(charSequenceX);
        }
        CharSequence charSequenceX2 = e1VarG.x(a.n.J7);
        if (!TextUtils.isEmpty(charSequenceX2)) {
            setSubtitle(charSequenceX2);
        }
        this.f1565k = getContext();
        setPopupTheme(e1VarG.u(a.n.I7, 0));
        Drawable drawableH = e1VarG.h(a.n.H7);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence charSequenceX3 = e1VarG.x(a.n.G7);
        if (!TextUtils.isEmpty(charSequenceX3)) {
            setNavigationContentDescription(charSequenceX3);
        }
        Drawable drawableH2 = e1VarG.h(a.n.C7);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence charSequenceX4 = e1VarG.x(a.n.D7);
        if (!TextUtils.isEmpty(charSequenceX4)) {
            setLogoDescription(charSequenceX4);
        }
        int i6 = a.n.U7;
        if (e1VarG.C(i6)) {
            setTitleTextColor(e1VarG.d(i6));
        }
        int i7 = a.n.L7;
        if (e1VarG.C(i7)) {
            setSubtitleTextColor(e1VarG.d(i7));
        }
        int i8 = a.n.F7;
        if (e1VarG.C(i8)) {
            x(e1VarG.u(i8, 0));
        }
        e1VarG.I();
    }
}
