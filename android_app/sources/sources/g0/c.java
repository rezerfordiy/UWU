package g0;

import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class c {
    @c.k0
    public static ColorFilter a(int i4, @c.j0 d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode blendModeA = h0.a(dVar);
            if (blendModeA != null) {
                return b.a(i4, blendModeA);
            }
            return null;
        }
        PorterDuff.Mode modeB = h0.b(dVar);
        if (modeB != null) {
            return new PorterDuffColorFilter(i4, modeB);
        }
        return null;
    }
}
