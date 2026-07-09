package z1;

import java.util.HashMap;
import java.util.Map;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class u6 extends j6 {
    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            HashMap map = new HashMap();
            this.f13432j = map;
            map.put("US-1H", new v(512, 128, 32));
            this.f13429h.put(0, new j6.c((byte) 0, "US-1H"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        if (i4 == 0 || i4 == 1) {
            return 131;
        }
        return i4 == 4 ? 109 : 196;
    }
}
