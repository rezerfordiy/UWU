package z1;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f14215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f14216c;

    public enum a {
        DEFAULT("default"),
        BUILD_IN_PA("build_in_pa");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14220b;

        a(String str) {
            this.f14220b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14220b;
        }
    }

    public z1(String str, o0 o0Var) {
        this.f14214a = str;
        this.f14215b = o0Var;
    }

    @Override // z1.y1
    public String a() {
        return this.f14214a;
    }
}
