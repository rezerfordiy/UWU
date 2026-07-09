package u;

import java.util.Iterator;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class b extends t.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f11530i;

    public b(t.e eVar) {
        super(eVar, e.EnumC0114e.ALIGN_VERTICALLY);
        this.f11526e = 0.5f;
    }

    @Override // t.c
    public void b() {
        Iterator<Object> it = this.f11388c.iterator();
        while (it.hasNext()) {
            t.a aVarE = this.f11386a.e(it.next());
            aVarE.p();
            Object obj = this.f11527f;
            if (obj == null) {
                Object obj2 = this.f11528g;
                if (obj2 != null) {
                    aVarE.W(obj2);
                } else {
                    obj = t.e.f11394i;
                    aVarE.X(obj);
                }
            } else {
                aVarE.X(obj);
            }
            Object obj3 = this.f11529h;
            if (obj3 != null) {
                aVarE.k(obj3);
            } else {
                Object obj4 = this.f11530i;
                if (obj4 == null) {
                    obj4 = t.e.f11394i;
                }
                aVarE.j(obj4);
            }
            float f4 = this.f11526e;
            if (f4 != 0.5f) {
                aVarE.Z(f4);
            }
        }
    }

    public void f(float f4) {
        this.f11526e = f4;
    }

    public void g(Object obj) {
        this.f11530i = obj;
    }

    public void h(Object obj) {
        this.f11529h = obj;
    }

    public void i(Object obj) {
        this.f11528g = obj;
    }

    public void j(Object obj) {
        this.f11527f = obj;
    }
}
