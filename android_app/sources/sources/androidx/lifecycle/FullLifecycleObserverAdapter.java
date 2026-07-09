package androidx.lifecycle;

import androidx.lifecycle.i;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f4085b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4086a;

        static {
            int[] iArr = new int[i.b.values().length];
            f4086a = iArr;
            try {
                iArr[i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4086a[i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4086a[i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4086a[i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4086a[i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4086a[i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4086a[i.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(e eVar, j jVar) {
        this.f4084a = eVar;
        this.f4085b = jVar;
    }

    @Override // androidx.lifecycle.j
    public void d(@j0 l lVar, @j0 i.b bVar) {
        switch (a.f4086a[bVar.ordinal()]) {
            case 1:
                this.f4084a.c(lVar);
                break;
            case 2:
                this.f4084a.g(lVar);
                break;
            case 3:
                this.f4084a.a(lVar);
                break;
            case 4:
                this.f4084a.e(lVar);
                break;
            case 5:
                this.f4084a.f(lVar);
                break;
            case 6:
                this.f4084a.b(lVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.f4085b;
        if (jVar != null) {
            jVar.d(lVar, bVar);
        }
    }
}
