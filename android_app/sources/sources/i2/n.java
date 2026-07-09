package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.sonoHealth.microVUE.R;
import i2.f;

/* JADX INFO: loaded from: classes.dex */
public class n extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f.a f8156v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.a f8157w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.a f8158x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f.a f8159y = null;

    @Override // i2.f
    public void A(Bitmap bitmap, Bitmap bitmap2) {
        super.A(bitmap, bitmap2);
    }

    public final void M(Canvas canvas) {
        if (this.f8156v == null || this.f8157w == null || this.f8158x == null || this.f8159y == null) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(d.f8064e.getResources().getColor(R.color.colorYellowDark));
        paint.setStrokeWidth(2.0f);
        paint.setTextSize(f.f8083s);
        float fSqrt = (float) (Math.sqrt(((float) Math.pow(this.f8156v.f8105c - this.f8157w.f8105c, 2.0d)) + ((float) Math.pow(this.f8156v.f8104b - this.f8157w.f8104b, 2.0d))) * ((double) this.f8093m));
        float fSqrt2 = (float) (Math.sqrt(((float) Math.pow(this.f8158x.f8105c - this.f8159y.f8105c, 2.0d)) + ((float) Math.pow(this.f8158x.f8104b - this.f8159y.f8104b, 2.0d))) * ((double) this.f8093m));
        if (fSqrt <= fSqrt2) {
            fSqrt2 = fSqrt;
            fSqrt = fSqrt2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LVIDd:");
        sb.append(((int) Math.ceil(fSqrt)) + "mm");
        String string = sb.toString();
        f.b bVar = this.f8088h;
        canvas.drawText(string, bVar.f8109b + (f.f8085u / 2.0f), bVar.f8110c + f.f8084t, paint);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LVIDs:");
        sb2.append(((int) Math.ceil(fSqrt2)) + "mm");
        String string2 = sb2.toString();
        f.b bVar2 = this.f8088h;
        canvas.drawText(string2, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + (f.f8084t * 2.0f), paint);
        float f4 = fSqrt / 10.0f;
        float f5 = fSqrt2 / 10.0f;
        float f6 = (((f4 * 7.0f) * f4) * f4) / (f4 + 2.4f);
        float f7 = f6 - ((((7.0f * f5) * f5) * f5) / (f5 + 2.4f));
        int i4 = (int) ((f7 / f6) * 100.0f);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SV:");
        sb3.append(((int) Math.ceil(f7)) + "ml");
        String string3 = sb3.toString();
        f.b bVar3 = this.f8088h;
        canvas.drawText(string3, bVar3.f8109b + (f.f8085u / 2.0f), bVar3.f8110c + (f.f8084t * 3.0f), paint);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("EF:");
        sb4.append(s0.a.f11071l + i4);
        sb4.append("%");
        String string4 = sb4.toString();
        f.b bVar4 = this.f8088h;
        canvas.drawText(string4, bVar4.f8109b + (f.f8085u / 2.0f), bVar4.f8110c + (f.f8084t * 4.0f), paint);
    }

    @Override // i2.d
    public void a() {
        this.f8091k = null;
        this.f8092l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0106, code lost:
    
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0108, code lost:
    
        r2 = r2.f8104b;
     */
    @Override // i2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.n.b(android.graphics.Canvas):void");
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f.a aVar = this.f8159y;
        if (aVar != null) {
            f.a aVarB = aVar.b(pointF);
            this.f8091k = aVarB;
            if (aVarB != null) {
                return this;
            }
        }
        f.a aVar2 = this.f8158x;
        if (aVar2 != null) {
            f.a aVarB2 = aVar2.b(pointF);
            this.f8091k = aVarB2;
            if (aVarB2 != null) {
                return this;
            }
        }
        f.a aVar3 = this.f8157w;
        if (aVar3 != null) {
            f.a aVarB3 = aVar3.b(pointF);
            this.f8091k = aVarB3;
            if (aVarB3 != null) {
                return this;
            }
        }
        f.a aVar4 = this.f8156v;
        if (aVar4 != null) {
            f.a aVarB4 = aVar4.b(pointF);
            this.f8091k = aVarB4;
            if (aVarB4 != null) {
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
        return (this.f8156v == null || this.f8157w == null || this.f8158x == null || this.f8159y == null) ? false : true;
    }

    @Override // i2.f
    public void g(PointF pointF) {
        f.a aVar;
        if (this.f8156v == null) {
            this.f8156v = new f.a(pointF.x, pointF.y, this.f8086f);
        } else {
            if (this.f8157w == null) {
                this.f8157w = new f.a(pointF.x, pointF.y, this.f8086f);
                aVar = this.f8156v;
            } else if (this.f8158x == null) {
                this.f8158x = new f.a(pointF.x, pointF.y, this.f8086f - 1);
            } else {
                if (this.f8159y != null) {
                    return;
                }
                this.f8159y = new f.a(pointF.x, pointF.y, this.f8086f - 1);
                aVar = this.f8158x;
            }
            aVar.f8104b = pointF.x;
        }
        this.f8091k = null;
    }

    @Override // i2.f
    public int i() {
        return 4;
    }

    @Override // i2.f
    public f.a l() {
        return this.f8091k;
    }

    @Override // i2.f
    public boolean o() {
        return true;
    }
}
