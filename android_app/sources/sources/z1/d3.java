package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d3 extends c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f12991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, p0> f12992b;

    public static d3 b(o0 o0Var) {
        d3 d3Var = new d3();
        d3Var.f12991a = o0Var;
        o0Var.i();
        HashMap map = new HashMap();
        d3Var.f12992b = map;
        d3Var.f12991a.f(map);
        return d3Var;
    }

    @Override // z1.c3
    public n0 a(String str) {
        HashMap map = new HashMap();
        this.f12991a.f(map);
        for (p0 p0Var : this.f12992b.values()) {
            p0 p0Var2 = (p0) map.get(p0Var.R2());
            if (p0Var2 != null && p0Var2 != p0Var) {
                p0Var2.S2(p0Var);
            }
        }
        this.f12992b = map;
        return (n0) map.get(str);
    }
}
