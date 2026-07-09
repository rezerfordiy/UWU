package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.k0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class a implements l0.b {
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;
    public static final int I = 8;
    public static final int J = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f8331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Intent f8333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public char f8334r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public char f8336t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f8338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f8339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f8341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f8342z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8335s = 4096;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8337u = 4096;
    public ColorStateList A = null;
    public PorterDuff.Mode B = null;
    public boolean C = false;
    public boolean D = false;
    public int E = 16;

    public a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f8339w = context;
        this.f8328l = i5;
        this.f8329m = i4;
        this.f8330n = i7;
        this.f8331o = charSequence;
    }

    @Override // l0.b
    public boolean a() {
        return false;
    }

    @Override // l0.b
    public l0.b b(v0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.b
    public v0.b c() {
        return null;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // l0.b
    public boolean d() {
        return true;
    }

    public final void e() {
        Drawable drawable = this.f8338v;
        if (drawable != null) {
            if (this.C || this.D) {
                Drawable drawableR = h0.a.r(drawable);
                this.f8338v = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f8338v = drawableMutate;
                if (this.C) {
                    h0.a.o(drawableMutate, this.A);
                }
                if (this.D) {
                    h0.a.p(this.f8338v, this.B);
                }
            }
        }
    }

    @Override // l0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f8340x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f8333q;
        if (intent == null) {
            return false;
        }
        this.f8339w.startActivity(intent);
        return true;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // l0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // l0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8337u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8336t;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8341y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8329m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f8338v;
    }

    @Override // l0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // l0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8333q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8328l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8335s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8334r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8330n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8331o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8332p;
        return charSequence != null ? charSequence : this.f8331o;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8342z;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z3) {
        this.E = (z3 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // l0.b, android.view.MenuItem
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public l0.b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f8336t = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.E = (z3 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.E = (z3 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.E = (z3 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f8338v = b0.e.h(this.f8339w, i4);
        e();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintList(@k0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8333q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f8334r = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8340x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f8334r = c4;
        this.f8336t = Character.toLowerCase(c5);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f8331o = this.f8339w.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8332p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        this.E = (this.E & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f8336t = Character.toLowerCase(c4);
        this.f8337u = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setContentDescription(CharSequence charSequence) {
        this.f8341y = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8338v = drawable;
        e();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f8334r = c4;
        this.f8335s = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f8334r = c4;
        this.f8335s = KeyEvent.normalizeMetaState(i4);
        this.f8336t = Character.toLowerCase(c5);
        this.f8337u = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8331o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setTooltipText(CharSequence charSequence) {
        this.f8342z = charSequence;
        return this;
    }
}
