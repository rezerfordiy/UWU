package d3;

import c3.d;
import c3.e;
import c3.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import t3.j;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<f> f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c3.c> f6750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f6751c;

    public b(List<f> list, List<c3.c> list2, j jVar) {
        this.f6750b = list2;
        this.f6749a = list;
        this.f6751c = jVar;
    }

    public static b a(Method method, j jVar) throws Exception {
        List<c3.c> listK = c3.c.k(jVar.i());
        listK.addAll(c3.c.i(method));
        return new b(new ArrayList(), listK, jVar);
    }

    public b b(f fVar) {
        ArrayList arrayList = new ArrayList(this.f6749a);
        arrayList.add(fVar);
        List<c3.c> list = this.f6750b;
        return new b(arrayList, list.subList(1, list.size()), this.f6751c);
    }

    public Object[] c(int i4, int i5, boolean z3) throws f.b {
        Object[] objArr = new Object[i5 - i4];
        for (int i6 = i4; i6 < i5; i6++) {
            Object objC = this.f6749a.get(i6).c();
            if (objC == null && !z3) {
                throw new f.b();
            }
            objArr[i6 - i4] = objC;
        }
        return objArr;
    }

    public Object[] d(boolean z3) throws f.b {
        return c(0, this.f6749a.size(), z3);
    }

    public d e(c3.c cVar) throws IllegalAccessException, InstantiationException {
        e eVar = (e) cVar.c(e.class);
        if (eVar == null) {
            return null;
        }
        return eVar.value().newInstance();
    }

    public Object[] f(boolean z3) throws f.b {
        int size = this.f6749a.size();
        Object[] objArr = new Object[size];
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = this.f6749a.get(i4).b();
        }
        return objArr;
    }

    public Object[] g(boolean z3) throws f.b {
        return c(0, h(), z3);
    }

    public final int h() {
        return c3.c.k(this.f6751c.i()).size();
    }

    public Object[] i(boolean z3) throws f.b {
        return c(h(), this.f6749a.size(), z3);
    }

    public d j(c3.c cVar) throws IllegalAccessException, InstantiationException {
        d dVarE = e(cVar);
        return dVarE != null ? dVarE : new a(this.f6751c);
    }

    public boolean k() {
        return this.f6750b.size() == 0;
    }

    public c3.c l() {
        return this.f6750b.get(0);
    }

    public List<f> m() throws IllegalAccessException, InstantiationException {
        c3.c cVarL = l();
        return j(cVarL).a(cVarL);
    }
}
