package z1;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f13733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f13734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f13735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f13736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f13737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f13738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f13739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a[] f13740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a[] f13741k;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f13743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short f13744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public short f13746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public short f13747f;

        public a() {
        }
    }

    public o() {
        this.f13738h = (short) 10;
        this.f13739i = null;
        this.f13740j = null;
        this.f13741k = null;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        while (true) {
            int i11 = this.f13731a;
            int i12 = this.f13732b;
            if (i10 >= i11 * i12) {
                return this.f13739i;
            }
            int i13 = 10;
            int i14 = (bArr2[i10] & 255) * 10;
            a aVar = this.f13740j[i10];
            if (aVar.f13742a) {
                short s4 = aVar.f13743b;
                short s5 = aVar.f13744c;
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
                short s10 = aVar.f13747f;
                short s11 = aVar.f13746e;
                int iMin = Math.min(((((s6 * s10) + (s8 * (256 - s10))) * s11) + (((s7 * s10) + (s9 * (256 - s10))) * (256 - s11))) >> 16, 255);
                int i16 = aVar.f13745d;
                i14 += iMin * i16;
                i13 = 10 + i16;
            }
            a aVar2 = this.f13741k[i10];
            if (aVar2.f13742a) {
                short s12 = aVar2.f13743b;
                short s13 = aVar2.f13744c;
                int i17 = this.f13732b;
                int i18 = (s12 * i17) + s13;
                if (s12 < this.f13731a - 1) {
                    i4 = i18 + i17;
                    i5 = i18 + i17;
                } else {
                    i4 = i18;
                    i5 = i4;
                }
                if (s13 < i17 - 1) {
                    i6 = i18 + 1;
                    i5++;
                } else {
                    i6 = i18;
                }
                short s14 = (short) (bArr3[i18] & 255);
                short s15 = (short) (bArr3[i4] & 255);
                short s16 = (short) (bArr3[i6] & 255);
                short s17 = (short) (bArr3[i5] & 255);
                short s18 = aVar2.f13747f;
                short s19 = aVar2.f13746e;
                int iMin2 = Math.min(((((s14 * s18) + (s16 * (256 - s18))) * s19) + (((s15 * s18) + (s17 * (256 - s18))) * (256 - s19))) >> 16, 255);
                int i19 = aVar2.f13745d;
                i14 += iMin2 * i19;
                i13 += i19;
            }
            this.f13739i[i10] = (byte) (Math.max(Math.min(i14 / i13, 255), 0) & 255);
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.o.b():void");
    }

    public void c() {
        double d4;
        double d5;
        double d6 = this.f13735e;
        double d7 = this.f13734d / ((double) (this.f13731a - 1));
        double dAbs = Math.abs(this.f13733c);
        double dSin = Math.sin(d6) * dAbs;
        double dCos = Math.cos(d6) * dAbs;
        int i4 = 0;
        while (i4 < this.f13732b) {
            double d8 = dAbs - ((((double) i4) * this.f13736f) + this.f13737g);
            int i5 = this.f13731a - 1;
            short s4 = 0;
            while (i5 >= 0) {
                double d9 = dAbs;
                double dAsin = Math.asin(dSin / d8);
                double d10 = ((((double) i5) * d7) + (dAsin - d6)) / d7;
                double d11 = d6;
                double dCos2 = ((dCos - (Math.cos(dAsin) * d8)) - this.f13737g) / this.f13736f;
                a aVar = new a();
                if (d10 > 0.0d) {
                    d4 = d7;
                    if (d10 < this.f13731a - 1 && dCos2 >= 0.0d) {
                        if (s4 < 10) {
                            s4 = (short) (s4 + 1);
                        }
                        double d12 = dCos2 >= ((double) (this.f13732b + (-1))) ? r2 - 1 : dCos2;
                        aVar.f13742a = true;
                        aVar.f13745d = s4;
                        d5 = d8;
                        aVar.f13743b = (short) d10;
                        aVar.f13746e = (short) (((d10 + 1.0d) - d10) * 256.0d);
                        aVar.f13744c = (short) d12;
                        aVar.f13747f = (short) (((d12 + 1.0d) - d12) * 256.0d);
                    }
                    this.f13740j[(this.f13732b * i5) + i4] = aVar;
                    a aVar2 = new a();
                    aVar2.f13742a = aVar.f13742a;
                    aVar2.f13745d = aVar.f13745d;
                    aVar2.f13744c = aVar.f13744c;
                    aVar2.f13747f = aVar.f13747f;
                    int i6 = this.f13731a;
                    aVar2.f13743b = (short) ((i6 - 1) - aVar.f13743b);
                    aVar2.f13746e = (short) (256 - aVar.f13746e);
                    this.f13741k[(((i6 - 1) - i5) * this.f13732b) + i4] = aVar2;
                    i5--;
                    dAbs = d9;
                    d6 = d11;
                    d7 = d4;
                    d8 = d5;
                } else {
                    d4 = d7;
                }
                d5 = d8;
                aVar.f13742a = false;
                aVar.f13745d = s4;
                this.f13740j[(this.f13732b * i5) + i4] = aVar;
                a aVar22 = new a();
                aVar22.f13742a = aVar.f13742a;
                aVar22.f13745d = aVar.f13745d;
                aVar22.f13744c = aVar.f13744c;
                aVar22.f13747f = aVar.f13747f;
                int i62 = this.f13731a;
                aVar22.f13743b = (short) ((i62 - 1) - aVar.f13743b);
                aVar22.f13746e = (short) (256 - aVar.f13746e);
                this.f13741k[(((i62 - 1) - i5) * this.f13732b) + i4] = aVar22;
                i5--;
                dAbs = d9;
                d6 = d11;
                d7 = d4;
                d8 = d5;
            }
            i4++;
            d6 = d6;
        }
    }

    public o(int i4, int i5, double d4, double d5, double d6, double d7, double d8) {
        this.f13738h = (short) 10;
        this.f13739i = null;
        this.f13740j = null;
        this.f13741k = null;
        this.f13731a = i4;
        this.f13732b = i5;
        this.f13739i = new byte[i4 * i5];
        this.f13733c = d4;
        this.f13734d = d5;
        this.f13735e = d6;
        this.f13736f = d7;
        this.f13740j = null;
        this.f13741k = null;
        int i6 = i4 * i5;
        this.f13740j = new a[i6];
        this.f13741k = new a[i6];
        this.f13737g = d8;
        if (d4 >= 0.0d) {
            b();
        } else {
            c();
        }
    }
}
