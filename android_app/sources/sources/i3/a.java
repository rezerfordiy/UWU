package i3;

import p3.e;
import p3.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f8197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8198b;

    public a(Class<?> cls) {
        this(cls, true);
    }

    @Override // p3.e
    public h h() {
        return new g3.a(this.f8198b).g(this.f8197a);
    }

    public a(Class<?> cls, boolean z3) {
        this.f8197a = cls;
        this.f8198b = z3;
    }
}
