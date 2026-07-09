package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.widget.ActivityChooserView;
import c.j0;
import c.r0;
import v0.e1;
import v0.r0;
import v0.t0;
import v0.v0;
import v0.x0;
import v0.z1;
import w0.e0;
import w0.k0;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements v0, r0, e1 {
    public static final int B = 250;
    public static final float C = 0.5f;
    public static final String D = "NestedScrollView";
    public static final int E = 250;
    public static final int F = -1;
    public static final a G = new a();
    public static final int[] H = {R.attr.fillViewport};
    public b A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f3432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f3433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f3434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f3438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f3440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f3447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f3448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SavedState f3451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x0 f3452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t0 f3453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f3454z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3455a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3455a = parcel.readInt();
        }

        @j0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3455a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f3455a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class a extends v0.a {
        @Override // v0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            k0.N(accessibilityEvent, nestedScrollView.getScrollX());
            k0.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // v0.a
        public void g(View view, e0 e0Var) {
            int scrollRange;
            super.g(view, e0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            e0Var.U0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            e0Var.D1(true);
            if (nestedScrollView.getScrollY() > 0) {
                e0Var.b(e0.a.f12475s);
                e0Var.b(e0.a.D);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                e0Var.b(e0.a.f12474r);
                e0Var.b(e0.a.F);
            }
        }

        @Override // v0.a
        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i4 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    public NestedScrollView(@j0 Context context) {
        this(context, null);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3454z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3454z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3454z;
    }

    public static int m(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    public final void A() {
        this.f3432d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3443o = viewConfiguration.getScaledTouchSlop();
        this.f3444p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3445q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void B() {
        if (this.f3440l == null) {
            this.f3440l = VelocityTracker.obtain();
        }
    }

    public boolean C() {
        return this.f3441m;
    }

    public final boolean D(View view) {
        return !G(view, 0, getHeight());
    }

    public boolean E() {
        return this.f3442n;
    }

    public final boolean G(View view, int i4, int i5) {
        view.getDrawingRect(this.f3431c);
        offsetDescendantRectToMyCoords(view, this.f3431c);
        return this.f3431c.bottom + i4 >= getScrollY() && this.f3431c.top - i4 <= getScrollY() + i5;
    }

    public final void H(int i4, int i5, @c.k0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3453y.e(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3446r) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f3435g = (int) motionEvent.getY(i4);
            this.f3446r = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f3440l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z3) {
        boolean z4;
        boolean z5;
        int overScrollMode = getOverScrollMode();
        boolean z6 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z7 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        int i12 = i6 + i4;
        int i13 = !z8 ? 0 : i10;
        int i14 = i7 + i5;
        int i15 = !z9 ? 0 : i11;
        int i16 = -i13;
        int i17 = i13 + i8;
        int i18 = -i15;
        int i19 = i15 + i9;
        if (i12 > i17) {
            i12 = i17;
            z4 = true;
        } else if (i12 < i16) {
            z4 = true;
            i12 = i16;
        } else {
            z4 = false;
        }
        if (i14 > i19) {
            i14 = i19;
            z5 = true;
        } else if (i14 < i18) {
            z5 = true;
            i14 = i18;
        } else {
            z5 = false;
        }
        if (z5 && !c(1)) {
            this.f3432d.springBack(i12, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i14, z4, z5);
        return z4 || z5;
    }

    public boolean K(int i4) {
        boolean z3 = i4 == 130;
        int height = getHeight();
        if (z3) {
            this.f3431c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3431c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3431c.top = getScrollY() - height;
            Rect rect2 = this.f3431c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3431c;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return N(i4, i5, i6);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f3440l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3440l = null;
        }
    }

    public final void M(boolean z3) {
        if (z3) {
            a(2, 1);
        } else {
            f(1);
        }
        this.f3450v = getScrollY();
        z1.l1(this);
    }

    public final boolean N(int i4, int i5, int i6) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z3 = false;
        boolean z4 = i4 == 33;
        View viewV = v(z4, i5, i6);
        if (viewV == null) {
            viewV = this;
        }
        if (i5 < scrollY || i6 > i7) {
            o(z4 ? i5 - scrollY : i6 - i7);
            z3 = true;
        }
        if (viewV != findFocus()) {
            viewV.requestFocus(i4);
        }
        return z3;
    }

    public final void O(View view) {
        view.getDrawingRect(this.f3431c);
        offsetDescendantRectToMyCoords(view, this.f3431c);
        int iN = n(this.f3431c);
        if (iN != 0) {
            scrollBy(0, iN);
        }
    }

    public final boolean P(Rect rect, boolean z3) {
        int iN = n(rect);
        boolean z4 = iN != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, iN);
            } else {
                Q(0, iN);
            }
        }
        return z4;
    }

    public final void Q(int i4, int i5) {
        S(i4, i5, 250, false);
    }

    public final void R(int i4, int i5, int i6) {
        S(i4, i5, i6, false);
    }

    public final void S(int i4, int i5, int i6, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3430b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3432d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i6);
            M(z3);
        } else {
            if (!this.f3432d.isFinished()) {
                g();
            }
            scrollBy(i4, i5);
        }
        this.f3430b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void T(int i4, int i5) {
        V(i4, i5, 250, false);
    }

    public final void U(int i4, int i5, int i6) {
        V(i4, i5, i6, false);
    }

    public void V(int i4, int i5, int i6, boolean z3) {
        S(i4 - getScrollX(), i5 - getScrollY(), i6, z3);
    }

    public void W(int i4, int i5, boolean z3) {
        V(i4, i5, 250, z3);
    }

    @Override // v0.q0
    public boolean a(int i4, int i5) {
        return this.f3453y.s(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // v0.q0
    public boolean b(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return this.f3453y.g(i4, i5, i6, i7, iArr, i8);
    }

    @Override // v0.q0
    public boolean c(int i4) {
        return this.f3453y.l(i4);
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f3432d.isFinished()) {
            return;
        }
        this.f3432d.computeScrollOffset();
        int currY = this.f3432d.getCurrY();
        int i4 = currY - this.f3450v;
        this.f3450v = currY;
        int[] iArr = this.f3448t;
        boolean z3 = false;
        iArr[1] = 0;
        e(0, i4, iArr, null, 1);
        int i5 = i4 - this.f3448t[1];
        int scrollRange = getScrollRange();
        if (i5 != 0) {
            int scrollY = getScrollY();
            J(0, i5, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i6 = i5 - scrollY2;
            int[] iArr2 = this.f3448t;
            iArr2[1] = 0;
            d(0, scrollY2, 0, i6, this.f3447s, 1, iArr2);
            i5 = i6 - this.f3448t[1];
        }
        if (i5 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z3 = true;
            }
            if (z3) {
                t();
                if (i5 < 0) {
                    if (this.f3433e.isFinished()) {
                        edgeEffect = this.f3433e;
                        edgeEffect.onAbsorb((int) this.f3432d.getCurrVelocity());
                    }
                } else if (this.f3434f.isFinished()) {
                    edgeEffect = this.f3434f;
                    edgeEffect.onAbsorb((int) this.f3432d.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f3432d.isFinished()) {
            f(1);
        } else {
            z1.l1(this);
        }
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, v0.e1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // v0.r0
    public void d(int i4, int i5, int i6, int i7, @c.k0 int[] iArr, int i8, @j0 int[] iArr2) {
        this.f3453y.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || u(keyEvent);
    }

    @Override // android.view.View, v0.s0
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f3453y.a(f4, f5, z3);
    }

    @Override // android.view.View, v0.s0
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f3453y.b(f4, f5);
    }

    @Override // android.view.View, v0.s0
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return e(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View, v0.s0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f3453y.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f3433e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f3433e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f3433e.setSize(width, height);
                if (this.f3433e.draw(canvas)) {
                    z1.l1(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f3434f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f3434f.setSize(width2, height2);
            if (this.f3434f.draw(canvas)) {
                z1.l1(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // v0.q0
    public boolean e(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f3453y.d(i4, i5, iArr, iArr2, i6);
    }

    @Override // v0.q0
    public void f(int i4) {
        this.f3453y.u(i4);
    }

    public final void g() {
        this.f3432d.abortAnimation();
        f(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, v0.w0
    public int getNestedScrollAxes() {
        return this.f3452x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // v0.u0
    public void h(@j0 View view, @j0 View view2, int i4, int i5) {
        this.f3452x.c(view, view2, i4, i5);
        a(2, i5);
    }

    @Override // android.view.View, v0.s0
    public boolean hasNestedScrollingParent() {
        return c(0);
    }

    public boolean i(int i4) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            o(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f3431c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f3431c);
            o(n(this.f3431c));
            viewFindNextFocus.requestFocus(i4);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !D(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View, v0.s0
    public boolean isNestedScrollingEnabled() {
        return this.f3453y.m();
    }

    public final boolean j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // v0.u0
    public void k(@j0 View view, int i4) {
        this.f3452x.e(view, i4);
        f(i4);
    }

    @Override // v0.u0
    public void l(@j0 View view, int i4, int i5, @j0 int[] iArr, int i6) {
        e(i4, i5, iArr, null, i6);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public int n(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i5) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void o(int i4) {
        if (i4 != 0) {
            if (this.f3442n) {
                Q(0, i4);
            } else {
                scrollBy(0, i4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3437i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3439k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i4 = scrollY - verticalScrollFactorCompat;
                if (i4 < 0) {
                    scrollRange = 0;
                } else if (i4 <= scrollRange) {
                    scrollRange = i4;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        int measuredHeight = 0;
        this.f3436h = false;
        View view = this.f3438j;
        if (view != null && F(view, this)) {
            O(this.f3438j);
        }
        this.f3438j = null;
        if (!this.f3437i) {
            if (this.f3451w != null) {
                scrollTo(getScrollX(), this.f3451w.f3455a);
                this.f3451w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM = m(scrollY, paddingTop, measuredHeight);
            if (iM != scrollY) {
                scrollTo(getScrollX(), iM);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3437i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f3441m && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, w.b.f12287g));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public boolean onNestedFling(@j0 View view, float f4, float f5, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        w((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public boolean onNestedPreFling(@j0 View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public void onNestedPreScroll(@j0 View view, int i4, int i5, @j0 int[] iArr) {
        l(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public void onNestedScroll(@j0 View view, int i4, int i5, int i6, int i7) {
        H(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public void onNestedScrollAccepted(@j0 View view, @j0 View view2, int i4) {
        h(view, view2, i4, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i4, int i5, boolean z3, boolean z4) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i4) : focusFinder.findNextFocusFromRect(this, rect, i4);
        if (viewFindNextFocus == null || D(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i4, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3451w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3455a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        b bVar = this.A;
        if (bVar != null) {
            bVar.a(this, i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i7)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f3431c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f3431c);
        o(n(this.f3431c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public boolean onStartNestedScroll(@j0 View view, @j0 View view2, int i4) {
        return s(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, v0.w0
    public void onStopNestedScroll(@j0 View view) {
        k(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // v0.v0
    public void p(@j0 View view, int i4, int i5, int i6, int i7, int i8, @j0 int[] iArr) {
        H(i7, i8, iArr);
    }

    public final void q() {
        this.f3439k = false;
        L();
        f(0);
        EdgeEffect edgeEffect = this.f3433e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3434f.onRelease();
        }
    }

    @Override // v0.u0
    public void r(@j0 View view, int i4, int i5, int i6, int i7, int i8) {
        H(i7, i8, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3436h) {
            this.f3438j = view2;
        } else {
            O(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return P(rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3436h = true;
        super.requestLayout();
    }

    @Override // v0.u0
    public boolean s(@j0 View view, @j0 View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM = m(i4, width, width2);
            int iM2 = m(i5, height, height2);
            if (iM == getScrollX() && iM2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM, iM2);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f3441m) {
            this.f3441m = z3;
            requestLayout();
        }
    }

    @Override // android.view.View, v0.s0
    public void setNestedScrollingEnabled(boolean z3) {
        this.f3453y.p(z3);
    }

    public void setOnScrollChangeListener(@c.k0 b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f3442n = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, v0.s0
    public boolean startNestedScroll(int i4) {
        return a(i4, 0);
    }

    @Override // android.view.View, v0.s0
    public void stopNestedScroll() {
        f(0);
    }

    public final void t() {
        if (getOverScrollMode() == 2) {
            this.f3433e = null;
            this.f3434f = null;
        } else if (this.f3433e == null) {
            Context context = getContext();
            this.f3433e = new EdgeEffect(context);
            this.f3434f = new EdgeEffect(context);
        }
    }

    public boolean u(@j0 KeyEvent keyEvent) {
        this.f3431c.setEmpty();
        if (!j()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? i(33) : x(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? i(130) : x(130);
        }
        if (keyCode != 62) {
            return false;
        }
        K(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View v(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.v(boolean, int, int):android.view.View");
    }

    public void w(int i4) {
        if (getChildCount() > 0) {
            this.f3432d.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, ActivityChooserView.f.f1331h, 0, 0);
            M(true);
        }
    }

    public boolean x(int i4) {
        int childCount;
        boolean z3 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f3431c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3431c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3431c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3431c;
        return N(i4, rect3.top, rect3.bottom);
    }

    public final boolean y(int i4, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i4 >= childAt.getLeft() && i4 < childAt.getRight();
    }

    public final void z() {
        VelocityTracker velocityTracker = this.f3440l;
        if (velocityTracker == null) {
            this.f3440l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public NestedScrollView(@j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i4);
    }

    public NestedScrollView(@j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3431c = new Rect();
        this.f3436h = true;
        this.f3437i = false;
        this.f3438j = null;
        this.f3439k = false;
        this.f3442n = true;
        this.f3446r = -1;
        this.f3447s = new int[2];
        this.f3448t = new int[2];
        A();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i4, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3452x = new x0(this);
        this.f3453y = new t0(this);
        setNestedScrollingEnabled(true);
        z1.z1(this, G);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i4, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
