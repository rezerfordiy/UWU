package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.r0;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1673b = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f1674c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PorterDuff.Mode f1675d = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f1676e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f1677a;

    public class a implements r0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1678a = {a.g.f7079y0, a.g.f7075w0, a.g.f7030a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f1679b = {a.g.f7078y, a.g.f7045h0, a.g.F, a.g.A, a.g.B, a.g.E, a.g.D};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f1680c = {a.g.f7073v0, a.g.f7077x0, a.g.f7064r, a.g.f7065r0, a.g.f7067s0, a.g.f7069t0, a.g.f7071u0};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f1681d = {a.g.X, a.g.f7060p, a.g.W};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f1682e = {a.g.f7061p0, a.g.f7081z0};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f1683f = {a.g.f7036d, a.g.f7048j, a.g.f7038e, a.g.f7050k};

        @Override // androidx.appcompat.widget.r0.f
        public Drawable a(@c.j0 r0 r0Var, @c.j0 Context context, int i4) {
            int i5;
            if (i4 == a.g.f7062q) {
                return new LayerDrawable(new Drawable[]{r0Var.j(context, a.g.f7060p), r0Var.j(context, a.g.f7064r)});
            }
            if (i4 == a.g.Z) {
                i5 = a.f.f6984h0;
            } else if (i4 == a.g.Y) {
                i5 = a.f.f6987i0;
            } else {
                if (i4 != a.g.f7031a0) {
                    return null;
                }
                i5 = a.f.f6990j0;
            }
            return l(r0Var, context, i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.r0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(@c.j0 android.content.Context r8, int r9, @c.j0 android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.f.a()
                int[] r1 = r7.f1678a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = e.a.c.F0
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1680c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = e.a.c.D0
                goto L11
            L20:
                int[] r1 = r7.f1681d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = e.a.g.L
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = e.a.g.f7068t
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.h0.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.z0.d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.f.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.r0.f
        public ColorStateList c(@c.j0 Context context, int i4) {
            if (i4 == a.g.f7070u) {
                return f.a.c(context, a.e.f6952v);
            }
            if (i4 == a.g.f7059o0) {
                return f.a.c(context, a.e.f6958y);
            }
            if (i4 == a.g.f7057n0) {
                return k(context);
            }
            if (i4 == a.g.f7046i) {
                return j(context);
            }
            if (i4 == a.g.f7034c) {
                return g(context);
            }
            if (i4 == a.g.f7044h) {
                return i(context);
            }
            if (i4 == a.g.f7049j0 || i4 == a.g.f7051k0) {
                return f.a.c(context, a.e.f6956x);
            }
            if (f(this.f1679b, i4)) {
                return z0.f(context, a.c.F0);
            }
            if (f(this.f1682e, i4)) {
                return f.a.c(context, a.e.f6950u);
            }
            if (f(this.f1683f, i4)) {
                return f.a.c(context, a.e.f6948t);
            }
            if (i4 == a.g.f7043g0) {
                return f.a.c(context, a.e.f6954w);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r0.f
        public boolean d(@c.j0 Context context, int i4, @c.j0 Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iD;
            if (i4 == a.g.f7047i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i5 = a.c.F0;
                m(drawableFindDrawableByLayerId2, z0.d(context, i5), f.f1675d);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), z0.d(context, i5), f.f1675d);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iD = z0.d(context, a.c.D0);
            } else {
                if (i4 != a.g.Z && i4 != a.g.Y && i4 != a.g.f7031a0) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), z0.c(context, a.c.F0), f.f1675d);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i6 = a.c.D0;
                m(drawableFindDrawableByLayerId3, z0.d(context, i6), f.f1675d);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iD = z0.d(context, i6);
            }
            m(drawableFindDrawableByLayerId, iD, f.f1675d);
            return true;
        }

        @Override // androidx.appcompat.widget.r0.f
        public PorterDuff.Mode e(int i4) {
            if (i4 == a.g.f7057n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public final boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(@c.j0 Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(@c.j0 Context context, @c.l int i4) {
            int iD = z0.d(context, a.c.E0);
            return new ColorStateList(new int[][]{z0.f1932c, z0.f1935f, z0.f1933d, z0.f1939j}, new int[]{z0.c(context, a.c.C0), g0.p0.t(iD, i4), g0.p0.t(iD, i4), i4});
        }

        public final ColorStateList i(@c.j0 Context context) {
            return h(context, z0.d(context, a.c.A0));
        }

        public final ColorStateList j(@c.j0 Context context) {
            return h(context, z0.d(context, a.c.C0));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i4 = a.c.J0;
            ColorStateList colorStateListF = z0.f(context, i4);
            if (colorStateListF == null || !colorStateListF.isStateful()) {
                iArr[0] = z0.f1932c;
                iArr2[0] = z0.c(context, i4);
                iArr[1] = z0.f1936g;
                iArr2[1] = z0.d(context, a.c.D0);
                iArr[2] = z0.f1939j;
                iArr2[2] = z0.d(context, i4);
            } else {
                int[] iArr3 = z0.f1932c;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListF.getColorForState(iArr3, 0);
                iArr[1] = z0.f1936g;
                iArr2[1] = z0.d(context, a.c.D0);
                iArr[2] = z0.f1939j;
                iArr2[2] = colorStateListF.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@c.j0 r0 r0Var, @c.j0 Context context, @c.p int i4) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable drawableJ = r0Var.j(context, a.g.f7053l0);
            Drawable drawableJ2 = r0Var.j(context, a.g.f7055m0);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = f.f1675d;
            }
            drawable.setColorFilter(f.e(i4, mode));
        }
    }

    public static synchronized f b() {
        if (f1676e == null) {
            i();
        }
        return f1676e;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        return r0.l(i4, mode);
    }

    public static synchronized void i() {
        if (f1676e == null) {
            f fVar = new f();
            f1676e = fVar;
            fVar.f1677a = r0.h();
            f1676e.f1677a.u(new a());
        }
    }

    public static void j(Drawable drawable, c1 c1Var, int[] iArr) {
        r0.w(drawable, c1Var, iArr);
    }

    public synchronized Drawable c(@c.j0 Context context, @c.s int i4) {
        return this.f1677a.j(context, i4);
    }

    public synchronized Drawable d(@c.j0 Context context, @c.s int i4, boolean z3) {
        return this.f1677a.k(context, i4, z3);
    }

    public synchronized ColorStateList f(@c.j0 Context context, @c.s int i4) {
        return this.f1677a.m(context, i4);
    }

    public synchronized void g(@c.j0 Context context) {
        this.f1677a.s(context);
    }

    public synchronized Drawable h(@c.j0 Context context, @c.j0 k1 k1Var, @c.s int i4) {
        return this.f1677a.t(context, k1Var, i4);
    }

    public boolean k(@c.j0 Context context, @c.s int i4, @c.j0 Drawable drawable) {
        return this.f1677a.x(context, i4, drawable);
    }
}
