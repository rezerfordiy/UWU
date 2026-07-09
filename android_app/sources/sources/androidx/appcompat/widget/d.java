package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public final View f1657a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f1660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f1661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f1662f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1659c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1658b = f.b();

    public d(@c.j0 View view) {
        this.f1657a = view;
    }

    public final boolean a(@c.j0 Drawable drawable) {
        if (this.f1662f == null) {
            this.f1662f = new c1();
        }
        c1 c1Var = this.f1662f;
        c1Var.a();
        ColorStateList colorStateListL = z1.L(this.f1657a);
        if (colorStateListL != null) {
            c1Var.f1656d = true;
            c1Var.f1653a = colorStateListL;
        }
        PorterDuff.Mode modeM = z1.M(this.f1657a);
        if (modeM != null) {
            c1Var.f1655c = true;
            c1Var.f1654b = modeM;
        }
        if (!c1Var.f1656d && !c1Var.f1655c) {
            return false;
        }
        f.j(drawable, c1Var, this.f1657a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f1657a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            c1 c1Var = this.f1661e;
            if (c1Var != null) {
                f.j(background, c1Var, this.f1657a.getDrawableState());
                return;
            }
            c1 c1Var2 = this.f1660d;
            if (c1Var2 != null) {
                f.j(background, c1Var2, this.f1657a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        c1 c1Var = this.f1661e;
        if (c1Var != null) {
            return c1Var.f1653a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        c1 c1Var = this.f1661e;
        if (c1Var != null) {
            return c1Var.f1654b;
        }
        return null;
    }

    public void e(@c.k0 AttributeSet attributeSet, int i4) {
        Context context = this.f1657a.getContext();
        int[] iArr = a.n.b8;
        e1 e1VarG = e1.G(context, attributeSet, iArr, i4, 0);
        View view = this.f1657a;
        z1.x1(view, view.getContext(), iArr, attributeSet, e1VarG.B(), i4, 0);
        try {
            int i5 = a.n.c8;
            if (e1VarG.C(i5)) {
                this.f1659c = e1VarG.u(i5, -1);
                ColorStateList colorStateListF = this.f1658b.f(this.f1657a.getContext(), this.f1659c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i6 = a.n.d8;
            if (e1VarG.C(i6)) {
                z1.H1(this.f1657a, e1VarG.d(i6));
            }
            int i7 = a.n.e8;
            if (e1VarG.C(i7)) {
                z1.I1(this.f1657a, h0.e(e1VarG.o(i7, -1), null));
            }
        } finally {
            e1VarG.I();
        }
    }

    public void f(Drawable drawable) {
        this.f1659c = -1;
        h(null);
        b();
    }

    public void g(int i4) {
        this.f1659c = i4;
        f fVar = this.f1658b;
        h(fVar != null ? fVar.f(this.f1657a.getContext(), i4) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1660d == null) {
                this.f1660d = new c1();
            }
            c1 c1Var = this.f1660d;
            c1Var.f1653a = colorStateList;
            c1Var.f1656d = true;
        } else {
            this.f1660d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1661e == null) {
            this.f1661e = new c1();
        }
        c1 c1Var = this.f1661e;
        c1Var.f1653a = colorStateList;
        c1Var.f1656d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1661e == null) {
            this.f1661e = new c1();
        }
        c1 c1Var = this.f1661e;
        c1Var.f1654b = mode;
        c1Var.f1655c = true;
        b();
    }

    public final boolean k() {
        return this.f1660d != null;
    }
}
