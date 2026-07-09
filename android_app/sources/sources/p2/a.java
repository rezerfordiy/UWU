package p2;

import q2.i;
import q2.j;
import q2.m;
import q2.n;

/* JADX INFO: loaded from: classes.dex */
public class a extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f10084c;

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    public class C0097a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f10085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f10086c;

        public C0097a(i iVar, m mVar) {
            this.f10085b = iVar;
            this.f10086c = mVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f10085b.c(this.f10086c);
            } finally {
                a.this.t();
            }
        }
    }

    public a() {
    }

    @Override // q2.n, q2.i
    public void c(m mVar) {
        this.f10084c = 0;
        super.c(mVar);
        u();
    }

    @Override // q2.n
    public void m(i iVar, m mVar) {
        new C0097a(iVar, mVar).start();
    }

    public synchronized void t() {
        this.f10084c++;
        notifyAll();
    }

    public synchronized void u() {
        while (this.f10084c < q()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public a(Class<? extends j> cls) {
        super(cls);
    }

    public a(Class<? extends j> cls, String str) {
        super(cls, str);
    }

    public a(String str) {
        super(str);
    }
}
