package b2;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4502a = "^[a-zA-Z]\\w{5,20}$";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4503b = "^[a-zA-Z0-9]{6,20}$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4504c = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4505d = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4506e = "^[一-龥],{0,}$";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4507f = "(^\\d{18}$)|(^\\d{15}$)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4508g = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f4509h = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)($|(?!\\.$)\\.)){4}$";

    public static boolean a(String str) {
        return Pattern.matches(f4506e, str);
    }

    public static boolean b(String str) {
        return Pattern.matches(f4505d, str);
    }

    public static boolean c(String str) {
        return Pattern.matches(f4507f, str);
    }

    public static boolean d(String str) {
        return Pattern.matches(f4509h, str);
    }

    public static boolean e(String str) {
        return Pattern.matches(f4504c, str);
    }

    public static boolean f(String str) {
        return Pattern.matches(f4503b, str);
    }

    public static boolean g(String str) {
        return Pattern.matches(f4508g, str);
    }

    public static boolean h(String str) {
        return Pattern.matches(f4502a, str);
    }
}
