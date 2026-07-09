package v0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12031b = "WindowInsetsCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @c.j0
    public static final c4 f12032c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12033a;

    @c.o0(21)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f12034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f12035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f12036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f12037d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f12034a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f12035b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f12036c = declaredField3;
                declaredField3.setAccessible(true);
                f12037d = true;
            } catch (ReflectiveOperationException e4) {
                Log.w(c4.f12031b, "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }

        @c.k0
        public static c4 a(@c.j0 View view) {
            if (f12037d && view.isAttachedToWindow()) {
                try {
                    Object obj = f12034a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f12035b.get(obj);
                        Rect rect2 = (Rect) f12036c.get(obj);
                        if (rect != null && rect2 != null) {
                            c4 c4VarA = new b().f(g0.r0.e(rect)).h(g0.r0.e(rect2)).a();
                            c4VarA.H(c4VarA);
                            c4VarA.d(view.getRootView());
                            return c4VarA;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    Log.w(c4.f12031b, "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f12038a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            this.f12038a = i4 >= 30 ? new e() : i4 >= 29 ? new d() : new c();
        }

        @c.j0
        public c4 a() {
            return this.f12038a.b();
        }

        @c.j0
        public b b(@c.k0 p pVar) {
            this.f12038a.c(pVar);
            return this;
        }

        @c.j0
        public b c(int i4, @c.j0 g0.r0 r0Var) {
            this.f12038a.d(i4, r0Var);
            return this;
        }

        @c.j0
        public b d(int i4, @c.j0 g0.r0 r0Var) {
            this.f12038a.e(i4, r0Var);
            return this;
        }

        @c.j0
        @Deprecated
        public b e(@c.j0 g0.r0 r0Var) {
            this.f12038a.f(r0Var);
            return this;
        }

        @c.j0
        @Deprecated
        public b f(@c.j0 g0.r0 r0Var) {
            this.f12038a.g(r0Var);
            return this;
        }

        @c.j0
        @Deprecated
        public b g(@c.j0 g0.r0 r0Var) {
            this.f12038a.h(r0Var);
            return this;
        }

        @c.j0
        @Deprecated
        public b h(@c.j0 g0.r0 r0Var) {
            this.f12038a.i(r0Var);
            return this;
        }

        @c.j0
        @Deprecated
        public b i(@c.j0 g0.r0 r0Var) {
            this.f12038a.j(r0Var);
            return this;
        }

        @c.j0
        public b j(int i4, boolean z3) {
            this.f12038a.k(i4, z3);
            return this;
        }

        public b(@c.j0 c4 c4Var) {
            int i4 = Build.VERSION.SDK_INT;
            this.f12038a = i4 >= 30 ? new e(c4Var) : i4 >= 29 ? new d(c4Var) : new c(c4Var);
        }
    }

    @c.o0(api = 20)
    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f12039e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f12040f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f12041g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f12042h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f12043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g0.r0 f12044d;

        public c() {
            this.f12043c = l();
        }

        @c.k0
        private static WindowInsets l() {
            if (!f12040f) {
                try {
                    f12039e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i(c4.f12031b, "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f12040f = true;
            }
            Field field = f12039e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e5) {
                    Log.i(c4.f12031b, "Could not get value from WindowInsets.CONSUMED field", e5);
                }
            }
            if (!f12042h) {
                try {
                    f12041g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e6) {
                    Log.i(c4.f12031b, "Could not retrieve WindowInsets(Rect) constructor", e6);
                }
                f12042h = true;
            }
            Constructor<WindowInsets> constructor = f12041g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e7) {
                    Log.i(c4.f12031b, "Could not invoke WindowInsets(Rect) constructor", e7);
                }
            }
            return null;
        }

        @Override // v0.c4.f
        @c.j0
        public c4 b() {
            a();
            c4 c4VarK = c4.K(this.f12043c);
            c4VarK.F(this.f12047b);
            c4VarK.I(this.f12044d);
            return c4VarK;
        }

        @Override // v0.c4.f
        public void g(@c.k0 g0.r0 r0Var) {
            this.f12044d = r0Var;
        }

        @Override // v0.c4.f
        public void i(@c.j0 g0.r0 r0Var) {
            WindowInsets windowInsets = this.f12043c;
            if (windowInsets != null) {
                this.f12043c = windowInsets.replaceSystemWindowInsets(r0Var.f7803a, r0Var.f7804b, r0Var.f7805c, r0Var.f7806d);
            }
        }

        public c(@c.j0 c4 c4Var) {
            this.f12043c = c4Var.J();
        }
    }

    @c.o0(api = 29)
    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f12045c;

        public d() {
            this.f12045c = k4.a();
        }

        @Override // v0.c4.f
        @c.j0
        public c4 b() {
            a();
            c4 c4VarK = c4.K(this.f12045c.build());
            c4VarK.F(this.f12047b);
            return c4VarK;
        }

        @Override // v0.c4.f
        public void c(@c.k0 p pVar) {
            this.f12045c.setDisplayCutout(pVar != null ? pVar.h() : null);
        }

        @Override // v0.c4.f
        public void f(@c.j0 g0.r0 r0Var) {
            this.f12045c.setMandatorySystemGestureInsets(r0Var.h());
        }

        @Override // v0.c4.f
        public void g(@c.j0 g0.r0 r0Var) {
            this.f12045c.setStableInsets(r0Var.h());
        }

        @Override // v0.c4.f
        public void h(@c.j0 g0.r0 r0Var) {
            this.f12045c.setSystemGestureInsets(r0Var.h());
        }

        @Override // v0.c4.f
        public void i(@c.j0 g0.r0 r0Var) {
            this.f12045c.setSystemWindowInsets(r0Var.h());
        }

        @Override // v0.c4.f
        public void j(@c.j0 g0.r0 r0Var) {
            this.f12045c.setTappableElementInsets(r0Var.h());
        }

        public d(@c.j0 c4 c4Var) {
            WindowInsets windowInsetsJ = c4Var.J();
            this.f12045c = windowInsetsJ != null ? l4.a(windowInsetsJ) : k4.a();
        }
    }

    @c.o0(30)
    public static class e extends d {
        public e() {
        }

        @Override // v0.c4.f
        public void d(int i4, @c.j0 g0.r0 r0Var) {
            this.f12045c.setInsets(n.a(i4), r0Var.h());
        }

        @Override // v0.c4.f
        public void e(int i4, @c.j0 g0.r0 r0Var) {
            this.f12045c.setInsetsIgnoringVisibility(n.a(i4), r0Var.h());
        }

        @Override // v0.c4.f
        public void k(int i4, boolean z3) {
            this.f12045c.setVisible(n.a(i4), z3);
        }

        public e(@c.j0 c4 c4Var) {
            super(c4Var);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4 f12046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g0.r0[] f12047b;

        public f() {
            this(new c4((c4) null));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r3 = this;
                g0.r0[] r0 = r3.f12047b
                if (r0 == 0) goto L55
                r1 = 1
                int r1 = v0.c4.m.e(r1)
                r0 = r0[r1]
                g0.r0[] r1 = r3.f12047b
                r2 = 2
                int r2 = v0.c4.m.e(r2)
                r1 = r1[r2]
                if (r0 == 0) goto L1d
                if (r1 == 0) goto L1d
                g0.r0 r0 = g0.r0.b(r0, r1)
                goto L1f
            L1d:
                if (r0 == 0) goto L23
            L1f:
                r3.i(r0)
                goto L28
            L23:
                if (r1 == 0) goto L28
                r3.i(r1)
            L28:
                g0.r0[] r0 = r3.f12047b
                r1 = 16
                int r1 = v0.c4.m.e(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L37
                r3.h(r0)
            L37:
                g0.r0[] r0 = r3.f12047b
                r1 = 32
                int r1 = v0.c4.m.e(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L46
                r3.f(r0)
            L46:
                g0.r0[] r0 = r3.f12047b
                r1 = 64
                int r1 = v0.c4.m.e(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L55
                r3.j(r0)
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.c4.f.a():void");
        }

        @c.j0
        public c4 b() {
            a();
            return this.f12046a;
        }

        public void c(@c.k0 p pVar) {
        }

        public void d(int i4, @c.j0 g0.r0 r0Var) {
            if (this.f12047b == null) {
                this.f12047b = new g0.r0[9];
            }
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    this.f12047b[m.e(i5)] = r0Var;
                }
            }
        }

        public void e(int i4, @c.j0 g0.r0 r0Var) {
            if (i4 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void f(@c.j0 g0.r0 r0Var) {
        }

        public void g(@c.j0 g0.r0 r0Var) {
        }

        public void h(@c.j0 g0.r0 r0Var) {
        }

        public void i(@c.j0 g0.r0 r0Var) {
        }

        public void j(@c.j0 g0.r0 r0Var) {
        }

        public void k(int i4, boolean z3) {
        }

        public f(@c.j0 c4 c4Var) {
            this.f12046a = c4Var;
        }
    }

    @c.o0(20)
    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f12048h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f12049i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class<?> f12050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Class<?> f12051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f12052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static Field f12053m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @c.j0
        public final WindowInsets f12054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g0.r0[] f12055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0.r0 f12056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c4 f12057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public g0.r0 f12058g;

        public g(@c.j0 c4 c4Var, @c.j0 WindowInsets windowInsets) {
            super(c4Var);
            this.f12056e = null;
            this.f12054c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f12049i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f12050j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f12051k = cls;
                f12052l = cls.getDeclaredField("mVisibleInsets");
                f12053m = f12050j.getDeclaredField("mAttachInfo");
                f12052l.setAccessible(true);
                f12053m.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e(c4.f12031b, "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f12048h = true;
        }

        @SuppressLint({"WrongConstant"})
        @c.j0
        private g0.r0 v(int i4, boolean z3) {
            g0.r0 r0VarB = g0.r0.f7802e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    r0VarB = g0.r0.b(r0VarB, w(i5, z3));
                }
            }
            return r0VarB;
        }

        private g0.r0 x() {
            c4 c4Var = this.f12057f;
            return c4Var != null ? c4Var.m() : g0.r0.f7802e;
        }

        @c.k0
        private g0.r0 y(@c.j0 View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f12048h) {
                A();
            }
            Method method = f12049i;
            if (method != null && f12051k != null && f12052l != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w(c4.f12031b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f12052l.get(f12053m.get(objInvoke));
                    if (rect != null) {
                        return g0.r0.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e4) {
                    Log.e(c4.f12031b, "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }

        @Override // v0.c4.l
        public void d(@c.j0 View view) {
            g0.r0 r0VarY = y(view);
            if (r0VarY == null) {
                r0VarY = g0.r0.f7802e;
            }
            s(r0VarY);
        }

        @Override // v0.c4.l
        public void e(@c.j0 c4 c4Var) {
            c4Var.H(this.f12057f);
            c4Var.G(this.f12058g);
        }

        @Override // v0.c4.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f12058g, ((g) obj).f12058g);
            }
            return false;
        }

        @Override // v0.c4.l
        @c.j0
        public g0.r0 g(int i4) {
            return v(i4, false);
        }

        @Override // v0.c4.l
        @c.j0
        public g0.r0 h(int i4) {
            return v(i4, true);
        }

        @Override // v0.c4.l
        @c.j0
        public final g0.r0 l() {
            if (this.f12056e == null) {
                this.f12056e = g0.r0.d(this.f12054c.getSystemWindowInsetLeft(), this.f12054c.getSystemWindowInsetTop(), this.f12054c.getSystemWindowInsetRight(), this.f12054c.getSystemWindowInsetBottom());
            }
            return this.f12056e;
        }

        @Override // v0.c4.l
        @c.j0
        public c4 n(int i4, int i5, int i6, int i7) {
            b bVar = new b(c4.K(this.f12054c));
            bVar.h(c4.z(l(), i4, i5, i6, i7));
            bVar.f(c4.z(j(), i4, i5, i6, i7));
            return bVar.a();
        }

        @Override // v0.c4.l
        public boolean p() {
            return this.f12054c.isRound();
        }

        @Override // v0.c4.l
        @SuppressLint({"WrongConstant"})
        public boolean q(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0 && !z(i5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // v0.c4.l
        public void r(g0.r0[] r0VarArr) {
            this.f12055d = r0VarArr;
        }

        @Override // v0.c4.l
        public void s(@c.j0 g0.r0 r0Var) {
            this.f12058g = r0Var;
        }

        @Override // v0.c4.l
        public void t(@c.k0 c4 c4Var) {
            this.f12057f = c4Var;
        }

        @c.j0
        public g0.r0 w(int i4, boolean z3) {
            g0.r0 r0VarM;
            int i5;
            if (i4 == 1) {
                return z3 ? g0.r0.d(0, Math.max(x().f7804b, l().f7804b), 0, 0) : g0.r0.d(0, l().f7804b, 0, 0);
            }
            if (i4 == 2) {
                if (z3) {
                    g0.r0 r0VarX = x();
                    g0.r0 r0VarJ = j();
                    return g0.r0.d(Math.max(r0VarX.f7803a, r0VarJ.f7803a), 0, Math.max(r0VarX.f7805c, r0VarJ.f7805c), Math.max(r0VarX.f7806d, r0VarJ.f7806d));
                }
                g0.r0 r0VarL = l();
                c4 c4Var = this.f12057f;
                r0VarM = c4Var != null ? c4Var.m() : null;
                int iMin = r0VarL.f7806d;
                if (r0VarM != null) {
                    iMin = Math.min(iMin, r0VarM.f7806d);
                }
                return g0.r0.d(r0VarL.f7803a, 0, r0VarL.f7805c, iMin);
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return k();
                }
                if (i4 == 32) {
                    return i();
                }
                if (i4 == 64) {
                    return m();
                }
                if (i4 != 128) {
                    return g0.r0.f7802e;
                }
                c4 c4Var2 = this.f12057f;
                p pVarE = c4Var2 != null ? c4Var2.e() : f();
                return pVarE != null ? g0.r0.d(pVarE.d(), pVarE.f(), pVarE.e(), pVarE.c()) : g0.r0.f7802e;
            }
            g0.r0[] r0VarArr = this.f12055d;
            r0VarM = r0VarArr != null ? r0VarArr[m.e(8)] : null;
            if (r0VarM != null) {
                return r0VarM;
            }
            g0.r0 r0VarL2 = l();
            g0.r0 r0VarX2 = x();
            int i6 = r0VarL2.f7806d;
            if (i6 > r0VarX2.f7806d) {
                return g0.r0.d(0, 0, 0, i6);
            }
            g0.r0 r0Var = this.f12058g;
            return (r0Var == null || r0Var.equals(g0.r0.f7802e) || (i5 = this.f12058g.f7806d) <= r0VarX2.f7806d) ? g0.r0.f7802e : g0.r0.d(0, 0, 0, i5);
        }

        public boolean z(int i4) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 4) {
                    return false;
                }
                if (i4 != 8 && i4 != 128) {
                    return true;
                }
            }
            return !w(i4, false).equals(g0.r0.f7802e);
        }

        public g(@c.j0 c4 c4Var, @c.j0 g gVar) {
            this(c4Var, new WindowInsets(gVar.f12054c));
        }
    }

    @c.o0(21)
    public static class h extends g {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public g0.r0 f12059n;

        public h(@c.j0 c4 c4Var, @c.j0 WindowInsets windowInsets) {
            super(c4Var, windowInsets);
            this.f12059n = null;
        }

        @Override // v0.c4.l
        @c.j0
        public c4 b() {
            return c4.K(this.f12054c.consumeStableInsets());
        }

        @Override // v0.c4.l
        @c.j0
        public c4 c() {
            return c4.K(this.f12054c.consumeSystemWindowInsets());
        }

        @Override // v0.c4.l
        @c.j0
        public final g0.r0 j() {
            if (this.f12059n == null) {
                this.f12059n = g0.r0.d(this.f12054c.getStableInsetLeft(), this.f12054c.getStableInsetTop(), this.f12054c.getStableInsetRight(), this.f12054c.getStableInsetBottom());
            }
            return this.f12059n;
        }

        @Override // v0.c4.l
        public boolean o() {
            return this.f12054c.isConsumed();
        }

        @Override // v0.c4.l
        public void u(@c.k0 g0.r0 r0Var) {
            this.f12059n = r0Var;
        }

        public h(@c.j0 c4 c4Var, @c.j0 h hVar) {
            super(c4Var, hVar);
            this.f12059n = null;
            this.f12059n = hVar.f12059n;
        }
    }

    @c.o0(28)
    public static class i extends h {
        public i(@c.j0 c4 c4Var, @c.j0 WindowInsets windowInsets) {
            super(c4Var, windowInsets);
        }

        @Override // v0.c4.l
        @c.j0
        public c4 a() {
            return c4.K(this.f12054c.consumeDisplayCutout());
        }

        @Override // v0.c4.g, v0.c4.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f12054c, iVar.f12054c) && Objects.equals(this.f12058g, iVar.f12058g);
        }

        @Override // v0.c4.l
        @c.k0
        public p f() {
            return p.i(this.f12054c.getDisplayCutout());
        }

        @Override // v0.c4.l
        public int hashCode() {
            return this.f12054c.hashCode();
        }

        public i(@c.j0 c4 c4Var, @c.j0 i iVar) {
            super(c4Var, iVar);
        }
    }

    @c.o0(29)
    public static class j extends i {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public g0.r0 f12060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public g0.r0 f12061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public g0.r0 f12062q;

        public j(@c.j0 c4 c4Var, @c.j0 WindowInsets windowInsets) {
            super(c4Var, windowInsets);
            this.f12060o = null;
            this.f12061p = null;
            this.f12062q = null;
        }

        @Override // v0.c4.l
        @c.j0
        public g0.r0 i() {
            if (this.f12061p == null) {
                this.f12061p = g0.r0.g(this.f12054c.getMandatorySystemGestureInsets());
            }
            return this.f12061p;
        }

        @Override // v0.c4.l
        @c.j0
        public g0.r0 k() {
            if (this.f12060o == null) {
                this.f12060o = g0.r0.g(this.f12054c.getSystemGestureInsets());
            }
            return this.f12060o;
        }

        @Override // v0.c4.l
        @c.j0
        public g0.r0 m() {
            if (this.f12062q == null) {
                this.f12062q = g0.r0.g(this.f12054c.getTappableElementInsets());
            }
            return this.f12062q;
        }

        @Override // v0.c4.g, v0.c4.l
        @c.j0
        public c4 n(int i4, int i5, int i6, int i7) {
            return c4.K(this.f12054c.inset(i4, i5, i6, i7));
        }

        @Override // v0.c4.h, v0.c4.l
        public void u(@c.k0 g0.r0 r0Var) {
        }

        public j(@c.j0 c4 c4Var, @c.j0 j jVar) {
            super(c4Var, jVar);
            this.f12060o = null;
            this.f12061p = null;
            this.f12062q = null;
        }
    }

    @c.o0(30)
    public static class k extends j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @c.j0
        public static final c4 f12063r = c4.K(WindowInsets.CONSUMED);

        public k(@c.j0 c4 c4Var, @c.j0 WindowInsets windowInsets) {
            super(c4Var, windowInsets);
        }

        @Override // v0.c4.g, v0.c4.l
        public final void d(@c.j0 View view) {
        }

        @Override // v0.c4.g, v0.c4.l
        @c.j0
        public g0.r0 g(int i4) {
            return g0.r0.g(this.f12054c.getInsets(n.a(i4)));
        }

        @Override // v0.c4.g, v0.c4.l
        @c.j0
        public g0.r0 h(int i4) {
            return g0.r0.g(this.f12054c.getInsetsIgnoringVisibility(n.a(i4)));
        }

        @Override // v0.c4.g, v0.c4.l
        public boolean q(int i4) {
            return this.f12054c.isVisible(n.a(i4));
        }

        public k(@c.j0 c4 c4Var, @c.j0 k kVar) {
            super(c4Var, kVar);
        }
    }

    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c.j0
        public static final c4 f12064b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4 f12065a;

        public l(@c.j0 c4 c4Var) {
            this.f12065a = c4Var;
        }

        @c.j0
        public c4 a() {
            return this.f12065a;
        }

        @c.j0
        public c4 b() {
            return this.f12065a;
        }

        @c.j0
        public c4 c() {
            return this.f12065a;
        }

        public void d(@c.j0 View view) {
        }

        public void e(@c.j0 c4 c4Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && u0.e.a(l(), lVar.l()) && u0.e.a(j(), lVar.j()) && u0.e.a(f(), lVar.f());
        }

        @c.k0
        public p f() {
            return null;
        }

        @c.j0
        public g0.r0 g(int i4) {
            return g0.r0.f7802e;
        }

        @c.j0
        public g0.r0 h(int i4) {
            if ((i4 & 8) == 0) {
                return g0.r0.f7802e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return u0.e.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @c.j0
        public g0.r0 i() {
            return l();
        }

        @c.j0
        public g0.r0 j() {
            return g0.r0.f7802e;
        }

        @c.j0
        public g0.r0 k() {
            return l();
        }

        @c.j0
        public g0.r0 l() {
            return g0.r0.f7802e;
        }

        @c.j0
        public g0.r0 m() {
            return l();
        }

        @c.j0
        public c4 n(int i4, int i5, int i6, int i7) {
            return f12064b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i4) {
            return true;
        }

        public void r(g0.r0[] r0VarArr) {
        }

        public void s(@c.j0 g0.r0 r0Var) {
        }

        public void t(@c.k0 c4 c4Var) {
        }

        public void u(g0.r0 r0Var) {
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f12066a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12067b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12068c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12069d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f12070e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f12071f = 16;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f12072g = 32;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f12073h = 64;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f12074i = 128;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f12075j = 256;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f12076k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f12077l = 256;

        @Retention(RetentionPolicy.SOURCE)
        @c.r0({r0.a.LIBRARY_GROUP})
        public @interface a {
        }

        @SuppressLint({"WrongConstant"})
        @c.r0({r0.a.LIBRARY_GROUP})
        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i4) {
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 == 8) {
                return 3;
            }
            if (i4 == 16) {
                return 4;
            }
            if (i4 == 32) {
                return 5;
            }
            if (i4 == 64) {
                return 6;
            }
            if (i4 == 128) {
                return 7;
            }
            if (i4 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i4);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @c.o0(30)
    public static final class n {
        private n() {
        }

        public static int a(int i4) {
            int iStatusBars;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i5 |= iStatusBars;
                }
            }
            return i5;
        }
    }

    static {
        f12032c = Build.VERSION.SDK_INT >= 30 ? k.f12063r : l.f12064b;
    }

    @c.o0(20)
    public c4(@c.j0 WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        this.f12033a = i4 >= 30 ? new k(this, windowInsets) : i4 >= 29 ? new j(this, windowInsets) : i4 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    @c.o0(20)
    @c.j0
    public static c4 K(@c.j0 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @c.o0(20)
    @c.j0
    public static c4 L(@c.j0 WindowInsets windowInsets, @c.k0 View view) {
        c4 c4Var = new c4((WindowInsets) u0.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c4Var.H(z1.n0(view));
            c4Var.d(view.getRootView());
        }
        return c4Var;
    }

    public static g0.r0 z(@c.j0 g0.r0 r0Var, int i4, int i5, int i6, int i7) {
        int iMax = Math.max(0, r0Var.f7803a - i4);
        int iMax2 = Math.max(0, r0Var.f7804b - i5);
        int iMax3 = Math.max(0, r0Var.f7805c - i6);
        int iMax4 = Math.max(0, r0Var.f7806d - i7);
        return (iMax == i4 && iMax2 == i5 && iMax3 == i6 && iMax4 == i7) ? r0Var : g0.r0.d(iMax, iMax2, iMax3, iMax4);
    }

    public boolean A() {
        return this.f12033a.o();
    }

    public boolean B() {
        return this.f12033a.p();
    }

    public boolean C(int i4) {
        return this.f12033a.q(i4);
    }

    @c.j0
    @Deprecated
    public c4 D(int i4, int i5, int i6, int i7) {
        return new b(this).h(g0.r0.d(i4, i5, i6, i7)).a();
    }

    @c.j0
    @Deprecated
    public c4 E(@c.j0 Rect rect) {
        return new b(this).h(g0.r0.e(rect)).a();
    }

    public void F(g0.r0[] r0VarArr) {
        this.f12033a.r(r0VarArr);
    }

    public void G(@c.j0 g0.r0 r0Var) {
        this.f12033a.s(r0Var);
    }

    public void H(@c.k0 c4 c4Var) {
        this.f12033a.t(c4Var);
    }

    public void I(@c.k0 g0.r0 r0Var) {
        this.f12033a.u(r0Var);
    }

    @c.k0
    @c.o0(20)
    public WindowInsets J() {
        l lVar = this.f12033a;
        if (lVar instanceof g) {
            return ((g) lVar).f12054c;
        }
        return null;
    }

    @c.j0
    @Deprecated
    public c4 a() {
        return this.f12033a.a();
    }

    @c.j0
    @Deprecated
    public c4 b() {
        return this.f12033a.b();
    }

    @c.j0
    @Deprecated
    public c4 c() {
        return this.f12033a.c();
    }

    public void d(@c.j0 View view) {
        this.f12033a.d(view);
    }

    @c.k0
    public p e() {
        return this.f12033a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c4) {
            return u0.e.a(this.f12033a, ((c4) obj).f12033a);
        }
        return false;
    }

    @c.j0
    public g0.r0 f(int i4) {
        return this.f12033a.g(i4);
    }

    @c.j0
    public g0.r0 g(int i4) {
        return this.f12033a.h(i4);
    }

    @c.j0
    @Deprecated
    public g0.r0 h() {
        return this.f12033a.i();
    }

    public int hashCode() {
        l lVar = this.f12033a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f12033a.j().f7806d;
    }

    @Deprecated
    public int j() {
        return this.f12033a.j().f7803a;
    }

    @Deprecated
    public int k() {
        return this.f12033a.j().f7805c;
    }

    @Deprecated
    public int l() {
        return this.f12033a.j().f7804b;
    }

    @c.j0
    @Deprecated
    public g0.r0 m() {
        return this.f12033a.j();
    }

    @c.j0
    @Deprecated
    public g0.r0 n() {
        return this.f12033a.k();
    }

    @Deprecated
    public int o() {
        return this.f12033a.l().f7806d;
    }

    @Deprecated
    public int p() {
        return this.f12033a.l().f7803a;
    }

    @Deprecated
    public int q() {
        return this.f12033a.l().f7805c;
    }

    @Deprecated
    public int r() {
        return this.f12033a.l().f7804b;
    }

    @c.j0
    @Deprecated
    public g0.r0 s() {
        return this.f12033a.l();
    }

    @c.j0
    @Deprecated
    public g0.r0 t() {
        return this.f12033a.m();
    }

    public boolean u() {
        g0.r0 r0VarF = f(m.a());
        g0.r0 r0Var = g0.r0.f7802e;
        return (r0VarF.equals(r0Var) && g(m.a() ^ m.d()).equals(r0Var) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f12033a.j().equals(g0.r0.f7802e);
    }

    @Deprecated
    public boolean w() {
        return !this.f12033a.l().equals(g0.r0.f7802e);
    }

    @c.j0
    public c4 x(@c.b0(from = 0) int i4, @c.b0(from = 0) int i5, @c.b0(from = 0) int i6, @c.b0(from = 0) int i7) {
        return this.f12033a.n(i4, i5, i6, i7);
    }

    @c.j0
    public c4 y(@c.j0 g0.r0 r0Var) {
        return x(r0Var.f7803a, r0Var.f7804b, r0Var.f7805c, r0Var.f7806d);
    }

    public c4(@c.k0 c4 c4Var) {
        if (c4Var == null) {
            this.f12033a = new l(this);
            return;
        }
        l lVar = c4Var.f12033a;
        int i4 = Build.VERSION.SDK_INT;
        this.f12033a = (i4 < 30 || !(lVar instanceof k)) ? (i4 < 29 || !(lVar instanceof j)) ? (i4 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }
}
