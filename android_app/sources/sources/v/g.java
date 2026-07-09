package v;

import java.util.ArrayList;
import java.util.HashMap;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends m {

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final int f11866c2 = 0;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final int f11867d2 = 1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final int f11868e2 = 2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final int f11869f2 = 0;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final int f11870g2 = 1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final int f11871h2 = 2;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final int f11872i2 = 3;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final int f11873j2 = 0;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final int f11874k2 = 1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final int f11875l2 = 2;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public e[] f11876a2;
    public int D1 = -1;
    public int E1 = -1;
    public int F1 = -1;
    public int G1 = -1;
    public int H1 = -1;
    public int I1 = -1;
    public float J1 = 0.5f;
    public float K1 = 0.5f;
    public float L1 = 0.5f;
    public float M1 = 0.5f;
    public float N1 = 0.5f;
    public float O1 = 0.5f;
    public int P1 = 0;
    public int Q1 = 0;
    public int R1 = 2;
    public int S1 = 2;
    public int T1 = 0;
    public int U1 = -1;
    public int V1 = 0;
    public ArrayList<a> W1 = new ArrayList<>();
    public e[] X1 = null;
    public e[] Y1 = null;
    public int[] Z1 = null;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public int f11877b2 = 0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11878a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f11881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f11882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f11883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f11884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11886i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11888k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f11894q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f11879b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11880c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11889l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11890m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f11891n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f11892o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f11893p = 0;

        public a(int i4, d dVar, d dVar2, d dVar3, d dVar4, int i5) {
            this.f11885h = 0;
            this.f11886i = 0;
            this.f11887j = 0;
            this.f11888k = 0;
            this.f11894q = 0;
            this.f11878a = i4;
            this.f11881d = dVar;
            this.f11882e = dVar2;
            this.f11883f = dVar3;
            this.f11884g = dVar4;
            this.f11885h = g.this.V1();
            this.f11886i = g.this.X1();
            this.f11887j = g.this.W1();
            this.f11888k = g.this.U1();
            this.f11894q = i5;
        }

        public void b(e eVar) {
            if (this.f11878a == 0) {
                int iH2 = g.this.H2(eVar, this.f11894q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f11893p++;
                    iH2 = 0;
                }
                this.f11889l += iH2 + (eVar.i0() != 8 ? g.this.P1 : 0);
                int iG2 = g.this.G2(eVar, this.f11894q);
                if (this.f11879b == null || this.f11880c < iG2) {
                    this.f11879b = eVar;
                    this.f11880c = iG2;
                    this.f11890m = iG2;
                }
            } else {
                int iH22 = g.this.H2(eVar, this.f11894q);
                int iG22 = g.this.G2(eVar, this.f11894q);
                if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
                    this.f11893p++;
                    iG22 = 0;
                }
                this.f11890m += iG22 + (eVar.i0() != 8 ? g.this.Q1 : 0);
                if (this.f11879b == null || this.f11880c < iH22) {
                    this.f11879b = eVar;
                    this.f11880c = iH22;
                    this.f11889l = iH22;
                }
            }
            this.f11892o++;
        }

        public void c() {
            this.f11880c = 0;
            this.f11879b = null;
            this.f11889l = 0;
            this.f11890m = 0;
            this.f11891n = 0;
            this.f11892o = 0;
            this.f11893p = 0;
        }

        public void d(boolean z3, int i4, boolean z4) {
            d dVar;
            d dVar2;
            d dVar3;
            d dVar4;
            d dVar5;
            d dVar6;
            e eVar;
            char c4;
            d dVar7;
            d dVar8;
            int i5 = this.f11892o;
            for (int i6 = 0; i6 < i5 && this.f11891n + i6 < g.this.f11877b2; i6++) {
                e eVar2 = g.this.f11876a2[this.f11891n + i6];
                if (eVar2 != null) {
                    eVar2.I0();
                }
            }
            if (i5 == 0 || this.f11879b == null) {
                return;
            }
            boolean z5 = z4 && i4 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z3 ? (i5 - 1) - i9 : i9;
                if (this.f11891n + i10 >= g.this.f11877b2) {
                    break;
                }
                if (g.this.f11876a2[this.f11891n + i10].i0() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            e eVar3 = null;
            if (this.f11878a == 0) {
                e eVar4 = this.f11879b;
                eVar4.B1(g.this.E1);
                int i11 = this.f11886i;
                if (i4 > 0) {
                    i11 += g.this.Q1;
                }
                eVar4.K.a(this.f11882e, i11);
                if (z4) {
                    eVar4.M.a(this.f11884g, this.f11888k);
                }
                if (i4 > 0) {
                    this.f11882e.f11765d.M.a(eVar4.K, 0);
                }
                if (g.this.S1 != 3 || eVar4.m0()) {
                    eVar = eVar4;
                } else {
                    for (int i12 = 0; i12 < i5; i12++) {
                        int i13 = z3 ? (i5 - 1) - i12 : i12;
                        if (this.f11891n + i13 >= g.this.f11877b2) {
                            break;
                        }
                        eVar = g.this.f11876a2[this.f11891n + i13];
                        if (eVar.m0()) {
                            break;
                        }
                    }
                    eVar = eVar4;
                }
                int i14 = 0;
                while (i14 < i5) {
                    int i15 = z3 ? (i5 - 1) - i14 : i14;
                    if (this.f11891n + i15 >= g.this.f11877b2) {
                        return;
                    }
                    e eVar5 = g.this.f11876a2[this.f11891n + i15];
                    if (i14 == 0) {
                        eVar5.l(eVar5.J, this.f11881d, this.f11885h);
                    }
                    if (i15 == 0) {
                        int i16 = g.this.D1;
                        float f4 = g.this.J1;
                        if (this.f11891n == 0 && g.this.F1 != -1) {
                            i16 = g.this.F1;
                            f4 = g.this.L1;
                        } else if (z4 && g.this.H1 != -1) {
                            i16 = g.this.H1;
                            f4 = g.this.N1;
                        }
                        eVar5.g1(i16);
                        eVar5.f1(f4);
                    }
                    if (i14 == i5 - 1) {
                        eVar5.l(eVar5.L, this.f11883f, this.f11887j);
                    }
                    if (eVar3 != null) {
                        eVar5.J.a(eVar3.L, g.this.P1);
                        if (i14 == i7) {
                            eVar5.J.B(this.f11885h);
                        }
                        eVar3.L.a(eVar5.J, 0);
                        if (i14 == i8 + 1) {
                            eVar3.L.B(this.f11887j);
                        }
                    }
                    if (eVar5 != eVar4) {
                        c4 = 3;
                        if (g.this.S1 == 3 && eVar.m0() && eVar5 != eVar && eVar5.m0()) {
                            dVar7 = eVar5.N;
                            dVar8 = eVar.N;
                        } else {
                            int i17 = g.this.S1;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    d dVar9 = eVar5.K;
                                    if (z5) {
                                        dVar9.a(this.f11882e, this.f11886i);
                                        eVar5.M.a(this.f11884g, this.f11888k);
                                    } else {
                                        dVar9.a(eVar4.K, 0);
                                    }
                                }
                                dVar7 = eVar5.M;
                                dVar8 = eVar4.M;
                            } else {
                                dVar7 = eVar5.K;
                                dVar8 = eVar4.K;
                            }
                        }
                        dVar7.a(dVar8, 0);
                    } else {
                        c4 = 3;
                    }
                    i14++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f11879b;
            eVar6.g1(g.this.D1);
            int i18 = this.f11885h;
            if (i4 > 0) {
                i18 += g.this.P1;
            }
            if (z3) {
                eVar6.L.a(this.f11883f, i18);
                if (z4) {
                    eVar6.J.a(this.f11881d, this.f11887j);
                }
                if (i4 > 0) {
                    dVar = this.f11883f.f11765d.J;
                    dVar2 = eVar6.L;
                    dVar.a(dVar2, 0);
                }
            } else {
                eVar6.J.a(this.f11881d, i18);
                if (z4) {
                    eVar6.L.a(this.f11883f, this.f11887j);
                }
                if (i4 > 0) {
                    dVar = this.f11881d.f11765d.L;
                    dVar2 = eVar6.J;
                    dVar.a(dVar2, 0);
                }
            }
            int i19 = 0;
            while (i19 < i5 && this.f11891n + i19 < g.this.f11877b2) {
                e eVar7 = g.this.f11876a2[this.f11891n + i19];
                if (i19 == 0) {
                    eVar7.l(eVar7.K, this.f11882e, this.f11886i);
                    int i20 = g.this.E1;
                    float f5 = g.this.K1;
                    if (this.f11891n == 0 && g.this.G1 != -1) {
                        i20 = g.this.G1;
                        f5 = g.this.M1;
                    } else if (z4 && g.this.I1 != -1) {
                        i20 = g.this.I1;
                        f5 = g.this.O1;
                    }
                    eVar7.B1(i20);
                    eVar7.A1(f5);
                }
                if (i19 == i5 - 1) {
                    eVar7.l(eVar7.M, this.f11884g, this.f11888k);
                }
                if (eVar3 != null) {
                    eVar7.K.a(eVar3.M, g.this.Q1);
                    if (i19 == i7) {
                        eVar7.K.B(this.f11886i);
                    }
                    eVar3.M.a(eVar7.K, 0);
                    if (i19 == i8 + 1) {
                        eVar3.M.B(this.f11888k);
                    }
                }
                if (eVar7 != eVar6) {
                    int i21 = g.this.R1;
                    if (!z3) {
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 == 2) {
                                    d dVar10 = eVar7.J;
                                    if (z5) {
                                        dVar10.a(this.f11881d, this.f11885h);
                                        eVar7.L.a(this.f11883f, this.f11887j);
                                    } else {
                                        dVar10.a(eVar6.J, 0);
                                    }
                                }
                            }
                            dVar3 = eVar7.L;
                            dVar4 = eVar6.L;
                        } else {
                            dVar3 = eVar7.J;
                            dVar4 = eVar6.J;
                        }
                        dVar3.a(dVar4, 0);
                    } else if (i21 == 0) {
                        dVar5 = eVar7.L;
                        dVar6 = eVar6.L;
                        dVar5.a(dVar6, 0);
                    } else if (i21 == 1) {
                        dVar5 = eVar7.J;
                        dVar6 = eVar6.J;
                        dVar5.a(dVar6, 0);
                    } else if (i21 == 2) {
                        eVar7.J.a(eVar6.J, 0);
                        dVar5 = eVar7.L;
                        dVar6 = eVar6.L;
                        dVar5.a(dVar6, 0);
                    }
                }
                i19++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f11878a == 1 ? this.f11890m - g.this.Q1 : this.f11890m;
        }

        public int f() {
            return this.f11878a == 0 ? this.f11889l - g.this.P1 : this.f11889l;
        }

        public void g(int i4) {
            g gVar;
            e.b bVarH;
            int iJ0;
            e.b bVarG0;
            int iD;
            int i5 = this.f11893p;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f11892o;
            int i7 = i4 / i5;
            for (int i8 = 0; i8 < i6 && this.f11891n + i8 < g.this.f11877b2; i8++) {
                e eVar = g.this.f11876a2[this.f11891n + i8];
                if (this.f11878a == 0) {
                    if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f11826p == 0) {
                        gVar = g.this;
                        bVarH = e.b.FIXED;
                        bVarG0 = eVar.g0();
                        iD = eVar.D();
                        iJ0 = i7;
                        gVar.Z1(eVar, bVarH, iJ0, bVarG0, iD);
                    }
                } else if (eVar != null && eVar.g0() == e.b.MATCH_CONSTRAINT && eVar.f11828q == 0) {
                    gVar = g.this;
                    bVarH = eVar.H();
                    iJ0 = eVar.j0();
                    bVarG0 = e.b.FIXED;
                    iD = i7;
                    gVar.Z1(eVar, bVarH, iJ0, bVarG0, iD);
                }
            }
            h();
        }

        public final void h() {
            this.f11889l = 0;
            this.f11890m = 0;
            this.f11879b = null;
            this.f11880c = 0;
            int i4 = this.f11892o;
            for (int i5 = 0; i5 < i4 && this.f11891n + i5 < g.this.f11877b2; i5++) {
                e eVar = g.this.f11876a2[this.f11891n + i5];
                if (this.f11878a == 0) {
                    int iJ0 = eVar.j0();
                    int i6 = g.this.P1;
                    if (eVar.i0() == 8) {
                        i6 = 0;
                    }
                    this.f11889l += iJ0 + i6;
                    int iG2 = g.this.G2(eVar, this.f11894q);
                    if (this.f11879b == null || this.f11880c < iG2) {
                        this.f11879b = eVar;
                        this.f11880c = iG2;
                        this.f11890m = iG2;
                    }
                } else {
                    int iH2 = g.this.H2(eVar, this.f11894q);
                    int iG22 = g.this.G2(eVar, this.f11894q);
                    int i7 = g.this.Q1;
                    if (eVar.i0() == 8) {
                        i7 = 0;
                    }
                    this.f11890m += iG22 + i7;
                    if (this.f11879b == null || this.f11880c < iH2) {
                        this.f11879b = eVar;
                        this.f11880c = iH2;
                        this.f11889l = iH2;
                    }
                }
            }
        }

        public void i(int i4) {
            this.f11891n = i4;
        }

        public void j(int i4, d dVar, d dVar2, d dVar3, d dVar4, int i5, int i6, int i7, int i8, int i9) {
            this.f11878a = i4;
            this.f11881d = dVar;
            this.f11882e = dVar2;
            this.f11883f = dVar3;
            this.f11884g = dVar4;
            this.f11885h = i5;
            this.f11886i = i6;
            this.f11887j = i7;
            this.f11888k = i8;
            this.f11894q = i9;
        }
    }

    public final void F2(boolean z3) {
        e eVar;
        if (this.Z1 == null || this.Y1 == null || this.X1 == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f11877b2; i4++) {
            this.f11876a2[i4].I0();
        }
        int[] iArr = this.Z1;
        int i5 = iArr[0];
        int i6 = iArr[1];
        e eVar2 = null;
        for (int i7 = 0; i7 < i5; i7++) {
            e eVar3 = this.Y1[z3 ? (i5 - i7) - 1 : i7];
            if (eVar3 != null && eVar3.i0() != 8) {
                if (i7 == 0) {
                    eVar3.l(eVar3.J, this.J, V1());
                    eVar3.g1(this.D1);
                    eVar3.f1(this.J1);
                }
                if (i7 == i5 - 1) {
                    eVar3.l(eVar3.L, this.L, W1());
                }
                if (i7 > 0) {
                    eVar3.l(eVar3.J, eVar2.L, this.P1);
                    eVar2.l(eVar2.L, eVar3.J, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i8 = 0; i8 < i6; i8++) {
            e eVar4 = this.X1[i8];
            if (eVar4 != null && eVar4.i0() != 8) {
                if (i8 == 0) {
                    eVar4.l(eVar4.K, this.K, X1());
                    eVar4.B1(this.E1);
                    eVar4.A1(this.K1);
                }
                if (i8 == i6 - 1) {
                    eVar4.l(eVar4.M, this.M, U1());
                }
                if (i8 > 0) {
                    eVar4.l(eVar4.K, eVar2.M, this.Q1);
                    eVar2.l(eVar2.M, eVar4.K, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = (i10 * i5) + i9;
                if (this.V1 == 1) {
                    i11 = (i9 * i6) + i10;
                }
                e[] eVarArr = this.f11876a2;
                if (i11 < eVarArr.length && (eVar = eVarArr[i11]) != null && eVar.i0() != 8) {
                    e eVar5 = this.Y1[i9];
                    e eVar6 = this.X1[i10];
                    if (eVar != eVar5) {
                        eVar.l(eVar.J, eVar5.J, 0);
                        eVar.l(eVar.L, eVar5.L, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.K, eVar6.K, 0);
                        eVar.l(eVar.M, eVar6.M, 0);
                    }
                }
            }
        }
    }

    public final int G2(e eVar, int i4) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
            int i5 = eVar.f11828q;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (eVar.f11842x * i4);
                if (i6 != eVar.D()) {
                    eVar.s1(true);
                    Z1(eVar, eVar.H(), eVar.j0(), e.b.FIXED, i6);
                }
                return i6;
            }
            if (i5 == 1) {
                return eVar.D();
            }
            if (i5 == 3) {
                return (int) ((eVar.j0() * eVar.Y) + 0.5f);
            }
        }
        return eVar.D();
    }

    public final int H2(e eVar, int i4) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i5 = eVar.f11826p;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (eVar.f11836u * i4);
                if (i6 != eVar.j0()) {
                    eVar.s1(true);
                    Z1(eVar, e.b.FIXED, i6, eVar.g0(), eVar.D());
                }
                return i6;
            }
            if (i5 == 1) {
                return eVar.j0();
            }
            if (i5 == 3) {
                return (int) ((eVar.D() * eVar.Y) + 0.5f);
            }
        }
        return eVar.j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x010b -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x010d -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0113 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0115 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I2(v.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.I2(v.e[], int, int, int, int[]):void");
    }

    public final void J2(e[] eVarArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        d dVar;
        int iW1;
        d dVar2;
        int iU1;
        int i9;
        if (i4 == 0) {
            return;
        }
        this.W1.clear();
        a aVar = new a(i5, this.J, this.K, this.L, this.M, i6);
        this.W1.add(aVar);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        if (i5 == 0) {
            while (i12 < i4) {
                e eVar = eVarArr[i12];
                int iH2 = H2(eVar, i6);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i13 = i10;
                boolean z3 = (i11 == i6 || (this.P1 + i11) + iH2 > i6) && aVar.f11879b != null;
                if (!z3 && i12 > 0 && (i9 = this.U1) > 0 && i12 % i9 == 0) {
                    z3 = true;
                }
                if (z3) {
                    aVar = new a(i5, this.J, this.K, this.L, this.M, i6);
                    aVar.i(i12);
                    this.W1.add(aVar);
                } else {
                    if (i12 > 0) {
                        i11 += this.P1 + iH2;
                    }
                    aVar.b(eVar);
                    i12++;
                    i10 = i13;
                }
                i11 = iH2;
                aVar.b(eVar);
                i12++;
                i10 = i13;
            }
        } else {
            while (i12 < i4) {
                e eVar2 = eVarArr[i12];
                int iG2 = G2(eVar2, i6);
                if (eVar2.g0() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i14 = i10;
                boolean z4 = (i11 == i6 || (this.Q1 + i11) + iG2 > i6) && aVar.f11879b != null;
                if (!z4 && i12 > 0 && (i7 = this.U1) > 0 && i12 % i7 == 0) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i5, this.J, this.K, this.L, this.M, i6);
                    aVar.i(i12);
                    this.W1.add(aVar);
                } else {
                    if (i12 > 0) {
                        i11 += this.Q1 + iG2;
                    }
                    aVar.b(eVar2);
                    i12++;
                    i10 = i14;
                }
                i11 = iG2;
                aVar.b(eVar2);
                i12++;
                i10 = i14;
            }
        }
        int size = this.W1.size();
        d dVar3 = this.J;
        d dVar4 = this.K;
        d dVar5 = this.L;
        d dVar6 = this.M;
        int iV1 = V1();
        int iX1 = X1();
        int iW12 = W1();
        int iU12 = U1();
        e.b bVarH = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z5 = bVarH == bVar || g0() == bVar;
        if (i10 > 0 && z5) {
            for (int i15 = 0; i15 < size; i15++) {
                a aVar2 = this.W1.get(i15);
                aVar2.g(i6 - (i5 == 0 ? aVar2.f() : aVar2.e()));
            }
        }
        int i16 = iX1;
        int i17 = iW12;
        int iE = 0;
        int iF = 0;
        int i18 = 0;
        int i19 = iV1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i20 = iU12;
        while (i18 < size) {
            a aVar3 = this.W1.get(i18);
            if (i5 == 0) {
                if (i18 < size - 1) {
                    dVar2 = this.W1.get(i18 + 1).f11879b.K;
                    iU1 = 0;
                } else {
                    dVar2 = this.M;
                    iU1 = U1();
                }
                d dVar9 = aVar3.f11879b.M;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i21 = iE;
                d dVar12 = dVar7;
                int i22 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i8 = i18;
                aVar3.j(i5, dVar10, dVar12, dVar13, dVar2, i19, i16, i17, iU1, i6);
                int iMax = Math.max(i22, aVar3.f());
                iE = i21 + aVar3.e();
                if (i8 > 0) {
                    iE += this.Q1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i16 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i23 = iU1;
                dVar6 = dVar2;
                i20 = i23;
            } else {
                d dVar15 = dVar8;
                int i24 = iE;
                int i25 = iF;
                i8 = i18;
                if (i8 < size - 1) {
                    dVar = this.W1.get(i8 + 1).f11879b.J;
                    iW1 = 0;
                } else {
                    dVar = this.L;
                    iW1 = W1();
                }
                d dVar16 = aVar3.f11879b.L;
                aVar3.j(i5, dVar15, dVar7, dVar, dVar6, i19, i16, iW1, i20, i6);
                iF = i25 + aVar3.f();
                int iMax2 = Math.max(i24, aVar3.e());
                if (i8 > 0) {
                    iF += this.P1;
                }
                iE = iMax2;
                i19 = 0;
                i17 = iW1;
                dVar8 = dVar16;
            }
            i18 = i8 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    public final void K2(e[] eVarArr, int i4, int i5, int i6, int[] iArr) {
        a aVar;
        if (i4 == 0) {
            return;
        }
        if (this.W1.size() == 0) {
            aVar = new a(i5, this.J, this.K, this.L, this.M, i6);
            this.W1.add(aVar);
        } else {
            a aVar2 = this.W1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i5, this.J, this.K, this.L, this.M, V1(), X1(), W1(), U1(), i6);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            aVar.b(eVarArr[i7]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void L2(float f4) {
        this.L1 = f4;
    }

    public void M2(int i4) {
        this.F1 = i4;
    }

    public void N2(float f4) {
        this.M1 = f4;
    }

    public void O2(int i4) {
        this.G1 = i4;
    }

    public void P2(int i4) {
        this.R1 = i4;
    }

    public void Q2(float f4) {
        this.J1 = f4;
    }

    public void R2(int i4) {
        this.P1 = i4;
    }

    public void S2(int i4) {
        this.D1 = i4;
    }

    public void T2(float f4) {
        this.N1 = f4;
    }

    public void U2(int i4) {
        this.H1 = i4;
    }

    public void V2(float f4) {
        this.O1 = f4;
    }

    public void W2(int i4) {
        this.I1 = i4;
    }

    public void X2(int i4) {
        this.U1 = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // v.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y1(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.Y1(int, int, int, int):void");
    }

    public void Y2(int i4) {
        this.V1 = i4;
    }

    public void Z2(int i4) {
        this.S1 = i4;
    }

    public void a3(float f4) {
        this.K1 = f4;
    }

    public void b3(int i4) {
        this.Q1 = i4;
    }

    public void c3(int i4) {
        this.E1 = i4;
    }

    public void d3(int i4) {
        this.T1 = i4;
    }

    @Override // v.e
    public void g(s.e eVar, boolean z3) {
        super.g(eVar, z3);
        boolean zS2 = U() != null ? ((f) U()).s2() : false;
        int i4 = this.T1;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = this.W1.size();
                int i5 = 0;
                while (i5 < size) {
                    this.W1.get(i5).d(zS2, i5, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 == 2) {
                F2(zS2);
            }
        } else if (this.W1.size() > 0) {
            this.W1.get(0).d(zS2, 0, true);
        }
        c2(false);
    }

    @Override // v.j, v.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        g gVar = (g) eVar;
        this.D1 = gVar.D1;
        this.E1 = gVar.E1;
        this.F1 = gVar.F1;
        this.G1 = gVar.G1;
        this.H1 = gVar.H1;
        this.I1 = gVar.I1;
        this.J1 = gVar.J1;
        this.K1 = gVar.K1;
        this.L1 = gVar.L1;
        this.M1 = gVar.M1;
        this.N1 = gVar.N1;
        this.O1 = gVar.O1;
        this.P1 = gVar.P1;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
    }
}
