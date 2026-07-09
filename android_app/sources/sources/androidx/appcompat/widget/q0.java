package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f1798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.view.menu.i f1800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f1801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f1802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnTouchListener f1803g;

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@c.j0 androidx.appcompat.view.menu.e eVar, @c.j0 MenuItem menuItem) {
            e eVar2 = q0.this.f1801e;
            if (eVar2 != null) {
                return eVar2.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@c.j0 androidx.appcompat.view.menu.e eVar) {
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            q0 q0Var = q0.this;
            d dVar = q0Var.f1802f;
            if (dVar != null) {
                dVar.a(q0Var);
            }
        }
    }

    public class c extends k0 {
        public c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.k0
        public k.f b() {
            return q0.this.f1800d.e();
        }

        @Override // androidx.appcompat.widget.k0
        public boolean c() {
            q0.this.k();
            return true;
        }

        @Override // androidx.appcompat.widget.k0
        public boolean d() {
            q0.this.a();
            return true;
        }
    }

    public interface d {
        void a(q0 q0Var);
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public q0(@c.j0 Context context, @c.j0 View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f1800d.dismiss();
    }

    @c.j0
    public View.OnTouchListener b() {
        if (this.f1803g == null) {
            this.f1803g = new c(this.f1799c);
        }
        return this.f1803g;
    }

    public int c() {
        return this.f1800d.c();
    }

    @c.j0
    public Menu d() {
        return this.f1798b;
    }

    @c.j0
    public MenuInflater e() {
        return new j.g(this.f1797a);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ListView f() {
        if (this.f1800d.f()) {
            return this.f1800d.d();
        }
        return null;
    }

    public void g(@c.h0 int i4) {
        e().inflate(i4, this.f1798b);
    }

    public void h(int i4) {
        this.f1800d.j(i4);
    }

    public void i(@c.k0 d dVar) {
        this.f1802f = dVar;
    }

    public void j(@c.k0 e eVar) {
        this.f1801e = eVar;
    }

    public void k() {
        this.f1800d.l();
    }

    public q0(@c.j0 Context context, @c.j0 View view, int i4) {
        this(context, view, i4, a.c.G2, 0);
    }

    public q0(@c.j0 Context context, @c.j0 View view, int i4, @c.f int i5, @c.v0 int i6) {
        this.f1797a = context;
        this.f1799c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f1798b = eVar;
        eVar.X(new a());
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, eVar, view, false, i5, i6);
        this.f1800d = iVar;
        iVar.j(i4);
        iVar.k(new b());
    }
}
