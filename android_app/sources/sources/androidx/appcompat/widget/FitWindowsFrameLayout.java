package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.j0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0.a f1419b;

    public FitWindowsFrameLayout(@c.j0 Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        j0.a aVar = this.f1419b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.j0
    public void setOnFitSystemWindowsListener(j0.a aVar) {
        this.f1419b = aVar;
    }

    public FitWindowsFrameLayout(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
