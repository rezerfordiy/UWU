package z1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class w5 extends u5 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1.a f14101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z1.a f14102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u5.b f14103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u5.c f14104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f14107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f14110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f14111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14112q;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w5.this.q();
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f14114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<byte[]> f14116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14118f;

        public b() {
            this.f14114b = new ArrayList<>();
            this.f14115c = 0;
            this.f14116d = new ArrayList<>();
            this.f14117e = 183750;
            this.f14118f = false;
        }

        public void a(byte[] bArr) {
            int i4;
            boolean z3;
            synchronized (this.f14114b) {
                this.f14114b.add(bArr);
                int length = this.f14115c + bArr.length;
                this.f14115c = length;
                int i5 = this.f14117e;
                i4 = 10;
                if (length > i5) {
                    i4 = 10 + (((length - i5) / (i5 / 2)) * 10);
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                try {
                    Thread.sleep(i4);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }

        public void b(byte[] bArr) {
            synchronized (this.f14116d) {
                this.f14116d.add(bArr);
            }
        }

        public void c() {
            this.f14114b.clear();
            this.f14116d.clear();
            this.f14118f = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0093 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0005 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                super.run()
                r0 = 0
                r1 = r0
            L5:
                boolean r2 = r7.f14118f
                if (r2 != 0) goto La5
                java.util.ArrayList<byte[]> r2 = r7.f14114b
                monitor-enter(r2)
                java.util.ArrayList<byte[]> r3 = r7.f14114b     // Catch: java.lang.Throwable -> La2
                int r3 = r3.size()     // Catch: java.lang.Throwable -> La2
                r4 = 0
                if (r3 <= 0) goto L29
                java.util.ArrayList<byte[]> r3 = r7.f14114b     // Catch: java.lang.Throwable -> La2
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> La2
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> La2
                java.util.ArrayList<byte[]> r5 = r7.f14114b     // Catch: java.lang.Throwable -> La2
                r5.remove(r0)     // Catch: java.lang.Throwable -> La2
                int r5 = r7.f14115c     // Catch: java.lang.Throwable -> La2
                int r6 = r3.length     // Catch: java.lang.Throwable -> La2
                int r5 = r5 - r6
                r7.f14115c = r5     // Catch: java.lang.Throwable -> La2
                goto L2a
            L29:
                r3 = r4
            L2a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La2
                r2 = 1
                if (r3 == 0) goto L4b
                z1.w5 r5 = z1.w5.this
                z1.u5$c r5 = z1.w5.p(r5)
                if (r5 == 0) goto L49
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r6 = "socket_data"
                r5.put(r6, r3)
                z1.w5 r3 = z1.w5.this
                z1.u5$c r3 = z1.w5.p(r3)
                r3.a(r5)
            L49:
                r3 = r0
                goto L4c
            L4b:
                r3 = r2
            L4c:
                java.util.ArrayList<byte[]> r5 = r7.f14116d
                monitor-enter(r5)
                java.util.ArrayList<byte[]> r6 = r7.f14116d     // Catch: java.lang.Throwable -> L9f
                int r6 = r6.size()     // Catch: java.lang.Throwable -> L9f
                if (r6 <= 0) goto L64
                java.util.ArrayList<byte[]> r4 = r7.f14116d     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9f
                byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L9f
                java.util.ArrayList<byte[]> r6 = r7.f14116d     // Catch: java.lang.Throwable -> L9f
                r6.remove(r0)     // Catch: java.lang.Throwable -> L9f
            L64:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L9f
                if (r4 == 0) goto L83
                z1.w5 r3 = z1.w5.this
                z1.u5$c r3 = z1.w5.p(r3)
                if (r3 == 0) goto L82
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r5 = "socket_state"
                r3.put(r5, r4)
                z1.w5 r4 = z1.w5.this
                z1.u5$c r4 = z1.w5.p(r4)
                r4.a(r3)
            L82:
                r3 = r0
            L83:
                r4 = 10
                if (r3 == 0) goto L89
                r1 = r0
                goto L90
            L89:
                int r1 = r1 + r2
                if (r1 < r4) goto L8f
                r1 = r0
                r4 = r2
                goto L91
            L8f:
                r4 = r2
            L90:
                r2 = r3
            L91:
                if (r2 == 0) goto L5
                long r2 = (long) r4
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L99
                goto L5
            L99:
                r2 = move-exception
                r2.printStackTrace()
                goto L5
            L9f:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L9f
                throw r0
            La2:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La2
                throw r0
            La5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.w5.b.run():void");
        }

        public /* synthetic */ b(w5 w5Var, a aVar) {
            this();
        }
    }

    public w5() {
        this.f14097b = "192.168.1.1";
        this.f14098c = 5002;
        this.f14099d = 5003;
        this.f14110o = new byte[4];
        this.f14111p = null;
        this.f14112q = new Object();
        this.f14100e = "192.168.1.1";
        this.f14105j = false;
        this.f14106k = false;
    }

    @Override // z1.g
    public void a() {
        if (this.f14101f.c() && this.f14102g.c()) {
            if (this.f14105j) {
                this.f14105j = false;
            }
            if (!this.f14106k) {
                this.f14106k = true;
                u5.b bVar = this.f14103h;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
        z1.a aVar = this.f14101f;
        if (aVar != null) {
            aVar.d(0);
        }
        z1.a aVar2 = this.f14102g;
        if (aVar2 != null) {
            aVar2.d(5000);
        }
        if (this.f14106k) {
            synchronized (this.f14112q) {
                if (this.f14111p == null) {
                    b bVar2 = new b(this, null);
                    this.f14111p = bVar2;
                    bVar2.start();
                }
            }
        }
    }

    @Override // z1.g
    public void b() {
        if (this.f14105j) {
            this.f14105j = false;
            this.f14106k = false;
        }
        if (this.f14106k) {
            o();
            this.f14106k = false;
            this.f14105j = false;
            u5.b bVar = this.f14103h;
            if (bVar != null) {
                bVar.d();
            }
        }
        if (this.f14106k) {
            return;
        }
        synchronized (this.f14112q) {
            b bVar2 = this.f14111p;
            if (bVar2 != null) {
                bVar2.c();
                this.f14111p = null;
            }
        }
    }

    @Override // z1.g
    public void e(long j4) {
    }

    @Override // z1.g
    public void f(byte[] bArr, long j4, int i4) {
        if (i4 > 0) {
            if (bArr.length > i4) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                bArr = bArr2;
            }
            a aVar = null;
            if (j4 == 2) {
                b bVar = this.f14111p;
                if (bVar == null || !bVar.isAlive()) {
                    b bVar2 = new b(this, aVar);
                    this.f14111p = bVar2;
                    bVar2.start();
                }
                this.f14111p.a(bArr);
                if (this.f14109n) {
                    this.f14101f.d(0);
                    return;
                }
                return;
            }
            if (j4 == 3) {
                b bVar3 = this.f14111p;
                if (bVar3 == null || !bVar3.isAlive()) {
                    b bVar4 = new b(this, aVar);
                    this.f14111p = bVar4;
                    bVar4.start();
                }
                this.f14111p.b(bArr);
                if (this.f14109n) {
                    this.f14102g.d(5000);
                }
            }
        }
    }

    @Override // z1.g
    public void g(String str, int i4) {
        if (this.f14101f.c() && this.f14102g.c()) {
            if (this.f14105j) {
                this.f14105j = false;
            }
            if (this.f14106k) {
                return;
            }
            this.f14106k = true;
            u5.b bVar = this.f14103h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // z1.u5
    public void h(int i4) {
        if (this.f14102g == null) {
            z1.a aVar = new z1.a(this);
            this.f14102g = aVar;
            this.f14105j = true;
            this.f14106k = false;
            aVar.f12859a = 3;
        }
        if (!this.f14102g.c()) {
            this.f14102g.a(this.f14100e, this.f14099d, i4);
            this.f14105j = true;
        }
        if (this.f14101f == null) {
            z1.a aVar2 = new z1.a(this);
            this.f14101f = aVar2;
            this.f14105j = true;
            this.f14106k = false;
            aVar2.f12859a = 2;
        }
        if (this.f14101f.c()) {
            return;
        }
        this.f14101f.a(this.f14100e, this.f14098c, i4);
        this.f14105j = true;
    }

    @Override // z1.u5
    public void i() {
        this.f14105j = false;
        this.f14106k = false;
        z1.a aVar = this.f14102g;
        if (aVar != null) {
            aVar.b();
            this.f14102g = null;
        }
        z1.a aVar2 = this.f14101f;
        if (aVar2 != null) {
            aVar2.b();
            this.f14101f = null;
        }
        if (this.f14103h != null) {
            this.f14103h = null;
        }
    }

    @Override // z1.u5
    public boolean j() {
        return this.f14106k;
    }

    @Override // z1.u5
    public boolean k() {
        return this.f14105j;
    }

    @Override // z1.u5
    public void l() {
        synchronized (this) {
            if (!this.f14109n) {
                this.f14109n = true;
                Timer timer = this.f14107l;
                if (timer != null) {
                    timer.cancel();
                    this.f14107l = null;
                    this.f14108m = 0;
                }
                a aVar = new a();
                Timer timer2 = new Timer();
                this.f14107l = timer2;
                timer2.schedule(aVar, 200L, (long) 50.0d);
            }
        }
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f14103h = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f14104i = cVar;
    }

    @Override // z1.u5
    public void o() {
        synchronized (this) {
            if (this.f14109n) {
                Timer timer = this.f14107l;
                if (timer != null) {
                    timer.cancel();
                    this.f14107l = null;
                    this.f14108m = 0;
                }
                this.f14109n = false;
            }
        }
    }

    public void q() {
        z1.a aVar = this.f14101f;
        if (aVar != null && aVar.c()) {
            this.f14101f.e(this.f14110o, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
        if (this.f14104i != null) {
            int i4 = this.f14108m + 1;
            this.f14108m = i4;
            String string = i4 % 2 == 0 ? u5.d.HEART_BEAT.toString() : s0.a.f11071l;
            z1.a aVar2 = this.f14102g;
            if (aVar2 == null || !aVar2.c()) {
                return;
            }
            byte[] bArrB = this.f14104i.b(string);
            z1.a aVar3 = this.f14102g;
            if (aVar3 != null && bArrB != null && bArrB.length > 0) {
                aVar3.e(bArrB, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
            byte[] bArrB2 = this.f14104i.b(u5.d.MAGNETIC_PARAMS_CONTROL.toString());
            if (bArrB2 == null || bArrB2.length <= 0) {
                return;
            }
            this.f14102g.e(bArrB2, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
    }

    public w5(String str) {
        this.f14097b = "192.168.1.1";
        this.f14098c = 5002;
        this.f14099d = 5003;
        this.f14110o = new byte[4];
        this.f14111p = null;
        this.f14112q = new Object();
        this.f14100e = str;
        this.f14105j = false;
        this.f14106k = false;
    }
}
