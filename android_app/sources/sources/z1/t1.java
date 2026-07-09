package z1;

import java.util.List;
import z1.e7;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends r0 {
    public static String h(int i4) {
        return (i4 == 0 ? e7.a.TRANS_A : i4 == 1 ? e7.a.TRANS_B : i4 == 2 ? e7.a.TRANS_C : i4 == 3 ? e7.a.TRANS_D : i4 == 4 ? e7.a.TRANS_E : i4 == 5 ? e7.a.TRANS_F : e7.a.TRANS_DEFAULT).toString();
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
    public o0 g() {
        o0 o0VarD = d(h(0));
        return o0VarD == null ? d(e7.a.TRANS_DEFAULT.toString()) : o0VarD;
    }
}
