package o3;

/* JADX INFO: loaded from: classes.dex */
public class m implements i {

    public class a extends t3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t3.i f9968a;

        public a(t3.i iVar) {
            this.f9968a = iVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            this.f9968a.a();
            m.this.b();
        }
    }

    @Override // o3.i
    public t3.i a(t3.i iVar, p3.c cVar) {
        return new a(iVar);
    }

    public void b() throws Throwable {
    }
}
