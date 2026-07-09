package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.r0;
import d0.g;
import e.a;
import java.lang.ref.WeakReference;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f1859n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1860o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f1861p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f1862q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public final TextView f1863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f1864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c1 f1865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f1866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f1867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f1868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c1 f1869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c1 f1870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @c.j0
    public final x f1871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1872j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1873k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f1874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1875m;

    public class a extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f1878c;

        public a(int i4, int i5, WeakReference weakReference) {
            this.f1876a = i4;
            this.f1877b = i5;
            this.f1878c = weakReference;
        }

        @Override // d0.g.a
        public void d(int i4) {
        }

        @Override // d0.g.a
        public void e(@c.j0 Typeface typeface) {
            int i4;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f1876a) != -1) {
                typeface = Typeface.create(typeface, i4, (this.f1877b & 2) != 0);
            }
            w.this.n(this.f1878c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f1880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f1881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1882d;

        public b(TextView textView, Typeface typeface, int i4) {
            this.f1880b = textView;
            this.f1881c = typeface;
            this.f1882d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1880b.setTypeface(this.f1881c, this.f1882d);
        }
    }

    public w(@c.j0 TextView textView) {
        this.f1863a = textView;
        this.f1871i = new x(textView);
    }

    public static c1 d(Context context, f fVar, int i4) {
        ColorStateList colorStateListF = fVar.f(context, i4);
        if (colorStateListF == null) {
            return null;
        }
        c1 c1Var = new c1();
        c1Var.f1656d = true;
        c1Var.f1653a = colorStateListF;
        return c1Var;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void A(int i4, float f4) {
        if (androidx.core.widget.b.f3493a || l()) {
            return;
        }
        B(i4, f4);
    }

    public final void B(int i4, float f4) {
        this.f1871i.y(i4, f4);
    }

    public final void C(Context context, e1 e1Var) {
        String strW;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1872j = e1Var.o(a.n.c7, this.f1872j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int iO = e1Var.o(a.n.l7, -1);
            this.f1873k = iO;
            if (iO != -1) {
                this.f1872j = (this.f1872j & 2) | 0;
            }
        }
        int i5 = a.n.k7;
        if (!e1Var.C(i5) && !e1Var.C(a.n.m7)) {
            int i6 = a.n.b7;
            if (e1Var.C(i6)) {
                this.f1875m = false;
                int iO2 = e1Var.o(i6, 1);
                if (iO2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iO2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iO2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1874l = typeface;
                return;
            }
            return;
        }
        this.f1874l = null;
        int i7 = a.n.m7;
        if (e1Var.C(i7)) {
            i5 = i7;
        }
        int i8 = this.f1873k;
        int i9 = this.f1872j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = e1Var.k(i5, this.f1872j, new a(i8, i9, new WeakReference(this.f1863a)));
                if (typefaceK != null) {
                    if (i4 >= 28 && this.f1873k != -1) {
                        typefaceK = Typeface.create(Typeface.create(typefaceK, 0), this.f1873k, (this.f1872j & 2) != 0);
                    }
                    this.f1874l = typefaceK;
                }
                this.f1875m = this.f1874l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1874l != null || (strW = e1Var.w(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1873k == -1) {
            typefaceCreate = Typeface.create(strW, this.f1872j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strW, 0), this.f1873k, (this.f1872j & 2) != 0);
        }
        this.f1874l = typefaceCreate;
    }

    public final void a(Drawable drawable, c1 c1Var) {
        if (drawable == null || c1Var == null) {
            return;
        }
        f.j(drawable, c1Var, this.f1863a.getDrawableState());
    }

    public void b() {
        if (this.f1864b != null || this.f1865c != null || this.f1866d != null || this.f1867e != null) {
            Drawable[] compoundDrawables = this.f1863a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1864b);
            a(compoundDrawables[1], this.f1865c);
            a(compoundDrawables[2], this.f1866d);
            a(compoundDrawables[3], this.f1867e);
        }
        if (this.f1868f == null && this.f1869g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1863a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1868f);
        a(compoundDrawablesRelative[2], this.f1869g);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void c() {
        this.f1871i.b();
    }

    public int e() {
        return this.f1871i.j();
    }

    public int f() {
        return this.f1871i.k();
    }

    public int g() {
        return this.f1871i.l();
    }

    public int[] h() {
        return this.f1871i.m();
    }

    public int i() {
        return this.f1871i.n();
    }

    @c.k0
    public ColorStateList j() {
        c1 c1Var = this.f1870h;
        if (c1Var != null) {
            return c1Var.f1653a;
        }
        return null;
    }

    @c.k0
    public PorterDuff.Mode k() {
        c1 c1Var = this.f1870h;
        if (c1Var != null) {
            return c1Var.f1654b;
        }
        return null;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return this.f1871i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(@c.k0 android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1875m) {
            this.f1874l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (z1.N0(textView)) {
                    textView.post(new b(textView, typeface, this.f1872j));
                } else {
                    textView.setTypeface(typeface, this.f1872j);
                }
            }
        }
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void o(boolean z3, int i4, int i5, int i6, int i7) {
        if (androidx.core.widget.b.f3493a) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i4) {
        String strW;
        e1 e1VarE = e1.E(context, i4, a.n.Z6);
        int i5 = a.n.o7;
        if (e1VarE.C(i5)) {
            s(e1VarE.a(i5, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = a.n.a7;
        if (e1VarE.C(i7) && e1VarE.g(i7, -1) == 0) {
            this.f1863a.setTextSize(0, 0.0f);
        }
        C(context, e1VarE);
        if (i6 >= 26) {
            int i8 = a.n.n7;
            if (e1VarE.C(i8) && (strW = e1VarE.w(i8)) != null) {
                this.f1863a.setFontVariationSettings(strW);
            }
        }
        e1VarE.I();
        Typeface typeface = this.f1874l;
        if (typeface != null) {
            this.f1863a.setTypeface(typeface, this.f1872j);
        }
    }

    public void r(@c.j0 TextView textView, @c.k0 InputConnection inputConnection, @c.j0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        y0.g.j(editorInfo, textView.getText());
    }

    public void s(boolean z3) {
        this.f1863a.setAllCaps(z3);
    }

    public void t(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        this.f1871i.u(i4, i5, i6, i7);
    }

    public void u(@c.j0 int[] iArr, int i4) throws IllegalArgumentException {
        this.f1871i.v(iArr, i4);
    }

    public void v(int i4) {
        this.f1871i.w(i4);
    }

    public void w(@c.k0 ColorStateList colorStateList) {
        if (this.f1870h == null) {
            this.f1870h = new c1();
        }
        c1 c1Var = this.f1870h;
        c1Var.f1653a = colorStateList;
        c1Var.f1656d = colorStateList != null;
        z();
    }

    public void x(@c.k0 PorterDuff.Mode mode) {
        if (this.f1870h == null) {
            this.f1870h = new c1();
        }
        c1 c1Var = this.f1870h;
        c1Var.f1654b = mode;
        c1Var.f1655c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1863a.getCompoundDrawablesRelative();
            TextView textView = this.f1863a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1863a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f1863a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1863a.getCompoundDrawables();
        TextView textView3 = this.f1863a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        c1 c1Var = this.f1870h;
        this.f1864b = c1Var;
        this.f1865c = c1Var;
        this.f1866d = c1Var;
        this.f1867e = c1Var;
        this.f1868f = c1Var;
        this.f1869g = c1Var;
    }
}
