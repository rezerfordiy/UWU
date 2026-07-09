package androidx.lifecycle;

import androidx.lifecycle.i;
import c.j0;
import c.k0;
import c.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class Lifecycling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4087a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4088b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<Class<?>, Integer> f4089c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends f>>> f4090d = new HashMap();

    public static f a(Constructor<? extends f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @k0
    public static Constructor<? extends f> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : s0.a.f11071l;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + "." + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    @j0
    @Deprecated
    public static g d(Object obj) {
        final j jVarG = g(obj);
        return new g() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // androidx.lifecycle.j
            public void d(@j0 l lVar, @j0 i.b bVar) {
                jVarG.d(lVar, bVar);
            }
        };
    }

    public static int e(Class<?> cls) {
        Integer num = f4089c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iH = h(cls);
        f4089c.put(cls, Integer.valueOf(iH));
        return iH;
    }

    public static boolean f(Class<?> cls) {
        return cls != null && k.class.isAssignableFrom(cls);
    }

    @j0
    public static j g(Object obj) {
        boolean z3 = obj instanceof j;
        boolean z4 = obj instanceof e;
        if (z3 && z4) {
            return new FullLifecycleObserverAdapter((e) obj, (j) obj);
        }
        if (z4) {
            return new FullLifecycleObserverAdapter((e) obj, null);
        }
        if (z3) {
            return (j) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends f>> list = f4090d.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        f[] fVarArr = new f[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            fVarArr[i4] = a(list.get(i4), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    public static int h(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends f> constructorB = b(cls);
        if (constructorB != null) {
            f4090d.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (c.f4127c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (!f(superclass)) {
            arrayList = null;
        } else {
            if (e(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f4090d.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (f(cls2)) {
                if (e(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f4090d.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4090d.put(cls, arrayList);
        return 2;
    }
}
