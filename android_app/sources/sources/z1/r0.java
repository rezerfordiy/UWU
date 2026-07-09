package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, p0> f13832a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, o0> f13833b = new HashMap();

    public List<o0> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f13833b.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f13833b.get(it.next()));
        }
        return arrayList;
    }

    public void b() {
    }

    public p0 c(String str) {
        return this.f13832a.get(str);
    }

    public o0 d(String str) {
        return this.f13833b.get(str);
    }

    public void e(p0 p0Var, String str) {
        this.f13832a.put(str, p0Var);
    }

    public void f(o0 o0Var, String str) {
        o0Var.f(new HashMap());
        this.f13833b.put(str, o0Var);
    }

    public o0 g() {
        return null;
    }
}
