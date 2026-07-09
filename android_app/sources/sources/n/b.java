package n;

import c.j0;
import c.r0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f8949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<K, V> f8950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f8951d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8952e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f8956d;
        }

        @Override // n.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f8955c;
        }
    }

    /* JADX INFO: renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0082b<K, V> extends e<K, V> {
        public C0082b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f8955c;
        }

        @Override // n.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f8956d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final K f8953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j0
        public final V f8954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f8955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f8956d;

        public c(@j0 K k4, @j0 V v3) {
            this.f8953a = k4;
            this.f8954b = v3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8953a.equals(cVar.f8953a) && this.f8954b.equals(cVar.f8954b);
        }

        @Override // java.util.Map.Entry
        @j0
        public K getKey() {
            return this.f8953a;
        }

        @Override // java.util.Map.Entry
        @j0
        public V getValue() {
            return this.f8954b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f8953a.hashCode() ^ this.f8954b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f8953a + "=" + this.f8954b;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f8957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8958b = true;

        public d() {
        }

        @Override // n.b.f
        public void a(@j0 c<K, V> cVar) {
            c<K, V> cVar2 = this.f8957a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f8956d;
                this.f8957a = cVar3;
                this.f8958b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f8958b) {
                this.f8958b = false;
                cVar = b.this.f8949b;
            } else {
                c<K, V> cVar2 = this.f8957a;
                cVar = cVar2 != null ? cVar2.f8955c : null;
            }
            this.f8957a = cVar;
            return this.f8957a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8958b) {
                return b.this.f8949b != null;
            }
            c<K, V> cVar = this.f8957a;
            return (cVar == null || cVar.f8955c == null) ? false : true;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f8960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f8961b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f8960a = cVar2;
            this.f8961b = cVar;
        }

        @Override // n.b.f
        public void a(@j0 c<K, V> cVar) {
            if (this.f8960a == cVar && cVar == this.f8961b) {
                this.f8961b = null;
                this.f8960a = null;
            }
            c<K, V> cVar2 = this.f8960a;
            if (cVar2 == cVar) {
                this.f8960a = b(cVar2);
            }
            if (this.f8961b == cVar) {
                this.f8961b = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f8961b;
            this.f8961b = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f8961b;
            c<K, V> cVar2 = this.f8960a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8961b != null;
        }
    }

    public interface f<K, V> {
        void a(@j0 c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0082b c0082b = new C0082b(this.f8950c, this.f8949b);
        this.f8951d.put(c0082b, Boolean.FALSE);
        return c0082b;
    }

    public Map.Entry<K, V> b() {
        return this.f8949b;
    }

    public c<K, V> c(K k4) {
        c<K, V> cVar = this.f8949b;
        while (cVar != null && !cVar.f8953a.equals(k4)) {
            cVar = cVar.f8955c;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f8951d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f8950c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public c<K, V> f(@j0 K k4, @j0 V v3) {
        c<K, V> cVar = new c<>(k4, v3);
        this.f8952e++;
        c<K, V> cVar2 = this.f8950c;
        if (cVar2 == null) {
            this.f8949b = cVar;
        } else {
            cVar2.f8955c = cVar;
            cVar.f8956d = cVar2;
        }
        this.f8950c = cVar;
        return cVar;
    }

    public V g(@j0 K k4, @j0 V v3) {
        c<K, V> cVarC = c(k4);
        if (cVarC != null) {
            return cVarC.f8954b;
        }
        f(k4, v3);
        return null;
    }

    public V h(@j0 K k4) {
        c<K, V> cVarC = c(k4);
        if (cVarC == null) {
            return null;
        }
        this.f8952e--;
        if (!this.f8951d.isEmpty()) {
            Iterator<f<K, V>> it = this.f8951d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f8956d;
        c<K, V> cVar2 = cVarC.f8955c;
        if (cVar != null) {
            cVar.f8955c = cVar2;
        } else {
            this.f8949b = cVar2;
        }
        c<K, V> cVar3 = cVarC.f8955c;
        if (cVar3 != null) {
            cVar3.f8956d = cVar;
        } else {
            this.f8950c = cVar;
        }
        cVarC.f8955c = null;
        cVarC.f8956d = null;
        return cVarC.f8954b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @j0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f8949b, this.f8950c);
        this.f8951d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f8952e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
