package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.v, v0.f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f1349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f1350d;

    public AppCompatCheckBox(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1349c;
        if (dVar != null) {
            dVar.b();
        }
        w wVar = this.f1350d;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.f1348b;
        return eVar != null ? eVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1349c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1349c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        e eVar = this.f1348b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        e eVar = this.f1348b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1349c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1349c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@c.s int i4) {
        setButtonDrawable(f.a.d(getContext(), i4));
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1349c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1349c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@c.k0 ColorStateList colorStateList) {
        e eVar = this.f1348b;
        if (eVar != null) {
            eVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.v
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@c.k0 PorterDuff.Mode mode) {
        e eVar = this.f1348b;
        if (eVar != null) {
            eVar.h(mode);
        }
    }

    public AppCompatCheckBox(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f6880t0);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.f1348b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public AppCompatCheckBox(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(b1.b(context), attributeSet, i4);
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f1348b = eVar;
        eVar.e(attributeSet, i4);
        d dVar = new d(this);
        this.f1349c = dVar;
        dVar.e(attributeSet, i4);
        w wVar = new w(this);
        this.f1350d = wVar;
        wVar.m(attributeSet, i4);
    }
}
