package h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8047c;

    public e(String str) {
        this.f8047c = str;
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("a string ").a(i()).a(" ").c(this.f8047c);
    }

    public abstract boolean g(String str);

    @Override // h3.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean f(String str) {
        return g(str);
    }

    public abstract String i();
}
