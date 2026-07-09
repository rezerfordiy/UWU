package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.r0;
import c.j0;
import c.k0;
import c.n;
import c.s;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7622a = "AppCompatResources";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f7623b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0061a>> f7624c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7625d = new Object();

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    public static class C0061a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f7626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f7627b;

        public C0061a(@j0 ColorStateList colorStateList, @j0 Configuration configuration) {
            this.f7626a = colorStateList;
            this.f7627b = configuration;
        }
    }

    public static void a(@j0 Context context, @n int i4, @j0 ColorStateList colorStateList) {
        synchronized (f7625d) {
            WeakHashMap<Context, SparseArray<C0061a>> weakHashMap = f7624c;
            SparseArray<C0061a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i4, new C0061a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    @k0
    public static ColorStateList b(@j0 Context context, @n int i4) {
        C0061a c0061a;
        synchronized (f7625d) {
            SparseArray<C0061a> sparseArray = f7624c.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0061a = sparseArray.get(i4)) != null) {
                if (c0061a.f7627b.equals(context.getResources().getConfiguration())) {
                    return c0061a.f7626a;
                }
                sparseArray.remove(i4);
            }
            return null;
        }
    }

    public static ColorStateList c(@j0 Context context, @n int i4) {
        return context.getColorStateList(i4);
    }

    @k0
    public static Drawable d(@j0 Context context, @s int i4) {
        return r0.h().j(context, i4);
    }

    @j0
    public static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f7623b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @k0
    public static ColorStateList f(Context context, int i4) {
        if (g(context, i4)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return d0.a.a(resources, resources.getXml(i4), context.getTheme());
        } catch (Exception e4) {
            Log.e(f7622a, "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    public static boolean g(@j0 Context context, @n int i4) {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(i4, typedValueE, true);
        int i5 = typedValueE.type;
        return i5 >= 28 && i5 <= 31;
    }
}
