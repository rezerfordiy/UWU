package k3;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public Object a() throws Throwable {
        try {
            return b();
        } catch (InvocationTargetException e4) {
            throw e4.getTargetException();
        }
    }

    public abstract Object b() throws Throwable;
}
