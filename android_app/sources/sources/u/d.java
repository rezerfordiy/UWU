package u;

import t.e;

/* JADX INFO: loaded from: classes.dex */
public class d extends t.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.b f11536f;

    public d(t.e eVar, e.EnumC0114e enumC0114e) {
        super(eVar, enumC0114e);
        this.f11535e = 0.5f;
        this.f11536f = e.b.SPREAD;
    }

    public void f(float f4) {
        this.f11535e = f4;
    }

    public float g() {
        return this.f11535e;
    }

    public e.b h() {
        return e.b.SPREAD;
    }

    public void i(e.b bVar) {
        this.f11536f = bVar;
    }
}
