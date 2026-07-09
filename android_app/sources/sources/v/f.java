package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import v.e;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class f extends n {
    public static final int S1 = 8;
    public static final boolean T1 = false;
    public static final boolean U1 = false;
    public static final boolean V1 = false;
    public static int W1;
    public int A1;
    public c[] B1;
    public c[] C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    public int I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public int M1;
    public WeakReference<d> N1;
    public WeakReference<d> O1;
    public WeakReference<d> P1;
    public WeakReference<d> Q1;
    public b.a R1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public w.b f11855p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public w.e f11856q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public b.InterfaceC0124b f11857r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f11858s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public s.f f11859t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public s.e f11860u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f11861v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f11862w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f11863x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f11864y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f11865z1;

    public f() {
        this.f11855p1 = new w.b(this);
        this.f11856q1 = new w.e(this);
        this.f11857r1 = null;
        this.f11858s1 = false;
        this.f11860u1 = new s.e();
        this.f11865z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    public static boolean v2(e eVar, b.InterfaceC0124b interfaceC0124b, b.a aVar, int i4) {
        int i5;
        int i6;
        if (interfaceC0124b == null) {
            return false;
        }
        aVar.f12298a = eVar.H();
        aVar.f12299b = eVar.g0();
        aVar.f12300c = eVar.j0();
        aVar.f12301d = eVar.D();
        aVar.f12306i = false;
        aVar.f12307j = i4;
        e.b bVar = aVar.f12298a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z3 = bVar == bVar2;
        boolean z4 = aVar.f12299b == bVar2;
        boolean z5 = z3 && eVar.Y > 0.0f;
        boolean z6 = z4 && eVar.Y > 0.0f;
        if (z3 && eVar.n0(0) && eVar.f11826p == 0 && !z5) {
            aVar.f12298a = e.b.WRAP_CONTENT;
            if (z4 && eVar.f11828q == 0) {
                aVar.f12298a = e.b.FIXED;
            }
            z3 = false;
        }
        if (z4 && eVar.n0(1) && eVar.f11828q == 0 && !z6) {
            aVar.f12299b = e.b.WRAP_CONTENT;
            if (z3 && eVar.f11826p == 0) {
                aVar.f12299b = e.b.FIXED;
            }
            z4 = false;
        }
        if (eVar.x0()) {
            aVar.f12298a = e.b.FIXED;
            z3 = false;
        }
        if (eVar.y0()) {
            aVar.f12299b = e.b.FIXED;
            z4 = false;
        }
        if (z5) {
            if (eVar.f11830r[0] == 4) {
                aVar.f12298a = e.b.FIXED;
            } else if (!z4) {
                e.b bVar3 = aVar.f12299b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i6 = aVar.f12301d;
                } else {
                    aVar.f12298a = e.b.WRAP_CONTENT;
                    interfaceC0124b.b(eVar, aVar);
                    i6 = aVar.f12303f;
                }
                aVar.f12298a = bVar4;
                int i7 = eVar.Z;
                aVar.f12300c = (int) ((i7 == 0 || i7 == -1) ? eVar.A() * i6 : eVar.A() / i6);
            }
        }
        if (z6) {
            if (eVar.f11830r[1] == 4) {
                aVar.f12299b = e.b.FIXED;
            } else if (!z3) {
                e.b bVar5 = aVar.f12298a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i5 = aVar.f12300c;
                } else {
                    aVar.f12299b = e.b.WRAP_CONTENT;
                    interfaceC0124b.b(eVar, aVar);
                    i5 = aVar.f12302e;
                }
                aVar.f12299b = bVar6;
                int i8 = eVar.Z;
                aVar.f12301d = (int) ((i8 == 0 || i8 == -1) ? i5 / eVar.A() : i5 * eVar.A());
            }
        }
        interfaceC0124b.b(eVar, aVar);
        eVar.H1(aVar.f12302e);
        eVar.d1(aVar.f12303f);
        eVar.c1(aVar.f12305h);
        eVar.L0(aVar.f12304g);
        aVar.f12307j = b.a.f12295k;
        return aVar.f12306i;
    }

    public void A2(int i4, int i5, int i6, int i7) {
        this.f11861v1 = i4;
        this.f11862w1 = i5;
        this.f11863x1 = i6;
        this.f11864y1 = i7;
    }

    public void B2(boolean z3) {
        this.f11858s1 = z3;
    }

    public void C2(s.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zW2 = w2(64);
        N1(eVar, zW2);
        int size = this.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11942o1.get(i4).N1(eVar, zW2);
        }
    }

    public void D2() {
        this.f11855p1.e(this);
    }

    @Override // v.n, v.e
    public void F0() {
        this.f11860u1.Y();
        this.f11861v1 = 0;
        this.f11863x1 = 0;
        this.f11862w1 = 0;
        this.f11864y1 = 0;
        this.J1 = false;
        super.F0();
    }

    @Override // v.e
    public void M1(boolean z3, boolean z4) {
        super.M1(z3, z4);
        int size = this.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11942o1.get(i4).M1(z3, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ff A[PHI: r0 r2
      0x02ff: PHI (r0v20 ??) = (r0v19 ??), (r0v22 ??), (r0v22 ??), (r0v22 ??) binds: [B:141:0x02c3, B:149:0x02e7, B:150:0x02e9, B:152:0x02ef] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r2v14 boolean) = (r2v13 boolean), (r2v16 boolean), (r2v16 boolean), (r2v16 boolean) binds: [B:141:0x02c3, B:149:0x02e7, B:150:0x02e9, B:152:0x02ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // v.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void R1() {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.R1():void");
    }

    public void U1(e eVar, int i4) {
        if (i4 == 0) {
            W1(eVar);
        } else if (i4 == 1) {
            b2(eVar);
        }
    }

    public boolean V1(s.e eVar) {
        boolean zW2 = w2(64);
        g(eVar, zW2);
        int size = this.f11942o1.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar2 = this.f11942o1.get(i4);
            eVar2.l1(0, false);
            eVar2.l1(1, false);
            if (eVar2 instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar3 = this.f11942o1.get(i5);
                if (eVar3 instanceof a) {
                    ((a) eVar3).V1();
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = this.f11942o1.get(i6);
            if (eVar4.f()) {
                eVar4.g(eVar, zW2);
            }
        }
        if (s.e.f10949v) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar5 = this.f11942o1.get(i7);
                if (!eVar5.f()) {
                    hashSet.add(eVar5);
                }
            }
            e(this, eVar, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar6 : hashSet) {
                k.a(this, eVar, eVar6);
                eVar6.g(eVar, zW2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar7 = this.f11942o1.get(i8);
                if (eVar7 instanceof f) {
                    e.b[] bVarArr = eVar7.U;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.i1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D1(e.b.FIXED);
                    }
                    eVar7.g(eVar, zW2);
                    if (bVar == bVar3) {
                        eVar7.i1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D1(bVar2);
                    }
                } else {
                    k.a(this, eVar, eVar7);
                    if (!eVar7.f()) {
                        eVar7.g(eVar, zW2);
                    }
                }
            }
        }
        if (this.f11865z1 > 0) {
            b.b(this, eVar, null, 0);
        }
        if (this.A1 > 0) {
            b.b(this, eVar, null, 1);
        }
        return true;
    }

    public final void W1(e eVar) {
        int i4 = this.f11865z1 + 1;
        c[] cVarArr = this.C1;
        if (i4 >= cVarArr.length) {
            this.C1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.C1[this.f11865z1] = new c(eVar, 0, s2());
        this.f11865z1++;
    }

    public void X1(d dVar) {
        WeakReference<d> weakReference = this.Q1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.Q1.get().f()) {
            this.Q1 = new WeakReference<>(dVar);
        }
    }

    public void Y1(d dVar) {
        WeakReference<d> weakReference = this.O1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.O1.get().f()) {
            this.O1 = new WeakReference<>(dVar);
        }
    }

    public final void Z1(d dVar, s.i iVar) {
        this.f11860u1.i(iVar, this.f11860u1.u(dVar), 0, 5);
    }

    public final void a2(d dVar, s.i iVar) {
        this.f11860u1.i(this.f11860u1.u(dVar), iVar, 0, 5);
    }

    public final void b2(e eVar) {
        int i4 = this.A1 + 1;
        c[] cVarArr = this.B1;
        if (i4 >= cVarArr.length) {
            this.B1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B1[this.A1] = new c(eVar, 1, s2());
        this.A1++;
    }

    @Override // v.e
    public String c0() {
        return ConstraintLayout.B;
    }

    public void c2(d dVar) {
        WeakReference<d> weakReference = this.P1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.P1.get().f()) {
            this.P1 = new WeakReference<>(dVar);
        }
    }

    public void d2(d dVar) {
        WeakReference<d> weakReference = this.N1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.N1.get().f()) {
            this.N1 = new WeakReference<>(dVar);
        }
    }

    public void e2() {
        this.f11856q1.f(H(), g0());
    }

    public boolean f2(boolean z3) {
        return this.f11856q1.g(z3);
    }

    public boolean g2(boolean z3) {
        return this.f11856q1.h(z3);
    }

    public boolean h2(boolean z3, int i4) {
        return this.f11856q1.i(z3, i4);
    }

    public void i2(s.f fVar) {
        this.f11859t1 = fVar;
        this.f11860u1.F(fVar);
    }

    public ArrayList<h> j2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.f11942o1.get(i4);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0124b k2() {
        return this.f11857r1;
    }

    public int l2() {
        return this.I1;
    }

    public s.e m2() {
        return this.f11860u1;
    }

    public ArrayList<h> n2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.f11942o1.get(i4);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean o2() {
        return false;
    }

    public void p2() {
        this.f11856q1.o();
    }

    public void q2() {
        this.f11856q1.p();
    }

    public boolean r2() {
        return this.L1;
    }

    public boolean s2() {
        return this.f11858s1;
    }

    public boolean t2() {
        return this.K1;
    }

    public long u2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f11861v1 = i11;
        this.f11862w1 = i12;
        return this.f11855p1.d(this, i4, i11, i12, i5, i6, i7, i8, i9, i10);
    }

    public boolean w2(int i4) {
        return (this.I1 & i4) == i4;
    }

    public final void x2() {
        this.f11865z1 = 0;
        this.A1 = 0;
    }

    public void y2(b.InterfaceC0124b interfaceC0124b) {
        this.f11857r1 = interfaceC0124b;
        this.f11856q1.u(interfaceC0124b);
    }

    public void z2(int i4) {
        this.I1 = i4;
        s.e.f10949v = w2(512);
    }

    public f(int i4, int i5) {
        super(i4, i5);
        this.f11855p1 = new w.b(this);
        this.f11856q1 = new w.e(this);
        this.f11857r1 = null;
        this.f11858s1 = false;
        this.f11860u1 = new s.e();
        this.f11865z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    public f(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.f11855p1 = new w.b(this);
        this.f11856q1 = new w.e(this);
        this.f11857r1 = null;
        this.f11858s1 = false;
        this.f11860u1 = new s.e();
        this.f11865z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    public f(String str, int i4, int i5) {
        super(i4, i5);
        this.f11855p1 = new w.b(this);
        this.f11856q1 = new w.e(this);
        this.f11857r1 = null;
        this.f11858s1 = false;
        this.f11860u1 = new s.e();
        this.f11865z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
        O0(str);
    }
}
