package u0;

import android.text.TextUtils;
import c.b0;
import c.j0;
import c.k0;
import c.r0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class i {
    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3, @j0 Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i4, int i5, int i6, @j0 String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i4 <= i6) {
            return i4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    @b0(from = 0)
    public static int d(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    @b0(from = 0)
    public static int e(int i4, @k0 String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    @j0
    public static <T> T g(@k0 T t4) {
        t4.getClass();
        return t4;
    }

    @j0
    public static <T> T h(@k0 T t4, @j0 Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z3) {
        j(z3, null);
    }

    public static void j(boolean z3, @k0 String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    @j0
    public static <T extends CharSequence> T k(@k0 T t4) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException();
        }
        return t4;
    }

    @j0
    public static <T extends CharSequence> T l(@k0 T t4, @j0 Object obj) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t4;
    }

    @j0
    public static <T extends CharSequence> T m(@k0 T t4, @j0 String str, @j0 Object... objArr) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t4;
    }
}
