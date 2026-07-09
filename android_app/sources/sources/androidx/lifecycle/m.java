package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.i;
import c.g0;
import c.j0;
import c.k0;
import c.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n.a<k, a> f4155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.c f4156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<l> f4157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<i.c> f4161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4162i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i.c f4163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f4164b;

        public a(k kVar, i.c cVar) {
            this.f4164b = Lifecycling.g(kVar);
            this.f4163a = cVar;
        }

        public void a(l lVar, i.b bVar) {
            i.c cVarC = bVar.c();
            this.f4163a = m.m(this.f4163a, cVarC);
            this.f4164b.d(lVar, bVar);
            this.f4163a = cVarC;
        }
    }

    public m(@j0 l lVar) {
        this(lVar, true);
    }

    @j0
    @z0
    public static m f(@j0 l lVar) {
        return new m(lVar, false);
    }

    public static i.c m(@j0 i.c cVar, @k0 i.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.i
    public void a(@j0 k kVar) {
        l lVar;
        g("addObserver");
        i.c cVar = this.f4156c;
        i.c cVar2 = i.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = i.c.INITIALIZED;
        }
        a aVar = new a(kVar, cVar2);
        if (this.f4155b.g(kVar, aVar) == null && (lVar = this.f4157d.get()) != null) {
            boolean z3 = this.f4158e != 0 || this.f4159f;
            i.c cVarE = e(kVar);
            this.f4158e++;
            while (aVar.f4163a.compareTo(cVarE) < 0 && this.f4155b.contains(kVar)) {
                p(aVar.f4163a);
                i.b bVarD = i.b.d(aVar.f4163a);
                if (bVarD == null) {
                    throw new IllegalStateException("no event up from " + aVar.f4163a);
                }
                aVar.a(lVar, bVarD);
                o();
                cVarE = e(kVar);
            }
            if (!z3) {
                r();
            }
            this.f4158e--;
        }
    }

    @Override // androidx.lifecycle.i
    @j0
    public i.c b() {
        return this.f4156c;
    }

    @Override // androidx.lifecycle.i
    public void c(@j0 k kVar) {
        g("removeObserver");
        this.f4155b.h(kVar);
    }

    public final void d(l lVar) {
        Iterator<Map.Entry<k, a>> itA = this.f4155b.a();
        while (itA.hasNext() && !this.f4160g) {
            Map.Entry<k, a> next = itA.next();
            a value = next.getValue();
            while (value.f4163a.compareTo(this.f4156c) > 0 && !this.f4160g && this.f4155b.contains(next.getKey())) {
                i.b bVarA = i.b.a(value.f4163a);
                if (bVarA == null) {
                    throw new IllegalStateException("no event down from " + value.f4163a);
                }
                p(bVarA.c());
                value.a(lVar, bVarA);
                o();
            }
        }
    }

    public final i.c e(k kVar) {
        Map.Entry<k, a> entryI = this.f4155b.i(kVar);
        i.c cVar = null;
        i.c cVar2 = entryI != null ? entryI.getValue().f4163a : null;
        if (!this.f4161h.isEmpty()) {
            cVar = this.f4161h.get(r0.size() - 1);
        }
        return m(m(this.f4156c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void g(String str) {
        if (!this.f4162i || m.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void h(l lVar) {
        n.b<k, a>.d dVarD = this.f4155b.d();
        while (dVarD.hasNext() && !this.f4160g) {
            Map.Entry next = dVarD.next();
            a aVar = (a) next.getValue();
            while (aVar.f4163a.compareTo(this.f4156c) < 0 && !this.f4160g && this.f4155b.contains((k) next.getKey())) {
                p(aVar.f4163a);
                i.b bVarD = i.b.d(aVar.f4163a);
                if (bVarD == null) {
                    throw new IllegalStateException("no event up from " + aVar.f4163a);
                }
                aVar.a(lVar, bVarD);
                o();
            }
        }
    }

    public int i() {
        g("getObserverCount");
        return this.f4155b.size();
    }

    public void j(@j0 i.b bVar) {
        g("handleLifecycleEvent");
        n(bVar.c());
    }

    public final boolean k() {
        if (this.f4155b.size() == 0) {
            return true;
        }
        i.c cVar = this.f4155b.b().getValue().f4163a;
        i.c cVar2 = this.f4155b.e().getValue().f4163a;
        return cVar == cVar2 && this.f4156c == cVar2;
    }

    @g0
    @Deprecated
    public void l(@j0 i.c cVar) {
        g("markState");
        q(cVar);
    }

    public final void n(i.c cVar) {
        if (this.f4156c == cVar) {
            return;
        }
        this.f4156c = cVar;
        if (this.f4159f || this.f4158e != 0) {
            this.f4160g = true;
            return;
        }
        this.f4159f = true;
        r();
        this.f4159f = false;
    }

    public final void o() {
        this.f4161h.remove(r0.size() - 1);
    }

    public final void p(i.c cVar) {
        this.f4161h.add(cVar);
    }

    @g0
    public void q(@j0 i.c cVar) {
        g("setCurrentState");
        n(cVar);
    }

    public final void r() {
        l lVar = this.f4157d.get();
        if (lVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zK = k();
            this.f4160g = false;
            if (zK) {
                return;
            }
            if (this.f4156c.compareTo(this.f4155b.b().getValue().f4163a) < 0) {
                d(lVar);
            }
            Map.Entry<k, a> entryE = this.f4155b.e();
            if (!this.f4160g && entryE != null && this.f4156c.compareTo(entryE.getValue().f4163a) > 0) {
                h(lVar);
            }
        }
    }

    public m(@j0 l lVar, boolean z3) {
        this.f4155b = new n.a<>();
        this.f4158e = 0;
        this.f4159f = false;
        this.f4160g = false;
        this.f4161h = new ArrayList<>();
        this.f4157d = new WeakReference<>(lVar);
        this.f4156c = i.c.INITIALIZED;
        this.f4162i = z3;
    }
}
