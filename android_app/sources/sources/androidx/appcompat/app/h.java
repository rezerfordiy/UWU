package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.e0;
import c.k0;
import c.r0;
import c.y;
import e.a;
import j.b;
import v0.v;

/* JADX INFO: loaded from: classes.dex */
public class h extends Dialog implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.a f954c;

    public class a implements v.a {
        public a() {
        }

        @Override // v0.v.a
        public boolean i(KeyEvent keyEvent) {
            return h.this.d(keyEvent);
        }
    }

    public h(Context context) {
        this(context, 0);
    }

    public static int c(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.X0, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f953b == null) {
            this.f953b = e.j(this, this);
        }
        return this.f953b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public ActionBar b() {
        return a().s();
    }

    boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v.e(this.f954c, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i4) {
        return a().I(i4);
    }

    @Override // android.app.Dialog
    @k0
    public <T extends View> T findViewById(@y int i4) {
        return (T) a().n(i4);
    }

    @Override // androidx.appcompat.app.d
    @k0
    public j.b g(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        a().v();
    }

    @Override // androidx.appcompat.app.d
    public void k(j.b bVar) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().u();
        super.onCreate(bundle);
        a().z(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().F();
    }

    @Override // androidx.appcompat.app.d
    public void p(j.b bVar) {
    }

    @Override // android.app.Dialog
    public void setContentView(@e0 int i4) {
        a().K(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        a().S(getContext().getString(i4));
    }

    public h(Context context, int i4) {
        super(context, c(context, i4));
        this.f954c = new a();
        e eVarA = a();
        eVarA.R(c(context, i4));
        eVarA.z(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().S(charSequence);
    }

    public h(Context context, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z3, onCancelListener);
        this.f954c = new a();
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().M(view, layoutParams);
    }
}
