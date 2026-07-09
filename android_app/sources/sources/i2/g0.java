package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8118v = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public final void M(Canvas canvas) {
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
        if (this.f8118v != null) {
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            paint2.setStrokeWidth(2.0f);
            paint2.setTextSize(f.f8083s);
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            float height2 = (canvas.getHeight() * ((this.f8096p * 0.075f) + 0.7f)) - this.f8118v.f8105c;
            String str = d.f8064e.getResources().getString(R.string.human_pw_velocity) + ": " + decimalFormat.format(height2 != 0.0f ? this.f8095o * height2 : 0.0f) + "cm/s";
            f.b bVar3 = this.f8088h;
            canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        }
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        int width;
        if (this.f8118v == null) {
            this.f8118v = new f.a(canvas.getWidth() / 2.0f, canvas.getHeight() * 0.85f, this.f8086f);
        }
        f.a aVar = this.f8118v;
        if (aVar != null) {
            if (aVar.f8105c < canvas.getHeight() * 0.7f) {
                this.f8118v.f8105c = canvas.getHeight() * 0.7f;
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            if (this.f8091k == this.f8118v) {
                paint.setColor(-16711936);
                Path path = new Path();
                if (MyApplication.G()) {
                    path.moveTo(0.0f, this.f8118v.f8105c);
                    width = canvas.getWidth() - 140;
                } else {
                    path.moveTo(0.0f, this.f8118v.f8105c);
                    width = canvas.getWidth();
                }
                path.lineTo(width, this.f8118v.f8105c);
                canvas.drawPath(path, paint);
            }
        }
        f.a aVar2 = this.f8118v;
        if (aVar2 != null) {
            aVar2.a(canvas, aVar2 == this.f8091k);
        }
        M(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8118v;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
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
        return this.f8118v != null;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8118v == null) {
            this.f8118v = new f.a(pointF.x, pointF.y, this.f8086f);
            this.f8091k = null;
        }
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }
}
