package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f12363g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f12364h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12366b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12368d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<v.e> f12365a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12367c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f12369e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12370f = -1;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<v.e> f12371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12377g;

        public a(v.e eVar, s.e eVar2, int i4) {
            this.f12371a = new WeakReference<>(eVar);
            this.f12372b = eVar2.O(eVar.J);
            this.f12373c = eVar2.O(eVar.K);
            this.f12374d = eVar2.O(eVar.L);
            this.f12375e = eVar2.O(eVar.M);
            this.f12376f = eVar2.O(eVar.N);
            this.f12377g = i4;
        }

        public void a() {
            v.e eVar = this.f12371a.get();
            if (eVar != null) {
                eVar.U0(this.f12372b, this.f12373c, this.f12374d, this.f12375e, this.f12376f, this.f12377g);
            }
        }
    }

    public o(int i4) {
        int i5 = f12364h;
        f12364h = i5 + 1;
        this.f12366b = i5;
        this.f12368d = i4;
    }

    public boolean a(v.e eVar) {
        if (this.f12365a.contains(eVar)) {
            return false;
        }
        this.f12365a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f12369e != null && this.f12367c) {
            for (int i4 = 0; i4 < this.f12369e.size(); i4++) {
                this.f12369e.get(i4).a();
            }
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f12365a.size();
        if (this.f12370f != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o oVar = arrayList.get(i4);
                if (this.f12370f == oVar.f12366b) {
                    m(this.f12368d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f12365a.clear();
    }

    public final boolean e(v.e eVar) {
        return this.f12365a.contains(eVar);
    }

    public int f() {
        return this.f12366b;
    }

    public int g() {
        return this.f12368d;
    }

    public final String h() {
        int i4 = this.f12368d;
        return i4 == 0 ? "Horizontal" : i4 == 1 ? "Vertical" : i4 == 2 ? "Both" : "Unknown";
    }

    public boolean i(o oVar) {
        for (int i4 = 0; i4 < this.f12365a.size(); i4++) {
            if (oVar.e(this.f12365a.get(i4))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f12367c;
    }

    public final int k(int i4, v.e eVar) {
        e.b bVarZ = eVar.z(i4);
        if (bVarZ == e.b.WRAP_CONTENT || bVarZ == e.b.MATCH_PARENT || bVarZ == e.b.FIXED) {
            return i4 == 0 ? eVar.j0() : eVar.D();
        }
        return -1;
    }

    public int l(s.e eVar, int i4) {
        if (this.f12365a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f12365a, i4);
    }

    public void m(int i4, o oVar) {
        for (v.e eVar : this.f12365a) {
            oVar.a(eVar);
            int iF = oVar.f();
            if (i4 == 0) {
                eVar.K0 = iF;
            } else {
                eVar.L0 = iF;
            }
        }
        this.f12370f = oVar.f12366b;
    }

    public void n(boolean z3) {
        this.f12367c = z3;
    }

    public void o(int i4) {
        this.f12368d = i4;
    }

    public int p() {
        return this.f12365a.size();
    }

    public final int q(s.e eVar, ArrayList<v.e> arrayList, int i4) {
        int iO;
        v.d dVar;
        v.f fVar = (v.f) arrayList.get(0).U();
        eVar.Y();
        fVar.g(eVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            arrayList.get(i5).g(eVar, false);
        }
        if (i4 == 0 && fVar.f11865z1 > 0) {
            v.b.b(fVar, eVar, arrayList, 0);
        }
        if (i4 == 1 && fVar.A1 > 0) {
            v.b.b(fVar, eVar, arrayList, 1);
        }
        try {
            eVar.T();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f12369e = new ArrayList<>();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f12369e.add(new a(arrayList.get(i6), eVar, i4));
        }
        if (i4 == 0) {
            iO = eVar.O(fVar.J);
            dVar = fVar.L;
        } else {
            iO = eVar.O(fVar.K);
            dVar = fVar.M;
        }
        int iO2 = eVar.O(dVar);
        eVar.Y();
        return iO2 - iO;
    }

    public String toString() {
        String str = h() + " [" + this.f12366b + "] <";
        Iterator<v.e> it = this.f12365a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}
