package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements v0.f1, androidx.core.widget.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f1358c;

    public AppCompatImageButton(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1357b;
        if (dVar != null) {
            dVar.b();
        }
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1357b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1357b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.x
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        h hVar = this.f1358c;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.x
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        h hVar = this.f1358c;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1358c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1357b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1357b;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@c.k0 Drawable drawable) {
        super.setImageDrawable(drawable);
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@c.s int i4) {
        this.f1358c.g(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@c.k0 Uri uri) {
        super.setImageURI(uri);
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1357b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1357b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.x
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@c.k0 ColorStateList colorStateList) {
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.i(colorStateList);
        }
    }

    @Override // androidx.core.widget.x
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@c.k0 PorterDuff.Mode mode) {
        h hVar = this.f1358c;
        if (hVar != null) {
            hVar.j(mode);
        }
    }

    public AppCompatImageButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.R1);
    }

    public AppCompatImageButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(b1.b(context), attributeSet, i4);
        z0.a(this, getContext());
        d dVar = new d(this);
        this.f1357b = dVar;
        dVar.e(attributeSet, i4);
        h hVar = new h(this);
        this.f1358c = hVar;
        hVar.f(attributeSet, i4);
    }
}
