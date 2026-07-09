package w2;

/* JADX INFO: loaded from: classes.dex */
public class h extends AssertionError {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12619d = 20;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12620e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12622c;

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f12623f = "...";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f12624g = "]";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f12625h = "[";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f12627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f12628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12630e;

        public a(int i4, String str, String str2) {
            this.f12626a = i4;
            this.f12627b = str;
            this.f12628c = str2;
        }

        public final boolean b() {
            return this.f12627b.equals(this.f12628c);
        }

        public final String c(String str) {
            String strD;
            String strD2;
            if (this.f12627b == null || this.f12628c == null || b()) {
                strD = this.f12627b;
                strD2 = this.f12628c;
            } else {
                g();
                h();
                strD = d(this.f12627b);
                strD2 = d(this.f12628c);
            }
            return c.T(str, strD, strD2);
        }

        public final String d(String str) {
            String str2 = "[" + str.substring(this.f12629d, (str.length() - this.f12630e) + 1) + "]";
            if (this.f12629d > 0) {
                str2 = e() + str2;
            }
            if (this.f12630e <= 0) {
                return str2;
            }
            return str2 + f();
        }

        public final String e() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12629d > this.f12626a ? "..." : s0.a.f11071l);
            sb.append(this.f12627b.substring(Math.max(0, this.f12629d - this.f12626a), this.f12629d));
            return sb.toString();
        }

        public final String f() {
            int iMin = Math.min((this.f12627b.length() - this.f12630e) + 1 + this.f12626a, this.f12627b.length());
            StringBuilder sb = new StringBuilder();
            String str = this.f12627b;
            sb.append(str.substring((str.length() - this.f12630e) + 1, iMin));
            sb.append((this.f12627b.length() - this.f12630e) + 1 < this.f12627b.length() - this.f12626a ? "..." : s0.a.f11071l);
            return sb.toString();
        }

        public final void g() {
            this.f12629d = 0;
            int iMin = Math.min(this.f12627b.length(), this.f12628c.length());
            while (true) {
                int i4 = this.f12629d;
                if (i4 >= iMin || this.f12627b.charAt(i4) != this.f12628c.charAt(this.f12629d)) {
                    return;
                } else {
                    this.f12629d++;
                }
            }
        }

        public final void h() {
            int length = this.f12627b.length() - 1;
            int length2 = this.f12628c.length() - 1;
            while (true) {
                int i4 = this.f12629d;
                if (length2 < i4 || length < i4 || this.f12627b.charAt(length) != this.f12628c.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.f12630e = this.f12627b.length() - length;
        }
    }

    public h(String str, String str2, String str3) {
        super(str);
        this.f12621b = str2;
        this.f12622c = str3;
    }

    public String a() {
        return this.f12622c;
    }

    public String b() {
        return this.f12621b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new a(20, this.f12621b, this.f12622c).c(super.getMessage());
    }
}
