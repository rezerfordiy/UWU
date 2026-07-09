package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.j;
import r.p;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final int A = -1;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f2068u = "MotionScene";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f2069v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f2070w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f2071x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f2072y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f2073z = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f2074a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MotionEvent f2087n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MotionLayout.f f2090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2093t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f2075b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f2076c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2077d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<b> f2078e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f2079f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<b> f2080g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.d> f2081h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<String, Integer> f2082i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SparseIntArray f2083j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2084k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2085l = 400;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2086m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2088o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2089p = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    public class InterpolatorC0012a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q.c f2094a;

        public InterpolatorC0012a(q.c cVar) {
            this.f2094a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) this.f2094a.a(f4);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f2096s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f2097t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f2098u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f2099v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f2100w = 4;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f2101x = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f2107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2108g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2109h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f2110i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f2111j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<j> f2112k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f2113l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ArrayList<ViewOnClickListenerC0013a> f2114m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2115n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f2116o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2117p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2118q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2119r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0013a implements View.OnClickListener {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f2120e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f2121f = 17;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f2122g = 16;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f2123h = 256;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f2124i = 4096;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f2125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2126c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2127d;

            public ViewOnClickListenerC0013a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f2126c = -1;
                this.f2127d = 17;
                this.f2125b = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Qf);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i4 = 0; i4 < indexCount; i4++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i4);
                    if (index == e.m.Sf) {
                        this.f2126c = typedArrayObtainStyledAttributes.getResourceId(index, this.f2126c);
                    } else if (index == e.m.Rf) {
                        this.f2127d = typedArrayObtainStyledAttributes.getInt(index, this.f2127d);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i4, b bVar) {
                int i5 = this.f2126c;
                View viewFindViewById = motionLayout;
                if (i5 != -1) {
                    viewFindViewById = motionLayout.findViewById(i5);
                }
                if (viewFindViewById == null) {
                    Log.e(a.f2068u, "OnClick could not find id " + this.f2126c);
                    return;
                }
                int i6 = bVar.f2105d;
                int i7 = bVar.f2104c;
                if (i6 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i8 = this.f2127d;
                boolean z3 = false;
                boolean z4 = ((i8 & 1) != 0 && i4 == i6) | ((i8 & 1) != 0 && i4 == i6) | ((i8 & 256) != 0 && i4 == i6) | ((i8 & 16) != 0 && i4 == i7);
                if ((i8 & 4096) != 0 && i4 == i7) {
                    z3 = true;
                }
                if (z4 || z3) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f2125b;
                if (bVar2 == bVar) {
                    return true;
                }
                int i4 = bVar2.f2104c;
                int i5 = this.f2125b.f2105d;
                int i6 = motionLayout.L;
                return i5 == -1 ? i6 != i4 : i6 == i5 || i6 == i4;
            }

            public void c(MotionLayout motionLayout) {
                int i4 = this.f2126c;
                if (i4 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i4);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e(a.f2068u, " (*)  could not find id " + this.f2126c);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                float f4;
                MotionLayout motionLayout = this.f2125b.f2111j.f2074a;
                if (motionLayout.u0()) {
                    if (this.f2125b.f2105d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.I0(this.f2125b.f2104c);
                            return;
                        }
                        b bVar = new b(this.f2125b.f2111j, this.f2125b);
                        bVar.f2105d = currentState;
                        bVar.f2104c = this.f2125b.f2104c;
                        motionLayout.setTransition(bVar);
                        motionLayout.G0();
                        return;
                    }
                    b bVar2 = this.f2125b.f2111j.f2076c;
                    int i4 = this.f2127d;
                    boolean z3 = false;
                    boolean z4 = ((i4 & 1) == 0 && (i4 & 256) == 0) ? false : true;
                    boolean z5 = ((i4 & 16) == 0 && (i4 & 4096) == 0) ? false : true;
                    if (z4 && z5) {
                        b bVar3 = this.f2125b.f2111j.f2076c;
                        b bVar4 = this.f2125b;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z5 = false;
                            z3 = z4;
                        }
                    } else {
                        z3 = z4;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z3 && (this.f2127d & 1) != 0) {
                            motionLayout.setTransition(this.f2125b);
                            motionLayout.G0();
                            return;
                        }
                        if (z5 && (this.f2127d & 16) != 0) {
                            motionLayout.setTransition(this.f2125b);
                            motionLayout.H0();
                            return;
                        }
                        if (z3 && (this.f2127d & 256) != 0) {
                            motionLayout.setTransition(this.f2125b);
                            f4 = 1.0f;
                        } else {
                            if (!z5 || (this.f2127d & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f2125b);
                            f4 = 0.0f;
                        }
                        motionLayout.setProgress(f4);
                    }
                }
            }
        }

        public b(int i4, a aVar, int i5, int i6) {
            this.f2102a = -1;
            this.f2103b = false;
            this.f2104c = -1;
            this.f2105d = -1;
            this.f2106e = 0;
            this.f2107f = null;
            this.f2108g = -1;
            this.f2109h = 400;
            this.f2110i = 0.0f;
            this.f2112k = new ArrayList<>();
            this.f2113l = null;
            this.f2114m = new ArrayList<>();
            this.f2115n = 0;
            this.f2116o = false;
            this.f2117p = -1;
            this.f2118q = 0;
            this.f2119r = 0;
            this.f2102a = i4;
            this.f2111j = aVar;
            this.f2105d = i5;
            this.f2104c = i6;
            this.f2109h = aVar.f2085l;
            this.f2118q = aVar.f2086m;
        }

        public int A() {
            return this.f2102a;
        }

        public List<j> B() {
            return this.f2112k;
        }

        public int C() {
            return this.f2118q;
        }

        public List<ViewOnClickListenerC0013a> D() {
            return this.f2114m;
        }

        public int E() {
            return this.f2117p;
        }

        public float F() {
            return this.f2110i;
        }

        public int G() {
            return this.f2105d;
        }

        public androidx.constraintlayout.motion.widget.b H() {
            return this.f2113l;
        }

        public boolean I() {
            return !this.f2116o;
        }

        public boolean J(int i4) {
            return (i4 & this.f2119r) != 0;
        }

        public void K(int i4) {
            this.f2115n = i4;
        }

        public void L(int i4) {
            this.f2109h = i4;
        }

        public void M(boolean z3) {
            this.f2116o = !z3;
        }

        public void N(int i4) {
            this.f2117p = i4;
        }

        public void O(float f4) {
            this.f2110i = f4;
        }

        public void t(Context context, XmlPullParser xmlPullParser) {
            this.f2114m.add(new ViewOnClickListenerC0013a(context, this, xmlPullParser));
        }

        public String u(Context context) {
            String resourceEntryName = this.f2105d == -1 ? "null" : context.getResources().getResourceEntryName(this.f2105d);
            if (this.f2104c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f2104c);
        }

        public final void v(a aVar, Context context, TypedArray typedArray) {
            androidx.constraintlayout.widget.d dVar;
            SparseArray sparseArray;
            int i4;
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                if (index == e.m.Hi) {
                    this.f2104c = typedArray.getResourceId(index, this.f2104c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2104c))) {
                        dVar = new androidx.constraintlayout.widget.d();
                        dVar.n0(context, this.f2104c);
                        sparseArray = aVar.f2081h;
                        i4 = this.f2104c;
                        sparseArray.append(i4, dVar);
                    }
                } else if (index == e.m.Ii) {
                    this.f2105d = typedArray.getResourceId(index, this.f2105d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f2105d))) {
                        dVar = new androidx.constraintlayout.widget.d();
                        dVar.n0(context, this.f2105d);
                        sparseArray = aVar.f2081h;
                        i4 = this.f2105d;
                        sparseArray.append(i4, dVar);
                    }
                } else if (index == e.m.Li) {
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2108g = resourceId;
                        if (resourceId != -1) {
                            this.f2106e = -2;
                        }
                    } else if (i6 == 3) {
                        String string = typedArray.getString(index);
                        this.f2107f = string;
                        if (string.indexOf("/") > 0) {
                            this.f2108g = typedArray.getResourceId(index, -1);
                            this.f2106e = -2;
                        } else {
                            this.f2106e = -1;
                        }
                    } else {
                        this.f2106e = typedArray.getInteger(index, this.f2106e);
                    }
                } else if (index == e.m.Ji) {
                    this.f2109h = typedArray.getInt(index, this.f2109h);
                } else if (index == e.m.Ni) {
                    this.f2110i = typedArray.getFloat(index, this.f2110i);
                } else if (index == e.m.Gi) {
                    this.f2115n = typedArray.getInteger(index, this.f2115n);
                } else if (index == e.m.Fi) {
                    this.f2102a = typedArray.getResourceId(index, this.f2102a);
                } else if (index == e.m.Oi) {
                    this.f2116o = typedArray.getBoolean(index, this.f2116o);
                } else if (index == e.m.Mi) {
                    this.f2117p = typedArray.getInteger(index, -1);
                } else if (index == e.m.Ki) {
                    this.f2118q = typedArray.getInteger(index, 0);
                } else if (index == e.m.Pi) {
                    this.f2119r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2105d == -1) {
                this.f2103b = true;
            }
        }

        public final void w(a aVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Ei);
            v(aVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int x() {
            return this.f2115n;
        }

        public int y() {
            return this.f2109h;
        }

        public int z() {
            return this.f2104c;
        }

        public b(a aVar, Context context, XmlPullParser xmlPullParser) {
            this.f2102a = -1;
            this.f2103b = false;
            this.f2104c = -1;
            this.f2105d = -1;
            this.f2106e = 0;
            this.f2107f = null;
            this.f2108g = -1;
            this.f2109h = 400;
            this.f2110i = 0.0f;
            this.f2112k = new ArrayList<>();
            this.f2113l = null;
            this.f2114m = new ArrayList<>();
            this.f2115n = 0;
            this.f2116o = false;
            this.f2117p = -1;
            this.f2118q = 0;
            this.f2119r = 0;
            this.f2109h = aVar.f2085l;
            this.f2118q = aVar.f2086m;
            this.f2111j = aVar;
            w(aVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        public b(a aVar, b bVar) {
            this.f2102a = -1;
            this.f2103b = false;
            this.f2104c = -1;
            this.f2105d = -1;
            this.f2106e = 0;
            this.f2107f = null;
            this.f2108g = -1;
            this.f2109h = 400;
            this.f2110i = 0.0f;
            this.f2112k = new ArrayList<>();
            this.f2113l = null;
            this.f2114m = new ArrayList<>();
            this.f2115n = 0;
            this.f2116o = false;
            this.f2117p = -1;
            this.f2118q = 0;
            this.f2119r = 0;
            this.f2111j = aVar;
            if (bVar != null) {
                this.f2117p = bVar.f2117p;
                this.f2106e = bVar.f2106e;
                this.f2107f = bVar.f2107f;
                this.f2108g = bVar.f2108g;
                this.f2109h = bVar.f2109h;
                this.f2112k = bVar.f2112k;
                this.f2110i = bVar.f2110i;
                this.f2118q = bVar.f2118q;
            }
        }
    }

    public a(Context context, MotionLayout motionLayout, int i4) {
        this.f2074a = motionLayout;
        K(context, i4);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f2081h;
        int i5 = e.g.f2990w1;
        sparseArray.put(i5, new androidx.constraintlayout.widget.d());
        this.f2082i.put("motion_base", Integer.valueOf(i5));
    }

    public static String d0(String str) {
        if (str == null) {
            return s0.a.f11071l;
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public float A(float f4, float f5) {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return 0.0f;
        }
        return this.f2076c.f2113l.k(f4, f5);
    }

    public final int B(int i4) {
        int iE;
        f fVar = this.f2075b;
        return (fVar == null || (iE = fVar.e(i4, -1, -1)) == -1) ? i4 : iE;
    }

    public float C() {
        b bVar = this.f2076c;
        if (bVar != null) {
            return bVar.f2110i;
        }
        return 0.0f;
    }

    public int D() {
        b bVar = this.f2076c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2105d;
    }

    public b E(int i4) {
        for (b bVar : this.f2078e) {
            if (bVar.f2102a == i4) {
                return bVar;
            }
        }
        return null;
    }

    public int F(int i4) {
        Iterator<b> it = this.f2078e.iterator();
        while (it.hasNext()) {
            if (it.next().f2105d == i4) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> G(int i4) {
        int iB = B(i4);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f2078e) {
            if (bVar.f2105d == iB || bVar.f2104c == iB) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean H(int i4) {
        int i5 = this.f2083j.get(i4);
        int size = this.f2083j.size();
        while (i5 > 0) {
            if (i5 == i4) {
                return true;
            }
            int i6 = size - 1;
            if (size < 0) {
                return true;
            }
            i5 = this.f2083j.get(i5);
            size = i6;
        }
        return false;
    }

    public boolean I(View view, int i4) {
        b bVar = this.f2076c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f2112k.iterator();
        while (it.hasNext()) {
            Iterator<r.e> it2 = ((j) it.next()).c(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f10516a == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean J() {
        return this.f2090q != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                byte b4 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f2084k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            b4 = !name.equals(androidx.constraintlayout.widget.d.f2405e) ? (byte) -1 : (byte) 5;
                            break;
                        case -1239391468:
                            b4 = !name.equals("KeyFrameSet") ? (byte) -1 : (byte) 6;
                            break;
                        case 269306229:
                            if (!name.equals("Transition")) {
                                b4 = -1;
                            }
                            break;
                        case 312750793:
                            b4 = !name.equals("OnClick") ? (byte) -1 : (byte) 3;
                            break;
                        case 327855227:
                            b4 = !name.equals("OnSwipe") ? (byte) -1 : (byte) 2;
                            break;
                        case 793277014:
                            b4 = !name.equals(f2068u) ? (byte) -1 : (byte) 0;
                            break;
                        case 1382829617:
                            b4 = !name.equals("StateSet") ? (byte) -1 : (byte) 4;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    switch (b4) {
                        case 0:
                            P(context, xml);
                            break;
                        case 1:
                            ArrayList<b> arrayList = this.f2078e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f2076c == null && !bVar.f2103b) {
                                this.f2076c = bVar;
                                if (bVar.f2113l != null) {
                                    this.f2076c.f2113l.u(this.f2091r);
                                }
                            }
                            if (bVar.f2103b) {
                                if (bVar.f2104c == -1) {
                                    this.f2079f = bVar;
                                } else {
                                    this.f2080g.add(bVar);
                                }
                                this.f2078e.remove(bVar);
                            }
                            break;
                        case 2:
                            if (bVar == null) {
                                Log.v(f2068u, " OnSwipe (" + context.getResources().getResourceEntryName(i4) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            bVar.f2113l = new androidx.constraintlayout.motion.widget.b(context, this.f2074a, xml);
                            break;
                        case 3:
                            bVar.t(context, xml);
                            break;
                        case 4:
                            this.f2075b = new f(context, xml);
                            break;
                        case 5:
                            O(context, xml);
                            break;
                        case 6:
                            bVar.f2112k.add(new j(context, xml));
                            break;
                        default:
                            Log.v(f2068u, "WARNING UNKNOWN ATTRIBUTE " + name);
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public int L(String str) {
        return this.f2082i.get(str).intValue();
    }

    public String M(int i4) {
        for (Map.Entry<String, Integer> entry : this.f2082i.entrySet()) {
            if (entry.getValue().intValue() == i4) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void N(boolean z3, int i4, int i5, int i6, int i7) {
    }

    public final void O(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.J0(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iR = -1;
        int iR2 = -1;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            if (this.f2084k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iR2 = r(context, attributeValue);
            } else if (attributeName.equals(j2.a.f8286f)) {
                iR = r(context, attributeValue);
                this.f2082i.put(d0(attributeValue), Integer.valueOf(iR));
            }
        }
        if (iR != -1) {
            if (this.f2074a.f1996g0 != 0) {
                dVar.h1(true);
            }
            dVar.o0(context, xmlPullParser);
            if (iR2 != -1) {
                this.f2083j.put(iR, iR2);
            }
            this.f2081h.put(iR, dVar);
        }
    }

    public final void P(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Jf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == e.m.Kf) {
                this.f2085l = typedArrayObtainStyledAttributes.getInt(index, this.f2085l);
            } else if (index == e.m.Lf) {
                this.f2086m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void Q(float f4, float f5) {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return;
        }
        this.f2076c.f2113l.o(f4, f5);
    }

    public void R(float f4, float f5) {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return;
        }
        this.f2076c.f2113l.p(f4, f5);
    }

    public void S(MotionEvent motionEvent, int i4, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2090q == null) {
            this.f2090q = this.f2074a.w0();
        }
        this.f2090q.b(motionEvent);
        if (i4 != -1) {
            int action = motionEvent.getAction();
            boolean z3 = false;
            if (action == 0) {
                this.f2092s = motionEvent.getRawX();
                this.f2093t = motionEvent.getRawY();
                this.f2087n = motionEvent;
                this.f2088o = false;
                if (this.f2076c.f2113l != null) {
                    RectF rectFF = this.f2076c.f2113l.f(this.f2074a, rectF);
                    if (rectFF != null && !rectFF.contains(this.f2087n.getX(), this.f2087n.getY())) {
                        this.f2087n = null;
                        this.f2088o = true;
                        return;
                    }
                    RectF rectFL = this.f2076c.f2113l.l(this.f2074a, rectF);
                    if (rectFL == null || rectFL.contains(this.f2087n.getX(), this.f2087n.getY())) {
                        this.f2089p = false;
                    } else {
                        this.f2089p = true;
                    }
                    this.f2076c.f2113l.r(this.f2092s, this.f2093t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f2088o) {
                float rawY = motionEvent.getRawY() - this.f2093t;
                float rawX = motionEvent.getRawX() - this.f2092s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f2087n) == null) {
                    return;
                }
                b bVarH = h(i4, rawX, rawY, motionEvent2);
                if (bVarH != null) {
                    motionLayout.setTransition(bVarH);
                    RectF rectFL2 = this.f2076c.f2113l.l(this.f2074a, rectF);
                    if (rectFL2 != null && !rectFL2.contains(this.f2087n.getX(), this.f2087n.getY())) {
                        z3 = true;
                    }
                    this.f2089p = z3;
                    this.f2076c.f2113l.w(this.f2092s, this.f2093t);
                }
            }
        }
        if (this.f2088o) {
            return;
        }
        b bVar = this.f2076c;
        if (bVar != null && bVar.f2113l != null && !this.f2089p) {
            this.f2076c.f2113l.n(motionEvent, this.f2090q, i4, this);
        }
        this.f2092s = motionEvent.getRawX();
        this.f2093t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f2090q) == null) {
            return;
        }
        fVar.f();
        this.f2090q = null;
        int i5 = motionLayout.L;
        if (i5 != -1) {
            g(motionLayout, i5);
        }
    }

    public final void T(int i4) {
        int i5 = this.f2083j.get(i4);
        if (i5 > 0) {
            T(this.f2083j.get(i4));
            androidx.constraintlayout.widget.d dVar = this.f2081h.get(i4);
            androidx.constraintlayout.widget.d dVar2 = this.f2081h.get(i5);
            if (dVar2 != null) {
                dVar.w0(dVar2);
                this.f2083j.put(i4, -1);
            } else {
                Log.e(f2068u, "ERROR! invalid deriveConstraintsFrom: @id/" + r.c.i(this.f2074a.getContext(), i5));
            }
        }
    }

    public void U(MotionLayout motionLayout) {
        for (int i4 = 0; i4 < this.f2081h.size(); i4++) {
            int iKeyAt = this.f2081h.keyAt(i4);
            if (H(iKeyAt)) {
                Log.e(f2068u, "Cannot be derived from yourself");
                return;
            }
            T(iKeyAt);
        }
        for (int i5 = 0; i5 < this.f2081h.size(); i5++) {
            this.f2081h.valueAt(i5).v0(motionLayout);
        }
    }

    public void V(b bVar) {
        int iS = s(bVar);
        if (iS != -1) {
            this.f2078e.remove(iS);
        }
    }

    public void W(int i4, androidx.constraintlayout.widget.d dVar) {
        this.f2081h.put(i4, dVar);
    }

    public void X(int i4) {
        b bVar = this.f2076c;
        if (bVar != null) {
            bVar.L(i4);
        } else {
            this.f2085l = i4;
        }
    }

    public void Y(View view, int i4, String str, Object obj) {
        b bVar = this.f2076c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f2112k.iterator();
        while (it.hasNext()) {
            Iterator<r.e> it2 = ((j) it.next()).c(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f10516a == i4) {
                    if (obj != null) {
                        ((Float) obj).floatValue();
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void Z(boolean z3) {
        this.f2091r = z3;
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return;
        }
        this.f2076c.f2113l.u(this.f2091r);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.f r0 = r6.f2075b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.f r2 = r6.f2075b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f2078e
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = androidx.constraintlayout.motion.widget.a.b.a(r4)
            if (r5 != r2) goto L36
            int r5 = androidx.constraintlayout.motion.widget.a.b.c(r4)
            if (r5 == r0) goto L42
        L36:
            int r5 = androidx.constraintlayout.motion.widget.a.b.a(r4)
            if (r5 != r8) goto L1e
            int r5 = androidx.constraintlayout.motion.widget.a.b.c(r4)
            if (r5 != r7) goto L1e
        L42:
            r6.f2076c = r4
            if (r4 == 0) goto L57
            androidx.constraintlayout.motion.widget.b r7 = androidx.constraintlayout.motion.widget.a.b.m(r4)
            if (r7 == 0) goto L57
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f2076c
            androidx.constraintlayout.motion.widget.b r7 = androidx.constraintlayout.motion.widget.a.b.m(r7)
            boolean r8 = r6.f2091r
            r7.u(r8)
        L57:
            return
        L58:
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f2079f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f2080g
            java.util.Iterator r3 = r3.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = androidx.constraintlayout.motion.widget.a.b.a(r4)
            if (r5 != r8) goto L60
            r7 = r4
            goto L60
        L74:
            androidx.constraintlayout.motion.widget.a$b r8 = new androidx.constraintlayout.motion.widget.a$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.a.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.a.b.b(r8, r2)
            if (r0 == r1) goto L86
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r7 = r6.f2078e
            r7.add(r8)
        L86:
            r6.f2076c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.a0(int, int):void");
    }

    public void b0(b bVar) {
        this.f2076c = bVar;
        if (bVar == null || bVar.f2113l == null) {
            return;
        }
        this.f2076c.f2113l.u(this.f2091r);
    }

    public void c0() {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return;
        }
        this.f2076c.f2113l.x();
    }

    public void e(MotionLayout motionLayout, int i4) {
        for (b bVar : this.f2078e) {
            if (bVar.f2114m.size() > 0) {
                Iterator it = bVar.f2114m.iterator();
                while (it.hasNext()) {
                    ((b.ViewOnClickListenerC0013a) it.next()).c(motionLayout);
                }
            }
        }
        for (b bVar2 : this.f2080g) {
            if (bVar2.f2114m.size() > 0) {
                Iterator it2 = bVar2.f2114m.iterator();
                while (it2.hasNext()) {
                    ((b.ViewOnClickListenerC0013a) it2.next()).c(motionLayout);
                }
            }
        }
        for (b bVar3 : this.f2078e) {
            if (bVar3.f2114m.size() > 0) {
                Iterator it3 = bVar3.f2114m.iterator();
                while (it3.hasNext()) {
                    ((b.ViewOnClickListenerC0013a) it3.next()).a(motionLayout, i4, bVar3);
                }
            }
        }
        for (b bVar4 : this.f2080g) {
            if (bVar4.f2114m.size() > 0) {
                Iterator it4 = bVar4.f2114m.iterator();
                while (it4.hasNext()) {
                    ((b.ViewOnClickListenerC0013a) it4.next()).a(motionLayout, i4, bVar4);
                }
            }
        }
    }

    public boolean e0() {
        Iterator<b> it = this.f2078e.iterator();
        while (it.hasNext()) {
            if (it.next().f2113l != null) {
                return true;
            }
        }
        b bVar = this.f2076c;
        return (bVar == null || bVar.f2113l == null) ? false : true;
    }

    public void f(b bVar) {
        int iS = s(bVar);
        if (iS == -1) {
            this.f2078e.add(bVar);
        } else {
            this.f2078e.set(iS, bVar);
        }
    }

    public boolean f0(MotionLayout motionLayout) {
        return motionLayout == this.f2074a && motionLayout.H == this;
    }

    public boolean g(MotionLayout motionLayout, int i4) {
        if (J() || this.f2077d) {
            return false;
        }
        for (b bVar : this.f2078e) {
            if (bVar.f2115n != 0 && this.f2076c != bVar) {
                if (i4 == bVar.f2105d && (bVar.f2115n == 4 || bVar.f2115n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(bVar);
                    if (bVar.f2115n == 4) {
                        motionLayout.G0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.g0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar);
                        motionLayout.x0();
                    }
                    return true;
                }
                if (i4 == bVar.f2104c && (bVar.f2115n == 3 || bVar.f2115n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(bVar);
                    if (bVar.f2115n == 3) {
                        motionLayout.H0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.g0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar2);
                        motionLayout.x0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i4, float f4, float f5, MotionEvent motionEvent) {
        if (i4 == -1) {
            return this.f2076c;
        }
        List<b> listG = G(i4);
        RectF rectF = new RectF();
        float f6 = 0.0f;
        b bVar = null;
        for (b bVar2 : listG) {
            if (!bVar2.f2116o && bVar2.f2113l != null) {
                bVar2.f2113l.u(this.f2091r);
                RectF rectFL = bVar2.f2113l.l(this.f2074a, rectF);
                if (rectFL == null || motionEvent == null || rectFL.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFL2 = bVar2.f2113l.l(this.f2074a, rectF);
                    if (rectFL2 == null || motionEvent == null || rectFL2.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f2113l.a(f4, f5) * (bVar2.f2104c == i4 ? -1.0f : 1.1f);
                        if (fA > f6) {
                            bVar = bVar2;
                            f6 = fA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void i(boolean z3) {
        this.f2077d = z3;
    }

    public int j() {
        b bVar = this.f2076c;
        if (bVar != null) {
            return bVar.f2117p;
        }
        return -1;
    }

    public androidx.constraintlayout.widget.d k(int i4) {
        return l(i4, -1, -1);
    }

    public androidx.constraintlayout.widget.d l(int i4, int i5, int i6) {
        androidx.constraintlayout.widget.d dVar;
        int iE;
        if (this.f2084k) {
            System.out.println("id " + i4);
            System.out.println("size " + this.f2081h.size());
        }
        f fVar = this.f2075b;
        if (fVar != null && (iE = fVar.e(i4, i5, i6)) != -1) {
            i4 = iE;
        }
        if (this.f2081h.get(i4) == null) {
            Log.e(f2068u, "Warning could not find ConstraintSet id/" + r.c.i(this.f2074a.getContext(), i4) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f2081h;
            dVar = sparseArray.get(sparseArray.keyAt(0));
        } else {
            dVar = this.f2081h.get(i4);
        }
        return dVar;
    }

    public androidx.constraintlayout.widget.d m(Context context, String str) {
        if (this.f2084k) {
            System.out.println("id " + str);
            System.out.println("size " + this.f2081h.size());
        }
        for (int i4 = 0; i4 < this.f2081h.size(); i4++) {
            int iKeyAt = this.f2081h.keyAt(i4);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f2084k) {
                System.out.println("Id for <" + i4 + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f2081h.get(iKeyAt);
            }
        }
        return null;
    }

    public int[] n() {
        int size = this.f2081h.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f2081h.keyAt(i4);
        }
        return iArr;
    }

    public ArrayList<b> o() {
        return this.f2078e;
    }

    public int p() {
        b bVar = this.f2076c;
        return bVar != null ? bVar.f2109h : this.f2085l;
    }

    public int q() {
        b bVar = this.f2076c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2104c;
    }

    public final int r(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), j2.a.f8286f, context.getPackageName());
            if (this.f2084k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e(f2068u, "error in parsing id");
        return identifier;
    }

    public final int s(b bVar) {
        int i4 = bVar.f2102a;
        if (i4 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i5 = 0; i5 < this.f2078e.size(); i5++) {
            if (this.f2078e.get(i5).f2102a == i4) {
                return i5;
            }
        }
        return -1;
    }

    public Interpolator t() {
        int i4 = this.f2076c.f2106e;
        if (i4 == -2) {
            return AnimationUtils.loadInterpolator(this.f2074a.getContext(), this.f2076c.f2108g);
        }
        if (i4 == -1) {
            return new InterpolatorC0012a(q.c.c(this.f2076c.f2107f));
        }
        if (i4 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i4 == 1) {
            return new AccelerateInterpolator();
        }
        if (i4 == 2) {
            return new DecelerateInterpolator();
        }
        if (i4 == 4) {
            return new AnticipateInterpolator();
        }
        if (i4 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public r.e u(Context context, int i4, int i5, int i6) {
        b bVar = this.f2076c;
        if (bVar == null) {
            return null;
        }
        for (j jVar : bVar.f2112k) {
            for (Integer num : jVar.d()) {
                if (i5 == num.intValue()) {
                    for (r.e eVar : jVar.c(num.intValue())) {
                        if (eVar.f10516a == i6 && eVar.f10519d == i4) {
                            return eVar;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void v(p pVar) {
        b bVar = this.f2076c;
        if (bVar != null) {
            Iterator it = bVar.f2112k.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(pVar);
            }
        } else {
            b bVar2 = this.f2079f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f2112k.iterator();
                while (it2.hasNext()) {
                    ((j) it2.next()).a(pVar);
                }
            }
        }
    }

    public float w() {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return 0.0f;
        }
        return this.f2076c.f2113l.h();
    }

    public float x() {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return 0.0f;
        }
        return this.f2076c.f2113l.i();
    }

    public boolean y() {
        b bVar = this.f2076c;
        if (bVar == null || bVar.f2113l == null) {
            return false;
        }
        return this.f2076c.f2113l.j();
    }

    public float z(View view, int i4) {
        return 0.0f;
    }

    public a(MotionLayout motionLayout) {
        this.f2074a = motionLayout;
    }
}
