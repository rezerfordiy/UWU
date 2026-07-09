package g0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int a(@c.j0 Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean b(@c.j0 Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void c(@c.j0 Bitmap bitmap, boolean z3) {
        bitmap.setHasMipMap(z3);
    }
}
