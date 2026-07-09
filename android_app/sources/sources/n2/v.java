package n2;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import n2.t;
import n2.w;

/* JADX INFO: loaded from: classes.dex */
public class v extends t implements w.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f9628v = "192.168.1.1";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9629w = 52001;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f9630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n2.b f9631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Timer f9634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f9636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f9637u;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            v.this.l();
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f9639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9641d;

        public b() {
            this.f9639b = new ArrayList<>();
            this.f9640c = 0;
            this.f9641d = false;
        }

        public void a(byte[] bArr) {
            boolean z3;
            synchronized (this.f9639b) {
                this.f9639b.add(bArr);
                int length = this.f9640c + bArr.length;
                this.f9640c = length;
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
            this.f9639b.clear();
            this.f9641d = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr;
            super.run();
            while (!this.f9641d) {
                while (this.f9639b.size() > 0) {
                    synchronized (this.f9639b) {
                        if (this.f9639b.size() > 0) {
                            bArr = this.f9639b.get(0);
                            this.f9639b.remove(0);
                            this.f9640c -= bArr.length;
                        } else {
                            bArr = null;
                        }
                    }
                    if (bArr != null) {
                        v.this.f9630n.c(bArr);
                    }
                }
                try {
                    Thread.sleep(5L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }

        public /* synthetic */ b(v vVar, a aVar) {
            this();
        }
    }

    public v(r0 r0Var) {
        super(r0Var);
        this.f9636t = new Object();
        this.f9637u = null;
    }

    @Override // n2.s0, n2.u0, n2.c
    public void a(d dVar) {
        if (this.f9633q) {
            this.f9633q = false;
            t.a aVar = this.f9589m;
            if (aVar != null) {
                aVar.d(false);
            }
            synchronized (this.f9636t) {
                b bVar = this.f9637u;
                if (bVar != null) {
                    bVar.b();
                    this.f9637u = null;
                }
            }
        }
    }

    @Override // n2.s0, n2.u0, n2.c
    public void b(d dVar) {
        if (this.f9633q) {
            return;
        }
        this.f9633q = true;
        t.a aVar = this.f9589m;
        if (aVar != null) {
            aVar.d(true);
        }
        synchronized (this.f9636t) {
            if (this.f9637u == null) {
                b bVar = new b(this, null);
                this.f9637u = bVar;
                bVar.setPriority(5);
                this.f9637u.start();
            }
        }
        this.f9631o.d(5000);
    }

    @Override // n2.w.a
    public void c(byte[] bArr) {
        t.a aVar;
        if (bArr.length < 525) {
            return;
        }
        if ((bArr[8] & 255) == 255) {
            byte[] bArr2 = new byte[512];
            System.arraycopy(bArr, 12, bArr2, 0, 512);
            t.a aVar2 = this.f9589m;
            if (aVar2 != null) {
                aVar2.c(bArr2);
            }
        }
        if (bArr.length < 1050 || (aVar = this.f9589m) == null) {
            return;
        }
        aVar.b(bArr);
    }

    @Override // n2.s0, n2.u0, n2.c
    public void d(d dVar, byte[] bArr, int i4) {
        if (this.f9630n != null && i4 > 0) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            b bVar = this.f9637u;
            if (bVar != null) {
                bVar.a(bArr2);
            }
        }
        this.f9631o.d(5000);
    }

    @Override // n2.s0, n2.u0
    public String e() {
        return "WIFI";
    }

    @Override // n2.s0, n2.u0
    public void f() {
        String str = f9628v;
        if (this.f9631o == null) {
            this.f9631o = new n2.b(this);
        }
        if (this.f9631o.c()) {
            return;
        }
        if (str == null || str.isEmpty()) {
            str = "192.168.1.1";
        }
        this.f9631o.a(str, 52001, 1000);
    }

    @Override // n2.s0, n2.u0
    public void h() {
        n2.b bVar = this.f9631o;
        if (bVar != null) {
            bVar.b();
            this.f9631o = null;
        }
    }

    @Override // n2.t, n2.s0, n2.u0
    public boolean i() {
        return this.f9633q;
    }

    @Override // n2.t, n2.s0, n2.u0
    public void j() {
        Timer timer = this.f9634r;
        if (timer != null) {
            timer.cancel();
            this.f9634r = null;
            this.f9635s = 0;
        }
        h();
        this.f9634r = new Timer();
        this.f9634r.schedule(new a(), 0L, 50L);
        this.f9632p = true;
    }

    @Override // n2.t, n2.s0, n2.u0
    public void k() {
        this.f9632p = false;
        Timer timer = this.f9634r;
        if (timer != null) {
            timer.cancel();
            this.f9634r = null;
        }
        h();
    }

    @Override // n2.s0
    public void l() {
        byte[] bArrA;
        if (this.f9632p) {
            this.f9635s++;
            if (!i()) {
                if (this.f9635s % 20 == 0) {
                    f();
                }
            } else {
                t.a aVar = this.f9589m;
                if (aVar == null || (bArrA = aVar.a(this.f9635s)) == null) {
                    return;
                }
                this.f9631o.e(bArrA, 5000);
            }
        }
    }

    public void n(String str) {
        f9628v = str;
    }

    public void o(w wVar) {
        this.f9630n = wVar;
        wVar.f9660h = this;
    }
}
