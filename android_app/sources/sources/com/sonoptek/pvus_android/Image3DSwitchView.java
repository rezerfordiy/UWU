package com.sonoptek.pvus_android;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.sonoptek.pvus_android.e;

/* JADX INFO: loaded from: classes.dex */
public class Image3DSwitchView extends ViewGroup {
    public static int A = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f4837q = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f4839s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f4840t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f4841u = 600;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f4842v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f4843w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f4844x = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f4846z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VelocityTracker f4848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Scroller f4849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f4850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f4860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4861p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f4838r = (int) (MyApplication.s() * 5.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Handler f4845y = new Handler();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4862b;

        public a(int i4) {
            this.f4862b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = this.f4862b;
            if (i4 == 0 || i4 == 1) {
                Image3DSwitchView.this.f4859n = true;
                Image3DSwitchView.this.requestLayout();
            }
        }
    }

    public interface b {
        void a(int i4);
    }

    public Image3DSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4847b = false;
        this.f4851f = 0;
        this.f4861p = false;
        this.f4852g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f4849d = new Scroller(context);
        f(context, attributeSet);
    }

    public final void b(int i4, int i5, int i6, int i7, int i8) {
        float f4;
        int iAbs;
        if (this.f4847b) {
            f4 = 700.0f / this.f4854i;
            iAbs = Math.abs(i7);
        } else {
            f4 = 700.0f / this.f4853h;
            iAbs = Math.abs(i6);
        }
        int i9 = (int) (f4 * iAbs);
        this.f4849d.startScroll(i4, i5, i6, i7, i9);
        invalidate();
        f4845y.postDelayed(new a(i8), i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L10
            int r1 = r3.f4856k
            int r1 = r1 + r0
            r3.f4856k = r1
            int r2 = r3.f4855j
            if (r1 < r2) goto L10
            r4 = 0
        Ld:
            r3.f4856k = r4
            goto L1d
        L10:
            if (r4 != r0) goto L1d
            int r4 = r3.f4856k
            int r4 = r4 - r0
            r3.f4856k = r4
            if (r4 >= 0) goto L1d
            int r4 = r3.f4855j
            int r4 = r4 - r0
            goto Ld
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.Image3DSwitchView.c(int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f4849d.computeScrollOffset()) {
            scrollTo(this.f4849d.getCurrX(), this.f4849d.getCurrY());
            g();
            postInvalidate();
        }
    }

    public void d() {
        for (int i4 = 0; i4 < this.f4855j; i4++) {
            ((Image3DView) getChildAt(i4)).e();
        }
    }

    public final int e(int i4) {
        int i5 = (this.f4856k + i4) - 3;
        while (i5 < 0) {
            i5 += this.f4855j;
        }
        while (true) {
            int i6 = this.f4855j;
            if (i5 <= i6 - 1) {
                return i5;
            }
            i5 -= i6;
        }
    }

    public final void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f5908a);
        this.f4847b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f4860o;
            if (i4 >= iArr.length) {
                return;
            }
            Image3DView image3DView = (Image3DView) getChildAt(iArr[i4]);
            image3DView.f(i4, this.f4847b ? getScrollY() : getScrollX());
            image3DView.invalidate();
            i4++;
        }
    }

    public void h() {
        int i4 = this.f4856k;
        if (i4 == 1 || i4 == 4) {
            k();
        } else if (i4 == 2 || i4 == 5) {
            j();
        }
    }

    public void i() {
        if (this.f4849d.isFinished()) {
            if (this.f4847b) {
                b(0, getScrollY(), 0, -getScrollY(), 2);
            } else {
                b(getScrollX(), 0, -getScrollX(), 0, 2);
            }
        }
    }

    public void j() {
        if (this.f4849d.isFinished()) {
            int scrollX = this.f4853h - getScrollX();
            int scrollY = this.f4854i - getScrollY();
            c(0);
            b bVar = this.f4850e;
            if (bVar != null) {
                bVar.a(this.f4856k);
            }
            if (this.f4847b) {
                b(0, getScrollY(), 0, scrollY, 0);
            } else {
                b(getScrollX(), 0, scrollX, 0, 0);
            }
        }
    }

    public void k() {
        if (this.f4849d.isFinished()) {
            int scrollX = (-this.f4853h) - getScrollX();
            int scrollY = (-this.f4854i) - getScrollY();
            c(1);
            b bVar = this.f4850e;
            if (bVar != null) {
                bVar.a(this.f4856k);
            }
            if (this.f4847b) {
                b(0, getScrollY(), 0, scrollY, 1);
            } else {
                b(getScrollX(), 0, scrollX, 0, 1);
            }
        }
    }

    public final boolean l(int i4) {
        return this.f4847b ? i4 < -600 || getScrollY() > this.f4854i / 2 : i4 < -600 || getScrollX() > this.f4853h / 2;
    }

    public final boolean m(int i4) {
        return this.f4847b ? i4 > 600 || getScrollY() < (-this.f4854i) / 2 : i4 > 600 || getScrollX() < (-this.f4853h) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            int r3 = r5.f4851f
            if (r3 == 0) goto Ld
            return r1
        Ld:
            float r3 = r6.getX()
            float r6 = r6.getY()
            r4 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L1b
            goto L3f
        L1b:
            boolean r0 = r5.f4847b
            if (r0 == 0) goto L2e
            float r0 = r5.f4858m
            float r0 = r0 - r6
            float r6 = java.lang.Math.abs(r0)
            int r6 = (int) r6
            int r0 = r5.f4852g
            if (r6 <= r0) goto L41
        L2b:
            r5.f4851f = r1
            goto L41
        L2e:
            float r6 = r5.f4857l
            float r6 = r6 - r3
            float r6 = java.lang.Math.abs(r6)
            int r6 = (int) r6
            int r0 = r5.f4852g
            if (r6 <= r0) goto L41
            goto L2b
        L3b:
            r5.f4857l = r3
            r5.f4858m = r6
        L3f:
            r5.f4851f = r4
        L41:
            int r6 = r5.f4851f
            if (r6 == 0) goto L46
            goto L47
        L46:
            r1 = r4
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.Image3DSwitchView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (z3 || this.f4859n) {
            int childCount = getChildCount();
            this.f4855j = childCount;
            if (childCount < 5) {
                return;
            }
            f4846z = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            A = measuredHeight;
            this.f4853h = (int) (((double) f4846z) * 0.5d);
            this.f4854i = (int) (((double) measuredHeight) * 0.5d);
            int i8 = this.f4856k;
            if (i8 >= 0 && i8 < this.f4855j) {
                this.f4849d.abortAnimation();
                if (this.f4847b) {
                    setScrollY(0);
                } else {
                    setScrollX(0);
                }
                int i9 = this.f4853h;
                int i10 = ((-i9) * 2) + ((f4846z - i9) / 2);
                int i11 = this.f4854i;
                int i12 = ((-i11) * 2) + ((A - i11) / 2);
                int[] iArr = {e(1), e(2), e(3), e(4), e(5)};
                this.f4860o = iArr;
                for (int i13 = 0; i13 < 5; i13++) {
                    if (this.f4847b) {
                        Image3DView image3DView = (Image3DView) getChildAt(iArr[i13]);
                        image3DView.layout(5, i12 + 5, f4846z - 5, (this.f4854i + i12) - 5);
                        image3DView.c();
                        i12 += this.f4854i;
                    } else {
                        Image3DView image3DView2 = (Image3DView) getChildAt(iArr[i13]);
                        int i14 = f4838r;
                        image3DView2.layout(i10 + 5, i14, (this.f4853h + i10) - 5, A - i14);
                        image3DView2.c();
                        i10 += this.f4853h;
                    }
                }
                g();
            }
            this.f4859n = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.f4861p
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            android.widget.Scroller r0 = r4.f4849d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L9b
            android.view.VelocityTracker r0 = r4.f4848c
            if (r0 != 0) goto L18
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f4848c = r0
        L18:
            android.view.VelocityTracker r0 = r4.f4848c
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r2 = r5.getX()
            float r5 = r5.getY()
            if (r0 == 0) goto L97
            if (r0 == r1) goto L4e
            r3 = 2
            if (r0 == r3) goto L32
            goto L9b
        L32:
            boolean r0 = r4.f4847b
            r3 = 0
            if (r0 == 0) goto L41
            float r0 = r4.f4858m
            float r0 = r0 - r5
            int r0 = (int) r0
            r4.f4858m = r5
            r4.scrollBy(r3, r0)
            goto L4a
        L41:
            float r5 = r4.f4857l
            float r5 = r5 - r2
            int r5 = (int) r5
            r4.f4857l = r2
            r4.scrollBy(r5, r3)
        L4a:
            r4.g()
            goto L9b
        L4e:
            android.view.VelocityTracker r5 = r4.f4848c
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r0)
            boolean r5 = r4.f4847b
            if (r5 == 0) goto L6e
            android.view.VelocityTracker r5 = r4.f4848c
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            boolean r0 = r4.l(r5)
            if (r0 == 0) goto L67
            goto L7b
        L67:
            boolean r5 = r4.m(r5)
            if (r5 == 0) goto L89
            goto L85
        L6e:
            android.view.VelocityTracker r5 = r4.f4848c
            float r5 = r5.getXVelocity()
            int r5 = (int) r5
            boolean r0 = r4.l(r5)
            if (r0 == 0) goto L7f
        L7b:
            r4.j()
            goto L8c
        L7f:
            boolean r5 = r4.m(r5)
            if (r5 == 0) goto L89
        L85:
            r4.k()
            goto L8c
        L89:
            r4.i()
        L8c:
            android.view.VelocityTracker r5 = r4.f4848c
            if (r5 == 0) goto L9b
            r5.recycle()
            r5 = 0
            r4.f4848c = r5
            goto L9b
        L97:
            r4.f4858m = r5
            r4.f4857l = r2
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.Image3DSwitchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setClickable(boolean z3) {
        super.setClickable(z3);
        this.f4861p = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentImage(int r3) {
        /*
            r2 = this;
            int r0 = r2.f4856k
            if (r0 != 0) goto Lf
            int[] r1 = r2.f4860o
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r3 != r1) goto Lf
        Lb:
            r2.k()
            goto L22
        Lf:
            int[] r1 = r2.f4860o
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 != r1) goto L1c
            if (r3 != 0) goto L1c
        L18:
            r2.j()
            goto L22
        L1c:
            if (r3 >= r0) goto L1f
            goto Lb
        L1f:
            if (r3 <= r0) goto L22
            goto L18
        L22:
            r2.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.Image3DSwitchView.setCurrentImage(int):void");
    }

    public void setOnImageSwitchListener(b bVar) {
        this.f4850e = bVar;
    }

    public void setVertical(boolean z3) {
        this.f4847b = z3;
    }
}
