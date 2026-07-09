package z1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e3 extends c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f13064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, p0> f13065b;

    public static e3 e(o0 o0Var) {
        e3 e3Var = new e3();
        e3Var.f13064a = o0Var;
        o0Var.i();
        HashMap map = new HashMap();
        e3Var.f13065b = map;
        e3Var.f13064a.f(map);
        return e3Var;
    }

    @Override // z1.c3
    public n0 a(String str) {
        f();
        return this.f13065b.get(str);
    }

    public p0 b(String str, int i4) {
        p0 p0Var;
        synchronized (this) {
            g(i4);
            p0Var = this.f13065b.get(str);
        }
        return p0Var;
    }

    public Map<String, p0> c(List<String> list) {
        HashMap map = new HashMap();
        synchronized (this) {
            f();
            for (String str : list) {
                p0 p0Var = this.f13065b.get(str);
                if (p0Var != null) {
                    map.put(str, p0Var);
                }
            }
        }
        return map;
    }

    public Map<String, p0> d(List<String> list, int i4) {
        HashMap map = new HashMap();
        synchronized (this) {
            g(i4);
            for (String str : list) {
                p0 p0Var = this.f13065b.get(str);
                if (p0Var != null) {
                    map.put(str, p0Var);
                }
            }
        }
        return map;
    }

    public void f() {
        synchronized (this) {
            HashMap map = new HashMap();
            this.f13064a.f(map);
            Iterator<Map.Entry<String, p0>> it = this.f13065b.entrySet().iterator();
            while (it.hasNext()) {
                p0 value = it.next().getValue();
                p0 p0Var = (p0) map.get(value.f13821e);
                if (p0Var != null && p0Var != value) {
                    p0Var.S2(value);
                }
            }
            this.f13065b = map;
        }
    }

    public void g(int i4) {
        synchronized (this) {
            HashMap map = new HashMap();
            this.f13064a.g(map, i4);
            this.f13065b = map;
        }
    }
}
