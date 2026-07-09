package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import c.j0;
import c.k0;
import c.l;
import c.t;
import java.lang.ref.WeakReference;
import java.util.Locale;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f4227p = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f4228q = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f4229r = 0.6f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f4230s = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f4231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f4232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f4233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f4234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f4241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference<v1.a> f4242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4244o;

    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4245a;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void a(ViewPager viewPager, v1.a aVar, v1.a aVar2) {
            PagerTitleStrip.this.b(aVar, aVar2);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i4, float f4, int i5) {
            if (f4 > 0.5f) {
                i4++;
            }
            PagerTitleStrip.this.d(i4, f4, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
            this.f4245a = i4;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
            if (this.f4245a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.c(pagerTitleStrip.f4231b.getCurrentItem(), PagerTitleStrip.this.f4231b.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f4 = pagerTitleStrip2.f4236g;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                pagerTitleStrip2.d(pagerTitleStrip2.f4231b.getCurrentItem(), f4, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.c(pagerTitleStrip.f4231b.getCurrentItem(), PagerTitleStrip.this.f4231b.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f4 = pagerTitleStrip2.f4236g;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            pagerTitleStrip2.d(pagerTitleStrip2.f4231b.getCurrentItem(), f4, true);
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Locale f4247a;

        public b(Context context) {
            this.f4247a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f4247a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@j0 Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i4, float f4) {
        this.f4232c.setTextSize(i4, f4);
        this.f4233d.setTextSize(i4, f4);
        this.f4234e.setTextSize(i4, f4);
    }

    public void b(v1.a aVar, v1.a aVar2) {
        if (aVar != null) {
            aVar.u(this.f4241l);
            this.f4242m = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.f4241l);
            this.f4242m = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f4231b;
        if (viewPager != null) {
            this.f4235f = -1;
            this.f4236g = -1.0f;
            c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public void c(int i4, v1.a aVar) {
        int iE = aVar != null ? aVar.e() : 0;
        this.f4239j = true;
        CharSequence charSequenceG = null;
        this.f4232c.setText((i4 < 1 || aVar == null) ? null : aVar.g(i4 - 1));
        this.f4233d.setText((aVar == null || i4 >= iE) ? null : aVar.g(i4));
        int i5 = i4 + 1;
        if (i5 < iE && aVar != null) {
            charSequenceG = aVar.g(i5);
        }
        this.f4234e.setText(charSequenceG);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f4232c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4233d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4234e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4235f = i4;
        if (!this.f4240k) {
            d(i4, this.f4236g, false);
        }
        this.f4239j = false;
    }

    public void d(int i4, float f4, boolean z3) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i4 != this.f4235f) {
            c(i4, this.f4231b.getAdapter());
        } else if (!z3 && f4 == this.f4236g) {
            return;
        }
        this.f4240k = true;
        int measuredWidth = this.f4232c.getMeasuredWidth();
        int measuredWidth2 = this.f4233d.getMeasuredWidth();
        int measuredWidth3 = this.f4234e.getMeasuredWidth();
        int i9 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = paddingRight + i9;
        int i11 = (width - (paddingLeft + i9)) - i10;
        float f5 = 0.5f + f4;
        if (f5 > 1.0f) {
            f5 -= 1.0f;
        }
        int i12 = ((width - i10) - ((int) (i11 * f5))) - i9;
        int i13 = measuredWidth2 + i12;
        int baseline = this.f4232c.getBaseline();
        int baseline2 = this.f4233d.getBaseline();
        int baseline3 = this.f4234e.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i14 = iMax - baseline;
        int i15 = iMax - baseline2;
        int i16 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f4232c.getMeasuredHeight() + i14, this.f4233d.getMeasuredHeight() + i15), this.f4234e.getMeasuredHeight() + i16);
        int i17 = this.f4238i & 112;
        if (i17 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i17 != 80) {
                i6 = i14 + paddingTop;
                i7 = i15 + paddingTop;
                i8 = paddingTop + i16;
                TextView textView = this.f4233d;
                textView.layout(i12, i7, i13, textView.getMeasuredHeight() + i7);
                int iMin = Math.min(paddingLeft, (i12 - this.f4237h) - measuredWidth);
                TextView textView2 = this.f4232c;
                textView2.layout(iMin, i6, measuredWidth + iMin, textView2.getMeasuredHeight() + i6);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f4237h);
                TextView textView3 = this.f4234e;
                textView3.layout(iMax3, i8, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i8);
                this.f4236g = f4;
                this.f4240k = false;
            }
            i5 = (height - paddingBottom) - iMax2;
        }
        i6 = i14 + i5;
        i7 = i15 + i5;
        i8 = i5 + i16;
        TextView textView4 = this.f4233d;
        textView4.layout(i12, i7, i13, textView4.getMeasuredHeight() + i7);
        int iMin2 = Math.min(paddingLeft, (i12 - this.f4237h) - measuredWidth);
        TextView textView22 = this.f4232c;
        textView22.layout(iMin2, i6, measuredWidth + iMin2, textView22.getMeasuredHeight() + i6);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f4237h);
        TextView textView32 = this.f4234e;
        textView32.layout(iMax32, i8, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i8);
        this.f4236g = f4;
        this.f4240k = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f4237h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        v1.a adapter = viewPager.getAdapter();
        viewPager.V(this.f4241l);
        viewPager.b(this.f4241l);
        this.f4231b = viewPager;
        WeakReference<v1.a> weakReference = this.f4242m;
        b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f4231b;
        if (viewPager != null) {
            b(viewPager.getAdapter(), null);
            this.f4231b.V(null);
            this.f4231b.N(this.f4241l);
            this.f4231b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (this.f4231b != null) {
            float f4 = this.f4236g;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            d(this.f4235f, f4, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int iMax;
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i4);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, (int) (size * 0.2f), -2);
        this.f4232c.measure(childMeasureSpec2, childMeasureSpec);
        this.f4233d.measure(childMeasureSpec2, childMeasureSpec);
        this.f4234e.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i5);
        } else {
            iMax = Math.max(getMinHeight(), this.f4233d.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i5, this.f4233d.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4239j) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i4) {
        this.f4238i = i4;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@t(from = 0.0d, to = 1.0d) float f4) {
        int i4 = ((int) (f4 * 255.0f)) & 255;
        this.f4243n = i4;
        int i5 = (i4 << 24) | (this.f4244o & z1.f12255s);
        this.f4232c.setTextColor(i5);
        this.f4234e.setTextColor(i5);
    }

    public void setTextColor(@l int i4) {
        this.f4244o = i4;
        this.f4233d.setTextColor(i4);
        int i5 = (this.f4243n << 24) | (this.f4244o & z1.f12255s);
        this.f4232c.setTextColor(i5);
        this.f4234e.setTextColor(i5);
    }

    public void setTextSpacing(int i4) {
        this.f4237h = i4;
        requestLayout();
    }

    public PagerTitleStrip(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4235f = -1;
        this.f4236g = -1.0f;
        this.f4241l = new a();
        TextView textView = new TextView(context);
        this.f4232c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f4233d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f4234e = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4227p);
        boolean z3 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            androidx.core.widget.t.E(this.f4232c, resourceId);
            androidx.core.widget.t.E(this.f4233d, resourceId);
            androidx.core.widget.t.E(this.f4234e, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f4232c.setTextColor(color);
            this.f4233d.setTextColor(color);
            this.f4234e.setTextColor(color);
        }
        this.f4238i = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f4244o = this.f4233d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f4232c.setEllipsize(TextUtils.TruncateAt.END);
        this.f4233d.setEllipsize(TextUtils.TruncateAt.END);
        this.f4234e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f4228q);
            z3 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.f4232c;
        if (z3) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.f4233d);
            setSingleLineAllCaps(this.f4234e);
        } else {
            textView4.setSingleLine();
            this.f4233d.setSingleLine();
            this.f4234e.setSingleLine();
        }
        this.f4237h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
