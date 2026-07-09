package s;

import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class h extends s.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f11001o = 1.0E-4f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f11002p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f11003q = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i[] f11005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i[] f11006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f11008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f11009n;

    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f11025c - iVar2.f11025c;
        }
    }

    public class b implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f11011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f11012c;

        public b(h hVar) {
            this.f11012c = hVar;
        }

        public void a(i iVar) {
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f11011b.f11031i;
                float f4 = fArr[i4] + iVar.f11031i[i4];
                fArr[i4] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f11011b.f11031i[i4] = 0.0f;
                }
            }
        }

        public boolean b(i iVar, float f4) {
            boolean z3 = true;
            if (!this.f11011b.f11023a) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f5 = iVar.f11031i[i4];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f4;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        this.f11011b.f11031i[i4] = f6;
                    } else {
                        this.f11011b.f11031i[i4] = 0.0f;
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f11011b.f11031i;
                float f7 = fArr[i5] + (iVar.f11031i[i5] * f4);
                fArr[i5] = f7;
                if (Math.abs(f7) < 1.0E-4f) {
                    this.f11011b.f11031i[i5] = 0.0f;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                h.this.J(this.f11011b);
            }
            return false;
        }

        public void c(i iVar) {
            this.f11011b = iVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f11011b.f11025c - ((i) obj).f11025c;
        }

        public final boolean d() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f11011b.f11031i[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i4 = 0; i4 < 9; i4++) {
                if (this.f11011b.f11031i[i4] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(i iVar) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = iVar.f11031i[i4];
                float f5 = this.f11011b.f11031i[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f11011b.f11031i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f11011b != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f11011b.f11031i[i4] + " ";
                }
            }
            return str + "] " + this.f11011b;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f11004i = 128;
        this.f11005j = new i[128];
        this.f11006k = new i[128];
        this.f11007l = 0;
        this.f11008m = new b(this);
        this.f11009n = cVar;
    }

    public final void I(i iVar) {
        int i4;
        int i5 = this.f11007l + 1;
        i[] iVarArr = this.f11005j;
        if (i5 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f11005j = iVarArr2;
            this.f11006k = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f11005j;
        int i6 = this.f11007l;
        iVarArr3[i6] = iVar;
        int i7 = i6 + 1;
        this.f11007l = i7;
        if (i7 > 1 && iVarArr3[i7 - 1].f11025c > iVar.f11025c) {
            int i8 = 0;
            while (true) {
                i4 = this.f11007l;
                if (i8 >= i4) {
                    break;
                }
                this.f11006k[i8] = this.f11005j[i8];
                i8++;
            }
            Arrays.sort(this.f11006k, 0, i4, new a());
            for (int i9 = 0; i9 < this.f11007l; i9++) {
                this.f11005j[i9] = this.f11006k[i9];
            }
        }
        iVar.f11023a = true;
        iVar.a(this);
    }

    public final void J(i iVar) {
        int i4 = 0;
        while (i4 < this.f11007l) {
            if (this.f11005j[i4] == iVar) {
                while (true) {
                    int i5 = this.f11007l;
                    if (i4 >= i5 - 1) {
                        this.f11007l = i5 - 1;
                        iVar.f11023a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f11005j;
                        int i6 = i4 + 1;
                        iVarArr[i4] = iVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // s.b, s.e.a
    public void a(i iVar) {
        this.f11008m.c(iVar);
        this.f11008m.g();
        iVar.f11031i[iVar.f11027e] = 1.0f;
        I(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // s.b, s.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s.i b(s.e r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f11007l
            if (r0 >= r2) goto L30
            s.i[] r2 = r4.f11005j
            r2 = r2[r0]
            int r3 = r2.f11025c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            s.h$b r3 = r4.f11008m
            r3.c(r2)
            s.h$b r2 = r4.f11008m
            if (r1 != r5) goto L22
            boolean r2 = r2.d()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            s.i[] r3 = r4.f11005j
            r3 = r3[r1]
            boolean r2 = r2.f(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            s.i[] r5 = r4.f11005j
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.b(s.e, boolean[]):s.i");
    }

    @Override // s.b, s.e.a
    public void clear() {
        this.f11007l = 0;
        this.f10936b = 0.0f;
    }

    @Override // s.b, s.e.a
    public void d(e eVar, s.b bVar, boolean z3) {
        i iVar = bVar.f10935a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f10939e;
        int iN = aVar.n();
        for (int i4 = 0; i4 < iN; i4++) {
            i iVarF = aVar.f(i4);
            float fA = aVar.a(i4);
            this.f11008m.c(iVarF);
            if (this.f11008m.b(iVar, fA)) {
                I(iVarF);
            }
            this.f10936b += bVar.f10936b * fA;
        }
        J(iVar);
    }

    @Override // s.b, s.e.a
    public boolean isEmpty() {
        return this.f11007l == 0;
    }

    @Override // s.b
    public String toString() {
        String str = s0.a.f11071l + " goal -> (" + this.f10936b + ") : ";
        for (int i4 = 0; i4 < this.f11007l; i4++) {
            this.f11008m.c(this.f11005j[i4]);
            str = str + this.f11008m + " ";
        }
        return str;
    }
}
