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
public class d0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8065v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8066w = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M() {
        f.a aVar;
        f.a aVar2 = this.f8065v;
        if (aVar2 == null || (aVar = this.f8066w) == null) {
            return 0.0f;
        }
        float f4 = aVar2.f8104b - aVar.f8104b;
        float f5 = aVar2.f8105c - aVar.f8105c;
        return ((float) Math.sqrt((f4 * f4) + (f5 * f5))) * this.f8093m;
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
        String str = d.f8064e.getResources().getString(R.string.human_length) + ": " + new DecimalFormat("##0.00").format(M()) + "mm";
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
        if (this.f8065v == null) {
            this.f8065v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), (canvas.getHeight() * (this.f8090j + 3)) / 8.0f, this.f8086f);
        }
        if (this.f8066w == null) {
            this.f8066w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), (canvas.getHeight() * (this.f8090j + 3)) / 8.0f, this.f8086f);
        }
        if (this.f8065v != null && this.f8066w != null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(2.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            Path path = new Path();
            f.a aVar = this.f8065v;
            path.moveTo(aVar.f8104b, aVar.f8105c);
            f.a aVar2 = this.f8066w;
            path.lineTo(aVar2.f8104b, aVar2.f8105c);
            canvas.drawPath(path, paint);
        }
        f.a aVar3 = this.f8065v;
        if (aVar3 != null) {
            aVar3.a(canvas, aVar3 == this.f8091k);
        }
        f.a aVar4 = this.f8066w;
        if (aVar4 != null) {
            aVar4.a(canvas, aVar4 == this.f8091k);
        }
        if (this.f8089i != null) {
            Matrix matrix = new Matrix();
            float fMin = Math.min(canvas.getWidth(), canvas.getHeight()) / 2.0f;
            matrix.postScale(fMin / this.f8089i.getWidth(), fMin / this.f8089i.getHeight());
            Bitmap bitmap = this.f8089i;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f8089i.getHeight(), matrix, true);
            float height = this.f8091k.f8105c < fMin ? (canvas.getHeight() - 10) - fMin : 10.0f;
            canvas.drawBitmap(bitmapCreateBitmap, 50.0f, height, (Paint) null);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(Color.parseColor("#009966"));
            canvas.drawCircle((bitmapCreateBitmap.getWidth() / 2.0f) + 50.0f, height + (bitmapCreateBitmap.getHeight() / 2.0f), 5.0f, paint2);
        }
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8066w;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8065v;
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
        return (this.f8065v == null || this.f8066w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8065v == null) {
            this.f8065v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8066w != null) {
            return;
        } else {
            this.f8066w = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
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
