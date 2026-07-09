package org.dcm4che3.imageio.codec;

import java.util.HashMap;
import org.dcm4che3.data.UID;

/* JADX INFO: loaded from: classes.dex */
public enum TransferSyntaxType {
    NATIVE { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.1
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public boolean isPixeldataEncapsulated() {
            return false;
        }
    },
    JPEG_BASELINE { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.2
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public int getMaxBitsStored() {
            return 8;
        }
    },
    JPEG_EXTENDED { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.3
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public int getMaxBitsStored() {
            return 12;
        }
    },
    JPEG_LOSSLESS,
    JPEG_2000 { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.4
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public boolean canEncodeSigned() {
            return true;
        }
    },
    RLE { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.5
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public int getPlanarConfiguration() {
            return 1;
        }
    },
    JPIP { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.6
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public boolean isPixeldataEncapsulated() {
            return false;
        }
    },
    MPEG { // from class: org.dcm4che3.imageio.codec.TransferSyntaxType.7
        @Override // org.dcm4che3.imageio.codec.TransferSyntaxType
        public int getMaxBitsStored() {
            return 8;
        }
    };

    private static final HashMap<String, TransferSyntaxType> map;

    static {
        TransferSyntaxType transferSyntaxType = NATIVE;
        TransferSyntaxType transferSyntaxType2 = JPEG_BASELINE;
        TransferSyntaxType transferSyntaxType3 = JPEG_EXTENDED;
        TransferSyntaxType transferSyntaxType4 = JPEG_LOSSLESS;
        TransferSyntaxType transferSyntaxType5 = JPEG_2000;
        TransferSyntaxType transferSyntaxType6 = RLE;
        TransferSyntaxType transferSyntaxType7 = JPIP;
        TransferSyntaxType transferSyntaxType8 = MPEG;
        HashMap<String, TransferSyntaxType> map2 = new HashMap<>();
        map = map2;
        map2.put(UID.ImplicitVRLittleEndian, transferSyntaxType);
        map2.put(UID.ExplicitVRLittleEndian, transferSyntaxType);
        map2.put(UID.DeflatedExplicitVRLittleEndian, transferSyntaxType);
        map2.put(UID.ExplicitVRBigEndianRetired, transferSyntaxType);
        map2.put(UID.JPEGBaseline1, transferSyntaxType2);
        map2.put(UID.JPEGExtended24, transferSyntaxType3);
        map2.put(UID.JPEGLosslessNonHierarchical14, transferSyntaxType4);
        map2.put(UID.JPEGLossless, transferSyntaxType4);
        map2.put(UID.JPEGLSLossless, transferSyntaxType4);
        map2.put(UID.JPEGLSLossyNearLossless, transferSyntaxType4);
        map2.put(UID.JPEG2000LosslessOnly, transferSyntaxType5);
        map2.put(UID.JPEG2000, transferSyntaxType5);
        map2.put(UID.JPEG2000Part2MultiComponentLosslessOnly, transferSyntaxType5);
        map2.put(UID.JPEG2000Part2MultiComponent, transferSyntaxType5);
        map2.put(UID.JPIPReferenced, transferSyntaxType7);
        map2.put(UID.JPIPReferencedDeflate, transferSyntaxType7);
        map2.put(UID.MPEG2, transferSyntaxType8);
        map2.put(UID.MPEG2MainProfileHighLevel, transferSyntaxType8);
        map2.put(UID.MPEG4AVCH264HighProfileLevel41, transferSyntaxType8);
        map2.put(UID.MPEG4AVCH264BDCompatibleHighProfileLevel41, transferSyntaxType8);
        map2.put(UID.RLELossless, transferSyntaxType6);
    }

    public static TransferSyntaxType forUID(String str) {
        return map.get(str);
    }

    public boolean canEncodeSigned() {
        return false;
    }

    public int getMaxBitsStored() {
        return 16;
    }

    public int getPlanarConfiguration() {
        return 0;
    }

    public boolean isPixeldataEncapsulated() {
        return true;
    }
}
