package g3;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a extends t3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7845b;

    public a(boolean z3) {
        this.f7845b = z3;
    }

    @Override // t3.g
    public p3.h c(Class<?> cls) throws Throwable {
        Iterator it = Arrays.asList(i(), h(), l(), j(), k()).iterator();
        while (it.hasNext()) {
            p3.h hVarG = ((t3.g) it.next()).g(cls);
            if (hVarG != null) {
                return hVarG;
            }
        }
        return null;
    }

    public b h() {
        return new b(this);
    }

    public c i() {
        return new c();
    }

    public e j() {
        return new e();
    }

    public f k() {
        return new f();
    }

    public t3.g l() {
        return this.f7845b ? new h() : new g();
    }
}
