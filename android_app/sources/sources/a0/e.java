package a0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import c.r0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14a = "ActivityRecreator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f15b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f16c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f17d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f18e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f19f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f20g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f21h = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f22b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f23c;

        public a(d dVar, Object obj) {
            this.f22b = dVar;
            this.f23c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22b.f28a = this.f23c;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f24b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f25c;

        public b(Application application, d dVar) {
            this.f24b = application;
            this.f25c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24b.unregisterActivityLifecycleCallbacks(this.f25c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f26b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f27c;

        public c(Object obj, Object obj2) {
            this.f26b = obj;
            this.f27c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f18e;
                if (method != null) {
                    method.invoke(this.f26b, this.f27c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f19f.invoke(this.f26b, this.f27c, Boolean.FALSE);
                }
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable th) {
                Log.e(e.f14a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f29b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f31d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f32e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f33f = false;

        public d(@c.j0 Activity activity) {
            this.f29b = activity;
            this.f30c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f29b == activity) {
                this.f29b = null;
                this.f32e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f32e || this.f33f || this.f31d || !e.h(this.f28a, this.f30c, activity)) {
                return;
            }
            this.f33f = true;
            this.f28a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f29b == activity) {
                this.f31d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f15b = clsA;
        f16c = b();
        f17d = f();
        f18e = d(clsA);
        f19f = c(clsA);
        f20g = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 == 26 || i4 == 27;
    }

    public static boolean h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f17d.get(activity);
            if (obj2 == obj && activity.hashCode() == i4) {
                f21h.postAtFrontOfQueue(new c(f16c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f14a, "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(@c.j0 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f20g == null) {
            return false;
        }
        if (f19f == null && f18e == null) {
            return false;
        }
        try {
            Object obj2 = f17d.get(activity);
            if (obj2 == null || (obj = f16c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f21h;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f20g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f21h.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
