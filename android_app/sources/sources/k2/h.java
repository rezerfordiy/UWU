package k2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8419a = 111;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f8420b;

        public a(Activity activity) {
            this.f8420b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.e(this.f8420b);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.c f8421b;

        public b(androidx.appcompat.app.c cVar) {
            this.f8421b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f8421b.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f8422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.c f8423c;

        public c(Activity activity, androidx.appcompat.app.c cVar) {
            this.f8422b = activity;
            this.f8423c = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
            this.f8422b.startActivityForResult(intent, 1315);
            this.f8423c.dismiss();
        }
    }

    public static boolean b(Activity activity) {
        String[] strArr = new String[2];
        if (b0.e.a(activity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
        }
        if (b0.e.a(activity, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            strArr[1] = "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (strArr[0] != null || strArr[1] != null) {
            a0.b.C(activity, strArr, 111);
        }
        if (c(activity) && !d(activity)) {
            activity.runOnUiThread(new a(activity));
        }
        return true;
    }

    public static boolean c(Context context) {
        List<String> allProviders;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null || (allProviders = locationManager.getAllProviders()) == null) {
            return false;
        }
        return allProviders.contains("gps");
    }

    public static final boolean d(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static void e(Activity activity) {
        View viewInflate = View.inflate(activity, R.layout.wifi_permission_view, null);
        c.a aVar = new c.a(activity);
        aVar.M(viewInflate);
        androidx.appcompat.app.c cVarA = aVar.a();
        cVarA.setCancelable(false);
        cVarA.show();
        cVarA.getWindow().setLayout((int) (MyApplication.s() * 300.0f), -2);
        ((TextView) viewInflate.findViewById(R.id.wifi_permission_not_open)).setOnClickListener(new b(cVarA));
        ((TextView) viewInflate.findViewById(R.id.wifi_permission_open)).setOnClickListener(new c(activity, cVarA));
    }
}
