package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c.o0;
import c.r0;
import java.lang.reflect.Method;
import v0.b;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class c extends k.b implements MenuItem {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f8346q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0.b f8347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Method f8348p;

    public class a extends v0.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f8349e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f8349e = actionProvider;
        }

        @Override // v0.b
        public boolean b() {
            return this.f8349e.hasSubMenu();
        }

        @Override // v0.b
        public View d() {
            return this.f8349e.onCreateActionView();
        }

        @Override // v0.b
        public boolean f() {
            return this.f8349e.onPerformDefaultAction();
        }

        @Override // v0.b
        public void g(SubMenu subMenu) {
            this.f8349e.onPrepareSubMenu(c.this.f(subMenu));
        }
    }

    @o0(16)
    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b.InterfaceC0121b f8351g;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // v0.b
        public boolean c() {
            return this.f8349e.isVisible();
        }

        @Override // v0.b
        public View e(MenuItem menuItem) {
            return this.f8349e.onCreateActionView(menuItem);
        }

        @Override // v0.b
        public boolean h() {
            return this.f8349e.overridesItemVisibility();
        }

        @Override // v0.b
        public void i() {
            this.f8349e.refreshVisibility();
        }

        @Override // v0.b
        public void l(b.InterfaceC0121b interfaceC0121b) {
            this.f8351g = interfaceC0121b;
            this.f8349e.setVisibilityListener(interfaceC0121b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z3) {
            b.InterfaceC0121b interfaceC0121b = this.f8351g;
            if (interfaceC0121b != null) {
                interfaceC0121b.onActionProviderVisibilityChanged(z3);
            }
        }
    }

    /* JADX INFO: renamed from: k.c$c, reason: collision with other inner class name */
    public static class C0068c extends FrameLayout implements j.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CollapsibleActionView f8353b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0068c(View view) {
            super(view.getContext());
            this.f8353b = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f8353b;
        }

        @Override // j.c
        public void c() {
            this.f8353b.onActionViewExpanded();
        }

        @Override // j.c
        public void d() {
            this.f8353b.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f8354a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f8354a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f8354a.onMenuItemActionCollapse(c.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f8354a.onMenuItemActionExpand(c.this.e(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f8356a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f8356a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f8356a.onMenuItemClick(c.this.e(menuItem));
        }
    }

    public c(Context context, l0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f8347o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f8347o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f8347o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        v0.b bVarC = this.f8347o.c();
        if (bVarC instanceof a) {
            return ((a) bVarC).f8349e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f8347o.getActionView();
        return actionView instanceof C0068c ? ((C0068c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8347o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8347o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8347o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8347o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f8347o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8347o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8347o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8347o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8347o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8347o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8347o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8347o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8347o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f8347o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8347o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f8347o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8347o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f8347o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f8347o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f8347o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f8347o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f8347o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f8347o.isVisible();
    }

    public void j(boolean z3) {
        try {
            if (this.f8348p == null) {
                this.f8348p = this.f8347o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f8348p.invoke(this.f8347o, Boolean.valueOf(z3));
        } catch (Exception e4) {
            Log.w(f8346q, "Error while calling setExclusiveCheckable", e4);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f8343l, actionProvider);
        l0.b bVar2 = this.f8347o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i4) {
        this.f8347o.setActionView(i4);
        View actionView = this.f8347o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f8347o.setActionView(new C0068c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f8347o.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f8347o.setCheckable(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f8347o.setChecked(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f8347o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f8347o.setEnabled(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f8347o.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8347o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8347o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8347o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f8347o.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8347o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8347o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f8347o.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        this.f8347o.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i4) {
        this.f8347o.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f8347o.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8347o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f8347o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        return this.f8347o.setVisible(z3);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0068c(view);
        }
        this.f8347o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f8347o.setAlphabeticShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8347o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f8347o.setNumericShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f8347o.setShortcut(c4, c5, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8347o.setTitle(charSequence);
        return this;
    }
}
