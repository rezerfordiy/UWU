package l0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface b extends MenuItem {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f8433g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f8434h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8435i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f8436j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f8437k = 8;

    boolean a();

    b b(v0.b bVar);

    v0.b c();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i4);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c4, char c5, int i4, int i5);

    @Override // android.view.MenuItem
    void setShowAsAction(int i4);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i4);

    @Override // android.view.MenuItem
    b setTooltipText(CharSequence charSequence);
}
