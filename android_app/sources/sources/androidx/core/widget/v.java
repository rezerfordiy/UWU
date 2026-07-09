package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    @k0
    ColorStateList getSupportButtonTintList();

    @k0
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@k0 ColorStateList colorStateList);

    void setSupportButtonTintMode(@k0 PorterDuff.Mode mode);
}
