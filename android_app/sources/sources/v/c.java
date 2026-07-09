package v;

import java.util.ArrayList;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f11739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f11740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f11741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f11742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f11743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f11744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f11745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f11748k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11759v;

    public c(e eVar, int i4, boolean z3) {
        this.f11738a = eVar;
        this.f11753p = i4;
        this.f11754q = z3;
    }

    public static boolean k(e eVar, int i4) {
        int i5;
        return eVar.i0() != 8 && eVar.U[i4] == e.b.MATCH_CONSTRAINT && ((i5 = eVar.f11830r[i4]) == 0 || i5 == 3);
    }

    public void a() {
        if (!this.f11759v) {
            b();
        }
        this.f11759v = true;
    }

    public final void b() {
        int i4 = this.f11753p * 2;
        e eVar = this.f11738a;
        this.f11752o = true;
        e eVar2 = eVar;
        boolean z3 = false;
        while (!z3) {
            this.f11746i++;
            e[] eVarArr = eVar.H0;
            int i5 = this.f11753p;
            e eVar3 = null;
            eVarArr[i5] = null;
            eVar.G0[i5] = null;
            if (eVar.i0() != 8) {
                this.f11749l++;
                e.b bVarZ = eVar.z(this.f11753p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarZ != bVar) {
                    this.f11750m += eVar.M(this.f11753p);
                }
                int iG = this.f11750m + eVar.R[i4].g();
                this.f11750m = iG;
                int i6 = i4 + 1;
                this.f11750m = iG + eVar.R[i6].g();
                int iG2 = this.f11751n + eVar.R[i4].g();
                this.f11751n = iG2;
                this.f11751n = iG2 + eVar.R[i6].g();
                if (this.f11739b == null) {
                    this.f11739b = eVar;
                }
                this.f11741d = eVar;
                e.b[] bVarArr = eVar.U;
                int i7 = this.f11753p;
                if (bVarArr[i7] == bVar) {
                    int i8 = eVar.f11830r[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.f11747j++;
                        float f4 = eVar.F0[i7];
                        if (f4 > 0.0f) {
                            this.f11748k += f4;
                        }
                        if (k(eVar, i7)) {
                            if (f4 < 0.0f) {
                                this.f11755r = true;
                            } else {
                                this.f11756s = true;
                            }
                            if (this.f11745h == null) {
                                this.f11745h = new ArrayList<>();
                            }
                            this.f11745h.add(eVar);
                        }
                        if (this.f11743f == null) {
                            this.f11743f = eVar;
                        }
                        e eVar4 = this.f11744g;
                        if (eVar4 != null) {
                            eVar4.G0[this.f11753p] = eVar;
                        }
                        this.f11744g = eVar;
                    }
                    if (this.f11753p != 0 ? !(eVar.f11828q == 0 && eVar.f11838v == 0 && eVar.f11840w == 0) : !(eVar.f11826p == 0 && eVar.f11832s == 0 && eVar.f11834t == 0)) {
                        this.f11752o = false;
                    }
                    if (eVar.Y != 0.0f) {
                        this.f11752o = false;
                        this.f11758u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.H0[this.f11753p] = eVar;
            }
            d dVar = eVar.R[i4 + 1].f11767f;
            if (dVar != null) {
                e eVar5 = dVar.f11765d;
                d dVar2 = eVar5.R[i4].f11767f;
                if (dVar2 != null && dVar2.f11765d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z3 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f11739b;
        if (eVar6 != null) {
            this.f11750m -= eVar6.R[i4].g();
        }
        e eVar7 = this.f11741d;
        if (eVar7 != null) {
            this.f11750m -= eVar7.R[i4 + 1].g();
        }
        this.f11740c = eVar;
        if (this.f11753p == 0 && this.f11754q) {
            this.f11742e = eVar;
        } else {
            this.f11742e = this.f11738a;
        }
        this.f11757t = this.f11756s && this.f11755r;
    }

    public e c() {
        return this.f11738a;
    }

    public e d() {
        return this.f11743f;
    }

    public e e() {
        return this.f11739b;
    }

    public e f() {
        return this.f11742e;
    }

    public e g() {
        return this.f11740c;
    }

    public e h() {
        return this.f11744g;
    }

    public e i() {
        return this.f11741d;
    }

    public float j() {
        return this.f11748k;
    }
}
