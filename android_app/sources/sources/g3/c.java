package g3;

import w2.i;

/* JADX INFO: loaded from: classes.dex */
public class c extends t3.g {
    @Override // t3.g
    public p3.h c(Class<?> cls) {
        if (cls.getAnnotation(i.class) != null) {
            return new d(cls);
        }
        return null;
    }
}
