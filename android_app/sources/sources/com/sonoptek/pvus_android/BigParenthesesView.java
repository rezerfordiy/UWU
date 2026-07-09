package com.sonoptek.pvus_android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class BigParenthesesView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f4814b;

    public BigParenthesesView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4814b.setStrokeWidth(MyApplication.s() * 2.0f);
        this.f4814b.setColor(z1.f12256t);
        this.f4814b.setStyle(Paint.Style.FILL);
        canvas.drawLine(0.0f, getHeight() - (MyApplication.s() * 8.0f), (getWidth() / 2.0f) - (MyApplication.s() * 2.0f), getHeight() - (MyApplication.s() * 8.0f), this.f4814b);
        canvas.drawLine((getWidth() / 2.0f) - (MyApplication.s() * 2.0f), getHeight() - (MyApplication.s() * 8.0f), getWidth() / 2.0f, getHeight(), this.f4814b);
        canvas.drawLine((getWidth() / 2.0f) + (MyApplication.s() * 2.0f), getHeight() - (MyApplication.s() * 8.0f), getWidth() / 2.0f, getHeight(), this.f4814b);
        canvas.drawLine((getWidth() / 2.0f) + (MyApplication.s() * 2.0f), getHeight() - (MyApplication.s() * 8.0f), getWidth(), getHeight() - (MyApplication.s() * 8.0f), this.f4814b);
    }

    public BigParenthesesView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4814b = new Paint();
    }

    public BigParenthesesView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
