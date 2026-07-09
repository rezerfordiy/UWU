package z1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ boolean f13300r = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13308h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13301a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13302b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13303c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13304d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13305e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f13309i = new float[256];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f13310j = new float[256];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13311k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13312l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13313m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<byte[]> f13314n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f13315o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<byte[]> f13316p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f13317q = null;

    public void A(boolean z3) {
        this.f13302b = z3;
    }

    public void B(boolean z3) {
        this.f13303c = z3;
    }

    public void C(int i4) {
        this.f13306f = i4;
    }

    public void D(int i4) {
        this.f13305e = i4;
    }

    public void E(boolean z3) {
        this.f13301a = z3;
    }

    public void F(int i4) {
        this.f13304d = i4;
    }

    public final byte[] G(byte[] bArr, int i4) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i5 = 0; i5 < length / 256; i5++) {
            for (int i6 = 0; i6 < 256; i6++) {
                int i7 = i6 - i4;
                if (i7 >= 0 && i7 < 256) {
                    int i8 = (i5 * 256) + i6;
                    bArr2[i8] = bArr[i8 - i4];
                }
            }
        }
        return bArr2;
    }

    public byte[] a(byte[] bArr, int i4, int i5, int i6, int i7) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = i6; i9 <= i7; i9++) {
                byte b4 = 0;
                byte b5 = 0;
                for (int i10 = i8 - 1; i10 <= i8 + 1; i10++) {
                    if (i10 >= 0 && i10 < i4) {
                        for (int i11 = i9 - 1; i11 <= i9 + 1; i11++) {
                            if (i11 >= i6 && i11 <= i7) {
                                byte b6 = bArr2[(i10 * i5) + i11];
                                if (b6 < b4) {
                                    b4 = b6;
                                }
                                if (b6 > b5) {
                                    b5 = b6;
                                }
                            }
                        }
                    }
                }
                int i12 = (i8 * i5) + i9;
                if (Math.abs((int) b4) > Math.abs((int) b5)) {
                    bArr[i12] = b4;
                } else {
                    bArr[i12] = b5;
                }
            }
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i13 = 0; i13 < i4; i13++) {
            for (int i14 = i6; i14 <= i7; i14++) {
                byte b7 = -126;
                byte b8 = 126;
                for (int i15 = i13 - 1; i15 <= i13 + 1; i15++) {
                    if (i15 >= 0 && i15 < i4) {
                        for (int i16 = i14 - 1; i16 <= i14 + 1; i16++) {
                            if (i16 >= i6 && i16 <= i7) {
                                byte b9 = bArr2[(i15 * i5) + i16];
                                if (b9 < 0 && b9 > b7) {
                                    b7 = b9;
                                } else if (b9 >= 0 && b9 < b8) {
                                    b8 = b9;
                                }
                            }
                        }
                    }
                }
                int i17 = (i13 * i5) + i14;
                if (Math.abs((int) b7) < Math.abs((int) b8)) {
                    bArr[i17] = b7;
                } else {
                    bArr[i17] = b8;
                }
            }
        }
        return bArr;
    }

    public byte[] b(byte[] bArr, int i4, int i5, int i6, int i7) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = i6; i9 <= i7; i9++) {
                byte b4 = 0;
                for (int i10 = i8 - 1; i10 <= i8 + 1; i10++) {
                    if (i10 >= 0 && i10 < i4) {
                        for (int i11 = i9 - 1; i11 <= i9 + 1; i11++) {
                            if (i11 >= i6 && i11 <= i7) {
                                byte b5 = bArr2[(i10 * i5) + i11];
                                if ((b5 & 255) > (b4 & 255)) {
                                    b4 = b5;
                                }
                            }
                        }
                    }
                }
                bArr[(i8 * i5) + i9] = b4;
            }
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i12 = 0; i12 < i4; i12++) {
            for (int i13 = i6; i13 <= i7; i13++) {
                byte b6 = -1;
                for (int i14 = i12 - 1; i14 <= i12 + 1; i14++) {
                    if (i14 >= 0 && i14 < i4) {
                        for (int i15 = i13 - 1; i15 <= i13 + 1; i15++) {
                            if (i15 >= i6 && i15 <= i7) {
                                byte b7 = bArr2[(i14 * i5) + i15];
                                if ((b7 & 255) < (b6 & 255)) {
                                    b6 = b7;
                                }
                            }
                        }
                    }
                }
                bArr[(i12 * i5) + i13] = b6;
            }
        }
        return bArr;
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        byte b4 = (byte) (i6 & 255);
        byte[] bArr3 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        byte[] bArr4 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        for (int i7 = i4; i7 < i5; i7++) {
            for (int i8 = 0; i8 < 512; i8++) {
                if ((bArr4[(i7 * 512) + i8] & 255) > (b4 & 255)) {
                    bArr3[((i7 - i4) * 256) + (i8 / 2)] = 0;
                }
            }
        }
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return bArr;
    }

    public void d(boolean z3, int i4) {
        this.f13307g = z3;
        if (!z3 || i4 <= 0) {
            return;
        }
        this.f13308h = i4;
    }

    public void e(boolean z3, int i4) {
        this.f13312l = z3;
        this.f13313m = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[PHI: r6
      0x0059: PHI (r6v5 int) = (r6v4 int), (r6v12 int) binds: [B:32:0x0057, B:27:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] f(byte[] r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            byte[] r0 = r10.f13315o
            if (r0 == 0) goto L67
            int r1 = r0.length
            int r2 = r11.length
            if (r1 == r2) goto L9
            goto L67
        L9:
            int r1 = r11.length
            byte[] r1 = new byte[r1]
            r2 = 0
        Ld:
            if (r2 >= r12) goto L64
            r3 = r14
        L10:
            if (r3 > r15) goto L61
            int r4 = r2 * r13
            int r4 = r4 + r3
            int r5 = r10.f13304d
            r6 = 1
            if (r5 > r6) goto L1f
            r5 = r11[r4]
            r1[r4] = r5
            goto L5e
        L1f:
            r6 = r11[r4]
            r7 = r0[r4]
            r8 = 128(0x80, float:1.8E-43)
            if (r6 <= 0) goto L29
            if (r7 < 0) goto L2d
        L29:
            if (r6 >= 0) goto L45
            if (r7 <= 0) goto L45
        L2d:
            if (r6 <= r7) goto L36
            int r9 = r6 - r7
            if (r9 <= r8) goto L3c
            int r7 = r7 + 256
            goto L3c
        L36:
            int r9 = r7 - r6
            if (r9 <= r8) goto L3c
            int r6 = r6 + 256
        L3c:
            int r9 = r5 + (-1)
            int r6 = r6 * r9
            int r6 = r6 / r5
            int r7 = r7 / r5
            int r6 = r6 + r7
            if (r6 < r8) goto L5b
            goto L59
        L45:
            int r5 = java.lang.Math.abs(r6)
            int r9 = java.lang.Math.abs(r7)
            if (r5 >= r9) goto L5b
            int r5 = r10.f13304d
            int r9 = r5 + (-1)
            int r6 = r6 * r9
            int r6 = r6 / r5
            int r7 = r7 / r5
            int r6 = r6 + r7
            if (r6 < r8) goto L5b
        L59:
            int r6 = r6 + (-256)
        L5b:
            byte r5 = (byte) r6
            r1[r4] = r5
        L5e:
            int r3 = r3 + 1
            goto L10
        L61:
            int r2 = r2 + 1
            goto Ld
        L64:
            r10.f13315o = r1
            return r1
        L67:
            r10.f13315o = r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.i.f(byte[], int, int, int, int):byte[]");
    }

    public byte[] g(byte[] bArr, int i4, int i5, int i6, int i7) {
        byte[] bArr2 = this.f13317q;
        if (bArr2 == null || bArr2.length != bArr.length) {
            this.f13317q = bArr;
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = i6; i9 <= i7; i9++) {
                int i10 = (i8 * i5) + i9;
                byte b4 = bArr[i10];
                int i11 = b4 & 255;
                byte b5 = bArr2[i10];
                if (i11 > (b5 & 255)) {
                    bArr3[i10] = b4;
                } else {
                    int i12 = this.f13304d;
                    bArr3[i10] = (byte) ((((b4 & 255) * (i12 - 1)) / i12) + ((b5 & 255) / i12));
                }
            }
        }
        this.f13317q = bArr3;
        return bArr3;
    }

    public int h() {
        return this.f13306f;
    }

    public int i() {
        return this.f13305e;
    }

    public final void j() {
        if (this.f13311k) {
            return;
        }
        this.f13311k = true;
        for (int i4 = 0; i4 < 256; i4++) {
            double d4 = 0.02454369260617026d * ((double) i4);
            this.f13309i[i4] = (float) Math.cos(d4);
            this.f13310j[i4] = (float) Math.sin(d4);
        }
    }

    public byte[] k(byte[] bArr, int i4, int i5, int i6, int i7) {
        int i8 = (i4 * 2) - 1;
        byte[] bArr2 = new byte[i8 * i5];
        for (int i9 = 0; i9 < i4; i9++) {
            for (int i10 = i6; i10 <= i7; i10++) {
                bArr2[(i9 * 2 * i5) + i10] = bArr[(i9 * i5) + i10];
            }
        }
        for (int i11 = 1; i11 < i8; i11 += 2) {
            for (int i12 = i6; i12 <= i7; i12++) {
                int i13 = bArr2[((i11 - 1) * i5) + i12];
                int i14 = bArr2[((i11 + 1) * i5) + i12];
                if ((i13 > 0 && i14 < 0) || (i13 < 0 && i14 > 0)) {
                    if (i13 > i14) {
                        if (i13 - i14 >= 128) {
                            i14 += 256;
                        }
                    } else if (i14 - i13 >= 128) {
                        i13 += 256;
                    }
                }
                int i15 = (i13 + i14) / 2;
                if (i15 >= 128) {
                    i15 += v0.u.f12223u;
                }
                bArr2[(i11 * i5) + i12] = (byte) i15;
            }
        }
        return bArr2;
    }

    public byte[] l(byte[] bArr, int i4, int i5, int i6, int i7) {
        byte[] bArr2 = new byte[i4 * i5 * 2];
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = i6; i9 <= i7; i9++) {
                int i10 = i8 * i5;
                bArr2[(i10 * 2) + (i9 * 2)] = bArr[i10 + i9];
            }
            for (int i11 = (i6 * 2) + 1; i11 < i7 * 2; i11 += 2) {
                int i12 = (i8 * i5 * 2) + i11;
                int i13 = bArr2[i12 - 1];
                int i14 = bArr2[i12 + 1];
                if ((i13 > 0 && i14 < 0) || (i13 < 0 && i14 > 0)) {
                    if (i13 > i14) {
                        if (i13 - i14 >= 128) {
                            i14 += 256;
                        }
                    } else if (i14 - i13 >= 128) {
                        i13 += 256;
                    }
                }
                int i15 = (i13 + i14) / 2;
                if (i15 >= 128) {
                    i15 += v0.u.f12223u;
                }
                bArr2[i12] = (byte) i15;
            }
        }
        return bArr2;
    }

    public byte[] m(byte[] bArr, int i4, int i5, int i6, int i7) {
        int i8 = (i4 * 2) - 1;
        byte[] bArr2 = new byte[i8 * i5];
        for (int i9 = 0; i9 < i4; i9++) {
            for (int i10 = i6; i10 <= i7; i10++) {
                bArr2[(i9 * 2 * i5) + i10] = bArr[(i9 * i5) + i10];
            }
        }
        for (int i11 = 1; i11 < i8; i11 += 2) {
            for (int i12 = i6; i12 <= i7; i12++) {
                bArr2[(i11 * i5) + i12] = (byte) ((((bArr2[((i11 - 1) * i5) + i12] & 255) + (bArr2[((i11 + 1) * i5) + i12] & 255)) / 2) & 255);
            }
        }
        return bArr2;
    }

    public byte[] n(byte[] bArr, int i4, int i5, int i6, int i7) {
        byte[] bArr2 = new byte[i4 * i5 * 2];
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = i6; i9 <= i7; i9++) {
                int i10 = i8 * i5;
                bArr2[(i10 * 2) + (i9 * 2)] = bArr[i10 + i9];
            }
            for (int i11 = (i6 * 2) + 1; i11 < i7 * 2; i11 += 2) {
                int i12 = (i8 * i5 * 2) + i11;
                bArr2[i12] = (byte) ((((bArr2[i12 - 1] & 255) + (bArr2[i12 + 1] & 255)) / 2) & 255);
            }
        }
        return bArr2;
    }

    public byte[] o(byte[] bArr, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        while (true) {
            i9 = i4 * i5;
            if (i10 >= i9) {
                break;
            }
            byte b4 = bArr[i10];
            if (b4 <= -2 || b4 >= 2) {
                bArr2[i10] = 1;
            } else {
                bArr2[i10] = 0;
            }
            i10++;
        }
        if (this.f13314n.size() > 0 && this.f13314n.get(0).length != length) {
            this.f13314n.clear();
        }
        this.f13314n.add(bArr2);
        while (this.f13314n.size() > 5) {
            this.f13314n.remove(0);
        }
        if (this.f13314n.size() < 5) {
            return bArr;
        }
        int i11 = i8 == 0 ? 1 : 2;
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr, 0, bArr3, 0, i9);
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < 5; i14++) {
                i13 += this.f13314n.get(0)[i12];
            }
            if (i13 < i11) {
                bArr3[i12] = 0;
            }
        }
        return bArr3;
    }

    public byte[] p(byte[] bArr, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        while (true) {
            i9 = i4 * i5;
            if (i10 >= i9) {
                break;
            }
            byte b4 = bArr[i10];
            if (b4 >= 2 || b4 <= -2) {
                bArr2[i10] = 1;
            } else {
                bArr2[i10] = 0;
            }
            i10++;
        }
        if (this.f13316p.size() > 0 && length != this.f13316p.get(0).length) {
            this.f13316p.clear();
        }
        this.f13316p.add(bArr2);
        while (this.f13316p.size() > 5) {
            this.f13316p.remove(0);
        }
        if (this.f13316p.size() < 5) {
            return bArr;
        }
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr, 0, bArr3, 0, i9);
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < 5; i13++) {
                i12 += this.f13316p.get(i13)[i11];
            }
            if (i12 < 2) {
                bArr3[i11] = 0;
            }
        }
        return bArr3;
    }

    public final byte[] q(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i4;
        int i11 = i7;
        byte[] bArr2 = new byte[bArr.length];
        int i12 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i13 = i9 / 2;
        byte[] bArr3 = new byte[bArr.length];
        int i14 = 0;
        while (i14 < i8) {
            System.arraycopy(bArr2, i12, bArr3, i12, bArr.length);
            int i15 = i12;
            while (i15 < i10) {
                int i16 = i6;
                while (i16 <= i11) {
                    int i17 = i15 - i13;
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i17 <= i15 + i13) {
                        if (i17 >= 0 && i17 < i10) {
                            int i18 = i16 - i13;
                            while (i18 <= i16 + i13) {
                                if (i18 >= i6 && i18 <= i11) {
                                    int i19 = bArr3[(i17 * 256) + i18];
                                    if (i19 < 0) {
                                        i19 += 256;
                                    }
                                    f5 += this.f13309i[i19];
                                    f4 += this.f13310j[i19];
                                }
                                i18++;
                                i11 = i7;
                            }
                        }
                        i17++;
                        i10 = i4;
                        i11 = i7;
                    }
                    int iAtan2 = ((int) (((Math.atan2(f4, f5) + 3.141592653589793d) / 0.02454369260617026d) + 0.5d)) - 128;
                    if (iAtan2 > 127) {
                        iAtan2 += v0.u.f12223u;
                    }
                    if (iAtan2 < -128) {
                        iAtan2 += 256;
                    }
                    bArr2[(i15 * 256) + i16] = (byte) iAtan2;
                    i16++;
                    i10 = i4;
                    i11 = i7;
                }
                i15++;
                i10 = i4;
                i11 = i7;
            }
            i14++;
            i10 = i4;
            i11 = i7;
            i12 = 0;
        }
        byte[] bArr4 = new byte[bArr.length];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr.length);
        return bArr4;
    }

    public final byte[] r(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i4;
        byte[] bArr2 = new byte[bArr.length];
        int i11 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i12 = i9 / 2;
        byte[] bArr3 = new byte[bArr.length];
        int i13 = 0;
        while (i13 < i8) {
            System.arraycopy(bArr2, i11, bArr3, i11, bArr.length);
            int i14 = i11;
            while (i14 < i10) {
                int i15 = i6;
                while (i15 <= i7) {
                    byte[] bArr4 = new byte[49];
                    int i16 = i14 - i12;
                    int i17 = i11;
                    int i18 = i17;
                    while (i16 <= i14 + i12) {
                        if (i16 >= 0 && i16 < i10) {
                            for (int i19 = i15 - i12; i19 <= i15 + i12; i19++) {
                                if (i19 >= i6 && i19 <= i7) {
                                    byte b4 = (byte) (bArr3[(i16 * 256) + i19] & 255);
                                    bArr4[i18] = b4;
                                    i17 += b4 & 255;
                                    i18++;
                                }
                            }
                        }
                        i16++;
                        i10 = i4;
                    }
                    bArr2[(i14 * 256) + i15] = (byte) ((i17 / i18) & 255);
                    i15++;
                    i10 = i4;
                    i11 = 0;
                }
                i14++;
                i10 = i4;
                i11 = 0;
            }
            i13++;
            i10 = i4;
            i11 = 0;
        }
        byte[] bArr5 = new byte[bArr.length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr.length);
        return bArr5;
    }

    public byte[] s(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        byte[] bArr2;
        int i11 = i4;
        int i12 = i7;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i13 = 0;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        int i14 = i9 / 2;
        int length2 = bArr.length;
        byte[] bArr4 = new byte[length2];
        int i15 = 0;
        while (i15 < i8) {
            System.arraycopy(bArr3, i13, bArr4, i13, length);
            int i16 = i13;
            while (i16 < i11) {
                int i17 = i6;
                while (i17 <= i12) {
                    byte[] bArr5 = new byte[49];
                    int i18 = i16 - i14;
                    int i19 = i13;
                    while (i18 <= i16 + i14) {
                        if (i18 >= 0 && i18 < i11) {
                            for (int i20 = i17 - i14; i20 <= i17 + i14; i20++) {
                                if (i20 >= i6 && i20 <= i12) {
                                    int i21 = (i18 * 256) + i20;
                                    if (i21 < length2) {
                                        bArr5[i19] = bArr4[i21];
                                    }
                                    i19++;
                                }
                            }
                        }
                        i18++;
                        i11 = i4;
                    }
                    int i22 = 65536;
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i19) {
                        byte b4 = bArr5[i23];
                        int i25 = i14;
                        int i26 = 0;
                        int i27 = 0;
                        while (i26 < i19) {
                            if (i23 == i26) {
                                i10 = length2;
                                bArr2 = bArr4;
                            } else {
                                i10 = length2;
                                int i28 = b4 - bArr5[i26];
                                if (i28 < 0) {
                                    i28 = -i28;
                                }
                                bArr2 = bArr4;
                                if (i28 > 128) {
                                    i28 = 256 - i28;
                                }
                                i27 += i28;
                            }
                            i26++;
                            bArr4 = bArr2;
                            length2 = i10;
                        }
                        int i29 = length2;
                        byte[] bArr6 = bArr4;
                        if (i27 < i22) {
                            i22 = i27;
                            i24 = i23;
                        }
                        i23++;
                        i14 = i25;
                        bArr4 = bArr6;
                        length2 = i29;
                    }
                    int i30 = i14;
                    int i31 = length2;
                    byte[] bArr7 = bArr4;
                    byte b5 = bArr5[i24];
                    int i32 = (i16 * 256) + i17;
                    if (i32 < length) {
                        bArr3[i32] = b5;
                    }
                    i17++;
                    i11 = i4;
                    i12 = i7;
                    i14 = i30;
                    bArr4 = bArr7;
                    length2 = i31;
                    i13 = 0;
                }
                i16++;
                i11 = i4;
                i12 = i7;
                i13 = 0;
            }
            i15++;
            i11 = i4;
            i12 = i7;
            i13 = 0;
        }
        byte[] bArr8 = new byte[bArr.length];
        System.arraycopy(bArr3, 0, bArr8, 0, bArr.length);
        return bArr8;
    }

    public byte[] t(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        byte[] bArr2;
        int i10;
        int i11;
        int i12 = i4;
        int i13 = i7;
        byte[] bArr3 = new byte[bArr.length];
        int i14 = 0;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        int i15 = i9 / 2;
        byte[] bArr4 = new byte[bArr.length];
        int i16 = i8;
        int i17 = 0;
        while (i17 < i16) {
            System.arraycopy(bArr3, i14, bArr4, i14, bArr.length);
            int i18 = i14;
            while (i18 < i12) {
                int i19 = i6;
                while (i19 <= i13) {
                    byte[] bArr5 = new byte[49];
                    int i20 = i18 - i15;
                    int i21 = i14;
                    while (i20 <= i18 + i15) {
                        if (i20 >= 0 && i20 < i12) {
                            int i22 = i19 - i15;
                            while (i22 <= i19 + i15) {
                                if (i22 >= i6 && i22 <= i13 && (((i10 = i20 - i18) != -1 || i22 - i19 != -1) && (i10 != -1 || i22 - i19 != 1))) {
                                    if (i10 != 1) {
                                        i11 = 1;
                                    } else if (i22 - i19 != -1) {
                                        i11 = 1;
                                    }
                                    if (i10 != i11 || i22 - i19 != i11) {
                                        bArr5[i21] = bArr4[(i20 * 256) + i22];
                                        i21++;
                                    }
                                }
                                i22++;
                                i13 = i7;
                            }
                        }
                        i20++;
                        i12 = i4;
                        i13 = i7;
                    }
                    int i23 = 65536;
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < i21) {
                        byte b4 = bArr5[i24];
                        int i26 = i15;
                        int i27 = 0;
                        int i28 = 0;
                        while (i28 < i21) {
                            if (i24 == i28) {
                                bArr2 = bArr4;
                            } else {
                                bArr2 = bArr4;
                                int i29 = b4 - bArr5[i28];
                                if (i29 < 0) {
                                    i29 = -i29;
                                }
                                if (i29 > 128) {
                                    i29 = 256 - i29;
                                }
                                i27 += i29;
                            }
                            i28++;
                            bArr4 = bArr2;
                        }
                        byte[] bArr6 = bArr4;
                        if (i27 < i23) {
                            i25 = i24;
                            i23 = i27;
                        }
                        i24++;
                        i15 = i26;
                        bArr4 = bArr6;
                    }
                    bArr3[(i18 * 256) + i19] = bArr5[i25];
                    i19++;
                    i12 = i4;
                    i13 = i7;
                    i14 = 0;
                }
                i18++;
                i12 = i4;
                i13 = i7;
                i14 = 0;
            }
            i17++;
            i12 = i4;
            i13 = i7;
            i16 = i8;
            i14 = 0;
        }
        byte[] bArr7 = new byte[bArr.length];
        System.arraycopy(bArr3, 0, bArr7, 0, bArr.length);
        return bArr7;
    }

    public byte[] u(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i4;
        int i11 = i7;
        int i12 = i9 / 2;
        byte[] bArr2 = new byte[bArr.length];
        int i13 = 0;
        int i14 = 0;
        while (i14 < i8) {
            System.arraycopy(bArr, i13, bArr2, i13, bArr.length);
            int i15 = i13;
            while (i15 < i10) {
                int i16 = i6;
                while (i16 <= i11) {
                    byte[] bArr3 = new byte[49];
                    int i17 = i13;
                    for (int i18 = i15 - i12; i18 <= i15 + i12; i18++) {
                        if (i18 >= 0 && i18 < i10) {
                            for (int i19 = i16 - i12; i19 <= i16 + i12; i19++) {
                                if (i19 >= i6 && i19 <= i11) {
                                    bArr3[i17] = bArr2[(i18 * i5) + i19];
                                    i17++;
                                }
                            }
                        }
                    }
                    int i20 = i13;
                    while (true) {
                        int i21 = i17 - 1;
                        if (i20 < i21) {
                            int i22 = i13;
                            while (i22 < i21 - i20) {
                                byte b4 = bArr3[i22];
                                int i23 = b4 & 255;
                                int i24 = i22 + 1;
                                byte b5 = bArr3[i24];
                                int i25 = i12;
                                if (i23 > (b5 & 255)) {
                                    bArr3[i22] = b5;
                                    bArr3[i24] = b4;
                                }
                                i22 = i24;
                                i12 = i25;
                            }
                            i20++;
                            i13 = 0;
                        }
                    }
                    bArr[(i15 * i5) + i16] = bArr3[i17 / 2];
                    i16++;
                    i10 = i4;
                    i11 = i7;
                    i13 = 0;
                }
                i15++;
                i10 = i4;
                i11 = i7;
                i13 = 0;
            }
            i14++;
            i10 = i4;
            i11 = i7;
            i13 = 0;
        }
        return bArr;
    }

    public byte[] v(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12 = i4;
        int i13 = i7;
        int i14 = i9 / 2;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i15 = 0;
        int i16 = 0;
        while (i16 < i8) {
            System.arraycopy(bArr, i15, bArr2, i15, bArr.length);
            int i17 = i15;
            while (i17 < i12) {
                int i18 = i6;
                while (i18 <= i13) {
                    byte[] bArr3 = new byte[49];
                    int i19 = i17 - i14;
                    int i20 = i15;
                    while (i19 <= i17 + i14) {
                        if (i19 >= 0 && i19 < i12) {
                            int i21 = i18 - i14;
                            while (i21 <= i18 + i14) {
                                if (i21 >= i6 && i21 <= i13 && (((i10 = i19 - i17) != -1 || i21 - i18 != -1) && (i10 != -1 || i21 - i18 != 1))) {
                                    if (i10 != 1) {
                                        i11 = 1;
                                    } else if (i21 - i18 != -1) {
                                        i11 = 1;
                                    }
                                    if (i10 != i11 || i21 - i18 != i11) {
                                        int i22 = (i19 * i5) + i21;
                                        if (i22 < length) {
                                            bArr3[i20] = bArr2[i22];
                                        }
                                        i20++;
                                    }
                                }
                                i21++;
                                i13 = i7;
                            }
                        }
                        i19++;
                        i12 = i4;
                        i13 = i7;
                    }
                    int i23 = 0;
                    while (true) {
                        int i24 = i20 - 1;
                        if (i23 >= i24) {
                            break;
                        }
                        int i25 = 0;
                        while (i25 < i24 - i23) {
                            byte b4 = bArr3[i25];
                            int i26 = b4 & 255;
                            int i27 = i25 + 1;
                            int i28 = i24;
                            byte b5 = bArr3[i27];
                            int i29 = i14;
                            if (i26 > (b5 & 255)) {
                                bArr3[i25] = b5;
                                bArr3[i27] = b4;
                            }
                            i25 = i27;
                            i24 = i28;
                            i14 = i29;
                        }
                        i23++;
                    }
                    int i30 = i14;
                    byte b6 = bArr3[i20 / 2];
                    int i31 = (i17 * i5) + i18;
                    if (i31 < bArr.length) {
                        bArr[i31] = b6;
                    }
                    i18++;
                    i12 = i4;
                    i13 = i7;
                    i14 = i30;
                    i15 = 0;
                }
                i17++;
                i12 = i4;
                i13 = i7;
                i15 = 0;
            }
            i16++;
            i12 = i4;
            i13 = i7;
            i15 = 0;
        }
        return bArr;
    }

    public byte[] w(byte[] bArr, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        j();
        int i11 = (i5 - i4) + 1;
        if (this.f13302b) {
            i11 = ((i5 / 2) - (i4 / 2)) + 1;
        }
        int i12 = i11;
        int i13 = this.f13305e;
        if (i13 == 1) {
            i8 = 3;
            i9 = 2;
        } else {
            i8 = i13 == 2 ? 5 : 3;
            i9 = 1;
        }
        int i14 = i6 / 2;
        int i15 = i7 / 2;
        byte[] bArrO = o(s(bArr, i12, 256, i14, i15, i9, i8), i12, 256, i14, i15, 1);
        if (this.f13303c) {
            i10 = 512;
            bArrO = l(bArrO, i12, 256, i14, i15);
        } else {
            i10 = 256;
        }
        if (this.f13302b) {
            byte[] bArrK = k(bArrO, i12, i10, i6, i7);
            i12 = (i12 * 2) - 1;
            bArrO = bArrK;
        }
        return f(a(bArrO, i12, i10, i6, i7), i12, i10, i6, i7);
    }

    public byte[] x(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        j();
        int i11 = (i5 - i4) + 1;
        if (this.f13302b) {
            i11 = ((i5 / 2) - (i4 / 2)) + 1;
        }
        int i12 = i11;
        byte[] bArrG = this.f13312l ? G(bArr, this.f13313m) : bArr;
        int i13 = this.f13305e;
        if (i13 == 1) {
            i9 = 3;
            i10 = 2;
        } else {
            i9 = i13 == 2 ? 5 : 3;
            i10 = 1;
        }
        int i14 = this.f13306f;
        int i15 = i14 == 1 ? 1 : i14 == 2 ? 2 : 0;
        if (this.f13307g) {
            bArrG = c(bArr, bArr2, i4, i5, this.f13308h);
        }
        byte[] bArr3 = bArrG;
        if (this.f13301a) {
            int i16 = i6 / 2;
            int i17 = i7 / 2;
            byte[] bArrL = l(t(bArr3, i12, 256, i16, i17, 1, 3), i12, 256, i16, i17);
            return this.f13302b ? k(bArrL, i12, 512, i6, i7) : bArrL;
        }
        int i18 = i6 / 2;
        int i19 = i7 / 2;
        byte[] bArrS = s(bArr3, i12, 256, i18, i19, i10, i9);
        if (i15 > 0) {
            bArrS = q(bArrS, i12, 256, i18, i19, i15, 3);
        }
        byte[] bArrL2 = l(o(bArrS, i12, 256, i18, i19, i8), i12, 256, i18, i19);
        if (this.f13302b) {
            byte[] bArrK = k(bArrL2, i12, 512, i6, i7);
            i12 = (i12 * 2) - 1;
            bArrL2 = bArrK;
        }
        return f(a(bArrL2, i12, 512, i6, i7), i12, 512, i6, i7);
    }

    public byte[] y(byte[] bArr, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11 = (i5 - i4) + 1;
        if (this.f13302b) {
            i11 = ((i5 / 2) - (i4 / 2)) + 1;
        }
        int i12 = i11;
        int i13 = this.f13305e;
        if (i13 == 1) {
            i8 = 3;
            i9 = 2;
        } else {
            i8 = i13 == 2 ? 5 : 3;
            i9 = 1;
        }
        int i14 = i6 / 2;
        int i15 = i7 / 2;
        byte[] bArrP = p(u(bArr, i12, 256, i14, i15, i9, i8), i12, 256, i14, i15, 1);
        if (this.f13303c) {
            i10 = 512;
            bArrP = n(bArrP, i12, 256, i14, i15);
        } else {
            i10 = 256;
        }
        if (this.f13302b) {
            byte[] bArrM = m(bArrP, i12, i10, i6, i7);
            i12 = (i12 * 2) - 1;
            bArrP = bArrM;
        }
        return g(b(bArrP, i12, i10, i6, i7), i12, i10, i6, i7);
    }

    public byte[] z(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11 = (i5 - i4) + 1;
        if (this.f13302b) {
            i11 = ((i5 / 2) - (i4 / 2)) + 1;
        }
        int i12 = i11;
        byte[] bArrG = this.f13312l ? G(bArr, this.f13313m) : bArr;
        int i13 = this.f13305e;
        if (i13 == 1) {
            i9 = 3;
            i10 = 2;
        } else {
            i9 = i13 == 2 ? 5 : 3;
            i10 = 1;
        }
        int i14 = this.f13306f;
        int i15 = i14 == 1 ? 1 : i14 == 2 ? 2 : 0;
        if (this.f13307g) {
            bArrG = c(bArr, bArr2, i4, i5, this.f13308h);
        }
        byte[] bArr3 = bArrG;
        if (this.f13301a) {
            int i16 = i6 / 2;
            int i17 = i7 / 2;
            byte[] bArrN = n(v(bArr3, i12, 256, i16, i17, 1, 3), i12, 256, i16, i17);
            return this.f13302b ? m(bArrN, i12, 512, i6, i7) : bArrN;
        }
        int i18 = i6 / 2;
        int i19 = i7 / 2;
        byte[] bArrU = u(bArr3, i12, 256, i18, i19, i10, i9);
        if (i15 > 0) {
            bArrU = r(bArrU, i12, 256, i18, i19, i15, 3);
        }
        byte[] bArrN2 = n(p(bArrU, i12, 256, i18, i19, i8), i12, 256, i18, i19);
        if (this.f13302b) {
            byte[] bArrM = m(bArrN2, i12, 512, i6, i7);
            i12 = (i12 * 2) - 1;
            bArrN2 = bArrM;
        }
        return g(b(bArrN2, i12, 512, i6, i7), i12, 512, i6, i7);
    }
}
