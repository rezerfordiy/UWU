package h3;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<T> extends t2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f8048b;

    public f() {
        this.f8048b = d(getClass());
    }

    public static Class<?> d(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (e(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    public static boolean e(Method method) {
        return method.getName().equals("matchesSafely") && method.getParameterTypes().length == 1 && !method.isSynthetic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t2.f
    public final boolean c(Object obj) {
        return obj != 0 && this.f8048b.isInstance(obj) && f(obj);
    }

    public abstract boolean f(T t4);

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> cls) {
        this.f8048b = cls;
    }
}
