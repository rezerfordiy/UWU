package o0;

import android.net.Uri;
import c.j0;
import c.k0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import u0.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f9856b = "mailto:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9857c = "mailto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9858d = "to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9859e = "body";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9860f = "cc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9861g = "bcc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9862h = "subject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, String> f9863a = new HashMap<>();

    public static boolean g(@k0 Uri uri) {
        return uri != null && f9857c.equals(uri.getScheme());
    }

    public static boolean h(@k0 String str) {
        return str != null && str.startsWith(f9856b);
    }

    @j0
    public static c i(@j0 Uri uri) throws d {
        return j(uri.toString());
    }

    @j0
    public static c j(@j0 String str) throws d {
        String strDecode;
        String strSubstring;
        i.g(str);
        if (!h(str)) {
            throw new d("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        c cVar = new c();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    cVar.f9863a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strF = cVar.f();
        if (strF != null) {
            strDecode = strDecode + ", " + strF;
        }
        cVar.f9863a.put(f9858d, strDecode);
        return cVar;
    }

    @k0
    public String a() {
        return this.f9863a.get(f9861g);
    }

    @k0
    public String b() {
        return this.f9863a.get(f9859e);
    }

    @k0
    public String c() {
        return this.f9863a.get(f9860f);
    }

    @k0
    public Map<String, String> d() {
        return this.f9863a;
    }

    @k0
    public String e() {
        return this.f9863a.get(f9862h);
    }

    @k0
    public String f() {
        return this.f9863a.get(f9858d);
    }

    @j0
    public String toString() {
        StringBuilder sb = new StringBuilder(f9856b);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f9863a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
