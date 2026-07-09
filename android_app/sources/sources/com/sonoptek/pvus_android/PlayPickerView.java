package com.sonoptek.pvus_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
public class PlayPickerView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f5132w = "PickerView";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f5133x = 3.5f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f5134y = 3.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static MyScrollView f5135z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f5136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f5150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Timer f5151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f5152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f5153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public Handler f5155u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5156v;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (Math.abs(PlayPickerView.this.f5148n) < 3.0f) {
                PlayPickerView.this.f5148n = 0.0f;
                if (PlayPickerView.this.f5152r != null) {
                    PlayPickerView.this.f5152r.cancel();
                    PlayPickerView.this.f5152r = null;
                    PlayPickerView.this.o();
                }
            } else {
                PlayPickerView.this.f5148n -= (PlayPickerView.this.f5148n / Math.abs(PlayPickerView.this.f5148n)) * 3.0f;
            }
            PlayPickerView.this.invalidate();
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f5158b;

        public b(Handler handler) {
            this.f5158b = handler;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = this.f5158b;
            handler.sendMessage(handler.obtainMessage());
        }
    }

    public interface c {
        void a(String str, int i4);
    }

    public PlayPickerView(Context context) {
        super(context);
        this.f5137c = 0;
        this.f5141g = 250.0f;
        this.f5142h = 100.0f;
        this.f5143i = z1.f12255s;
        this.f5144j = 255;
        this.f5148n = 0.0f;
        this.f5149o = false;
        this.f5154t = 5;
        this.f5155u = new a();
        this.f5156v = true;
        k();
    }

    public static void setScrollView(MyScrollView myScrollView) {
        f5135z = myScrollView;
    }

    public final void f(MotionEvent motionEvent) {
        b bVar = this.f5152r;
        if (bVar != null) {
            bVar.cancel();
            this.f5152r = null;
        }
        this.f5147m = motionEvent.getX();
    }

    public final void g(MotionEvent motionEvent) {
        float f4;
        float x3 = this.f5148n + (motionEvent.getX() - this.f5147m);
        this.f5148n = x3;
        float f5 = this.f5140f;
        if (x3 <= (f5 * 3.5f) / 2.0f) {
            if (x3 < (f5 * (-3.5f)) / 2.0f) {
                if (this.f5137c < this.f5136b.size() - 1) {
                    this.f5137c++;
                }
                f4 = this.f5148n + (this.f5140f * 3.5f);
            }
            this.f5147m = motionEvent.getX();
            invalidate();
        }
        int i4 = this.f5137c;
        if (i4 > 0) {
            this.f5137c = i4 - 1;
        }
        f4 = x3 - (f5 * 3.5f);
        this.f5148n = f4;
        o();
        this.f5147m = motionEvent.getX();
        invalidate();
    }

    public final void h(MotionEvent motionEvent) {
        if (Math.abs(this.f5148n) < 1.0E-4d) {
            this.f5148n = 0.0f;
            return;
        }
        b bVar = this.f5152r;
        if (bVar != null) {
            bVar.cancel();
            this.f5152r = null;
        }
        b bVar2 = new b(this.f5155u);
        this.f5152r = bVar2;
        this.f5151q.schedule(bVar2, 0L, 10L);
    }

    public final void i(Canvas canvas) {
        float fN = n(this.f5146l / 2.0f, this.f5148n);
        this.f5138d.setTextSize(MyApplication.u() * 24.0f);
        Paint paint = this.f5138d;
        float f4 = this.f5141g;
        float f5 = this.f5142h;
        paint.setAlpha((int) (((f4 - f5) * fN) + f5));
        float f6 = (float) (((double) this.f5145k) / 2.0d);
        float f7 = (float) ((((double) this.f5146l) / 2.0d) + ((double) this.f5148n));
        Paint.FontMetricsInt fontMetricsInt = this.f5138d.getFontMetricsInt();
        this.f5153s = (float) (((double) f6) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d)));
        this.f5138d.setColor(Color.parseColor("#6699ff"));
        canvas.drawText("|", f7, this.f5153s, this.f5138d);
        for (int i4 = 1; this.f5137c - i4 >= 0; i4++) {
            j(canvas, i4, -1);
        }
        for (int i5 = 1; this.f5137c + i5 < this.f5136b.size(); i5++) {
            j(canvas, i5, 1);
        }
    }

    public final void j(Canvas canvas, int i4, int i5) {
        float f4 = this.f5140f * 3.5f * i4;
        float f5 = i5;
        float f6 = f4 + (this.f5148n * f5);
        float fN = n(this.f5146l / 2.0f, f6);
        float fU = MyApplication.u() * 16.0f;
        this.f5138d.setColor(this.f5143i);
        this.f5138d.setTextSize(fU);
        this.f5138d.setAlpha((int) ((this.f5141g - this.f5142h) * fN));
        float f7 = (float) ((((double) this.f5146l) / 2.0d) + ((double) (f5 * f6)));
        float f8 = (float) (((double) this.f5145k) / 2.0d);
        Paint.FontMetricsInt fontMetricsInt = this.f5138d.getFontMetricsInt();
        canvas.drawText("|", f7, (float) (((double) f8) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d))), this.f5138d);
    }

    public final void k() {
        this.f5151q = new Timer();
        this.f5136b = new ArrayList();
        Paint paint = new Paint(1);
        this.f5138d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5138d.setTextAlign(Paint.Align.CENTER);
    }

    public final void l() {
        String str = this.f5136b.get(0);
        this.f5136b.remove(0);
        this.f5136b.add(str);
    }

    public final void m() {
        String str = this.f5136b.get(r0.size() - 1);
        this.f5136b.remove(r1.size() - 1);
        this.f5136b.add(0, str);
    }

    public final float n(float f4, float f5) {
        float fPow = (float) (1.0d - Math.pow(f5 / f4, 2.0d));
        if (fPow < 0.0f) {
            return 0.0f;
        }
        return fPow;
    }

    public final void o() {
        List<String> list;
        if (this.f5150p == null || (list = this.f5136b) == null || list.size() <= 1) {
            return;
        }
        this.f5150p.a(this.f5136b.get(this.f5137c), this.f5137c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5149o) {
            i(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f5145k = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.f5146l = measuredWidth;
        float f4 = measuredWidth / (this.f5154t * 2.0f);
        this.f5139e = f4;
        this.f5140f = f4 / 2.0f;
        this.f5149o = true;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MyScrollView myScrollView;
        if (!this.f5156v) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MyScrollView myScrollView2 = f5135z;
            if (myScrollView2 != null) {
                myScrollView2.setScroll(false);
            }
            f(motionEvent);
        } else if (actionMasked == 1) {
            MyScrollView myScrollView3 = f5135z;
            if (myScrollView3 != null) {
                myScrollView3.setScroll(true);
            }
            h(motionEvent);
        } else if (actionMasked == 2) {
            g(motionEvent);
        } else if (actionMasked == 3 && (myScrollView = f5135z) != null) {
            myScrollView.setScroll(true);
        }
        return true;
    }

    @Override // android.view.View
    public void setClickable(boolean z3) {
        super.setClickable(z3);
        this.f5156v = z3;
    }

    public void setData(List<String> list) {
        this.f5136b = list;
        this.f5137c = list.size() - 1;
        invalidate();
    }

    public void setOnSelectListener(c cVar) {
        this.f5150p = cVar;
    }

    public void setSelected(int i4) {
        this.f5137c = i4;
        invalidate();
    }

    public void setmCount(int i4) {
        this.f5154t = i4;
    }

    public PlayPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5137c = 0;
        this.f5141g = 250.0f;
        this.f5142h = 100.0f;
        this.f5143i = z1.f12255s;
        this.f5144j = 255;
        this.f5148n = 0.0f;
        this.f5149o = false;
        this.f5154t = 5;
        this.f5155u = new a();
        this.f5156v = true;
        k();
    }
}
