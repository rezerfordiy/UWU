package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import c.j0;
import c.k0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3494a = "CompoundButtonCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f3495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3496c;

    @k0
    public static Drawable a(@j0 CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    @k0
    public static ColorStateList b(@j0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @k0
    public static PorterDuff.Mode c(@j0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void d(@j0 CompoundButton compoundButton, @k0 ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void e(@j0 CompoundButton compoundButton, @k0 PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
