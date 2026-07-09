package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e extends b implements Menu {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0.a f8359o;

    public e(Context context, l0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f8359o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return e(this.f8359o.add(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f8359o.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = e(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return f(this.f8359o.addSubMenu(i4));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f8359o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f8359o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        return e(this.f8359o.findItem(i4));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return e(this.f8359o.getItem(i4));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f8359o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f8359o.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return this.f8359o.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f8359o.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        h(i4);
        this.f8359o.removeGroup(i4);
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        i(i4);
        this.f8359o.removeItem(i4);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        this.f8359o.setGroupCheckable(i4, z3, z4);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        this.f8359o.setGroupEnabled(i4, z3);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        this.f8359o.setGroupVisible(i4, z3);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f8359o.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f8359o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return e(this.f8359o.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return f(this.f8359o.addSubMenu(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return e(this.f8359o.add(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return f(this.f8359o.addSubMenu(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f8359o.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f8359o.addSubMenu(charSequence));
    }
}
