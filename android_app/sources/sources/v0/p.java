package v0;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12106a;

    public p(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? m.a(rect, list) : null);
    }

    public static DisplayCutout a(@c.j0 g0.r0 r0Var, @c.k0 Rect rect, @c.k0 Rect rect2, @c.k0 Rect rect3, @c.k0 Rect rect4, @c.j0 g0.r0 r0Var2) {
        if (p0.a.g()) {
            f.a();
            return n.a(r0Var.h(), rect, rect2, rect3, rect4, r0Var2.h());
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f.a();
            return o.a(r0Var.h(), rect, rect2, rect3, rect4);
        }
        if (i4 < 28) {
            return null;
        }
        Rect rect5 = new Rect(r0Var.f7803a, r0Var.f7804b, r0Var.f7805c, r0Var.f7806d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return m.a(rect5, arrayList);
    }

    public static p i(Object obj) {
        if (obj == null) {
            return null;
        }
        return new p(obj);
    }

    @c.j0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? e.a(this.f12106a).getBoundingRects() : Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(this.f12106a).getSafeInsetBottom();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(this.f12106a).getSafeInsetLeft();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(this.f12106a).getSafeInsetRight();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return u0.e.a(this.f12106a, ((p) obj).f12106a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(this.f12106a).getSafeInsetTop();
        }
        return 0;
    }

    @c.j0
    public g0.r0 g() {
        return p0.a.g() ? g0.r0.g(e.a(this.f12106a).getWaterfallInsets()) : g0.r0.f7802e;
    }

    @c.o0(api = 28)
    public DisplayCutout h() {
        return e.a(this.f12106a);
    }

    public int hashCode() {
        Object obj = this.f12106a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f12106a + "}";
    }

    public p(@c.j0 g0.r0 r0Var, @c.k0 Rect rect, @c.k0 Rect rect2, @c.k0 Rect rect3, @c.k0 Rect rect4, @c.j0 g0.r0 r0Var2) {
        this(a(r0Var, rect, rect2, rect3, rect4, r0Var2));
    }

    public p(Object obj) {
        this.f12106a = obj;
    }
}
