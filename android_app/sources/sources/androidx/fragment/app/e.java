package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    @j0
    @Deprecated
    public Fragment c(@j0 Context context, @j0 String str, @k0 Bundle bundle) {
        return Fragment.m0(context, str, bundle);
    }

    @k0
    public abstract View f(@c.y int i4);

    public abstract boolean g();
}
