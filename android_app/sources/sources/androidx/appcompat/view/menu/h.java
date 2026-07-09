package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import c.k0;
import c.r0;
import e.a;
import v0.b;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class h implements l0.b {
    public static final String Q = "MenuItemImpl";
    public static final int R = 3;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    public static final int V = 8;
    public static final int W = 16;
    public static final int X = 32;
    public static final int Y = 0;
    public Runnable A;
    public MenuItem.OnMenuItemClickListener B;
    public CharSequence C;
    public CharSequence D;
    public int K;
    public View L;
    public v0.b M;
    public MenuItem.OnActionExpandListener N;
    public ContextMenu.ContextMenuInfo P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Intent f1176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public char f1177s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public char f1179u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f1181w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f1183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f1184z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1178t = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1180v = 4096;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1182x = 0;
    public ColorStateList E = null;
    public PorterDuff.Mode F = null;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public int J = 16;
    public boolean O = false;

    public class a implements b.InterfaceC0121b {
        public a() {
        }

        @Override // v0.b.InterfaceC0121b
        public void onActionProviderVisibilityChanged(boolean z3) {
            h hVar = h.this;
            hVar.f1183y.M(hVar);
        }
    }

    public h(e eVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f1183y = eVar;
        this.f1170l = i5;
        this.f1171m = i4;
        this.f1172n = i6;
        this.f1173o = i7;
        this.f1174p = charSequence;
        this.K = i8;
    }

    public static void f(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    public void A(m mVar) {
        this.f1184z = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z3) {
        int i4 = this.J;
        int i5 = (z3 ? 0 : 8) | (i4 & (-9));
        this.J = i5;
        return i4 != i5;
    }

    public boolean C() {
        return this.f1183y.D();
    }

    public boolean D() {
        return this.f1183y.K() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // l0.b
    public boolean a() {
        return (d() || q()) ? false : true;
    }

    @Override // l0.b
    public l0.b b(v0.b bVar) {
        v0.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f1183y.N(true);
        v0.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // l0.b
    public v0.b c() {
        return this.M;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1183y.g(this);
        }
        return false;
    }

    @Override // l0.b
    public boolean d() {
        return (this.K & 2) == 2;
    }

    public void e() {
        this.f1183y.L(this);
    }

    @Override // l0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1183y.n(this);
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = h0.a.r(drawable).mutate();
            if (this.G) {
                h0.a.o(drawable, this.E);
            }
            if (this.H) {
                h0.a.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        v0.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View viewE = bVar.e(this);
        this.L = viewE;
        return viewE;
    }

    @Override // l0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1180v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1179u;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1171m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1181w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f1182x == 0) {
            return null;
        }
        Drawable drawableD = f.a.d(this.f1183y.x(), this.f1182x);
        this.f1182x = 0;
        this.f1181w = drawableD;
        return g(drawableD);
    }

    @Override // l0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // l0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1176r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1170l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // l0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1178t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1177s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1172n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1184z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1174p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1175q;
        return charSequence != null ? charSequence : this.f1174p;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    public Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1184z != null;
    }

    public int i() {
        return this.f1173o;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        v0.b bVar = this.M;
        return (bVar == null || !bVar.h()) ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    public char j() {
        return this.f1183y.J() ? this.f1179u : this.f1177s;
    }

    public String k() {
        int i4;
        char cJ = j();
        if (cJ == 0) {
            return s0.a.f11071l;
        }
        Resources resources = this.f1183y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1183y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.l.f7215r));
        }
        int i5 = this.f1183y.J() ? this.f1180v : this.f1178t;
        f(sb, i5, 65536, resources.getString(a.l.f7211n));
        f(sb, i5, 4096, resources.getString(a.l.f7207j));
        f(sb, i5, 2, resources.getString(a.l.f7206i));
        f(sb, i5, 1, resources.getString(a.l.f7212o));
        f(sb, i5, 4, resources.getString(a.l.f7214q));
        f(sb, i5, 8, resources.getString(a.l.f7210m));
        if (cJ == '\b') {
            i4 = a.l.f7208k;
        } else if (cJ == '\n') {
            i4 = a.l.f7209l;
        } else {
            if (cJ != ' ') {
                sb.append(cJ);
                return sb.toString();
            }
            i4 = a.l.f7213p;
        }
        sb.append(resources.getString(i4));
        return sb.toString();
    }

    public CharSequence l(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        v0.b bVar;
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null && (bVar = this.M) != null) {
            this.L = bVar.e(this);
        }
        return this.L != null;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f1183y;
        if (eVar.i(eVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1176r != null) {
            try {
                this.f1183y.x().startActivity(this.f1176r);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e(Q, "Can't find activity to handle intent; ignoring", e4);
            }
        }
        v0.b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(int i4) {
        Context contextX = this.f1183y.x();
        setActionView(LayoutInflater.from(contextX).inflate(i4, (ViewGroup) new LinearLayout(contextX), false));
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(View view) {
        int i4;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i4 = this.f1170l) > 0) {
            view.setId(i4);
        }
        this.f1183y.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f1179u == c4) {
            return this;
        }
        this.f1179u = Character.toLowerCase(c4);
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        int i4 = this.J;
        int i5 = (z3 ? 1 : 0) | (i4 & (-2));
        this.J = i5;
        if (i4 != i5) {
            this.f1183y.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        if ((this.J & 4) != 0) {
            this.f1183y.a0(this);
        } else {
            v(z3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.J = z3 ? this.J | 16 : this.J & (-17);
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f1181w = null;
        this.f1182x = i4;
        this.I = true;
        this.f1183y.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintList(@k0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f1183y.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1176r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        if (this.f1177s == c4) {
            return this;
        }
        this.f1177s = c4;
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f1177s = c4;
        this.f1179u = Character.toLowerCase(c5);
        this.f1183y.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i4;
        this.f1183y.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f1183y.x().getString(i4));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1175q = charSequence;
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        if (B(z3)) {
            this.f1183y.M(this);
        }
        return this;
    }

    public void t(boolean z3) {
        this.O = z3;
        this.f1183y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f1174p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    public void v(boolean z3) {
        int i4 = this.J;
        int i5 = (z3 ? 2 : 0) | (i4 & (-3));
        this.J = i5;
        if (i4 != i5) {
            this.f1183y.N(false);
        }
    }

    public void w(boolean z3) {
        this.J = (z3 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z3) {
        this.J = z3 ? this.J | 32 : this.J & (-33);
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public l0.b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f1179u == c4 && this.f1180v == i4) {
            return this;
        }
        this.f1179u = Character.toLowerCase(c4);
        this.f1180v = KeyEvent.normalizeMetaState(i4);
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1182x = 0;
        this.f1181w = drawable;
        this.I = true;
        this.f1183y.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f1177s == c4 && this.f1178t == i4) {
            return this;
        }
        this.f1177s = c4;
        this.f1178t = KeyEvent.normalizeMetaState(i4);
        this.f1183y.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f1177s = c4;
        this.f1178t = KeyEvent.normalizeMetaState(i4);
        this.f1179u = Character.toLowerCase(c5);
        this.f1180v = KeyEvent.normalizeMetaState(i5);
        this.f1183y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1174p = charSequence;
        this.f1183y.N(false);
        m mVar = this.f1184z;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f1183y.N(false);
        return this;
    }
}
