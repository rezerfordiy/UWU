package u0;

import c.k0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static boolean a(@k0 Object obj, @k0 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(@k0 Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(@k0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @k0
    public static String d(@k0 Object obj, @k0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
