package u2;

/* JADX INFO: loaded from: classes.dex */
public class g extends t2.b<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f11723b;

    public g(Class<?> cls) {
        this.f11723b = cls;
    }

    @t2.e
    public static t2.f<Object> d(Class<?> cls) {
        return new g(cls);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("an instance of ").a(this.f11723b.getName());
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return this.f11723b.isInstance(obj);
    }
}
