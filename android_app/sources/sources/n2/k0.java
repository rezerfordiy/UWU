package n2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ boolean f9418p = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Byte> f9419a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<byte[]> f9420b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h[] f9421c = new h[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9422d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i[] f9423e = new i[4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f9433o;

    public void a() {
        ArrayList<Byte> arrayList = this.f9419a;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<byte[]> arrayList2 = this.f9420b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    public byte[] b() {
        int i4;
        byte[] bArrA;
        if (this.f9419a.size() != 3 || (i4 = this.f9426h) < 0 || i4 >= 4) {
            return null;
        }
        int i5 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (true) {
            if (i5 >= 3) {
                break;
            }
            Byte b4 = this.f9419a.get(i5);
            if (b4.byteValue() == 2) {
                bArr = this.f9420b.get(i5);
            } else if (b4.byteValue() == 1) {
                bArr2 = this.f9420b.get(i5);
            } else {
                bArr3 = this.f9420b.get(i5);
            }
            i5++;
        }
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return null;
        }
        if (this.f9422d) {
            bArrA = this.f9423e[this.f9426h].a(bArr, bArr3, bArr2);
        } else {
            h hVar = this.f9421c[this.f9426h];
            bArrA = hVar.b(bArr, bArr3, bArr2);
            if (this.f9427i) {
                hVar.e(this.f9428j, this.f9429k);
                bArrA = hVar.a(bArrA);
            }
        }
        if (!this.f9431m || bArrA == null) {
            return bArrA;
        }
        byte[] bArr4 = this.f9420b.get(2);
        byte[] bArr5 = this.f9420b.get(1);
        int i6 = 2058;
        int i7 = 0;
        while (true) {
            if (i6 >= 2560) {
                break;
            }
            byte b5 = bArr4[i6];
            if (b5 > 0) {
                if (b5 != bArr5[i6]) {
                    i7 = 0;
                    break;
                }
                i7++;
            }
            i6++;
        }
        if (!(i7 <= 0)) {
            if (this.f9432n) {
                return this.f9433o;
            }
            return null;
        }
        byte[] bArr6 = new byte[bArrA.length];
        this.f9433o = bArr6;
        System.arraycopy(bArrA, 0, bArr6, 0, bArrA.length);
        return bArrA;
    }

    public void c(boolean z3) {
        this.f9427i = z3;
    }

    public void d(boolean z3, boolean z4) {
        this.f9431m = z3;
        this.f9432n = z4;
        this.f9433o = null;
    }

    public byte[] e(byte[] bArr, int i4, int i5) {
        if (i5 != this.f9426h) {
            this.f9426h = i5;
        }
        this.f9430l = i4;
        return this.f9421c[this.f9426h].c(bArr, i4);
    }

    public byte[] f(byte[] bArr, int i4, int i5) {
        if (i4 >= 0 && i4 <= 2 && i5 >= 0 && i5 < 4) {
            if (i5 != this.f9426h) {
                this.f9419a.clear();
                this.f9420b.clear();
                this.f9426h = i5;
            }
            this.f9419a.add(new Byte((byte) (i4 & 255)));
            this.f9420b.add(bArr);
            if (this.f9419a.size() > 3) {
                this.f9419a.remove(0);
            }
            if (this.f9420b.size() > 3) {
                this.f9420b.remove(0);
            }
            byte[] bArrB = this.f9419a.size() >= 3 ? b() : null;
            if (bArrB != null) {
                byte[] bArr2 = new byte[bArrB.length];
                System.arraycopy(bArrB, 0, bArr2, 0, bArrB.length);
                return bArr2;
            }
        }
        return null;
    }

    public byte[] g(byte[] bArr, int i4, int i5) {
        return f(bArr, i4 > 0 ? 2 : i4 < 0 ? 1 : 0, i5);
    }

    public int h() {
        return this.f9430l;
    }

    public void i(int i4, int i5, double d4, double d5, double d6, float[] fArr) {
        this.f9422d = true;
        this.f9419a.clear();
        this.f9420b.clear();
        this.f9424f = i4;
        this.f9425g = i5;
        for (int i6 = 0; i6 < 4; i6++) {
            this.f9423e[i6] = new i(i4, i5, d4, d5, d6, fArr[i6]);
        }
    }

    public void j(int i4, int i5, float f4, float f5, float[] fArr) {
        this.f9422d = false;
        this.f9424f = i4;
        this.f9425g = i5;
        for (int i6 = 0; i6 < 4; i6++) {
            this.f9421c[i6] = new h(this.f9424f, this.f9425g, f4, f5, fArr[i6]);
        }
    }

    public void k(int i4, int i5, float f4, float f5, float[] fArr) {
        this.f9419a.clear();
        this.f9420b.clear();
        this.f9424f = i4;
        this.f9425g = i5;
        for (int i6 = 0; i6 < 4; i6++) {
            this.f9421c[i6] = new h(i4, i5, f4, f5, fArr[i6]);
        }
    }

    public void l(x0 x0Var) {
        this.f9419a.clear();
        this.f9420b.clear();
        this.f9424f = x0Var.w();
        this.f9425g = x0Var.E();
        float fA0 = x0Var.a0();
        float fU = x0Var.U();
        for (int i4 = 0; i4 < 4; i4++) {
            this.f9421c[i4] = new h(this.f9424f, this.f9425g, fA0, fU, x0Var.f9527g.b(i4));
        }
    }

    public boolean m() {
        return this.f9427i;
    }

    public void n(float f4, int i4) {
        this.f9428j = f4;
        this.f9429k = i4;
    }
}
