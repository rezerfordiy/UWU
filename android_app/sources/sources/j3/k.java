package j3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import w2.k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f8326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8327b;

    public k(Method method, j jVar) {
        this.f8326a = method;
        this.f8327b = jVar;
    }

    public boolean a() {
        return d() != null;
    }

    public List<Method> b() {
        return this.f8327b.b(w2.a.class);
    }

    public List<Method> c() {
        return this.f8327b.b(w2.e.class);
    }

    public Class<? extends Throwable> d() {
        w2.k kVar = (w2.k) this.f8326a.getAnnotation(w2.k.class);
        if (kVar == null || kVar.expected() == k.a.class) {
            return null;
        }
        return kVar.expected();
    }

    public long e() {
        w2.k kVar = (w2.k) this.f8326a.getAnnotation(w2.k.class);
        if (kVar == null) {
            return 0L;
        }
        return kVar.timeout();
    }

    public void f(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f8326a.invoke(obj, new Object[0]);
    }

    public boolean g() {
        return this.f8326a.getAnnotation(w2.i.class) != null;
    }

    public boolean h(Throwable th) {
        return !d().isAssignableFrom(th.getClass());
    }
}
