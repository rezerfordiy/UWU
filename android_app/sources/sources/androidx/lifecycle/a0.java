package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, y> f4125a = new HashMap<>();

    public final void a() {
        Iterator<y> it = this.f4125a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f4125a.clear();
    }

    public final y b(String str) {
        return this.f4125a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.f4125a.keySet());
    }

    public final void d(String str, y yVar) {
        y yVarPut = this.f4125a.put(str, yVar);
        if (yVarPut != null) {
            yVarPut.d();
        }
    }
}
