package v0;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12078a = 3840;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12079b = 2160;

    @c.o0(17)
    public static class a {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @c.o0(23)
    public static class b {
        @c.j0
        public static c a(@c.j0 Context context, @c.j0 Display display) {
            Display.Mode mode = display.getMode();
            Point pointA = d.a(context, display);
            return (pointA == null || d(mode, pointA)) ? new c(mode, true) : new c(mode, pointA);
        }

        @SuppressLint({"ArrayReturn"})
        @c.j0
        public static c[] b(@c.j0 Context context, @c.j0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointA = d.a(context, display);
            if (pointA == null || d(mode, pointA)) {
                for (int i4 = 0; i4 < supportedModes.length; i4++) {
                    cVarArr[i4] = new c(supportedModes[i4], e(supportedModes[i4], mode));
                }
            } else {
                for (int i5 = 0; i5 < supportedModes.length; i5++) {
                    cVarArr[i5] = e(supportedModes[i5], mode) ? new c(supportedModes[i5], pointA) : new c(supportedModes[i5], false);
                }
            }
            return cVarArr;
        }

        public static boolean c(@c.j0 Display display) {
            Display.Mode mode = display.getMode();
            Display.Mode[] supportedModes = display.getSupportedModes();
            for (int i4 = 0; i4 < supportedModes.length; i4++) {
                if (mode.getPhysicalHeight() < supportedModes[i4].getPhysicalHeight() || mode.getPhysicalWidth() < supportedModes[i4].getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Display.Mode f12080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Point f12081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12082c;

        public c(@c.j0 Point point) {
            u0.i.h(point, "physicalSize == null");
            this.f12081b = point;
            this.f12080a = null;
            this.f12082c = true;
        }

        public int a() {
            return this.f12081b.y;
        }

        public int b() {
            return this.f12081b.x;
        }

        public boolean c() {
            return this.f12082c;
        }

        @c.k0
        @c.o0(23)
        public Display.Mode d() {
            return this.f12080a;
        }

        @c.o0(23)
        public c(@c.j0 Display.Mode mode, @c.j0 Point point) {
            u0.i.h(mode, "mode == null, can't wrap a null reference");
            u0.i.h(point, "physicalSize == null");
            this.f12081b = point;
            this.f12080a = mode;
            this.f12082c = true;
        }

        @c.o0(23)
        public c(@c.j0 Display.Mode mode, boolean z3) {
            u0.i.h(mode, "mode == null, can't wrap a null reference");
            this.f12081b = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.f12080a = mode;
            this.f12082c = z3;
        }
    }

    public static Point a(@c.j0 Context context, @c.j0 Display display) {
        Point pointJ = j(Build.VERSION.SDK_INT < 28 ? "sys.display-size" : "vendor.display-size", display);
        if (pointJ != null) {
            return pointJ;
        }
        if (g(context) && f(display)) {
            return new Point(f12078a, f12079b);
        }
        return null;
    }

    @c.j0
    public static Point b(@c.j0 Context context, @c.j0 Display display) {
        Point pointA = a(context, display);
        if (pointA != null) {
            return pointA;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @c.j0
    @c.z0
    public static c c(@c.j0 Context context, @c.j0 Display display) {
        return b.a(context, display);
    }

    @SuppressLint({"ArrayReturn"})
    @c.j0
    public static c[] d(@c.j0 Context context, @c.j0 Display display) {
        return b.b(context, display);
    }

    @c.k0
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@c.j0 Display display) {
        return b.c(display);
    }

    public static boolean g(@c.j0 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static boolean h(@c.j0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point i(@c.j0 String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i4 = Integer.parseInt(strArrSplit[0]);
            int i5 = Integer.parseInt(strArrSplit[1]);
            if (i4 > 0 && i5 > 0) {
                return new Point(i4, i5);
            }
        }
        throw new NumberFormatException();
    }

    @c.k0
    public static Point j(@c.j0 String str, @c.j0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return i(strE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
