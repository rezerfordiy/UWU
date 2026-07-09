package w;

import java.util.ArrayList;
import v.d;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12284d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12285e = 30;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12286f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12287g = 1073741824;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12288h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12289i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12290j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12291k = -3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<v.e> f12292a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12293b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v.f f12294c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f12295k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f12296l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f12297m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f12298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f12299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f12305h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f12306i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12307j;
    }

    /* JADX INFO: renamed from: w.b$b, reason: collision with other inner class name */
    public interface InterfaceC0124b {
        void a();

        void b(v.e eVar, a aVar);
    }

    public b(v.f fVar) {
        this.f12294c = fVar;
    }

    public final boolean a(InterfaceC0124b interfaceC0124b, v.e eVar, int i4) {
        this.f12293b.f12298a = eVar.H();
        this.f12293b.f12299b = eVar.g0();
        this.f12293b.f12300c = eVar.j0();
        this.f12293b.f12301d = eVar.D();
        a aVar = this.f12293b;
        aVar.f12306i = false;
        aVar.f12307j = i4;
        e.b bVar = aVar.f12298a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z3 = bVar == bVar2;
        boolean z4 = aVar.f12299b == bVar2;
        boolean z5 = z3 && eVar.Y > 0.0f;
        boolean z6 = z4 && eVar.Y > 0.0f;
        if (z5 && eVar.f11830r[0] == 4) {
            aVar.f12298a = e.b.FIXED;
        }
        if (z6 && eVar.f11830r[1] == 4) {
            aVar.f12299b = e.b.FIXED;
        }
        interfaceC0124b.b(eVar, aVar);
        eVar.H1(this.f12293b.f12302e);
        eVar.d1(this.f12293b.f12303f);
        eVar.c1(this.f12293b.f12305h);
        eVar.L0(this.f12293b.f12304g);
        a aVar2 = this.f12293b;
        aVar2.f12307j = a.f12295k;
        return aVar2.f12306i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[PHI: r10
      0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(v.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<v.e> r0 = r13.f11942o1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.w2(r1)
            w.b$b r2 = r13.k2()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<v.e> r5 = r13.f11942o1
            java.lang.Object r5 = r5.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5 instanceof v.h
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof v.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.v0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            w.l r6 = r5.f11804e
            if (r6 == 0) goto L48
            w.n r7 = r5.f11806f
            if (r7 == 0) goto L48
            w.g r6 = r6.f12383e
            boolean r6 = r6.f12329j
            if (r6 == 0) goto L48
            w.g r6 = r7.f12383e
            boolean r6 = r6.f12329j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            v.e$b r6 = r5.z(r3)
            r7 = 1
            v.e$b r8 = r5.z(r7)
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f11826p
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f11828q
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.w2(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof v.m
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f11826p
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.s0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f11828q
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.s0()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.Y
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = w.b.a.f12295k
            r12.a(r2, r5, r6)
            s.f r5 = r13.f11859t1
            if (r5 == 0) goto Lac
            long r6 = r5.f10974c
            r8 = 1
            long r6 = r6 + r8
            r5.f10974c = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.b(v.f):void");
    }

    public final void c(v.f fVar, String str, int i4, int i5) {
        int iQ = fVar.Q();
        int iP = fVar.P();
        fVar.u1(0);
        fVar.t1(0);
        fVar.H1(i4);
        fVar.d1(i5);
        fVar.u1(iQ);
        fVar.t1(iP);
        this.f12294c.R1();
    }

    public long d(v.f fVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        boolean zH2;
        int i13;
        int i14;
        boolean z3;
        boolean z4;
        boolean z5;
        int i15;
        InterfaceC0124b interfaceC0124b;
        int i16;
        int i17;
        int i18;
        boolean z6;
        s.f fVar2;
        InterfaceC0124b interfaceC0124bK2 = fVar.k2();
        int size = fVar.f11942o1.size();
        int iJ0 = fVar.j0();
        int iD = fVar.D();
        boolean zB = v.k.b(i4, 128);
        boolean z7 = zB || v.k.b(i4, 64);
        if (z7) {
            for (int i19 = 0; i19 < size; i19++) {
                v.e eVar = fVar.f11942o1.get(i19);
                e.b bVarH = eVar.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z8 = (bVarH == bVar) && (eVar.g0() == bVar) && eVar.A() > 0.0f;
                if ((eVar.s0() && z8) || ((eVar.u0() && z8) || (eVar instanceof v.m) || eVar.s0() || eVar.u0())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7 && (fVar2 = s.e.C) != null) {
            fVar2.f10976e++;
        }
        boolean z9 = z7 & ((i7 == 1073741824 && i9 == 1073741824) || zB);
        int i20 = 2;
        if (z9) {
            int iMin = Math.min(fVar.O(), i8);
            int iMin2 = Math.min(fVar.N(), i10);
            if (i7 == 1073741824 && fVar.j0() != iMin) {
                fVar.H1(iMin);
                fVar.p2();
            }
            if (i9 == 1073741824 && fVar.D() != iMin2) {
                fVar.d1(iMin2);
                fVar.p2();
            }
            if (i7 == 1073741824 && i9 == 1073741824) {
                zH2 = fVar.f2(zB);
                i13 = 2;
            } else {
                boolean zG2 = fVar.g2(zB);
                if (i7 == 1073741824) {
                    zG2 &= fVar.h2(zB, 0);
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i9 == 1073741824) {
                    zH2 = fVar.h2(zB, 1) & zG2;
                    i13++;
                } else {
                    zH2 = zG2;
                }
            }
            if (zH2) {
                fVar.M1(i7 == 1073741824, i9 == 1073741824);
            }
        } else {
            zH2 = false;
            i13 = 0;
        }
        if (zH2 && i13 == 2) {
            return 0L;
        }
        int iL2 = fVar.l2();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f12292a.size();
        if (size > 0) {
            c(fVar, "First pass", iJ0, iD);
        }
        if (size2 > 0) {
            e.b bVarH2 = fVar.H();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z10 = bVarH2 == bVar2;
            boolean z11 = fVar.g0() == bVar2;
            int iMax = Math.max(fVar.j0(), this.f12294c.Q());
            int iMax2 = Math.max(fVar.D(), this.f12294c.P());
            int i21 = 0;
            boolean zB2 = false;
            while (i21 < size2) {
                v.e eVar2 = this.f12292a.get(i21);
                if (eVar2 instanceof v.m) {
                    int iJ02 = eVar2.j0();
                    i16 = iL2;
                    int iD2 = eVar2.D();
                    i17 = iJ0;
                    boolean zA = a(interfaceC0124bK2, eVar2, a.f12296l) | zB2;
                    s.f fVar3 = fVar.f11859t1;
                    i18 = iD;
                    if (fVar3 != null) {
                        fVar3.f10975d++;
                    }
                    int iJ03 = eVar2.j0();
                    int iD3 = eVar2.D();
                    if (iJ03 != iJ02) {
                        eVar2.H1(iJ03);
                        if (z10 && eVar2.X() > iMax) {
                            iMax = Math.max(iMax, eVar2.X() + eVar2.r(d.b.RIGHT).g());
                        }
                        z6 = true;
                    } else {
                        z6 = zA;
                    }
                    if (iD3 != iD2) {
                        eVar2.d1(iD3);
                        if (z11 && eVar2.v() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.v() + eVar2.r(d.b.BOTTOM).g());
                        }
                        z6 = true;
                    }
                    zB2 = z6 | ((v.m) eVar2).b2();
                } else {
                    i16 = iL2;
                    i17 = iJ0;
                    i18 = iD;
                }
                i21++;
                iL2 = i16;
                iJ0 = i17;
                iD = i18;
                i20 = 2;
            }
            int i22 = iL2;
            int i23 = iJ0;
            int i24 = iD;
            int i25 = i20;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = 0;
                while (i27 < size2) {
                    v.e eVar3 = this.f12292a.get(i27);
                    if (((eVar3 instanceof v.i) && !(eVar3 instanceof v.m)) || (eVar3 instanceof v.h) || eVar3.i0() == 8 || ((z9 && eVar3.f11804e.f12383e.f12329j && eVar3.f11806f.f12383e.f12329j) || (eVar3 instanceof v.m))) {
                        z5 = z9;
                        i15 = size2;
                        interfaceC0124b = interfaceC0124bK2;
                    } else {
                        int iJ04 = eVar3.j0();
                        int iD4 = eVar3.D();
                        int iT = eVar3.t();
                        int i28 = a.f12296l;
                        z5 = z9;
                        if (i26 == 1) {
                            i28 = a.f12297m;
                        }
                        boolean zA2 = a(interfaceC0124bK2, eVar3, i28) | zB2;
                        s.f fVar4 = fVar.f11859t1;
                        i15 = size2;
                        interfaceC0124b = interfaceC0124bK2;
                        if (fVar4 != null) {
                            fVar4.f10975d++;
                        }
                        int iJ05 = eVar3.j0();
                        int iD5 = eVar3.D();
                        if (iJ05 != iJ04) {
                            eVar3.H1(iJ05);
                            if (z10 && eVar3.X() > iMax) {
                                iMax = Math.max(iMax, eVar3.X() + eVar3.r(d.b.RIGHT).g());
                            }
                            zA2 = true;
                        }
                        if (iD5 != iD4) {
                            eVar3.d1(iD5);
                            if (z11 && eVar3.v() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.v() + eVar3.r(d.b.BOTTOM).g());
                            }
                            zA2 = true;
                        }
                        zB2 = (!eVar3.m0() || iT == eVar3.t()) ? zA2 : true;
                    }
                    i27++;
                    size2 = i15;
                    interfaceC0124bK2 = interfaceC0124b;
                    z9 = z5;
                }
                boolean z12 = z9;
                int i29 = size2;
                InterfaceC0124b interfaceC0124b2 = interfaceC0124bK2;
                if (!zB2) {
                    break;
                }
                c(fVar, "intermediate pass", i23, i24);
                i26++;
                interfaceC0124bK2 = interfaceC0124b2;
                z9 = z12;
                i25 = 2;
                zB2 = false;
                size2 = i29;
            }
            if (zB2) {
                c(fVar, "2nd pass", i23, i24);
                if (fVar.j0() < iMax) {
                    fVar.H1(iMax);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fVar.D() < iMax2) {
                    fVar.d1(iMax2);
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    c(fVar, "3rd pass", i23, i24);
                }
            }
            i14 = i22;
        } else {
            i14 = iL2;
        }
        fVar.z2(i14);
        return 0L;
    }

    public void e(v.f fVar) {
        this.f12292a.clear();
        int size = fVar.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            v.e eVar = fVar.f11942o1.get(i4);
            e.b bVarH = eVar.H();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarH == bVar || eVar.g0() == bVar) {
                this.f12292a.add(eVar);
            }
        }
        fVar.p2();
    }
}
