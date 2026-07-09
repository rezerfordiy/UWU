package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import c.j0;
import c.k0;
import c.r0;
import p.i;
import v0.v;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ComponentActivity extends Activity implements l, v.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i<Class<? extends a>, a> f3336b = new i<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f3337c = new m(this);

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static class a {
    }

    @j0
    public androidx.lifecycle.i a() {
        return this.f3337c;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v.d(decorView, keyEvent)) {
            return v.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // v0.v.a
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@k0 Bundle bundle) {
        super.onCreate(bundle);
        t.g(this);
    }

    @Override // android.app.Activity
    @c.i
    public void onSaveInstanceState(@j0 Bundle bundle) {
        this.f3337c.l(i.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T s(Class<T> cls) {
        return (T) this.f3336b.get(cls);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void t(a aVar) {
        this.f3336b.put((Class<? extends a>) aVar.getClass(), aVar);
    }
}
