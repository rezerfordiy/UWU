package j3;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends p3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f8301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f8302b;

    public b(Class<?> cls, Throwable th) {
        this.f8302b = cls;
        this.f8301a = g(th);
    }

    @Override // p3.h, p3.b
    public p3.c a() {
        p3.c cVarC = p3.c.c(this.f8302b);
        Iterator<Throwable> it = this.f8301a.iterator();
        while (it.hasNext()) {
            cVarC.a(f(it.next()));
        }
        return cVarC;
    }

    @Override // p3.h
    public void b(r3.c cVar) {
        Iterator<Throwable> it = this.f8301a.iterator();
        while (it.hasNext()) {
            h(it.next(), cVar);
        }
    }

    public final p3.c f(Throwable th) {
        return p3.c.e(this.f8302b, "initializationError");
    }

    public final List<Throwable> g(Throwable th) {
        return th instanceof InvocationTargetException ? g(th.getCause()) : th instanceof t3.d ? ((t3.d) th).a() : th instanceof d ? ((d) th).a() : Arrays.asList(th);
    }

    public final void h(Throwable th, r3.c cVar) {
        p3.c cVarF = f(th);
        cVar.j(cVarF);
        cVar.e(new r3.a(cVarF, th));
        cVar.f(cVarF);
    }
}
