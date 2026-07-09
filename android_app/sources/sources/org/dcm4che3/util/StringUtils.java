package org.dcm4che3.util;

import androidx.constraintlayout.widget.e;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    public static String LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.dcm4che3.util.StringUtils.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("line.separator");
        }
    });
    public static String[] EMPTY_STRING = new String[0];

    public static StringBuilder appendLine(StringBuilder sb, Object... objArr) {
        for (Object obj : objArr) {
            sb.append(obj);
        }
        sb.append(LINE_SEPARATOR);
        return sb;
    }

    public static Pattern compilePattern(String str, boolean z3) {
        String str2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "*?", true);
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!stringTokenizer.hasMoreTokens()) {
                break;
            }
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == '*') {
                str2 = ".*";
            } else if (cCharAt == '?') {
                str2 = ".";
            } else {
                sb.append("\\Q");
                sb.append(strNextToken);
                str2 = "\\E";
            }
            sb.append(str2);
        }
        return Pattern.compile(sb.toString(), z3 ? 2 : 0);
    }

    public static String concat(Collection<String> collection, char c4) {
        int size = collection.size();
        if (size == 0) {
            return a.f11071l;
        }
        if (size == 1) {
            String next = collection.iterator().next();
            return next != null ? next : a.f11071l;
        }
        int length = size - 1;
        for (String str : collection) {
            if (str != null) {
                length += str.length();
            }
        }
        char[] cArr = new char[length];
        int i4 = 0;
        int i5 = 0;
        for (String str2 : collection) {
            int i6 = i4 + 1;
            if (i4 != 0) {
                cArr[i5] = c4;
                i5++;
            }
            if (str2 != null) {
                int length2 = str2.length();
                str2.getChars(0, length2, cArr, i5);
                i5 += length2;
            }
            i4 = i6;
        }
        return new String(cArr);
    }

    public static boolean containsWildCard(String str) {
        return str.indexOf(42) >= 0 || str.indexOf(63) >= 0;
    }

    public static String cut(String str, int i4, char c4) {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iIndexOf = str.indexOf(c4, i5);
            if (iIndexOf < 0) {
                return i6 == i4 ? str.substring(i5) : a.f11071l;
            }
            int i7 = i6 + 1;
            if (i6 == i4) {
                return str.substring(i5, iIndexOf);
            }
            i5 = iIndexOf + 1;
            i6 = i7;
        }
    }

    public static <T> boolean equals(T t4, T t5) {
        return t4 == t5 || (t4 != null && t4.equals(t5));
    }

    public static String formatDS(double d4) {
        String string = Double.toString(d4);
        int length = string.length();
        int i4 = length - 2;
        if (string.startsWith(".0", i4)) {
            return string.substring(0, i4);
        }
        int i5 = length - 16;
        int iIndexOf = string.indexOf(69, length - 5);
        if (iIndexOf < 0) {
            return i5 > 0 ? string.substring(0, 16) : string;
        }
        int i6 = iIndexOf - 2;
        return string.startsWith(".0", i6) ? cut(string, i6, iIndexOf) : i5 > 0 ? cut(string, iIndexOf - i5, iIndexOf) : string;
    }

    public static boolean isIPAddr(String str) {
        int i4;
        int i5;
        String[] strArrSplit = split(str, ':');
        if (strArrSplit.length > 1) {
            return strArrSplit.length == 8;
        }
        String[] strArrSplit2 = split(str, '.');
        if (strArrSplit2.length != 4) {
            return false;
        }
        for (String str2 : strArrSplit2) {
            if (str2.length() > 3) {
                return false;
            }
            int length = str2.length();
            if (length != 1) {
                if (length == 2) {
                    i5 = 0;
                } else {
                    if (length != 3) {
                        return false;
                    }
                    char cCharAt = str2.charAt(0);
                    if (cCharAt != '1' && cCharAt != '2') {
                        return false;
                    }
                    i5 = 1;
                }
                i4 = i5 + 1;
                char cCharAt2 = str2.charAt(i5);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    return false;
                }
            } else {
                i4 = 0;
            }
            char cCharAt3 = str2.charAt(i4);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isUpperCase(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (Character.toUpperCase(cCharAt) != cCharAt) {
                return false;
            }
        }
        return length != 0;
    }

    public static String maskEmpty(String str, String str2) {
        return (str == null || str.isEmpty()) ? str2 : str;
    }

    public static <T> T maskNull(T t4, T t5) {
        return t4 == null ? t5 : t4;
    }

    public static boolean matches(String str, String str2, boolean z3, boolean z4) {
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        return (str == null || str.isEmpty()) ? z3 : containsWildCard(str2) ? compilePattern(str2, z4).matcher(str).matches() : z4 ? str2.equalsIgnoreCase(str) : str2.equals(str);
    }

    public static <T> T nullify(T t4, T t5) {
        if (t5.equals(t4)) {
            return null;
        }
        return t4;
    }

    public static double parseDS(String str) {
        if (str == null || str.length() == 0) {
            return 0.0d;
        }
        return Double.parseDouble(str.replace(',', '.'));
    }

    public static int parseIS(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static String replaceSystemProperties(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf("${");
        if (iIndexOf2 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i4 = -1;
        while (true) {
            sb.append(str.substring(i4 + 1, iIndexOf2));
            int i5 = iIndexOf2 + 2;
            iIndexOf = str.indexOf(e.m.A3, i5);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2 - 1;
                break;
            }
            String property = str.startsWith("env.", i5) ? System.getenv(str.substring(iIndexOf2 + 6, iIndexOf)) : System.getProperty(str.substring(i5, iIndexOf));
            if (property == null) {
                property = str.substring(iIndexOf2, iIndexOf + 1);
            }
            sb.append(property);
            iIndexOf2 = str.indexOf("${", iIndexOf + 1);
            if (iIndexOf2 == -1) {
                break;
            }
            i4 = iIndexOf;
        }
        sb.append(str.substring(iIndexOf + 1));
        return sb.toString();
    }

    @Deprecated
    public static String resourceURL(String str) {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(str);
        if (resource != null) {
            return resource.toString();
        }
        return null;
    }

    public static String[] split(String str, char c4) {
        if (str == null || str.isEmpty()) {
            return EMPTY_STRING;
        }
        int iIndexOf = -1;
        int i4 = 1;
        while (true) {
            iIndexOf = str.indexOf(c4, iIndexOf + 1);
            if (iIndexOf < 0) {
                break;
            }
            i4++;
        }
        if (i4 == 1) {
            return new String[]{str};
        }
        String[] strArr = new String[i4];
        int length = str.length();
        while (true) {
            i4--;
            if (i4 < 0) {
                return strArr;
            }
            int iLastIndexOf = str.lastIndexOf(c4, length - 1);
            strArr[i4] = str.substring(iLastIndexOf + 1, length);
            length = iLastIndexOf;
        }
    }

    public static Object splitAndTrim(String str, char c4) {
        int i4 = 1;
        int iIndexOf = -1;
        while (true) {
            iIndexOf = str.indexOf(c4, iIndexOf + 1);
            if (iIndexOf < 0) {
                break;
            }
            i4++;
        }
        if (i4 == 1) {
            return substring(str, 0, str.length());
        }
        String[] strArr = new String[i4];
        int length = str.length();
        while (true) {
            i4--;
            if (i4 < 0) {
                return strArr;
            }
            int iLastIndexOf = str.lastIndexOf(c4, length - 1);
            strArr[i4] = substring(str, iLastIndexOf + 1, length);
            length = iLastIndexOf;
        }
    }

    private static String substring(String str, int i4, int i5) {
        while (i4 < i5 && str.charAt(i4) <= ' ') {
            i4++;
        }
        while (i4 < i5 && str.charAt(i5 - 1) <= ' ') {
            i5--;
        }
        return i4 < i5 ? str.substring(i4, i5) : a.f11071l;
    }

    public static String trimTrailing(String str) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) <= ' ') {
            length--;
        }
        return str.substring(0, length);
    }

    public static String truncate(String str, int i4) {
        return str.length() > i4 ? str.substring(0, i4) : str;
    }

    public static String concat(String[] strArr, char c4) {
        int length = strArr.length;
        if (length == 0) {
            return a.f11071l;
        }
        if (length == 1) {
            String str = strArr[0];
            return str != null ? str : a.f11071l;
        }
        int length2 = length - 1;
        for (String str2 : strArr) {
            if (str2 != null) {
                length2 += str2.length();
            }
        }
        char[] cArr = new char[length2];
        int length3 = strArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length3) {
            String str3 = strArr[i4];
            int i7 = i5 + 1;
            if (i5 != 0) {
                cArr[i6] = c4;
                i6++;
            }
            if (str3 != null) {
                int length4 = str3.length();
                str3.getChars(0, length4, cArr, i6);
                i6 += length4;
            }
            i4++;
            i5 = i7;
        }
        return new String(cArr);
    }

    private static String cut(String str, int i4, int i5) {
        int length = str.length();
        char[] cArr = new char[length - (i5 - i4)];
        str.getChars(0, i4, cArr, 0);
        str.getChars(i5, length, cArr, i4);
        return new String(cArr);
    }

    public static String formatDS(float f4) {
        String string = Float.toString(f4);
        int length = string.length();
        int i4 = length - 2;
        if (string.startsWith(".0", i4)) {
            return string.substring(0, i4);
        }
        int iIndexOf = string.indexOf(69, length - 5);
        if (iIndexOf <= 0) {
            return string;
        }
        int i5 = iIndexOf - 2;
        return string.startsWith(".0", i5) ? cut(string, i5, iIndexOf) : string;
    }

    public static String[] maskNull(String[] strArr) {
        return (String[]) maskNull(strArr, EMPTY_STRING);
    }
}
