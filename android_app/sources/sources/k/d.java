package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements f, j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f8358b;

    public static boolean B(androidx.appcompat.view.menu.e eVar) {
        int size = eVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = eVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.d C(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) listAdapter;
    }

    public static int s(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public abstract void A(int i4);

    @Override // androidx.appcompat.view.menu.j
    public int a() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public k d(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(@j0 Context context, @k0 androidx.appcompat.view.menu.e eVar) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(androidx.appcompat.view.menu.e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.e eVar, h hVar) {
        return false;
    }

    public abstract void o(androidx.appcompat.view.menu.e eVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C(listAdapter).f1145b.P((MenuItem) listAdapter.getItem(i4), this, q() ? 0 : 4);
    }

    public boolean q() {
        return true;
    }

    public Rect r() {
        return this.f8358b;
    }

    public abstract void t(View view);

    public void u(Rect rect) {
        this.f8358b = rect;
    }

    public abstract void v(boolean z3);

    public abstract void w(int i4);

    public abstract void x(int i4);

    public abstract void y(PopupWindow.OnDismissListener onDismissListener);

    public abstract void z(boolean z3);
}
