package v;

import java.util.HashMap;
import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    public static final int A1 = -1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f11896v1 = 0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f11897w1 = 1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f11898x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f11899y1 = 1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f11900z1 = 2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public float f11901o1 = -1.0f;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f11902p1 = -1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f11903q1 = -1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public d f11904r1 = this.K;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f11905s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f11906t1 = 0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f11907u1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11908a;

        static {
            int[] iArr = new int[d.b.values().length];
            f11908a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11908a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11908a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11908a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11908a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11908a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11908a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11908a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11908a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.S.clear();
        this.S.add(this.f11904r1);
        int length = this.R.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.R[i4] = this.f11904r1;
        }
    }

    @Override // v.e
    public void N1(s.e eVar, boolean z3) {
        if (U() == null) {
            return;
        }
        int iO = eVar.O(this.f11904r1);
        if (this.f11905s1 == 1) {
            J1(iO);
            K1(0);
            d1(U().D());
            H1(0);
            return;
        }
        J1(0);
        K1(iO);
        H1(U().j0());
        d1(0);
    }

    public void O1() {
        if (this.f11902p1 != -1) {
            X1();
        } else if (this.f11901o1 != -1.0f) {
            W1();
        } else if (this.f11903q1 != -1) {
            V1();
        }
    }

    public d P1() {
        return this.f11904r1;
    }

    public int Q1() {
        return this.f11905s1;
    }

    public int R1() {
        return this.f11902p1;
    }

    public int S1() {
        if (this.f11901o1 != -1.0f) {
            return 0;
        }
        if (this.f11902p1 != -1) {
            return 1;
        }
        return this.f11903q1 != -1 ? 2 : -1;
    }

    public int T1() {
        return this.f11903q1;
    }

    public float U1() {
        return this.f11901o1;
    }

    public void V1() {
        int iK0 = k0();
        if (this.f11905s1 == 0) {
            iK0 = l0();
        }
        a2(iK0);
    }

    public void W1() {
        int iJ0 = U().j0() - k0();
        if (this.f11905s1 == 0) {
            iJ0 = U().D() - l0();
        }
        b2(iJ0);
    }

    public void X1() {
        float fK0 = k0() / U().j0();
        if (this.f11905s1 == 0) {
            fK0 = l0() / U().D();
        }
        c2(fK0);
    }

    public boolean Y1() {
        return this.f11901o1 != -1.0f && this.f11902p1 == -1 && this.f11903q1 == -1;
    }

    public void Z1(int i4) {
        this.f11904r1.A(i4);
        this.f11907u1 = true;
    }

    public void a2(int i4) {
        if (i4 > -1) {
            this.f11901o1 = -1.0f;
            this.f11902p1 = i4;
            this.f11903q1 = -1;
        }
    }

    public void b2(int i4) {
        if (i4 > -1) {
            this.f11901o1 = -1.0f;
            this.f11902p1 = -1;
            this.f11903q1 = i4;
        }
    }

    @Override // v.e
    public String c0() {
        return "Guideline";
    }

    public void c2(float f4) {
        if (f4 > -1.0f) {
            this.f11901o1 = f4;
            this.f11902p1 = -1;
            this.f11903q1 = -1;
        }
    }

    public void d2(int i4) {
        c2(i4 / 100.0f);
    }

    public void e2(int i4) {
        this.f11906t1 = i4;
    }

    public void f2(int i4) {
        if (this.f11905s1 == i4) {
            return;
        }
        this.f11905s1 = i4;
        this.S.clear();
        this.f11904r1 = this.f11905s1 == 1 ? this.J : this.K;
        this.S.add(this.f11904r1);
        int length = this.R.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.R[i5] = this.f11904r1;
        }
    }

    @Override // v.e
    public void g(s.e eVar, boolean z3) {
        f fVar = (f) U();
        if (fVar == null) {
            return;
        }
        d dVarR = fVar.r(d.b.LEFT);
        d dVarR2 = fVar.r(d.b.RIGHT);
        e eVar2 = this.V;
        boolean z4 = eVar2 != null && eVar2.U[0] == e.b.WRAP_CONTENT;
        if (this.f11905s1 == 0) {
            dVarR = fVar.r(d.b.TOP);
            dVarR2 = fVar.r(d.b.BOTTOM);
            e eVar3 = this.V;
            z4 = eVar3 != null && eVar3.U[1] == e.b.WRAP_CONTENT;
        }
        if (this.f11907u1 && this.f11904r1.o()) {
            s.i iVarU = eVar.u(this.f11904r1);
            eVar.f(iVarU, this.f11904r1.f());
            if (this.f11902p1 != -1) {
                if (z4) {
                    eVar.i(eVar.u(dVarR2), iVarU, 0, 5);
                }
            } else if (this.f11903q1 != -1 && z4) {
                s.i iVarU2 = eVar.u(dVarR2);
                eVar.i(iVarU, eVar.u(dVarR), 0, 5);
                eVar.i(iVarU2, iVarU, 0, 5);
            }
            this.f11907u1 = false;
            return;
        }
        if (this.f11902p1 != -1) {
            s.i iVarU3 = eVar.u(this.f11904r1);
            eVar.e(iVarU3, eVar.u(dVarR), this.f11902p1, 8);
            if (z4) {
                eVar.i(eVar.u(dVarR2), iVarU3, 0, 5);
                return;
            }
            return;
        }
        if (this.f11903q1 == -1) {
            if (this.f11901o1 != -1.0f) {
                eVar.d(s.e.w(eVar, eVar.u(this.f11904r1), eVar.u(dVarR2), this.f11901o1));
                return;
            }
            return;
        }
        s.i iVarU4 = eVar.u(this.f11904r1);
        s.i iVarU5 = eVar.u(dVarR2);
        eVar.e(iVarU4, iVarU5, -this.f11903q1, 8);
        if (z4) {
            eVar.i(iVarU4, eVar.u(dVarR), 0, 5);
            eVar.i(iVarU5, iVarU4, 0, 5);
        }
    }

    @Override // v.e
    public boolean h() {
        return true;
    }

    @Override // v.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        h hVar = (h) eVar;
        this.f11901o1 = hVar.f11901o1;
        this.f11902p1 = hVar.f11902p1;
        this.f11903q1 = hVar.f11903q1;
        f2(hVar.f11905s1);
    }

    @Override // v.e
    public d r(d.b bVar) {
        switch (a.f11908a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f11905s1 == 1) {
                    return this.f11904r1;
                }
                break;
            case 3:
            case 4:
                if (this.f11905s1 == 0) {
                    return this.f11904r1;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    @Override // v.e
    public boolean x0() {
        return this.f11907u1;
    }

    @Override // v.e
    public boolean y0() {
        return this.f11907u1;
    }
}
