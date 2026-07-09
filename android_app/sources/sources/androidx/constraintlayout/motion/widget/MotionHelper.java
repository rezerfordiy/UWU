package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements r.a, MotionLayout.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View[] f1974n;

    public MotionHelper(Context context) {
        super(context);
        this.f1971k = false;
        this.f1972l = false;
    }

    public boolean A() {
        return this.f1971k;
    }

    public void B(View view, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void a(MotionLayout motionLayout, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void b(MotionLayout motionLayout, int i4, boolean z3, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void c(MotionLayout motionLayout, int i4, int i5, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void d(MotionLayout motionLayout, int i4) {
    }

    @Override // r.a
    public float getProgress() {
        return this.f1973m;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.zf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Bf) {
                    this.f1971k = typedArrayObtainStyledAttributes.getBoolean(index, this.f1971k);
                } else if (index == e.m.Af) {
                    this.f1972l = typedArrayObtainStyledAttributes.getBoolean(index, this.f1972l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // r.a
    public void setProgress(float f4) {
        this.f1973m = f4;
        int i4 = 0;
        if (this.f2217c > 0) {
            this.f1974n = n((ConstraintLayout) getParent());
            while (i4 < this.f2217c) {
                B(this.f1974n[i4], f4);
                i4++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i4 < childCount) {
            View childAt = viewGroup.getChildAt(i4);
            if (!(childAt instanceof MotionHelper)) {
                B(childAt, f4);
            }
            i4++;
        }
    }

    public boolean z() {
        return this.f1972l;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1971k = false;
        this.f1972l = false;
        o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1971k = false;
        this.f1972l = false;
        o(attributeSet);
    }
}
