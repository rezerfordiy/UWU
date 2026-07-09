package u;

import java.util.Iterator;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends t.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f11525i;

    public a(t.e eVar) {
        super(eVar, e.EnumC0114e.ALIGN_VERTICALLY);
        this.f11521e = 0.5f;
    }

    @Override // t.c
    public void b() {
        Iterator<Object> it = this.f11388c.iterator();
        while (it.hasNext()) {
            t.a aVarE = this.f11386a.e(it.next());
            aVarE.o();
            Object obj = this.f11522f;
            if (obj == null) {
                Object obj2 = this.f11523g;
                if (obj2 != null) {
                    aVarE.T(obj2);
                } else {
                    obj = t.e.f11394i;
                    aVarE.U(obj);
                }
            } else {
                aVarE.U(obj);
            }
            Object obj3 = this.f11524h;
            if (obj3 != null) {
                aVarE.u(obj3);
            } else {
                Object obj4 = this.f11525i;
                if (obj4 == null) {
                    obj4 = t.e.f11394i;
                }
                aVarE.t(obj4);
            }
            float f4 = this.f11521e;
            if (f4 != 0.5f) {
                aVarE.D(f4);
            }
        }
    }

    public void f(float f4) {
        this.f11521e = f4;
    }

    public void g(Object obj) {
        this.f11525i = obj;
    }

    public void h(Object obj) {
        this.f11524h = obj;
    }

    public void i(Object obj) {
        this.f11523g = obj;
    }

    public void j(Object obj) {
        this.f11522f = obj;
    }
}
