package w0;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w0.l0;
import y.a;

/* JADX INFO: loaded from: classes.dex */
public class e0 {
    public static final int A = 256;
    public static final int B = 512;
    public static final int C = 1024;
    public static final int D = 2048;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = 16384;
    public static final int H = 32768;
    public static final int I = 65536;
    public static final int J = 131072;
    public static final int K = 262144;
    public static final int L = 524288;
    public static final int M = 1048576;
    public static final int N = 2097152;
    public static final String O = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String P = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Q = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String R = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String S = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String T = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String U = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String V = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String W = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    @SuppressLint({"ActionValue"})
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f12427a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f12428b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f12429c0 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12430d = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f12431d0 = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12432e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f12433e0 = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12434f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f12435f0 = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f12436g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f12437g0 = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12438h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static int f12439h0 = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f12440i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f12441j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f12442k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f12443l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f12444m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f12445n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12446o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12447p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12448q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f12449r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f12450s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f12451t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12452u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12453v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12454w = 16;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12455x = 32;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12456y = 64;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12457z = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f12458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int f12459b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12460c = -1;

    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @c.j0
        public static final a H;

        @c.j0
        public static final a I;

        @c.j0
        public static final a J;

        @c.j0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;

        @c.j0
        public static final a Q;

        @c.j0
        public static final a R;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f12461e = "A11yActionCompat";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<? extends l0.a> f12485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public final l0 f12486d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f12462f = new a(1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f12463g = new a(2, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f12464h = new a(4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f12465i = new a(8, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f12466j = new a(16, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f12467k = new a(32, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f12468l = new a(64, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f12469m = new a(128, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f12470n = new a(256, (CharSequence) null, (Class<? extends l0.a>) l0.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f12471o = new a(512, (CharSequence) null, (Class<? extends l0.a>) l0.b.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f12472p = new a(1024, (CharSequence) null, (Class<? extends l0.a>) l0.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f12473q = new a(2048, (CharSequence) null, (Class<? extends l0.a>) l0.c.class);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f12474r = new a(4096, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f12475s = new a(8192, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f12476t = new a(16384, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f12477u = new a(32768, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f12478v = new a(65536, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f12479w = new a(131072, (CharSequence) null, (Class<? extends l0.a>) l0.g.class);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f12480x = new a(262144, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f12481y = new a(524288, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f12482z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends l0.a>) l0.h.class);

        static {
            int i4 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l0.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            H = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            I = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            J = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            K = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l0.f.class);
            N = new a(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, l0.d.class);
            O = new a(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            P = new a(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            Q = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            R = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i4, CharSequence charSequence) {
            this(null, i4, charSequence, null, null);
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, l0 l0Var) {
            return new a(null, this.f12484b, charSequence, l0Var, this.f12485c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f12483a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f12483a).getLabel();
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            if (this.f12486d == null) {
                return false;
            }
            Class<? extends l0.a> cls = this.f12485c;
            l0.a aVar = null;
            if (cls != null) {
                try {
                    l0.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e4) {
                        e = e4;
                        aVar = aVarNewInstance;
                        Class<? extends l0.a> cls2 = this.f12485c;
                        Log.e(f12461e, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            }
            return this.f12486d.a(view, aVar);
        }

        public boolean equals(@c.k0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f12483a;
            Object obj3 = ((a) obj).f12483a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f12483a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i4, CharSequence charSequence, Class<? extends l0.a> cls) {
            this(null, i4, charSequence, null, cls);
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public a(int i4, CharSequence charSequence, l0 l0Var) {
            this(null, i4, charSequence, l0Var, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i4, CharSequence charSequence, l0 l0Var, Class<? extends l0.a> cls) {
            this.f12484b = i4;
            this.f12486d = l0Var;
            this.f12483a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence) : obj;
            this.f12485c = cls;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12487b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12488c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12489d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12490a;

        public b(Object obj) {
            this.f12490a = obj;
        }

        public static b e(int i4, int i5, boolean z3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3));
        }

        public static b f(int i4, int i5, boolean z3, int i6) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3, i6));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f12490a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f12490a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f12490a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f12490a).isHierarchical();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12491a;

        public c(Object obj) {
            this.f12491a = obj;
        }

        public static c g(int i4, int i5, int i6, int i7, boolean z3) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3));
        }

        public static c h(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3, z4));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f12491a).isSelected();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12492b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12493c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12494d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12495a;

        public d(Object obj) {
            this.f12495a = obj;
        }

        public static d e(int i4, float f4, float f5, float f6) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f12495a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f12495a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f12495a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f12495a).getType();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.TouchDelegateInfo f12496a;

        public e(@c.j0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f12496a = touchDelegateInfo;
        }

        @c.k0
        public Region a(@c.b0(from = 0) int i4) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f12496a.getRegionAt(i4);
            }
            return null;
        }

        @c.b0(from = 0)
        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f12496a.getRegionCount();
            }
            return 0;
        }

        @c.k0
        public e0 c(@c.j0 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f12496a.getTargetForRegion(region)) == null) {
                return null;
            }
            return e0.V1(targetForRegion);
        }

        public e(@c.j0 Map<Region, View> map) {
            this.f12496a = Build.VERSION.SDK_INT >= 29 ? i0.a(map) : null;
        }
    }

    public e0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f12458a = accessibilityNodeInfo;
    }

    public static e0 B0() {
        return V1(AccessibilityNodeInfo.obtain());
    }

    public static e0 C0(View view) {
        return V1(AccessibilityNodeInfo.obtain(view));
    }

    public static e0 D0(View view, int i4) {
        return W1(AccessibilityNodeInfo.obtain(view, i4));
    }

    public static e0 E0(e0 e0Var) {
        return V1(AccessibilityNodeInfo.obtain(e0Var.f12458a));
    }

    public static e0 V1(@c.j0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new e0(accessibilityNodeInfo);
    }

    public static e0 W1(Object obj) {
        if (obj != null) {
            return new e0(obj);
        }
        return null;
    }

    public static String o(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i4) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] w(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public int A() {
        return this.f12458a.getDrawingOrder();
    }

    public boolean A0() {
        return this.f12458a.isVisibleToUser();
    }

    public void A1(d dVar) {
        this.f12458a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f12495a);
    }

    public CharSequence B() {
        return this.f12458a.getError();
    }

    public void B1(@c.k0 CharSequence charSequence) {
        this.f12458a.getExtras().putCharSequence(f12430d, charSequence);
    }

    public Bundle C() {
        return this.f12458a.getExtras();
    }

    public void C1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12458a.setScreenReaderFocusable(z3);
        } else {
            O0(1, z3);
        }
    }

    @c.k0
    public CharSequence D() {
        return Build.VERSION.SDK_INT >= 26 ? this.f12458a.getHintText() : this.f12458a.getExtras().getCharSequence(f12436g);
    }

    public void D1(boolean z3) {
        this.f12458a.setScrollable(z3);
    }

    @Deprecated
    public Object E() {
        return this.f12458a;
    }

    public void E1(boolean z3) {
        this.f12458a.setSelected(z3);
    }

    public int F() {
        return this.f12458a.getInputType();
    }

    public boolean F0(int i4) {
        return this.f12458a.performAction(i4);
    }

    public void F1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12458a.setShowingHintText(z3);
        } else {
            O0(4, z3);
        }
    }

    public e0 G() {
        return W1(this.f12458a.getLabelFor());
    }

    public boolean G0(int i4, Bundle bundle) {
        return this.f12458a.performAction(i4, bundle);
    }

    public void G1(View view) {
        this.f12460c = -1;
        this.f12458a.setSource(view);
    }

    public e0 H() {
        return W1(this.f12458a.getLabeledBy());
    }

    public void H0() {
        this.f12458a.recycle();
    }

    public void H1(View view, int i4) {
        this.f12460c = i4;
        this.f12458a.setSource(view, i4);
    }

    public int I() {
        return this.f12458a.getLiveRegion();
    }

    public boolean I0() {
        return this.f12458a.refresh();
    }

    public void I1(@c.k0 CharSequence charSequence) {
        if (p0.a.g()) {
            this.f12458a.setStateDescription(charSequence);
        } else {
            this.f12458a.getExtras().putCharSequence(f12445n, charSequence);
        }
    }

    public int J() {
        return this.f12458a.getMaxTextLength();
    }

    public boolean J0(a aVar) {
        return this.f12458a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f12483a);
    }

    public void J1(CharSequence charSequence) {
        this.f12458a.setText(charSequence);
    }

    public int K() {
        return this.f12458a.getMovementGranularities();
    }

    public boolean K0(View view) {
        return this.f12458a.removeChild(view);
    }

    public void K1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12458a.setTextEntryKey(z3);
        } else {
            O0(8, z3);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> L(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = R(view);
        if (sparseArrayR != null) {
            return sparseArrayR;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.e.f12715e0, sparseArray);
        return sparseArray;
    }

    public boolean L0(View view, int i4) {
        return this.f12458a.removeChild(view, i4);
    }

    public void L1(int i4, int i5) {
        this.f12458a.setTextSelection(i4, i5);
    }

    public CharSequence M() {
        return this.f12458a.getPackageName();
    }

    public final void M0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = R(view);
        if (sparseArrayR != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < sparseArrayR.size(); i4++) {
                if (sparseArrayR.valueAt(i4).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                sparseArrayR.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    public void M1(@c.k0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12458a.setTooltipText(charSequence);
        } else {
            this.f12458a.getExtras().putCharSequence(f12434f, charSequence);
        }
    }

    @c.k0
    public CharSequence N() {
        return Build.VERSION.SDK_INT >= 28 ? this.f12458a.getPaneTitle() : this.f12458a.getExtras().getCharSequence(f12432e);
    }

    public void N0(boolean z3) {
        this.f12458a.setAccessibilityFocused(z3);
    }

    public void N1(@c.j0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12458a.setTouchDelegateInfo(eVar.f12496a);
        }
    }

    public e0 O() {
        return W1(this.f12458a.getParent());
    }

    public final void O0(int i4, boolean z3) {
        Bundle bundleC = C();
        if (bundleC != null) {
            int i5 = bundleC.getInt(f12438h, 0) & (~i4);
            if (!z3) {
                i4 = 0;
            }
            bundleC.putInt(f12438h, i4 | i5);
        }
    }

    public void O1(View view) {
        this.f12458a.setTraversalAfter(view);
    }

    public d P() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f12458a.getRangeInfo();
        if (rangeInfo != null) {
            return new d(rangeInfo);
        }
        return null;
    }

    @Deprecated
    public void P0(Rect rect) {
        this.f12458a.setBoundsInParent(rect);
    }

    public void P1(View view, int i4) {
        this.f12458a.setTraversalAfter(view, i4);
    }

    @c.k0
    public CharSequence Q() {
        return this.f12458a.getExtras().getCharSequence(f12430d);
    }

    public void Q0(Rect rect) {
        this.f12458a.setBoundsInScreen(rect);
    }

    public void Q1(View view) {
        this.f12458a.setTraversalBefore(view);
    }

    public final SparseArray<WeakReference<ClickableSpan>> R(View view) {
        return (SparseArray) view.getTag(a.e.f12715e0);
    }

    public void R0(boolean z3) {
        this.f12458a.setCanOpenPopup(z3);
    }

    public void R1(View view, int i4) {
        this.f12458a.setTraversalBefore(view, i4);
    }

    @c.k0
    public CharSequence S() {
        return p0.a.g() ? this.f12458a.getStateDescription() : this.f12458a.getExtras().getCharSequence(f12445n);
    }

    public void S0(boolean z3) {
        this.f12458a.setCheckable(z3);
    }

    public void S1(String str) {
        this.f12458a.setViewIdResourceName(str);
    }

    public CharSequence T() {
        if (!d0()) {
            return this.f12458a.getText();
        }
        List<Integer> listI = i(f12441j);
        List<Integer> listI2 = i(f12442k);
        List<Integer> listI3 = i(f12443l);
        List<Integer> listI4 = i(f12440i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f12458a.getText(), 0, this.f12458a.getText().length()));
        for (int i4 = 0; i4 < listI.size(); i4++) {
            spannableString.setSpan(new w0.a(listI4.get(i4).intValue(), this, C().getInt(f12444m)), listI.get(i4).intValue(), listI2.get(i4).intValue(), listI3.get(i4).intValue());
        }
        return spannableString;
    }

    public void T0(boolean z3) {
        this.f12458a.setChecked(z3);
    }

    public void T1(boolean z3) {
        this.f12458a.setVisibleToUser(z3);
    }

    public int U() {
        return this.f12458a.getTextSelectionEnd();
    }

    public void U0(CharSequence charSequence) {
        this.f12458a.setClassName(charSequence);
    }

    public AccessibilityNodeInfo U1() {
        return this.f12458a;
    }

    public int V() {
        return this.f12458a.getTextSelectionStart();
    }

    public void V0(boolean z3) {
        this.f12458a.setClickable(z3);
    }

    @c.k0
    public CharSequence W() {
        return Build.VERSION.SDK_INT >= 28 ? this.f12458a.getTooltipText() : this.f12458a.getExtras().getCharSequence(f12434f);
    }

    public void W0(Object obj) {
        this.f12458a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f12490a);
    }

    @c.k0
    public e X() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f12458a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new e(touchDelegateInfo);
    }

    public void X0(Object obj) {
        this.f12458a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f12491a);
    }

    public e0 Y() {
        return W1(this.f12458a.getTraversalAfter());
    }

    public void Y0(CharSequence charSequence) {
        this.f12458a.setContentDescription(charSequence);
    }

    public e0 Z() {
        return W1(this.f12458a.getTraversalBefore());
    }

    public void Z0(boolean z3) {
        this.f12458a.setContentInvalid(z3);
    }

    public void a(int i4) {
        this.f12458a.addAction(i4);
    }

    public String a0() {
        return this.f12458a.getViewIdResourceName();
    }

    public void a1(boolean z3) {
        this.f12458a.setContextClickable(z3);
    }

    public void b(a aVar) {
        this.f12458a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f12483a);
    }

    public m0 b0() {
        return m0.r(this.f12458a.getWindow());
    }

    public void b1(boolean z3) {
        this.f12458a.setDismissable(z3);
    }

    public void c(View view) {
        this.f12458a.addChild(view);
    }

    public int c0() {
        return this.f12458a.getWindowId();
    }

    public void c1(int i4) {
        this.f12458a.setDrawingOrder(i4);
    }

    public void d(View view, int i4) {
        this.f12458a.addChild(view, i4);
    }

    public final boolean d0() {
        return !i(f12441j).isEmpty();
    }

    public void d1(boolean z3) {
        this.f12458a.setEditable(z3);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        i(f12441j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f12442k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f12443l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f12440i).add(Integer.valueOf(i4));
    }

    public final int e0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals(sparseArray.valueAt(i4).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = f12439h0;
        f12439h0 = i5 + 1;
        return i5;
    }

    public void e1(boolean z3) {
        this.f12458a.setEnabled(z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f12458a;
        if (accessibilityNodeInfo == null) {
            if (e0Var.f12458a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(e0Var.f12458a)) {
            return false;
        }
        return this.f12460c == e0Var.f12460c && this.f12459b == e0Var.f12459b;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            M0(view);
            ClickableSpan[] clickableSpanArrW = w(charSequence);
            if (clickableSpanArrW == null || clickableSpanArrW.length <= 0) {
                return;
            }
            C().putInt(f12444m, a.e.f12706a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayL = L(view);
            for (int i4 = 0; i4 < clickableSpanArrW.length; i4++) {
                int iE0 = e0(clickableSpanArrW[i4], sparseArrayL);
                sparseArrayL.put(iE0, new WeakReference<>(clickableSpanArrW[i4]));
                e(clickableSpanArrW[i4], (Spanned) charSequence, iE0);
            }
        }
    }

    public boolean f0() {
        return this.f12458a.isAccessibilityFocused();
    }

    public void f1(CharSequence charSequence) {
        this.f12458a.setError(charSequence);
    }

    public boolean g() {
        return this.f12458a.canOpenPopup();
    }

    public boolean g0() {
        return this.f12458a.isCheckable();
    }

    public void g1(boolean z3) {
        this.f12458a.setFocusable(z3);
    }

    public final void h() {
        this.f12458a.getExtras().remove(f12441j);
        this.f12458a.getExtras().remove(f12442k);
        this.f12458a.getExtras().remove(f12443l);
        this.f12458a.getExtras().remove(f12440i);
    }

    public boolean h0() {
        return this.f12458a.isChecked();
    }

    public void h1(boolean z3) {
        this.f12458a.setFocused(z3);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f12458a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f12458a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f12458a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public boolean i0() {
        return this.f12458a.isClickable();
    }

    public void i1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12458a.setHeading(z3);
        } else {
            O0(2, z3);
        }
    }

    public List<e0> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f12458a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(V1(listFindAccessibilityNodeInfosByText.get(i4)));
        }
        return arrayList;
    }

    public boolean j0() {
        return this.f12458a.isContentInvalid();
    }

    public void j1(@c.k0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12458a.setHintText(charSequence);
        } else {
            this.f12458a.getExtras().putCharSequence(f12436g, charSequence);
        }
    }

    public List<e0> k(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f12458a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(V1(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f12458a.isContextClickable();
    }

    public void k1(boolean z3) {
        this.f12458a.setImportantForAccessibility(z3);
    }

    public e0 l(int i4) {
        return W1(this.f12458a.findFocus(i4));
    }

    public boolean l0() {
        return this.f12458a.isDismissable();
    }

    public void l1(int i4) {
        this.f12458a.setInputType(i4);
    }

    public e0 m(int i4) {
        return W1(this.f12458a.focusSearch(i4));
    }

    public boolean m0() {
        return this.f12458a.isEditable();
    }

    public void m1(View view) {
        this.f12458a.setLabelFor(view);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f12458a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    public boolean n0() {
        return this.f12458a.isEnabled();
    }

    public void n1(View view, int i4) {
        this.f12458a.setLabelFor(view, i4);
    }

    public boolean o0() {
        return this.f12458a.isFocusable();
    }

    public void o1(View view) {
        this.f12458a.setLabeledBy(view);
    }

    public int p() {
        return this.f12458a.getActions();
    }

    public boolean p0() {
        return this.f12458a.isFocused();
    }

    public void p1(View view, int i4) {
        this.f12458a.setLabeledBy(view, i4);
    }

    public final boolean q(int i4) {
        Bundle bundleC = C();
        return bundleC != null && (bundleC.getInt(f12438h, 0) & i4) == i4;
    }

    public boolean q0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f12458a.isHeading();
        }
        if (q(2)) {
            return true;
        }
        c cVarY = y();
        return cVarY != null && cVarY.e();
    }

    public void q1(int i4) {
        this.f12458a.setLiveRegion(i4);
    }

    @Deprecated
    public void r(Rect rect) {
        this.f12458a.getBoundsInParent(rect);
    }

    public boolean r0() {
        return this.f12458a.isImportantForAccessibility();
    }

    public void r1(boolean z3) {
        this.f12458a.setLongClickable(z3);
    }

    public void s(Rect rect) {
        this.f12458a.getBoundsInScreen(rect);
    }

    public boolean s0() {
        return this.f12458a.isLongClickable();
    }

    public void s1(int i4) {
        this.f12458a.setMaxTextLength(i4);
    }

    public e0 t(int i4) {
        return W1(this.f12458a.getChild(i4));
    }

    public boolean t0() {
        return this.f12458a.isMultiLine();
    }

    public void t1(int i4) {
        this.f12458a.setMovementGranularities(i4);
    }

    @c.j0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        r(rect);
        sb.append("; boundsInParent: " + rect);
        s(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(M());
        sb.append("; className: ");
        sb.append(v());
        sb.append("; text: ");
        sb.append(T());
        sb.append("; contentDescription: ");
        sb.append(z());
        sb.append("; viewId: ");
        sb.append(a0());
        sb.append("; checkable: ");
        sb.append(g0());
        sb.append("; checked: ");
        sb.append(h0());
        sb.append("; focusable: ");
        sb.append(o0());
        sb.append("; focused: ");
        sb.append(p0());
        sb.append("; selected: ");
        sb.append(x0());
        sb.append("; clickable: ");
        sb.append(i0());
        sb.append("; longClickable: ");
        sb.append(s0());
        sb.append("; enabled: ");
        sb.append(n0());
        sb.append("; password: ");
        sb.append(u0());
        sb.append("; scrollable: " + w0());
        sb.append("; [");
        List<a> listN = n();
        for (int i4 = 0; i4 < listN.size(); i4++) {
            a aVar = listN.get(i4);
            String strO = o(aVar.b());
            if (strO.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strO = aVar.c().toString();
            }
            sb.append(strO);
            if (i4 != listN.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f12458a.getChildCount();
    }

    public boolean u0() {
        return this.f12458a.isPassword();
    }

    public void u1(boolean z3) {
        this.f12458a.setMultiLine(z3);
    }

    public CharSequence v() {
        return this.f12458a.getClassName();
    }

    public boolean v0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f12458a.isScreenReaderFocusable() : q(1);
    }

    public void v1(CharSequence charSequence) {
        this.f12458a.setPackageName(charSequence);
    }

    public boolean w0() {
        return this.f12458a.isScrollable();
    }

    public void w1(@c.k0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12458a.setPaneTitle(charSequence);
        } else {
            this.f12458a.getExtras().putCharSequence(f12432e, charSequence);
        }
    }

    public b x() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f12458a.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public boolean x0() {
        return this.f12458a.isSelected();
    }

    public void x1(View view) {
        this.f12459b = -1;
        this.f12458a.setParent(view);
    }

    public c y() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f12458a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new c(collectionItemInfo);
        }
        return null;
    }

    public boolean y0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f12458a.isShowingHintText() : q(4);
    }

    public void y1(View view, int i4) {
        this.f12459b = i4;
        this.f12458a.setParent(view, i4);
    }

    public CharSequence z() {
        return this.f12458a.getContentDescription();
    }

    public boolean z0() {
        return Build.VERSION.SDK_INT >= 29 ? this.f12458a.isTextEntryKey() : q(8);
    }

    public void z1(boolean z3) {
        this.f12458a.setPassword(z3);
    }

    @Deprecated
    public e0(Object obj) {
        this.f12458a = (AccessibilityNodeInfo) obj;
    }
}
