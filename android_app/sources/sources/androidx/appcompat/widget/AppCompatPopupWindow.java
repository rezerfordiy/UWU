package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import e.a;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1364b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1365a;

    public AppCompatPopupWindow(@c.j0 Context context, @c.k0 AttributeSet attributeSet, @c.f int i4) {
        super(context, attributeSet, i4);
        a(context, attributeSet, i4, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        e1 e1VarG = e1.G(context, attributeSet, a.n.U5, i4, i5);
        int i6 = a.n.X5;
        if (e1VarG.C(i6)) {
            b(e1VarG.a(i6, false));
        }
        setBackgroundDrawable(e1VarG.h(a.n.V5));
        e1VarG.I();
    }

    public final void b(boolean z3) {
        if (f1364b) {
            this.f1365a = z3;
        } else {
            androidx.core.widget.j.c(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f1364b && this.f1365a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f1364b && this.f1365a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public AppCompatPopupWindow(@c.j0 Context context, @c.k0 AttributeSet attributeSet, @c.f int i4, @c.v0 int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f1364b && this.f1365a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
