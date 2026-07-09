package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import c.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class b1 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1615c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<b1>> f1616d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1618b;

    public b1(@c.j0 Context context) {
        super(context);
        if (!k1.c()) {
            this.f1617a = new d1(this, context.getResources());
            this.f1618b = null;
            return;
        }
        k1 k1Var = new k1(this, context.getResources());
        this.f1617a = k1Var;
        Resources.Theme themeNewTheme = k1Var.newTheme();
        this.f1618b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(@c.j0 Context context) {
        return ((context instanceof b1) || (context.getResources() instanceof d1) || (context.getResources() instanceof k1) || !k1.c()) ? false : true;
    }

    public static Context b(@c.j0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1615c) {
            ArrayList<WeakReference<b1>> arrayList = f1616d;
            if (arrayList == null) {
                f1616d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<b1> weakReference = f1616d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1616d.remove(size);
                    }
                }
                for (int size2 = f1616d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<b1> weakReference2 = f1616d.get(size2);
                    b1 b1Var = weakReference2 != null ? weakReference2.get() : null;
                    if (b1Var != null && b1Var.getBaseContext() == context) {
                        return b1Var;
                    }
                }
            }
            b1 b1Var2 = new b1(context);
            f1616d.add(new WeakReference<>(b1Var2));
            return b1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1617a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1617a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1618b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f1618b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
