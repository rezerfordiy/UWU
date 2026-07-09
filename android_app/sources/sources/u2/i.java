package u2;

/* JADX INFO: loaded from: classes.dex */
public class i<T> extends t2.b<T> {
    @t2.e
    public static <T> t2.f<T> d() {
        return h.e(f());
    }

    @t2.e
    public static <T> t2.f<T> e(Class<T> cls) {
        return d();
    }

    @t2.e
    public static <T> t2.f<T> f() {
        return new i();
    }

    @t2.e
    public static <T> t2.f<T> g(Class<T> cls) {
        return f();
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("null");
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return obj == null;
    }
}
