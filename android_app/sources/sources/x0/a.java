package x0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12632c = 0.002f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f12633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f12634b;

    public a(float f4, float f5) {
        this(b(f4, f5));
    }

    public static Path a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        return path;
    }

    public static Path b(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f12633a.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f12633a[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f12633a;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f12634b[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f12634b;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    public a(float f4, float f5, float f6, float f7) {
        this(a(f4, f5, f6, f7));
    }

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i4 = ((int) (length / 0.002f)) + 1;
        this.f12633a = new float[i4];
        this.f12634b = new float[i4];
        float[] fArr = new float[2];
        for (int i5 = 0; i5 < i4; i5++) {
            pathMeasure.getPosTan((i5 * length) / (i4 - 1), fArr, null);
            this.f12633a[i5] = fArr[0];
            this.f12634b[i5] = fArr[1];
        }
    }
}
