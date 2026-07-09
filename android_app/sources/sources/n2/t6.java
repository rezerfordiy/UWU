package n2;

/* JADX INFO: loaded from: classes.dex */
public class t6 extends n0 {
    public t6() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.i0, n2.p1
    public boolean l() {
        return false;
    }

    @Override // n2.i0, n2.p1
    public boolean m() {
        return false;
    }

    public t6(String str) {
        super(str);
        if (str.startsWith("SX-1T ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new u6(str2);
            this.Y = new v6(str3);
            a2(0);
        }
    }
}
