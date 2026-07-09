package u2;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<t2.f<? extends T>> f11715b;

    public b(Iterable<t2.f<? extends T>> iterable) {
        this.f11715b = iterable;
    }

    @t2.e
    public static <T> t2.f<T> d(Iterable<t2.f<? extends T>> iterable) {
        return new b(iterable);
    }

    @t2.e
    public static <T> t2.f<T> e(t2.f<? extends T>... fVarArr) {
        return d(Arrays.asList(fVarArr));
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.d("(", " or ", ")", this.f11715b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        Iterator<t2.f<? extends T>> it = this.f11715b.iterator();
        while (it.hasNext()) {
            if (it.next().c(obj)) {
                return true;
            }
        }
        return false;
    }
}
