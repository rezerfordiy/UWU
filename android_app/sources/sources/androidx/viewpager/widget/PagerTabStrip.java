package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import b0.e;
import c.j0;
import c.k0;
import c.l;
import c.n;
import c.s;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public static final String J = "PagerTabStrip";
    public static final int K = 3;
    public static final int L = 6;
    public static final int M = 16;
    public static final int N = 32;
    public static final int O = 64;
    public static final int P = 1;
    public static final int Q = 32;
    public final Rect A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public float G;
    public float H;
    public int I;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4223y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f4224z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f4231b.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f4231b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@j0 Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void d(int i4, float f4, boolean z3) {
        Rect rect = this.A;
        int height = getHeight();
        int left = this.f4233d.getLeft() - this.f4223y;
        int right = this.f4233d.getRight() + this.f4223y;
        int i5 = height - this.f4219u;
        rect.set(left, i5, right, height);
        super.d(i4, f4, z3);
        this.B = (int) (Math.abs(f4 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f4233d.getLeft() - this.f4223y, i5, this.f4233d.getRight() + this.f4223y, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.C;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f4222x);
    }

    @l
    public int getTabIndicatorColor() {
        return this.f4218t;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f4233d.getLeft() - this.f4223y;
        int right = this.f4233d.getRight() + this.f4223y;
        int i4 = height - this.f4219u;
        this.f4224z.setColor((this.B << 24) | (this.f4218t & z1.f12255s));
        float f4 = height;
        canvas.drawRect(left, i4, right, f4, this.f4224z);
        if (this.C) {
            this.f4224z.setColor((this.f4218t & z1.f12255s) | z1.f12256t);
            canvas.drawRect(getPaddingLeft(), height - this.E, getWidth() - getPaddingRight(), f4, this.f4224z);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.F) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (action == 0) {
            this.G = x3;
            this.H = y3;
            this.F = false;
        } else if (action == 1) {
            if (x3 < this.f4233d.getLeft() - this.f4223y) {
                viewPager = this.f4231b;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x3 > this.f4233d.getRight() + this.f4223y) {
                viewPager = this.f4231b;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x3 - this.G) > this.I || Math.abs(y3 - this.H) > this.I)) {
            this.F = true;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i4) {
        super.setBackgroundColor(i4);
        if (this.D) {
            return;
        }
        this.C = (i4 & z1.f12256t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.D) {
            return;
        }
        this.C = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@s int i4) {
        super.setBackgroundResource(i4);
        if (this.D) {
            return;
        }
        this.C = i4 == 0;
    }

    public void setDrawFullUnderline(boolean z3) {
        this.C = z3;
        this.D = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        int i8 = this.f4220v;
        if (i7 < i8) {
            i7 = i8;
        }
        super.setPadding(i4, i5, i6, i7);
    }

    public void setTabIndicatorColor(@l int i4) {
        this.f4218t = i4;
        this.f4224z.setColor(i4);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n int i4) {
        setTabIndicatorColor(e.e(getContext(), i4));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i4) {
        int i5 = this.f4221w;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setTextSpacing(i4);
    }

    public PagerTabStrip(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f4224z = paint;
        this.A = new Rect();
        this.B = 255;
        this.C = false;
        this.D = false;
        int i4 = this.f4244o;
        this.f4218t = i4;
        paint.setColor(i4);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f4219u = (int) ((3.0f * f4) + 0.5f);
        this.f4220v = (int) ((6.0f * f4) + 0.5f);
        this.f4221w = (int) (64.0f * f4);
        this.f4223y = (int) ((16.0f * f4) + 0.5f);
        this.E = (int) ((1.0f * f4) + 0.5f);
        this.f4222x = (int) ((f4 * 32.0f) + 0.5f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f4232c.setFocusable(true);
        this.f4232c.setOnClickListener(new a());
        this.f4234e.setFocusable(true);
        this.f4234e.setOnClickListener(new b());
        if (getBackground() == null) {
            this.C = true;
        }
    }
}
