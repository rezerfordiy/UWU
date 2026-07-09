package q2;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void A(Object obj, Object obj2) {
        B(null, obj, obj2);
    }

    public static void B(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            M(str);
        }
    }

    public static void C(Object obj) {
        D("Expected: <null> but was: " + String.valueOf(obj), obj);
    }

    public static void D(String str, Object obj) {
        G(str, obj == null);
    }

    public static void E(Object obj, Object obj2) {
        F(null, obj, obj2);
    }

    public static void F(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        L(str, obj, obj2);
    }

    public static void G(String str, boolean z3) {
        if (z3) {
            return;
        }
        J(str);
    }

    public static void H(boolean z3) {
        G(null, z3);
    }

    public static void I() {
        J(null);
    }

    public static void J(String str) {
        if (str != null) {
            throw new b(str);
        }
        throw new b();
    }

    public static void K(String str, Object obj, Object obj2) {
        J(N(str, obj, obj2));
    }

    public static void L(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = s0.a.f11071l;
        }
        J(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void M(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = s0.a.f11071l;
        }
        J(str2 + "expected not same");
    }

    public static String N(String str, Object obj, Object obj2) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = s0.a.f11071l;
        } else {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }

    public static void a(byte b4, byte b5) {
        j(null, b4, b5);
    }

    public static void d(char c4, char c5) {
        k(null, c4, c5);
    }

    public static void e(double d4, double d5, double d6) {
        l(null, d4, d5, d6);
    }

    public static void f(float f4, float f5, float f6) {
        m(null, f4, f5, f6);
    }

    public static void g(int i4, int i5) {
        n(null, i4, i5);
    }

    public static void h(long j4, long j5) {
        o(null, j4, j5);
    }

    public static void i(Object obj, Object obj2) {
        p(null, obj, obj2);
    }

    public static void j(String str, byte b4, byte b5) {
        p(str, new Byte(b4), new Byte(b5));
    }

    public static void k(String str, char c4, char c5) {
        p(str, new Character(c4), new Character(c5));
    }

    public static void l(String str, double d4, double d5, double d6) {
        if (Double.compare(d4, d5) != 0 && Math.abs(d4 - d5) > d6) {
            K(str, new Double(d4), new Double(d5));
        }
    }

    public static void m(String str, float f4, float f5, float f6) {
        if (Float.compare(f4, f5) != 0 && Math.abs(f4 - f5) > f6) {
            K(str, new Float(f4), new Float(f5));
        }
    }

    public static void n(String str, int i4, int i5) {
        p(str, new Integer(i4), new Integer(i5));
    }

    public static void o(String str, long j4, long j5) {
        p(str, new Long(j4), new Long(j5));
    }

    public static void p(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            K(str, obj, obj2);
        }
    }

    public static void q(String str, String str2) {
        r(null, str, str2);
    }

    public static void r(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 == null || !str2.equals(str3)) {
            if (str == null) {
                str = s0.a.f11071l;
            }
            throw new d(str, str2, str3);
        }
    }

    public static void s(String str, short s4, short s5) {
        p(str, new Short(s4), new Short(s5));
    }

    public static void t(String str, boolean z3, boolean z4) {
        p(str, Boolean.valueOf(z3), Boolean.valueOf(z4));
    }

    public static void u(short s4, short s5) {
        s(null, s4, s5);
    }

    public static void v(boolean z3, boolean z4) {
        t(null, z3, z4);
    }

    public static void w(String str, boolean z3) {
        G(str, !z3);
    }

    public static void x(boolean z3) {
        w(null, z3);
    }

    public static void y(Object obj) {
        z(null, obj);
    }

    public static void z(String str, Object obj) {
        G(str, obj != null);
    }
}
