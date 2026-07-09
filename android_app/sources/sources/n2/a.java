package n2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f8981e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0085a f8983g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s0 f8985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputStream f8986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OutputStream f8987k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8982f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f8984h = new Object();

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    public class C0085a extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f8988i = 8192;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f8992e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f8989b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f8990c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f8991d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f8993f = new byte[8192];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8994g = 0;

        public C0085a() {
        }

        public void a(int i4) {
            synchronized (a.this.f8982f) {
                if (a.this.f8981e != null) {
                    if (this.f8990c != i4) {
                        this.f8990c = i4;
                        try {
                            a.this.f8981e.setSoTimeout(i4);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f8989b = true;
                }
            }
        }

        public synchronized void b(byte[] bArr, int i4) {
            synchronized (this.f8993f) {
                int length = bArr.length;
                int i5 = this.f8994g;
                if (length + i5 < 8192) {
                    System.arraycopy(bArr, 0, this.f8993f, i5, bArr.length);
                    this.f8994g += bArr.length;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.a.C0085a.run():void");
        }
    }

    public a(s0 s0Var) {
        this.f8985i = s0Var;
        this.f9160a = 0;
        this.f8981e = null;
    }

    @Override // n2.d
    public synchronized void a(String str, int i4, int i5) {
        synchronized (this.f8982f) {
            Socket socket = this.f8981e;
            if (socket != null && socket.isConnected()) {
                try {
                    this.f8981e.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f8981e = null;
            }
        }
        synchronized (this.f8984h) {
            this.f8979c = str;
            this.f8978b = i4;
            this.f8980d = i5;
            C0085a c0085a = new C0085a();
            this.f8983g = c0085a;
            c0085a.setPriority(5);
            this.f8983g.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // n2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.net.Socket r0 = r3.f8981e     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L10
            r0.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L2f
            goto Le
        La:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2f
        Le:
            r3.f8981e = r1     // Catch: java.lang.Throwable -> L2f
        L10:
            java.lang.Object r0 = r3.f8984h     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2f
            n2.a$a r2 = r3.f8983g     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            n2.a$a r2 = r3.f8983g     // Catch: java.lang.Throwable -> L2c
            r2.interrupt()     // Catch: java.lang.Throwable -> L2c
            r3.f8983g = r1     // Catch: java.lang.Throwable -> L2c
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            n2.s0 r0 = r3.f8985i
            r0.a(r3)
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.b():void");
    }

    @Override // n2.d
    public synchronized boolean c() {
        Socket socket = this.f8981e;
        if (socket != null && !socket.isClosed()) {
            if (this.f8981e.isConnected()) {
                return true;
            }
        }
        return false;
    }

    @Override // n2.d
    public void d(int i4) {
        synchronized (this.f8984h) {
            C0085a c0085a = this.f8983g;
            if (c0085a != null) {
                c0085a.a(i4);
            }
        }
    }

    @Override // n2.d
    public void e(byte[] bArr, int i4) {
        synchronized (this.f8984h) {
            C0085a c0085a = this.f8983g;
            if (c0085a != null) {
                c0085a.b(bArr, i4);
            }
        }
    }
}
