package b0;

import a0.w1;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import c.j0;
import c.k0;
import c.l;
import c.n;
import c.s;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4326a = "ContextCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4327b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static TypedValue f4328c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<Class<?>, String> f4329a;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f4329a = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, androidx.appcompat.widget.c.f1623r);
            map.put(AlarmManager.class, w1.f280t0);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f4330a;

        public b(@j0 Handler handler) {
            this.f4330a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f4330a.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f4330a + " is shutting down");
        }
    }

    public static int a(@j0 Context context, @j0 String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    @k0
    public static Context b(@j0 Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static synchronized File c(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        if (file.exists()) {
            return file;
        }
        Log.w(f4326a, "Unable to create files subdir " + file.getPath());
        return null;
    }

    public static File d(@j0 Context context) {
        return context.getCodeCacheDir();
    }

    @l
    public static int e(@j0 Context context, @n int i4) {
        return context.getColor(i4);
    }

    @k0
    public static ColorStateList f(@j0 Context context, @n int i4) {
        return context.getColorStateList(i4);
    }

    @k0
    public static File g(@j0 Context context) {
        return context.getDataDir();
    }

    @k0
    public static Drawable h(@j0 Context context, @s int i4) {
        return context.getDrawable(i4);
    }

    @j0
    public static File[] i(@j0 Context context) {
        return context.getExternalCacheDirs();
    }

    @j0
    public static File[] j(@j0 Context context, @k0 String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor k(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new b(new Handler(context.getMainLooper()));
    }

    @k0
    public static File l(@j0 Context context) {
        return context.getNoBackupFilesDir();
    }

    @j0
    public static File[] m(@j0 Context context) {
        return context.getObbDirs();
    }

    @k0
    public static <T> T n(@j0 Context context, @j0 Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    @k0
    public static String o(@j0 Context context, @j0 Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean p(@j0 Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean q(@j0 Context context, @j0 Intent[] intentArr) {
        return r(context, intentArr, null);
    }

    public static boolean r(@j0 Context context, @j0 Intent[] intentArr, @k0 Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void s(@j0 Context context, @j0 Intent intent, @k0 Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void t(@j0 Context context, @j0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
