package l3;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import o3.d;
import o3.i;
import w2.g;
import w2.j;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    CLASS_RULE_VALIDATOR(g.class, true),
    RULE_VALIDATOR(j.class, false);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<? extends Annotation> f8515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8516c;

    a(Class cls, boolean z3) {
        this.f8515b = cls;
        this.f8516c = z3;
    }

    public final void a(List<Throwable> list, t3.a aVar, String str) {
        list.add(new Exception("The @" + this.f8515b.getSimpleName() + " '" + aVar.f() + "' " + str));
    }

    public final boolean b(t3.a aVar) {
        return d.class.isAssignableFrom(aVar.g());
    }

    public final boolean c(t3.a aVar) {
        return i.class.isAssignableFrom(aVar.g());
    }

    public final void d(t3.a aVar, List<Throwable> list) {
        if (!this.f8516c || aVar.j()) {
            return;
        }
        a(list, aVar, "must be static.");
    }

    public void e(t3.j jVar, List<Throwable> list) {
        Iterator<t3.a> it = jVar.c(this.f8515b).iterator();
        while (it.hasNext()) {
            f(it.next(), list);
        }
    }

    public final void f(t3.a aVar, List<Throwable> list) {
        d(aVar, list);
        g(aVar, list);
        h(aVar, list);
    }

    public final void g(t3.a aVar, List<Throwable> list) {
        if (aVar.h()) {
            return;
        }
        a(list, aVar, "must be public.");
    }

    public final void h(t3.a aVar, List<Throwable> list) {
        if (b(aVar) || c(aVar)) {
            return;
        }
        a(list, aVar, "must implement MethodRule or TestRule.");
    }
}
