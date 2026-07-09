package s2;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;
import q2.i;
import q2.k;
import q2.l;
import q2.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrintStream f11316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11317b = 0;

    public a(PrintStream printStream) {
        this.f11316a = printStream;
    }

    @Override // q2.l
    public void a(i iVar) {
        f().print(".");
        int i4 = this.f11317b;
        this.f11317b = i4 + 1;
        if (i4 >= 40) {
            f().println();
            this.f11317b = 0;
        }
    }

    @Override // q2.l
    public void b(i iVar, Throwable th) {
        f().print("E");
    }

    @Override // q2.l
    public void c(i iVar) {
    }

    @Override // q2.l
    public void d(i iVar, q2.b bVar) {
        f().print("F");
    }

    public String e(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    public PrintStream f() {
        return this.f11316a;
    }

    public synchronized void g(m mVar, long j4) {
        o(j4);
        l(mVar);
        m(mVar);
        n(mVar);
    }

    public void h(k kVar, int i4) {
        i(kVar, i4);
        j(kVar);
    }

    public void i(k kVar, int i4) {
        f().print(i4 + ") " + kVar.b());
    }

    public void j(k kVar) {
        f().print(r2.a.i(kVar.e()));
    }

    public void k(Enumeration<k> enumeration, int i4, String str) {
        StringBuilder sb;
        String str2;
        if (i4 == 0) {
            return;
        }
        PrintStream printStreamF = f();
        if (i4 == 1) {
            sb = new StringBuilder();
            sb.append("There was ");
            sb.append(i4);
            sb.append(" ");
            sb.append(str);
            str2 = ":";
        } else {
            sb = new StringBuilder();
            sb.append("There were ");
            sb.append(i4);
            sb.append(" ");
            sb.append(str);
            str2 = "s:";
        }
        sb.append(str2);
        printStreamF.println(sb.toString());
        int i5 = 1;
        while (enumeration.hasMoreElements()) {
            h(enumeration.nextElement(), i5);
            i5++;
        }
    }

    public void l(m mVar) {
        k(mVar.g(), mVar.f(), "error");
    }

    public void m(m mVar) {
        k(mVar.i(), mVar.h(), "failure");
    }

    public void n(m mVar) {
        PrintStream printStreamF;
        StringBuilder sb;
        if (mVar.q()) {
            f().println();
            f().print("OK");
            printStreamF = f();
            sb = new StringBuilder();
            sb.append(" (");
            sb.append(mVar.l());
            sb.append(" test");
            sb.append(mVar.l() == 1 ? s0.a.f11071l : "s");
            sb.append(")");
        } else {
            f().println();
            f().println("FAILURES!!!");
            printStreamF = f();
            sb = new StringBuilder();
            sb.append("Tests run: ");
            sb.append(mVar.l());
            sb.append(",  Failures: ");
            sb.append(mVar.h());
            sb.append(",  Errors: ");
            sb.append(mVar.f());
        }
        printStreamF.println(sb.toString());
        f().println();
    }

    public void o(long j4) {
        f().println();
        f().println("Time: " + e(j4));
    }

    public void p() {
        f().println();
        f().println("<RETURN> to continue");
    }
}
