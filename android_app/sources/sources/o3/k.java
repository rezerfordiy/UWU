package o3;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class k implements d {

    public class a extends t3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t3.c f9964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t3.i f9965b;

        public a(t3.c cVar, t3.i iVar) {
            this.f9964a = cVar;
            this.f9965b = iVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            k.this.d(this.f9964a);
            try {
                try {
                    this.f9965b.a();
                    k.this.e(this.f9964a);
                } catch (f3.b e4) {
                    throw e4;
                } catch (Throwable th) {
                    k.this.b(th, this.f9964a);
                    throw th;
                }
            } finally {
                k.this.c(this.f9964a);
            }
        }
    }

    @Override // o3.d
    public t3.i a(t3.i iVar, t3.c cVar, Object obj) {
        return new a(cVar, iVar);
    }

    public void b(Throwable th, t3.c cVar) {
    }

    public void c(t3.c cVar) {
    }

    public void d(t3.c cVar) {
    }

    public void e(t3.c cVar) {
    }
}
