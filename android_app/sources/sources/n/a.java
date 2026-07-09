package n;

import c.j0;
import c.r0;
import java.util.HashMap;
import java.util.Map;
import n.b;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f8948f = new HashMap<>();

    @Override // n.b
    public b.c<K, V> c(K k4) {
        return this.f8948f.get(k4);
    }

    public boolean contains(K k4) {
        return this.f8948f.containsKey(k4);
    }

    @Override // n.b
    public V g(@j0 K k4, @j0 V v3) {
        b.c<K, V> cVarC = c(k4);
        if (cVarC != null) {
            return cVarC.f8954b;
        }
        this.f8948f.put(k4, f(k4, v3));
        return null;
    }

    @Override // n.b
    public V h(@j0 K k4) {
        V v3 = (V) super.h(k4);
        this.f8948f.remove(k4);
        return v3;
    }

    public Map.Entry<K, V> i(K k4) {
        if (contains(k4)) {
            return this.f8948f.get(k4).f8956d;
        }
        return null;
    }
}
