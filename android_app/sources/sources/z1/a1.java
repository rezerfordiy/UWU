package z1;

import java.util.HashMap;
import java.util.Map;
import z1.b0;
import z1.n0;
import z1.v0;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends v0 implements h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k2 f12887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12888g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12889h = false;

    public a1() {
        k2 k2Var = new k2();
        this.f12887f = k2Var;
        k2Var.f13529a = this;
    }

    public static a1 e() {
        a1 a1Var = new a1();
        a1Var.f12887f.f13530b = false;
        return a1Var;
    }

    public static a1 f() {
        a1 a1Var = new a1();
        a1Var.f12887f.f13530b = true;
        return a1Var;
    }

    @Override // z1.h2
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
        map.put("state", map2);
        map.put("raw", bArr);
        this.f13977a.c(map);
    }

    @Override // z1.v0
    public void b(byte[] bArr, String str) {
        if (!str.equals("socket_state")) {
            if (str.equals("socket_data")) {
                a(bArr, (byte) m1.f13637m);
            }
        } else {
            Map<String, Object> mapG = g(bArr);
            if (mapG.keySet().size() > 0) {
                this.f13977a.c(mapG);
            }
        }
    }

    public float d(int i4) {
        a7 a7Var = this.f13978b;
        if (a7Var == null) {
            return 0.0f;
        }
        return a7Var.a(0, i4);
    }

    public Map<String, Object> g(byte[] bArr) {
        HashMap map;
        HashMap map2 = new HashMap();
        v0.b bVar = this.f13977a;
        if (bVar instanceof d1) {
            this.f12889h = ((b0.k) ((d1) bVar).e(n0.a.LIVE.toString())).h1();
        }
        if (bArr != null) {
            byte b4 = (bArr[0] == 90 && bArr[1] == -91) ? bArr[2] : (byte) 0;
            if (b4 != 1 || this.f12889h) {
                if (b4 == 2 && this.f12889h) {
                    this.f12888g = true;
                    this.f12889h = false;
                    map = new HashMap();
                    map.put("live", Boolean.valueOf(this.f12889h));
                    map2.put("state", map);
                }
            } else if (this.f12888g) {
                this.f12888g = false;
            } else {
                this.f12889h = true;
                map = new HashMap();
                map.put("live", Boolean.valueOf(this.f12889h));
                map2.put("state", map);
            }
        }
        return map2;
    }
}
