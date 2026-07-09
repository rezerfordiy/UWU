package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8203a;

    public a(Context context) {
        this.f8203a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f8203a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f8203a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f8203a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f8203a.getResources().getDimensionPixelSize(a.f.f6992k);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f8203a.obtainStyledAttributes(null, a.n.f7348a, a.c.f6809f, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(a.n.f7418o, 0);
        Resources resources = this.f8203a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.f.f6989j));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f8203a.getResources().getBoolean(a.d.f6908a);
    }

    public boolean h() {
        return true;
    }
}
