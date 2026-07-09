package c3;

import c3.f;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t3.i;
import t3.j;

/* JADX INFO: loaded from: classes.dex */
public class g extends s3.b {

    public static class a extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t3.c f4762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f4763c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4761a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<f3.b> f4764d = new ArrayList();

        /* JADX INFO: renamed from: c3.g$a$a, reason: collision with other inner class name */
        public class C0038a extends s3.b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d3.b f4765e;

            /* JADX INFO: renamed from: c3.g$a$a$a, reason: collision with other inner class name */
            public class C0039a extends i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f4767a;

                public C0039a(i iVar) {
                    this.f4767a = iVar;
                }

                @Override // t3.i
                public void a() throws Throwable {
                    try {
                        this.f4767a.a();
                        a.this.f();
                    } catch (f3.b e4) {
                        a.this.e(e4);
                    } catch (Throwable th) {
                        C0038a c0038a = C0038a.this;
                        a aVar = a.this;
                        aVar.i(th, c0038a.f4765e.f(aVar.h()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0038a(Class cls, d3.b bVar) {
                super(cls);
                this.f4765e = bVar;
            }

            @Override // s3.b
            public Object F() throws Exception {
                return r().i().newInstance(this.f4765e.g(a.this.h()));
            }

            @Override // s3.b
            public i N(t3.c cVar) {
                return new C0039a(super.N(cVar));
            }

            @Override // s3.b
            public i O(t3.c cVar, Object obj) {
                return a.this.g(cVar, this.f4765e, obj);
            }

            @Override // s3.b, s3.e
            public void k(List<Throwable> list) {
            }
        }

        public class b extends i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d3.b f4769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t3.c f4770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f4771c;

            public b(d3.b bVar, t3.c cVar, Object obj) {
                this.f4769a = bVar;
                this.f4770b = cVar;
                this.f4771c = obj;
            }

            @Override // t3.i
            public void a() throws Throwable {
                try {
                    this.f4770b.h(this.f4771c, this.f4769a.i(a.this.h()));
                } catch (f.b unused) {
                }
            }
        }

        public a(t3.c cVar, j jVar) {
            this.f4762b = cVar;
            this.f4763c = jVar;
        }

        @Override // t3.i
        public void a() throws Throwable {
            j(d3.b.a(this.f4762b.e(), d()));
            if (this.f4761a == 0) {
                w2.c.P("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.f4764d);
            }
        }

        public final j d() {
            return this.f4763c;
        }

        public void e(f3.b bVar) {
            this.f4764d.add(bVar);
        }

        public void f() {
            this.f4761a++;
        }

        public final i g(t3.c cVar, d3.b bVar, Object obj) {
            return new b(bVar, cVar, obj);
        }

        public final boolean h() {
            h hVar = (h) this.f4762b.e().getAnnotation(h.class);
            if (hVar == null) {
                return false;
            }
            return hVar.nullsAccepted();
        }

        public void i(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length != 0) {
                throw new d3.c(th, this.f4762b.f(), objArr);
            }
            throw th;
        }

        public void j(d3.b bVar) throws Throwable {
            if (bVar.k()) {
                k(bVar);
            } else {
                l(bVar);
            }
        }

        public void k(d3.b bVar) throws Throwable {
            new C0038a(d().g(), bVar).N(this.f4762b).a();
        }

        public void l(d3.b bVar) throws Throwable {
            Iterator<f> it = bVar.m().iterator();
            while (it.hasNext()) {
                j(bVar.b(it.next()));
            }
        }
    }

    public g(Class<?> cls) throws t3.d {
        super(cls);
    }

    @Override // s3.b
    public List<t3.c> E() {
        List<t3.c> listE = super.E();
        List<t3.c> listE2 = r().e(h.class);
        listE.removeAll(listE2);
        listE.addAll(listE2);
        return listE;
    }

    @Override // s3.b
    public i N(t3.c cVar) {
        return new a(cVar, r());
    }

    @Override // s3.b
    public void T(List<Throwable> list) {
        X(list);
    }

    @Override // s3.b
    public void Y(List<Throwable> list) {
        for (t3.c cVar : E()) {
            if (cVar.d(h.class) != null) {
                cVar.l(false, list);
            } else {
                cVar.m(false, list);
            }
        }
    }

    public final void g0(List<Throwable> list) {
        for (Field field : r().g().getDeclaredFields()) {
            if (field.getAnnotation(c3.a.class) != null && !Modifier.isStatic(field.getModifiers())) {
                list.add(new Error("DataPoint field " + field.getName() + " must be static"));
            }
        }
    }

    @Override // s3.b, s3.e
    public void k(List<Throwable> list) {
        super.k(list);
        g0(list);
    }
}
