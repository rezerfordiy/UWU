package j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f8325a;

    public j(Class<?> cls) {
        this.f8325a = cls;
    }

    public List<Method> a() {
        return b(w2.b.class);
    }

    public List<Method> b(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = g(this.f8325a).iterator();
        while (it.hasNext()) {
            for (Method method : it.next().getDeclaredMethods()) {
                if (method.getAnnotation(cls) != null && !j(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (k(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public List<Method> c() {
        return b(w2.f.class);
    }

    public Constructor<?> d() throws NoSuchMethodException, SecurityException {
        return this.f8325a.getConstructor(new Class[0]);
    }

    public Class<?> e() {
        return this.f8325a;
    }

    public String f() {
        return this.f8325a.getName();
    }

    public final List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public List<Method> h() {
        return b(w2.k.class);
    }

    public final boolean i(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i4 = 0; i4 < method2.getParameterTypes().length; i4++) {
            if (!method2.getParameterTypes()[i4].equals(method.getParameterTypes()[i4])) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Method method, List<Method> list) {
        Iterator<Method> it = list.iterator();
        while (it.hasNext()) {
            if (i(method, it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Class<? extends Annotation> cls) {
        return cls.equals(w2.e.class) || cls.equals(w2.f.class);
    }
}
