package com.sonoptek.pvus_android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.appcompat.widget.ActivityChooserView;
import c.j0;
import com.sonoptek.pvus_android.e;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class RulerView extends View {
    public static MyScrollView H;
    public c A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public b F;
    public Handler G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Scroller f5166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f5167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f5182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f5183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Paint f5184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f5187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5189z;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@j0 Message message) {
            super.handleMessage(message);
            RulerView.this.c();
        }
    }

    public static class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f5191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5192c;

        public b(Handler handler) {
            this.f5191b = handler;
        }

        public void a() {
            this.f5192c = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                Thread.sleep(40L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (this.f5192c) {
                return;
            }
            Handler handler = this.f5191b;
            handler.sendMessage(handler.obtainMessage());
        }
    }

    public interface c {
        void a(float f4);
    }

    public RulerView(Context context) {
        this(context, null);
    }

    public static int h(float f4) {
        return (int) ((f4 * 1.0f) + 0.5f);
    }

    public static void setScrollView(MyScrollView myScrollView) {
        H = myScrollView;
    }

    public final void b() {
        float f4 = this.f5187x - this.f5189z;
        this.f5187x = f4;
        int i4 = this.f5186w;
        if (f4 > i4) {
            if (f4 >= 0.0f) {
                this.f5187x = 0.0f;
            }
            this.f5170g = this.f5172i + ((Math.round((Math.abs(this.f5187x) * 1.0f) / this.f5174k) * this.f5173j) / 10.0f);
            i();
            postInvalidate();
        }
        this.f5187x = i4;
        this.f5189z = 0;
        this.f5166c.forceFinished(true);
        this.f5170g = this.f5172i + ((Math.round((Math.abs(this.f5187x) * 1.0f) / this.f5174k) * this.f5173j) / 10.0f);
        i();
        postInvalidate();
    }

    public final void c() {
        float f4 = this.f5187x - this.f5189z;
        this.f5187x = f4;
        int i4 = this.f5186w;
        if (f4 <= i4) {
            this.f5187x = i4;
        } else if (f4 >= 0.0f) {
            this.f5187x = 0.0f;
        }
        this.f5188y = 0;
        this.f5189z = 0;
        float f5 = this.f5172i;
        float fRound = Math.round((Math.abs(this.f5187x) * 1.0f) / this.f5174k);
        float f6 = this.f5173j;
        float f7 = f5 + ((fRound * f6) / 10.0f);
        this.f5170g = f7;
        this.f5187x = (((this.f5172i - f7) * 10.0f) / f6) * this.f5174k;
        i();
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isEnabled() && this.f5166c.computeScrollOffset()) {
            if (this.f5166c.getCurrX() == this.f5166c.getFinalX()) {
                c();
                return;
            }
            int currX = this.f5166c.getCurrX();
            this.f5189z = this.f5188y - currX;
            b();
            this.f5188y = currX;
        }
    }

    public final void d() {
        this.f5167d.computeCurrentVelocity(1000);
        float xVelocity = this.f5167d.getXVelocity();
        if (Math.abs(xVelocity) > this.f5165b) {
            this.f5166c.fling(0, 0, (int) xVelocity, 0, Integer.MIN_VALUE, ActivityChooserView.f.f1331h, 0, 0);
        }
    }

    public void e(boolean z3) {
        this.D = z3;
    }

    public final float f(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public void g(Context context, AttributeSet attributeSet) {
        this.f5166c = new Scroller(context);
        this.f5174k = h(25.0f);
        this.f5175l = h(2.0f);
        this.f5176m = h(100.0f);
        this.f5177n = h(60.0f);
        this.f5178o = h(40.0f);
        this.f5182s = h(40.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f5912e);
        this.f5181r = typedArrayObtainStyledAttributes.getBoolean(0, this.f5181r);
        this.f5174k = typedArrayObtainStyledAttributes.getDimension(6, this.f5174k);
        this.f5175l = typedArrayObtainStyledAttributes.getDimension(7, this.f5175l);
        this.f5176m = typedArrayObtainStyledAttributes.getDimension(3, this.f5176m);
        this.f5177n = typedArrayObtainStyledAttributes.getDimension(4, this.f5177n);
        this.f5178o = typedArrayObtainStyledAttributes.getDimension(5, this.f5178o);
        this.B = typedArrayObtainStyledAttributes.getColor(2, this.B);
        this.f5180q = typedArrayObtainStyledAttributes.getDimension(14, this.f5180q);
        this.C = typedArrayObtainStyledAttributes.getColor(12, this.C);
        this.f5179p = typedArrayObtainStyledAttributes.getDimension(13, this.f5179p);
        this.f5170g = typedArrayObtainStyledAttributes.getFloat(11, 0.0f);
        this.f5172i = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        this.f5171h = typedArrayObtainStyledAttributes.getFloat(8, 100.0f);
        this.f5173j = typedArrayObtainStyledAttributes.getFloat(10, 0.1f);
        this.f5165b = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        Paint paint = new Paint(1);
        this.f5183t = paint;
        paint.setTextSize(this.f5180q);
        this.f5183t.setColor(this.C);
        this.f5182s = f(this.f5183t);
        Paint paint2 = new Paint(1);
        this.f5184u = paint2;
        paint2.setStrokeWidth(this.f5175l);
        this.f5184u.setColor(this.B);
    }

    public final void i() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(this.f5170g);
        }
    }

    public void j(int i4, boolean z3, boolean z4) {
        float f4 = i4;
        this.f5189z = (int) (f4 > this.f5170g ? this.f5174k / 2.0f : -(this.f5174k / 2.0f));
        this.f5170g = f4;
        float f5 = this.f5174k;
        this.f5186w = (int) ((-(this.f5185v - 1)) * f5);
        this.f5187x = (((this.f5172i - f4) / this.f5173j) * f5 * 10.0f) + this.f5189z;
        invalidate();
        if (z3) {
            i();
        }
        if (z4) {
            b bVar = this.F;
            if (bVar != null) {
                bVar.a();
                this.F = null;
            }
            b bVar2 = new b(this.G);
            this.F = bVar2;
            bVar2.start();
        }
    }

    public void k(float f4, float f5, float f6, float f7, boolean z3) {
        this.f5170g = f4;
        this.f5171h = f6;
        this.f5172i = f5;
        float f8 = (int) (f7 * 10.0f);
        this.f5173j = f8;
        this.f5185v = ((int) (((f6 * 10.0f) - (f5 * 10.0f)) / f8)) + 1;
        float f9 = this.f5174k;
        this.f5186w = (int) ((-(r5 - 1)) * f9);
        float f10 = ((f5 - f4) / f8) * f9 * 10.0f;
        this.f5187x = f10;
        if (z3) {
            if (this.f5189z == 0) {
                this.f5189z = (int) (-(f9 / 2.0f));
            } else {
                this.f5189z = 0;
            }
            this.f5187x = f10 + this.f5189z;
        }
        invalidate();
        setVisibility(0);
    }

    public void l() {
        this.f5189z = 0;
        float f4 = this.f5174k;
        this.f5186w = (int) ((-(this.f5185v - 1)) * f4);
        this.f5187x = ((this.f5172i - this.f5170g) / this.f5173j) * f4 * 10.0f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.RulerView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        this.f5168e = i4;
        this.f5169f = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != 3) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r5.getAction()
            float r2 = r5.getX()
            int r2 = (int) r2
            android.view.VelocityTracker r3 = r4.f5167d
            if (r3 != 0) goto L1b
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r4.f5167d = r3
        L1b:
            android.view.VelocityTracker r3 = r4.f5167d
            r3.addMovement(r5)
            r5 = 0
            if (r0 == 0) goto L43
            if (r0 == r1) goto L35
            r3 = 2
            if (r0 == r3) goto L2c
            r3 = 3
            if (r0 == r3) goto L35
            goto L53
        L2c:
            int r5 = r4.f5188y
            int r5 = r5 - r2
            r4.f5189z = r5
            r4.b()
            goto L53
        L35:
            com.sonoptek.pvus_android.MyScrollView r0 = com.sonoptek.pvus_android.RulerView.H
            if (r0 == 0) goto L3c
            r0.setScroll(r1)
        L3c:
            r4.c()
            r4.d()
            return r5
        L43:
            com.sonoptek.pvus_android.MyScrollView r0 = com.sonoptek.pvus_android.RulerView.H
            if (r0 == 0) goto L4a
            r0.setScroll(r5)
        L4a:
            android.widget.Scroller r0 = r4.f5166c
            r0.forceFinished(r1)
            r4.f5188y = r2
            r4.f5189z = r5
        L53:
            r4.f5188y = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.RulerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawValue(boolean z3) {
        this.E = z3;
    }

    public void setOnValueChangeListener(c cVar) {
        this.A = cVar;
    }

    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RulerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5170g = 50.0f;
        this.f5171h = 200.0f;
        this.f5172i = 100.0f;
        this.f5173j = 1.0f;
        this.f5174k = 5.0f;
        this.f5175l = 4.0f;
        this.f5176m = 420.0f;
        this.f5177n = 30.0f;
        this.f5178o = 17.0f;
        this.f5179p = 10.0f;
        this.f5180q = 30.0f;
        this.f5181r = false;
        this.B = -7829368;
        this.C = z1.f12256t;
        this.D = true;
        this.E = false;
        this.G = new a();
        g(context, attributeSet);
    }
}
