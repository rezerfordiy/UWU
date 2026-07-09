package n2;

/* JADX INFO: loaded from: classes.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9155a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9156b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9157c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9158d = 512;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9159e = 256;

    public byte[] a(byte[] bArr) {
        if (!this.f9155a) {
            return bArr;
        }
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i4 = this.f9158d;
        if (length <= i4) {
            return bArr;
        }
        int length2 = bArr.length / i4;
        byte[] bArr2 = new byte[bArr.length];
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = this.f9158d;
            System.arraycopy(bArr, i5 * i6, bArr2, ((length2 - 1) - i5) * i6, i6);
        }
        return bArr2;
    }

    public byte[] b(byte[] bArr, int i4, int i5) {
        if (!this.f9156b) {
            return bArr;
        }
        int length = bArr.length;
        int i6 = this.f9159e;
        int i7 = length / i6;
        if (this.f9157c) {
            i4 /= 2;
            i5 /= 2;
        }
        int i8 = (i5 - i4) + 1;
        if (i8 <= 0 || i7 < i8) {
            return bArr;
        }
        byte[] bArr2 = new byte[i6 * i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f9159e;
            System.arraycopy(bArr, ((i8 - 1) - i9) * i10, bArr2, i9 * i10, i10);
        }
        return bArr2;
    }
}
