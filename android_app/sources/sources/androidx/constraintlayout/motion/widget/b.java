package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;
    public static final int K = 5;
    public static final int L = 6;
    public static final int M = 1;
    public static final int N = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f2128v = "TouchResponse";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f2129w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float[][] f2130x = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float[][] f2131y = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f2132z = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MotionLayout f2147o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2133a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2134b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2135c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2136d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2137e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2138f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2139g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2140h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2141i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2142j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2143k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f2144l = new float[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2148p = 4.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f2149q = 1.2f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2150r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2151s = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2152t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f2153u = 10.0f;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b$b, reason: collision with other inner class name */
    public class C0014b implements NestedScrollView.b {
        public C0014b() {
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
        }
    }

    public b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2147o = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public float a(float f4, float f5) {
        return (f4 * this.f2141i) + (f5 * this.f2142j);
    }

    public final void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index == e.m.dg) {
                this.f2136d = typedArray.getResourceId(index, this.f2136d);
            } else if (index == e.m.eg) {
                int i5 = typedArray.getInt(index, this.f2133a);
                this.f2133a = i5;
                float[] fArr = f2130x[i5];
                this.f2140h = fArr[0];
                this.f2139g = fArr[1];
            } else if (index == e.m.Uf) {
                int i6 = typedArray.getInt(index, this.f2134b);
                this.f2134b = i6;
                float[] fArr2 = f2131y[i6];
                this.f2141i = fArr2[0];
                this.f2142j = fArr2[1];
            } else if (index == e.m.Zf) {
                this.f2148p = typedArray.getFloat(index, this.f2148p);
            } else if (index == e.m.Yf) {
                this.f2149q = typedArray.getFloat(index, this.f2149q);
            } else if (index == e.m.ag) {
                this.f2150r = typedArray.getBoolean(index, this.f2150r);
            } else if (index == e.m.Vf) {
                this.f2151s = typedArray.getFloat(index, this.f2151s);
            } else if (index == e.m.Wf) {
                this.f2153u = typedArray.getFloat(index, this.f2153u);
            } else if (index == e.m.fg) {
                this.f2137e = typedArray.getResourceId(index, this.f2137e);
            } else if (index == e.m.cg) {
                this.f2135c = typedArray.getInt(index, this.f2135c);
            } else if (index == e.m.bg) {
                this.f2152t = typedArray.getInteger(index, 0);
            } else if (index == e.m.Xf) {
                this.f2138f = typedArray.getResourceId(index, 0);
            }
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Tf);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int d() {
        return this.f2136d;
    }

    public int e() {
        return this.f2152t;
    }

    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i4 = this.f2138f;
        if (i4 == -1 || (viewFindViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int g() {
        return this.f2138f;
    }

    public float h() {
        return this.f2149q;
    }

    public float i() {
        return this.f2148p;
    }

    public boolean j() {
        return this.f2150r;
    }

    public float k(float f4, float f5) {
        this.f2147o.m0(this.f2136d, this.f2147o.getProgress(), this.f2140h, this.f2139g, this.f2144l);
        float f6 = this.f2141i;
        if (f6 != 0.0f) {
            float[] fArr = this.f2144l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f4 * f6) / fArr[0];
        }
        float[] fArr2 = this.f2144l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f5 * this.f2142j) / fArr2[1];
    }

    public RectF l(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i4 = this.f2137e;
        if (i4 == -1 || (viewFindViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int m() {
        return this.f2137e;
    }

    public void n(MotionEvent motionEvent, MotionLayout.f fVar, int i4, androidx.constraintlayout.motion.widget.a aVar) {
        int i5;
        fVar.b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2145m = motionEvent.getRawX();
            this.f2146n = motionEvent.getRawY();
            this.f2143k = false;
            return;
        }
        if (action == 1) {
            this.f2143k = false;
            fVar.g(1000);
            float fD = fVar.d();
            float fC = fVar.c();
            float progress = this.f2147o.getProgress();
            int i6 = this.f2136d;
            if (i6 != -1) {
                this.f2147o.m0(i6, progress, this.f2140h, this.f2139g, this.f2144l);
            } else {
                float fMin = Math.min(this.f2147o.getWidth(), this.f2147o.getHeight());
                float[] fArr = this.f2144l;
                fArr[1] = this.f2142j * fMin;
                fArr[0] = fMin * this.f2141i;
            }
            float f4 = this.f2141i;
            float[] fArr2 = this.f2144l;
            float f5 = f4 != 0.0f ? fD / fArr2[0] : fC / fArr2[1];
            float f6 = !Float.isNaN(f5) ? (f5 / 3.0f) + progress : progress;
            if (f6 != 0.0f && f6 != 1.0f && (i5 = this.f2135c) != 3) {
                this.f2147o.F0(i5, ((double) f6) < 0.5d ? 0.0f : 1.0f, f5);
                if (0.0f < progress && 1.0f > progress) {
                    return;
                }
            } else if (0.0f < f6 && 1.0f > f6) {
                return;
            }
            this.f2147o.setState(MotionLayout.j.FINISHED);
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f2146n;
        float rawX = motionEvent.getRawX() - this.f2145m;
        if (Math.abs((this.f2141i * rawX) + (this.f2142j * rawY)) > this.f2153u || this.f2143k) {
            float progress2 = this.f2147o.getProgress();
            if (!this.f2143k) {
                this.f2143k = true;
                this.f2147o.setProgress(progress2);
            }
            int i7 = this.f2136d;
            if (i7 != -1) {
                this.f2147o.m0(i7, progress2, this.f2140h, this.f2139g, this.f2144l);
            } else {
                float fMin2 = Math.min(this.f2147o.getWidth(), this.f2147o.getHeight());
                float[] fArr3 = this.f2144l;
                fArr3[1] = this.f2142j * fMin2;
                fArr3[0] = fMin2 * this.f2141i;
            }
            float f7 = this.f2141i;
            float[] fArr4 = this.f2144l;
            if (Math.abs(((f7 * fArr4[0]) + (this.f2142j * fArr4[1])) * this.f2151s) < 0.01d) {
                float[] fArr5 = this.f2144l;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f2141i != 0.0f ? rawX / this.f2144l[0] : rawY / this.f2144l[1]), 1.0f), 0.0f);
            if (fMax != this.f2147o.getProgress()) {
                this.f2147o.setProgress(fMax);
                fVar.g(1000);
                this.f2147o.J = this.f2141i != 0.0f ? fVar.d() / this.f2144l[0] : fVar.c() / this.f2144l[1];
            } else {
                this.f2147o.J = 0.0f;
            }
            this.f2145m = motionEvent.getRawX();
            this.f2146n = motionEvent.getRawY();
        }
    }

    public void o(float f4, float f5) {
        float progress = this.f2147o.getProgress();
        if (!this.f2143k) {
            this.f2143k = true;
            this.f2147o.setProgress(progress);
        }
        this.f2147o.m0(this.f2136d, progress, this.f2140h, this.f2139g, this.f2144l);
        float f6 = this.f2141i;
        float[] fArr = this.f2144l;
        if (Math.abs((f6 * fArr[0]) + (this.f2142j * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f2144l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f7 = this.f2141i;
        float fMax = Math.max(Math.min(progress + (f7 != 0.0f ? (f4 * f7) / this.f2144l[0] : (f5 * this.f2142j) / this.f2144l[1]), 1.0f), 0.0f);
        if (fMax != this.f2147o.getProgress()) {
            this.f2147o.setProgress(fMax);
        }
    }

    public void p(float f4, float f5) {
        this.f2143k = false;
        float progress = this.f2147o.getProgress();
        this.f2147o.m0(this.f2136d, progress, this.f2140h, this.f2139g, this.f2144l);
        float f6 = this.f2141i;
        float[] fArr = this.f2144l;
        float f7 = f6 != 0.0f ? (f4 * f6) / fArr[0] : (f5 * this.f2142j) / fArr[1];
        if (!Float.isNaN(f7)) {
            progress += f7 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z3 = progress != 1.0f;
            int i4 = this.f2135c;
            if ((i4 != 3) && z3) {
                this.f2147o.F0(i4, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f7);
            }
        }
    }

    public void q(int i4) {
        this.f2136d = i4;
    }

    public void r(float f4, float f5) {
        this.f2145m = f4;
        this.f2146n = f5;
    }

    public void s(float f4) {
        this.f2149q = f4;
    }

    public void t(float f4) {
        this.f2148p = f4;
    }

    public String toString() {
        return this.f2141i + " , " + this.f2142j;
    }

    public void u(boolean z3) {
        if (z3) {
            float[][] fArr = f2131y;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2130x;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2131y;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2130x;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f2130x[this.f2133a];
        this.f2140h = fArr5[0];
        this.f2139g = fArr5[1];
        float[] fArr6 = f2131y[this.f2134b];
        this.f2141i = fArr6[0];
        this.f2142j = fArr6[1];
    }

    public void v(float f4, float f5) {
        this.f2140h = f4;
        this.f2139g = f5;
    }

    public void w(float f4, float f5) {
        this.f2145m = f4;
        this.f2146n = f5;
        this.f2143k = false;
    }

    public void x() {
        View viewFindViewById;
        int i4 = this.f2136d;
        if (i4 != -1) {
            viewFindViewById = this.f2147o.findViewById(i4);
            if (viewFindViewById == null) {
                Log.e(f2128v, "cannot find TouchAnchorId @id/" + r.c.i(this.f2147o.getContext(), this.f2136d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new C0014b());
        }
    }
}
