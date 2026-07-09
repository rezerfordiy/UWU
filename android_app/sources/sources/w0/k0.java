package w0;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f12500a;

    @Deprecated
    public k0(Object obj) {
        this.f12500a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static k0 A(k0 k0Var) {
        return new k0(AccessibilityRecord.obtain(k0Var.f12500a));
    }

    public static void N(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollX(i4);
    }

    public static void P(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollY(i4);
    }

    public static void Y(@c.j0 AccessibilityRecord accessibilityRecord, View view, int i4) {
        accessibilityRecord.setSource(view, i4);
    }

    public static int j(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int l(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static k0 z() {
        return new k0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f12500a.recycle();
    }

    @Deprecated
    public void C(int i4) {
        this.f12500a.setAddedCount(i4);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f12500a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z3) {
        this.f12500a.setChecked(z3);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f12500a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f12500a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i4) {
        this.f12500a.setCurrentItemIndex(i4);
    }

    @Deprecated
    public void I(boolean z3) {
        this.f12500a.setEnabled(z3);
    }

    @Deprecated
    public void J(int i4) {
        this.f12500a.setFromIndex(i4);
    }

    @Deprecated
    public void K(boolean z3) {
        this.f12500a.setFullScreen(z3);
    }

    @Deprecated
    public void L(int i4) {
        this.f12500a.setItemCount(i4);
    }

    @Deprecated
    public void M(int i4) {
        N(this.f12500a, i4);
    }

    @Deprecated
    public void O(int i4) {
        P(this.f12500a, i4);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f12500a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z3) {
        this.f12500a.setPassword(z3);
    }

    @Deprecated
    public void S(int i4) {
        this.f12500a.setRemovedCount(i4);
    }

    @Deprecated
    public void T(int i4) {
        this.f12500a.setScrollX(i4);
    }

    @Deprecated
    public void U(int i4) {
        this.f12500a.setScrollY(i4);
    }

    @Deprecated
    public void V(boolean z3) {
        this.f12500a.setScrollable(z3);
    }

    @Deprecated
    public void W(View view) {
        this.f12500a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i4) {
        Y(this.f12500a, view, i4);
    }

    @Deprecated
    public void Z(int i4) {
        this.f12500a.setToIndex(i4);
    }

    @Deprecated
    public int a() {
        return this.f12500a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f12500a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f12500a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f12500a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f12500a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.f12500a;
        AccessibilityRecord accessibilityRecord2 = ((k0) obj).f12500a;
        if (accessibilityRecord == null) {
            if (accessibilityRecord2 != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(accessibilityRecord2)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int f() {
        return this.f12500a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f12500a;
    }

    @Deprecated
    public int h() {
        return this.f12500a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f12500a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f12500a);
    }

    @Deprecated
    public int k() {
        return l(this.f12500a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f12500a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f12500a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f12500a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f12500a.getScrollY();
    }

    @Deprecated
    public e0 q() {
        return e0.W1(this.f12500a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f12500a.getText();
    }

    @Deprecated
    public int s() {
        return this.f12500a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f12500a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f12500a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f12500a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f12500a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f12500a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f12500a.isScrollable();
    }
}
