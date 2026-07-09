package s;

import java.util.ArrayList;
import s.e;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements e.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10933g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f10934h = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f10939e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f10935a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10936b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10937c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<i> f10938d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10940f = false;

    public interface a {
        float a(int i4);

        float b(b bVar, boolean z3);

        float c(i iVar, boolean z3);

        void clear();

        int d();

        void e();

        i f(int i4);

        float g(i iVar);

        boolean h(i iVar);

        int i(i iVar);

        void j(float f4);

        void k(i iVar, float f4, boolean z3);

        void l(i iVar, float f4);

        void m();

        int n();
    }

    public b() {
    }

    public i A(i iVar) {
        return B(null, iVar);
    }

    public final i B(boolean[] zArr, i iVar) {
        i.b bVar;
        int iN = this.f10939e.n();
        i iVar2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < iN; i4++) {
            float fA = this.f10939e.a(i4);
            if (fA < 0.0f) {
                i iVarF = this.f10939e.f(i4);
                if ((zArr == null || !zArr[iVarF.f11025c]) && iVarF != iVar && (((bVar = iVarF.f11032j) == i.b.SLACK || bVar == i.b.ERROR) && fA < f4)) {
                    f4 = fA;
                    iVar2 = iVarF;
                }
            }
        }
        return iVar2;
    }

    public void C(i iVar) {
        i iVar2 = this.f10935a;
        if (iVar2 != null) {
            this.f10939e.l(iVar2, -1.0f);
            this.f10935a.f11026d = -1;
            this.f10935a = null;
        }
        float fC = this.f10939e.c(iVar, true) * (-1.0f);
        this.f10935a = iVar;
        if (fC == 1.0f) {
            return;
        }
        this.f10936b /= fC;
        this.f10939e.j(fC);
    }

    public void D() {
        this.f10935a = null;
        this.f10939e.clear();
        this.f10936b = 0.0f;
        this.f10940f = false;
    }

    public int E() {
        return (this.f10935a != null ? 4 : 0) + 4 + 4 + this.f10939e.d();
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.lang.String F() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.F():java.lang.String");
    }

    public void G(e eVar, i iVar, boolean z3) {
        if (iVar.f11036n) {
            float fG = this.f10939e.g(iVar);
            this.f10936b += iVar.f11038p * fG;
            this.f10939e.c(iVar, z3);
            if (z3) {
                iVar.f(this);
            }
            this.f10939e.k(eVar.f10967n.f10944d[iVar.f11037o], fG, z3);
            if (e.f10951x && this.f10939e.n() == 0) {
                this.f10940f = true;
                eVar.f10954a = true;
            }
        }
    }

    @Override // s.e.a
    public void a(i iVar) {
        int i4 = iVar.f11027e;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f10939e.l(iVar, f4);
    }

    @Override // s.e.a
    public i b(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // s.e.a
    public void c(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f10935a = null;
            this.f10939e.clear();
            for (int i4 = 0; i4 < bVar.f10939e.n(); i4++) {
                this.f10939e.k(bVar.f10939e.f(i4), bVar.f10939e.a(i4), true);
            }
        }
    }

    @Override // s.e.a
    public void clear() {
        this.f10939e.clear();
        this.f10935a = null;
        this.f10936b = 0.0f;
    }

    @Override // s.e.a
    public void d(e eVar, b bVar, boolean z3) {
        this.f10936b += bVar.f10936b * this.f10939e.b(bVar, z3);
        if (z3) {
            bVar.f10935a.f(this);
        }
        if (e.f10951x && this.f10935a != null && this.f10939e.n() == 0) {
            this.f10940f = true;
            eVar.f10954a = true;
        }
    }

    @Override // s.e.a
    public void e(e eVar) {
        if (eVar.f10960g.length == 0) {
            return;
        }
        boolean z3 = false;
        while (!z3) {
            int iN = this.f10939e.n();
            for (int i4 = 0; i4 < iN; i4++) {
                i iVarF = this.f10939e.f(i4);
                if (iVarF.f11026d != -1 || iVarF.f11029g || iVarF.f11036n) {
                    this.f10938d.add(iVarF);
                }
            }
            int size = this.f10938d.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    i iVar = this.f10938d.get(i5);
                    if (iVar.f11029g) {
                        f(eVar, iVar, true);
                    } else if (iVar.f11036n) {
                        G(eVar, iVar, true);
                    } else {
                        d(eVar, eVar.f10960g[iVar.f11026d], true);
                    }
                }
                this.f10938d.clear();
            } else {
                z3 = true;
            }
        }
        if (e.f10951x && this.f10935a != null && this.f10939e.n() == 0) {
            this.f10940f = true;
            eVar.f10954a = true;
        }
    }

    @Override // s.e.a
    public void f(e eVar, i iVar, boolean z3) {
        if (iVar.f11029g) {
            this.f10936b += iVar.f11028f * this.f10939e.g(iVar);
            this.f10939e.c(iVar, z3);
            if (z3) {
                iVar.f(this);
            }
            if (e.f10951x && this.f10939e.n() == 0) {
                this.f10940f = true;
                eVar.f10954a = true;
            }
        }
    }

    public b g(e eVar, int i4) {
        this.f10939e.l(eVar.s(i4, "ep"), 1.0f);
        this.f10939e.l(eVar.s(i4, "em"), -1.0f);
        return this;
    }

    @Override // s.e.a
    public i getKey() {
        return this.f10935a;
    }

    public b h(i iVar, int i4) {
        this.f10939e.l(iVar, i4);
        return this;
    }

    public boolean i(e eVar) {
        boolean z3;
        i iVarJ = j(eVar);
        if (iVarJ == null) {
            z3 = true;
        } else {
            C(iVarJ);
            z3 = false;
        }
        if (this.f10939e.n() == 0) {
            this.f10940f = true;
        }
        return z3;
    }

    @Override // s.e.a
    public boolean isEmpty() {
        return this.f10935a == null && this.f10936b == 0.0f && this.f10939e.n() == 0;
    }

    public i j(e eVar) {
        int iN = this.f10939e.n();
        i iVar = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        i iVar2 = null;
        for (int i4 = 0; i4 < iN; i4++) {
            float fA = this.f10939e.a(i4);
            i iVarF = this.f10939e.f(i4);
            if (iVarF.f11032j == i.b.UNRESTRICTED) {
                if (iVar == null || f4 > fA) {
                    z3 = z(iVarF, eVar);
                    f4 = fA;
                    iVar = iVarF;
                } else if (!z3 && z(iVarF, eVar)) {
                    f4 = fA;
                    iVar = iVarF;
                    z3 = true;
                }
            } else if (iVar == null && fA < 0.0f) {
                if (iVar2 == null || f5 > fA) {
                    z4 = z(iVarF, eVar);
                    f5 = fA;
                    iVar2 = iVarF;
                } else if (!z4 && z(iVarF, eVar)) {
                    f5 = fA;
                    iVar2 = iVarF;
                    z4 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public b k(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5) {
        float f5;
        int i6;
        if (iVar2 == iVar3) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar4, 1.0f);
            this.f10939e.l(iVar2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar3, -1.0f);
            this.f10939e.l(iVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                i6 = (-i4) + i5;
                f5 = i6;
            }
            return this;
        }
        if (f4 <= 0.0f) {
            this.f10939e.l(iVar, -1.0f);
            this.f10939e.l(iVar2, 1.0f);
            f5 = i4;
        } else {
            if (f4 < 1.0f) {
                float f6 = 1.0f - f4;
                this.f10939e.l(iVar, f6 * 1.0f);
                this.f10939e.l(iVar2, f6 * (-1.0f));
                this.f10939e.l(iVar3, (-1.0f) * f4);
                this.f10939e.l(iVar4, 1.0f * f4);
                if (i4 > 0 || i5 > 0) {
                    f5 = ((-i4) * f6) + (i5 * f4);
                }
                return this;
            }
            this.f10939e.l(iVar4, -1.0f);
            this.f10939e.l(iVar3, 1.0f);
            i6 = -i5;
            f5 = i6;
        }
        this.f10936b = f5;
        return this;
    }

    public b l(i iVar, int i4) {
        this.f10935a = iVar;
        float f4 = i4;
        iVar.f11028f = f4;
        this.f10936b = f4;
        this.f10940f = true;
        return this;
    }

    public b m(i iVar, i iVar2, float f4) {
        this.f10939e.l(iVar, -1.0f);
        this.f10939e.l(iVar2, f4);
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f10939e.l(iVar, -1.0f);
        this.f10939e.l(iVar2, 1.0f);
        this.f10939e.l(iVar3, f4);
        this.f10939e.l(iVar4, -f4);
        return this;
    }

    public b o(float f4, float f5, float f6, i iVar, int i4, i iVar2, int i5, i iVar3, int i6, i iVar4, int i7) {
        if (f5 == 0.0f || f4 == f6) {
            this.f10936b = ((-i4) - i5) + i6 + i7;
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar4, 1.0f);
            this.f10939e.l(iVar3, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f10936b = ((-i4) - i5) + (i6 * f7) + (i7 * f7);
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar4, f7);
            this.f10939e.l(iVar3, -f7);
        }
        return this;
    }

    public b p(float f4, float f5, float f6, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f10936b = 0.0f;
        if (f5 == 0.0f || f4 == f6) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar4, 1.0f);
            this.f10939e.l(iVar3, -1.0f);
        } else if (f4 == 0.0f) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
        } else if (f6 == 0.0f) {
            this.f10939e.l(iVar3, 1.0f);
            this.f10939e.l(iVar4, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar4, f7);
            this.f10939e.l(iVar3, -f7);
        }
        return this;
    }

    public b q(i iVar, int i4) {
        a aVar;
        float f4;
        if (i4 < 0) {
            this.f10936b = i4 * (-1);
            aVar = this.f10939e;
            f4 = 1.0f;
        } else {
            this.f10936b = i4;
            aVar = this.f10939e;
            f4 = -1.0f;
        }
        aVar.l(iVar, f4);
        return this;
    }

    public b r(i iVar, i iVar2, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10936b = i4;
        }
        if (z3) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
        } else {
            this.f10939e.l(iVar, -1.0f);
            this.f10939e.l(iVar2, 1.0f);
        }
        return this;
    }

    public b s(i iVar, int i4, i iVar2) {
        this.f10936b = i4;
        this.f10939e.l(iVar, -1.0f);
        return this;
    }

    public b t(i iVar, i iVar2, i iVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10936b = i4;
        }
        if (z3) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar3, -1.0f);
        } else {
            this.f10939e.l(iVar, -1.0f);
            this.f10939e.l(iVar2, 1.0f);
            this.f10939e.l(iVar3, 1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(i iVar, i iVar2, i iVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f10936b = i4;
        }
        if (z3) {
            this.f10939e.l(iVar, 1.0f);
            this.f10939e.l(iVar2, -1.0f);
            this.f10939e.l(iVar3, 1.0f);
        } else {
            this.f10939e.l(iVar, -1.0f);
            this.f10939e.l(iVar2, 1.0f);
            this.f10939e.l(iVar3, -1.0f);
        }
        return this;
    }

    public b v(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f10939e.l(iVar3, 0.5f);
        this.f10939e.l(iVar4, 0.5f);
        this.f10939e.l(iVar, -0.5f);
        this.f10939e.l(iVar2, -0.5f);
        this.f10936b = -f4;
        return this;
    }

    public void w() {
        float f4 = this.f10936b;
        if (f4 < 0.0f) {
            this.f10936b = f4 * (-1.0f);
            this.f10939e.m();
        }
    }

    public boolean x() {
        i iVar = this.f10935a;
        return iVar != null && (iVar.f11032j == i.b.UNRESTRICTED || this.f10936b >= 0.0f);
    }

    public boolean y(i iVar) {
        return this.f10939e.h(iVar);
    }

    public final boolean z(i iVar, e eVar) {
        return iVar.f11035m <= 1;
    }

    public b(c cVar) {
        this.f10939e = new s.a(this, cVar);
    }
}
