package b2;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f4479n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f4480o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f4481p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f4482q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f4483r = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4484b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4485c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f4486d = new Date();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4487e = new String(s0.a.f11071l);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4488f = new String(s0.a.f11071l);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4489g = s0.a.f11071l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Date f4490h = new Date();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4491i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4492j = s0.a.f11071l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4493k = s0.a.f11071l;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4494l = s0.a.f11071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4495m = s0.a.f11071l;

    public String a() {
        return this.f4495m;
    }

    public Date b() {
        return this.f4490h;
    }

    public String c() {
        return this.f4488f;
    }

    public String d() {
        return this.f4494l;
    }

    public String e() {
        return this.f4492j;
    }

    public String f() {
        return this.f4489g;
    }

    public int g() {
        return this.f4491i;
    }

    public String getName() {
        return this.f4487e;
    }

    public String h() {
        return this.f4493k;
    }

    public void i(String str) {
        this.f4495m = str;
    }

    public void j(Date date) {
        this.f4490h = date;
    }

    public void k(String str) {
        this.f4488f = str;
    }

    public void l(String str) {
        this.f4494l = str;
    }

    public void m(String str) {
        this.f4487e = str;
    }

    public void n(String str) {
        this.f4492j = str;
    }

    public void o(String str) {
        this.f4489g = str;
    }

    public void p(int i4) {
        this.f4491i = i4;
    }

    public void q(String str) {
        this.f4491i = str.equals("M") ? 1 : 0;
    }

    public void r(String str) {
        this.f4493k = str;
    }
}
