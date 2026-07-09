package w1;

import com.sonoptek.vulkan.VKEnhJni;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f12512b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12513a;

    public c(int i4) {
        this.f12513a = i4;
    }

    @Override // w1.b
    public byte[] a(byte[] bArr, int i4, int i5, int i6) {
        byte[] bArrA;
        if (i6 == 0) {
            return bArr;
        }
        if (f12512b) {
            VKEnhJni.setEnhanceLevel(i6);
            VKEnhJni.setEnhanceMode(this.f12513a);
            System.currentTimeMillis();
            bArrA = VKEnhJni.enhance(bArr, i5, i4);
        } else {
            g gVarY = g.y();
            gVarY.M(this.f12513a);
            gVarY.L(i6);
            System.currentTimeMillis();
            bArrA = gVarY.a(bArr, i4, i5);
        }
        System.currentTimeMillis();
        return bArrA;
    }
}
