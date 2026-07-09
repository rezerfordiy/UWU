package androidx.activity;

import c.g0;
import c.j0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<a> f559b = new CopyOnWriteArrayList<>();

    public b(boolean z3) {
        this.f558a = z3;
    }

    public void a(@j0 a aVar) {
        this.f559b.add(aVar);
    }

    @g0
    public abstract void b();

    @g0
    public final boolean c() {
        return this.f558a;
    }

    @g0
    public final void d() {
        Iterator<a> it = this.f559b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(@j0 a aVar) {
        this.f559b.remove(aVar);
    }

    @g0
    public final void f(boolean z3) {
        this.f558a = z3;
    }
}
