package org.dcm4che3.data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.dcm4che3.data.IOD;
import org.dcm4che3.data.VR;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomInputStream;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.DateUtils;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s0.a;
import v0.u;

/* JADX INFO: loaded from: classes.dex */
public class Attributes implements Serializable {
    private static final int INIT_CAPACITY = 16;
    private static final Logger LOG = LoggerFactory.getLogger(Attributes.class);
    private static final int TO_STRING_LIMIT = 50;
    private static final int TO_STRING_WIDTH = 78;
    private static final long serialVersionUID = 7868714416968825241L;
    private final boolean bigEndian;
    private boolean containsSpecificCharacterSet;
    private boolean containsTimezoneOffsetFromUTC;
    private transient SpecificCharacterSet cs;
    private TimeZone defaultTimeZone;
    private transient int groupLengthIndex0;
    private transient int[] groupLengths;
    private long itemPosition;
    private transient int length;
    private transient Attributes parent;
    private Map<String, Object> properties;
    private transient int size;
    private transient int[] tags;
    private transient TimeZone tz;
    private transient Object[] values;
    private transient VR[] vrs;

    /* JADX INFO: renamed from: org.dcm4che3.data.Attributes$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$dcm4che3$data$VR;

        static {
            int[] iArr = new int[VR.values().length];
            $SwitchMap$org$dcm4che3$data$VR = iArr;
            try {
                iArr[VR.PN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.DA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.DT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$dcm4che3$data$VR[VR.TM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface SequenceVisitor extends Visitor {
        void endItem();

        void startItem(int i4, int i5);
    }

    public enum UpdatePolicy {
        SUPPLEMENT,
        MERGE,
        OVERWRITE,
        REPLACE
    }

    public interface Visitor {
        boolean visit(Attributes attributes, int i4, VR vr, Object obj) throws Exception;
    }

    public Attributes() {
        this(false, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean add(org.dcm4che3.data.Attributes r25, int[] r26, int[] r27, int r28, int r29, org.dcm4che3.data.Attributes r30, org.dcm4che3.data.Attributes.UpdatePolicy r31, boolean r32, org.dcm4che3.data.Attributes r33) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.add(org.dcm4che3.data.Attributes, int[], int[], int, int, org.dcm4che3.data.Attributes, org.dcm4che3.data.Attributes$UpdatePolicy, boolean, org.dcm4che3.data.Attributes):boolean");
    }

    private StringBuilder appendAttribute(String str, int i4, VR vr, Object obj, int i5, StringBuilder sb, String str2) {
        sb.append(str2);
        sb.append(TagUtils.toString(i4));
        sb.append(' ');
        sb.append(vr);
        sb.append(" [");
        if (vr.prompt(obj, this.bigEndian, getSpecificCharacterSet(vr), (i5 - sb.length()) - 1, sb)) {
            sb.append("] ");
            sb.append(ElementDictionary.keywordOf(i4, str));
            if (sb.length() > i5) {
                sb.setLength(i5);
            }
        }
        sb.append('\n');
        return sb;
    }

    private int appendAttributes(int i4, int i5, StringBuilder sb, String str) {
        String str2;
        int i6;
        String string = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i9 < this.size) {
            int iAppendItems = i7 + 1;
            if (iAppendItems > i4) {
                return iAppendItems;
            }
            int i10 = this.tags[i9];
            if (TagUtils.isPrivateTag(i10)) {
                int iCreatorTagOf = TagUtils.creatorTagOf(i10);
                if (i8 != iCreatorTagOf) {
                    string = getString(iCreatorTagOf, (String) null);
                    i8 = iCreatorTagOf;
                }
                i6 = i8;
                str2 = string;
            } else {
                str2 = null;
                i6 = 0;
            }
            Object obj = this.values[i9];
            appendAttribute(str2, i10, this.vrs[i9], obj, sb.length() + i5, sb, str);
            if (obj instanceof Sequence) {
                iAppendItems += appendItems((Sequence) obj, i4 - iAppendItems, i5, sb, str + '>');
            }
            i7 = iAppendItems;
            i9++;
            i8 = i6;
            string = str2;
        }
        return i7;
    }

    private int appendItems(Sequence sequence, int i4, int i5, StringBuilder sb, String str) {
        int iAppendAttributes = 0;
        int i6 = 0;
        for (Attributes attributes : sequence) {
            iAppendAttributes++;
            if (iAppendAttributes > i4) {
                break;
            }
            sb.append(str);
            sb.append("Item #");
            i6++;
            sb.append(i6);
            sb.append('\n');
            iAppendAttributes += attributes.appendAttributes(i4 - iAppendAttributes, i5, sb, str);
        }
        return iAppendAttributes;
    }

    private void checkInGroup(int i4, int i5) {
        int i6 = this.tags[i4];
        if (TagUtils.groupLengthTagOf(i6) == i5) {
            return;
        }
        throw new IllegalStateException(TagUtils.toString(i6) + " does not belong to group (" + TagUtils.shortToHexString(TagUtils.groupNumber(i5)) + ",eeee).");
    }

    private IOD[] checkforMissingItems(int[] iArr, IOD[] iodArr) {
        IOD[] iodArr2 = new IOD[iArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            IOD iod = iodArr[i5];
            if (iArr[i5] == 0 && iod.getType() == IOD.DataElementType.TYPE_1) {
                iodArr2[i4] = iod;
                i4++;
            }
        }
        if (i4 > 0) {
            return (IOD[]) Arrays.copyOf(iodArr2, i4);
        }
        return null;
    }

    private static boolean containsPNValue(Object obj) {
        return (obj == Value.NULL || new PersonName((String) obj, true).isEmpty()) ? false : true;
    }

    private int countGroups() {
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < this.size; i6++) {
            int iGroupLengthTagOf = TagUtils.groupLengthTagOf(this.tags[i6]);
            if (i4 != iGroupLengthTagOf) {
                if (i4 < 0) {
                    this.groupLengthIndex0 = i5;
                }
                i5++;
                i4 = iGroupLengthTagOf;
            }
        }
        return i5;
    }

    private int creatorIndexOf(String str, int i4) {
        if ((i4 & 1) == 0) {
            throw new IllegalArgumentException("(" + TagUtils.shortToHexString(i4) + ",xxxx) is not a private Group");
        }
        int i5 = i4 << 16;
        int iIndexOf = indexOf(i5 | 16);
        if (iIndexOf < 0) {
            iIndexOf = (-iIndexOf) - 1;
        }
        while (iIndexOf < this.size && (this.tags[iIndexOf] & u.f12223u) == i5) {
            if (this.vrs[iIndexOf] == VR.LO && str.equals(decodeStringValue(iIndexOf))) {
                return iIndexOf;
            }
            iIndexOf++;
        }
        return -1;
    }

    private int creatorTagOf(String str, int i4, boolean z3) {
        if (!TagUtils.isPrivateGroup(i4)) {
            throw new IllegalArgumentException(TagUtils.toString(i4) + " is not a private Data Element");
        }
        int i5 = (-65536) & i4;
        int i6 = i5 | 16;
        int iIndexOf = indexOf(i6);
        if (iIndexOf < 0) {
            iIndexOf = (-iIndexOf) - 1;
        }
        while (iIndexOf < this.size) {
            int i7 = this.tags[iIndexOf];
            if ((i7 & u.f12223u) != i5) {
                break;
            }
            if (this.vrs[iIndexOf] == VR.LO && str.equals(decodeStringValue(iIndexOf))) {
                return i7;
            }
            iIndexOf++;
            i6 = i7 + 1;
        }
        if (!z3) {
            return -1;
        }
        if ((65280 & i6) == 0) {
            setString(i6, VR.LO, str);
            return i6;
        }
        throw new IllegalStateException("No free block for Private Element " + TagUtils.toString(i4));
    }

    private double[] decodeDSValue(int i4) {
        double[] dArr;
        Object strings = i4 < 0 ? Value.NULL : this.values[i4];
        Value value = Value.NULL;
        if (strings == value) {
            return ByteUtils.EMPTY_DOUBLES;
        }
        if (strings instanceof double[]) {
            return (double[]) strings;
        }
        if (strings instanceof byte[]) {
            strings = this.vrs[i4].toStrings((byte[]) strings, this.bigEndian, SpecificCharacterSet.ASCII);
        }
        if (strings instanceof String) {
            String str = (String) strings;
            if (str.isEmpty()) {
                this.values[i4] = value;
                return ByteUtils.EMPTY_DOUBLES;
            }
            dArr = new double[]{StringUtils.parseDS(str)};
        } else {
            String[] strArr = (String[]) strings;
            int length = strArr.length;
            double[] dArr2 = new double[length];
            for (int i5 = 0; i5 < length; i5++) {
                String str2 = strArr[i5];
                dArr2[i5] = (str2 == null || str2.isEmpty()) ? Double.NaN : StringUtils.parseDS(str2);
            }
            dArr = dArr2;
        }
        this.values[i4] = dArr;
        return dArr;
    }

    private int[] decodeISValue(int i4) {
        int[] iArr;
        Object strings = i4 < 0 ? Value.NULL : this.values[i4];
        Value value = Value.NULL;
        if (strings == value) {
            return ByteUtils.EMPTY_INTS;
        }
        if (strings instanceof int[]) {
            return (int[]) strings;
        }
        if (strings instanceof byte[]) {
            strings = this.vrs[i4].toStrings((byte[]) strings, this.bigEndian, SpecificCharacterSet.ASCII);
        }
        if (strings instanceof String) {
            String str = (String) strings;
            if (str.isEmpty()) {
                this.values[i4] = value;
                return ByteUtils.EMPTY_INTS;
            }
            iArr = new int[]{StringUtils.parseIS(str)};
        } else {
            String[] strArr = (String[]) strings;
            int length = strArr.length;
            int[] iArr2 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                String str2 = strArr[i5];
                iArr2[i5] = (str2 == null || str2.isEmpty()) ? Integer.MIN_VALUE : StringUtils.parseIS(str2);
            }
            iArr = iArr2;
        }
        this.values[i4] = iArr;
        return iArr;
    }

    private Object decodeStringValue(int i4) {
        Object strings = this.values[i4];
        if (strings instanceof byte[]) {
            VR vr = this.vrs[i4];
            strings = vr.toStrings((byte[]) strings, this.bigEndian, getSpecificCharacterSet(vr));
            if ((strings instanceof String) && ((String) strings).isEmpty()) {
                strings = Value.NULL;
            }
            this.values[i4] = strings;
        }
        return strings;
    }

    private void decodeStringValuesUsingSpecificCharacterSet() {
        SpecificCharacterSet specificCharacterSet = getSpecificCharacterSet();
        for (int i4 = 0; i4 < this.size; i4++) {
            Object obj = this.values[i4];
            if (obj instanceof Sequence) {
                Iterator<Attributes> it = ((Sequence) obj).iterator();
                while (it.hasNext()) {
                    it.next().decodeStringValuesUsingSpecificCharacterSet();
                }
            } else {
                VR vr = this.vrs[i4];
                if (vr.useSpecificCharacterSet() && (obj instanceof byte[])) {
                    this.values[i4] = vr.toStrings((byte[]) obj, this.bigEndian, specificCharacterSet);
                }
            }
        }
    }

    private void ensureCapacity(int i4) {
        int length = this.tags.length;
        if (i4 > length) {
            int iMax = Math.max(i4, length << 1);
            this.tags = Arrays.copyOf(this.tags, iMax);
            this.vrs = (VR[]) Arrays.copyOf(this.vrs, iMax);
            this.values = Arrays.copyOf(this.values, iMax);
        }
    }

    private boolean equalPNValues(Object obj, Object obj2) {
        Value value = Value.NULL;
        if (obj == value) {
            if (!containsPNValue(obj2)) {
                return true;
            }
        } else {
            if (obj2 != value) {
                return equalPNValues((String) obj, (String) obj2);
            }
            if (!containsPNValue(obj)) {
                return true;
            }
        }
        return false;
    }

    private boolean equalValues(Attributes attributes, int i4, int i5) {
        if (i4 < 0 && i5 < 0) {
            return true;
        }
        VR vr = i4 < 0 ? attributes.vrs[i5] : this.vrs[i4];
        if (i5 >= 0 && vr != attributes.vrs[i5]) {
            return false;
        }
        if (!vr.isStringType()) {
            Object obj = i4 < 0 ? Value.NULL : this.values[i4];
            Object obj2 = i5 < 0 ? Value.NULL : attributes.values[i5];
            if (!(obj instanceof byte[])) {
                return obj.equals(obj2);
            }
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length == bArr2.length) {
                    if (this.bigEndian != attributes.bigEndian) {
                        obj2 = vr.toggleEndian(bArr2, true);
                    }
                    return Arrays.equals(bArr, (byte[]) obj2);
                }
            }
            return false;
        }
        if (vr == VR.IS) {
            return Arrays.equals(decodeISValue(i4), attributes.decodeISValue(i5));
        }
        if (vr == VR.DS) {
            return Arrays.equals(decodeDSValue(i4), attributes.decodeDSValue(i5));
        }
        Object objDecodeStringValue = i4 < 0 ? Value.NULL : decodeStringValue(i4);
        Object objDecodeStringValue2 = i5 < 0 ? Value.NULL : attributes.decodeStringValue(i5);
        if (objDecodeStringValue instanceof String[]) {
            if (objDecodeStringValue2 instanceof String[]) {
                String[] strArr = (String[]) objDecodeStringValue;
                String[] strArr2 = (String[]) objDecodeStringValue2;
                if (vr == VR.PN) {
                    if (equalPNValues(strArr, strArr2)) {
                        return true;
                    }
                } else if (Arrays.equals(strArr, strArr2)) {
                    return true;
                }
            }
        } else if (!(objDecodeStringValue2 instanceof String[])) {
            if (vr == VR.PN) {
                if (equalPNValues(objDecodeStringValue, objDecodeStringValue2)) {
                    return true;
                }
            } else if (objDecodeStringValue.equals(objDecodeStringValue2)) {
                return true;
            }
        }
        return false;
    }

    private int getEncodedItemLength(DicomEncodingOptions dicomEncodingOptions, boolean z3) {
        if (isEmpty()) {
            return dicomEncodingOptions.undefEmptyItemLength ? -1 : 0;
        }
        if (dicomEncodingOptions.undefItemLength) {
            return -1;
        }
        if (this.length == -1) {
            calcLength(dicomEncodingOptions, z3);
        }
        return this.length;
    }

    private int indexForInsertOf(int i4) {
        int i5 = this.size;
        if (i5 == 0) {
            return -1;
        }
        return this.tags[i5 + (-1)] < i4 ? -(i5 + 1) : indexOf(i4);
    }

    private int indexOf(int i4) {
        return Arrays.binarySearch(this.tags, 0, this.size, i4);
    }

    private void init(int i4) {
        this.tags = new int[i4];
        this.vrs = new VR[i4];
        this.values = new Object[i4];
    }

    private void insert(int i4, int i5, VR vr, Object obj) {
        ensureCapacity(this.size + 1);
        int i6 = this.size - i4;
        if (i6 > 0) {
            int[] iArr = this.tags;
            int i7 = i4 + 1;
            System.arraycopy(iArr, i4, iArr, i7, i6);
            VR[] vrArr = this.vrs;
            System.arraycopy(vrArr, i4, vrArr, i7, i6);
            Object[] objArr = this.values;
            System.arraycopy(objArr, i4, objArr, i7, i6);
        }
        this.tags[i4] = i5;
        this.vrs[i4] = vr;
        this.values[i4] = obj;
        this.size++;
    }

    private boolean isOneOf(int i4, int[] iArr) {
        if (iArr == null) {
            return true;
        }
        for (int i5 : iArr) {
            if (i4 == i5) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRange(String str) {
        return str.indexOf(45) >= 0;
    }

    private boolean isValidValue(int[] iArr, int i4, int[] iArr2) {
        if (i4 != 0) {
            return iArr.length < i4 || isOneOf(iArr[i4 - 1], iArr2);
        }
        for (int i5 : iArr) {
            if (!isOneOf(i5, iArr2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean matches(java.lang.String r23, int r24, org.dcm4che3.data.VR r25, boolean r26, boolean r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.matches(java.lang.String, int, org.dcm4che3.data.VR, boolean, boolean, java.lang.String[]):boolean");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(objectInputStream.readInt());
        new DicomInputStream(objectInputStream, this.bigEndian ? UID.ExplicitVRBigEndianRetired : UID.ExplicitVRLittleEndian).readAttributes(this, -1, Tag.ItemDelimitationItem);
    }

    private Object set(int i4, VR vr, Object obj) {
        int iIndexForInsertOf = indexForInsertOf(i4);
        if (iIndexForInsertOf < 0) {
            insert((-iIndexForInsertOf) - 1, i4, vr, obj);
            return null;
        }
        Object[] objArr = this.values;
        Object obj2 = objArr[iIndexForInsertOf];
        this.vrs[iIndexForInsertOf] = vr;
        objArr[iIndexForInsertOf] = obj;
        return obj2;
    }

    private static String[] splitRange(String str) {
        String[] strArr = new String[2];
        int iIndexOf = str.indexOf(45);
        if (iIndexOf == -1) {
            strArr[1] = str;
            strArr[0] = str;
        } else {
            if (iIndexOf > 0) {
                strArr[0] = str.substring(0, iIndexOf);
            }
            if (iIndexOf < str.length() - 1) {
                strArr[1] = str.substring(iIndexOf + 1);
            }
        }
        return strArr;
    }

    private DateRange toDateRange(String str, String str2) {
        Date date;
        String[] strArrSplitRange = splitRange(str);
        String[] strArrSplitRange2 = splitRange(str2);
        DatePrecision datePrecision = new DatePrecision();
        String str3 = strArrSplitRange[0];
        Date date2 = null;
        if (str3 == null) {
            date = null;
        } else {
            VR vr = VR.DT;
            if (strArrSplitRange2[0] != null) {
                str3 = strArrSplitRange[0] + strArrSplitRange2[0];
            }
            date = vr.toDate(str3, this.tz, 0, false, null, datePrecision);
        }
        String str4 = strArrSplitRange[1];
        if (str4 != null) {
            VR vr2 = VR.DT;
            if (strArrSplitRange2[1] != null) {
                str4 = strArrSplitRange[1] + strArrSplitRange2[1];
            }
            date2 = vr2.toDate(str4, this.tz, 0, true, null, datePrecision);
        }
        return new DateRange(date, date2);
    }

    private static String toDateRangeString(String str, String str2) {
        if (str.equals(str2)) {
            return str;
        }
        return str + '-' + str2;
    }

    private static String[] toStrings(Object obj) {
        return obj instanceof String ? new String[]{(String) obj} : (String[]) obj;
    }

    private static Object toggleEndian(VR vr, Object obj, boolean z3) {
        return (z3 && (obj instanceof byte[])) ? vr.toggleEndian((byte[]) obj, true) : obj;
    }

    public static void unifyCharacterSets(Attributes... attributesArr) {
        if (attributesArr.length == 0) {
            return;
        }
        SpecificCharacterSet specificCharacterSetValueOf = SpecificCharacterSet.valueOf("ISO_IR 192");
        SpecificCharacterSet specificCharacterSet = attributesArr[0].getSpecificCharacterSet();
        if (specificCharacterSet.equals(specificCharacterSetValueOf)) {
            specificCharacterSetValueOf = specificCharacterSet;
        } else {
            for (int i4 = 1; i4 < attributesArr.length; i4++) {
                SpecificCharacterSet specificCharacterSet2 = attributesArr[i4].getSpecificCharacterSet();
                if (!specificCharacterSet2.equals(specificCharacterSet) && (!specificCharacterSet2.isASCII() || !specificCharacterSet.containsASCII())) {
                    if (!specificCharacterSet.isASCII() || !specificCharacterSet2.containsASCII()) {
                        break;
                    } else {
                        specificCharacterSet = specificCharacterSet2;
                    }
                }
            }
            specificCharacterSetValueOf = specificCharacterSet;
        }
        for (Attributes attributes : attributesArr) {
            SpecificCharacterSet specificCharacterSet3 = attributes.getSpecificCharacterSet();
            if (!specificCharacterSet3.equals(specificCharacterSetValueOf)) {
                if (!specificCharacterSet3.isASCII() || !specificCharacterSetValueOf.containsASCII()) {
                    attributes.decodeStringValuesUsingSpecificCharacterSet();
                }
                attributes.setString(Tag.SpecificCharacterSet, VR.CS, specificCharacterSetValueOf.toCodes());
            }
        }
    }

    private String updateTimeZoneDT(TimeZone timeZone, TimeZone timeZone2, String str) {
        char cCharAt;
        int length = str.length();
        if (length > 8 && ((cCharAt = str.charAt(length - 5)) == '+' || cCharAt == '-')) {
            return str;
        }
        try {
            DatePrecision datePrecision = new DatePrecision();
            return DateUtils.formatDT(timeZone2, DateUtils.parseDT(timeZone, str, false, datePrecision), datePrecision);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    private String updateTimeZoneTM(TimeZone timeZone, TimeZone timeZone2, String str) {
        try {
            DatePrecision datePrecision = new DatePrecision();
            return DateUtils.formatTM(timeZone2, DateUtils.parseTM(timeZone, str, false, datePrecision), datePrecision);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    private void updateTimezone(TimeZone timeZone, TimeZone timeZone2) {
        for (int i4 = 0; i4 < this.size; i4++) {
            Object obj = this.values[i4];
            if (obj instanceof Sequence) {
                for (Attributes attributes : (Sequence) obj) {
                    attributes.updateTimezone(attributes.getTimeZone(), timeZone2);
                    attributes.remove(Tag.TimezoneOffsetFromUTC);
                }
            } else {
                VR vr = this.vrs[i4];
                if (vr == VR.TM || vr == VR.DT) {
                    updateTimezone(timeZone, timeZone2, i4);
                }
            }
        }
    }

    private void updateVR(int i4, VR vr) {
        if (vr == this.vrs[i4]) {
            return;
        }
        Object obj = this.values[i4];
        if (obj == Value.NULL || (obj instanceof byte[]) || (vr.isStringType() && ((obj instanceof String) || (obj instanceof String[])))) {
            this.vrs[i4] = vr;
            return;
        }
        throw new IllegalStateException("value instanceof " + obj.getClass());
    }

    private ValidationResult validateCode(Attributes attributes, Code[] codeArr) {
        ValidationResult validationResultValidate = null;
        for (Code code : codeArr) {
            validationResultValidate = attributes.validate(IOD.valueOf(code));
            if (validationResultValidate.isValid()) {
                break;
            }
        }
        return validationResultValidate;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size);
        DicomOutputStream dicomOutputStream = new DicomOutputStream(objectOutputStream, this.bigEndian ? UID.ExplicitVRBigEndianRetired : UID.ExplicitVRLittleEndian);
        dicomOutputStream.writeDataset(null, this);
        dicomOutputStream.writeHeader(Tag.ItemDelimitationItem, null, 0);
    }

    public boolean accept(Visitor visitor, boolean z3) throws Exception {
        if (isEmpty()) {
            return true;
        }
        if (this.tags[0] >= 0) {
            return accept(visitor, z3, 0, this.size);
        }
        int i4 = -(indexOf(0) + 1);
        return accept(visitor, z3, i4, this.size) && accept(visitor, z3, 0, i4);
    }

    public boolean addAll(Attributes attributes) {
        return add(attributes, null, null, 0, 0, null, null, false, null);
    }

    public boolean addNotSelected(Attributes attributes, int... iArr) {
        return addNotSelected(attributes, iArr, 0, iArr.length);
    }

    public boolean addSelected(Attributes attributes, String str, int i4) {
        int iIndexOf = attributes.indexOf(str, i4);
        if (iIndexOf < 0) {
            return false;
        }
        Object obj = attributes.values[iIndexOf];
        if (obj instanceof Sequence) {
            set(str, i4, (Sequence) obj, (Attributes) null);
        } else if (obj instanceof Fragments) {
            set(str, i4, (Fragments) obj);
        } else {
            VR vr = attributes.vrs[iIndexOf];
            set(str, i4, vr, toggleEndian(vr, obj, this.bigEndian != attributes.bigEndian));
        }
        return true;
    }

    public final boolean bigEndian() {
        return this.bigEndian;
    }

    public int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3) {
        if (isEmpty()) {
            return 0;
        }
        this.groupLengths = dicomEncodingOptions.groupLength ? new int[countGroups()] : null;
        int iCalcLength = calcLength(dicomEncodingOptions, z3, getSpecificCharacterSet(), this.groupLengths);
        this.length = iCalcLength;
        return iCalcLength;
    }

    public Object clearProperty(String str) {
        Map<String, Object> map = this.properties;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    public boolean contains(int i4) {
        return indexOf(i4) >= 0;
    }

    public boolean containsValue(int i4) {
        return containsValue(null, i4);
    }

    public Attributes createFileMetaInformation(String str) {
        return createFileMetaInformation(getString(Tag.SOPInstanceUID, (String) null), getString(Tag.SOPClassUID, (String) null), str);
    }

    public int diff(Attributes attributes, int[] iArr, Attributes attributes2) {
        int i4 = 0;
        for (int i5 : iArr) {
            int iIndexOf = indexOf(i5);
            int iIndexOf2 = attributes.indexOf(i5);
            if (!equalValues(attributes, iIndexOf, iIndexOf2)) {
                if (attributes2 != null) {
                    Object obj = iIndexOf < 0 ? Value.NULL : this.values[iIndexOf];
                    if (obj instanceof Sequence) {
                        attributes2.set((String) null, i5, (Sequence) obj, (Attributes) null);
                    } else {
                        attributes2.set(i5, iIndexOf < 0 ? attributes.vrs[iIndexOf2] : this.vrs[iIndexOf], obj);
                    }
                }
                i4++;
            }
        }
        return i4;
    }

    public Sequence ensureSequence(int i4, int i5) {
        return ensureSequence(null, i4, i5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.size != attributes.size) {
            return false;
        }
        int i4 = 0;
        int iCreatorTagOf = 0;
        for (int i5 = 0; i5 < this.size; i5++) {
            int i6 = this.tags[i5];
            if (!TagUtils.isPrivateGroup(i6)) {
                if (i6 != attributes.tags[i5] || !equalValues(attributes, i5, i5)) {
                    return false;
                }
            } else if (TagUtils.isPrivateTag(i6)) {
                int iCreatorTagOf2 = TagUtils.creatorTagOf(i6);
                if (i4 != iCreatorTagOf2) {
                    iCreatorTagOf = attributes.creatorTagOf(privateCreatorOf(i6), i6, false);
                    if (iCreatorTagOf == -1) {
                        return false;
                    }
                    i4 = iCreatorTagOf2;
                }
                int iIndexOf = attributes.indexOf(TagUtils.toPrivateTag(iCreatorTagOf, i6));
                if (iIndexOf < 0 || !equalValues(attributes, i5, iIndexOf)) {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }

    public byte[] getBytes(int i4) throws IOException {
        return getBytes(null, i4);
    }

    public Date getDate(int i4) {
        return getDate(null, i4, null, 0, null, new DatePrecision());
    }

    public DateRange getDateRange(int i4) {
        return getDateRange(null, i4, null, null);
    }

    public Date[] getDates(int i4) {
        return getDates(null, i4, null, new DatePrecisions());
    }

    public TimeZone getDefaultTimeZone() {
        TimeZone timeZone = this.defaultTimeZone;
        if (timeZone != null) {
            return timeZone;
        }
        Attributes attributes = this.parent;
        return attributes != null ? attributes.getDefaultTimeZone() : TimeZone.getDefault();
    }

    public double getDouble(int i4, double d4) {
        return getDouble(null, i4, null, 0, d4);
    }

    public double[] getDoubles(int i4) {
        return getDoubles(null, i4, null);
    }

    public float getFloat(int i4, float f4) {
        return getFloat(null, i4, null, 0, f4);
    }

    public float[] getFloats(int i4) {
        return getFloats(null, i4, null);
    }

    public int getInt(int i4, int i5) {
        return getInt(null, i4, null, 0, i5);
    }

    public int[] getInts(int i4) {
        return getInts(null, i4, null);
    }

    public final long getItemPosition() {
        return this.itemPosition;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLevel() {
        if (isRoot()) {
            return 0;
        }
        return this.parent.getLevel() + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.dcm4che3.data.Attributes getModified(org.dcm4che3.data.Attributes r12, org.dcm4che3.data.Attributes r13) {
        /*
            r11 = this;
            if (r13 != 0) goto L9
            org.dcm4che3.data.Attributes r13 = new org.dcm4che3.data.Attributes
            int r0 = r12.size
            r13.<init>(r0)
        L9:
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = r0
            r6 = r1
            r4 = r2
            r5 = r4
        L10:
            int r7 = r12.size
            if (r3 >= r7) goto L8a
            int[] r7 = r12.tags
            r7 = r7[r3]
            r8 = 65536(0x10000, float:9.1835E-41)
            r8 = r8 & r7
            if (r8 == 0) goto L4b
            r8 = 65280(0xff00, float:9.1477E-41)
            r8 = r8 & r7
            if (r8 != 0) goto L25
            goto L87
        L25:
            int r8 = org.dcm4che3.util.TagUtils.creatorTagOf(r7)
            if (r4 == r8) goto L43
            int r4 = r12.indexOf(r8)
            if (r4 < 0) goto L41
            java.lang.Object r4 = r12.decodeStringValue(r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L41
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r11.creatorTagOf(r6, r7, r0)
            goto L42
        L41:
            r5 = r2
        L42:
            r4 = r8
        L43:
            if (r5 != r2) goto L46
            goto L87
        L46:
            int r7 = org.dcm4che3.util.TagUtils.toPrivateTag(r5, r7)
            goto L4c
        L4b:
            r6 = r1
        L4c:
            int r8 = r11.indexOf(r7)
            if (r8 >= 0) goto L53
            goto L87
        L53:
            java.lang.Object[] r9 = r11.values
            r9 = r9[r8]
            boolean r10 = r9 instanceof org.dcm4che3.data.Value
            if (r10 == 0) goto L65
            r10 = r9
            org.dcm4che3.data.Value r10 = (org.dcm4che3.data.Value) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L65
            goto L87
        L65:
            boolean r8 = r11.equalValues(r12, r8, r3)
            if (r8 == 0) goto L6c
            goto L87
        L6c:
            boolean r8 = r9 instanceof org.dcm4che3.data.Sequence
            if (r8 == 0) goto L76
            org.dcm4che3.data.Sequence r9 = (org.dcm4che3.data.Sequence) r9
            r13.set(r6, r7, r9, r1)
            goto L87
        L76:
            boolean r8 = r9 instanceof org.dcm4che3.data.Fragments
            if (r8 == 0) goto L80
            org.dcm4che3.data.Fragments r9 = (org.dcm4che3.data.Fragments) r9
            r13.set(r6, r7, r9)
            goto L87
        L80:
            org.dcm4che3.data.VR[] r8 = r11.vrs
            r8 = r8[r3]
            r13.set(r6, r7, r8, r9)
        L87:
            int r3 = r3 + 1
            goto L10
        L8a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.getModified(org.dcm4che3.data.Attributes, org.dcm4che3.data.Attributes):org.dcm4che3.data.Attributes");
    }

    public Attributes getNestedDataset(int i4) {
        return getNestedDataset(null, i4, 0);
    }

    public final Attributes getParent() {
        return this.parent;
    }

    public String getPrivateCreator(int i4) {
        if (TagUtils.isPrivateTag(i4)) {
            return getString(TagUtils.creatorTagOf(i4), (String) null);
        }
        return null;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public Object getProperty(String str, Object obj) {
        Object obj2;
        Map<String, Object> map = this.properties;
        return (map == null || (obj2 = map.get(str)) == null) ? obj : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.dcm4che3.data.Attributes getRemovedOrModified(org.dcm4che3.data.Attributes r12) {
        /*
            r11 = this;
            org.dcm4che3.data.Attributes r0 = new org.dcm4che3.data.Attributes
            int r1 = r11.size
            r0.<init>(r1)
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = r1
            r4 = r2
            r6 = r4
            r7 = r3
        Le:
            int r8 = r11.size
            if (r4 >= r8) goto L8d
            int[] r8 = r11.tags
            r8 = r8[r4]
            r9 = 65536(0x10000, float:9.1835E-41)
            r9 = r9 & r8
            if (r9 == 0) goto L4c
            r9 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r8
            if (r9 != 0) goto L23
            goto L8a
        L23:
            int r9 = org.dcm4che3.util.TagUtils.creatorTagOf(r8)
            if (r5 == r9) goto L42
            int r5 = r11.indexOf(r9)
            if (r5 < 0) goto L3f
            java.lang.Object r5 = r11.decodeStringValue(r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L3f
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r12.creatorTagOf(r7, r8, r2)
            goto L41
        L3f:
            r6 = r1
            r7 = r3
        L41:
            r5 = r9
        L42:
            if (r7 != 0) goto L45
            goto L8a
        L45:
            if (r6 == r1) goto L4e
            int r8 = org.dcm4che3.util.TagUtils.toPrivateTag(r6, r8)
            goto L4e
        L4c:
            r6 = r2
            r7 = r3
        L4e:
            java.lang.Object[] r9 = r11.values
            r9 = r9[r4]
            boolean r10 = r9 instanceof org.dcm4che3.data.Value
            if (r10 == 0) goto L60
            r10 = r9
            org.dcm4che3.data.Value r10 = (org.dcm4che3.data.Value) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L60
            goto L8a
        L60:
            if (r6 < 0) goto L6f
            int r10 = r12.indexOf(r8)
            if (r10 < 0) goto L6f
            boolean r10 = r11.equalValues(r12, r4, r10)
            if (r10 == 0) goto L6f
            goto L8a
        L6f:
            boolean r10 = r9 instanceof org.dcm4che3.data.Sequence
            if (r10 == 0) goto L79
            org.dcm4che3.data.Sequence r9 = (org.dcm4che3.data.Sequence) r9
            r0.set(r7, r8, r9, r3)
            goto L8a
        L79:
            boolean r10 = r9 instanceof org.dcm4che3.data.Fragments
            if (r10 == 0) goto L83
            org.dcm4che3.data.Fragments r9 = (org.dcm4che3.data.Fragments) r9
            r0.set(r7, r8, r9)
            goto L8a
        L83:
            org.dcm4che3.data.VR[] r10 = r11.vrs
            r10 = r10[r4]
            r0.set(r7, r8, r10, r9)
        L8a:
            int r4 = r4 + 1
            goto Le
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.getRemovedOrModified(org.dcm4che3.data.Attributes):org.dcm4che3.data.Attributes");
    }

    public byte[] getSafeBytes(int i4) {
        return getSafeBytes(null, i4);
    }

    public Sequence getSequence(int i4) {
        return getSequence(null, i4);
    }

    public SpecificCharacterSet getSpecificCharacterSet() {
        SpecificCharacterSet defaultCharacterSet;
        SpecificCharacterSet specificCharacterSet = this.cs;
        if (specificCharacterSet != null) {
            return specificCharacterSet;
        }
        if (this.containsSpecificCharacterSet) {
            defaultCharacterSet = SpecificCharacterSet.valueOf(getStrings(null, Tag.SpecificCharacterSet, VR.CS));
        } else {
            Attributes attributes = this.parent;
            if (attributes != null) {
                return attributes.getSpecificCharacterSet();
            }
            defaultCharacterSet = SpecificCharacterSet.getDefaultCharacterSet();
        }
        this.cs = defaultCharacterSet;
        return this.cs;
    }

    public String getString(int i4) {
        return getString(null, i4, null, 0, null);
    }

    public String[] getStrings(int i4) {
        return getStrings(null, i4, null);
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this.tz;
        if (timeZone != null) {
            return timeZone;
        }
        if (this.containsTimezoneOffsetFromUTC) {
            String string = getString(Tag.TimezoneOffsetFromUTC);
            if (string != null) {
                try {
                    this.tz = DateUtils.timeZone(string);
                } catch (IllegalArgumentException e4) {
                    LOG.info(e4.getMessage());
                }
            }
        } else {
            Attributes attributes = this.parent;
            if (attributes != null) {
                return attributes.getTimeZone();
            }
            this.tz = getDefaultTimeZone();
        }
        return this.tz;
    }

    public VR getVR(int i4) {
        return getVR(null, i4);
    }

    public Object getValue(int i4) {
        return getValue(null, i4, null);
    }

    public int hashCode() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.size; i5++) {
            int i6 = this.tags[i5];
            if (!TagUtils.isPrivateGroup(i6)) {
                i4 = (i4 * 31) + i6;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void internalizeStringValues(boolean r7) {
        /*
            r6 = this;
            org.dcm4che3.data.SpecificCharacterSet r0 = r6.getSpecificCharacterSet()
            r1 = 0
            r2 = r1
        L6:
            java.lang.Object[] r3 = r6.values
            int r4 = r3.length
            if (r2 >= r4) goto L67
            org.dcm4che3.data.VR[] r4 = r6.vrs
            r4 = r4[r2]
            r3 = r3[r2]
            boolean r5 = r4.isStringType()
            if (r5 == 0) goto L4a
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L26
            if (r7 != 0) goto L1e
            goto L64
        L1e:
            byte[] r3 = (byte[]) r3
            boolean r5 = r6.bigEndian
            java.lang.Object r3 = r4.toStrings(r3, r5, r0)
        L26:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L35
            java.lang.Object[] r4 = r6.values
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            r4[r2] = r3
            goto L64
        L35:
            boolean r4 = r3 instanceof java.lang.String[]
            if (r4 == 0) goto L64
            java.lang.String[] r3 = (java.lang.String[]) r3
            r4 = r1
        L3c:
            int r5 = r3.length
            if (r4 >= r5) goto L64
            r5 = r3[r4]
            java.lang.String r5 = r5.intern()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L3c
        L4a:
            boolean r4 = r3 instanceof org.dcm4che3.data.Sequence
            if (r4 == 0) goto L64
            org.dcm4che3.data.Sequence r3 = (org.dcm4che3.data.Sequence) r3
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            org.dcm4che3.data.Attributes r4 = (org.dcm4che3.data.Attributes) r4
            r4.internalizeStringValues(r7)
            goto L54
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.internalizeStringValues(boolean):void");
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isRoot() {
        return this.parent == null;
    }

    public Fragments newFragments(int i4, VR vr, int i5) {
        return newFragments(null, i4, vr, i5);
    }

    public Sequence newSequence(int i4, int i5) {
        return newSequence(null, i4, i5);
    }

    public String privateCreatorOf(int i4) {
        Object objDecodeStringValue;
        if (!TagUtils.isPrivateTag(i4)) {
            return null;
        }
        int iIndexOf = indexOf(((i4 >>> 8) & 255) | ((-65536) & i4));
        if (iIndexOf >= 0) {
            VR vr = this.vrs[iIndexOf];
            VR vr2 = VR.LO;
            if (vr == vr2) {
                Object obj = this.values[iIndexOf];
                Value value = Value.NULL;
                if (obj == value || (objDecodeStringValue = decodeStringValue(iIndexOf)) == value) {
                    return null;
                }
                return vr2.toString(objDecodeStringValue, false, 0, null);
            }
        }
        return null;
    }

    public Object remove(int i4) {
        return remove(null, i4);
    }

    public int removeAllBulkData() {
        int i4 = 0;
        int iRemoveAllBulkData = 0;
        while (true) {
            int i5 = this.size;
            if (i4 >= i5) {
                return iRemoveAllBulkData;
            }
            Object obj = this.values[i4];
            if (obj instanceof BulkData) {
                int i6 = i4 + 1;
                int i7 = i5 - i6;
                int[] iArr = this.tags;
                System.arraycopy(iArr, i6, iArr, i4, i7);
                VR[] vrArr = this.vrs;
                System.arraycopy(vrArr, i6, vrArr, i4, i7);
                Object[] objArr = this.values;
                System.arraycopy(objArr, i6, objArr, i4, i7);
                i4--;
                this.size--;
                iRemoveAllBulkData++;
            } else if (obj instanceof Sequence) {
                Iterator<Attributes> it = ((Sequence) obj).iterator();
                while (it.hasNext()) {
                    iRemoveAllBulkData += it.next().removeAllBulkData();
                }
            }
            i4++;
        }
    }

    public int removePrivateAttributes() {
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5;
            while (TagUtils.isPrivateGroup(this.tags[i6]) && i6 < i4) {
                i6++;
            }
            if (i6 > i5) {
                int i7 = i4 - i6;
                if (i7 > 0) {
                    int[] iArr = this.tags;
                    System.arraycopy(iArr, i6, iArr, i5, i7);
                    VR[] vrArr = this.vrs;
                    System.arraycopy(vrArr, i6, vrArr, i5, i7);
                    Object[] objArr = this.values;
                    System.arraycopy(objArr, i6, objArr, i5, i7);
                }
                i4 -= i6 - i5;
            }
        }
        int i8 = this.size;
        int i9 = i8 - i4;
        if (i9 > 0) {
            Arrays.fill(this.tags, i4, i8, 0);
            Arrays.fill(this.vrs, i4, this.size, (Object) null);
            Arrays.fill(this.values, i4, this.size, (Object) null);
            this.size = i4;
        }
        return i9;
    }

    public Object setBytes(int i4, VR vr, byte[] bArr) {
        return setBytes(null, i4, vr, bArr);
    }

    public Object setDate(int i4, VR vr, DatePrecision datePrecision, Date... dateArr) {
        return setDate(null, i4, vr, datePrecision, dateArr);
    }

    public Object setDateRange(int i4, VR vr, DateRange dateRange) {
        return setDateRange(null, i4, vr, dateRange);
    }

    public void setDefaultTimeZone(TimeZone timeZone) {
        this.defaultTimeZone = timeZone;
    }

    public Object setDouble(int i4, VR vr, double... dArr) {
        return setDouble(null, i4, vr, dArr);
    }

    public Object setFloat(int i4, VR vr, float... fArr) {
        return setFloat(null, i4, vr, fArr);
    }

    public Object setInt(int i4, VR vr, int... iArr) {
        return setInt(null, i4, vr, iArr);
    }

    public final void setItemPosition(long j4) {
        this.itemPosition = j4;
    }

    public Object setNull(int i4, VR vr) {
        return setNull(null, i4, vr);
    }

    public Attributes setParent(Attributes attributes) {
        if (attributes != null) {
            if (attributes.bigEndian != this.bigEndian) {
                throw new IllegalArgumentException("Endian of Item must match Endian of parent Data Set");
            }
            if (this.parent != null) {
                throw new IllegalArgumentException("Item already contained by Sequence");
            }
            if (!this.containsSpecificCharacterSet) {
                this.cs = null;
            }
            if (!this.containsTimezoneOffsetFromUTC) {
                this.tz = null;
            }
        }
        this.parent = attributes;
        return this;
    }

    public void setProperties(Map<String, Object> map) {
        this.properties = map;
    }

    public Object setProperty(String str, Object obj) {
        if (this.properties == null) {
            this.properties = new HashMap();
        }
        return this.properties.put(str, obj);
    }

    public void setSpecificCharacterSet(String... strArr) {
        decodeStringValuesUsingSpecificCharacterSet();
        setString(Tag.SpecificCharacterSet, VR.CS, strArr);
    }

    public Object setString(int i4, VR vr, String str) {
        return setString((String) null, i4, vr, str);
    }

    public void setTimezone(TimeZone timeZone) {
        updateTimezone(getTimeZone(), timeZone);
        if (timeZone.useDaylightTime()) {
            remove(Tag.TimezoneOffsetFromUTC);
            setDefaultTimeZone(timeZone);
        } else {
            setString(Tag.TimezoneOffsetFromUTC, VR.SH, DateUtils.formatTimezoneOffsetFromUTC(timeZone));
        }
        this.tz = null;
    }

    public void setTimezoneOffsetFromUTC(String str) {
        updateTimezone(getTimeZone(), DateUtils.timeZone(str));
        setString(Tag.TimezoneOffsetFromUTC, VR.SH, str);
    }

    public Object setValue(int i4, VR vr, Object obj) {
        return setValue(null, i4, vr, obj);
    }

    public final int size() {
        return this.size;
    }

    public int[] tags() {
        return Arrays.copyOf(this.tags, this.size);
    }

    public boolean testUpdate(UpdatePolicy updatePolicy, Attributes attributes, Attributes attributes2) {
        return add(attributes, null, null, 0, 0, null, updatePolicy, true, attributes2);
    }

    public boolean testUpdateSelected(UpdatePolicy updatePolicy, Attributes attributes, Attributes attributes2, int... iArr) {
        return add(attributes, iArr, null, 0, iArr.length, null, updatePolicy, true, attributes2);
    }

    public String toString() {
        return toString(50, 78);
    }

    public StringBuilder toStringBuilder(int i4, int i5, StringBuilder sb) {
        if (appendAttributes(i4, i5, sb, a.f11071l) > i4) {
            sb.append("...\n");
        }
        return sb;
    }

    public void trimToSize() {
        trimToSize(false);
    }

    public boolean update(UpdatePolicy updatePolicy, Attributes attributes, Attributes attributes2) {
        return add(attributes, null, null, 0, 0, null, updatePolicy, false, attributes2);
    }

    public boolean updateSelected(UpdatePolicy updatePolicy, Attributes attributes, Attributes attributes2, int... iArr) {
        return add(attributes, iArr, null, 0, iArr.length, null, updatePolicy, false, attributes2);
    }

    public ValidationResult validate(IOD iod) {
        ValidationResult validationResult = new ValidationResult();
        HashMap map = new HashMap();
        Iterator<IOD.DataElement> it = iod.iterator();
        while (it.hasNext()) {
            validate(it.next(), validationResult, map);
        }
        return validationResult;
    }

    public void writeGroupTo(DicomOutputStream dicomOutputStream, int i4) throws IOException {
        if (isEmpty()) {
            throw new IllegalStateException("No attributes");
        }
        checkInGroup(0, i4);
        checkInGroup(this.size - 1, i4);
        SpecificCharacterSet specificCharacterSet = getSpecificCharacterSet();
        dicomOutputStream.writeGroupLength(i4, calcLength(dicomOutputStream.getEncodingOptions(), dicomOutputStream.isExplicitVR(), specificCharacterSet, null));
        writeTo(dicomOutputStream, specificCharacterSet, 0, this.size, 0);
    }

    public void writeItemTo(DicomOutputStream dicomOutputStream) throws IOException {
        int encodedItemLength = getEncodedItemLength(dicomOutputStream.getEncodingOptions(), dicomOutputStream.isExplicitVR());
        dicomOutputStream.writeHeader(Tag.Item, null, encodedItemLength);
        writeTo(dicomOutputStream);
        if (encodedItemLength == -1) {
            dicomOutputStream.writeHeader(Tag.ItemDelimitationItem, null, 0);
        }
    }

    public void writeTo(DicomOutputStream dicomOutputStream) throws IOException {
        int i4;
        int i5;
        int i6;
        Attributes attributes;
        DicomOutputStream dicomOutputStream2;
        SpecificCharacterSet specificCharacterSet;
        if (isEmpty()) {
            return;
        }
        if (this.groupLengths == null && dicomOutputStream.getEncodingOptions().groupLength) {
            throw new IllegalStateException("groupLengths not initialized by calcLength()");
        }
        SpecificCharacterSet specificCharacterSet2 = getSpecificCharacterSet();
        if (this.tags[0] < 0) {
            int i7 = -(indexOf(0) + 1);
            attributes = this;
            dicomOutputStream2 = dicomOutputStream;
            specificCharacterSet = specificCharacterSet2;
            attributes.writeTo(dicomOutputStream2, specificCharacterSet, i7, this.size, this.groupLengthIndex0);
            i4 = 0;
            i6 = 0;
            i5 = i7;
        } else {
            i4 = 0;
            i5 = this.size;
            i6 = 0;
            attributes = this;
            dicomOutputStream2 = dicomOutputStream;
            specificCharacterSet = specificCharacterSet2;
        }
        attributes.writeTo(dicomOutputStream2, specificCharacterSet, i4, i5, i6);
    }

    public Attributes(int i4) {
        this(false, i4);
    }

    private boolean accept(Visitor visitor, boolean z3, int i4, int i5) throws Exception {
        while (i4 < i5) {
            if (!visitor.visit(this, this.tags[i4], this.vrs[i4], this.values[i4])) {
                return false;
            }
            if (z3) {
                Object obj = this.values[i4];
                if (obj instanceof Sequence) {
                    int i6 = 0;
                    for (Attributes attributes : (Sequence) obj) {
                        boolean z4 = visitor instanceof SequenceVisitor;
                        if (z4) {
                            ((SequenceVisitor) visitor).startItem(this.tags[i4], i6);
                        }
                        if (!attributes.accept(visitor, true)) {
                            return false;
                        }
                        if (z4) {
                            ((SequenceVisitor) visitor).endItem();
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            }
            i4++;
        }
        return true;
    }

    private int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, SpecificCharacterSet specificCharacterSet, int[] iArr) {
        int length;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < this.size; i7++) {
            VR vr = this.vrs[i7];
            Object bytes = this.values[i7];
            int iHeaderLength = z3 ? vr.headerLength() : 8;
            if (bytes instanceof Value) {
                length = ((Value) bytes).calcLength(dicomEncodingOptions, z3, vr);
            } else {
                if (!(bytes instanceof byte[])) {
                    Object[] objArr = this.values;
                    bytes = vr.toBytes(bytes, specificCharacterSet);
                    objArr[i7] = bytes;
                }
                length = (((byte[]) bytes).length + 1) & (-2);
            }
            int i8 = iHeaderLength + length;
            i6 += i8;
            if (iArr != null) {
                int iGroupLengthTagOf = TagUtils.groupLengthTagOf(this.tags[i7]);
                if (i4 != iGroupLengthTagOf) {
                    i5++;
                    i6 += 12;
                    i4 = iGroupLengthTagOf;
                }
                iArr[i5] = iArr[i5] + i8;
            }
        }
        return i6;
    }

    public static Attributes createFileMetaInformation(String str, String str2, String str3) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Missing SOP Instance UID");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("Missing SOP Class UID");
        }
        if (str3 == null || str3.isEmpty()) {
            throw new IllegalArgumentException("Missing Transfer Syntax UID");
        }
        Attributes attributes = new Attributes(6);
        attributes.setBytes(Tag.FileMetaInformationVersion, VR.OB, new byte[]{0, 1});
        VR vr = VR.UI;
        attributes.setString(Tag.MediaStorageSOPClassUID, vr, str2);
        attributes.setString(Tag.MediaStorageSOPInstanceUID, vr, str);
        attributes.setString(Tag.TransferSyntaxUID, vr, str3);
        attributes.setString(Tag.ImplementationClassUID, vr, Implementation.getClassUID());
        attributes.setString(Tag.ImplementationVersionName, VR.SH, Implementation.getVersionName());
        return attributes;
    }

    private static boolean equalPNValues(String str, String str2) {
        return new PersonName(str, true).equals(new PersonName(str2, true));
    }

    private int indexOf(String str, int i4) {
        if (str != null) {
            int iCreatorTagOf = creatorTagOf(str, i4, false);
            if (iCreatorTagOf == -1) {
                return -1;
            }
            i4 = TagUtils.toPrivateTag(iCreatorTagOf, i4);
        }
        return indexOf(i4);
    }

    private static boolean isEmpty(Object obj) {
        return (obj instanceof Value) && ((Value) obj).isEmpty();
    }

    private <T> boolean isOneOf(Object obj, T[] tArr) {
        if (tArr == null) {
            return true;
        }
        for (T t4 : tArr) {
            if (obj.equals(t4)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidValue(String[] strArr, int i4, String[] strArr2) {
        if (i4 != 0) {
            return strArr.length < i4 || isOneOf(strArr[i4 - 1], strArr2);
        }
        for (String str : strArr) {
            if (!isOneOf(str, strArr2)) {
                return false;
            }
        }
        return true;
    }

    private boolean matches(String str, int i4, boolean z3, boolean z4, Sequence sequence) {
        int size = sequence.size();
        if (size > 1) {
            throw new IllegalArgumentException("Keys contain Sequence " + TagUtils.toString(i4) + " with " + size + " Items");
        }
        Attributes attributes = sequence.get(0);
        if (attributes.isEmpty()) {
            return true;
        }
        Object value = getValue(str, i4);
        if (value == null || isEmpty(value)) {
            return z4;
        }
        if (value instanceof Sequence) {
            Iterator<Attributes> it = ((Sequence) value).iterator();
            while (it.hasNext()) {
                if (it.next().matches(attributes, z3, z4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Object set(String str, int i4, VR vr, Object obj) {
        if (vr == null) {
            throw new NullPointerException("vr");
        }
        if (str != null) {
            i4 = TagUtils.toPrivateTag(creatorTagOf(str, i4, true), i4);
        }
        if (TagUtils.isGroupLength(i4)) {
            return null;
        }
        Object obj2 = set(i4, vr, obj);
        if (i4 == 524293) {
            this.containsSpecificCharacterSet = true;
            this.cs = null;
        } else if (i4 == 524801) {
            this.containsTimezoneOffsetFromUTC = obj != Value.NULL;
            this.tz = null;
        }
        return obj2;
    }

    private DateRange toDateRange(String str, VR vr) {
        String[] strArrSplitRange = splitRange(str);
        TimeZone timeZone = getTimeZone();
        DatePrecision datePrecision = new DatePrecision();
        String str2 = strArrSplitRange[0];
        Date date = str2 == null ? null : vr.toDate(str2, timeZone, 0, false, null, datePrecision);
        String str3 = strArrSplitRange[1];
        return new DateRange(date, str3 != null ? vr.toDate(str3, timeZone, 0, true, null, datePrecision) : null);
    }

    private void updateTimezone(TimeZone timeZone, TimeZone timeZone2, int i4) {
        String[] strArrSplitRange;
        Object objDecodeStringValue = decodeStringValue(i4);
        Value value = Value.NULL;
        if (objDecodeStringValue == value) {
            return;
        }
        int i5 = this.tags[i4];
        if (this.vrs[i4] == VR.DT) {
            if (!(objDecodeStringValue instanceof String[])) {
                this.values[i4] = updateTimeZoneDT(timeZone, timeZone2, (String) objDecodeStringValue);
                return;
            }
            String[] strArr = (String[]) objDecodeStringValue;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                strArr[i6] = updateTimeZoneDT(timeZone, timeZone2, strArr[i6]);
            }
            return;
        }
        int iDaTagOf = ElementDictionary.getElementDictionary(privateCreatorOf(i5)).daTagOf(i5);
        int iIndexOf = iDaTagOf != 0 ? indexOf(iDaTagOf) : -1;
        Object objDecodeStringValue2 = iIndexOf >= 0 ? decodeStringValue(iIndexOf) : value;
        if (objDecodeStringValue instanceof String[]) {
            String[] strArr2 = (String[]) objDecodeStringValue;
            if (!(objDecodeStringValue2 instanceof String[])) {
                if (objDecodeStringValue2 == value) {
                    strArr2[0] = updateTimeZoneTM(timeZone, timeZone2, strArr2[0]);
                } else {
                    String strUpdateTimeZoneDT = updateTimeZoneDT(timeZone, timeZone2, ((String) objDecodeStringValue2) + strArr2[0]);
                    this.values[iIndexOf] = strUpdateTimeZoneDT.substring(0, 8);
                    strArr2[0] = strUpdateTimeZoneDT.substring(8);
                }
                for (int i7 = 1; i7 < strArr2.length; i7++) {
                    strArr2[i7] = updateTimeZoneTM(timeZone, timeZone2, strArr2[i7]);
                }
                return;
            }
            String[] strArr3 = (String[]) objDecodeStringValue2;
            for (int i8 = 0; i8 < strArr2.length; i8++) {
                if (i8 < strArr3.length) {
                    String strUpdateTimeZoneDT2 = updateTimeZoneDT(timeZone, timeZone2, strArr3[i8] + strArr2[i8]);
                    strArr3[i8] = strUpdateTimeZoneDT2.substring(0, 8);
                    strArr2[i8] = strUpdateTimeZoneDT2.substring(8);
                } else {
                    strArr2[i8] = updateTimeZoneTM(timeZone, timeZone2, strArr2[i8]);
                }
            }
            return;
        }
        if (objDecodeStringValue2 instanceof String[]) {
            String[] strArr4 = (String[]) objDecodeStringValue2;
            String strUpdateTimeZoneDT3 = updateTimeZoneDT(timeZone, timeZone2, strArr4[0] + ((String) objDecodeStringValue));
            strArr4[0] = strUpdateTimeZoneDT3.substring(0, 8);
            this.values[i4] = strUpdateTimeZoneDT3.substring(8);
            return;
        }
        String str = (String) objDecodeStringValue;
        if (isRange(str)) {
            strArrSplitRange = splitRange(str);
            if (strArrSplitRange[0] == null) {
                strArrSplitRange[0] = "000000.000";
            }
            if (strArrSplitRange[1] == null) {
                strArrSplitRange[1] = "235959.999";
            }
        } else {
            strArrSplitRange = null;
        }
        if (objDecodeStringValue2 == value) {
            if (strArrSplitRange == null) {
                this.values[i4] = updateTimeZoneTM(timeZone, timeZone2, str);
                return;
            }
            strArrSplitRange[0] = updateTimeZoneTM(timeZone, timeZone2, strArrSplitRange[0]);
            String strUpdateTimeZoneTM = updateTimeZoneTM(timeZone, timeZone2, strArrSplitRange[1]);
            strArrSplitRange[1] = strUpdateTimeZoneTM;
            this.values[i4] = toDateRangeString(strArrSplitRange[0], strUpdateTimeZoneTM);
            return;
        }
        if (strArrSplitRange == null) {
            String strUpdateTimeZoneDT4 = updateTimeZoneDT(timeZone, timeZone2, ((String) objDecodeStringValue2) + str);
            this.values[iIndexOf] = strUpdateTimeZoneDT4.substring(0, 8);
            this.values[i4] = strUpdateTimeZoneDT4.substring(8);
            return;
        }
        String[] strArrSplitRange2 = splitRange((String) objDecodeStringValue2);
        if (strArrSplitRange2[0] == null) {
            strArrSplitRange2[0] = a.f11071l;
            strArrSplitRange[0] = updateTimeZoneTM(timeZone, timeZone2, strArrSplitRange[0]);
        } else {
            String strUpdateTimeZoneDT5 = updateTimeZoneDT(timeZone, timeZone2, strArrSplitRange2[0] + strArrSplitRange[0]);
            strArrSplitRange2[0] = strUpdateTimeZoneDT5.substring(0, 8);
            strArrSplitRange[0] = strUpdateTimeZoneDT5.substring(8);
        }
        if (strArrSplitRange2[1] == null) {
            strArrSplitRange2[1] = a.f11071l;
            strArrSplitRange[1] = updateTimeZoneTM(timeZone, timeZone2, strArrSplitRange[1]);
        } else {
            String strUpdateTimeZoneDT6 = updateTimeZoneDT(timeZone, timeZone2, strArrSplitRange2[1] + strArrSplitRange[1]);
            strArrSplitRange2[1] = strUpdateTimeZoneDT6.substring(0, 8);
            strArrSplitRange[1] = strUpdateTimeZoneDT6.substring(8);
        }
        this.values[iIndexOf] = toDateRangeString(strArrSplitRange2[0], strArrSplitRange2[1]);
        this.values[i4] = toDateRangeString(strArrSplitRange[0], strArrSplitRange[1]);
    }

    private void writeTo(DicomOutputStream dicomOutputStream, SpecificCharacterSet specificCharacterSet, int i4, int i5, int i6) throws IOException {
        int iGroupLengthTagOf;
        boolean z3 = this.groupLengths != null;
        int i7 = -1;
        while (i4 < i5) {
            int i8 = this.tags[i4];
            if (z3 && i7 != (iGroupLengthTagOf = TagUtils.groupLengthTagOf(i8))) {
                dicomOutputStream.writeGroupLength(iGroupLengthTagOf, this.groupLengths[i6]);
                i7 = iGroupLengthTagOf;
                i6++;
            }
            dicomOutputStream.writeAttribute(i8, this.vrs[i4], this.values[i4], specificCharacterSet);
            i4++;
        }
    }

    public boolean addNotSelected(Attributes attributes, int[] iArr, int i4, int i5) {
        return add(attributes, null, iArr, i4, i5, null, null, false, null);
    }

    public boolean addSelected(Attributes attributes, Attributes attributes2) {
        return add(attributes, attributes2.tags, null, 0, attributes2.size, attributes2, null, false, null);
    }

    public boolean contains(String str, int i4) {
        return indexOf(str, i4) >= 0;
    }

    public boolean containsValue(String str, int i4) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf >= 0) {
            if (!isEmpty(this.vrs[iIndexOf].isStringType() ? decodeStringValue(iIndexOf) : this.values[iIndexOf])) {
                return true;
            }
        }
        return false;
    }

    public Sequence ensureSequence(String str, int i4, int i5) {
        if (str != null) {
            i4 = TagUtils.toPrivateTag(creatorTagOf(str, i4, true), i4);
        }
        int iIndexOf = indexOf(i4);
        if (iIndexOf < 0) {
            Sequence sequence = new Sequence(this, i5);
            insert((-iIndexOf) - 1, i4, VR.SQ, sequence);
            return sequence;
        }
        Object[] objArr = this.values;
        Object obj = objArr[iIndexOf];
        if (obj instanceof Sequence) {
            return (Sequence) obj;
        }
        Sequence sequence2 = new Sequence(this, i5);
        objArr[iIndexOf] = sequence2;
        return sequence2;
    }

    public byte[] getBytes(String str, int i4) throws IOException {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object obj = this.values[iIndexOf];
        VR vr = this.vrs[iIndexOf];
        try {
            return obj instanceof Value ? ((Value) obj).toBytes(vr, this.bigEndian) : vr.toBytes(obj, getSpecificCharacterSet(vr));
        } catch (UnsupportedOperationException unused) {
            LOG.info("Attempt to access {} {} as bytes", TagUtils.toString(i4), vr);
            return null;
        }
    }

    public Date getDate(int i4, int i5) {
        return getDate(null, i4, null, i5, null, new DatePrecision());
    }

    public DateRange getDateRange(int i4, DateRange dateRange) {
        return getDateRange(null, i4, null, dateRange);
    }

    public Date[] getDates(int i4, DatePrecisions datePrecisions) {
        return getDates(null, i4, null, datePrecisions);
    }

    public double getDouble(int i4, int i5, double d4) {
        return getDouble(null, i4, null, i5, d4);
    }

    public double[] getDoubles(String str, int i4) {
        return getDoubles(str, i4, null);
    }

    public float getFloat(int i4, int i5, float f4) {
        return getFloat(null, i4, null, i5, f4);
    }

    public float[] getFloats(String str, int i4) {
        return getFloats(str, i4, null);
    }

    public int getInt(int i4, int i5, int i6) {
        return getInt(null, i4, null, i5, i6);
    }

    public int[] getInts(String str, int i4) {
        return getInts(str, i4, null);
    }

    public Attributes getNestedDataset(int i4, int i5) {
        return getNestedDataset(null, i4, i5);
    }

    public byte[] getSafeBytes(String str, int i4) {
        try {
            return getBytes(str, i4);
        } catch (IOException e4) {
            LOG.info("Access " + TagUtils.toString(i4) + " throws i/o exception", (Throwable) e4);
            return null;
        }
    }

    public Sequence getSequence(String str, int i4) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Object obj = objArr[iIndexOf];
        if (obj == Value.NULL) {
            Sequence sequence = new Sequence(this, 0);
            objArr[iIndexOf] = sequence;
            return sequence;
        }
        if (obj instanceof Sequence) {
            return (Sequence) obj;
        }
        return null;
    }

    public SpecificCharacterSet getSpecificCharacterSet(VR vr) {
        return vr.useSpecificCharacterSet() ? getSpecificCharacterSet() : SpecificCharacterSet.ASCII;
    }

    public String getString(int i4, int i5) {
        return getString(null, i4, null, i5, null);
    }

    public String[] getStrings(String str, int i4) {
        return getStrings(str, i4, null);
    }

    public VR getVR(String str, int i4) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        return this.vrs[iIndexOf];
    }

    public Object getValue(int i4, VR.Holder holder) {
        return getValue(null, i4, holder);
    }

    public Fragments newFragments(String str, int i4, VR vr, int i5) {
        Fragments fragments = new Fragments(vr, this.bigEndian, i5);
        set(str, i4, vr, fragments);
        return fragments;
    }

    public Sequence newSequence(String str, int i4, int i5) {
        Sequence sequence = new Sequence(this, i5);
        set(str, i4, VR.SQ, sequence);
        return sequence;
    }

    public Object remove(String str, int i4) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object obj = this.values[iIndexOf];
        int i5 = (this.size - iIndexOf) - 1;
        if (i5 > 0) {
            int[] iArr = this.tags;
            int i6 = iIndexOf + 1;
            System.arraycopy(iArr, i6, iArr, iIndexOf, i5);
            VR[] vrArr = this.vrs;
            System.arraycopy(vrArr, i6, vrArr, iIndexOf, i5);
            Object[] objArr = this.values;
            System.arraycopy(objArr, i6, objArr, iIndexOf, i5);
        }
        Object[] objArr2 = this.values;
        int i7 = this.size - 1;
        this.size = i7;
        objArr2[i7] = null;
        if (i4 == 524293) {
            this.containsSpecificCharacterSet = false;
            this.cs = null;
        } else if (i4 == 524801) {
            this.containsTimezoneOffsetFromUTC = false;
            this.tz = null;
        }
        return obj;
    }

    public int removePrivateAttributes(String str, int i4) {
        int iCreatorIndexOf = creatorIndexOf(str, i4);
        if (iCreatorIndexOf < 0) {
            return 0;
        }
        int i5 = this.tags[iCreatorIndexOf];
        int i6 = ((i5 & 255) << 8) | ((-65536) & i5);
        int i7 = iCreatorIndexOf + 1;
        int i8 = i7;
        while (i8 < this.size && this.tags[i8] < i6) {
            i8++;
        }
        int i9 = i8;
        while (i9 < this.size && (this.tags[i9] & u.f12223u) == i6) {
            i9++;
        }
        int i10 = i8 - i7;
        if (i10 > 0) {
            int[] iArr = this.tags;
            System.arraycopy(iArr, i7, iArr, iCreatorIndexOf, i10);
            VR[] vrArr = this.vrs;
            System.arraycopy(vrArr, i7, vrArr, iCreatorIndexOf, i10);
            Object[] objArr = this.values;
            System.arraycopy(objArr, i7, objArr, iCreatorIndexOf, i10);
        }
        int i11 = this.size - i9;
        if (i11 > 0) {
            int i12 = i8 - 1;
            int[] iArr2 = this.tags;
            System.arraycopy(iArr2, i9, iArr2, i12, i11);
            VR[] vrArr2 = this.vrs;
            System.arraycopy(vrArr2, i9, vrArr2, i12, i11);
            Object[] objArr2 = this.values;
            System.arraycopy(objArr2, i9, objArr2, i12, i11);
        }
        int i13 = i9 - i8;
        int i14 = this.size;
        int i15 = (i14 - i13) - 1;
        Arrays.fill(this.tags, i15, i14, 0);
        Arrays.fill(this.vrs, i15, this.size, (Object) null);
        Arrays.fill(this.values, i15, this.size, (Object) null);
        this.size = i15;
        return i13;
    }

    public Object setBytes(String str, int i4, VR vr, byte[] bArr) {
        return set(str, i4, vr, vr.toValue(bArr));
    }

    public Object setDate(int i4, VR vr, Date... dateArr) {
        return setDate((String) null, i4, vr, dateArr);
    }

    public Object setDateRange(String str, int i4, VR vr, DateRange dateRange) {
        return set(str, i4, vr, toString(dateRange, vr, getTimeZone()));
    }

    public Object setDouble(String str, int i4, VR vr, double... dArr) {
        return set(str, i4, vr, vr.toValue(dArr, this.bigEndian));
    }

    public Object setFloat(String str, int i4, VR vr, float... fArr) {
        return set(str, i4, vr, vr.toValue(fArr, this.bigEndian));
    }

    public Object setInt(String str, int i4, VR vr, int... iArr) {
        return set(str, i4, vr, vr.toValue(iArr, this.bigEndian));
    }

    public Object setNull(String str, int i4, VR vr) {
        return set(str, i4, vr, Value.NULL);
    }

    public Object setString(int i4, VR vr, String... strArr) {
        return setString((String) null, i4, vr, strArr);
    }

    public Object setValue(String str, int i4, VR vr, Object obj) {
        if (obj == null) {
            obj = Value.NULL;
        }
        return set(str, i4, vr, obj);
    }

    public String toString(int i4, int i5) {
        return toStringBuilder(i4, i5, new StringBuilder(1024)).toString();
    }

    public StringBuilder toStringBuilder(StringBuilder sb) {
        return toStringBuilder(50, 78, sb);
    }

    public void trimToSize(boolean z3) {
        int[] iArr = this.tags;
        int length = iArr.length;
        int i4 = this.size;
        if (i4 < length) {
            this.tags = Arrays.copyOf(iArr, i4);
            this.vrs = (VR[]) Arrays.copyOf(this.vrs, this.size);
            this.values = Arrays.copyOf(this.values, this.size);
        }
        if (z3) {
            for (Object obj : this.values) {
                if (obj instanceof Sequence) {
                    ((Sequence) obj).trimToSize(z3);
                } else if (obj instanceof Fragments) {
                    ((Fragments) obj).trimToSize();
                }
            }
        }
    }

    public void validate(IOD.DataElement dataElement, ValidationResult validationResult) {
        validate(dataElement, validationResult, null);
    }

    public Attributes(Attributes attributes) {
        this(attributes, attributes.bigEndian);
    }

    private static boolean equalPNValues(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (!equalPNValues(strArr[i4], strArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    private void set(String str, int i4, Fragments fragments) {
        boolean z3 = fragments.bigEndian() != this.bigEndian;
        VR vr = fragments.vr();
        Fragments fragmentsNewFragments = newFragments(str, i4, vr, fragments.size());
        Iterator<Object> it = fragments.iterator();
        while (it.hasNext()) {
            fragmentsNewFragments.add(toggleEndian(vr, it.next(), z3));
        }
    }

    private static String toString(DateRange dateRange, VR vr, TimeZone timeZone) {
        DatePrecision datePrecision = new DatePrecision();
        Date startDate = dateRange.getStartDate();
        String str = a.f11071l;
        String str2 = startDate != null ? (String) vr.toValue(new Date[]{dateRange.getStartDate()}, timeZone, datePrecision) : a.f11071l;
        if (dateRange.getEndDate() != null) {
            str = (String) vr.toValue(new Date[]{dateRange.getEndDate()}, timeZone, datePrecision);
        }
        return toDateRangeString(str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b2, code lost:
    
        if (r6.isIntType() == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void validate(org.dcm4che3.data.IOD.DataElement r19, org.dcm4che3.data.ValidationResult r20, java.util.Map<java.lang.String, java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.Attributes.validate(org.dcm4che3.data.IOD$DataElement, org.dcm4che3.data.ValidationResult, java.util.Map):void");
    }

    public boolean addSelected(Attributes attributes, int... iArr) {
        return addSelected(attributes, iArr, 0, iArr.length);
    }

    public Date getDate(int i4, int i5, Date date) {
        return getDate(null, i4, null, i5, date, new DatePrecision());
    }

    public DateRange getDateRange(long j4) {
        return getDateRange((String) null, j4, (DateRange) null);
    }

    public Date[] getDates(long j4) {
        return getDates((String) null, j4, new DatePrecisions());
    }

    public double getDouble(String str, int i4, double d4) {
        return getDouble(str, i4, null, 0, d4);
    }

    public double[] getDoubles(String str, int i4, VR vr) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object objDecodeDSValue = this.values[iIndexOf];
        if (objDecodeDSValue == Value.NULL) {
            return ByteUtils.EMPTY_DOUBLES;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.DS) {
            objDecodeDSValue = decodeDSValue(iIndexOf);
        }
        try {
            return vr.toDoubles(objDecodeDSValue, this.bigEndian);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as double";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        }
    }

    public float getFloat(String str, int i4, float f4) {
        return getFloat(str, i4, null, 0, f4);
    }

    public float[] getFloats(String str, int i4, VR vr) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object objDecodeDSValue = this.values[iIndexOf];
        if (objDecodeDSValue == Value.NULL) {
            return ByteUtils.EMPTY_FLOATS;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.DS) {
            objDecodeDSValue = decodeDSValue(iIndexOf);
        }
        try {
            return vr.toFloats(objDecodeDSValue, this.bigEndian);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as float";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        }
    }

    public int getInt(String str, int i4, int i5) {
        return getInt(str, i4, null, 0, i5);
    }

    public int[] getInts(String str, int i4, VR vr) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object objDecodeISValue = this.values[iIndexOf];
        if (objDecodeISValue == Value.NULL) {
            return ByteUtils.EMPTY_INTS;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.IS) {
            objDecodeISValue = decodeISValue(iIndexOf);
        }
        try {
            return vr.toInts(objDecodeISValue, this.bigEndian);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as int";
            logger.info(str2, TagUtils.toString(i4), vr);
            return null;
        }
    }

    public Attributes getNestedDataset(String str, int i4) {
        return getNestedDataset(str, i4, 0);
    }

    public String getString(int i4, int i5, String str) {
        return getString(null, i4, null, i5, str);
    }

    public String[] getStrings(String str, int i4, VR vr) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object objDecodeStringValue = this.values[iIndexOf];
        Value value = Value.NULL;
        if (objDecodeStringValue == value) {
            return StringUtils.EMPTY_STRING;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr.isStringType() && (objDecodeStringValue = decodeStringValue(iIndexOf)) == value) {
            return StringUtils.EMPTY_STRING;
        }
        try {
            return toStrings(vr.toStrings(objDecodeStringValue, this.bigEndian, getSpecificCharacterSet(vr)));
        } catch (UnsupportedOperationException unused) {
            LOG.info("Attempt to access {} {} as string", TagUtils.toString(i4), vr);
            return null;
        }
    }

    public Object getValue(String str, int i4) {
        return getValue(str, i4, null);
    }

    public boolean matches(Attributes attributes, boolean z3, boolean z4) {
        int[] iArr = attributes.tags;
        VR[] vrArr = attributes.vrs;
        Object[] objArr = attributes.values;
        int i4 = attributes.size;
        String string = null;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = iArr[i6];
            if (!TagUtils.isPrivateCreator(i7)) {
                if (TagUtils.isPrivateGroup(i7)) {
                    int iCreatorTagOf = TagUtils.creatorTagOf(i7);
                    if (i5 != iCreatorTagOf) {
                        string = attributes.getString(iCreatorTagOf, (String) null);
                        i5 = iCreatorTagOf;
                    }
                } else {
                    string = null;
                    i5 = 0;
                }
                Object obj = objArr[i6];
                if (isEmpty(obj)) {
                    continue;
                } else if (vrArr[i6].isStringType()) {
                    if (!matches(string, i7, vrArr[i6], z3, z4, attributes.getStrings(string, i7, null))) {
                        return false;
                    }
                } else {
                    if (!(obj instanceof Sequence)) {
                        throw new UnsupportedOperationException("Keys with VR: " + vrArr[i6] + " not supported");
                    }
                    if (!matches(string, i7, z3, z4, (Sequence) obj)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Object setDate(String str, int i4, VR vr, DatePrecision datePrecision, Date... dateArr) {
        return set(str, i4, vr, vr.toValue(dateArr, getTimeZone(), datePrecision));
    }

    public void setDateRange(long j4, DateRange dateRange) {
        setDateRange((String) null, j4, dateRange);
    }

    public Object setString(String str, int i4, VR vr, String str2) {
        return set(str, i4, vr, vr.toValue(str2, this.bigEndian));
    }

    public Attributes(Attributes attributes, boolean z3) {
        this(z3, attributes.size);
        if (attributes.properties != null) {
            this.properties = new HashMap(attributes.properties);
        }
        addAll(attributes);
    }

    private void set(String str, int i4, Sequence sequence, Attributes attributes) {
        Sequence sequenceNewSequence = newSequence(str, i4, sequence.size());
        for (Attributes attributes2 : sequence) {
            sequenceNewSequence.add((attributes == null || attributes.isEmpty()) ? new Attributes(attributes2, this.bigEndian) : new Attributes(attributes2, this.bigEndian, attributes));
        }
    }

    public boolean addSelected(Attributes attributes, int[] iArr, int i4, int i5) {
        return add(attributes, iArr, null, i4, i5, null, null, false, null);
    }

    public Date getDate(int i4, int i5, Date date, DatePrecision datePrecision) {
        return getDate(null, i4, null, i5, date, datePrecision);
    }

    public DateRange getDateRange(long j4, DateRange dateRange) {
        return getDateRange((String) null, j4, dateRange);
    }

    public Date[] getDates(long j4, DatePrecisions datePrecisions) {
        return getDates((String) null, j4, datePrecisions);
    }

    public double getDouble(String str, int i4, int i5, double d4) {
        return getDouble(str, i4, null, i5, d4);
    }

    public float getFloat(String str, int i4, int i5, float f4) {
        return getFloat(str, i4, null, i5, f4);
    }

    public int getInt(String str, int i4, int i5, int i6) {
        return getInt(str, i4, null, i5, i6);
    }

    public Attributes getNestedDataset(String str, int i4, int i5) {
        Object value = getValue(str, i4);
        if (!(value instanceof Sequence)) {
            return null;
        }
        Sequence sequence = (Sequence) value;
        if (i5 >= sequence.size()) {
            return null;
        }
        return sequence.get(i5);
    }

    public String getString(int i4, String str) {
        return getString(null, i4, null, 0, str);
    }

    public Object getValue(String str, int i4, VR.Holder holder) {
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        if (holder != null) {
            holder.vr = this.vrs[iIndexOf];
        }
        return this.values[iIndexOf];
    }

    public Object setDate(String str, int i4, VR vr, Date... dateArr) {
        return setDate(str, i4, vr, new DatePrecision(), dateArr);
    }

    public void setDateRange(String str, long j4, DateRange dateRange) {
        setDateRange(str, (int) (j4 >>> 32), VR.DA, dateRange);
        setDateRange(str, (int) j4, VR.TM, dateRange);
    }

    public Object setString(String str, int i4, VR vr, String... strArr) {
        return set(str, i4, vr, vr.toValue(strArr, this.bigEndian));
    }

    public Attributes(Attributes attributes, boolean z3, Attributes attributes2) {
        this(z3, attributes2.size());
        if (attributes.properties != null) {
            this.properties = new HashMap(attributes.properties);
        }
        addSelected(attributes, attributes2);
    }

    public Date getDate(int i4, int i5, DatePrecision datePrecision) {
        return getDate(null, i4, null, i5, null, datePrecision);
    }

    public DateRange getDateRange(String str, int i4) {
        return getDateRange(str, i4, null, null);
    }

    public Date[] getDates(String str, int i4) {
        return getDates(str, i4, null, new DatePrecisions());
    }

    public double getDouble(String str, int i4, VR vr, double d4) {
        return getDouble(str, i4, vr, 0, d4);
    }

    public float getFloat(String str, int i4, VR vr, float f4) {
        return getFloat(str, i4, vr, 0, f4);
    }

    public int getInt(String str, int i4, VR vr, int i5) {
        return getInt(str, i4, vr, 0, i5);
    }

    public Attributes getNestedDataset(ItemPointer... itemPointerArr) {
        Attributes attributes = this;
        for (ItemPointer itemPointer : itemPointerArr) {
            Object value = attributes.getValue(itemPointer.privateCreator, itemPointer.sequenceTag);
            if (!(value instanceof Sequence)) {
                return null;
            }
            Sequence sequence = (Sequence) value;
            if (itemPointer.itemIndex >= sequence.size()) {
                return null;
            }
            attributes = sequence.get(itemPointer.itemIndex);
        }
        return attributes;
    }

    public String getString(String str, int i4) {
        return getString(str, i4, null, 0, null);
    }

    public void setDate(long j4, Date date) {
        setDate((String) null, j4, date);
    }

    public Attributes(Attributes attributes, boolean z3, int... iArr) {
        this(z3, iArr.length);
        if (attributes.properties != null) {
            this.properties = new HashMap(attributes.properties);
        }
        addSelected(attributes, iArr);
    }

    public Date getDate(int i4, Date date) {
        return getDate(null, i4, null, 0, date, new DatePrecision());
    }

    public DateRange getDateRange(String str, int i4, DateRange dateRange) {
        return getDateRange(str, i4, null, dateRange);
    }

    public Date[] getDates(String str, int i4, DatePrecisions datePrecisions) {
        return getDates(str, i4, null, datePrecisions);
    }

    public double getDouble(String str, int i4, VR vr, int i5, double d4) {
        Object objDecodeDSValue;
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0 || (objDecodeDSValue = this.values[iIndexOf]) == Value.NULL) {
            return d4;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.DS) {
            objDecodeDSValue = decodeDSValue(iIndexOf);
        }
        try {
            return vr.toDouble(objDecodeDSValue, this.bigEndian, i5, d4);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return d4;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as double";
            logger.info(str2, TagUtils.toString(i4), vr);
            return d4;
        }
    }

    public float getFloat(String str, int i4, VR vr, int i5, float f4) {
        Object objDecodeDSValue;
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0 || (objDecodeDSValue = this.values[iIndexOf]) == Value.NULL) {
            return f4;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.DS) {
            objDecodeDSValue = decodeDSValue(iIndexOf);
        }
        try {
            return vr.toFloat(objDecodeDSValue, this.bigEndian, i5, f4);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return f4;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as float";
            logger.info(str2, TagUtils.toString(i4), vr);
            return f4;
        }
    }

    public int getInt(String str, int i4, VR vr, int i5, int i6) {
        Object objDecodeISValue;
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0 || (objDecodeISValue = this.values[iIndexOf]) == Value.NULL) {
            return i6;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr == VR.IS) {
            objDecodeISValue = decodeISValue(iIndexOf);
        }
        try {
            return vr.toInt(objDecodeISValue, this.bigEndian, i5, i6);
        } catch (IllegalArgumentException unused) {
            logger = LOG;
            str2 = "Invalid value of {} {}";
            logger.info(str2, TagUtils.toString(i4), vr);
            return i6;
        } catch (UnsupportedOperationException unused2) {
            logger = LOG;
            str2 = "Attempt to access {} {} as int";
            logger.info(str2, TagUtils.toString(i4), vr);
            return i6;
        }
    }

    public String getString(String str, int i4, int i5) {
        return getString(str, i4, null, i5, null);
    }

    public void setDate(long j4, DatePrecision datePrecision, Date date) {
        setDate((String) null, j4, datePrecision, date);
    }

    public Attributes(Attributes attributes, int... iArr) {
        this(attributes, attributes.bigEndian, iArr);
    }

    public Date getDate(int i4, Date date, DatePrecision datePrecision) {
        return getDate(null, i4, null, 0, date, datePrecision);
    }

    public DateRange getDateRange(String str, int i4, VR vr) {
        return getDateRange(str, i4, vr, null);
    }

    public Date[] getDates(String str, int i4, VR vr) {
        return getDates(str, i4, vr, new DatePrecisions());
    }

    public String getString(String str, int i4, int i5, String str2) {
        return getString(str, i4, null, i5, str2);
    }

    public void setDate(String str, long j4, Date date) {
        setDate(str, j4, new DatePrecision(), date);
    }

    public Attributes(boolean z3) {
        this(z3, 16);
    }

    public Date getDate(int i4, DatePrecision datePrecision) {
        return getDate(null, i4, null, 0, null, datePrecision);
    }

    public DateRange getDateRange(String str, int i4, VR vr, DateRange dateRange) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return dateRange;
        }
        Object obj = this.values[iIndexOf];
        Value value = Value.NULL;
        if (obj == value) {
            return dateRange;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr.isTemporalType()) {
            Object objDecodeStringValue = decodeStringValue(iIndexOf);
            if (objDecodeStringValue == value) {
                return dateRange;
            }
            try {
                return toDateRange(objDecodeStringValue instanceof String ? (String) objDecodeStringValue : ((String[]) objDecodeStringValue)[0], vr);
            } catch (IllegalArgumentException unused) {
                logger = LOG;
                str2 = "Invalid value of {} {}";
            }
        } else {
            logger = LOG;
            str2 = "Attempt to access {} {} as date";
        }
        logger.info(str2, TagUtils.toString(i4), vr);
        return dateRange;
    }

    public Date[] getDates(String str, int i4, VR vr, DatePrecisions datePrecisions) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        Object obj = this.values[iIndexOf];
        Value value = Value.NULL;
        if (obj == value) {
            return DateUtils.EMPTY_DATES;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr.isTemporalType()) {
            try {
                Object objDecodeStringValue = decodeStringValue(iIndexOf);
                return objDecodeStringValue == value ? DateUtils.EMPTY_DATES : vr.toDates(objDecodeStringValue, getTimeZone(), false, datePrecisions);
            } catch (IllegalArgumentException unused) {
                logger = LOG;
                str2 = "Invalid value of {} {}";
            }
        } else {
            logger = LOG;
            str2 = "Attempt to access {} {} as date";
        }
        logger.info(str2, TagUtils.toString(i4), vr);
        return DateUtils.EMPTY_DATES;
    }

    public String getString(String str, int i4, String str2) {
        return getString(str, i4, null, 0, str2);
    }

    public void setDate(String str, long j4, DatePrecision datePrecision, Date date) {
        setDate(str, (int) (j4 >>> 32), VR.DA, datePrecision, date);
        setDate(str, (int) j4, VR.TM, datePrecision, date);
    }

    public Attributes(boolean z3, int i4) {
        this.length = -1;
        this.itemPosition = -1L;
        this.bigEndian = z3;
        init(i4);
    }

    public Date getDate(long j4) {
        return getDate((String) null, j4, (Date) null, new DatePrecision());
    }

    public DateRange getDateRange(String str, long j4) {
        return getDateRange(str, j4, (DateRange) null);
    }

    public Date[] getDates(String str, long j4) {
        return getDates(str, j4, new DatePrecisions());
    }

    public String getString(String str, int i4, VR vr) {
        return getString(str, i4, vr, 0, null);
    }

    public Date getDate(long j4, Date date) {
        return getDate((String) null, j4, date, new DatePrecision());
    }

    public DateRange getDateRange(String str, long j4, DateRange dateRange) {
        int i4 = (int) (j4 >>> 32);
        int i5 = (int) j4;
        String string = getString(str, i5, VR.TM, (String) null);
        if (string == null) {
            return getDateRange(i4, dateRange);
        }
        String string2 = getString(str, i4, VR.DA, (String) null);
        if (string2 == null) {
            return dateRange;
        }
        try {
            return toDateRange(string2, string);
        } catch (IllegalArgumentException unused) {
            LOG.info("Invalid value of {} TM", TagUtils.toString(i5));
            return dateRange;
        }
    }

    public Date[] getDates(String str, long j4, DatePrecisions datePrecisions) {
        int i4 = (int) (j4 >>> 32);
        int i5 = (int) j4;
        String[] strings = getStrings(str, i5);
        if (strings == null || strings.length == 0) {
            return getDates(i4, datePrecisions);
        }
        String[] strings2 = getStrings(str, i4);
        if (strings2 == null || strings2.length == 0) {
            return DateUtils.EMPTY_DATES;
        }
        Date[] dateArr = new Date[strings2.length];
        datePrecisions.precisions = new DatePrecision[strings2.length];
        int i6 = 0;
        try {
            TimeZone timeZone = getTimeZone();
            while (i6 < strings.length) {
                int i7 = i6 + 1;
                try {
                    VR vr = VR.DT;
                    String str2 = strings2[i7] + strings[i7];
                    DatePrecision[] datePrecisionArr = datePrecisions.precisions;
                    DatePrecision datePrecision = new DatePrecision();
                    datePrecisionArr[i7] = datePrecision;
                    dateArr[i6] = vr.toDate(str2, timeZone, 0, false, null, datePrecision);
                    i6 = i7;
                } catch (IllegalArgumentException unused) {
                    i6 = i7;
                    LOG.info("Invalid value of {} DA or {} TM", TagUtils.toString(i4), TagUtils.toString(i5));
                    return (Date[]) Arrays.copyOf(dateArr, i6);
                }
            }
            while (i6 < strings2.length) {
                int i8 = i6 + 1;
                try {
                    VR vr2 = VR.DA;
                    String str3 = strings2[i8];
                    DatePrecision[] datePrecisionArr2 = datePrecisions.precisions;
                    DatePrecision datePrecision2 = new DatePrecision();
                    datePrecisionArr2[i8] = datePrecision2;
                    dateArr[i6] = vr2.toDate(str3, timeZone, 0, false, null, datePrecision2);
                    i6 = i8;
                } catch (IllegalArgumentException unused2) {
                    i6 = i8;
                    LOG.info("Invalid value of {} DA or {} TM", TagUtils.toString(i4), TagUtils.toString(i5));
                    return (Date[]) Arrays.copyOf(dateArr, i6);
                }
            }
            return dateArr;
        } catch (IllegalArgumentException unused3) {
        }
    }

    public String getString(String str, int i4, VR vr, int i5) {
        return getString(str, i4, vr, i5, null);
    }

    public Date getDate(long j4, Date date, DatePrecision datePrecision) {
        return getDate((String) null, j4, date, datePrecision);
    }

    public String getString(String str, int i4, VR vr, int i5, String str2) {
        Object objDecodeStringValue;
        Value value;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0 || (objDecodeStringValue = this.values[iIndexOf]) == (value = Value.NULL)) {
            return str2;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr.isStringType() && (objDecodeStringValue = decodeStringValue(iIndexOf)) == value) {
            return str2;
        }
        try {
            return vr.toString(objDecodeStringValue, this.bigEndian, i5, str2);
        } catch (UnsupportedOperationException unused) {
            LOG.info("Attempt to access {} {} as string", TagUtils.toString(i4), vr);
            return str2;
        }
    }

    public Date getDate(long j4, DatePrecision datePrecision) {
        return getDate((String) null, j4, (Date) null, datePrecision);
    }

    public String getString(String str, int i4, VR vr, String str2) {
        return getString(str, i4, vr, 0, str2);
    }

    public Date getDate(String str, int i4) {
        return getDate(str, i4, null, 0, null, new DatePrecision());
    }

    public Date getDate(String str, int i4, int i5) {
        return getDate(str, i4, null, i5, null, new DatePrecision());
    }

    public Date getDate(String str, int i4, int i5, Date date) {
        return getDate(str, i4, null, i5, date, new DatePrecision());
    }

    public Date getDate(String str, int i4, int i5, Date date, DatePrecision datePrecision) {
        return getDate(str, i4, null, i5, date, datePrecision);
    }

    public Date getDate(String str, int i4, int i5, DatePrecision datePrecision) {
        return getDate(str, i4, null, i5, null, datePrecision);
    }

    public Date getDate(String str, int i4, Date date, DatePrecision datePrecision) {
        return getDate(str, i4, null, 0, date, datePrecision);
    }

    public Date getDate(String str, int i4, DatePrecision datePrecision) {
        return getDate(str, i4, null, 0, null, datePrecision);
    }

    public Date getDate(String str, int i4, VR vr) {
        return getDate(str, i4, vr, 0, null, new DatePrecision());
    }

    public Date getDate(String str, int i4, VR vr, int i5) {
        return getDate(str, i4, vr, i5, null, new DatePrecision());
    }

    public Date getDate(String str, int i4, VR vr, int i5, Date date) {
        return getDate(str, i4, vr, i5, date, new DatePrecision());
    }

    public Date getDate(String str, int i4, VR vr, int i5, Date date, DatePrecision datePrecision) {
        Logger logger;
        String str2;
        int iIndexOf = indexOf(str, i4);
        if (iIndexOf < 0) {
            return date;
        }
        Object obj = this.values[iIndexOf];
        Value value = Value.NULL;
        if (obj == value) {
            return date;
        }
        if (vr == null) {
            vr = this.vrs[iIndexOf];
        } else {
            updateVR(iIndexOf, vr);
        }
        if (vr.isTemporalType()) {
            try {
                Object objDecodeStringValue = decodeStringValue(iIndexOf);
                if (objDecodeStringValue == value) {
                    return date;
                }
                return vr.toDate(objDecodeStringValue, getTimeZone(), i5, false, date, datePrecision);
            } catch (IllegalArgumentException unused) {
                logger = LOG;
                str2 = "Invalid value of {} {}";
            }
        } else {
            logger = LOG;
            str2 = "Attempt to access {} {} as date";
        }
        logger.info(str2, TagUtils.toString(i4), vr);
        return date;
    }

    public Date getDate(String str, int i4, VR vr, int i5, DatePrecision datePrecision) {
        return getDate(str, i4, vr, i5, null, datePrecision);
    }

    public Date getDate(String str, int i4, VR vr, Date date) {
        return getDate(str, i4, vr, 0, date, new DatePrecision());
    }

    public Date getDate(String str, int i4, VR vr, Date date, DatePrecision datePrecision) {
        return getDate(str, i4, vr, 0, date, datePrecision);
    }

    public Date getDate(String str, int i4, VR vr, DatePrecision datePrecision) {
        return getDate(str, i4, vr, 0, null, datePrecision);
    }

    public Date getDate(String str, long j4) {
        return getDate(str, j4, (Date) null, new DatePrecision());
    }

    public Date getDate(String str, long j4, Date date) {
        return getDate(str, j4, date, new DatePrecision());
    }

    public Date getDate(String str, long j4, Date date, DatePrecision datePrecision) {
        int i4 = (int) (j4 >>> 32);
        int i5 = (int) j4;
        String string = getString(str, i5, VR.TM, (String) null);
        if (string == null) {
            return getDate(i4, date, datePrecision);
        }
        String string2 = getString(str, i4, VR.DA, (String) null);
        if (string2 == null) {
            return date;
        }
        try {
            return VR.DT.toDate(string2 + string, getTimeZone(), 0, false, null, datePrecision);
        } catch (IllegalArgumentException unused) {
            LOG.info("Invalid value of {} DA or {} TM", TagUtils.toString(i4), TagUtils.toString(i5));
            return date;
        }
    }

    public Date getDate(String str, long j4, DatePrecision datePrecision) {
        return getDate(str, j4, (Date) null, datePrecision);
    }
}
