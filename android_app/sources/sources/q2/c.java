package q2;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10446f = "...";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10447g = "]";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10448h = "[";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10453e;

    public c(int i4, String str, String str2) {
        this.f10449a = i4;
        this.f10450b = str;
        this.f10451c = str2;
    }

    public final boolean a() {
        return this.f10450b.equals(this.f10451c);
    }

    public String b(String str) {
        String strC;
        String strC2;
        if (this.f10450b == null || this.f10451c == null || a()) {
            strC = this.f10450b;
            strC2 = this.f10451c;
        } else {
            f();
            g();
            strC = c(this.f10450b);
            strC2 = c(this.f10451c);
        }
        return a.N(str, strC, strC2);
    }

    public final String c(String str) {
        String str2 = "[" + str.substring(this.f10452d, (str.length() - this.f10453e) + 1) + "]";
        if (this.f10452d > 0) {
            str2 = d() + str2;
        }
        if (this.f10453e <= 0) {
            return str2;
        }
        return str2 + e();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10452d > this.f10449a ? "..." : s0.a.f11071l);
        sb.append(this.f10450b.substring(Math.max(0, this.f10452d - this.f10449a), this.f10452d));
        return sb.toString();
    }

    public final String e() {
        int iMin = Math.min((this.f10450b.length() - this.f10453e) + 1 + this.f10449a, this.f10450b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.f10450b;
        sb.append(str.substring((str.length() - this.f10453e) + 1, iMin));
        sb.append((this.f10450b.length() - this.f10453e) + 1 < this.f10450b.length() - this.f10449a ? "..." : s0.a.f11071l);
        return sb.toString();
    }

    public final void f() {
        this.f10452d = 0;
        int iMin = Math.min(this.f10450b.length(), this.f10451c.length());
        while (true) {
            int i4 = this.f10452d;
            if (i4 >= iMin || this.f10450b.charAt(i4) != this.f10451c.charAt(this.f10452d)) {
                return;
            } else {
                this.f10452d++;
            }
        }
    }

    public final void g() {
        int length = this.f10450b.length() - 1;
        int length2 = this.f10451c.length() - 1;
        while (true) {
            int i4 = this.f10452d;
            if (length2 < i4 || length < i4 || this.f10450b.charAt(length) != this.f10451c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f10453e = this.f10450b.length() - length;
    }
}
