package x0;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Interpolator a(float f4, float f5) {
        return new PathInterpolator(f4, f5);
    }

    public static Interpolator b(float f4, float f5, float f6, float f7) {
        return new PathInterpolator(f4, f5, f6, f7);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
