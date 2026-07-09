package androidx.lifecycle;

import android.view.View;
import c.j0;
import c.k0;
import j1.a;

/* JADX INFO: loaded from: classes.dex */
public class c0 {
    @k0
    public static l a(@j0 View view) {
        l lVar = (l) view.getTag(a.C0066a.f8280a);
        if (lVar != null) {
            return lVar;
        }
        while (true) {
            Object parent = view.getParent();
            if (lVar != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            lVar = (l) view.getTag(a.C0066a.f8280a);
        }
        return lVar;
    }

    public static void b(@j0 View view, @k0 l lVar) {
        view.setTag(a.C0066a.f8280a, lVar);
    }
}
