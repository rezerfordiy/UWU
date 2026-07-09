package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import c.j0;
import c.r0;
import j.b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e extends b implements e.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f8211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f8212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f8213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference<View> f8214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f8217j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z3) {
        this.f8211d = context;
        this.f8212e = actionBarContextView;
        this.f8213f = aVar;
        androidx.appcompat.view.menu.e eVarZ = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).Z(1);
        this.f8217j = eVarZ;
        eVarZ.X(this);
        this.f8216i = z3;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@j0 androidx.appcompat.view.menu.e eVar, @j0 MenuItem menuItem) {
        return this.f8213f.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@j0 androidx.appcompat.view.menu.e eVar) {
        k();
        this.f8212e.o();
    }

    @Override // j.b
    public void c() {
        if (this.f8215h) {
            return;
        }
        this.f8215h = true;
        this.f8212e.sendAccessibilityEvent(32);
        this.f8213f.b(this);
    }

    @Override // j.b
    public View d() {
        WeakReference<View> weakReference = this.f8214g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.b
    public Menu e() {
        return this.f8217j;
    }

    @Override // j.b
    public MenuInflater f() {
        return new g(this.f8212e.getContext());
    }

    @Override // j.b
    public CharSequence g() {
        return this.f8212e.getSubtitle();
    }

    @Override // j.b
    public CharSequence i() {
        return this.f8212e.getTitle();
    }

    @Override // j.b
    public void k() {
        this.f8213f.d(this, this.f8217j);
    }

    @Override // j.b
    public boolean l() {
        return this.f8212e.s();
    }

    @Override // j.b
    public boolean m() {
        return this.f8216i;
    }

    @Override // j.b
    public void n(View view) {
        this.f8212e.setCustomView(view);
        this.f8214g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.b
    public void o(int i4) {
        p(this.f8211d.getString(i4));
    }

    @Override // j.b
    public void p(CharSequence charSequence) {
        this.f8212e.setSubtitle(charSequence);
    }

    @Override // j.b
    public void r(int i4) {
        s(this.f8211d.getString(i4));
    }

    @Override // j.b
    public void s(CharSequence charSequence) {
        this.f8212e.setTitle(charSequence);
    }

    @Override // j.b
    public void t(boolean z3) {
        super.t(z3);
        this.f8212e.setTitleOptional(z3);
    }

    public void u(androidx.appcompat.view.menu.e eVar, boolean z3) {
    }

    public void v(m mVar) {
    }

    public boolean w(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return true;
        }
        new androidx.appcompat.view.menu.i(this.f8212e.getContext(), mVar).l();
        return true;
    }
}
