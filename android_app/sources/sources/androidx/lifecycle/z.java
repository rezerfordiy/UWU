package androidx.lifecycle;

import android.app.Application;
import c.g0;
import c.j0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4197c = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f4199b;

    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static a f4200c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Application f4201b;

        public a(@j0 Application application) {
            this.f4201b = application;
        }

        @j0
        public static a c(@j0 Application application) {
            if (f4200c == null) {
                f4200c = new a(application);
            }
            return f4200c;
        }

        @Override // androidx.lifecycle.z.d, androidx.lifecycle.z.b
        @j0
        public <T extends y> T a(@j0 Class<T> cls) {
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f4201b);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        }
    }

    public interface b {
        @j0
        <T extends y> T a(@j0 Class<T> cls);
    }

    public static abstract class c extends e implements b {
        @j0
        public <T extends y> T a(@j0 Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        @j0
        public abstract <T extends y> T c(@j0 String str, @j0 Class<T> cls);
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static d f4202a;

        @j0
        public static d b() {
            if (f4202a == null) {
                f4202a = new d();
            }
            return f4202a;
        }

        @Override // androidx.lifecycle.z.b
        @j0
        public <T extends y> T a(@j0 Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    public static class e {
        public void b(@j0 y yVar) {
        }
    }

    public z(@j0 a0 a0Var, @j0 b bVar) {
        this.f4198a = bVar;
        this.f4199b = a0Var;
    }

    @g0
    @j0
    public <T extends y> T a(@j0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @g0
    @j0
    public <T extends y> T b(@j0 String str, @j0 Class<T> cls) {
        T t4 = (T) this.f4199b.b(str);
        if (cls.isInstance(t4)) {
            Object obj = this.f4198a;
            if (obj instanceof e) {
                ((e) obj).b(t4);
            }
            return t4;
        }
        b bVar = this.f4198a;
        T t5 = bVar instanceof c ? (T) ((c) bVar).c(str, cls) : (T) bVar.a(cls);
        this.f4199b.d(str, t5);
        return t5;
    }

    public z(@j0 b0 b0Var) {
        this(b0Var.n(), b0Var instanceof h ? ((h) b0Var).r() : d.b());
    }

    public z(@j0 b0 b0Var, @j0 b bVar) {
        this(b0Var.n(), bVar);
    }
}
