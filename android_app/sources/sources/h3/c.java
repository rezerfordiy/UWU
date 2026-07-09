package h3;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c<T> extends f<Iterable<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.f<? extends T> f8046c;

    public c(t2.f<? extends T> fVar) {
        this.f8046c = fVar;
    }

    @t2.e
    public static <T> t2.f<Iterable<T>> g(T t4) {
        return h(u2.f.h(t4));
    }

    @t2.e
    public static <T> t2.f<Iterable<T>> h(t2.f<? extends T> fVar) {
        return new c(fVar);
    }

    @t2.e
    public static <T> t2.f<Iterable<T>> i(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t4 : tArr) {
            arrayList.add(g(t4));
        }
        return u2.a.d(arrayList);
    }

    @t2.e
    public static <T> t2.f<Iterable<T>> j(t2.f<? extends T>... fVarArr) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (t2.f<? extends T> fVar : fVarArr) {
            arrayList.add(h(fVar));
        }
        return u2.a.d(arrayList);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.a("a collection containing ").f(this.f8046c);
    }

    @Override // h3.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean f(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            if (this.f8046c.c(it.next())) {
                return true;
            }
        }
        return false;
    }
}
