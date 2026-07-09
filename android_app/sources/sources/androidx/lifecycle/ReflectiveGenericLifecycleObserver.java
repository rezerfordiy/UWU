package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.i;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a f4113b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4112a = obj;
        this.f4113b = c.f4127c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.j
    public void d(@j0 l lVar, @j0 i.b bVar) {
        this.f4113b.a(lVar, bVar, this.f4112a);
    }
}
