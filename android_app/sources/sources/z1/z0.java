package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z0 extends v0 implements h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j2 f14211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14213h;

    public z0() {
        j2 j2Var = new j2();
        this.f14211f = j2Var;
        j2Var.f13409h = this;
    }

    @Override // z1.h2
    public void a(byte[] bArr, int i4) {
        this.f13977a.c(e(bArr));
    }

    @Override // z1.v0
    public void b(byte[] bArr, String str) {
        this.f14211f.c(bArr);
    }

    public float d(int i4) {
        a7 a7Var = this.f13978b;
        if (a7Var != null) {
            return a7Var.a(this.f14213h, i4);
        }
        if (i4 == 129) {
            return 7.0f;
        }
        return i4 == 131 ? -7.0f : 0.0f;
    }

    public final Map<String, Object> e(byte[] bArr) {
        HashMap map = new HashMap();
        int length = bArr.length / 525;
        if (length >= 1 && (bArr[8] & 255) == 255) {
            HashMap map2 = new HashMap();
            int i4 = bArr[20] & 255;
            this.f14213h = i4;
            map2.put("trans", Integer.valueOf(i4));
            map2.put("mode", Integer.valueOf(bArr[21] & 255));
            map2.put("live", Boolean.valueOf(((bArr[22] & 255) & 3) == 1));
            map2.put("gain", Integer.valueOf(bArr[23] & 255 & 127));
            map2.put("zoom", Integer.valueOf(bArr[24] & 255));
            if (this.f14212g) {
                map2.put("focus", Integer.valueOf(bArr[52]));
                map2.put("harmonic", Integer.valueOf(bArr[53]));
                map2.put("dynamic_range", Integer.valueOf(bArr[54]));
                boolean z3 = bArr[55] != 0;
                int i5 = 255 & bArr[56];
                boolean z4 = (i5 & 128) != 0;
                float fD = d(i5);
                map2.put("compound_enabled", Boolean.valueOf(z3 & z4));
                map2.put("compound_steer_degree", Float.valueOf(fD));
            }
            map.put("state", map2);
        }
        int i6 = length - 1;
        if (i6 > 0) {
            byte[] bArr2 = new byte[i6 * 512];
            for (int i7 = 1; i7 < length; i7++) {
                System.arraycopy(bArr, (i7 * 525) + 12, bArr2, (i7 - 1) * 512, 512);
            }
            map.put("raw", bArr2);
        }
        return map;
    }
}
