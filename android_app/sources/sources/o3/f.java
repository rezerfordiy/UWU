package o3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends t3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3.i f9958a;

    public f(t3.i iVar, Iterable<i> iterable, p3.c cVar) {
        this.f9958a = b(iVar, iterable, cVar);
    }

    public static t3.i b(t3.i iVar, Iterable<i> iterable, p3.c cVar) {
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            iVar = it.next().a(iVar, cVar);
        }
        return iVar;
    }

    @Override // t3.i
    public void a() throws Throwable {
        this.f9958a.a();
    }
}
