package w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12349h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12350i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12351j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f12352k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f12355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f12356d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12359g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12353a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12354b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<p> f12357e = new ArrayList<>();

    public m(p pVar, int i4) {
        this.f12355c = null;
        this.f12356d = null;
        int i5 = f12352k;
        this.f12358f = i5;
        f12352k = i5 + 1;
        this.f12355c = pVar;
        this.f12356d = pVar;
        this.f12359g = i4;
    }

    public void a(p pVar) {
        this.f12357e.add(pVar);
        this.f12356d = pVar;
    }

    public long b(v.f fVar, int i4) {
        long j4;
        p pVar;
        long j5;
        long jF;
        p pVar2 = this.f12355c;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f12384f != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0L;
        }
        f fVar2 = (i4 == 0 ? fVar.f11804e : fVar.f11806f).f12386h;
        f fVar3 = (i4 == 0 ? fVar.f11804e : fVar.f11806f).f12387i;
        boolean zContains = pVar2.f12386h.f12331l.contains(fVar2);
        boolean zContains2 = this.f12355c.f12387i.f12331l.contains(fVar3);
        long j6 = this.f12355c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jF = f(this.f12355c.f12386h, r12.f12325f);
                j5 = ((long) this.f12355c.f12386h.f12325f) + j6;
            } else if (zContains2) {
                long jE = e(this.f12355c.f12387i, r12.f12325f);
                j5 = ((long) (-this.f12355c.f12387i.f12325f)) + j6;
                jF = -jE;
            } else {
                p pVar3 = this.f12355c;
                j4 = ((long) pVar3.f12386h.f12325f) + pVar3.j();
                pVar = this.f12355c;
            }
            return Math.max(jF, j5);
        }
        long jF2 = f(this.f12355c.f12386h, 0L);
        long jE2 = e(this.f12355c.f12387i, 0L);
        long j7 = jF2 - j6;
        p pVar4 = this.f12355c;
        int i5 = pVar4.f12387i.f12325f;
        if (j7 >= (-i5)) {
            j7 += (long) i5;
        }
        int i6 = pVar4.f12386h.f12325f;
        long j8 = ((-jE2) - j6) - ((long) i6);
        if (j8 >= i6) {
            j8 -= (long) i6;
        }
        float fU = pVar4.f12380b.u(i4);
        float f4 = fU > 0.0f ? (long) ((j8 / fU) + (j7 / (1.0f - fU))) : 0L;
        long j9 = ((long) ((f4 * fU) + 0.5f)) + j6 + ((long) ((f4 * (1.0f - fU)) + 0.5f));
        pVar = this.f12355c;
        j4 = ((long) pVar.f12386h.f12325f) + j9;
        return j4 - ((long) pVar.f12387i.f12325f);
    }

    public final boolean c(p pVar, int i4) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (!pVar.f12380b.f11808g[i4]) {
            return false;
        }
        for (d dVar : pVar.f12386h.f12330k) {
            if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f12323d) != pVar && fVar2 == pVar3.f12386h) {
                if (pVar instanceof c) {
                    Iterator<p> it = ((c) pVar).f12308k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f12380b.f11808g[i4] = false;
                }
                c(fVar2.f12323d, i4);
            }
        }
        for (d dVar2 : pVar.f12387i.f12330k) {
            if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f12323d) != pVar && fVar == pVar2.f12386h) {
                if (pVar instanceof c) {
                    Iterator<p> it2 = ((c) pVar).f12308k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f12380b.f11808g[i4] = false;
                }
                c(fVar.f12323d, i4);
            }
        }
        return false;
    }

    public void d(boolean z3, boolean z4) {
        if (z3) {
            p pVar = this.f12355c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z4) {
            p pVar2 = this.f12355c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }

    public final long e(f fVar, long j4) {
        p pVar = fVar.f12323d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f12330k.size();
        long jMin = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f12330k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12323d != pVar) {
                    jMin = Math.min(jMin, e(fVar2, ((long) fVar2.f12325f) + j4));
                }
            }
        }
        if (fVar != pVar.f12387i) {
            return jMin;
        }
        long j5 = j4 - pVar.j();
        return Math.min(Math.min(jMin, e(pVar.f12386h, j5)), j5 - ((long) pVar.f12386h.f12325f));
    }

    public final long f(f fVar, long j4) {
        p pVar = fVar.f12323d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f12330k.size();
        long jMax = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f12330k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12323d != pVar) {
                    jMax = Math.max(jMax, f(fVar2, ((long) fVar2.f12325f) + j4));
                }
            }
        }
        if (fVar != pVar.f12386h) {
            return jMax;
        }
        long j5 = j4 + pVar.j();
        return Math.max(Math.max(jMax, f(pVar.f12387i, j5)), j5 - ((long) pVar.f12387i.f12325f));
    }
}
