package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f13829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, p0> f13830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f13831c;

    public q0() {
        ArrayList arrayList = new ArrayList();
        this.f13831c = arrayList;
        arrayList.add(n0.c.COMPOUND.toString());
    }

    public static q0 e(o0 o0Var) {
        q0 q0Var = new q0();
        q0Var.f13829a = o0Var;
        HashMap map = new HashMap();
        q0Var.f13830b = map;
        q0Var.f13829a.f(map);
        return q0Var;
    }

    public p0 a(String str) {
        p0 p0Var;
        synchronized (this) {
            p0Var = this.f13830b.get(str);
        }
        return p0Var;
    }

    public p0 b(String str, int i4) {
        p0 p0Var;
        synchronized (this) {
            i(i4);
            p0Var = this.f13830b.containsKey(str) ? this.f13830b.get(str) : null;
        }
        return p0Var;
    }

    public Map<String, p0> c(List<String> list) {
        HashMap map = new HashMap();
        synchronized (this) {
            h();
            for (String str : list) {
                p0 p0Var = this.f13830b.get(str);
                if (p0Var != null) {
                    map.put(str, p0Var);
                }
            }
        }
        return map;
    }

    public Map<String, n0> d(String[] strArr, int i4) {
        p0 p0Var;
        HashMap map = new HashMap();
        synchronized (this) {
            i(i4);
            for (String str : strArr) {
                if (this.f13830b.containsKey(str) && (p0Var = this.f13830b.get(str)) != null) {
                    map.put(str, p0Var);
                }
            }
        }
        return map;
    }

    public void f(q qVar) {
        synchronized (this) {
            this.f13829a.j(qVar);
        }
    }

    public Map<String, Object> g(String[] strArr, Map<String, n0> map) {
        HashMap map2 = new HashMap();
        for (String str : strArr) {
            n0 n0Var = map.get(str);
            if (n0Var != null) {
                map2.put(str, n0Var.V2());
            }
        }
        return map2;
    }

    public void h() {
        synchronized (this) {
            HashMap map = new HashMap();
            this.f13829a.f(map);
            for (p0 p0Var : this.f13830b.values()) {
                p0 p0Var2 = (p0) map.get(p0Var.R2());
                if (p0Var2 != null && p0Var2 != p0Var && !this.f13831c.contains(p0Var.f13821e)) {
                    p0Var2.S2(p0Var);
                }
            }
            this.f13830b = map;
        }
    }

    public void i(int i4) {
        synchronized (this) {
            HashMap map = new HashMap();
            this.f13829a.g(map, i4);
            this.f13830b = map;
        }
    }
}
