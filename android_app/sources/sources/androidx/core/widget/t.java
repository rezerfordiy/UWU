package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import c.b0;
import c.j0;
import c.k0;
import c.m0;
import c.o0;
import c.r0;
import c.v0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import s0.w;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3506a = "TextViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3507b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3508c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f3509d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3510e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f3511f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3512g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f3513h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f3514i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Field f3515j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f3516k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f3517l = 1;

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @o0(26)
    public static class b implements ActionMode.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f3518g = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f3519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f3520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f3521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f3522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3524f = false;

        public b(ActionMode.Callback callback, TextView textView) {
            this.f3519a = callback;
            this.f3520b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        public final boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void f(Menu menu) {
            Context context = this.f3520b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3524f) {
                this.f3524f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3521c = cls;
                    this.f3522d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3523e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3521c = null;
                    this.f3522d = null;
                    this.f3523e = false;
                }
            }
            try {
                Method declaredMethod = (this.f3523e && this.f3521c.isInstance(menu)) ? this.f3522d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i4 = 0; i4 < listC.size(); i4++) {
                    ResolveInfo resolveInfo = listC.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f3520b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3519a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3519a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3519a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f3519a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static void A(@j0 TextView textView, @m0 @b0(from = 0) int i4) {
        u0.i.d(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@j0 TextView textView, @m0 @b0(from = 0) int i4) {
        u0.i.d(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void C(@j0 TextView textView, @m0 @b0(from = 0) int i4) {
        u0.i.d(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static void D(@j0 TextView textView, @j0 s0.w wVar) {
        s0.w wVarF;
        if (Build.VERSION.SDK_INT >= 29) {
            wVarF = wVar.f();
        } else {
            boolean zA = o(textView).a(wVar.e());
            wVarF = wVar;
            if (!zA) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(wVarF);
    }

    public static void E(@j0 TextView textView, @v0 int i4) {
        textView.setTextAppearance(i4);
    }

    public static void F(@j0 TextView textView, @j0 w.a aVar) {
        textView.setTextDirection(m(aVar.d()));
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    @j0
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@j0 TextView textView, @j0 ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof b)) ? callback : new b(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@j0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@j0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@j0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j0
    public static int[] d(@j0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? textView.getAutoSizeTextAvailableSizes() : textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@j0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @k0
    public static ColorStateList f(@j0 TextView textView) {
        u0.i.g(textView);
        return textView.getCompoundDrawableTintList();
    }

    @k0
    public static PorterDuff.Mode g(@j0 TextView textView) {
        u0.i.g(textView);
        return textView.getCompoundDrawableTintMode();
    }

    @j0
    public static Drawable[] h(@j0 TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(@j0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@j0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@j0 TextView textView) {
        return textView.getMaxLines();
    }

    public static int l(@j0 TextView textView) {
        return textView.getMinLines();
    }

    @o0(18)
    public static int m(@j0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @o0(18)
    public static TextDirectionHeuristic n(@j0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z3 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z3) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    @j0
    public static w.a o(@j0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new w.a(textView.getTextMetricsParams());
        }
        w.a.C0109a c0109a = new w.a.C0109a(new TextPaint(textView.getPaint()));
        c0109a.b(textView.getBreakStrategy());
        c0109a.c(textView.getHyphenationFrequency());
        c0109a.d(n(textView));
        return c0109a.a();
    }

    public static Field p(String str) {
        Field declaredField = null;
        try {
            declaredField = TextView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Log.e(f3506a, "Could not retrieve " + str + " field.");
            return declaredField;
        }
    }

    public static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f3506a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@j0 TextView textView, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@j0 TextView textView, @j0 int[] iArr, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@j0 TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    public static void u(@j0 TextView textView, @k0 ColorStateList colorStateList) {
        u0.i.g(textView);
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void v(@j0 TextView textView, @k0 PorterDuff.Mode mode) {
        u0.i.g(textView);
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void w(@j0 TextView textView, @k0 Drawable drawable, @k0 Drawable drawable2, @k0 Drawable drawable3, @k0 Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@j0 TextView textView, @c.s int i4, @c.s int i5, @c.s int i6, @c.s int i7) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    public static void y(@j0 TextView textView, @k0 Drawable drawable, @k0 Drawable drawable2, @k0 Drawable drawable3, @k0 Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@j0 TextView textView, @j0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }
}
