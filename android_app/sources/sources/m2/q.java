package m2;

import android.graphics.Bitmap;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f8846d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f8847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f8848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f8849c;

    public class a extends q {
        @Override // m2.q
        public void C(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7, float f4, float f5, int i8, float f6) {
        }

        @Override // m2.q
        public Bitmap h() {
            return q.w();
        }

        @Override // m2.q
        public Bitmap l() {
            return new h(0).b();
        }

        @Override // m2.q
        public Bitmap p() {
            return q.x();
        }
    }

    public static Bitmap w() {
        int i4;
        byte[] bArr = new byte[512];
        int i5 = 0;
        while (true) {
            if (i5 >= 64) {
                break;
            }
            int i6 = i5 * 4;
            byte b4 = (byte) (63 - i5);
            bArr[i6 + 0] = b4;
            bArr[i6 + 1] = b4;
            bArr[i6 + 2] = b4;
            bArr[i6 + 3] = -1;
            i5++;
        }
        for (i4 = 64; i4 < 128; i4++) {
            int i7 = i4 * 4;
            byte b5 = (byte) (64 - i4);
            bArr[i7 + 0] = b5;
            bArr[i7 + 1] = b5;
            bArr[i7 + 2] = b5;
            bArr[i7 + 3] = -1;
        }
        return t.c(bArr, 1, 128);
    }

    public static Bitmap x() {
        byte[] bArr = new byte[512];
        for (int i4 = 0; i4 < 128; i4++) {
            int i5 = i4 * 4;
            byte b4 = (byte) ((127 - i4) & 255);
            bArr[i5 + 0] = b4;
            bArr[i5 + 1] = b4;
            bArr[i5 + 2] = b4;
            bArr[i5 + 3] = -1;
        }
        return t.c(bArr, 1, 128);
    }

    public PointF A(PointF pointF) {
        return new PointF(0.0f, 0.0f);
    }

    public PointF B(PointF pointF, float f4) {
        return new PointF(0.0f, 0.0f);
    }

    public abstract void C(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7, float f4, float f5, int i8, float f6);

    public void D(float f4) {
    }

    public void E(float f4) {
    }

    public void F(byte[] bArr) {
    }

    public void G(byte[] bArr) {
    }

    public void H(h hVar) {
    }

    public void I(byte[] bArr) {
    }

    public PointF J(PointF pointF, float f4) {
        return new PointF(0.0f, 0.0f);
    }

    public PointF a(PointF pointF) {
        return new PointF(0.0f, 0.0f);
    }

    public PointF b() {
        return new PointF(0.0f, 0.0f);
    }

    public float c() {
        return 0.0f;
    }

    public float d() {
        return 0.0f;
    }

    public int e() {
        return 0;
    }

    public Bitmap f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public Bitmap h() {
        return this.f8848b;
    }

    public int i() {
        return 0;
    }

    public Bitmap j() {
        return null;
    }

    public int k() {
        return 0;
    }

    public Bitmap l() {
        return this.f8847a;
    }

    public int m() {
        return 0;
    }

    public Bitmap n() {
        return null;
    }

    public int o() {
        return 0;
    }

    public Bitmap p() {
        return this.f8849c;
    }

    public int q() {
        return 0;
    }

    public Bitmap r() {
        return null;
    }

    public int s() {
        return 0;
    }

    public float t() {
        return 0.0f;
    }

    public float u() {
        return 0.0f;
    }

    public float v() {
        return 0.0f;
    }

    public float y() {
        return 0.0f;
    }

    public float z() {
        return 0.0f;
    }
}
