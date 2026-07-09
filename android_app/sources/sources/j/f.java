package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import c.r0;
import j.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8219b;

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f8220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f8221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f> f8222c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p.i<Menu, Menu> f8223d = new p.i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f8221b = context;
            this.f8220a = callback;
        }

        @Override // j.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f8220a.onActionItemClicked(e(bVar), new k.c(this.f8221b, (l0.b) menuItem));
        }

        @Override // j.b.a
        public void b(b bVar) {
            this.f8220a.onDestroyActionMode(e(bVar));
        }

        @Override // j.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f8220a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // j.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f8220a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f8222c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = this.f8222c.get(i4);
                if (fVar != null && fVar.f8219b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f8221b, bVar);
            this.f8222c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f8223d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            k.e eVar = new k.e(this.f8221b, (l0.a) menu);
            this.f8223d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f8218a = context;
        this.f8219b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f8219b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f8219b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new k.e(this.f8218a, (l0.a) this.f8219b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f8219b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f8219b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f8219b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f8219b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f8219b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f8219b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f8219b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f8219b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i4) {
        this.f8219b.o(i4);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f8219b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i4) {
        this.f8219b.r(i4);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z3) {
        this.f8219b.t(z3);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f8219b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f8219b.s(charSequence);
    }
}
