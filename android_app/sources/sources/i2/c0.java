package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends d0 {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8058x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f8060z;

    @Override // i2.d0
    public void N(Canvas canvas) {
        if (this.f8092l) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, f4 + bVar.f8111d, f5 + bVar.f8112e, paint);
        }
        Bitmap bitmapA = USMarkView.a(this.f8086f, false);
        float width = bitmapA.getWidth();
        float height = bitmapA.getHeight();
        Matrix matrix = new Matrix();
        float f6 = f.f8085u;
        matrix.setScale((f6 / width) / 2.0f, (f6 / height) / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, (int) width, (int) height, matrix, true);
        f.b bVar2 = this.f8088h;
        canvas.drawBitmap(bitmapCreateBitmap, bVar2.f8109b, bVar2.f8110c, (Paint) null);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStrokeWidth(2.0f);
        paint2.setTextSize(f.f8083s);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        float fM = M();
        P(fM);
        String str = d.f8064e.getResources().getString(R.string.human_hd) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8059y;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8060z;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public int O() {
        return this.f8058x;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[PHI: r2 r11
      0x0058: PHI (r2v6 float) = (r2v5 float), (r2v23 float), (r2v28 float) binds: [B:22:0x0056, B:17:0x0043, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r11v4 float) = (r11v3 float), (r11v14 float), (r11v17 float) binds: [B:22:0x0056, B:17:0x0043, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(float r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c0.P(float):void");
    }

    public void Q(int i4) {
        this.f8058x = i4;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
