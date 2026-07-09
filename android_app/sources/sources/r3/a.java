package r3;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f10897d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c f10898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f10899c;

    public a(p3.c cVar, Throwable th) {
        this.f10899c = th;
        this.f10898b = cVar;
    }

    public p3.c a() {
        return this.f10898b;
    }

    public Throwable b() {
        return this.f10899c;
    }

    public String c() {
        return b().getMessage();
    }

    public String d() {
        return this.f10898b.k();
    }

    public String e() {
        StringWriter stringWriter = new StringWriter();
        b().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d() + ": " + this.f10899c.getMessage());
        return stringBuffer.toString();
    }
}
