package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f8026d;

    public q(@k0 q qVar) {
        this.f8025c = null;
        this.f8026d = o.f8014h;
        if (qVar != null) {
            this.f8023a = qVar.f8023a;
            this.f8024b = qVar.f8024b;
            this.f8025c = qVar.f8025c;
            this.f8026d = qVar.f8026d;
        }
    }

    public boolean a() {
        return this.f8024b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i4 = this.f8023a;
        Drawable.ConstantState constantState = this.f8024b;
        return i4 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @j0
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @j0
    public Drawable newDrawable(@k0 Resources resources) {
        return new p(this, resources);
    }
}
