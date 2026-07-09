package n2;

/* JADX INFO: loaded from: classes.dex */
public class w6 extends n0 {
    public w6() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.p1
    public boolean t() {
        return true;
    }

    public w6(String str) {
        super(str);
        if (str.startsWith("SX-1X ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new x6(str2);
            this.Y = new y6(str3);
            a2(0);
        }
    }
}
