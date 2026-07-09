package n2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static void a(List<Byte> list, byte[] bArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            list.add(Byte.valueOf((byte) (bArr[i5] & 255)));
        }
    }

    public static byte[] b(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            bArr[i4] = (byte) iArr[i4];
        }
        return bArr;
    }

    public static byte[] c(List<Byte> list) {
        byte[] bArr = new byte[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bArr[i4] = (byte) (list.get(i4).byteValue() & 255);
        }
        return bArr;
    }

    public static void d(List<Byte> list, int i4, int i5) {
        if (i4 >= i5) {
            return;
        }
        while (i4 < i5) {
            list.remove(i4);
            i4++;
        }
    }
}
