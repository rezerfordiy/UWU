package n2;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends g0 {
    public final int Z = 5;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public byte[][] f9444a0 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, 16384);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public byte[][] f9445b0 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, 16384);

    @Override // n2.g0, n2.r0
    public void B(int i4) {
        super.B(i4);
        int i5 = this.N;
        if ((i5 == 2 || i5 == 3) && n() > 2) {
            D(2);
        }
    }

    @Override // n2.a1, n2.r0
    public void D(int i4) {
        int i5 = this.f9564f;
        if ((i5 == 2 || i5 == 3) && i4 > 2) {
            i4 = 2;
        }
        super.D(i4);
    }

    @Override // n2.g0
    public int D0() {
        return q1(super.E0());
    }

    @Override // n2.g0
    public int E0() {
        return q1(super.D0());
    }

    @Override // n2.g0
    public int[] F0() {
        int[] iArrF0 = super.F0();
        int[] iArr = new int[iArrF0.length];
        for (int i4 = 0; i4 < iArrF0.length; i4++) {
            iArr[(iArrF0.length - 1) - i4] = q1(iArrF0[i4]);
        }
        return iArr;
    }

    @Override // n2.g0
    public int N0() {
        return q1(super.N0());
    }

    @Override // n2.g0
    public byte[] W0(byte[] bArr, int i4, int i5, int i6) {
        int i7 = i6;
        byte[] bArr2 = new byte[bArr.length];
        int i8 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[bArr.length];
        int i9 = this.f9561c.f9527g.f9536g;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr.length);
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i5;
            while (i11 <= i7) {
                byte[] bArr4 = new byte[49];
                byte b4 = bArr3[(i10 * 512) + i11];
                bArr4[i8] = b4;
                int i12 = 1;
                int i13 = b4 < 0 ? 1 : i8;
                int i14 = i10 - 1;
                if (i14 > 0) {
                    byte b5 = bArr3[(i14 * 512) + i11];
                    bArr4[1] = b5;
                    if (b5 < 0) {
                        i13++;
                    }
                    i12 = 2;
                }
                int i15 = i10 + 1;
                if (i15 <= 127) {
                    byte b6 = bArr3[(i15 * 512) + i11];
                    bArr4[i12] = b6;
                    if (b6 < 0) {
                        i13++;
                    }
                    i12++;
                }
                int i16 = i11 - 2;
                if (i16 >= i5) {
                    byte b7 = bArr3[(i15 * 512) + i16];
                    bArr4[i12] = b7;
                    if (b7 < 0) {
                        i13++;
                    }
                    i12++;
                }
                int i17 = i11 + 2;
                if (i17 <= i7) {
                    byte b8 = bArr3[(i15 * 512) + i17];
                    bArr4[i12] = b8;
                    if (b8 < 0) {
                        i13++;
                    }
                    i12++;
                }
                int i18 = i8;
                while (true) {
                    int i19 = i12 - 1;
                    if (i18 >= i19) {
                        break;
                    }
                    while (i8 < i19 - i18) {
                        byte b9 = bArr4[i8];
                        int i20 = i8 + 1;
                        byte b10 = bArr4[i20];
                        if (b9 > b10) {
                            bArr4[i8] = b10;
                            bArr4[i20] = b9;
                        }
                        i8 = i20;
                    }
                    i18++;
                    i8 = 0;
                }
                bArr2[(i10 * i9) + i11] = i13 >= i12 / 2 ? bArr4[i13 / 2] : bArr4[i13 + ((i12 - i13) / 2)];
                i7 = i6;
                i11 = i17;
                i8 = 0;
            }
            i10++;
            i7 = i6;
            i8 = 0;
        }
        return p1(bArr2);
    }

    @Override // n2.g0
    public byte[] X0(byte[] bArr, int i4, int i5, int i6) {
        byte[] bArr2 = new byte[bArr.length];
        int i7 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[bArr.length];
        int i8 = this.f9561c.f9527g.f9536g;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr.length);
        int i9 = 0;
        while (i9 < 16) {
            int i10 = i5;
            while (i10 <= i6) {
                int[] iArr = new int[49];
                iArr[i7] = bArr3[(i9 * 512) + i10];
                int i11 = i9 - 1;
                int i12 = 1;
                if (i11 > 0) {
                    iArr[1] = bArr3[(i11 * 512) + i10];
                    i12 = 2;
                }
                int i13 = i9 + 1;
                if (i13 <= 127) {
                    iArr[i12] = bArr3[(i13 * 512) + i10];
                    i12++;
                }
                int i14 = i10 - 2;
                if (i14 >= i5) {
                    iArr[i12] = bArr3[(i13 * 512) + i14];
                    i12++;
                }
                int i15 = i10 + 2;
                if (i15 <= i6) {
                    iArr[i12] = bArr3[(i13 * 512) + i15];
                    i12++;
                }
                int i16 = i7;
                while (true) {
                    int i17 = i12 - 1;
                    if (i16 < i17) {
                        int i18 = i7;
                        while (i18 < i17 - i16) {
                            int i19 = iArr[i18];
                            int i20 = i18 + 1;
                            int i21 = iArr[i20];
                            if (i19 > i21) {
                                iArr[i18] = i21;
                                iArr[i20] = i19;
                            }
                            i18 = i20;
                        }
                        i16++;
                        i7 = 0;
                    }
                }
                bArr2[(i9 * i8) + i10] = (byte) (iArr[i12 / 2] & 255);
                i10 = i15;
                i7 = 0;
            }
            i9++;
            i7 = 0;
        }
        return r1(bArr2);
    }

    @Override // n2.g0
    public void c1(int i4, int i5) {
        int iQ1 = (q1(i5) / 2) * 2;
        int iQ12 = (q1(i4) / 2) * 2;
        int i6 = (iQ12 - iQ1) + 1;
        if (i6 >= 32 && i6 <= 64) {
            super.c1(iQ1, iQ12);
        }
    }

    @Override // n2.g0
    public void f1(int i4) {
        super.f1(0);
    }

    @Override // n2.g0
    public void k1(int i4) {
        super.k1(q1(i4));
    }

    @Override // n2.g0
    public void m1(int i4) {
        super.m1(0);
    }

    public byte[] p1(byte[] bArr) {
        int i4 = 0;
        while (i4 < 4) {
            byte[][] bArr2 = this.f9444a0;
            int i5 = i4 + 1;
            System.arraycopy(bArr2[i5], 0, bArr2[i4], 0, 16384);
            i4 = i5;
        }
        for (int i6 = 0; i6 < 16384; i6++) {
            byte b4 = bArr[i6];
            if (b4 >= 2 || b4 <= -2) {
                this.f9444a0[4][i6] = 1;
            } else {
                this.f9444a0[4][i6] = 0;
            }
        }
        for (int i7 = 0; i7 < 16384; i7++) {
            byte b5 = 0;
            for (int i8 = 0; i8 < 5; i8++) {
                b5 = (byte) (b5 + this.f9444a0[i8][i7]);
            }
            if (b5 < 3) {
                bArr[i7] = 0;
            }
        }
        return bArr;
    }

    public int q1(int i4) {
        return (this.f9561c.f9527g.f9535f - 1) - i4;
    }

    public byte[] r1(byte[] bArr) {
        int i4 = 0;
        while (i4 < 4) {
            byte[][] bArr2 = this.f9445b0;
            int i5 = i4 + 1;
            System.arraycopy(bArr2[i5], 0, bArr2[i4], 0, 16384);
            i4 = i5;
        }
        for (int i6 = 0; i6 < 16384; i6++) {
            byte b4 = bArr[i6];
            if (b4 >= 2 || b4 <= -2) {
                this.f9445b0[4][i6] = 1;
            } else {
                this.f9445b0[4][i6] = 0;
            }
        }
        for (int i7 = 0; i7 < 16384; i7++) {
            byte b5 = 0;
            for (int i8 = 0; i8 < 5; i8++) {
                b5 = (byte) (b5 + this.f9445b0[i8][i7]);
            }
            if (b5 < 3) {
                bArr[i7] = 0;
            }
        }
        return bArr;
    }
}
