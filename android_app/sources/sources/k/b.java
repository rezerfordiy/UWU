package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f8343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i<l0.b, MenuItem> f8344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i<l0.c, SubMenu> f8345n;

    public b(Context context) {
        this.f8343l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof l0.b)) {
            return menuItem;
        }
        l0.b bVar = (l0.b) menuItem;
        if (this.f8344m == null) {
            this.f8344m = new i<>();
        }
        MenuItem menuItem2 = this.f8344m.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f8343l, bVar);
        this.f8344m.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof l0.c)) {
            return subMenu;
        }
        l0.c cVar = (l0.c) subMenu;
        if (this.f8345n == null) {
            this.f8345n = new i<>();
        }
        SubMenu subMenu2 = this.f8345n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f8343l, cVar);
        this.f8345n.put(cVar, gVar);
        return gVar;
    }

    public final void g() {
        i<l0.b, MenuItem> iVar = this.f8344m;
        if (iVar != null) {
            iVar.clear();
        }
        i<l0.c, SubMenu> iVar2 = this.f8345n;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    public final void h(int i4) {
        if (this.f8344m == null) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f8344m.size()) {
            if (this.f8344m.i(i5).getGroupId() == i4) {
                this.f8344m.k(i5);
                i5--;
            }
            i5++;
        }
    }

    public final void i(int i4) {
        if (this.f8344m == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f8344m.size(); i5++) {
            if (this.f8344m.i(i5).getItemId() == i4) {
                this.f8344m.k(i5);
                return;
            }
        }
    }
}
