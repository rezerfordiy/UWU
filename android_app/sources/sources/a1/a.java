package a1;

import a1.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f492k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f493l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public boolean f494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public boolean f495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public Cursor f496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public Context f497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public int f498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public C0004a f499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public DataSetObserver f500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public a1.b f501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public FilterQueryProvider f502j;

    /* JADX INFO: renamed from: a1.a$a, reason: collision with other inner class name */
    public class C0004a extends ContentObserver {
        public C0004a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            a.this.k();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f494b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f494b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    @Override // a1.b.a
    public CharSequence a(Cursor cursor) {
        return cursor == null ? s0.a.f11071l : cursor.toString();
    }

    @Override // a1.b.a
    public void b(Cursor cursor) {
        Cursor cursorM = m(cursor);
        if (cursorM != null) {
            cursorM.close();
        }
    }

    @Override // a1.b.a
    public Cursor c() {
        return this.f496d;
    }

    @Override // a1.b.a
    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f502j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f496d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.f502j;
    }

    public void g(Context context, Cursor cursor, int i4) {
        b bVar;
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f495c = true;
        } else {
            this.f495c = false;
        }
        boolean z3 = cursor != null;
        this.f496d = cursor;
        this.f494b = z3;
        this.f497e = context;
        this.f498f = z3 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i4 & 2) == 2) {
            this.f499g = new C0004a();
            bVar = new b();
        } else {
            bVar = null;
            this.f499g = null;
        }
        this.f500h = bVar;
        if (z3) {
            C0004a c0004a = this.f499g;
            if (c0004a != null) {
                cursor.registerContentObserver(c0004a);
            }
            DataSetObserver dataSetObserver = this.f500h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f494b || (cursor = this.f496d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f494b) {
            return null;
        }
        this.f496d.moveToPosition(i4);
        if (view == null) {
            view = i(this.f497e, this.f496d, viewGroup);
        }
        e(view, this.f497e, this.f496d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f501i == null) {
            this.f501i = new a1.b(this);
        }
        return this.f501i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f494b || (cursor = this.f496d) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f496d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (this.f494b && (cursor = this.f496d) != null && cursor.moveToPosition(i4)) {
            return this.f496d.getLong(this.f498f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f494b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f496d.moveToPosition(i4)) {
            if (view == null) {
                view = j(this.f497e, this.f496d, viewGroup);
            }
            e(view, this.f497e, this.f496d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i4);
    }

    @Deprecated
    public void h(Context context, Cursor cursor, boolean z3) {
        g(context, cursor, z3 ? 1 : 2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return j(context, cursor, viewGroup);
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    public void k() {
        Cursor cursor;
        if (!this.f495c || (cursor = this.f496d) == null || cursor.isClosed()) {
            return;
        }
        this.f494b = this.f496d.requery();
    }

    public void l(FilterQueryProvider filterQueryProvider) {
        this.f502j = filterQueryProvider;
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f496d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0004a c0004a = this.f499g;
            if (c0004a != null) {
                cursor2.unregisterContentObserver(c0004a);
            }
            DataSetObserver dataSetObserver = this.f500h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f496d = cursor;
        if (cursor != null) {
            C0004a c0004a2 = this.f499g;
            if (c0004a2 != null) {
                cursor.registerContentObserver(c0004a2);
            }
            DataSetObserver dataSetObserver2 = this.f500h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f498f = cursor.getColumnIndexOrThrow("_id");
            this.f494b = true;
            notifyDataSetChanged();
        } else {
            this.f498f = -1;
            this.f494b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, int i4) {
        g(context, cursor, i4);
    }

    public a(Context context, Cursor cursor, boolean z3) {
        g(context, cursor, z3 ? 1 : 2);
    }
}
