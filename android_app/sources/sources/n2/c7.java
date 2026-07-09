package n2;

/* JADX INFO: loaded from: classes.dex */
public class c7 extends n0 {
    public c7() {
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    public c7(String str) {
        super(str);
        if (str.startsWith("SX-2CS ")) {
            A("WXP");
            int iIndexOf = this.f9523c.indexOf(" ");
            String str2 = str.substring(0, iIndexOf) + "A" + str.substring(iIndexOf);
            String str3 = str.substring(0, iIndexOf) + "B" + str.substring(iIndexOf);
            this.X = new d7(str2);
            this.Y = new e7(str3);
            a2(0);
        }
    }
}
