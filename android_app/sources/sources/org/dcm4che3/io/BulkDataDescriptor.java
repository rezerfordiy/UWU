package org.dcm4che3.io;

import java.util.List;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.ItemPointer;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.TagUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class BulkDataDescriptor {
    public static final BulkDataDescriptor DEFAULT = new BulkDataDescriptor() { // from class: org.dcm4che3.io.BulkDataDescriptor.1
        @Override // org.dcm4che3.io.BulkDataDescriptor
        public boolean isBulkData(List<ItemPointer> list, String str, int i4, VR vr, int i5) {
            switch (TagUtils.normalizeRepeatingGroup(i4)) {
                case Tag.PixelDataProviderURL /* 2654176 */:
                case Tag.EncapsulatedDocument /* 4325393 */:
                case Tag.AudioSampleData /* 1342185484 */:
                case Tag.CurveData /* 1342189568 */:
                case Tag.SpectroscopyData /* 1442840608 */:
                case Tag.OverlayData /* 1610625024 */:
                case Tag.FloatPixelData /* 2145386504 */:
                case Tag.DoubleFloatPixelData /* 2145386505 */:
                case Tag.PixelData /* 2145386512 */:
                    break;
                case Tag.WaveformData /* 1409290256 */:
                    if (list.size() != 1 || list.get(0).sequenceTag != 1409286400) {
                    }
                    break;
                default:
                    switch (AnonymousClass4.$SwitchMap$org$dcm4che3$data$VR[vr.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            if (i5 <= 64) {
                                break;
                            }
                            break;
                    }
                    break;
            }
            return false;
        }
    };
    public static final BulkDataDescriptor PIXELDATA = new BulkDataDescriptor() { // from class: org.dcm4che3.io.BulkDataDescriptor.2
        @Override // org.dcm4che3.io.BulkDataDescriptor
        public boolean isBulkData(List<ItemPointer> list, String str, int i4, VR vr, int i5) {
            return i4 == 2145386512;
        }
    };

    /* JADX INFO: renamed from: org.dcm4che3.io.BulkDataDescriptor$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$dcm4che3$data$VR;

        static {
            int[] iArr = new int[VR.values().length];
            $SwitchMap$org$dcm4che3$data$VR = iArr;
            try {
                iArr[VR.OB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.OD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.OF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.OL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.OW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.UN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static BulkDataDescriptor valueOf(final Attributes attributes) {
        return new BulkDataDescriptor() { // from class: org.dcm4che3.io.BulkDataDescriptor.3
            @Override // org.dcm4che3.io.BulkDataDescriptor
            public boolean isBulkData(List<ItemPointer> list, String str, int i4, VR vr, int i5) {
                Attributes nestedDataset = attributes;
                for (ItemPointer itemPointer : list) {
                    nestedDataset = nestedDataset.getNestedDataset(itemPointer.privateCreator, itemPointer.sequenceTag, itemPointer.itemIndex);
                }
                return nestedDataset.contains(str, i4);
            }
        };
    }

    public abstract boolean isBulkData(List<ItemPointer> list, String str, int i4, VR vr, int i5);
}
