package o3;

/* JADX INFO: loaded from: classes.dex */
public class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t2.f<Object> f9949a = null;

    public class a extends h3.f<Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t2.f f9950c;

        public a(t2.f fVar) {
            this.f9950c = fVar;
        }

        @Override // t2.g
        public void b(t2.d dVar) {
            dVar.a("exception with message ");
            dVar.f(this.f9950c);
        }

        @Override // h3.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean f(Throwable th) {
            return this.f9950c.c(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    public class C0093b extends t3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t3.i f9952a;

        public C0093b(t3.i iVar) {
            this.f9952a = iVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            try {
                this.f9952a.a();
                if (b.this.f9949a == null) {
                    return;
                }
                throw new AssertionError("Expected test to throw " + t2.h.n(b.this.f9949a));
            } catch (Throwable th) {
                if (b.this.f9949a == null) {
                    throw th;
                }
                w2.c.K(th, b.this.f9949a);
            }
        }
    }

    public static b h() {
        return new b();
    }

    @Override // o3.i
    public t3.i a(t3.i iVar, p3.c cVar) {
        return new C0093b(iVar);
    }

    public void c(Class<? extends Throwable> cls) {
        d(t2.c.j(cls));
    }

    public void d(t2.f<?> fVar) {
        t2.f<Object> fVar2 = this.f9949a;
        if (fVar2 != null) {
            fVar = n3.a.a(fVar2).d(fVar);
        }
        this.f9949a = fVar;
    }

    public void e(String str) {
        f(n3.a.b(str));
    }

    public void f(t2.f<String> fVar) {
        d(g(fVar));
    }

    public final t2.f<Throwable> g(t2.f<String> fVar) {
        return new a(fVar);
    }
}
