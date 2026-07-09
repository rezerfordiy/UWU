package s2;

import java.io.PrintStream;
import q2.i;
import q2.j;
import q2.m;
import q2.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends r2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11318g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11319h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11320i = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f11321f;

    public b() {
        this(System.out);
    }

    public static void G(String[] strArr) {
        try {
            if (!new b().N(strArr).q()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e4) {
            System.err.println(e4.getMessage());
            System.exit(2);
        }
    }

    public static m I(i iVar) {
        return new b().E(iVar);
    }

    public static void J(Class<? extends j> cls) {
        I(new n(cls));
    }

    public static void K(i iVar) {
        new b().F(iVar, true);
    }

    @Override // r2.a
    public void A(String str) {
    }

    public m D() {
        return new m();
    }

    public m E(i iVar) {
        return F(iVar, false);
    }

    public m F(i iVar, boolean z3) {
        m mVarD = D();
        mVarD.c(this.f11321f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        iVar.c(mVarD);
        this.f11321f.g(mVarD, System.currentTimeMillis() - jCurrentTimeMillis);
        H(z3);
        return mVarD;
    }

    public void H(boolean z3) {
        if (z3) {
            this.f11321f.p();
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    public m L(String str, String str2, boolean z3) throws Exception {
        return F(n.g(p(str).asSubclass(j.class), str2), z3);
    }

    public void M(a aVar) {
        this.f11321f = aVar;
    }

    public m N(String[] strArr) throws Exception {
        String strG = s0.a.f11071l;
        String strSubstring = strG;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < strArr.length) {
            if (strArr[i4].equals("-wait")) {
                z3 = true;
            } else if (strArr[i4].equals("-c")) {
                i4++;
                strG = g(strArr[i4]);
            } else if (strArr[i4].equals("-m")) {
                i4++;
                String str = strArr[i4];
                int iLastIndexOf = str.lastIndexOf(46);
                String strSubstring2 = str.substring(0, iLastIndexOf);
                strSubstring = str.substring(iLastIndexOf + 1);
                strG = strSubstring2;
            } else if (strArr[i4].equals("-v")) {
                System.err.println("JUnit " + r2.c.a() + " by Kent Beck and Erich Gamma");
            } else {
                strG = strArr[i4];
            }
            i4++;
        }
        if (strG.equals(s0.a.f11071l)) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !strSubstring.equals(s0.a.f11071l) ? L(strG, strSubstring, z3) : F(o(strG), z3);
        } catch (Exception e4) {
            throw new Exception("Could not create and run test suite: " + e4);
        }
    }

    @Override // r2.a
    public void s(String str) {
        System.err.println(str);
        System.exit(1);
    }

    @Override // r2.a
    public void y(String str) {
    }

    @Override // r2.a
    public void z(int i4, i iVar, Throwable th) {
    }

    public b(PrintStream printStream) {
        this(new a(printStream));
    }

    public b(a aVar) {
        this.f11321f = aVar;
    }
}
