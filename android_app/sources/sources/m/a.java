package m;

import c.j0;
import c.k0;
import c.r0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @j0
    public static final Executor f8518d = new ExecutorC0077a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @j0
    public static final Executor f8519e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    public d f8520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j0
    public d f8521b;

    /* JADX INFO: renamed from: m.a$a, reason: collision with other inner class name */
    public static class ExecutorC0077a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    public a() {
        c cVar = new c();
        this.f8521b = cVar;
        this.f8520a = cVar;
    }

    @j0
    public static Executor e() {
        return f8519e;
    }

    @j0
    public static a f() {
        if (f8517c != null) {
            return f8517c;
        }
        synchronized (a.class) {
            if (f8517c == null) {
                f8517c = new a();
            }
        }
        return f8517c;
    }

    @j0
    public static Executor g() {
        return f8518d;
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f8520a.a(runnable);
    }

    @Override // m.d
    public boolean c() {
        return this.f8520a.c();
    }

    @Override // m.d
    public void d(Runnable runnable) {
        this.f8520a.d(runnable);
    }

    public void h(@k0 d dVar) {
        if (dVar == null) {
            dVar = this.f8521b;
        }
        this.f8520a = dVar;
    }
}
