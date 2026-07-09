package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements v0.f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1361d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f1363c;

    public AppCompatMultiAutoCompleteTextView(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1362b;
        if (dVar != null) {
            dVar.b();
        }
        w wVar = this.f1363c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1362b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // v0.f1
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1362b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@c.k0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1362b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@c.s int i4) {
        super.setBackgroundResource(i4);
        d dVar = this.f1362b;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@c.s int i4) {
        setDropDownBackgroundDrawable(f.a.d(getContext(), i4));
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@c.k0 ColorStateList colorStateList) {
        d dVar = this.f1362b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // v0.f1
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@c.k0 PorterDuff.Mode mode) {
        d dVar = this.f1362b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        w wVar = this.f1363c;
        if (wVar != null) {
            wVar.q(context, i4);
        }
    }

    public AppCompatMultiAutoCompleteTextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.T);
    }

    public AppCompatMultiAutoCompleteTextView(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(b1.b(context), attributeSet, i4);
        z0.a(this, getContext());
        e1 e1VarG = e1.G(getContext(), attributeSet, f1361d, i4, 0);
        if (e1VarG.C(0)) {
            setDropDownBackgroundDrawable(e1VarG.h(0));
        }
        e1VarG.I();
        d dVar = new d(this);
        this.f1362b = dVar;
        dVar.e(attributeSet, i4);
        w wVar = new w(this);
        this.f1363c = wVar;
        wVar.m(attributeSet, i4);
        wVar.b();
    }
}
