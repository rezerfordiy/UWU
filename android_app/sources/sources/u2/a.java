package u2;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<t2.f<? extends T>> f11714b;

    public a(Iterable<t2.f<? extends T>> iterable) {
        this.f11714b = iterable;
    }

    @t2.e
    public static <T> t2.f<T> d(Iterable<t2.f<? extends T>> iterable) {
        return new a(iterable);
    }

    @t2.e
    public static <T> t2.f<T> e(t2.f<? extends T>... fVarArr) {
        return d(Arrays.asList(fVarArr));
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        dVar.d("(", " and ", ")", this.f11714b);
    }

    @Override // t2.f
    public boolean c(Object obj) {
        Iterator<t2.f<? extends T>> it = this.f11714b.iterator();
        while (it.hasNext()) {
            if (!it.next().c(obj)) {
                return false;
            }
        }
        return true;
    }
}
