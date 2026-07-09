package p0;

import android.os.CancellationSignal;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10049d;

    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.f10046a) {
                return;
            }
            this.f10046a = true;
            this.f10049d = true;
            a aVar = this.f10047b;
            Object obj = this.f10048c;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f10049d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f10049d = false;
                notifyAll();
            }
        }
    }

    @k0
    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f10048c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f10048c = cancellationSignal;
                if (this.f10046a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f10048c;
        }
        return obj;
    }

    public boolean c() {
        boolean z3;
        synchronized (this) {
            z3 = this.f10046a;
        }
        return z3;
    }

    public void d(@k0 a aVar) {
        synchronized (this) {
            f();
            if (this.f10047b == aVar) {
                return;
            }
            this.f10047b = aVar;
            if (this.f10046a && aVar != null) {
                aVar.a();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new n();
        }
    }

    public final void f() {
        while (this.f10049d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
