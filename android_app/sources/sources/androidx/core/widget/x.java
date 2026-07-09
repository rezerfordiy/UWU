package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import c.k0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface x {
    @k0
    ColorStateList getSupportImageTintList();

    @k0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@k0 ColorStateList colorStateList);

    void setSupportImageTintMode(@k0 PorterDuff.Mode mode);
}
