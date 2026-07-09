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
public class v extends d0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[][] f8181z = {new int[]{3, -1}, new int[]{4, 41}, new int[]{5, 42}, new int[]{6, 43}, new int[]{7, 44}, new int[]{8, 45}, new int[]{9, 46}, new int[]{10, 50}, new int[]{11, 51}, new int[]{12, 52}, new int[]{13, 53}, new int[]{14, 54}, new int[]{15, 55}, new int[]{16, 56}, new int[]{17, 60}, new int[]{18, 61}, new int[]{19, 62}, new int[]{20, 63}, new int[]{21, 64}, new int[]{22, 65}, new int[]{23, 66}, new int[]{24, 70}, new int[]{25, 71}, new int[]{26, 72}, new int[]{27, 73}, new int[]{28, 74}, new int[]{29, 75}, new int[]{30, 76}, new int[]{31, 80}, new int[]{32, 81}, new int[]{33, 82}, new int[]{34, 83}, new int[]{35, 84}, new int[]{36, 85}, new int[]{37, 86}, new int[]{38, 90}, new int[]{39, 91}, new int[]{40, 92}, new int[]{41, 93}, new int[]{42, 94}, new int[]{43, 95}, new int[]{44, 96}, new int[]{45, 100}, new int[]{46, 101}, new int[]{47, 102}, new int[]{48, -1}};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8183y;

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
        O(fM);
        String str = d.f8064e.getResources().getString(R.string.human_gs1) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8182x;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8183y;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public void O(float f4) {
        float f5 = f4 / 10.0f;
        if (f5 < 0.0f || f5 > 3.5f) {
            this.f8182x = d.f8064e.getResources().getString(R.string.human_ga) + ": -";
            this.f8183y = d.f8064e.getResources().getString(R.string.human_edd) + ": -";
            return;
        }
        float f6 = f5 + 3.5f;
        long j4 = (int) f6;
        long j5 = (int) (((f6 - j4) * 7.0f) + 0.5f);
        String str = s0.a.f11071l + j4 + "w+" + j5 + "d";
        long time = new Date().getTime() + (((280 - (j4 * 7)) - j5) * 24 * 60 * 60 * 1000);
        Date date = new Date();
        date.setTime(time);
        this.f8183y = d.f8064e.getResources().getString(R.string.human_edd) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date);
        this.f8182x = d.f8064e.getResources().getString(R.string.human_ga) + ": " + str;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
