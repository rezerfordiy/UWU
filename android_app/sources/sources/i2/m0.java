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
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8154v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8155w = null;

    public float M() {
        f.a aVar;
        f.a aVar2 = this.f8154v;
        if (aVar2 == null || (aVar = this.f8155w) == null) {
            return 0.0f;
        }
        return Math.abs(aVar2.f8104b - aVar.f8104b);
    }

    public final void N(Canvas canvas) {
        if (this.f8092l) {
            this.f8087g.setStyle(Paint.Style.FILL);
            this.f8087g.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, f4 + bVar.f8111d, f5 + bVar.f8112e, this.f8087g);
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
        this.f8087g.setStyle(Paint.Style.FILL);
        this.f8087g.setTextSize(f.f8083s);
        this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.white));
        String str = d.f8064e.getResources().getString(R.string.human_bm_time) + "：" + new DecimalFormat("##0.00").format(M() / this.f8094n);
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, this.f8087g);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8154v == null) {
            this.f8154v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), 0.0f, this.f8086f);
        }
        if (this.f8155w == null) {
            this.f8155w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), 0.0f, this.f8086f);
        }
        if (this.f8092l) {
            this.f8087g.setStyle(Paint.Style.FILL);
            this.f8087g.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, f4 + bVar.f8111d, f5 + bVar.f8112e, this.f8087g);
        }
        if (this.f8154v != null) {
            this.f8087g.setStrokeWidth(2.0f);
            this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
            this.f8087g.setStyle(Paint.Style.STROKE);
            this.f8087g.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            Path path = new Path();
            path.moveTo(this.f8154v.f8104b, canvas.getHeight() * 0.7f);
            path.lineTo(this.f8154v.f8104b, canvas.getHeight());
            canvas.drawPath(path, this.f8087g);
            if (this.f8155w != null) {
                Path path2 = new Path();
                path2.moveTo(this.f8155w.f8104b, canvas.getHeight() * 0.7f);
                path2.lineTo(this.f8155w.f8104b, canvas.getHeight());
                canvas.drawPath(path2, this.f8087g);
                this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
                float f6 = this.f8154v.f8104b;
                float f7 = this.f8155w.f8104b;
                if (f6 >= f7) {
                    f7 = f6;
                    f6 = f7;
                }
                Path path3 = new Path();
                path3.moveTo(f6, canvas.getHeight() * 0.85f);
                path3.lineTo(f7, canvas.getHeight() * 0.85f);
                canvas.drawPath(path3, this.f8087g);
                Path path4 = new Path();
                path4.moveTo(f6, canvas.getHeight() * 0.85f);
                float f8 = f6 + 20.0f;
                path4.lineTo(f8, (canvas.getHeight() * 0.85f) - 20.0f);
                canvas.drawPath(path4, this.f8087g);
                Path path5 = new Path();
                path5.moveTo(f6, canvas.getHeight() * 0.85f);
                path5.lineTo(f8, (canvas.getHeight() * 0.85f) + 20.0f);
                canvas.drawPath(path5, this.f8087g);
                Path path6 = new Path();
                path6.moveTo(f7, canvas.getHeight() * 0.85f);
                float f9 = f7 - 20.0f;
                path6.lineTo(f9, (canvas.getHeight() * 0.85f) - 20.0f);
                canvas.drawPath(path6, this.f8087g);
                Path path7 = new Path();
                path7.moveTo(f7, canvas.getHeight() * 0.85f);
                path7.lineTo(f9, (canvas.getHeight() * 0.85f) + 20.0f);
                canvas.drawPath(path7, this.f8087g);
            }
        }
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8155w;
        if (aVar != null) {
            if (Math.abs(pointF.x - aVar.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8155w;
            }
            if (this.f8091k != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8154v;
        if (aVar2 != null) {
            if (Math.abs(pointF.x - aVar2.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8154v;
            }
            if (this.f8091k != null) {
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
        return (this.f8154v == null || this.f8155w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8154v == null) {
            this.f8154v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8155w != null) {
            return;
        } else {
            this.f8155w = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }
}
