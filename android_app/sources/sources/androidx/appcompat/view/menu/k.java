package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface k {

    public interface a {
        void b(boolean z3, char c4);

        boolean d();

        boolean e();

        void f(h hVar, int i4);

        h getItemData();

        void setCheckable(boolean z3);

        void setChecked(boolean z3);

        void setEnabled(boolean z3);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void b(e eVar);

    int getWindowAnimations();
}
