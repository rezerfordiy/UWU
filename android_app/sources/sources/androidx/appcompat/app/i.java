package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import c.j0;
import c.k0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.fragment.app.c {
    @Override // androidx.fragment.app.c
    @j0
    public Dialog P2(@k0 Bundle bundle) {
        return new h(u(), N2());
    }

    @Override // androidx.fragment.app.c
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void X2(@j0 Dialog dialog, int i4) {
        if (!(dialog instanceof h)) {
            super.X2(dialog, i4);
            return;
        }
        h hVar = (h) dialog;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        hVar.e(1);
    }
}
