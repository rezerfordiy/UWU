package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.matrix_view.MatrixView;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import org.dcm4che3.net.Status;

/* JADX INFO: loaded from: classes.dex */
public class t extends d0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[][] f8178z = {new int[]{11, -1}, new int[]{12, 130}, new int[]{14, 140}, new int[]{17, 150}, new int[]{21, 160}, new int[]{25, 170}, new int[]{27, 180}, new int[]{30, 190}, new int[]{33, 200}, new int[]{36, JPEG.RST2}, new int[]{39, JPEG.DNL}, new int[]{41, JPEG.APP6}, new int[]{44, 240}, new int[]{46, 250}, new int[]{48, 260}, new int[]{51, 270}, new int[]{53, Status.NoSuchSOPclass}, new int[]{55, 29}, new int[]{57, 300}, new int[]{59, 310}, new int[]{61, 320}, new int[]{63, 330}, new int[]{65, MatrixView.f6124g0}, new int[]{67, 350}, new int[]{69, 360}, new int[]{71, 370}, new int[]{72, 380}, new int[]{73, 390}, new int[]{74, 400}, new int[]{75, -1}};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8180y;

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
        O(fM / 10.0f);
        String str = d.f8064e.getResources().getString(R.string.human_fl1) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8179x;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8180y;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public void O(float f4) {
        float f5 = (2.46f * f4) + 10.35f + (0.17f * f4 * f4);
        if (f5 < 0.0f) {
            this.f8179x = d.f8064e.getResources().getString(R.string.human_ga) + ": -";
            this.f8180y = d.f8064e.getResources().getString(R.string.human_edd) + ": -";
            return;
        }
        int i4 = (int) f5;
        int i5 = (int) (((f5 - i4) * 7.0f) + 0.5f);
        String str = s0.a.f11071l + i4 + "w+" + i5 + "d";
        long time = new Date().getTime() + (((280 - (((long) i4) * 7)) - ((long) i5)) * 24 * 60 * 60 * 1000);
        Date date = new Date();
        date.setTime(time);
        this.f8180y = d.f8064e.getResources().getString(R.string.human_edd) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date);
        this.f8179x = d.f8064e.getResources().getString(R.string.human_ga) + ": " + str;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
