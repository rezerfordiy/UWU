package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
interface ValueType {
    boolean isIntValue();

    boolean isStringValue();

    boolean isTemporalType();

    int numEndianBytes();

    boolean prompt(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet, int i4, StringBuilder sb);

    byte[] toBytes(Object obj, SpecificCharacterSet specificCharacterSet);

    Date toDate(Object obj, TimeZone timeZone, int i4, boolean z3, Date date, DatePrecision datePrecision);

    Date[] toDate(Object obj, TimeZone timeZone, boolean z3, DatePrecisions datePrecisions);

    double toDouble(Object obj, boolean z3, int i4, double d4);

    double[] toDoubles(Object obj, boolean z3);

    float toFloat(Object obj, boolean z3, int i4, float f4);

    float[] toFloats(Object obj, boolean z3);

    int toInt(Object obj, boolean z3, int i4, int i5);

    int[] toInts(Object obj, boolean z3);

    String toString(Object obj, boolean z3, int i4, String str);

    Object toStrings(Object obj, boolean z3, SpecificCharacterSet specificCharacterSet);

    Object toValue(String str, boolean z3);

    Object toValue(byte[] bArr);

    Object toValue(double[] dArr, boolean z3);

    Object toValue(float[] fArr, boolean z3);

    Object toValue(int[] iArr, boolean z3);

    Object toValue(String[] strArr, boolean z3);

    Object toValue(Date[] dateArr, TimeZone timeZone, DatePrecision datePrecision);

    byte[] toggleEndian(byte[] bArr, boolean z3);

    boolean useSpecificCharacterSet();

    int vmOf(Object obj);
}
