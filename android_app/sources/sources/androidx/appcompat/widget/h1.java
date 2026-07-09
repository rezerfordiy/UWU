package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h1 {
    public static void a(@c.j0 View view, @c.k0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            i1.f(view, charSequence);
        }
    }
}
