package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import java.util.Date;
import m2.w;

/* JADX INFO: loaded from: classes.dex */
public class USMotionView extends View {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Date f6365o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f6367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path[] f6368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PointF f6370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PointF f6371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f6375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint f6377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f6378n;

    public USMotionView(Context context) {
        super(context);
        this.f6369e = false;
        this.f6375k = null;
        this.f6376l = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.f6377m = new Paint(3);
    }

    public final void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, paint);
        float width = getWidth() / this.f6366b.getWidth();
        int size = this.f6378n.f8906g.c().size();
        if (size < 1) {
            return;
        }
        if (size < 10) {
            f6365o = this.f6378n.f8906g.d((100 - size) + 1);
        }
        if (f6365o == null) {
            return;
        }
        if (size < 99) {
            float f4 = size * width;
            canvas.drawLine((getWidth() - f4) + 0.0f, getHeight(), (getWidth() - f4) + 0.0f, getHeight() - 20, paint);
        }
        int i4 = 1;
        float f5 = 0.0f;
        int i5 = 0;
        while (i4 < size && this.f6378n.f8906g.d(100 - (size - i4)) != null) {
            int i6 = 1;
            while (true) {
                int i7 = i4 + i6;
                if (i7 > size) {
                    break;
                }
                Date dateD = this.f6378n.f8906g.d(100 - (size - i7));
                Date dateD2 = this.f6378n.f8906g.d(100 - (size - (i7 - 1)));
                if (dateD == null) {
                    break;
                }
                long j4 = i5 * 1000;
                float time = dateD.getTime() - (f6365o.getTime() + j4);
                float time2 = dateD2.getTime() - (f6365o.getTime() + j4);
                if (time >= 1000.0f) {
                    if (time - 1000.0f > Math.abs(time2 - 1000.0f)) {
                        i6--;
                    }
                    int i8 = i6;
                    float f6 = i8 * width;
                    float f7 = f6 / 5.0f;
                    float f8 = size * width;
                    if ((getWidth() - f8) + f5 > 5.0f) {
                        float f9 = 10.0f;
                        int i9 = 1;
                        while (i9 < 6) {
                            if (i9 % 5 == 0) {
                                f9 = 25.0f;
                            }
                            float f10 = f9;
                            float f11 = i9 * f7;
                            canvas.drawLine((getWidth() - f8) + f5 + f11, getHeight(), (getWidth() - f8) + f5 + f11, getHeight() - f10, paint);
                            i9++;
                            f9 = f10;
                        }
                    }
                    f5 += f6;
                    i5++;
                    i4 += i8 - 1;
                } else {
                    i6++;
                }
            }
            i4++;
        }
    }

    public void b(w wVar, boolean z3) {
        this.f6378n = wVar;
        this.f6369e = z3;
        if (wVar != null) {
            this.f6366b = wVar.f8906g.a();
            invalidate();
        }
    }

    public void c(float f4, float f5) {
        this.f6368d = new Path[6];
        float fAbs = Math.abs(f4 - f5) / 5.0f;
        for (int i4 = 0; i4 < 6; i4++) {
            this.f6368d[i4] = new Path();
            float f6 = (i4 * fAbs) + f4;
            this.f6368d[i4].moveTo(f6, 0.0f);
            this.f6368d[i4].lineTo(f6, getHeight());
            this.f6368d[i4].close();
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6369e) {
            canvas.scale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
        }
        if (this.f6366b != null) {
            Matrix matrix = new Matrix();
            matrix.setScale(getWidth() / this.f6366b.getWidth(), getHeight() / this.f6366b.getHeight());
            canvas.drawBitmap(this.f6366b, matrix, this.f6377m);
            this.f6377m.setStyle(Paint.Style.STROKE);
            this.f6377m.setColor(getResources().getColor(R.color.colorGreenDark));
            this.f6377m.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
            this.f6377m.setStrokeWidth(2.0f);
            if (this.f6370f != null) {
                Path path = new Path();
                path.moveTo(this.f6370f.x, 0.0f);
                path.lineTo(this.f6370f.x, getHeight());
                canvas.drawPath(path, this.f6377m);
            }
            if (this.f6371g != null) {
                Path path2 = new Path();
                path2.moveTo(this.f6371g.x, 0.0f);
                path2.lineTo(this.f6371g.x, getHeight());
                canvas.drawPath(path2, this.f6377m);
            }
            if (this.f6372h) {
                this.f6377m.setColor(getResources().getColor(R.color.colorYellowDark));
                float f4 = (this.f6371g.x - this.f6370f.x) / 5.0f;
                for (int i4 = 1; i4 <= 4; i4++) {
                    Path path3 = new Path();
                    float f5 = i4 * f4;
                    path3.moveTo(this.f6370f.x + f5, 0.0f);
                    path3.lineTo(this.f6370f.x + f5, getHeight());
                    canvas.drawPath(path3, this.f6377m);
                }
            }
            a(canvas);
        }
    }

    public USMotionView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6369e = false;
        this.f6375k = null;
        this.f6376l = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.f6377m = new Paint(3);
    }

    public USMotionView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6369e = false;
        this.f6375k = null;
        this.f6376l = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.f6377m = new Paint(3);
    }
}
