package m0;

import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c.j0;
import c.k0;
import c.o0;
import c.q0;
import c.w;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import m0.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8553a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f8554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @w("sGnssStatusListeners")
    public static final p.i<Object, Object> f8555c = new p.i<>();

    public class a implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocationManager f8556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f8557b;

        public a(LocationManager locationManager, d dVar) {
            this.f8556a = locationManager;
            this.f8557b = dVar;
        }

        @Override // java.util.concurrent.Callable
        @q0("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(this.f8556a.addGpsStatusListener(this.f8557b));
        }
    }

    @o0(28)
    public static class b {
        public static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @o0(30)
    public static class c extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.AbstractC0078a f8558a;

        public c(a.AbstractC0078a abstractC0078a) {
            u0.i.b(abstractC0078a != null, "invalid null callback");
            this.f8558a = abstractC0078a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i4) {
            this.f8558a.a(i4);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f8558a.b(m0.a.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f8558a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f8558a.d();
        }
    }

    public static class d implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationManager f8559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.AbstractC0078a f8560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @k0
        public volatile Executor f8561c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8562b;

            public a(Executor executor) {
                this.f8562b = executor;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8561c != this.f8562b) {
                    return;
                }
                d.this.f8560b.c();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8564b;

            public b(Executor executor) {
                this.f8564b = executor;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8561c != this.f8564b) {
                    return;
                }
                d.this.f8560b.d();
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8566b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f8567c;

            public c(Executor executor, int i4) {
                this.f8566b = executor;
                this.f8567c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8561c != this.f8566b) {
                    return;
                }
                d.this.f8560b.a(this.f8567c);
            }
        }

        /* JADX INFO: renamed from: m0.i$d$d, reason: collision with other inner class name */
        public class RunnableC0079d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8569b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m0.a f8570c;

            public RunnableC0079d(Executor executor, m0.a aVar) {
                this.f8569b = executor;
                this.f8570c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8561c != this.f8569b) {
                    return;
                }
                d.this.f8560b.b(this.f8570c);
            }
        }

        public d(LocationManager locationManager, a.AbstractC0078a abstractC0078a) {
            u0.i.b(abstractC0078a != null, "invalid null callback");
            this.f8559a = locationManager;
            this.f8560b = abstractC0078a;
        }

        public void a(Executor executor) {
            u0.i.i(this.f8561c == null);
            this.f8561c = executor;
        }

        public void b() {
            this.f8561c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @q0("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i4) {
            Runnable aVar;
            Runnable cVar;
            GpsStatus gpsStatus;
            Executor executor = this.f8561c;
            if (executor == null) {
                return;
            }
            if (i4 == 1) {
                aVar = new a(executor);
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        GpsStatus gpsStatus2 = this.f8559a.getGpsStatus(null);
                        if (gpsStatus2 == null) {
                            return;
                        } else {
                            cVar = new c(executor, gpsStatus2.getTimeToFirstFix());
                        }
                    } else if (i4 != 4 || (gpsStatus = this.f8559a.getGpsStatus(null)) == null) {
                        return;
                    } else {
                        cVar = new RunnableC0079d(executor, m0.a.o(gpsStatus));
                    }
                    executor.execute(cVar);
                    return;
                }
                aVar = new b(executor);
            }
            executor.execute(aVar);
        }
    }

    public static class e implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8572a;

        public e(@j0 Handler handler) {
            this.f8572a = (Handler) u0.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@j0 Runnable runnable) {
            if (Looper.myLooper() == this.f8572a.getLooper()) {
                runnable.run();
            } else {
                if (this.f8572a.post((Runnable) u0.i.g(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f8572a + " is shutting down");
            }
        }
    }

    @o0(24)
    public static class f extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.AbstractC0078a f8573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @k0
        public volatile Executor f8574b;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8575b;

            public a(Executor executor) {
                this.f8575b = executor;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f8574b != this.f8575b) {
                    return;
                }
                f.this.f8573a.c();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8577b;

            public b(Executor executor) {
                this.f8577b = executor;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f8574b != this.f8577b) {
                    return;
                }
                f.this.f8573a.d();
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8579b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f8580c;

            public c(Executor executor, int i4) {
                this.f8579b = executor;
                this.f8580c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f8574b != this.f8579b) {
                    return;
                }
                f.this.f8573a.a(this.f8580c);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f8582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GnssStatus f8583c;

            public d(Executor executor, GnssStatus gnssStatus) {
                this.f8582b = executor;
                this.f8583c = gnssStatus;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f8574b != this.f8582b) {
                    return;
                }
                f.this.f8573a.b(m0.a.n(this.f8583c));
            }
        }

        public f(a.AbstractC0078a abstractC0078a) {
            u0.i.b(abstractC0078a != null, "invalid null callback");
            this.f8573a = abstractC0078a;
        }

        public void a(Executor executor) {
            u0.i.b(executor != null, "invalid null executor");
            u0.i.i(this.f8574b == null);
            this.f8574b = executor;
        }

        public void b() {
            this.f8574b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i4) {
            Executor executor = this.f8574b;
            if (executor == null) {
                return;
            }
            executor.execute(new c(executor, i4));
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f8574b;
            if (executor == null) {
                return;
            }
            executor.execute(new d(executor, gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            Executor executor = this.f8574b;
            if (executor == null) {
                return;
            }
            executor.execute(new a(executor));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            Executor executor = this.f8574b;
            if (executor == null) {
                return;
            }
            executor.execute(new b(executor));
        }
    }

    public static boolean a(@j0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    @q0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean b(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0078a abstractC0078a) {
        if (Build.VERSION.SDK_INT >= 30) {
            p.i<Object, Object> iVar = f8555c;
            synchronized (iVar) {
                c cVar = (c) iVar.get(abstractC0078a);
                if (cVar == null) {
                    cVar = new c(abstractC0078a);
                }
                if (!locationManager.registerGnssStatusCallback(executor, cVar)) {
                    return false;
                }
                iVar.put(abstractC0078a, cVar);
                return true;
            }
        }
        u0.i.a(handler != null);
        p.i<Object, Object> iVar2 = f8555c;
        synchronized (iVar2) {
            f fVar = (f) iVar2.get(abstractC0078a);
            if (fVar == null) {
                fVar = new f(abstractC0078a);
            } else {
                fVar.b();
            }
            fVar.a(executor);
            if (!locationManager.registerGnssStatusCallback(fVar, handler)) {
                return false;
            }
            iVar2.put(abstractC0078a, fVar);
            return true;
        }
    }

    @q0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean c(@j0 LocationManager locationManager, @j0 Executor executor, @j0 a.AbstractC0078a abstractC0078a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b(locationManager, null, executor, abstractC0078a);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return b(locationManager, new Handler(looperMyLooper), executor, abstractC0078a);
    }

    @q0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean d(@j0 LocationManager locationManager, @j0 a.AbstractC0078a abstractC0078a, @j0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? c(locationManager, p0.e.a(handler), abstractC0078a) : c(locationManager, new e(handler), abstractC0078a);
    }

    public static void e(@j0 LocationManager locationManager, @j0 a.AbstractC0078a abstractC0078a) {
        if (Build.VERSION.SDK_INT >= 30) {
            p.i<Object, Object> iVar = f8555c;
            synchronized (iVar) {
                GnssStatus.Callback callback = (c) iVar.remove(abstractC0078a);
                if (callback != null) {
                    locationManager.unregisterGnssStatusCallback(callback);
                }
            }
            return;
        }
        p.i<Object, Object> iVar2 = f8555c;
        synchronized (iVar2) {
            f fVar = (f) iVar2.remove(abstractC0078a);
            if (fVar != null) {
                fVar.b();
                locationManager.unregisterGnssStatusCallback(fVar);
            }
        }
    }
}
