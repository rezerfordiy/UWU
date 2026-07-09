package k3;

import java.util.Iterator;
import t3.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3.c f8424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c f8425b;

    public a(r3.c cVar, p3.c cVar2) {
        this.f8424a = cVar;
        this.f8425b = cVar2;
    }

    public void a(f3.b bVar) {
        this.f8424a.d(new r3.a(this.f8425b, bVar));
    }

    public void b(Throwable th) {
        if (th instanceof e) {
            c((e) th);
        } else {
            this.f8424a.e(new r3.a(this.f8425b, th));
        }
    }

    public final void c(e eVar) {
        Iterator<Throwable> it = eVar.b().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public void d() {
        this.f8424a.f(this.f8425b);
    }

    public void e() {
        this.f8424a.g(this.f8425b);
    }

    public void f() {
        this.f8424a.j(this.f8425b);
    }
}
