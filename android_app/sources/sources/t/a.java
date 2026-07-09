package t;

import java.util.ArrayList;
import t.e;
import v.d;

/* JADX INFO: loaded from: classes.dex */
public class a implements d {
    public t.b G;
    public t.b H;
    public Object I;
    public v.e J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11341c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11342d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11343e = 0.5f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11344f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11345g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11346h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11347i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11348j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11349k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11350l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11351m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11352n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11353o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11354p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11355q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11356r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f11357s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f11358t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f11359u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f11360v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f11361w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f11362x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f11363y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f11364z = null;
    public Object A = null;
    public Object B = null;
    public Object C = null;
    public Object D = null;
    public Object E = null;
    public e.c F = null;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11365a;

        static {
            int[] iArr = new int[e.c.values().length];
            f11365a = iArr;
            try {
                iArr[e.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11365a[e.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11365a[e.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11365a[e.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11365a[e.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11365a[e.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11365a[e.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11365a[e.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11365a[e.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11365a[e.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11365a[e.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11365a[e.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11365a[e.c.BASELINE_TO_BASELINE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11365a[e.c.CENTER_HORIZONTALLY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11365a[e.c.CENTER_VERTICALLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public interface b {
        a a(e eVar);
    }

    public class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<String> f11366b;

        public c(ArrayList<String> arrayList) {
            this.f11366b = arrayList;
        }

        public ArrayList<String> a() {
            return this.f11366b;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f11366b.toString();
        }
    }

    public a(e eVar) {
        Object obj = t.b.f11369j;
        this.G = t.b.b(obj);
        this.H = t.b.b(obj);
        this.f11340b = eVar;
    }

    public Object A() {
        return this.I;
    }

    public t.b B() {
        return this.G;
    }

    public a C(t.b bVar) {
        return N(bVar);
    }

    public a D(float f4) {
        this.f11343e = f4;
        return this;
    }

    public a E() {
        this.F = this.f11357s != null ? e.c.LEFT_TO_LEFT : e.c.LEFT_TO_RIGHT;
        return this;
    }

    public a F(Object obj) {
        this.F = e.c.LEFT_TO_LEFT;
        this.f11357s = obj;
        return this;
    }

    public a G(Object obj) {
        this.F = e.c.LEFT_TO_RIGHT;
        this.f11358t = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a H(int i4) {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0113a.f11365a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f11345g = i4;
                    break;
                case 3:
                case 4:
                    this.f11346h = i4;
                    break;
                case 5:
                case 6:
                    this.f11347i = i4;
                    break;
                case 7:
                case 8:
                    this.f11348j = i4;
                    break;
                case 9:
                case 10:
                    this.f11349k = i4;
                    break;
            }
        } else {
            this.f11345g = i4;
            this.f11346h = i4;
            this.f11347i = i4;
            this.f11348j = i4;
            this.f11349k = i4;
        }
        this.f11350l = i4;
        return this;
    }

    public a I(Object obj) {
        return H(this.f11340b.f(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a J(int i4) {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0113a.f11365a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f11351m = i4;
                    break;
                case 3:
                case 4:
                    this.f11352n = i4;
                    break;
                case 5:
                case 6:
                    this.f11353o = i4;
                    break;
                case 7:
                case 8:
                    this.f11354p = i4;
                    break;
                case 9:
                case 10:
                    this.f11355q = i4;
                    break;
            }
        } else {
            this.f11351m = i4;
            this.f11352n = i4;
            this.f11353o = i4;
            this.f11354p = i4;
            this.f11355q = i4;
        }
        this.f11356r = i4;
        return this;
    }

    public a K() {
        this.F = this.f11359u != null ? e.c.RIGHT_TO_LEFT : e.c.RIGHT_TO_RIGHT;
        return this;
    }

    public a L(Object obj) {
        this.F = e.c.RIGHT_TO_LEFT;
        this.f11359u = obj;
        return this;
    }

    public a M(Object obj) {
        this.F = e.c.RIGHT_TO_RIGHT;
        this.f11360v = obj;
        return this;
    }

    public a N(t.b bVar) {
        this.H = bVar;
        return this;
    }

    public void O(int i4) {
        this.f11341c = i4;
    }

    public void P(int i4) {
        this.f11342d = i4;
    }

    public void Q(Object obj) {
        this.I = obj;
        v.e eVar = this.J;
        if (eVar != null) {
            eVar.M0(obj);
        }
    }

    public a R(t.b bVar) {
        this.G = bVar;
        return this;
    }

    public a S() {
        this.F = this.f11361w != null ? e.c.START_TO_START : e.c.START_TO_END;
        return this;
    }

    public a T(Object obj) {
        this.F = e.c.START_TO_END;
        this.f11362x = obj;
        return this;
    }

    public a U(Object obj) {
        this.F = e.c.START_TO_START;
        this.f11361w = obj;
        return this;
    }

    public a V() {
        this.F = this.A != null ? e.c.TOP_TO_TOP : e.c.TOP_TO_BOTTOM;
        return this;
    }

    public a W(Object obj) {
        this.F = e.c.TOP_TO_BOTTOM;
        this.B = obj;
        return this;
    }

    public a X(Object obj) {
        this.F = e.c.TOP_TO_TOP;
        this.A = obj;
        return this;
    }

    public void Y() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.f11357s != null && this.f11358t != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f11359u != null && this.f11360v != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f11361w != null && this.f11362x != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f11363y != null && this.f11364z != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f11357s != null || this.f11358t != null || this.f11359u != null || this.f11360v != null) && (this.f11361w != null || this.f11362x != null || this.f11363y != null || this.f11364z != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public a Z(float f4) {
        this.f11344f = f4;
        return this;
    }

    @Override // t.d
    public void a(v.e eVar) {
        if (eVar == null) {
            return;
        }
        this.J = eVar;
        eVar.M0(this.I);
    }

    public a a0(t.b bVar) {
        return R(bVar);
    }

    @Override // t.d
    public void b() {
        v.e eVar = this.J;
        if (eVar == null) {
            return;
        }
        this.G.i(this.f11340b, eVar, 0);
        this.H.i(this.f11340b, this.J, 1);
        r();
        e(this.J, this.f11357s, e.c.LEFT_TO_LEFT);
        e(this.J, this.f11358t, e.c.LEFT_TO_RIGHT);
        e(this.J, this.f11359u, e.c.RIGHT_TO_LEFT);
        e(this.J, this.f11360v, e.c.RIGHT_TO_RIGHT);
        e(this.J, this.f11361w, e.c.START_TO_START);
        e(this.J, this.f11362x, e.c.START_TO_END);
        e(this.J, this.f11363y, e.c.END_TO_START);
        e(this.J, this.f11364z, e.c.END_TO_END);
        e(this.J, this.A, e.c.TOP_TO_TOP);
        e(this.J, this.B, e.c.TOP_TO_BOTTOM);
        e(this.J, this.C, e.c.BOTTOM_TO_TOP);
        e(this.J, this.D, e.c.BOTTOM_TO_BOTTOM);
        e(this.J, this.E, e.c.BASELINE_TO_BASELINE);
        int i4 = this.f11341c;
        if (i4 != 0) {
            this.J.g1(i4);
        }
        int i5 = this.f11342d;
        if (i5 != 0) {
            this.J.B1(i5);
        }
        this.J.f1(this.f11343e);
        this.J.A1(this.f11344f);
    }

    @Override // t.d
    public void c(Object obj) {
        this.f11339a = obj;
    }

    @Override // t.d
    public v.e d() {
        if (this.J == null) {
            v.e eVarQ = q();
            this.J = eVarQ;
            eVarQ.M0(this.I);
        }
        return this.J;
    }

    public final void e(v.e eVar, Object obj, e.c cVar) {
        d.b bVar;
        v.d dVarR;
        v.d dVarR2;
        int i4;
        int i5;
        d.b bVar2;
        d.b bVar3;
        d.b bVar4;
        d.b bVar5;
        d.b bVar6;
        v.e eVarY = y(obj);
        if (eVarY == null) {
        }
        int[] iArr = C0113a.f11365a;
        int i6 = iArr[cVar.ordinal()];
        switch (iArr[cVar.ordinal()]) {
            case 1:
                bVar = d.b.LEFT;
                dVarR = eVar.r(bVar);
                dVarR2 = eVarY.r(bVar);
                i4 = this.f11345g;
                i5 = this.f11351m;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 2:
                dVarR = eVar.r(d.b.LEFT);
                bVar = d.b.RIGHT;
                dVarR2 = eVarY.r(bVar);
                i4 = this.f11345g;
                i5 = this.f11351m;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 3:
                dVarR = eVar.r(d.b.RIGHT);
                bVar2 = d.b.LEFT;
                dVarR2 = eVarY.r(bVar2);
                i4 = this.f11346h;
                i5 = this.f11352n;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 4:
                bVar2 = d.b.RIGHT;
                dVarR = eVar.r(bVar2);
                dVarR2 = eVarY.r(bVar2);
                i4 = this.f11346h;
                i5 = this.f11352n;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 5:
                bVar3 = d.b.LEFT;
                dVarR = eVar.r(bVar3);
                dVarR2 = eVarY.r(bVar3);
                i4 = this.f11347i;
                i5 = this.f11353o;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 6:
                dVarR = eVar.r(d.b.LEFT);
                bVar3 = d.b.RIGHT;
                dVarR2 = eVarY.r(bVar3);
                i4 = this.f11347i;
                i5 = this.f11353o;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 7:
                dVarR = eVar.r(d.b.RIGHT);
                bVar4 = d.b.LEFT;
                dVarR2 = eVarY.r(bVar4);
                i4 = this.f11348j;
                i5 = this.f11354p;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 8:
                bVar4 = d.b.RIGHT;
                dVarR = eVar.r(bVar4);
                dVarR2 = eVarY.r(bVar4);
                i4 = this.f11348j;
                i5 = this.f11354p;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 9:
                bVar5 = d.b.TOP;
                dVarR = eVar.r(bVar5);
                dVarR2 = eVarY.r(bVar5);
                i4 = this.f11349k;
                i5 = this.f11355q;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 10:
                dVarR = eVar.r(d.b.TOP);
                bVar5 = d.b.BOTTOM;
                dVarR2 = eVarY.r(bVar5);
                i4 = this.f11349k;
                i5 = this.f11355q;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 11:
                dVarR = eVar.r(d.b.BOTTOM);
                bVar6 = d.b.TOP;
                dVarR2 = eVarY.r(bVar6);
                i4 = this.f11350l;
                i5 = this.f11356r;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 12:
                bVar6 = d.b.BOTTOM;
                dVarR = eVar.r(bVar6);
                dVarR2 = eVarY.r(bVar6);
                i4 = this.f11350l;
                i5 = this.f11356r;
                dVarR.b(dVarR2, i4, i5, false);
                break;
            case 13:
                d.b bVar7 = d.b.BASELINE;
                eVar.p0(bVar7, eVarY, bVar7, 0, 0);
                break;
        }
    }

    public a f() {
        this.F = e.c.BASELINE_TO_BASELINE;
        return this;
    }

    public a g(Object obj) {
        this.F = e.c.BASELINE_TO_BASELINE;
        this.E = obj;
        return this;
    }

    @Override // t.d
    public Object getKey() {
        return this.f11339a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a h(float f4) {
        e.c cVar = this.F;
        if (cVar == null) {
            return this;
        }
        switch (C0113a.f11365a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 14:
                this.f11343e = f4;
                return this;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
                this.f11344f = f4;
                return this;
            case 13:
            default:
                return this;
        }
    }

    public a i() {
        this.F = this.C != null ? e.c.BOTTOM_TO_TOP : e.c.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a j(Object obj) {
        this.F = e.c.BOTTOM_TO_BOTTOM;
        this.D = obj;
        return this;
    }

    public a k(Object obj) {
        this.F = e.c.BOTTOM_TO_TOP;
        this.C = obj;
        return this;
    }

    public a l(Object obj) {
        Object objV = v(obj);
        this.f11361w = objV;
        this.f11364z = objV;
        this.F = e.c.CENTER_HORIZONTALLY;
        this.f11343e = 0.5f;
        return this;
    }

    public a m(Object obj) {
        Object objV = v(obj);
        this.A = objV;
        this.D = objV;
        this.F = e.c.CENTER_VERTICALLY;
        this.f11344f = 0.5f;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a n() {
        e.c cVar = this.F;
        if (cVar != null) {
            switch (C0113a.f11365a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f11357s = null;
                    this.f11358t = null;
                    this.f11345g = 0;
                    this.f11351m = 0;
                    break;
                case 3:
                case 4:
                    this.f11359u = null;
                    this.f11360v = null;
                    this.f11346h = 0;
                    this.f11352n = 0;
                    break;
                case 5:
                case 6:
                    this.f11361w = null;
                    this.f11362x = null;
                    this.f11347i = 0;
                    this.f11353o = 0;
                    break;
                case 7:
                case 8:
                    this.f11363y = null;
                    this.f11364z = null;
                    this.f11348j = 0;
                    this.f11354p = 0;
                    break;
                case 9:
                case 10:
                    this.A = null;
                    this.B = null;
                    this.f11349k = 0;
                    this.f11355q = 0;
                    break;
                case 11:
                case 12:
                    this.C = null;
                    this.D = null;
                    this.f11350l = 0;
                    break;
                case 13:
                    this.E = null;
                    break;
            }
        } else {
            this.f11357s = null;
            this.f11358t = null;
            this.f11345g = 0;
            this.f11359u = null;
            this.f11360v = null;
            this.f11346h = 0;
            this.f11361w = null;
            this.f11362x = null;
            this.f11347i = 0;
            this.f11363y = null;
            this.f11364z = null;
            this.f11348j = 0;
            this.A = null;
            this.B = null;
            this.f11349k = 0;
            this.C = null;
            this.D = null;
            this.f11350l = 0;
            this.E = null;
            this.f11343e = 0.5f;
            this.f11344f = 0.5f;
            this.f11351m = 0;
            this.f11352n = 0;
            this.f11353o = 0;
            this.f11354p = 0;
            this.f11355q = 0;
        }
        this.f11356r = 0;
        return this;
    }

    public a o() {
        S().n();
        s().n();
        E().n();
        K().n();
        return this;
    }

    public a p() {
        V().n();
        f().n();
        i().n();
        return this;
    }

    public v.e q() {
        return new v.e(B().m(), w().m());
    }

    public final void r() {
        this.f11357s = v(this.f11357s);
        this.f11358t = v(this.f11358t);
        this.f11359u = v(this.f11359u);
        this.f11360v = v(this.f11360v);
        this.f11361w = v(this.f11361w);
        this.f11362x = v(this.f11362x);
        this.f11363y = v(this.f11363y);
        this.f11364z = v(this.f11364z);
        this.A = v(this.A);
        this.B = v(this.B);
        this.C = v(this.C);
        this.D = v(this.D);
        this.E = v(this.E);
    }

    public a s() {
        this.F = this.f11363y != null ? e.c.END_TO_START : e.c.END_TO_END;
        return this;
    }

    public a t(Object obj) {
        this.F = e.c.END_TO_END;
        this.f11364z = obj;
        return this;
    }

    public a u(Object obj) {
        this.F = e.c.END_TO_START;
        this.f11363y = obj;
        return this;
    }

    public final Object v(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f11340b.p(obj) : obj;
    }

    public t.b w() {
        return this.H;
    }

    public int x() {
        return this.f11341c;
    }

    public final v.e y(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).d();
        }
        return null;
    }

    public int z(int i4) {
        return this.f11342d;
    }
}
