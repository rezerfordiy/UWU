package r3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r3.b> f10900a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10901b = false;

    public class a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.c f10902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3.c cVar) {
            super(c.this, null);
            this.f10902b = cVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.f(this.f10902b);
        }
    }

    public class b extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.f f10904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p3.f fVar) {
            super(c.this, null);
            this.f10904b = fVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.e(this.f10904b);
        }
    }

    /* JADX INFO: renamed from: r3.c$c, reason: collision with other inner class name */
    public class C0107c extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.c f10906b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0107c(p3.c cVar) {
            super(c.this, null);
            this.f10906b = cVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.g(this.f10906b);
        }
    }

    public class d extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r3.a f10908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r3.a aVar) {
            super(c.this, null);
            this.f10908b = aVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.b(this.f10908b);
        }
    }

    public class e extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r3.a f10910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r3.a aVar) {
            super(c.this, null);
            this.f10910b = aVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.a(this.f10910b);
        }
    }

    public class f extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.c f10912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p3.c cVar) {
            super(c.this, null);
            this.f10912b = cVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.d(this.f10912b);
        }
    }

    public class g extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.c f10914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p3.c cVar) {
            super(c.this, null);
            this.f10914b = cVar;
        }

        @Override // r3.c.h
        public void a(r3.b bVar) throws Exception {
            bVar.c(this.f10914b);
        }
    }

    public abstract class h {
        public h() {
        }

        public abstract void a(r3.b bVar) throws Exception;

        public void b() {
            synchronized (c.this.f10900a) {
                Iterator it = c.this.f10900a.iterator();
                while (it.hasNext()) {
                    try {
                        a((r3.b) it.next());
                    } catch (Exception e4) {
                        it.remove();
                        c.this.e(new r3.a(p3.c.f10096g, e4));
                    }
                }
            }
        }

        public /* synthetic */ h(c cVar, a aVar) {
            this();
        }
    }

    public void b(r3.b bVar) {
        this.f10900a.add(0, bVar);
    }

    public void c(r3.b bVar) {
        this.f10900a.add(bVar);
    }

    public void d(r3.a aVar) {
        new e(aVar).b();
    }

    public void e(r3.a aVar) {
        new d(aVar).b();
    }

    public void f(p3.c cVar) {
        new g(cVar).b();
    }

    public void g(p3.c cVar) {
        new f(cVar).b();
    }

    public void h(p3.f fVar) {
        new b(fVar).b();
    }

    public void i(p3.c cVar) {
        new a(cVar).b();
    }

    public void j(p3.c cVar) throws r3.d {
        if (this.f10901b) {
            throw new r3.d();
        }
        new C0107c(cVar).b();
    }

    public void k() {
        this.f10901b = true;
    }

    public void l(r3.b bVar) {
        this.f10900a.remove(bVar);
    }
}
