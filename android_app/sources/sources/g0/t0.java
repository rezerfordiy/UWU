package g0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7807a = "\udfffd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7808b = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<u0.f<Rect, Rect>> f7809c = new ThreadLocal<>();

    public static boolean a(@c.j0 Paint paint, @c.j0 String str) {
        return paint.hasGlyph(str);
    }

    public static u0.f<Rect, Rect> b() {
        ThreadLocal<u0.f<Rect, Rect>> threadLocal = f7809c;
        u0.f<Rect, Rect> fVar = threadLocal.get();
        if (fVar == null) {
            u0.f<Rect, Rect> fVar2 = new u0.f<>(new Rect(), new Rect());
            threadLocal.set(fVar2);
            return fVar2;
        }
        fVar.f11560a.setEmpty();
        fVar.f11561b.setEmpty();
        return fVar;
    }

    public static boolean c(@c.j0 Paint paint, @c.k0 d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(dVar != null ? h0.a(dVar) : null);
            return true;
        }
        if (dVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeB = h0.b(dVar);
        paint.setXfermode(modeB != null ? new PorterDuffXfermode(modeB) : null);
        return modeB != null;
    }
}
