package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import c.j0;
import e.a;
import v0.c1;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f1166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.c f1167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f1168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.a f1169e;

    public f(e eVar) {
        this.f1166b = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1167c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(@j0 e eVar, boolean z3) {
        if (z3 || eVar == this.f1166b) {
            a();
        }
        j.a aVar = this.f1169e;
        if (aVar != null) {
            aVar.b(eVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(@j0 e eVar) {
        j.a aVar = this.f1169e;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(j.a aVar) {
        this.f1169e = aVar;
    }

    public void e(IBinder iBinder) {
        e eVar = this.f1166b;
        c.a aVar = new c.a(eVar.x());
        c cVar = new c(aVar.b(), a.k.f7188q);
        this.f1168d = cVar;
        cVar.l(this);
        this.f1166b.b(this.f1168d);
        aVar.c(this.f1168d.c(), this);
        View viewB = eVar.B();
        if (viewB != null) {
            aVar.f(viewB);
        } else {
            aVar.h(eVar.z()).K(eVar.A());
        }
        aVar.A(this);
        androidx.appcompat.app.c cVarA = aVar.a();
        this.f1167c = cVarA;
        cVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1167c.getWindow().getAttributes();
        attributes.type = c1.f12011f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1167c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f1166b.O((h) this.f1168d.c().getItem(i4), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1168d.b(this.f1166b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1167c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1167c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1166b.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1166b.performShortcut(i4, keyEvent, 0);
    }
}
