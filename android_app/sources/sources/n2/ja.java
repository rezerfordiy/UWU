package n2;

/* JADX INFO: loaded from: classes.dex */
public class ja extends i0 {
    public ja() {
    }

    public byte a2(int i4) {
        byte[] bArr = {0, 1, 3};
        if (i4 < 0 || i4 > 2) {
            return (byte) 0;
        }
        return bArr[i4];
    }

    public int b2(int i4, boolean z3) {
        return 100;
    }

    public boolean c2() {
        return false;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public r0 y() {
        ga gaVar = new ga();
        gaVar.f9561c = this;
        gaVar.y(this.f9527g.f9535f / 2);
        gaVar.f9562d = E1();
        gaVar.B = D1();
        gaVar.A = i0();
        gaVar.J = C1();
        gaVar.q0(L0());
        return gaVar;
    }

    public ja(String str) {
        super(str);
    }
}
