package z1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class z5 extends u5 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f14225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f14226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u5.b f14227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u5.c f14228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f14231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f14234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f14235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14236q;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z5.this.q();
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f14238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<byte[]> f14240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14242f;

        public b() {
            this.f14238b = new ArrayList<>();
            this.f14239c = 0;
            this.f14240d = new ArrayList<>();
            this.f14241e = 183750;
            this.f14242f = false;
        }

        public void a(byte[] bArr) {
            int i4;
            boolean z3;
            synchronized (this.f14238b) {
                this.f14238b.add(bArr);
                int length = this.f14239c + bArr.length;
                this.f14239c = length;
                int i5 = this.f14241e;
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
            synchronized (this.f14240d) {
                this.f14240d.add(bArr);
            }
        }

        public void c() {
            this.f14238b.clear();
            this.f14240d.clear();
            this.f14242f = true;
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
                boolean r2 = r7.f14242f
                if (r2 != 0) goto La5
                java.util.ArrayList<byte[]> r2 = r7.f14238b
                monitor-enter(r2)
                java.util.ArrayList<byte[]> r3 = r7.f14238b     // Catch: java.lang.Throwable -> La2
                int r3 = r3.size()     // Catch: java.lang.Throwable -> La2
                r4 = 0
                if (r3 <= 0) goto L29
                java.util.ArrayList<byte[]> r3 = r7.f14238b     // Catch: java.lang.Throwable -> La2
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> La2
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> La2
                java.util.ArrayList<byte[]> r5 = r7.f14238b     // Catch: java.lang.Throwable -> La2
                r5.remove(r0)     // Catch: java.lang.Throwable -> La2
                int r5 = r7.f14239c     // Catch: java.lang.Throwable -> La2
                int r6 = r3.length     // Catch: java.lang.Throwable -> La2
                int r5 = r5 - r6
                r7.f14239c = r5     // Catch: java.lang.Throwable -> La2
                goto L2a
            L29:
                r3 = r4
            L2a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La2
                r2 = 1
                if (r3 == 0) goto L4b
                z1.z5 r5 = z1.z5.this
                z1.u5$c r5 = z1.z5.p(r5)
                if (r5 == 0) goto L49
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r6 = "socket_data"
                r5.put(r6, r3)
                z1.z5 r3 = z1.z5.this
                z1.u5$c r3 = z1.z5.p(r3)
                r3.a(r5)
            L49:
                r3 = r0
                goto L4c
            L4b:
                r3 = r2
            L4c:
                java.util.ArrayList<byte[]> r5 = r7.f14240d
                monitor-enter(r5)
                java.util.ArrayList<byte[]> r6 = r7.f14240d     // Catch: java.lang.Throwable -> L9f
                int r6 = r6.size()     // Catch: java.lang.Throwable -> L9f
                if (r6 <= 0) goto L64
                java.util.ArrayList<byte[]> r4 = r7.f14240d     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9f
                byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L9f
                java.util.ArrayList<byte[]> r6 = r7.f14240d     // Catch: java.lang.Throwable -> L9f
                r6.remove(r0)     // Catch: java.lang.Throwable -> L9f
            L64:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L9f
                if (r4 == 0) goto L83
                z1.z5 r3 = z1.z5.this
                z1.u5$c r3 = z1.z5.p(r3)
                if (r3 == 0) goto L82
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r5 = "socket_state"
                r3.put(r5, r4)
                z1.z5 r4 = z1.z5.this
                z1.u5$c r4 = z1.z5.p(r4)
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
            throw new UnsupportedOperationException("Method not decompiled: z1.z5.b.run():void");
        }

        public /* synthetic */ b(z5 z5Var, a aVar) {
            this();
        }
    }

    public z5() {
        this.f14221b = "192.168.1.1";
        this.f14222c = 5002;
        this.f14223d = 5003;
        this.f14234o = new byte[4];
        this.f14235p = null;
        this.f14236q = new Object();
        this.f14224e = "192.168.1.1";
        this.f14229j = false;
        this.f14230k = false;
    }

    @Override // z1.g
    public void a() {
        if (this.f14225f.c() && this.f14226g.c()) {
            if (this.f14229j) {
                this.f14229j = false;
            }
            if (!this.f14230k) {
                this.f14230k = true;
                u5.b bVar = this.f14227h;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
        e eVar = this.f14225f;
        if (eVar != null) {
            eVar.d(0);
        }
        e eVar2 = this.f14226g;
        if (eVar2 != null) {
            eVar2.d(5000);
        }
        if (this.f14230k) {
            synchronized (this.f14236q) {
                if (this.f14235p == null) {
                    b bVar2 = new b(this, null);
                    this.f14235p = bVar2;
                    bVar2.start();
                }
            }
        }
    }

    @Override // z1.g
    public void b() {
        if (this.f14229j) {
            this.f14229j = false;
            this.f14230k = false;
        }
        if (this.f14230k) {
            o();
            this.f14230k = false;
            this.f14229j = false;
            u5.b bVar = this.f14227h;
            if (bVar != null) {
                bVar.d();
            }
        }
        if (this.f14230k) {
            return;
        }
        synchronized (this.f14236q) {
            b bVar2 = this.f14235p;
            if (bVar2 != null) {
                bVar2.c();
                this.f14235p = null;
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
                b bVar = this.f14235p;
                if (bVar == null || !bVar.isAlive()) {
                    b bVar2 = new b(this, aVar);
                    this.f14235p = bVar2;
                    bVar2.start();
                }
                this.f14235p.a(bArr);
                if (this.f14233n) {
                    this.f14225f.d(0);
                    return;
                }
                return;
            }
            if (j4 == 3) {
                b bVar3 = this.f14235p;
                if (bVar3 == null || !bVar3.isAlive()) {
                    b bVar4 = new b(this, aVar);
                    this.f14235p = bVar4;
                    bVar4.start();
                }
                this.f14235p.b(bArr);
                if (this.f14233n) {
                    this.f14226g.d(5000);
                }
            }
        }
    }

    @Override // z1.g
    public void g(String str, int i4) {
        if (this.f14225f.c() && this.f14226g.c()) {
            if (this.f14229j) {
                this.f14229j = false;
            }
            if (this.f14230k) {
                return;
            }
            this.f14230k = true;
            u5.b bVar = this.f14227h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // z1.u5
    public void h(int i4) {
        if (this.f14226g == null) {
            e eVar = new e(this);
            this.f14226g = eVar;
            this.f14229j = true;
            this.f14230k = false;
            eVar.f13014a = 3;
        }
        if (!this.f14226g.c()) {
            this.f14226g.a(this.f14224e, this.f14223d, i4);
            this.f14229j = true;
        }
        if (this.f14225f == null) {
            e eVar2 = new e(this);
            this.f14225f = eVar2;
            this.f14229j = true;
            this.f14230k = false;
            eVar2.f13014a = 2;
        }
        if (this.f14225f.c()) {
            return;
        }
        this.f14225f.a(this.f14224e, this.f14222c, i4);
        this.f14229j = true;
    }

    @Override // z1.u5
    public void i() {
        this.f14229j = false;
        this.f14230k = false;
        e eVar = this.f14226g;
        if (eVar != null) {
            eVar.b();
            this.f14226g = null;
        }
        e eVar2 = this.f14225f;
        if (eVar2 != null) {
            eVar2.b();
            this.f14225f = null;
        }
        if (this.f14227h != null) {
            this.f14227h = null;
        }
    }

    @Override // z1.u5
    public boolean j() {
        return this.f14230k;
    }

    @Override // z1.u5
    public boolean k() {
        return this.f14229j;
    }

    @Override // z1.u5
    public void l() {
        synchronized (this) {
            if (!this.f14233n) {
                this.f14233n = true;
                Timer timer = this.f14231l;
                if (timer != null) {
                    timer.cancel();
                    this.f14231l = null;
                    this.f14232m = 0;
                }
                a aVar = new a();
                Timer timer2 = new Timer();
                this.f14231l = timer2;
                timer2.schedule(aVar, 200L, (long) 50.0d);
            }
        }
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f14227h = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f14228i = cVar;
    }

    @Override // z1.u5
    public void o() {
        synchronized (this) {
            if (this.f14233n) {
                Timer timer = this.f14231l;
                if (timer != null) {
                    timer.cancel();
                    this.f14231l = null;
                    this.f14232m = 0;
                }
                this.f14233n = false;
            }
        }
    }

    public void q() {
        e eVar = this.f14225f;
        if (eVar != null && eVar.c()) {
            this.f14225f.e(this.f14234o, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
        if (this.f14228i != null) {
            int i4 = this.f14232m + 1;
            this.f14232m = i4;
            String string = i4 % 2 == 0 ? u5.d.HEART_BEAT.toString() : s0.a.f11071l;
            e eVar2 = this.f14226g;
            if (eVar2 == null || !eVar2.c()) {
                return;
            }
            byte[] bArrB = this.f14228i.b(string);
            e eVar3 = this.f14226g;
            if (eVar3 != null && bArrB != null && bArrB.length > 0) {
                eVar3.e(bArrB, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
            byte[] bArrB2 = this.f14228i.b("MagneticParams");
            if (bArrB2 == null || bArrB2.length <= 0) {
                return;
            }
            this.f14226g.e(bArrB2, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
    }

    public z5(String str) {
        this.f14221b = "192.168.1.1";
        this.f14222c = 5002;
        this.f14223d = 5003;
        this.f14234o = new byte[4];
        this.f14235p = null;
        this.f14236q = new Object();
        this.f14224e = str;
        this.f14229j = false;
        this.f14230k = false;
    }
}
