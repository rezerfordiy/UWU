package z1;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13457a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f13460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f13461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f13462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f13463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f13464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f13465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f13466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a[] f13467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a[] f13468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f13470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f13473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f13474r;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f13476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short f13477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public short f13478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public short f13479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public short f13480f;

        public a() {
        }
    }

    public k0(int i4, int i5, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f13466j = null;
        this.f13467k = null;
        this.f13468l = null;
        this.f13458b = i4;
        this.f13459c = i5;
        this.f13460d = d4;
        this.f13461e = d5;
        this.f13462f = d6;
        this.f13463g = d7;
        this.f13464h = d8;
        this.f13465i = d9;
        int i6 = i4 * i5;
        this.f13466j = new byte[i6];
        this.f13474r = new byte[i6];
        this.f13467k = new a[i6];
        this.f13468l = new a[i6];
        this.f13470n = new byte[i4 * i5];
        this.f13473q = new byte[i4 * i5];
        this.f13474r = new byte[i4 * i5];
        d();
    }

    public byte[] a(byte[] bArr) {
        if (bArr == null || this.f13473q == null || this.f13470n == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f13458b * this.f13459c; i4++) {
            byte b4 = this.f13473q[i4];
            if (b4 == 0) {
                this.f13474r[i4] = bArr[i4];
            } else {
                int i5 = (((b4 & 255) * (this.f13470n[i4] & 255)) / 16) & 255;
                byte b5 = bArr[i4];
                if (i5 > (b5 & 255)) {
                    this.f13474r[i4] = (byte) i5;
                } else {
                    this.f13474r[i4] = (byte) (b5 & 255);
                }
            }
        }
        return this.f13474r;
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        while (true) {
            int i11 = this.f13458b;
            int i12 = this.f13459c;
            if (i10 >= i11 * i12) {
                return this.f13466j;
            }
            int i13 = 10;
            int i14 = (bArr2[i10] & 255) * 10;
            a aVar = this.f13467k[i10];
            if (aVar.f13475a) {
                short s4 = aVar.f13476b;
                short s5 = aVar.f13477c;
                int i15 = (s4 * i12) + s5;
                if (s4 < i11 - 1) {
                    i7 = i15 + i12;
                    i8 = i15 + i12;
                } else {
                    i7 = i15;
                    i8 = i7;
                }
                if (s5 < i12 - 1) {
                    i9 = i15 + 1;
                    i8++;
                } else {
                    i9 = i15;
                }
                short s6 = (short) (bArr[i15] & 255);
                short s7 = (short) (bArr[i7] & 255);
                short s8 = (short) (bArr[i9] & 255);
                short s9 = (short) (bArr[i8] & 255);
                short s10 = aVar.f13480f;
                short s11 = aVar.f13479e;
                int iMin = Math.min(((((s6 * s10) + (s8 * (256 - s10))) * s11) + (((s7 * s10) + (s9 * (256 - s10))) * (256 - s11))) >> 16, 255);
                short s12 = aVar.f13478d;
                i14 += iMin * s12;
                i13 = 10 + s12;
            }
            a aVar2 = this.f13468l[i10];
            if (aVar2.f13475a) {
                short s13 = aVar2.f13476b;
                short s14 = aVar2.f13477c;
                int i16 = this.f13459c;
                int i17 = (s13 * i16) + s14;
                if (s13 < this.f13458b - 1) {
                    i4 = i17 + i16;
                    i5 = i17 + i16;
                } else {
                    i4 = i17;
                    i5 = i4;
                }
                if (s14 < i16 - 1) {
                    i6 = i17 + 1;
                    i5++;
                } else {
                    i6 = i17;
                }
                short s15 = (short) (bArr3[i17] & 255);
                short s16 = (short) (bArr3[i4] & 255);
                short s17 = (short) (bArr3[i6] & 255);
                short s18 = (short) (bArr3[i5] & 255);
                short s19 = aVar2.f13480f;
                short s20 = aVar2.f13479e;
                int iMin2 = Math.min(((((s15 * s19) + (s17 * (256 - s19))) * s20) + (((s16 * s19) + (s18 * (256 - s19))) * (256 - s20))) >> 16, 255);
                short s21 = aVar2.f13478d;
                i14 += iMin2 * s21;
                i13 += s21;
            }
            this.f13466j[i10] = (byte) (Math.max(Math.min(i14 / i13, 255), 0) & 255);
            i10++;
        }
    }

    public byte[] c(byte[] bArr, float f4) {
        double d4 = (float) (((double) (f4 / 180.0f)) * 3.141592653589793d);
        float fCos = (float) (1.0d / Math.cos(d4));
        float fTan = (float) ((this.f13463g * Math.tan(d4)) / this.f13465i);
        int i4 = 0;
        for (int i5 = 0; i5 < this.f13458b; i5++) {
            float f5 = i5;
            float f6 = 0.0f;
            int i6 = 0;
            while (true) {
                int i7 = this.f13459c;
                if (i6 < i7) {
                    int i8 = (int) (f6 + 0.5f);
                    int i9 = (int) (0.5f + f5);
                    if (i8 < 0 || i8 >= i7 || i9 < 0 || i9 >= this.f13458b) {
                        this.f13470n[i4] = 0;
                    } else {
                        this.f13470n[i4] = bArr[(i9 * i7) + i8];
                    }
                    i4++;
                    f6 += fCos;
                    f5 += fTan;
                    i6++;
                }
            }
        }
        return this.f13470n;
    }

    public void d() {
        double d4;
        double d5;
        double d6 = this.f13462f;
        double d7 = this.f13461e / ((double) (this.f13458b - 1));
        double d8 = this.f13460d;
        double dSin = Math.sin(d6) * d8;
        double dCos = Math.cos(d6) * d8;
        double dAcos = Math.acos(dSin / d8);
        int i4 = 0;
        while (i4 < this.f13459c) {
            double d9 = (((double) i4) * this.f13463g) + this.f13464h + d8;
            int i5 = this.f13458b - 1;
            short s4 = 0;
            while (i5 >= 0) {
                double d10 = d8;
                double dAcos2 = ((Math.acos(dSin / d9) + (((double) i5) * d7)) - dAcos) / d7;
                double d11 = dCos;
                double dSqrt = ((Math.sqrt((d9 * d9) - (dSin * dSin)) - dCos) - this.f13464h) / this.f13463g;
                double d12 = d7;
                a aVar = new a();
                int i6 = (int) dAcos2;
                double d13 = dSin;
                int i7 = (int) dSqrt;
                if (i6 < 0 || i6 >= this.f13458b - 1 || i7 < 0) {
                    d4 = dAcos;
                    aVar.f13475a = false;
                    aVar.f13478d = s4;
                } else {
                    if (s4 < 10) {
                        s4 = (short) (s4 + 1);
                    }
                    int i8 = this.f13459c;
                    if (i7 >= i8 - 1) {
                        i7 = i8 - 1;
                        d5 = i7;
                    } else {
                        d5 = dSqrt;
                    }
                    aVar.f13475a = true;
                    aVar.f13478d = s4;
                    d4 = dAcos;
                    aVar.f13476b = (short) i6;
                    aVar.f13479e = (short) (((((double) i6) + 1.0d) - dAcos2) * 256.0d);
                    aVar.f13477c = (short) i7;
                    aVar.f13480f = (short) (((((double) i7) + 1.0d) - d5) * 256.0d);
                }
                this.f13467k[(this.f13459c * i5) + i4] = aVar;
                a aVar2 = new a();
                aVar2.f13475a = aVar.f13475a;
                aVar2.f13477c = aVar.f13477c;
                aVar2.f13478d = aVar.f13478d;
                aVar2.f13480f = aVar.f13480f;
                int i9 = this.f13458b;
                aVar2.f13476b = (short) ((i9 - 1) - aVar.f13476b);
                aVar2.f13479e = (short) (256 - aVar.f13479e);
                this.f13468l[(((i9 - 1) - i5) * this.f13459c) + i4] = aVar2;
                i5--;
                d8 = d10;
                d7 = d12;
                dCos = d11;
                dSin = d13;
                dAcos = d4;
            }
            i4++;
            d8 = d8;
            dCos = dCos;
        }
    }

    public void e(float f4, int i4) {
        int i5;
        if (this.f13471o == f4 && this.f13472p == i4) {
            return;
        }
        this.f13471o = f4;
        this.f13472p = i4;
        this.f13473q = new byte[this.f13473q.length];
        if ((i4 < -85 || i4 > -50) && (i4 > 85 || i4 < 50)) {
            return;
        }
        int i6 = i4 > 0 ? 90 - i4 : i4 + 90;
        double d4 = this.f13465i;
        float f5 = (float) ((((double) f4) + ((this.f13458b / 2.0f) * d4)) / d4);
        float fTan = (float) ((Math.tan((float) (((double) (i6 / 180.0f)) * 3.141592653589793d)) * this.f13465i) / this.f13463g);
        float f6 = (0.0f - f5) * fTan;
        if (this.f13472p > 0) {
            f6 = (f5 - this.f13458b) * fTan;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.f13458b) {
                return;
            }
            int i8 = this.f13459c;
            int i9 = i7 * i8;
            if (this.f13472p > 0) {
                i9 = ((r2 - i7) - 1) * i8;
            }
            int i10 = (int) (((double) f6) + 0.5d);
            if (i10 >= 0 && i10 < i8) {
                this.f13473q[i9 + i10] = l1.f13562p;
            }
            int iMax = Math.max(i10 - 48, 0);
            int i11 = i10 + 48;
            int i12 = this.f13459c;
            if (i11 >= i12) {
                i11 = i12 - 1;
            }
            for (int i13 = iMax; i13 <= i11; i13++) {
                this.f13473q[i9 + i13] = l1.f13562p;
            }
            for (int i14 = 16; iMax >= 0 && i14 > 0; i14--) {
                if (iMax < this.f13459c) {
                    this.f13473q[i9 + iMax] = (byte) (i14 & 255);
                }
                iMax--;
            }
            for (int i15 = 16; i11 < this.f13459c && i15 > 0 && (i5 = i9 + i11) > 0; i15--) {
                this.f13473q[i5] = (byte) (i15 & 255);
                i11++;
            }
            f6 += fTan;
            i7++;
        }
    }
}
