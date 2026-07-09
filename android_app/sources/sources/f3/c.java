package f3;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public void a(String str, Object obj, Object obj2) throws a {
        if (obj == obj2) {
            return;
        }
        String str2 = str == null ? s0.a.f11071l : str + ": ";
        int iB = b(obj, obj2, str2);
        for (int i4 = 0; i4 < iB; i4++) {
            Object obj3 = Array.get(obj, i4);
            Object obj4 = Array.get(obj2, i4);
            if (d(obj3) && d(obj4)) {
                try {
                    a(str, obj3, obj4);
                } catch (a e4) {
                    e4.a(i4);
                    throw e4;
                }
            } else {
                try {
                    c(obj3, obj4);
                } catch (AssertionError e5) {
                    throw new a(str2, e5, i4);
                }
            }
        }
    }

    public final int b(Object obj, Object obj2, String str) {
        if (obj == null) {
            w2.c.P(str + "expected array was null");
        }
        if (obj2 == null) {
            w2.c.P(str + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            w2.c.P(str + "array lengths differed, expected.length=" + length2 + " actual.length=" + length);
        }
        return length2;
    }

    public abstract void c(Object obj, Object obj2);

    public final boolean d(Object obj) {
        return obj != null && obj.getClass().isArray();
    }
}
