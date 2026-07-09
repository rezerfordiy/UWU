package w0;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final int A = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f12399a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f12400b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f12401c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f12402d = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f12403e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f12404f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f12405g = 8192;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12406h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12407i = 32768;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12408j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12409k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f12410l = 262144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12411m = 524288;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f12412n = 1048576;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12413o = 2097152;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12414p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12415q = 8388608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f12416r = 16777216;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f12417s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f12418t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12419u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12420v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12421w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12422x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12423y = 32;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12424z = 64;

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, k0 k0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) k0Var.g());
    }

    @Deprecated
    public static k0 b(AccessibilityEvent accessibilityEvent) {
        return new k0(accessibilityEvent);
    }

    public static int c(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    public static int d(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int e(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static k0 f(AccessibilityEvent accessibilityEvent, int i4) {
        return new k0(accessibilityEvent.getRecord(i4));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setAction(i4);
    }

    public static void i(AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setContentChangeTypes(i4);
    }

    public static void j(AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setMovementGranularity(i4);
    }
}
