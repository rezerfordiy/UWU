package org.dcm4che3.util;

import l0.a;
import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
public class TagUtils {
    private static char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final byte[] INV_HEX_DIGITS = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};

    public static int creatorTagOf(int i4) {
        return ((i4 >>> 8) & 255) | ((-65536) & i4);
    }

    public static int elementNumber(int i4) {
        return i4 & a.f8427a;
    }

    public static int forName(String str) {
        try {
            try {
                return Integer.parseInt(str, 16);
            } catch (Exception unused) {
                return -1;
            }
        } catch (NumberFormatException unused2) {
            return Tag.class.getField(str).getInt(null);
        }
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            try {
                byte[] bArr2 = INV_HEX_DIGITS;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                bArr[i4] = (byte) ((bArr2[charArray[i5]] << 4) | bArr2[charArray[i6]]);
                i4++;
                i5 = i7;
            } catch (IndexOutOfBoundsException unused) {
                throw new IllegalArgumentException(str);
            }
        }
        return bArr;
    }

    public static int[] fromHexStrings(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = intFromHexString(strArr[i4]);
        }
        return iArr;
    }

    public static int groupLengthTagOf(int i4) {
        return i4 & a.f8429c;
    }

    public static int groupNumber(int i4) {
        return i4 >>> 16;
    }

    public static int intFromHexString(String str) {
        int i4 = 0;
        for (char c4 : str.toCharArray()) {
            i4 = (i4 << 4) | INV_HEX_DIGITS[c4];
        }
        return i4;
    }

    public static boolean isFileMetaInformation(int i4) {
        return (i4 & a.f8429c) == 131072;
    }

    public static boolean isGroupLength(int i4) {
        return elementNumber(i4) == 0;
    }

    public static boolean isItem(int i4) {
        return i4 == -73728 || i4 == -73715 || i4 == -73507;
    }

    public static boolean isPrivateCreator(int i4) {
        return ((65536 & i4) == 0 || (65280 & i4) != 0 || (i4 & 240) == 0) ? false : true;
    }

    public static boolean isPrivateGroup(int i4) {
        return (i4 & 65536) != 0;
    }

    public static boolean isPrivateTag(int i4) {
        return ((65536 & i4) == 0 || (i4 & 65280) == 0) ? false : true;
    }

    public static int normalizeRepeatingGroup(int i4) {
        int i5 = (-2097152) & i4;
        return (i5 == 1342177280 || i5 == 1610612736) ? i4 & (-2031617) : i4;
    }

    public static int[] parseTagPath(String str) {
        String[] strArrSplit = StringUtils.split(str, '.');
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            int iForName = forName(strArrSplit[i4]);
            iArr[i4] = iForName;
            if (iForName == -1) {
                throw new IllegalArgumentException("tagPath: " + str);
            }
        }
        return iArr;
    }

    public static String shortToHexString(int i4) {
        char[] cArr = HEX_DIGITS;
        return new String(new char[]{cArr[(i4 >>> 12) & 15], cArr[(i4 >>> 8) & 15], cArr[(i4 >>> 4) & 15], cArr[(i4 >>> 0) & 15]});
    }

    public static String toHexString(int i4) {
        char[] cArr = HEX_DIGITS;
        return new String(new char[]{cArr[i4 >>> 28], cArr[(i4 >>> 24) & 15], cArr[(i4 >>> 20) & 15], cArr[(i4 >>> 16) & 15], cArr[(i4 >>> 12) & 15], cArr[(i4 >>> 8) & 15], cArr[(i4 >>> 4) & 15], cArr[(i4 >>> 0) & 15]});
    }

    public static String[] toHexStrings(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = toHexString(iArr[i4]);
        }
        return strArr;
    }

    public static int toPrivateTag(int i4, int i5) {
        return ((i4 & 255) << 8) | (i5 & 255) | ((-65536) & i4);
    }

    public static String toString(int i4) {
        char[] cArr = HEX_DIGITS;
        return new String(new char[]{'(', cArr[i4 >>> 28], cArr[(i4 >>> 24) & 15], cArr[(i4 >>> 20) & 15], cArr[(i4 >>> 16) & 15], ',', cArr[(i4 >>> 12) & 15], cArr[(i4 >>> 8) & 15], cArr[(i4 >>> 4) & 15], cArr[(i4 >>> 0) & 15], ')'});
    }

    public static int toTag(int i4, int i5) {
        return (i4 << 16) | i5;
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i4] = cArr2[(b4 >>> 4) & 15];
            i4 = i5 + 1;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }
}
