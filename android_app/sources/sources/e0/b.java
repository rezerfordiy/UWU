package e0;

import android.database.CursorWindow;
import android.os.Build;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    @j0
    public static CursorWindow a(@k0 String str, long j4) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(str, j4) : new CursorWindow(str);
    }
}
