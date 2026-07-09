package z1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f3 extends q2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f3 f13132h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ boolean f13133i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f13137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<g7> f13139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0 f13140g;

    public class a extends f3 {
        @Override // z1.f3, z1.q2
        public String e() {
            return s0.a.f11071l;
        }

        @Override // z1.f3, z1.q2
        public String g() {
            return s0.a.f11071l;
        }
    }

    public enum b {
        PROBE_WIFI("wifi"),
        PROBE_USB("usb");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13144b;

        b(String str) {
            this.f13144b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13144b;
        }
    }

    public static int o(String str) {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 36, 40, 44, 48, 149, 153, 157, 161, 165}[str.charAt(str.indexOf(" ") + 2) - 'A'];
    }

    @Override // z1.q2
    public c3 c() {
        return d3.b(k());
    }

    @Override // z1.q2
    public String d() {
        return this.f13138e;
    }

    @Override // z1.q2
    public String e() {
        return this.f13136c;
    }

    @Override // z1.q2
    public String f() {
        return this.f13134a;
    }

    @Override // z1.q2
    public String g() {
        return this.f13135b;
    }

    public List<String> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<g7> it = this.f13139f.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().e());
        }
        return arrayList;
    }

    public void i() {
        this.f13139f.clear();
        this.f13140g.c();
    }

    public z1 j() {
        return (z1) this.f13139f.get(0).c();
    }

    public o0 k() {
        return null;
    }

    public c1 l(u5 u5Var) {
        return c1.f12950d;
    }

    public i1 m() {
        return null;
    }

    public u5 n() {
        return u5.f13966a;
    }

    public int p() {
        return this.f13139f.size();
    }

    public synchronized g7 q(int i4) {
        if (i4 >= this.f13139f.size()) {
            return null;
        }
        return this.f13139f.get(i4);
    }

    public g7 r(String str) {
        for (g7 g7Var : this.f13139f) {
            if (g7Var.e().equals(str)) {
                return g7Var;
            }
        }
        return null;
    }
}
