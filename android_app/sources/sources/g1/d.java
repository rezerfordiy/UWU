package g1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f7834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7835b;

    public d(float[] fArr) {
        this.f7834a = fArr;
        this.f7835b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f7834a;
        int iMin = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f5 = this.f7835b;
        float f6 = (f4 - (iMin * f5)) / f5;
        float[] fArr2 = this.f7834a;
        float f7 = fArr2[iMin];
        return f7 + (f6 * (fArr2[iMin + 1] - f7));
    }
}
