package u;

import v.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements t.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.e f11537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f11539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11540d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11541e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11542f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11543g;

    public e(t.e eVar) {
        this.f11537a = eVar;
    }

    @Override // t.d
    public void a(v.e eVar) {
        this.f11539c = eVar instanceof h ? (h) eVar : null;
    }

    @Override // t.d
    public void b() {
        this.f11539c.f2(this.f11538b);
        int i4 = this.f11540d;
        if (i4 != -1) {
            this.f11539c.a2(i4);
            return;
        }
        int i5 = this.f11541e;
        if (i5 != -1) {
            this.f11539c.b2(i5);
        } else {
            this.f11539c.c2(this.f11542f);
        }
    }

    @Override // t.d
    public void c(Object obj) {
        this.f11543g = obj;
    }

    @Override // t.d
    public v.e d() {
        if (this.f11539c == null) {
            this.f11539c = new h();
        }
        return this.f11539c;
    }

    public void e(Object obj) {
        this.f11540d = -1;
        this.f11541e = this.f11537a.f(obj);
        this.f11542f = 0.0f;
    }

    public int f() {
        return this.f11538b;
    }

    public void g(float f4) {
        this.f11540d = -1;
        this.f11541e = -1;
        this.f11542f = f4;
    }

    @Override // t.d
    public Object getKey() {
        return this.f11543g;
    }

    public void h(int i4) {
        this.f11538b = i4;
    }

    public void i(Object obj) {
        this.f11540d = this.f11537a.f(obj);
        this.f11541e = -1;
        this.f11542f = 0.0f;
    }
}
