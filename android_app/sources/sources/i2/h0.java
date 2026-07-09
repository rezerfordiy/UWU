package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.ndk.util;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends f implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Canvas f8121x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8119v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8120w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f8122y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f8123z = 0.0f;

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

    public float N(float f4) {
        float f5 = this.f8123z;
        if (f5 > 0.0f) {
            return (float) (((double) f4) * 3.141592653589793d * (((double) f5) / 20.0d) * (((double) f5) / 20.0d) * 60.0d);
        }
        return 0.0f;
    }

    public float O(Canvas canvas) {
        int[] iArr;
        if (this.f8119v == null || this.f8120w == null || (iArr = this.f8122y) == null) {
            return 0.0f;
        }
        float length = iArr.length / (canvas.getWidth() - 160);
        float height = 128.0f / (canvas.getHeight() * 0.3f);
        int length2 = (int) (this.f8119v.f8104b * length);
        int i4 = (int) (this.f8120w.f8104b * length);
        if (length2 <= i4) {
            i4 = length2;
            length2 = i4;
        }
        int[] iArr2 = this.f8122y;
        if (length2 > iArr2.length) {
            length2 = iArr2.length;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = i4; i5 < length2; i5++) {
            arrayList.add(new PointF(i5, this.f8122y[i5]));
        }
        int i6 = this.f8096p * 32;
        if (i6 == 128) {
            i6 = 127;
        }
        for (int i7 = length2 - 1; i7 >= i4; i7--) {
            arrayList.add(new PointF(i7, i6));
        }
        arrayList.add(new PointF(i4, this.f8122y[i4]));
        return ((((M(arrayList) / this.f8094n) * this.f8095o) / length) / height) / (Math.abs(this.f8120w.f8104b - this.f8119v.f8104b) / this.f8094n);
    }

    public final void P(Canvas canvas) {
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
        paint2.setColor(-1);
        paint2.setStrokeWidth(2.0f);
        paint2.setTextSize(f.f8083s);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        if (this.f8119v == null || this.f8120w == null) {
            return;
        }
        float fO = O(canvas) * 0.58f;
        float fN = N(fO);
        String str = d.f8064e.getResources().getString(R.string.human_pw_tamean) + ": " + decimalFormat.format(fO) + "cm/s";
        f.b bVar2 = this.f8088h;
        canvas.drawText(str, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + f.f8084t, paint2);
        String str2 = d.f8064e.getResources().getString(R.string.human_pw_fl) + ": " + decimalFormat.format(fN) + "ml/min";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str2, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + (f.f8084t * 2.0f), paint2);
    }

    public void Q(float f4) {
        this.f8123z = f4;
    }

    public void R(int[] iArr) {
        this.f8122y = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(int[] r13, android.graphics.Canvas r14) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.h0.S(int[], android.graphics.Canvas):void");
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        this.f8121x = canvas;
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        int[] iArrFindPeak = util.findPeak();
        if (this.f8122y != null && iArrFindPeak != null) {
            float width = (canvas.getWidth() - 160) / this.f8122y.length;
            float height = (canvas.getHeight() * 0.7f) + ((canvas.getHeight() * 0.3f) / 2.0f);
            this.f8119v = new f.a(iArrFindPeak[0] * width, height, this.f8086f);
            this.f8120w = new f.a(iArrFindPeak[2] * width, height, this.f8086f);
        }
        f.a aVar = this.f8119v;
        if (aVar != null) {
            if (this.f8091k == aVar) {
                paint.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
                Path path = new Path();
                path.moveTo(0.0f, this.f8119v.f8105c);
                path.lineTo(canvas.getWidth() - 140, this.f8119v.f8105c);
                canvas.drawPath(path, paint);
            }
            Path path2 = new Path();
            path2.moveTo(this.f8119v.f8104b, canvas.getHeight() * 0.7f);
            path2.lineTo(this.f8119v.f8104b, canvas.getHeight());
            canvas.drawPath(path2, paint);
            f.a aVar2 = this.f8120w;
            if (aVar2 != null) {
                if (this.f8091k == aVar2) {
                    paint.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
                    Path path3 = new Path();
                    path3.moveTo(0.0f, this.f8120w.f8105c);
                    path3.lineTo(canvas.getWidth() - 140, this.f8120w.f8105c);
                    canvas.drawPath(path3, paint);
                } else {
                    paint.setColor(-1);
                }
                Path path4 = new Path();
                path4.moveTo(this.f8120w.f8104b, canvas.getHeight() * 0.7f);
                path4.lineTo(this.f8120w.f8104b, canvas.getHeight());
                canvas.drawPath(path4, paint);
                P(canvas);
            }
        }
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        if (this.f8121x == null) {
            return null;
        }
        if (this.f8120w != null) {
            if (pointF.y > r0.getHeight() * 0.7f && Math.abs(pointF.x - this.f8120w.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8120w;
            }
            if (this.f8091k != null) {
                return this;
            }
        }
        if (this.f8119v != null) {
            if (pointF.y > this.f8121x.getHeight() * 0.7f && Math.abs(pointF.x - this.f8119v.f8104b) < MyApplication.t() * 4.0f) {
                this.f8091k = this.f8119v;
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
        return (this.f8119v == null || this.f8120w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8119v == null) {
            this.f8119v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8120w != null) {
            return;
        } else {
            this.f8120w = new f.a(pointF.x, pointF.y, this.f8086f);
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
    public boolean s() {
        return true;
    }
}
