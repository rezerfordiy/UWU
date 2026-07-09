package n2;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class n1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9485p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9486q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9487r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9488s = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f9495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f9498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f9501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Date f9502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f9503o;

    public n1() {
        this.f9499k = 0;
        this.f9500l = 0;
    }

    public int a(byte[] bArr) {
        boolean z3;
        int i4;
        int length = bArr.length;
        int i5 = this.f9497i;
        if (length + i5 >= this.f9496h) {
            return 0;
        }
        System.arraycopy(bArr, 0, this.f9498j, i5, bArr.length);
        this.f9497i += bArr.length;
        while (this.f9497i >= 525) {
            int i6 = 0;
            while (true) {
                int i7 = this.f9497i;
                if (i6 > i7 - 8) {
                    z3 = false;
                    break;
                }
                byte[] bArr2 = this.f9498j;
                if (bArr2[i6 + 0] == 90 && bArr2[i6 + 1] == -91 && bArr2[i6 + 2] == -1 && bArr2[i6 + 3] == 0 && bArr2[i6 + 4] == 90 && bArr2[i6 + 5] == -91 && bArr2[i6 + 6] == -1 && bArr2[i6 + 7] == 0) {
                    if (i6 > 0) {
                        int i8 = i7 - i6;
                        this.f9497i = i8;
                        System.arraycopy(bArr2, i6, bArr2, 0, i8);
                    }
                    z3 = true;
                } else {
                    i6++;
                }
            }
            if (!z3) {
                int i9 = this.f9497i - i6;
                this.f9497i = i9;
                byte[] bArr3 = this.f9498j;
                System.arraycopy(bArr3, i6, bArr3, 0, i9);
            }
            int i10 = this.f9497i;
            if (i10 < 525) {
                return 0;
            }
            byte[] bArr4 = this.f9498j;
            int i11 = bArr4[8] & 255;
            int i12 = bArr4[9] & 255;
            if (this.f9493e == 1) {
                i12 |= (i11 & 15) << 8;
                i11 &= 240;
            }
            int i13 = this.f9500l;
            if (i13 != i12 || this.f9499k != i11) {
                int i14 = this.f9490b;
                if (i14 > 0) {
                    int i15 = this.f9489a;
                    if (i13 >= i14 + i15) {
                        this.f9500l = 0;
                        this.f9499k = i11;
                        return 3;
                    }
                    if (i13 >= i15) {
                        this.f9500l = 0;
                        this.f9499k = i11;
                        return 2;
                    }
                } else if (i13 >= this.f9489a) {
                    this.f9500l = 0;
                    this.f9499k = i11;
                    return 2;
                }
            }
            if (i12 == 0) {
                this.f9500l = 0;
                this.f9499k = i11;
            }
            int i16 = this.f9499k;
            if (i16 != i11 || (i4 = this.f9500l) != i12) {
                int i17 = i10 - 525;
                this.f9497i = i17;
                System.arraycopy(bArr4, 525, bArr4, 0, i17);
            } else if (i16 == i11 && i4 == i12) {
                byte[] bArr5 = this.f9495g;
                if (i4 < bArr5.length / 512) {
                    System.arraycopy(bArr4, 10, bArr5, i4 * 512, 512);
                }
                int i18 = this.f9497i - 525;
                this.f9497i = i18;
                byte[] bArr6 = this.f9498j;
                System.arraycopy(bArr6, 525, bArr6, 0, i18);
                int i19 = this.f9500l + 1;
                this.f9500l = i19;
                if (i19 == 1) {
                    this.f9503o = (byte) (i11 & 255);
                    this.f9502n = new Date();
                    if (this.f9493e == 1) {
                        this.f9503o = (byte) (i11 & 240);
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    public int b(byte[] bArr) {
        int i4;
        int length = bArr.length;
        int i5 = this.f9497i;
        if (length + i5 >= this.f9496h) {
            return 0;
        }
        System.arraycopy(bArr, 0, this.f9498j, i5, bArr.length);
        this.f9497i += bArr.length;
        int i6 = 0;
        while (true) {
            if (this.f9497i < 525) {
                break;
            }
            int i7 = 0;
            while (true) {
                int i8 = this.f9497i;
                if (i7 > i8 - 8) {
                    break;
                }
                byte[] bArr2 = this.f9498j;
                if (bArr2[i7 + 0] == 90 && bArr2[i7 + 1] == -91 && bArr2[i7 + 2] == -1 && bArr2[i7 + 3] == 0 && bArr2[i7 + 4] == 90 && bArr2[i7 + 5] == -91 && bArr2[i7 + 6] == -1 && bArr2[i7 + 7] == 0) {
                    if (i7 > 0) {
                        int i9 = i8 - i7;
                        this.f9497i = i9;
                        System.arraycopy(bArr2, i7, bArr2, 0, i9);
                    }
                    i7 = 0;
                } else {
                    i7++;
                }
            }
            int i10 = this.f9497i;
            if (i7 >= i10 - 8) {
                int i11 = i10 - i7;
                this.f9497i = i11;
                byte[] bArr3 = this.f9498j;
                System.arraycopy(bArr3, i7, bArr3, 0, i11);
                break;
            }
            if (i10 >= 525) {
                byte[] bArr4 = this.f9498j;
                int i12 = bArr4[8] & 255;
                int i13 = bArr4[9] & 255;
                if (this.f9493e == 1) {
                    i13 |= (i12 & 15) << 8;
                    i12 &= 240;
                }
                if (this.f9499k == i12 && (i4 = this.f9500l) == i13) {
                    int i14 = (i4 * 512) + 512;
                    byte[] bArr5 = this.f9495g;
                    if (i14 <= bArr5.length) {
                        System.arraycopy(bArr4, 10, bArr5, i4 * 512, 512);
                        int i15 = this.f9497i - 525;
                        this.f9497i = i15;
                        byte[] bArr6 = this.f9498j;
                        System.arraycopy(bArr6, 525, bArr6, 0, i15);
                        int i16 = this.f9500l + 1;
                        this.f9500l = i16;
                        if (i16 == 1) {
                            this.f9503o = (byte) (i12 & 255);
                            this.f9502n = new Date();
                            if (this.f9493e == 1) {
                                this.f9503o = (byte) (i12 & 240);
                            }
                            return 1;
                        }
                    }
                }
                int i17 = this.f9490b;
                i6 = (i17 <= 0 || this.f9500l < this.f9489a + i17) ? this.f9500l >= this.f9489a ? 2 : 0 : 3;
                this.f9499k = i12;
                this.f9500l = 0;
                if (i13 != 0) {
                    int i18 = i10 - 525;
                    this.f9497i = i18;
                    System.arraycopy(bArr4, 525, bArr4, 0, i18);
                }
                if (i6 >= 2) {
                    break;
                }
            }
        }
        return i6;
    }

    public Date c() {
        return this.f9502n;
    }

    public byte d() {
        return this.f9503o;
    }

    public void e(boolean z3) {
        this.f9491c = z3;
    }

    public void f(boolean z3) {
        this.f9492d = z3;
    }

    public byte[] g(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i4 * i5];
        for (int i6 = 0; i6 < i4; i6++) {
            System.arraycopy(bArr, i6 * i5, bArr2, ((i4 - 1) - i6) * i5, i5);
        }
        return bArr2;
    }

    public byte[] h() {
        int i4 = this.f9489a;
        byte[] bArrG = new byte[i4 * 512];
        System.arraycopy(this.f9495g, 0, bArrG, 0, i4 * 512);
        if (this.f9491c) {
            bArrG = g(bArrG, this.f9489a, 512);
        }
        if (this.f9492d) {
            int i5 = this.f9489a;
            byte[] bArr = new byte[i5 * 512];
            System.arraycopy(bArrG, 0, bArr, 0, i5 * 512);
            for (int i6 = 0; i6 < this.f9489a - 1; i6++) {
                for (int i7 = 0; i7 < 512; i7++) {
                    int i8 = i6 * 512;
                    int i9 = i8 + i7;
                    bArrG[i9] = (byte) ((((bArr[i9] & 255) + (bArr[(i8 + 512) + i7] & 255)) / 2) & 255);
                }
            }
        }
        return bArrG;
    }

    public byte[] i() {
        int i4 = this.f9490b;
        if (i4 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i4 * 512];
        System.arraycopy(this.f9495g, this.f9489a * 512, bArr, 0, i4 * 512);
        return this.f9491c ? g(bArr, this.f9490b, 512) : bArr;
    }

    public byte[] j() {
        int i4 = this.f9490b;
        if (i4 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i4 * 512];
        System.arraycopy(this.f9495g, this.f9489a * 512, bArr, 0, i4 * 512);
        return bArr;
    }

    public n1(int i4, int i5) {
        this.f9499k = 0;
        this.f9500l = 0;
        this.f9489a = i4;
        this.f9490b = i5;
        this.f9497i = 0;
        int i6 = (i4 + i5) * 512 * 5;
        this.f9496h = i6;
        this.f9498j = new byte[i6];
        int i7 = (i4 + i5) * 512;
        this.f9494f = i7;
        this.f9495g = new byte[i7];
        this.f9501m = new byte[i7];
    }

    public n1(int i4, int i5, int i6) {
        this.f9499k = 0;
        this.f9500l = 0;
        this.f9489a = i4;
        this.f9490b = i5;
        this.f9497i = 0;
        int i7 = (i4 + i5) * 512 * 5;
        this.f9496h = i7;
        this.f9498j = new byte[i7];
        int i8 = (i4 + i5) * 512;
        this.f9494f = i8;
        this.f9495g = new byte[i8];
        this.f9501m = new byte[i8];
        this.f9493e = i6;
    }
}
