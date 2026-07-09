package p3;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r3.c f10100a = new r3.c();

    public static a b() {
        return new a();
    }

    public static void d(String... strArr) {
        n(new f3.g(), strArr);
    }

    public static f k(a aVar, Class<?>... clsArr) {
        return new d().f(aVar, clsArr);
    }

    public static f l(Class<?>... clsArr) {
        return new d().f(b(), clsArr);
    }

    public static void n(f3.f fVar, String... strArr) {
        fVar.a(!new d().m(fVar, strArr).m() ? 1 : 0);
    }

    public void a(r3.b bVar) {
        this.f10100a.c(bVar);
    }

    public String c() {
        return r2.c.a();
    }

    public void e(r3.b bVar) {
        this.f10100a.l(bVar);
    }

    public f f(a aVar, Class<?>... clsArr) {
        return g(e.c(aVar, clsArr));
    }

    public f g(e eVar) {
        return h(eVar.h());
    }

    public f h(h hVar) {
        f fVar = new f();
        r3.b bVarG = fVar.g();
        this.f10100a.b(bVarG);
        try {
            this.f10100a.i(hVar.a());
            hVar.b(this.f10100a);
            this.f10100a.h(fVar);
            return fVar;
        } finally {
            e(bVarG);
        }
    }

    public f i(q2.i iVar) {
        return h(new j3.e(iVar));
    }

    public f j(Class<?>... clsArr) {
        return g(e.c(b(), clsArr));
    }

    public f m(f3.f fVar, String... strArr) {
        fVar.b().println("JUnit version " + r2.c.a());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException e4) {
                fVar.b().println("Could not find class: " + str);
                arrayList2.add(new r3.a(c.d(str, new Annotation[0]), e4));
            }
        }
        a(new f3.h(fVar));
        f fVarJ = j((Class[]) arrayList.toArray(new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            fVarJ.i().add((r3.a) it.next());
        }
        return fVarJ;
    }
}
