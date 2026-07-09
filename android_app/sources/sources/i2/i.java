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
public class i extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8124v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8125w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.a f8126x = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    @Override // i2.f
    public void F(float f4) {
        super.F(f4);
    }

    public Float M() {
        float fAcos;
        if (((this.f8124v == null) | (this.f8125w == null)) || (this.f8126x == null)) {
            fAcos = 0.0f;
        } else {
            float fSqrt = (float) Math.sqrt(Math.pow(r3.f8104b - r4.f8104b, 2.0d) + Math.pow(this.f8125w.f8105c - this.f8126x.f8105c, 2.0d));
            float fSqrt2 = (float) Math.sqrt(Math.pow(this.f8124v.f8104b - this.f8125w.f8104b, 2.0d) + Math.pow(this.f8124v.f8105c - this.f8125w.f8105c, 2.0d));
            float fSqrt3 = (float) Math.sqrt(Math.pow(this.f8124v.f8104b - this.f8126x.f8104b, 2.0d) + Math.pow(this.f8124v.f8105c - this.f8126x.f8105c, 2.0d));
            fAcos = (float) ((Math.acos((float) (((Math.pow(fSqrt2, 2.0d) + Math.pow(fSqrt3, 2.0d)) - Math.pow(fSqrt, 2.0d)) / ((double) ((fSqrt2 * 2.0f) * fSqrt3)))) * 180.0d) / 3.141592653589793d);
        }
        return Float.valueOf(fAcos);
    }

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
        String str = d.f8064e.getResources().getString(R.string.human_angle) + ": " + new DecimalFormat("##0.00").format(M().floatValue()) + "°";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        super.b(canvas);
        if (this.f8124v == null) {
            this.f8124v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), (canvas.getHeight() * (this.f8090j + 3)) / 8.0f, this.f8086f);
        }
        if (this.f8125w == null) {
            this.f8125w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), (canvas.getHeight() * (this.f8090j + 3)) / 8.0f, this.f8086f);
        }
        if (this.f8126x == null) {
            this.f8126x = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), ((canvas.getHeight() * (this.f8090j + 3)) / 8.0f) + (canvas.getHeight() / 8.0f), this.f8086f);
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 1.0f));
        f.a aVar = this.f8124v;
        if (aVar != null) {
            aVar.a(canvas, aVar == this.f8091k);
        }
        f.a aVar2 = this.f8125w;
        if (aVar2 != null) {
            aVar2.a(canvas, aVar2 == this.f8091k);
        }
        f.a aVar3 = this.f8126x;
        if (aVar3 != null) {
            aVar3.a(canvas, aVar3 == this.f8091k);
        }
        if (this.f8124v != null && this.f8125w != null) {
            Path path = new Path();
            f.a aVar4 = this.f8124v;
            path.moveTo(aVar4.f8104b, aVar4.f8105c);
            f.a aVar5 = this.f8125w;
            path.lineTo(aVar5.f8104b, aVar5.f8105c);
            canvas.drawPath(path, paint);
        }
        if (this.f8124v != null && this.f8126x != null) {
            Path path2 = new Path();
            f.a aVar6 = this.f8124v;
            path2.moveTo(aVar6.f8104b, aVar6.f8105c);
            f.a aVar7 = this.f8126x;
            path2.lineTo(aVar7.f8104b, aVar7.f8105c);
            canvas.drawPath(path2, paint);
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
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8126x;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8125w;
        if (aVar2 != null) {
            f.a aVarB2 = aVar2.b(pointF);
            this.f8091k = aVarB2;
            if (aVarB2 != null) {
                return this;
            }
        }
        f.a aVar3 = this.f8124v;
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
        return (this.f8124v == null || this.f8125w == null || this.f8126x == null) ? false : true;
    }

    @Override // i2.f, i2.d
    public int f() {
        return super.f();
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8124v == null) {
            this.f8124v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8125w == null) {
            this.f8125w = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8126x != null) {
            return;
        } else {
            this.f8126x = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean x() {
        return super.x();
    }
}
