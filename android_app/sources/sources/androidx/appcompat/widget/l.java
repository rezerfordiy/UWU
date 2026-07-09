package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class l extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f1783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f1785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1788i;

    public l(SeekBar seekBar) {
        super(seekBar);
        this.f1785f = null;
        this.f1786g = null;
        this.f1787h = false;
        this.f1788i = false;
        this.f1783d = seekBar;
    }

    @Override // androidx.appcompat.widget.i
    public void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        Context context = this.f1783d.getContext();
        int[] iArr = a.n.f7457w0;
        e1 e1VarG = e1.G(context, attributeSet, iArr, i4, 0);
        SeekBar seekBar = this.f1783d;
        z1.x1(seekBar, seekBar.getContext(), iArr, attributeSet, e1VarG.B(), i4, 0);
        Drawable drawableI = e1VarG.i(a.n.f7461x0);
        if (drawableI != null) {
            this.f1783d.setThumb(drawableI);
        }
        m(e1VarG.h(a.n.f7465y0));
        int i5 = a.n.A0;
        if (e1VarG.C(i5)) {
            this.f1786g = h0.e(e1VarG.o(i5, -1), this.f1786g);
            this.f1788i = true;
        }
        int i6 = a.n.f7469z0;
        if (e1VarG.C(i6)) {
            this.f1785f = e1VarG.d(i6);
            this.f1787h = true;
        }
        e1VarG.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1784e;
        if (drawable != null) {
            if (this.f1787h || this.f1788i) {
                Drawable drawableR = h0.a.r(drawable.mutate());
                this.f1784e = drawableR;
                if (this.f1787h) {
                    h0.a.o(drawableR, this.f1785f);
                }
                if (this.f1788i) {
                    h0.a.p(this.f1784e, this.f1786g);
                }
                if (this.f1784e.isStateful()) {
                    this.f1784e.setState(this.f1783d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f1784e != null) {
            int max = this.f1783d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1784e.getIntrinsicWidth();
                int intrinsicHeight = this.f1784e.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1784e.setBounds(-i4, -i5, i4, i5);
                float width = ((this.f1783d.getWidth() - this.f1783d.getPaddingLeft()) - this.f1783d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1783d.getPaddingLeft(), this.f1783d.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f1784e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1784e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1783d.getDrawableState())) {
            this.f1783d.invalidateDrawable(drawable);
        }
    }

    @c.k0
    public Drawable i() {
        return this.f1784e;
    }

    @c.k0
    public ColorStateList j() {
        return this.f1785f;
    }

    @c.k0
    public PorterDuff.Mode k() {
        return this.f1786g;
    }

    public void l() {
        Drawable drawable = this.f1784e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void m(@c.k0 Drawable drawable) {
        Drawable drawable2 = this.f1784e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1784e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1783d);
            h0.a.m(drawable, z1.X(this.f1783d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1783d.getDrawableState());
            }
            f();
        }
        this.f1783d.invalidate();
    }

    public void n(@c.k0 ColorStateList colorStateList) {
        this.f1785f = colorStateList;
        this.f1787h = true;
        f();
    }

    public void o(@c.k0 PorterDuff.Mode mode) {
        this.f1786g = mode;
        this.f1788i = true;
        f();
    }
}
