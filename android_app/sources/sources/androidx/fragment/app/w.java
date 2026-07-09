package androidx.fragment.app;

import a0.o4;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import c.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v0.b1;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4007a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f4008b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f4009c = x();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f4010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f4011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p0.b f4012d;

        public a(g gVar, Fragment fragment, p0.b bVar) {
            this.f4010b = gVar;
            this.f4011c = fragment;
            this.f4012d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4010b.a(this.f4011c, this.f4012d);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4013b;

        public b(ArrayList arrayList) {
            this.f4013b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.B(this.f4013b, 4);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f4014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f4015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p0.b f4016d;

        public c(g gVar, Fragment fragment, p0.b bVar) {
            this.f4014b = gVar;
            this.f4015c = fragment;
            this.f4016d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4014b.a(this.f4015c, this.f4016d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f4017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f4018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f4019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f4020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4023h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Object f4024i;

        public d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4017b = obj;
            this.f4018c = yVar;
            this.f4019d = view;
            this.f4020e = fragment;
            this.f4021f = arrayList;
            this.f4022g = arrayList2;
            this.f4023h = arrayList3;
            this.f4024i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4017b;
            if (obj != null) {
                this.f4018c.p(obj, this.f4019d);
                this.f4022g.addAll(w.k(this.f4018c, this.f4017b, this.f4020e, this.f4021f, this.f4019d));
            }
            if (this.f4023h != null) {
                if (this.f4024i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4019d);
                    this.f4018c.q(this.f4024i, this.f4023h, arrayList);
                }
                this.f4023h.clear();
                this.f4023h.add(this.f4019d);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f4025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f4026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f4027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p.a f4028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f4029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ y f4030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Rect f4031h;

        public e(Fragment fragment, Fragment fragment2, boolean z3, p.a aVar, View view, y yVar, Rect rect) {
            this.f4025b = fragment;
            this.f4026c = fragment2;
            this.f4027d = z3;
            this.f4028e = aVar;
            this.f4029f = view;
            this.f4030g = yVar;
            this.f4031h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f4025b, this.f4026c, this.f4027d, this.f4028e, false);
            View view = this.f4029f;
            if (view != null) {
                this.f4030g.k(view, this.f4031h);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f4032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p.a f4033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f4034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f4035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f4037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Fragment f4038h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Fragment f4039i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f4040j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4041k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f4042l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Rect f4043m;

        public f(y yVar, p.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z3, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4032b = yVar;
            this.f4033c = aVar;
            this.f4034d = obj;
            this.f4035e = hVar;
            this.f4036f = arrayList;
            this.f4037g = view;
            this.f4038h = fragment;
            this.f4039i = fragment2;
            this.f4040j = z3;
            this.f4041k = arrayList2;
            this.f4042l = obj2;
            this.f4043m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a<String, View> aVarH = w.h(this.f4032b, this.f4033c, this.f4034d, this.f4035e);
            if (aVarH != null) {
                this.f4036f.addAll(aVarH.values());
                this.f4036f.add(this.f4037g);
            }
            w.f(this.f4038h, this.f4039i, this.f4040j, aVarH, false);
            Object obj = this.f4034d;
            if (obj != null) {
                this.f4032b.A(obj, this.f4041k, this.f4036f);
                View viewT = w.t(aVarH, this.f4035e, this.f4042l, this.f4040j);
                if (viewT != null) {
                    this.f4032b.k(viewT, this.f4043m);
                }
            }
        }
    }

    public interface g {
        void a(@j0 Fragment fragment, @j0 p0.b bVar);

        void b(@j0 Fragment fragment, @j0 p0.b bVar);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f4044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f4046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f4047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f4049f;
    }

    public static void A(y yVar, Object obj, Object obj2, p.a<String, View> aVar, boolean z3, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f3995p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z3 ? aVar2.f3996q : aVar2.f3995p).get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }

    public static void B(ArrayList<View> arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i4);
        }
    }

    public static void C(@j0 Context context, @j0 androidx.fragment.app.e eVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5, boolean z3, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i6 = i4; i6 < i5; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue()) {
                e(aVar, sparseArray, z3);
            } else {
                c(aVar, sparseArray, z3);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int iKeyAt = sparseArray.keyAt(i7);
                p.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i4, i5);
                h hVar = (h) sparseArray.valueAt(i7);
                if (eVar.g() && (viewGroup = (ViewGroup) eVar.f(iKeyAt)) != null) {
                    if (z3) {
                        o(viewGroup, hVar, view, aVarD, gVar);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar);
                    }
                }
            }
        }
    }

    public static boolean D() {
        return (f4008b == null && f4009c == null) ? false : true;
    }

    public static void a(ArrayList<View> arrayList, p.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewM = aVar.m(size);
            if (collection.contains(z1.w0(viewM))) {
                arrayList.add(viewM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(androidx.fragment.app.a r8, androidx.fragment.app.v.a r9, android.util.SparseArray<androidx.fragment.app.w.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z3) {
        int size = aVar.f3982c.size();
        for (int i4 = 0; i4 < size; i4++) {
            b(aVar, aVar.f3982c.get(i4), sparseArray, false, z3);
        }
    }

    public static p.a<String, String> d(int i4, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        p.a<String, String> aVar = new p.a<>();
        for (int i7 = i6 - 1; i7 >= i5; i7--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i7);
            if (aVar2.c0(i4)) {
                boolean zBooleanValue = arrayList2.get(i7).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3995p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f3995p;
                        arrayList4 = aVar2.f3996q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3995p;
                        arrayList3 = aVar2.f3996q;
                        arrayList4 = arrayList6;
                    }
                    for (int i8 = 0; i8 < size; i8++) {
                        String str = arrayList4.get(i8);
                        String str2 = arrayList3.get(i8);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z3) {
        if (aVar.L.B0().g()) {
            for (int size = aVar.f3982c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f3982c.get(size), sparseArray, true, z3);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z3, p.a<String, View> aVar, boolean z4) {
        o4 o4VarX = z3 ? fragment2.x() : fragment.x();
        if (o4VarX != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(aVar.i(i4));
                arrayList.add(aVar.m(i4));
            }
            if (z4) {
                o4VarX.g(arrayList2, arrayList, null);
            } else {
                o4VarX.f(arrayList2, arrayList, null);
            }
        }
    }

    public static boolean g(y yVar, List<Object> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!yVar.e(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static p.a<String, View> h(y yVar, p.a<String, String> aVar, Object obj, h hVar) {
        o4 o4VarX;
        ArrayList<String> arrayList;
        String strQ;
        Fragment fragment = hVar.f4044a;
        View viewF0 = fragment.f0();
        if (aVar.isEmpty() || obj == null || viewF0 == null) {
            aVar.clear();
            return null;
        }
        p.a<String, View> aVar2 = new p.a<>();
        yVar.j(aVar2, viewF0);
        androidx.fragment.app.a aVar3 = hVar.f4046c;
        if (hVar.f4045b) {
            o4VarX = fragment.A();
            arrayList = aVar3.f3995p;
        } else {
            o4VarX = fragment.x();
            arrayList = aVar3.f3996q;
        }
        if (arrayList != null) {
            aVar2.q(arrayList);
            aVar2.q(aVar.values());
        }
        if (o4VarX != null) {
            o4VarX.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String strQ2 = q(aVar, str);
                    if (strQ2 != null) {
                        aVar.remove(strQ2);
                    }
                } else if (!str.equals(z1.w0(view)) && (strQ = q(aVar, str)) != null) {
                    aVar.put(strQ, z1.w0(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    public static p.a<String, View> i(y yVar, p.a<String, String> aVar, Object obj, h hVar) {
        o4 o4VarA;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f4047d;
        p.a<String, View> aVar2 = new p.a<>();
        yVar.j(aVar2, fragment.S1());
        androidx.fragment.app.a aVar3 = hVar.f4049f;
        if (hVar.f4048e) {
            o4VarA = fragment.x();
            arrayList = aVar3.f3996q;
        } else {
            o4VarA = fragment.A();
            arrayList = aVar3.f3995p;
        }
        if (arrayList != null) {
            aVar2.q(arrayList);
        }
        if (o4VarA != null) {
            o4VarA.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(z1.w0(view))) {
                    aVar.put(z1.w0(view), aVar.remove(str));
                }
            }
        } else {
            aVar.q(aVar2.keySet());
        }
        return aVar2;
    }

    public static y j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objZ = fragment.z();
            if (objZ != null) {
                arrayList.add(objZ);
            }
            Object objT = fragment.T();
            if (objT != null) {
                arrayList.add(objT);
            }
            Object objV = fragment.V();
            if (objV != null) {
                arrayList.add(objV);
            }
        }
        if (fragment2 != null) {
            Object objW = fragment2.w();
            if (objW != null) {
                arrayList.add(objW);
            }
            Object objQ = fragment2.Q();
            if (objQ != null) {
                arrayList.add(objQ);
            }
            Object objU = fragment2.U();
            if (objU != null) {
                arrayList.add(objU);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        y yVar = f4008b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f4009c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> k(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewF0 = fragment.f0();
        if (viewF0 != null) {
            yVar.f(arrayList2, viewF0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        yVar.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object l(y yVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objU;
        p.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f4044a;
        Fragment fragment2 = hVar.f4047d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = hVar.f4045b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objU = null;
        } else {
            objU = u(yVar, fragment, fragment2, z3);
            aVar2 = aVar;
        }
        p.a<String, View> aVarI = i(yVar, aVar2, objU, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z3, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            yVar.z(obj3, view, arrayList);
            A(yVar, obj3, obj2, aVarI, hVar.f4048e, hVar.f4049f);
            if (obj != null) {
                yVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        b1.a(viewGroup, new f(yVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z3, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(y yVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f4044a;
        Fragment fragment2 = hVar.f4047d;
        if (fragment != null) {
            fragment.S1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = hVar.f4045b;
        Object objU = aVar.isEmpty() ? null : u(yVar, fragment, fragment2, z3);
        p.a<String, View> aVarI = i(yVar, aVar, objU, hVar);
        p.a<String, View> aVarH = h(yVar, aVar, objU, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z3, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            yVar.z(obj3, view, arrayList);
            A(yVar, obj3, obj2, aVarI, hVar.f4048e, hVar.f4049f);
            Rect rect2 = new Rect();
            View viewT = t(aVarH, hVar, obj, z3);
            if (viewT != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewT;
        } else {
            view2 = null;
            rect = null;
        }
        b1.a(viewGroup, new e(fragment, fragment2, z3, aVarH, view2, yVar, rect));
        return obj3;
    }

    public static void n(@j0 ViewGroup viewGroup, h hVar, View view, p.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4044a;
        Fragment fragment2 = hVar.f4047d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z3 = hVar.f4045b;
        boolean z4 = hVar.f4048e;
        Object objR = r(yVarJ, fragment, z3);
        Object objS = s(yVarJ, fragment2, z4);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(yVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objR, objS);
        if (objR == null && objL == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(yVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        yVarJ.a(objR, view);
        Object objV = v(yVarJ, objR, obj2, objL, fragment, hVar.f4045b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            p0.b bVar = new p0.b();
            gVar.b(fragment2, bVar);
            yVarJ.w(fragment2, objV, bVar, new c(gVar, fragment2, bVar));
        }
        if (objV != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            yVarJ.t(objV, objR, arrayList3, obj2, arrayListK, objL, arrayList2);
            z(yVarJ, viewGroup, fragment, view, arrayList2, objR, arrayList3, obj2, arrayListK);
            yVarJ.x(viewGroup, arrayList2, aVar);
            yVarJ.c(viewGroup, objV);
            yVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    public static void o(@j0 ViewGroup viewGroup, h hVar, View view, p.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4044a;
        Fragment fragment2 = hVar.f4047d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z3 = hVar.f4045b;
        boolean z4 = hVar.f4048e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objR = r(yVarJ, fragment, z3);
        Object objS = s(yVarJ, fragment2, z4);
        Object objM = m(yVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objR, objS);
        if (objR == null && objM == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(yVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(yVarJ, objR, fragment, arrayList, view);
        B(arrayListK2, 4);
        Object objV = v(yVarJ, objR, obj, objM, fragment, z3);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            p0.b bVar = new p0.b();
            gVar.b(fragment2, bVar);
            yVarJ.w(fragment2, objV, bVar, new a(gVar, fragment2, bVar));
        }
        if (objV != null) {
            w(yVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = yVarJ.o(arrayList);
            yVarJ.t(objV, objR, arrayListK2, obj, arrayListK, objM, arrayList);
            yVarJ.c(viewGroup, objV);
            yVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            B(arrayListK2, 0);
            yVarJ.A(objM, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray<h> sparseArray, int i4) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i4, hVar2);
        return hVar2;
    }

    public static String q(p.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equals(aVar.m(i4))) {
                return aVar.i(i4);
            }
        }
        return null;
    }

    public static Object r(y yVar, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z3 ? fragment.Q() : fragment.w());
    }

    public static Object s(y yVar, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z3 ? fragment.T() : fragment.z());
    }

    public static View t(p.a<String, View> aVar, h hVar, Object obj, boolean z3) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f4046c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3995p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z3 ? aVar2.f3995p : aVar2.f3996q).get(0));
    }

    public static Object u(y yVar, Fragment fragment, Fragment fragment2, boolean z3) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z3 ? fragment2.V() : fragment.U()));
    }

    public static Object v(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z3) {
        return (obj == null || obj2 == null || fragment == null) ? true : z3 ? fragment.m() : fragment.k() ? yVar.n(obj2, obj, obj3) : yVar.m(obj2, obj, obj3);
    }

    public static void w(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3619m && fragment.A && fragment.O) {
            fragment.i2(true);
            yVar.r(obj, fragment.f0(), arrayList);
            b1.a(fragment.H, new b(arrayList));
        }
    }

    public static y x() {
        try {
            return (y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void y(@j0 p.a<String, String> aVar, @j0 p.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    public static void z(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b1.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
