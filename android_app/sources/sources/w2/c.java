package w2;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static void A(String str, boolean z3) {
        M(str, !z3);
    }

    public static void B(boolean z3) {
        A(null, z3);
    }

    public static void C(Object obj) {
        D(null, obj);
    }

    public static void D(String str, Object obj) {
        M(str, obj != null);
    }

    public static void E(Object obj, Object obj2) {
        F(null, obj, obj2);
    }

    public static void F(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            S(str);
        }
    }

    public static void G(Object obj) {
        H(null, obj);
    }

    public static void H(String str, Object obj) {
        M(str, obj == null);
    }

    public static void I(Object obj, Object obj2) {
        J(null, obj, obj2);
    }

    public static void J(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        R(str, obj, obj2);
    }

    public static <T> void K(T t4, t2.f<T> fVar) {
        L(s0.a.f11071l, t4, fVar);
    }

    public static <T> void L(String str, T t4, t2.f<T> fVar) {
        if (fVar.c(t4)) {
            return;
        }
        t2.h hVar = new t2.h();
        hVar.a(str);
        hVar.a("\nExpected: ");
        hVar.f(fVar);
        hVar.a("\n     got: ");
        hVar.c(t4);
        hVar.a("\n");
        throw new AssertionError(hVar.toString());
    }

    public static void M(String str, boolean z3) {
        if (z3) {
            return;
        }
        P(str);
    }

    public static void N(boolean z3) {
        M(null, z3);
    }

    public static void O() {
        P(null);
    }

    public static void P(String str) {
        if (str != null) {
            throw new AssertionError(str);
        }
        throw new AssertionError();
    }

    public static void Q(String str, Object obj, Object obj2) {
        P(T(str, obj, obj2));
    }

    public static void R(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = s0.a.f11071l;
        }
        P(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void S(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = s0.a.f11071l;
        }
        P(str2 + "expected not same");
    }

    public static String T(String str, Object obj, Object obj2) {
        String str2 = s0.a.f11071l;
        if (str != null && !str.equals(s0.a.f11071l)) {
            str2 = str + " ";
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            return str2 + "expected: " + U(obj, strValueOf) + " but was: " + U(obj2, strValueOf2);
        }
        return str2 + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    public static String U(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }

    public static void V(String str, Object obj, Object obj2) throws f3.a {
        new f3.d().a(str, obj, obj2);
    }

    public static boolean W(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static void a(String str, byte[] bArr, byte[] bArr2) throws f3.a {
        V(str, bArr, bArr2);
    }

    public static void b(String str, char[] cArr, char[] cArr2) throws f3.a {
        V(str, cArr, cArr2);
    }

    public static void c(String str, double[] dArr, double[] dArr2, double d4) throws f3.a {
        new f3.e(d4).a(str, dArr, dArr2);
    }

    public static void d(String str, float[] fArr, float[] fArr2, float f4) throws f3.a {
        new f3.e(f4).a(str, fArr, fArr2);
    }

    public static void e(String str, int[] iArr, int[] iArr2) throws f3.a {
        V(str, iArr, iArr2);
    }

    public static void f(String str, long[] jArr, long[] jArr2) throws f3.a {
        V(str, jArr, jArr2);
    }

    public static void g(String str, Object[] objArr, Object[] objArr2) throws f3.a {
        V(str, objArr, objArr2);
    }

    public static void h(String str, short[] sArr, short[] sArr2) throws f3.a {
        V(str, sArr, sArr2);
    }

    public static void i(byte[] bArr, byte[] bArr2) {
        a(null, bArr, bArr2);
    }

    public static void j(char[] cArr, char[] cArr2) {
        b(null, cArr, cArr2);
    }

    public static void k(double[] dArr, double[] dArr2, double d4) {
        c(null, dArr, dArr2, d4);
    }

    public static void l(float[] fArr, float[] fArr2, float f4) {
        d(null, fArr, fArr2, f4);
    }

    public static void m(int[] iArr, int[] iArr2) {
        e(null, iArr, iArr2);
    }

    public static void n(long[] jArr, long[] jArr2) {
        f(null, jArr, jArr2);
    }

    public static void o(Object[] objArr, Object[] objArr2) {
        g(null, objArr, objArr2);
    }

    public static void p(short[] sArr, short[] sArr2) {
        h(null, sArr, sArr2);
    }

    @Deprecated
    public static void q(double d4, double d5) {
        u(null, d4, d5);
    }

    public static void r(double d4, double d5, double d6) {
        v(null, d4, d5, d6);
    }

    public static void s(long j4, long j5) {
        w(null, j4, j5);
    }

    public static void t(Object obj, Object obj2) {
        x(null, obj, obj2);
    }

    @Deprecated
    public static void u(String str, double d4, double d5) {
        P("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
    }

    public static void v(String str, double d4, double d5, double d6) {
        if (Double.compare(d4, d5) != 0 && Math.abs(d4 - d5) > d6) {
            Q(str, new Double(d4), new Double(d5));
        }
    }

    public static void w(String str, long j4, long j5) {
        x(str, Long.valueOf(j4), Long.valueOf(j5));
    }

    public static void x(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !W(obj, obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                Q(str, obj, obj2);
            } else {
                if (str == null) {
                    str = s0.a.f11071l;
                }
                throw new h(str, (String) obj, (String) obj2);
            }
        }
    }

    @Deprecated
    public static void y(String str, Object[] objArr, Object[] objArr2) {
        g(str, objArr, objArr2);
    }

    @Deprecated
    public static void z(Object[] objArr, Object[] objArr2) {
        o(objArr, objArr2);
    }
}
