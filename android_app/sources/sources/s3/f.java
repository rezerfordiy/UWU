package s3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import p3.h;

/* JADX INFO: loaded from: classes.dex */
public class f extends e<h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h> f11338e;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        Class<?>[] value();
    }

    public f(Class<?> cls, List<h> list) throws t3.d {
        super(cls);
        this.f11338e = list;
    }

    public static h F() {
        try {
            return new f((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (t3.d unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    public static Class<?>[] G(Class<?> cls) throws t3.d {
        a aVar = (a) cls.getAnnotation(a.class);
        if (aVar != null) {
            return aVar.value();
        }
        throw new t3.d(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
    }

    @Override // s3.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p3.c m(h hVar) {
        return hVar.a();
    }

    @Override // s3.e
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void s(h hVar, r3.c cVar) {
        hVar.b(cVar);
    }

    @Override // s3.e
    public List<h> n() {
        return this.f11338e;
    }

    public f(Class<?> cls, t3.g gVar) throws t3.d {
        this(gVar, cls, G(cls));
    }

    public f(Class<?> cls, Class<?>[] clsArr) throws t3.d {
        this(new g3.a(true), cls, clsArr);
    }

    public f(t3.g gVar, Class<?> cls, Class<?>[] clsArr) throws t3.d {
        this(cls, gVar.e(cls, clsArr));
    }

    public f(t3.g gVar, Class<?>[] clsArr) throws t3.d {
        this((Class<?>) null, gVar.e(null, clsArr));
    }
}
