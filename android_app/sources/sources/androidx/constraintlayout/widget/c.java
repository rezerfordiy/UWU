package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2382c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2383d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2384e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2385f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f2386g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f2387h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f2388i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f2389j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f2390k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f2391l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f2392m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f2393n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f2394o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintLayout.LayoutParams f2395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f2396b;

    public c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f2395a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f2396b = view;
    }

    public c A(float f4) {
        this.f2395a.E = f4;
        return this;
    }

    public c B(int i4, int i5) {
        switch (i4) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f2395a).leftMargin = i5;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f2395a).rightMargin = i5;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f2395a).topMargin = i5;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f2395a).bottomMargin = i5;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2395a.setMarginStart(i5);
                return this;
            case 7:
                this.f2395a.setMarginEnd(i5);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c C(int i4) {
        switch (i4) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f2395a;
                layoutParams.f2269e = -1;
                layoutParams.f2267d = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.f2295t = -1;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f2395a;
                layoutParams2.f2273g = -1;
                layoutParams2.f2271f = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.f2297v = -1;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f2395a;
                layoutParams3.f2277i = -1;
                layoutParams3.f2275h = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.f2296u = -1;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f2395a;
                layoutParams4.f2279j = -1;
                layoutParams4.f2281k = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.f2298w = -1;
                return this;
            case 5:
                this.f2395a.f2283l = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f2395a;
                layoutParams5.f2291p = -1;
                layoutParams5.f2292q = -1;
                layoutParams5.setMarginStart(-1);
                this.f2395a.f2299x = -1;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f2395a;
                layoutParams6.f2293r = -1;
                layoutParams6.f2294s = -1;
                layoutParams6.setMarginEnd(-1);
                this.f2395a.f2300y = -1;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c D() {
        ConstraintLayout.LayoutParams layoutParams = this.f2395a;
        int i4 = layoutParams.f2269e;
        int i5 = layoutParams.f2271f;
        if (i4 == -1 && i5 == -1) {
            int i6 = layoutParams.f2291p;
            int i7 = layoutParams.f2293r;
            if (i6 != -1 || i7 != -1) {
                c cVar = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i6));
                c cVar2 = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i7));
                ConstraintLayout.LayoutParams layoutParams2 = this.f2395a;
                if (i6 != -1 && i7 != -1) {
                    cVar.m(7, i7, 6, 0);
                    cVar2.m(6, i4, 7, 0);
                } else if (i4 != -1 || i7 != -1) {
                    int i8 = layoutParams2.f2273g;
                    if (i8 != -1) {
                        cVar.m(7, i8, 7, 0);
                    } else {
                        int i9 = layoutParams2.f2267d;
                        if (i9 != -1) {
                            cVar2.m(6, i9, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            c cVar3 = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i4));
            c cVar4 = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i5));
            ConstraintLayout.LayoutParams layoutParams3 = this.f2395a;
            if (i4 != -1 && i5 != -1) {
                cVar3.m(2, i5, 1, 0);
                cVar4.m(1, i4, 2, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i10 = layoutParams3.f2273g;
                if (i10 != -1) {
                    cVar3.m(2, i10, 2, 0);
                } else {
                    int i11 = layoutParams3.f2267d;
                    if (i11 != -1) {
                        cVar4.m(1, i11, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public c E() {
        ConstraintLayout.LayoutParams layoutParams = this.f2395a;
        int i4 = layoutParams.f2277i;
        int i5 = layoutParams.f2279j;
        if (i4 != -1 || i5 != -1) {
            c cVar = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i4));
            c cVar2 = new c(((ViewGroup) this.f2396b.getParent()).findViewById(i5));
            ConstraintLayout.LayoutParams layoutParams2 = this.f2395a;
            if (i4 != -1 && i5 != -1) {
                cVar.m(4, i5, 3, 0);
                cVar2.m(3, i4, 4, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i6 = layoutParams2.f2281k;
                if (i6 != -1) {
                    cVar.m(4, i6, 4, 0);
                } else {
                    int i7 = layoutParams2.f2275h;
                    if (i7 != -1) {
                        cVar2.m(3, i7, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public c F(float f4) {
        this.f2396b.setRotation(f4);
        return this;
    }

    public c G(float f4) {
        this.f2396b.setRotationX(f4);
        return this;
    }

    public c H(float f4) {
        this.f2396b.setRotationY(f4);
        return this;
    }

    public c I(float f4) {
        this.f2396b.setScaleY(f4);
        return this;
    }

    public c J(float f4) {
        return this;
    }

    public final String K(int i4) {
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

    public c L(float f4, float f5) {
        this.f2396b.setPivotX(f4);
        this.f2396b.setPivotY(f5);
        return this;
    }

    public c M(float f4) {
        this.f2396b.setPivotX(f4);
        return this;
    }

    public c N(float f4) {
        this.f2396b.setPivotY(f4);
        return this;
    }

    public c O(float f4, float f5) {
        this.f2396b.setTranslationX(f4);
        this.f2396b.setTranslationY(f5);
        return this;
    }

    public c P(float f4) {
        this.f2396b.setTranslationX(f4);
        return this;
    }

    public c Q(float f4) {
        this.f2396b.setTranslationY(f4);
        return this;
    }

    public c R(float f4) {
        this.f2396b.setTranslationZ(f4);
        return this;
    }

    public c S(float f4) {
        this.f2395a.A = f4;
        return this;
    }

    public c T(int i4) {
        this.f2395a.H = i4;
        return this;
    }

    public c U(float f4) {
        this.f2395a.F = f4;
        return this;
    }

    public c V(int i4) {
        this.f2396b.setVisibility(i4);
        return this;
    }

    public c a(int i4, int i5) {
        m(1, i4, i4 == 0 ? 1 : 2, 0);
        m(2, i5, i5 == 0 ? 2 : 1, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i4)).m(2, this.f2396b.getId(), 1, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i5)).m(1, this.f2396b.getId(), 2, 0);
        }
        return this;
    }

    public c b(int i4, int i5) {
        m(6, i4, i4 == 0 ? 6 : 7, 0);
        m(7, i5, i5 == 0 ? 7 : 6, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i4)).m(7, this.f2396b.getId(), 6, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i5)).m(6, this.f2396b.getId(), 7, 0);
        }
        return this;
    }

    public c c(int i4, int i5) {
        m(3, i4, i4 == 0 ? 3 : 4, 0);
        m(4, i5, i5 == 0 ? 4 : 3, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i4)).m(4, this.f2396b.getId(), 3, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f2396b.getParent()).findViewById(i5)).m(3, this.f2396b.getId(), 4, 0);
        }
        return this;
    }

    public c d(float f4) {
        this.f2396b.setAlpha(f4);
        return this;
    }

    public void e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[PHI: r0 r1
      0x002c: PHI (r0v6 int) = (r0v5 int), (r0v5 int), (r0v7 int), (r0v7 int) binds: [B:10:0x0013, B:11:0x0015, B:14:0x001a, B:15:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v2 int), (r1v2 int) binds: [B:10:0x0013, B:11:0x0015, B:14:0x001a, B:15:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.widget.c f(int r3, int r4, int r5, int r6, int r7, int r8, float r9) {
        /*
            r2 = this;
            java.lang.String r0 = "margin must be > 0"
            if (r5 < 0) goto L45
            if (r8 < 0) goto L3f
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L37
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L37
            r0 = 2
            r1 = 1
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L18
            goto L2c
        L18:
            r0 = 7
            r1 = 6
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L1f
            goto L2c
        L1f:
            r0 = 3
            r2.m(r0, r3, r4, r5)
            r3 = 4
            r2.m(r3, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.f2395a
            r3.A = r9
            goto L36
        L2c:
            r2.m(r1, r3, r4, r5)
            r2.m(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.f2395a
            r3.f2301z = r9
        L36:
            return r2
        L37:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bias must be between 0 and 1 inclusive"
            r3.<init>(r4)
            throw r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.f(int, int, int, int, int, int, float):androidx.constraintlayout.widget.c");
    }

    public c g(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        c cVar;
        int i9;
        int i10;
        if (i4 == 0) {
            i9 = 0;
            i5 = 1;
            i6 = 0;
            i10 = 0;
            i7 = 2;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
        } else {
            i5 = 2;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
            i9 = i4;
            i10 = i4;
        }
        cVar.f(i9, i5, i6, i10, i7, i8, f4);
        return this;
    }

    public c h(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(1, i4, i5, i6);
        m(2, i7, i8, i9);
        this.f2395a.f2301z = f4;
        return this;
    }

    public c i(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        c cVar;
        int i9;
        int i10;
        if (i4 == 0) {
            i9 = 0;
            i5 = 6;
            i6 = 0;
            i10 = 0;
            i7 = 7;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
        } else {
            i5 = 7;
            i6 = 0;
            i7 = 6;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
            i9 = i4;
            i10 = i4;
        }
        cVar.f(i9, i5, i6, i10, i7, i8, f4);
        return this;
    }

    public c j(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(6, i4, i5, i6);
        m(7, i7, i8, i9);
        this.f2395a.f2301z = f4;
        return this;
    }

    public c k(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        c cVar;
        int i9;
        int i10;
        if (i4 == 0) {
            i9 = 0;
            i5 = 3;
            i6 = 0;
            i10 = 0;
            i7 = 4;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
        } else {
            i5 = 4;
            i6 = 0;
            i7 = 3;
            i8 = 0;
            f4 = 0.5f;
            cVar = this;
            i9 = i4;
            i10 = i4;
        }
        cVar.f(i9, i5, i6, i10, i7, i8, f4);
        return this;
    }

    public c l(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(3, i4, i5, i6);
        m(4, i7, i8, i9);
        this.f2395a.A = f4;
        return this;
    }

    public c m(int i4, int i5, int i6, int i7) {
        ConstraintLayout.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        switch (i4) {
            case 1:
                if (i6 == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.f2395a;
                    layoutParams3.f2267d = i5;
                    layoutParams3.f2269e = -1;
                } else {
                    if (i6 != 2) {
                        throw new IllegalArgumentException("Left to " + K(i6) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.f2395a;
                    layoutParams4.f2269e = i5;
                    layoutParams4.f2267d = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2395a).leftMargin = i7;
                return this;
            case 2:
                if (i6 == 1) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f2395a;
                    layoutParams5.f2271f = i5;
                    layoutParams5.f2273g = -1;
                } else {
                    if (i6 != 2) {
                        throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.f2395a;
                    layoutParams6.f2273g = i5;
                    layoutParams6.f2271f = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2395a).rightMargin = i7;
                return this;
            case 3:
                if (i6 == 3) {
                    layoutParams = this.f2395a;
                    layoutParams.f2275h = i5;
                    layoutParams.f2277i = -1;
                } else {
                    if (i6 != 4) {
                        throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                    }
                    layoutParams = this.f2395a;
                    layoutParams.f2277i = i5;
                    layoutParams.f2275h = -1;
                }
                layoutParams.f2283l = -1;
                ((ViewGroup.MarginLayoutParams) this.f2395a).topMargin = i7;
                return this;
            case 4:
                if (i6 == 4) {
                    layoutParams2 = this.f2395a;
                    layoutParams2.f2281k = i5;
                    layoutParams2.f2279j = -1;
                } else {
                    if (i6 != 3) {
                        throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                    }
                    layoutParams2 = this.f2395a;
                    layoutParams2.f2279j = i5;
                    layoutParams2.f2281k = -1;
                }
                layoutParams2.f2283l = -1;
                ((ViewGroup.MarginLayoutParams) this.f2395a).bottomMargin = i7;
                return this;
            case 5:
                if (i6 != 5) {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                ConstraintLayout.LayoutParams layoutParams7 = this.f2395a;
                layoutParams7.f2283l = i5;
                layoutParams7.f2281k = -1;
                layoutParams7.f2279j = -1;
                layoutParams7.f2275h = -1;
                layoutParams7.f2277i = -1;
                return this;
            case 6:
                if (i6 == 6) {
                    ConstraintLayout.LayoutParams layoutParams8 = this.f2395a;
                    layoutParams8.f2292q = i5;
                    layoutParams8.f2291p = -1;
                } else {
                    if (i6 != 7) {
                        throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams9 = this.f2395a;
                    layoutParams9.f2291p = i5;
                    layoutParams9.f2292q = -1;
                }
                this.f2395a.setMarginStart(i7);
                return this;
            case 7:
                if (i6 == 7) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f2395a;
                    layoutParams10.f2294s = i5;
                    layoutParams10.f2293r = -1;
                } else {
                    if (i6 != 6) {
                        throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.f2395a;
                    layoutParams11.f2293r = i5;
                    layoutParams11.f2294s = -1;
                }
                this.f2395a.setMarginEnd(i7);
                return this;
            default:
                throw new IllegalArgumentException(K(i4) + " to " + K(i6) + " unknown");
        }
    }

    public c n(int i4) {
        this.f2395a.J = i4;
        return this;
    }

    public c o(int i4) {
        this.f2395a.I = i4;
        return this;
    }

    public c p(int i4) {
        ((ViewGroup.MarginLayoutParams) this.f2395a).height = i4;
        return this;
    }

    public c q(int i4) {
        this.f2395a.N = i4;
        return this;
    }

    public c r(int i4) {
        this.f2395a.M = i4;
        return this;
    }

    public c s(int i4) {
        this.f2395a.L = i4;
        return this;
    }

    public c t(int i4) {
        this.f2395a.K = i4;
        return this;
    }

    public c u(int i4) {
        ((ViewGroup.MarginLayoutParams) this.f2395a).width = i4;
        return this;
    }

    public c v(String str) {
        this.f2395a.B = str;
        return this;
    }

    public c w(float f4) {
        this.f2396b.setElevation(f4);
        return this;
    }

    public c x(int i4, int i5) {
        switch (i4) {
            case 1:
                this.f2395a.f2295t = i5;
                return this;
            case 2:
                this.f2395a.f2297v = i5;
                return this;
            case 3:
                this.f2395a.f2296u = i5;
                return this;
            case 4:
                this.f2395a.f2298w = i5;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2395a.f2299x = i5;
                return this;
            case 7:
                this.f2395a.f2300y = i5;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c y(float f4) {
        this.f2395a.f2301z = f4;
        return this;
    }

    public c z(int i4) {
        this.f2395a.G = i4;
        return this;
    }
}
