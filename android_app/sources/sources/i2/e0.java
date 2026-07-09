package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8081v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8082w = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M() {
        f.a aVar;
        f.a aVar2 = this.f8081v;
        if (aVar2 == null || (aVar = this.f8082w) == null) {
            return 0.0f;
        }
        return (2.0f / (Math.abs(aVar2.f8104b - aVar.f8104b) / this.f8094n)) * 60.0f;
    }

    public final void N(Canvas canvas) {
        if (this.f8092l) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, bVar.f8111d + f4, f5 + bVar.f8112e, paint);
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
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setStrokeWidth(2.0f);
        textPaint.setTextSize(f.f8083s);
        DecimalFormat decimalFormat = new DecimalFormat("##0.0");
        StaticLayout staticLayout = new StaticLayout(d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_heart2", "string", d.f8064e.getPackageName())) + ": " + decimalFormat.format(M()) + "bpm", textPaint, ((int) MyApplication.s()) * 180, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        canvas.save();
        f.b bVar3 = this.f8088h;
        canvas.translate(bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8081v == null) {
            this.f8081v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), canvas.getHeight() * 0.85f, this.f8086f);
        }
        if (this.f8082w == null) {
            this.f8082w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), canvas.getHeight() * 0.85f, this.f8086f);
        }
        if (this.f8081v != null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            Path path = new Path();
            path.moveTo(this.f8081v.f8104b, canvas.getHeight() * 0.7f);
            path.lineTo(this.f8081v.f8104b, canvas.getHeight());
            if (this.f8091k == this.f8081v) {
                paint.setColor(-16711936);
            }
            canvas.drawPath(path, paint);
            if (this.f8082w != null) {
                Path path2 = new Path();
                float f4 = (this.f8081v.f8104b + this.f8082w.f8104b) / 2.0f;
                path2.moveTo(f4, canvas.getHeight() * 0.7f);
                path2.lineTo(f4, canvas.getHeight());
                paint.setColor(-1);
                canvas.drawPath(path2, paint);
                Path path3 = new Path();
                path3.moveTo(this.f8082w.f8104b, canvas.getHeight() * 0.7f);
                path3.lineTo(this.f8082w.f8104b, canvas.getHeight());
                if (this.f8091k == this.f8082w) {
                    paint.setColor(-16711936);
                } else {
                    paint.setColor(-1);
                }
                canvas.drawPath(path3, paint);
            }
        }
        f.a aVar = this.f8081v;
        if (aVar != null) {
            aVar.a(canvas, aVar == this.f8091k);
        }
        f.a aVar2 = this.f8082w;
        if (aVar2 != null) {
            aVar2.a(canvas, aVar2 == this.f8091k);
        }
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8082w;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8081v;
        if (aVar2 != null) {
            f.a aVarB2 = aVar2.b(pointF);
            this.f8091k = aVarB2;
            if (aVarB2 != null) {
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
        return (this.f8081v == null || this.f8082w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8081v == null) {
            this.f8081v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8082w != null) {
            return;
        } else {
            this.f8082w = new f.a(pointF.x, pointF.y, this.f8086f);
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
}
