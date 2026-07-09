package z1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class x5 extends u5 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f14143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f14144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u5.b f14145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u5.c f14146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f14149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f14152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f14153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14154q;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            x5.this.q();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<byte[]> f14156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<byte[]> f14158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14160e;

        public b() {
            this.f14156a = new ArrayList<>();
            this.f14157b = 0;
            this.f14158c = new ArrayList<>();
            this.f14159d = 183750;
            this.f14160e = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0090 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0002 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ void b() {
            /*
                r7 = this;
                r0 = 0
                r1 = r0
            L2:
                boolean r2 = r7.f14160e
                if (r2 != 0) goto La2
                java.util.ArrayList<byte[]> r2 = r7.f14156a
                monitor-enter(r2)
                java.util.ArrayList<byte[]> r3 = r7.f14156a     // Catch: java.lang.Throwable -> L9f
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L9f
                r4 = 0
                if (r3 <= 0) goto L26
                java.util.ArrayList<byte[]> r3 = r7.f14156a     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L9f
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L9f
                java.util.ArrayList<byte[]> r5 = r7.f14156a     // Catch: java.lang.Throwable -> L9f
                r5.remove(r0)     // Catch: java.lang.Throwable -> L9f
                int r5 = r7.f14157b     // Catch: java.lang.Throwable -> L9f
                int r6 = r3.length     // Catch: java.lang.Throwable -> L9f
                int r5 = r5 - r6
                r7.f14157b = r5     // Catch: java.lang.Throwable -> L9f
                goto L27
            L26:
                r3 = r4
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
                r2 = 1
                if (r3 == 0) goto L48
                z1.x5 r5 = z1.x5.this
                z1.u5$c r5 = z1.x5.p(r5)
                if (r5 == 0) goto L46
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r6 = "socket_data"
                r5.put(r6, r3)
                z1.x5 r3 = z1.x5.this
                z1.u5$c r3 = z1.x5.p(r3)
                r3.a(r5)
            L46:
                r3 = r0
                goto L49
            L48:
                r3 = r2
            L49:
                java.util.ArrayList<byte[]> r5 = r7.f14158c
                monitor-enter(r5)
                java.util.ArrayList<byte[]> r6 = r7.f14158c     // Catch: java.lang.Throwable -> L9c
                int r6 = r6.size()     // Catch: java.lang.Throwable -> L9c
                if (r6 <= 0) goto L61
                java.util.ArrayList<byte[]> r4 = r7.f14158c     // Catch: java.lang.Throwable -> L9c
                java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9c
                byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L9c
                java.util.ArrayList<byte[]> r6 = r7.f14158c     // Catch: java.lang.Throwable -> L9c
                r6.remove(r0)     // Catch: java.lang.Throwable -> L9c
            L61:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
                if (r4 == 0) goto L80
                z1.x5 r3 = z1.x5.this
                z1.u5$c r3 = z1.x5.p(r3)
                if (r3 == 0) goto L7f
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r5 = "socket_state"
                r3.put(r5, r4)
                z1.x5 r4 = z1.x5.this
                z1.u5$c r4 = z1.x5.p(r4)
                r4.a(r3)
            L7f:
                r3 = r0
            L80:
                r4 = 10
                if (r3 == 0) goto L86
                r1 = r0
                goto L8d
            L86:
                int r1 = r1 + r2
                if (r1 < r4) goto L8c
                r1 = r0
                r4 = r2
                goto L8e
            L8c:
                r4 = r2
            L8d:
                r2 = r3
            L8e:
                if (r2 == 0) goto L2
                long r2 = (long) r4
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L96
                goto L2
            L96:
                r2 = move-exception
                r2.printStackTrace()
                goto L2
            L9c:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
                throw r0
            L9f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
                throw r0
            La2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.x5.b.b():void");
        }

        public void c(byte[] bArr) {
            int i4;
            boolean z3;
            synchronized (this.f14156a) {
                this.f14156a.add(bArr);
                int length = this.f14157b + bArr.length;
                this.f14157b = length;
                int i5 = this.f14159d;
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

        public void d(byte[] bArr) {
            synchronized (this.f14158c) {
                this.f14158c.add(bArr);
            }
        }

        public void e() {
            this.f14156a.clear();
            this.f14158c.clear();
            this.f14160e = true;
        }

        public void f() {
            e2.o().execute(new Runnable() { // from class: z1.y5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14194b.b();
                }
            });
        }

        public /* synthetic */ b(x5 x5Var, a aVar) {
            this();
        }
    }

    public x5() {
        this.f14139b = "192.168.1.1";
        this.f14140c = 5002;
        this.f14141d = 5003;
        this.f14152o = new byte[4];
        this.f14153p = null;
        this.f14154q = new Object();
        this.f14142e = "192.168.1.1";
        this.f14147j = false;
        this.f14148k = false;
    }

    @Override // z1.g
    public void a() {
        if (this.f14143f.h() && this.f14144g.h()) {
            if (this.f14147j) {
                this.f14147j = false;
            }
            if (!this.f14148k) {
                this.f14148k = true;
                u5.b bVar = this.f14145h;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
        d dVar = this.f14143f;
        if (dVar != null) {
            dVar.k(0);
        }
        d dVar2 = this.f14144g;
        if (dVar2 != null) {
            dVar2.k(5000);
        }
        if (this.f14148k) {
            synchronized (this.f14154q) {
                if (this.f14153p == null) {
                    b bVar2 = new b(this, null);
                    this.f14153p = bVar2;
                    bVar2.f();
                }
            }
        }
    }

    @Override // z1.g
    public void b() {
        if (this.f14147j) {
            this.f14147j = false;
            this.f14148k = false;
        }
        if (this.f14148k) {
            o();
            this.f14148k = false;
            this.f14147j = false;
            u5.b bVar = this.f14145h;
            if (bVar != null) {
                bVar.d();
            }
        }
        if (this.f14148k) {
            return;
        }
        synchronized (this.f14154q) {
            b bVar2 = this.f14153p;
            if (bVar2 != null) {
                bVar2.e();
                this.f14153p = null;
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
            if (j4 == 2) {
                b bVar = this.f14153p;
                if (bVar != null) {
                    bVar.c(bArr);
                }
                if (this.f14151n) {
                    this.f14143f.k(0);
                    return;
                }
                return;
            }
            if (j4 == 3) {
                b bVar2 = this.f14153p;
                if (bVar2 != null) {
                    bVar2.d(bArr);
                }
                if (this.f14151n) {
                    this.f14144g.k(5000);
                }
            }
        }
    }

    @Override // z1.g
    public void g(String str, int i4) {
        if (this.f14143f.h() && this.f14144g.h()) {
            if (this.f14147j) {
                this.f14147j = false;
            }
            if (this.f14148k) {
                return;
            }
            this.f14148k = true;
            u5.b bVar = this.f14145h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // z1.u5
    public void h(int i4) {
        if (this.f14144g == null) {
            d dVar = new d(this);
            this.f14144g = dVar;
            this.f14147j = true;
            this.f14148k = false;
            dVar.f12968a = 3;
        }
        if (!this.f14144g.h()) {
            this.f14144g.c(this.f14142e, this.f14141d, i4);
            this.f14147j = true;
        }
        if (this.f14143f == null) {
            d dVar2 = new d(this);
            this.f14143f = dVar2;
            this.f14147j = true;
            this.f14148k = false;
            dVar2.f12968a = 2;
        }
        if (this.f14143f.h()) {
            return;
        }
        this.f14143f.c(this.f14142e, this.f14140c, i4);
        this.f14147j = true;
    }

    @Override // z1.u5
    public void i() {
        this.f14147j = false;
        this.f14148k = false;
        d dVar = this.f14144g;
        if (dVar != null) {
            dVar.d();
            this.f14144g = null;
        }
        d dVar2 = this.f14143f;
        if (dVar2 != null) {
            dVar2.d();
            this.f14143f = null;
        }
        if (this.f14145h != null) {
            this.f14145h = null;
        }
    }

    @Override // z1.u5
    public boolean j() {
        return this.f14148k;
    }

    @Override // z1.u5
    public boolean k() {
        return this.f14147j;
    }

    @Override // z1.u5
    public void l() {
        synchronized (this) {
            if (!this.f14151n) {
                this.f14151n = true;
                Timer timer = this.f14149l;
                if (timer != null) {
                    timer.cancel();
                    this.f14149l = null;
                    this.f14150m = 0;
                }
                a aVar = new a();
                Timer timer2 = new Timer();
                this.f14149l = timer2;
                timer2.schedule(aVar, 200L, (long) 50.0d);
            }
        }
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f14145h = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f14146i = cVar;
    }

    @Override // z1.u5
    public void o() {
        synchronized (this) {
            if (this.f14151n) {
                Timer timer = this.f14149l;
                if (timer != null) {
                    timer.cancel();
                    this.f14149l = null;
                    this.f14150m = 0;
                }
                this.f14151n = false;
            }
        }
    }

    public void q() {
        d dVar = this.f14143f;
        if (dVar != null && dVar.h()) {
            this.f14143f.l(this.f14152o, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
        if (this.f14146i != null) {
            int i4 = this.f14150m + 1;
            this.f14150m = i4;
            String string = i4 % 2 == 0 ? u5.d.HEART_BEAT.toString() : s0.a.f11071l;
            d dVar2 = this.f14144g;
            if (dVar2 == null || !dVar2.h()) {
                return;
            }
            byte[] bArrB = this.f14146i.b(string);
            d dVar3 = this.f14144g;
            if (dVar3 != null && bArrB != null && bArrB.length > 0) {
                dVar3.l(bArrB, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
            byte[] bArrB2 = this.f14146i.b(u5.d.MAGNETIC_PARAMS_CONTROL.toString());
            if (bArrB2 == null || bArrB2.length <= 0) {
                return;
            }
            this.f14144g.l(bArrB2, com.sonoptek.pvus_android.loop_view.a.f6120c);
        }
    }

    public x5(String str) {
        this.f14139b = "192.168.1.1";
        this.f14140c = 5002;
        this.f14141d = 5003;
        this.f14152o = new byte[4];
        this.f14153p = null;
        this.f14154q = new Object();
        this.f14142e = str;
        this.f14147j = false;
        this.f14148k = false;
    }
}
