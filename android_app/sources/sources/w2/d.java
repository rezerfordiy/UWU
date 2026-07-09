package w2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static void a(Throwable th) {
        c(th, t2.c.r());
    }

    public static void b(Object... objArr) {
        c(Arrays.asList(objArr), h3.b.a(t2.c.p()));
    }

    public static <T> void c(T t4, t2.f<T> fVar) {
        if (!fVar.c(t4)) {
            throw new f3.b(t4, fVar);
        }
    }

    public static void d(boolean z3) {
        c(Boolean.valueOf(z3), t2.c.l(Boolean.TRUE));
    }
}
