package w;

import w.f;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12341m;

    public g(p pVar) {
        super(pVar);
        this.f12324e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // w.f
    public void e(int i4) {
        if (this.f12329j) {
            return;
        }
        this.f12329j = true;
        this.f12326g = i4;
        for (d dVar : this.f12330k) {
            dVar.a(dVar);
        }
    }
}
