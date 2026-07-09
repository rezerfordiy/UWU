package p;

import c.j0;
import c.k0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends i<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @k0
    public h<K, V> f9973n;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    public class C0096a extends h<K, V> {
        public C0096a() {
        }

        @Override // p.h
        public void a() {
            a.this.clear();
        }

        @Override // p.h
        public Object b(int i4, int i5) {
            return a.this.f10039c[(i4 << 1) + i5];
        }

        @Override // p.h
        public Map<K, V> c() {
            return a.this;
        }

        @Override // p.h
        public int d() {
            return a.this.f10040d;
        }

        @Override // p.h
        public int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // p.h
        public int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // p.h
        public void g(K k4, V v3) {
            a.this.put(k4, v3);
        }

        @Override // p.h
        public void h(int i4) {
            a.this.k(i4);
        }

        @Override // p.h
        public V i(int i4, V v3) {
            return a.this.l(i4, v3);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean n(@j0 Collection<?> collection) {
        return h.j(this, collection);
    }

    public final h<K, V> o() {
        if (this.f9973n == null) {
            this.f9973n = new C0096a();
        }
        return this.f9973n;
    }

    public boolean p(@j0 Collection<?> collection) {
        return h.o(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f10040d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(@j0 Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }

    public a(int i4) {
        super(i4);
    }

    public a(i iVar) {
        super(iVar);
    }
}
