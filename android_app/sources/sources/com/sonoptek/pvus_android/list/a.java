package com.sonoptek.pvus_android.list;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.sonoptek.pvus_android.list.SwipeLayout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<T> f6078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f6079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeLayout f6080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f6081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f6082f;

    /* JADX INFO: renamed from: com.sonoptek.pvus_android.list.a$a, reason: collision with other inner class name */
    public class C0047a implements SwipeLayout.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6083a;

        public C0047a(int i4) {
            this.f6083a = i4;
        }

        @Override // com.sonoptek.pvus_android.list.SwipeLayout.a
        public void a(View view) {
            if (a.this.f6081e != null) {
                a.this.f6081e.a(this.f6083a, view);
            }
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SwipeLayout f6085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f6086c;

        public b(SwipeLayout swipeLayout, int i4) {
            this.f6085b = swipeLayout;
            this.f6086c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SwipeLayout swipeLayout;
            if (this.f6085b.e()) {
                swipeLayout = this.f6085b;
            } else {
                SwipeLayout swipeLayout2 = a.this.f6080d;
                if (swipeLayout2 == null || !swipeLayout2.e()) {
                    if (a.this.f6082f != null) {
                        a.this.f6082f.a(this.f6086c, view);
                        return;
                    }
                    return;
                }
                swipeLayout = a.this.f6080d;
            }
            swipeLayout.b();
        }
    }

    public class c implements SwipeLayout.c {
        public c() {
        }

        @Override // com.sonoptek.pvus_android.list.SwipeLayout.c
        public void a(View view, boolean z3) {
            if (!z3) {
                a.this.f6080d = null;
            } else {
                a.this.f6080d = (SwipeLayout) view;
            }
        }
    }

    public class d implements SwipeLayout.b {
        public d() {
        }

        @Override // com.sonoptek.pvus_android.list.SwipeLayout.b
        public void a(View view) {
            SwipeLayout swipeLayout = a.this.f6080d;
            if (swipeLayout == null || view == swipeLayout) {
                return;
            }
            swipeLayout.b();
        }
    }

    public interface e {
        void a(int i4, View view);
    }

    public interface f {
        void a(int i4, View view);
    }

    public a(Context context, List<T> list) {
        this.f6079c = context;
        this.f6078b = list;
    }

    public void c(View view, View view2) {
        if (view instanceof SwipeLayout) {
            ((SwipeLayout) view).a(view2);
        }
    }

    public void d(View view, int i4) {
        if (view instanceof SwipeLayout) {
            SwipeLayout swipeLayout = (SwipeLayout) view;
            swipeLayout.setOnMenuClickListener(new C0047a(i4));
            swipeLayout.setOnClickListener(new b(swipeLayout, i4));
            swipeLayout.setOnSwitchScrollListener(new c());
            swipeLayout.setOnStartScrollListener(new d());
        }
    }

    public void e(View view) {
        if (view instanceof SwipeLayout) {
            ((SwipeLayout) view).g();
        }
    }

    public void f(View view, int i4) {
        if (view instanceof SwipeLayout) {
            ((SwipeLayout) view).h(i4);
        }
    }

    public void g(List<T> list) {
        this.f6078b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6078b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f6078b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public void h(e eVar) {
        this.f6082f = eVar;
    }

    public void i(f fVar) {
        this.f6081e = fVar;
    }

    public void j(View view, int i4) {
        if (view instanceof SwipeLayout) {
            ((SwipeLayout) view).setScrollDelay(i4);
        }
    }
}
