package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c.j0;
import c.o0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@o0(21)
public class p extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8021i = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f8022j;

    public p(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // h0.o
    public boolean c() {
        return false;
    }

    public final void g() {
        if (f8022j == null) {
            try {
                f8022j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e4) {
                Log.w(f8021i, "Failed to retrieve Drawable#isProjected() method", e4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @j0
    public Rect getDirtyBounds() {
        return this.f8020g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@j0 Outline outline) {
        this.f8020g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f8020g;
        if (drawable != null && (method = f8022j) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e4) {
                Log.w(f8021i, "Error calling Drawable#isProjected() method", e4);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        this.f8020g.setHotspot(f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        this.f8020g.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // h0.o, android.graphics.drawable.Drawable
    public boolean setState(@j0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // h0.o, android.graphics.drawable.Drawable, h0.m
    public void setTint(int i4) {
        if (c()) {
            super.setTint(i4);
        } else {
            this.f8020g.setTint(i4);
        }
    }

    @Override // h0.o, android.graphics.drawable.Drawable, h0.m
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f8020g.setTintList(colorStateList);
        }
    }

    @Override // h0.o, android.graphics.drawable.Drawable, h0.m
    public void setTintMode(@j0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f8020g.setTintMode(mode);
        }
    }

    public p(q qVar, Resources resources) {
        super(qVar, resources);
        g();
    }
}
