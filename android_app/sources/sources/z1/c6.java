package z1;

import java.util.HashMap;
import java.util.Map;
import o2.b;
import z1.b0;
import z1.n0;
import z1.q7;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class c6 extends u5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j6 f12959b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u5.b f12962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5.c f12963f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12960c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12964g = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f12961d = new b(this, null);

    public class a implements k6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j6 f12965a;

        public a(j6 j6Var) {
            this.f12965a = j6Var;
        }

        @Override // z1.k6
        public byte[] a() {
            u5.c cVar = c6.this.f12963f;
            if (cVar != null) {
                return cVar.b(s0.a.f11071l);
            }
            return null;
        }

        @Override // z1.k6
        public boolean b() {
            u5.c cVar = c6.this.f12963f;
            if (!(cVar instanceof d1)) {
                return false;
            }
            n0 n0VarE = ((d1) cVar).e(n0.a.LIVE.toString());
            if (n0VarE instanceof q7.a) {
                return ((q7.a) n0VarE).T();
            }
            return false;
        }

        @Override // z1.k6
        public void c(int i4) {
            u5.c cVar = c6.this.f12963f;
            if (cVar instanceof d1) {
                n0 n0VarE = ((d1) cVar).e(n0.a.TRANSDUCER.toString());
                if (n0VarE instanceof q7.c) {
                    ((q7.c) n0VarE).s1(i4);
                }
            }
        }

        @Override // z1.k6
        public void d(byte b4, byte b5) {
        }

        @Override // z1.k6
        public int e() {
            u5.c cVar = c6.this.f12963f;
            if (!(cVar instanceof d1)) {
                return 0;
            }
            n0 n0VarE = ((d1) cVar).e(n0.a.TRANSDUCER.toString());
            if (n0VarE instanceof q7.c) {
                return ((q7.c) n0VarE).o1();
            }
            return 0;
        }

        @Override // z1.k6
        public void f(Map<String, Object> map) {
            u5.c cVar;
            if (map == null || (cVar = c6.this.f12963f) == null) {
                return;
            }
            cVar.a(map);
        }

        @Override // z1.k6
        public void g(byte[] bArr) {
        }

        @Override // z1.k6
        public void h(int i4) {
            u5.c cVar = c6.this.f12963f;
            if (cVar instanceof d1) {
                n0 n0VarE = ((d1) cVar).e(n0.a.TRANSDUCER.toString());
                if (n0VarE instanceof q7.c) {
                    ((q7.c) n0VarE).e3(i4);
                }
            }
        }

        @Override // z1.k6
        public void i() {
            c6 c6Var = c6.this;
            c6Var.f12960c = false;
            c6Var.o();
        }

        @Override // z1.k6
        public void j(byte[] bArr) {
        }

        @Override // z1.k6
        public void k(byte b4, String str, String str2) {
        }

        @Override // z1.k6
        public void l() {
            c6 c6Var = c6.this;
            c6Var.f12960c = true;
            u5.b bVar = c6Var.f12962e;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // z1.k6
        public void m() {
        }

        @Override // z1.k6
        public void n(byte[] bArr) {
            if (this.f12965a.f13442t != null) {
                HashMap map = new HashMap();
                map.put("socket_state", bArr);
                c6.this.f12963f.a(map);
                this.f12965a.f13442t = null;
            }
        }

        @Override // z1.k6
        public boolean o() {
            u5.c cVar = c6.this.f12963f;
            if (!(cVar instanceof d1)) {
                return false;
            }
            n0 n0VarE = ((d1) cVar).e(n0.a.BUILD_IN_PA.toString());
            if (n0VarE instanceof b0.h) {
                return ((b0.h) n0VarE).S1();
            }
            return false;
        }

        @Override // z1.k6
        public void p(boolean z3) {
        }
    }

    public class b implements b.InterfaceC0091b {
        public b() {
        }

        @Override // o2.b.InterfaceC0091b
        public void c() {
            c6.this.o();
        }

        @Override // o2.b.InterfaceC0091b
        public void d() {
        }

        public /* synthetic */ b(c6 c6Var, a aVar) {
            this();
        }
    }

    public c6() {
        o2.b.g(null).l(this.f12961d);
    }

    @Override // z1.u5
    public void h(int i4) {
        this.f12959b.l();
    }

    @Override // z1.u5
    public void i() {
        this.f12959b.m();
        o2.b.g(null).d(this.f12961d);
        this.f12964g = true;
    }

    @Override // z1.u5
    public boolean j() {
        return this.f12960c;
    }

    @Override // z1.u5
    public void l() {
        this.f12959b.m1();
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f12962e = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f12963f = cVar;
    }

    @Override // z1.u5
    public void o() {
        this.f12959b.m();
        this.f12962e.d();
    }

    public j6 p() {
        return this.f12959b;
    }

    public boolean q() {
        return this.f12964g;
    }

    public void r(boolean z3) {
        this.f12964g = z3;
    }

    public void s(j6 j6Var) {
        this.f12959b = j6Var;
        j6Var.Y0(new a(j6Var));
    }
}
