package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f8129x = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public float M(List<PointF> list) {
        if (list.size() < 3) {
            return 0.0f;
        }
        int size = list.size() - 1;
        int i4 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (i4 < size) {
            PointF pointF = list.get(i4);
            i4++;
            PointF pointF2 = list.get(i4);
            f4 += pointF.x * pointF2.y;
            f5 += pointF.y * pointF2.x;
        }
        float f6 = (float) (((double) (f4 - f5)) / 2.0d);
        return f6 < 0.0f ? -f6 : f6;
    }

    public float N(Canvas canvas) {
        int[] iArr;
        if (this.f8127v == null || this.f8128w == null || (iArr = this.f8129x) == null) {
            return 0.0f;
        }
        float length = iArr.length / (canvas.getWidth() - 160);
        float height = 128.0f / (canvas.getHeight() * 0.3f);
        int length2 = (int) (this.f8127v.f8104b * length);
        int i4 = (int) (this.f8128w.f8104b * length);
        if (length2 <= i4) {
            i4 = length2;
            length2 = i4;
        }
        int[] iArr2 = this.f8129x;
        if (length2 > iArr2.length) {
            length2 = iArr2.length;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = i4; i5 < length2; i5++) {
            arrayList.add(new PointF(i5, this.f8129x[i5]));
        }
        int i6 = this.f8096p * 32;
        if (i6 == 128) {
            i6 = 127;
        }
        for (int i7 = length2 - 1; i7 >= i4; i7--) {
            arrayList.add(new PointF(i7, i6));
        }
        arrayList.add(new PointF(i4, this.f8129x[i4]));
        return (((M(arrayList) / this.f8094n) * this.f8095o) / length) / height;
    }

    public final void O(Canvas canvas) {
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
        if (this.f8127v == null || this.f8128w == null) {
            return;
        }
        float fN = N(canvas);
        f.b bVar3 = this.f8088h;
        canvas.drawText("VTI: " + (Math.round(fN * 100.0f) / 100.0f) + "cm", bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + (f.f8084t * 1.0f), paint2);
    }

    public final void P(Canvas canvas) {
        this.f8087g.setStrokeWidth(2.0f);
        this.f8087g.setColor(-1);
        this.f8087g.setStyle(Paint.Style.STROKE);
        this.f8087g.setPathEffect(null);
        int i4 = 1;
        if (this.f8129x != null && this.f8127v != null && this.f8128w != null) {
            float width = (canvas.getWidth() - 160) / r2.length;
            float height = (canvas.getHeight() * 0.3f) / 128.0f;
            int i5 = (int) (this.f8127v.f8104b / width);
            int i6 = (int) (this.f8128w.f8104b / width);
            this.f8087g.setColor(Color.parseColor("#1e90ff"));
            this.f8087g.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            float height2 = canvas.getHeight() * 0.7f;
            path.moveTo(this.f8127v.f8104b, (this.f8129x[0] * height) + height2);
            int i7 = i5 + 1;
            while (i7 < i6) {
                float f4 = i7 * width;
                int[] iArr = this.f8129x;
                if (i7 > iArr.length - i4) {
                    break;
                }
                float f5 = (iArr[i7] * height) + height2;
                float f6 = i7 - 4 > 0 ? (iArr[r16] * height) + height2 : f5;
                float f7 = i7 + 4 < iArr.length ? (iArr[r7] * height) + height2 : f5;
                if (Math.abs(f6 - f5) <= 60.0f && Math.abs(f7 - f5) <= 60.0f && f5 > 0.0f) {
                    path.lineTo(f4, f5);
                }
                i7 += 8;
                i4 = 1;
            }
            canvas.drawPath(path, this.f8087g);
        }
        if (this.f8127v != null) {
            this.f8087g.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            this.f8087g.setColor(Color.parseColor("#1e90ff"));
            if (this.f8091k == this.f8127v) {
                this.f8087g.setColor(Color.parseColor("#009966"));
            }
            Path path2 = new Path();
            path2.moveTo(this.f8127v.f8104b, canvas.getHeight() * 0.7f);
            path2.lineTo(this.f8127v.f8104b, canvas.getHeight());
            canvas.drawPath(path2, this.f8087g);
            if (this.f8128w != null) {
                this.f8087g.setColor(Color.parseColor("#1e90ff"));
                if (this.f8091k == this.f8128w) {
                    this.f8087g.setColor(Color.parseColor("#009966"));
                }
                Path path3 = new Path();
                path3.moveTo(this.f8128w.f8104b, canvas.getHeight() * 0.7f);
                path3.lineTo(this.f8128w.f8104b, canvas.getHeight());
                canvas.drawPath(path3, this.f8087g);
            }
        }
        f.a aVar = this.f8127v;
        if (aVar != null) {
            aVar.a(canvas, aVar == this.f8091k);
        }
        f.a aVar2 = this.f8128w;
        if (aVar2 != null) {
            aVar2.a(canvas, aVar2 == this.f8091k);
        }
    }

    public void Q(int[] iArr) {
        this.f8129x = iArr;
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        super.b(canvas);
        if (this.f8127v == null) {
            this.f8127v = new f.a((canvas.getWidth() / 2.0f) - (canvas.getWidth() / 8.0f), canvas.getHeight() * 0.85f, this.f8086f);
        }
        if (this.f8128w == null) {
            this.f8128w = new f.a((canvas.getWidth() / 2.0f) + (canvas.getWidth() / 8.0f), canvas.getHeight() * 0.85f, this.f8086f);
        }
        P(canvas);
        O(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8127v;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8128w;
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
        return (this.f8127v == null || this.f8128w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8127v == null) {
            this.f8127v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8128w != null) {
            return;
        } else {
            this.f8128w = new f.a(pointF.x, pointF.y, this.f8086f);
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public int i() {
        return 5;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean u() {
        return true;
    }
}
