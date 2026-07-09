package z1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12862d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0131a f12865g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f12867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputStream f12868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OutputStream f12869k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12864f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12866h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12859a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f12863e = null;

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name */
    public class C0131a extends Thread {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f12870l = 8192;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f12874e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12879j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f12871b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f12872c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12873d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f12875f = new byte[8192];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12876g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f12877h = 20;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f12878i = 0;

        public C0131a() {
        }

        public void a(int i4) {
            synchronized (a.this.f12864f) {
                if (a.this.f12863e != null) {
                    if (this.f12872c != i4) {
                        this.f12872c = i4;
                        try {
                            a.this.f12863e.setSoTimeout(i4);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f12871b = true;
                }
            }
        }

        public synchronized void b(byte[] bArr, int i4) {
            synchronized (this.f12875f) {
                int length = bArr.length;
                int i5 = this.f12876g;
                if (length + i5 < 8192) {
                    System.arraycopy(bArr, 0, this.f12875f, i5, bArr.length);
                    this.f12876g += bArr.length;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.a.C0131a.run():void");
        }
    }

    public a(g gVar) {
        this.f12867i = gVar;
    }

    public synchronized void a(String str, int i4, int i5) {
        synchronized (this.f12864f) {
            Socket socket = this.f12863e;
            if (socket != null && socket.isConnected()) {
                try {
                    this.f12863e.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f12863e = null;
            }
        }
        synchronized (this.f12866h) {
            this.f12861c = str;
            this.f12860b = i4;
            this.f12862d = i5;
            C0131a c0131a = new C0131a();
            this.f12865g = c0131a;
            c0131a.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.net.Socket r0 = r3.f12863e     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L10
            r0.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L2f
            goto Le
        La:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2f
        Le:
            r3.f12863e = r1     // Catch: java.lang.Throwable -> L2f
        L10:
            java.lang.Object r0 = r3.f12866h     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2f
            z1.a$a r2 = r3.f12865g     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            z1.a$a r2 = r3.f12865g     // Catch: java.lang.Throwable -> L2c
            r2.interrupt()     // Catch: java.lang.Throwable -> L2c
            r3.f12865g = r1     // Catch: java.lang.Throwable -> L2c
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            z1.g r0 = r3.f12867i
            r0.b()
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
        throw new UnsupportedOperationException("Method not decompiled: z1.a.b():void");
    }

    public synchronized boolean c() {
        Socket socket = this.f12863e;
        if (socket != null && !socket.isClosed()) {
            if (this.f12863e.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void d(int i4) {
        synchronized (this.f12866h) {
            C0131a c0131a = this.f12865g;
            if (c0131a != null) {
                c0131a.a(i4);
            }
        }
    }

    public void e(byte[] bArr, int i4) {
        synchronized (this.f12866h) {
            C0131a c0131a = this.f12865g;
            if (c0131a != null) {
                c0131a.b(bArr, i4);
            }
        }
    }
}
