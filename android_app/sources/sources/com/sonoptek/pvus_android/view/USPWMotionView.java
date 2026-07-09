package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoptek.pvus_android.MyApplication;
import k2.g;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public class USPWMotionView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f6388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b2.f f6389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6391f;

    public USPWMotionView(Context context) {
        super(context);
        this.f6387b = MyApplication.u() * 16.0f;
        this.f6388c = new Paint(3);
        this.f6389d = null;
        this.f6391f = 2;
    }

    public void a(b2.f fVar, boolean z3) {
        this.f6389d = fVar;
        this.f6390e = (r7.f8718i * 154000.0f) / (((((b0) fVar.f4499a.f8789f.get("pw_data")).f8719j * 1000000.0f) * 4.0f) * ((float) Math.cos((float) (((double) (r7.f8720k / 180.0f)) * 3.141592653589793d))));
        if (z3) {
            invalidate();
        }
    }

    public int getBaseLineIndex() {
        return this.f6391f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f4;
        float f5;
        float f6;
        super.onDraw(canvas);
        if (this.f6389d == null) {
            return;
        }
        int width = getWidth() - 160;
        int height = getHeight();
        b0 b0Var = (b0) this.f6389d.f4499a.f8789f.get("pw_data");
        Bitmap bitmapA = g.a(this.f6389d.f4501c, getBaseLineIndex());
        int width2 = bitmapA.getWidth();
        int height2 = bitmapA.getHeight();
        Matrix matrix = new Matrix();
        float f7 = width;
        float f8 = width2;
        float f9 = f7 / f8;
        float f10 = height;
        matrix.setScale(f9, f10 / height2);
        canvas.drawBitmap(bitmapA, matrix, this.f6388c);
        this.f6388c.setStyle(Paint.Style.FILL);
        this.f6388c.setColor(-1);
        this.f6388c.setStrokeWidth(2.0f);
        this.f6388c.setTextSize(this.f6387b);
        int i4 = this.f6391f;
        canvas.drawLine(0.0f, (i4 * f10) / 4.0f, 40.0f + f7, (i4 * f10) / 4.0f, this.f6388c);
        canvas.drawText("cm/s", 50.0f + f7, (this.f6391f * f10) / 4.0f, this.f6388c);
        float f11 = this.f6390e;
        float f12 = (f10 / 2.0f) / f11;
        int i5 = 5;
        float[] fArr = {10.0f, 20.0f, 50.0f, 100.0f, 200.0f};
        float[] fArr2 = {5.0f, 10.0f, 10.0f, 20.0f, 50.0f};
        int i6 = 0;
        float f13 = 10.0f;
        while (true) {
            if (i6 >= i5) {
                f4 = f12;
                f5 = f13;
                f6 = 5.0f;
                break;
            }
            f13 = fArr[i6];
            f4 = f12;
            if (f11 / f13 <= 3.0d) {
                f6 = fArr2[i6];
                f5 = f13;
                break;
            } else {
                i6++;
                f12 = f4;
                i5 = 5;
            }
        }
        float f14 = f7 + 30.0f;
        int i7 = this.f6391f;
        float f15 = (i7 * f10) / 4.0f;
        float f16 = (i7 / 4.0f) * f11 * 2.0f;
        float f17 = 2.0f * f11 * (1.0f - (i7 / 4.0f));
        for (int i8 = 1; i8 <= ((int) (f16 / f6)); i8++) {
            float f18 = f15 - ((i8 * f6) * f4);
            canvas.drawLine(f14 - 5.0f, f18, f14 + 5.0f, f18, this.f6388c);
        }
        for (int i9 = 1; i9 <= ((int) (f17 / f6)); i9++) {
            float f19 = f15 + (i9 * f6 * f4);
            canvas.drawLine(f14 - 5.0f, f19, f14 + 5.0f, f19, this.f6388c);
        }
        int i10 = 1;
        while (i10 <= ((int) (f16 / f5))) {
            float f20 = i10 * f5;
            float f21 = f15 - (f20 * f4);
            canvas.drawLine(f14 - 10.0f, f21, f14 + 10.0f, f21, this.f6388c);
            canvas.drawText(s0.a.f11071l + ((int) f20), f14 + 30.0f, f21, this.f6388c);
            i10++;
            f9 = f9;
            f7 = f7;
        }
        float f22 = f7;
        float f23 = f9;
        for (int i11 = 1; i11 <= ((int) (f17 / f5)); i11++) {
            float f24 = f15 + (i11 * f5 * f4);
            canvas.drawLine(f14 - 10.0f, f24, f14 + 10.0f, f24, this.f6388c);
            canvas.drawText(s0.a.f11071l + ((int) ((-i11) * f5)), f14 + 30.0f, f24, this.f6388c);
        }
        float f25 = 0.2f * b0Var.f8718i * 0.0625f;
        float f26 = f8 / f25;
        canvas.drawLine(0.0f, f10, f22, f10, this.f6388c);
        int i12 = 0;
        while (true) {
            float f27 = i12;
            if (f27 >= f26) {
                return;
            }
            float f28 = f22 - ((f27 * f25) * f23);
            float f29 = f10 - 10.0f;
            if (i12 % 5 == 0) {
                f29 = f10 - 20.0f;
            }
            canvas.drawLine(f28, f10, f28, f29, this.f6388c);
            i12++;
        }
    }

    public void setBaseLineIndex(int i4) {
        int i5 = i4 % 5;
        if (i5 == 0) {
            i5 = 1;
        }
        this.f6391f = i5;
    }

    public USPWMotionView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6387b = MyApplication.u() * 16.0f;
        this.f6388c = new Paint(3);
        this.f6389d = null;
        this.f6391f = 2;
    }

    public USPWMotionView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6387b = MyApplication.u() * 16.0f;
        this.f6388c = new Paint(3);
        this.f6389d = null;
        this.f6391f = 2;
    }
}
