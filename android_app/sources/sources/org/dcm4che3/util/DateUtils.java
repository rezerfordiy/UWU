package org.dcm4che3.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.dcm4che3.data.DatePrecision;

/* JADX INFO: loaded from: classes.dex */
public class DateUtils {
    public static final Date[] EMPTY_DATES = new Date[0];
    private static TimeZone cachedTimeZone;

    private static void appendXX(int i4, StringBuilder sb) {
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
    }

    private static void appendXXX(int i4, StringBuilder sb) {
        if (i4 < 100) {
            sb.append('0');
        }
        appendXX(i4, sb);
    }

    private static void appendXXXX(int i4, StringBuilder sb) {
        if (i4 < 1000) {
            sb.append('0');
        }
        appendXXX(i4, sb);
    }

    private static StringBuilder appendZZZZZ(int i4, StringBuilder sb) {
        char c4;
        if (i4 < 0) {
            i4 = -i4;
            c4 = '-';
        } else {
            c4 = '+';
        }
        sb.append(c4);
        int i5 = i4 / 60000;
        appendXX(i5 / 60, sb);
        appendXX(i5 % 60, sb);
        return sb;
    }

    private static Calendar cal(TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = timeZone != null ? new GregorianCalendar(timeZone) : new GregorianCalendar();
        gregorianCalendar.clear();
        return gregorianCalendar;
    }

    private static void ceil(Calendar calendar, int i4) {
        calendar.add(i4, 1);
        calendar.add(14, -1);
    }

    public static String formatDA(TimeZone timeZone, Date date) {
        return formatDA(timeZone, date, new StringBuilder(8)).toString();
    }

    public static String formatDT(TimeZone timeZone, Date date) {
        return formatDT(timeZone, date, new DatePrecision());
    }

    public static String formatTM(TimeZone timeZone, Date date) {
        return formatTM(timeZone, date, new DatePrecision());
    }

    public static String formatTimezoneOffsetFromUTC(TimeZone timeZone) {
        return appendZZZZZ(timeZone.getRawOffset(), new StringBuilder(5)).toString();
    }

    public static Date parseDA(TimeZone timeZone, String str) {
        return parseDA(timeZone, str, false);
    }

    public static Date parseDT(TimeZone timeZone, String str, DatePrecision datePrecision) {
        return parseDT(timeZone, str, false, datePrecision);
    }

    private static Date parseTM(Calendar calendar, String str, boolean z3, DatePrecision datePrecision) {
        int length = str.length();
        if (2 > length) {
            throw new IllegalArgumentException(str);
        }
        try {
            datePrecision.lastField = 11;
            calendar.set(11, Integer.parseInt(str.substring(0, 2)));
            if (2 < length) {
                int i4 = Character.isDigit(str.charAt(2)) ? 2 : 3;
                int i5 = i4 + 2;
                if (i5 > length) {
                    throw new IllegalArgumentException(str);
                }
                datePrecision.lastField = 12;
                calendar.set(12, Integer.parseInt(str.substring(i4, i5)));
                if (i5 < length) {
                    if (!Character.isDigit(str.charAt(i5))) {
                        i5++;
                    }
                    int i6 = i5 + 2;
                    if (i6 > length) {
                        throw new IllegalArgumentException(str);
                    }
                    datePrecision.lastField = 13;
                    calendar.set(13, Integer.parseInt(str.substring(i5, i6)));
                    if (i6 < length) {
                        float f4 = Float.parseFloat(str.substring(i6));
                        if (f4 >= 1.0f || f4 < 0.0f) {
                            throw new IllegalArgumentException(str);
                        }
                        datePrecision.lastField = 14;
                        calendar.set(14, (int) (f4 * 1000.0f));
                        return calendar.getTime();
                    }
                }
            }
            if (z3) {
                ceil(calendar, datePrecision.lastField);
            }
            return calendar.getTime();
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    private static TimeZone safeTimeZone(String str) {
        String strTzid = tzid(str);
        if (strTzid == null) {
            return null;
        }
        TimeZone timeZone = cachedTimeZone;
        if (timeZone != null && timeZone.getID().equals(strTzid)) {
            return timeZone;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(strTzid);
        cachedTimeZone = timeZone2;
        return timeZone2;
    }

    public static TimeZone timeZone(String str) {
        TimeZone timeZoneSafeTimeZone;
        if (str.length() == 5 && (timeZoneSafeTimeZone = safeTimeZone(str)) != null) {
            return timeZoneSafeTimeZone;
        }
        throw new IllegalArgumentException("Illegal Timezone Offset: " + str);
    }

    private static String tzid(String str) {
        int length = str.length();
        if (length <= 4) {
            return null;
        }
        char[] cArr = {'G', 'M', 'T', 0, 0, 0, ':', 0, 0};
        int i4 = length - 2;
        str.getChars(length - 5, i4, cArr, 3);
        str.getChars(i4, length, cArr, 7);
        char c4 = cArr[3];
        if ((c4 == '+' || c4 == '-') && Character.isDigit(cArr[4]) && Character.isDigit(cArr[5]) && Character.isDigit(cArr[7]) && Character.isDigit(cArr[8])) {
            return new String(cArr);
        }
        return null;
    }

    private static Calendar cal(TimeZone timeZone, Date date) {
        GregorianCalendar gregorianCalendar = timeZone != null ? new GregorianCalendar(timeZone) : new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }

    public static StringBuilder formatDA(TimeZone timeZone, Date date, StringBuilder sb) {
        return formatDT(cal(timeZone, date), sb, 5);
    }

    public static String formatDT(TimeZone timeZone, Date date, DatePrecision datePrecision) {
        return formatDT(timeZone, date, new StringBuilder(23), datePrecision).toString();
    }

    public static String formatTM(TimeZone timeZone, Date date, DatePrecision datePrecision) {
        return formatTM(cal(timeZone, date), new StringBuilder(10), datePrecision.lastField).toString();
    }

    public static String formatTimezoneOffsetFromUTC(TimeZone timeZone, Date date) {
        return appendZZZZZ(timeZone.getOffset(date == null ? System.currentTimeMillis() : date.getTime()), new StringBuilder(5)).toString();
    }

    public static Date parseDA(TimeZone timeZone, String str, boolean z3) {
        Calendar calendarCal = cal(timeZone);
        int length = str.length();
        if (length != 8 && (length != 10 || Character.isDigit(str.charAt(4)))) {
            throw new IllegalArgumentException(str);
        }
        try {
            calendarCal.set(1, Integer.parseInt(str.substring(0, 4)));
            int i4 = Character.isDigit(str.charAt(4)) ? 4 : 5;
            int i5 = i4 + 2;
            calendarCal.set(2, Integer.parseInt(str.substring(i4, i5)) - 1);
            if (!Character.isDigit(str.charAt(i5))) {
                i5++;
            }
            calendarCal.set(5, Integer.parseInt(str.substring(i5)));
            if (z3) {
                ceil(calendarCal, 5);
            }
            return calendarCal.getTime();
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Date parseDT(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision) {
        int length = str.length();
        TimeZone timeZoneSafeTimeZone = safeTimeZone(str);
        boolean z4 = timeZoneSafeTimeZone != null;
        datePrecision.includeTimezone = z4;
        if (z4) {
            length -= 5;
            timeZone = timeZoneSafeTimeZone;
        }
        Calendar calendarCal = cal(timeZone);
        try {
            if (4 > length) {
                throw new IllegalArgumentException(str);
            }
            datePrecision.lastField = 1;
            calendarCal.set(1, Integer.parseInt(str.substring(0, 4)));
            if (4 < length) {
                int i4 = Character.isDigit(str.charAt(4)) ? 4 : 5;
                int i5 = i4 + 2;
                if (i5 > length) {
                    throw new IllegalArgumentException(str);
                }
                datePrecision.lastField = 2;
                calendarCal.set(2, Integer.parseInt(str.substring(i4, i5)) - 1);
                if (i5 < length) {
                    if (!Character.isDigit(str.charAt(i5))) {
                        i5++;
                    }
                    int i6 = i5 + 2;
                    if (i6 > length) {
                        throw new IllegalArgumentException(str);
                    }
                    datePrecision.lastField = 5;
                    calendarCal.set(5, Integer.parseInt(str.substring(i5, i6)));
                    if (i6 < length) {
                        return parseTM(calendarCal, str.substring(i6, length), z3, datePrecision);
                    }
                }
            }
            if (z3) {
                ceil(calendarCal, datePrecision.lastField);
            }
            return calendarCal.getTime();
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Date parseTM(TimeZone timeZone, String str, DatePrecision datePrecision) {
        return parseTM(timeZone, str, false, datePrecision);
    }

    private static StringBuilder formatDT(Calendar calendar, StringBuilder sb, int i4) {
        appendXXXX(calendar.get(1), sb);
        if (i4 > 1) {
            appendXX(calendar.get(2) + 1, sb);
            if (i4 > 2) {
                appendXX(calendar.get(5), sb);
                if (i4 > 5) {
                    formatTM(calendar, sb, i4);
                }
            }
        }
        return sb;
    }

    private static StringBuilder formatTM(Calendar calendar, StringBuilder sb, int i4) {
        appendXX(calendar.get(11), sb);
        if (i4 > 11) {
            appendXX(calendar.get(12), sb);
            if (i4 > 12) {
                appendXX(calendar.get(13), sb);
                if (i4 > 13) {
                    sb.append('.');
                    appendXXX(calendar.get(14), sb);
                }
            }
        }
        return sb;
    }

    public static Date parseTM(TimeZone timeZone, String str, boolean z3, DatePrecision datePrecision) {
        return parseTM(cal(timeZone), str, z3, datePrecision);
    }

    public static StringBuilder formatDT(TimeZone timeZone, Date date, StringBuilder sb, DatePrecision datePrecision) {
        Calendar calendarCal = cal(timeZone, date);
        formatDT(calendarCal, sb, datePrecision.lastField);
        if (datePrecision.includeTimezone) {
            appendZZZZZ(calendarCal.get(15) + calendarCal.get(16), sb);
        }
        return sb;
    }
}
