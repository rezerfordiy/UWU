package org.dcm4che3.data;

/* JADX INFO: loaded from: classes.dex */
public class DatePrecision {
    public boolean includeTimezone;
    public int lastField;

    public DatePrecision() {
        this(14, false);
    }

    public DatePrecision(int i4) {
        this(i4, false);
    }

    public DatePrecision(int i4, boolean z3) {
        this.lastField = i4;
        this.includeTimezone = z3;
    }
}
