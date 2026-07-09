package i2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.sonoptek.pvus_android.MyApplication;
import i2.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends f implements Serializable {
    public f.a A;
    public f.a B;
    public float E;
    public a F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.a f8144x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f.a f8145y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f.a f8146z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Paint f8142v = new Paint();
    public int[] C = null;
    public int[] D = null;

    public interface a {
        void a(float f4);
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
        float f5 = this.E;
        if (f5 > 0.0f) {
            return (float) (((double) f4) * 3.141592653589793d * (((double) f5) / 20.0d) * (((double) f5) / 20.0d) * 60.0d);
        }
        return 0.0f;
    }

    public float O() {
        f.a aVar;
        f.a aVar2 = this.f8143w;
        if (aVar2 == null || (aVar = this.f8144x) == null) {
            return 0.0f;
        }
        float f4 = aVar2.f8104b - aVar.f8104b;
        float f5 = aVar2.f8105c - aVar.f8105c;
        return ((float) Math.sqrt((f4 * f4) + (f5 * f5))) * this.f8093m;
    }

    public float P(Canvas canvas) {
        int[] iArr;
        if (this.A == null || this.B == null || (iArr = this.C) == null) {
            return 0.0f;
        }
        float length = iArr.length / (canvas.getWidth() - 160);
        float height = 128.0f / (canvas.getHeight() * 0.3f);
        int length2 = (int) (this.A.f8104b * length);
        int i4 = (int) (this.B.f8104b * length);
        if (length2 <= i4) {
            i4 = length2;
            length2 = i4;
        }
        int[] iArr2 = this.C;
        if (length2 > iArr2.length) {
            length2 = iArr2.length;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = i4; i5 < length2; i5++) {
            arrayList.add(new PointF(i5, this.C[i5]));
        }
        int i6 = this.f8096p * 32;
        if (i6 == 128) {
            i6 = 127;
        }
        for (int i7 = length2 - 1; i7 >= i4; i7--) {
            arrayList.add(new PointF(i7, i6));
        }
        arrayList.add(new PointF(i4, this.C[i4]));
        return ((((M(arrayList) / this.f8094n) * this.f8095o) / length) / height) / (Math.abs(this.B.f8104b - this.A.f8104b) / this.f8094n);
    }

    public final void Q(Canvas canvas) {
        if (this.f8143w == null || this.f8144x == null) {
            return;
        }
        this.f8142v.setStrokeWidth(2.0f);
        this.f8142v.setColor(-1);
        this.f8142v.setStyle(Paint.Style.STROKE);
        this.f8142v.setAntiAlias(true);
        this.f8142v.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        Path path = new Path();
        f.a aVar = this.f8143w;
        path.moveTo(aVar.f8104b, aVar.f8105c);
        f.a aVar2 = this.f8144x;
        path.lineTo(aVar2.f8104b, aVar2.f8105c);
        canvas.drawPath(path, this.f8142v);
        float fT = MyApplication.t() * 5.0f;
        float f4 = this.f8143w.f8105c;
        f.a aVar3 = this.f8144x;
        float fAtan2 = (float) Math.atan2(f4 - aVar3.f8105c, r1.f8104b - aVar3.f8104b);
        double d4 = fT;
        double d5 = fAtan2;
        double d6 = d5 - 1.5707963267948966d;
        float fCos = (float) (Math.cos(d6) * d4);
        float fSin = (float) (Math.sin(d6) * d4);
        f.a aVar4 = this.f8143w;
        float f5 = aVar4.f8104b - fCos;
        float f6 = aVar4.f8105c - fSin;
        double d7 = d5 + 1.5707963267948966d;
        float fCos2 = (float) (Math.cos(d7) * d4);
        float fSin2 = (float) (Math.sin(d7) * d4);
        f.a aVar5 = this.f8143w;
        float f7 = aVar5.f8104b - fCos2;
        float f8 = aVar5.f8105c - fSin2;
        PointF pointF = new PointF(f5, f6);
        PointF pointF2 = new PointF(f7, f8);
        Path path2 = new Path();
        path2.moveTo(pointF.x, pointF.y);
        path2.lineTo(pointF2.x, pointF2.y);
        float fCos3 = (float) (Math.cos(d6) * d4);
        float fSin3 = (float) (Math.sin(d6) * d4);
        f.a aVar6 = this.f8144x;
        float f9 = aVar6.f8104b - fCos3;
        float f10 = aVar6.f8105c - fSin3;
        float fCos4 = (float) (Math.cos(d7) * d4);
        float fSin4 = (float) (d4 * Math.sin(d7));
        f.a aVar7 = this.f8144x;
        float f11 = aVar7.f8104b - fCos4;
        float f12 = aVar7.f8105c - fSin4;
        PointF pointF3 = new PointF(f9, f10);
        PointF pointF4 = new PointF(f11, f12);
        Path path3 = new Path();
        path3.moveTo(pointF3.x, pointF3.y);
        path3.lineTo(pointF4.x, pointF4.y);
        path3.close();
        this.f8142v.setColor(-1);
        if (this.f8091k == this.f8143w) {
            this.f8142v.setColor(Color.parseColor("#009966"));
        }
        canvas.drawPath(path2, this.f8142v);
        if (this.f8091k == this.f8144x) {
            this.f8142v.setColor(Color.parseColor("#009966"));
        } else {
            this.f8142v.setColor(-1);
        }
        canvas.drawPath(path3, this.f8142v);
        if (this.f8098r) {
            float f13 = (float) (((double) ((-((float) Math.atan2(pointF3.x - pointF4.x, pointF3.y - pointF4.y))) * 180.0f)) / 3.141592653589793d);
            a aVar8 = this.F;
            if (aVar8 != null) {
                aVar8.a(f13);
            }
        }
        this.f8098r = true;
    }

    public final void R(Canvas canvas) {
        float f4;
        this.f8142v.setStyle(Paint.Style.FILL);
        this.f8142v.setColor(-1);
        this.f8142v.setStrokeWidth(2.0f);
        this.f8142v.setTextSize(f.f8083s);
        if (this.f8145y == null || this.f8146z == null) {
            f4 = 0.0f;
        } else {
            float height = (canvas.getHeight() * ((this.f8096p * 0.075f) + 0.7f)) - this.f8145y.f8105c;
            f4 = height != 0.0f ? height * this.f8095o : 0.0f;
            float height2 = (canvas.getHeight() * ((this.f8096p * 0.075f) + 0.7f)) - this.f8146z.f8105c;
            f = height2 != 0.0f ? this.f8095o * height2 : 0.0f;
            if (Math.abs(f) <= Math.abs(f4)) {
                float f5 = f;
                f = f4;
                f4 = f5;
            }
            String str = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_sd_ps", "string", d.f8064e.getPackageName())) + ": " + (Math.round(f * 100.0f) / 100.0f) + "cm/s";
            f.b bVar = this.f8088h;
            canvas.drawText(str, bVar.f8109b + (f.f8085u / 2.0f), bVar.f8110c + f.f8084t, this.f8142v);
            String str2 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_sd_ed", "string", d.f8064e.getPackageName())) + ": " + (Math.round(f4 * 100.0f) / 100.0f) + "cm/s";
            f.b bVar2 = this.f8088h;
            canvas.drawText(str2, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + (f.f8084t * 2.0f), this.f8142v);
            String str3 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_ri", "string", d.f8064e.getPackageName())) + ": " + (Math.round(Math.abs((f - f4) / f) * 100.0f) / 100.0f);
            f.b bVar3 = this.f8088h;
            canvas.drawText(str3, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + (f.f8084t * 6.0f), this.f8142v);
            String str4 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_sd", "string", d.f8064e.getPackageName())) + ": " + (Math.round(Math.abs(f / f4) * 100.0f) / 100.0f);
            f.b bVar4 = this.f8088h;
            canvas.drawText(str4, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 7.0f), this.f8142v);
        }
        if (this.A != null && this.B != null) {
            this.E = O();
            float fP = P(canvas);
            float fN = N(0.58f * fP);
            float fAbs = Math.abs((f - f4) / fP);
            String str5 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_tamax", "string", d.f8064e.getPackageName())) + ": " + (Math.round(fP * 100.0f) / 100.0f) + "cm/s";
            f.b bVar5 = this.f8088h;
            canvas.drawText(str5, bVar5.f8109b + (f.f8085u / 2.0f), bVar5.f8110c + (f.f8084t * 3.0f), this.f8142v);
            String str6 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_tamean", "string", d.f8064e.getPackageName())) + ": " + (Math.round(r8 * 100.0f) / 100.0f) + "cm/s";
            f.b bVar6 = this.f8088h;
            canvas.drawText(str6, bVar6.f8109b + (f.f8085u / 2.0f), bVar6.f8110c + (f.f8084t * 4.0f), this.f8142v);
            String str7 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_pi", "string", d.f8064e.getPackageName())) + ": " + (Math.round(fAbs * 100.0f) / 100.0f);
            f.b bVar7 = this.f8088h;
            canvas.drawText(str7, bVar7.f8109b + (f.f8085u / 2.0f), bVar7.f8110c + (f.f8084t * 5.0f), this.f8142v);
            String str8 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_fl", "string", d.f8064e.getPackageName())) + ": " + (Math.round(fN * 100.0f) / 100.0f) + "ml/min";
            f.b bVar8 = this.f8088h;
            canvas.drawText(str8, bVar8.f8109b + (f.f8085u / 2.0f), bVar8.f8110c + (f.f8084t * 9.0f), this.f8142v);
        }
        if (this.f8143w == null || this.f8144x == null) {
            return;
        }
        String str9 = d.f8064e.getResources().getString(d.f8064e.getResources().getIdentifier("human_pw_diam", "string", d.f8064e.getPackageName())) + ": " + (Math.round(O() * 100.0f) / 100.0f) + "mm";
        f.b bVar9 = this.f8088h;
        canvas.drawText(str9, bVar9.f8109b + (f.f8085u / 2.0f), bVar9.f8110c + (f.f8084t * 8.0f), this.f8142v);
    }

    public final void S(Canvas canvas) {
        this.f8142v.setStrokeWidth(4.0f);
        this.f8142v.setColor(-1);
        this.f8142v.setStyle(Paint.Style.STROKE);
        this.f8142v.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
        f.a aVar = this.f8145y;
        if (aVar != null) {
            if (this.f8091k == aVar) {
                this.f8142v.setColor(-16711936);
                Path path = new Path();
                path.moveTo(0.0f, this.f8145y.f8105c);
                path.lineTo(canvas.getWidth() - 140, this.f8145y.f8105c);
                canvas.drawPath(path, this.f8142v);
            }
            f.a aVar2 = this.f8146z;
            if (aVar2 != null) {
                if (this.f8091k == aVar2) {
                    this.f8142v.setColor(-16711936);
                    Path path2 = new Path();
                    path2.moveTo(0.0f, this.f8146z.f8105c);
                    path2.lineTo(canvas.getWidth() - 140, this.f8146z.f8105c);
                    canvas.drawPath(path2, this.f8142v);
                } else {
                    this.f8142v.setColor(-1);
                }
            }
        }
        f.a aVar3 = this.f8145y;
        if (aVar3 != null) {
            aVar3.a(canvas, aVar3 == this.f8091k);
        }
        f.a aVar4 = this.f8146z;
        if (aVar4 != null) {
            aVar4.a(canvas, aVar4 == this.f8091k);
        }
    }

    public final void T(Canvas canvas) {
        this.f8142v.setStrokeWidth(2.0f);
        this.f8142v.setColor(-1);
        this.f8142v.setStyle(Paint.Style.STROKE);
        this.f8142v.setPathEffect(null);
        if (this.C != null && this.D != null) {
            float width = (canvas.getWidth() - 160) / r2.length;
            float height = (canvas.getHeight() * 0.3f) / 128.0f;
            float height2 = (canvas.getHeight() * 0.7f) + ((canvas.getHeight() * 0.3f) / 2.0f);
            this.A = new f.a(this.D[0] * width, height2, this.f8086f);
            this.B = new f.a(this.D[2] * width, height2, this.f8086f);
            this.f8142v.setColor(Color.parseColor("#009966"));
            this.f8142v.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            float height3 = canvas.getHeight() * 0.7f;
            path.moveTo(0.0f, (this.C[0] * height) + height3);
            int i4 = 1;
            while (true) {
                int[] iArr = this.C;
                if (i4 >= iArr.length) {
                    break;
                }
                float f4 = i4 * width;
                float f5 = (iArr[i4] * height) + height3;
                float f6 = i4 - 4 > 0 ? (iArr[r17] * height) + height3 : f5;
                float f7 = i4 + 4 < iArr.length ? (iArr[r3] * height) + height3 : f5;
                if (Math.abs(f6 - f5) <= 60.0f && Math.abs(f7 - f5) <= 60.0f && f5 > 0.0f) {
                    path.lineTo(f4, f5);
                }
                i4 += 8;
            }
            canvas.drawPath(path, this.f8142v);
            path.reset();
            float height4 = (this.f8096p / 4.0f) * canvas.getHeight() * 0.3f;
            path.moveTo(0.0f, (((this.C[0] * height) - height4) * 0.58f) + height4 + height3);
            int i5 = 1;
            while (true) {
                int[] iArr2 = this.C;
                if (i5 >= iArr2.length) {
                    break;
                }
                float f8 = i5 * width;
                float f9 = (((iArr2[i5] * height) - height4) * 0.58f) + height4 + height3;
                float f10 = i5 - 4 > 0 ? (((iArr2[r14] * height) - height4) * 0.58f) + height4 + height3 : f9;
                float f11 = i5 + 4 < iArr2.length ? (((iArr2[r15] * height) - height4) * 0.58f) + height4 + height3 : f9;
                if (Math.abs(f10 - f9) <= 60.0f && Math.abs(f11 - f9) <= 60.0f && f9 > 0.0f) {
                    path.lineTo(f8, f9);
                }
                i5 += 8;
            }
            this.f8142v.setColor(l0.a.f8429c);
            canvas.drawPath(path, this.f8142v);
        }
        if (this.A != null) {
            this.f8142v.setColor(Color.parseColor("#CCCC66"));
            this.f8142v.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f));
            if (this.f8091k == this.A) {
                this.f8142v.setColor(Color.parseColor("#009966"));
                Path path2 = new Path();
                path2.moveTo(0.0f, this.A.f8105c);
                path2.lineTo(canvas.getWidth() - 140, this.A.f8105c);
                canvas.drawPath(path2, this.f8142v);
            }
            Path path3 = new Path();
            path3.moveTo(this.A.f8104b, canvas.getHeight() * 0.7f);
            path3.lineTo(this.A.f8104b, canvas.getHeight());
            canvas.drawPath(path3, this.f8142v);
            f.a aVar = this.B;
            if (aVar != null) {
                if (this.f8091k == aVar) {
                    this.f8142v.setColor(Color.parseColor("#009966"));
                    Path path4 = new Path();
                    path4.moveTo(0.0f, this.B.f8105c);
                    path4.lineTo(canvas.getWidth() - 140, this.B.f8105c);
                    canvas.drawPath(path4, this.f8142v);
                } else {
                    this.f8142v.setColor(Color.parseColor("#CCCC66"));
                }
                Path path5 = new Path();
                path5.moveTo(this.B.f8104b, canvas.getHeight() * 0.7f);
                path5.lineTo(this.B.f8104b, canvas.getHeight());
                canvas.drawPath(path5, this.f8142v);
            }
        }
    }

    public void U(a aVar) {
        this.F = aVar;
    }

    public void V(int[] iArr) {
        this.C = iArr;
    }

    public void W(int[] iArr) {
        this.D = iArr;
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        super.b(canvas);
        S(canvas);
        T(canvas);
        Q(canvas);
        R(canvas);
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8146z;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8145y;
        if (aVar2 != null) {
            f.a aVarB2 = aVar2.b(pointF);
            this.f8091k = aVarB2;
            if (aVarB2 != null) {
                return this;
            }
        }
        f.a aVar3 = this.f8144x;
        if (aVar3 != null) {
            f.a aVarB3 = aVar3.b(pointF);
            this.f8091k = aVarB3;
            if (aVarB3 != null) {
                return this;
            }
        }
        f.a aVar4 = this.f8143w;
        if (aVar4 != null) {
            f.a aVarB4 = aVar4.b(pointF);
            this.f8091k = aVarB4;
            if (aVarB4 != null) {
                return this;
            }
        }
        f.a aVar5 = this.B;
        if (aVar5 != null) {
            f.a aVarB5 = aVar5.b(pointF);
            this.f8091k = aVarB5;
            if (aVarB5 != null) {
                return this;
            }
        }
        f.a aVar6 = this.A;
        if (aVar6 != null) {
            f.a aVarB6 = aVar6.b(pointF);
            this.f8091k = aVarB6;
            if (aVarB6 != null) {
                return this;
            }
        }
        this.f8091k = null;
        this.f8092l = false;
        return null;
    }

    @Override // i2.f, i2.d
    public boolean e() {
        return true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        super.g(pointF);
    }

    @Override // i2.f
    public int i() {
        return 9;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean t() {
        return true;
    }
}
