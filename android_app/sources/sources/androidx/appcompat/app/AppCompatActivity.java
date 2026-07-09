package androidx.appcompat.app;

import a0.p4;
import a0.t;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k1;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.savedstate.SavedStateRegistry;
import c.e0;
import c.j0;
import c.k0;
import c.v0;
import c.y;
import j.b;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements d, p4.a, a.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f828u = "androidx:appcompat";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Resources f830t;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @j0
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.R().D(bundle);
            return bundle;
        }
    }

    public class b implements a.c {
        public b() {
        }

        @Override // a.c
        public void a(@j0 Context context) {
            e eVarR = AppCompatActivity.this.R();
            eVarR.u();
            eVarR.z(AppCompatActivity.this.e().a(AppCompatActivity.f828u));
        }
    }

    public AppCompatActivity() {
        T();
    }

    private void x() {
        c0.b(getWindow().getDecorView(), this);
        d0.b(getWindow().getDecorView(), this);
        androidx.savedstate.d.b(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void O() {
        R().v();
    }

    @j0
    public e R() {
        if (this.f829s == null) {
            this.f829s = e.i(this, this);
        }
        return this.f829s;
    }

    @k0
    public ActionBar S() {
        return R().s();
    }

    public final void T() {
        e().e(f828u, new a());
        f(new b());
    }

    public void U(@j0 p4 p4Var) {
        p4Var.c(this);
    }

    public void V(int i4) {
    }

    public void W(@j0 p4 p4Var) {
    }

    @Deprecated
    public void X() {
    }

    public boolean Y() {
        Intent intentJ = j();
        if (intentJ == null) {
            return false;
        }
        if (!i0(intentJ)) {
            g0(intentJ);
            return true;
        }
        p4 p4VarF = p4.f(this);
        U(p4VarF);
        W(p4VarF);
        p4VarF.n();
        try {
            a0.b.u(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean Z(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void a0(@k0 Toolbar toolbar) {
        R().Q(toolbar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        R().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(R().h(context));
    }

    @Deprecated
    public void b0(int i4) {
    }

    @Deprecated
    public void c0(boolean z3) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBarS = S();
        if (getWindow().hasFeature(0)) {
            if (actionBarS == null || !actionBarS.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Deprecated
    public void d0(boolean z3) {
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarS = S();
        if (keyCode == 82 && actionBarS != null && actionBarS.L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Deprecated
    public void e0(boolean z3) {
    }

    @k0
    public j.b f0(@j0 b.a aVar) {
        return R().T(aVar);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@y int i4) {
        return (T) R().n(i4);
    }

    @Override // androidx.appcompat.app.d
    @k0
    public j.b g(@j0 b.a aVar) {
        return null;
    }

    public void g0(@j0 Intent intent) {
        t.g(this, intent);
    }

    @Override // android.app.Activity
    @j0
    public MenuInflater getMenuInflater() {
        return R().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f830t == null && k1.c()) {
            this.f830t = new k1(this, super.getResources());
        }
        Resources resources = this.f830t;
        return resources == null ? super.getResources() : resources;
    }

    public boolean h0(int i4) {
        return R().I(i4);
    }

    public boolean i0(@j0 Intent intent) {
        return t.h(this, intent);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        R().v();
    }

    @Override // a0.p4.a
    @k0
    public Intent j() {
        return t.a(this);
    }

    @Override // androidx.appcompat.app.d
    @c.i
    public void k(@j0 j.b bVar) {
    }

    @Override // androidx.appcompat.app.a.c
    @k0
    public a.b m() {
        return R().p();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@j0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f830t != null) {
            this.f830t.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        R().y(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        X();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        R().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (Z(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, @j0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        ActionBar actionBarS = S();
        if (menuItem.getItemId() != 16908332 || actionBarS == null || (actionBarS.p() & 4) == 0) {
            return false;
        }
        return Y();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @j0 Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@k0 Bundle bundle) {
        super.onPostCreate(bundle);
        R().B(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        R().C();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        R().E();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        R().F();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        R().S(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBarS = S();
        if (getWindow().hasFeature(0)) {
            if (actionBarS == null || !actionBarS.M()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.d
    @c.i
    public void p(@j0 j.b bVar) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@e0 int i4) {
        x();
        R().K(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@v0 int i4) {
        super.setTheme(i4);
        R().R(i4);
    }

    @c.o
    public AppCompatActivity(@e0 int i4) {
        super(i4);
        T();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        x();
        R().L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        R().M(view, layoutParams);
    }
}
