package z1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class e6 extends u5 implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f13066m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static e f13067n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static e6 f13068o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f13069p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f13070q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f13071r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f13072s = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f13075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u5.b f13078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u5.c f13079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13081j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13073b = "192.168.1.1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13074c = 52001;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f13082k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f13083l = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            e6.this.q();
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f13085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13087d;

        public b() {
            this.f13085b = new ArrayList<>();
            this.f13086c = 0;
            this.f13087d = false;
        }

        public void a(byte[] bArr) {
            boolean z3;
            synchronized (this.f13085b) {
                this.f13085b.add(bArr);
                int length = this.f13086c + bArr.length;
                this.f13086c = length;
                z3 = length > 84000;
            }
            if (z3) {
                try {
                    Thread.sleep(10L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }

        public void b() {
            this.f13085b.clear();
            this.f13087d = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0005 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                super.run()
                r0 = 0
                r1 = r0
            L5:
                boolean r2 = r6.f13087d
                if (r2 != 0) goto L64
                java.util.ArrayList<byte[]> r2 = r6.f13085b
                monitor-enter(r2)
                java.util.ArrayList<byte[]> r3 = r6.f13085b     // Catch: java.lang.Throwable -> L61
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L61
                if (r3 <= 0) goto L28
                java.util.ArrayList<byte[]> r3 = r6.f13085b     // Catch: java.lang.Throwable -> L61
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L61
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L61
                java.util.ArrayList<byte[]> r4 = r6.f13085b     // Catch: java.lang.Throwable -> L61
                r4.remove(r0)     // Catch: java.lang.Throwable -> L61
                int r4 = r6.f13086c     // Catch: java.lang.Throwable -> L61
                int r5 = r3.length     // Catch: java.lang.Throwable -> L61
                int r4 = r4 - r5
                r6.f13086c = r4     // Catch: java.lang.Throwable -> L61
                goto L29
            L28:
                r3 = 0
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
                r2 = 1
                if (r3 == 0) goto L46
                z1.e6 r4 = z1.e6.this
                z1.u5$c r4 = r4.f13079h
                if (r4 == 0) goto L44
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r5 = "socket"
                r4.put(r5, r3)
                z1.e6 r3 = z1.e6.this
                z1.u5$c r3 = r3.f13079h
                r3.a(r4)
            L44:
                r3 = r0
                goto L47
            L46:
                r3 = r2
            L47:
                r4 = 10
                if (r3 == 0) goto L4d
                r1 = r0
                goto L54
            L4d:
                int r1 = r1 + r2
                if (r1 < r4) goto L53
                r1 = r0
                r4 = r2
                goto L55
            L53:
                r4 = r2
            L54:
                r2 = r3
            L55:
                if (r2 == 0) goto L5
                long r2 = (long) r4
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L5c
                goto L5
            L5c:
                r2 = move-exception
                r2.printStackTrace()
                goto L5
            L61:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
                throw r0
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.e6.b.run():void");
        }

        public /* synthetic */ b(e6 e6Var, a aVar) {
            this();
        }
    }

    public e6() {
        f13066m = "192.168.1.1";
        this.f13080i = false;
        this.f13081j = false;
    }

    public static e6 p(String str) {
        if (f13068o == null) {
            synchronized (f13069p) {
                if (f13068o == null) {
                    f13068o = new e6(str);
                }
            }
        }
        f13066m = str;
        f13070q = true;
        return f13068o;
    }

    @Override // z1.g
    public void a() {
        if (this.f13080i) {
            this.f13080i = false;
            if (!this.f13081j) {
                this.f13081j = true;
                u5.b bVar = this.f13078g;
                if (bVar != null) {
                    bVar.a();
                }
            }
            synchronized (this.f13082k) {
                if (this.f13083l == null) {
                    b bVar2 = new b(this, null);
                    this.f13083l = bVar2;
                    bVar2.start();
                }
            }
        }
    }

    @Override // z1.g
    public void b() {
        if (this.f13080i) {
            this.f13080i = false;
            this.f13081j = false;
            u5.b bVar = this.f13078g;
            if (bVar != null) {
                bVar.d();
            }
        }
        if (this.f13081j) {
            o();
            this.f13080i = false;
            this.f13081j = false;
            u5.b bVar2 = this.f13078g;
            if (bVar2 != null) {
                bVar2.d();
            }
            synchronized (this.f13082k) {
                b bVar3 = this.f13083l;
                if (bVar3 != null) {
                    bVar3.b();
                    this.f13083l = null;
                }
            }
        }
    }

    @Override // z1.g
    public void e(long j4) {
    }

    @Override // z1.g
    public void f(byte[] bArr, long j4, int i4) {
        if (i4 > 0) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            b bVar = this.f13083l;
            if (bVar != null) {
                bVar.a(bArr2);
            }
        }
        if (this.f13077f) {
            f13067n.d(5000);
        }
    }

    @Override // z1.g
    public void g(String str, int i4) {
    }

    @Override // z1.u5
    public void h(int i4) {
        if (this.f13081j) {
            return;
        }
        if (f13067n == null) {
            f13067n = new e(this);
        }
        if (f13067n.c()) {
            return;
        }
        this.f13080i = true;
        this.f13081j = false;
        f13067n.a(f13066m, this.f13074c, i4);
    }

    @Override // z1.u5
    public void i() {
        e eVar = f13067n;
        if (eVar != null) {
            eVar.b();
            f13067n = null;
        }
    }

    @Override // z1.u5
    public boolean j() {
        return this.f13081j;
    }

    @Override // z1.u5
    public void l() {
        synchronized (this) {
            if (!this.f13077f) {
                this.f13077f = true;
                Timer timer = this.f13075d;
                if (timer != null) {
                    timer.cancel();
                    this.f13075d = null;
                    this.f13076e = 0;
                }
                this.f13075d = new Timer();
                this.f13075d.schedule(new a(), 500L, (long) 50.0d);
                f13067n.d(5000);
            }
        }
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f13078g = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f13079h = cVar;
    }

    @Override // z1.u5
    public void o() {
        synchronized (this) {
            if (this.f13077f) {
                Timer timer = this.f13075d;
                if (timer != null) {
                    timer.cancel();
                    this.f13075d = null;
                    this.f13076e = 0;
                }
                this.f13077f = false;
            }
        }
    }

    public void q() {
        byte[] bArrB;
        e eVar;
        if (this.f13079h != null) {
            int i4 = this.f13076e + 1;
            this.f13076e = i4;
            String string = i4 % 2 == 0 ? u5.d.HEART_BEAT.toString() : s0.a.f11071l;
            if (f13067n == null || (bArrB = this.f13079h.b(string)) == null || bArrB.length <= 0 || (eVar = f13067n) == null) {
                return;
            }
            eVar.e(bArrB, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
    }

    public e6(String str) {
        f13066m = str;
        this.f13080i = false;
        this.f13081j = false;
    }
}
