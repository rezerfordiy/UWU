package n2;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f9312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f9313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f9314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f9317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f9318l;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9326h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9327i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9328j;

        public a() {
        }
    }

    public h() {
        this.f9307a = 0;
        this.f9308b = 0;
        this.f9309c = 0.0f;
        this.f9310d = 0.0f;
        this.f9311e = 0.0f;
    }

    public byte[] a(byte[] bArr) {
        if (bArr == null || this.f9317k == null || this.f9314h == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f9307a * this.f9308b; i4++) {
            byte b4 = this.f9317k[i4];
            if (b4 == 0) {
                this.f9318l[i4] = bArr[i4];
            } else {
                int i5 = (((b4 & 255) * (this.f9314h[i4] & 255)) / 16) & 255;
                byte b5 = bArr[i4];
                if (i5 > (b5 & 255)) {
                    this.f9318l[i4] = (byte) i5;
                } else {
                    this.f9318l[i4] = (byte) (b5 & 255);
                }
            }
        }
        return this.f9318l;
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f9307a; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f9308b;
                if (i6 < i7) {
                    a aVar = this.f9312f[i4];
                    int i8 = bArr2[i4] & 255;
                    int i9 = aVar.f9327i;
                    int i10 = i8 * i9;
                    int i11 = aVar.f9320b;
                    if (i11 >= 0) {
                        int i12 = (i11 * i7) + aVar.f9321c;
                        int i13 = i12 + i7;
                        int i14 = bArr[i12] & 255;
                        int i15 = bArr[i13] & 255;
                        int i16 = aVar.f9322d;
                        int i17 = ((i14 * i16) + (i15 * (32 - i16))) / 32;
                        if (i17 > 255) {
                            i17 = 255;
                        }
                        int i18 = aVar.f9326h;
                        i10 += i17 * i18;
                        i9 += i18;
                    }
                    int i19 = aVar.f9323e;
                    if (i19 >= 0) {
                        int i20 = (i19 * i7) + aVar.f9324f;
                        int i21 = i7 + i20;
                        int i22 = bArr3[i20] & 255;
                        int i23 = bArr3[i21] & 255;
                        int i24 = aVar.f9325g;
                        int i25 = ((i22 * i24) + (i23 * (32 - i24))) / 32;
                        if (i25 > 255) {
                            i25 = 255;
                        }
                        int i26 = aVar.f9328j;
                        i10 += i25 * i26;
                        i9 += i26;
                    }
                    int i27 = i10 / i9;
                    if (i27 > 255) {
                        i27 = 255;
                    }
                    this.f9313g[i4] = (byte) (i27 & 255);
                    i4++;
                    i6++;
                }
            }
        }
        return this.f9313g;
    }

    public byte[] c(byte[] bArr, int i4) {
        double d4 = (i4 / 180.0f) * 3.1415927f;
        float fCos = 1.0f / ((float) Math.cos(d4));
        float fTan = (this.f9311e * ((float) Math.tan(d4))) / this.f9309c;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f9307a; i6++) {
            float f4 = i6;
            float f5 = 0.0f;
            int i7 = 0;
            while (true) {
                int i8 = this.f9308b;
                if (i7 < i8) {
                    int i9 = (int) (f5 + 0.5f);
                    int i10 = (int) (0.5f + f4);
                    if (i9 < 0 || i9 >= i8 || i10 < 0 || i10 >= this.f9307a) {
                        this.f9314h[i5] = 0;
                    } else {
                        this.f9314h[i5] = bArr[(i10 * i8) + i9];
                    }
                    i5++;
                    f5 += fCos;
                    f4 += fTan;
                    i7++;
                }
            }
        }
        return this.f9314h;
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
            int r3 = r14.f9307a
            if (r1 >= r3) goto Lb1
            r3 = r0
        L8:
            int r4 = r14.f9308b
            if (r3 >= r4) goto Lad
            float r4 = (float) r3
            float r5 = r14.f9311e
            float r4 = r4 * r5
            float r5 = r14.f9310d
            double r5 = (double) r5
            double r5 = java.lang.Math.tan(r5)
            float r5 = (float) r5
            float r5 = r5 * r4
            float r6 = r14.f9309c
            float r5 = r5 / r6
            int r6 = (int) r5
            float r6 = (float) r6
            float r6 = r5 - r6
            r7 = 1107296256(0x42000000, float:32.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            int r6 = 32 - r6
            float r7 = r14.f9310d
            double r7 = (double) r7
            double r7 = java.lang.Math.cos(r7)
            float r7 = (float) r7
            float r4 = r4 / r7
            float r7 = r14.f9311e
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
            int r7 = r14.f9308b
            r9 = -1
            r10 = 16
            if (r4 >= r7) goto L80
            if (r4 >= 0) goto L47
            goto L80
        L47:
            if (r8 < 0) goto L5f
            int r7 = r14.f9307a
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
            int r12 = r14.f9307a
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
            n2.h$a[] r8 = r14.f9312f
            n2.h$a r13 = new n2.h$a
            r13.<init>()
            r8[r2] = r13
            n2.h$a[] r8 = r14.f9312f
            r8 = r8[r2]
            r8.f9320b = r9
            r8.f9321c = r4
            r8.f9322d = r6
            r8.f9323e = r5
            r8.f9324f = r4
            int r4 = 32 - r6
            r8.f9325g = r4
            r8.f9319a = r11
            r8.f9327i = r10
            r8.f9326h = r7
            r8.f9328j = r12
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L8
        Lad:
            int r1 = r1 + 1
            goto L3
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.d():void");
    }

    public void e(float f4, int i4) {
        int i5;
        if (this.f9315i == f4 && this.f9316j == i4) {
            return;
        }
        this.f9315i = f4;
        this.f9316j = i4;
        int i6 = 0;
        while (true) {
            i5 = this.f9307a;
            if (i6 >= this.f9308b * i5) {
                break;
            }
            this.f9317k[i6] = 0;
            i6++;
        }
        if (i4 < -85 || i4 > -50) {
            return;
        }
        float f5 = i5 / 2.0f;
        float f6 = this.f9309c;
        float fTan = (((float) Math.tan(((i4 + 90) / 180.0f) * 3.1415927f)) * this.f9309c) / this.f9311e;
        float f7 = (0.0f - ((f4 + (f5 * f6)) / f6)) * fTan;
        for (int i7 = 0; i7 < this.f9307a; i7++) {
            int i8 = this.f9308b;
            int i9 = i7 * i8;
            int i10 = (int) (((double) f7) + 0.5d);
            if (i10 >= 0 && i10 < i8) {
                this.f9317k[i9 + i10] = z1.l1.f13562p;
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
                this.f9317k[i9 + i13] = z1.l1.f13562p;
            }
            for (int i14 = 16; i11 >= 0 && i14 > 0; i14--) {
                if (i11 < this.f9308b) {
                    this.f9317k[i9 + i11] = (byte) (i14 & 255);
                }
                i11--;
            }
            for (int i15 = 16; i12 < this.f9308b && i15 > 0; i15--) {
                this.f9317k[i9 + i12] = (byte) (i15 & 255);
                i12++;
            }
            f7 += fTan;
        }
    }

    public h(int i4, int i5, float f4, float f5, float f6) {
        this.f9307a = i4;
        this.f9308b = i5;
        this.f9309c = f4;
        this.f9310d = f5;
        this.f9311e = f6;
        this.f9313g = new byte[i4 * i5];
        this.f9312f = new a[i4 * i5];
        d();
        int i6 = this.f9307a;
        int i7 = this.f9308b;
        this.f9314h = new byte[i6 * i7];
        this.f9317k = new byte[i6 * i7];
        this.f9318l = new byte[i6 * i7];
    }
}
