package f2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.sonoHealth.microVUE.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f7628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<T> f7629c;

    public a(Context context) {
        this.f7628b = context;
    }

    public abstract void a(e eVar, T t4);

    public void b(List<T> list) {
        this.f7629c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<T> list = this.f7629c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f7629c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        e eVarA = e.a(view, viewGroup, R.layout.list_item, i4);
        a(eVarA, getItem(i4));
        return eVarA.b();
    }
}
