package n2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends u0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9590j = "192.168.1.1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9591k = 5002;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9592l = 5003;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2.b f9593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2.b f9594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f9595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9596d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f9597e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f9598f = new byte[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9599g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9600h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f9601i = null;

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f9602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<byte[]> f9604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9605e;

        public b() {
            this.f9602b = new ArrayList<>();
            this.f9603c = 0;
            this.f9604d = new ArrayList<>();
            this.f9605e = false;
        }

        public void a(byte[] bArr) {
            boolean z3;
            synchronized (this.f9602b) {
                this.f9602b.add(bArr);
                int length = this.f9603c + bArr.length;
                this.f9603c = length;
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

        public void b(byte[] bArr) {
            synchronized (this.f9604d) {
                this.f9604d.add(bArr);
            }
        }

        public void c() {
            this.f9602b.clear();
            this.f9604d.clear();
            this.f9605e = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr;
            byte[] bArr2;
            super.run();
            while (!this.f9605e) {
                while (true) {
                    if (this.f9602b.size() <= 0 && this.f9604d.size() <= 0) {
                        break;
                    }
                    synchronized (this.f9602b) {
                        bArr = null;
                        if (this.f9602b.size() > 0) {
                            bArr2 = this.f9602b.get(0);
                            this.f9602b.remove(0);
                            this.f9603c -= bArr2.length;
                        } else {
                            bArr2 = null;
                        }
                    }
                    if (bArr2 != null) {
                        t0.this.f9595c.w(bArr2);
                    }
                    synchronized (this.f9604d) {
                        if (this.f9604d.size() > 0) {
                            bArr = this.f9604d.get(0);
                            this.f9604d.remove(0);
                        }
                    }
                    if (bArr != null) {
                        t0.this.f9595c.x(bArr);
                    }
                }
                try {
                    Thread.sleep(5L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9607b = true;

        public c() {
        }

        public void a() {
            this.f9607b = false;
        }

        public boolean b() {
            return this.f9607b;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f9607b) {
                t0.this.l();
                try {
                    Thread.sleep(100L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public t0(r0 r0Var) {
        this.f9595c = r0Var;
    }

    @Override // n2.u0, n2.c
    public void a(d dVar) {
        boolean z3 = this.f9599g;
        this.f9599g = false;
        if (z3) {
            this.f9595c.u(false);
        }
        if (this.f9599g) {
            return;
        }
        synchronized (this.f9600h) {
            b bVar = this.f9601i;
            if (bVar != null) {
                bVar.c();
                this.f9601i = null;
            }
        }
    }

    @Override // n2.u0, n2.c
    public void b(d dVar) {
        n2.b bVar;
        boolean z3 = this.f9599g;
        n2.b bVar2 = this.f9594b;
        if (bVar2 != null && bVar2.c() && (bVar = this.f9593a) != null && bVar.c()) {
            this.f9599g = true;
        }
        if (this.f9599g) {
            n2.b bVar3 = this.f9593a;
            if (bVar3 != null) {
                bVar3.d(0);
            }
            n2.b bVar4 = this.f9594b;
            if (bVar4 != null) {
                bVar4.d(5000);
            }
        }
        boolean z4 = this.f9599g;
        if (z3 != z4) {
            this.f9595c.u(z4);
        }
        if (z3 || !this.f9599g) {
            return;
        }
        synchronized (this.f9600h) {
            if (this.f9601i == null) {
                b bVar5 = new b();
                this.f9601i = bVar5;
                bVar5.setPriority(5);
                this.f9601i.start();
            }
        }
    }

    @Override // n2.u0, n2.c
    public void d(d dVar, byte[] bArr, int i4) {
        b bVar;
        b bVar2;
        if (i4 <= 0) {
            bArr = null;
        } else if (bArr.length > i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            bArr = bArr2;
        }
        n2.b bVar3 = this.f9593a;
        if (bVar3 != null && dVar.f9160a == bVar3.f9160a) {
            if (bArr != null && this.f9595c != null && (bVar2 = this.f9601i) != null) {
                bVar2.a(bArr);
            }
            dVar.d(0);
            return;
        }
        n2.b bVar4 = this.f9594b;
        if (bVar4 == null || dVar.f9160a != bVar4.f9160a) {
            return;
        }
        if (bArr != null && this.f9595c != null && (bVar = this.f9601i) != null) {
            bVar.b(bArr);
        }
        dVar.d(5000);
    }

    @Override // n2.u0
    public String e() {
        return "WIFI";
    }

    @Override // n2.u0
    public void f() {
        if (this.f9593a == null) {
            n2.b bVar = new n2.b(this);
            this.f9593a = bVar;
            bVar.f9160a = 2;
        }
        if (!this.f9593a.c()) {
            this.f9593a.a("192.168.1.1", 5002, 990);
        }
        if (this.f9594b == null) {
            n2.b bVar2 = new n2.b(this);
            this.f9594b = bVar2;
            bVar2.f9160a = 3;
        }
        if (this.f9594b.c()) {
            return;
        }
        this.f9594b.a("192.168.1.1", 5003, 990);
    }

    @Override // n2.u0
    public String g() {
        return "DF";
    }

    @Override // n2.u0
    public void h() {
        n2.b bVar = this.f9593a;
        if (bVar != null) {
            bVar.b();
            this.f9593a = null;
        }
        n2.b bVar2 = this.f9594b;
        if (bVar2 != null) {
            bVar2.b();
            this.f9594b = null;
        }
    }

    @Override // n2.u0
    public synchronized boolean i() {
        return this.f9599g;
    }

    @Override // n2.u0
    public synchronized void j() {
        c cVar = this.f9597e;
        if (cVar == null || !cVar.b()) {
            c cVar2 = new c();
            this.f9597e = cVar2;
            cVar2.start();
        }
    }

    @Override // n2.u0
    public synchronized void k() {
        c cVar = this.f9597e;
        if (cVar != null) {
            cVar.a();
        }
        this.f9597e = null;
        h();
    }

    public synchronized void l() {
        byte[] bArrV;
        n2.b bVar;
        this.f9596d++;
        if (i()) {
            n2.b bVar2 = this.f9593a;
            if (bVar2 != null) {
                bVar2.e(this.f9598f, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
            r0 r0Var = this.f9595c;
            if (r0Var != null && (bArrV = r0Var.v(this.f9596d)) != null && (bVar = this.f9594b) != null) {
                bVar.e(bArrV, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
        } else if (this.f9596d % 10 == 0) {
            f();
        }
    }
}
