package z1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, p0> f13749a = new HashMap();

    public static o0 h(p0... p0VarArr) {
        o0 o0Var = new o0();
        for (p0 p0Var : p0VarArr) {
            o0Var.a(p0Var);
        }
        return o0Var;
    }

    public boolean a(p0 p0Var) {
        if (this.f13749a.containsValue(p0Var) || p0Var == null) {
            return false;
        }
        this.f13749a.put(p0Var.R2(), p0Var);
        return true;
    }

    public boolean b(List<p0> list) {
        Iterator<p0> it = list.iterator();
        if (it.hasNext()) {
            return a(it.next());
        }
        return true;
    }

    public void c() {
        for (p0 p0Var : this.f13749a.values()) {
            Iterator<r0> it = p0Var.f13827k.iterator();
            while (it.hasNext()) {
                o0 o0VarG = it.next().g();
                if (o0VarG != null) {
                    o0VarG.c();
                }
            }
            p0Var.f13827k.clear();
        }
        this.f13749a.clear();
    }

    public void d() {
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.f13825i = false;
            Iterator<r0> it = p0Var.f13827k.iterator();
            while (it.hasNext()) {
                Iterator<o0> it2 = it.next().a().iterator();
                while (it2.hasNext()) {
                    it2.next().d();
                }
            }
        }
    }

    public void e(int i4) {
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.f13825i = false;
            for (r0 r0Var : p0Var.f13827k) {
                if ((r0Var instanceof e7) || (r0Var instanceof t1)) {
                    r0Var.d(e7.h(i4)).e(i4);
                } else {
                    Iterator<o0> it = r0Var.a().iterator();
                    while (it.hasNext()) {
                        it.next().e(i4);
                    }
                }
            }
        }
    }

    public void f(Map<String, p0> map) {
        d();
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.f13825i = true;
            map.put(p0Var.R2(), p0Var);
            Iterator<r0> it = p0Var.f13827k.iterator();
            while (it.hasNext()) {
                o0 o0VarG = it.next().g();
                if (o0VarG != null) {
                    o0VarG.f(map);
                }
            }
        }
    }

    public void g(Map<String, p0> map, int i4) {
        o0 o0VarD;
        e(i4);
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.f13825i = true;
            map.put(p0Var.f13821e, p0Var);
            for (r0 r0Var : p0Var.f13827k) {
                if ((r0Var instanceof e7) || (r0Var instanceof t1)) {
                    o0VarD = r0Var.d(e7.h(i4));
                    o0VarD.g(map, i4);
                } else {
                    o0VarD = r0Var.g();
                    if (o0VarD != null) {
                        o0VarD.g(map, i4);
                    }
                }
            }
        }
    }

    public void i() {
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.f13819c = true;
            p0Var.f13820d = false;
            p0Var.f13818b = false;
            Iterator<r0> it = p0Var.f13827k.iterator();
            while (it.hasNext()) {
                Iterator<o0> it2 = it.next().a().iterator();
                while (it2.hasNext()) {
                    it2.next().i();
                }
            }
        }
    }

    public void j(q qVar) {
        for (p0 p0Var : this.f13749a.values()) {
            p0Var.a3(qVar);
            Iterator<r0> it = p0Var.f13827k.iterator();
            while (it.hasNext()) {
                Iterator<o0> it2 = it.next().a().iterator();
                while (it2.hasNext()) {
                    it2.next().j(qVar);
                }
            }
        }
    }
}
