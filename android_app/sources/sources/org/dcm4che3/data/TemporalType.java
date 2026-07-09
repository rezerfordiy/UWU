package org.dcm4che3.data;

import java.util.Date;
import java.util.TimeZone;
import org.dcm4che3.util.DateUtils;

/* JADX INFO: loaded from: classes.dex */
enum TemporalType {
    DA { // from class: org.dcm4che3.data.TemporalType.1
        @Override // org.dcm4che3.data.TemporalType
        public String format(TimeZone timeZone, Date date, DatePrecision datePrecision) {
            return DateUtils.formatDA(timeZone, date);
        }

        @Override // org.dcm4che3.data.TemporalType
        public Date parse(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision) {
            datePrecision.lastField = 5;
            return DateUtils.parseDA(timeZone, str, z3);
        }
    },
    DT { // from class: org.dcm4che3.data.TemporalType.2
        @Override // org.dcm4che3.data.TemporalType
        public String format(TimeZone timeZone, Date date, DatePrecision datePrecision) {
            return DateUtils.formatDT(timeZone, date, datePrecision);
        }

        @Override // org.dcm4che3.data.TemporalType
        public Date parse(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision) {
            return DateUtils.parseDT(timeZone, str, z3, datePrecision);
        }
    },
    TM { // from class: org.dcm4che3.data.TemporalType.3
        @Override // org.dcm4che3.data.TemporalType
        public String format(TimeZone timeZone, Date date, DatePrecision datePrecision) {
            return DateUtils.formatTM(timeZone, date, datePrecision);
        }

        @Override // org.dcm4che3.data.TemporalType
        public Date parse(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision) {
            return DateUtils.parseTM(timeZone, str, z3, datePrecision);
        }
    };

    public abstract String format(TimeZone timeZone, Date date, DatePrecision datePrecision);

    public abstract Date parse(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision);
}
