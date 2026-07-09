package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.constraintlayout.widget.e;
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
public class a0 extends j {
    public static final int[][] C = {new int[]{70, -1}, new int[]{80, 130}, new int[]{90, 140}, new int[]{105, 150}, new int[]{e.m.w3, 160}, new int[]{135, 170}, new int[]{149, 180}, new int[]{163, 190}, new int[]{175, 200}, new int[]{188, JPEG.RST2}, new int[]{JPEG.SOF7, JPEG.DNL}, new int[]{JPEG.RST2, JPEG.APP6}, new int[]{JPEG.DRI, 240}, new int[]{JPEG.APP7, 250}, new int[]{241, 260}, new int[]{251, 270}, new int[]{Status.NoSuchAttribute, Status.NoSuchSOPclass}, new int[]{269, Status.SOPclassNotSupported}, new int[]{Status.InvalidArgumentValue, 300}, new int[]{285, 310}, new int[]{293, 320}, new int[]{301, 330}, new int[]{309, MatrixView.f6124g0}, new int[]{316, 350}, new int[]{323, 360}, new int[]{330, 370}, new int[]{337, 380}, new int[]{344, 390}, new int[]{350, 400}, new int[]{356, 410}, new int[]{366, -1}};
    public String A;
    public String B;

    @Override // i2.j
    public void P(Canvas canvas) {
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
        float fN = N();
        Q(fN / 10.0f);
        String str = d.f8064e.getResources().getString(R.string.human_hc1) + ": " + decimalFormat.format(fN) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.A;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.B;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public void Q(float f4) {
        StringBuilder sb;
        float f5 = (0.54f * f4) + 8.96f + (3.0E-4f * f4 * f4 * f4);
        if (f5 < 0.0f) {
            this.B = d.f8064e.getResources().getString(R.string.human_edd) + ": -";
            sb = new StringBuilder();
            sb.append(d.f8064e.getResources().getString(R.string.human_ga));
            sb.append(": -");
        } else {
            int i4 = (int) f5;
            int i5 = (int) (((f5 - i4) * 7.0f) + 0.5f);
            String str = s0.a.f11071l + i4 + "w+" + i5 + "d";
            long time = new Date().getTime() + (((280 - (((long) i4) * 7)) - ((long) i5)) * 24 * 60 * 60 * 1000);
            Date date = new Date();
            date.setTime(time);
            this.B = d.f8064e.getResources().getString(R.string.human_edd) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date);
            sb = new StringBuilder();
            sb.append(d.f8064e.getResources().getString(R.string.human_ga));
            sb.append(": ");
            sb.append(str);
        }
        this.A = sb.toString();
    }

    @Override // i2.j, i2.f
    public int i() {
        return 3;
    }
}
