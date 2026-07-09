package u2;

/* JADX INFO: loaded from: classes.dex */
public class h<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.f<T> f11724b;

    public h(t2.f<T> fVar) {
        this.f11724b = fVar;
    }

    @t2.e
    public static <T> t2.f<T> d(T t4) {
        return e(f.h(t4));
    }

    @t2.e
    public static <T> t2.f<T> e(t2.f<T> fVar) {
        return new h(fVar);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("not ").f(this.f11724b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return !this.f11724b.c(obj);
    }
}
