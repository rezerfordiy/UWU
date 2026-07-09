package n3;

import h3.c;
import h3.d;
import t2.f;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static <T> h3.a<T> a(f<T> fVar) {
        return new h3.a<>(fVar);
    }

    public static f<String> b(String str) {
        return d.j(str);
    }

    public static <T> h3.a<T> c(f<T> fVar) {
        return new h3.a<>(fVar);
    }

    public static <T> f<Iterable<T>> d(f<T> fVar) {
        return h3.b.a(fVar);
    }

    public static <T> f<Iterable<T>> e(T t4) {
        return c.g(t4);
    }

    public static <T> f<Iterable<T>> f(f<? extends T> fVar) {
        return c.h(fVar);
    }

    public static <T> f<Iterable<T>> g(T... tArr) {
        return c.i(tArr);
    }

    public static <T> f<Iterable<T>> h(f<? extends T>... fVarArr) {
        return c.j(fVarArr);
    }
}
