package j3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3.c f8316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c f8317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f8318d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f8319b;

        /* JADX INFO: renamed from: j3.g$a$a, reason: collision with other inner class name */
        public class CallableC0067a implements Callable<Object> {
            public CallableC0067a() {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                g.this.g();
                return null;
            }
        }

        public a(long j4) {
            this.f8319b = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC0067a());
            executorServiceNewSingleThreadExecutor.shutdown();
            try {
                long j4 = this.f8319b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!executorServiceNewSingleThreadExecutor.awaitTermination(j4, timeUnit)) {
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                }
                futureSubmit.get(0L, timeUnit);
            } catch (TimeoutException unused) {
                g.this.a(new Exception(String.format("test timed out after %d milliseconds", Long.valueOf(this.f8319b))));
            } catch (Exception e4) {
                g.this.a(e4);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.g();
        }
    }

    public g(Object obj, k kVar, r3.c cVar, p3.c cVar2) {
        this.f8315a = obj;
        this.f8316b = cVar;
        this.f8317c = cVar2;
        this.f8318d = kVar;
    }

    public void a(Throwable th) {
        this.f8316b.e(new r3.a(this.f8317c, th));
    }

    public void b() {
        if (this.f8318d.g()) {
            this.f8316b.g(this.f8317c);
            return;
        }
        this.f8316b.j(this.f8317c);
        try {
            long jE = this.f8318d.e();
            if (jE > 0) {
                h(jE);
            } else {
                f();
            }
        } finally {
            this.f8316b.f(this.f8317c);
        }
    }

    public final void c() {
        Iterator<Method> it = this.f8318d.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(this.f8315a, new Object[0]);
            } catch (InvocationTargetException e4) {
                th = e4.getTargetException();
                a(th);
            } catch (Throwable th) {
                th = th;
                a(th);
            }
        }
    }

    public final void d() throws c {
        try {
            try {
                Iterator<Method> it = this.f8318d.c().iterator();
                while (it.hasNext()) {
                    it.next().invoke(this.f8315a, new Object[0]);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            }
        } catch (f3.b unused) {
            throw new c();
        } catch (Throwable th) {
            a(th);
            throw new c();
        }
    }

    public void e(Runnable runnable) {
        try {
            try {
                d();
                runnable.run();
            } catch (c unused) {
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } finally {
            c();
        }
    }

    public void f() {
        e(new b());
    }

    public void g() {
        try {
            this.f8318d.f(this.f8315a);
            if (this.f8318d.a()) {
                a(new AssertionError("Expected exception: " + this.f8318d.d().getName()));
            }
        } catch (InvocationTargetException e4) {
            th = e4.getTargetException();
            if (th instanceof f3.b) {
                return;
            }
            if (this.f8318d.a()) {
                if (this.f8318d.h(th)) {
                    a(new Exception("Unexpected exception, expected<" + this.f8318d.d().getName() + "> but was<" + th.getClass().getName() + ">", th));
                    return;
                }
                return;
            }
            a(th);
        } catch (Throwable th) {
            th = th;
            a(th);
        }
    }

    public final void h(long j4) {
        e(new a(j4));
    }
}
