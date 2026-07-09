package androidx.activity.result;

import android.annotation.SuppressLint;
import c.g0;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<I> {
    @j0
    public abstract b.a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i4) {
        c(i4, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i4, @k0 a0.d dVar);

    @g0
    public abstract void d();
}
