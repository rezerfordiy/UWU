package u2;

/* JADX INFO: loaded from: classes.dex */
public class d<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.f<T> f11720b;

    public d(t2.f<T> fVar) {
        this.f11720b = fVar;
    }

    @t2.e
    public static t2.f<Object> d(Class<?> cls) {
        return f(g.d(cls));
    }

    @t2.e
    public static <T> t2.f<T> e(T t4) {
        return f(f.h(t4));
    }

    @t2.e
    public static <T> t2.f<T> f(t2.f<T> fVar) {
        return new d(fVar);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("is ").f(this.f11720b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return this.f11720b.c(obj);
    }
}
