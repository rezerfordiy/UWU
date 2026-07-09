package v0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    @SuppressLint({"NewApi"})
    public static void a(Menu menu, boolean z3) {
        if (menu instanceof l0.a) {
            ((l0.a) menu).setGroupDividerEnabled(z3);
        } else if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z3);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }
}
