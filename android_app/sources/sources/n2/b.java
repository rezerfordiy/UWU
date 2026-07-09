package n2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f9083e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f9087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0086b f9088j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f9091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f9092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OutputStream f9093o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9084f = 65536;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9085g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9086h = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f9089k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f9090l = new Object();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:5:0x0019, B:7:0x003b, B:18:0x0062, B:20:0x0068, B:22:0x006e, B:26:0x008c, B:28:0x00b4, B:25:0x0084, B:10:0x0044, B:11:0x0049, B:13:0x004e, B:15:0x0055, B:17:0x005c), top: B:37:0x0005, inners: #3, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                n2.b r0 = n2.b.this
                java.lang.Object r0 = r0.f9085g
                monitor-enter(r0)
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                java.net.Socket r2 = new java.net.Socket     // Catch: java.lang.Throwable -> Lbf
                r2.<init>()     // Catch: java.lang.Throwable -> Lbf
                r1.f9083e = r2     // Catch: java.lang.Throwable -> Lbf
                java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> Lbf
                n2.b r2 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                java.lang.String r3 = r2.f9081c     // Catch: java.lang.Throwable -> Lbf
                int r2 = r2.f9080b     // Catch: java.lang.Throwable -> Lbf
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lbf
                n2.b r2 = n2.b.this     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                java.net.Socket r3 = r2.f9083e     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r2 = r2.f9084f     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                r3.setReceiveBufferSize(r2)     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                n2.b r2 = n2.b.this     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                java.net.Socket r3 = r2.f9083e     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r2 = r2.f9082d     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                r3.connect(r1, r2)     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                java.net.Socket r1 = r1.f9083e     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r1 = r1.getReceiveBufferSize()     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                n2.b r2 = n2.b.this     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r3 = r2.f9084f     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r4 = r3 * 2
                if (r1 == r4) goto L62
                java.net.Socket r1 = r2.f9083e     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                int r3 = r3 * 2
                r1.setReceiveBufferSize(r3)     // Catch: java.lang.Exception -> L43 java.net.UnknownHostException -> L4d java.net.SocketTimeoutException -> L54 java.net.ConnectException -> L5b java.lang.Throwable -> Lbf
                goto L62
            L43:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
            L49:
                r1.b()     // Catch: java.lang.Throwable -> Lbf
                goto L62
            L4d:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                goto L49
            L54:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                goto L49
            L5b:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                goto L49
            L62:
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                java.net.Socket r1 = r1.f9083e     // Catch: java.lang.Throwable -> Lbf
                if (r1 == 0) goto Lb3
                boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> Lbf
                if (r1 == 0) goto Lb3
                n2.b r1 = n2.b.this     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                java.net.Socket r2 = r1.f9083e     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                r1.f9092n = r2     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                java.net.Socket r2 = r1.f9083e     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                r1.f9093o = r2     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> Lbf
                goto L8c
            L83:
                r1 = move-exception
                n2.b r2 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                r2.b()     // Catch: java.lang.Throwable -> Lbf
                r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbf
            L8c:
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                n2.b$c r2 = new n2.b$c     // Catch: java.lang.Throwable -> Lbf
                n2.b r3 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                r2.<init>()     // Catch: java.lang.Throwable -> Lbf
                r1.f9087i = r2     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                n2.b$c r1 = r1.f9087i     // Catch: java.lang.Throwable -> Lbf
                r1.start()     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                n2.b$b r2 = new n2.b$b     // Catch: java.lang.Throwable -> Lbf
                n2.b r3 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                r4 = 0
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lbf
                r1.f9088j = r2     // Catch: java.lang.Throwable -> Lbf
                n2.b r1 = n2.b.this     // Catch: java.lang.Throwable -> Lbf
                n2.b$b r1 = r1.f9088j     // Catch: java.lang.Throwable -> Lbf
                r1.start()     // Catch: java.lang.Throwable -> Lbf
                r1 = 1
                goto Lb4
            Lb3:
                r1 = 0
            Lb4:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                if (r1 == 0) goto Lbe
                n2.b r0 = n2.b.this
                n2.u0 r1 = r0.f9091m
                r1.b(r0)
            Lbe:
                return
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.b.a.run():void");
        }
    }

    /* JADX INFO: renamed from: n2.b$b, reason: collision with other inner class name */
    public class C0086b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f9095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f9096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f9097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f9098e;

        public C0086b() {
            this.f9095b = false;
            this.f9096c = -1;
            this.f9097d = 0;
        }

        public void a(int i4) {
            synchronized (b.this.f9085g) {
                if (b.this.f9083e != null) {
                    if (this.f9096c != i4) {
                        this.f9096c = i4;
                        try {
                            b.this.f9083e.setSoTimeout(i4);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f9095b = true;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z3;
            boolean z4;
            int i4;
            Socket socket;
            Socket socket2;
            b bVar = b.this;
            this.f9098e = new byte[bVar.f9084f];
            synchronized (bVar.f9085g) {
                z3 = (isInterrupted() || (socket2 = b.this.f9083e) == null || !socket2.isConnected()) ? false : true;
            }
            System.currentTimeMillis();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            long jCurrentTimeMillis = 0;
            boolean z5 = true;
            int i8 = 13;
            while (z3) {
                if (this.f9095b) {
                    try {
                        InputStream inputStream = b.this.f9092n;
                        if (inputStream != null) {
                            int iAvailable = inputStream.available();
                            b bVar2 = b.this;
                            if (bVar2.f9160a != 2 || iAvailable > 0) {
                                iAvailable = bVar2.f9092n.read(this.f9098e);
                            }
                            if (iAvailable > 0) {
                                this.f9095b = false;
                                b bVar3 = b.this;
                                bVar3.f9091m.d(bVar3, this.f9098e, iAvailable);
                                if (b.this.f9160a == 2 && z5) {
                                    Thread.sleep(i8);
                                    i5++;
                                    if (i5 >= 10) {
                                        i6 += iAvailable;
                                        if (i5 % 10 == 0) {
                                            if (jCurrentTimeMillis > 0) {
                                                int iCurrentTimeMillis = (int) (((((long) i6) / (System.currentTimeMillis() - jCurrentTimeMillis)) * 1000) / 1024);
                                                if (iCurrentTimeMillis >= 1200) {
                                                    if (iCurrentTimeMillis < 2100) {
                                                        i8 = 13;
                                                    } else {
                                                        i4 = iCurrentTimeMillis > 2100 ? 8 : 20;
                                                    }
                                                }
                                                i8 = i4;
                                            }
                                            jCurrentTimeMillis = System.currentTimeMillis();
                                            i6 = 0;
                                        }
                                        if (iAvailable > i7) {
                                            i7 = iAvailable;
                                        }
                                        if (i5 > 30 && i7 < 20000) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            this.f9097d = 0;
                        }
                        z4 = true;
                    } catch (SocketTimeoutException e4) {
                        e4.printStackTrace();
                        z4 = true;
                        this.f9095b = true;
                        this.f9097d += this.f9096c;
                        if (this.f9097d >= 4000) {
                            b.this.b();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    z4 = true;
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused) {
                    }
                }
                synchronized (b.this.f9085g) {
                    z3 = (isInterrupted() || (socket = b.this.f9083e) == null || !socket.isConnected()) ? false : z4;
                }
            }
            b.this.b();
        }

        public /* synthetic */ C0086b(b bVar, a aVar) {
            this();
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f9100e = 8192;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f9101b = new byte[8192];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9102c = 0;

        public c() {
        }

        public synchronized void a(byte[] bArr, int i4) {
            synchronized (this.f9101b) {
                int length = bArr.length;
                int i5 = this.f9102c;
                if (length + i5 < 8192) {
                    System.arraycopy(bArr, 0, this.f9101b, i5, bArr.length);
                    this.f9102c += bArr.length;
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
            synchronized (b.this.f9085g) {
                z3 = (isInterrupted() || (socket2 = b.this.f9083e) == null || !socket2.isConnected()) ? false : true;
            }
            byte[] bArr = null;
            while (z3) {
                if (bArr == null) {
                    synchronized (this.f9101b) {
                        if (b.this.f9093o != null && (i4 = this.f9102c) > 0) {
                            bArr = new byte[i4];
                            System.arraycopy(this.f9101b, 0, bArr, 0, i4);
                            this.f9102c = 0;
                        }
                    }
                }
                if (bArr != null) {
                    try {
                        OutputStream outputStream = b.this.f9093o;
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
                synchronized (b.this.f9085g) {
                    z4 = (isInterrupted() || (socket = b.this.f9083e) == null || !socket.isConnected()) ? false : true;
                }
                z3 = z4;
            }
            b.this.b();
        }
    }

    public b(u0 u0Var) {
        this.f9091m = u0Var;
        this.f9160a = 0;
        this.f9083e = null;
    }

    @Override // n2.d
    public void a(String str, int i4, int i5) {
        synchronized (this.f9085g) {
            Socket socket = this.f9083e;
            if (socket == null || !socket.isConnected()) {
                this.f9081c = str;
                this.f9080b = i4;
                this.f9082d = i5;
            } else {
                try {
                    this.f9083e.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f9083e = null;
                this.f9081c = str;
                this.f9080b = i4;
                this.f9082d = i5;
            }
        }
        new Thread(new a()).start();
    }

    @Override // n2.d
    public void b() {
        c cVar;
        C0086b c0086b;
        synchronized (this.f9085g) {
            Socket socket = this.f9083e;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.f9083e = null;
                cVar = this.f9087i;
                if (cVar != null && cVar.isAlive()) {
                    this.f9087i.interrupt();
                    this.f9087i = null;
                }
                c0086b = this.f9088j;
                if (c0086b != null && c0086b.isAlive()) {
                    this.f9088j.interrupt();
                    this.f9088j = null;
                }
            } else {
                cVar = this.f9087i;
                if (cVar != null) {
                    this.f9087i.interrupt();
                    this.f9087i = null;
                }
                c0086b = this.f9088j;
                if (c0086b != null) {
                    this.f9088j.interrupt();
                    this.f9088j = null;
                }
            }
        }
        this.f9091m.a(this);
    }

    @Override // n2.d
    public synchronized boolean c() {
        Socket socket = this.f9083e;
        if (socket != null && !socket.isClosed()) {
            if (this.f9083e.isConnected()) {
                return true;
            }
        }
        return false;
    }

    @Override // n2.d
    public void d(int i4) {
        synchronized (this.f9090l) {
            C0086b c0086b = this.f9088j;
            if (c0086b != null) {
                c0086b.a(i4);
            }
        }
    }

    @Override // n2.d
    public void e(byte[] bArr, int i4) {
        synchronized (this.f9089k) {
            c cVar = this.f9087i;
            if (cVar != null) {
                cVar.a(bArr, i4);
            }
        }
    }
}
