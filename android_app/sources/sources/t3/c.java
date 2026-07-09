package t3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f11508a;

    public class a extends k3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f11509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f11510b;

        public a(Object obj, Object[] objArr) {
            this.f11509a = obj;
            this.f11510b = objArr;
        }

        @Override // k3.c
        public Object b() throws Throwable {
            return c.this.f11508a.invoke(this.f11509a, this.f11510b);
        }
    }

    public c(Method method) {
        this.f11508a = method;
    }

    @Override // t3.b
    public Annotation[] a() {
        return this.f11508a.getAnnotations();
    }

    public <T extends Annotation> T d(Class<T> cls) {
        return (T) this.f11508a.getAnnotation(cls);
    }

    public Method e() {
        return this.f11508a;
    }

    public boolean equals(Object obj) {
        if (c.class.isInstance(obj)) {
            return ((c) obj).f11508a.equals(this.f11508a);
        }
        return false;
    }

    public String f() {
        return this.f11508a.getName();
    }

    public final Class<?>[] g() {
        return this.f11508a.getParameterTypes();
    }

    public Object h(Object obj, Object... objArr) throws Throwable {
        return new a(obj, objArr).a();
    }

    public int hashCode() {
        return this.f11508a.hashCode();
    }

    @Override // t3.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(c cVar) {
        if (!cVar.f().equals(f()) || cVar.g().length != g().length) {
            return false;
        }
        for (int i4 = 0; i4 < cVar.g().length; i4++) {
            if (!cVar.g()[i4].equals(g()[i4])) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean j(Type type) {
        return g().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.f11508a.getReturnType());
    }

    public void k(List<Throwable> list) {
        new f(this.f11508a).a(list);
    }

    public void l(boolean z3, List<Throwable> list) {
        if (Modifier.isStatic(this.f11508a.getModifiers()) != z3) {
            list.add(new Exception("Method " + this.f11508a.getName() + "() " + (z3 ? "should" : "should not") + " be static"));
        }
        if (!Modifier.isPublic(this.f11508a.getDeclaringClass().getModifiers())) {
            list.add(new Exception("Class " + this.f11508a.getDeclaringClass().getName() + " should be public"));
        }
        if (!Modifier.isPublic(this.f11508a.getModifiers())) {
            list.add(new Exception("Method " + this.f11508a.getName() + "() should be public"));
        }
        if (this.f11508a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.f11508a.getName() + "() should be void"));
        }
    }

    public void m(boolean z3, List<Throwable> list) {
        l(z3, list);
        if (this.f11508a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.f11508a.getName() + " should have no parameters"));
        }
    }
}
