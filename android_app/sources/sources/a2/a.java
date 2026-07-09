package a2;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static int a(String str, char[] cArr) {
        int i4 = -1;
        for (char c4 : cArr) {
            int iIndexOf = str.indexOf(c4);
            if (iIndexOf > -1 && (i4 == -1 || iIndexOf < i4)) {
                i4 = iIndexOf;
                if (iIndexOf == 0) {
                    break;
                }
            }
        }
        return i4;
    }

    public static int b(String str, char[] cArr, int i4) {
        int iA = a(str.substring(i4), cArr);
        if (iA == -1) {
            return -1;
        }
        return iA + i4;
    }

    public static int c(String str, char[] cArr, int i4, int i5) {
        int iA = a(str.substring(i4, i5 + i4), cArr);
        if (iA == -1) {
            return -1;
        }
        return iA + i4;
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean e(String str) {
        if (str == null) {
            return true;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String f(String str, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return g(str, strArr, 0, strArr.length);
    }

    public static String g(String str, String[] strArr, int i4, int i5) {
        if (strArr == null) {
            return null;
        }
        String str2 = s0.a.f11071l;
        for (int i6 = i4; i6 < strArr.length && i6 - i4 < i5; i6++) {
            if (str != null && i6 > i4) {
                str2 = str2 + str;
            }
            if (strArr[i6] != null) {
                str2 = str2 + strArr[i6];
            }
        }
        return str2;
    }

    public static int h(String str, char c4, int i4, int i5) {
        int i6 = i4 + 1;
        int i7 = i6 - i5;
        int iLastIndexOf = str.substring(i7, i6).lastIndexOf(c4);
        if (iLastIndexOf < 0) {
            return -1;
        }
        return iLastIndexOf + i7;
    }

    public static int i(String str, String str2, int i4, int i5) {
        int i6 = i4 + 1;
        int i7 = i6 - i5;
        int iLastIndexOf = str.substring(i7, i6).lastIndexOf(str2);
        if (iLastIndexOf < 0) {
            return -1;
        }
        return iLastIndexOf + i7;
    }

    public static int j(String str, char[] cArr) {
        int i4 = -1;
        for (char c4 : cArr) {
            int iLastIndexOf = str.lastIndexOf(c4);
            if (iLastIndexOf > i4) {
                if (iLastIndexOf == str.length() - 1) {
                    return iLastIndexOf;
                }
                i4 = iLastIndexOf;
            }
        }
        return i4;
    }

    public static int k(String str, char[] cArr, int i4) {
        int iJ = j(str.substring(0, i4 + 1), cArr);
        if (iJ < 0) {
            return -1;
        }
        return iJ;
    }

    public static int l(String str, char[] cArr, int i4, int i5) {
        int i6 = i4 + 1;
        int i7 = i6 - i5;
        int iJ = j(str.substring(i7, i6), cArr);
        if (iJ < 0) {
            return -1;
        }
        return iJ + i7;
    }

    public static String m(String str, int i4) {
        return n(str, i4, ' ');
    }

    public static String n(String str, int i4, char c4) {
        StringBuilder sb = new StringBuilder(s0.a.f11071l);
        while (sb.length() + str.length() < i4) {
            sb.append(c4);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String o(String str, int i4) {
        return p(str, i4, ' ');
    }

    public static String p(String str, int i4, char c4) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < i4) {
            sb.append(c4);
        }
        return sb.toString();
    }

    public static String q(String str, int i4) {
        return str.substring(0, i4);
    }

    public static String r(String str, int i4, int i5) {
        return str.substring(0, i4) + str.substring(i4 + i5);
    }

    public static boolean s(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public static String t(String str, int i4, int i5) {
        if (i5 >= 0) {
            return str.substring(i4, i5 + i4);
        }
        throw new IndexOutOfBoundsException("Parameter length cannot be negative.");
    }

    public static String u(String str, Character... chArr) {
        return v(w(str, chArr), chArr);
    }

    public static String v(String str, Character... chArr) {
        boolean z3;
        if (str == null || chArr == null) {
            return str;
        }
        int length = str.length();
        for (int length2 = str.length() - 1; length2 >= 0; length2--) {
            if (chArr.length != 0) {
                for (Character ch : chArr) {
                    if (str.charAt(length2) == ch.charValue()) {
                        length = length2;
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            } else {
                if (Character.isWhitespace(str.charAt(length2))) {
                    length = length2;
                    z3 = true;
                    break;
                }
                z3 = false;
            }
            if (!z3) {
                break;
            }
        }
        return str.substring(0, length);
    }

    public static String w(String str, Character... chArr) {
        if (str == null || chArr == null) {
            return str;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            boolean z3 = true;
            if (chArr.length != 0) {
                for (Character ch : chArr) {
                    if (str.charAt(i5) == ch.charValue()) {
                        i4 = i5 + 1;
                        break;
                    }
                }
                z3 = false;
            } else {
                if (Character.isWhitespace(str.charAt(i5))) {
                    i4 = i5 + 1;
                    break;
                }
                z3 = false;
            }
            if (!z3) {
                break;
            }
        }
        return str.substring(i4);
    }
}
