package m2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float[] f8880a = new float[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float[] f8881b = new float[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8882c = false;

    public static byte[] a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i4 = 0; i4 < length; i4 += 4) {
            int i5 = i4 / 2;
            bArr2[i4 + 1] = bArr[i5];
            bArr2[i4 + 2] = bArr[i5];
            bArr2[i4 + 3] = bArr[i5];
            bArr2[i4] = bArr[i5 + 1];
        }
        return bArr2;
    }

    public static Bitmap c(byte[] bArr, int i4, int i5) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmapCreateBitmap;
    }

    public static void d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7, int i8) {
        while (i5 < i6) {
            for (int i9 = i7; i9 < i8; i9++) {
                int i10 = (i9 * i4) + i5;
                if (i10 < 0) {
                    return;
                }
                int i11 = i10 * 4;
                byte b4 = (byte) (bArr2[i10] / 2);
                byte b5 = bArr3[i10];
                if (b4 >= 1) {
                    if (b4 > 63) {
                        b4 = 63;
                    }
                    bArr[i11] = b4;
                    bArr[i11 + 1] = b4;
                    bArr[i11 + 2] = b4;
                    bArr[i11 + 3] = b5;
                } else if (b4 <= -1) {
                    if (b4 < -63) {
                        b4 = -63;
                    }
                    bArr[i11] = b4;
                    bArr[i11 + 1] = b4;
                    bArr[i11 + 2] = b4;
                    bArr[i11 + 3] = b5;
                }
            }
            i5++;
        }
    }

    public static void e() {
        if (f8882c) {
            return;
        }
        f8882c = true;
        for (int i4 = 0; i4 < 256; i4++) {
            double d4 = 0.024543693f * i4;
            f8880a[i4] = (float) Math.cos(d4);
            f8881b[i4] = (float) Math.sin(d4);
        }
    }

    public static byte[] f(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = i4 * 4;
            int i6 = iArr[i4];
            bArr[i5 + 1] = (byte) (i6 >> 24);
            bArr[i5 + 2] = (byte) (i6 >> 16);
            bArr[i5 + 3] = (byte) (i6 >> 8);
            bArr[i5] = (byte) i6;
        }
        return bArr;
    }

    public static byte[] g(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (!f8882c) {
            e();
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i12 = 0; i12 < i6; i12++) {
            for (int i13 = i9; i13 < i10; i13++) {
                for (int i14 = i7; i14 < i8; i14++) {
                    int i15 = (i13 * i4) + i14;
                    if (bArr[i15] != 0) {
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        for (int i16 = i13 - i11; i16 <= i13 + i11; i16++) {
                            for (int i17 = i14 - i11; i17 <= i14 + i11; i17++) {
                                int i18 = bArr[(i16 * i4) + i17];
                                if (i18 < 0) {
                                    i18 += 256;
                                }
                                f5 += f8880a[i18];
                                f4 += f8881b[i18];
                            }
                        }
                        int iAtan2 = ((int) (((((double) ((float) Math.atan2(f4, f5))) + 3.141592653589793d) / ((double) 0.024543693f)) + 0.5d)) - 128;
                        if (iAtan2 > 127) {
                            iAtan2 += v0.u.f12223u;
                        }
                        if (iAtan2 < -128) {
                            iAtan2 += 256;
                        }
                        bArr2[i15] = (byte) iAtan2;
                    }
                }
            }
        }
        return bArr2;
    }
}
