package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class g extends e implements SubMenu {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0.c f8360p;

    public g(Context context, l0.c cVar) {
        super(context, cVar);
        this.f8360p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f8360p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f8360p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        this.f8360p.setHeaderIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        this.f8360p.setHeaderTitle(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f8360p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.f8360p.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f8360p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f8360p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f8360p.setIcon(drawable);
        return this;
    }
}
