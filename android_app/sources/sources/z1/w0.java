package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends v0 implements g2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f13981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f13983h = new byte[3092];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13984i;

    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f13985i = 255;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f13986j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f13987k = 1344000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g2 f13988a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f13995h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f0 f13989b = new f0(f13987k);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13990c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f13991d = new byte[f13987k];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13992e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13994g = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13993f = 0;

        public final void a() {
            int i4 = 0;
            while (true) {
                if (i4 >= (this.f13989b.i() - 525) - 8) {
                    i4 = 0;
                    break;
                }
                if (this.f13989b.e(i4) == 90 && this.f13989b.e(i4 + 1) == -91 && this.f13989b.e(i4 + 2) == -1 && this.f13989b.e(i4 + 3) == 0 && this.f13989b.e(i4 + 4) == 90 && this.f13989b.e(i4 + 5) == -91 && this.f13989b.e(i4 + 6) == -1 && this.f13989b.e(i4 + 7) == 0) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                this.f13989b.j(i4);
            }
            if (this.f13989b.i() >= 525) {
                int iE = this.f13989b.e(8) & 255;
                int iE2 = this.f13989b.e(9) & 255;
                if (this.f13995h) {
                    iE2 |= (iE & 3) << 8;
                    iE &= 252;
                }
                if (iE == this.f13994g) {
                    this.f13993f++;
                    this.f13989b.j(10);
                    this.f13989b.g(this.f13991d, iE2 * 512, 512);
                    this.f13992e += 512;
                    this.f13989b.j(3);
                    return;
                }
                int i5 = this.f13992e;
                if (i5 > 0) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(this.f13991d, 0, bArr, 0, i5);
                    b(bArr);
                }
                this.f13992e = 0;
                this.f13994g = iE;
                this.f13993f = 0;
            }
        }

        public final void b(byte[] bArr) {
            if (bArr.length > 0) {
                int i4 = this.f13994g;
                int i5 = i4 & 255;
                if (this.f13995h) {
                    i5 = i4 & 252;
                }
                g2 g2Var = this.f13988a;
                if (g2Var != null) {
                    g2Var.a(bArr, i5);
                }
            }
        }

        public void c(byte[] bArr) {
            this.f13989b.h(bArr);
            while (this.f13989b.i() > 525) {
                a();
            }
        }

        public void d() {
            this.f13989b = null;
            this.f13991d = null;
            this.f13994g = 0;
            this.f13993f = 0;
            this.f13992e = 0;
            this.f13990c = 0;
        }

        public void e(g2 g2Var) {
            this.f13988a = g2Var;
        }
    }

    public w0() {
        a aVar = new a();
        this.f13981f = aVar;
        aVar.e(this);
    }

    public static w0 e() {
        w0 w0Var = new w0();
        w0Var.f13981f.f13995h = false;
        return w0Var;
    }

    public static w0 f() {
        w0 w0Var = new w0();
        w0Var.f13981f.f13995h = true;
        return w0Var;
    }

    @Override // z1.g2
    public void a(byte[] bArr, int i4) {
        HashMap map = new HashMap();
        Map<String, Object> map2 = new HashMap<>();
        q1 q1Var = this.f13979c;
        if (q1Var != null) {
            map2 = q1Var.a(i4, this.f13982g);
        } else {
            map2.put("compound_enabled", Boolean.valueOf((i4 & 128) != 0));
            map2.put("compound_steer_degree", Float.valueOf(d(i4)));
        }
        map.put("state", map2);
        map.put("raw", bArr);
        this.f13977a.c(map);
    }

    @Override // z1.v0
    public void b(byte[] bArr, String str) {
        Map map;
        if (!str.equals("socket_state")) {
            if (str.equals("socket_data")) {
                this.f13981f.c(bArr);
                return;
            }
            return;
        }
        Map<String, Object> mapG = g(bArr);
        if (mapG == null || mapG.size() <= 0) {
            return;
        }
        this.f13977a.c(mapG);
        if (!mapG.containsKey("state") || (map = (Map) mapG.get("state")) == null || map.size() <= 0 || !map.containsKey("trans")) {
            return;
        }
        this.f13982g = ((Integer) map.get("trans")).intValue();
    }

    public float d(int i4) {
        a7 a7Var = this.f13978b;
        if (a7Var != null) {
            return a7Var.a(this.f13982g, i4);
        }
        byte b4 = (byte) ((i4 & 112) >> 4);
        return b4 == 1 ? 7 : b4 == 2 ? -7 : 0;
    }

    public Map<String, Object> g(byte[] bArr) {
        HashMap map = new HashMap();
        if (bArr.length >= 4) {
            System.arraycopy(bArr, 0, this.f13983h, this.f13984i, bArr.length);
            int length = this.f13984i + bArr.length;
            this.f13984i = length;
            byte[] bArr2 = this.f13983h;
            if ((bArr2[0] & 255) == 165 && (bArr2[1] & 255) == 90) {
                int i4 = bArr2[3] | (bArr2[2] << 8);
                if (length < i4) {
                    return null;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 != 5) {
                        byte b4 = this.f13983h[i5];
                    }
                }
                byte[] bArr3 = this.f13983h;
                byte b5 = bArr3[5];
                byte b6 = bArr3[4];
                int i6 = i4 - 6;
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr3, 6, bArr4, 0, i6);
                HashMap map2 = new HashMap();
                map2.put("calibrationData", bArr4);
                map.put("state", map2);
                this.f13984i = 0;
            }
            if ((bArr[0] & 255) == 90 && (bArr[1] & 255) == 165) {
                HashMap map3 = new HashMap();
                map3.put("live", Boolean.valueOf((bArr[2] & 128) != 0));
                map3.put("trans", Integer.valueOf((bArr[2] & l1.f13570x) == 0 ? 0 : 1));
                map3.put("zoom", Integer.valueOf(bArr[2] & 3));
                map3.put("gain", Integer.valueOf(bArr[3] & 127));
                map.put("state", map3);
                this.f13984i -= 4;
            }
        }
        this.f13984i = 0;
        return map;
    }
}
