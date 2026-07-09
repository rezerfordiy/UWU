package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.measure.USMarkView;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class f extends d implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static float f8083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static float f8084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static float f8085u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8086f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8090j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f8087g = new Paint();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f8088h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f8089i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f8091k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8092l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8093m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f8094n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8095o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8096p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8097q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8098r = true;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f8099g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f8100h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f8101i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f8102j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f8103k = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f8107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f8108f;

        public a(float f4, float f5, int i4) {
            this.f8104b = f4;
            this.f8105c = f5;
            this.f8106d = i4;
        }

        public void a(Canvas canvas, boolean z3) {
            Bitmap bitmapA = USMarkView.a(this.f8106d, false);
            Bitmap bitmapA2 = USMarkView.a(this.f8106d, true);
            float width = bitmapA.getWidth();
            float height = bitmapA.getHeight();
            Matrix matrix = new Matrix();
            float f4 = f.f8085u;
            matrix.setScale(f4 / width, f4 / height);
            Bitmap bitmapCreateBitmap = z3 ? Bitmap.createBitmap(bitmapA2, 0, 0, (int) width, (int) height, matrix, true) : Bitmap.createBitmap(bitmapA, 0, 0, (int) width, (int) height, matrix, true);
            float f5 = this.f8104b;
            float f6 = f.f8085u;
            canvas.drawBitmap(bitmapCreateBitmap, f5 - (f6 / 2.0f), this.f8105c - (f6 / 2.0f), (Paint) null);
        }

        public a b(PointF pointF) {
            float fAbs = Math.abs(pointF.x - this.f8104b);
            float fAbs2 = Math.abs(pointF.y - this.f8105c);
            if (fAbs >= MyApplication.t() * 4.0f || fAbs2 >= MyApplication.t() * 4.0f) {
                return null;
            }
            return this;
        }
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8112e;

        public b(float f4, float f5, float f6, float f7) {
            this.f8109b = f4;
            this.f8110c = f5;
            this.f8111d = f6;
            this.f8112e = f7;
        }

        public b a(float f4, float f5, int i4) {
            return new b(this.f8109b + f4, this.f8110c + f5, this.f8111d, (i4 * f.f8084t) + 20.0f);
        }

        public boolean b(float f4, float f5) {
            float f6 = this.f8109b;
            if (f4 < f6 || f4 >= f6 + this.f8111d) {
                return false;
            }
            float f7 = this.f8110c;
            return f5 >= f7 && f5 < f7 + this.f8112e;
        }
    }

    static {
        float fU = MyApplication.u() * 14.0f;
        f8083s = fU;
        f8084t = fU + 2.0f;
        f8085u = MyApplication.s() * 20.0f;
    }

    public static void I(float f4) {
        f8083s = f4;
        f8084t = f4 + 2.0f;
    }

    public void A(Bitmap bitmap, Bitmap bitmap2) {
    }

    public void B(int i4) {
        this.f8086f = i4;
    }

    public void C(int i4) {
        this.f8096p = i4;
    }

    public void D(boolean z3) {
        this.f8097q = z3;
    }

    public void E(b bVar, int i4) {
        this.f8088h = bVar;
        this.f8090j = i4;
    }

    public void F(float f4) {
        this.f8093m = f4;
    }

    public void G(float f4, float f5) {
        a aVar = this.f8091k;
        if (aVar != null) {
            aVar.f8104b = f4;
            aVar.f8105c = f5;
        }
    }

    public void H(float f4) {
        this.f8095o = f4;
    }

    public void J(float f4) {
        this.f8094n = f4;
    }

    public void K(boolean z3) {
        this.f8098r = z3;
    }

    public void L(float f4, float f5) {
        a aVar = this.f8091k;
        if (aVar != null) {
            aVar.f8104b = f4;
            aVar.f8105c = f5;
        }
    }

    @Override // i2.d
    public d c(PointF pointF) {
        return null;
    }

    @Override // i2.d
    public boolean e() {
        return true;
    }

    @Override // i2.d
    public int f() {
        return 1;
    }

    public void g(PointF pointF) {
    }

    public int h(float f4, int[][] iArr) {
        if (iArr == null) {
            return -1;
        }
        if (iArr.length == 1) {
            return iArr[0][1];
        }
        int i4 = iArr[0][0];
        if ((f4 < ((float) i4)) || (f4 > ((float) iArr[iArr.length - 1][0]))) {
            return -1;
        }
        float fAbs = Math.abs(i4 - f4);
        int i5 = 0;
        for (int i6 = 1; i6 < iArr.length; i6++) {
            float fAbs2 = Math.abs(iArr[i6][0] - f4);
            if (fAbs2 < fAbs) {
                i5 = i6;
                fAbs = fAbs2;
            }
        }
        return iArr[i5][1];
    }

    public int i() {
        return 1;
    }

    public int j() {
        return this.f8086f;
    }

    public b k() {
        return this.f8088h;
    }

    public a l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.f8092l;
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public boolean z(PointF pointF) {
        b bVar = this.f8088h;
        return bVar != null && bVar.b(pointF.x, pointF.y);
    }
}
