package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c.j0;
import c.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v0.b1;
import v0.q2;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class y {

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4070f;

        public a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4066b = i4;
            this.f4067c = arrayList;
            this.f4068d = arrayList2;
            this.f4069e = arrayList3;
            this.f4070f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f4066b; i4++) {
                z1.r2((View) this.f4067c.get(i4), (String) this.f4068d.get(i4));
                z1.r2((View) this.f4069e.get(i4), (String) this.f4070f.get(i4));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f4073c;

        public b(ArrayList arrayList, Map map) {
            this.f4072b = arrayList;
            this.f4073c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.f4072b.get(i4);
                String strW0 = z1.w0(view);
                if (strW0 != null) {
                    z1.r2(view, y.i(this.f4073c, strW0));
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f4076c;

        public c(ArrayList arrayList, Map map) {
            this.f4075b = arrayList;
            this.f4076c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4075b.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.f4075b.get(i4);
                z1.r2(view, (String) this.f4076c.get(z1.w0(view)));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (z1.w0(view) != null) {
            list.add(view);
        }
        for (int i4 = size; i4 < list.size(); i4++) {
            View view2 = list.get(i4);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!h(list, childAt, size) && z1.w0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    public static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z3 = view instanceof ViewGroup;
            View view2 = view;
            if (z3) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zC = q2.c(viewGroup);
                view2 = viewGroup;
                if (!zC) {
                    int childCount = viewGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        f(arrayList, viewGroup.getChildAt(i4));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    public void j(Map<String, View> map, @j0 View view) {
        if (view.getVisibility() == 0) {
            String strW0 = z1.w0(view);
            if (strW0 != null) {
                map.put(strW0, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    j(map, viewGroup.getChildAt(i4));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (z1.N0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = arrayList.get(i4);
            arrayList2.add(z1.w0(view));
            z1.r2(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        b1.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(@j0 Fragment fragment, @j0 Object obj, @j0 p0.b bVar, @j0 Runnable runnable) {
        runnable.run();
    }

    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        b1.a(view, new b(arrayList, map));
    }

    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = arrayList.get(i4);
            String strW0 = z1.w0(view2);
            arrayList4.add(strW0);
            if (strW0 != null) {
                z1.r2(view2, null);
                String str = map.get(strW0);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        z1.r2(arrayList2.get(i5), strW0);
                        break;
                    }
                    i5++;
                }
            }
        }
        b1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
