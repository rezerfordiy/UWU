package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;

/* JADX INFO: loaded from: classes.dex */
public class USColorView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f6239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PointF[] f6241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f6243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PointF f6245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f6246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f6247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f6248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f6249m;

    public USColorView(Context context) {
        super(context);
        this.f6239c = new Matrix();
        this.f6240d = true;
        this.f6241e = new PointF[4];
        this.f6242f = false;
        this.f6243g = new Paint(3);
        this.f6245i = new PointF();
        this.f6246j = new PointF();
        this.f6247k = new PointF();
        this.f6248l = new PointF();
        this.f6249m = new PointF();
    }

    public void a(PointF pointF, PointF pointF2, PointF pointF3, Canvas canvas) {
        float f4 = pointF3.x - pointF.x;
        float f5 = pointF3.y - pointF.y;
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
        float f6 = pointF.x - fSqrt;
        float f7 = pointF.y - fSqrt;
        float f8 = fSqrt * 2.0f;
        RectF rectF = new RectF(f6, f7, f6 + f8, f8 + f7);
        float fAsin = (float) Math.asin(f5 / fSqrt);
        if (f5 > fSqrt) {
            fAsin = 1.5707964f;
        }
        if (f4 < 0.0f) {
            fAsin = 3.1415927f - fAsin;
        }
        float f9 = (fAsin / 3.1415927f) * 180.0f;
        float f10 = pointF2.x - pointF.x;
        float fAsin2 = pointF2.y - pointF.y <= fSqrt ? (float) Math.asin(r1 / fSqrt) : 1.5707964f;
        if (f10 < 0.0f) {
            fAsin2 = 3.1415927f - fAsin2;
        }
        float f11 = (fAsin2 / 3.1415927f) * 180.0f;
        float f12 = f11 - f9;
        float f13 = f12 > 360.0f ? (f11 - 360.0f) - f9 : f12;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.colorGreenDark));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        canvas.drawArc(rectF, f9, f13, false, paint);
    }

    public void b(PointF pointF) {
        this.f6249m = pointF;
    }

    public void c(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        d(pointF, pointF2, pointF3, pointF4, true);
    }

    public void d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, boolean z3) {
        this.f6244h = z3;
        this.f6245i = pointF;
        this.f6246j = pointF2;
        this.f6247k = pointF3;
        this.f6248l = pointF4;
        invalidate();
    }

    public void e(Bitmap bitmap, float f4, float f5) {
        this.f6238b = Bitmap.createBitmap(bitmap);
        this.f6239c.setScale(f4, f5);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (f.j()) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (f.k()) {
            canvas.scale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
        }
        Bitmap bitmap = this.f6238b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f6239c, this.f6243g);
        }
        this.f6243g.setAntiAlias(true);
        this.f6243g.setStyle(Paint.Style.FILL);
        this.f6243g.setStrokeWidth(2.0f);
        this.f6243g.setColor(getResources().getColor(R.color.colorGreenDark));
        if (this.f6244h) {
            PointF pointF = this.f6245i;
            float f4 = pointF.x;
            float f5 = pointF.y;
            PointF pointF2 = this.f6247k;
            canvas.drawLine(f4, f5, pointF2.x, pointF2.y, this.f6243g);
            PointF pointF3 = this.f6246j;
            float f6 = pointF3.x;
            float f7 = pointF3.y;
            PointF pointF4 = this.f6248l;
            canvas.drawLine(f6, f7, pointF4.x, pointF4.y, this.f6243g);
            PointF pointF5 = this.f6245i;
            float f8 = pointF5.x;
            float f9 = pointF5.y;
            PointF pointF6 = this.f6246j;
            canvas.drawLine(f8, f9, pointF6.x, pointF6.y, this.f6243g);
            PointF pointF7 = this.f6247k;
            float f10 = pointF7.x;
            float f11 = pointF7.y;
            PointF pointF8 = this.f6248l;
            canvas.drawLine(f10, f11, pointF8.x, pointF8.y, this.f6243g);
        } else {
            PointF pointF9 = this.f6245i;
            float f12 = pointF9.x;
            float f13 = pointF9.y;
            PointF pointF10 = this.f6247k;
            canvas.drawLine(f12, f13, pointF10.x, pointF10.y, this.f6243g);
            PointF pointF11 = this.f6246j;
            float f14 = pointF11.x;
            float f15 = pointF11.y;
            PointF pointF12 = this.f6248l;
            canvas.drawLine(f14, f15, pointF12.x, pointF12.y, this.f6243g);
            a(this.f6249m, this.f6245i, this.f6246j, canvas);
            a(this.f6249m, this.f6247k, this.f6248l, canvas);
        }
        int i4 = 10;
        if (this.f6242f) {
            this.f6243g.setStrokeWidth(2.0f);
            PointF[] pointFArr = {this.f6245i, this.f6246j, this.f6247k, this.f6248l};
            int i5 = 0;
            for (int i6 = 4; i5 < i6; i6 = 4) {
                PointF pointF13 = pointFArr[i5];
                float f16 = i4;
                PointF pointF14 = new PointF(pointF13.x - f16, pointF13.y - f16);
                float f17 = 20;
                PointF pointF15 = new PointF(pointF14.x, pointF14.y + f17);
                PointF pointF16 = new PointF(pointF14.x + f17, pointF14.y + f17);
                PointF pointF17 = new PointF(pointF14.x + f17, pointF14.y);
                canvas.drawLine(pointF14.x, pointF14.y, pointF15.x, pointF15.y, this.f6243g);
                canvas.drawLine(pointF15.x, pointF15.y, pointF16.x, pointF16.y, this.f6243g);
                canvas.drawLine(pointF16.x, pointF16.y, pointF17.x, pointF17.y, this.f6243g);
                canvas.drawLine(pointF17.x, pointF17.y, pointF14.x, pointF14.y, this.f6243g);
                i5++;
                i4 = 10;
            }
        }
        if (this.f6240d) {
            this.f6243g.setStrokeWidth(2.0f);
            PointF[] pointFArr2 = {this.f6245i, this.f6246j, this.f6247k, this.f6248l};
            for (int i7 = 0; i7 < 4; i7++) {
                PointF pointF18 = pointFArr2[i7];
                float f18 = 5;
                PointF pointF19 = new PointF(pointF18.x - f18, pointF18.y - f18);
                float f19 = 10;
                PointF pointF20 = new PointF(pointF19.x, pointF19.y + f19);
                PointF pointF21 = new PointF(pointF19.x + f19, pointF19.y + f19);
                PointF pointF22 = new PointF(pointF19.x + f19, pointF19.y);
                canvas.drawLine(pointF19.x, pointF19.y, pointF20.x, pointF20.y, this.f6243g);
                canvas.drawLine(pointF20.x, pointF20.y, pointF21.x, pointF21.y, this.f6243g);
                canvas.drawLine(pointF21.x, pointF21.y, pointF22.x, pointF22.y, this.f6243g);
                canvas.drawLine(pointF22.x, pointF22.y, pointF19.x, pointF19.y, this.f6243g);
            }
        }
    }

    public void setShowSize(boolean z3) {
        this.f6240d = z3;
    }

    public void setSizeState(boolean z3) {
        this.f6242f = z3;
    }

    public USColorView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6239c = new Matrix();
        this.f6240d = true;
        this.f6241e = new PointF[4];
        this.f6242f = false;
        this.f6243g = new Paint(3);
        this.f6245i = new PointF();
        this.f6246j = new PointF();
        this.f6247k = new PointF();
        this.f6248l = new PointF();
        this.f6249m = new PointF();
    }

    public USColorView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6239c = new Matrix();
        this.f6240d = true;
        this.f6241e = new PointF[4];
        this.f6242f = false;
        this.f6243g = new Paint(3);
        this.f6245i = new PointF();
        this.f6246j = new PointF();
        this.f6247k = new PointF();
        this.f6248l = new PointF();
        this.f6249m = new PointF();
    }
}
