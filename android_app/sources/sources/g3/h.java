package g3;

import j3.i;

/* JADX INFO: loaded from: classes.dex */
public class h extends t3.g {
    @Override // t3.g
    public p3.h c(Class<?> cls) throws Throwable {
        if (h(cls)) {
            return new i(cls);
        }
        return null;
    }

    public boolean h(Class<?> cls) {
        try {
            cls.getMethod(r2.a.f10890b, new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
