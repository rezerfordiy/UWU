package z1;

import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class i4 extends p0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f13336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f13338o;

    public static i4 f3(boolean z3, boolean z4) {
        i4 i4Var = new i4();
        i4Var.f13821e = n0.d.PROBE_SN.toString();
        i4Var.f13819c = z3;
        i4Var.f13818b = z4;
        i4Var.f13338o = (byte) 0;
        i4Var.f13337n = s0.a.f11071l;
        return i4Var;
    }

    public String d3() {
        return this.f13337n;
    }

    public byte e3() {
        return this.f13338o;
    }

    public void g3(String str) {
        h3(str, (byte) 0);
    }

    public void h3(String str, byte b4) {
        q qVar;
        this.f13337n = str;
        this.f13338o = b4;
        if (str.isEmpty()) {
            return;
        }
        H0();
        if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
            return;
        }
        qVar.d(this);
    }
}
