package z1;

import z1.b0;
import z1.e7;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class f7 extends e7 {
    @Override // z1.e7, z1.r0
    public o0 g() {
        e7.a aVar;
        b0.o oVar = (b0.o) c(n0.a.TRANSDUCER.toString());
        oVar.o1();
        if (oVar instanceof d7) {
            byte bG3 = ((d7) oVar).g3();
            if (bG3 == 15) {
                o0 o0VarD = d(e7.a.TRANS_A.toString());
                if (o0VarD != null) {
                    return o0VarD;
                }
                aVar = e7.a.TRANS_DEFAULT;
            } else if (bG3 == 7) {
                aVar = e7.a.TRANS_B;
            } else if (bG3 == 11) {
                aVar = e7.a.TRANS_C;
            } else if (bG3 == 3) {
                aVar = e7.a.TRANS_D;
            } else if (bG3 == 13) {
                aVar = e7.a.TRANS_E;
            } else if (bG3 == 5) {
                aVar = e7.a.TRANS_F;
            } else if (bG3 == 9) {
                aVar = e7.a.TRANS_G;
            } else if (bG3 == 1) {
                aVar = e7.a.TRANS_H;
            }
            return d(aVar.toString());
        }
        return null;
    }
}
