package m;

import c.j0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class d {
    public abstract void a(@j0 Runnable runnable);

    public void b(@j0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@j0 Runnable runnable);
}
