package androidx.lifecycle;

import androidx.lifecycle.i;
import c.k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f4127c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4128d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4129e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4130f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f4131a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f4132b = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<i.b, List<b>> f4133a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, i.b> f4134b;

        public a(Map<b, i.b> map) {
            this.f4134b = map;
            for (Map.Entry<b, i.b> entry : map.entrySet()) {
                i.b value = entry.getValue();
                List<b> arrayList = this.f4133a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f4133a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<b> list, l lVar, i.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(lVar, bVar, obj);
                }
            }
        }

        public void a(l lVar, i.b bVar, Object obj) {
            b(this.f4133a.get(bVar), lVar, bVar, obj);
            b(this.f4133a.get(i.b.ON_ANY), lVar, bVar, obj);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f4136b;

        public b(int i4, Method method) {
            this.f4135a = i4;
            this.f4136b = method;
            method.setAccessible(true);
        }

        public void a(l lVar, i.b bVar, Object obj) {
            try {
                int i4 = this.f4135a;
                if (i4 == 0) {
                    this.f4136b.invoke(obj, new Object[0]);
                } else if (i4 == 1) {
                    this.f4136b.invoke(obj, lVar);
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    this.f4136b.invoke(obj, lVar, bVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4135a == bVar.f4135a && this.f4136b.getName().equals(bVar.f4136b.getName());
        }

        public int hashCode() {
            return (this.f4135a * 31) + this.f4136b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, @k0 Method[] methodArr) {
        int i4;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f4134b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, i.b> entry : c(cls2).f4134b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(l.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                i.b bVarValue = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(i.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != i.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i4, method), bVarValue, cls);
                z3 = true;
            }
        }
        a aVar = new a(map);
        this.f4131a.put(cls, aVar);
        this.f4132b.put(cls, Boolean.valueOf(z3));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f4131a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f4132b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((s) method.getAnnotation(s.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f4132b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, i.b> map, b bVar, i.b bVar2, Class<?> cls) {
        i.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4136b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }
}
