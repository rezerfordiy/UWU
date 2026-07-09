package n2;

/* JADX INFO: loaded from: classes.dex */
public class j7 extends n0 {
    public j7() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    public j7(String str) {
        super(str);
        if (str.startsWith("SX-4C ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new k7(str2);
            this.Y = new l7(str3);
            a2(0);
        }
    }
}
