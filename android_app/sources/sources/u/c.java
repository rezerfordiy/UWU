package u;

import t.e;
import v.j;

/* JADX INFO: loaded from: classes.dex */
public class c extends t.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.d f11531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v.a f11533g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11534a;

        static {
            int[] iArr = new int[e.d.values().length];
            f11534a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11534a[e.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11534a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11534a[e.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11534a[e.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11534a[e.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(t.e eVar) {
        super(eVar, e.EnumC0114e.BARRIER);
    }

    @Override // t.c
    public void b() {
        c();
        int i4 = 0;
        switch (a.f11534a[this.f11531e.ordinal()]) {
            case 3:
            case 4:
                i4 = 1;
                break;
            case 5:
                i4 = 2;
                break;
            case 6:
                i4 = 3;
                break;
        }
        this.f11533g.X1(i4);
        this.f11533g.Y1(this.f11532f);
    }

    @Override // t.c
    public j c() {
        if (this.f11533g == null) {
            this.f11533g = new v.a();
        }
        return this.f11533g;
    }

    public void f(int i4) {
        this.f11532f = i4;
    }

    public void g(Object obj) {
        f(this.f11386a.f(obj));
    }

    public void h(e.d dVar) {
        this.f11531e = dVar;
    }
}
