package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
enum SequenceValueType implements ValueType {
    SQ;

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
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb) {
        sb.append(obj);
        return true;
    }

    @Override // org.dcm4che3.data.ValueType
    public byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Date toDate(Object obj, TimeZone timeZone, int i4, boolean z3, Date date, DatePrecision datePrecision) {
        throw new UnsupportedOperationException();
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

    @Override // org.dcm4che3.data.ValueType
    public String toString(Object obj, boolean z3, int i4, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(String str, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public byte[] toggleEndian(byte[] bArr, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public boolean useSpecificCharacterSet() {
        return false;
    }

    @Override // org.dcm4che3.data.ValueType
    public int vmOf(Object obj) {
        return 1;
    }

    @Override // org.dcm4che3.data.ValueType
    public Date[] toDate(Object obj, TimeZone timeZone, boolean z3, DatePrecisions datePrecisions) {
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(byte[] bArr) {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.ValueType
    public Object toValue(Date[] dateArr, TimeZone timeZone, DatePrecision datePrecision) {
        throw new UnsupportedOperationException();
    }
}
