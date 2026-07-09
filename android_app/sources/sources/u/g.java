package u;

import java.util.Iterator;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f11551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f11552j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11553a;

        static {
            int[] iArr = new int[e.b.values().length];
            f11553a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11553a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11553a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(t.e eVar) {
        super(eVar, e.EnumC0114e.VERTICAL_CHAIN);
    }

    @Override // t.c
    public void b() {
        Iterator<Object> it = this.f11388c.iterator();
        while (it.hasNext()) {
            this.f11386a.e(it.next()).p();
        }
        Iterator<Object> it2 = this.f11388c.iterator();
        t.a aVar = null;
        t.a aVar2 = null;
        while (it2.hasNext()) {
            t.a aVarE = this.f11386a.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.f11549g;
                if (obj == null) {
                    Object obj2 = this.f11550h;
                    if (obj2 != null) {
                        aVarE.W(obj2);
                        aVar2 = aVarE;
                    } else {
                        obj = t.e.f11394i;
                        aVarE.X(obj);
                        aVar2 = aVarE;
                    }
                } else {
                    aVarE.X(obj);
                    aVar2 = aVarE;
                }
            }
            if (aVar != null) {
                aVar.k(aVarE.getKey());
                aVarE.W(aVar.getKey());
            }
            aVar = aVarE;
        }
        if (aVar != null) {
            Object obj3 = this.f11551i;
            if (obj3 != null) {
                aVar.k(obj3);
            } else {
                Object obj4 = this.f11552j;
                if (obj4 == null) {
                    obj4 = t.e.f11394i;
                }
                aVar.j(obj4);
            }
        }
        if (aVar2 != null) {
            float f4 = this.f11535e;
            if (f4 != 0.5f) {
                aVar2.Z(f4);
            }
        }
        int i4 = a.f11553a[this.f11536f.ordinal()];
        if (i4 == 1) {
            aVar2.P(0);
        } else if (i4 == 2) {
            aVar2.P(1);
        } else {
            if (i4 != 3) {
                return;
            }
            aVar2.P(2);
        }
    }

    public void j(Object obj) {
        this.f11552j = obj;
    }

    public void k(Object obj) {
        this.f11551i = obj;
    }

    public void l(Object obj) {
        this.f11550h = obj;
    }

    public void m(Object obj) {
        this.f11549g = obj;
    }
}
