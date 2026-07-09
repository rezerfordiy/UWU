package j3;

import java.lang.annotation.Annotation;
import q2.m;
import q2.n;

/* JADX INFO: loaded from: classes.dex */
public class e extends p3.h implements q3.b, q3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q2.i f8306a;

    public final class b implements q2.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r3.c f8307a;

        public b(r3.c cVar) {
            this.f8307a = cVar;
        }

        @Override // q2.l
        public void a(q2.i iVar) {
            this.f8307a.j(e(iVar));
        }

        @Override // q2.l
        public void b(q2.i iVar, Throwable th) {
            this.f8307a.e(new r3.a(e(iVar), th));
        }

        @Override // q2.l
        public void c(q2.i iVar) {
            this.f8307a.f(e(iVar));
        }

        @Override // q2.l
        public void d(q2.i iVar, q2.b bVar) {
            b(iVar, bVar);
        }

        public final p3.c e(q2.i iVar) {
            return iVar instanceof p3.b ? ((p3.b) iVar).a() : p3.c.e(f(iVar), g(iVar));
        }

        public final Class<? extends q2.i> f(q2.i iVar) {
            return iVar.getClass();
        }

        public final String g(q2.i iVar) {
            return iVar instanceof q2.j ? ((q2.j) iVar).P() : iVar.toString();
        }
    }

    public e(Class<?> cls) {
        this(new n(cls.asSubclass(q2.j.class)));
    }

    public static String g(n nVar) {
        int iB = nVar.b();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iB), iB == 0 ? s0.a.f11071l : String.format(" [example: %s]", nVar.o(0)));
    }

    public static p3.c i(q2.i iVar) {
        if (iVar instanceof q2.j) {
            q2.j jVar = (q2.j) iVar;
            return p3.c.e(jVar.getClass(), jVar.P());
        }
        if (!(iVar instanceof n)) {
            return iVar instanceof p3.b ? ((p3.b) iVar).a() : iVar instanceof p2.c ? i(((p2.c) iVar).P()) : p3.c.c(iVar.getClass());
        }
        n nVar = (n) iVar;
        p3.c cVarD = p3.c.d(nVar.i() == null ? g(nVar) : nVar.i(), new Annotation[0]);
        int iQ = nVar.q();
        for (int i4 = 0; i4 < iQ; i4++) {
            cVarD.a(i(nVar.o(i4)));
        }
        return cVarD;
    }

    @Override // p3.h, p3.b
    public p3.c a() {
        return i(h());
    }

    @Override // p3.h
    public void b(r3.c cVar) {
        m mVar = new m();
        mVar.c(f(cVar));
        h().c(mVar);
    }

    @Override // q3.d
    public void d(q3.e eVar) {
        if (h() instanceof q3.d) {
            ((q3.d) h()).d(eVar);
        }
    }

    @Override // q3.b
    public void e(q3.a aVar) throws q3.c {
        if (h() instanceof q3.b) {
            ((q3.b) h()).e(aVar);
            return;
        }
        if (h() instanceof n) {
            n nVar = (n) h();
            n nVar2 = new n(nVar.i());
            int iQ = nVar.q();
            for (int i4 = 0; i4 < iQ; i4++) {
                q2.i iVarO = nVar.o(i4);
                if (aVar.e(i(iVarO))) {
                    nVar2.a(iVarO);
                }
            }
            j(nVar2);
        }
    }

    public q2.l f(r3.c cVar) {
        return new b(cVar);
    }

    public final q2.i h() {
        return this.f8306a;
    }

    public final void j(q2.i iVar) {
        this.f8306a = iVar;
    }

    public e(q2.i iVar) {
        j(iVar);
    }
}
