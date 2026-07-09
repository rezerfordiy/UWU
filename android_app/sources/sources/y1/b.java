package y1;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12827b;

    public b(PointF pointF, PointF pointF2) {
        float f4 = pointF2.y;
        float f5 = pointF.y;
        float f6 = pointF2.x;
        float f7 = pointF.x;
        float f8 = (f4 - f5) / (f6 - f7);
        this.f12826a = f8;
        this.f12827b = f5 - (f8 * f7);
    }

    public float a() {
        return this.f12827b;
    }

    public float b() {
        return this.f12826a;
    }

    public float c(float f4) {
        return (f4 - this.f12827b) / this.f12826a;
    }

    public float d(float f4) {
        return (this.f12826a * f4) + this.f12827b;
    }
}
