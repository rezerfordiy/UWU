package v;

import java.util.HashMap;
import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends j {

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f11726u1 = 0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f11727v1 = 1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f11728w1 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f11729x1 = 3;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final boolean f11730y1 = true;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final boolean f11731z1 = false;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f11732q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f11733r1 = true;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f11734s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f11735t1 = false;

    public a() {
    }

    public boolean Q1() {
        int i4;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i5;
        int i6;
        boolean z3 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f11910p1;
            if (i7 >= i4) {
                break;
            }
            e eVar = this.f11909o1[i7];
            if ((this.f11733r1 || eVar.h()) && ((((i5 = this.f11732q1) == 0 || i5 == 1) && !eVar.x0()) || (((i6 = this.f11732q1) == 2 || i6 == 3) && !eVar.y0()))) {
                z3 = false;
            }
            i7++;
        }
        if (!z3 || i4 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z4 = false;
        for (int i8 = 0; i8 < this.f11910p1; i8++) {
            e eVar2 = this.f11909o1[i8];
            if (this.f11733r1 || eVar2.h()) {
                if (!z4) {
                    int i9 = this.f11732q1;
                    if (i9 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i9 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i9 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i9 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z4 = true;
                    }
                    iMax = eVar2.r(bVar3).f();
                    z4 = true;
                }
                int i10 = this.f11732q1;
                if (i10 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i10 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i10 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i10 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.r(bVar).f());
                }
                iMax = Math.min(iMax, eVar2.r(bVar2).f());
            }
        }
        int i11 = iMax + this.f11734s1;
        int i12 = this.f11732q1;
        if (i12 == 0 || i12 == 1) {
            V0(i11, i11);
        } else {
            Y0(i11, i11);
        }
        this.f11735t1 = true;
        return true;
    }

    public boolean R1() {
        return this.f11733r1;
    }

    public int S1() {
        return this.f11732q1;
    }

    public int T1() {
        return this.f11734s1;
    }

    public int U1() {
        int i4 = this.f11732q1;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    public void V1() {
        for (int i4 = 0; i4 < this.f11910p1; i4++) {
            e eVar = this.f11909o1[i4];
            int i5 = this.f11732q1;
            if (i5 == 0 || i5 == 1) {
                eVar.l1(0, true);
            } else if (i5 == 2 || i5 == 3) {
                eVar.l1(1, true);
            }
        }
    }

    public void W1(boolean z3) {
        this.f11733r1 = z3;
    }

    public void X1(int i4) {
        this.f11732q1 = i4;
    }

    public void Y1(int i4) {
        this.f11734s1 = i4;
    }

    @Override // v.e
    public void g(s.e eVar, boolean z3) {
        d[] dVarArr;
        boolean z4;
        s.i iVar;
        d dVar;
        int i4;
        int i5;
        int i6;
        s.i iVar2;
        int i7;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i8 = 0;
        while (true) {
            dVarArr = this.R;
            if (i8 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i8];
            dVar2.f11770i = eVar.u(dVar2);
            i8++;
        }
        int i9 = this.f11732q1;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i9];
        if (!this.f11735t1) {
            Q1();
        }
        if (this.f11735t1) {
            this.f11735t1 = false;
            int i10 = this.f11732q1;
            if (i10 == 0 || i10 == 1) {
                eVar.f(this.J.f11770i, this.f11797a0);
                iVar2 = this.L.f11770i;
                i7 = this.f11797a0;
            } else {
                if (i10 != 2 && i10 != 3) {
                    return;
                }
                eVar.f(this.K.f11770i, this.f11799b0);
                iVar2 = this.M.f11770i;
                i7 = this.f11799b0;
            }
            eVar.f(iVar2, i7);
            return;
        }
        for (int i11 = 0; i11 < this.f11910p1; i11++) {
            e eVar2 = this.f11909o1[i11];
            if ((this.f11733r1 || eVar2.h()) && ((((i5 = this.f11732q1) == 0 || i5 == 1) && eVar2.H() == e.b.MATCH_CONSTRAINT && eVar2.J.f11767f != null && eVar2.L.f11767f != null) || (((i6 = this.f11732q1) == 2 || i6 == 3) && eVar2.g0() == e.b.MATCH_CONSTRAINT && eVar2.K.f11767f != null && eVar2.M.f11767f != null))) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        boolean z5 = this.J.m() || this.L.m();
        boolean z6 = this.K.m() || this.M.m();
        int i12 = !(!z4 && (((i4 = this.f11732q1) == 0 && z5) || ((i4 == 2 && z6) || ((i4 == 1 && z5) || (i4 == 3 && z6))))) ? 4 : 5;
        for (int i13 = 0; i13 < this.f11910p1; i13++) {
            e eVar3 = this.f11909o1[i13];
            if (this.f11733r1 || eVar3.h()) {
                s.i iVarU = eVar.u(eVar3.R[this.f11732q1]);
                d[] dVarArr3 = eVar3.R;
                int i14 = this.f11732q1;
                d dVar4 = dVarArr3[i14];
                dVar4.f11770i = iVarU;
                d dVar5 = dVar4.f11767f;
                int i15 = (dVar5 == null || dVar5.f11765d != this) ? 0 : dVar4.f11768g + 0;
                if (i14 == 0 || i14 == 2) {
                    eVar.j(dVar3.f11770i, iVarU, this.f11734s1 - i15, z4);
                } else {
                    eVar.h(dVar3.f11770i, iVarU, this.f11734s1 + i15, z4);
                }
                eVar.e(dVar3.f11770i, iVarU, this.f11734s1 + i15, i12);
            }
        }
        int i16 = this.f11732q1;
        if (i16 == 0) {
            eVar.e(this.L.f11770i, this.J.f11770i, 0, 8);
            eVar.e(this.J.f11770i, this.V.L.f11770i, 0, 4);
            iVar = this.J.f11770i;
            dVar = this.V.J;
        } else if (i16 == 1) {
            eVar.e(this.J.f11770i, this.L.f11770i, 0, 8);
            eVar.e(this.J.f11770i, this.V.J.f11770i, 0, 4);
            iVar = this.J.f11770i;
            dVar = this.V.L;
        } else if (i16 == 2) {
            eVar.e(this.M.f11770i, this.K.f11770i, 0, 8);
            eVar.e(this.K.f11770i, this.V.M.f11770i, 0, 4);
            iVar = this.K.f11770i;
            dVar = this.V.K;
        } else {
            if (i16 != 3) {
                return;
            }
            eVar.e(this.K.f11770i, this.M.f11770i, 0, 8);
            eVar.e(this.K.f11770i, this.V.K.f11770i, 0, 4);
            iVar = this.K.f11770i;
            dVar = this.V.M;
        }
        eVar.e(iVar, dVar.f11770i, 0, 0);
    }

    @Override // v.e
    public boolean h() {
        return true;
    }

    @Override // v.j, v.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        a aVar = (a) eVar;
        this.f11732q1 = aVar.f11732q1;
        this.f11733r1 = aVar.f11733r1;
        this.f11734s1 = aVar.f11734s1;
    }

    @Override // v.e
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i4 = 0; i4 < this.f11910p1; i4++) {
            e eVar = this.f11909o1[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + eVar.y();
        }
        return str + "}";
    }

    @Override // v.e
    public boolean x0() {
        return this.f11735t1;
    }

    @Override // v.e
    public boolean y0() {
        return this.f11735t1;
    }

    public a(String str) {
        O0(str);
    }
}
