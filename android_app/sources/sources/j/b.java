package j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8205c;

    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        void b(b bVar);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f8204b;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f8205c;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i4);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.f8204b = obj;
    }

    public abstract void r(int i4);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z3) {
        this.f8205c = z3;
    }
}
