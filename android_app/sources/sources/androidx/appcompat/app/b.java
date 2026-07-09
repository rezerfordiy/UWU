package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f928a = "ActionBarDrawerToggleHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f929b = {R.attr.homeAsUpIndicator};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f932c;

        public a(Activity activity) {
            try {
                this.f930a = android.app.ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f931b = android.app.ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f932c = (ImageView) childAt;
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f929b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i4) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f930a != null) {
            try {
                aVar.f931b.invoke(activity.getActionBar(), Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.w(f928a, "Couldn't set content description via JB-MR2 API", e4);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i4) {
        a aVar = new a(activity);
        if (aVar.f930a != null) {
            try {
                android.app.ActionBar actionBar = activity.getActionBar();
                aVar.f930a.invoke(actionBar, drawable);
                aVar.f931b.invoke(actionBar, Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.w(f928a, "Couldn't set home-as-up indicator via JB-MR2 API", e4);
            }
        } else {
            ImageView imageView = aVar.f932c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f928a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}
