package o0;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c.j0;
import c.k0;
import c.q0;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9853a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9854b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9855c = 3;

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0087a {
    }

    @k0
    @q0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo a(@j0 ConnectivityManager connectivityManager, @j0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@j0 ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus();
    }

    @q0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@j0 ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
