package p3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    public class C0098a extends t3.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t3.g f10092b;

        public C0098a(t3.g gVar) {
            this.f10092b = gVar;
        }

        @Override // t3.g
        public h c(Class<?> cls) throws Throwable {
            return a.this.a(this.f10092b, cls);
        }
    }

    public static a c() {
        return new a();
    }

    public h a(t3.g gVar, Class<?> cls) throws Throwable {
        return gVar.c(cls);
    }

    public h b(t3.g gVar, Class<?>[] clsArr) throws t3.d {
        return new s3.f(new C0098a(gVar), clsArr);
    }
}
