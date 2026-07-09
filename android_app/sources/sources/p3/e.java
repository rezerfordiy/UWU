package p3;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f10101a;

        public a(h hVar) {
            this.f10101a = hVar;
        }

        @Override // p3.e
        public h h() {
            return this.f10101a;
        }
    }

    public static e a(Class<?> cls) {
        return new i3.a(cls);
    }

    public static e b(Class<?> cls) {
        return new i3.a(cls, false);
    }

    public static e c(p3.a aVar, Class<?>... clsArr) {
        try {
            return j(aVar.b(new g3.a(true), clsArr));
        } catch (t3.d unused) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    public static e d(Class<?>... clsArr) {
        return c(d.b(), clsArr);
    }

    @Deprecated
    public static e e(Class<?> cls, Throwable th) {
        return j(new j3.b(cls, th));
    }

    public static e i(Class<?> cls, String str) {
        return a(cls).f(c.e(cls, str));
    }

    public static e j(h hVar) {
        return new a(hVar);
    }

    public e f(c cVar) {
        return g(q3.a.d(cVar));
    }

    public e g(q3.a aVar) {
        return new i3.b(this, aVar);
    }

    public abstract h h();

    public e k(Comparator<c> comparator) {
        return new i3.c(this, comparator);
    }
}
