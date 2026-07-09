package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import c.r0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class p0 extends ListPopupWindow implements n0 {
    public static final String V = "MenuPopupWindow";
    public static Method W;
    public n0 U;

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static class a extends i0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f1791r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f1792s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public n0 f1793t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public MenuItem f1794u;

        public a(Context context, boolean z3) {
            super(context, z3);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1791r = 21;
                this.f1792s = 22;
            } else {
                this.f1791r = 22;
                this.f1792s = 21;
            }
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ int d(int i4, boolean z3) {
            return super.d(i4, z3);
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ int e(int i4, int i5, int i6, int i7, int i8) {
            return super.e(i4, i5, i6, i7, i8);
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i4) {
            return super.f(motionEvent, i4);
        }

        @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void n() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i4;
            if (this.f1793t != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = iPointToPosition - headersCount) < 0 || i4 >= dVar.getCount()) ? null : dVar.getItem(i4);
                MenuItem menuItem = this.f1794u;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f1793t.b(eVarB, menuItem);
                    }
                    this.f1794u = item;
                    if (item != null) {
                        this.f1793t.a(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f1791r) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i4 != this.f1792s) {
                return super.onKeyDown(i4, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(n0 n0Var) {
            this.f1793t = n0Var;
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(V, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public p0(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.appcompat.widget.n0
    public void a(@c.j0 androidx.appcompat.view.menu.e eVar, @c.j0 MenuItem menuItem) {
        n0 n0Var = this.U;
        if (n0Var != null) {
            n0Var.a(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public void b(@c.j0 androidx.appcompat.view.menu.e eVar, @c.j0 MenuItem menuItem) {
        n0 n0Var = this.U;
        if (n0Var != null) {
            n0Var.b(eVar, menuItem);
        }
    }

    public void p0(Object obj) {
        this.G.setEnterTransition((Transition) obj);
    }

    public void q0(Object obj) {
        this.G.setExitTransition((Transition) obj);
    }

    public void r0(n0 n0Var) {
        this.U = n0Var;
    }

    public void s0(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            this.G.setTouchModal(z3);
            return;
        }
        Method method = W;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i(V, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @c.j0
    public i0 u(Context context, boolean z3) {
        a aVar = new a(context, z3);
        aVar.setHoverListener(this);
        return aVar;
    }
}
