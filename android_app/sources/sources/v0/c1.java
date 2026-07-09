package v0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12007b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12008c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12009d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12010e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12011f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12012g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12013h = 1006;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12014i = 1007;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12015j = 1008;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12016k = 1009;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f12017l = 1010;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12018m = 1011;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f12019n = 1012;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12020o = 1013;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12021p = 1014;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12022q = 1015;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f12023r = 1016;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f12024s = 1017;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f12025t = 1018;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12026u = 1019;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12027v = 1020;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12028w = 1021;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12029x = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12030a;

    public c1(Object obj) {
        this.f12030a = obj;
    }

    public static c1 a(Bitmap bitmap, float f4, float f5) {
        return new c1(PointerIcon.create(bitmap, f4, f5));
    }

    public static c1 c(Context context, int i4) {
        return new c1(PointerIcon.getSystemIcon(context, i4));
    }

    public static c1 d(Resources resources, int i4) {
        return new c1(PointerIcon.load(resources, i4));
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f12030a;
    }
}
