package n2;

/* JADX INFO: loaded from: classes.dex */
public class t extends s0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f9589m;

    public interface a {
        byte[] a(int i4);

        void b(byte[] bArr);

        void c(byte[] bArr);

        void d(boolean z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(r0 r0Var) {
        super(r0Var);
        this.f9589m = (a) r0Var;
    }

    @Override // n2.s0, n2.u0
    public String g() {
        return "NT";
    }

    @Override // n2.s0, n2.u0
    public boolean i() {
        return false;
    }

    @Override // n2.s0, n2.u0
    public synchronized void j() {
    }

    @Override // n2.s0, n2.u0
    public synchronized void k() {
    }

    public t m(a aVar) {
        this.f9589m = aVar;
        return this;
    }
}
