package org.dcm4che3.util;

/* JADX INFO: loaded from: classes.dex */
public class ByteUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final float[] EMPTY_FLOATS = new float[0];
    public static final double[] EMPTY_DOUBLES = new double[0];

    public static double bytesToDouble(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToDoubleBE(bArr, i4) : bytesToDoubleLE(bArr, i4);
    }

    public static double bytesToDoubleBE(byte[] bArr, int i4) {
        return Double.longBitsToDouble(bytesToLongBE(bArr, i4));
    }

    public static double bytesToDoubleLE(byte[] bArr, int i4) {
        return Double.longBitsToDouble(bytesToLongLE(bArr, i4));
    }

    public static float bytesToFloat(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToFloatBE(bArr, i4) : bytesToFloatLE(bArr, i4);
    }

    public static float bytesToFloatBE(byte[] bArr, int i4) {
        return Float.intBitsToFloat(bytesToIntBE(bArr, i4));
    }

    public static float bytesToFloatLE(byte[] bArr, int i4) {
        return Float.intBitsToFloat(bytesToIntLE(bArr, i4));
    }

    public static int bytesToInt(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToIntBE(bArr, i4) : bytesToIntLE(bArr, i4);
    }

    public static int bytesToIntBE(byte[] bArr, int i4) {
        return (bArr[i4] << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    public static int bytesToIntLE(byte[] bArr, int i4) {
        return (bArr[i4 + 3] << 24) + ((bArr[i4 + 2] & 255) << 16) + ((bArr[i4 + 1] & 255) << 8) + (bArr[i4] & 255);
    }

    public static long bytesToLong(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToLongBE(bArr, i4) : bytesToLongLE(bArr, i4);
    }

    public static long bytesToLongBE(byte[] bArr, int i4) {
        return (((long) bArr[i4]) << 56) + (((long) (bArr[i4 + 1] & 255)) << 48) + (((long) (bArr[i4 + 2] & 255)) << 40) + (((long) (bArr[i4 + 3] & 255)) << 32) + (((long) (bArr[i4 + 4] & 255)) << 24) + ((long) ((bArr[i4 + 5] & 255) << 16)) + ((long) ((bArr[i4 + 6] & 255) << 8)) + ((long) (bArr[i4 + 7] & 255));
    }

    public static long bytesToLongLE(byte[] bArr, int i4) {
        return (((long) bArr[i4 + 7]) << 56) + (((long) (bArr[i4 + 6] & 255)) << 48) + (((long) (bArr[i4 + 5] & 255)) << 40) + (((long) (bArr[i4 + 4] & 255)) << 32) + (((long) (bArr[i4 + 3] & 255)) << 24) + ((long) ((bArr[i4 + 2] & 255) << 16)) + ((long) ((bArr[i4 + 1] & 255) << 8)) + ((long) (bArr[i4] & 255));
    }

    public static int bytesToShort(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToShortBE(bArr, i4) : bytesToShortLE(bArr, i4);
    }

    public static int bytesToShortBE(byte[] bArr, int i4) {
        return (bArr[i4] << 8) + (bArr[i4 + 1] & 255);
    }

    public static int bytesToShortLE(byte[] bArr, int i4) {
        return (bArr[i4 + 1] << 8) + (bArr[i4] & 255);
    }

    public static void bytesToShorts(byte[] bArr, short[] sArr, int i4, int i5, boolean z3) {
        if (z3) {
            bytesToShortsBE(bArr, sArr, i4, i5);
        } else {
            bytesToShortsLE(bArr, sArr, i4, i5);
        }
    }

    public static void bytesToShortsBE(byte[] bArr, short[] sArr, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            sArr[i4 + i7] = (short) ((bArr[i6] << 8) | (bArr[i6 + 1] & 255));
            i6 += 2;
        }
    }

    public static void bytesToShortsLE(byte[] bArr, short[] sArr, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            sArr[i4 + i7] = (short) ((bArr[i6 + 1] << 8) | (bArr[i6] & 255));
            i6 += 2;
        }
    }

    public static int bytesToTag(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToTagBE(bArr, i4) : bytesToTagLE(bArr, i4);
    }

    public static int bytesToTagBE(byte[] bArr, int i4) {
        return bytesToIntBE(bArr, i4);
    }

    public static int bytesToTagLE(byte[] bArr, int i4) {
        return (bArr[i4 + 1] << 24) + ((bArr[i4] & 255) << 16) + ((bArr[i4 + 3] & 255) << 8) + (bArr[i4 + 2] & 255);
    }

    public static int bytesToUShort(byte[] bArr, int i4, boolean z3) {
        return z3 ? bytesToUShortBE(bArr, i4) : bytesToUShortLE(bArr, i4);
    }

    public static int bytesToUShortBE(byte[] bArr, int i4) {
        return ((bArr[i4] & 255) << 8) + (bArr[i4 + 1] & 255);
    }

    public static int bytesToUShortLE(byte[] bArr, int i4) {
        return ((bArr[i4 + 1] & 255) << 8) + (bArr[i4] & 255);
    }

    public static int bytesToVR(byte[] bArr, int i4) {
        return bytesToUShortBE(bArr, i4);
    }

    private static void checkLength(int i4, int i5) {
        if (i4 < 0 || i4 % i5 != 0) {
            throw new IllegalArgumentException("length: " + i4);
        }
    }

    public static byte[] doubleToBytes(double d4, byte[] bArr, int i4, boolean z3) {
        return z3 ? doubleToBytesBE(d4, bArr, i4) : doubleToBytesLE(d4, bArr, i4);
    }

    public static byte[] doubleToBytesBE(double d4, byte[] bArr, int i4) {
        return longToBytesBE(Double.doubleToLongBits(d4), bArr, i4);
    }

    public static byte[] doubleToBytesLE(double d4, byte[] bArr, int i4) {
        return longToBytesLE(Double.doubleToLongBits(d4), bArr, i4);
    }

    public static byte[] floatToBytes(float f4, byte[] bArr, int i4, boolean z3) {
        return z3 ? floatToBytesBE(f4, bArr, i4) : floatToBytesLE(f4, bArr, i4);
    }

    public static byte[] floatToBytesBE(float f4, byte[] bArr, int i4) {
        return intToBytesBE(Float.floatToIntBits(f4), bArr, i4);
    }

    public static byte[] floatToBytesLE(float f4, byte[] bArr, int i4) {
        return intToBytesLE(Float.floatToIntBits(f4), bArr, i4);
    }

    public static byte[] intToBytes(int i4, byte[] bArr, int i5, boolean z3) {
        return z3 ? intToBytesBE(i4, bArr, i5) : intToBytesLE(i4, bArr, i5);
    }

    public static byte[] intToBytesBE(int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) (i4 >> 24);
        bArr[i5 + 1] = (byte) (i4 >> 16);
        bArr[i5 + 2] = (byte) (i4 >> 8);
        bArr[i5 + 3] = (byte) i4;
        return bArr;
    }

    public static byte[] intToBytesLE(int i4, byte[] bArr, int i5) {
        bArr[i5 + 3] = (byte) (i4 >> 24);
        bArr[i5 + 2] = (byte) (i4 >> 16);
        bArr[i5 + 1] = (byte) (i4 >> 8);
        bArr[i5] = (byte) i4;
        return bArr;
    }

    public static byte[] longToBytes(long j4, byte[] bArr, int i4, boolean z3) {
        return z3 ? longToBytesBE(j4, bArr, i4) : longToBytesLE(j4, bArr, i4);
    }

    public static byte[] longToBytesBE(long j4, byte[] bArr, int i4) {
        bArr[i4] = (byte) (j4 >> 56);
        bArr[i4 + 1] = (byte) (j4 >> 48);
        bArr[i4 + 2] = (byte) (j4 >> 40);
        bArr[i4 + 3] = (byte) (j4 >> 32);
        bArr[i4 + 4] = (byte) (j4 >> 24);
        bArr[i4 + 5] = (byte) (j4 >> 16);
        bArr[i4 + 6] = (byte) (j4 >> 8);
        bArr[i4 + 7] = (byte) j4;
        return bArr;
    }

    public static byte[] longToBytesLE(long j4, byte[] bArr, int i4) {
        bArr[i4 + 7] = (byte) (j4 >> 56);
        bArr[i4 + 6] = (byte) (j4 >> 48);
        bArr[i4 + 5] = (byte) (j4 >> 40);
        bArr[i4 + 4] = (byte) (j4 >> 32);
        bArr[i4 + 3] = (byte) (j4 >> 24);
        bArr[i4 + 2] = (byte) (j4 >> 16);
        bArr[i4 + 1] = (byte) (j4 >> 8);
        bArr[i4] = (byte) j4;
        return bArr;
    }

    public static byte[] shortToBytes(int i4, byte[] bArr, int i5, boolean z3) {
        return z3 ? shortToBytesBE(i4, bArr, i5) : shortToBytesLE(i4, bArr, i5);
    }

    public static byte[] shortToBytesBE(int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) (i4 >> 8);
        bArr[i5 + 1] = (byte) i4;
        return bArr;
    }

    public static byte[] shortToBytesLE(int i4, byte[] bArr, int i5) {
        bArr[i5 + 1] = (byte) (i4 >> 8);
        bArr[i5] = (byte) i4;
        return bArr;
    }

    private static void swap(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i4];
        bArr[i4] = bArr[i5];
        bArr[i5] = b4;
    }

    public static byte[] swapInts(byte[] bArr, int i4, int i5) {
        checkLength(i5, 4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            swap(bArr, i4, i4 + 3);
            swap(bArr, i4 + 1, i4 + 2);
            i4 += 4;
        }
        return bArr;
    }

    private static void swapLastFirst(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 1;
        byte b4 = bArr2[0];
        bArr2[0] = bArr[length];
        bArr[length] = b4;
    }

    public static byte[] swapLongs(byte[] bArr, int i4, int i5) {
        checkLength(i5, 8);
        int i6 = i5 + i4;
        while (i4 < i6) {
            swap(bArr, i4, i4 + 7);
            swap(bArr, i4 + 1, i4 + 6);
            swap(bArr, i4 + 2, i4 + 5);
            swap(bArr, i4 + 3, i4 + 4);
            i4 += 8;
        }
        return bArr;
    }

    public static byte[] swapShorts(byte[] bArr, int i4, int i5) {
        checkLength(i5, 2);
        int i6 = i5 + i4;
        while (i4 < i6) {
            swap(bArr, i4, i4 + 1);
            i4 += 2;
        }
        return bArr;
    }

    public static byte[] tagToBytes(int i4, byte[] bArr, int i5, boolean z3) {
        return z3 ? tagToBytesBE(i4, bArr, i5) : tagToBytesLE(i4, bArr, i5);
    }

    public static byte[] tagToBytesBE(int i4, byte[] bArr, int i5) {
        return intToBytesBE(i4, bArr, i5);
    }

    public static byte[] tagToBytesLE(int i4, byte[] bArr, int i5) {
        bArr[i5 + 1] = (byte) (i4 >> 24);
        bArr[i5] = (byte) (i4 >> 16);
        bArr[i5 + 3] = (byte) (i4 >> 8);
        bArr[i5 + 2] = (byte) i4;
        return bArr;
    }

    public static byte[][] swapShorts(byte[][] bArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte[] bArr2 = bArr[i5];
            if (i4 != 0) {
                swapLastFirst(bArr[i5 - 1], bArr2);
            }
            int length = bArr2.length - i4;
            swapShorts(bArr2, i4, length & (-2));
            i4 = length & 1;
        }
        return bArr;
    }
}
