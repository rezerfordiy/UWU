package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public final CompoundButton f1664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1665b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1666c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1667d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1668e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1669f;

    public e(@c.j0 CompoundButton compoundButton) {
        this.f1664a = compoundButton;
    }

    public void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1664a);
        if (drawableA != null) {
            if (this.f1667d || this.f1668e) {
                Drawable drawableMutate = h0.a.r(drawableA).mutate();
                if (this.f1667d) {
                    h0.a.o(drawableMutate, this.f1665b);
                }
                if (this.f1668e) {
                    h0.a.p(drawableMutate, this.f1666c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1664a.getDrawableState());
                }
                this.f1664a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i4) {
        return i4;
    }

    public ColorStateList c() {
        return this.f1665b;
    }

    public PorterDuff.Mode d() {
        return this.f1666c;
    }

    public void e(@c.k0 AttributeSet attributeSet, int i4) {
        boolean z3;
        int iU;
        int iU2;
        Context context = this.f1664a.getContext();
        int[] iArr = a.n.J3;
        e1 e1VarG = e1.G(context, attributeSet, iArr, i4, 0);
        CompoundButton compoundButton = this.f1664a;
        z1.x1(compoundButton, compoundButton.getContext(), iArr, attributeSet, e1VarG.B(), i4, 0);
        try {
            int i5 = a.n.L3;
            if (!e1VarG.C(i5) || (iU2 = e1VarG.u(i5, 0)) == 0) {
                z3 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1664a;
                    compoundButton2.setButtonDrawable(f.a.d(compoundButton2.getContext(), iU2));
                    z3 = true;
                } catch (Resources.NotFoundException unused) {
                    z3 = false;
                }
            }
            if (!z3) {
                int i6 = a.n.K3;
                if (e1VarG.C(i6) && (iU = e1VarG.u(i6, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1664a;
                    compoundButton3.setButtonDrawable(f.a.d(compoundButton3.getContext(), iU));
                }
            }
            int i7 = a.n.M3;
            if (e1VarG.C(i7)) {
                androidx.core.widget.c.d(this.f1664a, e1VarG.d(i7));
            }
            int i8 = a.n.N3;
            if (e1VarG.C(i8)) {
                androidx.core.widget.c.e(this.f1664a, h0.e(e1VarG.o(i8, -1), null));
            }
        } finally {
            e1VarG.I();
        }
    }

    public void f() {
        if (this.f1669f) {
            this.f1669f = false;
        } else {
            this.f1669f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f1665b = colorStateList;
        this.f1667d = true;
        a();
    }

    public void h(@c.k0 PorterDuff.Mode mode) {
        this.f1666c = mode;
        this.f1668e = true;
        a();
    }
}
