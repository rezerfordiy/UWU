package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c.r0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import s0.w;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements v0.f1, androidx.core.widget.w, androidx.core.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f1401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f1402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @c.k0
    public Future<s0.w> f1404f;

    public AppCompatTextView(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1400b;
        if (dVar != null) {
            dVar.b();
        }
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.b();
        }
    }

    public final void g() {
        Future<s0.w> future = this.f1404f;
        if (future != null) {
            try {
                this.f1404f = null;
                androidx.core.widget.t.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f1401c;
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
        w wVar = this.f1401c;
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
        w wVar = this.f1401c;
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
        w wVar = this.f1401c;
        return wVar != null ? wVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f3493a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.f1401c;
        if (wVar != null) {
            return wVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.t.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.t.j(this);
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1400b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1400b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1401c.j();
    }

    @Override // androidx.core.widget.w
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1401c.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    @c.o0(api = 26)
    @c.j0
    public TextClassifier getTextClassifier() {
        q qVar;
        return (Build.VERSION.SDK_INT >= 28 || (qVar = this.f1402d) == null) ? super.getTextClassifier() : qVar.a();
    }

    @c.j0
    public w.a getTextMetricsParamsCompat() {
        return androidx.core.widget.t.o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1401c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return g.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.o(z3, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        g();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        w wVar = this.f1401c;
        if (wVar == null || androidx.core.widget.b.f3493a || !wVar.l()) {
            return;
        }
        this.f1401c.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (androidx.core.widget.b.f3493a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        w wVar = this.f1401c;
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
        w wVar = this.f1401c;
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
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1400b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1400b;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@c.k0 Drawable drawable, @c.k0 Drawable drawable2, @c.k0 Drawable drawable3, @c.k0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    @c.o0(17)
    public void setCompoundDrawablesRelative(@c.k0 Drawable drawable, @c.k0 Drawable drawable2, @c.k0 Drawable drawable3, @c.k0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    @c.o0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? f.a.d(context, i4) : null, i5 != 0 ? f.a.d(context, i5) : null, i6 != 0 ? f.a.d(context, i6) : null, i7 != 0 ? f.a.d(context, i7) : null);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? f.a.d(context, i4) : null, i5 != 0 ? f.a.d(context, i5) : null, i6 != 0 ? f.a.d(context, i6) : null, i7 != 0 ? f.a.d(context, i7) : null);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.t.G(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@c.m0 @c.b0(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            androidx.core.widget.t.A(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@c.m0 @c.b0(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            androidx.core.widget.t.B(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@c.m0 @c.b0(from = 0) int i4) {
        androidx.core.widget.t.C(this, i4);
    }

    public void setPrecomputedText(@c.j0 s0.w wVar) {
        androidx.core.widget.t.D(this, wVar);
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1400b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1400b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@c.k0 ColorStateList colorStateList) {
        this.f1401c.w(colorStateList);
        this.f1401c.b();
    }

    @Override // androidx.core.widget.w
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@c.k0 PorterDuff.Mode mode) {
        this.f1401c.x(mode);
        this.f1401c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    @c.o0(api = 26)
    public void setTextClassifier(@c.k0 TextClassifier textClassifier) {
        q qVar;
        if (Build.VERSION.SDK_INT >= 28 || (qVar = this.f1402d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            qVar.b(textClassifier);
        }
    }

    public void setTextFuture(@c.k0 Future<s0.w> future) {
        this.f1404f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@c.j0 w.a aVar) {
        androidx.core.widget.t.F(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (androidx.core.widget.b.f3493a) {
            super.setTextSize(i4, f4);
            return;
        }
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.A(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@c.k0 Typeface typeface, int i4) {
        if (this.f1403e) {
            return;
        }
        Typeface typefaceB = (typeface == null || i4 <= 0) ? null : g0.y0.b(getContext(), typeface, i4);
        this.f1403e = true;
        if (typefaceB != null) {
            typeface = typefaceB;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f1403e = false;
        }
    }

    public AppCompatTextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    @c.o0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@c.k0 Drawable drawable, @c.k0 Drawable drawable2, @c.k0 Drawable drawable3, @c.k0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@c.k0 Drawable drawable, @c.k0 Drawable drawable2, @c.k0 Drawable drawable3, @c.k0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1401c;
        if (wVar != null) {
            wVar.p();
        }
    }

    public AppCompatTextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(b1.b(context), attributeSet, i4);
        this.f1403e = false;
        z0.a(this, getContext());
        d dVar = new d(this);
        this.f1400b = dVar;
        dVar.e(attributeSet, i4);
        w wVar = new w(this);
        this.f1401c = wVar;
        wVar.m(attributeSet, i4);
        wVar.b();
        this.f1402d = new q(this);
    }
}
