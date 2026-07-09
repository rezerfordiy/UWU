package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends HashMap<p3.c, i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10461b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10462c = new f();

    public class a extends r3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f10463a;

        public a(m mVar) {
            this.f10463a = mVar;
        }

        @Override // r3.b
        public void b(r3.a aVar) throws Exception {
            this.f10463a.a(f.this.a(aVar.a()), aVar.b());
        }

        @Override // r3.b
        public void c(p3.c cVar) throws Exception {
            this.f10463a.e(f.this.a(cVar));
        }

        @Override // r3.b
        public void g(p3.c cVar) throws Exception {
            this.f10463a.o(f.this.a(cVar));
        }
    }

    public static f d() {
        return f10462c;
    }

    public i a(p3.c cVar) {
        if (cVar.o()) {
            return c(cVar);
        }
        if (!containsKey(cVar)) {
            put(cVar, c(cVar));
        }
        return get(cVar);
    }

    public List<i> b(p3.c cVar) {
        if (cVar.p()) {
            return Arrays.asList(a(cVar));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<p3.c> it = cVar.i().iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public i c(p3.c cVar) {
        if (cVar.p()) {
            return new g(cVar);
        }
        n nVar = new n(cVar.k());
        Iterator<p3.c> it = cVar.i().iterator();
        while (it.hasNext()) {
            nVar.a(a(it.next()));
        }
        return nVar;
    }

    public r3.c e(m mVar, e eVar) {
        r3.c cVar = new r3.c();
        cVar.c(new a(mVar));
        return cVar;
    }
}
