package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class j extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8130v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8131w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.a f8132x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f8133y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PointF f8134z;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M() {
        if (this.f8130v == null || this.f8131w == null || this.f8132x == null) {
            return 0.0f;
        }
        new DecimalFormat("##0.00");
        f.a aVar = this.f8130v;
        float f4 = aVar.f8104b;
        f.a aVar2 = this.f8131w;
        float f5 = (f4 + aVar2.f8104b) / 2.0f;
        float f6 = (aVar.f8105c + aVar2.f8105c) / 2.0f;
        float fSqrt = ((float) Math.sqrt(((f4 - r3) * (f4 - r3)) + ((r0 - r2) * (r0 - r2)))) / 2.0f;
        f.a aVar3 = this.f8132x;
        float f7 = aVar3.f8104b;
        float f8 = aVar3.f8105c;
        double dSqrt = ((double) ((float) Math.sqrt(((f7 - f5) * (f7 - f5)) + ((f8 - f6) * (f8 - f6))))) * 3.141592653589793d * ((double) fSqrt);
        float f9 = this.f8093m;
        return (float) (((dSqrt * ((double) f9)) * ((double) f9)) / 100.0d);
    }

    public float N() {
        if (this.f8130v == null || this.f8131w == null || this.f8132x == null) {
            return 0.0f;
        }
        new DecimalFormat("##0.00");
        f.a aVar = this.f8130v;
        float f4 = aVar.f8104b;
        f.a aVar2 = this.f8131w;
        float f5 = (f4 + aVar2.f8104b) / 2.0f;
        float f6 = (aVar.f8105c + aVar2.f8105c) / 2.0f;
        float fSqrt = ((float) Math.sqrt(((f4 - r3) * (f4 - r3)) + ((r0 - r2) * (r0 - r2)))) / 2.0f;
        f.a aVar3 = this.f8132x;
        float f7 = aVar3.f8104b;
        float f8 = aVar3.f8105c;
        float fSqrt2 = (float) Math.sqrt(((f7 - f5) * (f7 - f5)) + ((f8 - f6) * (f8 - f6)));
        return (float) (((((double) (fSqrt2 < fSqrt ? fSqrt2 : fSqrt)) * 6.283185307179586d) + ((double) (Math.abs(fSqrt - fSqrt2) * 4.0f))) * ((double) this.f8093m));
    }

    public final Path O(PointF pointF, PointF pointF2, PointF pointF3) {
        float fAbs;
        double d4;
        PointF pointF4;
        Path path = new Path();
        float f4 = pointF2.x;
        float f5 = pointF.x;
        float f6 = (f4 - f5) * (f4 - f5);
        float f7 = pointF2.y;
        float f8 = pointF.y;
        float fSqrt = ((float) Math.sqrt(f6 + ((f7 - f8) * (f7 - f8)))) / 2.0f;
        float f9 = pointF2.x - pointF.x;
        float fAtan = (float) Math.atan((pointF2.y - pointF.y) / f9);
        float f10 = pointF.x;
        float f11 = pointF2.x;
        float f12 = (f10 + f11) / 2.0f;
        float f13 = pointF.y;
        float f14 = pointF2.y;
        float f15 = (f13 + f14) / 2.0f;
        if (f11 == f10) {
            fAbs = Math.abs(pointF3.x - f10);
        } else {
            fAbs = (float) Math.abs(((double) (((pointF3.x * ((f14 - f13) / (f11 - f10))) - pointF3.y) + (((f13 * f11) - (f14 * f10)) / (f11 - f10)))) / Math.sqrt((r6 * r6) + 1.0f));
        }
        PointF pointF5 = new PointF();
        this.f8134z = pointF5;
        double d5 = fSqrt;
        double d6 = fAtan;
        Path path2 = path;
        double d7 = fAbs;
        double d8 = f12;
        pointF5.x = (float) ((((Math.cos(-1.5707963267948966d) * d5) * Math.cos(d6)) - ((Math.sin(-1.5707963267948966d) * d7) * Math.sin(d6))) + d8);
        double d9 = f15;
        this.f8134z.y = (float) ((Math.cos(-1.5707963267948966d) * d5 * Math.sin(d6)) + (Math.sin(-1.5707963267948966d) * d7 * Math.cos(d6)) + d9);
        float f16 = 0.0f;
        if (f9 > 0.0f) {
            d4 = d8;
            pointF4 = pointF2;
        } else {
            d4 = d8;
            pointF4 = pointF;
        }
        path2.moveTo(pointF4.x, pointF4.y);
        while (true) {
            double d10 = f16;
            if (d10 >= 6.283185307179586d) {
                return path2;
            }
            Path path3 = path2;
            path3.lineTo((float) ((((Math.cos(d10) * d5) * Math.cos(d6)) - ((Math.sin(d10) * d7) * Math.sin(d6))) + d4), (float) ((Math.cos(d10) * d5 * Math.sin(d6)) + (Math.sin(d10) * d7 * Math.cos(d6)) + d9));
            f16 = (float) (d10 + 0.031415926535897934d);
            path2 = path3;
            d7 = d7;
        }
    }

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
        float fM = M();
        float fN = N();
        String str = decimalFormat.format(fM);
        String str2 = decimalFormat.format(fN);
        String str3 = d.f8064e.getResources().getString(R.string.human_area1) + ": " + str + "cm²";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str3, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str4 = d.f8064e.getResources().getString(R.string.human_circumference) + ": " + str2 + "mm";
        f.b bVar4 = this.f8088h;
        canvas.drawText(str4, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8130v == null) {
            this.f8130v = new f.a(canvas.getWidth() / 2.0f, (canvas.getHeight() * (this.f8090j + 3)) / 8.0f, this.f8086f);
        }
        if (this.f8131w == null) {
            this.f8131w = new f.a(canvas.getWidth() / 2.0f, ((canvas.getHeight() * (this.f8090j + 3)) / 8.0f) + (canvas.getHeight() / 8.0f), this.f8086f);
        }
        if (this.f8132x == null) {
            this.f8132x = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), ((canvas.getHeight() * (this.f8090j + 3)) / 8.0f) + (canvas.getHeight() / 16.0f), this.f8086f);
        }
        if (this.f8130v != null && this.f8131w != null && this.f8132x != null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(2.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 1.0f));
            f.a aVar = this.f8130v;
            PointF pointF = new PointF(aVar.f8104b, aVar.f8105c);
            f.a aVar2 = this.f8131w;
            PointF pointF2 = new PointF(aVar2.f8104b, aVar2.f8105c);
            f.a aVar3 = this.f8132x;
            canvas.drawPath(O(pointF, pointF2, new PointF(aVar3.f8104b, aVar3.f8105c)), paint);
        }
        f.a aVar4 = this.f8130v;
        if (aVar4 != null) {
            aVar4.a(canvas, aVar4 == this.f8091k);
        }
        f.a aVar5 = this.f8131w;
        if (aVar5 != null) {
            aVar5.a(canvas, aVar5 == this.f8091k);
        }
        f.a aVar6 = this.f8132x;
        if (aVar6 != null) {
            PointF pointF3 = this.f8134z;
            aVar6.f8104b = pointF3.x;
            aVar6.f8105c = pointF3.y;
            aVar6.a(canvas, aVar6 == this.f8091k);
        }
        if (this.f8089i != null) {
            Matrix matrix = new Matrix();
            float height = canvas.getHeight() / 2.0f;
            matrix.postScale(height / this.f8089i.getWidth(), height / this.f8089i.getHeight());
            Bitmap bitmap = this.f8089i;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f8089i.getHeight(), matrix, true);
            float height2 = this.f8091k.f8105c < ((float) (canvas.getHeight() / 2)) ? (canvas.getHeight() - 10) - height : 10.0f;
            canvas.drawBitmap(bitmapCreateBitmap, 50.0f, height2, (Paint) null);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(Color.parseColor("#009966"));
            canvas.drawCircle((bitmapCreateBitmap.getWidth() / 2.0f) + 50.0f, height2 + (bitmapCreateBitmap.getHeight() / 2.0f), 5.0f, paint2);
        }
        P(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8132x;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8131w;
        if (aVar2 != null) {
            f.a aVarB2 = aVar2.b(pointF);
            this.f8091k = aVarB2;
            if (aVarB2 != null) {
                return this;
            }
        }
        f.a aVar3 = this.f8130v;
        if (aVar3 != null) {
            f.a aVarB3 = aVar3.b(pointF);
            this.f8091k = aVarB3;
            if (aVarB3 != null) {
                return this;
            }
        }
        if (super.z(pointF)) {
            this.f8092l = true;
            return this;
        }
        this.f8091k = null;
        this.f8092l = false;
        return null;
    }

    @Override // i2.f, i2.d
    public boolean e() {
        return (this.f8130v == null || this.f8131w == null || this.f8132x == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8130v == null) {
            this.f8130v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8131w == null) {
            this.f8131w = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8132x != null) {
            return;
        } else {
            this.f8132x = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public int i() {
        return 2;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean x() {
        return false;
    }
}
