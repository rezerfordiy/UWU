package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import c.r0;
import e.a;
import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class u0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1831m = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Interpolator f1832n = new DecelerateInterpolator();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1833o = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f1834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f1835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayoutCompat f1836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Spinner f1837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f1844l;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f1845b;

        public a(View view) {
            this.f1845b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.smoothScrollTo(this.f1845b.getLeft() - ((u0.this.getWidth() - this.f1845b.getWidth()) / 2), 0);
            u0.this.f1834b = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return u0.this.f1836d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return ((d) u0.this.f1836d.getChildAt(i4)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                return u0.this.g((ActionBar.e) getItem(i4), true);
            }
            ((d) view).a((ActionBar.e) getItem(i4));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = u0.this.f1836d.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = u0.this.f1836d.getChildAt(i4);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f1849h = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f1850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ActionBar.e f1851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f1852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f1853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f1854f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, ActionBar.e eVar, boolean z3) {
            int i4 = a.c.f6819h;
            super(context, null, i4);
            int[] iArr = {R.attr.background};
            this.f1850b = iArr;
            this.f1851c = eVar;
            e1 e1VarG = e1.G(context, null, iArr, i4, 0);
            if (e1VarG.C(0)) {
                setBackgroundDrawable(e1VarG.h(0));
            }
            e1VarG.I();
            if (z3) {
                setGravity(Tag.ReferencedSurfaceDataSequence);
            }
            c();
        }

        public void a(ActionBar.e eVar) {
            this.f1851c = eVar;
            c();
        }

        public ActionBar.e b() {
            return this.f1851c;
        }

        public void c() {
            ActionBar.e eVar = this.f1851c;
            View viewB = eVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1854f = viewB;
                TextView textView = this.f1852d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1853e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1853e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1854f;
            if (view != null) {
                removeView(view);
                this.f1854f = null;
            }
            Drawable drawableC = eVar.c();
            CharSequence charSequenceF = eVar.f();
            if (drawableC != null) {
                if (this.f1853e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1853e = appCompatImageView;
                }
                this.f1853e.setImageDrawable(drawableC);
                this.f1853e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1853e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1853e.setImageDrawable(null);
                }
            }
            boolean z3 = !TextUtils.isEmpty(charSequenceF);
            if (z3) {
                if (this.f1852d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, a.c.f6824i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1852d = appCompatTextView;
                }
                this.f1852d.setText(charSequenceF);
                this.f1852d.setVisibility(0);
            } else {
                TextView textView2 = this.f1852d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1852d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1853e;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.a());
            }
            h1.a(this, z3 ? null : eVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f1849h);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f1849h);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (u0.this.f1839g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i6 = u0.this.f1839g;
                if (measuredWidth > i6) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, w.b.f12287g), i5);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z3) {
            boolean z4 = isSelected() != z3;
            super.setSelected(z3);
            if (z4 && z3) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1856a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1857b;

        public e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i4) {
            this.f1857b = i4;
            u0.this.f1843k = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1856a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1856a) {
                return;
            }
            u0 u0Var = u0.this;
            u0Var.f1843k = null;
            u0Var.setVisibility(this.f1857b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u0.this.setVisibility(0);
            this.f1856a = false;
        }
    }

    public u0(@c.j0 Context context) {
        super(context);
        this.f1844l = new e();
        setHorizontalScrollBarEnabled(false);
        j.a aVarB = j.a.b(context);
        setContentHeight(aVarB.f());
        this.f1840h = aVarB.e();
        LinearLayoutCompat linearLayoutCompatF = f();
        this.f1836d = linearLayoutCompatF;
        addView(linearLayoutCompatF, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(ActionBar.e eVar, int i4, boolean z3) {
        d dVarG = g(eVar, false);
        this.f1836d.addView(dVarG, i4, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1837e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z3) {
            dVarG.setSelected(true);
        }
        if (this.f1838f) {
            requestLayout();
        }
    }

    public void b(ActionBar.e eVar, boolean z3) {
        d dVarG = g(eVar, false);
        this.f1836d.addView(dVarG, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1837e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z3) {
            dVarG.setSelected(true);
        }
        if (this.f1838f) {
            requestLayout();
        }
    }

    public void c(int i4) {
        View childAt = this.f1836d.getChildAt(i4);
        Runnable runnable = this.f1834b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1834b = aVar;
        post(aVar);
    }

    public void d(int i4) {
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimator = this.f1843k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            viewPropertyAnimatorAlpha = animate().alpha(1.0f);
        } else {
            viewPropertyAnimatorAlpha = animate().alpha(0.0f);
        }
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setInterpolator(f1832n);
        viewPropertyAnimatorAlpha.setListener(this.f1844l.a(viewPropertyAnimatorAlpha, i4));
        viewPropertyAnimatorAlpha.start();
    }

    public final Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, a.c.f6844m);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, a.c.f6814g);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    public d g(ActionBar.e eVar, boolean z3) {
        d dVar = new d(getContext(), eVar, z3);
        if (z3) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1841i));
        } else {
            dVar.setFocusable(true);
            if (this.f1835c == null) {
                this.f1835c = new c();
            }
            dVar.setOnClickListener(this.f1835c);
        }
        return dVar;
    }

    public final boolean h() {
        Spinner spinner = this.f1837e;
        return spinner != null && spinner.getParent() == this;
    }

    public final void i() {
        if (h()) {
            return;
        }
        if (this.f1837e == null) {
            this.f1837e = e();
        }
        removeView(this.f1836d);
        addView(this.f1837e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1837e.getAdapter() == null) {
            this.f1837e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1834b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1834b = null;
        }
        this.f1837e.setSelection(this.f1842j);
    }

    public final boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f1837e);
        addView(this.f1836d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1837e.getSelectedItemPosition());
        return false;
    }

    public void k() {
        this.f1836d.removeAllViews();
        Spinner spinner = this.f1837e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1838f) {
            requestLayout();
        }
    }

    public void l(int i4) {
        this.f1836d.removeViewAt(i4);
        Spinner spinner = this.f1837e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1838f) {
            requestLayout();
        }
    }

    public void m(int i4) {
        ((d) this.f1836d.getChildAt(i4)).c();
        Spinner spinner = this.f1837e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1838f) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1834b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j.a aVarB = j.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1840h = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1834b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        ((d) view).b().g();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.LinearLayoutCompat r4 = r6.f1836d
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3e
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3e
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2e
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f1839g = r8
            goto L35
        L2e:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f1839g = r4
        L35:
            int r8 = r6.f1839g
            int r4 = r6.f1840h
            int r8 = java.lang.Math.min(r8, r4)
            goto L3f
        L3e:
            r8 = -1
        L3f:
            r6.f1839g = r8
            int r8 = r6.f1841i
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4e
            boolean r2 = r6.f1838f
            if (r2 == 0) goto L4e
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 == 0) goto L66
            androidx.appcompat.widget.LinearLayoutCompat r0 = r6.f1836d
            r0.measure(r1, r8)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r6.f1836d
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L66
            r6.i()
            goto L69
        L66:
            r6.j()
        L69:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7d
            if (r0 == r7) goto L7d
            int r7 = r6.f1842j
            r6.setTabSelected(r7)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z3) {
        this.f1838f = z3;
    }

    public void setContentHeight(int i4) {
        this.f1841i = i4;
        requestLayout();
    }

    public void setTabSelected(int i4) {
        this.f1842j = i4;
        int childCount = this.f1836d.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.f1836d.getChildAt(i5);
            boolean z3 = i5 == i4;
            childAt.setSelected(z3);
            if (z3) {
                c(i4);
            }
            i5++;
        }
        Spinner spinner = this.f1837e;
        if (spinner == null || i4 < 0) {
            return;
        }
        spinner.setSelection(i4);
    }
}
