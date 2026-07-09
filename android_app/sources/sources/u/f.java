package u;

import java.util.Iterator;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f11546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f11547j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11548a;

        static {
            int[] iArr = new int[e.b.values().length];
            f11548a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11548a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11548a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(t.e eVar) {
        super(eVar, e.EnumC0114e.HORIZONTAL_CHAIN);
    }

    @Override // t.c
    public void b() {
        Iterator<Object> it = this.f11388c.iterator();
        while (it.hasNext()) {
            this.f11386a.e(it.next()).o();
        }
        Iterator<Object> it2 = this.f11388c.iterator();
        t.a aVar = null;
        t.a aVar2 = null;
        while (it2.hasNext()) {
            t.a aVarE = this.f11386a.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.f11544g;
                if (obj == null) {
                    Object obj2 = this.f11545h;
                    if (obj2 != null) {
                        aVarE.T(obj2);
                        aVar2 = aVarE;
                    } else {
                        obj = t.e.f11394i;
                        aVarE.U(obj);
                        aVar2 = aVarE;
                    }
                } else {
                    aVarE.U(obj);
                    aVar2 = aVarE;
                }
            }
            if (aVar != null) {
                aVar.u(aVarE.getKey());
                aVarE.T(aVar.getKey());
            }
            aVar = aVarE;
        }
        if (aVar != null) {
            Object obj3 = this.f11546i;
            if (obj3 != null) {
                aVar.u(obj3);
            } else {
                Object obj4 = this.f11547j;
                if (obj4 == null) {
                    obj4 = t.e.f11394i;
                }
                aVar.t(obj4);
            }
        }
        if (aVar2 != null) {
            float f4 = this.f11535e;
            if (f4 != 0.5f) {
                aVar2.D(f4);
            }
        }
        int i4 = a.f11548a[this.f11536f.ordinal()];
        if (i4 == 1) {
            aVar2.O(0);
        } else if (i4 == 2) {
            aVar2.O(1);
        } else {
            if (i4 != 3) {
                return;
            }
            aVar2.O(2);
        }
    }

    public void j(Object obj) {
        this.f11547j = obj;
    }

    public void k(Object obj) {
        this.f11546i = obj;
    }

    public void l(Object obj) {
        this.f11545h = obj;
    }

    public void m(Object obj) {
        this.f11544g = obj;
    }
}
