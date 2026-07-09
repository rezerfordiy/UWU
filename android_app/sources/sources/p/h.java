package p;

import c.k0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k0
    public h<K, V>.b f10014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k0
    public h<K, V>.c f10015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k0
    public h<K, V>.e f10016c;

    public final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10020d = false;

        public a(int i4) {
            this.f10017a = i4;
            this.f10018b = h.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10019c < this.f10018b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t4 = (T) h.this.b(this.f10019c, this.f10017a);
            this.f10019c++;
            this.f10020d = true;
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10020d) {
                throw new IllegalStateException();
            }
            int i4 = this.f10019c - 1;
            this.f10019c = i4;
            this.f10018b--;
            this.f10020d = false;
            h.this.h(i4);
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = h.this.d();
            for (Map.Entry<K, V> entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return iD != h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = h.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return p.e.c(h.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objB = h.this.b(iD, 0);
                Object objB2 = h.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objB = h.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = h.this.e(obj);
            if (iE < 0) {
                return false;
            }
            h.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return h.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10024a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10026c = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10025b = -1;

        public d() {
            this.f10024a = h.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f10025b++;
            this.f10026c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f10026c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p.e.c(entry.getKey(), h.this.b(this.f10025b, 0)) && p.e.c(entry.getValue(), h.this.b(this.f10025b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f10026c) {
                return (K) h.this.b(this.f10025b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f10026c) {
                return (V) h.this.b(this.f10025b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10025b < this.f10024a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f10026c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = h.this.b(this.f10025b, 0);
            Object objB2 = h.this.b(this.f10025b, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10026c) {
                throw new IllegalStateException();
            }
            h.this.h(this.f10025b);
            this.f10025b--;
            this.f10024a--;
            this.f10026c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            if (this.f10026c) {
                return (V) h.this.i(this.f10025b, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = h.this.f(obj);
            if (iF < 0) {
                return false;
            }
            h.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = h.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iD) {
                if (collection.contains(h.this.b(i4, 1))) {
                    h.this.h(i4);
                    i4--;
                    iD--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = h.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iD) {
                if (!collection.contains(h.this.b(i4, 1))) {
                    h.this.h(i4);
                    i4--;
                    iD--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return h.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i4, int i5);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k4, V v3);

    public abstract void h(int i4);

    public abstract V i(int i4, V v3);

    public Set<Map.Entry<K, V>> l() {
        if (this.f10014a == null) {
            this.f10014a = new b();
        }
        return this.f10014a;
    }

    public Set<K> m() {
        if (this.f10015b == null) {
            this.f10015b = new c();
        }
        return this.f10015b;
    }

    public Collection<V> n() {
        if (this.f10016c == null) {
            this.f10016c = new e();
        }
        return this.f10016c;
    }

    public Object[] q(int i4) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i5 = 0; i5 < iD; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i4) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i5 = 0; i5 < iD; i5++) {
            tArr[i5] = b(i5, i4);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}
