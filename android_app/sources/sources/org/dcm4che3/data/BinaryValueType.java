package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
abstract class BinaryValueType implements ValueType {
    private static final /* synthetic */ BinaryValueType[] $VALUES;
    public static final BinaryValueType BYTE;
    public static final BinaryValueType DOUBLE;
    public static final BinaryValueType FLOAT;
    public static final BinaryValueType INT;
    public static final BinaryValueType SHORT;
    public static final BinaryValueType TAG;
    public static final BinaryValueType USHORT;
    final int numBytes;
    final int numEndianBytes;

    static {
        int i4 = 1;
        BinaryValueType binaryValueType = new BinaryValueType("BYTE", 0, i4, i4) { // from class: org.dcm4che3.data.BinaryValueType.1
            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(int i5, byte[] bArr, int i6, boolean z3) {
                bArr[i6] = (byte) i5;
                return bArr;
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public int toInt(byte[] bArr, int i5, boolean z3) {
                return bArr[i5];
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return bArr;
            }
        };
        BYTE = binaryValueType;
        int i5 = 2;
        BinaryValueType binaryValueType2 = new BinaryValueType("SHORT", i4, i5, i5) { // from class: org.dcm4che3.data.BinaryValueType.2
            @Override // org.dcm4che3.data.BinaryValueType, org.dcm4che3.data.ValueType
            public boolean isIntValue() {
                return true;
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(int i6, byte[] bArr, int i7, boolean z3) {
                return ByteUtils.shortToBytes(i6, bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public int toInt(byte[] bArr, int i6, boolean z3) {
                return ByteUtils.bytesToShort(bArr, i6, z3);
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapShorts(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }
        };
        SHORT = binaryValueType2;
        BinaryValueType binaryValueType3 = new BinaryValueType("USHORT", i5, i5, i5) { // from class: org.dcm4che3.data.BinaryValueType.3
            @Override // org.dcm4che3.data.BinaryValueType, org.dcm4che3.data.ValueType
            public boolean isIntValue() {
                return true;
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(int i6, byte[] bArr, int i7, boolean z3) {
                return ByteUtils.shortToBytes(i6, bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public int toInt(byte[] bArr, int i6, boolean z3) {
                return ByteUtils.bytesToUShort(bArr, i6, z3);
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapShorts(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }
        };
        USHORT = binaryValueType3;
        int i6 = 4;
        BinaryValueType binaryValueType4 = new BinaryValueType("INT", 3, i6, i6) { // from class: org.dcm4che3.data.BinaryValueType.4
            @Override // org.dcm4che3.data.BinaryValueType, org.dcm4che3.data.ValueType
            public boolean isIntValue() {
                return true;
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(int i7, byte[] bArr, int i8, boolean z3) {
                return ByteUtils.intToBytes(i7, bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public int toInt(byte[] bArr, int i7, boolean z3) {
                return ByteUtils.bytesToInt(bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapInts(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }
        };
        INT = binaryValueType4;
        BinaryValueType binaryValueType5 = new BinaryValueType("TAG", i6, i6, i5) { // from class: org.dcm4che3.data.BinaryValueType.5
            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(int i7, byte[] bArr, int i8, boolean z3) {
                return ByteUtils.tagToBytes(i7, bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public int toInt(byte[] bArr, int i7, boolean z3) {
                return ByteUtils.bytesToTag(bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public String toString(byte[] bArr, int i7, boolean z3) {
                return TagUtils.toHexString(toInt(bArr, i7, z3));
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapShorts(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(String str, byte[] bArr, int i7, boolean z3) {
                return toBytes(Integer.parseInt(str, 16), bArr, i7, z3);
            }
        };
        TAG = binaryValueType5;
        BinaryValueType binaryValueType6 = new BinaryValueType("FLOAT", 5, i6, i6) { // from class: org.dcm4che3.data.BinaryValueType.6
            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(double d4, byte[] bArr, int i7, boolean z3) {
                return ByteUtils.floatToBytes((float) d4, bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public double toDouble(byte[] bArr, int i7, boolean z3) {
                return ByteUtils.bytesToFloat(bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public float toFloat(byte[] bArr, int i7, boolean z3) {
                return ByteUtils.bytesToFloat(bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public String toString(byte[] bArr, int i7, boolean z3) {
                return StringUtils.formatDS(ByteUtils.bytesToFloat(bArr, i7, z3));
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapInts(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(float f4, byte[] bArr, int i7, boolean z3) {
                return ByteUtils.floatToBytes(f4, bArr, i7, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(String str, byte[] bArr, int i7, boolean z3) {
                return toBytes(Float.parseFloat(str), bArr, i7, z3);
            }
        };
        FLOAT = binaryValueType6;
        int i7 = 8;
        BinaryValueType binaryValueType7 = new BinaryValueType("DOUBLE", 6, i7, i7) { // from class: org.dcm4che3.data.BinaryValueType.7
            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(double d4, byte[] bArr, int i8, boolean z3) {
                return ByteUtils.doubleToBytes(d4, bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public double toDouble(byte[] bArr, int i8, boolean z3) {
                return ByteUtils.bytesToDouble(bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public float toFloat(byte[] bArr, int i8, boolean z3) {
                return (float) ByteUtils.bytesToDouble(bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public String toString(byte[] bArr, int i8, boolean z3) {
                return StringUtils.formatDS(ByteUtils.bytesToDouble(bArr, i8, z3));
            }

            @Override // org.dcm4che3.data.ValueType
            public byte[] toggleEndian(byte[] bArr, boolean z3) {
                return ByteUtils.swapLongs(z3 ? (byte[]) bArr.clone() : bArr, 0, bArr.length);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(float f4, byte[] bArr, int i8, boolean z3) {
                return ByteUtils.doubleToBytes(f4, bArr, i8, z3);
            }

            @Override // org.dcm4che3.data.BinaryValueType
            public byte[] toBytes(String str, byte[] bArr, int i8, boolean z3) {
                return toBytes(Double.parseDouble(str), bArr, i8, z3);
            }
        };
        DOUBLE = binaryValueType7;
        $VALUES = new BinaryValueType[]{binaryValueType, binaryValueType2, binaryValueType3, binaryValueType4, binaryValueType5, binaryValueType6, binaryValueType7};
    }

    private BinaryValueType(String str, int i4, int i5, int i6) {
        this.numBytes = i5;
        this.numEndianBytes = i6;
    }

    private void checkLength(int i4) {
        if (i4 % this.numBytes == 0) {
            return;
        }
        throw new IllegalArgumentException("length: " + i4);
    }

    public static BinaryValueType valueOf(String str) {
        return (BinaryValueType) Enum.valueOf(BinaryValueType.class, str);
    }

    public static BinaryValueType[] values() {
        return (BinaryValueType[]) $VALUES.clone();
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isIntValue() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isStringValue() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean isTemporalType() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public int numEndianBytes() {
        return this.numEndianBytes;
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
        return obj instanceof byte[] ? prompt((byte[]) obj, z3, i4, sb) : StringValueType.prompt(obj.toString(), i4, sb);
    }

    public byte[] toBytes(double d4, byte[] bArr, int i4, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Date toDate(Object obj, TimeZone timeZone, int i4, boolean z3, Date date, DatePrecision datePrecision) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public double toDouble(Object obj, boolean z3, int i4, double d4) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int i5 = this.numBytes;
        int i6 = i4 * i5;
        return i5 + i6 <= length ? toDouble(bArr, i6, z3) : d4;
    }

    @Override // org.dcm4che3.data.ValueType
    public double[] toDoubles(Object obj, boolean z3) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        checkLength(length);
        int i4 = length / this.numBytes;
        double[] dArr = new double[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            dArr[i5] = toDouble(bArr, i6, z3);
            i5++;
            i6 += this.numBytes;
        }
        return dArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public float toFloat(Object obj, boolean z3, int i4, float f4) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int i5 = this.numBytes;
        int i6 = i4 * i5;
        return i5 + i6 <= length ? toFloat(bArr, i6, z3) : f4;
    }

    @Override // org.dcm4che3.data.ValueType
    public float[] toFloats(Object obj, boolean z3) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        checkLength(length);
        int i4 = length / this.numBytes;
        float[] fArr = new float[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            fArr[i5] = toFloat(bArr, i6, z3);
            i5++;
            i6 += this.numBytes;
        }
        return fArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public int toInt(Object obj, boolean z3, int i4, int i5) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int i6 = this.numBytes;
        int i7 = i4 * i6;
        return i6 + i7 <= length ? toInt(bArr, i7, z3) : i5;
    }

    @Override // org.dcm4che3.data.ValueType
    public int[] toInts(Object obj, boolean z3) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        checkLength(length);
        int i4 = length / this.numBytes;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            iArr[i5] = toInt(bArr, i6, z3);
            i5++;
            i6 += this.numBytes;
        }
        return iArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public String toString(Object obj, boolean z3, int i4, String str) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int i5 = this.numBytes;
        int i6 = i4 * i5;
        return i5 + i6 <= length ? toString(bArr, i6, z3) : str;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
        if (!(obj instanceof byte[])) {
            throw new UnsupportedOperationException();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        checkLength(length);
        int i4 = this.numBytes;
        int i5 = 0;
        if (length == i4) {
            return toString(bArr, 0, z3);
        }
        int i6 = length / i4;
        String[] strArr = new String[i6];
        int i7 = 0;
        while (i5 < i6) {
            strArr[i5] = toString(bArr, i7, z3);
            i5++;
            i7 += this.numBytes;
        }
        return strArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(String str, boolean z3) {
        return (str == null || str.isEmpty()) ? Value.NULL : toBytes(str, new byte[this.numBytes], 0, z3);
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean useSpecificCharacterSet() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public int vmOf(Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length / this.numBytes;
        }
        throw new UnsupportedOperationException();
    }

    private boolean prompt(byte[] bArr, boolean z3, int i4, StringBuilder sb) {
        int length = sb.length() + i4;
        int length2 = bArr.length / this.numBytes;
        int i5 = 0;
        while (true) {
            int i6 = length2 - 1;
            if (length2 <= 0) {
                return true;
            }
            sb.append(toString(bArr, i5, z3));
            if (sb.length() > length) {
                sb.setLength(length + 1);
                return false;
            }
            if (i6 > 0) {
                sb.append('\\');
            }
            i5 += this.numBytes;
            length2 = i6;
        }
    }

    public byte[] toBytes(float f4, byte[] bArr, int i4, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Date[] toDate(Object obj, TimeZone timeZone, boolean z3, DatePrecisions datePrecisions) {
        throw new UnsupportedOperationException();
    }

    public double toDouble(byte[] bArr, int i4, boolean z3) {
        throw new UnsupportedOperationException();
    }

    public float toFloat(byte[] bArr, int i4, boolean z3) {
        throw new UnsupportedOperationException();
    }

    public int toInt(byte[] bArr, int i4, boolean z3) {
        throw new UnsupportedOperationException();
    }

    public String toString(byte[] bArr, int i4, boolean z3) {
        return Integer.toString(toInt(bArr, i4, z3));
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? Value.NULL : bArr;
    }

    public byte[] toBytes(int i4, byte[] bArr, int i5, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(double[] dArr, boolean z3) {
        if (dArr == null || dArr.length == 0) {
            return Value.NULL;
        }
        byte[] bArr = new byte[dArr.length * this.numBytes];
        int i4 = 0;
        int i5 = 0;
        while (i4 < dArr.length) {
            toBytes(dArr[i4], bArr, i5, z3);
            i4++;
            i5 += this.numBytes;
        }
        return bArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(float[] fArr, boolean z3) {
        if (fArr == null || fArr.length == 0) {
            return Value.NULL;
        }
        byte[] bArr = new byte[fArr.length * this.numBytes];
        int i4 = 0;
        int i5 = 0;
        while (i4 < fArr.length) {
            toBytes(fArr[i4], bArr, i5, z3);
            i4++;
            i5 += this.numBytes;
        }
        return bArr;
    }

    public byte[] toBytes(String str, byte[] bArr, int i4, boolean z3) {
        return toBytes(StringUtils.parseIS(str), bArr, i4, z3);
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(int[] iArr, boolean z3) {
        if (iArr == null || iArr.length == 0) {
            return Value.NULL;
        }
        byte[] bArr = new byte[iArr.length * this.numBytes];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            toBytes(iArr[i4], bArr, i5, z3);
            i4++;
            i5 += this.numBytes;
        }
        return bArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(String[] strArr, boolean z3) {
        if (strArr == null || strArr.length == 0) {
            return Value.NULL;
        }
        int i4 = 0;
        if (strArr.length == 1) {
            return toValue(strArr[0], z3);
        }
        byte[] bArr = new byte[strArr.length * this.numBytes];
        int i5 = 0;
        while (i4 < strArr.length) {
            toBytes(strArr[i4], bArr, i5, z3);
            i4++;
            i5 += this.numBytes;
        }
        return bArr;
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(Date[] dateArr, TimeZone timeZone, DatePrecision datePrecision) {
        throw new UnsupportedOperationException();
    }
}
