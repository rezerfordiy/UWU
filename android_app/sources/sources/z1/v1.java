package z1;

import java.lang.reflect.Array;
import z1.b0;
import z1.g0;
import z1.n0;
import z1.o1;
import z1.q7;
import z1.u1;

/* JADX INFO: loaded from: classes.dex */
public class v1 extends u1 {
    @Override // z1.u1, z1.x1
    public z1 a(String str) {
        return new z1(str, h());
    }

    @Override // z1.u1
    public p0[] b() {
        float[] fArr;
        int[] iArr;
        float[] fArr2;
        u1.i iVar = this.f13850a;
        b0.g gVar = new b0.g(iVar.f13929e, iVar.f13930f, iVar.f13925a, iVar.f13926b);
        b0.j jVar = new b0.j(this.f13850a.f13934j);
        b0.i iVar2 = new b0.i(30, 105, true, false, 80);
        float[] fArr3 = new float[4];
        System.arraycopy(this.f13850a.f13931g, 0, fArr3, 0, 4);
        int[] iArr2 = new int[4];
        System.arraycopy(this.f13850a.f13932h, 0, iArr2, 0, 4);
        float[] fArr4 = new float[4];
        System.arraycopy(this.f13850a.f13933i, 0, fArr4, 0, 4);
        u1.i iVar3 = this.f13850a;
        float[] fArr5 = iVar3.f13931g;
        if (fArr5[5] > 0.0f) {
            iArr = iVar3.f13932h;
            fArr2 = iVar3.f13933i;
            fArr = fArr5;
        } else {
            fArr = fArr3;
            iArr = iArr2;
            fArr2 = fArr4;
        }
        q7.d dVar = new q7.d(fArr.length, fArr, iArr, fArr2, true, false, 2);
        b0.f fVar = new b0.f(this.f13850a.f13929e / 2);
        u1.e eVar = this.f13858i;
        if (eVar != null) {
            fVar.e3(eVar.f13896a / 2);
        }
        return this.f13859j ? new p0[]{jVar, iVar2, dVar, fVar} : new p0[]{gVar, jVar, iVar2, dVar, fVar};
    }

    @Override // z1.u1
    public o0 c() {
        o0 o0VarH;
        u1.b bVar;
        int i4;
        int i5;
        o0 o0VarH2;
        char c4;
        o0 o0VarH3;
        int i6;
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        o1.k kVar = null;
        for (p0 p0Var2 : g()) {
            if (p0Var2.f13821e.equals(n0.c.HARMONIC.toString())) {
                kVar = (o1.k) p0Var2;
            } else {
                o0Var.a(p0Var2);
            }
        }
        n0.e eVar = n0.e.MODE_B;
        b0.n nVar = new b0.n(new String[]{eVar.toString(), n0.e.MODE_BM.toString(), n0.e.MODE_BC.toString(), n0.e.MODE_BP.toString(), n0.e.MODE_BD.toString()}, true, false, eVar.toString());
        o0Var.a(nVar);
        u1.o oVar = new u1.o();
        nVar.Z2(oVar);
        if (this.f13859j) {
            int i7 = this.f13858i.f13896a;
            u1.i iVar = this.f13850a;
            o0VarH = o0.h(new b0.g(i7, iVar.f13930f, iVar.f13925a, iVar.f13926b), kVar);
        } else {
            o0VarH = o0.h(kVar);
        }
        oVar.f(o0VarH, u1.j.MODE_B.toString());
        o0Var.a(new g0.f(this.f13856g.f13873k));
        o0Var.a(new g0.k(0, this.f13856g.f13876n - 1, true, false, 0));
        o0Var.a(new g0.i(this.f13856g.f13872j, 0, this.f13856g.f13871i - 1, true, false, 0));
        o0Var.a(new g0.h(0, 100, true, false, 40));
        float[] fArr = new float[this.f13856g.f13877o];
        int i8 = 0;
        while (true) {
            bVar = this.f13856g;
            i4 = bVar.f13877o;
            if (i8 >= i4) {
                break;
            }
            fArr[i8] = bVar.f13878p[i8];
            i8++;
        }
        int i9 = bVar.f13866d;
        u1.i iVar2 = this.f13850a;
        int i10 = iVar2.f13930f;
        int i11 = iVar2.f13929e;
        g0.j jVar = new g0.j(fArr, 0, i4 - 1, i9, i10 - 10, 0, i11 - 1, bVar.f13867e, bVar.f13868f, bVar.f13869g, bVar.f13870h, true, false, 0, (i11 / 2) - 16, (i11 / 2) + 16, (i10 / 2) - 24, (i10 / 2) + 24);
        o0Var.a(jVar);
        u1.k kVar2 = new u1.k();
        b0.p pVar = (b0.p) o0Var.f13749a.get(n0.a.ZOOM.toString());
        jVar.Z2(kVar2);
        pVar.Z2(kVar2);
        u1.b bVar2 = this.f13856g;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, bVar2.f13864b, bVar2.f13865c.length);
        int i12 = 0;
        while (true) {
            i5 = this.f13856g.f13864b;
            if (i12 >= i5) {
                break;
            }
            fArr2[i12] = new float[]{(int) r9.f13865c[i12]};
            i12++;
        }
        g0.g gVar = new g0.g(fArr2, 0, i5 - 1, true, false, 0);
        gVar.f13820d = true;
        kVar2.f(o0.h(gVar), u1.c.FOCUS_DEFAULT.toString());
        u1.h hVar = this.f13852c;
        o1.k kVar3 = new o1.k(hVar.f13921f, hVar.f13922g, true, false, false);
        if (!this.f13856g.f13879q) {
            kVar3.f13820d = true;
            kVar3.Y0(false);
        }
        if (this.f13859j) {
            int i13 = this.f13858i.f13897b;
            u1.i iVar3 = this.f13850a;
            b0.g gVar2 = new b0.g(i13, iVar3.f13930f, iVar3.f13925a, iVar3.f13926b);
            oVar.f(o0.h(gVar2, kVar3), u1.j.MODE_BC.toString());
            o0VarH2 = o0.h(gVar2, kVar3);
        } else {
            oVar.f(o0.h(kVar3), u1.j.MODE_BC.toString());
            o0VarH2 = o0.h(kVar3);
        }
        oVar.f(o0VarH2, u1.j.MODE_BP.toString());
        u1.l lVar = new u1.l();
        kVar3.Z2(lVar);
        pVar.Z2(lVar);
        jVar.Z2(lVar);
        u1.h hVar2 = this.f13852c;
        float[][] fArr3 = hVar2.f13918c;
        float[][] fArr4 = hVar2.f13920e;
        o1.j.f3();
        o1.j jVar2 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar2.f13820d = true;
        o1.j jVar3 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar3.f13820d = true;
        lVar.f(o0.h(jVar2), u1.d.HARMONIC_OFF.toString());
        lVar.f(o0.h(jVar3), u1.d.HARMONIC_ON.toString());
        int i14 = this.f13856g.f13883u;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int i15 = 0;
        while (true) {
            u1.b bVar3 = this.f13856g;
            if (i15 >= bVar3.f13883u) {
                break;
            }
            int[] iArr4 = bVar3.f13884v;
            iArr[i15] = iArr4[i15];
            iArr2[i15] = iArr4[i15];
            iArr3[i15] = iArr4[i15] / bVar3.f13885w;
            i15++;
        }
        o0Var.a(new g0.q(iArr, 0, this.f13856g.f13883u - 1, iArr2, iArr3, true, false, 0));
        o0Var.a(new g0.s(this.f13856g.B, 0, this.f13856g.A - 1, true, false, 0));
        o0Var.a(new g0.p(0, 100, true, false, 40));
        o0Var.a(new g0.l(0.0f));
        o0Var.a(new g0.r());
        o0Var.a(new g0.m(40, 110, true, false, 40));
        u1.h hVar3 = this.f13852c;
        o1.k kVar4 = new o1.k(hVar3.f13921f, hVar3.f13922g, true, false, false);
        if (this.f13859j) {
            int i16 = this.f13858i.f13899d;
            u1.i iVar4 = this.f13850a;
            b0.g gVar3 = new b0.g(i16, iVar4.f13930f, iVar4.f13925a, iVar4.f13926b);
            c4 = 0;
            o0VarH3 = o0.h(gVar3, kVar4);
        } else {
            c4 = 0;
            o0VarH3 = o0.h(kVar4);
        }
        oVar.f(o0VarH3, u1.j.MODE_BD.toString());
        u1.s sVar = new u1.s();
        pVar.Z2(sVar);
        g0.t tVarI = i();
        p0[] p0VarArr = new p0[1];
        p0VarArr[c4] = tVarI;
        sVar.f(o0.h(p0VarArr), u1.w.ZOOM_DEFAULT.toString());
        u1.r rVar = new u1.r();
        tVarI.Z2(rVar);
        float[][] fArr5 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f13856g.f13881s, 1);
        int i17 = 0;
        while (true) {
            u1.b bVar4 = this.f13856g;
            i6 = bVar4.f13881s;
            if (i17 >= i6) {
                break;
            }
            fArr5[i17][0] = bVar4.f13882t[i17];
            i17++;
        }
        g0.o oVar2 = new g0.o(fArr5, 0, i6 - 1, true, false, 0);
        rVar.f(o0.h(oVar2), u1.v.PWFOCUS_DEFAULT.toString());
        g0.n nVar2 = new g0.n(this.f13856g.f13887y);
        if (this.f13856g.f13886x > 1) {
            u1.p pVar2 = new u1.p();
            oVar2.Z2(pVar2);
            oVar2.Z2(pVar2);
            u1.b bVar5 = this.f13856g;
            nVar2.e3(bVar5.f13888z, bVar5.f13886x);
            pVar2.f(o0.h(nVar2), u1.t.PWFOCUS_DEFAULT.toString());
        }
        o0Var.a(nVar2);
        u1.q qVar = new u1.q();
        tVarI.Z2(qVar);
        kVar4.Z2(qVar);
        o1.j.f3();
        o1.j jVar4 = new o1.j(fArr3, 0, 3, true, false, 0);
        jVar4.f13820d = true;
        o1.j jVar5 = new o1.j(fArr4, 0, 3, true, false, 0);
        jVar5.f13820d = true;
        qVar.f(o0.h(jVar4), u1.u.HARMONIC_OFF.toString());
        qVar.f(o0.h(jVar5), u1.u.HARMONIC_ON.toString());
        return o0Var;
    }

    @Override // z1.u1
    public o0 d() {
        return null;
    }

    @Override // z1.u1
    public o0 e() {
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        for (p0 p0Var2 : g()) {
            o0Var.a(p0Var2);
        }
        return o0Var;
    }

    @Override // z1.u1
    public o0 f() {
        o0 o0Var = new o0();
        for (p0 p0Var : b()) {
            o0Var.a(p0Var);
        }
        return o0Var;
    }

    @Override // z1.u1
    public p0[] g() {
        o1.l lVar = new o1.l(0, 4, true, false, 0);
        o1.i iVar = new o1.i(40, 110, true, false, 80);
        int[] iArr = new int[1];
        u1.h hVar = this.f13852c;
        if (hVar.f13923h == 3) {
            iArr = hVar.f13924i;
        }
        o1.h hVar2 = iArr.length > 1 ? new o1.h(iArr, true, false, true) : new o1.h(iArr, false, false, false);
        o1.m mVar = new o1.m(0, 255, 0, 7, true, false, new int[]{128, 128, 128, 128, 128, 128, 128, 128});
        u1.h hVar3 = this.f13852c;
        o1.k kVar = new o1.k(hVar3.f13921f, hVar3.f13922g, true, false, false);
        u1.n nVar = new u1.n();
        kVar.Z2(nVar);
        u1.h hVar4 = this.f13852c;
        float[][] fArr = hVar4.f13918c;
        float[][] fArr2 = hVar4.f13920e;
        o1.j jVar = new o1.j(fArr, 0, 3, true, false, 0);
        o1.j jVar2 = new o1.j(fArr2, 0, 3, true, false, 0);
        nVar.f(o0.h(jVar), u1.f.HARMONIC_OFF.toString());
        nVar.f(o0.h(jVar2), u1.f.HARMONIC_ON.toString());
        return new p0[]{lVar, iVar, hVar2, mVar, kVar};
    }

    @Override // z1.u1
    public o0 h() {
        boolean z3 = this.f13853d;
        return (z3 || this.f13855f || this.f13857h) ? (!z3 || this.f13855f || this.f13857h) ? this.f13857h ? c() : this.f13855f ? d() : f() : e() : f();
    }

    @Override // z1.u1
    public g0.t i() {
        u1.i iVar = this.f13850a;
        double d4 = 770000.0d / ((double) iVar.f13935k);
        double d5 = ((double) iVar.f13936l[3]) * d4;
        int i4 = this.f13856g.C;
        int[] iArr = new int[i4];
        float[] fArr = new float[i4];
        float f4 = 0.0f;
        int i5 = 0;
        while (true) {
            u1.b bVar = this.f13856g;
            if (i5 >= bVar.C) {
                int i6 = (this.f13850a.f13930f - ((int) ((((double) f4) / d5) + 0.5d))) - 1;
                int i7 = this.f13856g.C - 1;
                u1.i iVar2 = this.f13850a;
                int i8 = iVar2.f13929e;
                return new q7.b(iArr, fArr, 0, i7, 0, i6, 0, i8 - 1, true, false, (float) (d4 * ((double) iVar2.f13936l[0])), 0, ((i6 + 0) / 3) + 0, (i8 - 1) / 2);
            }
            int[] iArr2 = bVar.D;
            iArr[i5] = iArr2[i5];
            float f5 = (float) (((double) iArr2[i5]) * d4);
            fArr[i5] = f5;
            if (f5 > f4) {
                f4 = f5;
            }
            i5++;
        }
    }
}
