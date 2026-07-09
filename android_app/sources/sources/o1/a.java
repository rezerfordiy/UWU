package o1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import c.j0;
import c.k0;
import c.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p0.n;
import u0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f9865p = "AsyncTaskLoader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f9866q = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f9867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0088a f9868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile a<D>.RunnableC0088a f9869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f9872o;

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    public final class RunnableC0088a extends d<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final CountDownLatch f9873r = new CountDownLatch(1);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9874s;

        public RunnableC0088a() {
        }

        @Override // o1.d
        public void m(D d4) {
            try {
                a.this.E(this, d4);
            } finally {
                this.f9873r.countDown();
            }
        }

        @Override // o1.d
        public void n(D d4) {
            try {
                a.this.F(this, d4);
            } finally {
                this.f9873r.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9874s = false;
            a.this.G();
        }

        @Override // o1.d
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (n e4) {
                if (k()) {
                    return null;
                }
                throw e4;
            }
        }

        public void v() {
            try {
                this.f9873r.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@j0 Context context) {
        this(context, d.f9900m);
    }

    public void D() {
    }

    public void E(a<D>.RunnableC0088a runnableC0088a, D d4) {
        J(d4);
        if (this.f9869l == runnableC0088a) {
            x();
            this.f9871n = SystemClock.uptimeMillis();
            this.f9869l = null;
            e();
            G();
        }
    }

    public void F(a<D>.RunnableC0088a runnableC0088a, D d4) {
        if (this.f9868k != runnableC0088a) {
            E(runnableC0088a, d4);
            return;
        }
        if (k()) {
            J(d4);
            return;
        }
        c();
        this.f9871n = SystemClock.uptimeMillis();
        this.f9868k = null;
        f(d4);
    }

    public void G() {
        if (this.f9869l != null || this.f9868k == null) {
            return;
        }
        if (this.f9868k.f9874s) {
            this.f9868k.f9874s = false;
            this.f9872o.removeCallbacks(this.f9868k);
        }
        if (this.f9870m <= 0 || SystemClock.uptimeMillis() >= this.f9871n + this.f9870m) {
            this.f9868k.e(this.f9867j, null);
        } else {
            this.f9868k.f9874s = true;
            this.f9872o.postAtTime(this.f9868k, this.f9871n + this.f9870m);
        }
    }

    public boolean H() {
        return this.f9869l != null;
    }

    @k0
    public abstract D I();

    public void J(@k0 D d4) {
    }

    @k0
    public D K() {
        return I();
    }

    public void L(long j4) {
        this.f9870m = j4;
        if (j4 != 0) {
            this.f9872o = new Handler();
        }
    }

    @r0({r0.a.LIBRARY_GROUP})
    public void M() {
        a<D>.RunnableC0088a runnableC0088a = this.f9868k;
        if (runnableC0088a != null) {
            runnableC0088a.v();
        }
    }

    @Override // o1.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f9868k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f9868k);
            printWriter.print(" waiting=");
            printWriter.println(this.f9868k.f9874s);
        }
        if (this.f9869l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f9869l);
            printWriter.print(" waiting=");
            printWriter.println(this.f9869l.f9874s);
        }
        if (this.f9870m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            l.c(this.f9870m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            l.b(this.f9871n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // o1.c
    public boolean o() {
        if (this.f9868k == null) {
            return false;
        }
        if (!this.f9888e) {
            this.f9891h = true;
        }
        if (this.f9869l != null) {
            if (this.f9868k.f9874s) {
                this.f9868k.f9874s = false;
                this.f9872o.removeCallbacks(this.f9868k);
            }
            this.f9868k = null;
            return false;
        }
        if (this.f9868k.f9874s) {
            this.f9868k.f9874s = false;
            this.f9872o.removeCallbacks(this.f9868k);
            this.f9868k = null;
            return false;
        }
        boolean zA = this.f9868k.a(false);
        if (zA) {
            this.f9869l = this.f9868k;
            D();
        }
        this.f9868k = null;
        return zA;
    }

    @Override // o1.c
    public void q() {
        super.q();
        b();
        this.f9868k = new RunnableC0088a();
        G();
    }

    public a(@j0 Context context, @j0 Executor executor) {
        super(context);
        this.f9871n = -10000L;
        this.f9867j = executor;
    }
}
