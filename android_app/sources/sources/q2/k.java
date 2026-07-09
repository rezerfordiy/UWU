package q2;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f10467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f10468b;

    public k(i iVar, Throwable th) {
        this.f10467a = iVar;
        this.f10468b = th;
    }

    public String a() {
        return d().getMessage();
    }

    public i b() {
        return this.f10467a;
    }

    public boolean c() {
        return d() instanceof b;
    }

    public Throwable d() {
        return this.f10468b;
    }

    public String e() {
        StringWriter stringWriter = new StringWriter();
        d().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10467a + ": " + this.f10468b.getMessage());
        return stringBuffer.toString();
    }
}
