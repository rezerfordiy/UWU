package s1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import c.r0;
import g0.u0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class g implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11226c = 0.002f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11227d = 3000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f11228e = 1.0E-5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f11230b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i4 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f11229a = new float[iMin];
        this.f11230b = new float[iMin];
        float[] fArr = new float[2];
        for (int i5 = 0; i5 < iMin; i5++) {
            pathMeasure.getPosTan((i5 * length) / (iMin - 1), fArr, null);
            this.f11229a[i5] = fArr[0];
            this.f11230b[i5] = fArr[1];
        }
        if (Math.abs(this.f11229a[0]) <= 1.0E-5d && Math.abs(this.f11230b[0]) <= 1.0E-5d) {
            int i6 = iMin - 1;
            if (Math.abs(this.f11229a[i6] - 1.0f) <= 1.0E-5d && Math.abs(this.f11230b[i6] - 1.0f) <= 1.0E-5d) {
                float f4 = 0.0f;
                int i7 = 0;
                while (i4 < iMin) {
                    float[] fArr2 = this.f11229a;
                    int i8 = i7 + 1;
                    float f5 = fArr2[i7];
                    if (f5 < f4) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f5);
                    }
                    fArr2[i4] = f5;
                    i4++;
                    f4 = f5;
                    i7 = i8;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f11229a[0]);
        sb.append(",");
        sb.append(this.f11230b[0]);
        sb.append(" end:");
        int i9 = iMin - 1;
        sb.append(this.f11229a[i9]);
        sb.append(",");
        sb.append(this.f11230b[i9]);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (d0.i.r(xmlPullParser, "pathData")) {
            String strM = d0.i.m(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = u0.e(strM);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM);
        }
        if (!d0.i.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!d0.i.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fJ = d0.i.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fJ2 = d0.i.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zR = d0.i.r(xmlPullParser, "controlX2");
        if (zR != d0.i.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zR) {
            a(fJ, fJ2, d0.i.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), d0.i.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(fJ, fJ2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f11229a.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f11229a[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f11229a;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f11230b[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f11230b;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, a.f11177r0);
        d(typedArrayS, xmlPullParser);
        typedArrayS.recycle();
    }
}
