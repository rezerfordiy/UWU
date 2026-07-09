package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import m2.b0;
import m2.d0;
import m2.u;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public class USPWLineView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f6386b;

    public USPWLineView(Context context) {
        super(context);
        this.f6386b = null;
    }

    public void a(d0 d0Var, boolean z3) {
        this.f6386b = d0Var;
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
        if (this.f6386b != null) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.colorGreenDark));
            paint.setStrokeWidth(2.0f);
            f.d();
            z zVarF = f.f();
            u uVar = (u) this.f6386b.f8789f.get("b_daa");
            b0 b0Var = (b0) this.f6386b.f8789f.get("pw_data");
            int i4 = b0Var.f8712c;
            int i5 = uVar.f8886d;
            int i6 = (int) b0Var.f8711b;
            int i7 = b0Var.f8713d;
            int i8 = b0Var.f8714e;
            float f4 = i4;
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, i5);
            float f5 = i7;
            PointF pointF3 = new PointF(f4, f5);
            float f6 = i8;
            PointF pointF4 = new PointF(f4, f6);
            PointF pointFF = zVarF.F(pointF, i6);
            PointF pointFF2 = zVarF.F(pointF2, i6);
            PointF pointFF3 = zVarF.F(pointF3, i6);
            PointF pointFF4 = zVarF.F(pointF4, i6);
            canvas.drawLine(pointFF.x, pointFF.y, pointFF3.x, pointFF3.y, paint);
            canvas.drawLine(pointFF4.x, pointFF4.y, pointFF2.x, pointFF2.y, paint);
            float f7 = i4 - 4;
            PointF pointF5 = new PointF(f7, f5);
            float f8 = i4 + 4;
            PointF pointF6 = new PointF(f8, f5);
            PointF pointF7 = new PointF(f7, f6);
            PointF pointF8 = new PointF(f8, f6);
            PointF pointFF5 = zVarF.F(pointF5, 0);
            PointF pointFF6 = zVarF.F(pointF6, 0);
            PointF pointFF7 = zVarF.F(pointF7, 0);
            PointF pointFF8 = zVarF.F(pointF8, 0);
            float f9 = i6;
            PointF pointFB = b(pointFF5, f9, pointFF);
            PointF pointFB2 = b(pointFF6, f9, pointFF);
            PointF pointFB3 = b(pointFF7, f9, pointFF);
            PointF pointFB4 = b(pointFF8, f9, pointFF);
            canvas.drawLine(pointFB.x, pointFB.y, pointFB2.x, pointFB2.y, paint);
            canvas.drawLine(pointFB3.x, pointFB3.y, pointFB4.x, pointFB4.y, paint);
            int i9 = b0Var.f8720k;
            if (i9 != 0) {
                PointF pointF9 = new PointF(f4, (i7 + i8) / 2.0f);
                PointF pointF10 = new PointF(pointF9.x, pointF9.y - 32.0f);
                PointF pointF11 = new PointF(pointF9.x, pointF9.y + 32.0f);
                PointF pointFF9 = zVarF.F(pointF9, i6);
                PointF pointFF10 = zVarF.F(pointF10, i6);
                PointF pointFF11 = zVarF.F(pointF11, i6);
                float f10 = i9;
                PointF pointFB5 = b(pointFF10, f10, pointFF9);
                PointF pointFB6 = b(pointFF11, f10, pointFF9);
                canvas.drawLine(pointFB5.x, pointFB5.y, pointFB6.x, pointFB6.y, paint);
            }
        }
    }

    public USPWLineView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6386b = null;
    }

    public USPWLineView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6386b = null;
    }
}
