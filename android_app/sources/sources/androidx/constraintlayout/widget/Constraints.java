package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2338c = "Constraints";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f2339b;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float H0;
        public boolean I0;
        public float J0;
        public float K0;
        public float L0;
        public float M0;
        public float N0;
        public float O0;
        public float P0;
        public float Q0;
        public float R0;
        public float S0;
        public float T0;

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.L7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.b8) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == e.m.o8) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                    this.I0 = true;
                } else if (index == e.m.j8) {
                    this.L0 = typedArrayObtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == e.m.k8) {
                    this.M0 = typedArrayObtainStyledAttributes.getFloat(index, this.M0);
                } else if (index == e.m.i8) {
                    this.K0 = typedArrayObtainStyledAttributes.getFloat(index, this.K0);
                } else if (index == e.m.g8) {
                    this.N0 = typedArrayObtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == e.m.h8) {
                    this.O0 = typedArrayObtainStyledAttributes.getFloat(index, this.O0);
                } else if (index == e.m.c8) {
                    this.P0 = typedArrayObtainStyledAttributes.getFloat(index, this.P0);
                } else if (index == e.m.d8) {
                    this.Q0 = typedArrayObtainStyledAttributes.getFloat(index, this.Q0);
                } else if (index == e.m.e8) {
                    this.R0 = typedArrayObtainStyledAttributes.getFloat(index, this.R0);
                } else if (index == e.m.f8) {
                    this.S0 = typedArrayObtainStyledAttributes.getFloat(index, this.S0);
                } else if (index == e.m.n8) {
                    this.T0 = typedArrayObtainStyledAttributes.getFloat(index, this.T0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ConstraintLayout.LayoutParams) layoutParams);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
        Log.v(f2338c, " ################# init");
    }

    public d getConstraintSet() {
        if (this.f2339b == null) {
            this.f2339b = new d();
        }
        this.f2339b.C(this);
        return this.f2339b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c(attributeSet);
        super.setVisibility(8);
    }
}
