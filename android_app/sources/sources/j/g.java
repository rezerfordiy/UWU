package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.h0;
import c.e0;
import c.r0;
import e.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v0.o0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f8224e = "SupportMenuInflater";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8225f = "menu";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f8226g = "group";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f8227h = "item";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8228i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class<?>[] f8229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Class<?>[] f8230k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f8231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f8232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8234d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f8235c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f8237b;

        public a(Object obj, String str) {
            this.f8236a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8237b = cls.getMethod(str, f8235c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8237b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8237b.invoke(this.f8236a, menuItem)).booleanValue();
                }
                this.f8237b.invoke(this.f8236a, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public class b {
        public static final int G = 0;
        public static final int H = 0;
        public static final int I = 0;
        public static final int J = 0;
        public static final int K = 0;
        public static final boolean L = false;
        public static final boolean M = true;
        public static final boolean N = true;
        public v0.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f8238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f8244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f8245h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8246i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f8248k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f8249l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8250m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f8251n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8252o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f8253p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f8254q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8255r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f8256s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f8257t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f8258u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8259v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f8260w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f8261x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f8262y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f8263z;

        public b(Menu menu) {
            this.f8238a = menu;
            h();
        }

        public void a() {
            this.f8245h = true;
            i(this.f8238a.add(this.f8239b, this.f8246i, this.f8247j, this.f8248k));
        }

        public SubMenu b() {
            this.f8245h = true;
            SubMenu subMenuAddSubMenu = this.f8238a.addSubMenu(this.f8239b, this.f8246i, this.f8247j, this.f8248k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f8245h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f8233c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w(g.f8224e, "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f8233c.obtainStyledAttributes(attributeSet, a.n.f5);
            this.f8239b = typedArrayObtainStyledAttributes.getResourceId(a.n.h5, 0);
            this.f8240c = typedArrayObtainStyledAttributes.getInt(a.n.j5, 0);
            this.f8241d = typedArrayObtainStyledAttributes.getInt(a.n.k5, 0);
            this.f8242e = typedArrayObtainStyledAttributes.getInt(a.n.l5, 0);
            this.f8243f = typedArrayObtainStyledAttributes.getBoolean(a.n.i5, true);
            this.f8244g = typedArrayObtainStyledAttributes.getBoolean(a.n.g5, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            e1 e1VarF = e1.F(g.this.f8233c, attributeSet, a.n.m5);
            this.f8246i = e1VarF.u(a.n.p5, 0);
            this.f8247j = (e1VarF.o(a.n.s5, this.f8240c) & l0.a.f8429c) | (e1VarF.o(a.n.t5, this.f8241d) & l0.a.f8427a);
            this.f8248k = e1VarF.x(a.n.u5);
            this.f8249l = e1VarF.x(a.n.v5);
            this.f8250m = e1VarF.u(a.n.n5, 0);
            this.f8251n = c(e1VarF.w(a.n.w5));
            this.f8252o = e1VarF.o(a.n.D5, 4096);
            this.f8253p = c(e1VarF.w(a.n.x5));
            this.f8254q = e1VarF.o(a.n.H5, 4096);
            int i4 = a.n.y5;
            this.f8255r = e1VarF.C(i4) ? e1VarF.a(i4, false) : this.f8242e;
            this.f8256s = e1VarF.a(a.n.q5, false);
            this.f8257t = e1VarF.a(a.n.r5, this.f8243f);
            this.f8258u = e1VarF.a(a.n.o5, this.f8244g);
            this.f8259v = e1VarF.o(a.n.I5, -1);
            this.f8263z = e1VarF.w(a.n.z5);
            this.f8260w = e1VarF.u(a.n.A5, 0);
            this.f8261x = e1VarF.w(a.n.C5);
            String strW = e1VarF.w(a.n.B5);
            this.f8262y = strW;
            boolean z3 = strW != null;
            if (z3 && this.f8260w == 0 && this.f8261x == null) {
                this.A = (v0.b) e(strW, g.f8230k, g.this.f8232b);
            } else {
                if (z3) {
                    Log.w(g.f8224e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = e1VarF.x(a.n.E5);
            this.C = e1VarF.x(a.n.J5);
            int i5 = a.n.G5;
            if (e1VarF.C(i5)) {
                this.E = h0.e(e1VarF.o(i5, -1), this.E);
            } else {
                this.E = null;
            }
            int i6 = a.n.F5;
            if (e1VarF.C(i6)) {
                this.D = e1VarF.d(i6);
            } else {
                this.D = null;
            }
            e1VarF.I();
            this.f8245h = false;
        }

        public void h() {
            this.f8239b = 0;
            this.f8240c = 0;
            this.f8241d = 0;
            this.f8242e = 0;
            this.f8243f = true;
            this.f8244g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z3 = false;
            menuItem.setChecked(this.f8256s).setVisible(this.f8257t).setEnabled(this.f8258u).setCheckable(this.f8255r >= 1).setTitleCondensed(this.f8249l).setIcon(this.f8250m);
            int i4 = this.f8259v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f8263z != null) {
                if (g.this.f8233c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f8263z));
            }
            if (this.f8255r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).w(true);
                } else if (menuItem instanceof k.c) {
                    ((k.c) menuItem).j(true);
                }
            }
            String str = this.f8261x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f8229j, g.this.f8231a));
                z3 = true;
            }
            int i5 = this.f8260w;
            if (i5 > 0) {
                if (z3) {
                    Log.w(g.f8224e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i5);
                }
            }
            v0.b bVar = this.A;
            if (bVar != null) {
                o0.l(menuItem, bVar);
            }
            o0.p(menuItem, this.B);
            o0.w(menuItem, this.C);
            o0.o(menuItem, this.f8251n, this.f8252o);
            o0.s(menuItem, this.f8253p, this.f8254q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                o0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                o0.q(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f8229j = clsArr;
        f8230k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f8233c = context;
        Object[] objArr = {context};
        this.f8231a = objArr;
        this.f8232b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f8234d == null) {
            this.f8234d = a(this.f8233c);
        }
        return this.f8234d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f8225f)) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        z4 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            v0.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals(f8225f)) {
                        z3 = true;
                    }
                }
            } else if (!z4) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals(f8225f)) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z4 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@e0 int i4, Menu menu) {
        if (!(menu instanceof l0.a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f8233c.getResources().getLayout(i4);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
