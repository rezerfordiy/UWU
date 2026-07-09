package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public interface w {
    @k0
    ColorStateList getSupportCompoundDrawablesTintList();

    @k0
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@k0 ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@k0 PorterDuff.Mode mode);
}
