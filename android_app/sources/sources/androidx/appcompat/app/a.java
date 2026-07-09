package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import c.j0;
import c.k0;
import c.u0;

/* JADX INFO: loaded from: classes.dex */
public class a implements DrawerLayout.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g.d f913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f921k;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0008a implements View.OnClickListener {
        public ViewOnClickListenerC0008a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f916f) {
                aVar.v();
                return;
            }
            View.OnClickListener onClickListener = aVar.f920j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public interface b {
        void a(@u0 int i4);

        void b(Drawable drawable, @u0 int i4);

        Context c();

        boolean d();

        Drawable e();
    }

    public interface c {
        @k0
        b m();
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b.a f924b;

        public d(Activity activity) {
            this.f923a = activity;
        }

        @Override // androidx.appcompat.app.a.b
        public void a(int i4) {
            android.app.ActionBar actionBar = this.f923a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public void b(Drawable drawable, int i4) {
            android.app.ActionBar actionBar = this.f923a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context c() {
            android.app.ActionBar actionBar = this.f923a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f923a;
        }

        @Override // androidx.appcompat.app.a.b
        public boolean d() {
            android.app.ActionBar actionBar = this.f923a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable e() {
            TypedArray typedArrayObtainStyledAttributes = c().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }
    }

    public static class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Toolbar f925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f927c;

        public e(Toolbar toolbar) {
            this.f925a = toolbar;
            this.f926b = toolbar.getNavigationIcon();
            this.f927c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.a.b
        public void a(@u0 int i4) {
            if (i4 == 0) {
                this.f925a.setNavigationContentDescription(this.f927c);
            } else {
                this.f925a.setNavigationContentDescription(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public void b(Drawable drawable, @u0 int i4) {
            this.f925a.setNavigationIcon(drawable);
            a(i4);
        }

        @Override // androidx.appcompat.app.a.b
        public Context c() {
            return this.f925a.getContext();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean d() {
            return true;
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable e() {
            return this.f926b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, g.d dVar, @u0 int i4, @u0 int i5) {
        this.f914d = true;
        this.f916f = true;
        this.f921k = false;
        if (toolbar != null) {
            this.f911a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0008a());
        } else if (activity instanceof c) {
            this.f911a = ((c) activity).m();
        } else {
            this.f911a = new d(activity);
        }
        this.f912b = drawerLayout;
        this.f918h = i4;
        this.f919i = i5;
        if (dVar == null) {
            this.f913c = new g.d(this.f911a.c());
        } else {
            this.f913c = dVar;
        }
        this.f915e = f();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(int i4) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        s(1.0f);
        if (this.f916f) {
            l(this.f919i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(View view, float f4) {
        if (this.f914d) {
            s(Math.min(1.0f, Math.max(0.0f, f4)));
        } else {
            s(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view) {
        s(0.0f);
        if (this.f916f) {
            l(this.f918h);
        }
    }

    @j0
    public g.d e() {
        return this.f913c;
    }

    public Drawable f() {
        return this.f911a.e();
    }

    public View.OnClickListener g() {
        return this.f920j;
    }

    public boolean h() {
        return this.f916f;
    }

    public boolean i() {
        return this.f914d;
    }

    public void j(Configuration configuration) {
        if (!this.f917g) {
            this.f915e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f916f) {
            return false;
        }
        v();
        return true;
    }

    public void l(int i4) {
        this.f911a.a(i4);
    }

    public void m(Drawable drawable, int i4) {
        if (!this.f921k && !this.f911a.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f921k = true;
        }
        this.f911a.b(drawable, i4);
    }

    public void n(@j0 g.d dVar) {
        this.f913c = dVar;
        u();
    }

    public void o(boolean z3) {
        Drawable drawable;
        int i4;
        if (z3 != this.f916f) {
            if (z3) {
                drawable = this.f913c;
                i4 = this.f912b.C(8388611) ? this.f919i : this.f918h;
            } else {
                drawable = this.f915e;
                i4 = 0;
            }
            m(drawable, i4);
            this.f916f = z3;
        }
    }

    public void p(boolean z3) {
        this.f914d = z3;
        if (z3) {
            return;
        }
        s(0.0f);
    }

    public void q(int i4) {
        r(i4 != 0 ? this.f912b.getResources().getDrawable(i4) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f915e = f();
            this.f917g = false;
        } else {
            this.f915e = drawable;
            this.f917g = true;
        }
        if (this.f916f) {
            return;
        }
        m(this.f915e, 0);
    }

    public final void s(float f4) {
        g.d dVar;
        boolean z3;
        if (f4 != 1.0f) {
            if (f4 == 0.0f) {
                dVar = this.f913c;
                z3 = false;
            }
            this.f913c.s(f4);
        }
        dVar = this.f913c;
        z3 = true;
        dVar.u(z3);
        this.f913c.s(f4);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f920j = onClickListener;
    }

    public void u() {
        s(this.f912b.C(8388611) ? 1.0f : 0.0f);
        if (this.f916f) {
            m(this.f913c, this.f912b.C(8388611) ? this.f919i : this.f918h);
        }
    }

    public void v() {
        int iQ = this.f912b.q(8388611);
        if (this.f912b.F(8388611) && iQ != 2) {
            this.f912b.d(8388611);
        } else if (iQ != 1) {
            this.f912b.K(8388611);
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @u0 int i4, @u0 int i5) {
        this(activity, null, drawerLayout, null, i4, i5);
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @u0 int i4, @u0 int i5) {
        this(activity, toolbar, drawerLayout, null, i4, i5);
    }
}
