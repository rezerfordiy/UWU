package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class e {
    @k0
    public static ColorStateList a(@j0 ImageView imageView) {
        return imageView.getImageTintList();
    }

    @k0
    public static PorterDuff.Mode b(@j0 ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(@j0 ImageView imageView, @k0 ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(@j0 ImageView imageView, @k0 PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
