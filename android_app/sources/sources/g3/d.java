package g3;

/* JADX INFO: loaded from: classes.dex */
public class d extends p3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f7848a;

    public d(Class<?> cls) {
        this.f7848a = cls;
    }

    @Override // p3.h, p3.b
    public p3.c a() {
        return p3.c.c(this.f7848a);
    }

    @Override // p3.h
    public void b(r3.c cVar) {
        cVar.g(a());
    }
}
