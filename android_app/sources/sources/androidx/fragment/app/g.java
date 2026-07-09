package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import c.j0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.i<ClassLoader, p.i<String, Class<?>>> f3909a = new p.i<>();

    public static boolean b(@j0 ClassLoader classLoader, @j0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @j0
    public static Class<?> c(@j0 ClassLoader classLoader, @j0 String str) throws ClassNotFoundException {
        p.i<ClassLoader, p.i<String, Class<?>>> iVar = f3909a;
        p.i<String, Class<?>> iVar2 = iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new p.i<>();
            iVar.put(classLoader, iVar2);
        }
        Class<?> cls = iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    @j0
    public static Class<? extends Fragment> d(@j0 ClassLoader classLoader, @j0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        } catch (ClassNotFoundException e5) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists", e5);
        }
    }

    @j0
    public Fragment a(@j0 ClassLoader classLoader, @j0 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e4) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }
}
