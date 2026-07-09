package t;

import java.util.HashMap;
import java.util.Iterator;
import u.g;
import v.f;
import v.j;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11390e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11391f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11392g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11393h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Integer f11394i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Object, t.d> f11395a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Object, t.c> f11396b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t.a f11397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11398d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11399a;

        static {
            int[] iArr = new int[EnumC0114e.values().length];
            f11399a = iArr;
            try {
                iArr[EnumC0114e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11399a[EnumC0114e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11399a[EnumC0114e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11399a[EnumC0114e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11399a[EnumC0114e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* JADX INFO: renamed from: t.e$e, reason: collision with other inner class name */
    public enum EnumC0114e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public e() {
        t.a aVar = new t.a(this);
        this.f11397c = aVar;
        this.f11398d = 0;
        this.f11395a.put(f11394i, aVar);
    }

    public void a(f fVar) {
        fVar.T1();
        this.f11397c.B().i(this, fVar, 0);
        this.f11397c.w().i(this, fVar, 1);
        for (Object obj : this.f11396b.keySet()) {
            j jVarC = this.f11396b.get(obj).c();
            if (jVarC != null) {
                t.d dVarE = this.f11395a.get(obj);
                if (dVarE == null) {
                    dVarE = e(obj);
                }
                dVarE.a(jVarC);
            }
        }
        Iterator<Object> it = this.f11395a.keySet().iterator();
        while (it.hasNext()) {
            t.d dVar = this.f11395a.get(it.next());
            if (dVar != this.f11397c) {
                v.e eVarD = dVar.d();
                eVarD.x1(null);
                if (dVar instanceof u.e) {
                    dVar.b();
                }
                fVar.a(eVarD);
            } else {
                dVar.a(fVar);
            }
        }
        Iterator<Object> it2 = this.f11396b.keySet().iterator();
        while (it2.hasNext()) {
            t.c cVar = this.f11396b.get(it2.next());
            if (cVar.c() != null) {
                Iterator<Object> it3 = cVar.f11388c.iterator();
                while (it3.hasNext()) {
                    cVar.c().a(this.f11395a.get(it3.next()).d());
                }
                cVar.b();
            }
        }
        Iterator<Object> it4 = this.f11395a.keySet().iterator();
        while (it4.hasNext()) {
            this.f11395a.get(it4.next()).b();
        }
    }

    public u.c b(Object obj, d dVar) {
        u.c cVar = (u.c) l(obj, EnumC0114e.BARRIER);
        cVar.h(dVar);
        return cVar;
    }

    public u.a c(Object... objArr) {
        u.a aVar = (u.a) l(null, EnumC0114e.ALIGN_HORIZONTALLY);
        aVar.a(objArr);
        return aVar;
    }

    public u.b d(Object... objArr) {
        u.b bVar = (u.b) l(null, EnumC0114e.ALIGN_VERTICALLY);
        bVar.a(objArr);
        return bVar;
    }

    public t.a e(Object obj) {
        t.d dVarG = this.f11395a.get(obj);
        if (dVarG == null) {
            dVarG = g(obj);
            this.f11395a.put(obj, dVarG);
            dVarG.c(obj);
        }
        if (dVarG instanceof t.a) {
            return (t.a) dVarG;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public t.a g(Object obj) {
        return new t.a(this);
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i4 = this.f11398d;
        this.f11398d = i4 + 1;
        sb.append(i4);
        sb.append("__");
        return sb.toString();
    }

    public void i() {
        for (Object obj : this.f11395a.keySet()) {
            e(obj).Q(obj);
        }
    }

    public u.e j(Object obj, int i4) {
        t.d dVar = this.f11395a.get(obj);
        Object obj2 = dVar;
        if (dVar == null) {
            u.e eVar = new u.e(this);
            eVar.h(i4);
            eVar.c(obj);
            this.f11395a.put(obj, eVar);
            obj2 = eVar;
        }
        return (u.e) obj2;
    }

    public e k(t.b bVar) {
        return r(bVar);
    }

    public t.c l(Object obj, EnumC0114e enumC0114e) {
        t.c fVar;
        if (obj == null) {
            obj = h();
        }
        t.c cVar = this.f11396b.get(obj);
        if (cVar == null) {
            int i4 = a.f11399a[enumC0114e.ordinal()];
            if (i4 == 1) {
                fVar = new u.f(this);
            } else if (i4 == 2) {
                fVar = new g(this);
            } else if (i4 == 3) {
                fVar = new u.a(this);
            } else if (i4 == 4) {
                fVar = new u.b(this);
            } else if (i4 != 5) {
                cVar = new t.c(this, enumC0114e);
                this.f11396b.put(obj, cVar);
            } else {
                fVar = new u.c(this);
            }
            cVar = fVar;
            this.f11396b.put(obj, cVar);
        }
        return cVar;
    }

    public u.f m(Object... objArr) {
        u.f fVar = (u.f) l(null, EnumC0114e.HORIZONTAL_CHAIN);
        fVar.a(objArr);
        return fVar;
    }

    public u.e n(Object obj) {
        return j(obj, 0);
    }

    public void o(Object obj, Object obj2) {
        e(obj).Q(obj2);
    }

    public t.d p(Object obj) {
        return this.f11395a.get(obj);
    }

    public void q() {
        this.f11396b.clear();
    }

    public e r(t.b bVar) {
        this.f11397c.N(bVar);
        return this;
    }

    public e s(t.b bVar) {
        this.f11397c.R(bVar);
        return this;
    }

    public g t(Object... objArr) {
        g gVar = (g) l(null, EnumC0114e.VERTICAL_CHAIN);
        gVar.a(objArr);
        return gVar;
    }

    public u.e u(Object obj) {
        return j(obj, 1);
    }

    public e v(t.b bVar) {
        return s(bVar);
    }
}
