package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import c.g0;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f4216b = new SavedStateRegistry();

    public b(c cVar) {
        this.f4215a = cVar;
    }

    @j0
    public static b a(@j0 c cVar) {
        return new b(cVar);
    }

    @j0
    public SavedStateRegistry b() {
        return this.f4216b;
    }

    @g0
    public void c(@k0 Bundle bundle) {
        i iVarA = this.f4215a.a();
        if (iVarA.b() != i.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        iVarA.a(new Recreator(this.f4215a));
        this.f4216b.c(iVarA, bundle);
    }

    @g0
    public void d(@j0 Bundle bundle) {
        this.f4216b.d(bundle);
    }
}
