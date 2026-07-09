package androidx.core.widget;

import android.widget.ListView;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static boolean a(@j0 ListView listView, int i4) {
        return listView.canScrollList(i4);
    }

    public static void b(@j0 ListView listView, int i4) {
        listView.scrollListBy(i4);
    }
}
