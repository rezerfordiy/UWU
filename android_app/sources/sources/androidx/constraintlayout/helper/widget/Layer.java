package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public static final String C = "Layer";
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ConstraintLayout f1958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f1965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View[] f1968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1970z;

    public Layer(Context context) {
        super(context);
        this.f1955k = Float.NaN;
        this.f1956l = Float.NaN;
        this.f1957m = Float.NaN;
        this.f1959o = 1.0f;
        this.f1960p = 1.0f;
        this.f1961q = Float.NaN;
        this.f1962r = Float.NaN;
        this.f1963s = Float.NaN;
        this.f1964t = Float.NaN;
        this.f1965u = Float.NaN;
        this.f1966v = Float.NaN;
        this.f1967w = true;
        this.f1968x = null;
        this.f1969y = 0.0f;
        this.f1970z = 0.0f;
    }

    public final void A() {
        int i4;
        if (this.f1958n == null || (i4 = this.f2217c) == 0) {
            return;
        }
        View[] viewArr = this.f1968x;
        if (viewArr == null || viewArr.length != i4) {
            this.f1968x = new View[i4];
        }
        for (int i5 = 0; i5 < this.f2217c; i5++) {
            this.f1968x[i5] = this.f1958n.j(this.f2216b[i5]);
        }
    }

    public final void B() {
        if (this.f1958n == null) {
            return;
        }
        if (this.f1968x == null) {
            A();
        }
        z();
        double radians = Float.isNaN(this.f1957m) ? 0.0d : Math.toRadians(this.f1957m);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f4 = this.f1959o;
        float f5 = f4 * fCos;
        float f6 = this.f1960p;
        float f7 = (-f6) * fSin;
        float f8 = f4 * fSin;
        float f9 = f6 * fCos;
        for (int i4 = 0; i4 < this.f2217c; i4++) {
            View view = this.f1968x[i4];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f10 = left - this.f1961q;
            float f11 = top - this.f1962r;
            float f12 = (((f5 * f10) + (f7 * f11)) - f10) + this.f1969y;
            float f13 = (((f10 * f8) + (f9 * f11)) - f11) + this.f1970z;
            view.setTranslationX(f12);
            view.setTranslationY(f13);
            view.setScaleY(this.f1960p);
            view.setScaleX(this.f1959o);
            if (!Float.isNaN(this.f1957m)) {
                view.setRotation(this.f1957m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2220f = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.U5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.b6) {
                    this.A = true;
                } else if (index == e.m.i6) {
                    this.B = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1958n = (ConstraintLayout) getParent();
        if (this.A || this.B) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f2217c; i4++) {
                View viewJ = this.f1958n.j(this.f2216b[i4]);
                if (viewJ != null) {
                    if (this.A) {
                        viewJ.setVisibility(visibility);
                    }
                    if (this.B && elevation > 0.0f) {
                        viewJ.setTranslationZ(viewJ.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        i();
    }

    @Override // android.view.View
    public void setPivotX(float f4) {
        this.f1955k = f4;
        B();
    }

    @Override // android.view.View
    public void setPivotY(float f4) {
        this.f1956l = f4;
        B();
    }

    @Override // android.view.View
    public void setRotation(float f4) {
        this.f1957m = f4;
        B();
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        this.f1959o = f4;
        B();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        this.f1960p = f4;
        B();
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        this.f1969y = f4;
        B();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        this.f1970z = f4;
        B();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void t(ConstraintLayout constraintLayout) {
        A();
        this.f1961q = Float.NaN;
        this.f1962r = Float.NaN;
        v.e eVarB = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        eVarB.H1(0);
        eVarB.d1(0);
        z();
        layout(((int) this.f1965u) - getPaddingLeft(), ((int) this.f1966v) - getPaddingTop(), ((int) this.f1963s) + getPaddingRight(), ((int) this.f1964t) + getPaddingBottom());
        B();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void v(ConstraintLayout constraintLayout) {
        this.f1958n = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f && Float.isNaN(this.f1957m)) {
            return;
        }
        this.f1957m = rotation;
    }

    public void z() {
        if (this.f1958n == null) {
            return;
        }
        if (this.f1967w || Float.isNaN(this.f1961q) || Float.isNaN(this.f1962r)) {
            if (!Float.isNaN(this.f1955k) && !Float.isNaN(this.f1956l)) {
                this.f1962r = this.f1956l;
                this.f1961q = this.f1955k;
                return;
            }
            View[] viewArrN = n(this.f1958n);
            int left = viewArrN[0].getLeft();
            int top = viewArrN[0].getTop();
            int right = viewArrN[0].getRight();
            int bottom = viewArrN[0].getBottom();
            for (int i4 = 0; i4 < this.f2217c; i4++) {
                View view = viewArrN[i4];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f1963s = right;
            this.f1964t = bottom;
            this.f1965u = left;
            this.f1966v = top;
            this.f1961q = Float.isNaN(this.f1955k) ? (left + right) / 2 : this.f1955k;
            this.f1962r = Float.isNaN(this.f1956l) ? (top + bottom) / 2 : this.f1956l;
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1955k = Float.NaN;
        this.f1956l = Float.NaN;
        this.f1957m = Float.NaN;
        this.f1959o = 1.0f;
        this.f1960p = 1.0f;
        this.f1961q = Float.NaN;
        this.f1962r = Float.NaN;
        this.f1963s = Float.NaN;
        this.f1964t = Float.NaN;
        this.f1965u = Float.NaN;
        this.f1966v = Float.NaN;
        this.f1967w = true;
        this.f1968x = null;
        this.f1969y = 0.0f;
        this.f1970z = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1955k = Float.NaN;
        this.f1956l = Float.NaN;
        this.f1957m = Float.NaN;
        this.f1959o = 1.0f;
        this.f1960p = 1.0f;
        this.f1961q = Float.NaN;
        this.f1962r = Float.NaN;
        this.f1963s = Float.NaN;
        this.f1964t = Float.NaN;
        this.f1965u = Float.NaN;
        this.f1966v = Float.NaN;
        this.f1967w = true;
        this.f1968x = null;
        this.f1969y = 0.0f;
        this.f1970z = 0.0f;
    }
}
