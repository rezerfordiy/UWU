package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.widget.e;
import c.j0;
import c.k0;
import java.util.ArrayList;
import java.util.HashMap;
import v.e;
import v.h;
import v.k;
import v.m;
import v0.z1;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final String A = "ConstraintLayout-2.0.4";
    public static final String B = "ConstraintLayout";
    public static final boolean C = true;
    public static final boolean D = false;
    public static final boolean E = false;
    public static final boolean F = false;
    public static final int G = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray<View> f2225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<ConstraintHelper> f2226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v.f f2227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f2234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.widget.b f2235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap<String, Integer> f2237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SparseArray<v.e> f2244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x.a f2245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s.f f2246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f2247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2249z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int A0 = 7;
        public static final int B0 = 1;
        public static final int C0 = 0;
        public static final int D0 = 2;
        public static final int E0 = 0;
        public static final int F0 = 1;
        public static final int G0 = 2;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f2250p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f2251q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f2252r0 = -1;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f2253s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f2254t0 = 1;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f2255u0 = 1;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public static final int f2256v0 = 2;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f2257w0 = 3;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f2258x0 = 4;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f2259y0 = 5;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f2260z0 = 6;
        public float A;
        public String B;
        public float C;
        public int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2261a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f2262a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2263b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f2264b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2265c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f2266c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2267d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f2268d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2269e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f2270e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2271f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public int f2272f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2273g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f2274g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2275h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f2276h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2277i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f2278i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2279j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public float f2280j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2281k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f2282k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2283l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f2284l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2285m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f2286m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2287n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public v.e f2288n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f2289o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f2290o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2291p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2292q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2293r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2294s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2295t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2296u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2297v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f2298w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f2299x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f2300y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f2301z;

        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f2302a = 0;

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public static final SparseIntArray f2303a0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f2304b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f2305c = 2;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f2306d = 3;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f2307e = 4;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f2308f = 5;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f2309g = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f2310h = 7;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f2311i = 8;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f2312j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f2313k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f2314l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f2315m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f2316n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f2317o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f2318p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f2319q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f2320r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f2321s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f2322t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f2323u = 20;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f2324v = 21;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f2325w = 22;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f2326x = 23;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f2327y = 24;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f2328z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2303a0 = sparseIntArray;
                sparseIntArray.append(e.m.h7, 8);
                sparseIntArray.append(e.m.i7, 9);
                sparseIntArray.append(e.m.k7, 10);
                sparseIntArray.append(e.m.l7, 11);
                sparseIntArray.append(e.m.r7, 12);
                sparseIntArray.append(e.m.q7, 13);
                sparseIntArray.append(e.m.P6, 14);
                sparseIntArray.append(e.m.O6, 15);
                sparseIntArray.append(e.m.M6, 16);
                sparseIntArray.append(e.m.Q6, 2);
                sparseIntArray.append(e.m.S6, 3);
                sparseIntArray.append(e.m.R6, 4);
                sparseIntArray.append(e.m.z7, 49);
                sparseIntArray.append(e.m.A7, 50);
                sparseIntArray.append(e.m.W6, 5);
                sparseIntArray.append(e.m.X6, 6);
                sparseIntArray.append(e.m.Y6, 7);
                sparseIntArray.append(e.m.V5, 1);
                sparseIntArray.append(e.m.m7, 17);
                sparseIntArray.append(e.m.n7, 18);
                sparseIntArray.append(e.m.V6, 19);
                sparseIntArray.append(e.m.U6, 20);
                sparseIntArray.append(e.m.D7, 21);
                sparseIntArray.append(e.m.G7, 22);
                sparseIntArray.append(e.m.E7, 23);
                sparseIntArray.append(e.m.B7, 24);
                sparseIntArray.append(e.m.F7, 25);
                sparseIntArray.append(e.m.C7, 26);
                sparseIntArray.append(e.m.d7, 29);
                sparseIntArray.append(e.m.s7, 30);
                sparseIntArray.append(e.m.T6, 44);
                sparseIntArray.append(e.m.f7, 45);
                sparseIntArray.append(e.m.u7, 46);
                sparseIntArray.append(e.m.e7, 47);
                sparseIntArray.append(e.m.t7, 48);
                sparseIntArray.append(e.m.K6, 27);
                sparseIntArray.append(e.m.J6, 28);
                sparseIntArray.append(e.m.v7, 31);
                sparseIntArray.append(e.m.Z6, 32);
                sparseIntArray.append(e.m.x7, 33);
                sparseIntArray.append(e.m.w7, 34);
                sparseIntArray.append(e.m.y7, 35);
                sparseIntArray.append(e.m.b7, 36);
                sparseIntArray.append(e.m.a7, 37);
                sparseIntArray.append(e.m.c7, 38);
                sparseIntArray.append(e.m.g7, 39);
                sparseIntArray.append(e.m.p7, 40);
                sparseIntArray.append(e.m.j7, 41);
                sparseIntArray.append(e.m.N6, 42);
                sparseIntArray.append(e.m.L6, 43);
                sparseIntArray.append(e.m.o7, 51);
            }
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f2261a = -1;
            this.f2263b = -1;
            this.f2265c = -1.0f;
            this.f2267d = -1;
            this.f2269e = -1;
            this.f2271f = -1;
            this.f2273g = -1;
            this.f2275h = -1;
            this.f2277i = -1;
            this.f2279j = -1;
            this.f2281k = -1;
            this.f2283l = -1;
            this.f2285m = -1;
            this.f2287n = 0;
            this.f2289o = 0.0f;
            this.f2291p = -1;
            this.f2292q = -1;
            this.f2293r = -1;
            this.f2294s = -1;
            this.f2295t = -1;
            this.f2296u = -1;
            this.f2297v = -1;
            this.f2298w = -1;
            this.f2299x = -1;
            this.f2300y = -1;
            this.f2301z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2262a0 = false;
            this.f2264b0 = false;
            this.f2266c0 = false;
            this.f2268d0 = -1;
            this.f2270e0 = -1;
            this.f2272f0 = -1;
            this.f2274g0 = -1;
            this.f2276h0 = -1;
            this.f2278i0 = -1;
            this.f2280j0 = 0.5f;
            this.f2288n0 = new v.e();
            this.f2290o0 = false;
        }

        public String a() {
            return this.V;
        }

        public v.e b() {
            return this.f2288n0;
        }

        public void c() {
            v.e eVar = this.f2288n0;
            if (eVar != null) {
                eVar.F0();
            }
        }

        public void d(String str) {
            this.f2288n0.O0(str);
        }

        public void e() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i4 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i4 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i5 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i5 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.W = false;
                if (i4 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.X = false;
                if (i5 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f2265c == -1.0f && this.f2261a == -1 && this.f2263b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.f2288n0 instanceof h)) {
                this.f2288n0 = new h();
            }
            ((h) this.f2288n0).f2(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            String str;
            int i4;
            float fAbs;
            super(context, attributeSet);
            this.f2261a = -1;
            this.f2263b = -1;
            this.f2265c = -1.0f;
            this.f2267d = -1;
            this.f2269e = -1;
            this.f2271f = -1;
            this.f2273g = -1;
            this.f2275h = -1;
            this.f2277i = -1;
            this.f2279j = -1;
            this.f2281k = -1;
            this.f2283l = -1;
            this.f2285m = -1;
            this.f2287n = 0;
            this.f2289o = 0.0f;
            this.f2291p = -1;
            this.f2292q = -1;
            this.f2293r = -1;
            this.f2294s = -1;
            this.f2295t = -1;
            this.f2296u = -1;
            this.f2297v = -1;
            this.f2298w = -1;
            this.f2299x = -1;
            this.f2300y = -1;
            this.f2301z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2262a0 = false;
            this.f2264b0 = false;
            this.f2266c0 = false;
            this.f2268d0 = -1;
            this.f2270e0 = -1;
            this.f2272f0 = -1;
            this.f2274g0 = -1;
            this.f2276h0 = -1;
            this.f2278i0 = -1;
            this.f2280j0 = 0.5f;
            this.f2288n0 = new v.e();
            this.f2290o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.U5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                int i6 = a.f2303a0.get(index);
                switch (i6) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2285m);
                        this.f2285m = resourceId;
                        if (resourceId == -1) {
                            this.f2285m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f2287n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2287n);
                        continue;
                        break;
                    case 4:
                        float f4 = typedArrayObtainStyledAttributes.getFloat(index, this.f2289o) % 360.0f;
                        this.f2289o = f4;
                        if (f4 < 0.0f) {
                            this.f2289o = (360.0f - f4) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f2261a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2261a);
                        continue;
                        break;
                    case 6:
                        this.f2263b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2263b);
                        continue;
                        break;
                    case 7:
                        this.f2265c = typedArrayObtainStyledAttributes.getFloat(index, this.f2265c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2267d);
                        this.f2267d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2267d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2269e);
                        this.f2269e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2269e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2271f);
                        this.f2271f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2271f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2273g);
                        this.f2273g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2273g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2275h);
                        this.f2275h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2275h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2277i);
                        this.f2277i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2277i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2279j);
                        this.f2279j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2279j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2281k);
                        this.f2281k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2281k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2283l);
                        this.f2283l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2283l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2291p);
                        this.f2291p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2291p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2292q);
                        this.f2292q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2292q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2293r);
                        this.f2293r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2293r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2294s);
                        this.f2294s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2294s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f2295t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2295t);
                        continue;
                        break;
                    case 22:
                        this.f2296u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2296u);
                        continue;
                        break;
                    case 23:
                        this.f2297v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2297v);
                        continue;
                        break;
                    case 24:
                        this.f2298w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2298w);
                        continue;
                        break;
                    case 25:
                        this.f2299x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2299x);
                        continue;
                        break;
                    case 26:
                        this.f2300y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2300y);
                        continue;
                        break;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                        break;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                        break;
                    case 29:
                        this.f2301z = typedArrayObtainStyledAttributes.getFloat(index, this.f2301z);
                        continue;
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                        break;
                    case 31:
                        int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i7;
                        if (i7 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        }
                        break;
                    case 32:
                        int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i8;
                        if (i8 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        }
                        break;
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                        break;
                    default:
                        switch (i6) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i4 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i4 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i4);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.C = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i4, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f5 = Float.parseFloat(strSubstring3);
                                                float f6 = Float.parseFloat(strSubstring4);
                                                if (f5 > 0.0f && f6 > 0.0f) {
                                                    fAbs = this.D == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                                    this.C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e(ConstraintLayout.B, str);
            }
            typedArrayObtainStyledAttributes.recycle();
            e();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2261a = -1;
            this.f2263b = -1;
            this.f2265c = -1.0f;
            this.f2267d = -1;
            this.f2269e = -1;
            this.f2271f = -1;
            this.f2273g = -1;
            this.f2275h = -1;
            this.f2277i = -1;
            this.f2279j = -1;
            this.f2281k = -1;
            this.f2283l = -1;
            this.f2285m = -1;
            this.f2287n = 0;
            this.f2289o = 0.0f;
            this.f2291p = -1;
            this.f2292q = -1;
            this.f2293r = -1;
            this.f2294s = -1;
            this.f2295t = -1;
            this.f2296u = -1;
            this.f2297v = -1;
            this.f2298w = -1;
            this.f2299x = -1;
            this.f2300y = -1;
            this.f2301z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2262a0 = false;
            this.f2264b0 = false;
            this.f2266c0 = false;
            this.f2268d0 = -1;
            this.f2270e0 = -1;
            this.f2272f0 = -1;
            this.f2274g0 = -1;
            this.f2276h0 = -1;
            this.f2278i0 = -1;
            this.f2280j0 = 0.5f;
            this.f2288n0 = new v.e();
            this.f2290o0 = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f2261a = -1;
            this.f2263b = -1;
            this.f2265c = -1.0f;
            this.f2267d = -1;
            this.f2269e = -1;
            this.f2271f = -1;
            this.f2273g = -1;
            this.f2275h = -1;
            this.f2277i = -1;
            this.f2279j = -1;
            this.f2281k = -1;
            this.f2283l = -1;
            this.f2285m = -1;
            this.f2287n = 0;
            this.f2289o = 0.0f;
            this.f2291p = -1;
            this.f2292q = -1;
            this.f2293r = -1;
            this.f2294s = -1;
            this.f2295t = -1;
            this.f2296u = -1;
            this.f2297v = -1;
            this.f2298w = -1;
            this.f2299x = -1;
            this.f2300y = -1;
            this.f2301z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2262a0 = false;
            this.f2264b0 = false;
            this.f2266c0 = false;
            this.f2268d0 = -1;
            this.f2270e0 = -1;
            this.f2272f0 = -1;
            this.f2274g0 = -1;
            this.f2276h0 = -1;
            this.f2278i0 = -1;
            this.f2280j0 = 0.5f;
            this.f2288n0 = new v.e();
            this.f2290o0 = false;
            this.f2261a = layoutParams.f2261a;
            this.f2263b = layoutParams.f2263b;
            this.f2265c = layoutParams.f2265c;
            this.f2267d = layoutParams.f2267d;
            this.f2269e = layoutParams.f2269e;
            this.f2271f = layoutParams.f2271f;
            this.f2273g = layoutParams.f2273g;
            this.f2275h = layoutParams.f2275h;
            this.f2277i = layoutParams.f2277i;
            this.f2279j = layoutParams.f2279j;
            this.f2281k = layoutParams.f2281k;
            this.f2283l = layoutParams.f2283l;
            this.f2285m = layoutParams.f2285m;
            this.f2287n = layoutParams.f2287n;
            this.f2289o = layoutParams.f2289o;
            this.f2291p = layoutParams.f2291p;
            this.f2292q = layoutParams.f2292q;
            this.f2293r = layoutParams.f2293r;
            this.f2294s = layoutParams.f2294s;
            this.f2295t = layoutParams.f2295t;
            this.f2296u = layoutParams.f2296u;
            this.f2297v = layoutParams.f2297v;
            this.f2298w = layoutParams.f2298w;
            this.f2299x = layoutParams.f2299x;
            this.f2300y = layoutParams.f2300y;
            this.f2301z = layoutParams.f2301z;
            this.A = layoutParams.A;
            this.B = layoutParams.B;
            this.C = layoutParams.C;
            this.D = layoutParams.D;
            this.E = layoutParams.E;
            this.F = layoutParams.F;
            this.G = layoutParams.G;
            this.H = layoutParams.H;
            this.T = layoutParams.T;
            this.U = layoutParams.U;
            this.I = layoutParams.I;
            this.J = layoutParams.J;
            this.K = layoutParams.K;
            this.M = layoutParams.M;
            this.L = layoutParams.L;
            this.N = layoutParams.N;
            this.O = layoutParams.O;
            this.P = layoutParams.P;
            this.Q = layoutParams.Q;
            this.R = layoutParams.R;
            this.S = layoutParams.S;
            this.W = layoutParams.W;
            this.X = layoutParams.X;
            this.Y = layoutParams.Y;
            this.Z = layoutParams.Z;
            this.f2268d0 = layoutParams.f2268d0;
            this.f2270e0 = layoutParams.f2270e0;
            this.f2272f0 = layoutParams.f2272f0;
            this.f2274g0 = layoutParams.f2274g0;
            this.f2276h0 = layoutParams.f2276h0;
            this.f2278i0 = layoutParams.f2278i0;
            this.f2280j0 = layoutParams.f2280j0;
            this.V = layoutParams.V;
            this.f2288n0 = layoutParams.f2288n0;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2329a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2329a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2329a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2329a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2329a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements b.InterfaceC0124b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f2330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2336g;

        public b(ConstraintLayout constraintLayout) {
            this.f2330a = constraintLayout;
        }

        @Override // w.b.InterfaceC0124b
        public final void a() {
            int childCount = this.f2330a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.f2330a.getChildAt(i4);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f2330a);
                }
            }
            int size = this.f2330a.f2226c.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((ConstraintHelper) this.f2330a.f2226c.get(i5)).u(this.f2330a);
                }
            }
        }

        @Override // w.b.InterfaceC0124b
        @SuppressLint({"WrongCall"})
        public final void b(v.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i4;
            int measuredHeight;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (eVar == null) {
                return;
            }
            if (eVar.i0() == 8 && !eVar.t0()) {
                aVar.f12302e = 0;
                aVar.f12303f = 0;
                aVar.f12304g = 0;
                return;
            }
            if (eVar.U() == null) {
                return;
            }
            e.b bVar = aVar.f12298a;
            e.b bVar2 = aVar.f12299b;
            int iJ0 = aVar.f12300c;
            int iD = aVar.f12301d;
            int iH0 = this.f2331b + this.f2332c;
            int I = this.f2333d;
            View view = (View) eVar.w();
            int[] iArr = a.f2329a;
            int i10 = iArr[bVar.ordinal()];
            if (i10 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iJ0, w.b.f12287g);
            } else {
                if (i10 == 2) {
                    i8 = this.f2335f;
                    i9 = -2;
                } else if (i10 == 3) {
                    i8 = this.f2335f;
                    I += eVar.I();
                    i9 = -1;
                } else if (i10 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2335f, I, -2);
                    boolean z3 = eVar.f11826p == 1;
                    int i11 = aVar.f12307j;
                    if (i11 == b.a.f12296l || i11 == b.a.f12297m) {
                        if (aVar.f12307j == b.a.f12297m || !z3 || (z3 && (view.getMeasuredHeight() == eVar.D())) || (view instanceof Placeholder) || eVar.x0()) {
                            iJ0 = eVar.j0();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iJ0, w.b.f12287g);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, I, i9);
            }
            int i12 = iArr[bVar2.ordinal()];
            if (i12 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iD, w.b.f12287g);
            } else {
                if (i12 == 2) {
                    i6 = this.f2336g;
                    i7 = -2;
                } else if (i12 == 3) {
                    i6 = this.f2336g;
                    iH0 += eVar.h0();
                    i7 = -1;
                } else if (i12 != 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2336g, iH0, -2);
                    boolean z4 = eVar.f11828q == 1;
                    int i13 = aVar.f12307j;
                    if (i13 == b.a.f12296l || i13 == b.a.f12297m) {
                        if (aVar.f12307j == b.a.f12297m || !z4 || (z4 && (view.getMeasuredWidth() == eVar.j0())) || (view instanceof Placeholder) || eVar.y0()) {
                            iD = eVar.D();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iD, w.b.f12287g);
                        }
                    }
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, iH0, i7);
            }
            v.f fVar = (v.f) eVar.U();
            if (fVar != null && k.b(ConstraintLayout.this.f2233j, 256) && view.getMeasuredWidth() == eVar.j0() && view.getMeasuredWidth() < fVar.j0() && view.getMeasuredHeight() == eVar.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == eVar.t() && !eVar.w0()) {
                if (d(eVar.J(), iMakeMeasureSpec, eVar.j0()) && d(eVar.K(), iMakeMeasureSpec2, eVar.D())) {
                    aVar.f12302e = eVar.j0();
                    aVar.f12303f = eVar.D();
                    aVar.f12304g = eVar.t();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z5 = bVar == bVar3;
            boolean z6 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z7 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z8 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z9 = z5 && eVar.Y > 0.0f;
            boolean z10 = z6 && eVar.Y > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i14 = aVar.f12307j;
            if (i14 != b.a.f12296l && i14 != b.a.f12297m && z5 && eVar.f11826p == 0 && z6 && eVar.f11828q == 0) {
                i5 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (eVar instanceof m)) {
                    ((VirtualLayout) view).z((m) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.o1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i15 = eVar.f11832s;
                iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
                int i16 = eVar.f11834t;
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                int i17 = eVar.f11838v;
                if (i17 > 0) {
                    measuredHeight = Math.max(i17, measuredHeight2);
                    i4 = iMakeMeasureSpec;
                } else {
                    i4 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i18 = eVar.f11840w;
                if (i18 > 0) {
                    measuredHeight = Math.min(i18, measuredHeight);
                }
                if (!k.b(ConstraintLayout.this.f2233j, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((measuredHeight * eVar.Y) + 0.5f);
                    } else if (z10 && z8) {
                        measuredHeight = (int) ((iMax / eVar.Y) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, w.b.f12287g) : i4;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, w.b.f12287g);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.o1(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i5 = -1;
            }
            boolean z11 = baseline != i5;
            aVar.f12306i = (iMax == aVar.f12300c && measuredHeight == aVar.f12301d) ? false : true;
            if (layoutParams.Y) {
                z11 = true;
            }
            if (z11 && baseline != -1 && eVar.t() != baseline) {
                aVar.f12306i = true;
            }
            aVar.f12302e = iMax;
            aVar.f12303f = measuredHeight;
            aVar.f12305h = z11;
            aVar.f12304g = baseline;
        }

        public void c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f2331b = i6;
            this.f2332c = i7;
            this.f2333d = i8;
            this.f2334e = i9;
            this.f2335f = i4;
            this.f2336g = i5;
        }

        public final boolean d(int i4, int i5, int i6) {
            if (i4 == i5) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@j0 Context context) {
        super(context);
        this.f2225b = new SparseArray<>();
        this.f2226c = new ArrayList<>(4);
        this.f2227d = new v.f();
        this.f2228e = 0;
        this.f2229f = 0;
        this.f2230g = ActivityChooserView.f.f1331h;
        this.f2231h = ActivityChooserView.f.f1331h;
        this.f2232i = true;
        this.f2233j = 257;
        this.f2234k = null;
        this.f2235l = null;
        this.f2236m = -1;
        this.f2237n = new HashMap<>();
        this.f2238o = -1;
        this.f2239p = -1;
        this.f2240q = -1;
        this.f2241r = -1;
        this.f2242s = 0;
        this.f2243t = 0;
        this.f2244u = new SparseArray<>();
        this.f2247x = new b(this);
        this.f2248y = 0;
        this.f2249z = 0;
        n(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public void A(int i4, int i5, int i6) {
        androidx.constraintlayout.widget.b bVar = this.f2235l;
        if (bVar != null) {
            bVar.e(i4, i5, i6);
        }
    }

    public final boolean B() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (getChildAt(i4).isLayoutRequested()) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            x();
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r19, android.view.View r20, v.e r21, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r22, android.util.SparseArray<v.e> r23) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, v.e, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void d(s.f fVar) {
        this.f2246w = fVar;
        this.f2227d.i2(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2226c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f2226c.get(i4).v(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(l0.a.f8429c);
                        float f4 = i9;
                        float f5 = i10;
                        float f6 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float f7 = i10 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, f7, paint);
                        canvas.drawLine(f6, f7, f4, f7, paint);
                        canvas.drawLine(f4, f7, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, f7, paint);
                        canvas.drawLine(f4, f7, f6, f5, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        t();
        super.forceLayout();
    }

    public Object g(int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f2237n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f2237n.get(str);
    }

    public int getMaxHeight() {
        return this.f2231h;
    }

    public int getMaxWidth() {
        return this.f2230g;
    }

    public int getMinHeight() {
        return this.f2229f;
    }

    public int getMinWidth() {
        return this.f2228e;
    }

    public int getOptimizationLevel() {
        return this.f2227d.l2();
    }

    public final v.e i(int i4) {
        if (i4 == 0) {
            return this.f2227d;
        }
        View viewFindViewById = this.f2225b.get(i4);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i4)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f2227d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f2288n0;
    }

    public View j(int i4) {
        return this.f2225b.get(i4);
    }

    public final v.e m(View view) {
        if (view == this) {
            return this.f2227d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2288n0;
    }

    public final void n(AttributeSet attributeSet, int i4, int i5) {
        this.f2227d.M0(this);
        this.f2227d.y2(this.f2247x);
        this.f2225b.put(getId(), this);
        this.f2234k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.U5, i4, i5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == e.m.e6) {
                    this.f2228e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2228e);
                } else if (index == e.m.f6) {
                    this.f2229f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2229f);
                } else if (index == e.m.c6) {
                    this.f2230g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2230g);
                } else if (index == e.m.d6) {
                    this.f2231h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2231h);
                } else if (index == e.m.H7) {
                    this.f2233j = typedArrayObtainStyledAttributes.getInt(index, this.f2233j);
                } else if (index == e.m.I6) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            u(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2235l = null;
                        }
                    }
                } else if (index == e.m.n6) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f2234k = dVar;
                        dVar.n0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2234k = null;
                    }
                    this.f2236m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2227d.z2(this.f2233j);
    }

    public boolean o() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            v.e eVar = layoutParams.f2288n0;
            if ((childAt.getVisibility() != 8 || layoutParams.Z || layoutParams.f2262a0 || layoutParams.f2266c0 || zIsInEditMode) && !layoutParams.f2264b0) {
                int iK0 = eVar.k0();
                int iL0 = eVar.l0();
                int iJ0 = eVar.j0() + iK0;
                int iD = eVar.D() + iL0;
                childAt.layout(iK0, iL0, iJ0, iD);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iK0, iL0, iJ0, iD);
                }
            }
        }
        int size = this.f2226c.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.f2226c.get(i9).t(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f2232i
            r1 = 0
            if (r0 != 0) goto L1d
            int r0 = r8.getChildCount()
            r2 = r1
        La:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r8.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L1a
            r0 = 1
            r8.f2232i = r0
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            boolean r0 = r8.f2232i
            if (r0 != 0) goto L73
            int r0 = r8.f2248y
            if (r0 != r9) goto L48
            int r2 = r8.f2249z
            if (r2 != r10) goto L48
        L29:
            v.f r0 = r8.f2227d
            int r4 = r0.j0()
            v.f r0 = r8.f2227d
            int r5 = r0.D()
            v.f r0 = r8.f2227d
            boolean r6 = r0.t2()
            v.f r0 = r8.f2227d
            boolean r7 = r0.r2()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.v(r2, r3, r4, r5, r6, r7)
            return
        L48:
            if (r0 != r9) goto L73
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L73
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L73
            int r0 = r8.f2249z
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            if (r0 != r2) goto L73
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            v.f r2 = r8.f2227d
            int r2 = r2.D()
            if (r0 < r2) goto L73
            r8.f2248y = r9
            r8.f2249z = r10
            goto L29
        L73:
            r8.f2248y = r9
            r8.f2249z = r10
            v.f r0 = r8.f2227d
            boolean r2 = r8.o()
            r0.B2(r2)
            boolean r0 = r8.f2232i
            if (r0 == 0) goto L91
            r8.f2232i = r1
            boolean r0 = r8.B()
            if (r0 == 0) goto L91
            v.f r0 = r8.f2227d
            r0.D2()
        L91:
            v.f r0 = r8.f2227d
            int r1 = r8.f2233j
            r8.w(r0, r1, r9, r10)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.e eVarM = m(view);
        if ((view instanceof Guideline) && !(eVarM instanceof h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            h hVar = new h();
            layoutParams.f2288n0 = hVar;
            layoutParams.Z = true;
            hVar.f2(layoutParams.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.y();
            ((LayoutParams) view.getLayoutParams()).f2262a0 = true;
            if (!this.f2226c.contains(constraintHelper)) {
                this.f2226c.add(constraintHelper);
            }
        }
        this.f2225b.put(view.getId(), view);
        this.f2232i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2225b.remove(view.getId());
        this.f2227d.S1(m(view));
        this.f2226c.remove(view);
        this.f2232i = true;
    }

    public void q(int i4) {
        if (i4 != 0) {
            try {
                this.f2235l = new androidx.constraintlayout.widget.b(getContext(), this, i4);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.f2235l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        t();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f2234k = dVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        this.f2225b.remove(getId());
        super.setId(i4);
        this.f2225b.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f2231h) {
            return;
        }
        this.f2231h = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f2230g) {
            return;
        }
        this.f2230g = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f2229f) {
            return;
        }
        this.f2229f = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f2228e) {
            return;
        }
        this.f2228e = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(x.a aVar) {
        this.f2245v = aVar;
        androidx.constraintlayout.widget.b bVar = this.f2235l;
        if (bVar != null) {
            bVar.d(aVar);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f2233j = i4;
        this.f2227d.z2(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.f2232i = true;
        this.f2238o = -1;
        this.f2239p = -1;
        this.f2240q = -1;
        this.f2241r = -1;
        this.f2242s = 0;
        this.f2243t = 0;
    }

    public void u(int i4) {
        this.f2235l = new androidx.constraintlayout.widget.b(getContext(), this, i4);
    }

    public void v(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        b bVar = this.f2247x;
        int i8 = bVar.f2334e;
        int iResolveSizeAndState = View.resolveSizeAndState(i6 + bVar.f2333d, i4, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i7 + i8, i5, 0);
        int i9 = iResolveSizeAndState & z1.f12255s;
        int i10 = iResolveSizeAndState2 & z1.f12255s;
        int iMin = Math.min(this.f2230g, i9);
        int iMin2 = Math.min(this.f2231h, i10);
        if (z3) {
            iMin |= 16777216;
        }
        if (z4) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f2238o = iMin;
        this.f2239p = iMin2;
    }

    public void w(v.f fVar, int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i7 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f2247x.c(i5, i6, iMax, iMax2, paddingWidth, i7);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? o() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i8 = size - paddingWidth;
        int i9 = size2 - i7;
        z(fVar, mode, i8, mode2, i9);
        fVar.u2(i4, mode, i8, mode2, i9, this.f2238o, this.f2239p, iMax5, iMax);
    }

    public final void x() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            v.e eVarM = m(getChildAt(i4));
            if (eVarM != null) {
                eVarM.F0();
            }
        }
        if (zIsInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    y(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    i(childAt.getId()).O0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2236m != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getId() == this.f2236m && (childAt2 instanceof Constraints)) {
                    this.f2234k = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f2234k;
        if (dVar != null) {
            dVar.n(this, true);
        }
        this.f2227d.T1();
        int size = this.f2226c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f2226c.get(i7).w(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt3 = getChildAt(i8);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.f2244u.clear();
        this.f2244u.put(0, this.f2227d);
        this.f2244u.put(getId(), this.f2227d);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt4 = getChildAt(i9);
            this.f2244u.put(childAt4.getId(), m(childAt4));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt5 = getChildAt(i10);
            v.e eVarM2 = m(childAt5);
            if (eVarM2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f2227d.a(eVarM2);
                c(zIsInEditMode, childAt5, eVarM2, layoutParams, this.f2244u);
            }
        }
    }

    public void y(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2237n == null) {
                this.f2237n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f2237n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r9
      0x002c: PHI (r9v2 v.e$b) = (r9v1 v.e$b), (r9v8 v.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r2
      0x004b: PHI (r2v2 v.e$b) = (r2v1 v.e$b), (r2v4 v.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(v.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = r7.f2247x
            int r1 = r0.f2334e
            int r0 = r0.f2333d
            v.e$b r2 = v.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.f2230g
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f2228e
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.f2231h
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f2229f
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.j0()
            if (r10 != r11) goto L5d
            int r11 = r8.D()
            if (r12 == r11) goto L60
        L5d:
            r8.q2()
        L60:
            r8.J1(r6)
            r8.K1(r6)
            int r11 = r7.f2230g
            int r11 = r11 - r0
            r8.r1(r11)
            int r11 = r7.f2231h
            int r11 = r11 - r1
            r8.q1(r11)
            r8.u1(r6)
            r8.t1(r6)
            r8.i1(r9)
            r8.H1(r10)
            r8.D1(r2)
            r8.d1(r12)
            int r9 = r7.f2228e
            int r9 = r9 - r0
            r8.u1(r9)
            int r9 = r7.f2229f
            int r9 = r9 - r1
            r8.t1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.z(v.f, int, int, int, int):void");
    }

    public ConstraintLayout(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2225b = new SparseArray<>();
        this.f2226c = new ArrayList<>(4);
        this.f2227d = new v.f();
        this.f2228e = 0;
        this.f2229f = 0;
        this.f2230g = ActivityChooserView.f.f1331h;
        this.f2231h = ActivityChooserView.f.f1331h;
        this.f2232i = true;
        this.f2233j = 257;
        this.f2234k = null;
        this.f2235l = null;
        this.f2236m = -1;
        this.f2237n = new HashMap<>();
        this.f2238o = -1;
        this.f2239p = -1;
        this.f2240q = -1;
        this.f2241r = -1;
        this.f2242s = 0;
        this.f2243t = 0;
        this.f2244u = new SparseArray<>();
        this.f2247x = new b(this);
        this.f2248y = 0;
        this.f2249z = 0;
        n(attributeSet, 0, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@j0 Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2225b = new SparseArray<>();
        this.f2226c = new ArrayList<>(4);
        this.f2227d = new v.f();
        this.f2228e = 0;
        this.f2229f = 0;
        this.f2230g = ActivityChooserView.f.f1331h;
        this.f2231h = ActivityChooserView.f.f1331h;
        this.f2232i = true;
        this.f2233j = 257;
        this.f2234k = null;
        this.f2235l = null;
        this.f2236m = -1;
        this.f2237n = new HashMap<>();
        this.f2238o = -1;
        this.f2239p = -1;
        this.f2240q = -1;
        this.f2241r = -1;
        this.f2242s = 0;
        this.f2243t = 0;
        this.f2244u = new SparseArray<>();
        this.f2247x = new b(this);
        this.f2248y = 0;
        this.f2249z = 0;
        n(attributeSet, i4, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@j0 Context context, @k0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f2225b = new SparseArray<>();
        this.f2226c = new ArrayList<>(4);
        this.f2227d = new v.f();
        this.f2228e = 0;
        this.f2229f = 0;
        this.f2230g = ActivityChooserView.f.f1331h;
        this.f2231h = ActivityChooserView.f.f1331h;
        this.f2232i = true;
        this.f2233j = 257;
        this.f2234k = null;
        this.f2235l = null;
        this.f2236m = -1;
        this.f2237n = new HashMap<>();
        this.f2238o = -1;
        this.f2239p = -1;
        this.f2240q = -1;
        this.f2241r = -1;
        this.f2242s = 0;
        this.f2243t = 0;
        this.f2244u = new SparseArray<>();
        this.f2247x = new b(this);
        this.f2248y = 0;
        this.f2249z = 0;
        n(attributeSet, i4, i5);
    }
}
