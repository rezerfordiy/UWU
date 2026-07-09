package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class d1 extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f1663b;

    public d1(@c.j0 Context context, @c.j0 Resources resources) {
        super(resources);
        this.f1663b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.s0, android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i4);
        Context context = this.f1663b.get();
        if (drawable != null && context != null) {
            r0.h().x(context, i4, drawable);
        }
        return drawable;
    }
}
