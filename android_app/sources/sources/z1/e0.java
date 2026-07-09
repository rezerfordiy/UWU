package z1;

import java.util.List;
import z1.b0;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f13039f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0.h f13040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f13041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f13042e;

    public enum a {
        DEFAULT("DEFAULT"),
        BUILD_IN_PA("BUILD_IN_PA");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13046b;

        a(String str) {
            this.f13046b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13046b;
        }
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ List a() {
        return super.a();
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ p0 c(String str) {
        return super.c(str);
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ o0 d(String str) {
        return super.d(str);
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ void e(p0 p0Var, String str) {
        super.e(p0Var, str);
    }

    @Override // z1.r0
    public /* bridge */ /* synthetic */ void f(o0 o0Var, String str) {
        super.f(o0Var, str);
    }

    @Override // z1.r0
    public synchronized o0 g() {
        if (((b0.h) c(n0.a.BUILD_IN_PA.toString())).S1()) {
            return d(a.BUILD_IN_PA.toString());
        }
        return d(a.DEFAULT.toString());
    }

    public e0 h(b0.h hVar, o0 o0Var, o0 o0Var2) {
        e0 e0Var = new e0();
        e0Var.f13040c = hVar;
        e0Var.f13041d = o0Var;
        e0Var.f13042e = o0Var2;
        hVar.f13827k.add(e0Var);
        return e0Var;
    }

    public o0 i() {
        b0.h hVar = this.f13040c;
        return hVar != null ? hVar.S1() : false ? this.f13042e : this.f13041d;
    }

    public o0[] j() {
        return new o0[]{this.f13041d, this.f13042e, null};
    }
}
