package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import c.j0;
import c.q0;
import c.z0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1005d = "TwilightManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1006e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1007f = 22;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static p f1008g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f1010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1011c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f1014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1017f;
    }

    @z0
    public p(@j0 Context context, @j0 LocationManager locationManager) {
        this.f1009a = context;
        this.f1010b = locationManager;
    }

    public static p a(@j0 Context context) {
        if (f1008g == null) {
            Context applicationContext = context.getApplicationContext();
            f1008g = new p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1008g;
    }

    @z0
    public static void f(p pVar) {
        f1008g = pVar;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = b0.i.d(this.f1009a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = b0.i.d(this.f1009a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @q0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f1010b.isProviderEnabled(str)) {
                return this.f1010b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d(f1005d, "Failed to get last known location", e4);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f1011c;
        if (e()) {
            return aVar.f1012a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f1012a;
        }
        Log.i(f1005d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i4 = Calendar.getInstance().get(11);
        return i4 < 6 || i4 >= 22;
    }

    public final boolean e() {
        return this.f1011c.f1017f > System.currentTimeMillis();
    }

    public final void g(@j0 Location location) {
        long j4;
        a aVar = this.f1011c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o oVarB = o.b();
        oVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j5 = oVarB.f1002a;
        oVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z3 = oVarB.f1004c == 1;
        long j6 = oVarB.f1003b;
        long j7 = oVarB.f1002a;
        oVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j8 = oVarB.f1003b;
        if (j6 == -1 || j7 == -1) {
            j4 = jCurrentTimeMillis + 43200000;
        } else {
            j4 = (jCurrentTimeMillis > j7 ? 0 + j8 : jCurrentTimeMillis > j6 ? 0 + j7 : 0 + j6) + 60000;
        }
        aVar.f1012a = z3;
        aVar.f1013b = j5;
        aVar.f1014c = j6;
        aVar.f1015d = j7;
        aVar.f1016e = j8;
        aVar.f1017f = j4;
    }
}
