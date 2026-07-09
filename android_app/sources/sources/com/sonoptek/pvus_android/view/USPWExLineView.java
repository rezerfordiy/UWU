package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import m2.b0;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public class USPWExLineView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2.f f6379b;

    public USPWExLineView(Context context) {
        super(context);
        this.f6379b = null;
    }

    public void a(b2.f fVar, boolean z3) {
        this.f6379b = fVar;
        if (z3) {
            invalidate();
        }
    }

    public final PointF b(PointF pointF, float f4, PointF pointF2) {
        PointF pointF3 = new PointF();
        double d4 = (float) (((double) (f4 / 180.0f)) * 3.141592653589793d);
        double d5 = pointF.x - pointF2.x;
        double d6 = pointF.y - pointF2.y;
        float fCos = (float) ((Math.cos(d4) * d5) - (Math.sin(d4) * d6));
        float fSin = (float) ((Math.sin(d4) * d5) + (Math.cos(d4) * d6));
        pointF3.x = fCos + pointF2.x;
        pointF3.y = fSin + pointF2.y;
        return pointF3;
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
        if (this.f6379b != null) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.colorGreenDark));
            paint.setStrokeWidth(MyApplication.t() * 0.4f);
            paint.setAntiAlias(true);
            f.d();
            z zVarF = f.f();
            if (zVarF == null || zVarF.n() == 0.0f) {
                return;
            }
            b0 b0Var = (b0) this.f6379b.f4499a.f8789f.get("pw_data");
            if (b0Var == null) {
                return;
            }
            float f4 = b0Var.f8712c;
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, 1.0f);
            PointF pointF3 = new PointF(f4, 510.0f);
            PointF pointF4 = new PointF(f4, b0Var.f8713d + 0.0f);
            PointF pointF5 = new PointF(f4, b0Var.f8714e + 0.0f);
            float f5 = f4 - 4.0f;
            PointF pointF6 = new PointF(f5, pointF4.y);
            float f6 = 4.0f + f4;
            PointF pointF7 = new PointF(f6, pointF4.y);
            PointF pointF8 = new PointF(f5, pointF5.y);
            PointF pointF9 = new PointF(f6, pointF5.y);
            PointF pointF10 = new PointF(f4, (b0Var.f8713d + b0Var.f8714e) / 2.0f);
            PointF pointF11 = new PointF(pointF10.x + 8.0f, pointF10.y);
            pointF10.x -= 8.0f;
            int i4 = (int) b0Var.f8711b;
            int i5 = b0Var.f8720k;
            PointF pointFF = zVarF.f(pointF);
            if (pointFF == null) {
                return;
            }
            PointF pointFF2 = zVarF.F(pointF2, i4);
            PointF pointFF3 = zVarF.F(pointF3, i4);
            PointF pointFF4 = zVarF.F(pointF4, i4);
            PointF pointFF5 = zVarF.F(pointF5, i4);
            PointF pointFF6 = zVarF.f(pointF6);
            PointF pointFF7 = zVarF.f(pointF8);
            PointF pointFF8 = zVarF.f(pointF7);
            PointF pointFF9 = zVarF.f(pointF9);
            PointF pointFF10 = zVarF.f(pointF10);
            PointF pointFF11 = zVarF.f(pointF11);
            float f7 = i4;
            PointF pointFB = b(pointFF6, f7, pointFF);
            PointF pointFB2 = b(pointFF8, f7, pointFF);
            PointF pointFB3 = b(pointFF7, f7, pointFF);
            PointF pointFB4 = b(pointFF9, f7, pointFF);
            PointF pointFB5 = b(pointFF10, f7, pointFF);
            PointF pointFB6 = b(pointFF11, f7, pointFF);
            pointFF.x = (pointFB5.x + pointFB6.x) / 2.0f;
            pointFF.y = (pointFB5.y + pointFB6.y) / 2.0f;
            PointF pointFB7 = b(pointFB5, b0Var.f8720k - 90, pointFF);
            PointF pointFB8 = b(pointFB6, b0Var.f8720k - 90, pointFF);
            canvas.drawLine(pointFF2.x, pointFF2.y, pointFF4.x, pointFF4.y, paint);
            canvas.drawLine(pointFB2.x, pointFB2.y, pointFB.x, pointFB.y, paint);
            canvas.drawLine(pointFB4.x, pointFB4.y, pointFB3.x, pointFB3.y, paint);
            canvas.drawLine(pointFF5.x, pointFF5.y, pointFF3.x, pointFF3.y, paint);
            if (i5 != 0) {
                canvas.drawLine(pointFB8.x, pointFB8.y, pointFB7.x, pointFB7.y, paint);
            }
        }
    }

    public USPWExLineView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6379b = null;
    }

    public USPWExLineView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6379b = null;
    }
}
