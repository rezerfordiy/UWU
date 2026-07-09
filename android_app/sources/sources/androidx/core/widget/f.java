package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    @k0
    public static View.OnTouchListener a(@j0 ListPopupWindow listPopupWindow, @j0 View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
