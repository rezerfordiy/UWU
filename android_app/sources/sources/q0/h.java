package q0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import c.r0;
import c.w;
import c.z0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10289i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10290j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @w("mLock")
    public HandlerThread f10292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @w("mLock")
    public Handler f10293c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10298h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10291a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler.Callback f10295e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @w("mLock")
    public int f10294d = 0;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                h.this.c();
                return true;
            }
            if (i4 != 1) {
                return true;
            }
            h.this.d((Runnable) message.obj);
            return true;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f10300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Handler f10301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f10302d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f10304b;

            public a(Object obj) {
                this.f10304b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f10302d.a(this.f10304b);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.f10300b = callable;
            this.f10301c = handler;
            this.f10302d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f10300b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f10301c.post(new a(objCall));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f10306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callable f10307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f10308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Condition f10310f;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f10306b = atomicReference;
            this.f10307c = callable;
            this.f10308d = reentrantLock;
            this.f10309e = atomicBoolean;
            this.f10310f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10306b.set(this.f10307c.call());
            } catch (Exception unused) {
            }
            this.f10308d.lock();
            try {
                this.f10309e.set(false);
                this.f10310f.signal();
            } finally {
                this.f10308d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t4);
    }

    public h(String str, int i4, int i5) {
        this.f10298h = str;
        this.f10297g = i4;
        this.f10296f = i5;
    }

    @z0
    public int a() {
        int i4;
        synchronized (this.f10291a) {
            i4 = this.f10294d;
        }
        return i4;
    }

    @z0
    public boolean b() {
        boolean z3;
        synchronized (this.f10291a) {
            z3 = this.f10292b != null;
        }
        return z3;
    }

    public void c() {
        synchronized (this.f10291a) {
            if (this.f10293c.hasMessages(1)) {
                return;
            }
            this.f10292b.quit();
            this.f10292b = null;
            this.f10293c = null;
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f10291a) {
            this.f10293c.removeMessages(0);
            Handler handler = this.f10293c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f10296f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.f10291a) {
            if (this.f10292b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f10298h, this.f10297g);
                this.f10292b = handlerThread;
                handlerThread.start();
                this.f10293c = new Handler(this.f10292b.getLooper(), this.f10295e);
                this.f10294d++;
            }
            this.f10293c.removeMessages(0);
            Handler handler = this.f10293c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, q0.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i4) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i4);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
