package j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f8323a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8324b;

    public h(j jVar) {
        this.f8324b = jVar;
    }

    public void a() throws d {
        if (!this.f8323a.isEmpty()) {
            throw new d(this.f8323a);
        }
    }

    public void b() {
        f(w2.a.class, false);
        f(w2.e.class, false);
        f(w2.k.class, false);
        if (this.f8324b.b(w2.k.class).size() == 0) {
            this.f8323a.add(new Exception("No runnable methods"));
        }
    }

    public List<Throwable> c() {
        d();
        e();
        b();
        return this.f8323a;
    }

    public void d() {
        try {
            this.f8324b.d();
        } catch (Exception e4) {
            this.f8323a.add(new Exception("Test class should have public zero-argument constructor", e4));
        }
    }

    public void e() {
        f(w2.f.class, true);
        f(w2.b.class, true);
    }

    public final void f(Class<? extends Annotation> cls, boolean z3) {
        for (Method method : this.f8324b.b(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z3) {
                String str = z3 ? "should" : "should not";
                this.f8323a.add(new Exception("Method " + method.getName() + "() " + str + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.f8323a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.f8323a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.f8323a.add(new Exception("Method " + method.getName() + " should be void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.f8323a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }
}
