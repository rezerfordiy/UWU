package b0;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import c.j0;
import c.k0;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4338a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4339b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4340c = -2;

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static int a(@j0 Context context, @j0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@j0 Context context, @j0 String str, @k0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@j0 Context context, @j0 String str, int i4, int i5, @k0 String str2) {
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String strE = a0.i.e(str);
        if (strE == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return a0.i.d(context, strE, str2) != 0 ? -2 : 0;
    }

    public static int d(@j0 Context context, @j0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
