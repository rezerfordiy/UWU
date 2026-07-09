package m2;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    public static Bitmap A;
    public static Bitmap B;
    public static final /* synthetic */ boolean C = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f8851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f8852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f8853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f8859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f8862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f8863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f8865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f8866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PointF f8867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f8868w = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f8869x = Math.sin(0.0d);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f8870y = Math.cos(0.0d);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f8871z = Math.tan(0.0d);

    public r(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7, float f4, float f5, int i8, float f6) {
        this.f8850e = str;
        this.f8851f = bArr;
        this.f8852g = bArr2;
        this.f8853h = bArr3;
        this.f8854i = i4;
        this.f8855j = i5;
        this.f8856k = i6;
        this.f8857l = i7;
        this.f8858m = f4;
        this.f8859n = f5;
        this.f8860o = i8;
        this.f8861p = f6;
        double dCos = ((double) f4) * (1.0d - Math.cos(((double) f5) / 2.0d));
        float f7 = this.f8861p;
        float f8 = this.f8860o;
        double dCos2 = dCos + ((double) (f7 * f8));
        float f9 = this.f8858m;
        if (f9 < 0.0f) {
            double d4 = f7 * f8;
            dCos2 = d4 + ((((double) (-f9)) - d4) * (1.0d - Math.cos(((double) this.f8859n) / 2.0d)));
        }
        this.f8866u = (float) (dCos2 / ((double) this.f8855j));
        PointF pointF = new PointF(0.0f, 0.0f);
        this.f8867v = pointF;
        pointF.x = (this.f8854i - 1) / 2.0f;
        float f10 = -f4;
        double dCos3 = ((double) f10) * Math.cos(f5 / 2.0f);
        float f11 = this.f8866u;
        pointF.y = (float) (dCos3 / ((double) f11));
        if (this.f8858m < 0.0f) {
            this.f8867v.y = f10 / f11;
        }
    }

    @Override // m2.q
    public PointF A(PointF pointF) {
        PointF pointFL = L(pointF);
        float f4 = pointFL.x;
        PointF pointF2 = this.f8867v;
        float f5 = f4 - pointF2.x;
        float f6 = this.f8866u;
        double d4 = f5 * f6;
        double d5 = (pointFL.y - pointF2.y) * f6;
        double dSqrt = Math.sqrt((d4 * d4) + (d5 * d5));
        double dAtan2 = Math.atan2(d5, d4);
        float f7 = this.f8858m;
        if (f7 < 0.0f) {
            dSqrt = -dSqrt;
            dAtan2 = -dAtan2;
        }
        double d6 = (dSqrt - ((double) f7)) / ((double) this.f8861p);
        float f8 = this.f8859n;
        double d7 = ((((double) f8) / 2.0d) + (1.5707963267948966d - dAtan2)) / ((double) (f8 / (this.f8856k - 1)));
        PointF pointF3 = new PointF();
        pointF3.x = (float) d7;
        pointF3.y = (float) d6;
        return pointF3;
    }

    @Override // m2.q
    public PointF B(PointF pointF, float f4) {
        PointF pointFL = L(pointF);
        double d4 = (((double) f4) / 180.0d) * 3.141592653589793d;
        this.f8869x = Math.sin(d4);
        this.f8870y = Math.cos(d4);
        this.f8871z = Math.tan(d4);
        PointF pointF2 = new PointF();
        float f5 = this.f8858m;
        if (f5 > 99999.0d) {
            double dCos = ((double) pointFL.y) / Math.cos(d4);
            pointF2.x = (float) (((double) pointFL.x) + (((double) pointFL.y) * Math.tan(d4)));
            pointF2.y = (float) dCos;
        } else if (f5 < 0.0f) {
            float f6 = pointFL.x;
            float f7 = this.f8865t;
            pointFL.y /= f7;
            pointFL.x = (float) (((double) (f6 / f7)) - ((((double) ((this.f8863r / this.f8864s) * this.f8855j)) - ((double) this.f8854i)) / 2.0d));
            double d5 = ((double) (-f5)) / ((double) this.f8866u);
            double dSin = Math.sin(d4) * d5;
            float f8 = pointFL.x;
            PointF pointF3 = this.f8867v;
            float f9 = pointF3.x;
            float f10 = (f8 - f9) * (f8 - f9);
            float f11 = pointFL.y;
            float f12 = pointF3.y;
            double dSqrt = Math.sqrt(f10 + ((f11 - f12) * (f11 - f12)));
            double dAcos = d4 > 0.0d ? (1.5707963267948966d - d4) - Math.acos(dSin / dSqrt) : -((1.5707963267948966d - (-d4)) - Math.acos((-dSin) / dSqrt));
            float f13 = pointFL.x;
            PointF pointF4 = this.f8867v;
            pointF2.x = f13 - pointF4.x;
            pointF2.y = pointFL.y - pointF4.y;
            PointF pointF5 = new PointF();
            pointF5.x = (float) ((((double) pointF2.x) * Math.cos(dAcos)) - (((double) pointF2.y) * Math.sin(dAcos)));
            pointF5.y = (float) ((((double) pointF2.x) * Math.sin(dAcos)) + (((double) pointF2.y) * Math.cos(dAcos)));
            PointF pointF6 = new PointF();
            double d6 = (((double) pointF5.x) * d5) / dSqrt;
            PointF pointF7 = this.f8867v;
            float f14 = (float) (d6 + ((double) pointF7.x));
            pointF6.x = f14;
            float f15 = (float) (((((double) pointF5.y) * d5) / dSqrt) + ((double) pointF7.y));
            pointF6.y = f15;
            float f16 = pointFL.x - f14;
            pointF2.x = f16;
            float f17 = pointFL.y - f15;
            pointF2.y = f17;
            double d7 = this.f8870y;
            double d8 = this.f8869x;
            pointF5.x = (float) (((((double) f16) * d7) - (((double) f17) * (-d8))) + ((double) pointF6.x));
            pointF5.y = (float) ((((double) pointF2.x) * (-d8)) + (((double) f17) * d7) + ((double) pointF6.y));
            pointF2 = pointF5;
        } else {
            double d9 = ((double) f5) / ((double) this.f8866u);
            double dSin2 = Math.sin(d4) * d9;
            float f18 = pointFL.x;
            PointF pointF8 = this.f8867v;
            float f19 = pointF8.x;
            float f20 = (f18 - f19) * (f18 - f19);
            float f21 = pointFL.y;
            float f22 = pointF8.y;
            double dSqrt2 = Math.sqrt(f20 + ((f21 - f22) * (f21 - f22)));
            double dAsin = d4 >= 0.0d ? d4 - Math.asin(dSin2 / dSqrt2) : d4 + Math.asin((-dSin2) / dSqrt2);
            float f23 = pointFL.x;
            PointF pointF9 = this.f8867v;
            pointF2.x = f23 - pointF9.x;
            pointF2.y = pointFL.y - pointF9.y;
            PointF pointF10 = new PointF();
            double d10 = -dAsin;
            pointF10.x = (float) ((((double) pointF2.x) * Math.cos(d10)) - (((double) pointF2.y) * Math.sin(d10)));
            pointF10.y = (float) ((((double) pointF2.x) * Math.sin(d10)) + (((double) pointF2.y) * Math.cos(d10)));
            PointF pointF11 = new PointF();
            double d11 = (((double) pointF10.x) * d9) / dSqrt2;
            PointF pointF12 = this.f8867v;
            float f24 = (float) (d11 + ((double) pointF12.x));
            pointF11.x = f24;
            float f25 = (float) (((((double) pointF10.y) * d9) / dSqrt2) + ((double) pointF12.y));
            pointF11.y = f25;
            float f26 = pointFL.x - f24;
            pointF2.x = f26;
            float f27 = pointFL.y - f25;
            pointF2.y = f27;
            double d12 = this.f8870y;
            double d13 = this.f8869x;
            pointF10.x = (float) (((((double) f26) * d12) - (((double) f27) * (-d13))) + ((double) pointF11.x));
            pointF10.y = (float) ((((double) pointF2.x) * (-d13)) + (((double) f27) * d12) + ((double) pointF11.y));
            pointF2 = pointF10;
        }
        return A(M(pointF2));
    }

    @Override // m2.q
    public void C(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7, float f4, float f5, int i8, float f6) {
        this.f8850e = str;
        this.f8851f = bArr;
        this.f8852g = bArr2;
        this.f8853h = bArr3;
        this.f8854i = i4;
        this.f8855j = i5;
        this.f8856k = i6;
        this.f8857l = i7;
        this.f8858m = f4;
        this.f8859n = f5;
        this.f8860o = i8;
        this.f8861p = f6;
        double dCos = ((double) f4) * (1.0d - Math.cos(((double) f5) / 2.0d));
        float f7 = this.f8861p;
        float f8 = this.f8860o;
        double dCos2 = dCos + ((double) (f7 * f8));
        float f9 = this.f8858m;
        if (f9 < 0.0f) {
            double d4 = f7 * f8;
            dCos2 = d4 + ((((double) (-f9)) - d4) * (1.0d - Math.cos(((double) this.f8859n) / 2.0d)));
        }
        this.f8866u = (float) (dCos2 / ((double) this.f8855j));
        PointF pointF = new PointF(0.0f, 0.0f);
        this.f8867v = pointF;
        pointF.x = (this.f8854i - 1) / 2.0f;
        float f10 = -f4;
        double dCos3 = ((double) f10) * Math.cos(f5 / 2.0f);
        float f11 = this.f8866u;
        pointF.y = (float) (dCos3 / ((double) f11));
        if (this.f8858m < 0.0f) {
            this.f8867v.y = f10 / f11;
        }
    }

    @Override // m2.q
    public void D(float f4) {
        this.f8864s = f4;
        this.f8865t = f4 / this.f8855j;
    }

    @Override // m2.q
    public void E(float f4) {
        this.f8863r = f4;
    }

    @Override // m2.q
    public void F(byte[] bArr) {
        this.f8852g = bArr;
    }

    @Override // m2.q
    public void G(byte[] bArr) {
        this.f8853h = bArr;
    }

    @Override // m2.q
    public void H(h hVar) {
        h hVar2 = this.f8862q;
        if (hVar2 == null || hVar2 != hVar) {
            this.f8862q = hVar;
            this.f8847a = hVar.b();
        }
    }

    @Override // m2.q
    public void I(byte[] bArr) {
        this.f8851f = bArr;
    }

    @Override // m2.q
    public PointF J(PointF pointF, float f4) {
        PointF pointFA = a(pointF);
        double d4 = (((double) f4) / 180.0d) * 3.141592653589793d;
        pointF.y = 0.0f;
        PointF pointFA2 = a(pointF);
        double d5 = pointFA.x - pointFA2.x;
        double d6 = pointFA.y - pointFA2.y;
        double dCos = (Math.cos(d4) * d5) - (Math.sin(d4) * d6);
        double dSin = (d5 * Math.sin(d4)) + (d6 * Math.cos(d4));
        pointFA.x = (float) (((double) pointFA2.x) + dCos);
        pointFA.y = (float) (((double) pointFA2.y) + dSin);
        return pointFA;
    }

    public byte[] K(byte[] bArr, int i4, int i5, int i6) {
        if (i5 == i6) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int i7 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i6 * i4 * 4];
        if (i5 > i6) {
            int i8 = (i5 - i6) / 2;
            while (i7 < i4) {
                try {
                    System.arraycopy(bArr2, (i8 * 4) + (i7 * i5 * 4), bArr3, i7 * i6 * 4, i6 * 4);
                } catch (Exception unused) {
                }
                i7++;
            }
        } else {
            int i9 = (i6 - i5) / 2;
            while (i7 < i4) {
                try {
                    System.arraycopy(bArr2, i7 * i5 * 4, bArr3, (i9 * 4) + (i7 * i6 * 4), i5 * 4);
                } catch (Exception unused2) {
                }
                i7++;
            }
        }
        return bArr3;
    }

    public PointF L(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f4 = pointF2.x;
        float f5 = this.f8865t;
        pointF2.y = (float) (((double) (pointF2.y / f5)) - 0.5d);
        pointF2.x = (float) (((double) ((float) (((double) (f4 / f5)) - 0.5d))) - ((((double) ((this.f8863r / this.f8864s) * this.f8855j)) - ((double) this.f8854i)) / 2.0d));
        return pointF2;
    }

    public PointF M(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x + 0.5f, pointF.y + 0.5f);
        float f4 = (float) (((double) pointF2.x) + ((((double) ((this.f8863r / this.f8864s) * this.f8855j)) - ((double) this.f8854i)) / 2.0d));
        float f5 = this.f8865t;
        pointF2.x = f4 * f5;
        pointF2.y *= f5;
        return pointF2;
    }

    public float N() {
        return this.f8866u / this.f8865t;
    }

    public Bitmap O(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmapCreateBitmap;
    }

    @Override // m2.q
    public PointF a(PointF pointF) {
        double d4 = pointF.x;
        double d5 = ((double) pointF.y) * ((double) this.f8861p);
        float f4 = this.f8858m;
        double d6 = d5 + ((double) f4);
        if (f4 < 0.0f) {
            d6 = -d6;
        }
        double d7 = this.f8859n;
        int i4 = this.f8856k;
        double d8 = (d7 / ((double) (i4 - 1))) * (d4 - (((double) (i4 - 1)) / 2.0d));
        double dSin = Math.sin(d8) * d6;
        double dCos = d6 * Math.cos(d8);
        PointF pointF2 = new PointF();
        float f5 = this.f8866u;
        PointF pointF3 = this.f8867v;
        pointF2.x = (float) ((dSin / ((double) f5)) + ((double) pointF3.x));
        pointF2.y = (float) ((dCos / ((double) f5)) + ((double) pointF3.y));
        if (this.f8858m < 0.0f) {
            pointF2.y = (float) (((-dCos) / ((double) f5)) + ((double) pointF3.y));
        }
        return M(pointF2);
    }

    @Override // m2.q
    public PointF b() {
        PointF pointF = new PointF();
        pointF.x = (float) (((double) this.f8863r) / 2.0d);
        pointF.y = this.f8867v.y * this.f8865t;
        return pointF;
    }

    @Override // m2.q
    public float c() {
        return this.f8864s;
    }

    @Override // m2.q
    public float d() {
        return this.f8863r;
    }

    @Override // m2.q
    public int e() {
        return this.f8855j;
    }

    @Override // m2.q
    public Bitmap f() {
        byte[] bArr = this.f8851f;
        if (bArr == null) {
            return null;
        }
        int i4 = this.f8855j;
        int i5 = this.f8854i;
        return O(K(bArr, i4, i5, i5), this.f8854i, this.f8855j);
    }

    @Override // m2.q
    public Bitmap h() {
        Bitmap bitmap = B;
        return bitmap == null ? q.f8846d.h() : bitmap;
    }

    @Override // m2.q
    public int i() {
        return this.f8855j;
    }

    @Override // m2.q
    public Bitmap j() {
        byte[] bArr = this.f8852g;
        if (bArr == null || bArr.length < 1) {
            return null;
        }
        int length = bArr.length;
        int i4 = this.f8855j;
        int i5 = (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
        return O(K(bArr, i4, (length / i4) / 4, i5), i5, this.f8855j);
    }

    @Override // m2.q
    public int k() {
        return (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
    }

    @Override // m2.q
    public Bitmap l() {
        return this.f8862q == null ? q.f8846d.l() : this.f8847a;
    }

    @Override // m2.q
    public int m() {
        return this.f8855j;
    }

    @Override // m2.q
    public Bitmap n() {
        byte[] bArr = this.f8851f;
        if (bArr == null) {
            return null;
        }
        int i4 = (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
        return O(K(bArr, this.f8855j, this.f8854i, i4), i4, this.f8855j);
    }

    @Override // m2.q
    public int o() {
        return (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
    }

    @Override // m2.q
    public Bitmap p() {
        Bitmap bitmap = A;
        return bitmap == null ? q.f8846d.p() : bitmap;
    }

    @Override // m2.q
    public int q() {
        return this.f8855j;
    }

    @Override // m2.q
    public Bitmap r() {
        byte[] bArr = this.f8853h;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i4 = this.f8855j;
        int i5 = (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
        return O(K(bArr, i4, (length / i4) / 4, i5), i5, this.f8855j);
    }

    @Override // m2.q
    public int s() {
        return (((int) (((double) (this.f8863r / this.f8865t)) + 0.5d)) / 2) * 2;
    }

    @Override // m2.q
    public float t() {
        return this.f8865t;
    }

    @Override // m2.q
    public float u() {
        return this.f8861p;
    }

    @Override // m2.q
    public float v() {
        return this.f8859n;
    }

    @Override // m2.q
    public float y() {
        return N();
    }

    @Override // m2.q
    public float z() {
        return u();
    }
}
