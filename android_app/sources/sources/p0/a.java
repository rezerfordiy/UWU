package p0;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {
    @c.k(api = 24)
    @Deprecated
    public static boolean a() {
        return true;
    }

    @c.k(api = 25)
    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @c.k(api = 26)
    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @c.k(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @c.k(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @c.k(api = 29)
    @Deprecated
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @c.k(api = 30)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @c.k(codename = "S")
    public static boolean h() {
        return Build.VERSION.CODENAME.equals("S");
    }
}
