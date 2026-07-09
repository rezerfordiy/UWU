package u2;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class f<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11722b;

    public f(T t4) {
        this.f11722b = t4;
    }

    public static boolean d(Object obj, Object obj2) {
        for (int i4 = 0; i4 < Array.getLength(obj); i4++) {
            if (!g(Array.get(obj, i4), Array.get(obj2, i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    public static boolean f(Object obj, Object obj2) {
        return e(obj, obj2) && d(obj, obj2);
    }

    public static boolean g(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : i(obj) ? i(obj2) && f(obj, obj2) : obj.equals(obj2);
    }

    @t2.e
    public static <T> t2.f<T> h(T t4) {
        return new f(t4);
    }

    public static boolean i(Object obj) {
        return obj.getClass().isArray();
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.c(this.f11722b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return g(this.f11722b, obj);
    }
}
