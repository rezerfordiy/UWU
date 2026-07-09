package y2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s3.f;
import t3.d;
import t3.g;

/* JADX INFO: loaded from: classes.dex */
public class a extends f {

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    public static class C0130a extends q3.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f12846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f12847c;

        public C0130a(Class<?> cls, Class<?> cls2) {
            this.f12846b = cls;
            this.f12847c = cls2;
        }

        public static C0130a i(Class<?> cls) {
            return new C0130a(cls, null);
        }

        @Override // q3.a
        public String b() {
            return "category " + this.f12846b;
        }

        @Override // q3.a
        public boolean e(p3.c cVar) {
            if (h(cVar)) {
                return true;
            }
            Iterator<p3.c> it = cVar.i().iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final List<Class<?>> f(p3.c cVar) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(g(cVar)));
            arrayList.addAll(Arrays.asList(g(j(cVar))));
            return arrayList;
        }

        public final Class<?>[] g(p3.c cVar) {
            if (cVar == null) {
                return new Class[0];
            }
            y2.b bVar = (y2.b) cVar.g(y2.b.class);
            return bVar == null ? new Class[0] : bVar.value();
        }

        public final boolean h(p3.c cVar) {
            List<Class<?>> listF = f(cVar);
            if (listF.isEmpty()) {
                return this.f12846b == null;
            }
            for (Class<?> cls : listF) {
                Class<?> cls2 = this.f12847c;
                if (cls2 != null && cls2.isAssignableFrom(cls)) {
                    return false;
                }
            }
            for (Class<?> cls3 : listF) {
                Class<?> cls4 = this.f12846b;
                if (cls4 == null || cls4.isAssignableFrom(cls3)) {
                    return true;
                }
            }
            return false;
        }

        public final p3.c j(p3.c cVar) {
            Class<?> clsM = cVar.m();
            if (clsM == null) {
                return null;
            }
            return p3.c.c(clsM);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        Class<?> value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<?> value();
    }

    public a(Class<?> cls, g gVar) throws d {
        super(cls, gVar);
        try {
            e(new C0130a(M(cls), L(cls)));
            I(a());
        } catch (q3.c e4) {
            throw new d(e4);
        }
    }

    public static boolean K(p3.c cVar) {
        Iterator<p3.c> it = cVar.i().iterator();
        while (it.hasNext()) {
            if (it.next().m() == null) {
                return false;
            }
        }
        return true;
    }

    public final void I(p3.c cVar) throws d {
        if (!K(cVar)) {
            J(cVar);
        }
        Iterator<p3.c> it = cVar.i().iterator();
        while (it.hasNext()) {
            I(it.next());
        }
    }

    public final void J(p3.c cVar) throws d {
        for (p3.c cVar2 : cVar.i()) {
            if (cVar2.g(y2.b.class) != null) {
                throw new d("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            J(cVar2);
        }
    }

    public final Class<?> L(Class<?> cls) {
        b bVar = (b) cls.getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return bVar.value();
    }

    public final Class<?> M(Class<?> cls) {
        c cVar = (c) cls.getAnnotation(c.class);
        if (cVar == null) {
            return null;
        }
        return cVar.value();
    }
}
