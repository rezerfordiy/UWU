package n2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends u0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9570j = "192.168.1.1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9571k = 5002;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9572l = 5003;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2.a f9573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2.a f9574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f9575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9576d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f9577e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f9578f = new byte[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9579g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9580h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f9581i = null;

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<byte[]> f9582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<byte[]> f9584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9585e;

        public b() {
            this.f9582b = new ArrayList<>();
            this.f9583c = 0;
            this.f9584d = new ArrayList<>();
            this.f9585e = false;
        }

        public void a(byte[] bArr) {
            boolean z3;
            synchronized (this.f9582b) {
                this.f9582b.add(bArr);
                int length = this.f9583c + bArr.length;
                this.f9583c = length;
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
            synchronized (this.f9584d) {
                this.f9584d.add(bArr);
            }
        }

        public void c() {
            this.f9582b.clear();
            this.f9584d.clear();
            this.f9585e = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr;
            byte[] bArr2;
            super.run();
            while (!this.f9585e) {
                while (true) {
                    if (this.f9582b.size() <= 0 && this.f9584d.size() <= 0) {
                        break;
                    }
                    synchronized (this.f9582b) {
                        bArr = null;
                        if (this.f9582b.size() > 0) {
                            bArr2 = this.f9582b.get(0);
                            this.f9582b.remove(0);
                            this.f9583c -= bArr2.length;
                        } else {
                            bArr2 = null;
                        }
                    }
                    if (bArr2 != null) {
                        s0.this.f9575c.w(bArr2);
                    }
                    synchronized (this.f9584d) {
                        if (this.f9584d.size() > 0) {
                            bArr = this.f9584d.get(0);
                            this.f9584d.remove(0);
                        }
                    }
                    if (bArr != null) {
                        s0.this.f9575c.x(bArr);
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
        public boolean f9587b = true;

        public c() {
        }

        public void a() {
            this.f9587b = false;
        }

        public boolean b() {
            return this.f9587b;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f9587b) {
                s0.this.l();
                try {
                    Thread.sleep(100L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public s0(r0 r0Var) {
        this.f9575c = r0Var;
    }

    @Override // n2.u0, n2.c
    public void a(d dVar) {
        boolean z3 = this.f9579g;
        this.f9579g = false;
        if (z3) {
            this.f9575c.u(false);
        }
        if (this.f9579g) {
            return;
        }
        synchronized (this.f9580h) {
            b bVar = this.f9581i;
            if (bVar != null) {
                bVar.c();
                this.f9581i = null;
            }
        }
    }

    @Override // n2.u0, n2.c
    public void b(d dVar) {
        n2.a aVar;
        boolean z3 = this.f9579g;
        n2.a aVar2 = this.f9574b;
        if (aVar2 != null && aVar2.c() && (aVar = this.f9573a) != null && aVar.c()) {
            this.f9579g = true;
        }
        if (this.f9579g) {
            n2.a aVar3 = this.f9573a;
            if (aVar3 != null) {
                aVar3.d(0);
            }
            n2.a aVar4 = this.f9574b;
            if (aVar4 != null) {
                aVar4.d(5000);
            }
        }
        boolean z4 = this.f9579g;
        if (z3 != z4) {
            this.f9575c.u(z4);
        }
        if (z3 || !this.f9579g) {
            return;
        }
        synchronized (this.f9580h) {
            if (this.f9581i == null) {
                b bVar = new b();
                this.f9581i = bVar;
                bVar.setPriority(5);
                this.f9581i.start();
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
        n2.a aVar = this.f9573a;
        if (aVar != null && dVar.f9160a == aVar.f9160a) {
            if (bArr != null && this.f9575c != null && (bVar2 = this.f9581i) != null) {
                bVar2.a(bArr);
            }
            dVar.d(0);
            return;
        }
        n2.a aVar2 = this.f9574b;
        if (aVar2 == null || dVar.f9160a != aVar2.f9160a) {
            return;
        }
        if (bArr != null && this.f9575c != null && (bVar = this.f9581i) != null) {
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
        if (this.f9573a == null) {
            n2.a aVar = new n2.a(this);
            this.f9573a = aVar;
            aVar.f9160a = 2;
        }
        if (!this.f9573a.c()) {
            this.f9573a.a("192.168.1.1", 5002, 990);
        }
        if (this.f9574b == null) {
            n2.a aVar2 = new n2.a(this);
            this.f9574b = aVar2;
            aVar2.f9160a = 3;
        }
        if (this.f9574b.c()) {
            return;
        }
        this.f9574b.a("192.168.1.1", 5003, 990);
    }

    @Override // n2.u0
    public String g() {
        return "DF";
    }

    @Override // n2.u0
    public void h() {
        n2.a aVar = this.f9573a;
        if (aVar != null) {
            aVar.b();
            this.f9573a = null;
        }
        n2.a aVar2 = this.f9574b;
        if (aVar2 != null) {
            aVar2.b();
            this.f9574b = null;
        }
    }

    @Override // n2.u0
    public synchronized boolean i() {
        return this.f9579g;
    }

    @Override // n2.u0
    public synchronized void j() {
        c cVar = this.f9577e;
        if (cVar == null || !cVar.b()) {
            c cVar2 = new c();
            this.f9577e = cVar2;
            cVar2.start();
        }
    }

    @Override // n2.u0
    public synchronized void k() {
        c cVar = this.f9577e;
        if (cVar != null) {
            cVar.a();
        }
        this.f9577e = null;
        h();
    }

    public synchronized void l() {
        byte[] bArrV;
        n2.a aVar;
        this.f9576d++;
        if (i()) {
            n2.a aVar2 = this.f9573a;
            if (aVar2 != null) {
                aVar2.e(this.f9578f, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
            r0 r0Var = this.f9575c;
            if (r0Var != null && (bArrV = r0Var.v(this.f9576d)) != null && (aVar = this.f9574b) != null) {
                aVar.e(bArrV, com.sonoptek.pvus_android.loop_view.a.f6120c);
            }
        } else if (this.f9576d % 10 == 0) {
            f();
        }
    }
}
