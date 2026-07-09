package v2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterator<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12281b = 0;

    public a(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f12280a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12281b < Array.getLength(this.f12280a);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f12280a;
        int i4 = this.f12281b;
        this.f12281b = i4 + 1;
        return Array.get(obj, i4);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
