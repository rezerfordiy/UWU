package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f93a = "BundleCompatBaseImpl";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f94b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f95c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Method f96d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static boolean f97e;

        public static IBinder a(Bundle bundle, String str) {
            if (!f95c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f94b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e4) {
                    Log.i(f93a, "Failed to retrieve getIBinder method", e4);
                }
                f95c = true;
            }
            Method method2 = f94b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    Log.i(f93a, "Failed to invoke getIBinder via reflection", e5);
                    f94b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f97e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f96d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e4) {
                    Log.i(f93a, "Failed to retrieve putIBinder method", e4);
                }
                f97e = true;
            }
            Method method2 = f96d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    Log.i(f93a, "Failed to invoke putIBinder via reflection", e5);
                    f96d = null;
                }
            }
        }
    }

    @c.k0
    public static IBinder a(@c.j0 Bundle bundle, @c.k0 String str) {
        return bundle.getBinder(str);
    }

    public static void b(@c.j0 Bundle bundle, @c.k0 String str, @c.k0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
