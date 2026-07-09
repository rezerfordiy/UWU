package g0;

import android.graphics.Insets;
import android.graphics.Rect;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @c.j0
    public static final r0 f7802e = new r0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7806d;

    public r0(int i4, int i5, int i6, int i7) {
        this.f7803a = i4;
        this.f7804b = i5;
        this.f7805c = i6;
        this.f7806d = i7;
    }

    @c.j0
    public static r0 a(@c.j0 r0 r0Var, @c.j0 r0 r0Var2) {
        return d(r0Var.f7803a + r0Var2.f7803a, r0Var.f7804b + r0Var2.f7804b, r0Var.f7805c + r0Var2.f7805c, r0Var.f7806d + r0Var2.f7806d);
    }

    @c.j0
    public static r0 b(@c.j0 r0 r0Var, @c.j0 r0 r0Var2) {
        return d(Math.max(r0Var.f7803a, r0Var2.f7803a), Math.max(r0Var.f7804b, r0Var2.f7804b), Math.max(r0Var.f7805c, r0Var2.f7805c), Math.max(r0Var.f7806d, r0Var2.f7806d));
    }

    @c.j0
    public static r0 c(@c.j0 r0 r0Var, @c.j0 r0 r0Var2) {
        return d(Math.min(r0Var.f7803a, r0Var2.f7803a), Math.min(r0Var.f7804b, r0Var2.f7804b), Math.min(r0Var.f7805c, r0Var2.f7805c), Math.min(r0Var.f7806d, r0Var2.f7806d));
    }

    @c.j0
    public static r0 d(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f7802e : new r0(i4, i5, i6, i7);
    }

    @c.j0
    public static r0 e(@c.j0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @c.j0
    public static r0 f(@c.j0 r0 r0Var, @c.j0 r0 r0Var2) {
        return d(r0Var.f7803a - r0Var2.f7803a, r0Var.f7804b - r0Var2.f7804b, r0Var.f7805c - r0Var2.f7805c, r0Var.f7806d - r0Var2.f7806d);
    }

    @c.o0(api = 29)
    @c.j0
    public static r0 g(@c.j0 Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @c.o0(api = 29)
    @Deprecated
    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static r0 i(@c.j0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f7806d == r0Var.f7806d && this.f7803a == r0Var.f7803a && this.f7805c == r0Var.f7805c && this.f7804b == r0Var.f7804b;
    }

    @c.o0(api = 29)
    @c.j0
    public Insets h() {
        return Insets.of(this.f7803a, this.f7804b, this.f7805c, this.f7806d);
    }

    public int hashCode() {
        return (((((this.f7803a * 31) + this.f7804b) * 31) + this.f7805c) * 31) + this.f7806d;
    }

    public String toString() {
        return "Insets{left=" + this.f7803a + ", top=" + this.f7804b + ", right=" + this.f7805c + ", bottom=" + this.f7806d + '}';
    }
}
