package q2;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements i, q3.b, q3.d, p3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f10458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.h f10459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10460c;

    public e(Class<?> cls) {
        this(cls, f.d());
    }

    @Override // p3.b
    public p3.c a() {
        return i(this.f10459b.a());
    }

    @Override // q2.i
    public int b() {
        return this.f10459b.c();
    }

    @Override // q2.i
    public void c(m mVar) {
        this.f10459b.b(this.f10460c.e(mVar, this));
    }

    @Override // q3.d
    public void d(q3.e eVar) {
        eVar.a(this.f10459b);
    }

    @Override // q3.b
    public void e(q3.a aVar) throws q3.c {
        aVar.a(this.f10459b);
    }

    public Class<?> f() {
        return this.f10458a;
    }

    public List<i> g() {
        return this.f10460c.b(a());
    }

    public final boolean h(p3.c cVar) {
        return cVar.g(w2.i.class) != null;
    }

    public final p3.c i(p3.c cVar) {
        if (h(cVar)) {
            return p3.c.f10095f;
        }
        p3.c cVarB = cVar.b();
        Iterator<p3.c> it = cVar.i().iterator();
        while (it.hasNext()) {
            p3.c cVarI = i(it.next());
            if (!cVarI.n()) {
                cVarB.a(cVarI);
            }
        }
        return cVarB;
    }

    public String toString() {
        return this.f10458a.getName();
    }

    public e(Class<?> cls, f fVar) {
        this.f10460c = fVar;
        this.f10458a = cls;
        this.f10459b = p3.e.b(cls).h();
    }
}
