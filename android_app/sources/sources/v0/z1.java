package v0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Marker;
import v0.a;
import v0.a3;
import v0.c4;
import w0.e0;
import y.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class z1 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    public static Field I = null;
    public static boolean J = false;
    public static Field K = null;
    public static boolean L = false;
    public static Method M = null;
    public static Method N = null;
    public static boolean O = false;
    public static WeakHashMap<View, String> P = null;
    public static Method R = null;
    public static Field S = null;
    public static ThreadLocal<Rect> U = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12237a = "ViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f12238b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f12239c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f12240d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12241e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12242f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12243g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12244h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12245i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12246j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12247k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f12248l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f12249m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f12250n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12251o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12252p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12253q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f12254r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f12255s = 16777215;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f12256t = -16777216;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f12257u = 16;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f12258v = 16777216;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12259w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12260x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12261y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12262z = 0;
    public static final AtomicInteger H = new AtomicInteger(1);
    public static WeakHashMap<View, s2> Q = null;
    public static boolean T = false;
    public static final int[] V = {a.e.f12708b, a.e.f12710c, a.e.f12732n, a.e.f12750y, a.e.B, a.e.C, a.e.D, a.e.E, a.e.F, a.e.G, a.e.f12712d, a.e.f12714e, a.e.f12716f, a.e.f12718g, a.e.f12720h, a.e.f12722i, a.e.f12724j, a.e.f12726k, a.e.f12728l, a.e.f12730m, a.e.f12734o, a.e.f12736p, a.e.f12738q, a.e.f12740r, a.e.f12742s, a.e.f12744t, a.e.f12746u, a.e.f12747v, a.e.f12748w, a.e.f12749x, a.e.f12751z, a.e.A};
    public static final a1 W = new a();
    public static f X = new f();

    public class a implements a1 {
        @Override // v0.a1
        public v0.c a(@c.j0 v0.c cVar) {
            return cVar;
        }
    }

    public class b extends g<Boolean> {
        public b(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        @Override // v0.z1.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class c extends g<CharSequence> {
        public c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @Override // v0.z1.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends g<CharSequence> {
        public d(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        @Override // v0.z1.g
        @c.o0(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getStateDescription();
        }

        @Override // v0.z1.g
        @c.o0(30)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        @Override // v0.z1.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class e extends g<Boolean> {
        public e(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        @Override // v0.z1.g
        @c.o0(28)
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        @Override // v0.z1.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f12263b = new WeakHashMap<>();

        @c.o0(19)
        public void a(View view) {
            this.f12263b.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        @c.o0(19)
        public final void b(View view, boolean z3) {
            boolean z4 = view.getVisibility() == 0;
            if (z3 != z4) {
                z1.b1(view, z4 ? 16 : 32);
                this.f12263b.put(view, Boolean.valueOf(z4));
            }
        }

        @c.o0(19)
        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @c.o0(19)
        public void d(View view) {
            this.f12263b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @c.o0(19)
        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @c.o0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f12263b.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @c.o0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f12265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12267d;

        public g(int i4, Class<T> cls, int i5) {
            this(i4, cls, 0, i5);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f12266c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t4);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t4 = (T) view.getTag(this.f12264a);
            if (this.f12265b.isInstance(t4)) {
                return t4;
            }
            return null;
        }

        public void g(View view, T t4) {
            if (c()) {
                e(view, t4);
            } else if (b() && h(f(view), t4)) {
                z1.g0(view);
                view.setTag(this.f12264a, t4);
                z1.b1(view, this.f12267d);
            }
        }

        public boolean h(T t4, T t5) {
            return !t5.equals(t4);
        }

        public g(int i4, Class<T> cls, int i5, int i6) {
            this.f12264a = i4;
            this.f12265b = cls;
            this.f12267d = i5;
            this.f12266c = i6;
        }
    }

    @c.o0(21)
    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public c4 f12268a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f12269b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y0 f12270c;

            public a(View view, y0 y0Var) {
                this.f12269b = view;
                this.f12270c = y0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c4 c4VarL = c4.L(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    h.a(windowInsets, this.f12269b);
                    if (c4VarL.equals(this.f12268a)) {
                        return this.f12270c.a(view, c4VarL).J();
                    }
                }
                this.f12268a = c4VarL;
                c4 c4VarA = this.f12270c.a(view, c4VarL);
                if (i4 >= 30) {
                    return c4VarA.J();
                }
                z1.t1(view);
                return c4VarA.J();
            }
        }

        private h() {
        }

        public static void a(@c.j0 WindowInsets windowInsets, @c.j0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.e.f12737p0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static c4 b(@c.j0 View view, @c.j0 c4 c4Var, @c.j0 Rect rect) {
            WindowInsets windowInsetsJ = c4Var.J();
            if (windowInsetsJ != null) {
                return c4.L(view.computeSystemWindowInsets(windowInsetsJ, rect), view);
            }
            rect.setEmpty();
            return c4Var;
        }

        @c.k0
        public static c4 c(@c.j0 View view) {
            return c4.a.a(view);
        }

        public static void d(@c.j0 View view, @c.k0 y0 y0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.e.f12721h0, y0Var);
            }
            if (y0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.e.f12737p0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, y0Var));
            }
        }
    }

    @c.o0(23)
    public static class i {
        private i() {
        }

        @c.k0
        public static c4 a(@c.j0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c4 c4VarK = c4.K(rootWindowInsets);
            c4VarK.H(c4VarK);
            c4VarK.d(view.getRootView());
            return c4VarK;
        }
    }

    @c.o0(29)
    public static class j {
        private j() {
        }

        public static void a(@c.j0 View view, @c.j0 Context context, @c.j0 int[] iArr, @c.k0 AttributeSet attributeSet, @c.j0 TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    @c.o0(30)
    public static class k {
        private k() {
        }

        @c.k0
        public static h5 a(@c.j0 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return h5.l(windowInsetsController);
            }
            return null;
        }
    }

    @c.o0(28)
    public static class l {

        public class a implements View$OnUnhandledKeyEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f12271a;

            public a(q qVar) {
                this.f12271a = qVar;
            }

            public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                return this.f12271a.onUnhandledKeyEvent(view, keyEvent);
            }
        }

        public static void a(@c.j0 View view, @c.j0 q qVar) {
            int i4 = a.e.f12735o0;
            p.i iVar = (p.i) view.getTag(i4);
            if (iVar == null) {
                iVar = new p.i();
                view.setTag(i4, iVar);
            }
            a aVar = new a(qVar);
            iVar.put(qVar, aVar);
            view.addOnUnhandledKeyEventListener(aVar);
        }

        public static void b(@c.j0 View view, @c.j0 q qVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListenerA;
            p.i iVar = (p.i) view.getTag(a.e.f12735o0);
            if (iVar == null || (view$OnUnhandledKeyEventListenerA = j2.a(iVar.get(qVar))) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListenerA);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface m {
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface n {
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface o {
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface r {
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    public static class t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f12272d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.k0
        public WeakHashMap<View, Boolean> f12273a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f12274b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f12275c = null;

        public static t a(View view) {
            int i4 = a.e.f12733n0;
            t tVar = (t) view.getTag(i4);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            view.setTag(i4, tVar2);
            return tVar2;
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f12272d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f12272d.add(new WeakReference<>(view));
            }
        }

        public static void i(View view) {
            synchronized (f12272d) {
                int i4 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f12272d;
                    if (i4 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i4).get() == view) {
                        arrayList.remove(i4);
                        return;
                    }
                    i4++;
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        @c.k0
        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f12273a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f12274b == null) {
                this.f12274b = new SparseArray<>();
            }
            return this.f12274b;
        }

        public final boolean e(@c.j0 View view, @c.j0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.f12735o0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f12275c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f12275c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && z1.N0(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f12273a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f12272d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f12273a == null) {
                    this.f12273a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f12272d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f12273a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f12273a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    @Deprecated
    public z1() {
    }

    public static void A(View view) {
        g0(view);
    }

    @c.k0
    public static h5 A0(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return k.a(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return x2.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @c.y0
    public static void A1(View view, boolean z3) {
        a().g(view, Boolean.valueOf(z3));
    }

    public static boolean A2(@c.j0 View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i4) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i4);
    }

    public static int B() {
        return View.generateViewId();
    }

    public static int B0(@c.j0 View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void B1(@c.j0 View view, int i4) {
        view.setAccessibilityLiveRegion(i4);
    }

    public static boolean B2(@c.j0 View view, int i4) {
        return view.startNestedScroll(i4);
    }

    @c.k0
    public static v0.a C(@c.j0 View view) {
        View.AccessibilityDelegate accessibilityDelegateD = D(view);
        if (accessibilityDelegateD == null) {
            return null;
        }
        return accessibilityDelegateD instanceof a.C0118a ? ((a.C0118a) accessibilityDelegateD).f11946a : new v0.a(accessibilityDelegateD);
    }

    @Deprecated
    public static float C0(View view) {
        return view.getX();
    }

    @c.y0
    public static void C1(View view, CharSequence charSequence) {
        i1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C2(@c.j0 View view, int i4, int i5) {
        if (view instanceof q0) {
            return ((q0) view).a(i4, i5);
        }
        if (i5 == 0) {
            return B2(view, i4);
        }
        return false;
    }

    @c.k0
    public static View.AccessibilityDelegate D(@c.j0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : E(view);
    }

    @Deprecated
    public static float D0(View view) {
        return view.getY();
    }

    @Deprecated
    public static void D1(View view, boolean z3) {
        view.setActivated(z3);
    }

    public static g<CharSequence> D2() {
        return new d(a.e.f12729l0, CharSequence.class, 64, 30);
    }

    @c.k0
    public static View.AccessibilityDelegate E(@c.j0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static float E0(@c.j0 View view) {
        return view.getZ();
    }

    @Deprecated
    public static void E1(View view, @c.t(from = 0.0d, to = 1.0d) float f4) {
        view.setAlpha(f4);
    }

    public static void E2(@c.j0 View view) {
        view.stopNestedScroll();
    }

    public static int F(@c.j0 View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean F0(@c.j0 View view) {
        return D(view) != null;
    }

    public static void F1(@c.j0 View view, @c.k0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F2(@c.j0 View view, int i4) {
        if (view instanceof q0) {
            ((q0) view).f(i4);
        } else if (i4 == 0) {
            E2(view);
        }
    }

    public static w0.j0 G(@c.j0 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new w0.j0(accessibilityNodeProvider);
        }
        return null;
    }

    public static boolean G0(@c.j0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.hasExplicitFocusable() : view.hasFocusable();
    }

    public static void G1(@c.j0 View view, @c.k0 Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void G2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @c.y0
    public static CharSequence H(View view) {
        return i1().f(view);
    }

    public static boolean H0(@c.j0 View view) {
        return view.hasNestedScrollingParent();
    }

    public static void H1(@c.j0 View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void H2(@c.j0 View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    public static List<e0.a> I(View view) {
        int i4 = a.e.f12713d0;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i4, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I0(@c.j0 View view, int i4) {
        if (view instanceof q0) {
            ((q0) view).c(i4);
            return false;
        }
        if (i4 == 0) {
            return H0(view);
        }
        return false;
    }

    public static void I1(@c.j0 View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    @Deprecated
    public static float J(View view) {
        return view.getAlpha();
    }

    public static boolean J0(@c.j0 View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static void J1(ViewGroup viewGroup, boolean z3) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e4) {
                Log.e(f12237a, "Unable to find childrenDrawingOrderEnabled", e4);
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z3));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            Log.e(f12237a, "Unable to invoke childrenDrawingOrderEnabled", e5);
        }
    }

    public static int K(View view) {
        List<e0.a> listI = I(view);
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = V;
            if (i5 >= iArr.length || i4 != -1) {
                break;
            }
            int i6 = iArr[i5];
            boolean z3 = true;
            for (int i7 = 0; i7 < listI.size(); i7++) {
                z3 &= listI.get(i7).b() != i6;
            }
            if (z3) {
                i4 = i6;
            }
            i5++;
        }
        return i4;
    }

    public static boolean K0(@c.j0 View view) {
        return view.hasOverlappingRendering();
    }

    public static void K1(@c.j0 View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static ColorStateList L(@c.j0 View view) {
        return view.getBackgroundTintList();
    }

    public static boolean L0(@c.j0 View view) {
        return view.hasTransientState();
    }

    public static void L1(@c.j0 View view, float f4) {
        view.setElevation(f4);
    }

    public static PorterDuff.Mode M(@c.j0 View view) {
        return view.getBackgroundTintMode();
    }

    @c.y0
    public static boolean M0(View view) {
        Boolean boolF = a().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    @Deprecated
    public static void M1(View view, boolean z3) {
        view.setFitsSystemWindows(z3);
    }

    @c.k0
    public static Rect N(@c.j0 View view) {
        return view.getClipBounds();
    }

    public static boolean N0(@c.j0 View view) {
        return view.isAttachedToWindow();
    }

    public static void N1(@c.j0 View view, boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z3);
        }
    }

    @c.k0
    public static Display O(@c.j0 View view) {
        return view.getDisplay();
    }

    public static boolean O0(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    public static void O1(@c.j0 View view, boolean z3) {
        view.setHasTransientState(z3);
    }

    public static float P(@c.j0 View view) {
        return view.getElevation();
    }

    public static boolean P0(@c.j0 View view) {
        return view.isImportantForAccessibility();
    }

    public static void P1(@c.j0 View view, int i4) {
        view.setImportantForAccessibility(i4);
    }

    public static Rect Q() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean Q0(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    public static void Q1(@c.j0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a1 R(@c.j0 View view) {
        return view instanceof a1 ? (a1) view : W;
    }

    public static boolean R0(@c.j0 View view) {
        return view.isInLayout();
    }

    public static void R1(@c.j0 View view, boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z3);
        }
    }

    public static boolean S(@c.j0 View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean S0(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    public static void S1(@c.j0 View view, @c.y int i4) {
        view.setLabelFor(i4);
    }

    public static int T(@c.j0 View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean T0(@c.j0 View view) {
        return view.isLaidOut();
    }

    public static void T1(@c.j0 View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int U(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static boolean U0(@c.j0 View view) {
        return view.isLayoutDirectionResolved();
    }

    @Deprecated
    public static void U1(View view, int i4, Paint paint) {
        view.setLayerType(i4, paint);
    }

    public static int V(@c.j0 View view) {
        return view.getLabelFor();
    }

    public static boolean V0(@c.j0 View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void V1(@c.j0 View view, int i4) {
        view.setLayoutDirection(i4);
    }

    @Deprecated
    public static int W(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static boolean W0(View view) {
        return view.isOpaque();
    }

    public static void W1(@c.j0 View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static int X(@c.j0 View view) {
        return view.getLayoutDirection();
    }

    public static boolean X0(@c.j0 View view) {
        return view.isPaddingRelative();
    }

    public static void X1(@c.j0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i4);
        }
    }

    @c.k0
    @Deprecated
    public static Matrix Y(View view) {
        return view.getMatrix();
    }

    @c.y0
    public static boolean Y0(View view) {
        Boolean boolF = y1().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public static void Y1(@c.j0 View view, @c.k0 y0 y0Var) {
        h.d(view, y0Var);
    }

    @Deprecated
    public static int Z(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static void Z0(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void Z1(@c.j0 View view, @c.k0 String[] strArr, @c.k0 z0 z0Var) {
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z3 = false;
        if (z0Var != null) {
            u0.i.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (strArr[i4].startsWith(Marker.ANY_MARKER)) {
                    z3 = true;
                    break;
                }
                i4++;
            }
            u0.i.b(!z3, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(a.e.f12725j0, strArr);
        view.setTag(a.e.f12723i0, z0Var);
    }

    public static g<Boolean> a() {
        return new e(a.e.f12717f0, Boolean.class, 28);
    }

    @Deprecated
    public static int a0(View view) {
        return view.getMeasuredState();
    }

    public static View a1(@c.j0 View view, View view2, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }
        return null;
    }

    @Deprecated
    public static void a2(View view, int i4) {
        view.setOverScrollMode(i4);
    }

    public static int b(@c.j0 View view, @c.j0 CharSequence charSequence, @c.j0 w0.l0 l0Var) {
        int iK = K(view);
        if (iK != -1) {
            c(view, new e0.a(iK, charSequence, l0Var));
        }
        return iK;
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @c.o0(19)
    public static void b1(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = H(view) != null && view.getVisibility() == 0;
            if (F(view) != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i4);
                if (z3) {
                    accessibilityEventObtain.getText().add(H(view));
                    v2(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i4);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(H(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e(f12237a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static void b2(@c.j0 View view, @c.m0 int i4, @c.m0 int i5, @c.m0 int i6, @c.m0 int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static void c(@c.j0 View view, @c.j0 e0.a aVar) {
        g0(view);
        q1(aVar.b(), view);
        I(view).add(aVar);
        b1(view, 0);
    }

    public static int c0(@c.j0 View view) {
        return view.getMinimumHeight();
    }

    public static void c1(@c.j0 View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    @Deprecated
    public static void c2(View view, float f4) {
        view.setPivotX(f4);
    }

    public static void d(@c.j0 View view, @c.j0 Collection<View> collection, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i4);
        }
    }

    public static int d0(@c.j0 View view) {
        return view.getMinimumWidth();
    }

    public static void d1(@c.j0 View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    @Deprecated
    public static void d2(View view, float f4) {
        view.setPivotY(f4);
    }

    public static void e(@c.j0 View view, @c.j0 q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, qVar);
            return;
        }
        int i4 = a.e.f12735o0;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i4, arrayList);
        }
        arrayList.add(qVar);
        if (arrayList.size() == 1) {
            t.h(view);
        }
    }

    public static int e0(@c.j0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    @c.j0
    public static c4 e1(@c.j0 View view, @c.j0 c4 c4Var) {
        WindowInsets windowInsetsJ = c4Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsJ);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsJ)) {
                return c4.L(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return c4Var;
    }

    public static void e2(@c.j0 View view, c1 c1Var) {
        view.setPointerIcon((PointerIcon) (c1Var != null ? c1Var.b() : null));
    }

    @c.j0
    public static s2 f(@c.j0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        s2 s2Var = Q.get(view);
        if (s2Var != null) {
            return s2Var;
        }
        s2 s2Var2 = new s2(view);
        Q.put(view, s2Var2);
        return s2Var2;
    }

    @c.k0
    public static String[] f0(@c.j0 View view) {
        return (String[]) view.getTag(a.e.f12725j0);
    }

    @Deprecated
    public static void f1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void f2(View view, float f4) {
        view.setRotation(f4);
    }

    public static void g() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e4) {
            Log.e(f12237a, "Couldn't find method", e4);
        }
        O = true;
    }

    public static v0.a g0(@c.j0 View view) {
        v0.a aVarC = C(view);
        if (aVarC == null) {
            aVarC = new v0.a();
        }
        z1(view, aVarC);
        return aVarC;
    }

    public static void g1(@c.j0 View view, w0.e0 e0Var) {
        view.onInitializeAccessibilityNodeInfo(e0Var.U1());
    }

    @Deprecated
    public static void g2(View view, float f4) {
        view.setRotationX(f4);
    }

    @Deprecated
    public static boolean h(View view, int i4) {
        return view.canScrollHorizontally(i4);
    }

    @Deprecated
    public static int h0(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f4) {
        view.setRotationY(f4);
    }

    @Deprecated
    public static boolean i(View view, int i4) {
        return view.canScrollVertically(i4);
    }

    @c.m0
    public static int i0(@c.j0 View view) {
        return view.getPaddingEnd();
    }

    public static g<CharSequence> i1() {
        return new c(a.e.f12719g0, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void i2(View view, boolean z3) {
        view.setSaveFromParentEnabled(z3);
    }

    public static void j(@c.j0 View view) {
        view.cancelDragAndDrop();
    }

    @c.m0
    public static int j0(@c.j0 View view) {
        return view.getPaddingStart();
    }

    public static boolean j1(@c.j0 View view, int i4, Bundle bundle) {
        return view.performAccessibilityAction(i4, bundle);
    }

    @Deprecated
    public static void j2(View view, float f4) {
        view.setScaleX(f4);
    }

    @Deprecated
    public static int k(int i4, int i5) {
        return View.combineMeasuredStates(i4, i5);
    }

    public static ViewParent k0(@c.j0 View view) {
        return view.getParentForAccessibility();
    }

    @c.k0
    public static v0.c k1(@c.j0 View view, @c.j0 v0.c cVar) {
        if (Log.isLoggable(f12237a, 3)) {
            Log.d(f12237a, "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        z0 z0Var = (z0) view.getTag(a.e.f12723i0);
        if (z0Var == null) {
            return R(view).a(cVar);
        }
        v0.c cVarA = z0Var.a(view, cVar);
        if (cVarA == null) {
            return null;
        }
        return R(view).a(cVarA);
    }

    @Deprecated
    public static void k2(View view, float f4) {
        view.setScaleY(f4);
    }

    public static void l(View view, int i4) {
        view.offsetLeftAndRight(i4);
        if (view.getVisibility() == 0) {
            G2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                G2((View) parent);
            }
        }
    }

    @Deprecated
    public static float l0(View view) {
        return view.getPivotX();
    }

    public static void l1(@c.j0 View view) {
        view.postInvalidateOnAnimation();
    }

    @c.y0
    public static void l2(View view, boolean z3) {
        y1().g(view, Boolean.valueOf(z3));
    }

    public static void m(View view, int i4) {
        view.offsetTopAndBottom(i4);
        if (view.getVisibility() == 0) {
            G2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                G2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotY();
    }

    public static void m1(@c.j0 View view, int i4, int i5, int i6, int i7) {
        view.postInvalidateOnAnimation(i4, i5, i6, i7);
    }

    public static void m2(@c.j0 View view, int i4) {
        view.setScrollIndicators(i4);
    }

    @c.j0
    public static c4 n(@c.j0 View view, @c.j0 c4 c4Var, @c.j0 Rect rect) {
        return h.b(view, c4Var, rect);
    }

    @c.k0
    public static c4 n0(@c.j0 View view) {
        return i.a(view);
    }

    public static void n1(@c.j0 View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void n2(@c.j0 View view, int i4, int i5) {
        view.setScrollIndicators(i4, i5);
    }

    @c.j0
    public static c4 o(@c.j0 View view, @c.j0 c4 c4Var) {
        WindowInsets windowInsetsJ = c4Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsJ);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsJ)) {
                return c4.L(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return c4Var;
    }

    @Deprecated
    public static float o0(View view) {
        return view.getRotation();
    }

    public static void o1(@c.j0 View view, Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    @c.y0
    public static void o2(@c.j0 View view, @c.k0 CharSequence charSequence) {
        D2().g(view, charSequence);
    }

    public static void p(@c.j0 View view) {
        view.dispatchFinishTemporaryDetach();
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotationX();
    }

    public static void p1(@c.j0 View view, int i4) {
        q1(i4, view);
        b1(view, 0);
    }

    public static void p2(@c.j0 View view, @c.j0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static boolean q(@c.j0 View view, float f4, float f5, boolean z3) {
        return view.dispatchNestedFling(f4, f5, z3);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationY();
    }

    public static void q1(int i4, View view) {
        List<e0.a> listI = I(view);
        for (int i5 = 0; i5 < listI.size(); i5++) {
            if (listI.get(i5).b() == i4) {
                listI.remove(i5);
                return;
            }
        }
    }

    public static void q2(@c.j0 View view, @c.k0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    public static boolean r(@c.j0 View view, float f4, float f5) {
        return view.dispatchNestedPreFling(f4, f5);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getScaleX();
    }

    public static void r1(@c.j0 View view, @c.j0 q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.b(view, qVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f12735o0);
        if (arrayList != null) {
            arrayList.remove(qVar);
            if (arrayList.size() == 0) {
                t.i(view);
            }
        }
    }

    public static void r2(@c.j0 View view, String str) {
        view.setTransitionName(str);
    }

    public static boolean s(@c.j0 View view, int i4, int i5, @c.k0 int[] iArr, @c.k0 int[] iArr2) {
        return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleY();
    }

    public static void s1(@c.j0 View view, @c.j0 e0.a aVar, @c.k0 CharSequence charSequence, @c.k0 w0.l0 l0Var) {
        if (l0Var == null && charSequence == null) {
            p1(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, l0Var));
        }
    }

    @Deprecated
    public static void s2(View view, float f4) {
        view.setTranslationX(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(@c.j0 View view, int i4, int i5, @c.k0 int[] iArr, @c.k0 int[] iArr2, int i6) {
        if (view instanceof q0) {
            return ((q0) view).e(i4, i5, iArr, iArr2, i6);
        }
        if (i6 == 0) {
            return s(view, i4, i5, iArr, iArr2);
        }
        return false;
    }

    public static int t0(@c.j0 View view) {
        return view.getScrollIndicators();
    }

    public static void t1(@c.j0 View view) {
        view.requestApplyInsets();
    }

    @Deprecated
    public static void t2(View view, float f4) {
        view.setTranslationY(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(@c.j0 View view, int i4, int i5, int i6, int i7, @c.k0 int[] iArr, int i8, @c.j0 int[] iArr2) {
        if (view instanceof r0) {
            ((r0) view).d(i4, i5, i6, i7, iArr, i8, iArr2);
        } else {
            w(view, i4, i5, i6, i7, iArr, i8);
        }
    }

    @c.k0
    @c.y0
    public static final CharSequence u0(@c.j0 View view) {
        return D2().f(view);
    }

    @c.j0
    public static <T extends View> T u1(@c.j0 View view, @c.y int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i4);
        }
        T t4 = (T) view.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void u2(@c.j0 View view, float f4) {
        view.setTranslationZ(f4);
    }

    public static boolean v(@c.j0 View view, int i4, int i5, int i6, int i7, @c.k0 int[] iArr) {
        return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    @c.j0
    public static List<Rect> v0(@c.j0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getSystemGestureExclusionRects() : Collections.emptyList();
    }

    @Deprecated
    public static int v1(int i4, int i5, int i6) {
        return View.resolveSizeAndState(i4, i5, i6);
    }

    public static void v2(View view) {
        if (T(view) == 0) {
            P1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (T((View) parent) == 4) {
                P1(view, 2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean w(@c.j0 View view, int i4, int i5, int i6, int i7, @c.k0 int[] iArr, int i8) {
        if (view instanceof q0) {
            return ((q0) view).b(i4, i5, i6, i7, iArr, i8);
        }
        if (i8 == 0) {
            return v(view, i4, i5, i6, i7, iArr);
        }
        return false;
    }

    @c.k0
    public static String w0(@c.j0 View view) {
        return view.getTransitionName();
    }

    public static boolean w1(@c.j0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.restoreDefaultFocus() : view.requestFocus();
    }

    public static void w2(@c.j0 View view, @c.k0 a3.b bVar) {
        a3.h(view, bVar);
    }

    public static void x(@c.j0 View view) {
        view.dispatchStartTemporaryDetach();
    }

    @Deprecated
    public static float x0(View view) {
        return view.getTranslationX();
    }

    public static void x1(@c.j0 View view, @SuppressLint({"ContextFirst"}) @c.j0 Context context, @c.j0 int[] iArr, @c.k0 AttributeSet attributeSet, @c.j0 TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    @Deprecated
    public static void x2(View view, float f4) {
        view.setX(f4);
    }

    @c.y0
    public static boolean y(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationY();
    }

    public static g<Boolean> y1() {
        return new b(a.e.f12727k0, Boolean.class, 28);
    }

    @Deprecated
    public static void y2(View view, float f4) {
        view.setY(f4);
    }

    @c.y0
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).f(keyEvent);
    }

    public static float z0(@c.j0 View view) {
        return view.getTranslationZ();
    }

    public static void z1(@c.j0 View view, v0.a aVar) {
        if (aVar == null && (D(view) instanceof a.C0118a)) {
            aVar = new v0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void z2(@c.j0 View view, float f4) {
        view.setZ(f4);
    }
}
