package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n extends e {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public ArrayList<e> f11942o1;

    public n() {
        this.f11942o1 = new ArrayList<>();
    }

    @Override // v.e
    public void F0() {
        this.f11942o1.clear();
        super.F0();
    }

    @Override // v.e
    public void K0(s.c cVar) {
        super.K0(cVar);
        int size = this.f11942o1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11942o1.get(i4).K0(cVar);
        }
    }

    public void O1(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    public ArrayList<e> P1() {
        return this.f11942o1;
    }

    public f Q1() {
        e eVarU = U();
        f fVar = this instanceof f ? (f) this : null;
        while (eVarU != null) {
            e eVarU2 = eVarU.U();
            if (eVarU instanceof f) {
                fVar = (f) eVarU;
            }
            eVarU = eVarU2;
        }
        return fVar;
    }

    public void R1() {
        ArrayList<e> arrayList = this.f11942o1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.f11942o1.get(i4);
            if (eVar instanceof n) {
                ((n) eVar).R1();
            }
        }
    }

    public void S1(e eVar) {
        this.f11942o1.remove(eVar);
        eVar.F0();
    }

    public void T1() {
        this.f11942o1.clear();
    }

    public void a(e eVar) {
        this.f11942o1.add(eVar);
        if (eVar.U() != null) {
            ((n) eVar.U()).S1(eVar);
        }
        eVar.x1(this);
    }

    @Override // v.e
    public void v1(int i4, int i5) {
        super.v1(i4, i5);
        int size = this.f11942o1.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f11942o1.get(i6).v1(Y(), Z());
        }
    }

    public n(int i4, int i5) {
        super(i4, i5);
        this.f11942o1 = new ArrayList<>();
    }

    public n(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.f11942o1 = new ArrayList<>();
    }
}
