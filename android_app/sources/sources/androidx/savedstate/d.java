package androidx.savedstate;

import android.view.View;
import androidx.savedstate.a;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @k0
    public static c a(@j0 View view) {
        c cVar = (c) view.getTag(a.C0023a.f4214a);
        if (cVar != null) {
            return cVar;
        }
        while (true) {
            Object parent = view.getParent();
            if (cVar != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            cVar = (c) view.getTag(a.C0023a.f4214a);
        }
        return cVar;
    }

    public static void b(@j0 View view, @k0 c cVar) {
        view.setTag(a.C0023a.f4214a, cVar);
    }
}
