package j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class f extends p3.h implements q3.b, q3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Method> f8309a = j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8310b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r3.c f8311b;

        public a(r3.c cVar) {
            this.f8311b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.m(this.f8311b);
        }
    }

    public class b implements Comparator<Method> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q3.e f8313a;

        public b(q3.e eVar) {
            this.f8313a = eVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            return this.f8313a.compare(f.this.l(method), f.this.l(method2));
        }
    }

    public f(Class<?> cls) throws d {
        this.f8310b = new j(cls);
        q();
    }

    @Override // p3.h, p3.b
    public p3.c a() {
        p3.c cVarD = p3.c.d(h(), f());
        Iterator<Method> it = this.f8309a.iterator();
        while (it.hasNext()) {
            cVarD.a(l(it.next()));
        }
        return cVarD;
    }

    @Override // p3.h
    public void b(r3.c cVar) {
        new j3.a(cVar, this.f8310b, a(), new a(cVar)).d();
    }

    @Override // q3.d
    public void d(q3.e eVar) {
        Collections.sort(this.f8309a, new b(eVar));
    }

    @Override // q3.b
    public void e(q3.a aVar) throws q3.c {
        Iterator<Method> it = this.f8309a.iterator();
        while (it.hasNext()) {
            if (!aVar.e(l(it.next()))) {
                it.remove();
            }
        }
        if (this.f8309a.isEmpty()) {
            throw new q3.c();
        }
    }

    public Annotation[] f() {
        return this.f8310b.e().getAnnotations();
    }

    public Object g() throws Exception {
        return i().d().newInstance(new Object[0]);
    }

    public String h() {
        return i().f();
    }

    public j i() {
        return this.f8310b;
    }

    public List<Method> j() {
        return this.f8310b.h();
    }

    public void k(Method method, r3.c cVar) {
        p3.c cVarL = l(method);
        try {
            new g(g(), r(method), cVar, cVarL).b();
        } catch (InvocationTargetException e4) {
            n(cVar, cVarL, e4.getCause());
        } catch (Exception e5) {
            n(cVar, cVarL, e5);
        }
    }

    public p3.c l(Method method) {
        return p3.c.f(i().e(), p(method), o(method));
    }

    public void m(r3.c cVar) {
        Iterator<Method> it = this.f8309a.iterator();
        while (it.hasNext()) {
            k(it.next(), cVar);
        }
    }

    public final void n(r3.c cVar, p3.c cVar2, Throwable th) {
        cVar.j(cVar2);
        cVar.e(new r3.a(cVar2, th));
        cVar.f(cVar2);
    }

    public Annotation[] o(Method method) {
        return method.getAnnotations();
    }

    public String p(Method method) {
        return method.getName();
    }

    public void q() throws d {
        h hVar = new h(this.f8310b);
        hVar.c();
        hVar.a();
    }

    public k r(Method method) {
        return new k(method, this.f8310b);
    }
}
