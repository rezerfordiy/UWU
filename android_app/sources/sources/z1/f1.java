package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import z1.n0;
import z1.q7;
import z1.u5;
import z1.v0;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends d1 implements q, u5.c, v0.b {
    public f1(u5 u5Var) {
        super(u5Var);
    }

    public void A(byte[] bArr) {
        if (this.f12951a != null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map2.put("CurrentProbeStateUpdate", bArr);
            map.put("notice", map2);
            this.f12951a.e(map);
        }
    }

    public void B(byte[] bArr) {
        if (this.f12951a != null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map2.put("ProbeStateUpdate", bArr);
            map.put("notice", map2);
            this.f12951a.e(map);
        }
    }

    @Override // z1.d1, z1.c1, z1.u5.c
    public byte[] b(String str) {
        return ((x) p().f14216c).f14132j.b(this, str);
    }

    @Override // z1.d1, z1.c1
    public n0 e(String str) {
        q0 q0Var = this.f12987k;
        if (q0Var == null) {
            return null;
        }
        q0Var.h();
        p0 p0VarA = this.f12987k.a(n0.a.TRANSDUCER.toString());
        if (p0VarA instanceof q7.c) {
            q7.c cVar = (q7.c) p0VarA;
            int iB0 = cVar.B0();
            List arrayList = new ArrayList();
            q2 q2Var = this.f12952b;
            if (q2Var instanceof f3) {
                arrayList = ((f3) q2Var).f13139f;
            }
            if (iB0 >= arrayList.size()) {
                cVar.e0(0);
                iB0 = 0;
            }
            u5 u5Var = this.f12986j;
            if (u5Var instanceof f6) {
                f6 f6Var = (f6) u5Var;
                if (arrayList.size() > 0 && (arrayList.get(iB0) instanceof g7)) {
                    g7 g7Var = (g7) arrayList.get(iB0);
                    String str2 = ((String[]) g7Var.a().toArray(new String[0]))[0];
                    if (g7Var.d(str2) instanceof z1) {
                        w wVar = ((z1) g7Var.d(str2)).f14216c;
                        if (wVar instanceof p7) {
                            r rVar = ((p7) wVar).f13828a;
                            if (rVar instanceof t0) {
                                f6Var.f13151e = (t0) rVar;
                            }
                        }
                    }
                }
            }
        }
        return super.e(str);
    }

    @Override // z1.d1
    public void w(q0 q0Var) {
        super.w(q0Var);
    }

    @Override // z1.d1
    public void x(v0 v0Var) {
        this.f12982f = v0Var;
        v0Var.f13977a = this;
    }

    public void z() {
        if (this.f12951a != null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map2.put("UpdateFlexible", Boolean.TRUE);
            map.put("notice", map2);
            this.f12951a.e(map);
        }
    }
}
