package com.sonoptek.pvus_android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.WindowManager;
import com.sonoHealth.microVUE.R;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z1.e2;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f5058c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f5059d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static float f5060e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static float f5061f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f5062g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f5063h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Resources f5064i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Bitmap f5065j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Bitmap f5066k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Bitmap f5067l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Bitmap f5068m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Bitmap f5069n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Bitmap f5070o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Bitmap f5071p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Bitmap f5072q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Bitmap f5073r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Bitmap f5074s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f5075t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f5076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f5077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static ExecutorService f5078w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f5079b = new b();

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            Bitmap unused = MyApplication.f5065j = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.shi);
            Bitmap unused2 = MyApplication.f5066k = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.quan);
            Bitmap unused3 = MyApplication.f5067l = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.mi);
            Bitmap unused4 = MyApplication.f5068m = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.cha);
            Bitmap unused5 = MyApplication.f5069n = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.anchor_area);
            Bitmap unused6 = MyApplication.f5070o = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.shi_liang);
            Bitmap unused7 = MyApplication.f5071p = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.quan_liang);
            Bitmap unused8 = MyApplication.f5072q = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.mi_liang);
            Bitmap unused9 = MyApplication.f5073r = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.cha_liang);
            Bitmap unused10 = MyApplication.f5074s = BitmapFactory.decodeResource(MyApplication.f5064i, R.drawable.traceh);
        }
    }

    public class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            String strO = e2.c.o(MyApplication.this.getApplicationContext(), e2.a.f7618a);
            String strO2 = e2.c.o(MyApplication.this.getApplicationContext(), e2.a.f7619b);
            if (TextUtils.isEmpty(strO) || e2.b.f(activity)) {
                return;
            }
            e2.b.b(activity, new Locale(strO, strO2), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static Bitmap A() {
        return f5070o;
    }

    public static ExecutorService B() {
        return f5078w;
    }

    public static Bitmap C() {
        return f5069n;
    }

    public static Bitmap D() {
        return f5074s;
    }

    public static boolean E() {
        return f5077v;
    }

    public static boolean F() {
        return f5076u;
    }

    public static boolean G() {
        return f5063h;
    }

    public static boolean H() {
        return f5075t;
    }

    public static void I(boolean z3) {
        f5077v = z3;
    }

    public static void J(boolean z3) {
        f5076u = z3;
    }

    public static void K(boolean z3) {
        f5075t = z3;
    }

    public static String m() {
        return f5062g;
    }

    public static Bitmap n() {
        return f5068m;
    }

    public static Bitmap o() {
        return f5073r;
    }

    public static Context p() {
        return f5058c;
    }

    public static Bitmap q() {
        return f5067l;
    }

    public static Bitmap r() {
        return f5072q;
    }

    public static float s() {
        return f5059d;
    }

    public static float t() {
        return f5060e;
    }

    public static float u() {
        return f5061f;
    }

    public static Bitmap v() {
        return f5066k;
    }

    public static Bitmap w() {
        return f5071p;
    }

    public static int x() {
        WindowManager windowManager = (WindowManager) f5058c.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int y() {
        WindowManager windowManager = (WindowManager) f5058c.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static Bitmap z() {
        return f5065j;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(e2.b.a(context));
    }

    public final void l() {
        Locale localeD = e2.b.d(this);
        localeD.getLanguage();
        localeD.getCountry();
        String strO = e2.c.o(getApplicationContext(), e2.a.f7618a);
        String strO2 = e2.c.o(getApplicationContext(), e2.a.f7619b);
        if (TextUtils.isEmpty(strO) || e2.b.f(this)) {
            return;
        }
        e2.b.b(getApplicationContext(), new Locale(strO, strO2), true);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f5058c = getApplicationContext();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        f5078w = executorServiceNewFixedThreadPool;
        e2.r(executorServiceNewFixedThreadPool);
        w1.g.y().G(getApplicationContext());
        w1.g.y().s(true);
        m2.e.f(this);
        new k2.a(this);
        registerActivityLifecycleCallbacks(this.f5079b);
        i.a(f5058c);
        Resources resources = f5058c.getResources();
        f5064i = resources;
        f5059d = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        f5060e = TypedValue.applyDimension(5, 1.0f, f5064i.getDisplayMetrics());
        f5061f = TypedValue.applyDimension(2, 1.0f, f5064i.getDisplayMetrics());
        File file = new File(Environment.getExternalStorageDirectory(), f5058c.getResources().getString(R.string.app_name_mic));
        if (!file.exists()) {
            file.mkdirs();
        }
        f5062g = file.getPath();
        f5063h = (f5058c.getResources().getConfiguration().screenLayout & 15) >= 3;
        new a().start();
    }
}
