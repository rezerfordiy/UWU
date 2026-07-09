package g0;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f7817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7818d;

    public v0(@c.j0 PointF pointF, float f4, @c.j0 PointF pointF2, float f5) {
        this.f7815a = (PointF) u0.i.h(pointF, "start == null");
        this.f7816b = f4;
        this.f7817c = (PointF) u0.i.h(pointF2, "end == null");
        this.f7818d = f5;
    }

    @c.j0
    public PointF a() {
        return this.f7817c;
    }

    public float b() {
        return this.f7818d;
    }

    @c.j0
    public PointF c() {
        return this.f7815a;
    }

    public float d() {
        return this.f7816b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Float.compare(this.f7816b, v0Var.f7816b) == 0 && Float.compare(this.f7818d, v0Var.f7818d) == 0 && this.f7815a.equals(v0Var.f7815a) && this.f7817c.equals(v0Var.f7817c);
    }

    public int hashCode() {
        int iHashCode = this.f7815a.hashCode() * 31;
        float f4 = this.f7816b;
        int iFloatToIntBits = (((iHashCode + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31) + this.f7817c.hashCode()) * 31;
        float f5 = this.f7818d;
        return iFloatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f7815a + ", startFraction=" + this.f7816b + ", end=" + this.f7817c + ", endFraction=" + this.f7818d + '}';
    }
}
