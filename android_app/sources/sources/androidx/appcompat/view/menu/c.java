package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import c.r0;
import e.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1131l = "ListMenuPresenter";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1132m = "android:menu:list";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f1134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f1135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f1136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j.a f1140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f1141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1142k;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1143b = -1;

        public a() {
            a();
        }

        public void a() {
            h hVarY = c.this.f1135d.y();
            if (hVarY != null) {
                ArrayList<h> arrayListC = c.this.f1135d.C();
                int size = arrayListC.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (arrayListC.get(i4) == hVarY) {
                        this.f1143b = i4;
                        return;
                    }
                }
            }
            this.f1143b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h getItem(int i4) {
            ArrayList<h> arrayListC = c.this.f1135d.C();
            int i5 = i4 + c.this.f1137f;
            int i6 = this.f1143b;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return arrayListC.get(i5);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1135d.C().size() - c.this.f1137f;
            return this.f1143b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1134c.inflate(cVar.f1139h, viewGroup, false);
            }
            ((k.a) view).f(getItem(i4), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i4, int i5) {
        this.f1139h = i4;
        this.f1138g = i5;
    }

    @Override // androidx.appcompat.view.menu.j
    public int a() {
        return this.f1142k;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z3) {
        j.a aVar = this.f1140i;
        if (aVar != null) {
            aVar.b(eVar, z3);
        }
    }

    public ListAdapter c() {
        if (this.f1141j == null) {
            this.f1141j = new a();
        }
        return this.f1141j;
    }

    @Override // androidx.appcompat.view.menu.j
    public k d(ViewGroup viewGroup) {
        if (this.f1136e == null) {
            this.f1136e = (ExpandedMenuView) this.f1134c.inflate(a.k.f7185n, viewGroup, false);
            if (this.f1141j == null) {
                this.f1141j = new a();
            }
            this.f1136e.setAdapter((ListAdapter) this.f1141j);
            this.f1136e.setOnItemClickListener(this);
        }
        return this.f1136e;
    }

    public int e() {
        return this.f1137f;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        if (this.f1136e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        p(bundle);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f1138g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1138g
            r0.<init>(r3, r1)
            r2.f1133b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f1134c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f1133b
            if (r0 == 0) goto L23
            r2.f1133b = r3
            android.view.LayoutInflater r0 = r2.f1134c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f1135d = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f1141j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.h(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable) {
        o((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(j.a aVar) {
        this.f1140i = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).e(null);
        j.a aVar = this.f1140i;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void n(boolean z3) {
        a aVar = this.f1141j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f1132m);
        if (sparseParcelableArray != null) {
            this.f1136e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        this.f1135d.P(this.f1141j.getItem(i4), this, 0);
    }

    public void p(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1136e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f1132m, sparseArray);
    }

    public void q(int i4) {
        this.f1142k = i4;
    }

    public void r(int i4) {
        this.f1137f = i4;
        if (this.f1136e != null) {
            n(false);
        }
    }

    public c(Context context, int i4) {
        this(i4, 0);
        this.f1133b = context;
        this.f1134c = LayoutInflater.from(context);
    }
}
