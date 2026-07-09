package u0;

import c.r0;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static final int f11591a = 19;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11592b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11593c = 3600;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11594d = 86400;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f11595e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char[] f11596f = new char[24];

    public static int a(int i4, int i5, boolean z3, int i6) {
        if (i4 > 99 || (z3 && i6 >= 3)) {
            return i5 + 3;
        }
        if (i4 > 9 || (z3 && i6 >= 2)) {
            return i5 + 2;
        }
        if (z3 || i4 > 0) {
            return i5 + 1;
        }
        return 0;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j4, long j5, PrintWriter printWriter) {
        if (j4 == 0) {
            printWriter.print("--");
        } else {
            d(j4 - j5, printWriter, 0);
        }
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j4, PrintWriter printWriter) {
        d(j4, printWriter, 0);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j4, PrintWriter printWriter, int i4) {
        synchronized (f11595e) {
            printWriter.print(new String(f11596f, 0, f(j4, i4)));
        }
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j4, StringBuilder sb) {
        synchronized (f11595e) {
            sb.append(f11596f, 0, f(j4, 0));
        }
    }

    public static int f(long j4, int i4) {
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j5 = j4;
        if (f11596f.length < i4) {
            f11596f = new char[i4];
        }
        char[] cArr = f11596f;
        if (j5 == 0) {
            int i10 = i4 - 1;
            while (i10 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j5 > 0) {
            c4 = '+';
        } else {
            j5 = -j5;
            c4 = '-';
        }
        int i11 = (int) (j5 % 1000);
        int iFloor = (int) Math.floor(j5 / 1000);
        if (iFloor > 86400) {
            i5 = iFloor / f11594d;
            iFloor -= f11594d * i5;
        } else {
            i5 = 0;
        }
        if (iFloor > 3600) {
            i6 = iFloor / f11593c;
            iFloor -= i6 * f11593c;
        } else {
            i6 = 0;
        }
        if (iFloor > 60) {
            int i12 = iFloor / 60;
            i7 = iFloor - (i12 * 60);
            i8 = i12;
        } else {
            i7 = iFloor;
            i8 = 0;
        }
        if (i4 != 0) {
            int iA = a(i5, 1, false, 0);
            int iA2 = iA + a(i6, 1, iA > 0, 2);
            int iA3 = iA2 + a(i8, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(i7, 1, iA3 > 0, 2);
            i9 = 0;
            for (int iA5 = iA4 + a(i11, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i4; iA5++) {
                cArr[i9] = ' ';
                i9++;
            }
        } else {
            i9 = 0;
        }
        cArr[i9] = c4;
        int i13 = i9 + 1;
        boolean z3 = i4 != 0;
        int iG = g(cArr, i5, 'd', i13, false, 0);
        int iG2 = g(cArr, i6, 'h', iG, iG != i13, z3 ? 2 : 0);
        int iG3 = g(cArr, i8, 'm', iG2, iG2 != i13, z3 ? 2 : 0);
        int iG4 = g(cArr, i7, 's', iG3, iG3 != i13, z3 ? 2 : 0);
        int iG5 = g(cArr, i11, 'm', iG4, true, (!z3 || iG4 == i13) ? 0 : 3);
        cArr[iG5] = 's';
        return iG5 + 1;
    }

    public static int g(char[] cArr, int i4, char c4, int i5, boolean z3, int i6) {
        int i7;
        if (!z3 && i4 <= 0) {
            return i5;
        }
        if ((!z3 || i6 < 3) && i4 <= 99) {
            i7 = i5;
        } else {
            int i8 = i4 / 100;
            cArr[i5] = (char) (i8 + 48);
            i7 = i5 + 1;
            i4 -= i8 * 100;
        }
        if ((z3 && i6 >= 2) || i4 > 9 || i5 != i7) {
            int i9 = i4 / 10;
            cArr[i7] = (char) (i9 + 48);
            i7++;
            i4 -= i9 * 10;
        }
        cArr[i7] = (char) (i4 + 48);
        int i10 = i7 + 1;
        cArr[i10] = c4;
        return i10 + 1;
    }
}
