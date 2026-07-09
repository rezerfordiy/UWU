package z1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import z1.z1;

/* JADX INFO: loaded from: classes.dex */
public class g7 extends c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, y1> f13266b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f13267c;

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
        TRANS_K("trans_k"),
        TRANS_L("trans_l"),
        TRANS_M("trans_m"),
        TRANS_N("trans_n");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13284b;

        a(String str) {
            this.f13284b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13284b;
        }
    }

    public g7(String str, o0 o0Var, z1... z1VarArr) {
        this.f13265a = str;
        this.f13267c = o0Var;
        for (z1 z1Var : z1VarArr) {
            this.f13266b.put(z1Var.a(), z1Var);
        }
    }

    @Override // z1.c7
    public Set<String> a() {
        return this.f13266b.keySet();
    }

    @Override // z1.c7
    public y1 b() {
        String string = z1.a.BUILD_IN_PA.toString();
        for (String str : this.f13266b.keySet()) {
            if (str.endsWith(string)) {
                return this.f13266b.get(str);
            }
        }
        return null;
    }

    @Override // z1.c7
    public y1 c() {
        String str = "." + z1.a.DEFAULT.toString();
        for (String str2 : this.f13266b.keySet()) {
            if (str2.endsWith(str)) {
                return this.f13266b.get(str2);
            }
        }
        return null;
    }

    @Override // z1.c7
    public y1 d(String str) {
        return this.f13266b.get(str);
    }

    @Override // z1.c7
    public String e() {
        return this.f13265a;
    }
}
