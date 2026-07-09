package com.sonoptek.pvus_android;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sonoHealth.microVUE.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f5931c;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f5932a;

        public a() {
        }
    }

    public f(Context context, List<String> list) {
        this.f5930b = context;
        this.f5931c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5931c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f5931c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = View.inflate(this.f5930b, R.layout.examination_view, null);
            aVar2.f5932a = (TextView) viewInflate.findViewById(R.id.examination_name);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            aVar = (a) view.getTag();
        }
        int identifier = this.f5930b.getResources().getIdentifier(this.f5931c.get(i4), "string", this.f5930b.getPackageName());
        String string = this.f5931c.get(i4);
        if (identifier != 0) {
            string = this.f5930b.getResources().getString(identifier);
        } else {
            String str = this.f5931c.get(i4);
            int identifier2 = this.f5930b.getResources().getIdentifier(str.substring(0, str.indexOf(" ")), "string", this.f5930b.getPackageName());
            if (identifier2 != 0) {
                string = this.f5930b.getResources().getString(identifier2);
            }
        }
        aVar.f5932a.setText(string);
        return view;
    }
}
