package n2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class p1 implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f9514k = 100000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static z0 f9515l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9516m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9517n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9518o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9519p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9520q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ boolean f9521r = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char f9525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f9527g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f9530j;

    public class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f9531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f9532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f9534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9536g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f9540k;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int[] f9537h = new int[4];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f9538i = new int[4];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f9539j = new int[256];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f9541l = new int[4];

        public a() {
        }

        public float a(int i4) {
            return this.f9540k / this.f9541l[i4];
        }

        public float b(int i4) {
            return (float) (780000.0d / ((double) a(i4)));
        }
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f9548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f9549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9550i;
    }

    public static class c implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f9553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f9554e;
    }

    public p1() {
    }

    public static void D(z0 z0Var) {
        f9515l = z0Var;
    }

    public static float a(float f4) {
        return (float) (Math.asin((((double) f4) / 2.0d) / 100000.0d) * 2.0d);
    }

    public void A(String str) {
        int iIndexOf = this.f9523c.indexOf(" ");
        String str2 = this.f9523c;
        this.f9524d = str + str2.substring(iIndexOf + 3, str2.length());
    }

    public int B(char c4) {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 36, 40, 44, 48, 149, 153, 157, 161, 165}[c4 - 'A'];
    }

    public byte[] C(byte[] bArr) {
        return bArr;
    }

    public int E() {
        return this.f9527g.f9536g;
    }

    public float F(int i4) {
        return this.f9527g.a(i4);
    }

    public float G(int i4) {
        return this.f9527g.b(i4);
    }

    public void H(int i4) {
        this.f9529i = i4;
        z0 z0Var = f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "gain", s0.a.f11071l + i4);
        }
        o1.d(null).i(u(), this.f9529i);
    }

    public void I(int i4) {
        this.f9528h = i4;
        z0 z0Var = f9515l;
        if (z0Var != null) {
            z0Var.a(K(), "zoom", s0.a.f11071l + i4);
        }
        o1.d(null).i(v(), this.f9528h);
    }

    public void J(b bVar) {
        this.f9530j = bVar;
    }

    public String K() {
        return this.f9522b;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public int e() {
        return this.f9529i;
    }

    public int f() {
        return this.f9528h;
    }

    public a g(int i4) {
        return this.f9527g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n2.p1.c h(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.p()
            r1 = 1
            if (r0 != 0) goto L1a
            n2.p1$a r0 = r7.f9527g
            float r0 = r0.f9531b
            r2 = 1084227584(0x40a00000, float:5.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            r2 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L18
            goto L1a
        L18:
            r0 = 0
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r2 = 4
            r3 = 1058642330(0x3f19999a, float:0.6)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            if (r8 != r2) goto L2a
            if (r0 == 0) goto L55
            r3 = 1050253722(0x3e99999a, float:0.3)
            goto L55
        L2a:
            r2 = 2
            r5 = 1063675494(0x3f666666, float:0.9)
            r6 = 1060320051(0x3f333333, float:0.7)
            if (r8 == r2) goto L4e
            r2 = 3
            if (r8 != r2) goto L37
            goto L4e
        L37:
            if (r0 == 0) goto L3a
            r3 = r6
        L3a:
            boolean r8 = r7.n()
            if (r8 == 0) goto L55
            if (r9 == 0) goto L55
            if (r0 == 0) goto L46
            r3 = r5
            goto L47
        L46:
            r3 = r6
        L47:
            if (r0 == 0) goto L55
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r4 = r8
            goto L55
        L4e:
            if (r0 == 0) goto L52
            r3 = r6
            goto L53
        L52:
            r3 = r5
        L53:
            r4 = 1065353216(0x3f800000, float:1.0)
        L55:
            n2.p1$c r8 = new n2.p1$c
            r8.<init>()
            r8.f9553d = r3
            r8.f9554e = r4
            r8.f9551b = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.p1.h(int, boolean):n2.p1$c");
    }

    public b i() {
        return this.f9530j;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return this.f9527g.f9533d;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public String u() {
        return this.f9522b + "_GAIN";
    }

    public String v() {
        return this.f9522b + "_ZOOM";
    }

    public int w() {
        return this.f9527g.f9535f;
    }

    public void x() {
    }

    public r0 y() {
        return null;
    }

    public synchronized void z(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x003e A[PHI: r1
      0x003e: PHI (r1v3 int) = (r1v0 int), (r1v1 int) binds: [B:3:0x003c, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p1(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>()
            n2.p1$a r0 = new n2.p1$a
            r0.<init>()
            r3.f9527g = r0
            r3.f9523c = r4
            java.lang.String r0 = " "
            int r0 = r4.indexOf(r0)
            r1 = 0
            java.lang.String r2 = r4.substring(r1, r0)
            r3.f9522b = r2
            int r2 = r0 + 1
            char r2 = r4.charAt(r2)
            r3.f9525e = r2
            r2 = 2
            int r0 = r0 + r2
            char r4 = r4.charAt(r0)
            int r4 = r3.B(r4)
            r3.f9526f = r4
            r4 = 0
            n2.o1 r4 = n2.o1.d(r4)
            java.lang.String r0 = r3.v()
            int r0 = r4.e(r0, r2)
            r3.f9528h = r0
            if (r0 >= 0) goto L41
        L3e:
            r3.f9528h = r1
            goto L45
        L41:
            r1 = 3
            if (r0 <= r1) goto L45
            goto L3e
        L45:
            java.lang.String r0 = r3.u()
            r1 = 80
            int r4 = r4.e(r0, r1)
            r3.f9529i = r4
            r0 = 30
            if (r4 >= r0) goto L58
        L55:
            r3.f9529i = r0
            goto L5d
        L58:
            r0 = 105(0x69, float:1.47E-43)
            if (r4 <= r0) goto L5d
            goto L55
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.p1.<init>(java.lang.String):void");
    }
}
