package m3;

import t3.i;

/* JADX INFO: loaded from: classes.dex */
public class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8936b;

    public static class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f8937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8938c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f8939d = null;

        public a(i iVar) {
            this.f8937b = iVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f8937b.a();
                this.f8938c = true;
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.f8939d = th;
            }
        }
    }

    public c(i iVar, long j4) {
        this.f8935a = iVar;
        this.f8936b = j4;
    }

    @Override // t3.i
    public void a() throws Exception {
        a aVarB = b();
        if (aVarB.f8938c) {
            return;
        }
        c(aVarB);
    }

    public final a b() throws InterruptedException {
        a aVar = new a(this.f8935a);
        aVar.start();
        aVar.join(this.f8936b);
        aVar.interrupt();
        return aVar;
    }

    public final void c(a aVar) throws Exception {
        if (aVar.f8939d != null) {
            throw aVar.f8939d;
        }
        d(aVar);
    }

    public final void d(a aVar) throws Exception {
        Exception exc = new Exception(String.format("test timed out after %d milliseconds", Long.valueOf(this.f8936b)));
        exc.setStackTrace(aVar.getStackTrace());
        throw exc;
    }
}
