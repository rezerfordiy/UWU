package i0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import c.j0;
import c.k0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Context, a> f8050b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8051c = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8052a;

    public a(Context context) {
        this.f8052a = context;
    }

    @j0
    public static a d(@j0 Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f8050b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @k0
    public Display a(int i4) {
        return ((DisplayManager) this.f8052a.getSystemService("display")).getDisplay(i4);
    }

    @j0
    public Display[] b() {
        return ((DisplayManager) this.f8052a.getSystemService("display")).getDisplays();
    }

    @j0
    public Display[] c(@k0 String str) {
        return ((DisplayManager) this.f8052a.getSystemService("display")).getDisplays(str);
    }
}
