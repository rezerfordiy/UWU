package org.dcm4che3.util;

import java.io.IOException;
import java.io.OutputStream;
import z1.l1;

/* JADX INFO: loaded from: classes.dex */
public class Base64 {
    private static final char[] BASE64 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] INV_BASE64 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, l1.f13562p, l1.f13563q, l1.f13564r, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, l1.f13565s, l1.f13566t, 35, 36, 37, 38, 39, l1.f13567u, l1.f13568v, 42, 43, 44, 45, 46, 47, l1.f13569w, 49, 50, 51};

    public static void decode(char[] cArr, int i4, int i5, OutputStream outputStream) throws IOException {
        char c4;
        char c5;
        while (true) {
            int i6 = i5 - 2;
            if (i6 < 0) {
                return;
            }
            byte[] bArr = INV_BASE64;
            int i7 = i4 + 1;
            int i8 = bArr[cArr[i4]] << 2;
            int i9 = i7 + 1;
            byte b4 = bArr[cArr[i7]];
            outputStream.write((byte) (i8 | (b4 >>> 4)));
            int i10 = i6 - 1;
            if (i6 == 0 || (c4 = cArr[i9]) == '=') {
                return;
            }
            int i11 = i9 + 1;
            byte b5 = bArr[c4];
            outputStream.write((byte) ((b4 << 4) | (b5 >>> 2)));
            int i12 = i10 - 1;
            if (i10 == 0 || (c5 = cArr[i11]) == '=') {
                return;
            }
            outputStream.write((byte) (bArr[c5] | (b5 << 6)));
            i5 = i12;
            i4 = i11 + 1;
        }
    }

    public static void encode(byte[] bArr, int i4, int i5, char[] cArr, int i6) {
        if (i4 < 0 || i5 < 0 || i5 > bArr.length - i4) {
            throw new IndexOutOfBoundsException();
        }
        int i7 = (((i5 * 4) / 3) + 3) & (-4);
        if (i6 < 0 || i7 > cArr.length - i6) {
            throw new IndexOutOfBoundsException();
        }
        int i8 = i5 / 3;
        int i9 = i5 - (i8 * 3);
        while (true) {
            int i10 = i8 - 1;
            if (i8 <= 0) {
                break;
            }
            int i11 = i6 + 1;
            char[] cArr2 = BASE64;
            int i12 = i4 + 1;
            byte b4 = bArr[i4];
            cArr[i6] = cArr2[(b4 >>> 2) & 63];
            int i13 = i11 + 1;
            int i14 = i12 + 1;
            byte b5 = bArr[i12];
            cArr[i11] = cArr2[((b4 & 3) << 4) | ((b5 >>> 4) & 15)];
            int i15 = i13 + 1;
            int i16 = (b5 & 15) << 2;
            int i17 = i14 + 1;
            byte b6 = bArr[i14];
            cArr[i13] = cArr2[i16 | ((b6 >>> 6) & 3)];
            i6 = i15 + 1;
            cArr[i15] = cArr2[b6 & 63];
            i8 = i10;
            i4 = i17;
        }
        if (i9 > 0) {
            if (i9 == 1) {
                int i18 = i6 + 1;
                char[] cArr3 = BASE64;
                byte b7 = bArr[i4];
                cArr[i6] = cArr3[(b7 >>> 2) & 63];
                int i19 = i18 + 1;
                cArr[i18] = cArr3[(b7 & 3) << 4];
                cArr[i19] = '=';
                cArr[i19 + 1] = '=';
                return;
            }
            int i20 = i6 + 1;
            char[] cArr4 = BASE64;
            int i21 = i4 + 1;
            byte b8 = bArr[i4];
            cArr[i6] = cArr4[(b8 >>> 2) & 63];
            int i22 = i20 + 1;
            byte b9 = bArr[i21];
            cArr[i20] = cArr4[((b8 & 3) << 4) | ((b9 >>> 4) & 15)];
            cArr[i22] = cArr4[(b9 & 15) << 2];
            cArr[i22 + 1] = '=';
        }
    }
}
