package z1;

/* JADX INFO: loaded from: classes.dex */
public class i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f13319b = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b7 f13320a;

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length <= 0) {
            return bArr;
        }
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public byte[] b(d1 d1Var, String str) {
        return null;
    }
}
