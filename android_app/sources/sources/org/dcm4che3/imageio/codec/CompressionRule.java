package org.dcm4che3.imageio.codec;

import java.io.Serializable;
import java.util.EnumSet;
import org.dcm4che3.image.PhotometricInterpretation;
import org.dcm4che3.util.Property;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class CompressionRule implements Comparable<CompressionRule>, Serializable {
    private static final long serialVersionUID = 2010254518169306864L;
    private final String commonName;
    private final Condition condition;
    private final Property[] imageWriteParams;
    private final String tsuid;

    public static class Condition implements Comparable<Condition>, Serializable {
        private static final long serialVersionUID = -4069284624944470710L;
        final String[] aeTitles;
        final int bitsStoredMask;
        final String[] bodyPartExamined;
        final int pixelRepresentation = -1;
        final EnumSet<PhotometricInterpretation> pmis = EnumSet.noneOf(PhotometricInterpretation.class);
        final String[] sopClasses;
        final int weight;

        public Condition(String[] strArr, int[] iArr, int i4, String[] strArr2, String[] strArr3, String[] strArr4) {
            for (String str : strArr) {
                this.pmis.add(PhotometricInterpretation.fromString(str));
            }
            this.bitsStoredMask = toBitsStoredMask(iArr);
            this.aeTitles = strArr2;
            this.sopClasses = strArr3;
            this.bodyPartExamined = strArr4;
            this.weight = (strArr2.length != 0 ? 4 : 0) + (strArr3.length != 0 ? 2 : 0) + (strArr4.length != 0 ? 1 : 0);
        }

        private static boolean isEmptyOrContains(Object[] objArr, Object obj) {
            if (obj == null || objArr.length == 0) {
                return true;
            }
            for (Object obj2 : objArr) {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
            return false;
        }

        private boolean matchBitStored(int i4) {
            return ((1 << i4) & this.bitsStoredMask) != 0;
        }

        private boolean matchPixelRepresentation(int i4) {
            return true;
        }

        private int toBitsStoredMask(int[] iArr) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4 |= 1 << i5;
            }
            return i4;
        }

        public int[] getBitsStored() {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 8; i6 <= 16; i6++) {
                if (matchBitStored(i6)) {
                    i5++;
                }
            }
            int[] iArr = new int[i5];
            for (int i7 = 8; i7 <= 16; i7++) {
                if (matchBitStored(i7)) {
                    iArr[i4] = i7;
                    i4++;
                }
            }
            return iArr;
        }

        public PhotometricInterpretation[] getPhotometricInterpretations() {
            EnumSet<PhotometricInterpretation> enumSet = this.pmis;
            return (PhotometricInterpretation[]) enumSet.toArray(new PhotometricInterpretation[enumSet.size()]);
        }

        public boolean matches(String str, ImageDescriptor imageDescriptor) {
            return this.pmis.contains(imageDescriptor.getPhotometricInterpretation()) && matchBitStored(imageDescriptor.getBitsStored()) && matchPixelRepresentation(imageDescriptor.getPixelRepresentation()) && isEmptyOrContains(this.aeTitles, str) && isEmptyOrContains(this.sopClasses, imageDescriptor.getSopClassUID()) && isEmptyOrContains(this.bodyPartExamined, imageDescriptor.getBodyPartExamined());
        }

        @Override // java.lang.Comparable
        public int compareTo(Condition condition) {
            return condition.weight - this.weight;
        }
    }

    public CompressionRule(String str, String[] strArr, int[] iArr, int i4, String[] strArr2, String[] strArr3, String[] strArr4, String str2, String... strArr5) {
        this.commonName = str;
        this.condition = new Condition(strArr, iArr, i4, StringUtils.maskNull(strArr2), StringUtils.maskNull(strArr3), StringUtils.maskNull(strArr4));
        this.tsuid = str2;
        this.imageWriteParams = Property.valueOf(strArr5);
    }

    public final String[] getAETitles() {
        return this.condition.aeTitles;
    }

    public int[] getBitsStored() {
        return this.condition.getBitsStored();
    }

    public final String[] getBodyPartExamined() {
        return this.condition.bodyPartExamined;
    }

    public final String getCommonName() {
        return this.commonName;
    }

    public Property[] getImageWriteParams() {
        return this.imageWriteParams;
    }

    public PhotometricInterpretation[] getPhotometricInterpretations() {
        return this.condition.getPhotometricInterpretations();
    }

    public final int getPixelRepresentation() {
        this.condition.getClass();
        return -1;
    }

    public final String[] getSOPClasses() {
        return this.condition.sopClasses;
    }

    public final String getTransferSyntax() {
        return this.tsuid;
    }

    public boolean matchesCondition(String str, ImageDescriptor imageDescriptor) {
        return this.condition.matches(str, imageDescriptor);
    }

    @Override // java.lang.Comparable
    public int compareTo(CompressionRule compressionRule) {
        return this.condition.compareTo(compressionRule.condition);
    }
}
