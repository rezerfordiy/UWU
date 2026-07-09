package a0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f81a = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f82b = "startedFromLauncher";

    @Deprecated
    public h() {
    }

    public static boolean a(@c.j0 Context context) {
        return context.getSharedPreferences(f81a, 0).getBoolean(f82b, false);
    }

    public static void b(@c.j0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f81a, 0);
        if (sharedPreferences.getBoolean(f82b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(b0.f.f4335e)) {
            sharedPreferences.edit().putBoolean(f82b, true).apply();
        }
    }
}
