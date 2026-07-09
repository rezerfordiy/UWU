package z1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13108d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f13111g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f13113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputStream f13114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OutputStream f13115k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13110f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13112h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13105a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f13109e = null;

    public class a extends Thread {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f13116k = 8192;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f13120e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f13117b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f13118c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f13119d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f13121f = new byte[8192];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13122g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13123h = 20;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13124i = 0;

        public a() {
        }

        public void a(int i4) {
            synchronized (f.this.f13110f) {
                if (f.this.f13109e != null) {
                    if (this.f13118c != i4) {
                        this.f13118c = i4;
                        try {
                            f.this.f13109e.setSoTimeout(i4);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f13117b = true;
                }
            }
        }

        public synchronized void b(byte[] bArr, int i4) {
            synchronized (this.f13121f) {
                int length = bArr.length;
                int i5 = this.f13122g;
                if (length + i5 < 8192) {
                    System.arraycopy(bArr, 0, this.f13121f, i5, bArr.length);
                    this.f13122g += bArr.length;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:152:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x01cc A[EDGE_INSN: B:175:0x01cc->B:141:0x01cc BREAK  A[LOOP:0: B:36:0x00a8->B:135:0x01c2], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 473
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.f.a.run():void");
        }
    }

    public f(g gVar) {
        this.f13113i = gVar;
    }

    public synchronized void a(String str, int i4, int i5) {
        synchronized (this.f13110f) {
            Socket socket = this.f13109e;
            if (socket != null && socket.isConnected()) {
                try {
                    this.f13109e.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f13109e = null;
            }
        }
        synchronized (this.f13112h) {
            this.f13107c = str;
            this.f13106b = i4;
            this.f13108d = i5;
            a aVar = new a();
            this.f13111g = aVar;
            aVar.start();
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
            java.net.Socket r0 = r3.f13109e     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L10
            r0.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L2f
            goto Le
        La:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2f
        Le:
            r3.f13109e = r1     // Catch: java.lang.Throwable -> L2f
        L10:
            java.lang.Object r0 = r3.f13112h     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2f
            z1.f$a r2 = r3.f13111g     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L24
            z1.f$a r2 = r3.f13111g     // Catch: java.lang.Throwable -> L2c
            r2.interrupt()     // Catch: java.lang.Throwable -> L2c
            r3.f13111g = r1     // Catch: java.lang.Throwable -> L2c
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            z1.g r0 = r3.f13113i
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
        throw new UnsupportedOperationException("Method not decompiled: z1.f.b():void");
    }

    public synchronized boolean c() {
        Socket socket = this.f13109e;
        if (socket != null && !socket.isClosed()) {
            if (this.f13109e.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void d(int i4) {
        synchronized (this.f13112h) {
            a aVar = this.f13111g;
            if (aVar != null) {
                aVar.a(i4);
            }
        }
    }

    public void e(byte[] bArr, int i4) {
        synchronized (this.f13112h) {
            a aVar = this.f13111g;
            if (aVar != null) {
                aVar.b(bArr, i4);
            }
        }
    }
}
