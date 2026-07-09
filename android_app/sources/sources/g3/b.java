package g3;

/* JADX INFO: loaded from: classes.dex */
public class b extends t3.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7846c = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t3.g f7847b;

    public b(t3.g gVar) {
        this.f7847b = gVar;
    }

    @Override // t3.g
    public p3.h c(Class<?> cls) throws Exception {
        p3.g gVar = (p3.g) cls.getAnnotation(p3.g.class);
        if (gVar != null) {
            return h(gVar.value(), cls);
        }
        return null;
    }

    public p3.h h(Class<? extends p3.h> cls, Class<?> cls2) throws Exception {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getConstructor(Class.class, t3.g.class).newInstance(cls2, this.f7847b);
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new t3.d(String.format(f7846c, simpleName, simpleName));
            }
        }
    }
}
