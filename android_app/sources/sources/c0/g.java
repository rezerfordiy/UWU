package c0;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY})
    public @interface a {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY})
    public @interface b {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@c.j0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@c.j0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtectionFlags() : permissionInfo.protectionLevel & (-16);
    }
}
