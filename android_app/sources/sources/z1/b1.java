package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b1 extends a1 implements h2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12939j;

    public b1() {
        k2 k2Var = new k2();
        this.f12887f = k2Var;
        k2Var.f13529a = this;
    }

    public static b1 h() {
        b1 b1Var = new b1();
        b1Var.f12887f.f13530b = false;
        return b1Var;
    }

    public static b1 i() {
        b1 b1Var = new b1();
        b1Var.f12887f.f13530b = true;
        return b1Var;
    }

    @Override // z1.a1, z1.h2
    public void a(byte[] bArr, int i4) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("compound_enabled", Boolean.valueOf((i4 & 128) != 0));
        d(i4);
        float f4 = i4;
        if (f4 == 0.0f) {
            f4 = 0.0f;
        }
        if (f4 == 1.0f) {
            f4 = 7.0f;
        }
        if (f4 == 3.0f) {
            f4 = -7.0f;
        }
        map2.put("compound_steer_degree", Float.valueOf(f4));
        map2.put("trans_tag", Integer.valueOf(this.f12938i));
        map.put("state", map2);
        map.put("raw", bArr);
        this.f13977a.c(map);
    }

    @Override // z1.a1, z1.v0
    public void b(byte[] bArr, String str) {
        if (str.equals("socket_state")) {
            Map<String, Object> mapG = g(bArr);
            if (mapG.keySet().size() > 0) {
                this.f13977a.c(mapG);
                return;
            }
            return;
        }
        if (str.equals("compound_steer")) {
            byte b4 = bArr[0];
            if (b4 >= 0) {
                this.f12939j = b4;
                return;
            }
            return;
        }
        if (str.equals("socket_data")) {
            a(bArr, (byte) this.f12939j);
        } else if (str.equals("trans_tag")) {
            j(bArr);
        }
    }

    public Map<String, Object> j(byte[] bArr) {
        HashMap map = new HashMap();
        this.f12938i = bArr[0];
        return map;
    }
}
