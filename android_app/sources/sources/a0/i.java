package a0;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f84b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86d = 3;

    public static int a(@c.j0 Context context, @c.j0 String str, int i4, @c.j0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i4, str2);
    }

    public static int b(@c.j0 Context context, @c.j0 String str, int i4, @c.j0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i4, str2);
    }

    public static int c(@c.j0 Context context, @c.j0 String str, @c.j0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int d(@c.j0 Context context, @c.j0 String str, @c.j0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    @c.k0
    public static String e(@c.j0 String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
