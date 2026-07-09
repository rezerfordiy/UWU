package m3;

import t3.i;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f8932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<? extends Throwable> f8933b;

    public a(i iVar, Class<? extends Throwable> cls) {
        this.f8932a = iVar;
        this.f8933b = cls;
    }

    @Override // t3.i
    public void a() throws Exception {
        boolean z3;
        try {
            this.f8932a.a();
            z3 = true;
        } catch (f3.b e4) {
            throw e4;
        } catch (Throwable th) {
            if (!this.f8933b.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.f8933b.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
            z3 = false;
        }
        if (z3) {
            throw new AssertionError("Expected exception: " + this.f8933b.getName());
        }
    }
}
