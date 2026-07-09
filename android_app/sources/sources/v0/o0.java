package v0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12099a = "MenuItemCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f12100b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f12101c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f12102d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f12103e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f12104f = 8;

    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f12105a;

        public a(b bVar) {
            this.f12105a = bVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f12105a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f12105a.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    public interface b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static v0.b c(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).c();
        }
        Log.w(f12099a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }

    public static CharSequence f(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }

    public static ColorStateList g(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }

    public static PorterDuff.Mode h(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }

    public static int i(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }

    public static CharSequence j(MenuItem menuItem) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem l(MenuItem menuItem, v0.b bVar) {
        if (menuItem instanceof l0.b) {
            return ((l0.b) menuItem).b(bVar);
        }
        Log.w(f12099a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i4) {
        return menuItem.setActionView(i4);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setAlphabeticShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c4, i4);
        }
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void q(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void r(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void s(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setNumericShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c4, i4);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, b bVar) {
        return menuItem.setOnActionExpandListener(new a(bVar));
    }

    public static void u(MenuItem menuItem, char c4, char c5, int i4, int i5) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setShortcut(c4, c5, i4, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setShortcut(c4, c5, i4, i5);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof l0.b) {
            ((l0.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
