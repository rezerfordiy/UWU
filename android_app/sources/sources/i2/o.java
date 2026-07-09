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
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class o extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8165v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8166w = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M() {
        f.a aVar;
        f.a aVar2 = this.f8165v;
        if (aVar2 == null || (aVar = this.f8166w) == null) {
            return 0.0f;
        }
        return (2.0f / (Math.abs(aVar2.f8104b - aVar.f8104b) / this.f8094n)) * 60.0f;
    }

    public final void N(Canvas canvas) {
        StringBuilder sb;
        String string;
        if (this.f8165v == null || this.f8166w == null) {
            sb = new StringBuilder();
        } else {
            float width = canvas.getWidth();
            int i4 = (int) (((this.f8165v.f8104b / width) * 100.0f) + 0.5f);
            int i5 = (int) (((this.f8166w.f8104b / width) * 100.0f) + 0.5f);
            if (i5 < i4) {
                i4 = i5;
                i5 = i4;
            }
            m2.w wVar = (m2.w) ((com.sonoptek.pvus_android.view.a) (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.b ? ((com.sonoptek.pvus_android.view.b) com.sonoptek.pvus_android.view.f.d()).H() : com.sonoptek.pvus_android.view.f.d())).Z;
            Date dateD = wVar.f8906g.d(i4);
            Date dateD2 = wVar.f8906g.d(i5);
            if (dateD != null && dateD2 != null) {
                string = d.f8064e.getResources().getString(R.string.human_bm_time) + "：" + (((int) ((((dateD2.getTime() - dateD.getTime()) / 1000.0f) * 100.0f) + 0.5f)) / 100.0f) + d.f8064e.getResources().getString(R.string.human_second);
                Paint paint = new Paint();
                paint.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
                paint.setStrokeWidth(2.0f);
                paint.setTextSize(f.f8083s);
                f.b bVar = this.f8088h;
                canvas.drawText(string, bVar.f8109b + (f.f8085u / 2.0f), bVar.f8110c + f.f8084t, paint);
            }
            sb = new StringBuilder();
        }
        sb.append(d.f8064e.getResources().getString(R.string.human_bm_time));
        sb.append("：-- ");
        sb.append(d.f8064e.getResources().getString(R.string.human_second));
        string = sb.toString();
        Paint paint2 = new Paint();
        paint2.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
        paint2.setStrokeWidth(2.0f);
        paint2.setTextSize(f.f8083s);
        f.b bVar2 = this.f8088h;
        canvas.drawText(string, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + f.f8084t, paint2);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8165v == null) {
            this.f8165v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), 0.0f, this.f8086f);
        }
        if (this.f8166w == null) {
            this.f8166w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), 0.0f, this.f8086f);
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
        if (this.f8165v != null) {
            Paint paint2 = new Paint();
            paint2.setStrokeWidth(2.0f);
            paint2.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            Path path = new Path();
            path.moveTo(this.f8165v.f8104b, canvas.getHeight() * 0.7f);
            path.lineTo(this.f8165v.f8104b, canvas.getHeight());
            canvas.drawPath(path, paint2);
            if (this.f8166w != null) {
                Path path2 = new Path();
                path2.moveTo(this.f8166w.f8104b, canvas.getHeight() * 0.7f);
                path2.lineTo(this.f8166w.f8104b, canvas.getHeight());
                canvas.drawPath(path2, paint2);
                paint2.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
                float f6 = this.f8165v.f8104b;
                float f7 = this.f8166w.f8104b;
                if (f6 >= f7) {
                    f7 = f6;
                    f6 = f7;
                }
                Path path3 = new Path();
                path3.moveTo(f6, canvas.getHeight() * 0.8f);
                path3.lineTo(f7, canvas.getHeight() * 0.8f);
                canvas.drawPath(path3, paint2);
                Path path4 = new Path();
                path4.moveTo(f6, canvas.getHeight() * 0.8f);
                float f8 = f6 + 20.0f;
                path4.lineTo(f8, (canvas.getHeight() * 0.8f) - 20.0f);
                canvas.drawPath(path4, paint2);
                Path path5 = new Path();
                path5.moveTo(f6, canvas.getHeight() * 0.8f);
                path5.lineTo(f8, (canvas.getHeight() * 0.8f) + 20.0f);
                canvas.drawPath(path5, paint2);
                Path path6 = new Path();
                path6.moveTo(f7, canvas.getHeight() * 0.8f);
                float f9 = f7 - 20.0f;
                path6.lineTo(f9, (canvas.getHeight() * 0.8f) - 20.0f);
                canvas.drawPath(path6, paint2);
                Path path7 = new Path();
                path7.moveTo(f7, canvas.getHeight() * 0.8f);
                path7.lineTo(f9, (canvas.getHeight() * 0.8f) + 20.0f);
                canvas.drawPath(path7, paint2);
            }
        }
        N(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8166w;
        if (aVar != null) {
            if (Math.abs(pointF.x - aVar.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8166w;
            }
            if (this.f8091k != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8165v;
        if (aVar2 != null) {
            if (Math.abs(pointF.x - aVar2.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8165v;
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
        return (this.f8165v == null || this.f8166w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8165v == null) {
            this.f8165v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8166w != null) {
            return;
        } else {
            this.f8166w = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean p() {
        return true;
    }
}
