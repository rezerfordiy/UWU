package z1;

import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.Map;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class t6 extends j6 {
    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            this.f13432j = new HashMap();
            v vVar = new v();
            vVar.a(0, 512, 256, 0);
            vVar.a(1, 512, 256, 0);
            vVar.a(2, 512, 128, 32);
            vVar.a(3, 512, 128, 32);
            vVar.a(4, 512, 128, 32);
            this.f13432j.put("UL-1HS", vVar);
            this.f13429h.put(0, new j6.c((byte) 0, "UL-1HS"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        return (i4 == 0 || i4 == 1) ? z3 ? 83 : 66 : (i4 == 2 || i4 == 3) ? e.m.A3 : E() < 4 ? 111 : 50;
    }
}
