package z1;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.e;
import java.util.List;
import org.dcm4che3.imageio.codec.jpeg.JPEG;

/* JADX INFO: loaded from: classes.dex */
public class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int[] f13299a = {1, 1, 1, 1, 0, 0, 1, 0, 0, 2, 1, 0, 3, 1, 0, 4, 2, 1, 5, 2, 1, 6, 2, 1, 7, 2, 1, 8, 3, 2, 8, 3, 2, 9, 4, 2, 10, 4, 2, 12, 5, 2, 12, 5, 2, 13, 6, 3, 14, 6, 3, 15, 7, 3, 15, 7, 3, 16, 7, 4, 17, 8, 4, 19, 9, 4, 20, 9, 4, 21, 10, 5, 21, 10, 5, 22, 10, 5, 23, 11, 5, 25, 12, 6, 25, 12, 6, 26, 12, 6, 27, 12, 6, 28, 13, 7, 29, 14, 7, 31, 15, 7, 32, 15, 7, 33, 16, 8, 33, 16, 8, 34, 17, 8, 35, 17, 8, 37, 18, 9, 38, 18, 9, 39, 19, 9, 40, 19, 9, 42, 20, 10, 43, 21, 10, 44, 22, 11, 44, 22, 11, 45, 22, 11, 46, 23, 11, 48, 24, 12, 49, 24, 12, 50, 25, 12, 51, 25, 12, 52, 26, 13, 53, 27, 13, 55, 28, 14, 56, 28, 14, 57, 29, 14, 58, 30, 14, 60, 31, 15, 61, 31, 15, 62, 32, 15, 63, 32, 15, 65, 33, 16, 66, 34, 16, 67, 35, 17, 68, 35, 17, 69, 36, 17, 70, 37, 17, 72, 38, 18, 73, 38, 18, 74, 39, 19, 75, 40, 19, 77, 41, 19, 78, 41, 19, 79, 42, 20, 80, 43, 20, 81, 44, 21, 82, 44, 21, 84, 45, 21, 85, 46, 21, 86, 47, 22, 88, 48, 22, 90, 49, 23, 91, 49, 23, 92, 50, 24, 93, 51, 24, 95, 52, 24, 96, 53, 24, 97, 54, 25, 98, 54, 25, 99, 55, 26, 101, 56, 26, 103, 58, 27, 104, 58, 27, 105, 59, 27, 106, 60, 27, 108, 61, 28, 109, 61, 28, 110, 62, 29, 112, 63, 29, 114, 65, 30, 115, 66, 30, e.m.f3281r3, 67, 30, e.m.f3291t3, 68, 30, 120, 69, 31, e.m.w3, 70, 31, e.m.x3, 71, 32, e.m.y3, 72, 32, e.m.A3, 73, 33, e.m.B3, 74, 33, 128, 75, 34, 129, 76, 34, 131, 77, 34, 132, 78, 34, 134, 79, 35, 135, 80, 35, 137, 81, 36, 138, 82, 36, 140, 84, 37, 141, 85, 37, 143, 86, 38, 144, 87, 38, 146, 88, 39, 147, 89, 39, 149, 90, 40, 150, 91, 40, 152, 93, 41, 153, 94, 41, 155, 95, 41, 156, 96, 41, 158, 98, 42, 159, 98, 42, 161, 99, 43, 162, 100, 43, 164, 102, 44, 165, 103, 44, 167, 104, 45, 168, 105, 45, 170, 107, 46, 171, 108, 46, 173, 109, 47, 174, 110, 47, 176, 112, 48, 177, 113, 48, 179, 114, 49, 180, 115, 49, 182, e.m.f3286s3, 50, 183, e.m.f3291t3, 50, 185, e.m.u3, 50, 186, 120, 50, 187, e.m.w3, 51, 189, e.m.x3, 51, 191, e.m.z3, 52, 192, e.m.A3, 52, 193, e.m.B3, 53, JPEG.SOF3, 127, 53, JPEG.SOF5, 129, 54, JPEG.SOF6, 130, 54, JPEG.SOF7, 131, 55, 200, 132, 55, JPEG.SOF10, 133, 55, JPEG.SOF11, 134, 55, JPEG.DAC, 135, 56, JPEG.SOF14, 136, 56, JPEG.RST0, 138, 57, JPEG.RST1, 139, 57, JPEG.RST2, 140, 58, JPEG.RST3, 141, 58, JPEG.RST5, 142, 59, JPEG.RST6, 143, 59, JPEG.RST7, 145, 60, JPEG.RST7, 146, 61, JPEG.SOI, 147, 63, JPEG.SOI, 149, 65, JPEG.EOI, 151, 68, JPEG.EOI, 152, 69, JPEG.SOS, 153, 71, JPEG.SOS, 154, 73, JPEG.DQT, 156, 75, JPEG.DQT, 157, 76, JPEG.DNL, 158, 78, JPEG.DNL, 159, 80, JPEG.DRI, 160, 82, JPEG.DRI, 161, 83, JPEG.DHP, 163, 85, JPEG.DHP, 164, 87, JPEG.DHP, 165, 89, JPEG.DHP, 166, 90, JPEG.EXP, 168, 92, JPEG.EXP, 169, 94, JPEG.APP0, 170, 96, JPEG.APP0, 171, 97, JPEG.APP1, 173, 99, JPEG.APP1, 174, 101, JPEG.APP2, 175, 103, JPEG.APP2, 176, 105, JPEG.APP3, 177, 107, JPEG.APP3, 178, 108, JPEG.APP4, 180, 110, JPEG.APP4, 181, 112, JPEG.APP5, 182, 114, JPEG.APP5, 183, e.m.f3281r3, JPEG.APP5, 184, e.m.f3291t3, JPEG.APP5, 185, 120, JPEG.APP6, 187, e.m.x3, JPEG.APP6, 188, e.m.y3, JPEG.APP7, 189, e.m.A3, JPEG.APP7, 190, 127, JPEG.APP8, 192, 129, JPEG.APP8, 192, 130, JPEG.APP9, 193, 131, JPEG.APP9, JPEG.SOF2, 133, JPEG.APP9, JPEG.SOF3, 135, JPEG.APP9, 196, 137, JPEG.APP10, JPEG.SOF5, 139, JPEG.APP10, JPEG.SOF6, 141, JPEG.APP11, 200, 143, JPEG.APP11, JPEG.SOF9, 145, JPEG.APP12, JPEG.SOF10, 147, JPEG.APP12, JPEG.SOF10, 148, JPEG.APP12, JPEG.SOF11, 149, JPEG.APP12, JPEG.DAC, 151, JPEG.APP13, JPEG.SOF13, 153, JPEG.APP13, JPEG.SOF14, 155, JPEG.APP14, JPEG.RST0, 157, JPEG.APP14, JPEG.RST1, 159, JPEG.APP15, JPEG.RST2, 161, JPEG.APP15, JPEG.RST2, 162, 240, JPEG.RST3, 163, 240, JPEG.RST4, 165, 240, JPEG.RST5, 167, 240, JPEG.RST6, 168, 241, JPEG.RST7, 169, 241, JPEG.SOI, 171, 242, JPEG.EOI, 173, 242, JPEG.SOS, 175, 243, JPEG.DQT, 177, 243, JPEG.DQT, 178, 243, JPEG.DNL, 179, 243, JPEG.DRI, 181, 244, JPEG.DHP, 183, 244, JPEG.DHP, 184, 244, JPEG.EXP, 185, 244, JPEG.APP0, 187, 245, JPEG.APP2, 189, 245, JPEG.APP2, 190, 246, JPEG.APP3, 191, 246, JPEG.APP4, 193, JPEG.SOF55, JPEG.APP5, 196, JPEG.SOF55, JPEG.APP5, JPEG.SOF5, JPEG.SOF55, JPEG.APP6, JPEG.SOF6, JPEG.SOF55, JPEG.APP7, 200, JPEG.LSE, JPEG.APP8, JPEG.SOF10, JPEG.LSE, JPEG.APP8, JPEG.SOF11, JPEG.LSE, JPEG.APP8, JPEG.SOF11};

    public static void a(byte[] bArr, List<Byte> list) {
        for (byte b4 : bArr) {
            list.add(Byte.valueOf(b4));
        }
    }

    public static byte[] b(List<Byte> list) {
        byte[] bArr = new byte[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bArr[i4] = list.get(i4).byteValue();
        }
        return bArr;
    }

    public static byte[] c(List<Byte> list, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = list.get(i5).byteValue();
        }
        return bArr;
    }

    public static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i4 = 32768; i4 < 40960; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static Bitmap e(byte[] bArr, int i4) {
        int i5;
        int i6;
        int length = bArr.length / 128;
        int[] iArr = new int[length * 128];
        int i7 = (i4 * 32) - 1;
        int i8 = 0;
        while (true) {
            i5 = length - 5;
            i6 = 3;
            if (i8 >= i5) {
                break;
            }
            int i9 = 0;
            while (i9 < 128) {
                int i10 = (i8 * 128) + i9;
                int i11 = ((((((bArr[i10] & 255) * 21) + ((bArr[i10 + 128] & 255) * 63)) + ((bArr[i10 + 256] & 255) * 84)) + ((bArr[i10 + 384] & 255) * 63)) + ((bArr[i10 + 512] & 255) * 21)) / 256;
                int[] iArr2 = f13299a;
                int i12 = i11 * 3;
                iArr[((127 - (i9 > i7 ? i9 - i7 : (i9 + 127) - i7)) * length) + i8] = (-16777216) | ((iArr2[i12] << 16) + (iArr2[i12 + 1] << 8) + iArr2[i12 + 2]);
                i9++;
            }
            i8++;
        }
        int i13 = 127 - i7;
        if (i13 == 64) {
            i13 = 128;
        }
        int i14 = i13 != 0 ? i13 : 64;
        int i15 = -1;
        int i16 = i14 - 1;
        if (i16 != 127) {
            int i17 = 0;
            while (i17 < i5) {
                int i18 = i15;
                while (i18 < i6) {
                    int i19 = i16 + i18;
                    int i20 = (i19 * length) + i17;
                    int i21 = ((i19 - 5) * length) + i17;
                    int i22 = ((i19 + 5) * length) + i17;
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    int i23 = 0;
                    while (i23 < i6) {
                        iArr3[i23] = iArr[i21 + i23];
                        int i24 = iArr[i22 + i23];
                        iArr4[i23] = i24;
                        int i25 = iArr3[i23];
                        iArr[i20 + i23] = (((((i25 >> 16) & 255) + ((i24 >> 16) & 255)) / 2) << 16) | (((((i25 >> 24) & 255) + ((i24 >> 24) & 255)) / 2) << 24) | (((((i25 >> 8) & 255) + ((i24 >> 8) & 255)) / 2) << 8) | (((i25 & 255) + (i24 & 255)) / 2);
                        i23++;
                        i16 = i16;
                        i5 = i5;
                        i22 = i22;
                        i21 = i21;
                        i6 = 3;
                    }
                    i18++;
                    i6 = 3;
                }
                i17++;
                i15 = -1;
                i6 = 3;
            }
        }
        return Bitmap.createBitmap(iArr, length, 128, Bitmap.Config.ARGB_8888);
    }

    public static byte[] f(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            bArr[i4] = (byte) iArr[i4];
        }
        return bArr;
    }
}
