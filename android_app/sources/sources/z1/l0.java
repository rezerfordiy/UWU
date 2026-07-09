package z1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f13554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f13555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<b> f13556c = new ArrayList();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f13557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f13558b;

        public b() {
        }
    }

    public l0(int i4, int i5, float f4, float f5, float f6, float f7, float f8) {
        this.f13554a = new o(i4, i5, f4, f5, (float) (((double) (f6 / 180.0f)) * 3.141592653589793d), f7, f8);
    }

    public byte[] a(byte[] bArr, float f4) {
        return this.f13555b.c(bArr, f4);
    }

    public byte[] b(byte[] bArr, float f4) {
        b bVar = new b();
        bVar.f13558b = bArr;
        bVar.f13557a = f4;
        this.f13556c.add(bVar);
        if (this.f13556c.size() > 3) {
            this.f13556c.remove(0);
        } else if (this.f13556c.size() < 3) {
            return null;
        }
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        for (b bVar2 : this.f13556c) {
            float f5 = bVar2.f13557a;
            byte[] bArr5 = bVar2.f13558b;
            if (f5 > 0.0f) {
                bArr2 = bArr5;
            } else if (f5 < 0.0f) {
                bArr4 = bArr5;
            } else {
                bArr3 = bArr5;
            }
        }
        if (bArr2 == null || bArr3 == null || bArr4 == null) {
            return null;
        }
        k0 k0Var = this.f13555b;
        byte[] bArrB = k0Var != null ? k0Var.b(bArr2, bArr3, bArr4) : this.f13554a.a(bArr2, bArr3, bArr4);
        int length = bArrB.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArrB, 0, bArr6, 0, length);
        return bArr6;
    }

    public byte[] c(byte[] bArr, float f4, boolean z3, boolean z4, float f5, float f6) {
        if (this.f13555b == null) {
            return b(bArr, f4);
        }
        b bVar = new b();
        bVar.f13558b = bArr;
        bVar.f13557a = f4;
        this.f13556c.add(bVar);
        if (this.f13556c.size() > 3) {
            this.f13556c.remove(0);
        } else if (this.f13556c.size() < 3) {
            return null;
        }
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        for (b bVar2 : this.f13556c) {
            float f7 = bVar2.f13557a;
            byte[] bArr5 = bVar2.f13558b;
            if (f7 > 0.0f) {
                bArr3 = bArr5;
            } else if (f7 < 0.0f) {
                bArr4 = bArr5;
            } else {
                bArr2 = bArr5;
            }
        }
        if (!z3 && z4 && bArr2 != null) {
            this.f13555b.e(f5, (int) f6);
            return this.f13555b.a(bArr2);
        }
        if (bArr3 == null || bArr2 == null || bArr4 == null) {
            return null;
        }
        byte[] bArrB = this.f13555b.b(bArr3, bArr2, bArr4);
        if (!z4) {
            return bArrB;
        }
        this.f13555b.e(f5, (int) f6);
        return this.f13555b.a(bArrB);
    }

    public l0(int i4, int i5, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3) {
        this.f13555b = new k0(i4, i5, f4, f5, (float) (((double) (f6 / 180.0f)) * 3.141592653589793d), f7, f8, f9);
    }
}
