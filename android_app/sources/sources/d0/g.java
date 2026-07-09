package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import c.j0;
import c.k0;
import c.l;
import c.n;
import c.o0;
import c.p;
import c.r0;
import c.s;
import c.u;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6601a = "ResourcesCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @c.c
    public static final int f6602b = 0;

    public static abstract class a {

        /* JADX INFO: renamed from: d0.g$a$a, reason: collision with other inner class name */
        public class RunnableC0054a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Typeface f6603b;

            public RunnableC0054a(Typeface typeface) {
                this.f6603b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e(this.f6603b);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f6605b;

            public b(int i4) {
                this.f6605b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f6605b);
            }
        }

        @j0
        @r0({r0.a.LIBRARY})
        public static Handler c(@k0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public final void a(int i4, @k0 Handler handler) {
            c(handler).post(new b(i4));
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public final void b(Typeface typeface, @k0 Handler handler) {
            c(handler).post(new RunnableC0054a(typeface));
        }

        public abstract void d(int i4);

        public abstract void e(@j0 Typeface typeface);
    }

    public static final class b {

        @o0(23)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f6607a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f6608b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f6609c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void a(@c.j0 android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = d0.g.b.a.f6607a
                    monitor-enter(r0)
                    boolean r1 = d0.g.b.a.f6609c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    d0.g.b.a.f6608b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    d0.g.b.a.f6609c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = d0.g.b.a.f6608b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    d0.g.b.a.f6608b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: d0.g.b.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: d0.g$b$b, reason: collision with other inner class name */
        @o0(29)
        public static class C0055b {
            public static void a(@j0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@j0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0055b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    @k0
    public static Typeface a(@j0 Context context, @u int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, i4, new TypedValue(), 0, null, null, false, true);
    }

    @l
    public static int b(@j0 Resources resources, @n int i4, @k0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i4, theme);
    }

    @k0
    public static ColorStateList c(@j0 Resources resources, @n int i4, @k0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColorStateList(i4, theme);
    }

    @k0
    public static Drawable d(@j0 Resources resources, @s int i4, @k0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i4, theme);
    }

    @k0
    public static Drawable e(@j0 Resources resources, @s int i4, int i5, @k0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i4, i5, theme);
    }

    public static float f(@j0 Resources resources, @p int i4) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i4, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @k0
    public static Typeface g(@j0 Context context, @u int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, i4, new TypedValue(), 0, null, null, false, false);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface h(@j0 Context context, @u int i4, TypedValue typedValue, int i5, @k0 a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, i4, typedValue, i5, aVar, null, true, false);
    }

    public static void i(@j0 Context context, @u int i4, @j0 a aVar, @k0 Handler handler) throws Resources.NotFoundException {
        u0.i.g(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            j(context, i4, new TypedValue(), 0, aVar, handler, false, false);
        }
    }

    public static Typeface j(@j0 Context context, int i4, TypedValue typedValue, int i5, @k0 a aVar, @k0 Handler handler, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface typefaceK = k(context, resources, typedValue, i4, i5, aVar, handler, z3, z4);
        if (typefaceK != null || aVar != null || z4) {
            return typefaceK;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface k(@c.j0 android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, @c.k0 d0.g.a r20, @c.k0 android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, d0.g$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
