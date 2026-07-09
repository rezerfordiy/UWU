package s3;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.h;
import t3.i;
import t3.j;

/* JADX INFO: loaded from: classes.dex */
public class d extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<h> f11323f;

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    public class b extends s3.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<Object[]> f11325f;

        public b(Class<?> cls, List<Object[]> list, int i4) throws t3.d {
            super(cls);
            this.f11325f = list;
            this.f11324e = i4;
        }

        @Override // s3.b
        public Object F() throws Exception {
            return r().i().newInstance(g0());
        }

        @Override // s3.b
        public String S(t3.c cVar) {
            return String.format("%s[%s]", cVar.f(), Integer.valueOf(this.f11324e));
        }

        @Override // s3.b
        public void T(List<Throwable> list) {
            X(list);
        }

        public final Object[] g0() throws Exception {
            try {
                return this.f11325f.get(this.f11324e);
            } catch (ClassCastException unused) {
                throw new Exception(String.format("%s.%s() must return a Collection of arrays.", r().h(), d.this.K(r()).f()));
            }
        }

        @Override // s3.e
        public i i(r3.c cVar) {
            return h(cVar);
        }

        @Override // s3.e
        public String p() {
            return String.format("[%s]", Integer.valueOf(this.f11324e));
        }

        @Override // s3.e
        public Annotation[] q() {
            return new Annotation[0];
        }
    }

    public d(Class<?> cls) throws Throwable {
        super(cls, (List<h>) Collections.emptyList());
        this.f11323f = new ArrayList<>();
        List<Object[]> listJ = J(r());
        for (int i4 = 0; i4 < listJ.size(); i4++) {
            this.f11323f.add(new b(r().g(), listJ, i4));
        }
    }

    public final List<Object[]> J(j jVar) throws Throwable {
        return (List) K(jVar).h(null, new Object[0]);
    }

    public final t3.c K(j jVar) throws Exception {
        for (t3.c cVar : jVar.e(a.class)) {
            int modifiers = cVar.e().getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                return cVar;
            }
        }
        throw new Exception("No public static parameters method on class " + jVar.h());
    }

    @Override // s3.f, s3.e
    public List<h> n() {
        return this.f11323f;
    }
}
