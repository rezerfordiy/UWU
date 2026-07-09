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
public class r extends d0 {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int[][] E = {new int[]{50, -1}, new int[]{55, 62}, new int[]{60, 63}, new int[]{65, 64}, new int[]{75, 65}, new int[]{80, 66}, new int[]{90, 70}, new int[]{95, 71}, new int[]{100, 72}, new int[]{110, 73}, new int[]{120, 74}, new int[]{130, 75}, new int[]{140, 76}, new int[]{150, 80}, new int[]{160, 81}, new int[]{170, 82}, new int[]{180, 83}, new int[]{190, 84}, new int[]{200, 85}, new int[]{JPEG.RST2, 86}, new int[]{JPEG.DNL, 90}, new int[]{JPEG.APP6, 91}, new int[]{240, 92}, new int[]{250, 93}, new int[]{260, 94}, new int[]{Status.NoSuchSOPclass, 95}, new int[]{Status.SOPclassNotSupported, 96}, new int[]{300, 100}, new int[]{320, 101}, new int[]{330, 102}, new int[]{MatrixView.f6124g0, 103}, new int[]{360, 104}, new int[]{370, 105}, new int[]{390, 106}, new int[]{400, 110}, new int[]{420, 111}, new int[]{430, 112}, new int[]{450, 113}, new int[]{460, 114}, new int[]{480, 115}, new int[]{500, e.m.f3281r3}, new int[]{510, 120}, new int[]{Status.MistypedArgument, e.m.w3}, new int[]{550, e.m.x3}, new int[]{570, e.m.y3}, new int[]{590, e.m.z3}, new int[]{610, e.m.A3}, new int[]{630, e.m.B3}, new int[]{640, 130}, new int[]{660, 131}, new int[]{680, 132}, new int[]{700, 133}, new int[]{720, 134}, new int[]{740, 135}, new int[]{760, 136}, new int[]{780, 140}, new int[]{800, -1}};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8173x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f8175z;

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
        String str = d.f8064e.getResources().getString(R.string.human_crl1) + ": " + decimalFormat.format(fM) + "mm";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str2 = this.f8174y;
        f.b bVar4 = this.f8088h;
        canvas.drawText(str2, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str3 = this.f8175z;
        f.b bVar5 = this.f8088h;
        canvas.drawText(str3, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
    }

    public int O() {
        return this.f8173x;
    }

    public void P(float f4) {
        StringBuilder sb;
        int i4;
        int identifier = d.f8064e.getResources().getIdentifier("human_ga", "string", d.f8064e.getPackageName());
        int identifier2 = d.f8064e.getResources().getIdentifier("human_edd", "string", d.f8064e.getPackageName());
        int i5 = this.f8173x;
        String str = "d";
        if (i5 != 0) {
            if (i5 == 1) {
                float f5 = ((f4 / 10.0f) * 3.0f) + 27.0f;
                float f6 = f5 >= 40.0f ? -1.0f : f5;
                if (f6 > 0.0f) {
                    Date date = new Date();
                    date.setTime((long) (new Date().getTime() + ((64.0f - f6) * 24.0f * 60.0f * 60.0f * 1000.0f)));
                    i4 = (int) (f6 + 0.5f);
                    this.f8175z = d.f8064e.getResources().getString(identifier2) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date);
                    sb = new StringBuilder();
                    sb.append(d.f8064e.getResources().getString(identifier));
                    sb.append(": ");
                    sb.append(i4);
                }
                this.f8175z = "--";
                this.f8174y = "--";
                return;
            }
            if (i5 == 2) {
                float f7 = ((16.73f * f4) / 10.0f) + 27.5f;
                float f8 = f7 >= 50.0f ? -1.0f : f7;
                if (f8 > 0.0f) {
                    Date date2 = new Date();
                    date2.setTime((long) (new Date().getTime() + ((285.0f - f8) * 24.0f * 60.0f * 60.0f * 1000.0f)));
                    i4 = (int) (f8 + 0.5f);
                    this.f8175z = d.f8064e.getResources().getString(identifier2) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date2);
                    sb = new StringBuilder();
                    sb.append(d.f8064e.getResources().getString(identifier));
                    sb.append(": ");
                    sb.append(i4);
                }
                this.f8175z = "--";
                this.f8174y = "--";
                return;
            }
            if (i5 != 3) {
                return;
            }
            float f9 = (0.39f * f4) + 24.42f;
            if (f9 < 30.0f) {
                f9 = ((1.16f * f4) + 14.05f) - (0.012f * f4);
            }
            float f10 = (f9 < 20.0f || f9 >= 40.0f) ? -1.0f : f9;
            if (f10 > 0.0f) {
                Date date3 = new Date();
                date3.setTime((long) (new Date().getTime() + ((145.0f - f10) * 24.0f * 60.0f * 60.0f * 1000.0f)));
                i4 = (int) (f10 + 0.5f);
                this.f8175z = d.f8064e.getResources().getString(identifier2) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date3);
                sb = new StringBuilder();
                sb.append(d.f8064e.getResources().getString(identifier));
                sb.append(": ");
                sb.append(i4);
            }
            this.f8175z = "--";
            this.f8174y = "--";
            return;
        }
        int iH = h(f4 * 10.0f, E);
        if (iH < 0) {
            this.f8174y = d.f8064e.getResources().getString(identifier) + ": -";
            this.f8175z = d.f8064e.getResources().getString(identifier2) + ": -";
            return;
        }
        long j4 = iH / 10;
        long j5 = iH % 10;
        str = s0.a.f11071l + j4 + "w+" + j5 + "d";
        long time = new Date().getTime() + (((280 - (j4 * 7)) - j5) * 24 * 60 * 60 * 1000);
        Date date4 = new Date();
        date4.setTime(time);
        this.f8175z = d.f8064e.getResources().getString(identifier2) + ": " + new SimpleDateFormat("yyyy-MM-dd").format(date4);
        sb = new StringBuilder();
        sb.append(d.f8064e.getResources().getString(identifier));
        sb.append(": ");
        sb.append(str);
        this.f8174y = sb.toString();
    }

    public void Q(int i4) {
        this.f8173x = i4;
    }

    @Override // i2.f
    public int i() {
        return 3;
    }
}
