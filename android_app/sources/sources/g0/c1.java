package g0;

import android.graphics.Typeface;
import c.r0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@c.o0(28)
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class c1 extends b1 {
    public static final String B = "createFromFamiliesWithDefault";
    public static final int C = -1;
    public static final String D = "sans-serif";

    @Override // g0.b1
    public Typeface l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f7754m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f7760s.invoke(null, objNewInstance, D, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // g0.b1
    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
