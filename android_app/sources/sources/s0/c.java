package s0;

import android.icu.util.ULocale;
import android.util.Log;
import c.k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11103a = "ICUCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f11104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f11105c;

    public static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f11105c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            Log.w(f11103a, e4);
        }
        return string;
    }

    public static String b(String str) {
        try {
            Method method = f11104b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            Log.w(f11103a, e4);
        }
        return null;
    }

    @k0
    public static String c(Locale locale) {
        return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
    }
}
