package z1;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f13536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f13537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f13538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f13541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f13542l;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13551i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13552j;

        public a() {
        }
    }

    public l() {
        this.f13531a = 0;
        this.f13532b = 0;
        this.f13533c = 0.0f;
        this.f13534d = 0.0f;
        this.f13535e = 0.0f;
    }

    public byte[] a(byte[] bArr) {
        if (bArr == null || this.f13541k == null || this.f13538h == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f13531a * this.f13532b; i4++) {
            byte b4 = this.f13541k[i4];
            if (b4 == 0) {
                this.f13542l[i4] = bArr[i4];
            } else {
                int i5 = (((b4 & 255) * (this.f13538h[i4] & 255)) / 16) & 255;
                byte b5 = bArr[i4];
                if (i5 > (b5 & 255)) {
                    this.f13542l[i4] = (byte) i5;
                } else {
                    this.f13542l[i4] = (byte) (b5 & 255);
                }
            }
        }
        return this.f13542l;
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f13531a; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f13532b;
                if (i6 < i7) {
                    a aVar = this.f13536f[i4];
                    int i8 = bArr2[i4] & 255;
                    int i9 = aVar.f13551i;
                    int i10 = i8 * i9;
                    int i11 = aVar.f13544b;
                    if (i11 >= 0) {
                        int i12 = (i11 * i7) + aVar.f13545c;
                        int i13 = i12 + i7;
                        int i14 = bArr[i12] & 255;
                        int i15 = bArr[i13] & 255;
                        int i16 = aVar.f13546d;
                        int i17 = ((i14 * i16) + (i15 * (32 - i16))) / 32;
                        if (i17 > 255) {
                            i17 = 255;
                        }
                        int i18 = aVar.f13550h;
                        i10 += i17 * i18;
                        i9 += i18;
                    }
                    int i19 = aVar.f13547e;
                    if (i19 >= 0) {
                        int i20 = (i19 * i7) + aVar.f13548f;
                        int i21 = i7 + i20;
                        int i22 = bArr3[i20] & 255;
                        int i23 = bArr3[i21] & 255;
                        int i24 = aVar.f13549g;
                        int i25 = ((i22 * i24) + (i23 * (32 - i24))) / 32;
                        if (i25 > 255) {
                            i25 = 255;
                        }
                        int i26 = aVar.f13552j;
                        i10 += i25 * i26;
                        i9 += i26;
                    }
                    int i27 = i10 / i9;
                    if (i27 > 255) {
                        i27 = 255;
                    }
                    this.f13537g[i4] = (byte) (i27 & 255);
                    i4++;
                    i6++;
                }
            }
        }
        return this.f13537g;
    }

    public byte[] c(byte[] bArr, int i4) {
        double d4 = (i4 / 180.0f) * 3.1415927f;
        float fCos = 1.0f / ((float) Math.cos(d4));
        float fTan = (this.f13535e * ((float) Math.tan(d4))) / this.f13533c;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f13531a; i6++) {
            float f4 = i6;
            float f5 = 0.0f;
            int i7 = 0;
            while (true) {
                int i8 = this.f13532b;
                if (i7 < i8) {
                    int i9 = (int) (f5 + 0.5f);
                    int i10 = (int) (0.5f + f4);
                    if (i9 < 0 || i9 >= i8 || i10 < 0 || i10 >= this.f13531a) {
                        this.f13538h[i5] = 0;
                    } else {
                        this.f13538h[i5] = bArr[(i10 * i8) + i9];
                    }
                    i5++;
                    f5 += fCos;
                    f4 += fTan;
                    i7++;
                }
            }
        }
        return this.f13538h;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r14.f13531a
            if (r1 >= r3) goto Lb1
            r3 = r0
        L8:
            int r4 = r14.f13532b
            if (r3 >= r4) goto Lad
            float r4 = (float) r3
            float r5 = r14.f13535e
            float r4 = r4 * r5
            float r5 = r14.f13534d
            double r5 = (double) r5
            double r5 = java.lang.Math.tan(r5)
            float r5 = (float) r5
            float r5 = r5 * r4
            float r6 = r14.f13533c
            float r5 = r5 / r6
            int r6 = (int) r5
            float r6 = (float) r6
            float r6 = r5 - r6
            r7 = 1107296256(0x42000000, float:32.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            int r6 = 32 - r6
            float r7 = r14.f13534d
            double r7 = (double) r7
            double r7 = java.lang.Math.cos(r7)
            float r7 = (float) r7
            float r4 = r4 / r7
            float r7 = r14.f13535e
            float r4 = r4 / r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r7
            int r4 = (int) r4
            float r7 = (float) r1
            float r8 = r7 + r5
            int r8 = (int) r8
            float r7 = r7 - r5
            int r5 = (int) r7
            int r4 = r4 + r0
            int r7 = r14.f13532b
            r9 = -1
            r10 = 16
            if (r4 >= r7) goto L80
            if (r4 >= 0) goto L47
            goto L80
        L47:
            if (r8 < 0) goto L5f
            int r7 = r14.f13531a
            int r11 = r7 + (-1)
            if (r8 < r11) goto L50
            goto L5f
        L50:
            r11 = 3
            if (r8 >= r10) goto L55
            r7 = r8
            goto L62
        L55:
            int r12 = r7 + (-16)
            if (r8 < r12) goto L5d
            int r7 = r7 + (-1)
            int r7 = r7 - r8
            goto L62
        L5d:
            r7 = r10
            goto L62
        L5f:
            r11 = 2
            r7 = r0
            r8 = r9
        L62:
            if (r5 < 0) goto L7a
            int r12 = r14.f13531a
            int r13 = r12 + (-1)
            if (r5 < r13) goto L6b
            goto L7a
        L6b:
            if (r5 >= r10) goto L6f
            r12 = r5
            goto L7e
        L6f:
            int r9 = r12 + (-16)
            if (r5 < r9) goto L77
            int r12 = r12 + (-1)
            int r12 = r12 - r5
            goto L7e
        L77:
            r9 = r8
            r12 = r10
            goto L84
        L7a:
            int r11 = r11 + (-1)
            r12 = r0
            r5 = r9
        L7e:
            r9 = r8
            goto L84
        L80:
            r11 = 1
            r7 = r0
            r12 = r7
            r5 = r9
        L84:
            z1.l$a[] r8 = r14.f13536f
            z1.l$a r13 = new z1.l$a
            r13.<init>()
            r8[r2] = r13
            z1.l$a[] r8 = r14.f13536f
            r8 = r8[r2]
            r8.f13544b = r9
            r8.f13545c = r4
            r8.f13546d = r6
            r8.f13547e = r5
            r8.f13548f = r4
            int r4 = 32 - r6
            r8.f13549g = r4
            r8.f13543a = r11
            r8.f13551i = r10
            r8.f13550h = r7
            r8.f13552j = r12
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L8
        Lad:
            int r1 = r1 + 1
            goto L3
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.l.d():void");
    }

    public void e(float f4, int i4) {
        int i5;
        if (this.f13539i == f4 && this.f13540j == i4) {
            return;
        }
        this.f13539i = f4;
        this.f13540j = i4;
        int i6 = 0;
        while (true) {
            i5 = this.f13531a;
            if (i6 >= this.f13532b * i5) {
                break;
            }
            this.f13541k[i6] = 0;
            i6++;
        }
        if (i4 < -85 || i4 > -50) {
            return;
        }
        float f5 = i5 / 2.0f;
        float f6 = this.f13533c;
        float fTan = (((float) Math.tan(((i4 + 90) / 180.0f) * 3.1415927f)) * this.f13533c) / this.f13535e;
        float f7 = (0.0f - ((f4 + (f5 * f6)) / f6)) * fTan;
        for (int i7 = 0; i7 < this.f13531a; i7++) {
            int i8 = this.f13532b;
            int i9 = i7 * i8;
            int i10 = (int) (((double) f7) + 0.5d);
            if (i10 >= 0 && i10 < i8) {
                this.f13541k[i9 + i10] = l1.f13562p;
            }
            int i11 = i10 - 50;
            if (i11 <= 0) {
                i11 = 0;
            }
            int i12 = i10 + 50;
            if (i12 >= i8) {
                i12 = i8 - 1;
            }
            for (int i13 = i11; i13 <= i12; i13++) {
                this.f13541k[i9 + i13] = l1.f13562p;
            }
            for (int i14 = 16; i11 >= 0 && i14 > 0; i14--) {
                if (i11 < this.f13532b) {
                    this.f13541k[i9 + i11] = (byte) (i14 & 255);
                }
                i11--;
            }
            for (int i15 = 16; i12 < this.f13532b && i15 > 0; i15--) {
                this.f13541k[i9 + i12] = (byte) (i15 & 255);
                i12++;
            }
            f7 += fTan;
        }
    }

    public l(int i4, int i5, float f4, float f5, float f6) {
        this.f13531a = i4;
        this.f13532b = i5;
        this.f13533c = f4;
        this.f13534d = f5;
        this.f13535e = f6;
        this.f13537g = new byte[i4 * i5];
        this.f13536f = new a[i4 * i5];
        d();
        int i6 = this.f13531a;
        int i7 = this.f13532b;
        this.f13538h = new byte[i6 * i7];
        this.f13541k = new byte[i6 * i7];
        this.f13542l = new byte[i6 * i7];
    }
}
