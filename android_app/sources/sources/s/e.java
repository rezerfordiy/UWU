package s;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import s.i;
import v.d;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static boolean A = false;
    public static int B = 1000;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f10945r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f10946s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f10947t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f10948u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f10949v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f10950w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f10951x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f10952y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f10953z = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f10957d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s.b[] f10960g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f10967n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f10970q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10954a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10955b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, i> f10956c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10958e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10959f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10961h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10962i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean[] f10963j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10964k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10965l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10966m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i[] f10968o = new i[B];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10969p = 0;

    public interface a {
        void a(i iVar);

        i b(e eVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        void d(e eVar, s.b bVar, boolean z3);

        void e(e eVar);

        void f(e eVar, i iVar, boolean z3);

        i getKey();

        boolean isEmpty();
    }

    public class b extends s.b {
        public b(c cVar) {
            this.f10939e = new j(this, cVar);
        }
    }

    public e() {
        this.f10960g = null;
        this.f10960g = new s.b[32];
        W();
        c cVar = new c();
        this.f10967n = cVar;
        this.f10957d = new h(cVar);
        this.f10970q = A ? new b(cVar) : new s.b(cVar);
    }

    public static f L() {
        return C;
    }

    public static s.b w(e eVar, i iVar, i iVar2, float f4) {
        return eVar.v().m(iVar, iVar2, f4);
    }

    public final void A() {
        B();
        String str = s0.a.f11071l;
        for (int i4 = 0; i4 < this.f10965l; i4++) {
            str = (str + this.f10960g[i4]) + "\n";
        }
        System.out.println(str + this.f10957d + "\n");
    }

    public final void B() {
        System.out.println("Display Rows (" + this.f10965l + "x" + this.f10964k + ")\n");
    }

    public void C() {
        int iE = 0;
        for (int i4 = 0; i4 < this.f10958e; i4++) {
            s.b bVar = this.f10960g[i4];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        int iE2 = 0;
        for (int i5 = 0; i5 < this.f10965l; i5++) {
            s.b bVar2 = this.f10960g[i5];
            if (bVar2 != null) {
                iE2 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f10958e);
        sb.append(" (");
        int i6 = this.f10958e;
        sb.append(H(i6 * i6));
        sb.append(") -- row sizes: ");
        sb.append(H(iE));
        sb.append(", actual size: ");
        sb.append(H(iE2));
        sb.append(" rows: ");
        sb.append(this.f10965l);
        sb.append("/");
        sb.append(this.f10966m);
        sb.append(" cols: ");
        sb.append(this.f10964k);
        sb.append("/");
        sb.append(this.f10959f);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(H(0));
        printStream.println(sb.toString());
    }

    public void D() {
        B();
        String str = s0.a.f11071l;
        for (int i4 = 0; i4 < this.f10965l; i4++) {
            if (this.f10960g[i4].f10935a.f11032j == i.b.UNRESTRICTED) {
                str = (str + this.f10960g[i4].F()) + "\n";
            }
        }
        System.out.println(str + this.f10957d + "\n");
    }

    public final int E(a aVar) throws Exception {
        boolean z3;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f10965l) {
                z3 = false;
                break;
            }
            s.b bVar = this.f10960g[i4];
            if (bVar.f10935a.f11032j != i.b.UNRESTRICTED && bVar.f10936b < 0.0f) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (!z3) {
            return 0;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            f fVar = C;
            if (fVar != null) {
                fVar.f10986o++;
            }
            i5++;
            float f4 = Float.MAX_VALUE;
            int i6 = -1;
            int i7 = -1;
            int i8 = 0;
            for (int i9 = 0; i9 < this.f10965l; i9++) {
                s.b bVar2 = this.f10960g[i9];
                if (bVar2.f10935a.f11032j != i.b.UNRESTRICTED && !bVar2.f10940f && bVar2.f10936b < 0.0f) {
                    int i10 = 9;
                    if (f10953z) {
                        int iN = bVar2.f10939e.n();
                        int i11 = 0;
                        while (i11 < iN) {
                            i iVarF = bVar2.f10939e.f(i11);
                            float fG = bVar2.f10939e.g(iVarF);
                            if (fG > 0.0f) {
                                int i12 = 0;
                                while (i12 < i10) {
                                    float f5 = iVarF.f11030h[i12] / fG;
                                    if ((f5 < f4 && i12 == i8) || i12 > i8) {
                                        i7 = iVarF.f11025c;
                                        i8 = i12;
                                        i6 = i9;
                                        f4 = f5;
                                    }
                                    i12++;
                                    i10 = 9;
                                }
                            }
                            i11++;
                            i10 = 9;
                        }
                    } else {
                        for (int i13 = 1; i13 < this.f10964k; i13++) {
                            i iVar = this.f10967n.f10944d[i13];
                            float fG2 = bVar2.f10939e.g(iVar);
                            if (fG2 > 0.0f) {
                                for (int i14 = 0; i14 < 9; i14++) {
                                    float f6 = iVar.f11030h[i14] / fG2;
                                    if ((f6 < f4 && i14 == i8) || i14 > i8) {
                                        i7 = i13;
                                        i8 = i14;
                                        i6 = i9;
                                        f4 = f6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i6 != -1) {
                s.b bVar3 = this.f10960g[i6];
                bVar3.f10935a.f11026d = -1;
                f fVar2 = C;
                if (fVar2 != null) {
                    fVar2.f10985n++;
                }
                bVar3.C(this.f10967n.f10944d[i7]);
                i iVar2 = bVar3.f10935a;
                iVar2.f11026d = i6;
                iVar2.m(this, bVar3);
            } else {
                z4 = true;
            }
            if (i5 > this.f10964k / 2) {
                z4 = true;
            }
        }
        return i5;
    }

    public void F(f fVar) {
        C = fVar;
    }

    public c G() {
        return this.f10967n;
    }

    public final String H(int i4) {
        int i5 = i4 * 4;
        int i6 = i5 / 1024;
        int i7 = i6 / 1024;
        if (i7 > 0) {
            return s0.a.f11071l + i7 + " Mb";
        }
        if (i6 > 0) {
            return s0.a.f11071l + i6 + " Kb";
        }
        return s0.a.f11071l + i5 + " bytes";
    }

    public final String I(int i4) {
        return i4 == 1 ? "LOW" : i4 == 2 ? "MEDIUM" : i4 == 3 ? "HIGH" : i4 == 4 ? "HIGHEST" : i4 == 5 ? "EQUALITY" : i4 == 8 ? "FIXED" : i4 == 6 ? "BARRIER" : "NONE";
    }

    public a J() {
        return this.f10957d;
    }

    public int K() {
        int iE = 0;
        for (int i4 = 0; i4 < this.f10965l; i4++) {
            s.b bVar = this.f10960g[i4];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        return iE;
    }

    public int M() {
        return this.f10965l;
    }

    public int N() {
        return this.f10955b;
    }

    public int O(Object obj) {
        i iVarJ = ((v.d) obj).j();
        if (iVarJ != null) {
            return (int) (iVarJ.f11028f + 0.5f);
        }
        return 0;
    }

    public s.b P(int i4) {
        return this.f10960g[i4];
    }

    public float Q(String str) {
        i iVarR = R(str, i.b.UNRESTRICTED);
        if (iVarR == null) {
            return 0.0f;
        }
        return iVarR.f11028f;
    }

    public i R(String str, i.b bVar) {
        if (this.f10956c == null) {
            this.f10956c = new HashMap<>();
        }
        i iVar = this.f10956c.get(str);
        return iVar == null ? y(str, bVar) : iVar;
    }

    public final void S() {
        int i4 = this.f10958e * 2;
        this.f10958e = i4;
        this.f10960g = (s.b[]) Arrays.copyOf(this.f10960g, i4);
        c cVar = this.f10967n;
        cVar.f10944d = (i[]) Arrays.copyOf(cVar.f10944d, this.f10958e);
        int i5 = this.f10958e;
        this.f10963j = new boolean[i5];
        this.f10959f = i5;
        this.f10966m = i5;
        f fVar = C;
        if (fVar != null) {
            fVar.f10979h++;
            fVar.f10991t = Math.max(fVar.f10991t, i5);
            f fVar2 = C;
            fVar2.J = fVar2.f10991t;
        }
    }

    public void T() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f10980i++;
        }
        if (this.f10957d.isEmpty()) {
            r();
            return;
        }
        if (this.f10961h || this.f10962i) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f10993v++;
            }
            boolean z3 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= this.f10965l) {
                    z3 = true;
                    break;
                } else if (!this.f10960g[i4].f10940f) {
                    break;
                } else {
                    i4++;
                }
            }
            if (z3) {
                f fVar3 = C;
                if (fVar3 != null) {
                    fVar3.f10992u++;
                }
                r();
                return;
            }
        }
        U(this.f10957d);
    }

    public void U(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f10997z++;
            fVar.A = Math.max(fVar.A, this.f10964k);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, this.f10965l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public final int V(a aVar, boolean z3) {
        f fVar = C;
        if (fVar != null) {
            fVar.f10983l++;
        }
        for (int i4 = 0; i4 < this.f10964k; i4++) {
            this.f10963j[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f10984m++;
            }
            i5++;
            if (i5 >= this.f10964k * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f10963j[aVar.getKey().f11025c] = true;
            }
            i iVarB = aVar.b(this, this.f10963j);
            if (iVarB != null) {
                boolean[] zArr = this.f10963j;
                int i6 = iVarB.f11025c;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (iVarB != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f10965l; i8++) {
                    s.b bVar = this.f10960g[i8];
                    if (bVar.f10935a.f11032j != i.b.UNRESTRICTED && !bVar.f10940f && bVar.y(iVarB)) {
                        float fG = bVar.f10939e.g(iVarB);
                        if (fG < 0.0f) {
                            float f5 = (-bVar.f10936b) / fG;
                            if (f5 < f4) {
                                i7 = i8;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    s.b bVar2 = this.f10960g[i7];
                    bVar2.f10935a.f11026d = -1;
                    f fVar3 = C;
                    if (fVar3 != null) {
                        fVar3.f10985n++;
                    }
                    bVar2.C(iVarB);
                    i iVar = bVar2.f10935a;
                    iVar.f11026d = i7;
                    iVar.m(this, bVar2);
                }
            } else {
                z4 = true;
            }
        }
        return i5;
    }

    public final void W() {
        int i4 = 0;
        if (A) {
            while (i4 < this.f10965l) {
                s.b bVar = this.f10960g[i4];
                if (bVar != null) {
                    this.f10967n.f10941a.a(bVar);
                }
                this.f10960g[i4] = null;
                i4++;
            }
            return;
        }
        while (i4 < this.f10965l) {
            s.b bVar2 = this.f10960g[i4];
            if (bVar2 != null) {
                this.f10967n.f10942b.a(bVar2);
            }
            this.f10960g[i4] = null;
            i4++;
        }
    }

    public void X(s.b bVar) {
        i iVar;
        int i4;
        if (!bVar.f10940f || (iVar = bVar.f10935a) == null) {
            return;
        }
        int i5 = iVar.f11026d;
        if (i5 != -1) {
            while (true) {
                i4 = this.f10965l;
                if (i5 >= i4 - 1) {
                    break;
                }
                s.b[] bVarArr = this.f10960g;
                int i6 = i5 + 1;
                s.b bVar2 = bVarArr[i6];
                i iVar2 = bVar2.f10935a;
                if (iVar2.f11026d == i6) {
                    iVar2.f11026d = i5;
                }
                bVarArr[i5] = bVar2;
                i5 = i6;
            }
            this.f10965l = i4 - 1;
        }
        i iVar3 = bVar.f10935a;
        if (!iVar3.f11029g) {
            iVar3.h(this, bVar.f10936b);
        }
        (A ? this.f10967n.f10941a : this.f10967n.f10942b).a(bVar);
    }

    public void Y() {
        c cVar;
        int i4 = 0;
        while (true) {
            cVar = this.f10967n;
            i[] iVarArr = cVar.f10944d;
            if (i4 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i4];
            if (iVar != null) {
                iVar.g();
            }
            i4++;
        }
        cVar.f10943c.c(this.f10968o, this.f10969p);
        this.f10969p = 0;
        Arrays.fill(this.f10967n.f10944d, (Object) null);
        HashMap<String, i> map = this.f10956c;
        if (map != null) {
            map.clear();
        }
        this.f10955b = 0;
        this.f10957d.clear();
        this.f10964k = 1;
        for (int i5 = 0; i5 < this.f10965l; i5++) {
            s.b bVar = this.f10960g[i5];
            if (bVar != null) {
                bVar.f10937c = false;
            }
        }
        W();
        this.f10965l = 0;
        this.f10970q = A ? new b(this.f10967n) : new s.b(this.f10967n);
    }

    public final i a(i.b bVar, String str) {
        i iVarB = this.f10967n.f10943c.b();
        if (iVarB == null) {
            iVarB = new i(bVar, str);
        } else {
            iVarB.g();
        }
        iVarB.k(bVar, str);
        int i4 = this.f10969p;
        int i5 = B;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            B = i6;
            this.f10968o = (i[]) Arrays.copyOf(this.f10968o, i6);
        }
        i[] iVarArr = this.f10968o;
        int i7 = this.f10969p;
        this.f10969p = i7 + 1;
        iVarArr[i7] = iVarB;
        return iVarB;
    }

    public void b(v.e eVar, v.e eVar2, float f4, int i4) {
        d.b bVar = d.b.LEFT;
        i iVarU = u(eVar.r(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarU2 = u(eVar.r(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarU3 = u(eVar.r(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarU4 = u(eVar.r(bVar4));
        i iVarU5 = u(eVar2.r(bVar));
        i iVarU6 = u(eVar2.r(bVar2));
        i iVarU7 = u(eVar2.r(bVar3));
        i iVarU8 = u(eVar2.r(bVar4));
        s.b bVarV = v();
        double d4 = f4;
        double d5 = i4;
        bVarV.v(iVarU2, iVarU4, iVarU6, iVarU8, (float) (Math.sin(d4) * d5));
        d(bVarV);
        s.b bVarV2 = v();
        bVarV2.v(iVarU, iVarU3, iVarU5, iVarU7, (float) (Math.cos(d4) * d5));
        d(bVarV2);
    }

    public void c(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5, int i6) {
        s.b bVarV = v();
        bVarV.k(iVar, iVar2, i4, f4, iVar3, iVar4, i5);
        if (i6 != 8) {
            bVarV.g(this, i6);
        }
        d(bVarV);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(s.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            s.f r0 = s.e.C
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f10981j
            long r3 = r3 + r1
            r0.f10981j = r3
            boolean r3 = r8.f10940f
            if (r3 == 0) goto L17
            long r3 = r0.f10982k
            long r3 = r3 + r1
            r0.f10982k = r3
        L17:
            int r0 = r7.f10965l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f10966m
            if (r0 >= r4) goto L26
            int r0 = r7.f10964k
            int r0 = r0 + r3
            int r4 = r7.f10959f
            if (r0 < r4) goto L29
        L26:
            r7.S()
        L29:
            boolean r0 = r8.f10940f
            r4 = 0
            if (r0 != 0) goto L9e
            r8.e(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.w()
            boolean r0 = r8.i(r7)
            if (r0 == 0) goto L95
            s.i r0 = r7.t()
            r8.f10935a = r0
            int r5 = r7.f10965l
            r7.m(r8)
            int r6 = r7.f10965l
            int r5 = r5 + r3
            if (r6 != r5) goto L95
            s.e$a r4 = r7.f10970q
            r4.c(r8)
            s.e$a r4 = r7.f10970q
            r7.V(r4, r3)
            int r4 = r0.f11026d
            r5 = -1
            if (r4 != r5) goto L96
            s.i r4 = r8.f10935a
            if (r4 != r0) goto L76
            s.i r0 = r8.A(r0)
            if (r0 == 0) goto L76
            s.f r4 = s.e.C
            if (r4 == 0) goto L73
            long r5 = r4.f10985n
            long r5 = r5 + r1
            r4.f10985n = r5
        L73:
            r8.C(r0)
        L76:
            boolean r0 = r8.f10940f
            if (r0 != 0) goto L7f
            s.i r0 = r8.f10935a
            r0.m(r7, r8)
        L7f:
            boolean r0 = s.e.A
            if (r0 == 0) goto L88
            s.c r0 = r7.f10967n
            s.g$a<s.b> r0 = r0.f10941a
            goto L8c
        L88:
            s.c r0 = r7.f10967n
            s.g$a<s.b> r0 = r0.f10942b
        L8c:
            r0.a(r8)
            int r0 = r7.f10965l
            int r0 = r0 - r3
            r7.f10965l = r0
            goto L96
        L95:
            r3 = r4
        L96:
            boolean r0 = r8.x()
            if (r0 != 0) goto L9d
            return
        L9d:
            r4 = r3
        L9e:
            if (r4 != 0) goto La3
            r7.m(r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.d(s.b):void");
    }

    public s.b e(i iVar, i iVar2, int i4, int i5) {
        if (f10950w && i5 == 8 && iVar2.f11029g && iVar.f11026d == -1) {
            iVar.h(this, iVar2.f11028f + i4);
            return null;
        }
        s.b bVarV = v();
        bVarV.r(iVar, iVar2, i4);
        if (i5 != 8) {
            bVarV.g(this, i5);
        }
        d(bVarV);
        return bVarV;
    }

    public void f(i iVar, int i4) {
        s.b bVarV;
        if (f10950w && iVar.f11026d == -1) {
            float f4 = i4;
            iVar.h(this, f4);
            for (int i5 = 0; i5 < this.f10955b + 1; i5++) {
                i iVar2 = this.f10967n.f10944d[i5];
                if (iVar2 != null && iVar2.f11036n && iVar2.f11037o == iVar.f11025c) {
                    iVar2.h(this, iVar2.f11038p + f4);
                }
            }
            return;
        }
        int i6 = iVar.f11026d;
        if (i6 != -1) {
            s.b bVar = this.f10960g[i6];
            if (!bVar.f10940f) {
                if (bVar.f10939e.n() == 0) {
                    bVar.f10940f = true;
                } else {
                    bVarV = v();
                    bVarV.q(iVar, i4);
                }
            }
            bVar.f10936b = i4;
            return;
        }
        bVarV = v();
        bVarV.l(iVar, i4);
        d(bVarV);
    }

    public final void g(s.b bVar) {
        bVar.g(this, 0);
    }

    public void h(i iVar, i iVar2, int i4, boolean z3) {
        s.b bVarV = v();
        i iVarX = x();
        iVarX.f11027e = 0;
        bVarV.t(iVar, iVar2, iVarX, i4);
        d(bVarV);
    }

    public void i(i iVar, i iVar2, int i4, int i5) {
        s.b bVarV = v();
        i iVarX = x();
        iVarX.f11027e = 0;
        bVarV.t(iVar, iVar2, iVarX, i4);
        if (i5 != 8) {
            o(bVarV, (int) (bVarV.f10939e.g(iVarX) * (-1.0f)), i5);
        }
        d(bVarV);
    }

    public void j(i iVar, i iVar2, int i4, boolean z3) {
        s.b bVarV = v();
        i iVarX = x();
        iVarX.f11027e = 0;
        bVarV.u(iVar, iVar2, iVarX, i4);
        d(bVarV);
    }

    public void k(i iVar, i iVar2, int i4, int i5) {
        s.b bVarV = v();
        i iVarX = x();
        iVarX.f11027e = 0;
        bVarV.u(iVar, iVar2, iVarX, i4);
        if (i5 != 8) {
            o(bVarV, (int) (bVarV.f10939e.g(iVarX) * (-1.0f)), i5);
        }
        d(bVarV);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f4, int i4) {
        s.b bVarV = v();
        bVarV.n(iVar, iVar2, iVar3, iVar4, f4);
        if (i4 != 8) {
            bVarV.g(this, i4);
        }
        d(bVarV);
    }

    public final void m(s.b bVar) {
        int i4;
        if (f10951x && bVar.f10940f) {
            bVar.f10935a.h(this, bVar.f10936b);
        } else {
            s.b[] bVarArr = this.f10960g;
            int i5 = this.f10965l;
            bVarArr[i5] = bVar;
            i iVar = bVar.f10935a;
            iVar.f11026d = i5;
            this.f10965l = i5 + 1;
            iVar.m(this, bVar);
        }
        if (f10951x && this.f10954a) {
            int i6 = 0;
            while (i6 < this.f10965l) {
                if (this.f10960g[i6] == null) {
                    System.out.println("WTF");
                }
                s.b bVar2 = this.f10960g[i6];
                if (bVar2 != null && bVar2.f10940f) {
                    bVar2.f10935a.h(this, bVar2.f10936b);
                    (A ? this.f10967n.f10941a : this.f10967n.f10942b).a(bVar2);
                    this.f10960g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f10965l;
                        if (i7 >= i4) {
                            break;
                        }
                        s.b[] bVarArr2 = this.f10960g;
                        int i9 = i7 - 1;
                        s.b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        i iVar2 = bVar3.f10935a;
                        if (iVar2.f11026d == i7) {
                            iVar2.f11026d = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.f10960g[i8] = null;
                    }
                    this.f10965l = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f10954a = false;
        }
    }

    public final void n(s.b bVar, int i4) {
        o(bVar, i4, 0);
    }

    public void o(s.b bVar, int i4, int i5) {
        bVar.h(s(i5, null), i4);
    }

    public void p(i iVar, i iVar2, int i4) {
        if (iVar.f11026d != -1 || i4 != 0) {
            e(iVar, iVar2, i4, 8);
            return;
        }
        if (iVar2.f11036n) {
            iVar2 = this.f10967n.f10944d[iVar2.f11037o];
        }
        if (iVar.f11036n) {
            i iVar3 = this.f10967n.f10944d[iVar.f11037o];
        } else {
            iVar.j(this, iVar2, 0.0f);
        }
    }

    public final void q() {
        int i4;
        int i5 = 0;
        while (i5 < this.f10965l) {
            s.b bVar = this.f10960g[i5];
            if (bVar.f10939e.n() == 0) {
                bVar.f10940f = true;
            }
            if (bVar.f10940f) {
                i iVar = bVar.f10935a;
                iVar.f11028f = bVar.f10936b;
                iVar.f(bVar);
                int i6 = i5;
                while (true) {
                    i4 = this.f10965l;
                    if (i6 >= i4 - 1) {
                        break;
                    }
                    s.b[] bVarArr = this.f10960g;
                    int i7 = i6 + 1;
                    bVarArr[i6] = bVarArr[i7];
                    i6 = i7;
                }
                this.f10960g[i4 - 1] = null;
                this.f10965l = i4 - 1;
                i5--;
                (A ? this.f10967n.f10941a : this.f10967n.f10942b).a(bVar);
            }
            i5++;
        }
    }

    public final void r() {
        for (int i4 = 0; i4 < this.f10965l; i4++) {
            s.b bVar = this.f10960g[i4];
            bVar.f10935a.f11028f = bVar.f10936b;
        }
    }

    public i s(int i4, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f10988q++;
        }
        if (this.f10964k + 1 >= this.f10959f) {
            S();
        }
        i iVarA = a(i.b.ERROR, str);
        int i5 = this.f10955b + 1;
        this.f10955b = i5;
        this.f10964k++;
        iVarA.f11025c = i5;
        iVarA.f11027e = i4;
        this.f10967n.f10944d[i5] = iVarA;
        this.f10957d.a(iVarA);
        return iVarA;
    }

    public i t() {
        f fVar = C;
        if (fVar != null) {
            fVar.f10990s++;
        }
        if (this.f10964k + 1 >= this.f10959f) {
            S();
        }
        i iVarA = a(i.b.SLACK, null);
        int i4 = this.f10955b + 1;
        this.f10955b = i4;
        this.f10964k++;
        iVarA.f11025c = i4;
        this.f10967n.f10944d[i4] = iVarA;
        return iVarA;
    }

    public i u(Object obj) {
        i iVarJ = null;
        if (obj == null) {
            return null;
        }
        if (this.f10964k + 1 >= this.f10959f) {
            S();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVarJ = dVar.j();
            if (iVarJ == null) {
                dVar.z(this.f10967n);
                iVarJ = dVar.j();
            }
            int i4 = iVarJ.f11025c;
            if (i4 == -1 || i4 > this.f10955b || this.f10967n.f10944d[i4] == null) {
                if (i4 != -1) {
                    iVarJ.g();
                }
                int i5 = this.f10955b + 1;
                this.f10955b = i5;
                this.f10964k++;
                iVarJ.f11025c = i5;
                iVarJ.f11032j = i.b.UNRESTRICTED;
                this.f10967n.f10944d[i5] = iVarJ;
            }
        }
        return iVarJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r0
      0x0038: PHI (r0v6 s.b) = (r0v4 s.b), (r0v11 s.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s.b v() {
        /*
            r5 = this;
            boolean r0 = s.e.A
            r1 = 1
            if (r0 == 0) goto L1f
            s.c r0 = r5.f10967n
            s.g$a<s.b> r0 = r0.f10941a
            java.lang.Object r0 = r0.b()
            s.b r0 = (s.b) r0
            if (r0 != 0) goto L38
            s.e$b r0 = new s.e$b
            s.c r3 = r5.f10967n
            r0.<init>(r3)
            long r3 = s.e.E
            long r3 = r3 + r1
            s.e.E = r3
            goto L3b
        L1f:
            s.c r0 = r5.f10967n
            s.g$a<s.b> r0 = r0.f10942b
            java.lang.Object r0 = r0.b()
            s.b r0 = (s.b) r0
            if (r0 != 0) goto L38
            s.b r0 = new s.b
            s.c r3 = r5.f10967n
            r0.<init>(r3)
            long r3 = s.e.D
            long r3 = r3 + r1
            s.e.D = r3
            goto L3b
        L38:
            r0.D()
        L3b:
            s.i.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.v():s.b");
    }

    public i x() {
        f fVar = C;
        if (fVar != null) {
            fVar.f10989r++;
        }
        if (this.f10964k + 1 >= this.f10959f) {
            S();
        }
        i iVarA = a(i.b.SLACK, null);
        int i4 = this.f10955b + 1;
        this.f10955b = i4;
        this.f10964k++;
        iVarA.f11025c = i4;
        this.f10967n.f10944d[i4] = iVarA;
        return iVarA;
    }

    public final i y(String str, i.b bVar) {
        f fVar = C;
        if (fVar != null) {
            fVar.f10987p++;
        }
        if (this.f10964k + 1 >= this.f10959f) {
            S();
        }
        i iVarA = a(bVar, null);
        iVarA.i(str);
        int i4 = this.f10955b + 1;
        this.f10955b = i4;
        this.f10964k++;
        iVarA.f11025c = i4;
        if (this.f10956c == null) {
            this.f10956c = new HashMap<>();
        }
        this.f10956c.put(str, iVarA);
        this.f10967n.f10944d[this.f10955b] = iVarA;
        return iVarA;
    }

    public void z() {
        B();
        String str = " num vars " + this.f10955b + "\n";
        for (int i4 = 0; i4 < this.f10955b + 1; i4++) {
            i iVar = this.f10967n.f10944d[i4];
            if (iVar != null && iVar.f11029g) {
                str = str + " $[" + i4 + "] => " + iVar + " = " + iVar.f11028f + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i5 = 0; i5 < this.f10955b + 1; i5++) {
            i[] iVarArr = this.f10967n.f10944d;
            i iVar2 = iVarArr[i5];
            if (iVar2 != null && iVar2.f11036n) {
                str2 = str2 + " ~[" + i5 + "] => " + iVar2 + " = " + iVarArr[iVar2.f11037o] + " + " + iVar2.f11038p + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i6 = 0; i6 < this.f10965l; i6++) {
            str3 = (str3 + this.f10960g[i6].F()) + "\n #  ";
        }
        if (this.f10957d != null) {
            str3 = str3 + "Goal: " + this.f10957d + "\n";
        }
        System.out.println(str3);
    }
}
