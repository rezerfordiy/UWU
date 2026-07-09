package f3;

/* JADX INFO: loaded from: classes.dex */
public class b extends RuntimeException implements t2.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f7656d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.f<?> f7658c;

    public b(Object obj, t2.f<?> fVar) {
        super(obj instanceof Throwable ? (Throwable) obj : null);
        this.f7657b = obj;
        this.f7658c = fVar;
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        if (this.f7658c != null) {
            dVar.a("got: ");
            dVar.c(this.f7657b);
            dVar.a(", expected: ");
            dVar.f(this.f7658c);
            return;
        }
        dVar.a("failed assumption: " + this.f7657b);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return t2.h.m(this);
    }

    public b(String str) {
        this(str, null);
    }
}
