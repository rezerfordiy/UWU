package s3;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p3.h;
import t3.i;
import t3.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> extends h implements q3.b, q3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.e f11328b = q3.e.f10485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<T> f11329c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t3.h f11330d = new a();

    public class a implements t3.h {
        public a() {
        }

        @Override // t3.h
        public void a(Runnable runnable) {
            runnable.run();
        }

        @Override // t3.h
        public void b() {
        }
    }

    public class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r3.c f11332a;

        public b(r3.c cVar) {
            this.f11332a = cVar;
        }

        @Override // t3.i
        public void a() {
            e.this.t(this.f11332a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f11334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r3.c f11335c;

        public c(Object obj, r3.c cVar) {
            this.f11334b = obj;
            this.f11335c = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            e.this.s(this.f11334b, this.f11335c);
        }
    }

    public class d implements Comparator<T> {
        public d() {
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return e.this.f11328b.compare(e.this.m(t4), e.this.m(t5));
        }
    }

    public e(Class<?> cls) throws t3.d {
        this.f11327a = new j(cls);
        y();
    }

    public void A(Class<? extends Annotation> cls, boolean z3, List<Throwable> list) {
        Iterator<t3.c> it = r().e(cls).iterator();
        while (it.hasNext()) {
            it.next().m(z3, list);
        }
    }

    public i B(i iVar) {
        List<t3.c> listE = this.f11327a.e(w2.b.class);
        return listE.isEmpty() ? iVar : new m3.e(iVar, listE, null);
    }

    public i C(i iVar) {
        List<t3.c> listE = this.f11327a.e(w2.f.class);
        return listE.isEmpty() ? iVar : new m3.f(iVar, listE, null);
    }

    public final i D(i iVar) {
        List<o3.i> listJ = j();
        return listJ.isEmpty() ? iVar : new o3.f(iVar, listJ, a());
    }

    @Override // p3.h, p3.b
    public p3.c a() {
        p3.c cVarD = p3.c.d(p(), q());
        Iterator<T> it = o().iterator();
        while (it.hasNext()) {
            cVarD.a(m(it.next()));
        }
        return cVarD;
    }

    @Override // p3.h
    public void b(r3.c cVar) {
        k3.a aVar = new k3.a(cVar, a());
        try {
            i(cVar).a();
        } catch (f3.b unused) {
            aVar.e();
        } catch (r3.d e4) {
            throw e4;
        } catch (Throwable th) {
            aVar.b(th);
        }
    }

    @Override // q3.d
    public void d(q3.e eVar) {
        this.f11328b = eVar;
        Iterator<T> it = o().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Collections.sort(o(), l());
    }

    @Override // q3.b
    public void e(q3.a aVar) throws q3.c {
        Iterator<T> it = o().iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (w(aVar, next)) {
                try {
                    aVar.a(next);
                } catch (q3.c unused) {
                    it.remove();
                }
            }
            it.remove();
        }
        if (o().isEmpty()) {
            throw new q3.c();
        }
    }

    public i h(r3.c cVar) {
        return new b(cVar);
    }

    public i i(r3.c cVar) {
        return D(B(C(h(cVar))));
    }

    public List<o3.i> j() {
        return this.f11327a.b(null, w2.g.class, o3.i.class);
    }

    public void k(List<Throwable> list) {
        A(w2.f.class, true, list);
        A(w2.b.class, true, list);
        z(list);
    }

    public final Comparator<? super T> l() {
        return new d();
    }

    public abstract p3.c m(T t4);

    public abstract List<T> n();

    public final List<T> o() {
        if (this.f11329c == null) {
            this.f11329c = new ArrayList(n());
        }
        return this.f11329c;
    }

    public String p() {
        return this.f11327a.h();
    }

    public Annotation[] q() {
        return this.f11327a.f();
    }

    public final j r() {
        return this.f11327a;
    }

    public abstract void s(T t4, r3.c cVar);

    public final void t(r3.c cVar) {
        Iterator<T> it = o().iterator();
        while (it.hasNext()) {
            this.f11330d.a(new c(it.next(), cVar));
        }
        this.f11330d.b();
    }

    public final void u(i iVar, p3.c cVar, r3.c cVar2) {
        k3.a aVar = new k3.a(cVar2, cVar);
        aVar.f();
        try {
            try {
                iVar.a();
            } catch (f3.b e4) {
                aVar.a(e4);
            } catch (Throwable th) {
                aVar.b(th);
            }
        } finally {
            aVar.d();
        }
    }

    public void v(t3.h hVar) {
        this.f11330d = hVar;
    }

    public final boolean w(q3.a aVar, T t4) {
        return aVar.e(m(t4));
    }

    public final void x(T t4) {
        this.f11328b.a(t4);
    }

    public final void y() throws t3.d {
        ArrayList arrayList = new ArrayList();
        k(arrayList);
        if (!arrayList.isEmpty()) {
            throw new t3.d(arrayList);
        }
    }

    public final void z(List<Throwable> list) {
        l3.a.CLASS_RULE_VALIDATOR.e(r(), list);
    }
}
