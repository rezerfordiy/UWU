package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.measure.USMarkView;
import com.sonoptek.pvus_android.ndk.util;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8113v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8114w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.a f8115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f.a f8116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f8117z;

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

    public float N() {
        f.a aVar;
        f.a aVar2 = this.f8113v;
        if (aVar2 == null || (aVar = this.f8114w) == null) {
            return 0.0f;
        }
        float f4 = aVar2.f8104b - aVar.f8104b;
        float f5 = aVar2.f8105c - aVar.f8105c;
        return ((float) Math.sqrt((f4 * f4) + (f5 * f5))) * this.f8095o;
    }

    public float O(Canvas canvas) {
        int[] iArr;
        if (this.f8115x == null || this.f8116y == null || (iArr = this.f8117z) == null) {
            return 0.0f;
        }
        float length = iArr.length / (canvas.getWidth() - 160);
        float height = 128.0f / (canvas.getHeight() * 0.3f);
        int length2 = (int) (this.f8115x.f8104b * length);
        int i4 = (int) (this.f8116y.f8104b * length);
        if (length2 <= i4) {
            i4 = length2;
            length2 = i4;
        }
        int[] iArr2 = this.f8117z;
        if (length2 > iArr2.length) {
            length2 = iArr2.length;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = i4; i5 < length2; i5++) {
            arrayList.add(new PointF(i5, this.f8117z[i5]));
        }
        int i6 = this.f8096p * 32;
        if (i6 == 128) {
            i6 = 127;
        }
        for (int i7 = length2 - 1; i7 >= i4; i7--) {
            arrayList.add(new PointF(i7, i6));
        }
        arrayList.add(new PointF(i4, this.f8117z[i4]));
        return ((((M(arrayList) / this.f8094n) * this.f8095o) / length) / height) / (Math.abs(this.f8116y.f8104b - this.f8115x.f8104b) / this.f8094n);
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
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        if (this.f8113v == null || this.f8114w == null) {
            return;
        }
        float height2 = (canvas.getHeight() * ((this.f8096p * 0.075f) + 0.7f)) - this.f8113v.f8105c;
        float f7 = height2 != 0.0f ? height2 * this.f8095o : 0.0f;
        float height3 = (canvas.getHeight() * ((this.f8096p * 0.075f) + 0.7f)) - this.f8114w.f8105c;
        float f8 = height3 != 0.0f ? height3 * this.f8095o : 0.0f;
        String str = O(canvas) != 0.0f ? decimalFormat.format(Math.abs((f7 - f8) / r4)) : "--";
        String str2 = d.f8064e.getResources().getString(R.string.human_pw_sd_ps) + ": " + decimalFormat.format(f7) + "cm/s";
        f.b bVar3 = this.f8088h;
        canvas.drawText(str2, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + f.f8084t, paint2);
        String str3 = d.f8064e.getResources().getString(R.string.human_pw_sd_ed) + ": " + decimalFormat.format(f8) + "cm/s";
        f.b bVar4 = this.f8088h;
        canvas.drawText(str3, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 2.0f), paint2);
        String str4 = d.f8064e.getResources().getString(R.string.human_pw_sd) + ": " + decimalFormat.format(Math.abs(f7 / f8));
        f.b bVar5 = this.f8088h;
        canvas.drawText(str4, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), paint2);
        String str5 = d.f8064e.getResources().getString(R.string.human_pw_ri) + ": " + decimalFormat.format(Math.abs((f7 - f8) / f7));
        f.b bVar6 = this.f8088h;
        canvas.drawText(str5, bVar6.f8109b + (f.f8085u / 2.0f), bVar6.f8110c + (f.f8084t * 4.0f), paint2);
        String str6 = d.f8064e.getResources().getString(R.string.human_pw_pi) + ": " + str;
        f.b bVar7 = this.f8088h;
        canvas.drawText(str6, bVar7.f8109b + (f.f8085u / 2.0f), bVar7.f8110c + (f.f8084t * 5.0f), paint2);
    }

    public final void Q(Canvas canvas) {
        this.f8087g.setStrokeWidth(1.0f);
        this.f8087g.setColor(-1);
        this.f8087g.setStyle(Paint.Style.STROKE);
        this.f8087g.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        int[] iArrFindPeak = util.findPeak();
        if (this.f8117z != null && iArrFindPeak != null) {
            float width = (canvas.getWidth() - 160) / this.f8117z.length;
            float height = (canvas.getHeight() * 0.7f) + ((canvas.getHeight() * 0.3f) / 2.0f);
            this.f8115x = new f.a(iArrFindPeak[0] * width, height, this.f8086f);
            this.f8116y = new f.a(iArrFindPeak[2] * width, height, this.f8086f);
        }
        if (this.f8115x != null) {
            this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
            if (this.f8091k == this.f8115x) {
                this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
                Path path = new Path();
                path.moveTo(0.0f, this.f8115x.f8105c);
                path.lineTo(canvas.getWidth() - 140, this.f8115x.f8105c);
                canvas.drawPath(path, this.f8087g);
            }
            Path path2 = new Path();
            path2.moveTo(this.f8115x.f8104b, canvas.getHeight() * 0.7f);
            path2.lineTo(this.f8115x.f8104b, canvas.getHeight());
            canvas.drawPath(path2, this.f8087g);
            f.a aVar = this.f8116y;
            if (aVar != null) {
                if (this.f8091k == aVar) {
                    this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
                    Path path3 = new Path();
                    path3.moveTo(0.0f, this.f8116y.f8105c);
                    path3.lineTo(canvas.getWidth() - 140, this.f8116y.f8105c);
                    canvas.drawPath(path3, this.f8087g);
                } else {
                    this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
                }
                Path path4 = new Path();
                path4.moveTo(this.f8116y.f8104b, canvas.getHeight() * 0.7f);
                path4.lineTo(this.f8116y.f8104b, canvas.getHeight());
                canvas.drawPath(path4, this.f8087g);
            }
        }
        if (this.f8117z == null) {
            return;
        }
        float width2 = (canvas.getWidth() - 160) / r2.length;
        float height2 = (canvas.getHeight() * 0.3f) / 128.0f;
        this.f8087g.setColor(d.f8064e.getResources().getColor(R.color.colorGreenDark));
        this.f8087g.setStyle(Paint.Style.STROKE);
        Path path5 = new Path();
        float height3 = canvas.getHeight() * 0.7f;
        path5.moveTo(0.0f, (this.f8117z[0] * height2) + height3);
        int i4 = 1;
        while (true) {
            int[] iArr = this.f8117z;
            if (i4 >= iArr.length) {
                break;
            }
            float f4 = i4 * width2;
            float f5 = (iArr[i4] * height2) + height3;
            float f6 = i4 - 4 > 0 ? (iArr[r15] * height2) + height3 : f5;
            float f7 = i4 + 4 < iArr.length ? (iArr[r7] * height2) + height3 : f5;
            if (Math.abs(f6 - f5) <= 60.0f && Math.abs(f7 - f5) <= 60.0f && f5 > 0.0f) {
                path5.lineTo(f4, f5);
            }
            i4 += 8;
        }
        canvas.drawPath(path5, this.f8087g);
        path5.reset();
        float height4 = (this.f8096p / 4.0f) * canvas.getHeight() * 0.3f;
        path5.moveTo(0.0f, (((this.f8117z[0] * height2) - height4) * 0.58f) + height4 + height3);
        int i5 = 1;
        while (true) {
            int[] iArr2 = this.f8117z;
            if (i5 >= iArr2.length) {
                this.f8087g.setColor(l0.a.f8429c);
                canvas.drawPath(path5, this.f8087g);
                return;
            }
            float f8 = i5 * width2;
            float f9 = (((iArr2[i5] * height2) - height4) * 0.58f) + height4 + height3;
            float f10 = i5 - 4 > 0 ? (((iArr2[r14] * height2) - height4) * 0.58f) + height4 + height3 : f9;
            float f11 = i5 + 4 < iArr2.length ? (((iArr2[r15] * height2) - height4) * 0.58f) + height4 + height3 : f9;
            if (Math.abs(f10 - f9) <= 60.0f && Math.abs(f11 - f9) <= 60.0f) {
                if (f9 > 0.0f) {
                    path5.lineTo(f8, f9);
                }
            }
            i5 += 8;
        }
    }

    public final int[] R(int[] iArr, int i4, int i5) {
        double d4;
        double d5;
        int i6;
        int i7 = i4 / 128;
        if (i5 == 0) {
            d4 = 128;
            d5 = 2.0d;
            i6 = (int) ((d4 * d5) / 4.0d);
        } else {
            if (i5 == 1) {
                d4 = 128;
                d5 = 3.0d;
            } else if (i5 != 3) {
                if (i5 != 4) {
                    i6 = 0;
                }
                d4 = 128;
                d5 = 2.0d;
            } else {
                d4 = 128;
                d5 = 1.0d;
            }
            i6 = (int) ((d4 * d5) / 4.0d);
        }
        if (i6 != 0) {
            int[] iArr2 = new int[i4];
            for (int i8 = 0; i8 < i7; i8++) {
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = (i8 * 128) + i9;
                    iArr2[i10] = iArr[(128 - i6) + i10];
                }
                for (int i11 = 0; i11 < 128 - i6; i11++) {
                    int i12 = (i8 * 128) + i11;
                    iArr2[i12 + i6] = iArr[i12];
                }
            }
            System.arraycopy(iArr2, 0, iArr, 0, iArr.length);
        }
        return iArr;
    }

    public void S(b2.f fVar) {
        if (fVar.f4499a.f8789f.containsKey("pw_data")) {
            this.f8117z = null;
            byte[] bArr = fVar.f4501c;
            int iF = k2.f.d().f() * 128;
            int[] iArr = new int[iF];
            for (int i4 = 0; i4 < iF; i4++) {
                iArr[i4] = bArr[i4] & 255;
            }
            int[] iArrR = new int[iF];
            int i5 = 0;
            while (true) {
                if (i5 >= iF / 128) {
                    break;
                }
                for (int i6 = 0; i6 <= 63; i6++) {
                    int i7 = i5 * 128;
                    iArrR[i7 + i6] = iArr[(i7 + 63) - i6];
                }
                for (int i8 = 64; i8 <= 127; i8++) {
                    int i9 = i5 * 128;
                    iArrR[i9 + i8] = iArr[i9 + (127 - (i8 - 64))];
                }
                i5++;
            }
            int i10 = this.f8096p;
            if (i10 != 2) {
                iArrR = R(iArrR, iF, i10);
            }
            int i11 = i10 * 32;
            int[] iArrGenCurve = util.GenCurve(iArrR, iArrR.length, i11 != 128 ? i11 : 127);
            if (iArrGenCurve == null) {
                this.f8117z = null;
                return;
            }
            int[] iArr2 = new int[iArrGenCurve.length];
            System.arraycopy(iArrGenCurve, 0, iArr2, 0, iArrGenCurve.length);
            this.f8117z = iArr2;
        }
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        f.a aVar;
        if (this.f8113v == null) {
            int[] iArrFindSD = util.findSD();
            if (iArrFindSD == null || this.f8117z == null) {
                this.f8113v = new f.a(canvas.getWidth() / 2.0f, canvas.getHeight() * 0.75f, this.f8086f);
                aVar = new f.a(canvas.getWidth() / 2.0f, canvas.getHeight() * 0.95f, this.f8086f);
            } else {
                float width = (canvas.getWidth() - 160.0f) / this.f8117z.length;
                float height = (canvas.getHeight() * 0.3f) / 128.0f;
                PointF pointF = new PointF(iArrFindSD[0] * width, this.f8117z[r8] * height);
                PointF pointF2 = new PointF(iArrFindSD[1] * width, this.f8117z[r0] * height);
                this.f8113v = new f.a(pointF.x, pointF.y + (canvas.getHeight() * 0.7f), j());
                aVar = new f.a(pointF2.x, pointF2.y + (canvas.getHeight() * 0.7f), j());
            }
            this.f8114w = aVar;
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        f.a aVar2 = this.f8113v;
        if (aVar2 != null) {
            if (aVar2.f8105c < canvas.getHeight() * 0.7f) {
                this.f8113v.f8105c = canvas.getHeight() * 0.7f;
            }
            if (this.f8091k == this.f8113v) {
                paint.setColor(-16711936);
                Path path = new Path();
                path.moveTo(0.0f, this.f8113v.f8105c);
                path.lineTo(canvas.getWidth() - 140, this.f8113v.f8105c);
                canvas.drawPath(path, paint);
            }
            Path path2 = new Path();
            path2.moveTo(this.f8113v.f8104b, canvas.getHeight() * 0.7f);
            path2.lineTo(this.f8113v.f8104b, canvas.getHeight());
            canvas.drawPath(path2, paint);
            f.a aVar3 = this.f8114w;
            if (aVar3 != null) {
                if (aVar3.f8105c < canvas.getHeight() * 0.7f) {
                    this.f8114w.f8105c = canvas.getHeight() * 0.7f;
                }
                if (this.f8091k == this.f8114w) {
                    paint.setColor(-16711936);
                    Path path3 = new Path();
                    path3.moveTo(0.0f, this.f8114w.f8105c);
                    path3.lineTo(canvas.getWidth() - 140, this.f8114w.f8105c);
                    canvas.drawPath(path3, paint);
                } else {
                    paint.setColor(-1);
                }
                Path path4 = new Path();
                path4.moveTo(this.f8114w.f8104b, canvas.getHeight() * 0.7f);
                path4.lineTo(this.f8114w.f8104b, canvas.getHeight());
                canvas.drawPath(path4, paint);
                if (this.f8117z != null) {
                    Q(canvas);
                }
                P(canvas);
            }
        }
        f.a aVar4 = this.f8113v;
        if (aVar4 != null) {
            aVar4.a(canvas, aVar4 == this.f8091k);
        }
        f.a aVar5 = this.f8114w;
        if (aVar5 != null) {
            aVar5.a(canvas, aVar5 == this.f8091k);
        }
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8114w;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8113v;
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
        return (this.f8113v == null || this.f8114w == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        if (this.f8113v == null) {
            this.f8113v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else if (this.f8114w != null) {
            return;
        } else {
            this.f8114w = new f.a(pointF.x, pointF.y, this.f8086f);
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
    public boolean r() {
        return true;
    }
}
