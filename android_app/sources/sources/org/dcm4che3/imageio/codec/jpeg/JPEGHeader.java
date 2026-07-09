package org.dcm4che3.imageio.codec.jpeg;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.ByteUtils;

/* JADX INFO: loaded from: classes.dex */
public class JPEGHeader {
    private final byte[] data;
    private final int[] offsets;

    public JPEGHeader(byte[] bArr, int i4) {
        int iBytesToUShortBE = 0;
        int i5 = 0;
        while (true) {
            int iNextMarker = nextMarker(bArr, iBytesToUShortBE);
            if (iNextMarker == -1) {
                break;
            }
            i5++;
            int i6 = iNextMarker + 1;
            int i7 = bArr[iNextMarker] & 255;
            if (JPEG.isStandalone(i7)) {
                iBytesToUShortBE = i6;
            } else if (i6 + 1 >= bArr.length || i7 == i4) {
                break;
            } else {
                iBytesToUShortBE = ByteUtils.bytesToUShortBE(bArr, i6) + i6;
            }
        }
        this.data = bArr;
        this.offsets = new int[i5];
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            int[] iArr = this.offsets;
            int iNextMarker2 = nextMarker(bArr, i8);
            iArr[i9] = iNextMarker2;
            int iBytesToUShortBE2 = iNextMarker2 + 1;
            if (!JPEG.isStandalone(iNextMarker2 & 255)) {
                iBytesToUShortBE2 += ByteUtils.bytesToUShortBE(bArr, iBytesToUShortBE2);
            }
            i8 = iBytesToUShortBE2;
        }
    }

    private static int nextMarker(byte[] bArr, int i4) {
        byte b4;
        while (true) {
            i4++;
            if (i4 >= bArr.length) {
                return -1;
            }
            if (bArr[i4 - 1] == -1 && (b4 = bArr[i4]) != -1 && b4 != 0) {
                return i4;
            }
        }
    }

    private int ss() {
        int iOffsetOf = offsetOf(JPEG.SOS);
        if (iOffsetOf != -1) {
            return this.data[iOffsetOf + 6] & 255;
        }
        return -1;
    }

    public String getTransferSyntaxUID() {
        int iOffsetSOF = offsetSOF();
        if (iOffsetSOF == -1) {
            return null;
        }
        int i4 = this.data[iOffsetSOF] & 255;
        if (i4 == 192) {
            return UID.JPEGBaseline1;
        }
        if (i4 == 193) {
            return UID.JPEGExtended24;
        }
        if (i4 == 195) {
            return ss() == 1 ? UID.JPEGLossless : UID.JPEGLosslessNonHierarchical14;
        }
        if (i4 != 247) {
            return null;
        }
        return ss() == 0 ? UID.JPEGLSLossless : UID.JPEGLSLossyNearLossless;
    }

    public int marker(int i4) {
        return this.data[this.offsets[i4]] & 255;
    }

    public int numberOfMarkers() {
        return this.offsets.length;
    }

    public int offset(int i4) {
        return this.offsets[i4];
    }

    public int offsetAfterAPP() {
        for (int i4 = 1; i4 < this.offsets.length; i4++) {
            if (!JPEG.isAPP(marker(i4))) {
                return this.offsets[i4];
            }
        }
        return -1;
    }

    public int offsetOf(int i4) {
        for (int i5 = 0; i5 < this.offsets.length; i5++) {
            if (marker(i5) == i4) {
                return this.offsets[i5];
            }
        }
        return -1;
    }

    public int offsetSOF() {
        for (int i4 = 0; i4 < this.offsets.length; i4++) {
            if (JPEG.isSOF(marker(i4))) {
                return this.offsets[i4];
            }
        }
        return -1;
    }

    public Attributes toAttributes(Attributes attributes) {
        int iOffsetSOF = offsetSOF();
        if (iOffsetSOF == -1) {
            return null;
        }
        if (attributes == null) {
            attributes = new Attributes(10);
        }
        byte[] bArr = this.data;
        int i4 = bArr[iOffsetSOF] & 255;
        int i5 = iOffsetSOF + 3;
        int i6 = bArr[i5] & 255;
        int i7 = ((bArr[i5 + 1] & 255) << 8) | (bArr[i5 + 2] & 255);
        int i8 = ((bArr[i5 + 3] & 255) << 8) | (bArr[i5 + 4] & 255);
        int i9 = bArr[i5 + 5] & 255;
        VR vr = VR.US;
        attributes.setInt(Tag.SamplesPerPixel, vr, i9);
        if (i9 == 3) {
            attributes.setString(Tag.PhotometricInterpretation, VR.CS, i4 == 192 ? "YBR_FULL_422" : "RGB");
            attributes.setInt(Tag.PlanarConfiguration, vr, 0);
        } else {
            attributes.setString(Tag.PhotometricInterpretation, VR.CS, "MONOCHROME2");
        }
        attributes.setInt(Tag.Rows, vr, i7);
        attributes.setInt(Tag.Columns, vr, i8);
        int[] iArr = new int[1];
        iArr[0] = i6 > 8 ? 16 : 8;
        attributes.setInt(Tag.BitsAllocated, vr, iArr);
        attributes.setInt(Tag.BitsStored, vr, i6);
        attributes.setInt(Tag.HighBit, vr, i6 - 1);
        attributes.setInt(Tag.PixelRepresentation, vr, 0);
        if (i4 != 195 && (i4 != 247 || ss() != 0)) {
            attributes.setString(Tag.LossyImageCompression, VR.CS, "01");
        }
        return attributes;
    }
}
