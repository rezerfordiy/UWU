package p0;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import c.o0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    @o0(16)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f10066a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f10067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f10068c;

        @SuppressLint({"PrivateApi"})
        public static boolean a(int i4) {
            try {
                synchronized (f10066a) {
                    if (!f10068c) {
                        f10068c = true;
                        f10067b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f10067b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i4));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    @o0(17)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f10069a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f10070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f10071c;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i4) {
            try {
                synchronized (f10069a) {
                    if (!f10071c) {
                        f10071c = true;
                        f10070b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f10070b;
                if (method != null && ((Boolean) method.invoke(null, Integer.valueOf(i4))) == null) {
                    throw new NullPointerException();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    @o0(24)
    public static class c {
        public static boolean a(int i4) {
            return Process.isApplicationUid(i4);
        }
    }

    public static boolean a(int i4) {
        return c.a(i4);
    }
}
