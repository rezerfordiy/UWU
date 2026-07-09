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
public class p extends d0 {
    public static final int A = 0;
    public static final int B = 1;
    public static final int[][] C = {new int[]{23, -1}, new int[]{26, 130}, new int[]{29, 140}, new int[]{32, 150}, new int[]{36, 160}, new int[]{39, 170}, new int[]{43, 180}, new int[]{46, 190}, new int[]{49, 200}, new int[]{52, JPEG.RST2}, new int[]{55, JPEG.DNL}, new int[]{58, JPEG.APP6}, new int[]{61, 240}, new int[]{64, 250}, new int[]{67, 260}, new int[]{70, 270}, new int[]{72, Status.NoSuchSOPclass}, new int[]{75, Status.SOPclassNotSupported}, new int[]{78, 300}, new int[]{80, 310}, new int[]{82, 320}, new int[]{84, 330}, new int[]{86, MatrixView.f6124g0}, new int[]{87, 350}, new int[]{88, 360}, new int[]{89, 370}, new int[]{90, 380}, new int[]{91, 390}, new int[]{92, 400}, new int[]{93, -1}};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8170x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8171y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f8172z;

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
        P(fM / 10.0f);
        String str = d.f8064e.getResources().getString(R.string.human_bpd1) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8171y;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8172z;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public int O() {
        return this.f8170x;
    }

    public void P(float f4) {
        StringBuilder sb;
        String str;
        int i4 = this.f8170x;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            float f5 = (f4 * 1.85f) + 21.4f;
            if (f5 <= 40.0f || f5 > 145.0f) {
                f5 = -1.0f;
            }
            if (f5 > 0.0f) {
                Date date = new Date();
                date.setTime((long) (new Date().getTime() + ((145.0f - f5) * 24.0f * 60.0f * 60.0f * 1000.0f)));
                String str2 = new SimpleDateFormat("yyyy-MM-dd").format(date);
                int identifier = d.f8064e.getResources().getIdentifier("human_ga", "string", d.f8064e.getPackageName());
                this.f8172z = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_edd", "string", d.f8064e.getPackageName())) + ": " + str2;
                str = d.f8064e.getResources().getString(identifier) + ": " + ((int) (f5 + 0.5f)) + "d";
            } else {
                str = "--";
                this.f8172z = "--";
            }
            this.f8171y = str;
            return;
        }
        int iH = h(f4, C);
        int identifier2 = d.f8064e.getResources().getIdentifier("human_ga", "string", d.f8064e.getPackageName());
        int identifier3 = d.f8064e.getResources().getIdentifier("human_edd", "string", d.f8064e.getPackageName());
        if (iH < 0) {
            this.f8171y = d.f8064e.getResources().getString(identifier2) + ": -";
            sb = new StringBuilder();
            sb.append(d.f8064e.getResources().getString(identifier3));
            sb.append(": -");
        } else {
            long j4 = iH / 10;
            long j5 = iH % 10;
            String str3 = s0.a.f11071l + j4 + "w+" + j5 + "d";
            long time = new Date().getTime() + (((280 - (j4 * 7)) - j5) * 24 * 60 * 60 * 1000);
            Date date2 = new Date();
            date2.setTime(time);
            String str4 = new SimpleDateFormat("yyyy-MM-dd").format(date2);
            this.f8171y = d.f8064e.getResources().getString(identifier2) + ": " + str3;
            sb = new StringBuilder();
            sb.append(d.f8064e.getResources().getString(identifier3));
            sb.append(": ");
            sb.append(str4);
        }
        this.f8172z = sb.toString();
    }

    public void Q(int i4) {
        this.f8170x = i4;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
