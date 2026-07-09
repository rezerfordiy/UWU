package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import c.j0;
import c.k0;
import c.o0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f7674n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f7675o = "DrawableContainer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f7676p = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f7677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f7678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f7679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f7680e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7682g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f7685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f7688m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7681f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7683h = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g.b$b, reason: collision with other inner class name */
    @o0(21)
    public static class C0063b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable.Callback f7690b;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f7690b;
            this.f7690b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f7690b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@j0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable, long j4) {
            Drawable.Callback callback = this.f7690b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable) {
            Drawable.Callback callback = this.f7690b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f7691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f7692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f7696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f7697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7698h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f7700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f7701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f7702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f7703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7705o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f7708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f7710t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f7711u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f7712v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f7713w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f7714x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f7715y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f7716z;

        public d(d dVar, b bVar, Resources resources) {
            this.f7699i = false;
            this.f7702l = false;
            this.f7714x = true;
            this.A = 0;
            this.B = 0;
            this.f7691a = bVar;
            this.f7692b = resources != null ? resources : dVar != null ? dVar.f7692b : null;
            int iG = b.g(resources, dVar != null ? dVar.f7693c : 0);
            this.f7693c = iG;
            if (dVar == null) {
                this.f7697g = new Drawable[10];
                this.f7698h = 0;
                return;
            }
            this.f7694d = dVar.f7694d;
            this.f7695e = dVar.f7695e;
            this.f7712v = true;
            this.f7713w = true;
            this.f7699i = dVar.f7699i;
            this.f7702l = dVar.f7702l;
            this.f7714x = dVar.f7714x;
            this.f7715y = dVar.f7715y;
            this.f7716z = dVar.f7716z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f7693c == iG) {
                if (dVar.f7700j) {
                    this.f7701k = dVar.f7701k != null ? new Rect(dVar.f7701k) : null;
                    this.f7700j = true;
                }
                if (dVar.f7703m) {
                    this.f7704n = dVar.f7704n;
                    this.f7705o = dVar.f7705o;
                    this.f7706p = dVar.f7706p;
                    this.f7707q = dVar.f7707q;
                    this.f7703m = true;
                }
            }
            if (dVar.f7708r) {
                this.f7709s = dVar.f7709s;
                this.f7708r = true;
            }
            if (dVar.f7710t) {
                this.f7711u = dVar.f7711u;
                this.f7710t = true;
            }
            Drawable[] drawableArr = dVar.f7697g;
            this.f7697g = new Drawable[drawableArr.length];
            this.f7698h = dVar.f7698h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f7696f;
            this.f7696f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f7698h);
            int i4 = this.f7698h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7696f.put(i5, constantState);
                    } else {
                        this.f7697g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        public final boolean A(int i4, int i5) {
            int i6 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            boolean z3 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    boolean zM = h0.a.m(drawable, i4);
                    if (i7 == i5) {
                        z3 = zM;
                    }
                }
            }
            this.f7716z = i4;
            return z3;
        }

        public final void B(boolean z3) {
            this.f7699i = z3;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.f7692b = resources;
                int iG = b.g(resources, this.f7693c);
                int i4 = this.f7693c;
                this.f7693c = iG;
                if (i4 != iG) {
                    this.f7703m = false;
                    this.f7700j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i4 = this.f7698h;
            if (i4 >= this.f7697g.length) {
                r(i4, i4 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f7691a);
            this.f7697g[i4] = drawable;
            this.f7698h++;
            this.f7695e = drawable.getChangingConfigurations() | this.f7695e;
            s();
            this.f7701k = null;
            this.f7700j = false;
            this.f7703m = false;
            this.f7712v = false;
            return i4;
        }

        @o0(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i4 = this.f7698h;
                Drawable[] drawableArr = this.f7697g;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null && h0.a.b(drawable)) {
                        h0.a.a(drawableArr[i5], theme);
                        this.f7695e |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                C(C0063b.c(theme));
            }
        }

        public boolean c() {
            if (this.f7712v) {
                return this.f7713w;
            }
            f();
            this.f7712v = true;
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f7713w = false;
                    return false;
                }
            }
            this.f7713w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0(21)
        public boolean canApplyTheme() {
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f7696f.get(i5);
                    if (constantState != null && C0063b.a(constantState)) {
                        return true;
                    }
                } else if (h0.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            this.f7715y = false;
        }

        public void e() {
            this.f7703m = true;
            f();
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            this.f7705o = -1;
            this.f7704n = -1;
            this.f7707q = 0;
            this.f7706p = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f7704n) {
                    this.f7704n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f7705o) {
                    this.f7705o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f7706p) {
                    this.f7706p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f7707q) {
                    this.f7707q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f7696f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f7697g[this.f7696f.keyAt(i4)] = w(this.f7696f.valueAt(i4).newDrawable(this.f7692b));
                }
                this.f7696f = null;
            }
        }

        public final int g() {
            return this.f7697g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7694d | this.f7695e;
        }

        public final Drawable h(int i4) {
            int iIndexOfKey;
            Drawable drawable = this.f7697g[i4];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f7696f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i4)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f7696f.valueAt(iIndexOfKey).newDrawable(this.f7692b));
            this.f7697g[i4] = drawableW;
            this.f7696f.removeAt(iIndexOfKey);
            if (this.f7696f.size() == 0) {
                this.f7696f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.f7698h;
        }

        public final int j() {
            if (!this.f7703m) {
                e();
            }
            return this.f7705o;
        }

        public final int k() {
            if (!this.f7703m) {
                e();
            }
            return this.f7707q;
        }

        public final int l() {
            if (!this.f7703m) {
                e();
            }
            return this.f7706p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f7699i) {
                return null;
            }
            Rect rect2 = this.f7701k;
            if (rect2 != null || this.f7700j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i6 = rect3.left;
                    if (i6 > rect.left) {
                        rect.left = i6;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect.top) {
                        rect.top = i7;
                    }
                    int i8 = rect3.right;
                    if (i8 > rect.right) {
                        rect.right = i8;
                    }
                    int i9 = rect3.bottom;
                    if (i9 > rect.bottom) {
                        rect.bottom = i9;
                    }
                }
            }
            this.f7700j = true;
            this.f7701k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f7703m) {
                e();
            }
            return this.f7704n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f7708r) {
                return this.f7709s;
            }
            f();
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            int opacity = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i4; i5++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i5].getOpacity());
            }
            this.f7709s = opacity;
            this.f7708r = true;
            return opacity;
        }

        public void r(int i4, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f7697g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.f7697g = drawableArr;
        }

        public void s() {
            this.f7708r = false;
            this.f7710t = false;
        }

        public final boolean t() {
            return this.f7702l;
        }

        public final boolean u() {
            if (this.f7710t) {
                return this.f7711u;
            }
            f();
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            boolean z3 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (drawableArr[i5].isStateful()) {
                    z3 = true;
                    break;
                }
                i5++;
            }
            this.f7711u = z3;
            this.f7710t = true;
            return z3;
        }

        public void v() {
            int i4 = this.f7698h;
            Drawable[] drawableArr = this.f7697g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f7715y = true;
        }

        public final Drawable w(Drawable drawable) {
            h0.a.m(drawable, this.f7716z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f7691a);
            return drawableMutate;
        }

        public final void x(boolean z3) {
            this.f7702l = z3;
        }

        public final void y(int i4) {
            this.A = i4;
        }

        public final void z(int i4) {
            this.B = i4;
        }
    }

    public static int g(@k0 Resources resources, int i4) {
        if (resources != null) {
            i4 = resources.getDisplayMetrics().densityDpi;
        }
        if (i4 == 0) {
            return 160;
        }
        return i4;
    }

    public void a(boolean z3) {
        boolean z4;
        boolean z5 = true;
        this.f7682g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            long j4 = this.f7686k;
            if (j4 == 0) {
                z4 = false;
            } else if (j4 <= jUptimeMillis) {
                drawable.setAlpha(this.f7681f);
                this.f7686k = 0L;
                z4 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j4 - jUptimeMillis) * 255)) / this.f7677b.A)) * this.f7681f) / 255);
                z4 = true;
            }
        } else {
            this.f7686k = 0L;
            z4 = false;
        }
        Drawable drawable2 = this.f7680e;
        if (drawable2 != null) {
            long j5 = this.f7687l;
            if (j5 == 0) {
                z5 = z4;
            } else if (j5 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f7680e = null;
                this.f7687l = 0L;
                z5 = z4;
            } else {
                drawable2.setAlpha(((((int) ((j5 - jUptimeMillis) * 255)) / this.f7677b.B) * this.f7681f) / 255);
            }
        } else {
            this.f7687l = 0L;
            z5 = z4;
        }
        if (z3 && z5) {
            scheduleSelf(this.f7685j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @o0(21)
    public void applyTheme(@j0 Resources.Theme theme) {
        this.f7677b.b(theme);
    }

    public void b() {
        this.f7677b.d();
        this.f7684i = false;
    }

    public d c() {
        return this.f7677b;
    }

    @Override // android.graphics.drawable.Drawable
    @o0(21)
    public boolean canApplyTheme() {
        return this.f7677b.canApplyTheme();
    }

    public int d() {
        return this.f7683h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@j0 Canvas canvas) {
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f7680e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.f7688m == null) {
            this.f7688m = new c();
        }
        drawable.setCallback(this.f7688m.b(drawable.getCallback()));
        try {
            if (this.f7677b.A <= 0 && this.f7682g) {
                drawable.setAlpha(this.f7681f);
            }
            d dVar = this.f7677b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    h0.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f7677b;
                if (dVar2.I) {
                    h0.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7677b.f7714x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            h0.a.m(drawable, h0.a.f(this));
            h0.a.j(drawable, this.f7677b.C);
            Rect rect = this.f7678c;
            if (rect != null) {
                h0.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f7688m.a());
        }
    }

    public final boolean f() {
        return isAutoMirrored() && h0.a.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7681f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f7677b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f7677b.c()) {
            return null;
        }
        this.f7677b.f7694d = getChangingConfigurations();
        return this.f7677b;
    }

    @Override // android.graphics.drawable.Drawable
    @j0
    public Drawable getCurrent() {
        return this.f7679d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@j0 Rect rect) {
        Rect rect2 = this.f7678c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f7677b.t()) {
            return this.f7677b.j();
        }
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f7677b.t()) {
            return this.f7677b.n();
        }
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f7677b.t()) {
            return this.f7677b.k();
        }
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f7677b.t()) {
            return this.f7677b.l();
        }
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7679d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f7677b.q();
    }

    @Override // android.graphics.drawable.Drawable
    @o0(21)
    public void getOutline(@j0 Outline outline) {
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            C0063b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@j0 Rect rect) {
        boolean padding;
        Rect rectM = this.f7677b.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0;
        } else {
            Drawable drawable = this.f7679d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f7683h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f7677b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f7680e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f7679d
            if (r0 == 0) goto L29
            r9.f7680e = r0
            g.b$d r0 = r9.f7677b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f7687l = r0
            goto L35
        L29:
            r9.f7680e = r4
            r9.f7687l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f7679d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b$d r0 = r9.f7677b
            int r1 = r0.f7698h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f7679d = r0
            r9.f7683h = r10
            if (r0 == 0) goto L5a
            g.b$d r10 = r9.f7677b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f7686k = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f7679d = r4
            r10 = -1
            r9.f7683h = r10
        L5a:
            long r0 = r9.f7686k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f7687l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f7685j
            if (r10 != 0) goto L73
            g.b$a r10 = new g.b$a
            r10.<init>()
            r9.f7685j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.h(int):boolean");
    }

    public void i(d dVar) {
        this.f7677b = dVar;
        int i4 = this.f7683h;
        if (i4 >= 0) {
            Drawable drawableH = dVar.h(i4);
            this.f7679d = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.f7680e = null;
    }

    public void invalidateDrawable(@j0 Drawable drawable) {
        d dVar = this.f7677b;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f7679d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f7677b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f7677b.u();
    }

    public void j(int i4) {
        h(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f7680e;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f7680e = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f7679d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f7682g) {
                this.f7679d.setAlpha(this.f7681f);
            }
        }
        if (this.f7687l != 0) {
            this.f7687l = 0L;
            z3 = true;
        }
        if (this.f7686k != 0) {
            this.f7686k = 0L;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    public void k(int i4) {
        this.f7677b.A = i4;
    }

    public void l(int i4) {
        this.f7677b.B = i4;
    }

    public final void m(Resources resources) {
        this.f7677b.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7684i && super.mutate() == this) {
            d dVarC = c();
            dVarC.v();
            i(dVarC);
            this.f7684i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7680e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7679d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        return this.f7677b.A(i4, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        Drawable drawable = this.f7680e;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f7679d;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7680e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f7679d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable, long j4) {
        if (drawable != this.f7679d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f7682g && this.f7681f == i4) {
            return;
        }
        this.f7682g = true;
        this.f7681f = i4;
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            if (this.f7686k == 0) {
                drawable.setAlpha(i4);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        d dVar = this.f7677b;
        if (dVar.C != z3) {
            dVar.C = z3;
            Drawable drawable = this.f7679d;
            if (drawable != null) {
                h0.a.j(drawable, z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f7677b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f7679d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        d dVar = this.f7677b;
        if (dVar.f7714x != z3) {
            dVar.f7714x = z3;
            Drawable drawable = this.f7679d;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            h0.a.k(drawable, f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f7678c;
        if (rect == null) {
            this.f7678c = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f7679d;
        if (drawable != null) {
            h0.a.l(drawable, i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f7677b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            h0.a.o(this.f7679d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintMode(@j0 PorterDuff.Mode mode) {
        d dVar = this.f7677b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            h0.a.p(this.f7679d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f7680e;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f7679d;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    public void unscheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable) {
        if (drawable != this.f7679d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
