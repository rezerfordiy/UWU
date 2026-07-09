package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends f implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PointF f8162x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<PointF> f8160v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8161w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8163y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8164z = false;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    @Override // i2.f
    public void F(float f4) {
        super.F(f4);
    }

    public float M(Canvas canvas) {
        Path pathP = P();
        if (pathP == null) {
            return 0.0f;
        }
        com.sonoptek.pvus_android.view.f.d();
        double dA = com.sonoptek.pvus_android.view.f.f().A();
        RectF rectF = new RectF();
        pathP.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(pathP, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        int i4 = 0;
        for (int i5 = 0; i5 < canvas.getWidth() / 10; i5++) {
            for (int i6 = 0; i6 < canvas.getHeight() / 10; i6++) {
                if (region.contains(i5 * 10, i6 * 10)) {
                    i4++;
                }
            }
        }
        if (i4 == 0) {
            return 0.0f;
        }
        return (float) (((((double) (i4 * 100)) * dA) * dA) / 100.0d);
    }

    public void N() {
        this.f8164z = true;
    }

    public void O(Canvas canvas) {
        if (this.f8163y) {
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
        String str = d.f8064e.getResources().getString(R.string.human_area1) + ": " + new DecimalFormat("##0.00").format(M(canvas)) + "cm²";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
    }

    public Path P() {
        if (this.f8160v.size() <= 0) {
            return null;
        }
        Path path = new Path();
        path.moveTo(this.f8160v.get(0).x, this.f8160v.get(0).y);
        for (int i4 = 1; i4 < this.f8160v.size(); i4++) {
            path.lineTo(this.f8160v.get(i4).x, this.f8160v.get(i4).y);
        }
        path.close();
        return path;
    }

    public ArrayList<PointF> Q() {
        return this.f8160v;
    }

    public boolean R() {
        return this.f8164z;
    }

    @Override // i2.d
    public void a() {
        this.f8163y = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        Path pathP = P();
        if (pathP != null) {
            canvas.drawPath(pathP, paint);
            O(canvas);
        }
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        if (super.z(pointF)) {
            this.f8163y = true;
            return this;
        }
        this.f8163y = false;
        return null;
    }

    @Override // i2.f, i2.d
    public boolean e() {
        return this.f8160v.size() > 0 && this.f8164z;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8164z) {
            this.f8160v.clear();
            this.f8162x = pointF;
            this.f8164z = false;
        }
        this.f8160v.add(pointF);
    }

    @Override // i2.f
    public f.b k() {
        return super.k();
    }

    @Override // i2.f
    public boolean w() {
        return this.f8163y;
    }

    @Override // i2.f
    public boolean x() {
        return true;
    }
}
