package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import c.r0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f1145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1146c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f1149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1150g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f1148e = z3;
        this.f1149f = layoutInflater;
        this.f1145b = eVar;
        this.f1150g = i4;
        a();
    }

    public void a() {
        h hVarY = this.f1145b.y();
        if (hVarY != null) {
            ArrayList<h> arrayListC = this.f1145b.C();
            int size = arrayListC.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (arrayListC.get(i4) == hVarY) {
                    this.f1146c = i4;
                    return;
                }
            }
        }
        this.f1146c = -1;
    }

    public e b() {
        return this.f1145b;
    }

    public boolean c() {
        return this.f1147d;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h getItem(int i4) {
        ArrayList<h> arrayListC = this.f1148e ? this.f1145b.C() : this.f1145b.H();
        int i5 = this.f1146c;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return arrayListC.get(i4);
    }

    public void e(boolean z3) {
        this.f1147d = z3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<h> arrayListC = this.f1148e ? this.f1145b.C() : this.f1145b.H();
        int i4 = this.f1146c;
        int size = arrayListC.size();
        return i4 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1149f.inflate(this.f1150g, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1145b.I() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1147d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.f(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
