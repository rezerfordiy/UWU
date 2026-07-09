package c3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f4758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4759b;

        public a(Object obj, String str) {
            this.f4758a = obj;
            this.f4759b = str;
        }

        @Override // c3.f
        public String b() throws b {
            return this.f4759b;
        }

        @Override // c3.f
        public Object c() throws b {
            return this.f4758a;
        }

        public String toString() {
            return String.format("[%s]", this.f4758a);
        }
    }

    public static class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f4760b = 1;
    }

    public static f a(String str, Object obj) {
        return new a(obj, str);
    }

    public abstract String b() throws b;

    public abstract Object c() throws b;
}
