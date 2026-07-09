package androidx.lifecycle;

import c.g0;
import c.j0;
import c.k0;
import c.r0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    @r0({r0.a.LIBRARY_GROUP})
    public AtomicReference<Object> f4146a = new AtomicReference<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4148b;

        static {
            int[] iArr = new int[b.values().length];
            f4148b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4148b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4148b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4148b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4148b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4148b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4148b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f4147a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4147a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4147a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4147a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4147a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @k0
        public static b a(@j0 c cVar) {
            int i4 = a.f4147a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_DESTROY;
            }
            if (i4 == 2) {
                return ON_STOP;
            }
            if (i4 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        @k0
        public static b b(@j0 c cVar) {
            int i4 = a.f4147a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_STOP;
            }
            if (i4 == 2) {
                return ON_PAUSE;
            }
            if (i4 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        @k0
        public static b d(@j0 c cVar) {
            int i4 = a.f4147a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_START;
            }
            if (i4 == 2) {
                return ON_RESUME;
            }
            if (i4 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        @k0
        public static b e(@j0 c cVar) {
            int i4 = a.f4147a[cVar.ordinal()];
            if (i4 == 1) {
                return ON_CREATE;
            }
            if (i4 == 2) {
                return ON_START;
            }
            if (i4 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        @j0
        public c c() {
            switch (a.f4148b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(@j0 c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    @g0
    public abstract void a(@j0 k kVar);

    @g0
    @j0
    public abstract c b();

    @g0
    public abstract void c(@j0 k kVar);
}
