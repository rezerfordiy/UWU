package b0;

import c.j0;
import c.k0;
import java.util.ArrayList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    @k0
    public static String a(@k0 String str, @j0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @k0
    public static String b(@k0 String[] strArr, @j0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@k0 String str, @j0 String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @j0
    public static String[] d(@k0 String[] strArr, @j0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean e(@j0 String[] strArr, @j0 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if (Marker.ANY_MARKER.equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return Marker.ANY_MARKER.equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
