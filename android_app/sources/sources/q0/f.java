package q0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import c.b0;
import c.j0;
import c.k0;
import c.o0;
import c.r0;
import c.z0;
import d0.g;
import g0.f1;
import g0.y0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import u0.i;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f10247a = "font_results";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f10248b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f10249c = -2;

    public static final class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f10250a = "file_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f10251b = "font_ttc_index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f10252c = "font_variation_settings";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f10253d = "font_weight";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f10254e = "font_italic";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f10255f = "result_code";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10256g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10257h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10258i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10259j = 3;
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10260c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10261d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10262e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f10264b;

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i4, @k0 c[] cVarArr) {
            this.f10263a = i4;
            this.f10264b = cVarArr;
        }

        public static b a(int i4, @k0 c[] cVarArr) {
            return new b(i4, cVarArr);
        }

        public c[] b() {
            return this.f10264b;
        }

        public int c() {
            return this.f10263a;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f10268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10269e;

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@j0 Uri uri, @b0(from = 0) int i4, @b0(from = 1, to = 1000) int i5, boolean z3, int i6) {
            this.f10265a = (Uri) i.g(uri);
            this.f10266b = i4;
            this.f10267c = i5;
            this.f10268d = z3;
            this.f10269e = i6;
        }

        public static c a(@j0 Uri uri, @b0(from = 0) int i4, @b0(from = 1, to = 1000) int i5, boolean z3, int i6) {
            return new c(uri, i4, i5, z3, i6);
        }

        public int b() {
            return this.f10269e;
        }

        @b0(from = 0)
        public int c() {
            return this.f10266b;
        }

        @j0
        public Uri d() {
            return this.f10265a;
        }

        @b0(from = 1, to = 1000)
        public int e() {
            return this.f10267c;
        }

        public boolean f() {
            return this.f10268d;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f10270a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10271b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10272c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10273d = -2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10274e = -3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10275f = -4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10276g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10277h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10278i = 3;

        @Retention(RetentionPolicy.SOURCE)
        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public @interface a {
        }

        public void a(int i4) {
        }

        public void b(Typeface typeface) {
        }
    }

    @k0
    public static Typeface a(@j0 Context context, @k0 CancellationSignal cancellationSignal, @j0 c[] cVarArr) {
        return y0.c(context, cancellationSignal, cVarArr, 0);
    }

    @j0
    public static b b(@j0 Context context, @k0 CancellationSignal cancellationSignal, @j0 q0.d dVar) throws PackageManager.NameNotFoundException {
        return q0.c.d(context, dVar, cancellationSignal);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, q0.d dVar, @k0 g.a aVar, @k0 Handler handler, boolean z3, int i4, int i5) {
        return f(context, dVar, i5, z3, i4, g.a.c(handler), new y0.a(aVar));
    }

    @Deprecated
    @k0
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @z0
    public static ProviderInfo d(@j0 PackageManager packageManager, @j0 q0.d dVar, @k0 Resources resources) throws PackageManager.NameNotFoundException {
        return q0.c.e(packageManager, dVar, resources);
    }

    @o0(19)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return f1.h(context, cVarArr, cancellationSignal);
    }

    @k0
    @r0({r0.a.LIBRARY})
    public static Typeface f(@j0 Context context, @j0 q0.d dVar, int i4, boolean z3, @b0(from = 0) int i5, @j0 Handler handler, @j0 d dVar2) {
        q0.a aVar = new q0.a(dVar2, handler);
        return z3 ? e.e(context, dVar, aVar, i4, i5) : e.d(context, dVar, i4, null, aVar);
    }

    public static void g(@j0 Context context, @j0 q0.d dVar, @j0 d dVar2, @j0 Handler handler) {
        q0.a aVar = new q0.a(dVar2);
        e.d(context.getApplicationContext(), dVar, 0, g.b(handler), aVar);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        e.f();
    }

    @r0({r0.a.TESTS})
    @z0
    public static void i() {
        e.f();
    }
}
