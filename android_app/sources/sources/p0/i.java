package p0;

import android.os.LocaleList;
import c.b0;
import c.j0;
import c.k0;
import c.o0;
import c.s0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f10054b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f10055a;

    public i(k kVar) {
        this.f10055a = kVar;
    }

    @j0
    public static i a(@j0 Locale... localeArr) {
        return n(new LocaleList(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @j0
    public static i c(@k0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = Locale.forLanguageTag(strArrSplit[i4]);
        }
        return a(localeArr);
    }

    @s0(min = 1)
    @j0
    public static i e() {
        return n(LocaleList.getAdjustedDefault());
    }

    @s0(min = 1)
    @j0
    public static i f() {
        return n(LocaleList.getDefault());
    }

    @j0
    public static i g() {
        return f10054b;
    }

    @o0(24)
    @j0
    public static i n(@j0 LocaleList localeList) {
        return new i(new l(localeList));
    }

    @o0(24)
    @Deprecated
    public static i o(Object obj) {
        return n((LocaleList) obj);
    }

    public Locale d(int i4) {
        return this.f10055a.get(i4);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f10055a.equals(((i) obj).f10055a);
    }

    @k0
    public Locale h(@j0 String[] strArr) {
        return this.f10055a.d(strArr);
    }

    public int hashCode() {
        return this.f10055a.hashCode();
    }

    @b0(from = -1)
    public int i(Locale locale) {
        return this.f10055a.c(locale);
    }

    public boolean j() {
        return this.f10055a.isEmpty();
    }

    @b0(from = 0)
    public int k() {
        return this.f10055a.size();
    }

    @j0
    public String l() {
        return this.f10055a.b();
    }

    @k0
    public Object m() {
        return this.f10055a.a();
    }

    public String toString() {
        return this.f10055a.toString();
    }
}
