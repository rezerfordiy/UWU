package org.dcm4che3.imageio.codec.mpeg;

import v0.c1;

/* JADX INFO: loaded from: classes.dex */
public class MPEGHeader {
    private static final String[][] ASPECT_RATIOS;
    private static final String[] ASPECT_RATIO_16_9;
    private static final String[] ASPECT_RATIO_1_1;
    private static final String[] ASPECT_RATIO_221_100;
    private static final String[] ASPECT_RATIO_4_3;
    private static int[] FPS = {24, c1.f12009d, 24, 1000, 25, 1000, 30, c1.f12009d, 30, 1000, 50, 1000, 60, c1.f12009d, 60, 1000};
    private final byte[] data;
    private final int seqHeaderOffset;

    static {
        String[] strArr = {"1", "1"};
        ASPECT_RATIO_1_1 = strArr;
        String[] strArr2 = {"4", "3"};
        ASPECT_RATIO_4_3 = strArr2;
        String[] strArr3 = {"16", "9"};
        ASPECT_RATIO_16_9 = strArr3;
        String[] strArr4 = {"221", "100"};
        ASPECT_RATIO_221_100 = strArr4;
        ASPECT_RATIOS = new String[][]{strArr, strArr2, strArr3, strArr4};
    }

    public MPEGHeader(byte[] bArr) {
        this.data = bArr;
        int length = bArr.length;
        int i4 = 0;
        while (true) {
            int i5 = length - 1;
            if (length > 0) {
                int i6 = i4 + 1;
                if (bArr[i4] != 0) {
                    i4 = i6;
                    length = i5;
                } else {
                    i4 = i6;
                }
            }
            length = i5 - 1;
            if (i5 > 0) {
                int i7 = i4 + 1;
                byte b4 = bArr[i4];
                i4 = i7;
            }
            if (length <= 8 || (bArr[i4] == 1 && bArr[i4 + 1] == -77)) {
                break;
            }
        }
        this.seqHeaderOffset = length > 8 ? i4 + 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.dcm4che3.data.Attributes toAttributes(org.dcm4che3.data.Attributes r17, long r18) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.imageio.codec.mpeg.MPEGHeader.toAttributes(org.dcm4che3.data.Attributes, long):org.dcm4che3.data.Attributes");
    }
}
