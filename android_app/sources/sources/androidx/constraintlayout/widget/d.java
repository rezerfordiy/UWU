package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import v.j;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final int A = 0;
    public static final int A0 = 44;
    public static final int B = 1;
    public static final int B0 = 45;
    public static final int C = 0;
    public static final int C0 = 46;
    public static final int D = 1;
    public static final int D0 = 47;
    public static final int E = 2;
    public static final int E0 = 48;
    public static final boolean F = false;
    public static final int F0 = 49;
    public static final int[] G = {0, 4, 8};
    public static final int G0 = 50;
    public static final int H = 1;
    public static final int H0 = 51;
    public static SparseIntArray I = null;
    public static final int I0 = 52;
    public static final int J = 1;
    public static final int J0 = 53;
    public static final int K = 2;
    public static final int K0 = 54;
    public static final int L = 3;
    public static final int L0 = 55;
    public static final int M = 4;
    public static final int M0 = 56;
    public static final int N = 5;
    public static final int N0 = 57;
    public static final int O = 6;
    public static final int O0 = 58;
    public static final int P = 7;
    public static final int P0 = 59;
    public static final int Q = 8;
    public static final int Q0 = 60;
    public static final int R = 9;
    public static final int R0 = 61;
    public static final int S = 10;
    public static final int S0 = 62;
    public static final int T = 11;
    public static final int T0 = 63;
    public static final int U = 12;
    public static final int U0 = 64;
    public static final int V = 13;
    public static final int V0 = 65;
    public static final int W = 14;
    public static final int W0 = 66;
    public static final int X = 15;
    public static final int X0 = 67;
    public static final int Y = 16;
    public static final int Y0 = 68;
    public static final int Z = 17;
    public static final int Z0 = 69;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f2397a0 = 18;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f2398a1 = 70;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f2399b0 = 19;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f2400b1 = 71;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f2401c0 = 20;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f2402c1 = 72;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f2403d0 = 21;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f2404d1 = 73;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2405e = "ConstraintSet";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f2406e0 = 22;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f2407e1 = 74;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f2408f = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f2409f0 = 23;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f2410f1 = 75;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f2411g = -1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f2412g0 = 24;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f2413g1 = 76;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f2414h = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f2415h0 = 25;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f2416h1 = 77;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f2417i = -2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f2418i0 = 26;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f2419i1 = 78;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f2420j = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f2421j0 = 27;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f2422j1 = 79;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f2423k = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f2424k0 = 28;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f2425k1 = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f2426l = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f2427l0 = 29;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f2428l1 = 81;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f2429m = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f2430m0 = 30;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f2431m1 = 82;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f2432n = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f2433n0 = 31;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f2434o = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f2435o0 = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f2436p = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f2437p0 = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2438q = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f2439q0 = 34;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f2440r = 4;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f2441r0 = 35;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f2442s = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f2443s0 = 36;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f2444t = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f2445t0 = 37;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f2446u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f2447u0 = 38;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f2448v = 3;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f2449v0 = 39;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f2450w = 4;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f2451w0 = 40;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f2452x = 5;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f2453x0 = 41;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f2454y = 6;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f2455y0 = 42;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f2456z = 7;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f2457z0 = 43;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f2459b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2460c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<Integer, a> f2461d = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0017d f2463b = new C0017d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f2464c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f2465d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f2466e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f2467f = new HashMap<>();

        public void h(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f2465d;
            layoutParams.f2267d = bVar.f2509h;
            layoutParams.f2269e = bVar.f2511i;
            layoutParams.f2271f = bVar.f2513j;
            layoutParams.f2273g = bVar.f2515k;
            layoutParams.f2275h = bVar.f2516l;
            layoutParams.f2277i = bVar.f2517m;
            layoutParams.f2279j = bVar.f2518n;
            layoutParams.f2281k = bVar.f2519o;
            layoutParams.f2283l = bVar.f2520p;
            layoutParams.f2291p = bVar.f2521q;
            layoutParams.f2292q = bVar.f2522r;
            layoutParams.f2293r = bVar.f2523s;
            layoutParams.f2294s = bVar.f2524t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.G;
            layoutParams.f2299x = bVar.O;
            layoutParams.f2300y = bVar.N;
            layoutParams.f2296u = bVar.K;
            layoutParams.f2298w = bVar.M;
            layoutParams.f2301z = bVar.f2525u;
            layoutParams.A = bVar.f2526v;
            layoutParams.f2285m = bVar.f2528x;
            layoutParams.f2287n = bVar.f2529y;
            layoutParams.f2289o = bVar.f2530z;
            layoutParams.B = bVar.f2527w;
            layoutParams.Q = bVar.A;
            layoutParams.R = bVar.B;
            layoutParams.F = bVar.P;
            layoutParams.E = bVar.Q;
            layoutParams.H = bVar.S;
            layoutParams.G = bVar.R;
            layoutParams.T = bVar.f2510h0;
            layoutParams.U = bVar.f2512i0;
            layoutParams.I = bVar.T;
            layoutParams.J = bVar.U;
            layoutParams.M = bVar.V;
            layoutParams.N = bVar.W;
            layoutParams.K = bVar.X;
            layoutParams.L = bVar.Y;
            layoutParams.O = bVar.Z;
            layoutParams.P = bVar.f2496a0;
            layoutParams.S = bVar.C;
            layoutParams.f2265c = bVar.f2507g;
            layoutParams.f2261a = bVar.f2503e;
            layoutParams.f2263b = bVar.f2505f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f2499c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f2501d;
            String str = bVar.f2508g0;
            if (str != null) {
                layoutParams.V = str;
            }
            layoutParams.setMarginStart(bVar.I);
            layoutParams.setMarginEnd(this.f2465d.H);
            layoutParams.e();
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2465d.a(this.f2465d);
            aVar.f2464c.a(this.f2464c);
            aVar.f2463b.a(this.f2463b);
            aVar.f2466e.a(this.f2466e);
            aVar.f2462a = this.f2462a;
            return aVar;
        }

        public final void j(int i4, ConstraintLayout.LayoutParams layoutParams) {
            this.f2462a = i4;
            b bVar = this.f2465d;
            bVar.f2509h = layoutParams.f2267d;
            bVar.f2511i = layoutParams.f2269e;
            bVar.f2513j = layoutParams.f2271f;
            bVar.f2515k = layoutParams.f2273g;
            bVar.f2516l = layoutParams.f2275h;
            bVar.f2517m = layoutParams.f2277i;
            bVar.f2518n = layoutParams.f2279j;
            bVar.f2519o = layoutParams.f2281k;
            bVar.f2520p = layoutParams.f2283l;
            bVar.f2521q = layoutParams.f2291p;
            bVar.f2522r = layoutParams.f2292q;
            bVar.f2523s = layoutParams.f2293r;
            bVar.f2524t = layoutParams.f2294s;
            bVar.f2525u = layoutParams.f2301z;
            bVar.f2526v = layoutParams.A;
            bVar.f2527w = layoutParams.B;
            bVar.f2528x = layoutParams.f2285m;
            bVar.f2529y = layoutParams.f2287n;
            bVar.f2530z = layoutParams.f2289o;
            bVar.A = layoutParams.Q;
            bVar.B = layoutParams.R;
            bVar.C = layoutParams.S;
            bVar.f2507g = layoutParams.f2265c;
            bVar.f2503e = layoutParams.f2261a;
            bVar.f2505f = layoutParams.f2263b;
            bVar.f2499c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f2501d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.P = layoutParams.F;
            bVar.Q = layoutParams.E;
            bVar.S = layoutParams.H;
            bVar.R = layoutParams.G;
            bVar.f2510h0 = layoutParams.T;
            bVar.f2512i0 = layoutParams.U;
            bVar.T = layoutParams.I;
            bVar.U = layoutParams.J;
            bVar.V = layoutParams.M;
            bVar.W = layoutParams.N;
            bVar.X = layoutParams.K;
            bVar.Y = layoutParams.L;
            bVar.Z = layoutParams.O;
            bVar.f2496a0 = layoutParams.P;
            bVar.f2508g0 = layoutParams.V;
            bVar.K = layoutParams.f2296u;
            bVar.M = layoutParams.f2298w;
            bVar.J = layoutParams.f2295t;
            bVar.L = layoutParams.f2297v;
            bVar.O = layoutParams.f2299x;
            bVar.N = layoutParams.f2300y;
            bVar.H = layoutParams.getMarginEnd();
            this.f2465d.I = layoutParams.getMarginStart();
        }

        public final void k(int i4, Constraints.LayoutParams layoutParams) {
            j(i4, layoutParams);
            this.f2463b.f2548d = layoutParams.H0;
            e eVar = this.f2466e;
            eVar.f2563b = layoutParams.K0;
            eVar.f2564c = layoutParams.L0;
            eVar.f2565d = layoutParams.M0;
            eVar.f2566e = layoutParams.N0;
            eVar.f2567f = layoutParams.O0;
            eVar.f2568g = layoutParams.P0;
            eVar.f2569h = layoutParams.Q0;
            eVar.f2570i = layoutParams.R0;
            eVar.f2571j = layoutParams.S0;
            eVar.f2572k = layoutParams.T0;
            eVar.f2574m = layoutParams.J0;
            eVar.f2573l = layoutParams.I0;
        }

        public final void l(ConstraintHelper constraintHelper, int i4, Constraints.LayoutParams layoutParams) {
            k(i4, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f2465d;
                bVar.f2502d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2498b0 = barrier.getType();
                this.f2465d.f2504e0 = barrier.getReferencedIds();
                this.f2465d.f2500c0 = barrier.getMargin();
            }
        }

        public final androidx.constraintlayout.widget.a m(String str, a.b bVar) {
            if (!this.f2467f.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, bVar);
                this.f2467f.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f2467f.get(str);
            if (aVar2.d() == bVar) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.d().name());
        }

        public final void n(String str, int i4) {
            m(str, a.b.COLOR_TYPE).j(i4);
        }

        public final void o(String str, float f4) {
            m(str, a.b.FLOAT_TYPE).k(f4);
        }

        public final void p(String str, int i4) {
            m(str, a.b.INT_TYPE).l(i4);
        }

        public final void q(String str, String str2) {
            m(str, a.b.STRING_TYPE).n(str2);
        }
    }

    public static class b {
        public static final int A0 = 15;
        public static final int B0 = 16;
        public static final int C0 = 17;
        public static final int D0 = 18;
        public static final int E0 = 19;
        public static final int F0 = 20;
        public static final int G0 = 21;
        public static final int H0 = 22;
        public static final int I0 = 23;
        public static final int J0 = 24;
        public static final int K0 = 25;
        public static final int L0 = 26;
        public static final int M0 = 27;
        public static final int N0 = 28;
        public static final int O0 = 29;
        public static final int P0 = 30;
        public static final int Q0 = 31;
        public static final int R0 = 32;
        public static final int S0 = 33;
        public static final int T0 = 34;
        public static final int U0 = 35;
        public static final int V0 = 36;
        public static final int W0 = 37;
        public static final int X0 = 38;
        public static final int Y0 = 39;
        public static final int Z0 = 40;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f2468a1 = 61;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public static final int f2469b1 = 62;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public static final int f2470c1 = 63;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final int f2471d1 = 69;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public static final int f2472e1 = 70;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public static final int f2473f1 = 71;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public static final int f2474g1 = 72;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public static final int f2475h1 = 73;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public static final int f2476i1 = 74;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public static final int f2477j1 = 75;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static final int f2478k0 = -1;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public static final int f2479k1 = 76;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static SparseIntArray f2480l0 = null;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final int f2481m0 = 1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final int f2482n0 = 2;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final int f2483o0 = 3;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f2484p0 = 4;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f2485q0 = 5;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f2486r0 = 6;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f2487s0 = 7;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f2488t0 = 8;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f2489u0 = 9;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public static final int f2490v0 = 10;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f2491w0 = 11;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f2492x0 = 12;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f2493y0 = 13;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f2494z0 = 14;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2501d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f2504e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f2506f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f2508g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2495a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2497b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2503e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2505f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2507g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2509h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2511i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2513j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2515k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2516l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2517m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2518n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2519o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2520p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2521q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2522r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2523s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2524t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f2525u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f2526v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f2527w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f2528x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f2529y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f2530z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f2496a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f2498b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f2500c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f2502d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f2510h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f2512i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f2514j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2480l0 = sparseIntArray;
            sparseIntArray.append(e.m.Bd, 24);
            f2480l0.append(e.m.Cd, 25);
            f2480l0.append(e.m.Ed, 28);
            f2480l0.append(e.m.Fd, 29);
            f2480l0.append(e.m.Kd, 35);
            f2480l0.append(e.m.Jd, 34);
            f2480l0.append(e.m.jd, 4);
            f2480l0.append(e.m.id, 3);
            f2480l0.append(e.m.gd, 1);
            f2480l0.append(e.m.Sd, 6);
            f2480l0.append(e.m.Td, 7);
            f2480l0.append(e.m.qd, 17);
            f2480l0.append(e.m.rd, 18);
            f2480l0.append(e.m.sd, 19);
            f2480l0.append(e.m.Oc, 26);
            f2480l0.append(e.m.Gd, 31);
            f2480l0.append(e.m.Hd, 32);
            f2480l0.append(e.m.pd, 10);
            f2480l0.append(e.m.od, 9);
            f2480l0.append(e.m.Wd, 13);
            f2480l0.append(e.m.Zd, 16);
            f2480l0.append(e.m.Xd, 14);
            f2480l0.append(e.m.Ud, 11);
            f2480l0.append(e.m.Yd, 15);
            f2480l0.append(e.m.Vd, 12);
            f2480l0.append(e.m.Nd, 38);
            f2480l0.append(e.m.zd, 37);
            f2480l0.append(e.m.yd, 39);
            f2480l0.append(e.m.Md, 40);
            f2480l0.append(e.m.xd, 20);
            f2480l0.append(e.m.Ld, 36);
            f2480l0.append(e.m.nd, 5);
            f2480l0.append(e.m.Ad, 76);
            f2480l0.append(e.m.Id, 76);
            f2480l0.append(e.m.Dd, 76);
            f2480l0.append(e.m.hd, 76);
            f2480l0.append(e.m.fd, 76);
            f2480l0.append(e.m.Rc, 23);
            f2480l0.append(e.m.Tc, 27);
            f2480l0.append(e.m.Vc, 30);
            f2480l0.append(e.m.Wc, 8);
            f2480l0.append(e.m.Sc, 33);
            f2480l0.append(e.m.Uc, 2);
            f2480l0.append(e.m.Pc, 22);
            f2480l0.append(e.m.Qc, 21);
            f2480l0.append(e.m.kd, 61);
            f2480l0.append(e.m.md, 62);
            f2480l0.append(e.m.ld, 63);
            f2480l0.append(e.m.Rd, 69);
            f2480l0.append(e.m.wd, 70);
            f2480l0.append(e.m.ad, 71);
            f2480l0.append(e.m.Yc, 72);
            f2480l0.append(e.m.Zc, 73);
            f2480l0.append(e.m.bd, 74);
            f2480l0.append(e.m.Xc, 75);
        }

        public void a(b bVar) {
            this.f2495a = bVar.f2495a;
            this.f2499c = bVar.f2499c;
            this.f2497b = bVar.f2497b;
            this.f2501d = bVar.f2501d;
            this.f2503e = bVar.f2503e;
            this.f2505f = bVar.f2505f;
            this.f2507g = bVar.f2507g;
            this.f2509h = bVar.f2509h;
            this.f2511i = bVar.f2511i;
            this.f2513j = bVar.f2513j;
            this.f2515k = bVar.f2515k;
            this.f2516l = bVar.f2516l;
            this.f2517m = bVar.f2517m;
            this.f2518n = bVar.f2518n;
            this.f2519o = bVar.f2519o;
            this.f2520p = bVar.f2520p;
            this.f2521q = bVar.f2521q;
            this.f2522r = bVar.f2522r;
            this.f2523s = bVar.f2523s;
            this.f2524t = bVar.f2524t;
            this.f2525u = bVar.f2525u;
            this.f2526v = bVar.f2526v;
            this.f2527w = bVar.f2527w;
            this.f2528x = bVar.f2528x;
            this.f2529y = bVar.f2529y;
            this.f2530z = bVar.f2530z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2496a0 = bVar.f2496a0;
            this.f2498b0 = bVar.f2498b0;
            this.f2500c0 = bVar.f2500c0;
            this.f2502d0 = bVar.f2502d0;
            this.f2508g0 = bVar.f2508g0;
            int[] iArr = bVar.f2504e0;
            if (iArr != null) {
                this.f2504e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2504e0 = null;
            }
            this.f2506f0 = bVar.f2506f0;
            this.f2510h0 = bVar.f2510h0;
            this.f2512i0 = bVar.f2512i0;
            this.f2514j0 = bVar.f2514j0;
        }

        public void b(androidx.constraintlayout.motion.widget.a aVar, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objM = aVar.M(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objM == null ? num : objM);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f4 = (Float) obj;
                            if (f4.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f4);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Nc);
            this.f2497b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = f2480l0.get(index);
                if (i5 == 80) {
                    this.f2510h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2510h0);
                } else if (i5 != 81) {
                    switch (i5) {
                        case 1:
                            this.f2520p = d.p0(typedArrayObtainStyledAttributes, index, this.f2520p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f2519o = d.p0(typedArrayObtainStyledAttributes, index, this.f2519o);
                            break;
                        case 4:
                            this.f2518n = d.p0(typedArrayObtainStyledAttributes, index, this.f2518n);
                            break;
                        case 5:
                            this.f2527w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f2524t = d.p0(typedArrayObtainStyledAttributes, index, this.f2524t);
                            break;
                        case 10:
                            this.f2523s = d.p0(typedArrayObtainStyledAttributes, index, this.f2523s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f2503e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2503e);
                            break;
                        case 18:
                            this.f2505f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2505f);
                            break;
                        case 19:
                            this.f2507g = typedArrayObtainStyledAttributes.getFloat(index, this.f2507g);
                            break;
                        case 20:
                            this.f2525u = typedArrayObtainStyledAttributes.getFloat(index, this.f2525u);
                            break;
                        case 21:
                            this.f2501d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2501d);
                            break;
                        case 22:
                            this.f2499c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2499c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f2509h = d.p0(typedArrayObtainStyledAttributes, index, this.f2509h);
                            break;
                        case 25:
                            this.f2511i = d.p0(typedArrayObtainStyledAttributes, index, this.f2511i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f2513j = d.p0(typedArrayObtainStyledAttributes, index, this.f2513j);
                            break;
                        case 29:
                            this.f2515k = d.p0(typedArrayObtainStyledAttributes, index, this.f2515k);
                            break;
                        case 30:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f2521q = d.p0(typedArrayObtainStyledAttributes, index, this.f2521q);
                            break;
                        case 32:
                            this.f2522r = d.p0(typedArrayObtainStyledAttributes, index, this.f2522r);
                            break;
                        case 33:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f2517m = d.p0(typedArrayObtainStyledAttributes, index, this.f2517m);
                            break;
                        case 35:
                            this.f2516l = d.p0(typedArrayObtainStyledAttributes, index, this.f2516l);
                            break;
                        case 36:
                            this.f2526v = typedArrayObtainStyledAttributes.getFloat(index, this.f2526v);
                            break;
                        case 37:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i5) {
                                case 54:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i5) {
                                        case 61:
                                            this.f2528x = d.p0(typedArrayObtainStyledAttributes, index, this.f2528x);
                                            break;
                                        case 62:
                                            this.f2529y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2529y);
                                            break;
                                        case 63:
                                            this.f2530z = typedArrayObtainStyledAttributes.getFloat(index, this.f2530z);
                                            break;
                                        default:
                                            switch (i5) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2496a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e(d.f2405e, "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2498b0 = typedArrayObtainStyledAttributes.getInt(index, this.f2498b0);
                                                    continue;
                                                case 73:
                                                    this.f2500c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2500c0);
                                                    continue;
                                                case 74:
                                                    this.f2506f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2514j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2514j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f2508g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f2480l0.get(index));
                                            Log.w(d.f2405e, sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f2512i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2512i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static SparseIntArray f2531h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f2532i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f2533j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f2534k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f2535l = 4;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f2536m = 5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f2537n = 6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2538a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2539b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2540c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2541d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2542e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2543f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2544g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2531h = sparseIntArray;
            sparseIntArray.append(e.m.vf, 1);
            f2531h.append(e.m.xf, 2);
            f2531h.append(e.m.yf, 3);
            f2531h.append(e.m.uf, 4);
            f2531h.append(e.m.tf, 5);
            f2531h.append(e.m.wf, 6);
        }

        public void a(c cVar) {
            this.f2538a = cVar.f2538a;
            this.f2539b = cVar.f2539b;
            this.f2540c = cVar.f2540c;
            this.f2541d = cVar.f2541d;
            this.f2542e = cVar.f2542e;
            this.f2544g = cVar.f2544g;
            this.f2543f = cVar.f2543f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.sf);
            this.f2538a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                switch (f2531h.get(index)) {
                    case 1:
                        this.f2544g = typedArrayObtainStyledAttributes.getFloat(index, this.f2544g);
                        break;
                    case 2:
                        this.f2541d = typedArrayObtainStyledAttributes.getInt(index, this.f2541d);
                        break;
                    case 3:
                        this.f2540c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : q.c.f10153k[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2542e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2539b = d.p0(typedArrayObtainStyledAttributes, index, this.f2539b);
                        break;
                    case 6:
                        this.f2543f = typedArrayObtainStyledAttributes.getFloat(index, this.f2543f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0017d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2545a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2546b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2547c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2548d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2549e = Float.NaN;

        public void a(C0017d c0017d) {
            this.f2545a = c0017d.f2545a;
            this.f2546b = c0017d.f2546b;
            this.f2548d = c0017d.f2548d;
            this.f2549e = c0017d.f2549e;
            this.f2547c = c0017d.f2547c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.mg);
            this.f2545a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.og) {
                    this.f2548d = typedArrayObtainStyledAttributes.getFloat(index, this.f2548d);
                } else if (index == e.m.ng) {
                    this.f2546b = typedArrayObtainStyledAttributes.getInt(index, this.f2546b);
                    this.f2546b = d.G[this.f2546b];
                } else if (index == e.m.rg) {
                    this.f2547c = typedArrayObtainStyledAttributes.getInt(index, this.f2547c);
                } else if (index == e.m.qg) {
                    this.f2549e = typedArrayObtainStyledAttributes.getFloat(index, this.f2549e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static SparseIntArray f2550n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f2551o = 1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f2552p = 2;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f2553q = 3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f2554r = 4;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f2555s = 5;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f2556t = 6;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f2557u = 7;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f2558v = 8;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f2559w = 9;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f2560x = 10;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f2561y = 11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2562a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2563b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2564c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2565d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2566e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2567f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2568g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2569h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f2570i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2571j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2572k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2573l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f2574m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2550n = sparseIntArray;
            sparseIntArray.append(e.m.zi, 1);
            f2550n.append(e.m.Ai, 2);
            f2550n.append(e.m.Bi, 3);
            f2550n.append(e.m.xi, 4);
            f2550n.append(e.m.yi, 5);
            f2550n.append(e.m.ti, 6);
            f2550n.append(e.m.ui, 7);
            f2550n.append(e.m.vi, 8);
            f2550n.append(e.m.wi, 9);
            f2550n.append(e.m.Ci, 10);
            f2550n.append(e.m.Di, 11);
        }

        public void a(e eVar) {
            this.f2562a = eVar.f2562a;
            this.f2563b = eVar.f2563b;
            this.f2564c = eVar.f2564c;
            this.f2565d = eVar.f2565d;
            this.f2566e = eVar.f2566e;
            this.f2567f = eVar.f2567f;
            this.f2568g = eVar.f2568g;
            this.f2569h = eVar.f2569h;
            this.f2570i = eVar.f2570i;
            this.f2571j = eVar.f2571j;
            this.f2572k = eVar.f2572k;
            this.f2573l = eVar.f2573l;
            this.f2574m = eVar.f2574m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.si);
            this.f2562a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                switch (f2550n.get(index)) {
                    case 1:
                        this.f2563b = typedArrayObtainStyledAttributes.getFloat(index, this.f2563b);
                        break;
                    case 2:
                        this.f2564c = typedArrayObtainStyledAttributes.getFloat(index, this.f2564c);
                        break;
                    case 3:
                        this.f2565d = typedArrayObtainStyledAttributes.getFloat(index, this.f2565d);
                        break;
                    case 4:
                        this.f2566e = typedArrayObtainStyledAttributes.getFloat(index, this.f2566e);
                        break;
                    case 5:
                        this.f2567f = typedArrayObtainStyledAttributes.getFloat(index, this.f2567f);
                        break;
                    case 6:
                        this.f2568g = typedArrayObtainStyledAttributes.getDimension(index, this.f2568g);
                        break;
                    case 7:
                        this.f2569h = typedArrayObtainStyledAttributes.getDimension(index, this.f2569h);
                        break;
                    case 8:
                        this.f2570i = typedArrayObtainStyledAttributes.getDimension(index, this.f2570i);
                        break;
                    case 9:
                        this.f2571j = typedArrayObtainStyledAttributes.getDimension(index, this.f2571j);
                        break;
                    case 10:
                        this.f2572k = typedArrayObtainStyledAttributes.getDimension(index, this.f2572k);
                        break;
                    case 11:
                        this.f2573l = true;
                        this.f2574m = typedArrayObtainStyledAttributes.getDimension(index, this.f2574m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.append(e.m.n5, 25);
        I.append(e.m.o5, 26);
        I.append(e.m.q5, 29);
        I.append(e.m.r5, 30);
        I.append(e.m.x5, 36);
        I.append(e.m.w5, 35);
        I.append(e.m.V4, 4);
        I.append(e.m.U4, 3);
        I.append(e.m.S4, 1);
        I.append(e.m.F5, 6);
        I.append(e.m.G5, 7);
        I.append(e.m.c5, 17);
        I.append(e.m.d5, 18);
        I.append(e.m.e5, 19);
        I.append(e.m.O3, 27);
        I.append(e.m.s5, 32);
        I.append(e.m.t5, 33);
        I.append(e.m.b5, 10);
        I.append(e.m.a5, 9);
        I.append(e.m.J5, 13);
        I.append(e.m.M5, 16);
        I.append(e.m.K5, 14);
        I.append(e.m.H5, 11);
        I.append(e.m.L5, 15);
        I.append(e.m.I5, 12);
        I.append(e.m.A5, 40);
        I.append(e.m.l5, 39);
        I.append(e.m.k5, 41);
        I.append(e.m.z5, 42);
        I.append(e.m.j5, 20);
        I.append(e.m.y5, 37);
        I.append(e.m.Z4, 5);
        I.append(e.m.m5, 82);
        I.append(e.m.v5, 82);
        I.append(e.m.p5, 82);
        I.append(e.m.T4, 82);
        I.append(e.m.R4, 82);
        I.append(e.m.T3, 24);
        I.append(e.m.V3, 28);
        I.append(e.m.l4, 31);
        I.append(e.m.m4, 8);
        I.append(e.m.U3, 34);
        I.append(e.m.W3, 2);
        I.append(e.m.R3, 23);
        I.append(e.m.S3, 21);
        I.append(e.m.Q3, 22);
        I.append(e.m.b4, 43);
        I.append(e.m.o4, 44);
        I.append(e.m.j4, 45);
        I.append(e.m.k4, 46);
        I.append(e.m.i4, 60);
        I.append(e.m.g4, 47);
        I.append(e.m.h4, 48);
        I.append(e.m.c4, 49);
        I.append(e.m.d4, 50);
        I.append(e.m.e4, 51);
        I.append(e.m.f4, 52);
        I.append(e.m.n4, 53);
        I.append(e.m.B5, 54);
        I.append(e.m.f5, 55);
        I.append(e.m.C5, 56);
        I.append(e.m.g5, 57);
        I.append(e.m.D5, 58);
        I.append(e.m.h5, 59);
        I.append(e.m.W4, 61);
        I.append(e.m.Y4, 62);
        I.append(e.m.X4, 63);
        I.append(e.m.p4, 64);
        I.append(e.m.R5, 65);
        I.append(e.m.w4, 66);
        I.append(e.m.S5, 67);
        I.append(e.m.O5, 79);
        I.append(e.m.P3, 38);
        I.append(e.m.N5, 68);
        I.append(e.m.E5, 69);
        I.append(e.m.i5, 70);
        I.append(e.m.t4, 71);
        I.append(e.m.r4, 72);
        I.append(e.m.s4, 73);
        I.append(e.m.u4, 74);
        I.append(e.m.q4, 75);
        I.append(e.m.P5, 76);
        I.append(e.m.u5, 77);
        I.append(e.m.T5, 78);
        I.append(e.m.Q4, 80);
        I.append(e.m.P4, 81);
    }

    public static String[] o1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < charArray.length; i5++) {
            char c4 = charArray[i5];
            if (c4 == ',' && !z3) {
                arrayList.add(new String(charArray, i4, i5 - i4));
                i4 = i5 + 1;
            } else if (c4 == '\"') {
                z3 = !z3;
            }
        }
        arrayList.add(new String(charArray, i4, charArray.length - i4));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int p0(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    public void A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2461d.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2460c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2461d.containsKey(Integer.valueOf(id))) {
                this.f2461d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2461d.get(Integer.valueOf(id));
            aVar.f2467f = androidx.constraintlayout.widget.a.c(this.f2459b, childAt);
            aVar.j(id, layoutParams);
            aVar.f2463b.f2546b = childAt.getVisibility();
            aVar.f2463b.f2548d = childAt.getAlpha();
            aVar.f2466e.f2563b = childAt.getRotation();
            aVar.f2466e.f2564c = childAt.getRotationX();
            aVar.f2466e.f2565d = childAt.getRotationY();
            aVar.f2466e.f2566e = childAt.getScaleX();
            aVar.f2466e.f2567f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f2466e;
                eVar.f2568g = pivotX;
                eVar.f2569h = pivotY;
            }
            aVar.f2466e.f2570i = childAt.getTranslationX();
            aVar.f2466e.f2571j = childAt.getTranslationY();
            aVar.f2466e.f2572k = childAt.getTranslationZ();
            e eVar2 = aVar.f2466e;
            if (eVar2.f2573l) {
                eVar2.f2574m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f2465d.f2514j0 = barrier.z();
                aVar.f2465d.f2504e0 = barrier.getReferencedIds();
                aVar.f2465d.f2498b0 = barrier.getType();
                aVar.f2465d.f2500c0 = barrier.getMargin();
            }
        }
    }

    public void A0(int i4, float f4) {
        b0(i4).f2463b.f2548d = f4;
    }

    public void B(d dVar) {
        this.f2461d.clear();
        for (Integer num : dVar.f2461d.keySet()) {
            this.f2461d.put(num, dVar.f2461d.get(num).clone());
        }
    }

    public void B0(int i4, boolean z3) {
        b0(i4).f2466e.f2573l = z3;
    }

    public void C(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2461d.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraints.getChildAt(i4);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2460c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2461d.containsKey(Integer.valueOf(id))) {
                this.f2461d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2461d.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                aVar.l((ConstraintHelper) childAt, id, layoutParams);
            }
            aVar.k(id, layoutParams);
        }
    }

    public void C0(int i4, int i5) {
        b0(i4).f2465d.f2502d0 = i5;
    }

    public void D(int i4, int i5, int i6, int i7) {
        b bVar;
        if (!this.f2461d.containsKey(Integer.valueOf(i4))) {
            this.f2461d.put(Integer.valueOf(i4), new a());
        }
        a aVar = this.f2461d.get(Integer.valueOf(i4));
        switch (i5) {
            case 1:
                if (i7 == 1) {
                    b bVar2 = aVar.f2465d;
                    bVar2.f2509h = i6;
                    bVar2.f2511i = -1;
                    return;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("left to " + n1(i7) + " undefined");
                    }
                    b bVar3 = aVar.f2465d;
                    bVar3.f2511i = i6;
                    bVar3.f2509h = -1;
                    return;
                }
            case 2:
                if (i7 == 1) {
                    b bVar4 = aVar.f2465d;
                    bVar4.f2513j = i6;
                    bVar4.f2515k = -1;
                    return;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar5 = aVar.f2465d;
                    bVar5.f2515k = i6;
                    bVar5.f2513j = -1;
                    return;
                }
            case 3:
                if (i7 == 3) {
                    bVar = aVar.f2465d;
                    bVar.f2516l = i6;
                    bVar.f2517m = -1;
                } else {
                    if (i7 != 4) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    bVar = aVar.f2465d;
                    bVar.f2517m = i6;
                    bVar.f2516l = -1;
                }
                break;
            case 4:
                if (i7 == 4) {
                    bVar = aVar.f2465d;
                    bVar.f2519o = i6;
                    bVar.f2518n = -1;
                } else {
                    if (i7 != 3) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    bVar = aVar.f2465d;
                    bVar.f2518n = i6;
                    bVar.f2519o = -1;
                }
                break;
            case 5:
                if (i7 != 5) {
                    throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                }
                b bVar6 = aVar.f2465d;
                bVar6.f2520p = i6;
                bVar6.f2519o = -1;
                bVar6.f2518n = -1;
                bVar6.f2516l = -1;
                bVar6.f2517m = -1;
                return;
            case 6:
                if (i7 == 6) {
                    b bVar7 = aVar.f2465d;
                    bVar7.f2522r = i6;
                    bVar7.f2521q = -1;
                    return;
                } else {
                    if (i7 != 7) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar8 = aVar.f2465d;
                    bVar8.f2521q = i6;
                    bVar8.f2522r = -1;
                    return;
                }
            case 7:
                if (i7 == 7) {
                    b bVar9 = aVar.f2465d;
                    bVar9.f2524t = i6;
                    bVar9.f2523s = -1;
                    return;
                } else {
                    if (i7 != 6) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar10 = aVar.f2465d;
                    bVar10.f2523s = i6;
                    bVar10.f2524t = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(n1(i5) + " to " + n1(i7) + " unknown");
        }
        bVar.f2520p = -1;
    }

    public void D0(int i4, String str, int i5) {
        b0(i4).n(str, i5);
    }

    public void E(int i4, int i5, int i6, int i7, int i8) {
        b bVar;
        b bVar2;
        if (!this.f2461d.containsKey(Integer.valueOf(i4))) {
            this.f2461d.put(Integer.valueOf(i4), new a());
        }
        a aVar = this.f2461d.get(Integer.valueOf(i4));
        switch (i5) {
            case 1:
                if (i7 == 1) {
                    b bVar3 = aVar.f2465d;
                    bVar3.f2509h = i6;
                    bVar3.f2511i = -1;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("Left to " + n1(i7) + " undefined");
                    }
                    b bVar4 = aVar.f2465d;
                    bVar4.f2511i = i6;
                    bVar4.f2509h = -1;
                }
                aVar.f2465d.D = i8;
                return;
            case 2:
                if (i7 == 1) {
                    b bVar5 = aVar.f2465d;
                    bVar5.f2513j = i6;
                    bVar5.f2515k = -1;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar6 = aVar.f2465d;
                    bVar6.f2515k = i6;
                    bVar6.f2513j = -1;
                }
                aVar.f2465d.E = i8;
                return;
            case 3:
                if (i7 == 3) {
                    bVar = aVar.f2465d;
                    bVar.f2516l = i6;
                    bVar.f2517m = -1;
                } else {
                    if (i7 != 4) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    bVar = aVar.f2465d;
                    bVar.f2517m = i6;
                    bVar.f2516l = -1;
                }
                bVar.f2520p = -1;
                aVar.f2465d.F = i8;
                return;
            case 4:
                if (i7 == 4) {
                    bVar2 = aVar.f2465d;
                    bVar2.f2519o = i6;
                    bVar2.f2518n = -1;
                } else {
                    if (i7 != 3) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    bVar2 = aVar.f2465d;
                    bVar2.f2518n = i6;
                    bVar2.f2519o = -1;
                }
                bVar2.f2520p = -1;
                aVar.f2465d.G = i8;
                return;
            case 5:
                if (i7 != 5) {
                    throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                }
                b bVar7 = aVar.f2465d;
                bVar7.f2520p = i6;
                bVar7.f2519o = -1;
                bVar7.f2518n = -1;
                bVar7.f2516l = -1;
                bVar7.f2517m = -1;
                return;
            case 6:
                if (i7 == 6) {
                    b bVar8 = aVar.f2465d;
                    bVar8.f2522r = i6;
                    bVar8.f2521q = -1;
                } else {
                    if (i7 != 7) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar9 = aVar.f2465d;
                    bVar9.f2521q = i6;
                    bVar9.f2522r = -1;
                }
                aVar.f2465d.I = i8;
                return;
            case 7:
                if (i7 == 7) {
                    b bVar10 = aVar.f2465d;
                    bVar10.f2524t = i6;
                    bVar10.f2523s = -1;
                } else {
                    if (i7 != 6) {
                        throw new IllegalArgumentException("right to " + n1(i7) + " undefined");
                    }
                    b bVar11 = aVar.f2465d;
                    bVar11.f2523s = i6;
                    bVar11.f2524t = -1;
                }
                aVar.f2465d.H = i8;
                return;
            default:
                throw new IllegalArgumentException(n1(i5) + " to " + n1(i7) + " unknown");
        }
    }

    public void E0(int i4, String str) {
        b0(i4).f2465d.f2527w = str;
    }

    public void F(int i4, int i5, int i6, float f4) {
        b bVar = b0(i4).f2465d;
        bVar.f2528x = i5;
        bVar.f2529y = i6;
        bVar.f2530z = f4;
    }

    public void F0(int i4, int i5) {
        b0(i4).f2465d.A = i5;
    }

    public void G(int i4, int i5) {
        b0(i4).f2465d.U = i5;
    }

    public void G0(int i4, int i5) {
        b0(i4).f2465d.B = i5;
    }

    public void H(int i4, int i5) {
        b0(i4).f2465d.T = i5;
    }

    public void H0(int i4, float f4) {
        b0(i4).f2466e.f2574m = f4;
        b0(i4).f2466e.f2573l = true;
    }

    public void I(int i4, int i5) {
        b0(i4).f2465d.f2501d = i5;
    }

    public void I0(int i4, String str, float f4) {
        b0(i4).o(str, f4);
    }

    public void J(int i4, int i5) {
        b0(i4).f2465d.W = i5;
    }

    public void J0(boolean z3) {
        this.f2460c = z3;
    }

    public void K(int i4, int i5) {
        b0(i4).f2465d.V = i5;
    }

    public void K0(int i4, int i5, int i6) {
        a aVarB0 = b0(i4);
        switch (i5) {
            case 1:
                aVarB0.f2465d.J = i6;
                return;
            case 2:
                aVarB0.f2465d.L = i6;
                return;
            case 3:
                aVarB0.f2465d.K = i6;
                return;
            case 4:
                aVarB0.f2465d.M = i6;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                aVarB0.f2465d.O = i6;
                return;
            case 7:
                aVarB0.f2465d.N = i6;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void L(int i4, int i5) {
        b0(i4).f2465d.Y = i5;
    }

    public void L0(int i4, int i5) {
        b0(i4).f2465d.f2503e = i5;
        b0(i4).f2465d.f2505f = -1;
        b0(i4).f2465d.f2507g = -1.0f;
    }

    public void M(int i4, int i5) {
        b0(i4).f2465d.X = i5;
    }

    public void M0(int i4, int i5) {
        b0(i4).f2465d.f2505f = i5;
        b0(i4).f2465d.f2503e = -1;
        b0(i4).f2465d.f2507g = -1.0f;
    }

    public void N(int i4, float f4) {
        b0(i4).f2465d.f2496a0 = f4;
    }

    public void N0(int i4, float f4) {
        b0(i4).f2465d.f2507g = f4;
        b0(i4).f2465d.f2505f = -1;
        b0(i4).f2465d.f2503e = -1;
    }

    public void O(int i4, float f4) {
        b0(i4).f2465d.Z = f4;
    }

    public void O0(int i4, float f4) {
        b0(i4).f2465d.f2525u = f4;
    }

    public void P(int i4, int i5) {
        b0(i4).f2465d.f2499c = i5;
    }

    public void P0(int i4, int i5) {
        b0(i4).f2465d.R = i5;
    }

    public void Q(int i4, boolean z3) {
        b0(i4).f2465d.f2512i0 = z3;
    }

    public void Q0(int i4, float f4) {
        b0(i4).f2465d.Q = f4;
    }

    public void R(int i4, boolean z3) {
        b0(i4).f2465d.f2510h0 = z3;
    }

    public void R0(int i4, String str, int i5) {
        b0(i4).p(str, i5);
    }

    public final int[] S(View view, String str) {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            try {
                iIntValue = e.g.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, j2.a.f8286f, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i5] = iIntValue;
            i4++;
            i5++;
        }
        return i5 != strArrSplit.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public void S0(int i4, int i5, int i6) {
        a aVarB0 = b0(i4);
        switch (i5) {
            case 1:
                aVarB0.f2465d.D = i6;
                return;
            case 2:
                aVarB0.f2465d.E = i6;
                return;
            case 3:
                aVarB0.f2465d.F = i6;
                return;
            case 4:
                aVarB0.f2465d.G = i6;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                aVarB0.f2465d.I = i6;
                return;
            case 7:
                aVarB0.f2465d.H = i6;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void T(int i4, int i5) {
        b bVar = b0(i4).f2465d;
        bVar.f2495a = true;
        bVar.C = i5;
    }

    public void T0(int i4, int... iArr) {
        b0(i4).f2465d.f2504e0 = iArr;
    }

    public void U(int i4, int i5, int i6, int... iArr) {
        b bVar = b0(i4).f2465d;
        bVar.f2502d0 = 1;
        bVar.f2498b0 = i5;
        bVar.f2500c0 = i6;
        bVar.f2495a = false;
        bVar.f2504e0 = iArr;
    }

    public void U0(int i4, float f4) {
        b0(i4).f2466e.f2563b = f4;
    }

    public void V(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        W(i4, i5, i6, i7, iArr, fArr, i8, 1, 2);
    }

    public void V0(int i4, float f4) {
        b0(i4).f2466e.f2564c = f4;
    }

    public final void W(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8, int i9, int i10) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            b0(iArr[0]).f2465d.Q = fArr[0];
        }
        b0(iArr[0]).f2465d.R = i8;
        E(iArr[0], i9, i4, i5, -1);
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = i11 - 1;
            E(iArr[i11], i9, iArr[i12], i10, -1);
            E(iArr[i12], i10, iArr[i11], i9, -1);
            if (fArr != null) {
                b0(iArr[i11]).f2465d.Q = fArr[i11];
            }
        }
        E(iArr[iArr.length - 1], i10, i6, i7, -1);
    }

    public void W0(int i4, float f4) {
        b0(i4).f2466e.f2565d = f4;
    }

    public void X(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        W(i4, i5, i6, i7, iArr, fArr, i8, 6, 7);
    }

    public void X0(int i4, float f4) {
        b0(i4).f2466e.f2566e = f4;
    }

    public void Y(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            b0(iArr[0]).f2465d.P = fArr[0];
        }
        b0(iArr[0]).f2465d.S = i8;
        E(iArr[0], 3, i4, i5, 0);
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = i9 - 1;
            E(iArr[i9], 3, iArr[i10], 4, 0);
            E(iArr[i10], 4, iArr[i9], 3, 0);
            if (fArr != null) {
                b0(iArr[i9]).f2465d.P = fArr[i9];
            }
        }
        E(iArr[iArr.length - 1], 4, i6, i7, 0);
    }

    public void Y0(int i4, float f4) {
        b0(i4).f2466e.f2567f = f4;
    }

    public void Z(androidx.constraintlayout.motion.widget.a aVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f2461d.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i4 : iArr) {
                hashSet.add(Integer.valueOf(i4));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar2 = this.f2461d.get(num);
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            aVar2.f2465d.b(aVar, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public void Z0(int i4, String str, String str2) {
        b0(i4).q(str, str2);
    }

    public final a a0(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.N3);
        u0(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void a1(int i4, float f4, float f5) {
        e eVar = b0(i4).f2466e;
        eVar.f2569h = f5;
        eVar.f2568g = f4;
    }

    public final a b0(int i4) {
        if (!this.f2461d.containsKey(Integer.valueOf(i4))) {
            this.f2461d.put(Integer.valueOf(i4), new a());
        }
        return this.f2461d.get(Integer.valueOf(i4));
    }

    public void b1(int i4, float f4) {
        b0(i4).f2466e.f2568g = f4;
    }

    public final void c(a.b bVar, String... strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (this.f2459b.containsKey(strArr[i4])) {
                androidx.constraintlayout.widget.a aVar = this.f2459b.get(strArr[i4]);
                if (aVar.d() != bVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.d().name());
                }
            } else {
                this.f2459b.put(strArr[i4], new androidx.constraintlayout.widget.a(strArr[i4], bVar));
            }
        }
    }

    public boolean c0(int i4) {
        return b0(i4).f2466e.f2573l;
    }

    public void c1(int i4, float f4) {
        b0(i4).f2466e.f2569h = f4;
    }

    public void d(String... strArr) {
        c(a.b.COLOR_TYPE, strArr);
    }

    public a d0(int i4) {
        if (this.f2461d.containsKey(Integer.valueOf(i4))) {
            return this.f2461d.get(Integer.valueOf(i4));
        }
        return null;
    }

    public void d1(int i4, float f4, float f5) {
        e eVar = b0(i4).f2466e;
        eVar.f2570i = f4;
        eVar.f2571j = f5;
    }

    public void e(String... strArr) {
        c(a.b.FLOAT_TYPE, strArr);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> e0() {
        return this.f2459b;
    }

    public void e1(int i4, float f4) {
        b0(i4).f2466e.f2570i = f4;
    }

    public void f(String... strArr) {
        c(a.b.INT_TYPE, strArr);
    }

    public int f0(int i4) {
        return b0(i4).f2465d.f2501d;
    }

    public void f1(int i4, float f4) {
        b0(i4).f2466e.f2571j = f4;
    }

    public void g(String... strArr) {
        c(a.b.STRING_TYPE, strArr);
    }

    public int[] g0() {
        Integer[] numArr = (Integer[]) this.f2461d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    public void g1(int i4, float f4) {
        b0(i4).f2466e.f2572k = f4;
    }

    public void h(int i4, int i5, int i6) {
        E(i4, 1, i5, i5 == 0 ? 1 : 2, 0);
        E(i4, 2, i6, i6 == 0 ? 2 : 1, 0);
        if (i5 != 0) {
            E(i5, 2, i4, 1, 0);
        }
        if (i6 != 0) {
            E(i6, 1, i4, 2, 0);
        }
    }

    public a h0(int i4) {
        return b0(i4);
    }

    public void h1(boolean z3) {
        this.f2458a = z3;
    }

    public void i(int i4, int i5, int i6) {
        E(i4, 6, i5, i5 == 0 ? 6 : 7, 0);
        E(i4, 7, i6, i6 == 0 ? 7 : 6, 0);
        if (i5 != 0) {
            E(i5, 7, i4, 6, 0);
        }
        if (i6 != 0) {
            E(i6, 6, i4, 7, 0);
        }
    }

    public int[] i0(int i4) {
        int[] iArr = b0(i4).f2465d.f2504e0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void i1(int i4, float f4) {
        b0(i4).f2465d.f2526v = f4;
    }

    public void j(int i4, int i5, int i6) {
        E(i4, 3, i5, i5 == 0 ? 3 : 4, 0);
        E(i4, 4, i6, i6 == 0 ? 4 : 3, 0);
        if (i5 != 0) {
            E(i5, 4, i4, 3, 0);
        }
        if (i6 != 0) {
            E(i6, 3, i4, 4, 0);
        }
    }

    public int j0(int i4) {
        return b0(i4).f2463b.f2546b;
    }

    public void j1(int i4, int i5) {
        b0(i4).f2465d.S = i5;
    }

    public void k(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f2461d.containsKey(Integer.valueOf(id))) {
                Log.v(f2405e, "id unknown " + r.c.k(childAt));
            } else {
                if (this.f2460c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f2461d.containsKey(Integer.valueOf(id))) {
                    androidx.constraintlayout.widget.a.i(childAt, this.f2461d.get(Integer.valueOf(id)).f2467f);
                }
            }
        }
    }

    public int k0(int i4) {
        return b0(i4).f2463b.f2547c;
    }

    public void k1(int i4, float f4) {
        b0(i4).f2465d.P = f4;
    }

    public void l(ConstraintLayout constraintLayout) {
        n(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int l0(int i4) {
        return b0(i4).f2465d.f2499c;
    }

    public void l1(int i4, int i5) {
        b0(i4).f2463b.f2546b = i5;
    }

    public void m(ConstraintHelper constraintHelper, v.e eVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<v.e> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f2461d.containsKey(Integer.valueOf(id))) {
            a aVar = this.f2461d.get(Integer.valueOf(id));
            if (eVar instanceof j) {
                constraintHelper.p(aVar, (j) eVar, layoutParams, sparseArray);
            }
        }
    }

    public boolean m0() {
        return this.f2460c;
    }

    public void m1(int i4, int i5) {
        b0(i4).f2463b.f2547c = i5;
    }

    public void n(ConstraintLayout constraintLayout, boolean z3) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f2461d.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f2461d.containsKey(Integer.valueOf(id))) {
                Log.w(f2405e, "id unknown " + r.c.k(childAt));
            } else {
                if (this.f2460c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f2461d.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f2461d.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f2465d.f2502d0 = 1;
                        }
                        int i5 = aVar.f2465d.f2502d0;
                        if (i5 != -1 && i5 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2465d.f2498b0);
                            barrier.setMargin(aVar.f2465d.f2500c0);
                            barrier.setAllowsGoneWidget(aVar.f2465d.f2514j0);
                            b bVar = aVar.f2465d;
                            int[] iArr = bVar.f2504e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2506f0;
                                if (str != null) {
                                    bVar.f2504e0 = S(barrier, str);
                                    barrier.setReferencedIds(aVar.f2465d.f2504e0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.e();
                        aVar.h(layoutParams);
                        if (z3) {
                            androidx.constraintlayout.widget.a.i(childAt, aVar.f2467f);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0017d c0017d = aVar.f2463b;
                        if (c0017d.f2547c == 0) {
                            childAt.setVisibility(c0017d.f2546b);
                        }
                        childAt.setAlpha(aVar.f2463b.f2548d);
                        childAt.setRotation(aVar.f2466e.f2563b);
                        childAt.setRotationX(aVar.f2466e.f2564c);
                        childAt.setRotationY(aVar.f2466e.f2565d);
                        childAt.setScaleX(aVar.f2466e.f2566e);
                        childAt.setScaleY(aVar.f2466e.f2567f);
                        if (!Float.isNaN(aVar.f2466e.f2568g)) {
                            childAt.setPivotX(aVar.f2466e.f2568g);
                        }
                        if (!Float.isNaN(aVar.f2466e.f2569h)) {
                            childAt.setPivotY(aVar.f2466e.f2569h);
                        }
                        childAt.setTranslationX(aVar.f2466e.f2570i);
                        childAt.setTranslationY(aVar.f2466e.f2571j);
                        childAt.setTranslationZ(aVar.f2466e.f2572k);
                        e eVar = aVar.f2466e;
                        if (eVar.f2573l) {
                            childAt.setElevation(eVar.f2574m);
                        }
                    } else {
                        Log.v(f2405e, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f2461d.get(num);
            int i6 = aVar2.f2465d.f2502d0;
            if (i6 != -1 && i6 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f2465d;
                int[] iArr2 = bVar2.f2504e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2506f0;
                    if (str2 != null) {
                        bVar2.f2504e0 = S(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2465d.f2504e0);
                    }
                }
                barrier2.setType(aVar2.f2465d.f2498b0);
                barrier2.setMargin(aVar2.f2465d.f2500c0);
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.y();
                aVar2.h(layoutParamsGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
            }
            if (aVar2.f2465d.f2495a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.h(layoutParamsGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
            }
        }
    }

    public void n0(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarA0 = a0(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarA0.f2465d.f2495a = true;
                    }
                    this.f2461d.put(Integer.valueOf(aVarA0.f2462a), aVarA0);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public final String n1(int i4) {
        switch (i4) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void o(int i4, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f2461d.containsKey(Integer.valueOf(i4))) {
            this.f2461d.get(Integer.valueOf(i4)).h(layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o0(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.o0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void p(ConstraintLayout constraintLayout) {
        n(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void q(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        d dVar;
        int i11;
        int i12;
        if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f4 <= 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i6 == 1 || i6 == 2) {
            dVar = this;
            i11 = i4;
            dVar.E(i11, 1, i5, i6, i7);
            i12 = 2;
        } else if (i6 != 6 && i6 != 7) {
            E(i4, 3, i5, i6, i7);
            E(i4, 4, i8, i9, i10);
            this.f2461d.get(Integer.valueOf(i4)).f2465d.f2526v = f4;
            return;
        } else {
            dVar = this;
            i11 = i4;
            dVar.E(i11, 6, i5, i6, i7);
            i12 = 7;
        }
        dVar.E(i11, i12, i8, i9, i10);
        this.f2461d.get(Integer.valueOf(i4)).f2465d.f2525u = f4;
    }

    public void q0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            String[] strArrSplit2 = strArrSplit[i4].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2405e, " Unable to parse " + strArrSplit[i4]);
            } else {
                aVar.n(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void r(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        d dVar;
        int i10;
        int i11;
        int i12;
        if (i5 == 0) {
            i11 = 0;
            i6 = 1;
            i7 = 0;
            i12 = 0;
            i8 = 2;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
        } else {
            i6 = 2;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
            i11 = i5;
            i12 = i5;
        }
        dVar.q(i10, i11, i6, i7, i12, i8, i9, f4);
    }

    public void r0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            String[] strArrSplit2 = strArrSplit[i4].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2405e, " Unable to parse " + strArrSplit[i4]);
            } else {
                aVar.o(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void s(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        E(i4, 1, i5, i6, i7);
        E(i4, 2, i8, i9, i10);
        this.f2461d.get(Integer.valueOf(i4)).f2465d.f2525u = f4;
    }

    public void s0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            String[] strArrSplit2 = strArrSplit[i4].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2405e, " Unable to parse " + strArrSplit[i4]);
            } else {
                aVar.o(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void t(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        d dVar;
        int i10;
        int i11;
        int i12;
        if (i5 == 0) {
            i11 = 0;
            i6 = 6;
            i7 = 0;
            i12 = 0;
            i8 = 7;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
        } else {
            i6 = 7;
            i7 = 0;
            i8 = 6;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
            i11 = i5;
            i12 = i5;
        }
        dVar.q(i10, i11, i6, i7, i12, i8, i9, f4);
    }

    public void t0(a aVar, String str) {
        String[] strArrO1 = o1(str);
        for (int i4 = 0; i4 < strArrO1.length; i4++) {
            String[] strArrSplit = strArrO1[i4].split("=");
            Log.w(f2405e, " Unable to parse " + strArrO1[i4]);
            aVar.q(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void u(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        E(i4, 6, i5, i6, i7);
        E(i4, 7, i8, i9, i10);
        this.f2461d.get(Integer.valueOf(i4)).f2465d.f2525u = f4;
    }

    public final void u0(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index != e.m.P3 && e.m.l4 != index && e.m.m4 != index) {
                aVar.f2464c.f2538a = true;
                aVar.f2465d.f2497b = true;
                aVar.f2463b.f2545a = true;
                aVar.f2466e.f2562a = true;
            }
            switch (I.get(index)) {
                case 1:
                    b bVar = aVar.f2465d;
                    bVar.f2520p = p0(typedArray, index, bVar.f2520p);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f2465d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f2465d;
                    bVar3.f2519o = p0(typedArray, index, bVar3.f2519o);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f2465d;
                    bVar4.f2518n = p0(typedArray, index, bVar4.f2518n);
                    continue;
                    break;
                case 5:
                    aVar.f2465d.f2527w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f2465d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f2465d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                    break;
                case 8:
                    b bVar7 = aVar.f2465d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                    break;
                case 9:
                    b bVar8 = aVar.f2465d;
                    bVar8.f2524t = p0(typedArray, index, bVar8.f2524t);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f2465d;
                    bVar9.f2523s = p0(typedArray, index, bVar9.f2523s);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.f2465d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f2465d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f2465d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f2465d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f2465d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f2465d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f2465d;
                    bVar16.f2503e = typedArray.getDimensionPixelOffset(index, bVar16.f2503e);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f2465d;
                    bVar17.f2505f = typedArray.getDimensionPixelOffset(index, bVar17.f2505f);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f2465d;
                    bVar18.f2507g = typedArray.getFloat(index, bVar18.f2507g);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f2465d;
                    bVar19.f2525u = typedArray.getFloat(index, bVar19.f2525u);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f2465d;
                    bVar20.f2501d = typedArray.getLayoutDimension(index, bVar20.f2501d);
                    continue;
                    break;
                case 22:
                    C0017d c0017d = aVar.f2463b;
                    c0017d.f2546b = typedArray.getInt(index, c0017d.f2546b);
                    C0017d c0017d2 = aVar.f2463b;
                    c0017d2.f2546b = G[c0017d2.f2546b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f2465d;
                    bVar21.f2499c = typedArray.getLayoutDimension(index, bVar21.f2499c);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.f2465d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f2465d;
                    bVar23.f2509h = p0(typedArray, index, bVar23.f2509h);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f2465d;
                    bVar24.f2511i = p0(typedArray, index, bVar24.f2511i);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f2465d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f2465d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f2465d;
                    bVar27.f2513j = p0(typedArray, index, bVar27.f2513j);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f2465d;
                    bVar28.f2515k = p0(typedArray, index, bVar28.f2515k);
                    continue;
                    break;
                case 31:
                    b bVar29 = aVar.f2465d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                    break;
                case 32:
                    b bVar30 = aVar.f2465d;
                    bVar30.f2521q = p0(typedArray, index, bVar30.f2521q);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f2465d;
                    bVar31.f2522r = p0(typedArray, index, bVar31.f2522r);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f2465d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f2465d;
                    bVar33.f2517m = p0(typedArray, index, bVar33.f2517m);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f2465d;
                    bVar34.f2516l = p0(typedArray, index, bVar34.f2516l);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f2465d;
                    bVar35.f2526v = typedArray.getFloat(index, bVar35.f2526v);
                    continue;
                    break;
                case 38:
                    aVar.f2462a = typedArray.getResourceId(index, aVar.f2462a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f2465d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f2465d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f2465d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f2465d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                    break;
                case 43:
                    C0017d c0017d3 = aVar.f2463b;
                    c0017d3.f2548d = typedArray.getFloat(index, c0017d3.f2548d);
                    continue;
                    break;
                case 44:
                    e eVar = aVar.f2466e;
                    eVar.f2573l = true;
                    eVar.f2574m = typedArray.getDimension(index, eVar.f2574m);
                    continue;
                    break;
                case 45:
                    e eVar2 = aVar.f2466e;
                    eVar2.f2564c = typedArray.getFloat(index, eVar2.f2564c);
                    continue;
                    break;
                case 46:
                    e eVar3 = aVar.f2466e;
                    eVar3.f2565d = typedArray.getFloat(index, eVar3.f2565d);
                    continue;
                    break;
                case 47:
                    e eVar4 = aVar.f2466e;
                    eVar4.f2566e = typedArray.getFloat(index, eVar4.f2566e);
                    continue;
                    break;
                case 48:
                    e eVar5 = aVar.f2466e;
                    eVar5.f2567f = typedArray.getFloat(index, eVar5.f2567f);
                    continue;
                    break;
                case 49:
                    e eVar6 = aVar.f2466e;
                    eVar6.f2568g = typedArray.getDimension(index, eVar6.f2568g);
                    continue;
                    break;
                case 50:
                    e eVar7 = aVar.f2466e;
                    eVar7.f2569h = typedArray.getDimension(index, eVar7.f2569h);
                    continue;
                    break;
                case 51:
                    e eVar8 = aVar.f2466e;
                    eVar8.f2570i = typedArray.getDimension(index, eVar8.f2570i);
                    continue;
                    break;
                case 52:
                    e eVar9 = aVar.f2466e;
                    eVar9.f2571j = typedArray.getDimension(index, eVar9.f2571j);
                    continue;
                    break;
                case 53:
                    e eVar10 = aVar.f2466e;
                    eVar10.f2572k = typedArray.getDimension(index, eVar10.f2572k);
                    continue;
                    break;
                case 54:
                    b bVar40 = aVar.f2465d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f2465d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f2465d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f2465d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f2465d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f2465d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                    break;
                case 60:
                    e eVar11 = aVar.f2466e;
                    eVar11.f2563b = typedArray.getFloat(index, eVar11.f2563b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f2465d;
                    bVar46.f2528x = p0(typedArray, index, bVar46.f2528x);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f2465d;
                    bVar47.f2529y = typedArray.getDimensionPixelSize(index, bVar47.f2529y);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f2465d;
                    bVar48.f2530z = typedArray.getFloat(index, bVar48.f2530z);
                    continue;
                    break;
                case 64:
                    c cVar2 = aVar.f2464c;
                    cVar2.f2539b = p0(typedArray, index, cVar2.f2539b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f2464c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f2464c;
                        string = q.c.f10153k[typedArray.getInteger(index, 0)];
                    }
                    cVar.f2540c = string;
                    continue;
                    break;
                case 66:
                    aVar.f2464c.f2542e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar3 = aVar.f2464c;
                    cVar3.f2544g = typedArray.getFloat(index, cVar3.f2544g);
                    continue;
                    break;
                case 68:
                    C0017d c0017d4 = aVar.f2463b;
                    c0017d4.f2549e = typedArray.getFloat(index, c0017d4.f2549e);
                    continue;
                    break;
                case 69:
                    aVar.f2465d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f2465d.f2496a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e(f2405e, "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f2465d;
                    bVar49.f2498b0 = typedArray.getInt(index, bVar49.f2498b0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f2465d;
                    bVar50.f2500c0 = typedArray.getDimensionPixelSize(index, bVar50.f2500c0);
                    continue;
                    break;
                case 74:
                    aVar.f2465d.f2506f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f2465d;
                    bVar51.f2514j0 = typedArray.getBoolean(index, bVar51.f2514j0);
                    continue;
                    break;
                case 76:
                    c cVar4 = aVar.f2464c;
                    cVar4.f2541d = typedArray.getInt(index, cVar4.f2541d);
                    continue;
                    break;
                case 77:
                    aVar.f2465d.f2508g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    C0017d c0017d5 = aVar.f2463b;
                    c0017d5.f2547c = typedArray.getInt(index, c0017d5.f2547c);
                    continue;
                    break;
                case 79:
                    c cVar5 = aVar.f2464c;
                    cVar5.f2543f = typedArray.getFloat(index, cVar5.f2543f);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f2465d;
                    bVar52.f2510h0 = typedArray.getBoolean(index, bVar52.f2510h0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f2465d;
                    bVar53.f2512i0 = typedArray.getBoolean(index, bVar53.f2512i0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(I.get(index));
            Log.w(f2405e, sb.toString());
        }
    }

    public void v(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        d dVar;
        int i10;
        int i11;
        int i12;
        if (i5 == 0) {
            i11 = 0;
            i6 = 3;
            i7 = 0;
            i12 = 0;
            i8 = 4;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
        } else {
            i6 = 4;
            i7 = 0;
            i8 = 3;
            i9 = 0;
            f4 = 0.5f;
            dVar = this;
            i10 = i4;
            i11 = i5;
            i12 = i5;
        }
        dVar.q(i10, i11, i6, i7, i12, i8, i9, f4);
    }

    public void v0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2460c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2461d.containsKey(Integer.valueOf(id))) {
                this.f2461d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2461d.get(Integer.valueOf(id));
            if (!aVar.f2465d.f2497b) {
                aVar.j(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                    aVar.f2465d.f2504e0 = ((ConstraintHelper) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f2465d.f2514j0 = barrier.z();
                        aVar.f2465d.f2498b0 = barrier.getType();
                        aVar.f2465d.f2500c0 = barrier.getMargin();
                    }
                }
                aVar.f2465d.f2497b = true;
            }
            C0017d c0017d = aVar.f2463b;
            if (!c0017d.f2545a) {
                c0017d.f2546b = childAt.getVisibility();
                aVar.f2463b.f2548d = childAt.getAlpha();
                aVar.f2463b.f2545a = true;
            }
            e eVar = aVar.f2466e;
            if (!eVar.f2562a) {
                eVar.f2562a = true;
                eVar.f2563b = childAt.getRotation();
                aVar.f2466e.f2564c = childAt.getRotationX();
                aVar.f2466e.f2565d = childAt.getRotationY();
                aVar.f2466e.f2566e = childAt.getScaleX();
                aVar.f2466e.f2567f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar2 = aVar.f2466e;
                    eVar2.f2568g = pivotX;
                    eVar2.f2569h = pivotY;
                }
                aVar.f2466e.f2570i = childAt.getTranslationX();
                aVar.f2466e.f2571j = childAt.getTranslationY();
                aVar.f2466e.f2572k = childAt.getTranslationZ();
                e eVar3 = aVar.f2466e;
                if (eVar3.f2573l) {
                    eVar3.f2574m = childAt.getElevation();
                }
            }
        }
    }

    public void w(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        E(i4, 3, i5, i6, i7);
        E(i4, 4, i8, i9, i10);
        this.f2461d.get(Integer.valueOf(i4)).f2465d.f2526v = f4;
    }

    public void w0(d dVar) {
        for (Integer num : dVar.f2461d.keySet()) {
            int iIntValue = num.intValue();
            a aVar = dVar.f2461d.get(num);
            if (!this.f2461d.containsKey(Integer.valueOf(iIntValue))) {
                this.f2461d.put(Integer.valueOf(iIntValue), new a());
            }
            a aVar2 = this.f2461d.get(Integer.valueOf(iIntValue));
            b bVar = aVar2.f2465d;
            if (!bVar.f2497b) {
                bVar.a(aVar.f2465d);
            }
            C0017d c0017d = aVar2.f2463b;
            if (!c0017d.f2545a) {
                c0017d.a(aVar.f2463b);
            }
            e eVar = aVar2.f2466e;
            if (!eVar.f2562a) {
                eVar.a(aVar.f2466e);
            }
            c cVar = aVar2.f2464c;
            if (!cVar.f2538a) {
                cVar.a(aVar.f2464c);
            }
            for (String str : aVar.f2467f.keySet()) {
                if (!aVar2.f2467f.containsKey(str)) {
                    aVar2.f2467f.put(str, aVar.f2467f.get(str));
                }
            }
        }
    }

    public void x(int i4) {
        this.f2461d.remove(Integer.valueOf(i4));
    }

    public void x0(String str) {
        this.f2459b.remove(str);
    }

    public void y(int i4, int i5) {
        if (this.f2461d.containsKey(Integer.valueOf(i4))) {
            a aVar = this.f2461d.get(Integer.valueOf(i4));
            switch (i5) {
                case 1:
                    b bVar = aVar.f2465d;
                    bVar.f2511i = -1;
                    bVar.f2509h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f2465d;
                    bVar2.f2515k = -1;
                    bVar2.f2513j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f2465d;
                    bVar3.f2517m = -1;
                    bVar3.f2516l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f2465d;
                    bVar4.f2518n = -1;
                    bVar4.f2519o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.f2465d.f2520p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f2465d;
                    bVar5.f2521q = -1;
                    bVar5.f2522r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f2465d;
                    bVar6.f2523s = -1;
                    bVar6.f2524t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void y0(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        d dVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d dVar2;
        int i15;
        if (this.f2461d.containsKey(Integer.valueOf(i4))) {
            b bVar = this.f2461d.get(Integer.valueOf(i4)).f2465d;
            int i16 = bVar.f2511i;
            int i17 = bVar.f2513j;
            if (i16 == -1 && i17 == -1) {
                int i18 = bVar.f2521q;
                int i19 = bVar.f2523s;
                if (i18 != -1 || i19 != -1) {
                    if (i18 != -1 && i19 != -1) {
                        i14 = 0;
                        dVar2 = this;
                        dVar2.E(i18, 7, i19, 6, 0);
                        i12 = 6;
                        i13 = 7;
                        i15 = i19;
                        i11 = i16;
                    } else if (i16 != -1 || i19 != -1) {
                        i11 = bVar.f2515k;
                        if (i11 != -1) {
                            i12 = 7;
                            i13 = 7;
                            i14 = 0;
                            dVar2 = this;
                            i15 = i16;
                        } else {
                            i11 = bVar.f2509h;
                            if (i11 != -1) {
                                i12 = 6;
                                i13 = 6;
                                i14 = 0;
                                dVar2 = this;
                                i15 = i19;
                            }
                        }
                    }
                    dVar2.E(i15, i12, i11, i13, i14);
                }
                y(i4, 6);
                i10 = 7;
            } else {
                if (i16 == -1 || i17 == -1) {
                    if (i16 != -1 || i17 != -1) {
                        i5 = bVar.f2515k;
                        if (i5 != -1) {
                            i6 = 2;
                            i7 = 2;
                            i8 = 0;
                            dVar = this;
                            i9 = i16;
                        } else {
                            i5 = bVar.f2509h;
                            if (i5 != -1) {
                                i6 = 1;
                                i7 = 1;
                                i8 = 0;
                                dVar = this;
                                i9 = i17;
                            }
                        }
                    }
                    y(i4, 1);
                    i10 = 2;
                } else {
                    i8 = 0;
                    dVar = this;
                    dVar.E(i16, 2, i17, 1, 0);
                    i6 = 1;
                    i7 = 2;
                    i9 = i17;
                    i5 = i16;
                }
                dVar.E(i9, i6, i5, i7, i8);
                y(i4, 1);
                i10 = 2;
            }
            y(i4, i10);
        }
    }

    public void z(Context context, int i4) {
        A((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    public void z0(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        d dVar;
        int i9;
        if (this.f2461d.containsKey(Integer.valueOf(i4))) {
            b bVar = this.f2461d.get(Integer.valueOf(i4)).f2465d;
            int i10 = bVar.f2517m;
            int i11 = bVar.f2518n;
            if (i10 != -1 || i11 != -1) {
                if (i10 != -1 && i11 != -1) {
                    i8 = 0;
                    dVar = this;
                    dVar.E(i10, 4, i11, 3, 0);
                    i6 = 3;
                    i7 = 4;
                    i9 = i11;
                    i5 = i10;
                } else if (i10 != -1 || i11 != -1) {
                    i5 = bVar.f2519o;
                    if (i5 != -1) {
                        i6 = 4;
                        i7 = 4;
                        i8 = 0;
                        dVar = this;
                        i9 = i10;
                    } else {
                        i5 = bVar.f2516l;
                        if (i5 != -1) {
                            i6 = 3;
                            i7 = 3;
                            i8 = 0;
                            dVar = this;
                            i9 = i11;
                        }
                    }
                }
                dVar.E(i9, i6, i5, i7, i8);
            }
        }
        y(i4, 3);
        y(i4, 4);
    }
}
