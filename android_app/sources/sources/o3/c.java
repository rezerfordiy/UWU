package o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements i {

    public class a extends t3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t3.i f9954a;

        public a(t3.i iVar) {
            this.f9954a = iVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            c.this.c();
            try {
                this.f9954a.a();
            } finally {
                c.this.b();
            }
        }
    }

    @Override // o3.i
    public t3.i a(t3.i iVar, p3.c cVar) {
        return d(iVar);
    }

    public void b() {
    }

    public void c() throws Throwable {
    }

    public final t3.i d(t3.i iVar) {
        return new a(iVar);
    }
}
