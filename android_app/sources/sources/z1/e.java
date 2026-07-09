package z1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13017d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f13022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f13023j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f13026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f13027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OutputStream f13028o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13019f = 65536;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13020g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13021h = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f13024k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f13025l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13014a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f13018e = null;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                z1.e r0 = z1.e.this
                java.lang.Object r0 = r0.f13020g
                monitor-enter(r0)
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                java.net.Socket r2 = new java.net.Socket     // Catch: java.lang.Throwable -> La9
                r2.<init>()     // Catch: java.lang.Throwable -> La9
                r1.f13018e = r2     // Catch: java.lang.Throwable -> La9
                java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> La9
                z1.e r2 = z1.e.this     // Catch: java.lang.Throwable -> La9
                java.lang.String r3 = r2.f13016c     // Catch: java.lang.Throwable -> La9
                int r2 = r2.f13015b     // Catch: java.lang.Throwable -> La9
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> La9
                z1.e r2 = z1.e.this     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                java.net.Socket r3 = r2.f13018e     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r2 = r2.f13019f     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                r3.setReceiveBufferSize(r2)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                z1.e r2 = z1.e.this     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                java.net.Socket r3 = r2.f13018e     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r2 = r2.f13017d     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                r3.connect(r1, r2)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                z1.e r1 = z1.e.this     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                java.net.Socket r1 = r1.f13018e     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r1 = r1.getReceiveBufferSize()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                z1.e r2 = z1.e.this     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r3 = r2.f13019f     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r4 = r3 * 2
                if (r1 == r4) goto L4c
                java.net.Socket r1 = r2.f13018e     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                int r3 = r3 * 2
                r1.setReceiveBufferSize(r3)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> La9
                goto L4c
            L43:
                r1 = move-exception
                z1.e r2 = z1.e.this     // Catch: java.lang.Throwable -> La9
                r2.b()     // Catch: java.lang.Throwable -> La9
                r1.printStackTrace()     // Catch: java.lang.Throwable -> La9
            L4c:
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                java.net.Socket r1 = r1.f13018e     // Catch: java.lang.Throwable -> La9
                if (r1 == 0) goto L9d
                boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> La9
                if (r1 == 0) goto L9d
                z1.e r1 = z1.e.this     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                java.net.Socket r2 = r1.f13018e     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                r1.f13027n = r2     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                z1.e r1 = z1.e.this     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                java.net.Socket r2 = r1.f13018e     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                r1.f13028o = r2     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> La9
                goto L76
            L6d:
                r1 = move-exception
                z1.e r2 = z1.e.this     // Catch: java.lang.Throwable -> La9
                r2.b()     // Catch: java.lang.Throwable -> La9
                r1.printStackTrace()     // Catch: java.lang.Throwable -> La9
            L76:
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                z1.e$c r2 = new z1.e$c     // Catch: java.lang.Throwable -> La9
                z1.e r3 = z1.e.this     // Catch: java.lang.Throwable -> La9
                r2.<init>()     // Catch: java.lang.Throwable -> La9
                r1.f13022i = r2     // Catch: java.lang.Throwable -> La9
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                z1.e$c r1 = r1.f13022i     // Catch: java.lang.Throwable -> La9
                r1.start()     // Catch: java.lang.Throwable -> La9
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                z1.e$b r2 = new z1.e$b     // Catch: java.lang.Throwable -> La9
                z1.e r3 = z1.e.this     // Catch: java.lang.Throwable -> La9
                r4 = 0
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> La9
                r1.f13023j = r2     // Catch: java.lang.Throwable -> La9
                z1.e r1 = z1.e.this     // Catch: java.lang.Throwable -> La9
                z1.e$b r1 = r1.f13023j     // Catch: java.lang.Throwable -> La9
                r1.start()     // Catch: java.lang.Throwable -> La9
                r1 = 1
                goto L9e
            L9d:
                r1 = 0
            L9e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
                if (r1 == 0) goto La8
                z1.e r0 = z1.e.this
                z1.g r0 = r0.f13026m
                r0.a()
            La8:
                return
            La9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.e.a.run():void");
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f13030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f13031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f13032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f13033e;

        public b() {
            this.f13030b = false;
            this.f13031c = -1;
            this.f13032d = 0;
        }

        public void a(int i4) {
            synchronized (e.this.f13020g) {
                if (e.this.f13018e != null) {
                    if (this.f13031c != i4) {
                        this.f13031c = i4;
                        try {
                            e.this.f13018e.setSoTimeout(i4);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f13030b = true;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0116 A[EDGE_INSN: B:111:0x0116->B:90:0x0116 BREAK  A[LOOP:0: B:14:0x002f->B:86:0x0111], SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.e.b.run():void");
        }

        public /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f13035e = 8192;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f13036b = new byte[8192];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13037c = 0;

        public c() {
        }

        public synchronized void a(byte[] bArr, int i4) {
            synchronized (this.f13036b) {
                int length = bArr.length;
                int i5 = this.f13037c;
                if (length + i5 < 8192) {
                    System.arraycopy(bArr, 0, this.f13036b, i5, bArr.length);
                    this.f13037c += bArr.length;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z3;
            boolean z4;
            Socket socket;
            int i4;
            Socket socket2;
            synchronized (e.this.f13020g) {
                z3 = (isInterrupted() || (socket2 = e.this.f13018e) == null || !socket2.isConnected()) ? false : true;
            }
            byte[] bArr = null;
            while (z3) {
                if (bArr == null) {
                    synchronized (this.f13036b) {
                        if (e.this.f13028o != null && (i4 = this.f13037c) > 0) {
                            bArr = new byte[i4];
                            System.arraycopy(this.f13036b, 0, bArr, 0, i4);
                            this.f13037c = 0;
                        }
                    }
                }
                if (bArr != null) {
                    try {
                        OutputStream outputStream = e.this.f13028o;
                        if (outputStream != null) {
                            outputStream.write(bArr);
                            bArr = null;
                        }
                    } catch (SocketTimeoutException | Exception e4) {
                        e4.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(25L);
                } catch (Exception unused) {
                }
                synchronized (e.this.f13020g) {
                    z4 = (isInterrupted() || (socket = e.this.f13018e) == null || !socket.isConnected()) ? false : true;
                }
                z3 = z4;
            }
            e.this.b();
        }
    }

    public e(g gVar) {
        this.f13026m = gVar;
    }

    public void a(String str, int i4, int i5) {
        synchronized (this.f13020g) {
            Socket socket = this.f13018e;
            if (socket == null || !socket.isConnected()) {
                this.f13016c = str;
                this.f13015b = i4;
                this.f13017d = i5;
            } else {
                try {
                    this.f13018e.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f13018e = null;
                this.f13016c = str;
                this.f13015b = i4;
                this.f13017d = i5;
            }
        }
        new Thread(new a()).start();
    }

    public void b() {
        c cVar;
        b bVar;
        synchronized (this.f13020g) {
            Socket socket = this.f13018e;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f13018e = null;
                cVar = this.f13022i;
                if (cVar != null && cVar.isAlive()) {
                    this.f13022i.interrupt();
                    this.f13022i = null;
                }
                bVar = this.f13023j;
                if (bVar != null && bVar.isAlive()) {
                    this.f13023j.interrupt();
                    this.f13023j = null;
                }
            } else {
                cVar = this.f13022i;
                if (cVar != null) {
                    this.f13022i.interrupt();
                    this.f13022i = null;
                }
                bVar = this.f13023j;
                if (bVar != null) {
                    this.f13023j.interrupt();
                    this.f13023j = null;
                }
            }
        }
        this.f13026m.b();
    }

    public synchronized boolean c() {
        Socket socket = this.f13018e;
        if (socket != null && !socket.isClosed()) {
            if (this.f13018e.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void d(int i4) {
        synchronized (this.f13025l) {
            b bVar = this.f13023j;
            if (bVar != null) {
                bVar.a(i4);
            }
        }
    }

    public void e(byte[] bArr, int i4) {
        synchronized (this.f13024k) {
            c cVar = this.f13022i;
            if (cVar != null) {
                cVar.a(bArr, i4);
            }
        }
    }
}
