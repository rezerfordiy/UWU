package n2;

/* JADX INFO: loaded from: classes.dex */
public class fa extends k0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k0 f9250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k0 f9251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9252u;

    @Override // n2.k0
    public byte[] g(byte[] bArr, int i4, int i5) {
        int i6 = this.f9248q;
        int i7 = this.f9252u;
        byte[] bArr2 = new byte[i6 * i7];
        int i8 = this.f9249r;
        int i9 = i8 * i7;
        byte[] bArr3 = new byte[i9];
        int i10 = i6 * i7;
        byte[] bArr4 = new byte[i10];
        byte[] bArr5 = new byte[i8 * i7];
        System.arraycopy(bArr, 0, bArr4, 0, i10);
        System.arraycopy(bArr, i10, bArr5, 0, i9);
        byte[] bArrG = this.f9250s.g(bArr4, i4, i5);
        byte[] bArrG2 = this.f9251t.g(bArr5, i4, i5);
        if (bArrG == null || bArrG2 == null) {
            return null;
        }
        byte[] bArr6 = new byte[bArrG.length + bArrG2.length];
        System.arraycopy(bArrG, 0, bArr6, 0, bArrG.length);
        System.arraycopy(bArrG2, 0, bArr6, bArrG.length, bArrG2.length);
        for (int i11 = 0; i11 < 512; i11++) {
            bArr6[i11 + 24064] = 0;
            bArr6[i11 + 24576] = 0;
        }
        return bArr6;
    }

    public void o(int i4, int i5, int i6, float f4, float f5, float[] fArr) {
        this.f9252u = i6;
        this.f9248q = i4;
        this.f9249r = i5;
        k0 k0Var = new k0();
        this.f9250s = k0Var;
        k0Var.j(this.f9248q, i6, f4, f5, fArr);
        k0 k0Var2 = new k0();
        this.f9251t = k0Var2;
        k0Var2.j(this.f9249r, i6, f4, f5, fArr);
    }
}
