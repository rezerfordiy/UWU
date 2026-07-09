package com.sonoptek.pvus_android;

import android.content.Context;
import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import m2.z;
import n2.e1;
import n2.h0;
import n2.i0;
import n2.j0;
import n2.p1;
import n2.r0;
import n2.w0;
import n2.x0;
import org.json.JSONException;
import org.json.JSONObject;
import z1.b0;
import z1.c1;
import z1.c2;
import z1.g0;
import z1.n0;
import z1.o1;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static c1 B = null;
    public static b0.o C = null;
    public static b0.h D = null;
    public static boolean H = false;
    public static boolean I = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5944a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5945b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5946c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5947d = 101;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5948e = 102;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5949f = 103;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5950g = 104;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f5951h = 105;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f5952i = 106;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f5953j = 107;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5954k = 108;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f5955l = 109;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5956m = 110;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f5957n = 111;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5958o = 112;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f5959p = 113;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5960q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f5961r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f5962s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f5963t = 100;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static List<String> f5964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f5965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f5966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String[] f5967x = {"SV-1", "SV-1S", "SV-1A", "SV-1SA", "SS-1", "SS-1A", "SS-1S", "SS-1SA", "SS-2", "SS-2S", "SS-3S", "SS-3SA", "SS-3C", "SS-3H", "SS-3HS", "SS-5C", "SS-5H", "SS-5CS", "SS-6C", "SC-1S", "SC-2S", "SC-2C", "SL-1", "SL-1S", "SL-2T", "SL-2C", "SL-2H", "SL-2", "SL-2S", "SL-3", "SL-3T", "SL-3V", "SL-3S", "SL-3C", "SL-5C", "SL-5H", "SS-5HS", "SL-5CS", "SX-1", "SX-1C", "SX-1T", "SX-1CS", "SX-1CT", "SX-1CSS", "SX-1X", "SX-1CTS", "SX-2C", "SX-2CT", "SX-2CS", "SX-3C", "SX-4C", "SX-4CS", "SX-5C", "SX-5H", "SX-7L", "SX-7C", "SX-7T", "SX-8CT", "US-1C", "US-1E", "US-2C", "US-2T", "US-3C", "UL-1C", "UL-1E", "UL-3C", "UX-1C", "UX-2D", "UX-8C", "UX-8P", "UX-8T", "PL-1C", "PA-2C", "PA-3C", "PA-4C", "SA-1C", "SW-1C", "EQ-1", "EQ-2", "EQ-3", "EX-32", "EU-1C", "US-1H", "UL-1H", "SR-1C", "SR-2C"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f5968y = {"PA-2C", "US-1E", "UL-1E", "US-1C", "SS-5H", "SS-5HS", "SX-1CSA", "SX-1CTA", "SX-8CTA", "UX-8CA", "UX-8PA", "PA-3C"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static String[] f5969z = {"SL-6C", "SL-7C", "SX-6C", "SH-1C", "SH-2C", "SS-6H", "SX-6CT", "SS-6CT", "SL-6P", "SL-6H", "SL-7H", "SL-5HS", "E8200", "E8500", "XR-1C", "XR-2C", "UL-1HS", "XR-8C", "SH-3C", "SH-2S", "SL-3H", "UX-8H", "UX-8HS", "SX-1CH", "SX-2CH", "SH-2CS", "SX-6CH", "UX-8L", "SH-2R"};
    public static boolean A = false;
    public static int E = 0;
    public static boolean F = true;
    public static boolean G = false;
    public static boolean J = false;
    public static boolean K = false;
    public static int L = 2;
    public static boolean M = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5970a;

        static {
            int[] iArr = new int[b.values().length];
            f5970a = iArr;
            try {
                iArr[b.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5970a[b.BM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5970a[b.Color.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5970a[b.PDI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5970a[b.PW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        B,
        BM,
        Color,
        PDI,
        PW
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f5980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f5981e;
    }

    public static int[] A() {
        if (!D0()) {
            p1 p1VarR = e1.s(null).r();
            return p1VarR.l() ? (int[]) ((i0) p1VarR).A.f9368o.clone() : p1VarR.m() ? new int[]{0, -7, 7} : new int[1];
        }
        g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
        int iJ = jVar.J() + 1;
        int[] iArr = new int[iJ];
        for (int i4 = 0; i4 < iJ; i4++) {
            iArr[i4] = (int) jVar.x(i4);
        }
        return iArr;
    }

    public static boolean A0() {
        return G;
    }

    public static void A1() {
        r0 r0VarQ;
        if (D0()) {
            ((b0.k) B.e(n0.a.LIVE.toString())).p(!r0.H2());
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (r0VarQ = e1VarS.q()) == null) {
            return;
        }
        r0VarQ.E();
    }

    public static int B() {
        if (D0()) {
            return ((g0.k) B.e(n0.b.COLOR_POWER_WF.toString())).A2();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((h0) r0VarQ).L0();
    }

    public static boolean B0() {
        if (D0()) {
            b0.g gVar = (b0.g) B.e(n0.a.BASE.toString());
            return gVar != null && gVar.a0() >= 100000.0f;
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR != null) {
            return p1VarR.p();
        }
        return false;
    }

    public static int C() {
        if (D0()) {
            return ((g0.k) B.e(n0.b.COLOR_POWER_WF.toString())).m0() + 1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).X0();
    }

    public static boolean C0() {
        r0 r0VarQ;
        if (D0()) {
            b0.k kVar = (b0.k) B.e(n0.a.LIVE.toString());
            if (kVar != null) {
                return kVar.H2();
            }
            return false;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (r0VarQ = e1VarS.q()) == null) {
            return false;
        }
        return r0VarQ.r();
    }

    public static boolean D() {
        if (D0()) {
            return ((o1.h) B.e(n0.c.COMPOUND.toString())).n2();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return false;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ != null && p1VarR.n() && p1VarR.d()) {
            return ((w0) r0VarQ).X();
        }
        return false;
    }

    public static boolean D0() {
        return A;
    }

    public static int E() {
        if (D0()) {
            return ((o1.i) B.e(n0.c.DYNAMIC_RANGE.toString())).B();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1.s(null).q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return -1;
        }
        return ((w0) r0VarQ).Y();
    }

    public static boolean E0() {
        r0 r0VarQ;
        if (D0() || e1.s(null) == null || (r0VarQ = e1.s(null).q()) == null) {
            return false;
        }
        return r0VarQ.s();
    }

    public static int F() {
        if (D0()) {
            b0.p pVar = (b0.p) B.e(n0.a.ZOOM.toString());
            return (int) pVar.l0(pVar.A0());
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null) {
            return -1;
        }
        return p1VarR.f9527g.f9538i[r0VarQ.n()];
    }

    public static boolean F0() {
        return M;
    }

    public static int G() {
        if (D0()) {
            return ((b0.p) B.e(n0.a.ZOOM.toString())).A0();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        e1VarS.r();
        if (r0VarQ != null) {
            return r0VarQ.n();
        }
        return -1;
    }

    public static boolean G0() {
        return J;
    }

    public static int H() {
        if (D0()) {
            return ((o1.l) B.e(n0.c.IMAGE_ENHANCE.toString())).O0();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return -1;
        }
        return ((w0) r0VarQ).Z();
    }

    public static void H0(boolean z3) {
        if (z3) {
            C = (b0.o) B.e(n0.a.TRANSDUCER.toString());
            D = (b0.h) B.e(n0.a.BUILD_IN_PA.toString());
        }
    }

    public static int I() {
        if (D0()) {
            return ((o1.j) B.e(n0.c.FOCUS.toString())).a();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return -1;
        }
        return ((w0) r0VarQ).c0();
    }

    public static void I0(List<String> list) {
        n0.a aVar = n0.a.TRANSDUCER;
        if (list.contains(aVar.toString()) || list.contains(n0.a.BUILD_IN_PA.toString())) {
            C = (b0.o) B.e(aVar.toString());
            D = (b0.h) B.e(n0.a.BUILD_IN_PA.toString());
        }
    }

    public static float J() {
        if (D0()) {
            return ((o1.k) B.e(n0.c.HARMONIC.toString())).Y1(false);
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1.0f;
        }
        r0 r0VarQ = e1VarS.q();
        x0 x0Var = (x0) e1VarS.r();
        if (r0VarQ == null || !x0Var.n()) {
            return -1.0f;
        }
        return x0Var.f9683s.f9696g;
    }

    public static boolean J0(float f4, float f5) {
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || !e1VarS.r().l()) {
            return false;
        }
        h0 h0Var = (h0) e1VarS.q();
        if (!h0Var.r()) {
            return false;
        }
        if (h0Var.m() != 5 && h0Var.m() != 6) {
            return false;
        }
        float fC0 = h0Var.C0();
        float fB0 = h0Var.B0();
        float fG0 = h0Var.G0();
        float fK0 = h0Var.K0();
        com.sonoptek.pvus_android.view.f.d();
        z zVarF = com.sonoptek.pvus_android.view.f.f();
        PointF pointF = new PointF(fC0, fG0);
        PointF pointF2 = new PointF(fB0, fG0);
        float f6 = fG0 + fK0;
        PointF pointF3 = new PointF(fC0, f6);
        PointF pointF4 = new PointF(fB0, f6);
        int iH0 = h0Var.H0();
        PointF pointFF = zVarF.F(pointF, iH0);
        PointF pointFF2 = zVarF.F(pointF2, iH0);
        PointF pointFF3 = zVarF.F(pointF3, iH0);
        PointF pointFF4 = zVarF.F(pointF4, iH0);
        return f4 > Math.min(pointFF.x, pointFF3.x) - 40.0f && f4 < Math.max(pointFF2.x, pointFF4.x) + 40.0f && f5 > Math.min(pointFF.y, pointFF2.y) - 40.0f && f5 < Math.max(pointFF3.y, pointFF4.y) + 40.0f;
    }

    public static int K() {
        r0 r0VarQ;
        if (D0()) {
            return ((b0.i) B.e(n0.a.GAIN.toString())).k();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (r0VarQ = e1VarS.q()) == null) {
            return -1;
        }
        return r0VarQ.l();
    }

    public static boolean K0(float f4, float f5) {
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return false;
        }
        p1 p1VarR = e1VarS.r();
        if (!p1VarR.l()) {
            return false;
        }
        h0 h0Var = (h0) e1VarS.q();
        if (!h0Var.r() || h0Var.m() != 7) {
            return false;
        }
        com.sonoptek.pvus_android.view.f.d();
        z zVarF = com.sonoptek.pvus_android.view.f.f();
        int iQ0 = h0Var.Q0();
        int i4 = p1VarR.f9527g.f9536g;
        int iV0 = h0Var.V0();
        float f6 = iQ0;
        PointF pointF = new PointF(f6, 0.0f);
        PointF pointF2 = new PointF(f6, i4);
        PointF pointFF = zVarF.F(pointF, iV0);
        PointF pointFF2 = zVarF.F(pointF2, iV0);
        return f4 > Math.min(pointFF.x, pointFF2.x) - 40.0f && f4 < Math.max(pointFF.x, pointFF2.x) + 40.0f && f5 > Math.min(pointFF.y, pointFF2.y) - 40.0f && f5 < Math.max(pointFF.y, pointFF2.y) + 40.0f;
    }

    public static boolean L() {
        if (D0()) {
            return ((o1.k) B.e(n0.c.HARMONIC.toString())).H1();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return false;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return false;
        }
        return ((w0) r0VarQ).f0();
    }

    public static void L0(int i4, int i5, boolean z3) {
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            if (z3 || (i4 >= jVar.q1() && i5 <= jVar.P())) {
                jVar.Z(i4, i5, jVar.R0(), jVar.Z0());
                return;
            }
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            ((h0) r0VarQ).u1(i4, i5);
        } else if (r0VarQ instanceof n2.g0) {
            ((n2.g0) r0VarQ).c1(i4, i5);
        }
    }

    public static float M() {
        if (D0()) {
            return ((o1.k) B.e(n0.c.HARMONIC.toString())).Y1(true);
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1.0f;
        }
        r0 r0VarQ = e1VarS.q();
        x0 x0Var = (x0) e1VarS.r();
        if (r0VarQ == null || !x0Var.n()) {
            return -1.0f;
        }
        return x0Var.f9683s.f9697h;
    }

    public static void M0(int i4, int i5, boolean z3) {
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            if (z3 || (i4 >= jVar.G1() && i5 <= jVar.p2())) {
                jVar.Z(jVar.v0(), jVar.W0(), i4, i5);
                return;
            }
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            ((h0) r0VarQ).x1(i4, i5 - i4);
        } else if (r0VarQ instanceof n2.g0) {
            ((n2.g0) r0VarQ).e1(i4, i5 - i4);
        }
    }

    public static int N() {
        if (D0()) {
            return (int) ((g0.l) B.e(n0.f.PW_ANGLE.toString())).d3();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR == null) {
            return -1;
        }
        if (p1VarR.l()) {
            return ((h0) r0VarQ).N0();
        }
        if (p1VarR.m()) {
            return ((n2.g0) r0VarQ).K0();
        }
        return -1;
    }

    public static void N0(int i4) {
        if (D0()) {
            ((b0.f) B.e(n0.a.BM_LINE.toString())).e3(i4);
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ != null) {
            r0VarQ.y(i4);
        }
    }

    public static int O() {
        if (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.d) {
            return ((com.sonoptek.pvus_android.view.d) com.sonoptek.pvus_android.view.f.d()).c();
        }
        if (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.e) {
            return ((com.sonoptek.pvus_android.view.e) com.sonoptek.pvus_android.view.f.d()).c();
        }
        return 0;
    }

    public static void O0(int i4) {
        L = i4;
    }

    public static int P() {
        if (D0()) {
            return ((g0.p) B.e(n0.f.PW_GAIN.toString())).k();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null) {
            return -1;
        }
        if (p1VarR.l()) {
            return ((h0) r0VarQ).P0();
        }
        if (p1VarR.m()) {
            return ((n2.g0) r0VarQ).M0();
        }
        return -1;
    }

    public static void P0(boolean z3, float f4, int i4) {
        p1 p1VarR;
        if (!D0() && (p1VarR = e1.s(null).r()) != null && p1VarR.n() && p1VarR.b()) {
            ((w0) e1.s(null).q()).m0(z3, f4, i4);
        }
    }

    public static int Q() {
        if (D0()) {
            return ((g0.t) B.e(n0.f.PW_VOLUME.toString())).E0();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).Q0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).N0();
        }
        return -1;
    }

    public static void Q0(String str) {
        List<String> list = f5964u;
        if (list == null || !list.contains(str)) {
            H = false;
        } else {
            H = true;
        }
        R0(false);
    }

    public static int R() {
        if (D0()) {
            g0.q qVar = (g0.q) B.e(n0.f.PW_PRF.toString());
            return qVar.N(qVar.y());
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((h0) r0VarQ).R0();
    }

    public static void R0(boolean z3) {
        I = z3;
    }

    public static int S(int i4) {
        if (D0()) {
            return ((g0.q) B.e(n0.f.PW_PRF.toString())).N(i4);
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).A.f9373t[i4];
    }

    public static void S0(int i4, int i5, int i6, int i7) {
        if (D0()) {
            ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).Z(i4, i5, i6, i7);
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            h0 h0Var = (h0) r0VarQ;
            h0Var.u1(i4, i5);
            h0Var.x1(i6, i7 - i6);
        } else if (r0VarQ instanceof n2.g0) {
            n2.g0 g0Var = (n2.g0) r0VarQ;
            g0Var.c1(i4, i5);
            g0Var.e1(i6, i7 - i6);
        }
    }

    public static int T() {
        if (D0()) {
            return ((g0.q) B.e(n0.f.PW_PRF.toString())).y();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((h0) r0VarQ).S0();
    }

    public static void T0(int i4) {
        if (D0()) {
            ((g0.h) B.e(n0.b.COLOR_POWER_GAIN.toString())).i(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (p1VarR.l()) {
                ((h0) r0VarQ).t1(i4);
            } else if (p1VarR.m()) {
                ((n2.g0) r0VarQ).b1(i4);
            }
        }
    }

    public static int U() {
        if (D0()) {
            return ((g0.q) B.e(n0.f.PW_PRF.toString())).D() + 1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).c1();
    }

    public static void U0(int i4) {
        if (D0()) {
            g0.i iVar = (g0.i) B.e(n0.b.COLOR_POWER_PRF.toString());
            if (i4 < iVar.u() || i4 > iVar.D()) {
                i4 = iVar.u();
            }
            iVar.q(i4);
            return;
        }
        if (i4 >= v()) {
            i4 = 0;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            if (!e1VarS.r().l() || i4 >= v()) {
                return;
            }
            ((h0) r0VarQ).w1(i4);
        }
    }

    public static int V() {
        if (D0()) {
            return ((g0.t) B.e(n0.f.PW_VOLUME.toString())).B2();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).U0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).O0();
        }
        return -1;
    }

    public static void V0(int i4) {
        int i5;
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            int iJ = i4 % (jVar.J() + 1);
            float fX = jVar.x(iJ);
            float fX2 = jVar.x(jVar.o());
            int iV0 = jVar.v0();
            int iW0 = jVar.W0();
            int iR0 = jVar.R0();
            int iZ0 = jVar.Z0();
            int iP = jVar.P();
            PointF pointF = new PointF((float) (((double) ((iV0 + iW0) + 1)) / 2.0d), (float) (((double) ((iR0 + iZ0) + 1)) / 2.0d));
            com.sonoptek.pvus_android.view.f.d();
            z zVarF = com.sonoptek.pvus_android.view.f.f();
            if (zVarF == null || zVarF.n() == 0.0f) {
                jVar.I(i4);
                return;
            }
            int i6 = iW0 - iV0;
            int i7 = (int) ((((double) zVarF.z(zVarF.F(pointF, (int) fX2), (int) fX).x) - (((double) (i6 + 1)) / 2.0d)) + 0.5d);
            int i8 = i7 + i6;
            if (i7 < 0) {
                i8 = i6 + 0;
                i7 = 0;
            }
            if (i8 >= iP) {
                i8 = iP - 1;
                i7 = i8 - i6;
            }
            jVar.I(iJ);
            jVar.Z(i7, i8, iR0, iZ0);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (!p1VarR.l()) {
                if (p1VarR.m()) {
                    n2.g0 g0Var = (n2.g0) r0VarQ;
                    int iE0 = g0Var.E0();
                    int iD0 = g0Var.D0();
                    int iH0 = g0Var.H0();
                    int iJ0 = g0Var.J0();
                    int i9 = i4 == 1 ? -7 : i4 == 2 ? 7 : 0;
                    com.sonoptek.pvus_android.view.f.d();
                    z zVarF2 = com.sonoptek.pvus_android.view.f.f();
                    PointF pointFZ = zVarF2.z(zVarF2.F(new PointF((iE0 + iD0) / 2.0f, iH0 + (iJ0 / 2.0f)), i4), i9);
                    float f4 = pointFZ.x;
                    double d4 = ((double) (iD0 - iE0)) / 2.0d;
                    int i10 = (int) ((((double) pointFZ.y) - (((double) iJ0) / 2.0d)) + 0.5d);
                    g0Var.f1(i9);
                    g0Var.c1((int) ((((double) f4) - d4) + 0.5d), (int) (((double) f4) + d4 + 0.5d));
                    g0Var.e1(i10, iJ0);
                    return;
                }
                return;
            }
            h0 h0Var = (h0) r0VarQ;
            int iJ02 = i4 % h0Var.J0();
            int iV02 = ((i0) p1VarR).V0(iJ02);
            int iH02 = h0Var.H0();
            int iC0 = h0Var.C0();
            int iB0 = h0Var.B0();
            int iG0 = h0Var.G0();
            int iK0 = h0Var.K0();
            int iW = p1VarR.w();
            PointF pointF2 = new PointF((float) (((double) ((iC0 + iB0) + 1)) / 2.0d), (float) (((double) iG0) + (((double) iK0) / 2.0d)));
            com.sonoptek.pvus_android.view.f.d();
            z zVarF3 = com.sonoptek.pvus_android.view.f.f();
            int i11 = iB0 - iC0;
            int i12 = (int) ((((double) zVarF3.z(zVarF3.F(pointF2, iH02), iV02).x) - (((double) (i11 + 1)) / 2.0d)) + 0.5d);
            int i13 = i12 + i11;
            if (i12 < 0) {
                i13 = i11 + 0;
                i5 = 0;
            } else {
                i5 = i12;
            }
            if (i13 >= iW) {
                i13 = iW - 1;
                i5 = i13 - i11;
            }
            h0Var.z1(iJ02);
            h0Var.u1(i5, i13);
        }
    }

    public static int W() {
        if (D0()) {
            g0.s sVar = (g0.s) B.e(n0.f.PW_STEER.toString());
            return sVar.x(sVar.o());
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR.l()) {
            return ((h0) r0VarQ).V0();
        }
        if (p1VarR.m()) {
            return ((n2.g0) r0VarQ).P0();
        }
        return -1;
    }

    public static void W0(int i4) {
        if (D0()) {
            g0.k kVar = (g0.k) B.e(n0.b.COLOR_POWER_WF.toString());
            if (i4 < kVar.r1() || i4 > kVar.m0()) {
                i4 = kVar.r1();
            }
            kVar.D1(i4);
            return;
        }
        if (i4 >= C()) {
            i4 = 0;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.l() || i4 >= C()) {
                return;
            }
            ((h0) r0VarQ).A1(i4);
        }
    }

    public static int X() {
        if (D0()) {
            return ((g0.s) B.e(n0.f.PW_STEER.toString())).o();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR.l()) {
            return ((h0) r0VarQ).X0();
        }
        if (!p1VarR.m()) {
            return -1;
        }
        int iP0 = ((n2.g0) r0VarQ).P0();
        if (iP0 != -7) {
            return iP0 != 7 ? 0 : 2;
        }
        return 1;
    }

    public static void X0(boolean z3) {
        if (D0()) {
            ((o1.h) B.e(n0.c.COMPOUND.toString())).d0(z3);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ != null && p1VarR.n() && p1VarR.d()) {
                ((w0) r0VarQ).n0(z3);
            }
        }
    }

    public static int Y() {
        if (D0()) {
            return ((g0.s) B.e(n0.f.PW_STEER.toString())).J() + 1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((h0) r0VarQ).Y0();
    }

    public static void Y0(int i4) {
        if (D0()) {
            o1.i iVar = (o1.i) B.e(n0.c.DYNAMIC_RANGE.toString());
            if (i4 < iVar.r()) {
                i4 = iVar.r();
            }
            if (i4 > iVar.K()) {
                i4 = iVar.K();
            }
            iVar.G(i4);
            return;
        }
        if (i4 > 110) {
            i4 = 40;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1.s(null).q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.n()) {
                return;
            }
            ((w0) r0VarQ).o0(i4);
        }
    }

    public static int Z() {
        if (D0()) {
            g0.t tVar = (g0.t) B.e(n0.f.PW_VOLUME.toString());
            return (int) tVar.O(tVar.B1());
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).b1();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).R0();
        }
        return -1;
    }

    public static void Z0(int i4) {
        r0 r0VarQ;
        if (D0()) {
            b0.p pVar = (b0.p) B.e(n0.a.ZOOM.toString());
            if (i4 < pVar.E2()) {
                i4 = pVar.E2();
            }
            if (i4 > pVar.f0()) {
                i4 = pVar.f0();
            }
            pVar.o2(i4);
            return;
        }
        if (i4 > 3) {
            i4 = 3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (r0VarQ = e1VarS.q()) == null) {
            return;
        }
        r0VarQ.D(i4);
    }

    public static boolean a() {
        p1 p1VarR;
        if (D0() || (p1VarR = e1.s(null).r()) == null) {
            return false;
        }
        return p1VarR.b();
    }

    public static int a0() {
        if (D0()) {
            return ((g0.t) B.e(n0.f.PW_VOLUME.toString())).B1();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR.l()) {
            return ((h0) r0VarQ).c1();
        }
        if (!p1VarR.m()) {
            return -1;
        }
        int iQ0 = ((n2.g0) r0VarQ).Q0();
        if (iQ0 == 128) {
            return 1;
        }
        return iQ0 == 255 ? 2 : 0;
    }

    public static void a1(boolean z3) {
        K = z3;
    }

    public static boolean b() {
        p1 p1VarR;
        if (D0()) {
            return ((o1.h) B.e(n0.c.COMPOUND.toString())).W().length > 0;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (p1VarR = e1VarS.r()) == null) {
            return false;
        }
        return p1VarR.d();
    }

    public static int b0() {
        float fR0;
        float fB1;
        if (D0()) {
            g0.t tVar = (g0.t) B.e(n0.f.PW_VOLUME.toString());
            fR0 = tVar.b0(tVar.B1());
        } else {
            r0 r0VarQ = e1.s(null).q();
            if (r0VarQ instanceof h0) {
                fB1 = (float) (((double) ((((((h0) r0VarQ).b1() / e1.s(null).r().f9527g.a(r0VarQ.n())) * 1560.0f) / 2.0f) * 1000.0f)) + 0.5d);
                return (int) fB1;
            }
            if (!(r0VarQ instanceof n2.g0)) {
                return -1;
            }
            fR0 = (((((n2.g0) r0VarQ).R0() / ((j0) r0VarQ.f9561c).f9527g.a(r0VarQ.n())) * 1560.0f) / 2.0f) * 1000.0f;
        }
        fB1 = fR0 + 0.5f;
        return (int) fB1;
    }

    public static void b1(int i4) {
        if (D0()) {
            o1.l lVar = (o1.l) B.e(n0.c.IMAGE_ENHANCE.toString());
            if (i4 > lVar.J2()) {
                i4 = 0;
            }
            lVar.C2(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.n()) {
                return;
            }
            w0 w0Var = (w0) r0VarQ;
            if (i4 > 4) {
                i4 = 0;
            }
            w0Var.p0(i4);
        }
    }

    public static void c() {
        f1(K() - 1);
    }

    public static int c0() {
        p1 p1VarR;
        if (D0()) {
            b0.g gVar = (b0.g) B.e(n0.a.BASE.toString());
            if (gVar != null) {
                return gVar.u2();
            }
            return -1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (p1VarR = e1VarS.r()) == null) {
            return -1;
        }
        return p1VarR.w();
    }

    public static void c1(int i4) {
        if (D0()) {
            o1.j jVar = (o1.j) B.e(n0.c.FOCUS.toString());
            if (i4 > jVar.e()) {
                i4 = 0;
            }
            jVar.g(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.n()) {
                return;
            }
            if (i4 > 3) {
                i4 = 0;
            }
            ((w0) r0VarQ).s0(i4);
        }
    }

    public static void d() {
        Z0(G() - 1);
    }

    public static String d0() {
        return D0() ? B.h().f() : e1.s(null).r().f9523c;
    }

    public static void d1(boolean z3) {
        f5965v = z3;
    }

    public static int e() {
        p1 p1VarR;
        if (D0() || (p1VarR = e1.s(null).r()) == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).L();
    }

    public static String e0() {
        p1 p1VarR;
        return D0() ? B.h().g() : (e1.s(null) == null || (p1VarR = e1.s(null).r()) == null) ? s0.a.f11071l : p1VarR.f9522b;
    }

    public static void e1(boolean z3) {
        f5966w = z3;
    }

    public static void f(Set<String> set) {
        String str;
        d2.a aVarI;
        String str2;
        String strG0 = g0();
        for (String str3 : set) {
            if (str3.equals(n0.a.GAIN.toString())) {
                str = s0.a.f11071l + K();
                aVarI = d2.a.i(null);
                str2 = "gain";
            } else if (str3.equals(n0.a.ZOOM.toString())) {
                str = s0.a.f11071l + G();
                aVarI = d2.a.i(null);
                str2 = "zoom";
            } else if (str3.equals(n0.c.HARMONIC.toString())) {
                str = L() ? "1" : "0";
                aVarI = d2.a.i(null);
                str2 = "harmonic";
            } else if (str3.equals(n0.c.DYNAMIC_RANGE.toString())) {
                str = s0.a.f11071l + E();
                aVarI = d2.a.i(null);
                str2 = "dr";
            } else if (str3.equals(n0.c.IMAGE_ENHANCE.toString())) {
                str = s0.a.f11071l + H();
                aVarI = d2.a.i(null);
                str2 = "enhance";
            } else if (str3.equals(n0.c.FOCUS.toString())) {
                if (h0() == b.B || h0() == b.BM) {
                    str = s0.a.f11071l + I();
                    aVarI = d2.a.i(null);
                    str2 = "focus";
                }
            } else if (str3.equals(n0.c.VGAIN.toString())) {
                d2.a.i(null).n(strG0, "ENH_VGAIN_0", s0.a.f11071l + j0(0));
                d2.a.i(null).n(strG0, "ENH_VGAIN_1", s0.a.f11071l + j0(1));
                d2.a.i(null).n(strG0, "ENH_VGAIN_2", s0.a.f11071l + j0(2));
                d2.a.i(null).n(strG0, "ENH_VGAIN_3", s0.a.f11071l + j0(3));
                d2.a.i(null).n(strG0, "ENH_VGAIN_4", s0.a.f11071l + j0(4));
                d2.a.i(null).n(strG0, "ENH_VGAIN_5", s0.a.f11071l + j0(5));
                d2.a.i(null).n(strG0, "ENH_VGAIN_6", s0.a.f11071l + j0(6));
                str = s0.a.f11071l + j0(7);
                aVarI = d2.a.i(null);
                str2 = "ENH_VGAIN_7";
            } else if (str3.equals(n0.b.COLOR_POWER_PRF.toString())) {
                str = s0.a.f11071l + u();
                aVarI = d2.a.i(null);
                str2 = "bc_PRF";
            } else if (str3.equals(n0.b.COLOR_POWER_WF.toString())) {
                str = s0.a.f11071l + B();
                aVarI = d2.a.i(null);
                str2 = "bc_WF";
            } else if (str3.equals(n0.b.COLOR_POWER_GAIN.toString())) {
                str = s0.a.f11071l + s();
                aVarI = d2.a.i(null);
                str2 = "bc_gain";
            } else if (str3.equals(n0.b.COLOR_POWER_QUADRANGLE.toString())) {
                d2.a.i(null).n(strG0, "COLOR_BC_LINE_START", s0.a.f11071l + k());
                d2.a.i(null).n(strG0, "COLOR_BC_LINE_END", s0.a.f11071l + j());
                d2.a.i(null).n(strG0, "COLOR_BC_START_POINT", s0.a.f11071l + m());
                d2.a.i(null).n(strG0, "COLOR_BC_VOLUME", s0.a.f11071l + n());
                str = s0.a.f11071l + y();
                aVarI = d2.a.i(null);
                str2 = "COLOR_BC_STEER_INDEX";
            } else if (str3.equals(n0.f.PW_GAIN.toString())) {
                str = s0.a.f11071l + P();
                aVarI = d2.a.i(null);
                str2 = "COLOR_BD_GAIN";
            } else if (str3.equals(n0.f.PW_PRF.toString())) {
                str = s0.a.f11071l + T();
                aVarI = d2.a.i(null);
                str2 = "bd_PRF";
            } else if (str3.equals(n0.f.PW_STEER.toString())) {
                str = s0.a.f11071l + X();
                aVarI = d2.a.i(null);
                str2 = "COLOR_BD_STEER_INDEX";
            } else if (str3.equals(n0.f.PW_ANGLE.toString())) {
                str = s0.a.f11071l + N();
                aVarI = d2.a.i(null);
                str2 = "bd_angle";
            } else if (str3.equals(n0.f.PW_VOLUME.toString())) {
                d2.a.i(null).n(strG0, "COLOR_BD_VOLUME_INDEX", s0.a.f11071l + a0());
                d2.a.i(null).n(strG0, "COLOR_BD_LINE_POS", s0.a.f11071l + Q());
                str = s0.a.f11071l + V();
                aVarI = d2.a.i(null);
                str2 = "COLOR_BD_START_POINT";
            }
            aVarI.n(strG0, str2, str);
        }
        set.clear();
    }

    public static int f0() {
        return E;
    }

    public static void f1(int i4) {
        r0 r0VarQ;
        if (D0()) {
            ((b0.i) B.e(n0.a.GAIN.toString())).i(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null || (r0VarQ = e1VarS.q()) == null) {
            return;
        }
        r0VarQ.z(i4);
    }

    public static void g(JSONObject jSONObject) {
        g0.j jVar;
        b0.h hVar;
        b0.h hVar2;
        b0.h hVar3;
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("gain")) {
                f1(Integer.parseInt(jSONObject.getString("gain")));
            }
            if (!jSONObject.isNull("zoom")) {
                Z0(Integer.parseInt(jSONObject.getString("zoom")));
            }
            if (!jSONObject.isNull("harmonic")) {
                g1(Integer.parseInt(jSONObject.getString("harmonic")) == 1);
            }
            if (!jSONObject.isNull("dr")) {
                Y0(Integer.parseInt(jSONObject.getString("dr")));
            }
            if (!jSONObject.isNull("enhance")) {
                b1(Integer.parseInt(jSONObject.getString("enhance")));
            }
            if (!jSONObject.isNull("focus")) {
                c1(Integer.parseInt(jSONObject.getString("focus")));
            }
            if (!jSONObject.isNull("ENH_VGAIN_0")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_0")), 0);
            }
            if (!jSONObject.isNull("ENH_VGAIN_1")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_1")), 1);
            }
            if (!jSONObject.isNull("ENH_VGAIN_2")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_2")), 2);
            }
            if (!jSONObject.isNull("ENH_VGAIN_3")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_3")), 3);
            }
            if (!jSONObject.isNull("ENH_VGAIN_4")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_4")), 4);
            }
            if (!jSONObject.isNull("ENH_VGAIN_5")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_5")), 5);
            }
            if (!jSONObject.isNull("ENH_VGAIN_6")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_6")), 6);
            }
            if (!jSONObject.isNull("ENH_VGAIN_7")) {
                x1(Integer.parseInt(jSONObject.getString("ENH_VGAIN_7")), 7);
            }
            if (!jSONObject.isNull("enablePA") && (hVar3 = (b0.h) B.e(n0.a.BUILD_IN_PA.toString())) != null) {
                if (jSONObject.getInt("enablePA") == 1) {
                    hVar3.d1(true);
                } else {
                    hVar3.d1(false);
                }
            }
            if (!jSONObject.isNull("bc_darkPassFilter") && (hVar2 = (b0.h) B.e(n0.a.BUILD_IN_PA.toString())) != null) {
                if (Integer.parseInt(jSONObject.getString("bc_darkPassFilter")) == 1) {
                    hVar2.e3(true, -1);
                } else {
                    hVar2.e3(false, -1);
                }
            }
            if (!jSONObject.isNull("bc_simplify") && (hVar = (b0.h) B.e(n0.a.BUILD_IN_PA.toString())) != null) {
                if (Integer.parseInt(jSONObject.getString("bc_simplify")) == 1) {
                    hVar.f3(true);
                } else {
                    hVar.f3(false);
                }
            }
            if (!jSONObject.isNull("bc_PRF")) {
                U0(Integer.parseInt(jSONObject.getString("bc_PRF")));
            }
            if (!jSONObject.isNull("bd_PRF")) {
                p1(Integer.parseInt(jSONObject.getString("bd_PRF")));
            }
            if (!jSONObject.isNull("bc_WF")) {
                W0(Integer.parseInt(jSONObject.getString("bc_WF")));
            }
            if (!jSONObject.isNull("COLOR_BC_VOLUME") && !jSONObject.isNull("COLOR_BC_START_POINT")) {
                int i4 = Integer.parseInt(jSONObject.getString("COLOR_BC_VOLUME"));
                int i5 = Integer.parseInt(jSONObject.getString("COLOR_BC_START_POINT"));
                M0(i5, i4 + i5, false);
            }
            if (!jSONObject.isNull("bc_gain")) {
                T0(Integer.parseInt(jSONObject.getString("bc_gain")));
            }
            if (!jSONObject.isNull("COLOR_BC_LINE_START") && !jSONObject.isNull("COLOR_BC_LINE_END") && (jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())) != null) {
                int i6 = Integer.parseInt(jSONObject.getString("COLOR_BC_LINE_START"));
                int iY = Integer.parseInt(jSONObject.getString("COLOR_BC_LINE_END"));
                if (iY - i6 > jVar.Y()) {
                    iY = (jVar.Y() + i6) - 1;
                }
                L0(i6, iY, false);
            }
            if (!jSONObject.isNull("COLOR_BC_STEER_INDEX")) {
                V0(Integer.parseInt(jSONObject.getString("COLOR_BC_STEER_INDEX")));
            }
            if (!jSONObject.isNull("COLOR_BD_STEER_INDEX")) {
                r1(Integer.parseInt(jSONObject.getString("COLOR_BD_STEER_INDEX")));
            }
            if (!jSONObject.isNull("COLOR_BD_START_POINT")) {
                q1(Integer.parseInt(jSONObject.getString("COLOR_BD_START_POINT")));
            }
            if (!jSONObject.isNull("COLOR_BD_LINE_POS")) {
                n1(Integer.parseInt(jSONObject.getString("COLOR_BD_LINE_POS")));
            }
            if (!jSONObject.isNull("COLOR_BD_GAIN")) {
                m1(Integer.parseInt(jSONObject.getString("COLOR_BD_GAIN")));
            }
            if (!jSONObject.isNull("bd_angle")) {
                k1(Integer.parseInt(jSONObject.getString("bd_angle")));
            }
            if (jSONObject.isNull("COLOR_BD_VOLUME_INDEX")) {
                return;
            }
            s1(Integer.parseInt(jSONObject.getString("COLOR_BD_VOLUME_INDEX")));
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static String g0() {
        p1 p1VarR;
        StringBuilder sb;
        String str;
        if (!D0()) {
            return (e1.s(null) == null || (p1VarR = e1.s(null).r()) == null) ? s0.a.f11071l : p1VarR.K();
        }
        b0.o oVar = C;
        if (oVar == null) {
            return s0.a.f11071l;
        }
        String strN0 = oVar.n0(oVar.o1());
        String strSubstring = strN0.substring(strN0.indexOf(".") + 1);
        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("."));
        if (!strN0.endsWith("default")) {
            strSubstring2 = strSubstring2 + strN0.substring(strN0.length() - 1).toUpperCase();
        }
        b0.h hVar = (b0.h) B.e(n0.a.BUILD_IN_PA.toString());
        if (hVar == null || !hVar.f13819c) {
            return strSubstring2;
        }
        if (hVar.S1()) {
            sb = new StringBuilder();
            sb.append(strSubstring2);
            str = "_PAON";
        } else {
            sb = new StringBuilder();
            sb.append(strSubstring2);
            str = "_PAOFF";
        }
        sb.append(str);
        return sb.toString();
    }

    public static void g1(boolean z3) {
        if (D0()) {
            ((o1.k) B.e(n0.c.HARMONIC.toString())).Y0(z3);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.n()) {
                return;
            }
            ((w0) r0VarQ).v0(z3);
        }
    }

    public static int h() {
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            if (jVar != null) {
                return jVar.G1();
            }
            return -1;
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR == null) {
            return -1;
        }
        if (p1VarR.l()) {
            return ((i0) p1VarR).A.f9358e;
        }
        if (!p1VarR.m()) {
            return -1;
        }
        return 10;
    }

    public static b h0() {
        r0 r0VarQ;
        if (D0()) {
            String strJ2 = ((b0.n) B.e(n0.a.MODE.toString())).j2();
            if (strJ2.equals(n0.e.MODE_B.toString())) {
                return b.B;
            }
            if (strJ2.equals(n0.e.MODE_BM.toString())) {
                return b.BM;
            }
            if (strJ2.equals(n0.e.MODE_BC.toString())) {
                return b.Color;
            }
            if (strJ2.equals(n0.e.MODE_BP.toString())) {
                return b.PDI;
            }
            if (strJ2.equals(n0.e.MODE_BD.toString())) {
                return b.PW;
            }
        } else {
            e1 e1VarS = e1.s(null);
            if (e1VarS != null && (r0VarQ = e1VarS.q()) != null) {
                int iM = r0VarQ.m();
                if (iM == 0) {
                    return b.B;
                }
                if (iM == 1) {
                    return b.BM;
                }
                if (iM == 5) {
                    return b.Color;
                }
                if (iM == 6) {
                    return b.PDI;
                }
                if (iM == 7) {
                    return b.PW;
                }
            }
        }
        return b.B;
    }

    public static void h1(boolean z3) {
        G = z3;
    }

    public static float i() {
        if (D0()) {
            return ((g0.f) B.e(n0.b.COLOR_F0.toString())).z();
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR.l()) {
            return ((i0) p1VarR).A.f9365l;
        }
        if (p1VarR.m()) {
            return ((j0) p1VarR).A.f9399h;
        }
        return -1.0f;
    }

    public static c i0(b bVar, boolean z3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (!g0().startsWith("EU-1C")) {
            if (!B0()) {
                f5 = 0.5f;
                if (f4 >= 6.0d) {
                    if (bVar == b.PW) {
                        f5 = 1.0f;
                        f6 = 0.6f;
                        f7 = 0.6f;
                    } else if (bVar == b.Color || bVar == b.PDI) {
                        f7 = 0.5f;
                        f6 = 0.7f;
                    } else if (z3) {
                        f6 = 0.7f;
                        f5 = f6;
                        f7 = 0.6f;
                    } else {
                        f7 = 0.5f;
                        f6 = 0.6f;
                    }
                } else if (bVar == b.PW) {
                    f8 = 1.9f;
                    f5 = f8;
                    f7 = 0.8f;
                    f6 = 0.4f;
                } else if (bVar == b.Color || bVar == b.PDI) {
                    f6 = 0.5f;
                    f7 = 1.0f;
                } else if (z3) {
                    f6 = 0.5f;
                    f7 = 0.9f;
                } else {
                    f7 = 0.8f;
                    f6 = 0.4f;
                }
            } else if (bVar == b.PW) {
                f8 = 1.3f;
                f5 = f8;
                f7 = 0.8f;
                f6 = 0.4f;
            } else if (bVar == b.Color || bVar == b.PDI) {
                f7 = 0.7f;
                f6 = 0.6f;
            } else if (z3) {
                f6 = 1.0f;
                f5 = 1.0f;
                f7 = 0.7f;
            } else {
                f6 = 0.9f;
                f5 = f6;
                f7 = 0.6f;
            }
            c cVar = new c();
            cVar.f5979c = f7;
            cVar.f5980d = f6;
            cVar.f5981e = f5;
            cVar.f5977a = 1;
            return cVar;
        }
        f6 = 0.3f;
        f7 = 0.2f;
        f5 = f6;
        c cVar2 = new c();
        cVar2.f5979c = f7;
        cVar2.f5980d = f6;
        cVar2.f5981e = f5;
        cVar2.f5977a = 1;
        return cVar2;
    }

    public static void i1(c1 c1Var) {
        B = c1Var;
    }

    public static int j() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).W0();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).B0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).D0();
        }
        return -1;
    }

    public static int j0(int i4) {
        if (D0()) {
            return ((o1.m) B.e(n0.c.VGAIN.toString())).P2()[i4];
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return -1;
        }
        return ((w0) r0VarQ).g0(i4);
    }

    public static void j1(boolean z3) {
        A = z3;
    }

    public static int k() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).v0();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).C0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).E0();
        }
        return -1;
    }

    public static int k0() {
        p1 p1VarR;
        if (D0()) {
            c2.a aVar = (c2.a) B.e(n0.d.WIFI_CHANNEL.toString());
            if (aVar != null) {
                return aVar.M2();
            }
            return 0;
        }
        if (e1.s(null) == null || (p1VarR = e1.s(null).r()) == null) {
            return 0;
        }
        return p1VarR.f9526f;
    }

    public static void k1(int i4) {
        if (i4 >= 90 || i4 < -90) {
            i4 = -90;
        }
        if (D0()) {
            ((g0.l) B.e(n0.f.PW_ANGLE.toString())).e3(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (p1VarR != null) {
                if (p1VarR.l()) {
                    ((h0) r0VarQ).B1(i4);
                } else if (p1VarR.m()) {
                    ((n2.g0) r0VarQ).g1(i4);
                }
            }
        }
    }

    public static int l() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).s2();
        }
        p1 p1VarR = e1.s(null).r();
        return p1VarR.l() ? ((i0) p1VarR).R0() : p1VarR.m() ? 64 : -1;
    }

    public static boolean l0() {
        if (D0()) {
            return ((o1.k) B.e(n0.c.HARMONIC.toString())) != null;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return false;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.n()) {
            return false;
        }
        return ((w0) r0VarQ).h0();
    }

    public static void l1(int i4) {
        if (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.d) {
            ((com.sonoptek.pvus_android.view.d) com.sonoptek.pvus_android.view.f.d()).R(i4);
        } else if (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.e) {
            ((com.sonoptek.pvus_android.view.e) com.sonoptek.pvus_android.view.f.d()).L(i4);
        }
    }

    public static int m() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).R0();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).G0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).H0();
        }
        return -1;
    }

    public static void m0() {
        b1((H() + 1) % 4);
    }

    public static void m1(int i4) {
        if (D0()) {
            g0.p pVar = (g0.p) B.e(n0.f.PW_GAIN.toString());
            if (i4 < pVar.n() || i4 > pVar.j()) {
                i4 = pVar.n();
            }
            pVar.i(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ != null) {
                if (p1VarR.l()) {
                    ((h0) r0VarQ).E1(i4);
                } else if (p1VarR.m()) {
                    ((n2.g0) r0VarQ).j1(i4);
                }
            }
        }
    }

    public static int n() {
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            return jVar.Z0() - jVar.R0();
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            return ((h0) r0VarQ).K0();
        }
        if (r0VarQ instanceof n2.g0) {
            return ((n2.g0) r0VarQ).J0();
        }
        return -1;
    }

    public static void n0() {
        c1((I() + 1) % 4);
    }

    public static void n1(int i4) {
        if (D0()) {
            ((g0.t) B.e(n0.f.PW_VOLUME.toString())).t2(i4);
            if (((b0.n) B.e(n0.a.MODE.toString())).j2().equals(n0.e.MODE_BD.toString())) {
                g0.r rVar = (g0.r) B.e(n0.f.PW_SINGLE_TASK.toString());
                rVar.i3(6);
                rVar.h3();
                return;
            }
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            ((h0) r0VarQ).F1(i4);
        } else if (r0VarQ instanceof n2.g0) {
            ((n2.g0) r0VarQ).k1(i4);
        }
    }

    public static float o() {
        if (D0()) {
            return ((g0.n) B.e(n0.f.PW_F0.toString())).z();
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR.l()) {
            return ((i0) p1VarR).A.f9375v;
        }
        if (p1VarR.m()) {
            return ((j0) p1VarR).A.f9399h;
        }
        return -1.0f;
    }

    public static void o0() {
        f1(K() + 1);
    }

    public static void o1(int i4, int i5) {
        if (D0()) {
            g0.t tVar = (g0.t) B.e(n0.f.PW_VOLUME.toString());
            tVar.t2(i4);
            tVar.M1(i5);
            if (((b0.n) B.e(n0.a.MODE.toString())).j2().equals(n0.e.MODE_BD.toString())) {
                g0.r rVar = (g0.r) B.e(n0.f.PW_SINGLE_TASK.toString());
                rVar.i3(6);
                rVar.h3();
                return;
            }
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ instanceof h0) {
            h0 h0Var = (h0) r0VarQ;
            h0Var.F1(i4);
            h0Var.H1(i5);
        } else if (r0VarQ instanceof n2.g0) {
            n2.g0 g0Var = (n2.g0) r0VarQ;
            g0Var.k1(i4);
            g0Var.l1(i5, g0Var.Q0());
        }
    }

    public static float p(float f4) {
        e1 e1VarS;
        if (D0() || (e1VarS = e1.s(null)) == null) {
            return f4;
        }
        return e1VarS.r().f9523c.startsWith("PA-3C") ? ((h0) e1VarS.q()).Z0() : f4;
    }

    public static void p0() {
        Z0(G() + 1);
    }

    public static void p1(int i4) {
        if (D0()) {
            g0.q qVar = (g0.q) B.e(n0.f.PW_PRF.toString());
            if (i4 < qVar.u() || i4 > qVar.D()) {
                i4 = qVar.u();
            }
            qVar.q(i4);
            if (((b0.n) B.e(n0.a.MODE.toString())).j2().equals(n0.e.MODE_BD.toString())) {
                g0.r rVar = (g0.r) B.e(n0.f.PW_SINGLE_TASK.toString());
                rVar.i3(8);
                rVar.j3(qVar.y());
                return;
            }
            return;
        }
        if (i4 >= U()) {
            i4 = 0;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.l() || i4 >= U()) {
                return;
            }
            ((h0) r0VarQ).G1(i4);
        }
    }

    public static int q() {
        return L;
    }

    public static void q0() {
        f5964u = Arrays.asList(f5968y);
    }

    public static void q1(int i4) {
        if (D0()) {
            ((g0.t) B.e(n0.f.PW_VOLUME.toString())).M1(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ != null) {
                if (p1VarR.l()) {
                    ((h0) r0VarQ).H1(i4);
                } else if (p1VarR.m()) {
                    n2.g0 g0Var = (n2.g0) r0VarQ;
                    g0Var.l1(i4, g0Var.Q0());
                }
            }
        }
    }

    public static byte r() {
        p1 p1VarR;
        if (D0() || (p1VarR = e1.s(null).r()) == null || !p1VarR.b()) {
            return (byte) -1;
        }
        return ((w0) e1.s(null).q()).W();
    }

    public static void r0(Context context) {
        e1.s(context);
        w1.g.y().s(true);
        e1.s(null).H(f5967x);
        e1.s(null).b(true);
        d1(n2.o1.d(null).b("FREEZE_SAVE_IMAGE", false));
        e1(n2.o1.d(null).b("FREEZE_SAVE_VIDEO", false));
    }

    public static void r1(int i4) {
        if (D0()) {
            g0.s sVar = (g0.s) B.e(n0.f.PW_STEER.toString());
            g0.t tVar = (g0.t) B.e(n0.f.PW_VOLUME.toString());
            int iJ = i4 % (sVar.J() + 1);
            int iX = sVar.x(iJ);
            int iX2 = sVar.x(sVar.o());
            int iB2 = tVar.B2();
            int iO = (int) tVar.O(tVar.B1());
            int iE0 = tVar.E0();
            int iR = tVar.R();
            int iE1 = tVar.E1();
            double d4 = ((double) iO) / 2.0d;
            PointF pointF = new PointF(iE0, (float) (((double) iB2) + d4));
            com.sonoptek.pvus_android.view.f.d();
            z zVarF = com.sonoptek.pvus_android.view.f.f();
            if (zVarF == null || zVarF.n() == 0.0f) {
                sVar.I(iJ);
                return;
            }
            PointF pointFZ = zVarF.z(zVarF.F(pointF, iX2), iX);
            int i5 = (int) (((double) pointFZ.x) + 0.5d);
            int i6 = (int) ((((double) pointFZ.y) - d4) + 0.5d);
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 >= iR) {
                i5 = iR - 1;
            }
            int i7 = i6 < 0 ? 0 : i6 + iO >= iE1 ? iE1 - iO : i6;
            sVar.I(iJ);
            tVar.M1(i7);
            tVar.t2(i5);
            if (((b0.n) B.e(n0.a.MODE.toString())).j2().equals(n0.e.MODE_BD.toString())) {
                g0.r rVar = (g0.r) B.e(n0.f.PW_SINGLE_TASK.toString());
                rVar.i3(6);
                rVar.h3();
                return;
            }
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (!p1VarR.l()) {
                if (p1VarR.m()) {
                    n2.g0 g0Var = (n2.g0) r0VarQ;
                    if (g0Var.m() == 7) {
                        int i8 = -7;
                        if (i4 == -7) {
                            i8 = 7;
                        } else if (i4 != 0) {
                            i8 = 0;
                        }
                        int iN0 = g0Var.N0();
                        int iO0 = g0Var.O0();
                        int iR0 = g0Var.R0();
                        PointF pointF2 = new PointF(iN0, iO0 + (iR0 / 2));
                        z zVarP = z.p(MainActivity.o2() == 2 ? MyApplication.F() ? com.sonoptek.pvus_android.view.a.f6409k0 : com.sonoptek.pvus_android.view.a.f6407i0 : MyApplication.F() ? com.sonoptek.pvus_android.view.a.f6408j0 : com.sonoptek.pvus_android.view.a.f6403e0);
                        PointF pointFZ2 = zVarP.z(zVarP.F(pointF2, i4), i8);
                        int i9 = (int) (((double) pointFZ2.x) + 0.5d);
                        int i10 = (int) ((((double) pointFZ2.y) - (((double) iR0) / 2.0d)) + 0.5d);
                        int iQ0 = g0Var.Q0();
                        g0Var.m1(i8);
                        g0Var.k1(i9);
                        g0Var.l1(i10, iQ0);
                        return;
                    }
                    return;
                }
                return;
            }
            h0 h0Var = (h0) r0VarQ;
            int iY0 = i4 % h0Var.Y0();
            int iD1 = ((i0) p1VarR).d1(iY0);
            int iV0 = h0Var.V0();
            int iU0 = h0Var.U0();
            int iB1 = h0Var.b1();
            int iQ02 = h0Var.Q0();
            int iW = p1VarR.w();
            int iE = p1VarR.E();
            double d5 = ((double) iB1) / 2.0d;
            PointF pointF3 = new PointF(iQ02, (float) (((double) iU0) + d5));
            com.sonoptek.pvus_android.view.f.d();
            z zVarF2 = com.sonoptek.pvus_android.view.f.f();
            PointF pointFZ3 = zVarF2.z(zVarF2.F(pointF3, iV0), iD1);
            int i11 = (int) (((double) pointFZ3.x) + 0.5d);
            int i12 = (int) ((((double) pointFZ3.y) - d5) + 0.5d);
            if (i11 < 0) {
                i11 = 0;
            } else if (i11 >= iW) {
                i11 = iW - 1;
            }
            int i13 = i12 < 0 ? 0 : i12 + iB1 >= iE ? iE - iB1 : i12;
            h0Var.I1(iY0);
            h0Var.H1(i13);
            h0Var.F1(i11);
        }
    }

    public static int s() {
        if (D0()) {
            return ((g0.h) B.e(n0.b.COLOR_POWER_GAIN.toString())).k();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null) {
            return -1;
        }
        if (p1VarR.l()) {
            return ((h0) r0VarQ).A0();
        }
        if (p1VarR.m()) {
            return ((n2.g0) r0VarQ).C0();
        }
        return -1;
    }

    public static boolean s0() {
        p1 p1VarR;
        if (D0()) {
            return true;
        }
        if (e1.s(null) == null || (p1VarR = e1.s(null).r()) == null) {
            return false;
        }
        return p1VarR.k();
    }

    public static void s1(int i4) {
        if (D0()) {
            g0.t tVar = (g0.t) B.e(n0.f.PW_VOLUME.toString());
            if (i4 < tVar.z1() || i4 > tVar.y0()) {
                i4 = tVar.z1();
            }
            tVar.y1(i4);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (p1VarR.l()) {
                h0 h0Var = (h0) r0VarQ;
                if (i4 >= ((i0) p1VarR).A.f9378y) {
                    i4 = 0;
                }
                h0Var.J1(i4);
                return;
            }
            if (p1VarR.m()) {
                n2.g0 g0Var = (n2.g0) r0VarQ;
                g0Var.l1(g0Var.O0(), i4 == 1 ? 128 : i4 == 2 ? 255 : 64);
            }
        }
    }

    public static int t(int i4) {
        if (D0()) {
            return ((g0.i) B.e(n0.b.COLOR_POWER_PRF.toString())).N(i4);
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).A.f9364k[i4];
    }

    public static boolean t0() {
        return true;
    }

    public static void t1(boolean z3) {
        M = z3;
    }

    public static int u() {
        if (D0()) {
            return ((g0.i) B.e(n0.b.COLOR_POWER_PRF.toString())).y();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((h0) r0VarQ).F0();
    }

    public static boolean u0() {
        return I;
    }

    public static void u1(boolean z3) {
        J = z3;
    }

    public static int v() {
        if (D0()) {
            return ((g0.i) B.e(n0.b.COLOR_POWER_PRF.toString())).D() + 1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).U0();
    }

    public static boolean v0() {
        if (D0()) {
            return ((g0.i) B.e(n0.b.COLOR_POWER_PRF.toString())) != null;
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR != null) {
            return p1VarR.l();
        }
        return false;
    }

    public static void v1(int i4) {
        F = E != i4;
        n2.o1.d(null).i("Orientation", i4);
        E = i4;
    }

    public static int w() {
        if (D0()) {
            g0.j jVar = (g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString());
            return (int) jVar.x(jVar.o());
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR.l()) {
            return ((h0) r0VarQ).H0();
        }
        if (p1VarR.m()) {
            return ((n2.g0) r0VarQ).I0();
        }
        return -1;
    }

    public static boolean w0() {
        return K;
    }

    public static void w1(b bVar) {
        int i4;
        n0.e eVar;
        if (D0()) {
            b0.n nVar = (b0.n) B.e(n0.a.MODE.toString());
            if (bVar == b.PW) {
                g0.q qVar = (g0.q) B.e(n0.f.PW_PRF.toString());
                g0.r rVar = (g0.r) B.e(n0.f.PW_SINGLE_TASK.toString());
                rVar.j3(qVar.y());
                rVar.i3(8);
            } else {
                ((g0.r) B.e(n0.f.PW_SINGLE_TASK.toString())).j3(0);
            }
            int i5 = a.f5970a[bVar.ordinal()];
            if (i5 == 1) {
                eVar = n0.e.MODE_B;
            } else if (i5 == 2) {
                eVar = n0.e.MODE_BM;
            } else if (i5 == 3) {
                eVar = n0.e.MODE_BC;
            } else if (i5 == 4) {
                eVar = n0.e.MODE_BP;
            } else if (i5 != 5) {
                return;
            } else {
                eVar = n0.e.MODE_BD;
            }
            nVar.p0(eVar.toString());
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !r0VarQ.r()) {
                return;
            }
            int i6 = a.f5970a[bVar.ordinal()];
            if (i6 == 1) {
                r0VarQ.B(0);
                return;
            }
            if (i6 == 2) {
                r0VarQ.B(1);
                return;
            }
            if (i6 == 3) {
                if (p1VarR.l() || p1VarR.m()) {
                    r0VarQ.B(5);
                    return;
                }
                return;
            }
            if (i6 != 4) {
                if (i6 != 5) {
                    return;
                }
                if (!p1VarR.l() && !p1VarR.m()) {
                    return;
                } else {
                    i4 = 7;
                }
            } else if (!p1VarR.l() && !p1VarR.m()) {
                return;
            } else {
                i4 = 6;
            }
            r0VarQ.B(i4);
        }
    }

    public static int x(int i4) {
        if (D0()) {
            return (int) ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).x(i4);
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ == null || !p1VarR.l()) {
            return -1;
        }
        return ((i0) p1VarR).A.f9368o[i4];
    }

    public static boolean x0() {
        if (D0()) {
            return ((o1.l) B.e(n0.c.IMAGE_ENHANCE.toString())) != null;
        }
        p1 p1VarR = e1.s(null).r();
        if (p1VarR != null) {
            return p1VarR.n();
        }
        return false;
    }

    public static void x1(int i4, int i5) {
        if (D0()) {
            ((o1.m) B.e(n0.c.VGAIN.toString())).X(i4, i5);
            return;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS != null) {
            r0 r0VarQ = e1VarS.q();
            p1 p1VarR = e1VarS.r();
            if (r0VarQ == null || !p1VarR.n()) {
                return;
            }
            ((w0) r0VarQ).w0(i4, i5);
        }
    }

    public static int y() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).o();
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (p1VarR.l()) {
            return ((h0) r0VarQ).I0();
        }
        if (!p1VarR.m()) {
            return -1;
        }
        int iI0 = ((n2.g0) r0VarQ).I0();
        if (iI0 == -7) {
            return 1;
        }
        return iI0 == 7 ? 2 : 0;
    }

    public static boolean y0() {
        return f5965v;
    }

    public static void y1(int i4) {
        if (D0()) {
            ((c2.a) B.e(n0.d.WIFI_CHANNEL.toString())).x2(i4);
            return;
        }
        r0 r0VarQ = e1.s(null).q();
        if (r0VarQ != null) {
            r0VarQ.C(i4);
        }
    }

    public static int z() {
        if (D0()) {
            return ((g0.j) B.e(n0.b.COLOR_POWER_QUADRANGLE.toString())).J() + 1;
        }
        e1 e1VarS = e1.s(null);
        if (e1VarS == null) {
            return -1;
        }
        r0 r0VarQ = e1VarS.q();
        p1 p1VarR = e1VarS.r();
        if (r0VarQ != null) {
            return p1VarR.l() ? ((h0) r0VarQ).J0() : p1VarR.m() ? 3 : -1;
        }
        return -1;
    }

    public static boolean z0() {
        return f5966w;
    }

    public static boolean z1() {
        return false;
    }
}
