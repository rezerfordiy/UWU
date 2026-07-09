package com.sonoptek.pvus_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class PickerView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f5104w = "PickerView";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f5105x = 3.5f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f5106y = 1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static MyScrollView f5107z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f5108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f5122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Timer f5123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f5124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f5126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public Handler f5128v;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (Math.abs(PickerView.this.f5120n) < 1.0f) {
                PickerView.this.f5120n = 0.0f;
                if (PickerView.this.f5124r != null) {
                    PickerView.this.f5124r.cancel();
                    PickerView.this.f5124r = null;
                    PickerView.this.o();
                }
            } else {
                PickerView.this.f5120n -= (PickerView.this.f5120n / Math.abs(PickerView.this.f5120n)) * 1.0f;
            }
            PickerView.this.invalidate();
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f5130b;

        public b(Handler handler) {
            this.f5130b = handler;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = this.f5130b;
            handler.sendMessage(handler.obtainMessage());
        }
    }

    public interface c {
        void a(String str, int i4);
    }

    public PickerView(Context context) {
        super(context);
        this.f5114h = 250.0f;
        this.f5115i = 100.0f;
        this.f5116j = z1.f12255s;
        this.f5120n = 0.0f;
        this.f5121o = false;
        this.f5125s = 5;
        this.f5127u = false;
        this.f5128v = new a();
        k();
    }

    public static void setScrollView(MyScrollView myScrollView) {
        f5107z = myScrollView;
    }

    public final void f(MotionEvent motionEvent) {
        b bVar = this.f5124r;
        if (bVar != null) {
            bVar.cancel();
            this.f5124r = null;
        }
        this.f5119m = motionEvent.getX();
    }

    public final void g(MotionEvent motionEvent) {
        float f4;
        float x3 = this.f5120n + (motionEvent.getX() - this.f5119m);
        this.f5120n = x3;
        float f5 = this.f5113g;
        if (x3 <= (f5 * 3.5f) / 2.0f) {
            if (x3 < (f5 * (-3.5f)) / 2.0f) {
                l();
                f4 = this.f5120n + (this.f5113g * 3.5f);
            }
            this.f5119m = motionEvent.getX();
            invalidate();
        }
        m();
        f4 = this.f5120n - (this.f5113g * 3.5f);
        this.f5120n = f4;
        o();
        this.f5119m = motionEvent.getX();
        invalidate();
    }

    public final void h(MotionEvent motionEvent) {
        if (Math.abs(this.f5120n) < 1.0E-4d) {
            this.f5120n = 0.0f;
            return;
        }
        b bVar = this.f5124r;
        if (bVar != null) {
            bVar.cancel();
            this.f5124r = null;
        }
        b bVar2 = new b(this.f5128v);
        this.f5124r = bVar2;
        this.f5123q.schedule(bVar2, 0L, 10L);
    }

    public final void i(Canvas canvas) {
        int i4;
        float fN = n(this.f5118l / 2.0f, this.f5120n);
        this.f5110d.setTextSize(this.f5111e);
        Paint paint = this.f5110d;
        float f4 = this.f5114h;
        float f5 = this.f5115i;
        paint.setAlpha((int) (((f4 - f5) * fN) + f5));
        float f6 = (float) (((double) this.f5117k) / 2.0d);
        float f7 = (float) ((((double) this.f5118l) / 2.0d) + ((double) this.f5120n));
        Paint.FontMetricsInt fontMetricsInt = this.f5110d.getFontMetricsInt();
        float f8 = (float) (((double) f6) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d)));
        this.f5126t = f8;
        if (this.f5127u) {
            canvas.drawText("|", f7, f8, this.f5110d);
        } else {
            canvas.drawText(this.f5108b.get(this.f5109c), f7, this.f5126t, this.f5110d);
        }
        int i5 = 1;
        while (true) {
            i4 = this.f5109c;
            if (i4 - i5 < 0) {
                break;
            }
            j(canvas, i5, -1);
            i5++;
        }
        if (i4 == 1) {
            float f9 = -1;
            float f10 = (this.f5113g * 3.5f * 2.0f) + (this.f5120n * f9);
            float fN2 = n(this.f5118l / 2.0f, f10);
            float f11 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f9 * f10)));
            int size = this.f5108b.size() - 1;
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN2));
            canvas.drawText(this.f5108b.get(size), f11, this.f5126t, this.f5110d);
        }
        if (this.f5109c == 0) {
            float f12 = -1;
            float f13 = (this.f5113g * 3.5f * 1.0f) + (this.f5120n * f12);
            float fN3 = n(this.f5118l / 2.0f, f13);
            float f14 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f13 * f12)));
            int size2 = this.f5108b.size() - 1;
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN3));
            canvas.drawText(this.f5108b.get(size2), f14, this.f5126t, this.f5110d);
            float f15 = (this.f5113g * 3.5f * 2.0f) + (this.f5120n * f12);
            float fN4 = n(this.f5118l / 2.0f, f15);
            float f16 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f12 * f15)));
            int size3 = this.f5108b.size() - 2;
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN4));
            canvas.drawText(this.f5108b.get(size3), f16, this.f5126t, this.f5110d);
        }
        for (int i6 = 1; this.f5109c + i6 < this.f5108b.size(); i6++) {
            j(canvas, i6, 1);
        }
        if (this.f5109c == this.f5108b.size() - 2) {
            float f17 = 1;
            float f18 = (this.f5113g * 3.5f * 2.0f) + (this.f5120n * f17);
            float fN5 = n(this.f5118l / 2.0f, f18);
            float f19 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f17 * f18)));
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN5));
            canvas.drawText(this.f5108b.get(0), f19, this.f5126t, this.f5110d);
        }
        if (this.f5109c == this.f5108b.size() - 1) {
            float f20 = 1;
            float f21 = (this.f5113g * 3.5f * 1.0f) + (this.f5120n * f20);
            float fN6 = n(this.f5118l / 2.0f, f21);
            float f22 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f21 * f20)));
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN6));
            canvas.drawText(this.f5108b.get(0), f22, this.f5126t, this.f5110d);
            float f23 = (this.f5113g * 3.5f * 2.0f) + (this.f5120n * f20);
            float fN7 = n(this.f5118l / 2.0f, f23);
            float f24 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f20 * f23)));
            this.f5110d.setTextSize(this.f5111e * 0.8f);
            this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN7));
            canvas.drawText(this.f5108b.get(1), f24, this.f5126t, this.f5110d);
        }
    }

    public final void j(Canvas canvas, int i4, int i5) {
        String str;
        float f4 = i5;
        float f5 = (this.f5113g * 3.5f * i4) + (this.f5120n * f4);
        float fN = n(this.f5118l / 2.0f, f5);
        this.f5110d.setTextSize(this.f5111e * 0.8f);
        this.f5110d.setAlpha((int) ((this.f5114h - this.f5115i) * fN));
        float f6 = (float) ((((double) this.f5118l) / 2.0d) + ((double) (f4 * f5)));
        float f7 = (float) (((double) this.f5117k) / 2.0d);
        Paint.FontMetricsInt fontMetricsInt = this.f5110d.getFontMetricsInt();
        float f8 = (float) (((double) f7) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d)));
        if (this.f5127u) {
            int i6 = Integer.parseInt(this.f5108b.get(this.f5109c + (i5 * i4)));
            int size = this.f5108b.size();
            int i7 = this.f5125s;
            str = (i6 > size - (i7 / 2) || i6 < i7 / 2) ? s0.a.f11071l : "|";
        } else {
            str = this.f5108b.get(this.f5109c + (i5 * i4));
        }
        canvas.drawText(str, f6, f8, this.f5110d);
    }

    public final void k() {
        this.f5123q = new Timer();
        this.f5108b = new ArrayList();
        this.f5111e = MyApplication.u() * 16.0f;
        Paint paint = new Paint(1);
        this.f5110d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5110d.setTextAlign(Paint.Align.CENTER);
        this.f5110d.setColor(this.f5116j);
    }

    public final void l() {
        String str = this.f5108b.get(0);
        this.f5108b.remove(0);
        this.f5108b.add(str);
    }

    public final void m() {
        String str = this.f5108b.get(r0.size() - 1);
        this.f5108b.remove(r1.size() - 1);
        this.f5108b.add(0, str);
    }

    public final float n(float f4, float f5) {
        float fPow = (float) (1.0d - Math.pow(f5 / f4, 2.0d));
        if (fPow < 0.0f) {
            return 0.0f;
        }
        return fPow;
    }

    public final void o() {
        c cVar = this.f5122p;
        if (cVar != null) {
            cVar.a(this.f5108b.get(this.f5109c), this.f5109c);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5121o) {
            i(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f5117k = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.f5118l = measuredWidth;
        float f4 = measuredWidth / (this.f5125s * 2.0f);
        this.f5112f = f4;
        this.f5113g = f4 / 2.0f;
        this.f5121o = true;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[PHI: r4
      0x0020: PHI (r4v2 com.sonoptek.pvus_android.MyScrollView) = (r4v1 com.sonoptek.pvus_android.MyScrollView), (r4v4 com.sonoptek.pvus_android.MyScrollView) binds: [B:15:0x001e, B:11:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L15
            r4 = 3
            if (r0 == r4) goto L10
            goto L2f
        L10:
            com.sonoptek.pvus_android.MyScrollView r4 = com.sonoptek.pvus_android.PickerView.f5107z
            if (r4 == 0) goto L2f
            goto L20
        L15:
            r3.g(r4)
            goto L2f
        L19:
            r3.h(r4)
            com.sonoptek.pvus_android.MyScrollView r4 = com.sonoptek.pvus_android.PickerView.f5107z
            if (r4 == 0) goto L2f
        L20:
            r4.setScroll(r1)
            goto L2f
        L24:
            com.sonoptek.pvus_android.MyScrollView r0 = com.sonoptek.pvus_android.PickerView.f5107z
            if (r0 == 0) goto L2c
            r2 = 0
            r0.setScroll(r2)
        L2c:
            r3.f(r4)
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.PickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setData(List<String> list) {
        this.f5108b = list;
        invalidate();
    }

    public void setOnSelectListener(c cVar) {
        this.f5122p = cVar;
    }

    public void setSelected(int i4) {
        int i5 = 0;
        while (true) {
            if (i5 >= this.f5108b.size()) {
                break;
            }
            if (i4 == Integer.parseInt(this.f5108b.get(i5))) {
                this.f5109c = i5;
                break;
            }
            i5++;
        }
        invalidate();
    }

    public void setShowLine(boolean z3) {
        this.f5127u = z3;
    }

    public void setTextSize(float f4) {
        this.f5111e = f4;
    }

    public void setmCount(int i4) {
        this.f5125s = i4;
    }

    public PickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5114h = 250.0f;
        this.f5115i = 100.0f;
        this.f5116j = z1.f12255s;
        this.f5120n = 0.0f;
        this.f5121o = false;
        this.f5125s = 5;
        this.f5127u = false;
        this.f5128v = new a();
        k();
    }

    public void setSelected(String str) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f5108b.size()) {
                break;
            }
            if (str.equals(this.f5108b.get(i4))) {
                this.f5109c = i4;
                break;
            }
            i4++;
        }
        invalidate();
    }
}
