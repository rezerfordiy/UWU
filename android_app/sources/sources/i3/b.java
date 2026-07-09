package i3;

import p3.e;
import p3.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.a f8200b;

    public b(e eVar, q3.a aVar) {
        this.f8199a = eVar;
        this.f8200b = aVar;
    }

    @Override // p3.e
    public h h() {
        try {
            h hVarH = this.f8199a.h();
            this.f8200b.a(hVarH);
            return hVarH;
        } catch (q3.c unused) {
            return new j3.b(q3.a.class, new Exception(String.format("No tests found matching %s from %s", this.f8200b.b(), this.f8199a.toString())));
        }
    }
}
