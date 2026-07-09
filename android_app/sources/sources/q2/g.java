package q2;

/* JADX INFO: loaded from: classes.dex */
public class g implements i, p3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.c f10465a;

    public g(p3.c cVar) {
        this.f10465a = cVar;
    }

    @Override // p3.b
    public p3.c a() {
        return this.f10465a;
    }

    @Override // q2.i
    public int b() {
        return 1;
    }

    @Override // q2.i
    public void c(m mVar) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    public String toString() {
        return a().toString();
    }
}
