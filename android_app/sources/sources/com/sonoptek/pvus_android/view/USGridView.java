package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import m2.d0;
import m2.u;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public class USGridView extends View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f6250e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PointF f6252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PointF f6253d;

    public USGridView(Context context) {
        super(context);
    }

    public static void setIsDrawGrid(boolean z3) {
        f6250e = z3;
    }

    public void a(d0 d0Var) {
        if (f6250e) {
            f.d();
            z zVar = f.Q;
            u uVar = (u) d0Var.f8789f.get("b_data");
            PointF pointF = new PointF(0.0f, 0.0f);
            PointF pointF2 = new PointF(uVar.f8885c - 1, uVar.f8886d);
            this.f6252c = zVar.f(pointF);
            this.f6253d = zVar.f(pointF2);
            this.f6251b = zVar.A();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        PointF pointF;
        super.onDraw(canvas);
        int i4 = 0;
        canvas.drawColor(0);
        Paint paint = new Paint();
        paint.setStrokeWidth(MyApplication.s());
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.colorGreenDark));
        PointF pointF2 = this.f6252c;
        if (pointF2 == null || (pointF = this.f6253d) == null) {
            return;
        }
        float f4 = pointF.x - pointF2.x;
        float f5 = pointF.y - pointF2.y;
        float f6 = this.f6251b * 10.0f;
        int i5 = 1;
        while (true) {
            float f7 = i5;
            float f8 = f7 * f6;
            if (f8 > f5) {
                break;
            }
            Path path = new Path();
            path.moveTo(0.0f, this.f6252c.y + f7 + f6);
            path.lineTo(getWidth(), this.f6252c.y + f8);
            canvas.drawPath(path, paint);
            i5++;
        }
        while (true) {
            float f9 = i4 * f6;
            if (f9 > f4) {
                return;
            }
            Path path2 = new Path();
            path2.moveTo(this.f6252c.x + f9, 0.0f);
            path2.lineTo(this.f6252c.x + f9, getHeight());
            canvas.drawPath(path2, paint);
            i4++;
        }
    }

    public USGridView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public USGridView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
