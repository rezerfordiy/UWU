package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f2199t = "MotionTelltales";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint f2200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MotionLayout f2201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float[] f2202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f2203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2206s;

    public MotionTelltales(Context context) {
        super(context);
        this.f2200m = new Paint();
        this.f2202o = new float[2];
        this.f2203p = new Matrix();
        this.f2204q = 0;
        this.f2205r = -65281;
        this.f2206s = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Mf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Nf) {
                    this.f2205r = typedArrayObtainStyledAttributes.getColor(index, this.f2205r);
                } else if (index == e.m.Pf) {
                    this.f2204q = typedArrayObtainStyledAttributes.getInt(index, this.f2204q);
                } else if (index == e.m.Of) {
                    this.f2206s = typedArrayObtainStyledAttributes.getFloat(index, this.f2206s);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2200m.setColor(this.f2205r);
        this.f2200m.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2203p);
        if (this.f2201n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2201n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i4 = 0; i4 < 5; i4++) {
            float f4 = fArr[i4];
            for (int i5 = 0; i5 < 5; i5++) {
                float f5 = fArr[i5];
                this.f2201n.r0(this, f5, f4, this.f2202o, this.f2204q);
                this.f2203p.mapVectors(this.f2202o);
                float f6 = width * f5;
                float f7 = height * f4;
                float[] fArr2 = this.f2202o;
                float f8 = fArr2[0];
                float f9 = this.f2206s;
                float f10 = f7 - (fArr2[1] * f9);
                this.f2203p.mapVectors(fArr2);
                canvas.drawLine(f6, f7, f6 - (f8 * f9), f10, this.f2200m);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2193g = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2200m = new Paint();
        this.f2202o = new float[2];
        this.f2203p = new Matrix();
        this.f2204q = 0;
        this.f2205r = -65281;
        this.f2206s = 0.25f;
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2200m = new Paint();
        this.f2202o = new float[2];
        this.f2203p = new Matrix();
        this.f2204q = 0;
        this.f2205r = -65281;
        this.f2206s = 0.25f;
        a(context, attributeSet);
    }
}
