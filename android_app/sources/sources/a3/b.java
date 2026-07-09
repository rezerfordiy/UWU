package a3;

import f3.h;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import p3.d;
import p3.e;
import p3.f;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f516a;

    public b(List<r3.a> list) {
        this(new a(list).a());
    }

    public static b b(Class<?> cls) {
        return c(e.a(cls));
    }

    public static b c(e eVar) {
        return new b(new d().g(eVar));
    }

    public int a() {
        return this.f516a.i().size();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new h(new PrintStream(byteArrayOutputStream)).e(this.f516a);
        return byteArrayOutputStream.toString();
    }

    public b(f fVar) {
        this.f516a = fVar;
    }
}
