package androidx.lifecycle;

import c.a1;
import c.g0;
import c.j0;
import c.r0;
import c.z0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP})
public abstract class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LiveData<T> f4138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f4139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @z0
    public final Runnable f4141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @z0
    public final Runnable f4142f;

    public class a extends LiveData<T> {
        public a() {
        }

        @Override // androidx.lifecycle.LiveData
        public void l() {
            d dVar = d.this;
            dVar.f4137a.execute(dVar.f4141e);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        @a1
        public void run() {
            do {
                boolean z3 = false;
                if (d.this.f4140d.compareAndSet(false, true)) {
                    Object objA = null;
                    boolean z4 = false;
                    while (d.this.f4139c.compareAndSet(true, false)) {
                        try {
                            objA = d.this.a();
                            z4 = true;
                        } catch (Throwable th) {
                            d.this.f4140d.set(false);
                            throw th;
                        }
                    }
                    if (z4) {
                        d.this.f4138b.n((T) objA);
                    }
                    d.this.f4140d.set(false);
                    z3 = z4;
                }
                if (!z3) {
                    return;
                }
            } while (d.this.f4139c.get());
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        @g0
        public void run() {
            boolean zH = d.this.f4138b.h();
            if (d.this.f4139c.compareAndSet(false, true) && zH) {
                d dVar = d.this;
                dVar.f4137a.execute(dVar.f4141e);
            }
        }
    }

    public d() {
        this(m.a.e());
    }

    @a1
    public abstract T a();

    @j0
    public LiveData<T> b() {
        return this.f4138b;
    }

    public void c() {
        m.a.f().b(this.f4142f);
    }

    public d(@j0 Executor executor) {
        this.f4139c = new AtomicBoolean(true);
        this.f4140d = new AtomicBoolean(false);
        this.f4141e = new b();
        this.f4142f = new c();
        this.f4137a = executor;
        this.f4138b = new a();
    }
}
