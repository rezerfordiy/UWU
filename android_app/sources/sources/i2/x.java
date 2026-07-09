package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class x extends d0 {
    public static final int A = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8187x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f8189z;

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
        String str = d.f8064e.getResources().getString(R.string.human_gsd_h) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8188y;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8189z;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public int O() {
        return this.f8187x;
    }

    public void P(float f4) {
        String str;
        float f5 = -1.0f;
        if (this.f8187x == 0) {
            float f6 = (((f4 / 10.0f) + 0.55f) / 0.15f) + 0.5f;
            if (f6 < 330.0f) {
                f5 = f6;
            }
        }
        if (f5 > 0.0f) {
            Date date = new Date();
            date.setTime((long) (new Date().getTime() + ((330.0f - f5) * 24.0f * 60.0f * 60.0f * 1000.0f)));
            String str2 = new SimpleDateFormat("yyyy-MM-dd").format(date);
            int i4 = (int) f5;
            int identifier = d.f8064e.getResources().getIdentifier("human_edd", "string", d.f8064e.getPackageName());
            int identifier2 = d.f8064e.getResources().getIdentifier("human_ga", "string", d.f8064e.getPackageName());
            this.f8189z = d.f8064e.getResources().getString(identifier) + ": " + str2;
            str = d.f8064e.getResources().getString(identifier2) + ": " + i4 + "d";
        } else {
            str = "--";
            this.f8189z = "--";
        }
        this.f8188y = str;
    }

    public void Q(int i4) {
        this.f8187x = i4;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
