package androidx.lifecycle;

import android.view.View;
import c.j0;
import c.k0;
import k1.a;

/* JADX INFO: loaded from: classes.dex */
public class d0 {
    @k0
    public static b0 a(@j0 View view) {
        b0 b0Var = (b0) view.getTag(a.C0069a.f8361a);
        if (b0Var != null) {
            return b0Var;
        }
        while (true) {
            Object parent = view.getParent();
            if (b0Var != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            b0Var = (b0) view.getTag(a.C0069a.f8361a);
        }
        return b0Var;
    }

    public static void b(@j0 View view, @k0 b0 b0Var) {
        view.setTag(a.C0069a.f8361a, b0Var);
    }
}
