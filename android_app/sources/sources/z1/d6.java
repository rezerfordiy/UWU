package z1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class d6 extends u5 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1.a f12996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5.b f12997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u5.c f12998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f13001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f13004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f13005n;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            d6.this.q();
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f13007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13009d;

        public b() {
            this.f13007b = new ArrayList<>();
            this.f13008c = 0;
            this.f13009d = false;
        }

        public void a(byte[] bArr) {
            boolean z3;
            synchronized (this.f13007b) {
                this.f13007b.add(bArr);
                int length = this.f13008c + bArr.length;
                this.f13008c = length;
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
            this.f13007b.clear();
            this.f13009d = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x005b A[SYNTHETIC] */
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
                boolean r2 = r6.f13009d
                if (r2 != 0) goto L68
                java.util.ArrayList<byte[]> r2 = r6.f13007b
                monitor-enter(r2)
                java.util.ArrayList<byte[]> r3 = r6.f13007b     // Catch: java.lang.Throwable -> L65
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L65
                if (r3 <= 0) goto L28
                java.util.ArrayList<byte[]> r3 = r6.f13007b     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L65
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L65
                java.util.ArrayList<byte[]> r4 = r6.f13007b     // Catch: java.lang.Throwable -> L65
                r4.remove(r0)     // Catch: java.lang.Throwable -> L65
                int r4 = r6.f13008c     // Catch: java.lang.Throwable -> L65
                int r5 = r3.length     // Catch: java.lang.Throwable -> L65
                int r4 = r4 - r5
                r6.f13008c = r4     // Catch: java.lang.Throwable -> L65
                goto L29
            L28:
                r3 = 0
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                r2 = 1
                if (r3 == 0) goto L4a
                z1.d6 r4 = z1.d6.this
                z1.u5$c r4 = z1.d6.p(r4)
                if (r4 == 0) goto L48
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r5 = "socket"
                r4.put(r5, r3)
                z1.d6 r3 = z1.d6.this
                z1.u5$c r3 = z1.d6.p(r3)
                r3.a(r4)
            L48:
                r3 = r0
                goto L4b
            L4a:
                r3 = r2
            L4b:
                r4 = 10
                if (r3 == 0) goto L51
                r1 = r0
                goto L58
            L51:
                int r1 = r1 + r2
                if (r1 < r4) goto L57
                r1 = r0
                r4 = r2
                goto L59
            L57:
                r4 = r2
            L58:
                r2 = r3
            L59:
                if (r2 == 0) goto L5
                long r2 = (long) r4
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L60
                goto L5
            L60:
                r2 = move-exception
                r2.printStackTrace()
                goto L5
            L65:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                throw r0
            L68:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.d6.b.run():void");
        }

        public /* synthetic */ b(d6 d6Var, a aVar) {
            this();
        }
    }

    public d6() {
        this.f12993b = "192.168.1.1";
        this.f12994c = 52001;
        this.f13004m = new Object();
        this.f13005n = null;
        this.f12995d = "192.168.1.1";
        this.f12999h = false;
        this.f13000i = false;
    }

    @Override // z1.g
    public void a() {
        if (this.f12999h) {
            this.f12999h = false;
            if (!this.f13000i) {
                this.f13000i = true;
                u5.b bVar = this.f12997f;
                if (bVar != null) {
                    bVar.a();
                }
            }
            synchronized (this.f13004m) {
                if (this.f13005n == null) {
                    b bVar2 = new b(this, null);
                    this.f13005n = bVar2;
                    bVar2.start();
                }
            }
        }
    }

    @Override // z1.g
    public void b() {
        if (this.f12999h) {
            this.f12999h = false;
            this.f13000i = false;
            u5.b bVar = this.f12997f;
            if (bVar != null) {
                bVar.d();
            }
        }
        if (this.f13000i) {
            o();
            this.f12999h = false;
            this.f13000i = false;
            u5.b bVar2 = this.f12997f;
            if (bVar2 != null) {
                bVar2.d();
            }
            synchronized (this.f13004m) {
                b bVar3 = this.f13005n;
                if (bVar3 != null) {
                    bVar3.b();
                    this.f13005n = null;
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
            b bVar = this.f13005n;
            if (bVar != null) {
                bVar.a(bArr2);
            }
        }
        if (this.f13003l) {
            this.f12996e.d(5000);
        }
    }

    @Override // z1.g
    public void g(String str, int i4) {
    }

    @Override // z1.u5
    public void h(int i4) {
        if (this.f13000i) {
            return;
        }
        if (this.f12996e == null) {
            this.f12996e = new z1.a(this);
        }
        if (this.f12996e.c()) {
            return;
        }
        this.f12999h = true;
        this.f13000i = false;
        this.f12996e.a(this.f12995d, 52001, i4);
    }

    @Override // z1.u5
    public void i() {
        z1.a aVar = this.f12996e;
        if (aVar != null) {
            aVar.b();
            this.f12996e = null;
        }
    }

    @Override // z1.u5
    public boolean j() {
        return this.f13000i;
    }

    @Override // z1.u5
    public boolean k() {
        return this.f12999h;
    }

    @Override // z1.u5
    public void l() {
        synchronized (this) {
            if (!this.f13003l) {
                this.f13003l = true;
                Timer timer = this.f13001j;
                if (timer != null) {
                    timer.cancel();
                    this.f13001j = null;
                    this.f13002k = 0;
                }
                this.f13001j = new Timer();
                this.f13001j.schedule(new a(), 500L, (long) 50.0d);
                this.f12996e.d(5000);
            }
        }
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f12997f = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f12998g = cVar;
    }

    @Override // z1.u5
    public void o() {
        synchronized (this) {
            if (this.f13003l) {
                Timer timer = this.f13001j;
                if (timer != null) {
                    timer.cancel();
                    this.f13001j = null;
                    this.f13002k = 0;
                }
                this.f13003l = false;
            }
        }
    }

    public void q() {
        if (this.f12998g != null) {
            int i4 = this.f13002k + 1;
            this.f13002k = i4;
            byte[] bArrB = this.f12998g.b(i4 % 2 == 0 ? u5.d.HEART_BEAT.toString() : s0.a.f11071l);
            z1.a aVar = this.f12996e;
            if (aVar == null || bArrB == null || bArrB.length <= 0) {
                return;
            }
            aVar.e(bArrB, 1000);
        }
    }

    public d6(String str) {
        this.f12993b = "192.168.1.1";
        this.f12994c = 52001;
        this.f13004m = new Object();
        this.f13005n = null;
        this.f12995d = str;
        this.f12999h = false;
        this.f13000i = false;
    }
}
