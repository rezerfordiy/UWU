package z1;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f13621f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13626e;

    public class a extends m0 {
        @Override // z1.m0
        public String a() {
            return s0.a.f11071l;
        }

        @Override // z1.m0
        public String e() {
            return s0.a.f11071l;
        }

        @Override // z1.m0
        public String f() {
            return s0.a.f11071l;
        }

        @Override // z1.m0
        public String g() {
            return s0.a.f11071l;
        }

        @Override // z1.m0
        public String h() {
            return s0.a.f11071l;
        }
    }

    public enum b {
        WIFI_AP("wifi_ap"),
        WIFI_DIRECT("wifi_direct"),
        USB("usb");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13631b;

        b(String str) {
            this.f13631b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13631b;
        }
    }

    public enum c {
        SSID("ssid"),
        UDP("udp"),
        USB("usb");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13636b;

        c(String str) {
            this.f13636b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13636b;
        }
    }

    public static m0 c(String str, String str2, String str3, String str4) {
        m0 m0Var = new m0();
        m0Var.f13623b = str3;
        m0Var.f13622a = str4;
        m0Var.f13624c = str2;
        m0Var.f13625d = str;
        return m0Var;
    }

    public static m0 d(String str, String str2, String str3, String str4, String str5) {
        m0 m0Var = new m0();
        m0Var.f13623b = str3;
        m0Var.f13622a = str4;
        m0Var.f13624c = str2;
        m0Var.f13625d = str;
        m0Var.f13626e = str5;
        return m0Var;
    }

    public String a() {
        return this.f13623b;
    }

    public boolean b(m0 m0Var) {
        if (m0Var == this) {
            return true;
        }
        return m0Var.f13622a.equals(this.f13622a) && m0Var.f13623b.equals(this.f13623b) && m0Var.f13625d.equals(this.f13625d) && m0Var.f13624c.equals(this.f13624c) && m0Var.f13626e.equals(this.f13626e);
    }

    public String e() {
        return this.f13626e;
    }

    public String f() {
        return this.f13622a;
    }

    public String g() {
        return this.f13624c;
    }

    public String h() {
        return this.f13625d;
    }
}
