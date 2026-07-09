package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import c.j0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface j {

    public interface a {
        void b(@j0 e eVar, boolean z3);

        boolean c(@j0 e eVar);
    }

    int a();

    void b(e eVar, boolean z3);

    k d(ViewGroup viewGroup);

    boolean f();

    Parcelable g();

    void h(Context context, e eVar);

    void i(Parcelable parcelable);

    boolean j(e eVar, h hVar);

    boolean k(e eVar, h hVar);

    void l(a aVar);

    boolean m(m mVar);

    void n(boolean z3);
}
