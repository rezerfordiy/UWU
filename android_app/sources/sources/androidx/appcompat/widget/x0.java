package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends v0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f1904k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1905l = "share_history.xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f1907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f1908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f1910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f f1911j;

    public interface a {
        boolean a(x0 x0Var, Intent intent);
    }

    public class b implements c.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.c.f
        public boolean a(androidx.appcompat.widget.c cVar, Intent intent) {
            x0 x0Var = x0.this;
            a aVar = x0Var.f1910i;
            if (aVar == null) {
                return false;
            }
            aVar.a(x0Var, intent);
            return false;
        }
    }

    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            x0 x0Var = x0.this;
            Intent intentB = androidx.appcompat.widget.c.d(x0Var.f1908g, x0Var.f1909h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                x0.this.r(intentB);
            }
            x0.this.f1908g.startActivity(intentB);
            return true;
        }
    }

    public x0(Context context) {
        super(context);
        this.f1906e = 4;
        this.f1907f = new c();
        this.f1909h = f1905l;
        this.f1908g = context;
    }

    @Override // v0.b
    public boolean b() {
        return true;
    }

    @Override // v0.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1908g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.c.d(this.f1908g, this.f1909h));
        }
        TypedValue typedValue = new TypedValue();
        this.f1908g.getTheme().resolveAttribute(a.c.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(f.a.d(this.f1908g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(a.l.f7223z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(a.l.f7222y);
        return activityChooserView;
    }

    @Override // v0.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.c cVarD = androidx.appcompat.widget.c.d(this.f1908g, this.f1909h);
        PackageManager packageManager = this.f1908g.getPackageManager();
        int iF = cVarD.f();
        int iMin = Math.min(iF, this.f1906e);
        for (int i4 = 0; i4 < iMin; i4++) {
            ResolveInfo resolveInfoE = cVarD.e(i4);
            subMenu.add(0, i4, i4, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1907f);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f1908g.getString(a.l.f7202e));
            for (int i5 = 0; i5 < iF; i5++) {
                ResolveInfo resolveInfoE2 = cVarD.e(i5);
                subMenuAddSubMenu.add(0, i5, i5, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1907f);
            }
        }
    }

    public final void n() {
        if (this.f1910i == null) {
            return;
        }
        if (this.f1911j == null) {
            this.f1911j = new b();
        }
        androidx.appcompat.widget.c.d(this.f1908g, this.f1909h).u(this.f1911j);
    }

    public void o(a aVar) {
        this.f1910i = aVar;
        n();
    }

    public void p(String str) {
        this.f1909h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.c.d(this.f1908g, this.f1909h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
