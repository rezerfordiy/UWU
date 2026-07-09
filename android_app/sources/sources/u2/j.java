package u2;

/* JADX INFO: loaded from: classes.dex */
public class j<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f11725b;

    public j(T t4) {
        this.f11725b = t4;
    }

    @t2.e
    public static <T> t2.f<T> d(T t4) {
        return new j(t4);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("same(").c(this.f11725b).a(")");
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return obj == this.f11725b;
    }
}
