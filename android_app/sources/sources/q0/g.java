package q0;

import android.os.Handler;
import android.os.Process;
import c.b0;
import c.j0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u0.i;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10280b;

        /* JADX INFO: renamed from: q0.g$a$a, reason: collision with other inner class name */
        public static class C0102a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f10281b;

            public C0102a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f10281b = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f10281b);
                super.run();
            }
        }

        public a(@j0 String str, int i4) {
            this.f10279a = str;
            this.f10280b = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0102a(runnable, this.f10279a, this.f10280b);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f10282a;

        public b(@j0 Handler handler) {
            this.f10282a = (Handler) i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@j0 Runnable runnable) {
            if (this.f10282a.post((Runnable) i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f10282a + " is shutting down");
        }
    }

    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j0
        public Callable<T> f10283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @j0
        public u0.b<T> f10284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @j0
        public Handler f10285d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0.b f10286b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f10287c;

            public a(u0.b bVar, Object obj) {
                this.f10286b = bVar;
                this.f10287c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f10286b.a(this.f10287c);
            }
        }

        public c(@j0 Handler handler, @j0 Callable<T> callable, @j0 u0.b<T> bVar) {
            this.f10283b = callable;
            this.f10284c = bVar;
            this.f10285d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f10283b.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f10285d.post(new a(this.f10284c, tCall));
        }
    }

    public static ThreadPoolExecutor a(@j0 String str, int i4, @b0(from = 0) int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@j0 Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@j0 Executor executor, @j0 Callable<T> callable, @j0 u0.b<T> bVar) {
        executor.execute(new c(q0.b.a(), callable, bVar));
    }

    public static <T> T d(@j0 ExecutorService executorService, @j0 Callable<T> callable, @b0(from = 0) int i4) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
