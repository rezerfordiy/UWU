package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoptek.pvus_android.MyApplication;

/* JADX INFO: loaded from: classes.dex */
public class USScaleView extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f6392k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f6393l = -16737946;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f6396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f6397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path[] f6399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f6400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f6401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6402j;

    public USScaleView(Context context) {
        super(context);
        this.f6394b = 0.1d;
        this.f6395c = 200;
        this.f6398f = MyApplication.s();
        this.f6400h = Boolean.FALSE;
    }

    public void a(float[] fArr) {
        if (fArr[0] <= 0.0f) {
            return;
        }
        Path[] pathArr = new Path[2];
        this.f6399g = pathArr;
        pathArr[0] = new Path();
        this.f6399g[0].moveTo(0.0f, (float) (((double) fArr[0]) / this.f6394b));
        this.f6399g[0].lineTo(20.0f, ((float) (((double) fArr[0]) / this.f6394b)) - 15.0f);
        this.f6399g[0].lineTo(20.0f, ((float) (((double) fArr[0]) / this.f6394b)) + 15.0f);
        this.f6399g[0].close();
        if (fArr[1] > 0.0f) {
            this.f6399g[1] = new Path();
            this.f6399g[1].moveTo(0.0f, (float) (((double) fArr[1]) / this.f6394b));
            this.f6399g[1].lineTo(20.0f, ((float) (((double) fArr[1]) / this.f6394b)) - 15.0f);
            this.f6399g[1].lineTo(20.0f, ((float) (((double) fArr[1]) / this.f6394b)) + 15.0f);
        } else {
            this.f6399g[1] = null;
        }
        invalidate();
    }

    public void b(float[] fArr, int i4) {
        c(fArr, i4, true);
    }

    public void c(float[] fArr, int i4, boolean z3) {
        this.f6401i = fArr;
        this.f6402j = i4;
    }

    public void d(float f4, boolean z3) {
        this.f6394b = f4;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f6400h.booleanValue()) {
            canvas.scale(1.0f, -1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        float width = getWidth();
        this.f6396d.setColor(-1);
        int i4 = 0;
        for (int i5 = 0; i5 <= this.f6395c; i5 += 5) {
            float f4 = (float) (((double) i5) / this.f6394b);
            if (i5 % 10 == 0) {
                float f5 = width / 3.0f;
                canvas.drawLine(0.0f, f4, f5, f4, this.f6396d);
                this.f6396d.setTextSize(MyApplication.u() * 6.0f);
                canvas.drawText(s0.a.f11071l + i5, f5 + 2.0f, f4 + this.f6398f + 3.0f, this.f6396d);
            } else {
                canvas.drawLine(0.0f, f4, (width / 3.0f) * 0.6f, f4, this.f6396d);
            }
        }
        this.f6396d.setColor(this.f6402j);
        if (this.f6401i == null) {
            return;
        }
        while (true) {
            float[] fArr = this.f6401i;
            if (i4 >= fArr.length) {
                return;
            }
            if (fArr[i4] != 0.0f) {
                this.f6397e.reset();
                this.f6397e.moveTo(0.0f, (float) (((double) this.f6401i[i4]) / this.f6394b));
                this.f6397e.lineTo(MyApplication.s() * 8.0f, (float) ((((double) this.f6401i[i4]) / this.f6394b) - ((double) (MyApplication.s() * 6.0f))));
                this.f6397e.lineTo(MyApplication.s() * 8.0f, (float) ((((double) this.f6401i[i4]) / this.f6394b) + ((double) (MyApplication.s() * 6.0f))));
                this.f6397e.close();
                canvas.drawPath(this.f6397e, this.f6396d);
            }
            i4++;
        }
    }

    public void setDepth(int i4) {
        this.f6395c = i4;
    }

    public void setRevert(Boolean bool) {
        this.f6400h = bool;
    }

    public void setScale(float f4) {
        d(f4, true);
    }

    public USScaleView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6394b = 0.1d;
        this.f6395c = 200;
        this.f6398f = MyApplication.s();
        this.f6400h = Boolean.FALSE;
        Paint paint = new Paint();
        this.f6396d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6396d.setStrokeWidth(this.f6398f);
        this.f6397e = new Path();
    }

    public USScaleView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6394b = 0.1d;
        this.f6395c = 200;
        this.f6398f = MyApplication.s();
        this.f6400h = Boolean.FALSE;
        Paint paint = new Paint();
        this.f6396d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6396d.setStrokeWidth(this.f6398f);
        this.f6397e = new Path();
    }
}
