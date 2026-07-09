package y1;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12829b;

    public c(PointF pointF, float f4) {
        this.f12828a = f4;
        this.f12829b = pointF.y - (f4 * pointF.x);
    }

    public float a() {
        return this.f12829b;
    }

    public float b() {
        return this.f12828a;
    }

    public float c(float f4) {
        return (f4 - this.f12829b) / this.f12828a;
    }

    public float d(float f4) {
        return (this.f12828a * f4) + this.f12829b;
    }
}
