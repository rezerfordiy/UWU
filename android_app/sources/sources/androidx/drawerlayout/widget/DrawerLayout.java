package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import c.j0;
import c.k0;
import c.l;
import c.r0;
import c.s;
import c1.c;
import java.util.ArrayList;
import java.util.List;
import v0.t;
import v0.z1;
import w0.e0;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final String M = "DrawerLayout";
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 64;
    public static final int W = 10;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f3528a0 = -1728053248;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f3529b0 = 160;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f3530c0 = 400;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final boolean f3531d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final boolean f3532e0 = true;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final float f3533f0 = 1.0f;
    public Drawable A;
    public CharSequence B;
    public CharSequence C;
    public Object D;
    public boolean E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public Drawable I;
    public final ArrayList<View> J;
    public Rect K;
    public Matrix L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f3542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1.c f3543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c1.c f3544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f3545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f3546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @k0
    public d f3556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<d> f3557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f3558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f3560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f3561z;
    public static final int[] N = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f3534g0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final boolean f3535h0 = true;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final boolean f3536i0 = true;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f3562e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f3563f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f3564g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3568d;

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f3565a = 0;
        }

        public LayoutParams(int i4, int i5, int i6) {
            this(i4, i5);
            this.f3565a = i6;
        }

        public LayoutParams(@j0 Context context, @k0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3565a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3534g0);
            this.f3565a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(@j0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3565a = 0;
        }

        public LayoutParams(@j0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3565a = 0;
        }

        public LayoutParams(@j0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3565a = 0;
            this.f3565a = layoutParams.f3565a;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3573g;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(@j0 Parcel parcel, @k0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3569c = 0;
            this.f3569c = parcel.readInt();
            this.f3570d = parcel.readInt();
            this.f3571e = parcel.readInt();
            this.f3572f = parcel.readInt();
            this.f3573g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f3569c);
            parcel.writeInt(this.f3570d);
            parcel.writeInt(this.f3571e);
            parcel.writeInt(this.f3572f);
            parcel.writeInt(this.f3573g);
        }

        public SavedState(@j0 Parcelable parcelable) {
            super(parcelable);
            this.f3569c = 0;
        }
    }

    public class a implements View.OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class b extends v0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f3575d = new Rect();

        public b() {
        }

        @Override // v0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // v0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // v0.a
        public void g(View view, e0 e0Var) {
            if (DrawerLayout.f3535h0) {
                super.g(view, e0Var);
            } else {
                e0 e0VarE0 = e0.E0(e0Var);
                super.g(view, e0VarE0);
                e0Var.G1(view);
                Object objK0 = z1.k0(view);
                if (objK0 instanceof View) {
                    e0Var.x1((View) objK0);
                }
                o(e0Var, e0VarE0);
                e0VarE0.H0();
                n(e0Var, (ViewGroup) view);
            }
            e0Var.U0(DrawerLayout.class.getName());
            e0Var.g1(false);
            e0Var.h1(false);
            e0Var.J0(e0.a.f12462f);
            e0Var.J0(e0.a.f12463g);
        }

        @Override // v0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3535h0 || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(e0 e0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (DrawerLayout.A(childAt)) {
                    e0Var.c(childAt);
                }
            }
        }

        public final void o(e0 e0Var, e0 e0Var2) {
            Rect rect = this.f3575d;
            e0Var2.r(rect);
            e0Var.P0(rect);
            e0Var2.s(rect);
            e0Var.Q0(rect);
            e0Var.T1(e0Var2.A0());
            e0Var.v1(e0Var2.M());
            e0Var.U0(e0Var2.v());
            e0Var.Y0(e0Var2.z());
            e0Var.e1(e0Var2.n0());
            e0Var.V0(e0Var2.i0());
            e0Var.g1(e0Var2.o0());
            e0Var.h1(e0Var2.p0());
            e0Var.N0(e0Var2.f0());
            e0Var.E1(e0Var2.x0());
            e0Var.r1(e0Var2.s0());
            e0Var.a(e0Var2.p());
        }
    }

    public static final class c extends v0.a {
        @Override // v0.a
        public void g(View view, e0 e0Var) {
            super.g(view, e0Var);
            if (DrawerLayout.A(view)) {
                return;
            }
            e0Var.x1(null);
        }
    }

    public interface d {
        void a(int i4);

        void b(@j0 View view);

        void c(@j0 View view, float f4);

        void d(@j0 View view);
    }

    public static abstract class e implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(int i4) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void c(View view, float f4) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View view) {
        }
    }

    public class f extends c.AbstractC0033c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c1.c f3578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f3579c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.o();
            }
        }

        public f(int i4) {
            this.f3577a = i4;
        }

        @Override // c1.c.AbstractC0033c
        public int a(View view, int i4, int i5) {
            int width;
            int width2;
            if (DrawerLayout.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i4, width));
        }

        @Override // c1.c.AbstractC0033c
        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // c1.c.AbstractC0033c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // c1.c.AbstractC0033c
        public void f(int i4, int i5) {
            DrawerLayout drawerLayout;
            int i6;
            if ((i4 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i6 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i6 = 5;
            }
            View viewN = drawerLayout.n(i6);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f3578b.d(viewN, i5);
        }

        @Override // c1.c.AbstractC0033c
        public boolean g(int i4) {
            return false;
        }

        @Override // c1.c.AbstractC0033c
        public void h(int i4, int i5) {
            DrawerLayout.this.postDelayed(this.f3579c, 160L);
        }

        @Override // c1.c.AbstractC0033c
        public void i(View view, int i4) {
            ((LayoutParams) view.getLayoutParams()).f3567c = false;
            n();
        }

        @Override // c1.c.AbstractC0033c
        public void j(int i4) {
            DrawerLayout.this.a0(this.f3577a, i4, this.f3578b.z());
        }

        @Override // c1.c.AbstractC0033c
        public void k(View view, int i4, int i5, int i6, int i7) {
            float width = (DrawerLayout.this.c(view, 3) ? i4 + r3 : DrawerLayout.this.getWidth() - i4) / view.getWidth();
            DrawerLayout.this.Y(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // c1.c.AbstractC0033c
        public void l(View view, float f4, float f5) {
            int i4;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i4 = (f4 > 0.0f || (f4 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f4 < 0.0f || (f4 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i4 = width2;
            }
            this.f3578b.T(i4, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // c1.c.AbstractC0033c
        public boolean m(View view, int i4) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f3577a) && DrawerLayout.this.r(view) == 0;
        }

        public final void n() {
            View viewN = DrawerLayout.this.n(this.f3577a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        public void o() {
            View viewN;
            int width;
            int iA = this.f3578b.A();
            boolean z3 = this.f3577a == 3;
            if (z3) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iA;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iA;
            }
            if (viewN != null) {
                if (((!z3 || viewN.getLeft() >= width) && (z3 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                this.f3578b.V(viewN, width, viewN.getTop());
                layoutParams.f3567c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f3579c);
        }

        public void q(c1.c cVar) {
            this.f3578b = cVar;
        }
    }

    public DrawerLayout(@j0 Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (z1.T(view) == 4 || z1.T(view) == 2) ? false : true;
    }

    public static String w(int i4) {
        return (i4 & 3) == 3 ? "LEFT" : (i4 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3565a == 0;
    }

    public boolean C(int i4) {
        View viewN = n(i4);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(@j0 View view) {
        if (E(view)) {
            return (((LayoutParams) view.getLayoutParams()).f3568d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int iD = t.d(((LayoutParams) view.getLayoutParams()).f3565a, z1.X(view));
        return ((iD & 3) == 0 && (iD & 5) == 0) ? false : true;
    }

    public boolean F(int i4) {
        View viewN = n(i4);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(@j0 View view) {
        if (E(view)) {
            return ((LayoutParams) view.getLayoutParams()).f3566b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f4, float f5, View view) {
        if (this.K == null) {
            this.K = new Rect();
        }
        view.getHitRect(this.K);
        return this.K.contains((int) f4, (int) f5);
    }

    public final boolean I(Drawable drawable, int i4) {
        if (drawable == null || !h0.a.h(drawable)) {
            return false;
        }
        h0.a.m(drawable, i4);
        return true;
    }

    public void J(View view, float f4) {
        float fU = u(view);
        float width = view.getWidth();
        int i4 = ((int) (width * f4)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i4 = -i4;
        }
        view.offsetLeftAndRight(i4);
        Y(view, f4);
    }

    public void K(int i4) {
        L(i4, true);
    }

    public void L(int i4, boolean z3) {
        View viewN = n(i4);
        if (viewN != null) {
            N(viewN, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i4));
    }

    public void M(@j0 View view) {
        N(view, true);
    }

    public void N(@j0 View view, boolean z3) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f3549n) {
            layoutParams.f3566b = 1.0f;
            layoutParams.f3568d = 1;
            Z(view, true);
        } else if (z3) {
            layoutParams.f3568d |= 2;
            if (c(view, 3)) {
                this.f3543h.V(view, 0, view.getTop());
            } else {
                this.f3544i.V(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            a0(layoutParams.f3565a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(@j0 d dVar) {
        List<d> list;
        if (dVar == null || (list = this.f3557v) == null) {
            return;
        }
        list.remove(dVar);
    }

    public final Drawable P() {
        int iX = z1.X(this);
        if (iX == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                I(drawable, iX);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                I(drawable2, iX);
                return this.G;
            }
        }
        return this.H;
    }

    public final Drawable Q() {
        int iX = z1.X(this);
        if (iX == 0) {
            Drawable drawable = this.G;
            if (drawable != null) {
                I(drawable, iX);
                return this.G;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                I(drawable2, iX);
                return this.F;
            }
        }
        return this.I;
    }

    public final void R() {
        if (f3536i0) {
            return;
        }
        this.f3561z = P();
        this.A = Q();
    }

    @r0({r0.a.LIBRARY_GROUP})
    public void S(Object obj, boolean z3) {
        this.D = obj;
        this.E = z3;
        setWillNotDraw(!z3 && getBackground() == null);
        requestLayout();
    }

    public void T(int i4, int i5) {
        View viewN;
        int iD = t.d(i5, z1.X(this));
        if (i5 == 3) {
            this.f3550o = i4;
        } else if (i5 == 5) {
            this.f3551p = i4;
        } else if (i5 == 8388611) {
            this.f3552q = i4;
        } else if (i5 == 8388613) {
            this.f3553r = i4;
        }
        if (i4 != 0) {
            (iD == 3 ? this.f3543h : this.f3544i).c();
        }
        if (i4 != 1) {
            if (i4 == 2 && (viewN = n(iD)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iD);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void U(int i4, @j0 View view) {
        if (E(view)) {
            T(i4, ((LayoutParams) view.getLayoutParams()).f3565a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@s int i4, int i5) {
        W(b0.e.h(getContext(), i4), i5);
    }

    public void W(Drawable drawable, int i4) {
        if (f3536i0) {
            return;
        }
        if ((i4 & 8388611) == 8388611) {
            this.F = drawable;
        } else if ((i4 & 8388613) == 8388613) {
            this.G = drawable;
        } else if ((i4 & 3) == 3) {
            this.H = drawable;
        } else if ((i4 & 5) != 5) {
            return;
        } else {
            this.I = drawable;
        }
        R();
        invalidate();
    }

    public void X(int i4, @k0 CharSequence charSequence) {
        int iD = t.d(i4, z1.X(this));
        if (iD == 3) {
            this.B = charSequence;
        } else if (iD == 5) {
            this.C = charSequence;
        }
    }

    public void Y(View view, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f4 == layoutParams.f3566b) {
            return;
        }
        layoutParams.f3566b = f4;
        l(view, f4);
    }

    public final void Z(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            z1.P1(childAt, ((z3 || E(childAt)) && !(z3 && childAt == view)) ? 4 : 1);
        }
    }

    public void a(@j0 d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f3557v == null) {
            this.f3557v = new ArrayList();
        }
        this.f3557v.add(dVar);
    }

    public void a0(int i4, int i5, View view) {
        int i6;
        int iE = this.f3543h.E();
        int iE2 = this.f3544i.E();
        if (iE == 1 || iE2 == 1) {
            i6 = 1;
        } else {
            i6 = 2;
            if (iE != 2 && iE2 != 2) {
                i6 = 0;
            }
        }
        if (view != null && i5 == 0) {
            float f4 = ((LayoutParams) view.getLayoutParams()).f3566b;
            if (f4 == 0.0f) {
                j(view);
            } else if (f4 == 1.0f) {
                k(view);
            }
        }
        if (i6 != this.f3547l) {
            this.f3547l = i6;
            List<d> list = this.f3557v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3557v.get(size).a(i6);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!E(childAt)) {
                this.J.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i4, i5);
                z3 = true;
            }
        }
        if (!z3) {
            int size = this.J.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.J.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        this.J.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        z1.P1(view, (o() != null || E(view)) ? 4 : 1);
        if (f3535h0) {
            return;
        }
        z1.z1(view, this.f3537b);
    }

    public void b() {
        if (this.f3555t) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f3555t = true;
    }

    public boolean c(View view, int i4) {
        return (t(view) & i4) == i4;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i4).getLayoutParams()).f3566b);
        }
        this.f3541f = fMax;
        boolean zO = this.f3543h.o(true);
        boolean zO2 = this.f3544i.o(true);
        if (zO || zO2) {
            z1.l1(this);
        }
    }

    public void d(int i4) {
        e(i4, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3541f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt = getChildAt(i4);
            if (H(x3, y3, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        Drawable drawable;
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i4 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(iSave);
        float f4 = this.f3541f;
        if (f4 <= 0.0f || !zB) {
            if (this.f3561z != null && c(view, 3)) {
                int intrinsicWidth = this.f3561z.getIntrinsicWidth();
                int right2 = view.getRight();
                float fMax = Math.max(0.0f, Math.min(right2 / this.f3543h.A(), 1.0f));
                this.f3561z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f3561z.setAlpha((int) (fMax * 255.0f));
                drawable = this.f3561z;
            } else if (this.A != null && c(view, 5)) {
                int intrinsicWidth2 = this.A.getIntrinsicWidth();
                int left2 = view.getLeft();
                float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f3544i.A(), 1.0f));
                this.A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.A.setAlpha((int) (fMax2 * 255.0f));
                drawable = this.A;
            }
            drawable.draw(canvas);
        } else {
            this.f3542g.setColor((this.f3540e & z1.f12255s) | (((int) ((((-16777216) & r2) >>> 24) * f4)) << 24));
            canvas.drawRect(i4, 0.0f, width, getHeight(), this.f3542g);
        }
        return zDrawChild;
    }

    public void e(int i4, boolean z3) {
        View viewN = n(i4);
        if (viewN != null) {
            g(viewN, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i4));
    }

    public void f(@j0 View view) {
        g(view, true);
    }

    public void g(@j0 View view, boolean z3) {
        c1.c cVar;
        int width;
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f3549n) {
            layoutParams.f3566b = 0.0f;
            layoutParams.f3568d = 0;
        } else if (z3) {
            layoutParams.f3568d |= 4;
            if (c(view, 3)) {
                cVar = this.f3543h;
                width = -view.getWidth();
            } else {
                cVar = this.f3544i;
                width = getWidth();
            }
            cVar.V(view, width, view.getTop());
        } else {
            J(view, 0.0f);
            a0(layoutParams.f3565a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public float getDrawerElevation() {
        if (f3536i0) {
            return this.f3538c;
        }
        return 0.0f;
    }

    @k0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3560y;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z3) {
        int childCount = getChildCount();
        boolean zV = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (E(childAt) && (!z3 || layoutParams.f3567c)) {
                zV |= c(childAt, 3) ? this.f3543h.V(childAt, -childAt.getWidth(), childAt.getTop()) : this.f3544i.V(childAt, getWidth(), childAt.getTop());
                layoutParams.f3567c = false;
            }
        }
        this.f3545j.p();
        this.f3546k.p();
        if (zV) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3568d & 1) == 1) {
            layoutParams.f3568d = 0;
            List<d> list = this.f3557v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3557v.get(size).d(view);
                }
            }
            Z(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3568d & 1) == 0) {
            layoutParams.f3568d = 1;
            List<d> list = this.f3557v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3557v.get(size).b(view);
                }
            }
            Z(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f4) {
        List<d> list = this.f3557v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3557v.get(size).c(view, f4);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public View n(int i4) {
        int iD = t.d(i4, z1.X(this)) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((t(childAt) & 7) == iD) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((((LayoutParams) childAt.getLayoutParams()).f3568d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3549n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3549n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.E || this.f3560y == null) {
            return;
        }
        Object obj = this.D;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f3560y.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f3560y.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            c1.c r1 = r6.f3543h
            boolean r1 = r1.U(r7)
            c1.c r2 = r6.f3544i
            boolean r2 = r2.U(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            c1.c r7 = r6.f3543h
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f3545j
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f3546k
            r7.p()
            goto L38
        L31:
            r6.i(r2)
            r6.f3554s = r3
            r6.f3555t = r3
        L38:
            r7 = r3
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3558w = r0
            r6.f3559x = r7
            float r4 = r6.f3541f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            c1.c r4 = r6.f3543h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r3
        L60:
            r6.f3554s = r3
            r6.f3555t = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.y()
            if (r7 != 0) goto L74
            boolean r7 = r6.f3555t
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !z()) {
            return super.onKeyDown(i4, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            return super.onKeyUp(i4, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        float f4;
        int i8;
        int measuredHeight;
        int i9;
        int i10;
        boolean z4 = true;
        this.f3548m = true;
        int i11 = i6 - i4;
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f5 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (layoutParams.f3566b * f5));
                        f4 = (measuredWidth + i8) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f4 = (i11 - r11) / f6;
                        i8 = i11 - ((int) (layoutParams.f3566b * f6));
                    }
                    boolean z5 = f4 != layoutParams.f3566b ? z4 : false;
                    int i14 = layoutParams.f3565a & 112;
                    if (i14 != 16) {
                        if (i14 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            i9 = measuredWidth + i8;
                            i10 = measuredHeight2 + measuredHeight;
                        } else {
                            int i15 = i7 - i5;
                            measuredHeight = (i15 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight();
                            i9 = measuredWidth + i8;
                            i10 = i15 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        childAt.layout(i8, measuredHeight, i9, i10);
                    } else {
                        int i16 = i7 - i5;
                        int i17 = (i16 - measuredHeight2) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i17 < i18) {
                            i17 = i18;
                        } else {
                            int i19 = i17 + measuredHeight2;
                            int i20 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i19 > i16 - i20) {
                                i17 = (i16 - i20) - measuredHeight2;
                            }
                        }
                        childAt.layout(i8, i17, measuredWidth + i8, measuredHeight2 + i17);
                    }
                    if (z5) {
                        Y(childAt, f4);
                    }
                    int i21 = layoutParams.f3566b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i21) {
                        childAt.setVisibility(i21);
                    }
                }
            }
            i12++;
            z4 = true;
        }
        this.f3548m = false;
        this.f3549n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z3 = this.D != null && z1.S(this);
        int iX = z1.X(this);
        int childCount = getChildCount();
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z3) {
                    int iD = t.d(layoutParams.f3565a, iX);
                    boolean zS = z1.S(childAt);
                    WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.D;
                    if (zS) {
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, w.b.f12287g), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, w.b.f12287g));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f3536i0) {
                        float fP = z1.P(childAt);
                        float f4 = this.f3538c;
                        if (fP != f4) {
                            z1.L1(childAt, f4);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z6 = iT == 3;
                    if ((z6 && z4) || (!z6 && z5)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this " + M + " already has a drawer view along that edge");
                    }
                    if (z6) {
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.f3539d + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i4 = savedState.f3569c;
        if (i4 != 0 && (viewN = n(i4)) != null) {
            M(viewN);
        }
        int i5 = savedState.f3570d;
        if (i5 != 3) {
            T(i5, 3);
        }
        int i6 = savedState.f3571e;
        if (i6 != 3) {
            T(i6, 5);
        }
        int i7 = savedState.f3572f;
        if (i7 != 3) {
            T(i7, 8388611);
        }
        int i8 = savedState.f3573g;
        if (i8 != 3) {
            T(i8, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            int i5 = layoutParams.f3568d;
            boolean z3 = i5 == 1;
            boolean z4 = i5 == 2;
            if (z3 || z4) {
                savedState.f3569c = layoutParams.f3565a;
                break;
            }
        }
        savedState.f3570d = this.f3550o;
        savedState.f3571e = this.f3551p;
        savedState.f3572f = this.f3552q;
        savedState.f3573g = this.f3553r;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            c1.c r0 = r6.f3543h
            r0.L(r7)
            c1.c r0 = r6.f3544i
            r0.L(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L72
        L1a:
            r6.i(r2)
            goto L6e
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            c1.c r3 = r6.f3543h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.f3558w
            float r0 = r0 - r3
            float r3 = r6.f3559x
            float r7 = r7 - r3
            c1.c r3 = r6.f3543h
            int r3 = r3.D()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5b
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L59
            goto L5b
        L59:
            r7 = r1
            goto L5c
        L5b:
            r7 = r2
        L5c:
            r6.i(r7)
            r6.f3554s = r1
            goto L72
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3558w = r0
            r6.f3559x = r7
        L6e:
            r6.f3554s = r1
            r6.f3555t = r1
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public View p() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i4) {
        int iX = z1.X(this);
        if (i4 == 3) {
            int i5 = this.f3550o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = iX == 0 ? this.f3552q : this.f3553r;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i4 == 5) {
            int i7 = this.f3551p;
            if (i7 != 3) {
                return i7;
            }
            int i8 = iX == 0 ? this.f3553r : this.f3552q;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i4 == 8388611) {
            int i9 = this.f3552q;
            if (i9 != 3) {
                return i9;
            }
            int i10 = iX == 0 ? this.f3550o : this.f3551p;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i4 != 8388613) {
            return 0;
        }
        int i11 = this.f3553r;
        if (i11 != 3) {
            return i11;
        }
        int i12 = iX == 0 ? this.f3551p : this.f3550o;
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    public int r(@j0 View view) {
        if (E(view)) {
            return q(((LayoutParams) view.getLayoutParams()).f3565a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        this.f3554s = z3;
        if (z3) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3548m) {
            return;
        }
        super.requestLayout();
    }

    @k0
    public CharSequence s(int i4) {
        int iD = t.d(i4, z1.X(this));
        if (iD == 3) {
            return this.B;
        }
        if (iD == 5) {
            return this.C;
        }
        return null;
    }

    public void setDrawerElevation(float f4) {
        this.f3538c = f4;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt)) {
                z1.L1(childAt, this.f3538c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f3556u;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.f3556u = dVar;
    }

    public void setDrawerLockMode(int i4) {
        T(i4, 3);
        T(i4, 5);
    }

    public void setScrimColor(@l int i4) {
        this.f3540e = i4;
        invalidate();
    }

    public void setStatusBarBackground(int i4) {
        this.f3560y = i4 != 0 ? b0.e.h(getContext(), i4) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@l int i4) {
        this.f3560y = new ColorDrawable(i4);
        invalidate();
    }

    public int t(View view) {
        return t.d(((LayoutParams) view.getLayoutParams()).f3565a, z1.X(this));
    }

    public float u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3566b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.L == null) {
                this.L = new Matrix();
            }
            matrix.invert(this.L);
            motionEventObtain.transform(this.L);
        }
        return motionEventObtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((LayoutParams) getChildAt(i4).getLayoutParams()).f3567c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public DrawerLayout(@j0 Context context, @k0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void setStatusBarBackground(@k0 Drawable drawable) {
        this.f3560y = drawable;
        invalidate();
    }

    public DrawerLayout(@j0 Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3537b = new c();
        this.f3540e = f3528a0;
        this.f3542g = new Paint();
        this.f3549n = true;
        this.f3550o = 3;
        this.f3551p = 3;
        this.f3552q = 3;
        this.f3553r = 3;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        setDescendantFocusability(262144);
        float f4 = getResources().getDisplayMetrics().density;
        this.f3539d = (int) ((64.0f * f4) + 0.5f);
        float f5 = 400.0f * f4;
        f fVar = new f(3);
        this.f3545j = fVar;
        f fVar2 = new f(5);
        this.f3546k = fVar2;
        c1.c cVarP = c1.c.p(this, 1.0f, fVar);
        this.f3543h = cVarP;
        cVarP.R(1);
        cVarP.S(f5);
        fVar.q(cVarP);
        c1.c cVarP2 = c1.c.p(this, 1.0f, fVar2);
        this.f3544i = cVarP2;
        cVarP2.R(2);
        cVarP2.S(f5);
        fVar2.q(cVarP2);
        setFocusableInTouchMode(true);
        z1.P1(this, 1);
        z1.z1(this, new b());
        setMotionEventSplittingEnabled(false);
        if (z1.S(this)) {
            setOnApplyWindowInsetsListener(new a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(N);
            try {
                this.f3560y = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f3538c = f4 * 10.0f;
        this.J = new ArrayList<>();
    }
}
