package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c.r0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class k1 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1780b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1781c = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f1782a;

    public k1(@c.j0 Context context, @c.j0 Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1782a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1780b;
    }

    public static void b(boolean z3) {
        f1780b = z3;
    }

    public static boolean c() {
        a();
        return false;
    }

    public final Drawable d(int i4) {
        return super.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Context context = this.f1782a.get();
        return context != null ? r0.h().t(context, this, i4) : super.getDrawable(i4);
    }
}
