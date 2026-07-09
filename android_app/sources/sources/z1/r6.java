package z1;

import java.util.HashMap;
import java.util.Map;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class r6 extends j6 {
    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            HashMap map = new HashMap();
            this.f13432j = map;
            map.put("SS-6H", new v(512, 128, 32));
            this.f13429h.put(0, new j6.c((byte) 0, "SS-6H"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        return (i4 == 0 || i4 == 1) ? z3 ? 100 : 80 : i4 == 4 ? 111 : 161;
    }
}
