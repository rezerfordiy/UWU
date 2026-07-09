package t;

import androidx.appcompat.widget.ActivityChooserView;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f11368i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f11369j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f11370k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f11371l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f11372m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11380h;

    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public b() {
        this.f11373a = -2;
        this.f11374b = 0;
        this.f11375c = ActivityChooserView.f.f1331h;
        this.f11376d = 1.0f;
        this.f11377e = 0;
        this.f11378f = 1.0f;
        this.f11379g = f11369j;
        this.f11380h = false;
    }

    public static b a(int i4) {
        b bVar = new b(f11368i);
        bVar.j(i4);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f11368i);
        bVar.k(obj);
        return bVar;
    }

    public static b c() {
        return new b(f11371l);
    }

    public static b d(Object obj, float f4) {
        b bVar = new b(f11372m);
        bVar.r(obj, f4);
        return bVar;
    }

    public static b e() {
        return new b(f11370k);
    }

    public static b f(int i4) {
        b bVar = new b();
        bVar.v(i4);
        return bVar;
    }

    public static b g(Object obj) {
        b bVar = new b();
        bVar.w(obj);
        return bVar;
    }

    public static b h() {
        return new b(f11369j);
    }

    public void i(e eVar, v.e eVar2, int i4) {
        e.b bVar;
        e.b bVar2;
        int i5 = 2;
        if (i4 == 0) {
            if (this.f11380h) {
                eVar2.i1(e.b.MATCH_CONSTRAINT);
                Object obj = this.f11379g;
                if (obj == f11369j) {
                    i5 = 1;
                } else if (obj != f11372m) {
                    i5 = 0;
                }
                eVar2.j1(i5, this.f11374b, this.f11375c, this.f11376d);
                return;
            }
            int i6 = this.f11374b;
            if (i6 > 0) {
                eVar2.u1(i6);
            }
            int i7 = this.f11375c;
            if (i7 < Integer.MAX_VALUE) {
                eVar2.r1(i7);
            }
            Object obj2 = this.f11379g;
            if (obj2 == f11369j) {
                bVar2 = e.b.WRAP_CONTENT;
            } else {
                if (obj2 != f11371l) {
                    if (obj2 == null) {
                        eVar2.i1(e.b.FIXED);
                        eVar2.H1(this.f11377e);
                        return;
                    }
                    return;
                }
                bVar2 = e.b.MATCH_PARENT;
            }
            eVar2.i1(bVar2);
            return;
        }
        if (this.f11380h) {
            eVar2.D1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f11379g;
            if (obj3 == f11369j) {
                i5 = 1;
            } else if (obj3 != f11372m) {
                i5 = 0;
            }
            eVar2.E1(i5, this.f11374b, this.f11375c, this.f11376d);
            return;
        }
        int i8 = this.f11374b;
        if (i8 > 0) {
            eVar2.t1(i8);
        }
        int i9 = this.f11375c;
        if (i9 < Integer.MAX_VALUE) {
            eVar2.q1(i9);
        }
        Object obj4 = this.f11379g;
        if (obj4 == f11369j) {
            bVar = e.b.WRAP_CONTENT;
        } else {
            if (obj4 != f11371l) {
                if (obj4 == null) {
                    eVar2.D1(e.b.FIXED);
                    eVar2.d1(this.f11377e);
                    return;
                }
                return;
            }
            bVar = e.b.MATCH_PARENT;
        }
        eVar2.D1(bVar);
    }

    public b j(int i4) {
        this.f11379g = null;
        this.f11377e = i4;
        return this;
    }

    public b k(Object obj) {
        this.f11379g = obj;
        if (obj instanceof Integer) {
            this.f11377e = ((Integer) obj).intValue();
            this.f11379g = null;
        }
        return this;
    }

    public float l() {
        return this.f11378f;
    }

    public int m() {
        return this.f11377e;
    }

    public b n(int i4) {
        if (this.f11375c >= 0) {
            this.f11375c = i4;
        }
        return this;
    }

    public b o(Object obj) {
        Object obj2 = f11369j;
        if (obj == obj2 && this.f11380h) {
            this.f11379g = obj2;
            this.f11375c = ActivityChooserView.f.f1331h;
        }
        return this;
    }

    public b p(int i4) {
        if (i4 >= 0) {
            this.f11374b = i4;
        }
        return this;
    }

    public b q(Object obj) {
        if (obj == f11369j) {
            this.f11374b = -2;
        }
        return this;
    }

    public b r(Object obj, float f4) {
        this.f11376d = f4;
        return this;
    }

    public b s(float f4) {
        return this;
    }

    public void t(float f4) {
        this.f11378f = f4;
    }

    public void u(int i4) {
        this.f11380h = false;
        this.f11379g = null;
        this.f11377e = i4;
    }

    public b v(int i4) {
        this.f11380h = true;
        return this;
    }

    public b w(Object obj) {
        this.f11379g = obj;
        this.f11380h = true;
        return this;
    }

    public b(Object obj) {
        this.f11373a = -2;
        this.f11374b = 0;
        this.f11375c = ActivityChooserView.f.f1331h;
        this.f11376d = 1.0f;
        this.f11377e = 0;
        this.f11378f = 1.0f;
        this.f11380h = false;
        this.f11379g = obj;
    }
}
