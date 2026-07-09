package v2;

import java.util.Iterator;
import t2.g;

/* JADX INFO: loaded from: classes.dex */
public class c<T> implements Iterator<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator<T> f12283a;

    public c(Iterator<T> it) {
        this.f12283a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g next() {
        return new b(this.f12283a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12283a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f12283a.remove();
    }
}
