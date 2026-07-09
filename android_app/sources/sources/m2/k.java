package m2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k f8832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f8833f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[][] f8834a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f8835b = j.a().g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f8836c = j.a().f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[][] f8837d = j.a().h();

    public static k d() {
        if (f8832e == null) {
            f8832e = new k();
        }
        return f8832e;
    }

    public Bitmap a(Bitmap bitmap) {
        if (this.f8834a == null) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        byte[] bArrA = t.a(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height * 4;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5 += 4) {
            int[] iArr = this.f8834a[bArrA[i5] & 255];
            bArr[i5] = (byte) iArr[0];
            bArr[i5 + 1] = (byte) iArr[1];
            bArr[i5 + 2] = (byte) iArr[2];
            int i6 = i5 + 3;
            bArr[i6] = bArrA[i6];
        }
        return t.c(bArr, width, height);
    }

    public Bitmap b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        byte[] bArrA = t.a(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height * 4;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5 += 4) {
            int i6 = i5 + 3;
            if (bArrA[i6] != 0) {
                byte b4 = bArrA[i5];
                if (b4 >= 0) {
                    int[] iArr = this.f8835b[b4];
                    bArr[i5] = (byte) iArr[0];
                    bArr[i5 + 1] = (byte) iArr[1];
                    bArr[i5 + 2] = (byte) iArr[2];
                } else {
                    int[] iArr2 = this.f8836c[-b4];
                    bArr[i5] = (byte) iArr2[0];
                    bArr[i5 + 1] = (byte) iArr2[1];
                    bArr[i5 + 2] = (byte) iArr2[2];
                }
                bArr[i6] = bArrA[i6];
            }
        }
        return t.c(bArr, width, height);
    }

    public Bitmap c(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        byte[] bArrA = t.a(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height * 4;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5 += 4) {
            int i6 = i5 + 3;
            if (bArrA[i6] != 0) {
                int[] iArr = this.f8837d[bArrA[i5]];
                bArr[i5] = (byte) iArr[0];
                bArr[i5 + 1] = (byte) iArr[1];
                bArr[i5 + 2] = (byte) iArr[2];
                bArr[i6] = bArrA[i6];
            }
        }
        return t.c(bArr, width, height);
    }

    public void e(int[][] iArr) {
        this.f8834a = iArr;
    }

    public void f(int[][] iArr, int[][] iArr2) {
        this.f8835b = iArr;
        this.f8836c = iArr2;
    }
}
