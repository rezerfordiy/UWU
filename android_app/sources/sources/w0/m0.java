package w0;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityWindowInfo;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12502b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12503c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12504d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12505e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12506f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12507g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12508a;

    public m0(Object obj) {
        this.f12508a = obj;
    }

    public static m0 n() {
        return r(AccessibilityWindowInfo.obtain());
    }

    public static m0 o(m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return r(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) m0Var.f12508a));
    }

    public static String q(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static m0 r(Object obj) {
        if (obj != null) {
            return new m0(obj);
        }
        return null;
    }

    public e0 a() {
        return e0.W1(((AccessibilityWindowInfo) this.f12508a).getAnchor());
    }

    public void b(Rect rect) {
        ((AccessibilityWindowInfo) this.f12508a).getBoundsInScreen(rect);
    }

    public m0 c(int i4) {
        return r(((AccessibilityWindowInfo) this.f12508a).getChild(i4));
    }

    public int d() {
        return ((AccessibilityWindowInfo) this.f12508a).getChildCount();
    }

    public int e() {
        return ((AccessibilityWindowInfo) this.f12508a).getId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        Object obj2 = this.f12508a;
        Object obj3 = ((m0) obj).f12508a;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (!obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public int f() {
        return ((AccessibilityWindowInfo) this.f12508a).getLayer();
    }

    public m0 g() {
        return r(((AccessibilityWindowInfo) this.f12508a).getParent());
    }

    public e0 h() {
        return e0.W1(((AccessibilityWindowInfo) this.f12508a).getRoot());
    }

    public int hashCode() {
        Object obj = this.f12508a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public CharSequence i() {
        return ((AccessibilityWindowInfo) this.f12508a).getTitle();
    }

    public int j() {
        return ((AccessibilityWindowInfo) this.f12508a).getType();
    }

    public boolean k() {
        return ((AccessibilityWindowInfo) this.f12508a).isAccessibilityFocused();
    }

    public boolean l() {
        return ((AccessibilityWindowInfo) this.f12508a).isActive();
    }

    public boolean m() {
        return ((AccessibilityWindowInfo) this.f12508a).isFocused();
    }

    public void p() {
        ((AccessibilityWindowInfo) this.f12508a).recycle();
    }

    @c.j0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(e());
        sb.append(", type=");
        sb.append(q(j()));
        sb.append(", layer=");
        sb.append(f());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m());
        sb.append(", active=");
        sb.append(l());
        sb.append(", hasParent=");
        sb.append(g() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(']');
        return sb.toString();
    }
}
