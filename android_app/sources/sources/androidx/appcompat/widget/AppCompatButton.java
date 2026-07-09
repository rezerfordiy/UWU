package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements v0.f1, androidx.core.widget.b, androidx.core.widget.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f1347c;

    public AppCompatButton(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1346b;
        if (dVar != null) {
            dVar.b();
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            return wVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            return wVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f1347c;
        return wVar != null ? wVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            return wVar.i();
        }
        return 0;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1346b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1346b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1347c.j();
    }

    @Override // androidx.core.widget.w
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1347c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.o(z3, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        w wVar = this.f1347c;
        if (wVar == null || androidx.core.widget.b.f3493a || !wVar.l()) {
            return;
        }
        this.f1347c.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (androidx.core.widget.b.f3493a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@c.j0 int[] iArr, int i4) throws IllegalArgumentException {
        if (androidx.core.widget.b.f3493a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.u(iArr, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (androidx.core.widget.b.f3493a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1346b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1346b;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.t.G(this, callback));
    }

    public void setSupportAllCaps(boolean z3) {
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.s(z3);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1346b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1346b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@c.k0 ColorStateList colorStateList) {
        this.f1347c.w(colorStateList);
        this.f1347c.b();
    }

    @Override // androidx.core.widget.w
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@c.k0 PorterDuff.Mode mode) {
        this.f1347c.x(mode);
        this.f1347c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (androidx.core.widget.b.f3493a) {
            super.setTextSize(i4, f4);
            return;
        }
        w wVar = this.f1347c;
        if (wVar != null) {
            wVar.A(i4, f4);
        }
    }

    public AppCompatButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f6860p0);
    }

    public AppCompatButton(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(b1.b(context), attributeSet, i4);
        z0.a(this, getContext());
        d dVar = new d(this);
        this.f1346b = dVar;
        dVar.e(attributeSet, i4);
        w wVar = new w(this);
        this.f1347c = wVar;
        wVar.m(attributeSet, i4);
        wVar.b();
    }
}
