package h3;

/* JADX INFO: loaded from: classes.dex */
public class a<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.f<? extends T> f8043b;

    public a(t2.f<? extends T> fVar) {
        this.f8043b = fVar;
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.f(this.f8043b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return this.f8043b.c(obj);
    }

    public a<T> d(t2.f<? extends T> fVar) {
        return new a<>(t2.c.b(fVar, this.f8043b));
    }

    public a<T> e(t2.f<? extends T> fVar) {
        return new a<>(t2.c.e(fVar, this.f8043b));
    }
}
