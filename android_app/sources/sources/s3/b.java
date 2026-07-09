package s3;

import java.util.List;
import o3.i;
import w2.j;
import w2.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends e<t3.c> {

    public class a extends k3.c {
        public a() {
        }

        @Override // k3.c
        public Object b() throws Throwable {
            return b.this.F();
        }
    }

    public b(Class<?> cls) throws t3.d {
        super(cls);
    }

    public List<t3.c> E() {
        return r().e(k.class);
    }

    public Object F() throws Exception {
        return r().i().newInstance(new Object[0]);
    }

    @Override // s3.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public p3.c m(t3.c cVar) {
        return p3.c.f(r().g(), S(cVar), cVar.a());
    }

    public final boolean H(k kVar) {
        return I(kVar) != null;
    }

    public final Class<? extends Throwable> I(k kVar) {
        if (kVar == null || kVar.expected() == k.a.class) {
            return null;
        }
        return kVar.expected();
    }

    public final List<o3.d> J(Object obj) {
        return Q(obj);
    }

    public List<i> K(Object obj) {
        return r().b(obj, j.class, i.class);
    }

    public final long L(k kVar) {
        if (kVar == null) {
            return 0L;
        }
        return kVar.timeout();
    }

    public final boolean M() {
        return r().g().getConstructors().length == 1;
    }

    public t3.i N(t3.c cVar) {
        try {
            Object objA = new a().a();
            return e0(cVar, objA, a0(cVar, objA, b0(cVar, objA, d0(cVar, objA, P(cVar, objA, O(cVar, objA))))));
        } catch (Throwable th) {
            return new m3.b(th);
        }
    }

    public t3.i O(t3.c cVar, Object obj) {
        return new m3.d(cVar, obj);
    }

    @Deprecated
    public t3.i P(t3.c cVar, Object obj, t3.i iVar) {
        k kVar = (k) cVar.d(k.class);
        return H(kVar) ? new m3.a(iVar, I(kVar)) : iVar;
    }

    @Deprecated
    public List<o3.d> Q(Object obj) {
        return r().b(obj, j.class, o3.d.class);
    }

    @Override // s3.e
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void s(t3.c cVar, r3.c cVar2) {
        p3.c cVarM = m(cVar);
        if (cVar.d(w2.i.class) != null) {
            cVar2.g(cVarM);
        } else {
            u(N(cVar), cVarM, cVar2);
        }
    }

    public String S(t3.c cVar) {
        return cVar.f();
    }

    public void T(List<Throwable> list) {
        X(list);
        Z(list);
    }

    public final void U(List<Throwable> list) {
        l3.a.RULE_VALIDATOR.e(r(), list);
    }

    @Deprecated
    public void V(List<Throwable> list) {
        A(w2.a.class, false, list);
        A(w2.e.class, false, list);
        Y(list);
        if (E().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void W(List<Throwable> list) {
        if (r().k()) {
            list.add(new Exception("The inner class " + r().h() + " is not static."));
        }
    }

    public void X(List<Throwable> list) {
        if (M()) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public constructor"));
    }

    public void Y(List<Throwable> list) {
        A(k.class, false, list);
    }

    public void Z(List<Throwable> list) {
        if (r().k() || !M() || r().i().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    @Deprecated
    public t3.i a0(t3.c cVar, Object obj, t3.i iVar) {
        List<t3.c> listE = r().e(w2.a.class);
        return listE.isEmpty() ? iVar : new m3.e(iVar, listE, obj);
    }

    @Deprecated
    public t3.i b0(t3.c cVar, Object obj, t3.i iVar) {
        List<t3.c> listE = r().e(w2.e.class);
        return listE.isEmpty() ? iVar : new m3.f(iVar, listE, obj);
    }

    public final t3.i c0(t3.c cVar, Object obj, t3.i iVar) {
        List<i> listK = K(obj);
        for (o3.d dVar : J(obj)) {
            if (!listK.contains(dVar)) {
                iVar = dVar.a(iVar, cVar, obj);
            }
        }
        return iVar;
    }

    @Deprecated
    public t3.i d0(t3.c cVar, Object obj, t3.i iVar) {
        long jL = L((k) cVar.d(k.class));
        return jL > 0 ? new m3.c(iVar, jL) : iVar;
    }

    public final t3.i e0(t3.c cVar, Object obj, t3.i iVar) {
        return f0(cVar, obj, c0(cVar, obj, iVar));
    }

    public final t3.i f0(t3.c cVar, Object obj, t3.i iVar) {
        List<i> listK = K(obj);
        return listK.isEmpty() ? iVar : new o3.f(iVar, listK, m(cVar));
    }

    @Override // s3.e
    public void k(List<Throwable> list) {
        super.k(list);
        W(list);
        T(list);
        V(list);
        U(list);
    }

    @Override // s3.e
    public List<t3.c> n() {
        return E();
    }
}
