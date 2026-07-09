package z1;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0[] f13352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13353b;

    public j0(int i4, int i5, float f4, float f5, float f6, float[] fArr, float f7) {
        this.f13352a = new l0[fArr.length];
        for (int i6 = 0; i6 < fArr.length; i6++) {
            this.f13352a[i6] = new l0(i4, i5, f4, f5, f6, fArr[i6], f7);
        }
        this.f13353b = false;
    }

    @Override // z1.p
    public byte[] a(byte[] bArr, float f4, int i4, String str) {
        if (i4 < 0) {
            return bArr;
        }
        l0[] l0VarArr = this.f13352a;
        return i4 >= l0VarArr.length ? bArr : l0VarArr[i4].b(bArr, f4);
    }

    @Override // z1.p
    public byte[] b(byte[] bArr, float f4, int i4, String str, boolean z3, boolean z4, float f5, float f6) {
        if (!z4) {
            return a(bArr, f4, i4, str);
        }
        if (i4 >= 0) {
            l0[] l0VarArr = this.f13352a;
            if (i4 < l0VarArr.length) {
                l0 l0Var = l0VarArr[i4];
                if (f4 != 0.0f) {
                    l0Var.a(bArr, f4);
                }
                return l0Var.c(bArr, f4, z3, z4, f5, f6);
            }
        }
        return bArr;
    }

    public j0(int i4, int i5, float f4, float f5, float f6, float[] fArr, float f7, float f8, boolean z3) {
        this.f13352a = new l0[fArr.length];
        for (int i6 = 0; i6 < fArr.length; i6++) {
            this.f13352a[i6] = new l0(i4, i5, f4, f5, f6, fArr[i6], f7, f8, z3);
        }
        this.f13353b = z3;
    }
}
