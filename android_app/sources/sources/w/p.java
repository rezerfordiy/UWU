package w;

import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.e f12380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f12381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.b f12382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f12383e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12384f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12385g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f12386h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f12387i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f12388j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12389a;

        static {
            int[] iArr = new int[d.b.values().length];
            f12389a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12389a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12389a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12389a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12389a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(v.e eVar) {
        this.f12380b = eVar;
    }

    @Override // w.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i4) {
        fVar.f12331l.add(fVar2);
        fVar.f12325f = i4;
        fVar2.f12330k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f12331l.add(fVar2);
        fVar.f12331l.add(this.f12383e);
        fVar.f12327h = i4;
        fVar.f12328i = gVar;
        fVar2.f12330k.add(fVar);
        gVar.f12330k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i5) {
        int iMax;
        if (i5 == 0) {
            v.e eVar = this.f12380b;
            int i6 = eVar.f11834t;
            iMax = Math.max(eVar.f11832s, i4);
            if (i6 > 0) {
                iMax = Math.min(i6, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        } else {
            v.e eVar2 = this.f12380b;
            int i7 = eVar2.f11840w;
            iMax = Math.max(eVar2.f11838v, i4);
            if (i7 > 0) {
                iMax = Math.min(i7, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        }
        return iMax;
    }

    public final f h(v.d dVar) {
        p pVar;
        p pVar2;
        v.d dVar2 = dVar.f11767f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f11765d;
        int i4 = a.f12389a[dVar2.f11766e.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                pVar2 = eVar.f11804e;
            } else if (i4 == 3) {
                pVar = eVar.f11806f;
            } else {
                if (i4 == 4) {
                    return eVar.f11806f.f12360k;
                }
                if (i4 != 5) {
                    return null;
                }
                pVar2 = eVar.f11806f;
            }
            return pVar2.f12387i;
        }
        pVar = eVar.f11804e;
        return pVar.f12386h;
    }

    public final f i(v.d dVar, int i4) {
        v.d dVar2 = dVar.f11767f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f11765d;
        p pVar = i4 == 0 ? eVar.f11804e : eVar.f11806f;
        int i5 = a.f12389a[dVar2.f11766e.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f12387i;
        }
        return pVar.f12386h;
    }

    public long j() {
        if (this.f12383e.f12329j) {
            return r0.f12326g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f12386h.f12331l.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f12386h.f12331l.get(i5).f12323d != this) {
                i4++;
            }
        }
        int size2 = this.f12387i.f12331l.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (this.f12387i.f12331l.get(i6).f12323d != this) {
                i4++;
            }
        }
        return i4 >= 2;
    }

    public boolean l() {
        return this.f12383e.f12329j;
    }

    public boolean m() {
        return this.f12385g;
    }

    public abstract void n();

    public final void o(int i4, int i5) {
        g gVar;
        int iG;
        int i6 = this.f12379a;
        if (i6 == 0) {
            gVar = this.f12383e;
            iG = g(i5, i4);
        } else if (i6 == 1) {
            int iG2 = g(this.f12383e.f12341m, i4);
            gVar = this.f12383e;
            iG = Math.min(iG2, i5);
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    return;
                }
                v.e eVar = this.f12380b;
                p pVar = eVar.f11804e;
                e.b bVar = pVar.f12382d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f12379a == 3) {
                    n nVar = eVar.f11806f;
                    if (nVar.f12382d == bVar2 && nVar.f12379a == 3) {
                        return;
                    }
                }
                if (i4 == 0) {
                    pVar = eVar.f11806f;
                }
                if (pVar.f12383e.f12329j) {
                    float fA = eVar.A();
                    this.f12383e.e(i4 == 1 ? (int) ((pVar.f12383e.f12326g / fA) + 0.5f) : (int) ((fA * pVar.f12383e.f12326g) + 0.5f));
                    return;
                }
                return;
            }
            v.e eVarU = this.f12380b.U();
            if (eVarU == null) {
                return;
            }
            if (!(i4 == 0 ? eVarU.f11804e : eVarU.f11806f).f12383e.f12329j) {
                return;
            }
            v.e eVar2 = this.f12380b;
            i5 = (int) ((r9.f12326g * (i4 == 0 ? eVar2.f11836u : eVar2.f11842x)) + 0.5f);
            gVar = this.f12383e;
            iG = g(i5, i4);
        }
        gVar.e(iG);
    }

    public abstract boolean p();

    public void q(d dVar, v.d dVar2, v.d dVar3, int i4) {
        f fVar;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f12329j && fVarH2.f12329j) {
            int iG = fVarH.f12326g + dVar2.g();
            int iG2 = fVarH2.f12326g - dVar3.g();
            int i5 = iG2 - iG;
            if (!this.f12383e.f12329j && this.f12382d == e.b.MATCH_CONSTRAINT) {
                o(i4, i5);
            }
            g gVar = this.f12383e;
            if (gVar.f12329j) {
                if (gVar.f12326g == i5) {
                    this.f12386h.e(iG);
                    fVar = this.f12387i;
                } else {
                    v.e eVar = this.f12380b;
                    float fE = i4 == 0 ? eVar.E() : eVar.d0();
                    if (fVarH == fVarH2) {
                        iG = fVarH.f12326g;
                        iG2 = fVarH2.f12326g;
                        fE = 0.5f;
                    }
                    this.f12386h.e((int) (iG + 0.5f + (((iG2 - iG) - this.f12383e.f12326g) * fE)));
                    fVar = this.f12387i;
                    iG2 = this.f12386h.f12326g + this.f12383e.f12326g;
                }
                fVar.e(iG2);
            }
        }
    }

    public void r(d dVar) {
    }

    public void s(d dVar) {
    }

    public long t(int i4) {
        int i5;
        g gVar = this.f12383e;
        if (!gVar.f12329j) {
            return 0L;
        }
        long j4 = gVar.f12326g;
        if (k()) {
            i5 = this.f12386h.f12325f - this.f12387i.f12325f;
        } else {
            if (i4 != 0) {
                return j4 - ((long) this.f12387i.f12325f);
            }
            i5 = this.f12386h.f12325f;
        }
        return j4 + ((long) i5);
    }
}
