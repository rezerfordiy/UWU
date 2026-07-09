package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.o;

/* JADX INFO: loaded from: classes.dex */
public class j extends e implements i {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public e[] f11909o1 = new e[4];

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f11910p1 = 0;

    public void O1(ArrayList<o> arrayList, int i4, o oVar) {
        for (int i5 = 0; i5 < this.f11910p1; i5++) {
            oVar.a(this.f11909o1[i5]);
        }
        for (int i6 = 0; i6 < this.f11910p1; i6++) {
            w.i.a(this.f11909o1[i6], i4, arrayList, oVar);
        }
    }

    public int P1(int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < this.f11910p1; i7++) {
            e eVar = this.f11909o1[i7];
            if (i4 == 0 && (i6 = eVar.K0) != -1) {
                return i6;
            }
            if (i4 == 1 && (i5 = eVar.L0) != -1) {
                return i5;
            }
        }
        return -1;
    }

    @Override // v.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i4 = this.f11910p1 + 1;
        e[] eVarArr = this.f11909o1;
        if (i4 > eVarArr.length) {
            this.f11909o1 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f11909o1;
        int i5 = this.f11910p1;
        eVarArr2[i5] = eVar;
        this.f11910p1 = i5 + 1;
    }

    @Override // v.i
    public void b() {
        this.f11910p1 = 0;
        Arrays.fill(this.f11909o1, (Object) null);
    }

    @Override // v.i
    public void c(f fVar) {
    }

    @Override // v.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        j jVar = (j) eVar;
        this.f11910p1 = 0;
        int i4 = jVar.f11910p1;
        for (int i5 = 0; i5 < i4; i5++) {
            a(map.get(jVar.f11909o1[i5]));
        }
    }
}
