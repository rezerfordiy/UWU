package a;

import android.content.Context;
import c.j0;
import c.k0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<c> f1a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f2b;

    public void a(@j0 c cVar) {
        if (this.f2b != null) {
            cVar.a(this.f2b);
        }
        this.f1a.add(cVar);
    }

    public void b() {
        this.f2b = null;
    }

    public void c(@j0 Context context) {
        this.f2b = context;
        Iterator<c> it = this.f1a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @k0
    public Context d() {
        return this.f2b;
    }

    public void e(@j0 c cVar) {
        this.f1a.remove(cVar);
    }
}
