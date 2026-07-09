package com.sonoptek.pvus_android.gray_map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import k2.c;

/* JADX INFO: loaded from: classes.dex */
public class GrayMapView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f5939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f5940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f5942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5943f;

    public GrayMapView(Context context) {
        super(context);
        this.f5939b = new Paint();
        this.f5940c = new Path();
        this.f5943f = MyApplication.s() * 10.0f;
    }

    public void a(int[] iArr, int i4) {
        this.f5942e = iArr;
        this.f5941d = i4;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5942e != null) {
            float width = getWidth();
            float f4 = this.f5943f;
            float height = (getHeight() - (this.f5943f * 2.0f)) - f4;
            float length = (width - (f4 * 2.0f)) / this.f5942e.length;
            float f5 = height / 255.0f;
            this.f5940c.reset();
            this.f5940c.moveTo(this.f5943f, (this.f5942e[0] * f5) + f4);
            int i4 = 1;
            while (true) {
                if (i4 >= this.f5942e.length) {
                    break;
                }
                Path path = this.f5940c;
                float f6 = this.f5943f;
                path.lineTo((i4 * length) + f6, (r6[i4] * f5) + f6 + f4);
                i4++;
            }
            canvas.drawPath(this.f5940c, this.f5939b);
            String str = "灰阶曲线" + this.f5941d;
            float f7 = this.f5943f;
            canvas.drawText(str, f7, height + f7, this.f5939b);
            int[] iArr = new int[256];
            for (int i5 = 0; i5 < 256; i5++) {
                int i6 = this.f5942e[i5];
                iArr[i5] = ((255 << (i6 + 24)) << (i6 + 16)) << (i6 + 8);
            }
            canvas.drawBitmap(c.c(Bitmap.createBitmap(iArr, 1, 256, Bitmap.Config.ARGB_8888), 10.0f, height), 10.0f, this.f5943f, this.f5939b);
        }
    }

    public GrayMapView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5939b = new Paint();
        this.f5940c = new Path();
        this.f5943f = MyApplication.s() * 10.0f;
        this.f5939b.setColor(getResources().getColor(R.color.colorGreenBlue));
        this.f5939b.setStrokeWidth(2.0f);
    }

    public GrayMapView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5939b = new Paint();
        this.f5940c = new Path();
        this.f5943f = MyApplication.s() * 10.0f;
        this.f5939b.setColor(getResources().getColor(R.color.colorGreenBlue));
        this.f5939b.setStrokeWidth(2.0f);
    }
}
