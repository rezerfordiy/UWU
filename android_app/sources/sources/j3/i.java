package j3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public class i extends e {
    public i(Class<?> cls) throws Throwable {
        super(k(cls));
    }

    public static q2.i k(Class<?> cls) throws Exception {
        try {
            Method method = cls.getMethod(r2.a.f10890b, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (q2.i) method.invoke(null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
