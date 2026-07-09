package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.ActivityChooserView;
import c.r0;
import v0.p2;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class i1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1741k = "TooltipCompatHandler";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f1742l = 2500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f1743m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f1744n = 3000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static i1 f1745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static i1 f1746p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f1748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f1750e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f1751f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j1 f1754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1755j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i1.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i1.this.c();
        }
    }

    public i1(View view, CharSequence charSequence) {
        this.f1747b = view;
        this.f1748c = charSequence;
        this.f1749d = p2.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(i1 i1Var) {
        i1 i1Var2 = f1745o;
        if (i1Var2 != null) {
            i1Var2.a();
        }
        f1745o = i1Var;
        if (i1Var != null) {
            i1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        i1 i1Var = f1745o;
        if (i1Var != null && i1Var.f1747b == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new i1(view, charSequence);
            return;
        }
        i1 i1Var2 = f1746p;
        if (i1Var2 != null && i1Var2.f1747b == view) {
            i1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void a() {
        this.f1747b.removeCallbacks(this.f1750e);
    }

    public final void b() {
        this.f1752g = ActivityChooserView.f.f1331h;
        this.f1753h = ActivityChooserView.f.f1331h;
    }

    public void c() {
        if (f1746p == this) {
            f1746p = null;
            j1 j1Var = this.f1754i;
            if (j1Var != null) {
                j1Var.c();
                this.f1754i = null;
                b();
                this.f1747b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f1741k, "sActiveHandler.mPopup == null");
            }
        }
        if (f1745o == this) {
            e(null);
        }
        this.f1747b.removeCallbacks(this.f1751f);
    }

    public final void d() {
        this.f1747b.postDelayed(this.f1750e, ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z3) {
        long longPressTimeout;
        long j4;
        long j5;
        if (z1.N0(this.f1747b)) {
            e(null);
            i1 i1Var = f1746p;
            if (i1Var != null) {
                i1Var.c();
            }
            f1746p = this;
            this.f1755j = z3;
            j1 j1Var = new j1(this.f1747b.getContext());
            this.f1754i = j1Var;
            j1Var.e(this.f1747b, this.f1752g, this.f1753h, this.f1755j, this.f1748c);
            this.f1747b.addOnAttachStateChangeListener(this);
            if (this.f1755j) {
                j5 = f1742l;
            } else {
                if ((z1.B0(this.f1747b) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = f1744n;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = f1743m;
                }
                j5 = j4 - longPressTimeout;
            }
            this.f1747b.removeCallbacks(this.f1751f);
            this.f1747b.postDelayed(this.f1751f, j5);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (Math.abs(x3 - this.f1752g) <= this.f1749d && Math.abs(y3 - this.f1753h) <= this.f1749d) {
            return false;
        }
        this.f1752g = x3;
        this.f1753h = y3;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1754i != null && this.f1755j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1747b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1747b.isEnabled() && this.f1754i == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1752g = view.getWidth() / 2;
        this.f1753h = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
