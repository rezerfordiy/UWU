package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import k2.g;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public class USPWExMotionView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f6382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b2.f f6383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6385g;

    public USPWExMotionView(Context context) {
        super(context);
        this.f6380b = MyApplication.u() * 16.0f;
        this.f6382d = new Paint(3);
        this.f6383e = null;
        this.f6385g = 2;
    }

    public final void a(int[] iArr) {
        FileOutputStream fileOutputStream;
        File file = new File(MyApplication.m(), "Txt");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(new File(file, new SimpleDateFormat("yyyy-MM-dd mm:HH:ss").format(Long.valueOf(System.currentTimeMillis())) + ".txt"));
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return;
        }
        for (int i4 = 0; i4 < iArr.length / 128; i4++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i5 = 0; i5 < 128; i5++) {
                stringBuffer.append(iArr[(i4 * 128) + i5] + ",");
            }
            try {
                fileOutputStream.write(stringBuffer.toString().getBytes());
                fileOutputStream.write("\r\n".getBytes());
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        try {
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    public void b(b2.f fVar, boolean z3) {
        this.f6383e = fVar;
        this.f6384f = (((int) h.p(r7.f8718i)) * 154000.0f) / (((((b0) fVar.f4499a.f8789f.get("pw_data")).f8719j * 1000000.0f) * 4.0f) * ((float) Math.cos((float) (((double) (r7.f8720k / 180.0f)) * 3.141592653589793d))));
        if (z3) {
            invalidate();
        }
    }

    public int getBaseLineIndex() {
        return this.f6385g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        super.onDraw(canvas);
        if (this.f6383e == null) {
            return;
        }
        this.f6382d.setStyle(Paint.Style.FILL);
        this.f6382d.setColor(-1);
        this.f6382d.setStrokeWidth(2.0f);
        int width = getWidth() - 160;
        int height = getHeight();
        b0 b0Var = (b0) this.f6383e.f4499a.f8789f.get("pw_data");
        Bitmap bitmapA = g.a(this.f6383e.f4501c, this.f6385g == 0 ? 4 : getBaseLineIndex());
        float width2 = bitmapA.getWidth();
        float f9 = width;
        float f10 = f9 / width2;
        float f11 = height;
        float height2 = f11 / bitmapA.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f10, height2);
        canvas.drawBitmap(bitmapA, matrix, this.f6382d);
        if (this.f6381c != null) {
            this.f6382d.setColor(getResources().getColor(R.color.colorGreenDark));
            this.f6382d.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            path.moveTo(0.0f, this.f6381c[0] * height2);
            int i4 = 1;
            while (true) {
                int[] iArr = this.f6381c;
                if (i4 >= iArr.length) {
                    break;
                }
                float f12 = i4 * f10;
                float f13 = iArr[i4] * height2;
                float f14 = i4 - 4 > 0 ? iArr[r20] * height2 : f13;
                float f15 = i4 + 4 < iArr.length ? iArr[r15] * height2 : f13;
                if (Math.abs(f14 - f13) <= 60.0f && Math.abs(f15 - f13) <= 60.0f && f13 > 0.0f) {
                    path.lineTo(f12, f13);
                }
                i4 += 8;
            }
            canvas.drawPath(path, this.f6382d);
            path.reset();
            float height3 = (this.f6385g / 4.0f) * getHeight();
            float f16 = 0.58f;
            path.moveTo(0.0f, (((this.f6381c[0] * height2) - height3) * 0.58f) + height3);
            int i5 = 1;
            while (true) {
                int[] iArr2 = this.f6381c;
                if (i5 >= iArr2.length) {
                    break;
                }
                float f17 = i5 * f10;
                float f18 = (((iArr2[i5] * height2) - height3) * f16) + height3;
                float f19 = i5 - 4 > 0 ? (((iArr2[r21] * height2) - height3) * f16) + height3 : f18;
                float f20 = f10;
                if (i5 + 4 < iArr2.length) {
                    float f21 = (iArr2[r5] * height2) - height3;
                    f7 = 0.58f;
                    f8 = (f21 * 0.58f) + height3;
                } else {
                    f7 = 0.58f;
                    f8 = f18;
                }
                if (Math.abs(f19 - f18) <= 60.0f && Math.abs(f8 - f18) <= 60.0f) {
                    if (f18 > 0.0f) {
                        path.lineTo(f17, f18);
                    }
                }
                i5 += 8;
                f16 = f7;
                f10 = f20;
            }
            f4 = f10;
            this.f6382d.setColor(l0.a.f8429c);
            canvas.drawPath(path, this.f6382d);
        } else {
            f4 = f10;
        }
        this.f6382d.setColor(-1);
        this.f6382d.setStyle(Paint.Style.FILL);
        this.f6382d.setTextSize(this.f6380b);
        int i6 = this.f6385g;
        canvas.drawLine(0.0f, (i6 * f11) / 4.0f, 40.0f + f9, (i6 * f11) / 4.0f, this.f6382d);
        canvas.drawText("cm/s", 50.0f + f9, (this.f6385g * f11) / 4.0f, this.f6382d);
        float f22 = this.f6384f;
        float f23 = (f11 / 2.0f) / f22;
        int i7 = 10;
        float[] fArr = {2.0f, 4.0f, 10.0f, 20.0f, 50.0f, 100.0f, 200.0f, 500.0f, 1000.0f, 5000.0f};
        float[] fArr2 = {1.0f, 2.0f, 5.0f, 10.0f, 10.0f, 20.0f, 50.0f, 100.0f, 200.0f, 500.0f};
        float f24 = 10.0f;
        float f25 = 10.0f;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                f5 = f25;
                f6 = 5.0f;
                break;
            }
            f25 = fArr[i8];
            float[] fArr3 = fArr;
            if (f22 / f25 <= 3.0d) {
                f6 = fArr2[i8];
                f5 = f25;
                break;
            } else {
                i8++;
                fArr = fArr3;
                i7 = 10;
            }
        }
        float f26 = f9 + 30.0f;
        int i9 = this.f6385g;
        float f27 = (i9 * f11) / 4.0f;
        float f28 = (i9 / 4.0f) * f22 * 2.0f;
        float f29 = f22 * (1.0f - (i9 / 4.0f)) * 2.0f;
        for (int i10 = 1; i10 <= ((int) (f28 / f6)); i10++) {
            float f30 = f27 - ((i10 * f6) * f23);
            canvas.drawLine(f26 - 5.0f, f30, f26 + 5.0f, f30, this.f6382d);
        }
        for (int i11 = 1; i11 <= ((int) (f29 / f6)); i11++) {
            float f31 = f27 + (i11 * f6 * f23);
            canvas.drawLine(f26 - 5.0f, f31, f26 + 5.0f, f31, this.f6382d);
        }
        int i12 = 1;
        while (i12 <= ((int) (f28 / f5))) {
            float f32 = i12 * f5;
            float f33 = f27 - (f32 * f23);
            canvas.drawLine(f26 - f24, f33, f26 + f24, f33, this.f6382d);
            canvas.drawText(s0.a.f11071l + ((int) f32), f26 + 30.0f, f33, this.f6382d);
            i12++;
            f24 = 10.0f;
        }
        for (int i13 = 1; i13 <= ((int) (f29 / f5)); i13++) {
            float f34 = f27 + (i13 * f5 * f23);
            canvas.drawLine(f26 - 10.0f, f34, f26 + 10.0f, f34, this.f6382d);
            canvas.drawText(s0.a.f11071l + ((int) ((-i13) * f5)), f26 + 30.0f, f34, this.f6382d);
        }
        float f35 = 0.2f * (b0Var.f8718i / 8.0f);
        float f36 = width2 / f35;
        int i14 = 0;
        while (true) {
            float f37 = i14;
            if (f37 >= f36) {
                return;
            }
            float f38 = f9 - ((f37 * f35) * f4);
            float f39 = f11 - 10.0f;
            if (i14 % 5 == 0) {
                f39 = f11 - 20.0f;
            }
            canvas.drawLine(f38, f11, f38, f39, this.f6382d);
            i14++;
        }
    }

    public void setBaseLineIndex(int i4) {
        this.f6385g = i4;
    }

    public void setTaMeanData(int[] iArr) {
        if (this.f6381c != iArr) {
            this.f6381c = iArr;
            invalidate();
        }
    }

    public USPWExMotionView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6380b = MyApplication.u() * 16.0f;
        this.f6382d = new Paint(3);
        this.f6383e = null;
        this.f6385g = 2;
    }

    public USPWExMotionView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6380b = MyApplication.u() * 16.0f;
        this.f6382d = new Paint(3);
        this.f6383e = null;
        this.f6385g = 2;
    }
}
