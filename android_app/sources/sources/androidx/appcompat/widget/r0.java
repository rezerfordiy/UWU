package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import c.r0;
import h.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1807h = "ResourceManagerInternal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f1808i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1810k = "appcompat_skip_skip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1811l = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static r0 f1812m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, p.j<ColorStateList>> f1814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p.i<String, e> f1815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.j<String> f1816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, p.f<WeakReference<Drawable.ConstantState>>> f1817d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f1818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f1820g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f1809j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f1813n = new c(6);

    public static class a implements e {
        @Override // androidx.appcompat.widget.r0.e
        public Drawable a(@c.j0 Context context, @c.j0 XmlPullParser xmlPullParser, @c.j0 AttributeSet attributeSet, @c.k0 Resources.Theme theme) {
            try {
                return g.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // androidx.appcompat.widget.r0.e
        public Drawable a(@c.j0 Context context, @c.j0 XmlPullParser xmlPullParser, @c.j0 AttributeSet attributeSet, @c.k0 Resources.Theme theme) {
            try {
                return s1.c.f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                return null;
            }
        }
    }

    public static class c extends p.g<Integer, PorterDuffColorFilter> {
        public c(int i4) {
            super(i4);
        }

        public static int s(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter t(int i4, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i4, mode)));
        }

        public PorterDuffColorFilter u(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i4, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // androidx.appcompat.widget.r0.e
        public Drawable a(@c.j0 Context context, @c.j0 XmlPullParser xmlPullParser, @c.j0 AttributeSet attributeSet, @c.k0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e4) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e4);
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(@c.j0 Context context, @c.j0 XmlPullParser xmlPullParser, @c.j0 AttributeSet attributeSet, @c.k0 Resources.Theme theme);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface f {
        @c.k0
        Drawable a(@c.j0 r0 r0Var, @c.j0 Context context, @c.s int i4);

        boolean b(@c.j0 Context context, @c.s int i4, @c.j0 Drawable drawable);

        @c.k0
        ColorStateList c(@c.j0 Context context, @c.s int i4);

        boolean d(@c.j0 Context context, @c.s int i4, @c.j0 Drawable drawable);

        @c.k0
        PorterDuff.Mode e(int i4);
    }

    public static class g implements e {
        @Override // androidx.appcompat.widget.r0.e
        public Drawable a(@c.j0 Context context, @c.j0 XmlPullParser xmlPullParser, @c.j0 AttributeSet attributeSet, @c.k0 Resources.Theme theme) {
            try {
                return s1.i.f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized r0 h() {
        if (f1812m == null) {
            r0 r0Var = new r0();
            f1812m = r0Var;
            p(r0Var);
        }
        return f1812m;
    }

    public static synchronized PorterDuffColorFilter l(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterT;
        c cVar = f1813n;
        porterDuffColorFilterT = cVar.t(i4, mode);
        if (porterDuffColorFilterT == null) {
            porterDuffColorFilterT = new PorterDuffColorFilter(i4, mode);
            cVar.u(i4, mode, porterDuffColorFilterT);
        }
        return porterDuffColorFilterT;
    }

    public static void p(@c.j0 r0 r0Var) {
    }

    public static boolean q(@c.j0 Drawable drawable) {
        return (drawable instanceof s1.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, c1 c1Var, int[] iArr) {
        if (h0.a(drawable) && drawable.mutate() != drawable) {
            Log.d(f1807h, "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = c1Var.f1656d;
        if (z3 || c1Var.f1655c) {
            drawable.setColorFilter(g(z3 ? c1Var.f1653a : null, c1Var.f1655c ? c1Var.f1654b : f1809j, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final void a(@c.j0 String str, @c.j0 e eVar) {
        if (this.f1815b == null) {
            this.f1815b = new p.i<>();
        }
        this.f1815b.put(str, eVar);
    }

    public final synchronized boolean b(@c.j0 Context context, long j4, @c.j0 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        p.f<WeakReference<Drawable.ConstantState>> fVar = this.f1817d.get(context);
        if (fVar == null) {
            fVar = new p.f<>();
            this.f1817d.put(context, fVar);
        }
        fVar.n(j4, new WeakReference<>(constantState));
        return true;
    }

    public final void c(@c.j0 Context context, @c.s int i4, @c.j0 ColorStateList colorStateList) {
        if (this.f1814a == null) {
            this.f1814a = new WeakHashMap<>();
        }
        p.j<ColorStateList> jVar = this.f1814a.get(context);
        if (jVar == null) {
            jVar = new p.j<>();
            this.f1814a.put(context, jVar);
        }
        jVar.a(i4, colorStateList);
    }

    public final void d(@c.j0 Context context) {
        if (this.f1819f) {
            return;
        }
        this.f1819f = true;
        Drawable drawableJ = j(context, a.d.f7887a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f1819f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(@c.j0 Context context, @c.s int i4) {
        if (this.f1818e == null) {
            this.f1818e = new TypedValue();
        }
        TypedValue typedValue = this.f1818e;
        context.getResources().getValue(i4, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f1820g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i4);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable i(@c.j0 Context context, long j4) {
        p.f<WeakReference<Drawable.ConstantState>> fVar = this.f1817d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceH = fVar.h(j4);
        if (weakReferenceH != null) {
            Drawable.ConstantState constantState = weakReferenceH.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.q(j4);
        }
        return null;
    }

    public synchronized Drawable j(@c.j0 Context context, @c.s int i4) {
        return k(context, i4, false);
    }

    public synchronized Drawable k(@c.j0 Context context, @c.s int i4, boolean z3) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i4);
        if (drawableR == null) {
            drawableR = f(context, i4);
        }
        if (drawableR == null) {
            drawableR = b0.e.h(context, i4);
        }
        if (drawableR != null) {
            drawableR = v(context, i4, z3, drawableR);
        }
        if (drawableR != null) {
            h0.b(drawableR);
        }
        return drawableR;
    }

    public synchronized ColorStateList m(@c.j0 Context context, @c.s int i4) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i4);
        if (colorStateListN == null) {
            f fVar = this.f1820g;
            colorStateListN = fVar == null ? null : fVar.c(context, i4);
            if (colorStateListN != null) {
                c(context, i4, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(@c.j0 Context context, @c.s int i4) {
        p.j<ColorStateList> jVar;
        WeakHashMap<Context, p.j<ColorStateList>> weakHashMap = this.f1814a;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return jVar.h(i4);
    }

    public PorterDuff.Mode o(int i4) {
        f fVar = this.f1820g;
        if (fVar == null) {
            return null;
        }
        return fVar.e(i4);
    }

    public final Drawable r(@c.j0 Context context, @c.s int i4) {
        int next;
        p.i<String, e> iVar = this.f1815b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        p.j<String> jVar = this.f1816c;
        if (jVar != null) {
            String strH = jVar.h(i4);
            if (f1810k.equals(strH) || (strH != null && this.f1815b.get(strH) == null)) {
                return null;
            }
        } else {
            this.f1816c = new p.j<>();
        }
        if (this.f1818e == null) {
            this.f1818e = new TypedValue();
        }
        TypedValue typedValue = this.f1818e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(androidx.appcompat.widget.c.f1630y)) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1816c.a(i4, name);
                e eVar = this.f1815b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e4) {
                Log.e(f1807h, "Exception while inflating drawable", e4);
            }
        }
        if (drawableI == null) {
            this.f1816c.a(i4, f1810k);
        }
        return drawableI;
    }

    public synchronized void s(@c.j0 Context context) {
        p.f<WeakReference<Drawable.ConstantState>> fVar = this.f1817d.get(context);
        if (fVar != null) {
            fVar.b();
        }
    }

    public synchronized Drawable t(@c.j0 Context context, @c.j0 k1 k1Var, @c.s int i4) {
        Drawable drawableR = r(context, i4);
        if (drawableR == null) {
            drawableR = k1Var.d(i4);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i4, false, drawableR);
    }

    public synchronized void u(f fVar) {
        this.f1820g = fVar;
    }

    public final Drawable v(@c.j0 Context context, @c.s int i4, boolean z3, @c.j0 Drawable drawable) {
        ColorStateList colorStateListM = m(context, i4);
        if (colorStateListM == null) {
            f fVar = this.f1820g;
            if ((fVar == null || !fVar.d(context, i4, drawable)) && !x(context, i4, drawable) && z3) {
                return null;
            }
            return drawable;
        }
        if (h0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = h0.a.r(drawable);
        h0.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i4);
        if (modeO == null) {
            return drawableR;
        }
        h0.a.p(drawableR, modeO);
        return drawableR;
    }

    public boolean x(@c.j0 Context context, @c.s int i4, @c.j0 Drawable drawable) {
        f fVar = this.f1820g;
        return fVar != null && fVar.b(context, i4, drawable);
    }
}
