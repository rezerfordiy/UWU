package g3;

import q2.j;

/* JADX INFO: loaded from: classes.dex */
public class e extends t3.g {
    @Override // t3.g
    public p3.h c(Class<?> cls) throws Throwable {
        if (h(cls)) {
            return new j3.e(cls);
        }
        return null;
    }

    public boolean h(Class<?> cls) {
        return j.class.isAssignableFrom(cls);
    }
}
