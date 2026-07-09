package v0;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12228a = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f12229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f12230c;

    public static class a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f12231b;

        public a(x xVar) {
            this.f12231b = xVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f12231b.onCreateView(view, str, context, attributeSet);
        }

        @c.j0
        public String toString() {
            return getClass().getName() + "{" + this.f12231b + "}";
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f12231b.onCreateView(null, str, context, attributeSet);
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f12230c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f12229b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f12228a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e4);
            }
            f12230c = true;
        }
        Field field = f12229b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e5) {
                Log.e(f12228a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e5);
            }
        }
    }

    @Deprecated
    public static x b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f12231b;
        }
        return null;
    }

    @Deprecated
    public static void c(@c.j0 LayoutInflater layoutInflater, @c.j0 x xVar) {
        layoutInflater.setFactory2(xVar != null ? new a(xVar) : null);
    }

    public static void d(@c.j0 LayoutInflater layoutInflater, @c.j0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
