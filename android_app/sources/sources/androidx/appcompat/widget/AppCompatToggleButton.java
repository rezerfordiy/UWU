package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements v0.f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f1406c;

    public AppCompatToggleButton(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1405b;
        if (dVar != null) {
            dVar.b();
        }
        w wVar = this.f1406c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1405b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1405b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1405b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1405b;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1405b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1405b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public AppCompatToggleButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        z0.a(this, getContext());
        d dVar = new d(this);
        this.f1405b = dVar;
        dVar.e(attributeSet, i4);
        w wVar = new w(this);
        this.f1406c = wVar;
        wVar.m(attributeSet, i4);
    }
}
