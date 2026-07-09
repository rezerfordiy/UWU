package n2;

/* JADX INFO: loaded from: classes.dex */
public class w7 extends n0 {
    public w7() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    public w7(String str) {
        super(str);
        if (str.startsWith("SX-7T ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new u7(str2);
            this.Y = new x7(str3);
            a2(0);
        }
    }
}
