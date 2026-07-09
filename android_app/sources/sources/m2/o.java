package m2;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8838a = 100000.0f;

    public static float a(float f4) {
        return (float) (Math.asin((((double) f4) / 2.0d) / 100000.0d) * 2.0d);
    }

    public static n b(float f4, float f5, float f6, int i4, int i5, int i6) {
        return new p(f4, f5, f6, i4, i5, i6);
    }

    public static n c(float f4, float f5, int i4, int i5, int i6, int i7, float[] fArr) {
        return b(100000.0f, a(f4), f5, i4, i5, i6);
    }
}
