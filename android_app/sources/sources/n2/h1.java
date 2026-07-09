package n2;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends n1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ boolean f9332w = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f9333t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f9334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f9335v;

    public h1(int i4, int i5) {
        this.f9489a = i4;
        this.f9490b = i5;
        int i6 = (i4 + i5) * 512 * 5;
        this.f9496h = i6;
        this.f9334u = new byte[i6];
        int i7 = (i4 + i5) * 512;
        this.f9494f = i7;
        this.f9335v = new byte[i7];
    }

    @Override // n2.n1
    public int a(byte[] bArr) {
        int i4;
        int length = bArr.length / 525;
        int i5 = this.f9489a;
        if (length != this.f9490b + i5 + 1 && length != i5 + 1) {
            return 0;
        }
        this.f9502n = new Date();
        this.f9333t = bArr[56];
        int i6 = 1;
        while (true) {
            i4 = this.f9489a;
            if (i6 > i4) {
                break;
            }
            System.arraycopy(bArr, (i6 * 525) + 12, this.f9334u, (i6 - 1) * 512, 512);
            i6++;
        }
        int i7 = this.f9490b;
        if (i7 <= 0 || length != i7 + i4 + 1) {
            return 2;
        }
        int i8 = i4 + 1;
        while (true) {
            int i9 = this.f9489a;
            if (i8 > this.f9490b + i9) {
                return 2;
            }
            System.arraycopy(bArr, (i8 * 525) + 12, this.f9335v, ((i8 - i9) - 1) * 512, 512);
            i8++;
        }
    }

    @Override // n2.n1
    public byte d() {
        return this.f9333t;
    }

    @Override // n2.n1
    public byte[] h() {
        int i4 = this.f9489a;
        byte[] bArrG = new byte[i4 * 512];
        System.arraycopy(this.f9334u, 0, bArrG, 0, i4 * 512);
        if (this.f9491c) {
            bArrG = g(bArrG, this.f9489a, 512);
        }
        return this.f9492d ? k(this.f9334u, this.f9489a, 512) : bArrG;
    }

    @Override // n2.n1
    public byte[] i() {
        int i4 = this.f9490b;
        if (i4 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i4 * 512];
        System.arraycopy(this.f9335v, 0, bArr, 0, i4 * 512);
        return this.f9491c ? g(bArr, this.f9490b, 512) : bArr;
    }

    public byte[] k(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i4 * 512];
        System.arraycopy(bArr, 0, bArr2, 0, i4 * i5);
        for (int i6 = 0; i6 < i4 - 1; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i6 * i5;
                bArr[(i6 * 512) + i7] = (byte) ((((bArr2[i8 + i7] & 255) + (bArr2[(i8 + i5) + i7] & 255)) / 2) & 255);
            }
        }
        return bArr2;
    }

    public h1(int i4, int i5, int i6) {
        this.f9489a = i4;
        this.f9490b = i5;
        int i7 = (i4 + i5) * 512 * 5;
        this.f9496h = i7;
        this.f9334u = new byte[i7];
        int i8 = (i4 + i5) * 512;
        this.f9494f = i8;
        this.f9335v = new byte[i8];
        this.f9493e = i6;
    }
}
