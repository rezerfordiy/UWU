package n2;

/* JADX INFO: loaded from: classes.dex */
public class g6 extends n0 {
    public g6() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    public g6(String str) {
        super(str);
        if (str.startsWith("SX-1C ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new h6(str2);
            this.Y = new i6(str3);
            a2(0);
        }
    }
}
