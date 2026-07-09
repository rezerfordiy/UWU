package t3;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import t3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> {
    public abstract Annotation[] a();

    public boolean b(List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (c(it.next())) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean c(T t4);
}
