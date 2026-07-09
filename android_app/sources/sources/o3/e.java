package o3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f9956b = new e(Collections.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<i> f9957a;

    public e(List<i> list) {
        this.f9957a = list;
    }

    public static e c() {
        return f9956b;
    }

    public static e d(i iVar) {
        return c().b(iVar);
    }

    @Override // o3.i
    public t3.i a(t3.i iVar, p3.c cVar) {
        Iterator<i> it = this.f9957a.iterator();
        while (it.hasNext()) {
            iVar = it.next().a(iVar, cVar);
        }
        return iVar;
    }

    public e b(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iVar);
        arrayList.addAll(this.f9957a);
        return new e(arrayList);
    }
}
