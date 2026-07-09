package a0;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class l {
    @c.j0
    public static View a(@c.j0 Dialog dialog, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(i4);
        }
        View viewFindViewById = dialog.findViewById(i4);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
