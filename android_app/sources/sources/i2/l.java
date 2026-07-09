package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import i2.f;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class l extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8147v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8148w = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M() {
        f.a aVar;
        f.a aVar2 = this.f8147v;
        if (aVar2 == null || (aVar = this.f8148w) == null) {
            return 0.0f;
        }
        float f4 = aVar2.f8104b - aVar.f8104b;
        float f5 = aVar2.f8105c - aVar.f8105c;
        return ((float) Math.sqrt((f4 * f4) + (f5 * f5))) * this.f8093m;
    }

    public final void N(Canvas canvas) {
        String str;
        f.a aVar;
        Paint paint = new Paint();
        paint.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
        paint.setStrokeWidth(2.0f);
        paint.setTextSize(f.f8083s);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        f.a aVar2 = this.f8147v;
        if (aVar2 == null || (aVar = this.f8148w) == null) {
            str = d.f8064e.getResources().getString(R.string.human_depth) + ": --mm";
        } else {
            str = d.f8064e.getResources().getString(R.string.human_depth) + ": " + decimalFormat.format(Math.abs(aVar.f8105c - aVar2.f8105c) * this.f8093m) + "mm";
        }
        f.b bVar = this.f8088h;
        canvas.drawText(str, bVar.f8109b + (f.f8085u / 2.0f), bVar.f8110c + f.f8084t, paint);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8147v == null) {
            this.f8147v = new f.a(canvas.getWidth() / 2.0f, canvas.getHeight() * 0.75f, this.f8086f);
        }
        if (this.f8148w == null) {
            this.f8148w = new f.a(canvas.getWidth() / 2.0f, canvas.getHeight() * 0.95f, this.f8086f);
        }
        if (this.f8092l) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, f4 + bVar.f8111d, f5 + bVar.f8112e, paint);
        }
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(new DashPathEffect(new float[]{5.0f, 15.0f, 5.0f, 15.0f}, 2.0f));
        f.a aVar = this.f8147v;
        if (aVar != null) {
            if (this.f8091k == aVar) {
                paint2.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
            } else {
                paint2.setColor(-1);
            }
            Path path = new Path();
            path.moveTo(0.0f, this.f8147v.f8105c);
            path.lineTo(canvas.getWidth(), this.f8147v.f8105c);
            canvas.drawPath(path, paint2);
            f.a aVar2 = this.f8148w;
            if (aVar2 != null) {
                if (this.f8091k == aVar2) {
                    paint2.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
                } else {
                    paint2.setColor(-1);
                }
                Path path2 = new Path();
                path2.moveTo(0.0f, this.f8148w.f8105c);
                path2.lineTo(canvas.getWidth(), this.f8148w.f8105c);
                canvas.drawPath(path2, paint2);
            }
        }
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8148w;
        if (aVar != null) {
            if (Math.abs(pointF.y - aVar.f8105c) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8148w;
            }
            if (this.f8091k != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8147v;
        if (aVar2 != null) {
            if (Math.abs(pointF.y - aVar2.f8105c) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8147v;
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
        return (this.f8147v == null || this.f8148w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8147v == null) {
            this.f8147v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8148w != null) {
            return;
        } else {
            this.f8148w = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean m() {
        return true;
    }
}
