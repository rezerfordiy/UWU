package u2;

/* JADX INFO: loaded from: classes.dex */
public class e<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11721b;

    public e() {
        this("ANYTHING");
    }

    @t2.e
    public static <T> t2.f<T> d(Class<T> cls) {
        return new e();
    }

    @t2.e
    public static <T> t2.f<T> e() {
        return new e();
    }

    @t2.e
    public static <T> t2.f<T> f(String str) {
        return new e(str);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a(this.f11721b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return true;
    }

    public e(String str) {
        this.f11721b = str;
    }
}
