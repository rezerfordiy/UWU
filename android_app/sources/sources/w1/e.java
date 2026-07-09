package w1;

import android.graphics.Bitmap;
import java.lang.reflect.Array;
import v0.z1;
import z1.l1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[][][] f12530b = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 256, 256);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12531c;

    public e() {
        for (int i4 = 0; i4 < 4; i4++) {
            for (int i5 = 0; i5 < 256; i5++) {
                for (int i6 = 0; i6 < 256; i6++) {
                    float fExp = (float) (Math.exp((-0.65f) / (i4 + 1.5f)) * ((double) Math.min(1.0f, 10.0f / (Math.abs(i5 - i6) + 1))));
                    int i7 = (int) ((i5 * fExp) + (i6 * (1.0f - fExp)));
                    if (i7 < 0) {
                        this.f12530b[i4][i5][i6] = 0;
                    } else if (i7 > 255) {
                        this.f12530b[i4][i5][i6] = -1;
                    } else {
                        this.f12530b[i4][i5][i6] = (byte) i7;
                    }
                }
            }
        }
    }

    public Bitmap a(Bitmap bitmap, int i4) {
        if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException("Invalid image format");
        }
        if (this.f12529a == null || i4 < 0 || i4 > 3) {
            this.f12529a = bitmap.copy(bitmap.getConfig(), true);
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            for (int i5 = 0; i5 < height; i5++) {
                for (int i6 = 0; i6 < width; i6++) {
                    byte b4 = this.f12530b[i4][(byte) (this.f12529a.getPixel(i6, i5) & 255)][(byte) (bitmap.getPixel(i6, i5) & 255)];
                    this.f12529a.setPixel(i6, i5, b4 | (b4 << l1.f13562p) | z1.f12256t | (b4 << 8));
                }
            }
        }
        return this.f12529a;
    }

    public byte[] b(byte[] bArr, int i4) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = this.f12531c;
        if (bArr2 == null || bArr2.length != bArr.length) {
            this.f12531c = new byte[bArr.length];
            return null;
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        int length = bArr.length / 512;
        for (int i5 = 0; i5 < 512; i5++) {
            for (int i6 = 0; i6 < length; i6++) {
                byte[] bArr3 = this.f12531c;
                int i7 = (i5 * length) + i6;
                bArr3[i7] = this.f12530b[i4][bArr3[i7] & 255][bArr[i7] & 255];
            }
        }
        return this.f12531c;
    }

    public void c() {
        this.f12529a = null;
        this.f12531c = null;
    }
}
