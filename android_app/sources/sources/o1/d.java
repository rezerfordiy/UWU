package o1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import c.r0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<Params, Progress, Result> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9894g = "AsyncTask";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9895h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9896i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9897j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadFactory f9898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f9899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Executor f9900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9901n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9902o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static f f9903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Executor f9904q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<Params, Result> f9905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask<Result> f9906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f9907d = g.PENDING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9908e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9909f = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f9910a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f9910a.getAndIncrement());
        }
    }

    public class b extends h<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f9909f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f9920a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException e4) {
                Log.w(d.f9894g, e4);
            } catch (CancellationException unused) {
                d.this.r(null);
            } catch (ExecutionException e5) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e5.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: o1.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0090d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9913a;

        static {
            int[] iArr = new int[g.values().length];
            f9913a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9913a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f9914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f9915b;

        public e(d dVar, Data... dataArr) {
            this.f9914a = dVar;
            this.f9915b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i4 = message.what;
            if (i4 == 1) {
                eVar.f9914a.f(eVar.f9915b[0]);
            } else {
                if (i4 != 2) {
                    return;
                }
                eVar.f9914a.p(eVar.f9915b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Params[] f9920a;
    }

    static {
        a aVar = new a();
        f9898k = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f9899l = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f9900m = threadPoolExecutor;
        f9904q = threadPoolExecutor;
    }

    public d() {
        b bVar = new b();
        this.f9905b = bVar;
        this.f9906c = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f9904q.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (d.class) {
            if (f9903p == null) {
                f9903p = new f();
            }
            fVar = f9903p;
        }
        return fVar;
    }

    @r0({r0.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f9904q = executor;
    }

    public final boolean a(boolean z3) {
        this.f9908e.set(true);
        return this.f9906c.cancel(z3);
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(f9904q, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f9907d == g.PENDING) {
            this.f9907d = g.RUNNING;
            o();
            this.f9905b.f9920a = paramsArr;
            executor.execute(this.f9906c);
            return this;
        }
        int i4 = C0090d.f9913a[this.f9907d.ordinal()];
        if (i4 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i4 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f9907d = g.FINISHED;
    }

    public final Result g() throws ExecutionException, InterruptedException {
        return this.f9906c.get();
    }

    public final Result h(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f9906c.get(j4, timeUnit);
    }

    public final g j() {
        return this.f9907d;
    }

    public final boolean k() {
        return this.f9908e.get();
    }

    public void l() {
    }

    public void m(Result result) {
        l();
    }

    public void n(Result result) {
    }

    public void o() {
    }

    public void p(Progress... progressArr) {
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (this.f9909f.get()) {
            return;
        }
        q(result);
    }

    public final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
