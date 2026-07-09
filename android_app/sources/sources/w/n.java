package w;

import v.e;
import w.f;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f12360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f12361l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12362a;

        static {
            int[] iArr = new int[p.b.values().length];
            f12362a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12362a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12362a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(v.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f12360k = fVar;
        this.f12361l = null;
        this.f12386h.f12324e = f.a.TOP;
        this.f12387i.f12324e = f.a.BOTTOM;
        fVar.f12324e = f.a.BASELINE;
        this.f12384f = 1;
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        int i4;
        float fA;
        int i5 = a.f12362a[this.f12388j.ordinal()];
        if (i5 == 1) {
            s(dVar);
        } else if (i5 == 2) {
            r(dVar);
        } else if (i5 == 3) {
            v.e eVar = this.f12380b;
            q(dVar, eVar.K, eVar.M, 1);
            return;
        }
        g gVar = this.f12383e;
        if (gVar.f12322c && !gVar.f12329j && this.f12382d == e.b.MATCH_CONSTRAINT) {
            v.e eVar2 = this.f12380b;
            int i6 = eVar2.f11828q;
            if (i6 == 2) {
                v.e eVarU = eVar2.U();
                if (eVarU != null) {
                    if (eVarU.f11806f.f12383e.f12329j) {
                        i4 = (int) ((r7.f12326g * this.f12380b.f11842x) + 0.5f);
                        this.f12383e.e(i4);
                    }
                }
            } else if (i6 == 3 && eVar2.f11804e.f12383e.f12329j) {
                int iB = eVar2.B();
                if (iB == -1) {
                    fA = r7.f11804e.f12383e.f12326g / this.f12380b.A();
                    i4 = (int) (fA + 0.5f);
                    this.f12383e.e(i4);
                } else if (iB != 0) {
                    if (iB != 1) {
                        i4 = 0;
                        this.f12383e.e(i4);
                    }
                    fA = r7.f11804e.f12383e.f12326g / this.f12380b.A();
                    i4 = (int) (fA + 0.5f);
                    this.f12383e.e(i4);
                } else {
                    fA = r7.f11804e.f12383e.f12326g * this.f12380b.A();
                    i4 = (int) (fA + 0.5f);
                    this.f12383e.e(i4);
                }
            }
        }
        f fVar = this.f12386h;
        if (fVar.f12322c) {
            f fVar2 = this.f12387i;
            if (fVar2.f12322c) {
                if (fVar.f12329j && fVar2.f12329j && this.f12383e.f12329j) {
                    return;
                }
                if (!this.f12383e.f12329j && this.f12382d == e.b.MATCH_CONSTRAINT) {
                    v.e eVar3 = this.f12380b;
                    if (eVar3.f11826p == 0 && !eVar3.u0()) {
                        f fVar3 = this.f12386h.f12331l.get(0);
                        f fVar4 = this.f12387i.f12331l.get(0);
                        int i7 = fVar3.f12326g;
                        f fVar5 = this.f12386h;
                        int i8 = i7 + fVar5.f12325f;
                        int i9 = fVar4.f12326g + this.f12387i.f12325f;
                        fVar5.e(i8);
                        this.f12387i.e(i9);
                        this.f12383e.e(i9 - i8);
                        return;
                    }
                }
                if (!this.f12383e.f12329j && this.f12382d == e.b.MATCH_CONSTRAINT && this.f12379a == 1 && this.f12386h.f12331l.size() > 0 && this.f12387i.f12331l.size() > 0) {
                    f fVar6 = this.f12386h.f12331l.get(0);
                    int i10 = (this.f12387i.f12331l.get(0).f12326g + this.f12387i.f12325f) - (fVar6.f12326g + this.f12386h.f12325f);
                    g gVar2 = this.f12383e;
                    int i11 = gVar2.f12341m;
                    if (i10 < i11) {
                        gVar2.e(i10);
                    } else {
                        gVar2.e(i11);
                    }
                }
                if (this.f12383e.f12329j && this.f12386h.f12331l.size() > 0 && this.f12387i.f12331l.size() > 0) {
                    f fVar7 = this.f12386h.f12331l.get(0);
                    f fVar8 = this.f12387i.f12331l.get(0);
                    int i12 = fVar7.f12326g + this.f12386h.f12325f;
                    int i13 = fVar8.f12326g + this.f12387i.f12325f;
                    float fD0 = this.f12380b.d0();
                    if (fVar7 == fVar8) {
                        i12 = fVar7.f12326g;
                        i13 = fVar8.f12326g;
                        fD0 = 0.5f;
                    }
                    this.f12386h.e((int) (i12 + 0.5f + (((i13 - i12) - this.f12383e.f12326g) * fD0)));
                    this.f12387i.e(this.f12386h.f12326g + this.f12383e.f12326g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.f12380b.m0() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.f12360k;
        r1 = r10.f12386h;
        r2 = r10.f12361l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.f12380b.m0() != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d5 A[PHI: r0
      0x03d5: PHI (r0v32 w.l) = (r0v23 w.l), (r0v47 w.l) binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    @Override // w.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.d():void");
    }

    @Override // w.p
    public void e() {
        f fVar = this.f12386h;
        if (fVar.f12329j) {
            this.f12380b.K1(fVar.f12326g);
        }
    }

    @Override // w.p
    public void f() {
        this.f12381c = null;
        this.f12386h.c();
        this.f12387i.c();
        this.f12360k.c();
        this.f12383e.c();
        this.f12385g = false;
    }

    @Override // w.p
    public void n() {
        this.f12385g = false;
        this.f12386h.c();
        this.f12386h.f12329j = false;
        this.f12387i.c();
        this.f12387i.f12329j = false;
        this.f12360k.c();
        this.f12360k.f12329j = false;
        this.f12383e.f12329j = false;
    }

    @Override // w.p
    public boolean p() {
        return this.f12382d != e.b.MATCH_CONSTRAINT || this.f12380b.f11828q == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f12380b.y();
    }
}
