package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;
import org.dcm4che3.util.StringUtils;
import s0.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
class StringValueType implements ValueType {
    private static final /* synthetic */ StringValueType[] $VALUES;
    public static final StringValueType ASCII;
    public static final StringValueType DA;
    public static final StringValueType DS;
    public static final StringValueType DT;
    public static final StringValueType IS;
    public static final StringValueType PN;
    public static final StringValueType STRING;
    public static final StringValueType TEXT;
    public static final StringValueType TM;
    public static final StringValueType UR;
    final String delimiters;
    final TemporalType temporalType;

    static {
        String str = "\\";
        StringValueType stringValueType = new StringValueType("ASCII", 0, "\\", null);
        ASCII = stringValueType;
        StringValueType stringValueType2 = new StringValueType("STRING", 1, str, null) { // from class: org.dcm4che3.data.StringValueType.1
            @Override // org.dcm4che3.data.StringValueType
            public SpecificCharacterSet cs(SpecificCharacterSet specificCharacterSet) {
                return specificCharacterSet;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean useSpecificCharacterSet() {
                return true;
            }
        };
        STRING = stringValueType2;
        StringValueType stringValueType3 = new StringValueType("TEXT", 2, "\t\n\f\r", 0 == true ? 1 : 0) { // from class: org.dcm4che3.data.StringValueType.2
            @Override // org.dcm4che3.data.StringValueType
            public SpecificCharacterSet cs(SpecificCharacterSet specificCharacterSet) {
                return specificCharacterSet;
            }

            @Override // org.dcm4che3.data.StringValueType
            public Object splitAndTrim(String str2, SpecificCharacterSet specificCharacterSet) {
                return specificCharacterSet.toText(StringUtils.trimTrailing(str2));
            }

            @Override // org.dcm4che3.data.StringValueType
            public Object toMultiValue(String str2) {
                return str2;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean useSpecificCharacterSet() {
                return true;
            }
        };
        TEXT = stringValueType3;
        StringValueType stringValueType4 = new StringValueType("UR", 3, 0 == true ? 1 : 0, 0 == true ? 1 : 0) { // from class: org.dcm4che3.data.StringValueType.3
            @Override // org.dcm4che3.data.StringValueType
            public Object splitAndTrim(String str2, SpecificCharacterSet specificCharacterSet) {
                return StringUtils.trimTrailing(str2);
            }

            @Override // org.dcm4che3.data.StringValueType
            public Object toMultiValue(String str2) {
                return str2;
            }
        };
        UR = stringValueType4;
        StringValueType stringValueType5 = new StringValueType("DA", 4, "\\", TemporalType.DA);
        DA = stringValueType5;
        StringValueType stringValueType6 = new StringValueType("DT", 5, "\\", TemporalType.DT);
        DT = stringValueType6;
        StringValueType stringValueType7 = new StringValueType("TM", 6, "\\", TemporalType.TM);
        TM = stringValueType7;
        StringValueType stringValueType8 = new StringValueType("PN", 7, "^=\\", 0 == true ? 1 : 0) { // from class: org.dcm4che3.data.StringValueType.4
            @Override // org.dcm4che3.data.StringValueType
            public SpecificCharacterSet cs(SpecificCharacterSet specificCharacterSet) {
                return specificCharacterSet;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean useSpecificCharacterSet() {
                return true;
            }
        };
        PN = stringValueType8;
        StringValueType stringValueType9 = new StringValueType("DS", 8, str, 0 == true ? 1 : 0) { // from class: org.dcm4che3.data.StringValueType.5
            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
                if (obj instanceof double[]) {
                    obj = toStrings((double[]) obj);
                }
                return super.prompt(obj, z3, specificCharacterSet, i4, sb);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
                if (obj instanceof double[]) {
                    obj = toStrings((double[]) obj);
                }
                return super.toBytes(obj, specificCharacterSet);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public double toDouble(Object obj, boolean z3, int i4, double d4) {
                double[] dArr = (double[]) obj;
                return (i4 >= dArr.length || Double.isNaN(dArr[i4])) ? d4 : dArr[i4];
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public double[] toDoubles(Object obj, boolean z3) {
                return (double[]) obj;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public float toFloat(Object obj, boolean z3, int i4, float f4) {
                double[] dArr = (double[]) obj;
                return (i4 >= dArr.length || Double.isNaN(dArr[i4])) ? f4 : (float) dArr[i4];
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public float[] toFloats(Object obj, boolean z3) {
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                float[] fArr = new float[length];
                for (int i4 = 0; i4 < length; i4++) {
                    fArr[i4] = (float) dArr[i4];
                }
                return fArr;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public String toString(Object obj, boolean z3, int i4, String str2) {
                if (!(obj instanceof double[])) {
                    return super.toString(obj, z3, i4, str2);
                }
                double[] dArr = (double[]) obj;
                return (i4 >= dArr.length || Double.isNaN(dArr[i4])) ? str2 : StringUtils.formatDS(dArr[i4]);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
                return obj instanceof double[] ? toStrings((double[]) obj) : super.toStrings(obj, z3, specificCharacterSet);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public Object toValue(double[] dArr, boolean z3) {
                return (dArr == null || dArr.length == 0) ? Value.NULL : dArr;
            }

            private Object toStrings(double[] dArr) {
                if (dArr.length == 1) {
                    return StringUtils.formatDS(dArr[0]);
                }
                String[] strArr = new String[dArr.length];
                for (int i4 = 0; i4 < dArr.length; i4++) {
                    strArr[i4] = !Double.isNaN(dArr[i4]) ? StringUtils.formatDS(dArr[i4]) : a.f11071l;
                }
                return strArr;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public Object toValue(float[] fArr, boolean z3) {
                if (fArr == null || fArr.length == 0) {
                    return Value.NULL;
                }
                if (fArr.length == 1) {
                    return StringUtils.formatDS(fArr[0]);
                }
                String[] strArr = new String[fArr.length];
                for (int i4 = 0; i4 < fArr.length; i4++) {
                    strArr[i4] = StringUtils.formatDS(fArr[i4]);
                }
                return strArr;
            }
        };
        DS = stringValueType9;
        StringValueType stringValueType10 = new StringValueType("IS", 9, str, 0 == true ? 1 : 0) { // from class: org.dcm4che3.data.StringValueType.6
            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean isIntValue() {
                return true;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
                if (obj instanceof int[]) {
                    obj = toStrings((int[]) obj);
                }
                return super.prompt(obj, z3, specificCharacterSet, i4, sb);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
                if (obj instanceof int[]) {
                    obj = toStrings((int[]) obj);
                }
                return super.toBytes(obj, specificCharacterSet);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public int toInt(Object obj, boolean z3, int i4, int i5) {
                int i6;
                int[] iArr = (int[]) obj;
                return (i4 >= iArr.length || (i6 = iArr[i4]) == Integer.MIN_VALUE) ? i5 : i6;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public int[] toInts(Object obj, boolean z3) {
                return (int[]) obj;
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public String toString(Object obj, boolean z3, int i4, String str2) {
                int i5;
                if (!(obj instanceof int[])) {
                    return super.toString(obj, z3, i4, str2);
                }
                int[] iArr = (int[]) obj;
                return (i4 >= iArr.length || (i5 = iArr[i4]) == Integer.MIN_VALUE) ? str2 : Integer.toString(i5);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
                return obj instanceof int[] ? toStrings((int[]) obj) : super.toStrings(obj, z3, specificCharacterSet);
            }

            @Override // org.dcm4che3.data.StringValueType, org.dcm4che3.data.ValueType
            public Object toValue(int[] iArr, boolean z3) {
                return (iArr == null || iArr.length == 0) ? Value.NULL : iArr;
            }

            private Object toStrings(int[] iArr) {
                if (iArr.length == 1) {
                    return Integer.toString(iArr[0]);
                }
                String[] strArr = new String[iArr.length];
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    strArr[i4] = i5 != Integer.MIN_VALUE ? Integer.toString(i5) : a.f11071l;
                }
                return strArr;
            }
        };
        IS = stringValueType10;
        $VALUES = new StringValueType[]{stringValueType, stringValueType2, stringValueType3, stringValueType4, stringValueType5, stringValueType6, stringValueType7, stringValueType8, stringValueType9, stringValueType10};
    }

    private StringValueType(String str, int i4, String str2, TemporalType temporalType) {
        this.delimiters = str2;
        this.temporalType = temporalType;
    }

    public static StringValueType valueOf(String str) {
        return (StringValueType) Enum.valueOf(StringValueType.class, str);
    }

    public static StringValueType[] values() {
        return (StringValueType[]) $VALUES.clone();
    }

    public SpecificCharacterSet cs(SpecificCharacterSet specificCharacterSet) {
        return SpecificCharacterSet.ASCII;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isIntValue() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isStringValue() {
        return true;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isTemporalType() {
        return this.temporalType != null;
    }

    @Override // org.dcm4che3.data.ValueType
    public int numEndianBytes() {
        return 1;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
        return obj instanceof byte[] ? prompt(cs(specificCharacterSet).decode((byte[]) obj), i4, sb) : obj instanceof String ? prompt((String) obj, i4, sb) : obj instanceof String[] ? prompt((String[]) obj, i4, sb) : prompt(obj.toString(), i4, sb);
    }

    public Object splitAndTrim(String str, SpecificCharacterSet specificCharacterSet) {
        return StringUtils.splitAndTrim(str, '\\');
    }

    @Override // org.dcm4che3.data.ValueType
    public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
        SpecificCharacterSet specificCharacterSetCs;
        String strConcat;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            specificCharacterSetCs = cs(specificCharacterSet);
            strConcat = (String) obj;
        } else {
            if (!(obj instanceof String[])) {
                throw new UnsupportedOperationException();
            }
            specificCharacterSetCs = cs(specificCharacterSet);
            strConcat = StringUtils.concat((String[]) obj, '\\');
        }
        return specificCharacterSetCs.encode(strConcat, this.delimiters);
    }

    @Override // org.dcm4che3.data.ValueType
    public Date toDate(Object obj, TimeZone timeZone, int i4, boolean z3, Date date, DatePrecision datePrecision) {
        String str;
        TemporalType temporalType = this.temporalType;
        if (temporalType == null) {
            throw new UnsupportedOperationException();
        }
        if (obj instanceof String) {
            return i4 == 0 ? temporalType.parse(timeZone, (String) obj, z3, datePrecision) : date;
        }
        if (!(obj instanceof String[])) {
            throw new UnsupportedOperationException();
        }
        String[] strArr = (String[]) obj;
        return (i4 >= strArr.length || (str = strArr[i4]) == null) ? date : temporalType.parse(timeZone, str, z3, datePrecision);
    }

    @Override // org.dcm4che3.data.ValueType
    public double toDouble(Object obj, boolean z3, int i4, double d4) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public double[] toDoubles(Object obj, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public float toFloat(Object obj, boolean z3, int i4, float f4) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public float[] toFloats(Object obj, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public int toInt(Object obj, boolean z3, int i4, int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public int[] toInts(Object obj, boolean z3) {
        throw new UnsupportedOperationException();
    }

    public Object toMultiValue(String str) {
        return StringUtils.splitAndTrim(str, '\\');
    }

    @Override // org.dcm4che3.data.ValueType
    public String toString(Object obj, boolean z3, int i4, String str) {
        String str2;
        if (obj instanceof String) {
            if (i4 != 0) {
                obj = str;
            }
            return (String) obj;
        }
        if (!(obj instanceof String[])) {
            throw new UnsupportedOperationException();
        }
        String[] strArr = (String[]) obj;
        return (i4 >= strArr.length || (str2 = strArr[i4]) == null || str2.isEmpty()) ? str : strArr[i4];
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
        if (obj instanceof byte[]) {
            return splitAndTrim(cs(specificCharacterSet).decode((byte[]) obj), specificCharacterSet);
        }
        if ((obj instanceof String) || (obj instanceof String[])) {
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(String str, boolean z3) {
        return (str == null || str.isEmpty()) ? Value.NULL : toMultiValue(str);
    }

    @Override // org.dcm4che3.data.ValueType
    public byte[] toggleEndian(byte[] bArr, boolean z3) {
        return bArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean useSpecificCharacterSet() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public int vmOf(Object obj) {
        if (obj instanceof String) {
            return 1;
        }
        if (obj instanceof String[]) {
            return ((String[]) obj).length;
        }
        throw new UnsupportedOperationException();
    }

    public static boolean prompt(String str, int i4, StringBuilder sb) {
        int length = sb.length() + i4;
        sb.append(str.trim());
        if (sb.length() <= length) {
            return true;
        }
        sb.setLength(length + 1);
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public Date[] toDate(Object obj, TimeZone timeZone, boolean z3, DatePrecisions datePrecisions) {
        TemporalType temporalType = this.temporalType;
        if (temporalType == null) {
            throw new UnsupportedOperationException();
        }
        if (obj instanceof String) {
            datePrecisions.precisions = new DatePrecision[]{datePrecision};
            DatePrecision datePrecision = new DatePrecision();
            return new Date[]{temporalType.parse(timeZone, (String) obj, z3, datePrecision)};
        }
        if (!(obj instanceof String[])) {
            throw new UnsupportedOperationException();
        }
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        Date[] dateArr = new Date[length];
        datePrecisions.precisions = new DatePrecision[strArr.length];
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (str != null) {
                TemporalType temporalType2 = this.temporalType;
                DatePrecision[] datePrecisionArr = datePrecisions.precisions;
                DatePrecision datePrecision2 = new DatePrecision();
                datePrecisionArr[i4] = datePrecision2;
                dateArr[i4] = temporalType2.parse(timeZone, str, z3, datePrecision2);
            }
        }
        return dateArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? Value.NULL : bArr;
    }

    public static boolean prompt(String[] strArr, int i4, StringBuilder sb) {
        int length = sb.length() + i4;
        for (String str : strArr) {
            if (str != null) {
                sb.append(str);
            }
            if (sb.length() > length) {
                sb.setLength(length + 1);
                return false;
            }
            sb.append('\\');
        }
        sb.setLength(sb.length() - 1);
        return true;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(double[] dArr, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(float[] fArr, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(int[] iArr, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(String[] strArr, boolean z3) {
        return (strArr == null || strArr.length == 0) ? Value.NULL : strArr.length == 1 ? toValue(strArr[0], z3) : strArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(Date[] dateArr, TimeZone timeZone, DatePrecision datePrecision) {
        TemporalType temporalType = this.temporalType;
        if (temporalType == null) {
            throw new UnsupportedOperationException();
        }
        if (dateArr == null || dateArr.length == 0) {
            return Value.NULL;
        }
        if (dateArr.length == 1) {
            return temporalType.format(timeZone, dateArr[0], datePrecision);
        }
        int length = dateArr.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = this.temporalType.format(timeZone, dateArr[i4], datePrecision);
        }
        return strArr;
    }
}
