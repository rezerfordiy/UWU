package v;

import v.e;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11911a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11912b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11913c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11914d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11915e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11916f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11917g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11918h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11919i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11920j = 256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11921k = 512;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f11922l = 1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f11923m = 257;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean[] f11924n = new boolean[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11925o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f11926p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f11927q = 2;

    public static void a(f fVar, s.e eVar, e eVar2) {
        eVar2.f11822n = -1;
        eVar2.f11824o = -1;
        e.b bVar = fVar.U[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar2.U[0] == e.b.MATCH_PARENT) {
            int i4 = eVar2.J.f11768g;
            int iJ0 = fVar.j0() - eVar2.L.f11768g;
            d dVar = eVar2.J;
            dVar.f11770i = eVar.u(dVar);
            d dVar2 = eVar2.L;
            dVar2.f11770i = eVar.u(dVar2);
            eVar.f(eVar2.J.f11770i, i4);
            eVar.f(eVar2.L.f11770i, iJ0);
            eVar2.f11822n = 2;
            eVar2.h1(i4, iJ0);
        }
        if (fVar.U[1] == bVar2 || eVar2.U[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i5 = eVar2.K.f11768g;
        int iD = fVar.D() - eVar2.M.f11768g;
        d dVar3 = eVar2.K;
        dVar3.f11770i = eVar.u(dVar3);
        d dVar4 = eVar2.M;
        dVar4.f11770i = eVar.u(dVar4);
        eVar.f(eVar2.K.f11770i, i5);
        eVar.f(eVar2.M.f11770i, iD);
        if (eVar2.f11809g0 > 0 || eVar2.i0() == 8) {
            d dVar5 = eVar2.N;
            dVar5.f11770i = eVar.u(dVar5);
            eVar.f(eVar2.N.f11770i, eVar2.f11809g0 + i5);
        }
        eVar2.f11824o = 2;
        eVar2.C1(i5, iD);
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
