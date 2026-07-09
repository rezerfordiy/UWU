package r;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10487g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10488h = "DesignTool";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f10489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap<String, String> f10490j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f10491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f10492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10493c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10494d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10495e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10496f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f10489i = map;
        HashMap<String, String> map2 = new HashMap<>();
        f10490j = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(MotionLayout motionLayout) {
        this.f10491a = motionLayout;
    }

    public static void j(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> map, int i5, int i6) {
        String str = f10489i.get(Pair.create(Integer.valueOf(i5), Integer.valueOf(i6)));
        String str2 = map.get(str);
        if (str2 != null) {
            String str3 = f10490j.get(str);
            int iK = str3 != null ? k(i4, map.get(str3)) : 0;
            dVar.E(view.getId(), i5, Integer.parseInt(str2), i6, iK);
        }
    }

    public static int k(int i4, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i4) / 160.0f);
    }

    public static void l(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> map) {
        String str = map.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.F0(view.getId(), k(i4, str));
        }
        String str2 = map.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.G0(view.getId(), k(i4, str2));
        }
    }

    public static void m(androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> map, int i4) {
        String str = map.get(i4 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i4 == 0) {
                dVar.O0(view.getId(), Float.parseFloat(str));
            } else if (i4 == 1) {
                dVar.i1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    public static void n(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> map, int i5) {
        String str = map.get(i5 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iK = !str.equalsIgnoreCase("wrap_content") ? k(i4, str) : -2;
            int id = view.getId();
            if (i5 == 0) {
                dVar.P(id, iK);
            } else {
                dVar.I(id, iK);
            }
        }
    }

    public String A() {
        if (this.f10493c != null && this.f10494d != null) {
            float fY = y();
            if (fY <= 0.01f) {
                return this.f10493c;
            }
            if (fY >= 0.99f) {
                return this.f10494d;
            }
        }
        return this.f10493c;
    }

    public boolean B() {
        return (this.f10493c == null || this.f10494d == null) ? false : true;
    }

    public void C(Object obj, String str, Object obj2) {
        if (obj instanceof e) {
            ((e) obj).f(str, obj2);
            this.f10491a.A0();
            this.f10491a.f1991b0 = true;
        }
    }

    public void D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f10493c == str) {
            return;
        }
        this.f10493c = str;
        this.f10494d = null;
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            motionLayout.H = this.f10492b;
        }
        int iV0 = motionLayout.v0(str);
        this.f10495e = iV0;
        if (iV0 != 0) {
            if (iV0 == this.f10491a.getStartState()) {
                this.f10491a.setProgress(0.0f);
            } else {
                if (iV0 != this.f10491a.getEndState()) {
                    this.f10491a.I0(iV0);
                }
                this.f10491a.setProgress(1.0f);
            }
        }
        this.f10491a.requestLayout();
    }

    public void E(String str, String str2) {
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            motionLayout.H = this.f10492b;
        }
        int iV0 = motionLayout.v0(str);
        int iV02 = this.f10491a.v0(str2);
        this.f10491a.D0(iV0, iV02);
        this.f10495e = iV0;
        this.f10496f = iV02;
        this.f10493c = str;
        this.f10494d = str2;
    }

    public void F(Object obj, int i4) {
        p pVar = this.f10491a.Q.get(obj);
        if (pVar != null) {
            pVar.C(i4);
            this.f10491a.invalidate();
        }
    }

    @Override // r.s
    public void a(int i4, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = (HashMap) obj2;
        int iV0 = this.f10491a.v0(str);
        androidx.constraintlayout.widget.d dVarK = this.f10491a.H.k(iV0);
        if (dVarK == null) {
            return;
        }
        dVarK.x(view.getId());
        n(i4, dVarK, view, map, 0);
        n(i4, dVarK, view, map, 1);
        j(i4, dVarK, view, map, 6, 6);
        j(i4, dVarK, view, map, 6, 7);
        j(i4, dVarK, view, map, 7, 7);
        j(i4, dVarK, view, map, 7, 6);
        j(i4, dVarK, view, map, 1, 1);
        j(i4, dVarK, view, map, 1, 2);
        j(i4, dVarK, view, map, 2, 2);
        j(i4, dVarK, view, map, 2, 1);
        j(i4, dVarK, view, map, 3, 3);
        j(i4, dVarK, view, map, 3, 4);
        j(i4, dVarK, view, map, 4, 3);
        j(i4, dVarK, view, map, 4, 4);
        j(i4, dVarK, view, map, 5, 5);
        m(dVarK, view, map, 0);
        m(dVarK, view, map, 1);
        l(i4, dVarK, view, map);
        this.f10491a.L0(iV0, dVarK);
        this.f10491a.requestLayout();
    }

    @Override // r.s
    public void b(Object obj, int i4, String str, Object obj2) {
        androidx.constraintlayout.motion.widget.a aVar = this.f10491a.H;
        if (aVar != null) {
            aVar.Y((View) obj, i4, str, obj2);
            MotionLayout motionLayout = this.f10491a;
            motionLayout.W = i4 / 100.0f;
            motionLayout.U = 0.0f;
            motionLayout.A0();
            this.f10491a.g0(true);
        }
    }

    @Override // r.s
    public long c() {
        return this.f10491a.getTransitionTimeMs();
    }

    @Override // r.s
    public int d(int i4, String str, Object obj, float[] fArr, int i5, float[] fArr2, int i6) {
        p pVar;
        View view = (View) obj;
        if (i4 != 0) {
            MotionLayout motionLayout = this.f10491a;
            if (motionLayout.H == null || view == null || (pVar = motionLayout.Q.get(view)) == null) {
                return -1;
            }
        } else {
            pVar = null;
        }
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            int iP = this.f10491a.H.p() / 16;
            pVar.f(fArr2, iP);
            return iP;
        }
        if (i4 == 2) {
            int iP2 = this.f10491a.H.p() / 16;
            pVar.e(fArr2, null);
            return iP2;
        }
        if (i4 != 3) {
            return -1;
        }
        int iP3 = this.f10491a.H.p() / 16;
        return pVar.j(str, fArr2, i6);
    }

    @Override // r.s
    public boolean e(Object obj, int i4, int i5, float f4, float f5) {
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            return false;
        }
        p pVar = motionLayout.Q.get(obj);
        MotionLayout motionLayout2 = this.f10491a;
        int i6 = (int) (motionLayout2.T * 100.0f);
        if (pVar == null) {
            return false;
        }
        View view = (View) obj;
        if (!motionLayout2.H.I(view, i6)) {
            return false;
        }
        float fQ = pVar.q(2, f4, f5);
        float fQ2 = pVar.q(5, f4, f5);
        this.f10491a.H.Y(view, i6, "motion:percentX", Float.valueOf(fQ));
        this.f10491a.H.Y(view, i6, "motion:percentY", Float.valueOf(fQ2));
        this.f10491a.A0();
        this.f10491a.g0(true);
        this.f10491a.invalidate();
        return true;
    }

    @Override // r.s
    public void f(float f4) {
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            motionLayout.H = this.f10492b;
        }
        motionLayout.setProgress(f4);
        this.f10491a.g0(true);
        this.f10491a.requestLayout();
        this.f10491a.invalidate();
    }

    @Override // r.s
    public float g(Object obj, int i4, float f4, float f5) {
        return this.f10491a.Q.get((View) obj).q(i4, f4, f5);
    }

    @Override // r.s
    public Object h(Object obj, float f4, float f5) {
        p pVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            return -1;
        }
        if (view == null || (pVar = motionLayout.Q.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return pVar.r(viewGroup.getWidth(), viewGroup.getHeight(), f4, f5);
    }

    @Override // r.s
    public Boolean i(Object obj, Object obj2, float f4, float f5, String[] strArr, float[] fArr) {
        if (!(obj instanceof l)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f10491a.Q.get(view).A(view, (l) obj, f4, f5, strArr, fArr);
        this.f10491a.A0();
        this.f10491a.f1991b0 = true;
        return Boolean.TRUE;
    }

    public void o(boolean z3) {
        this.f10491a.e0(z3);
    }

    public void p(String str) {
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            motionLayout.H = this.f10492b;
        }
        int iV0 = motionLayout.v0(str);
        System.out.println(" dumping  " + str + " (" + iV0 + ")");
        try {
            this.f10491a.H.k(iV0).Z(this.f10491a.H, new int[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public int q(Object obj, float[] fArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.f10491a.H;
        if (aVar == null) {
            return -1;
        }
        int iP = aVar.p() / 16;
        p pVar = this.f10491a.Q.get(obj);
        if (pVar == null) {
            return 0;
        }
        pVar.e(fArr, null);
        return iP;
    }

    public int r(Object obj, float[] fArr, int i4) {
        MotionLayout motionLayout = this.f10491a;
        if (motionLayout.H == null) {
            return -1;
        }
        p pVar = motionLayout.Q.get(obj);
        if (pVar == null) {
            return 0;
        }
        pVar.f(fArr, i4);
        return i4;
    }

    public void s(Object obj, float[] fArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.f10491a.H;
        if (aVar == null) {
            return;
        }
        int iP = aVar.p() / 16;
        p pVar = this.f10491a.Q.get(obj);
        if (pVar == null) {
            return;
        }
        pVar.h(fArr, iP);
    }

    public String t() {
        int endState = this.f10491a.getEndState();
        if (this.f10496f == endState) {
            return this.f10494d;
        }
        String strO0 = this.f10491a.o0(endState);
        if (strO0 != null) {
            this.f10494d = strO0;
            this.f10496f = endState;
        }
        return strO0;
    }

    public int u(Object obj, int i4, int[] iArr) {
        p pVar = this.f10491a.Q.get((View) obj);
        if (pVar == null) {
            return 0;
        }
        return pVar.p(i4, iArr);
    }

    public int v(Object obj, int[] iArr, float[] fArr) {
        p pVar = this.f10491a.Q.get((View) obj);
        if (pVar == null) {
            return 0;
        }
        return pVar.w(iArr, fArr);
    }

    public Object w(int i4, int i5, int i6) {
        MotionLayout motionLayout = this.f10491a;
        androidx.constraintlayout.motion.widget.a aVar = motionLayout.H;
        if (aVar == null) {
            return null;
        }
        return aVar.u(motionLayout.getContext(), i4, i5, i6);
    }

    public Object x(Object obj, int i4, int i5) {
        if (this.f10491a.H == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.f10491a;
        return motionLayout.H.u(motionLayout.getContext(), i4, id, i5);
    }

    public float y() {
        return this.f10491a.getProgress();
    }

    public String z() {
        int startState = this.f10491a.getStartState();
        if (this.f10495e == startState) {
            return this.f10493c;
        }
        String strO0 = this.f10491a.o0(startState);
        if (strO0 != null) {
            this.f10493c = strO0;
            this.f10495e = startState;
        }
        return this.f10491a.o0(startState);
    }
}
