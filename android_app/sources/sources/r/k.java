package r;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class k extends l {
    public static final String M = "KeyPosition";
    public static final String N = "KeyPosition";
    public static final int O = 2;
    public static final int P = 1;
    public static final int Q = 0;
    public static final int R = 2;
    public static final String S = "percentY";
    public static final String T = "percentX";
    public String A = null;
    public int B = e.f10497f;
    public int C = 0;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public float K = Float.NaN;
    public float L = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10600a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10601b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10602c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10603d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10604e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10605f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10606g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10607h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10608i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10609j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f10610k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f10611l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static SparseIntArray f10612m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10612m = sparseIntArray;
            sparseIntArray.append(e.m.Zb, 1);
            f10612m.append(e.m.Xb, 2);
            f10612m.append(e.m.gc, 3);
            f10612m.append(e.m.Vb, 4);
            f10612m.append(e.m.Wb, 5);
            f10612m.append(e.m.dc, 6);
            f10612m.append(e.m.ec, 7);
            f10612m.append(e.m.Yb, 9);
            f10612m.append(e.m.fc, 8);
            f10612m.append(e.m.cc, 11);
            f10612m.append(e.m.bc, 12);
            f10612m.append(e.m.ac, 10);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(r.k r8, android.content.res.TypedArray r9) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r.k.a.b(r.k, android.content.res.TypedArray):void");
        }
    }

    public k() {
        this.f10519d = 2;
    }

    @Override // r.e
    public void a(HashMap<String, t> map) {
    }

    @Override // r.e
    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, e.m.Ub));
    }

    @Override // r.e
    public void f(String str, Object obj) {
        float fH;
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.A = obj.toString();
                return;
            case "percentWidth":
                this.D = h(obj);
                return;
            case "percentHeight":
                fH = h(obj);
                break;
            case "drawPath":
                this.C = i(obj);
                return;
            case "sizePercent":
                fH = h(obj);
                this.D = fH;
                break;
            case "percentX":
                this.F = h(obj);
                return;
            case "percentY":
                this.G = h(obj);
                return;
            default:
                return;
        }
        this.E = fH;
    }

    @Override // r.l
    public void j(int i4, int i5, float f4, float f5, float f6, float f7) {
        int i6 = this.J;
        if (i6 == 1) {
            p(f4, f5, f6, f7);
        } else if (i6 != 2) {
            o(f4, f5, f6, f7);
        } else {
            q(i4, i5);
        }
    }

    @Override // r.l
    public float k() {
        return this.K;
    }

    @Override // r.l
    public float l() {
        return this.L;
    }

    @Override // r.l
    public boolean m(int i4, int i5, RectF rectF, RectF rectF2, float f4, float f5) {
        j(i4, i5, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f4 - this.K) < 20.0f && Math.abs(f5 - this.L) < 20.0f;
    }

    @Override // r.l
    public void n(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        int i4 = this.J;
        if (i4 == 1) {
            s(rectF, rectF2, f4, f5, strArr, fArr);
        } else if (i4 != 2) {
            r(rectF, rectF2, f4, f5, strArr, fArr);
        } else {
            t(view, rectF, rectF2, f4, f5, strArr, fArr);
        }
    }

    public final void o(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float f10 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f11 = Float.isNaN(this.I) ? 0.0f : this.I;
        float f12 = Float.isNaN(this.G) ? 0.0f : this.G;
        this.K = (int) (f4 + (f10 * f8) + ((Float.isNaN(this.H) ? 0.0f : this.H) * f9));
        this.L = (int) (f5 + (f8 * f11) + (f9 * f12));
    }

    public final void p(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float f10 = this.F;
        float f11 = this.G;
        this.K = f4 + (f8 * f10) + ((-f9) * f11);
        this.L = f5 + (f9 * f10) + (f8 * f11);
    }

    public final void q(int i4, int i5) {
        float f4 = this.F;
        float f5 = 0;
        this.K = ((i4 - 0) * f4) + f5;
        this.L = ((i5 - 0) * f4) + f5;
    }

    public void r(RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = T;
            fArr[0] = (f4 - fCenterX) / fCenterX2;
            strArr[1] = S;
            fArr[1] = (f5 - fCenterY) / fCenterY2;
            return;
        }
        float f6 = (f4 - fCenterX) / fCenterX2;
        if (T.equals(str)) {
            fArr[0] = f6;
            fArr[1] = (f5 - fCenterY) / fCenterY2;
        } else {
            fArr[1] = f6;
            fArr[0] = (f5 - fCenterY) / fCenterY2;
        }
    }

    public void s(RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f6 = fCenterX2 / fHypot;
        float f7 = fCenterY2 / fHypot;
        float f8 = f5 - fCenterY;
        float f9 = f4 - fCenterX;
        float f10 = ((f6 * f8) - (f9 * f7)) / fHypot;
        float f11 = ((f6 * f9) + (f7 * f8)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if (T.equals(str)) {
                fArr[0] = f11;
                fArr[1] = f10;
                return;
            }
            return;
        }
        strArr[0] = T;
        strArr[1] = S;
        fArr[0] = f11;
        fArr[1] = f10;
    }

    public void t(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = T;
            fArr[0] = f4 / width;
            strArr[1] = S;
            fArr[1] = f5 / height;
            return;
        }
        float f6 = f4 / width;
        if (T.equals(str)) {
            fArr[0] = f6;
            fArr[1] = f5 / height;
        } else {
            fArr[1] = f6;
            fArr[0] = f5 / height;
        }
    }
}
