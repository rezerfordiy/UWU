package z1;

import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.Map;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class o6 extends j6 {
    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            this.f13432j = new HashMap();
            v vVar = new v();
            vVar.a(0, 512, 384, 0);
            vVar.a(1, 512, 384, 0);
            vVar.a(2, 512, 192, 32);
            vVar.a(3, 512, 192, 32);
            vVar.a(4, 512, 192, 32);
            this.f13432j.put("SH-3C", vVar);
            this.f13429h.put(0, new j6.c((byte) 0, "SH-3C"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        if (i4 == 0 || i4 == 1) {
            if (z3) {
                return e.m.A3;
            }
            return 92;
        }
        if (i4 == 4) {
            return (E() == 0 || E() == 4) ? 111 : 80;
        }
        return 161;
    }
}
