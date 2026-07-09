package x1;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static EnumC0126b f12641a = EnumC0126b.Unknown;

        public static EnumC0126b a() {
            return f12641a;
        }

        public static void b(EnumC0126b enumC0126b) {
            f12641a = enumC0126b;
        }
    }

    /* JADX INFO: renamed from: x1.b$b, reason: collision with other inner class name */
    public enum EnumC0126b {
        Unknown,
        UpdateGeomagneticFieldSize,
        CalibrateInside,
        CalibrateOutside,
        Ready;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f12647g = 32;

        public static EnumC0126b b(int i4) {
            return values()[i4];
        }

        public int c() {
            return ordinal();
        }
    }
}
