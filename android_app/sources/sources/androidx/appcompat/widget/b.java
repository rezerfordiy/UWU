package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f1614a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1614a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1614a;
        if (actionBarContainer.f1230i) {
            Drawable drawable = actionBarContainer.f1229h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1227f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1614a;
        Drawable drawable3 = actionBarContainer2.f1228g;
        if (drawable3 == null || !actionBarContainer2.f1231j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @c.o0(21)
    public void getOutline(@c.j0 Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1614a;
        if (actionBarContainer.f1230i) {
            drawable = actionBarContainer.f1229h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1227f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
