package p1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import c.j0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10078a = "Trace";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f10079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f10080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f10081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f10082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f10083f;

    @SuppressLint({"NewApi"})
    public static void a(@j0 String str, int i4) {
        try {
            if (f10081d == null) {
                d.a(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i4);
    }

    public static void b(@j0 String str, int i4) {
        try {
            if (f10081d == null) {
                f10081d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f10081d.invoke(null, Long.valueOf(f10079b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceBegin", e4);
        }
    }

    public static void c(@j0 String str) {
        c.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@j0 String str, int i4) {
        try {
            if (f10082e == null) {
                d.b(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i4);
    }

    public static void e(@j0 String str, int i4) {
        try {
            if (f10082e == null) {
                f10082e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f10082e.invoke(null, Long.valueOf(f10079b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceEnd", e4);
        }
    }

    public static void f() {
        c.b();
    }

    public static void g(@j0 String str, @j0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f10078a, "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f10080c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    public static boolean i() {
        try {
            if (f10080c == null) {
                f10079b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f10080c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f10080c.invoke(null, Long.valueOf(f10079b))).booleanValue();
        } catch (Exception e4) {
            g("isTagEnabled", e4);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@j0 String str, int i4) {
        try {
            if (f10083f == null) {
                d.c(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i4);
    }

    public static void k(@j0 String str, int i4) {
        try {
            if (f10083f == null) {
                f10083f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f10083f.invoke(null, Long.valueOf(f10079b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("traceCounter", e4);
        }
    }
}
