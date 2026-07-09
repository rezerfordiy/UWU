package t3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Class<?>> f11517a = new HashSet();

    public Class<?> a(Class<?> cls) throws d {
        if (this.f11517a.add(cls)) {
            return cls;
        }
        throw new d(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    public void b(Class<?> cls) {
        this.f11517a.remove(cls);
    }

    public abstract p3.h c(Class<?> cls) throws Throwable;

    public List<p3.h> d(Class<?> cls, List<Class<?>> list) throws d {
        return e(cls, (Class[]) list.toArray(new Class[0]));
    }

    public List<p3.h> e(Class<?> cls, Class<?>[] clsArr) throws d {
        a(cls);
        try {
            return f(clsArr);
        } finally {
            b(cls);
        }
    }

    public final List<p3.h> f(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            p3.h hVarG = g(cls);
            if (hVarG != null) {
                arrayList.add(hVarG);
            }
        }
        return arrayList;
    }

    public p3.h g(Class<?> cls) {
        try {
            return c(cls);
        } catch (Throwable th) {
            return new j3.b(cls, th);
        }
    }
}
