package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import z1.v0;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends v0 implements h2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f14181r = 268800;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2 f14182f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, Object> f14186j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14193q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14183g = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f14187k = new byte[f14181r];

    public y0() {
        i2 i2Var = new i2();
        this.f14182f = i2Var;
        i2Var.e(this);
        this.f14184h = 0;
    }

    @Override // z1.h2
    public void a(byte[] bArr, int i4) {
        this.f13977a.c(j(bArr));
    }

    @Override // z1.v0
    public void b(byte[] bArr, String str) {
        this.f14182f.c(bArr);
    }

    @Override // z1.v0
    public /* bridge */ /* synthetic */ void c(v0.a aVar) {
        super.c(aVar);
    }

    public byte[] d() {
        if (this.f14187k == null) {
            this.f14187k = new byte[f14181r];
        }
        return this.f14187k;
    }

    public boolean e(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i5];
        long j4 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 != 5) {
                j4 += (long) bArr[i6];
            }
        }
        return ((byte) (0 - ((byte) ((int) (255 & j4))))) == b4;
    }

    public double f(byte b4) {
        if (this.f13978b == null) {
            return 0.0d;
        }
        return r0.a(0, b4);
    }

    public int g() {
        return this.f14184h;
    }

    public Map<String, Object> h() {
        return this.f14186j;
    }

    public boolean i() {
        return this.f14192p;
    }

    public final Map<String, Object> j(byte[] bArr) {
        HashMap map = new HashMap();
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            byte b4 = bArr[7];
            if (b4 == i2.f13321k) {
                HashMap map2 = new HashMap();
                int i4 = ((bArr[4] & 255) << 8) | (bArr[5] & 255);
                boolean zE = length >= i4;
                if (zE) {
                    if (this.f14185i) {
                        zE = e(bArr, i4, 6);
                    }
                    if (zE) {
                        map2.put("live", Boolean.valueOf(((byte) (bArr[10] & 3)) == 1));
                        byte b5 = (byte) (bArr[12] & 3);
                        map2.put("iu_count", Byte.valueOf(b5));
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < b5; i5++) {
                            byte[] bArr2 = new byte[64];
                            System.arraycopy(bArr, (i5 * 64) + 16, bArr2, 0, 64);
                            Map<String, Object> mapK = k(bArr2);
                            if (mapK != null) {
                                arrayList.add(mapK);
                            }
                        }
                        map2.put("iu_list", arrayList);
                    }
                }
                map.put("state", map2);
            } else if (b4 == i2.f13322l) {
                int i6 = ((bArr[4] & 255) << 8) | (bArr[5] & 255);
                boolean zE2 = length >= i6;
                if (zE2) {
                    if (this.f14185i) {
                        zE2 = e(bArr, i6, 6);
                    }
                    if (zE2) {
                        this.f14189m = bArr[8];
                        this.f14190n = ((bArr[10] & 255) << 8) | (bArr[11] & 255);
                        byte[] bArr3 = new byte[64];
                        System.arraycopy(bArr, 12, bArr3, 0, 64);
                        Map<String, Object> mapK2 = k(bArr3);
                        this.f14191o = ((Integer) mapK2.get("tag")).intValue();
                        this.f14186j = mapK2;
                        this.f14188l = 0;
                    }
                }
            } else if (b4 == i2.f13323m) {
                int i7 = ((bArr[4] & 255) << 8) | (bArr[5] & 255);
                boolean zE3 = length >= i7;
                if (zE3) {
                    if (this.f14185i) {
                        zE3 = e(bArr, i7, 6);
                    }
                    if (zE3) {
                        int i8 = i7 - 12;
                        if (bArr[8] != this.f14189m) {
                            return map;
                        }
                        int i9 = ((bArr[10] & 255) << 8) | (bArr[11] & 255);
                        System.arraycopy(bArr, 12, this.f14187k, this.f14188l, i8);
                        int i10 = this.f14188l + i8;
                        this.f14188l = i10;
                        int i11 = i10 % 512;
                        int i12 = this.f14190n;
                        if (i10 == i8 * i12 && i9 == i12 - 1) {
                            map.put("frame_param", this.f14186j);
                            int i13 = this.f14188l;
                            byte[] bArr4 = new byte[i13];
                            System.arraycopy(this.f14187k, 0, bArr4, 0, i13);
                            map.put("raw", bArr4);
                            this.f14188l = 0;
                        }
                    }
                }
            }
        }
        return map;
    }

    public Map<String, Object> k(byte[] bArr) {
        HashMap map = new HashMap();
        if (this.f14185i && !e(bArr, bArr.length, 3)) {
            return null;
        }
        map.put("checked", Integer.valueOf(bArr[3] & 255));
        int i4 = bArr[2] & 3;
        map.put("tag", Integer.valueOf(i4));
        map.put("mode", Byte.valueOf((byte) (bArr[4] & 255)));
        map.put("gain", Integer.valueOf((byte) (bArr[8] & 127)));
        map.put("zoom", Integer.valueOf(bArr[9]));
        map.put("dynamic_range", Byte.valueOf(bArr[12]));
        map.put("harmonic", Boolean.valueOf(bArr[13] != 0));
        map.put("focus", Byte.valueOf(bArr[15]));
        byte b4 = bArr[14];
        byte b5 = bArr[16];
        map.put("compound_enabled", Boolean.valueOf(b4 > 0));
        map.put("compound_steer_degree", Float.valueOf(this.f13978b.a((byte) i4, b5)));
        byte[] bArr2 = new byte[87];
        for (int i5 = 18; i5 < 26; i5++) {
            bArr2[i5] = bArr[i5];
        }
        map.put("vgain", bArr2);
        map.put("bc_gain", Byte.valueOf(bArr[28]));
        map.put("bc_focus", Byte.valueOf(bArr[29]));
        map.put("bc_steer", Byte.valueOf(bArr[30]));
        map.put("bc_prf", Byte.valueOf(bArr[31]));
        map.put("bc_mode", Byte.valueOf(bArr[32]));
        map.put("bc_wf", Byte.valueOf(bArr[33]));
        map.put("bc_line_start", Integer.valueOf((bArr[36] << 8) | bArr[37]));
        map.put("bc_line_end", Integer.valueOf((bArr[38] << 8) | bArr[39]));
        map.put("bc_start_point", Integer.valueOf((bArr[40] << 8) | bArr[41]));
        map.put("bc_volume", Integer.valueOf((bArr[42] << 8) | bArr[43]));
        map.put("bd_gain", Byte.valueOf(bArr[48]));
        map.put("bd_focus", Byte.valueOf(bArr[49]));
        map.put("bd_steer", Byte.valueOf(bArr[50]));
        map.put("bd_prf", Byte.valueOf(bArr[51]));
        map.put("bd_line", Integer.valueOf((bArr[52] << 8) | bArr[53]));
        map.put("bd_start_point", Integer.valueOf((bArr[54] << 8) | bArr[55]));
        map.put("bd_volume", Integer.valueOf(bArr[57] | (bArr[56] << 8)));
        return map;
    }

    public void l(int i4) {
        this.f14184h = i4;
    }

    public void m(boolean z3) {
        this.f14192p = z3;
    }

    public void n(Map<String, Object> map) {
        this.f14186j = map;
    }
}
