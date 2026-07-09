package h3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> extends t2.b<Iterable<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t2.f f8044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t2.f f8045c;

        public a(t2.f fVar, t2.f fVar2) {
            this.f8044b = fVar;
            this.f8045c = fVar2;
        }

        @Override // t2.g
        public void b(t2.d dVar) {
            dVar.a("each ");
            this.f8045c.b(dVar);
        }

        @Override // t2.f
        public boolean c(Object obj) {
            return this.f8044b.c(obj);
        }
    }

    public static <T> t2.f<Iterable<T>> a(t2.f<T> fVar) {
        return new a(t2.c.o(c.h(t2.c.o(fVar))), fVar);
    }
}
