package n2;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r0 implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9558g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9559h = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1 f9560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p1 f9561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1 f9562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9563e = 64;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9564f = 0;

    public static byte[] t(byte[] bArr, byte[] bArr2) {
        int length;
        int length2 = bArr != null ? bArr.length + 0 : 0;
        if (bArr2 != null) {
            length2 += bArr2.length;
        }
        if (length2 <= 0) {
            return null;
        }
        byte[] bArr3 = new byte[length2];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            length = bArr.length + 0;
        } else {
            length = 0;
        }
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        }
        return bArr3;
    }

    public void A(boolean z3) {
    }

    public void B(int i4) {
        int i5 = this.f9564f;
        if (i5 != i4) {
            if (i5 == 1) {
                m2.v.b().c();
            }
            this.f9564f = i4;
        }
    }

    public void C(int i4) {
    }

    public void D(int i4) {
    }

    public void E() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j(JSONObject jSONObject) {
    }

    public int k() {
        return this.f9563e;
    }

    public int l() {
        return 30;
    }

    public int m() {
        return this.f9564f;
    }

    public int n() {
        return 0;
    }

    public void o() {
    }

    public void p() {
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public void u(boolean z3) {
        e1 e1Var = this.f9560b;
        if (e1Var != null) {
            e1Var.u(z3);
        }
    }

    public byte[] v(int i4) {
        return null;
    }

    public void w(byte[] bArr) {
    }

    public void x(byte[] bArr) {
    }

    public void y(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else {
            int i5 = this.f9561c.f9527g.f9535f;
            if (i4 >= i5) {
                this.f9563e = i5 - 1;
                return;
            }
        }
        this.f9563e = i4;
    }

    public void z(int i4) {
    }
}
