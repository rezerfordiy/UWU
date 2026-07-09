package z1;

import z1.b0;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends f1 {
    public g1(u5 u5Var) {
        super(u5Var);
    }

    @Override // z1.d1
    public g7 s() {
        b0.o oVar;
        if (r() != null) {
            return r().q((r().p() <= 1 || (oVar = (b0.o) e(n0.a.TRANSDUCER.toString())) == null || !(oVar instanceof d7)) ? 0 : ((d7) oVar).f3());
        }
        return null;
    }
}
