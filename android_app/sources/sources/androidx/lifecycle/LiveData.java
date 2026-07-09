package androidx.lifecycle;

import androidx.lifecycle.i;
import c.g0;
import c.j0;
import c.k0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4092k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f4093l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n.b<r<? super T>, LiveData<T>.c> f4095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f4098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f4099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f4103j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @j0
        public final l f4104e;

        public LifecycleBoundObserver(@j0 l lVar, r<? super T> rVar) {
            super(rVar);
            this.f4104e = lVar;
        }

        @Override // androidx.lifecycle.j
        public void d(@j0 l lVar, @j0 i.b bVar) {
            i.c cVarB = this.f4104e.a().b();
            if (cVarB == i.c.DESTROYED) {
                LiveData.this.o(this.f4108a);
                return;
            }
            i.c cVar = null;
            while (cVar != cVarB) {
                h(k());
                cVar = cVarB;
                cVarB = this.f4104e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            this.f4104e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(l lVar) {
            return this.f4104e == lVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.f4104e.a().b().a(i.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4094a) {
                obj = LiveData.this.f4099f;
                LiveData.this.f4099f = LiveData.f4093l;
            }
            LiveData.this.q(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(r<? super T> rVar) {
            super(rVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r<? super T> f4108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4110c = -1;

        public c(r<? super T> rVar) {
            this.f4108a = rVar;
        }

        public void h(boolean z3) {
            if (z3 == this.f4109b) {
                return;
            }
            this.f4109b = z3;
            LiveData.this.c(z3 ? 1 : -1);
            if (this.f4109b) {
                LiveData.this.e(this);
            }
        }

        public void i() {
        }

        public boolean j(l lVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        this.f4094a = new Object();
        this.f4095b = new n.b<>();
        this.f4096c = 0;
        Object obj = f4093l;
        this.f4099f = obj;
        this.f4103j = new a();
        this.f4098e = obj;
        this.f4100g = -1;
    }

    public static void b(String str) {
        if (m.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @g0
    public void c(int i4) {
        int i5 = this.f4096c;
        this.f4096c = i4 + i5;
        if (this.f4097d) {
            return;
        }
        this.f4097d = true;
        while (true) {
            try {
                int i6 = this.f4096c;
                if (i5 == i6) {
                    return;
                }
                boolean z3 = i5 == 0 && i6 > 0;
                boolean z4 = i5 > 0 && i6 == 0;
                if (z3) {
                    l();
                } else if (z4) {
                    m();
                }
                i5 = i6;
            } finally {
                this.f4097d = false;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.f4109b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i4 = cVar.f4110c;
            int i5 = this.f4100g;
            if (i4 >= i5) {
                return;
            }
            cVar.f4110c = i5;
            cVar.f4108a.a((Object) this.f4098e);
        }
    }

    public void e(@k0 LiveData<T>.c cVar) {
        if (this.f4101h) {
            this.f4102i = true;
            return;
        }
        this.f4101h = true;
        do {
            this.f4102i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                n.b<r<? super T>, LiveData<T>.c>.d dVarD = this.f4095b.d();
                while (dVarD.hasNext()) {
                    d((c) dVarD.next().getValue());
                    if (this.f4102i) {
                        break;
                    }
                }
            }
        } while (this.f4102i);
        this.f4101h = false;
    }

    @k0
    public T f() {
        T t4 = (T) this.f4098e;
        if (t4 != f4093l) {
            return t4;
        }
        return null;
    }

    public int g() {
        return this.f4100g;
    }

    public boolean h() {
        return this.f4096c > 0;
    }

    public boolean i() {
        return this.f4095b.size() > 0;
    }

    @g0
    public void j(@j0 l lVar, @j0 r<? super T> rVar) {
        b("observe");
        if (lVar.a().b() == i.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lVar, rVar);
        LiveData<T>.c cVarG = this.f4095b.g(rVar, lifecycleBoundObserver);
        if (cVarG != null && !cVarG.j(lVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        lVar.a().a(lifecycleBoundObserver);
    }

    @g0
    public void k(@j0 r<? super T> rVar) {
        b("observeForever");
        b bVar = new b(rVar);
        LiveData<T>.c cVarG = this.f4095b.g(rVar, bVar);
        if (cVarG instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        bVar.h(true);
    }

    public void l() {
    }

    public void m() {
    }

    public void n(T t4) {
        boolean z3;
        synchronized (this.f4094a) {
            z3 = this.f4099f == f4093l;
            this.f4099f = t4;
        }
        if (z3) {
            m.a.f().d(this.f4103j);
        }
    }

    @g0
    public void o(@j0 r<? super T> rVar) {
        b("removeObserver");
        LiveData<T>.c cVarH = this.f4095b.h(rVar);
        if (cVarH == null) {
            return;
        }
        cVarH.i();
        cVarH.h(false);
    }

    @g0
    public void p(@j0 l lVar) {
        b("removeObservers");
        for (Map.Entry<r<? super T>, LiveData<T>.c> entry : this.f4095b) {
            if (entry.getValue().j(lVar)) {
                o(entry.getKey());
            }
        }
    }

    @g0
    public void q(T t4) {
        b("setValue");
        this.f4100g++;
        this.f4098e = t4;
        e(null);
    }

    public LiveData(T t4) {
        this.f4094a = new Object();
        this.f4095b = new n.b<>();
        this.f4096c = 0;
        this.f4099f = f4093l;
        this.f4103j = new a();
        this.f4098e = t4;
        this.f4100g = 0;
    }
}
