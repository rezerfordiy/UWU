package v;

import v.e;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class m extends j {

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f11932q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f11933r1 = 0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f11934s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f11935t1 = 0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f11936u1 = 0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f11937v1 = 0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f11938w1 = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f11939x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f11940y1 = false;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f11941z1 = 0;
    public int A1 = 0;
    public b.a B1 = new b.a();
    public b.InterfaceC0124b C1 = null;

    public void Q1(boolean z3) {
        int i4 = this.f11936u1;
        if (i4 > 0 || this.f11937v1 > 0) {
            if (z3) {
                this.f11938w1 = this.f11937v1;
                this.f11939x1 = i4;
            } else {
                this.f11938w1 = i4;
                this.f11939x1 = this.f11937v1;
            }
        }
    }

    public void R1() {
        for (int i4 = 0; i4 < this.f11910p1; i4++) {
            e eVar = this.f11909o1[i4];
            if (eVar != null) {
                eVar.n1(true);
            }
        }
    }

    public int S1() {
        return this.A1;
    }

    public int T1() {
        return this.f11941z1;
    }

    public int U1() {
        return this.f11933r1;
    }

    public int V1() {
        return this.f11938w1;
    }

    public int W1() {
        return this.f11939x1;
    }

    public int X1() {
        return this.f11932q1;
    }

    public void Y1(int i4, int i5, int i6, int i7) {
    }

    public void Z1(e eVar, e.b bVar, int i4, e.b bVar2, int i5) {
        while (this.C1 == null && U() != null) {
            this.C1 = ((f) U()).k2();
        }
        b.a aVar = this.B1;
        aVar.f12298a = bVar;
        aVar.f12299b = bVar2;
        aVar.f12300c = i4;
        aVar.f12301d = i5;
        this.C1.b(eVar, aVar);
        eVar.H1(this.B1.f12302e);
        eVar.d1(this.B1.f12303f);
        eVar.c1(this.B1.f12305h);
        eVar.L0(this.B1.f12304g);
    }

    public boolean a2() {
        e eVar = this.V;
        b.InterfaceC0124b interfaceC0124bK2 = eVar != null ? ((f) eVar).k2() : null;
        if (interfaceC0124bK2 == null) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f11910p1) {
                return true;
            }
            e eVar2 = this.f11909o1[i4];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarZ = eVar2.z(0);
                e.b bVarZ2 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(bVarZ == bVar && eVar2.f11826p != 1 && bVarZ2 == bVar && eVar2.f11828q != 1)) {
                    if (bVarZ == bVar) {
                        bVarZ = e.b.WRAP_CONTENT;
                    }
                    if (bVarZ2 == bVar) {
                        bVarZ2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.B1;
                    aVar.f12298a = bVarZ;
                    aVar.f12299b = bVarZ2;
                    aVar.f12300c = eVar2.j0();
                    this.B1.f12301d = eVar2.D();
                    interfaceC0124bK2.b(eVar2, this.B1);
                    eVar2.H1(this.B1.f12302e);
                    eVar2.d1(this.B1.f12303f);
                    eVar2.L0(this.B1.f12304g);
                }
            }
            i4++;
        }
    }

    public boolean b2() {
        return this.f11940y1;
    }

    @Override // v.j, v.i
    public void c(f fVar) {
        R1();
    }

    public void c2(boolean z3) {
        this.f11940y1 = z3;
    }

    public void d2(int i4, int i5) {
        this.f11941z1 = i4;
        this.A1 = i5;
    }

    public void e2(int i4) {
        this.f11934s1 = i4;
        this.f11932q1 = i4;
        this.f11935t1 = i4;
        this.f11933r1 = i4;
        this.f11936u1 = i4;
        this.f11937v1 = i4;
    }

    public void f2(int i4) {
        this.f11933r1 = i4;
    }

    public void g2(int i4) {
        this.f11937v1 = i4;
    }

    public void h2(int i4) {
        this.f11934s1 = i4;
        this.f11938w1 = i4;
    }

    public void i2(int i4) {
        this.f11935t1 = i4;
        this.f11939x1 = i4;
    }

    public void j2(int i4) {
        this.f11936u1 = i4;
        this.f11938w1 = i4;
        this.f11939x1 = i4;
    }

    public void k2(int i4) {
        this.f11932q1 = i4;
    }
}
