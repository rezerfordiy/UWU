package m2;

import android.content.Context;
import android.renderscript.RenderScript;

/* JADX INFO: loaded from: classes.dex */
public class e extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f8790n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f8791o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Context f8792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ boolean f8793q = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f8805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f8806m;

    public e(float f4, float f5, float f6, int i4, int i5, int i6, h hVar) {
        double d4;
        this.f8798e = f4;
        this.f8799f = f5;
        this.f8803j = f6;
        this.f8800g = i4;
        this.f8801h = i5;
        double d5 = f6;
        double d6 = 770000.0d / d5;
        this.f8804k = (float) d6;
        this.f8802i = i6;
        this.f8806m = hVar;
        double d7 = d6 * ((double) i6);
        double d8 = f4;
        double d9 = d8 + d7;
        if (f4 < 0.0f) {
            d9 = -f4;
            d4 = d9 - d7;
        } else {
            d4 = d8;
        }
        double d10 = f5;
        double d11 = d10 / 2.0d;
        double dSin = ((d9 * 2.0d) * Math.sin(d11)) / (d9 - (d4 * Math.cos(d11)));
        int iSqrt = (int) (((float) Math.sqrt(((double) s.f8872f) / dSin)) + 0.5f);
        this.f8796c = iSqrt;
        int i7 = (int) ((((double) iSqrt) * dSin) + 0.5d);
        this.f8795b = i7;
        this.f8795b = (i7 / 2) * 2;
        int[] iArrA = hVar.a();
        if (this.f8794a == null) {
            RenderScript renderScriptCreate = RenderScript.create(f8792p);
            n2.y yVar = new n2.y(renderScriptCreate);
            d dVar = new d();
            this.f8794a = dVar;
            dVar.z(renderScriptCreate, yVar);
        }
        this.f8794a.e(this.f8795b, this.f8796c, d8, d10, d5, i4, i5, i6, iArrA);
    }

    public static void f(Context context) {
        f8792p = context.getApplicationContext();
    }

    @Override // m2.b
    public byte[] a(byte[] bArr, float f4, int i4, int i5, int i6, int i7) {
        return this.f8794a.c(bArr, i6, i7, i4, i5, f4, 1, false);
    }

    @Override // m2.b
    public byte[] b(byte[] bArr, float f4, int i4, int i5, int i6, int i7) {
        return this.f8794a.d(bArr, i6, i7, i4, i5, f4, 1);
    }

    @Override // m2.b
    public byte[] c(byte[] bArr, int i4, int i5) {
        byte[] bArrA = this.f8794a.a(bArr);
        if (bArrA == null) {
            return null;
        }
        return bArrA;
    }

    @Override // m2.b
    public void d(float f4, float f5, float f6, int i4, int i5, int i6, h hVar) {
        double d4;
        this.f8798e = f4;
        this.f8799f = f5;
        this.f8803j = f6;
        this.f8800g = i4;
        this.f8801h = i5;
        double d5 = f6;
        double d6 = 770000.0d / d5;
        this.f8804k = (float) d6;
        this.f8802i = i6;
        this.f8806m = hVar;
        double d7 = d6 * ((double) i6);
        double d8 = f4;
        double d9 = d8 + d7;
        if (f4 < 0.0f) {
            d9 = -f4;
            d4 = d9 - d7;
        } else {
            d4 = d8;
        }
        double d10 = f5;
        double d11 = d10 / 2.0d;
        double dSin = ((d9 * 2.0d) * Math.sin(d11)) / (d9 - (d4 * Math.cos(d11)));
        int iSqrt = (int) (((float) Math.sqrt(((double) s.f8872f) / dSin)) + 0.5f);
        this.f8796c = iSqrt;
        int i7 = (int) ((((double) iSqrt) * dSin) + 0.5d);
        this.f8795b = i7;
        this.f8795b = (i7 / 2) * 2;
        this.f8794a.e(this.f8795b, this.f8796c, d8, d10, d5, i4, i5, i6, hVar.a());
    }

    @Override // m2.b
    public void e(h hVar) {
        this.f8806m = hVar;
        this.f8794a.A(hVar.a());
    }

    public void g() {
        this.f8794a.e(this.f8795b, this.f8796c, this.f8798e, this.f8799f, this.f8803j, this.f8800g, this.f8801h, this.f8802i, this.f8806m.a());
    }
}
