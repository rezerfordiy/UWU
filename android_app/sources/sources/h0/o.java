package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import c.j0;
import c.k0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public class o extends Drawable implements Drawable.Callback, n, m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f8014h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f8018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f8020g;

    public o(@k0 Drawable drawable) {
        this.f8018e = d();
        b(drawable);
    }

    @Override // h0.n
    public final Drawable a() {
        return this.f8020g;
    }

    @Override // h0.n
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f8020g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8020g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            q qVar = this.f8018e;
            if (qVar != null) {
                qVar.f8024b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        return true;
    }

    @j0
    public final q d() {
        return new q(this.f8018e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@j0 Canvas canvas) {
        this.f8020g.draw(canvas);
    }

    public final void e(@k0 Resources resources) {
        Drawable.ConstantState constantState;
        q qVar = this.f8018e;
        if (qVar == null || (constantState = qVar.f8024b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        q qVar = this.f8018e;
        ColorStateList colorStateList = qVar.f8025c;
        PorterDuff.Mode mode = qVar.f8026d;
        if (colorStateList == null || mode == null) {
            this.f8017d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f8017d || colorForState != this.f8015b || mode != this.f8016c) {
                setColorFilter(colorForState, mode);
                this.f8015b = colorForState;
                this.f8016c = mode;
                this.f8017d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        q qVar = this.f8018e;
        return changingConfigurations | (qVar != null ? qVar.getChangingConfigurations() : 0) | this.f8020g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @k0
    public Drawable.ConstantState getConstantState() {
        q qVar = this.f8018e;
        if (qVar == null || !qVar.a()) {
            return null;
        }
        this.f8018e.f8023a = getChangingConfigurations();
        return this.f8018e;
    }

    @Override // android.graphics.drawable.Drawable
    @j0
    public Drawable getCurrent() {
        return this.f8020g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8020g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8020g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @o0(23)
    public int getLayoutDirection() {
        return a.f(this.f8020g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f8020g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f8020g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8020g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@j0 Rect rect) {
        return this.f8020g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @j0
    public int[] getState() {
        return this.f8020g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f8020g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@j0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @o0(19)
    public boolean isAutoMirrored() {
        return a.h(this.f8020g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        q qVar;
        ColorStateList colorStateList = (!c() || (qVar = this.f8018e) == null) ? null : qVar.f8025c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f8020g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f8020g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @j0
    public Drawable mutate() {
        if (!this.f8019f && super.mutate() == this) {
            this.f8018e = d();
            Drawable drawable = this.f8020g;
            if (drawable != null) {
                drawable.mutate();
            }
            q qVar = this.f8018e;
            if (qVar != null) {
                Drawable drawable2 = this.f8020g;
                qVar.f8024b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f8019f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8020g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @o0(23)
    public boolean onLayoutDirectionChanged(int i4) {
        return a.m(this.f8020g, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        return this.f8020g.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f8020g.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    @o0(19)
    public void setAutoMirrored(boolean z3) {
        a.j(this.f8020g, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f8020g.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8020g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f8020g.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f8020g.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@j0 int[] iArr) {
        return f(iArr) || this.f8020g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintList(ColorStateList colorStateList) {
        this.f8018e.f8025c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintMode(@j0 PorterDuff.Mode mode) {
        this.f8018e.f8026d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f8020g.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public o(@j0 q qVar, @k0 Resources resources) {
        this.f8018e = qVar;
        e(resources);
    }
}
