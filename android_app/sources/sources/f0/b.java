package f0;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static void a(@j0 SQLiteCursor sQLiteCursor, boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            sQLiteCursor.setFillWindowForwardOnly(z3);
        }
    }
}
