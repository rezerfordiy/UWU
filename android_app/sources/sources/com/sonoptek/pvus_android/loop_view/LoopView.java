package com.sonoptek.pvus_android.loop_view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import g2.b;
import g2.c;
import g2.d;
import g2.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class LoopView extends View {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public long R;
    public int S;
    public List<Integer> T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f6091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GestureDetector f6092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f6093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledExecutorService f6094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture<?> f6095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f6096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f6097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f6098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f6099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<String> f6100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f6114z;

    public enum a {
        CLICK,
        FLING,
        DAGGLE
    }

    public LoopView(Context context) {
        super(context);
        this.f6094f = Executors.newSingleThreadScheduledExecutor();
        this.f6101m = false;
        this.L = 0;
        this.M = 0;
        this.P = 0;
        this.R = 0L;
        this.S = 1;
        this.T = new ArrayList();
        b(context);
    }

    public void a() {
        ScheduledFuture<?> scheduledFuture = this.f6095g;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f6095g.cancel(true);
        this.f6095g = null;
    }

    public final void b(Context context) {
        this.f6090b = context;
        this.f6091c = new com.sonoptek.pvus_android.loop_view.a(this);
        GestureDetector gestureDetector = new GestureDetector(context, new b(this));
        this.f6092d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f6114z = 2.0f;
        this.A = true;
        this.I = 9;
        this.f6102n = 0;
        this.f6105q = -5263441;
        this.f6106r = -13553359;
        this.f6107s = -3815995;
        this.f6108t = -23296;
        this.f6109u = -6697729;
        this.f6110v = -16764007;
        this.f6111w = -3342439;
        this.f6112x = -16737997;
        this.f6113y = -39836;
        this.D = 0;
        this.E = -1;
        c();
        setTextSize(16.0f);
    }

    public final void c() {
        Paint paint = new Paint();
        this.f6096h = paint;
        paint.setColor(this.f6111w);
        this.f6096h.setAntiAlias(true);
        this.f6096h.setTypeface(Typeface.MONOSPACE);
        this.f6096h.setTextSize(this.f6102n);
        Paint paint2 = new Paint();
        this.f6099k = paint2;
        paint2.setColor(this.f6109u);
        this.f6099k.setAntiAlias(true);
        this.f6099k.setTypeface(Typeface.MONOSPACE);
        this.f6099k.setTextSize(this.f6102n);
        Paint paint3 = new Paint();
        this.f6097i = paint3;
        paint3.setColor(this.f6106r);
        this.f6097i.setAntiAlias(true);
        this.f6097i.setTextScaleX(1.1f);
        this.f6097i.setTypeface(Typeface.MONOSPACE);
        this.f6097i.setTextSize(this.f6102n);
        Paint paint4 = new Paint();
        this.f6098j = paint4;
        paint4.setColor(this.f6107s);
        this.f6098j.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void d() {
        Rect rect = new Rect();
        for (int i4 = 0; i4 < this.f6100l.size(); i4++) {
            String str = this.f6100l.get(i4);
            this.f6097i.getTextBounds(str, 0, str.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f6103o) {
                this.f6103o = iWidth;
            }
            this.f6097i.getTextBounds("星期", 0, 2, rect);
            int iHeight = rect.height();
            if (iHeight > this.f6104p) {
                this.f6104p = iHeight;
            }
        }
    }

    public final void e() {
        if (this.f6093e != null) {
            postDelayed(new d(this), 200L);
        }
    }

    public final void f() {
        if (this.f6100l == null) {
            return;
        }
        d();
        int i4 = this.f6104p;
        float f4 = this.f6114z;
        int i5 = (int) (i4 * f4 * (this.I - 1));
        this.N = i5;
        int i6 = (int) (((double) (i5 * 2)) / 3.141592653589793d);
        this.J = i6;
        this.O = (int) (((double) i5) / 3.141592653589793d);
        int i7 = this.f6103o;
        int i8 = ((int) (((double) i7) * 0.05d)) + 1;
        if (this.M <= i8) {
            this.M = i8;
        }
        this.K = i7 + this.L + this.M;
        this.B = (int) ((i6 - (i4 * f4)) / 2.0f);
        this.C = (int) ((i6 + (f4 * i4)) / 2.0f);
        if (this.E == -1) {
            this.E = this.A ? (this.f6100l.size() + 1) / 2 : 0;
        }
        this.G = this.E;
    }

    public final void g(float f4) {
        a();
        this.f6095g = this.f6094f.scheduleWithFixedDelay(new g2.a(this, f4), 0L, 20, TimeUnit.MILLISECONDS);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.L;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.M;
    }

    public final int getSelectedItem() {
        return this.F;
    }

    public void h(boolean z3, int i4) {
        List<Integer> list;
        int i5;
        this.S = i4;
        this.f6101m = z3;
        if (z3) {
            String str = this.f6100l.get(i4 - 1);
            this.S = Integer.parseInt(str.substring(str.indexOf("CHANNEL ") + 8));
            if (i4 <= 8) {
                this.T.clear();
                return;
            }
            i4 = 13 - (21 - i4);
        }
        if (i4 == 1) {
            this.T.clear();
        } else {
            if (i4 == this.f6100l.size()) {
                this.T.clear();
                list = this.T;
                i5 = i4 - 1;
                list.add(Integer.valueOf(i5));
            }
            this.T.clear();
            this.T.add(Integer.valueOf(i4 - 1));
        }
        list = this.T;
        i5 = i4 + 1;
        list.add(Integer.valueOf(i5));
    }

    public final void i() {
        this.A = false;
    }

    public void j(int i4, int i5, int i6, int i7) {
        this.L = i4;
        this.M = i6;
    }

    public void k(a aVar) {
        a();
        if (aVar == a.FLING || aVar == a.DAGGLE) {
            float f4 = this.f6114z * this.f6104p;
            int i4 = (int) (((this.D % f4) + f4) % f4);
            this.P = i4;
            this.P = ((float) i4) > f4 / 2.0f ? (int) (f4 - i4) : -i4;
        }
        this.f6095g = this.f6094f.scheduleWithFixedDelay(new e(this, this.P), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.loop_view.LoopView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        f();
        setMeasuredDimension(this.K, this.J);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i4;
        boolean zOnTouchEvent = this.f6092d.onTouchEvent(motionEvent);
        float f4 = this.f6114z * this.f6104p;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.R = System.currentTimeMillis();
            a();
            this.Q = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.Q - motionEvent.getRawY();
            this.Q = motionEvent.getRawY();
            this.D = (int) (this.D + rawY);
            if (!this.A) {
                float f5 = (-this.E) * f4;
                float size = ((this.f6100l.size() - 1) - this.E) * f4;
                int i5 = this.D;
                if (i5 < f5) {
                    i4 = (int) f5;
                } else if (i5 > size) {
                    i4 = (int) size;
                }
                this.D = i4;
            }
        } else if (!zOnTouchEvent) {
            float y3 = motionEvent.getY();
            int i6 = this.O;
            this.P = (int) (((((int) (((Math.acos((i6 - y3) / i6) * ((double) this.O)) + ((double) (f4 / 2.0f))) / ((double) f4))) - (this.I / 2)) * f4) - (((this.D % f4) + f4) % f4));
            k(System.currentTimeMillis() - this.R > 120 ? a.DAGGLE : a.CLICK);
        }
        invalidate();
        return true;
    }

    public final void setInitPosition(int i4) {
        this.E = i4;
    }

    public final void setItems(List<String> list) {
        this.f6100l = list;
        f();
        invalidate();
    }

    public final void setListener(c cVar) {
        this.f6093e = cVar;
    }

    public final void setTextSize(float f4) {
        if (f4 > 0.0f) {
            int i4 = (int) (this.f6090b.getResources().getDisplayMetrics().density * f4);
            this.f6102n = i4;
            this.f6096h.setTextSize(i4);
            this.f6097i.setTextSize(this.f6102n);
        }
    }

    public LoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6094f = Executors.newSingleThreadScheduledExecutor();
        this.f6101m = false;
        this.L = 0;
        this.M = 0;
        this.P = 0;
        this.R = 0L;
        this.S = 1;
        this.T = new ArrayList();
        b(context);
    }

    public LoopView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6094f = Executors.newSingleThreadScheduledExecutor();
        this.f6101m = false;
        this.L = 0;
        this.M = 0;
        this.P = 0;
        this.R = 0L;
        this.S = 1;
        this.T = new ArrayList();
        b(context);
    }
}
