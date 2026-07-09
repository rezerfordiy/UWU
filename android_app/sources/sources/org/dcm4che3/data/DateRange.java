package org.dcm4che3.data;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DateRange implements Serializable {
    private static final long serialVersionUID = 88574297440294935L;
    private final Date end;
    private final Date start;

    public DateRange(Date date, Date date2) {
        this.start = date;
        this.end = date2;
    }

    public boolean contains(Date date) {
        Date date2;
        Date date3 = this.start;
        return (date3 == null || !date3.after(date)) && ((date2 = this.end) == null || !date2.before(date));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        Date date = this.start;
        if (date != null ? date.equals(dateRange.start) : dateRange.start == null) {
            Date date2 = this.end;
            Date date3 = dateRange.end;
            if (date2 == null) {
                if (date3 == null) {
                    return true;
                }
            } else if (date2.equals(date3)) {
                return true;
            }
        }
        return false;
    }

    public final Date getEndDate() {
        return this.end;
    }

    public final Date getStartDate() {
        return this.start;
    }

    public int hashCode() {
        Date date = this.start;
        int iHashCode = date != null ? date.hashCode() : 0;
        return this.end != null ? iHashCode ^ this.start.hashCode() : iHashCode;
    }

    public boolean isStartDateExeedsEndDate() {
        Date date;
        Date date2 = this.start;
        return (date2 == null || (date = this.end) == null || !date2.after(date)) ? false : true;
    }

    public String toString() {
        return "[" + this.start + ", " + this.end + "]";
    }
}
