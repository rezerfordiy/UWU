package z1;

/* JADX INFO: loaded from: classes.dex */
public class h6 implements n7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h6 f13293f = new h6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13298e;

    @Override // z1.n7
    public byte[] a(byte[] bArr) {
        if (!this.f13294a) {
            return bArr;
        }
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= this.f13296c) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int i4 = 0;
        while (true) {
            int i5 = this.f13295b;
            if (i4 >= i5) {
                return bArr2;
            }
            int i6 = this.f13296c;
            System.arraycopy(bArr, i4 * i6, bArr2, ((i5 - 1) - i4) * i6, i6);
            i4++;
        }
    }

    @Override // z1.n7
    public byte[] b(byte[] bArr) {
        if (!this.f13297d) {
            return bArr;
        }
        int length = bArr.length / this.f13298e;
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = this.f13298e;
            System.arraycopy(bArr, ((length - 1) - i4) * i5, bArr2, i4 * i5, i5);
        }
        return bArr2;
    }

    public void c(boolean z3, int i4, int i5) {
        this.f13294a = z3;
        this.f13295b = i4;
        this.f13296c = i5;
    }

    public void d(boolean z3, int i4) {
        this.f13297d = z3;
        this.f13298e = i4;
    }
}
