package com.sonoptek.pvus_android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class BatteryView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4813c;

    public BatteryView(Context context) {
        super(context);
        this.f4812b = 100;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i4;
        super.onDraw(canvas);
        int iS = (int) (MyApplication.s() * 20.0f);
        int iS2 = (int) (MyApplication.s() * 10.0f);
        int width = (getWidth() - iS) / 2;
        int height = (getHeight() - iS2) / 2;
        int iS3 = (int) (MyApplication.s() * 2.0f);
        int iS4 = (int) (MyApplication.s() * 2.0f);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        int i5 = width + iS;
        canvas.drawRect(new Rect(width, height, i5, height + iS2), paint2);
        float f4 = this.f4812b / 100.0f;
        Paint paint3 = new Paint(paint2);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-16711936);
        if (f4 != 0.0f) {
            int i6 = width + 3;
            paint = paint2;
            canvas.drawRect(new Rect(i6, height + 3, (i6 - 3) + ((int) ((iS - 3) * f4)), (r7 + iS2) - 6), paint3);
            i4 = -1;
        } else {
            paint = paint2;
            i4 = -1;
        }
        paint3.setColor(i4);
        int i7 = ((iS2 / 2) + height) - (iS4 / 2);
        canvas.drawRect(new Rect(i5, i7, iS3 + i5, iS4 + i7), paint3);
        if (this.f4813c > 0) {
            Path path = new Path();
            float f5 = i5;
            float f6 = height + (iS2 / 2.0f);
            path.moveTo(f5, f6);
            float f7 = width;
            float f8 = (iS / 2.0f) + f7;
            path.lineTo(f8, height + 3);
            path.lineTo(f8, f6);
            path.lineTo(f7, f6);
            float f9 = f8 + 5.0f;
            path.lineTo(f9, r13 - 3);
            path.lineTo(f9, f6);
            path.lineTo(f5, f6);
            Paint paint4 = paint;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setColor(Color.parseColor("#EEEEEE"));
            canvas.drawPath(path, paint4);
        }
    }

    public void setPlugged(int i4) {
        this.f4813c = i4;
    }

    public void setPower(int i4) {
        this.f4812b = i4;
        if (i4 < 0) {
            this.f4812b = 0;
        }
        invalidate();
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4812b = 100;
    }
}
