package q2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector<i> f10477b;

    public static class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str);
            this.f10478b = str2;
        }

        @Override // q2.j
        public void S() {
            q2.a.J(this.f10478b);
        }
    }

    public n() {
        this.f10477b = new Vector<>(10);
    }

    public static i g(Class<?> cls, String str) {
        String string;
        StringBuilder sb;
        Throwable e4;
        String str2;
        Object objNewInstance;
        try {
            Constructor<?> constructorJ = j(cls);
            try {
                if (constructorJ.getParameterTypes().length == 0) {
                    objNewInstance = constructorJ.newInstance(new Object[0]);
                    if (objNewInstance instanceof j) {
                        ((j) objNewInstance).T(str);
                    }
                } else {
                    objNewInstance = constructorJ.newInstance(str);
                }
                return (i) objNewInstance;
            } catch (IllegalAccessException e5) {
                e4 = e5;
                sb = new StringBuilder();
                str2 = "Cannot access test case: ";
                sb.append(str2);
                sb.append(str);
                sb.append(" (");
                sb.append(h(e4));
                sb.append(")");
                string = sb.toString();
                return s(string);
            } catch (InstantiationException e6) {
                e4 = e6;
                sb = new StringBuilder();
                str2 = "Cannot instantiate test case: ";
                sb.append(str2);
                sb.append(str);
                sb.append(" (");
                sb.append(h(e4));
                sb.append(")");
                string = sb.toString();
                return s(string);
            } catch (InvocationTargetException e7) {
                sb = new StringBuilder();
                sb.append("Exception in constructor: ");
                sb.append(str);
                sb.append(" (");
                e4 = e7.getTargetException();
                sb.append(h(e4));
                sb.append(")");
                string = sb.toString();
                return s(string);
            }
        } catch (NoSuchMethodException unused) {
            string = "Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()";
        }
    }

    public static String h(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Constructor<?> j(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(new Class[0]);
        }
    }

    public static i s(String str) {
        return new a("warning", str);
    }

    public void a(i iVar) {
        this.f10477b.add(iVar);
    }

    @Override // q2.i
    public int b() {
        Iterator<i> it = this.f10477b.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += it.next().b();
        }
        return iB;
    }

    @Override // q2.i
    public void c(m mVar) {
        for (i iVar : this.f10477b) {
            if (mVar.n()) {
                return;
            } else {
                m(iVar, mVar);
            }
        }
    }

    public final void d(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (k(method)) {
            list.add(name);
            a(g(cls, name));
        } else if (l(method)) {
            a(s("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
        }
    }

    public void e(Class<? extends j> cls) {
        a(new n(cls));
    }

    public final void f(Class<?> cls) {
        StringBuilder sb;
        String str;
        this.f10476a = cls.getName();
        try {
            j(cls);
        } catch (NoSuchMethodException unused) {
            sb = new StringBuilder();
            sb.append("Class ");
            sb.append(cls.getName());
            str = " has no public constructor TestCase(String name) or TestCase()";
        }
        if (!Modifier.isPublic(cls.getModifiers())) {
            sb = new StringBuilder();
            sb.append("Class ");
            sb.append(cls.getName());
            str = " is not public";
            sb.append(str);
            a(s(sb.toString()));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = cls; i.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                d(method, arrayList, cls);
            }
        }
        if (this.f10477b.size() == 0) {
            a(s("No tests found in " + cls.getName()));
        }
    }

    public String i() {
        return this.f10476a;
    }

    public final boolean k(Method method) {
        return l(method) && Modifier.isPublic(method.getModifiers());
    }

    public final boolean l(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    public void m(i iVar, m mVar) {
        iVar.c(mVar);
    }

    public void n(String str) {
        this.f10476a = str;
    }

    public i o(int i4) {
        return this.f10477b.get(i4);
    }

    public final i p(Class<?> cls) {
        if (j.class.isAssignableFrom(cls)) {
            return new n(cls.asSubclass(j.class));
        }
        return s(cls.getCanonicalName() + " does not extend TestCase");
    }

    public int q() {
        return this.f10477b.size();
    }

    public Enumeration<i> r() {
        return this.f10477b.elements();
    }

    public String toString() {
        return i() != null ? i() : super.toString();
    }

    public n(Class<?> cls) {
        this.f10477b = new Vector<>(10);
        f(cls);
    }

    public n(Class<? extends j> cls, String str) {
        this(cls);
        n(str);
    }

    public n(String str) {
        this.f10477b = new Vector<>(10);
        n(str);
    }

    public n(Class<?>... clsArr) {
        this.f10477b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            a(p(cls));
        }
    }

    public n(Class<? extends j>[] clsArr, String str) {
        this(clsArr);
        n(str);
    }
}
