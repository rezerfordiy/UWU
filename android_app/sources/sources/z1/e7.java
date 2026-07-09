package z1;

import java.util.List;
import z1.b0;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class e7 extends r0 {

    public enum a {
        TRANS_DEFAULT("trans_default"),
        TRANS_A("trans_a"),
        TRANS_B("trans_b"),
        TRANS_C("trans_c"),
        TRANS_D("trans_d"),
        TRANS_E("trans_e"),
        TRANS_F("trans_f"),
        TRANS_G("trans_g"),
        TRANS_H("trans_h"),
        TRANS_I("trans_i"),
        TRANS_J("trans_j"),
        TRANS_L("trans_l"),
        TRANS_M("trans_m"),
        TRANS_N("trans_n");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13104b;

        a(String str) {
            this.f13104b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13104b;
        }
    }

    public static String h(int i4) {
        return (i4 == 0 ? a.TRANS_A : i4 == 1 ? a.TRANS_B : i4 == 2 ? a.TRANS_C : i4 == 3 ? a.TRANS_D : i4 == 4 ? a.TRANS_E : i4 == 5 ? a.TRANS_F : a.TRANS_DEFAULT).toString();
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
        o0 o0VarD;
        String string;
        int iO1 = ((b0.o) c(n0.a.TRANSDUCER.toString())).o1();
        if (iO1 == 0) {
            o0VarD = d(a.TRANS_A.toString());
            if (o0VarD == null) {
                string = a.TRANS_DEFAULT.toString();
                o0VarD = d(string);
            }
        } else {
            if (iO1 == 1) {
                string = a.TRANS_B.toString();
            } else if (iO1 == 2) {
                string = a.TRANS_C.toString();
            } else if (iO1 == 3) {
                string = a.TRANS_D.toString();
            } else if (iO1 == 4) {
                string = a.TRANS_E.toString();
            } else if (iO1 == 5) {
                string = a.TRANS_F.toString();
            } else if (iO1 == 6) {
                string = a.TRANS_G.toString();
            } else if (iO1 == 7) {
                string = a.TRANS_H.toString();
            } else if (iO1 == 8) {
                string = a.TRANS_I.toString();
            } else if (iO1 == 9) {
                string = a.TRANS_J.toString();
            } else {
                o0VarD = null;
            }
            o0VarD = d(string);
        }
        return o0VarD;
    }
}
