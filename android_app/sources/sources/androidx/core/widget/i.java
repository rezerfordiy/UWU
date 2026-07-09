package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    @k0
    public static View.OnTouchListener a(@j0 Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
