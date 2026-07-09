package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserView;
import c.r0;
import e.a;
import java.lang.reflect.Method;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements k.f {
    public static final String H = "ListPopupWindow";
    public static final boolean I = false;
    public static final int J = 250;
    public static Method K = null;
    public static Method L = null;
    public static Method M = null;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = -1;
    public static final int Q = -2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public final d A;
    public Runnable B;
    public final Handler C;
    public final Rect D;
    public Rect E;
    public boolean F;
    public PopupWindow G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f1448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f1461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DataSetObserver f1463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f1464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f1465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f1468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f1469y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f1470z;

    public class a extends k0 {
        public a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.k0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ListPopupWindow b() {
            return ListPopupWindow.this;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewV = ListPopupWindow.this.v();
            if (viewV == null || viewV.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.e();
        }
    }

    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            i0 i0Var;
            if (i4 == -1 || (i0Var = ListPopupWindow.this.f1448d) == null) {
                return;
            }
            i0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.f();
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.c()) {
                ListPopupWindow.this.e();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class f implements AbsListView.OnScrollListener {
        public f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 1 || ListPopupWindow.this.K() || ListPopupWindow.this.G.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.C.removeCallbacks(listPopupWindow.f1468x);
            ListPopupWindow.this.f1468x.run();
        }
    }

    public class g implements View.OnTouchListener {
        public g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.G) != null && popupWindow.isShowing() && x3 >= 0 && x3 < ListPopupWindow.this.G.getWidth() && y3 >= 0 && y3 < ListPopupWindow.this.G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.C.postDelayed(listPopupWindow.f1468x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.C.removeCallbacks(listPopupWindow2.f1468x);
            return false;
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = ListPopupWindow.this.f1448d;
            if (i0Var == null || !z1.N0(i0Var) || ListPopupWindow.this.f1448d.getCount() <= ListPopupWindow.this.f1448d.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f1448d.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f1460p) {
                listPopupWindow.G.setInputMethodMode(2);
                ListPopupWindow.this.e();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(H, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(H, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@c.j0 Context context) {
        this(context, null, a.c.f6817g2);
    }

    public static boolean I(int i4) {
        return i4 == 66 || i4 == 23;
    }

    public final int A(View view, int i4, boolean z3) {
        return this.G.getMaxAvailableHeight(view, i4, z3);
    }

    public int B() {
        return this.f1462r;
    }

    @c.k0
    public Object C() {
        if (c()) {
            return this.f1448d.getSelectedItem();
        }
        return null;
    }

    public long D() {
        if (c()) {
            return this.f1448d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int E() {
        if (c()) {
            return this.f1448d.getSelectedItemPosition();
        }
        return -1;
    }

    @c.k0
    public View F() {
        if (c()) {
            return this.f1448d.getSelectedView();
        }
        return null;
    }

    public int G() {
        return this.G.getSoftInputMode();
    }

    public int H() {
        return this.f1450f;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.f1458n;
    }

    public boolean K() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.F;
    }

    public boolean M(int i4, @c.j0 KeyEvent keyEvent) {
        int iD;
        int count;
        if (c() && i4 != 62 && (this.f1448d.getSelectedItemPosition() >= 0 || !I(i4))) {
            int selectedItemPosition = this.f1448d.getSelectedItemPosition();
            boolean z3 = !this.G.isAboveAnchor();
            ListAdapter listAdapter = this.f1447c;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iD = zAreAllItemsEnabled ? 0 : this.f1448d.d(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1448d.d(listAdapter.getCount() - 1, false);
            } else {
                iD = ActivityChooserView.f.f1331h;
                count = Integer.MIN_VALUE;
            }
            if ((z3 && i4 == 19 && selectedItemPosition <= iD) || (!z3 && i4 == 20 && selectedItemPosition >= count)) {
                f();
                this.G.setInputMethodMode(1);
                e();
                return true;
            }
            this.f1448d.setListSelectionHidden(false);
            if (this.f1448d.onKeyDown(i4, keyEvent)) {
                this.G.setInputMethodMode(2);
                this.f1448d.requestFocusFromTouch();
                e();
                if (i4 == 19 || i4 == 20 || i4 == 23 || i4 == 66) {
                    return true;
                }
            } else if (z3 && i4 == 20) {
                if (selectedItemPosition == count) {
                    return true;
                }
            } else if (!z3 && i4 == 19 && selectedItemPosition == iD) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int i4, @c.j0 KeyEvent keyEvent) {
        if (i4 != 4 || !c()) {
            return false;
        }
        View view = this.f1464t;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean O(int i4, @c.j0 KeyEvent keyEvent) {
        if (!c() || this.f1448d.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f1448d.onKeyUp(i4, keyEvent);
        if (zOnKeyUp && I(i4)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean P(int i4) {
        if (!c()) {
            return false;
        }
        if (this.f1466v == null) {
            return true;
        }
        i0 i0Var = this.f1448d;
        this.f1466v.onItemClick(i0Var, i0Var.getChildAt(i4 - i0Var.getFirstVisiblePosition()), i4, i0Var.getAdapter().getItemId(i4));
        return true;
    }

    public void Q() {
        this.C.post(this.B);
    }

    public final void R() {
        View view = this.f1461q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1461q);
            }
        }
    }

    public void S(@c.k0 View view) {
        this.f1464t = view;
    }

    public void T(@c.v0 int i4) {
        this.G.setAnimationStyle(i4);
    }

    public void U(int i4) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            n0(i4);
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f1450f = rect.left + rect.right + i4;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void V(boolean z3) {
        this.f1458n = z3;
    }

    public void W(int i4) {
        this.f1457m = i4;
    }

    public void X(@c.k0 Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z3) {
        this.f1459o = z3;
    }

    public void Z(int i4) {
        if (i4 < 0 && -2 != i4 && -1 != i4) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1449e = i4;
    }

    public void a0(int i4) {
        this.G.setInputMethodMode(i4);
    }

    public void b0(int i4) {
        this.f1460p = i4;
    }

    @Override // k.f
    public boolean c() {
        return this.G.isShowing();
    }

    public void c0(Drawable drawable) {
        this.f1465u = drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[PHI: r1
      0x012a: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011f, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.d():int");
    }

    public void d0(boolean z3) {
        this.F = z3;
        this.G.setFocusable(z3);
    }

    @Override // k.f
    public void dismiss() {
        this.G.dismiss();
        R();
        this.G.setContentView(null);
        this.f1448d = null;
        this.C.removeCallbacks(this.f1468x);
    }

    @Override // k.f
    public void e() {
        int iD = d();
        boolean zK = K();
        androidx.core.widget.j.d(this.G, this.f1453i);
        if (this.G.isShowing()) {
            if (z1.N0(v())) {
                int width = this.f1450f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = v().getWidth();
                }
                int i4 = this.f1449e;
                if (i4 == -1) {
                    if (!zK) {
                        iD = -1;
                    }
                    if (zK) {
                        this.G.setWidth(this.f1450f == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f1450f == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i4 != -2) {
                    iD = i4;
                }
                this.G.setOutsideTouchable((this.f1459o || this.f1458n) ? false : true);
                this.G.update(v(), this.f1451g, this.f1452h, width < 0 ? -1 : width, iD < 0 ? -1 : iD);
                return;
            }
            return;
        }
        int width2 = this.f1450f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = v().getWidth();
        }
        int i5 = this.f1449e;
        if (i5 == -1) {
            iD = -1;
        } else if (i5 != -2) {
            iD = i5;
        }
        this.G.setWidth(width2);
        this.G.setHeight(iD);
        i0(true);
        this.G.setOutsideTouchable((this.f1459o || this.f1458n) ? false : true);
        this.G.setTouchInterceptor(this.f1469y);
        if (this.f1456l) {
            androidx.core.widget.j.c(this.G, this.f1455k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception e4) {
                    Log.e(H, "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            this.G.setEpicenterBounds(this.E);
        }
        androidx.core.widget.j.e(this.G, v(), this.f1451g, this.f1452h, this.f1457m);
        this.f1448d.setSelection(-1);
        if (!this.F || this.f1448d.isInTouchMode()) {
            f();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.A);
    }

    public void e0(@c.k0 PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    public void f() {
        i0 i0Var = this.f1448d;
        if (i0Var != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
    }

    public void f0(@c.k0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f1466v = onItemClickListener;
    }

    public View.OnTouchListener g(View view) {
        return new a(view);
    }

    public void g0(@c.k0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1467w = onItemSelectedListener;
    }

    public void h(@c.k0 Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z3) {
        this.f1456l = true;
        this.f1455k = z3;
    }

    public void i(int i4) {
        this.f1451g = i4;
    }

    public final void i0(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            this.G.setIsClippedToScreen(z3);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i(H, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public int j() {
        return this.f1451g;
    }

    public void j0(int i4) {
        this.f1462r = i4;
    }

    public void k0(@c.k0 View view) {
        boolean zC = c();
        if (zC) {
            R();
        }
        this.f1461q = view;
        if (zC) {
            e();
        }
    }

    public int l() {
        if (this.f1454j) {
            return this.f1452h;
        }
        return 0;
    }

    public void l0(int i4) {
        i0 i0Var = this.f1448d;
        if (!c() || i0Var == null) {
            return;
        }
        i0Var.setListSelectionHidden(false);
        i0Var.setSelection(i4);
        if (i0Var.getChoiceMode() != 0) {
            i0Var.setItemChecked(i4, true);
        }
    }

    public void m0(int i4) {
        this.G.setSoftInputMode(i4);
    }

    @c.k0
    public Drawable n() {
        return this.G.getBackground();
    }

    public void n0(int i4) {
        this.f1450f = i4;
    }

    public void o0(int i4) {
        this.f1453i = i4;
    }

    @Override // k.f
    @c.k0
    public ListView p() {
        return this.f1448d;
    }

    public void r(int i4) {
        this.f1452h = i4;
        this.f1454j = true;
    }

    public void s(@c.k0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1463s;
        if (dataSetObserver == null) {
            this.f1463s = new e();
        } else {
            ListAdapter listAdapter2 = this.f1447c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1447c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1463s);
        }
        i0 i0Var = this.f1448d;
        if (i0Var != null) {
            i0Var.setAdapter(this.f1447c);
        }
    }

    @c.j0
    public i0 u(Context context, boolean z3) {
        return new i0(context, z3);
    }

    @c.k0
    public View v() {
        return this.f1464t;
    }

    @c.v0
    public int w() {
        return this.G.getAnimationStyle();
    }

    @c.k0
    public Rect x() {
        if (this.E != null) {
            return new Rect(this.E);
        }
        return null;
    }

    public int y() {
        return this.f1449e;
    }

    public int z() {
        return this.G.getInputMethodMode();
    }

    public ListPopupWindow(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f6817g2);
    }

    public ListPopupWindow(@c.j0 Context context, @c.k0 AttributeSet attributeSet, @c.f int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPopupWindow(@c.j0 Context context, @c.k0 AttributeSet attributeSet, @c.f int i4, @c.v0 int i5) {
        this.f1449e = -2;
        this.f1450f = -2;
        this.f1453i = v0.c1.f12010e;
        this.f1457m = 0;
        this.f1458n = false;
        this.f1459o = false;
        this.f1460p = ActivityChooserView.f.f1331h;
        this.f1462r = 0;
        this.f1468x = new h();
        this.f1469y = new g();
        this.f1470z = new f();
        this.A = new d();
        this.D = new Rect();
        this.f1446b = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.c5, i4, i5);
        this.f1451g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.n.d5, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.n.e5, 0);
        this.f1452h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1454j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i4, i5);
        this.G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
