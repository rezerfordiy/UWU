package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import c.j0;
import c.k0;
import c.r0;
import c.v0;
import e.a;
import v0.t;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class i implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f1186m = 48;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j.a f1195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k.d f1196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1198l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.g();
        }
    }

    public i(@j0 Context context, @j0 e eVar) {
        this(context, eVar, null, false, a.c.G2, 0);
    }

    @Override // androidx.appcompat.view.menu.g
    public void a(@k0 j.a aVar) {
        this.f1195i = aVar;
        k.d dVar = this.f1196j;
        if (dVar != null) {
            dVar.l(aVar);
        }
    }

    @j0
    public final k.d b() {
        Display defaultDisplay = ((WindowManager) this.f1187a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        k.d bVar = Math.min(point.x, point.y) >= this.f1187a.getResources().getDimensionPixelSize(a.f.f7022w) ? new b(this.f1187a, this.f1192f, this.f1190d, this.f1191e, this.f1189c) : new l(this.f1187a, this.f1188b, this.f1192f, this.f1190d, this.f1191e, this.f1189c);
        bVar.o(this.f1188b);
        bVar.y(this.f1198l);
        bVar.t(this.f1192f);
        bVar.l(this.f1195i);
        bVar.v(this.f1194h);
        bVar.w(this.f1193g);
        return bVar;
    }

    public int c() {
        return this.f1193g;
    }

    public ListView d() {
        return e().p();
    }

    @Override // androidx.appcompat.view.menu.g
    public void dismiss() {
        if (f()) {
            this.f1196j.dismiss();
        }
    }

    @j0
    @r0({r0.a.LIBRARY})
    public k.d e() {
        if (this.f1196j == null) {
            this.f1196j = b();
        }
        return this.f1196j;
    }

    public boolean f() {
        k.d dVar = this.f1196j;
        return dVar != null && dVar.c();
    }

    public void g() {
        this.f1196j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1197k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@j0 View view) {
        this.f1192f = view;
    }

    public void i(boolean z3) {
        this.f1194h = z3;
        k.d dVar = this.f1196j;
        if (dVar != null) {
            dVar.v(z3);
        }
    }

    public void j(int i4) {
        this.f1193g = i4;
    }

    public void k(@k0 PopupWindow.OnDismissListener onDismissListener) {
        this.f1197k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i4, int i5) {
        if (!p(i4, i5)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void n(int i4, int i5, boolean z3, boolean z4) {
        k.d dVarE = e();
        dVarE.z(z4);
        if (z3) {
            if ((t.d(this.f1193g, z1.X(this.f1192f)) & 7) == 5) {
                i4 -= this.f1192f.getWidth();
            }
            dVarE.x(i4);
            dVarE.A(i5);
            int i6 = (int) ((this.f1187a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarE.u(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        dVarE.e();
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f1192f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i4, int i5) {
        if (f()) {
            return true;
        }
        if (this.f1192f == null) {
            return false;
        }
        n(i4, i5, true, true);
        return true;
    }

    public i(@j0 Context context, @j0 e eVar, @j0 View view) {
        this(context, eVar, view, false, a.c.G2, 0);
    }

    public i(@j0 Context context, @j0 e eVar, @j0 View view, boolean z3, @c.f int i4) {
        this(context, eVar, view, z3, i4, 0);
    }

    public i(@j0 Context context, @j0 e eVar, @j0 View view, boolean z3, @c.f int i4, @v0 int i5) {
        this.f1193g = 8388611;
        this.f1198l = new a();
        this.f1187a = context;
        this.f1188b = eVar;
        this.f1192f = view;
        this.f1189c = z3;
        this.f1190d = i4;
        this.f1191e = i5;
    }
}
