package o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements i {

    public class a extends t3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.c f9961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t3.i f9962b;

        public a(p3.c cVar, t3.i iVar) {
            this.f9961a = cVar;
            this.f9962b = iVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            j.this.d(this.f9961a);
            try {
                try {
                    this.f9962b.a();
                    j.this.e(this.f9961a);
                } catch (f3.b e4) {
                    throw e4;
                } catch (Throwable th) {
                    j.this.b(th, this.f9961a);
                    throw th;
                }
            } finally {
                j.this.c(this.f9961a);
            }
        }
    }

    @Override // o3.i
    public t3.i a(t3.i iVar, p3.c cVar) {
        return new a(cVar, iVar);
    }

    public void b(Throwable th, p3.c cVar) {
    }

    public void c(p3.c cVar) {
    }

    public void d(p3.c cVar) {
    }

    public void e(p3.c cVar) {
    }
}
