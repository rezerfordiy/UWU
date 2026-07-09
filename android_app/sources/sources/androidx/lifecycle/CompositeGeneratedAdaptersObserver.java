package androidx.lifecycle;

import androidx.lifecycle.i;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f4083a;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f4083a = fVarArr;
    }

    @Override // androidx.lifecycle.j
    public void d(@j0 l lVar, @j0 i.b bVar) {
        p pVar = new p();
        for (f fVar : this.f4083a) {
            fVar.a(lVar, bVar, false, pVar);
        }
        for (f fVar2 : this.f4083a) {
            fVar2.a(lVar, bVar, true, pVar);
        }
    }
}
