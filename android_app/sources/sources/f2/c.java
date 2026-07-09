package f2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sonoHealth.microVUE.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f7638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<d> f7639c;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f7640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f7641b;

        public b() {
        }
    }

    public c(Context context) {
        this.f7638b = context;
    }

    public void a(List<d> list) {
        this.f7639c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7639c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f7639c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        ImageView imageView;
        int i5;
        if (view == null) {
            bVar = new b();
            viewInflate = View.inflate(this.f7638b, R.layout.list_item, null);
            bVar.f7640a = (ImageView) viewInflate.findViewById(R.id.item_image);
            bVar.f7641b = (TextView) viewInflate.findViewById(R.id.item_text);
            viewInflate.setTag(bVar);
        } else {
            viewInflate = view;
            bVar = (b) view.getTag();
        }
        String str = this.f7639c.get(i4).f7643a;
        bVar.f7641b.setText(str.substring(str.lastIndexOf("/") + 1));
        if (this.f7639c.get(i4).f7644b) {
            imageView = bVar.f7640a;
            i5 = 0;
        } else {
            imageView = bVar.f7640a;
            i5 = 4;
        }
        imageView.setVisibility(i5);
        return viewInflate;
    }
}
