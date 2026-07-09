package e2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static Context a(Context context) {
        return c(context);
    }

    public static void b(Context context, Locale locale, boolean z3) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        configuration.setLocales(new LocaleList(locale));
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
        if (z3) {
            g(context, locale);
        }
    }

    @TargetApi(24)
    public static Context c(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        Locale localeD = d(context);
        String strO = c.o(context, a.f7618a);
        String strO2 = c.o(context, a.f7619b);
        if (!TextUtils.isEmpty(strO) && !TextUtils.isEmpty(strO2) && !e(localeD, strO, strO2)) {
            localeD = new Locale(strO, strO2);
        }
        configuration.setLocale(localeD);
        configuration.setLocales(new LocaleList(localeD));
        return context.createConfigurationContext(configuration);
    }

    public static Locale d(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static boolean e(Locale locale, String str, String str2) {
        return locale.getLanguage().equals(str) && locale.getCountry().equals(str2);
    }

    public static boolean f(Context context) {
        Locale localeD = d(context);
        return localeD.getLanguage().equals(c.q(a.f7618a)) && localeD.getCountry().equals(c.q(a.f7619b));
    }

    public static void g(Context context, Locale locale) {
        c.B(context, a.f7618a, locale.getLanguage());
        c.B(context, a.f7619b, locale.getCountry());
    }

    public static void h(Context context) {
        Locale localeD = d(context);
        String strO = c.o(context, a.f7618a);
        String strO2 = c.o(context, a.f7619b);
        if (!TextUtils.isEmpty(strO) && !TextUtils.isEmpty(strO2) && !e(localeD, strO, strO2)) {
            localeD = new Locale(strO, strO2);
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(localeD);
        Resources resources = context.getResources();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static boolean i(Context context, String str) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (configuration.locale.getLanguage().startsWith(str)) {
            return false;
        }
        configuration.locale = str.equals("zh") ? Locale.SIMPLIFIED_CHINESE : str.equals("en") ? Locale.ENGLISH : Locale.getDefault();
        resources.updateConfiguration(configuration, displayMetrics);
        g(context, configuration.locale);
        return true;
    }
}
