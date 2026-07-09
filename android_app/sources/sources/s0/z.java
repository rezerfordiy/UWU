package s0;

import android.text.TextUtils;
import c.j0;
import c.k0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale f11139a = new Locale(a.f11071l, a.f11071l);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11140b = "Arab";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11141c = "Hebr";

    public static int a(@j0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@k0 Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @j0
    public static String c(@j0 String str) {
        return TextUtils.htmlEncode(str);
    }
}
