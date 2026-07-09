package s;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final int A = 7;
    public static final int B = 8;
    public static int C = 1;
    public static int D = 1;
    public static int E = 1;
    public static int F = 1;
    public static int G = 1;
    public static final int H = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f11014r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f11015s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11016t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f11017u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11018v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f11019w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f11020x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f11021y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f11022z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f11030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f11031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f11032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s.b[] f11033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f11038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<s.b> f11039q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11040a;

        static {
            int[] iArr = new int[b.values().length];
            f11040a = iArr;
            try {
                iArr[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11040a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11040a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11040a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11040a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, b bVar) {
        this.f11025c = -1;
        this.f11026d = -1;
        this.f11027e = 0;
        this.f11029g = false;
        this.f11030h = new float[9];
        this.f11031i = new float[9];
        this.f11033k = new s.b[16];
        this.f11034l = 0;
        this.f11035m = 0;
        this.f11036n = false;
        this.f11037o = -1;
        this.f11038p = 0.0f;
        this.f11039q = null;
        this.f11024b = str;
        this.f11032j = bVar;
    }

    public static String d(b bVar, String str) {
        StringBuilder sb;
        int i4;
        if (str != null) {
            sb = new StringBuilder();
            sb.append(str);
            i4 = D;
        } else {
            int i5 = a.f11040a[bVar.ordinal()];
            if (i5 == 1) {
                sb = new StringBuilder();
                sb.append("U");
                i4 = E + 1;
                E = i4;
            } else if (i5 == 2) {
                sb = new StringBuilder();
                sb.append("C");
                i4 = F + 1;
                F = i4;
            } else if (i5 == 3) {
                sb = new StringBuilder();
                sb.append("S");
                i4 = C + 1;
                C = i4;
            } else if (i5 == 4) {
                sb = new StringBuilder();
                sb.append("e");
                i4 = D + 1;
                D = i4;
            } else {
                if (i5 != 5) {
                    throw new AssertionError(bVar.name());
                }
                sb = new StringBuilder();
                sb.append("V");
                i4 = G + 1;
                G = i4;
            }
        }
        sb.append(i4);
        return sb.toString();
    }

    public static void e() {
        D++;
    }

    public final void a(s.b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f11034l;
            if (i4 >= i5) {
                s.b[] bVarArr = this.f11033k;
                if (i5 >= bVarArr.length) {
                    this.f11033k = (s.b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                s.b[] bVarArr2 = this.f11033k;
                int i6 = this.f11034l;
                bVarArr2[i6] = bVar;
                this.f11034l = i6 + 1;
                return;
            }
            if (this.f11033k[i4] == bVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    public void b() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f11030h[i4] = 0.0f;
        }
    }

    public String c() {
        return this.f11024b;
    }

    public final void f(s.b bVar) {
        int i4 = this.f11034l;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f11033k[i5] == bVar) {
                while (i5 < i4 - 1) {
                    s.b[] bVarArr = this.f11033k;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f11034l--;
                return;
            }
            i5++;
        }
    }

    public void g() {
        this.f11024b = null;
        this.f11032j = b.UNKNOWN;
        this.f11027e = 0;
        this.f11025c = -1;
        this.f11026d = -1;
        this.f11028f = 0.0f;
        this.f11029g = false;
        this.f11036n = false;
        this.f11037o = -1;
        this.f11038p = 0.0f;
        int i4 = this.f11034l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11033k[i5] = null;
        }
        this.f11034l = 0;
        this.f11035m = 0;
        this.f11023a = false;
        Arrays.fill(this.f11031i, 0.0f);
    }

    public void h(e eVar, float f4) {
        this.f11028f = f4;
        this.f11029g = true;
        this.f11036n = false;
        this.f11037o = -1;
        this.f11038p = 0.0f;
        int i4 = this.f11034l;
        this.f11026d = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11033k[i5].f(eVar, this, false);
        }
        this.f11034l = 0;
    }

    public void i(String str) {
        this.f11024b = str;
    }

    public void j(e eVar, i iVar, float f4) {
        this.f11036n = true;
        this.f11037o = iVar.f11025c;
        this.f11038p = f4;
        int i4 = this.f11034l;
        this.f11026d = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11033k[i5].G(eVar, this, false);
        }
        this.f11034l = 0;
        eVar.z();
    }

    public void k(b bVar, String str) {
        this.f11032j = bVar;
    }

    public String l() {
        StringBuilder sb;
        String str;
        String string = this + "[";
        boolean z3 = false;
        boolean z4 = true;
        for (int i4 = 0; i4 < this.f11030h.length; i4++) {
            String str2 = string + this.f11030h[i4];
            float[] fArr = this.f11030h;
            float f4 = fArr[i4];
            if (f4 > 0.0f) {
                z3 = false;
            } else if (f4 < 0.0f) {
                z3 = true;
            }
            if (f4 != 0.0f) {
                z4 = false;
            }
            if (i4 < fArr.length - 1) {
                sb = new StringBuilder();
                sb.append(str2);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                str = "] ";
            }
            sb.append(str);
            string = sb.toString();
        }
        if (z3) {
            string = string + " (-)";
        }
        if (!z4) {
            return string;
        }
        return string + " (*)";
    }

    public final void m(e eVar, s.b bVar) {
        int i4 = this.f11034l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11033k[i5].d(eVar, bVar, false);
        }
        this.f11034l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f11024b != null) {
            sb = new StringBuilder();
            sb.append(s0.a.f11071l);
            sb.append(this.f11024b);
        } else {
            sb = new StringBuilder();
            sb.append(s0.a.f11071l);
            sb.append(this.f11025c);
        }
        return sb.toString();
    }

    public i(b bVar, String str) {
        this.f11025c = -1;
        this.f11026d = -1;
        this.f11027e = 0;
        this.f11029g = false;
        this.f11030h = new float[9];
        this.f11031i = new float[9];
        this.f11033k = new s.b[16];
        this.f11034l = 0;
        this.f11035m = 0;
        this.f11036n = false;
        this.f11037o = -1;
        this.f11038p = 0.0f;
        this.f11039q = null;
        this.f11032j = bVar;
    }
}
