package p0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c.j0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10072a = "TraceCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f10073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f10074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f10075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f10076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f10077f;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f10073b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f10074c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f10075d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f10076e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f10077f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i(f10072a, "Unable to initialize via reflection.", e4);
            }
        }
    }

    public static void a(@j0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, i4);
            return;
        }
        try {
            f10075d.invoke(null, Long.valueOf(f10073b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f10072a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(@j0 String str) {
        Trace.beginSection(str);
    }

    public static void c(@j0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str, i4);
            return;
        }
        try {
            f10076e.invoke(null, Long.valueOf(f10073b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f10072a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            return ((Boolean) f10074c.invoke(null, Long.valueOf(f10073b))).booleanValue();
        } catch (Exception unused) {
            Log.v(f10072a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(@j0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, i4);
            return;
        }
        try {
            f10077f.invoke(null, Long.valueOf(f10073b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f10072a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
