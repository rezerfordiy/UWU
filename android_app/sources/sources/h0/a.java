package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c.j0;
import c.k0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7994a = "DrawableCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f7995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f7997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f7998e;

    public static void a(@j0 Drawable drawable, @j0 Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(@j0 Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void c(@j0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@j0 Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(@j0 Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int f(@j0 Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void g(@j0 Drawable drawable, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@j0 Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(@j0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@j0 Drawable drawable, boolean z3) {
        drawable.setAutoMirrored(z3);
    }

    public static void k(@j0 Drawable drawable, float f4, float f5) {
        drawable.setHotspot(f4, f5);
    }

    public static void l(@j0 Drawable drawable, int i4, int i5, int i6, int i7) {
        drawable.setHotspotBounds(i4, i5, i6, i7);
    }

    public static boolean m(@j0 Drawable drawable, int i4) {
        return drawable.setLayoutDirection(i4);
    }

    public static void n(@j0 Drawable drawable, @c.l int i4) {
        drawable.setTint(i4);
    }

    public static void o(@j0 Drawable drawable, @k0 ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void p(@j0 Drawable drawable, @j0 PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@j0 Drawable drawable) {
        return drawable instanceof n ? (T) ((n) drawable).a() : drawable;
    }

    public static Drawable r(@j0 Drawable drawable) {
        return drawable;
    }
}
