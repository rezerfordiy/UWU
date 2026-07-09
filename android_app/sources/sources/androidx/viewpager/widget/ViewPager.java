package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import c.j0;
import c.k0;
import c.m0;
import c.s;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import v0.c4;
import v0.y0;
import v0.z1;
import w0.e0;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int A0 = 0;
    public static final int B0 = 1;
    public static final int C0 = 2;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f4248j0 = "ViewPager";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f4249k0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final boolean f4250l0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f4251m0 = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f4252n0 = 600;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f4253o0 = 25;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f4254p0 = 16;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f4255q0 = 400;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f4259u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f4260v0 = 2;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f4261w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f4262x0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f4263y0 = 2;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public long P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public List<i> W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f4265a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4266b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public i f4267b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<f> f4268c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public List<h> f4269c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4270d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public j f4271d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f4272e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f4273e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v1.a f4274f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f4275f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4276g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList<View> f4277g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4278h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Runnable f4279h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f4280i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f4281i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ClassLoader f4282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scroller f4283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f4285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f4287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f4291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4298z;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int[] f4256r0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Comparator<f> f4257s0 = new a();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Interpolator f4258t0 = new b();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final m f4264z0 = new m();

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4304f;

        public LayoutParams() {
            super(-1, -1);
            this.f4301c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4301c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4256r0);
            this.f4300b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f4306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ClassLoader f4307e;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4305c = parcel.readInt();
            this.f4306d = parcel.readParcelable(classLoader);
            this.f4307e = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4305c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4305c);
            parcel.writeParcelable(this.f4306d, i4);
        }

        public SavedState(@j0 Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f4312b - fVar2.f4312b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    public class d implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f4309a = new Rect();

        public d() {
        }

        @Override // v0.y0
        public c4 a(View view, c4 c4Var) {
            c4 c4VarE1 = z1.e1(view, c4Var);
            if (c4VarE1.A()) {
                return c4VarE1;
            }
            Rect rect = this.f4309a;
            rect.left = c4VarE1.p();
            rect.top = c4VarE1.r();
            rect.right = c4VarE1.q();
            rect.bottom = c4VarE1.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c4 c4VarO = z1.o(ViewPager.this.getChildAt(i4), c4VarE1);
                rect.left = Math.min(c4VarO.p(), rect.left);
                rect.top = Math.min(c4VarO.r(), rect.top);
                rect.right = Math.min(c4VarO.q(), rect.right);
                rect.bottom = Math.min(c4VarO.o(), rect.bottom);
            }
            return c4VarE1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f4314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4315e;
    }

    public class g extends v0.a {
        public g() {
        }

        @Override // v0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            v1.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f4274f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.e());
            accessibilityEvent.setFromIndex(ViewPager.this.f4276g);
            accessibilityEvent.setToIndex(ViewPager.this.f4276g);
        }

        @Override // v0.a
        public void g(View view, e0 e0Var) {
            super.g(view, e0Var);
            e0Var.U0(ViewPager.class.getName());
            e0Var.D1(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                e0Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                e0Var.a(8192);
            }
        }

        @Override // v0.a
        public boolean j(View view, int i4, Bundle bundle) {
            ViewPager viewPager;
            int i5;
            if (super.j(view, i4, bundle)) {
                return true;
            }
            if (i4 != 4096) {
                if (i4 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i5 = viewPager.f4276g - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i5 = viewPager.f4276g + 1;
            }
            viewPager.setCurrentItem(i5);
            return true;
        }

        public final boolean n() {
            v1.a aVar = ViewPager.this.f4274f;
            return aVar != null && aVar.e() > 1;
        }
    }

    public interface h {
        void a(@j0 ViewPager viewPager, @k0 v1.a aVar, @k0 v1.a aVar2);
    }

    public interface i {
        void b(int i4, float f4, @m0 int i5);

        void c(int i4);

        void d(int i4);
    }

    public interface j {
        void a(@j0 View view, float f4);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i4, float f4, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
        }
    }

    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z3 = layoutParams.f4299a;
            return z3 != layoutParams2.f4299a ? z3 ? 1 : -1 : layoutParams.f4303e - layoutParams2.f4303e;
        }
    }

    public ViewPager(@j0 Context context) {
        super(context);
        this.f4268c = new ArrayList<>();
        this.f4270d = new f();
        this.f4272e = new Rect();
        this.f4278h = -1;
        this.f4280i = null;
        this.f4282j = null;
        this.f4290r = -3.4028235E38f;
        this.f4291s = Float.MAX_VALUE;
        this.f4297y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f4279h0 = new c();
        this.f4281i0 = 0;
        z();
    }

    public static boolean A(@j0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.f4295w != z3) {
            this.f4295w = z3;
        }
    }

    public boolean B() {
        return this.O;
    }

    public final boolean C(float f4, float f5) {
        return (f4 < ((float) this.C) && f5 > 0.0f) || (f4 > ((float) (getWidth() - this.C)) && f5 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @c.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.V
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f4299a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4300b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f4271d0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f4299a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f4271d0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int, float, int):void");
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i4);
            this.I = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean F() {
        int i4 = this.f4276g;
        if (i4 <= 0) {
            return false;
        }
        S(i4 - 1, true);
        return true;
    }

    public boolean G() {
        v1.a aVar = this.f4274f;
        if (aVar == null || this.f4276g >= aVar.e() - 1) {
            return false;
        }
        S(this.f4276g + 1, true);
        return true;
    }

    public final boolean H(int i4) {
        if (this.f4268c.size() == 0) {
            if (this.S) {
                return false;
            }
            this.U = false;
            D(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarX = x();
        int clientWidth = getClientWidth();
        int i5 = this.f4286n;
        int i6 = clientWidth + i5;
        float f4 = clientWidth;
        int i7 = fVarX.f4312b;
        float f5 = ((i4 / f4) - fVarX.f4315e) / (fVarX.f4314d + (i5 / f4));
        this.U = false;
        D(i7, f5, (int) (i6 * f5));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean I(float f4) {
        boolean z3;
        boolean z4;
        float f5 = this.E - f4;
        this.E = f4;
        float scrollX = getScrollX() + f5;
        float clientWidth = getClientWidth();
        float f6 = this.f4290r * clientWidth;
        float f7 = this.f4291s * clientWidth;
        boolean z5 = false;
        f fVar = this.f4268c.get(0);
        ArrayList<f> arrayList = this.f4268c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f4312b != 0) {
            f6 = fVar.f4315e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (fVar2.f4312b != this.f4274f.e() - 1) {
            f7 = fVar2.f4315e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (scrollX < f6) {
            if (z3) {
                this.Q.onPull(Math.abs(f6 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z4) {
                this.R.onPull(Math.abs(scrollX - f7) / clientWidth);
                z5 = true;
            }
            scrollX = f7;
        }
        int i4 = (int) scrollX;
        this.E += scrollX - i4;
        scrollTo(i4, getScrollY());
        H(i4);
        return z5;
    }

    public void J() {
        K(this.f4276g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[PHI: r7 r10 r15
      0x00de: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[PHI: r7 r10 r15
      0x00e7: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(int r18) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.K(int):void");
    }

    public final void L(int i4, int i5, int i6, int i7) {
        int iMin;
        if (i5 <= 0 || this.f4268c.isEmpty()) {
            f fVarY = y(this.f4276g);
            iMin = (int) ((fVarY != null ? Math.min(fVarY.f4315e, this.f4291s) : 0.0f) * ((i4 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                i(false);
            }
        } else if (!this.f4283k.isFinished()) {
            this.f4283k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i6));
        }
        scrollTo(iMin, getScrollY());
    }

    public final void M() {
        int i4 = 0;
        while (i4 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i4).getLayoutParams()).f4299a) {
                removeViewAt(i4);
                i4--;
            }
            i4++;
        }
    }

    public void N(@j0 h hVar) {
        List<h> list = this.f4269c0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void O(@j0 i iVar) {
        List<i> list = this.W;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public final void P(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    public final boolean Q() {
        this.I = -1;
        q();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    public final void R(int i4, boolean z3, int i5, boolean z4) {
        f fVarY = y(i4);
        int clientWidth = fVarY != null ? (int) (getClientWidth() * Math.max(this.f4290r, Math.min(fVarY.f4315e, this.f4291s))) : 0;
        if (z3) {
            Z(clientWidth, 0, i5);
            if (z4) {
                m(i4);
                return;
            }
            return;
        }
        if (z4) {
            m(i4);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    public void S(int i4, boolean z3) {
        this.f4296x = false;
        T(i4, z3, false);
    }

    public void T(int i4, boolean z3, boolean z4) {
        U(i4, z3, z4, 0);
    }

    public void U(int i4, boolean z3, boolean z4, int i5) {
        v1.a aVar = this.f4274f;
        if (aVar == null || aVar.e() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z4 && this.f4276g == i4 && this.f4268c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= this.f4274f.e()) {
            i4 = this.f4274f.e() - 1;
        }
        int i6 = this.f4297y;
        int i7 = this.f4276g;
        if (i4 > i7 + i6 || i4 < i7 - i6) {
            for (int i8 = 0; i8 < this.f4268c.size(); i8++) {
                this.f4268c.get(i8).f4313c = true;
            }
        }
        boolean z5 = this.f4276g != i4;
        if (!this.S) {
            K(i4);
            R(i4, z3, i5, z5);
        } else {
            this.f4276g = i4;
            if (z5) {
                m(i4);
            }
            requestLayout();
        }
    }

    public i V(i iVar) {
        i iVar2 = this.f4267b0;
        this.f4267b0 = iVar;
        return iVar2;
    }

    public void W(boolean z3, @k0 j jVar) {
        X(z3, jVar, 2);
    }

    public void X(boolean z3, @k0 j jVar, int i4) {
        boolean z4 = jVar != null;
        boolean z5 = z4 != (this.f4271d0 != null);
        this.f4271d0 = jVar;
        setChildrenDrawingOrderEnabled(z4);
        if (z4) {
            this.f4275f0 = z3 ? 2 : 1;
            this.f4273e0 = i4;
        } else {
            this.f4275f0 = 0;
        }
        if (z5) {
            J();
        }
    }

    public void Y(int i4, int i5) {
        Z(i4, i5, 0);
    }

    public void Z(int i4, int i5, int i6) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4283k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f4284l ? this.f4283k.getCurrX() : this.f4283k.getStartX();
            this.f4283k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i8 = i4 - i7;
        int i9 = i5 - scrollY;
        if (i8 == 0 && i9 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f4 = clientWidth;
        float f5 = i10;
        float fO = f5 + (o(Math.min(1.0f, (Math.abs(i8) * 1.0f) / f4)) * f5);
        int iAbs = Math.abs(i6);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / ((f4 * this.f4274f.h(this.f4276g)) + this.f4286n)) + 1.0f) * 100.0f), 600);
        this.f4284l = false;
        this.f4283k.startScroll(i7, scrollY, i8, i9, iMin);
        z1.l1(this);
    }

    public f a(int i4, int i5) {
        f fVar = new f();
        fVar.f4312b = i4;
        fVar.f4311a = this.f4274f.j(this, i4);
        fVar.f4314d = this.f4274f.h(i4);
        if (i5 < 0 || i5 >= this.f4268c.size()) {
            this.f4268c.add(fVar);
        } else {
            this.f4268c.add(i5, fVar);
        }
        return fVar;
    }

    public final void a0() {
        if (this.f4275f0 != 0) {
            ArrayList<View> arrayList = this.f4277g0;
            if (arrayList == null) {
                this.f4277g0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f4277g0.add(getChildAt(i4));
            }
            Collections.sort(this.f4277g0, f4264z0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        f fVarW;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f4312b == this.f4276g) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarW;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f4312b == this.f4276g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zA = layoutParams2.f4299a | A(view);
        layoutParams2.f4299a = zA;
        if (!this.f4294v) {
            super.addView(view, i4, layoutParams);
        } else {
            if (zA) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f4302d = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    public void b(@j0 h hVar) {
        if (this.f4269c0 == null) {
            this.f4269c0 = new ArrayList();
        }
        this.f4269c0.add(hVar);
    }

    public void c(@j0 i iVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(iVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f4274f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4290r)) : i4 > 0 && scrollX < ((int) (((float) clientWidth) * this.f4291s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f4284l = true;
        if (this.f4283k.isFinished() || !this.f4283k.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f4283k.getCurrX();
        int currY = this.f4283k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.f4283k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        z1.l1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarW;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f4312b == this.f4276g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        v1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4274f) != null && aVar.e() > 1)) {
            if (!this.Q.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f4290r * width);
                this.Q.setSize(height, width);
                zDraw = false | this.Q.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.R.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4291s + 1.0f)) * width2);
                this.R.setSize(height2, width2);
                zDraw |= this.R.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
        }
        if (zDraw) {
            z1.l1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4287o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.f4298z) {
            return false;
        }
        this.O = true;
        setScrollState(1);
        this.E = 0.0f;
        this.G = 0.0f;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker == null) {
            this.J = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.J.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.P = jUptimeMillis;
        return true;
    }

    public final void f(f fVar, int i4, f fVar2) {
        int i5;
        int i6;
        f fVar3;
        f fVar4;
        int iE = this.f4274f.e();
        int clientWidth = getClientWidth();
        float f4 = clientWidth > 0 ? this.f4286n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i7 = fVar2.f4312b;
            int i8 = fVar.f4312b;
            if (i7 < i8) {
                float fH = fVar2.f4315e + fVar2.f4314d + f4;
                int i9 = i7 + 1;
                int i10 = 0;
                while (i9 <= fVar.f4312b && i10 < this.f4268c.size()) {
                    while (true) {
                        fVar4 = this.f4268c.get(i10);
                        if (i9 <= fVar4.f4312b || i10 >= this.f4268c.size() - 1) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    while (i9 < fVar4.f4312b) {
                        fH += this.f4274f.h(i9) + f4;
                        i9++;
                    }
                    fVar4.f4315e = fH;
                    fH += fVar4.f4314d + f4;
                    i9++;
                }
            } else if (i7 > i8) {
                int size = this.f4268c.size() - 1;
                float fH2 = fVar2.f4315e;
                while (true) {
                    i7--;
                    if (i7 < fVar.f4312b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f4268c.get(size);
                        if (i7 >= fVar3.f4312b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i7 > fVar3.f4312b) {
                        fH2 -= this.f4274f.h(i7) + f4;
                        i7--;
                    }
                    fH2 -= fVar3.f4314d + f4;
                    fVar3.f4315e = fH2;
                }
            }
        }
        int size2 = this.f4268c.size();
        float fH3 = fVar.f4315e;
        int i11 = fVar.f4312b;
        int i12 = i11 - 1;
        this.f4290r = i11 == 0 ? fH3 : -3.4028235E38f;
        int i13 = iE - 1;
        this.f4291s = i11 == i13 ? (fVar.f4314d + fH3) - 1.0f : Float.MAX_VALUE;
        int i14 = i4 - 1;
        while (i14 >= 0) {
            f fVar5 = this.f4268c.get(i14);
            while (true) {
                i6 = fVar5.f4312b;
                if (i12 <= i6) {
                    break;
                }
                fH3 -= this.f4274f.h(i12) + f4;
                i12--;
            }
            fH3 -= fVar5.f4314d + f4;
            fVar5.f4315e = fH3;
            if (i6 == 0) {
                this.f4290r = fH3;
            }
            i14--;
            i12--;
        }
        float fH4 = fVar.f4315e + fVar.f4314d + f4;
        int i15 = fVar.f4312b + 1;
        int i16 = i4 + 1;
        while (i16 < size2) {
            f fVar6 = this.f4268c.get(i16);
            while (true) {
                i5 = fVar6.f4312b;
                if (i15 >= i5) {
                    break;
                }
                fH4 += this.f4274f.h(i15) + f4;
                i15++;
            }
            if (i5 == i13) {
                this.f4291s = (fVar6.f4314d + fH4) - 1.0f;
            }
            fVar6.f4315e = fH4;
            fH4 += fVar6.f4314d + f4;
            i16++;
            i15++;
        }
        this.T = false;
    }

    public boolean g(View view, boolean z3, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i8 = i5 + scrollX;
                if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && g(childAt, true, i4, i8 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i4);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @k0
    public v1.a getAdapter() {
        return this.f4274f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i4, int i5) {
        if (this.f4275f0 == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((LayoutParams) this.f4277g0.get(i5).getLayoutParams()).f4304f;
    }

    public int getCurrentItem() {
        return this.f4276g;
    }

    public int getOffscreenPageLimit() {
        return this.f4297y;
    }

    public int getPageMargin() {
        return this.f4286n;
    }

    public void h() {
        List<i> list = this.W;
        if (list != null) {
            list.clear();
        }
    }

    public final void i(boolean z3) {
        boolean z4 = this.f4281i0 == 2;
        if (z4) {
            setScrollingCacheEnabled(false);
            if (!this.f4283k.isFinished()) {
                this.f4283k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4283k.getCurrX();
                int currY = this.f4283k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f4296x = false;
        for (int i4 = 0; i4 < this.f4268c.size(); i4++) {
            f fVar = this.f4268c.get(i4);
            if (fVar.f4313c) {
                fVar.f4313c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z3) {
                z1.n1(this, this.f4279h0);
            } else {
                this.f4279h0.run();
            }
        }
    }

    public void j() {
        int iE = this.f4274f.e();
        this.f4266b = iE;
        boolean z3 = this.f4268c.size() < (this.f4297y * 2) + 1 && this.f4268c.size() < iE;
        int iMax = this.f4276g;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < this.f4268c.size()) {
            f fVar = this.f4268c.get(i4);
            int iF = this.f4274f.f(fVar.f4311a);
            if (iF != -1) {
                if (iF == -2) {
                    this.f4268c.remove(i4);
                    i4--;
                    if (!z4) {
                        this.f4274f.t(this);
                        z4 = true;
                    }
                    this.f4274f.b(this, fVar.f4312b, fVar.f4311a);
                    int i5 = this.f4276g;
                    if (i5 == fVar.f4312b) {
                        iMax = Math.max(0, Math.min(i5, iE - 1));
                    }
                } else {
                    int i6 = fVar.f4312b;
                    if (i6 != iF) {
                        if (i6 == this.f4276g) {
                            iMax = iF;
                        }
                        fVar.f4312b = iF;
                    }
                }
                z3 = true;
            }
            i4++;
        }
        if (z4) {
            this.f4274f.d(this);
        }
        Collections.sort(this.f4268c, f4257s0);
        if (z3) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                if (!layoutParams.f4299a) {
                    layoutParams.f4301c = 0.0f;
                }
            }
            T(iMax, false, true);
            requestLayout();
        }
    }

    public final int k(int i4, float f4, int i5, int i6) {
        if (Math.abs(i6) <= this.M || Math.abs(i5) <= this.K) {
            i4 += (int) (f4 + (i4 >= this.f4276g ? 0.4f : 0.6f));
        } else if (i5 <= 0) {
            i4++;
        }
        if (this.f4268c.size() <= 0) {
            return i4;
        }
        return Math.max(this.f4268c.get(0).f4312b, Math.min(i4, this.f4268c.get(r4.size() - 1).f4312b));
    }

    public final void l(int i4, float f4, int i5) {
        i iVar = this.f4265a0;
        if (iVar != null) {
            iVar.b(i4, f4, i5);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar2 = this.W.get(i6);
                if (iVar2 != null) {
                    iVar2.b(i4, f4, i5);
                }
            }
        }
        i iVar3 = this.f4267b0;
        if (iVar3 != null) {
            iVar3.b(i4, f4, i5);
        }
    }

    public final void m(int i4) {
        i iVar = this.f4265a0;
        if (iVar != null) {
            iVar.d(i4);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                i iVar2 = this.W.get(i5);
                if (iVar2 != null) {
                    iVar2.d(i4);
                }
            }
        }
        i iVar3 = this.f4267b0;
        if (iVar3 != null) {
            iVar3.d(i4);
        }
    }

    public final void n(int i4) {
        i iVar = this.f4265a0;
        if (iVar != null) {
            iVar.c(i4);
        }
        List<i> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                i iVar2 = this.W.get(i5);
                if (iVar2 != null) {
                    iVar2.c(i4);
                }
            }
        }
        i iVar3 = this.f4267b0;
        if (iVar3 != null) {
            iVar3.c(i4);
        }
    }

    public float o(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4279h0);
        Scroller scroller = this.f4283k;
        if (scroller != null && !scroller.isFinished()) {
            this.f4283k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.f4286n <= 0 || this.f4287o == null || this.f4268c.size() <= 0 || this.f4274f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f6 = this.f4286n / width;
        int i5 = 0;
        f fVar = this.f4268c.get(0);
        float f7 = fVar.f4315e;
        int size = this.f4268c.size();
        int i6 = fVar.f4312b;
        int i7 = this.f4268c.get(size - 1).f4312b;
        while (i6 < i7) {
            while (true) {
                i4 = fVar.f4312b;
                if (i6 <= i4 || i5 >= size) {
                    break;
                }
                i5++;
                fVar = this.f4268c.get(i5);
            }
            if (i6 == i4) {
                float f8 = fVar.f4315e;
                float f9 = fVar.f4314d;
                f4 = (f8 + f9) * width;
                f7 = f8 + f9 + f6;
            } else {
                float fH = this.f4274f.h(i6);
                f4 = (f7 + fH) * width;
                f7 += fH + f6;
            }
            if (this.f4286n + f4 > scrollX) {
                f5 = f6;
                this.f4287o.setBounds(Math.round(f4), this.f4288p, Math.round(this.f4286n + f4), this.f4289q);
                this.f4287o.draw(canvas);
            } else {
                f5 = f6;
            }
            if (f4 > scrollX + r2) {
                return;
            }
            i6++;
            f6 = f5;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Q();
            return false;
        }
        if (action != 0) {
            if (this.f4298z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.G = x3;
            this.E = x3;
            float y3 = motionEvent.getY();
            this.H = y3;
            this.F = y3;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f4284l = true;
            this.f4283k.computeScrollOffset();
            if (this.f4281i0 != 2 || Math.abs(this.f4283k.getFinalX() - this.f4283k.getCurrX()) <= this.N) {
                i(false);
                this.f4298z = false;
            } else {
                this.f4283k.abortAnimation();
                this.f4296x = false;
                J();
                this.f4298z = true;
                P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.I;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float f4 = x4 - this.E;
                float fAbs = Math.abs(f4);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y4 - this.H);
                if (f4 != 0.0f && !C(this.E, f4) && g(this, false, (int) f4, (int) x4, (int) y4)) {
                    this.E = x4;
                    this.F = y4;
                    this.A = true;
                    return false;
                }
                int i5 = this.D;
                if (fAbs > i5 && fAbs * 0.5f > fAbs2) {
                    this.f4298z = true;
                    P(true);
                    setScrollState(1);
                    float f5 = this.G;
                    float f6 = this.D;
                    this.E = f4 > 0.0f ? f5 + f6 : f5 - f6;
                    this.F = y4;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i5) {
                    this.A = true;
                }
                if (this.f4298z && I(x4)) {
                    z1.l1(this);
                }
            }
        } else if (action == 6) {
            E(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f4298z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i6;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i5));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z3 = true;
            int i8 = w.b.f12287g;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f4299a) {
                int i9 = layoutParams2.f4300b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z4 = i11 == 48 || i11 == 80;
                if (i10 != 3 && i10 != 5) {
                    z3 = false;
                }
                int i12 = Integer.MIN_VALUE;
                if (z4) {
                    i6 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i6 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i13 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = paddingLeft;
                    }
                    i12 = 1073741824;
                } else {
                    i13 = paddingLeft;
                }
                int i14 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i14 == -2) {
                    i14 = measuredHeight;
                    i8 = i6;
                } else if (i14 == -1) {
                    i14 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i8));
                if (z4) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
        }
        this.f4292t = View.MeasureSpec.makeMeasureSpec(paddingLeft, w.b.f12287g);
        this.f4293u = View.MeasureSpec.makeMeasureSpec(measuredHeight, w.b.f12287g);
        this.f4294v = true;
        J();
        this.f4294v = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f4299a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f4301c), w.b.f12287g), this.f4293u);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i6;
        int i7;
        f fVarW;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i6 = childCount;
            i5 = 0;
            i7 = 1;
        } else {
            i5 = childCount - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f4312b == this.f4276g && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i7;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        v1.a aVar = this.f4274f;
        if (aVar != null) {
            aVar.n(savedState.f4306d, savedState.f4307e);
            T(savedState.f4305c, false, true);
        } else {
            this.f4278h = savedState.f4305c;
            this.f4280i = savedState.f4306d;
            this.f4282j = savedState.f4307e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4305c = this.f4276g;
        v1.a aVar = this.f4274f;
        if (aVar != null) {
            savedState.f4306d = aVar.o();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            int i8 = this.f4286n;
            L(i4, i6, i8, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).setLayerType(z3 ? this.f4273e0 : 0, null);
        }
    }

    public final void q() {
        this.f4298z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    public void r() {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f4274f != null) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f4296x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            U(k(fVarX.f4312b, ((scrollX / clientWidth) - fVarX.f4315e) / fVarX.f4314d, xVelocity, (int) (this.E - this.G)), true, true, xVelocity);
        }
        q();
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4294v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@j0 KeyEvent keyEvent) {
        int i4;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return G();
                    }
                    i4 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return F();
                }
                i4 = 17;
            }
            return d(i4);
        }
        return false;
    }

    public void setAdapter(@k0 v1.a aVar) {
        v1.a aVar2 = this.f4274f;
        if (aVar2 != null) {
            aVar2.r(null);
            this.f4274f.t(this);
            for (int i4 = 0; i4 < this.f4268c.size(); i4++) {
                f fVar = this.f4268c.get(i4);
                this.f4274f.b(this, fVar.f4312b, fVar.f4311a);
            }
            this.f4274f.d(this);
            this.f4268c.clear();
            M();
            this.f4276g = 0;
            scrollTo(0, 0);
        }
        v1.a aVar3 = this.f4274f;
        this.f4274f = aVar;
        this.f4266b = 0;
        if (aVar != null) {
            if (this.f4285m == null) {
                this.f4285m = new k();
            }
            this.f4274f.r(this.f4285m);
            this.f4296x = false;
            boolean z3 = this.S;
            this.S = true;
            this.f4266b = this.f4274f.e();
            if (this.f4278h >= 0) {
                this.f4274f.n(this.f4280i, this.f4282j);
                T(this.f4278h, false, true);
                this.f4278h = -1;
                this.f4280i = null;
                this.f4282j = null;
            } else if (z3) {
                requestLayout();
            } else {
                J();
            }
        }
        List<h> list = this.f4269c0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f4269c0.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4269c0.get(i5).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i4) {
        this.f4296x = false;
        T(i4, !this.S, false);
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1) {
            Log.w(f4248j0, "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.f4297y) {
            this.f4297y = i4;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f4265a0 = iVar;
    }

    public void setPageMargin(int i4) {
        int i5 = this.f4286n;
        this.f4286n = i4;
        int width = getWidth();
        L(width, width, i4, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(@s int i4) {
        setPageMarginDrawable(b0.e.h(getContext(), i4));
    }

    public void setScrollState(int i4) {
        if (this.f4281i0 == i4) {
            return;
        }
        this.f4281i0 = i4;
        if (this.f4271d0 != null) {
            p(i4 != 0);
        }
        n(i4);
    }

    public void t(float f4) {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f4274f == null) {
            return;
        }
        this.E += f4;
        float scrollX = getScrollX() - f4;
        float clientWidth = getClientWidth();
        float f5 = this.f4290r * clientWidth;
        float f6 = this.f4291s * clientWidth;
        f fVar = this.f4268c.get(0);
        f fVar2 = this.f4268c.get(r4.size() - 1);
        if (fVar.f4312b != 0) {
            f5 = fVar.f4315e * clientWidth;
        }
        if (fVar2.f4312b != this.f4274f.e() - 1) {
            f6 = fVar2.f4315e * clientWidth;
        }
        if (scrollX < f5) {
            scrollX = f5;
        } else if (scrollX > f6) {
            scrollX = f6;
        }
        int i4 = (int) scrollX;
        this.E += scrollX - i4;
        scrollTo(i4, getScrollY());
        H(i4);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.P, SystemClock.uptimeMillis(), 2, this.E, 0.0f, 0);
        this.J.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    public f v(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4287o;
    }

    public f w(View view) {
        for (int i4 = 0; i4 < this.f4268c.size(); i4++) {
            f fVar = this.f4268c.get(i4);
            if (this.f4274f.k(view, fVar.f4311a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f x() {
        int i4;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f5 = clientWidth > 0 ? this.f4286n / clientWidth : 0.0f;
        int i5 = 0;
        boolean z3 = true;
        f fVar = null;
        int i6 = -1;
        float f6 = 0.0f;
        while (i5 < this.f4268c.size()) {
            f fVar2 = this.f4268c.get(i5);
            if (!z3 && fVar2.f4312b != (i4 = i6 + 1)) {
                fVar2 = this.f4270d;
                fVar2.f4315e = f4 + f6 + f5;
                fVar2.f4312b = i4;
                fVar2.f4314d = this.f4274f.h(i4);
                i5--;
            }
            f fVar3 = fVar2;
            f4 = fVar3.f4315e;
            float f7 = fVar3.f4314d + f4 + f5;
            if (!z3 && scrollX < f4) {
                return fVar;
            }
            if (scrollX < f7 || i5 == this.f4268c.size() - 1) {
                return fVar3;
            }
            int i7 = fVar3.f4312b;
            float f8 = fVar3.f4314d;
            i5++;
            z3 = false;
            i6 = i7;
            f6 = f8;
            fVar = fVar3;
        }
        return fVar;
    }

    public f y(int i4) {
        for (int i5 = 0; i5 < this.f4268c.size(); i5++) {
            f fVar = this.f4268c.get(i5);
            if (fVar.f4312b == i4) {
                return fVar;
            }
        }
        return null;
    }

    public void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4283k = new Scroller(context, f4258t0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f4);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.M = (int) (25.0f * f4);
        this.N = (int) (2.0f * f4);
        this.B = (int) (f4 * 16.0f);
        z1.z1(this, new g());
        if (z1.T(this) == 0) {
            z1.P1(this, 1);
        }
        z1.Y1(this, new d());
    }

    public ViewPager(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4268c = new ArrayList<>();
        this.f4270d = new f();
        this.f4272e = new Rect();
        this.f4278h = -1;
        this.f4280i = null;
        this.f4282j = null;
        this.f4290r = -3.4028235E38f;
        this.f4291s = Float.MAX_VALUE;
        this.f4297y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f4279h0 = new c();
        this.f4281i0 = 0;
        z();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(@k0 Drawable drawable) {
        this.f4287o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
