package f3;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends r3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrintStream f7660a;

    public h(f fVar) {
        this(fVar.b());
    }

    @Override // r3.b
    public void b(r3.a aVar) {
        this.f7660a.append('E');
    }

    @Override // r3.b
    public void d(p3.c cVar) {
        this.f7660a.append('I');
    }

    @Override // r3.b
    public void e(p3.f fVar) {
        m(fVar.l());
        k(fVar);
        l(fVar);
    }

    @Override // r3.b
    public void g(p3.c cVar) {
        this.f7660a.append('.');
    }

    public String h(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    public final PrintStream i() {
        return this.f7660a;
    }

    public void j(r3.a aVar, String str) {
        i().println(str + ") " + aVar.d());
        i().print(aVar.e());
    }

    public void k(p3.f fVar) {
        PrintStream printStreamI;
        StringBuilder sb;
        String str;
        List<r3.a> listI = fVar.i();
        if (listI.size() == 0) {
            return;
        }
        int i4 = 1;
        if (listI.size() == 1) {
            printStreamI = i();
            sb = new StringBuilder();
            sb.append("There was ");
            sb.append(listI.size());
            str = " failure:";
        } else {
            printStreamI = i();
            sb = new StringBuilder();
            sb.append("There were ");
            sb.append(listI.size());
            str = " failures:";
        }
        sb.append(str);
        printStreamI.println(sb.toString());
        Iterator<r3.a> it = listI.iterator();
        while (it.hasNext()) {
            j(it.next(), s0.a.f11071l + i4);
            i4++;
        }
    }

    public void l(p3.f fVar) {
        PrintStream printStreamI;
        StringBuilder sb;
        if (fVar.m()) {
            i().println();
            i().print("OK");
            printStreamI = i();
            sb = new StringBuilder();
            sb.append(" (");
            sb.append(fVar.k());
            sb.append(" test");
            sb.append(fVar.k() == 1 ? s0.a.f11071l : "s");
            sb.append(")");
        } else {
            i().println();
            i().println("FAILURES!!!");
            printStreamI = i();
            sb = new StringBuilder();
            sb.append("Tests run: ");
            sb.append(fVar.k());
            sb.append(",  Failures: ");
            sb.append(fVar.h());
        }
        printStreamI.println(sb.toString());
        i().println();
    }

    public void m(long j4) {
        i().println();
        i().println("Time: " + h(j4));
    }

    public h(PrintStream printStream) {
        this.f7660a = printStream;
    }
}
