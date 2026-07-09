package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class VR {
    private static final /* synthetic */ VR[] $VALUES;
    public static final VR AE;
    public static final VR AS;
    public static final VR AT;
    public static final VR CS;
    public static final VR DA;
    public static final VR DS;
    public static final VR DT;
    public static final VR FD;
    public static final VR FL;
    public static final VR IS;
    public static final VR LO;
    private static Logger LOG;
    public static final VR LT;
    public static final VR OB;
    public static final VR OD;
    public static final VR OF;
    public static final VR OL;
    public static final VR OW;
    public static final VR PN;
    public static final VR SH;
    public static final VR SL;
    public static final VR SQ;
    public static final VR SS;
    public static final VR ST;
    public static final VR TM;
    public static final VR UC;
    public static final VR UI;
    public static final VR UL;
    public static final VR UN;
    public static final VR UR;
    public static final VR US;
    public static final VR UT;
    private static final VR[] VALUE_OF;
    protected final int code;
    protected final int headerLength;
    protected final boolean inlineBinary;
    protected final int paddingByte;
    protected final ValueType valueType;

    public static class Holder {
        public VR vr;
    }

    static {
        StringValueType stringValueType = StringValueType.ASCII;
        VR vr = new VR("AE", 0, 16709, 8, 32, stringValueType, false);
        AE = vr;
        VR vr2 = new VR("AS", 1, 16723, 8, 32, stringValueType, false);
        AS = vr2;
        VR vr3 = new VR("AT", 2, 16724, 8, 0, BinaryValueType.TAG, false);
        AT = vr3;
        VR vr4 = new VR("CS", 3, 17235, 8, 32, stringValueType, false);
        CS = vr4;
        VR vr5 = new VR("DA", 4, 17473, 8, 32, StringValueType.DA, false);
        DA = vr5;
        VR vr6 = new VR("DS", 5, 17491, 8, 32, StringValueType.DS, false);
        DS = vr6;
        VR vr7 = new VR("DT", 6, 17492, 8, 32, StringValueType.DT, false);
        DT = vr7;
        BinaryValueType binaryValueType = BinaryValueType.DOUBLE;
        VR vr8 = new VR("FD", 7, 17988, 8, 0, binaryValueType, false);
        FD = vr8;
        BinaryValueType binaryValueType2 = BinaryValueType.FLOAT;
        VR vr9 = new VR("FL", 8, 17996, 8, 0, binaryValueType2, false);
        FL = vr9;
        VR vr10 = new VR("IS", 9, 18771, 8, 32, StringValueType.IS, false);
        IS = vr10;
        StringValueType stringValueType2 = StringValueType.STRING;
        VR vr11 = new VR("LO", 10, 19535, 8, 32, stringValueType2, false);
        LO = vr11;
        StringValueType stringValueType3 = StringValueType.TEXT;
        VR vr12 = new VR("LT", 11, 19540, 8, 32, stringValueType3, false);
        LT = vr12;
        BinaryValueType binaryValueType3 = BinaryValueType.BYTE;
        VR vr13 = new VR("OB", 12, 20290, 12, 0, binaryValueType3, true);
        OB = vr13;
        VR vr14 = new VR("OD", 13, 20292, 12, 0, binaryValueType, true);
        OD = vr14;
        VR vr15 = new VR("OF", 14, 20294, 12, 0, binaryValueType2, true);
        OF = vr15;
        BinaryValueType binaryValueType4 = BinaryValueType.INT;
        VR vr16 = new VR("OL", 15, 20300, 12, 0, binaryValueType4, true);
        OL = vr16;
        BinaryValueType binaryValueType5 = BinaryValueType.SHORT;
        VR vr17 = new VR("OW", 16, 20311, 12, 0, binaryValueType5, true);
        OW = vr17;
        VR vr18 = new VR("PN", 17, 20558, 8, 32, StringValueType.PN, false);
        PN = vr18;
        VR vr19 = new VR("SH", 18, 21320, 8, 32, stringValueType2, false);
        SH = vr19;
        VR vr20 = new VR("SL", 19, 21324, 8, 0, binaryValueType4, false);
        SL = vr20;
        VR vr21 = new VR("SQ", 20, 21329, 12, 0, SequenceValueType.SQ, false);
        SQ = vr21;
        VR vr22 = new VR("SS", 21, 21331, 8, 0, binaryValueType5, false);
        SS = vr22;
        VR vr23 = new VR("ST", 22, 21332, 8, 32, stringValueType3, false);
        ST = vr23;
        VR vr24 = new VR("TM", 23, 21581, 8, 32, StringValueType.TM, false);
        TM = vr24;
        VR vr25 = new VR("UC", 24, 21827, 12, 32, stringValueType2, false);
        UC = vr25;
        VR vr26 = new VR("UI", 25, 21833, 8, 0, stringValueType, false);
        UI = vr26;
        VR vr27 = new VR("UL", 26, 21836, 8, 0, binaryValueType4, false);
        UL = vr27;
        VR vr28 = new VR("UN", 27, 21838, 12, 0, binaryValueType3, true);
        UN = vr28;
        VR vr29 = new VR("UR", 28, 21842, 12, 32, StringValueType.UR, false);
        UR = vr29;
        VR vr30 = new VR("US", 29, 21843, 8, 0, BinaryValueType.USHORT, false);
        US = vr30;
        VR vr31 = new VR("UT", 30, 21844, 12, 32, stringValueType3, false);
        UT = vr31;
        $VALUES = new VR[]{vr, vr2, vr3, vr4, vr5, vr6, vr7, vr8, vr9, vr10, vr11, vr12, vr13, vr14, vr15, vr16, vr17, vr18, vr19, vr20, vr21, vr22, vr23, vr24, vr25, vr26, vr27, vr28, vr29, vr30, vr31};
        LOG = LoggerFactory.getLogger(VR.class);
        VALUE_OF = new VR[indexOf(vr31) + 1];
        for (VR vr32 : values()) {
            VALUE_OF[indexOf(vr32)] = vr32;
        }
    }

    private VR(String str, int i4, int i5, int i6, int i7, ValueType valueType, boolean z3) {
        this.code = i5;
        this.headerLength = i6;
        this.paddingByte = i7;
        this.valueType = valueType;
        this.inlineBinary = z3;
    }

    private static int indexOf(VR vr) {
        return vr.code - AE.code;
    }

    public static VR valueOf(int i4) {
        try {
            VR vr = VALUE_OF[i4 - AE.code];
            if (vr != null) {
                return vr;
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        LOG.warn("Unrecogniced VR code: {0}H - treat as UN", Integer.toHexString(i4));
        return UN;
    }

    public static VR[] values() {
        return (VR[]) $VALUES.clone();
    }

    public int code() {
        return this.code;
    }

    public int headerLength() {
        return this.headerLength;
    }

    public boolean isInlineBinary() {
        return this.inlineBinary;
    }

    public boolean isIntType() {
        return this.valueType.isIntValue();
    }

    public boolean isStringType() {
        return this.valueType.isStringValue();
    }

    public boolean isTemporalType() {
        return this.valueType.isTemporalType();
    }

    public int numEndianBytes() {
        return this.valueType.numEndianBytes();
    }

    public int paddingByte() {
        return this.paddingByte;
    }

    public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
        return this.valueType.prompt(obj, z3, specificCharacterSet, i4, sb);
    }

    public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
        return this.valueType.toBytes(obj, specificCharacterSet);
    }

    public Date toDate(Object obj, TimeZone timeZone, int i4, boolean z3, Date date, DatePrecision datePrecision) {
        return this.valueType.toDate(obj, timeZone, i4, z3, date, datePrecision);
    }

    public Date[] toDates(Object obj, TimeZone timeZone, boolean z3, DatePrecisions datePrecisions) {
        return this.valueType.toDate(obj, timeZone, z3, datePrecisions);
    }

    public double toDouble(Object obj, boolean z3, int i4, double d4) {
        return this.valueType.toDouble(obj, z3, i4, d4);
    }

    public double[] toDoubles(Object obj, boolean z3) {
        return this.valueType.toDoubles(obj, z3);
    }

    public float toFloat(Object obj, boolean z3, int i4, float f4) {
        return this.valueType.toFloat(obj, z3, i4, f4);
    }

    public float[] toFloats(Object obj, boolean z3) {
        return this.valueType.toFloats(obj, z3);
    }

    public int toInt(Object obj, boolean z3, int i4, int i5) {
        return this.valueType.toInt(obj, z3, i4, i5);
    }

    public int[] toInts(Object obj, boolean z3) {
        return this.valueType.toInts(obj, z3);
    }

    public String toString(Object obj, boolean z3, int i4, String str) {
        return this.valueType.toString(obj, z3, i4, str);
    }

    public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
        return this.valueType.toStrings(obj, z3, specificCharacterSet);
    }

    public Object toValue(String str, boolean z3) {
        return this.valueType.toValue(str, z3);
    }

    public byte[] toggleEndian(byte[] bArr, boolean z3) {
        return this.valueType.toggleEndian(bArr, z3);
    }

    public boolean useSpecificCharacterSet() {
        return this.valueType.useSpecificCharacterSet();
    }

    public int vmOf(Object obj) {
        if (this.headerLength == 12) {
            return 1;
        }
        return this.valueType.vmOf(obj);
    }

    public static VR valueOf(String str) {
        return (VR) Enum.valueOf(VR.class, str);
    }

    public Object toValue(byte[] bArr) {
        return this.valueType.toValue(bArr);
    }

    public Object toValue(double[] dArr, boolean z3) {
        return this.valueType.toValue(dArr, z3);
    }

    public Object toValue(float[] fArr, boolean z3) {
        return this.valueType.toValue(fArr, z3);
    }

    public Object toValue(int[] iArr, boolean z3) {
        return this.valueType.toValue(iArr, z3);
    }

    public Object toValue(String[] strArr, boolean z3) {
        return this.valueType.toValue(strArr, z3);
    }

    public Object toValue(Date[] dateArr, TimeZone timeZone, DatePrecision datePrecision) {
        return this.valueType.toValue(dateArr, timeZone, datePrecision);
    }
}
