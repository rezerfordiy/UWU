package n2;

/* JADX INFO: loaded from: classes.dex */
public class ba extends a1 {
    public boolean A;

    @Override // n2.a1
    public byte[] M(int i4) {
        byte[] bArrM = super.M(i4);
        if (this.A) {
            bArrM[2] = (byte) (bArrM[2] | z1.l1.f13562p);
        }
        return bArrM;
    }

    public void W(boolean z3) {
        this.A = z3;
    }

    public boolean X() {
        return this.A;
    }
}
