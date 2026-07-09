package v0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11983d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f11985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0121b f11986c;

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void c(boolean z3);
    }

    /* JADX INFO: renamed from: v0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0121b {
        void onActionProviderVisibilityChanged(boolean z3);
    }

    public b(Context context) {
        this.f11984a = context;
    }

    public Context a() {
        return this.f11984a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f11986c == null || !h()) {
            return;
        }
        this.f11986c.onActionProviderVisibilityChanged(c());
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f11986c = null;
        this.f11985b = null;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void k(a aVar) {
        this.f11985b = aVar;
    }

    public void l(InterfaceC0121b interfaceC0121b) {
        if (this.f11986c != null && interfaceC0121b != null) {
            Log.w(f11983d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f11986c = interfaceC0121b;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z3) {
        a aVar = this.f11985b;
        if (aVar != null) {
            aVar.c(z3);
        }
    }
}
