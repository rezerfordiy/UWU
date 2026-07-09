package s;

import java.util.Arrays;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f11047n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f11048o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static float f11049p = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11050a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11051b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11052c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f11053d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f11054e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f11055f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f11056g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f11057h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f11058i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11059j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11060k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f11061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f11062m;

    public j(b bVar, c cVar) {
        this.f11061l = bVar;
        this.f11062m = cVar;
        clear();
    }

    @Override // s.b.a
    public float a(int i4) {
        int i5 = this.f11059j;
        int i6 = this.f11060k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f11056g[i6];
            }
            i6 = this.f11058i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.b.a
    public float b(b bVar, boolean z3) {
        float fG = g(bVar.f10935a);
        c(bVar.f10935a, z3);
        j jVar = (j) bVar.f10939e;
        int iN = jVar.n();
        int i4 = 0;
        int i5 = 0;
        while (i4 < iN) {
            int i6 = jVar.f11055f[i5];
            if (i6 != -1) {
                k(this.f11062m.f10944d[i6], jVar.f11056g[i5] * fG, z3);
                i4++;
            }
            i5++;
        }
        return fG;
    }

    @Override // s.b.a
    public float c(i iVar, boolean z3) {
        int i4 = i(iVar);
        if (i4 == -1) {
            return 0.0f;
        }
        u(iVar);
        float f4 = this.f11056g[i4];
        if (this.f11060k == i4) {
            this.f11060k = this.f11058i[i4];
        }
        this.f11055f[i4] = -1;
        int[] iArr = this.f11057h;
        int i5 = iArr[i4];
        if (i5 != -1) {
            int[] iArr2 = this.f11058i;
            iArr2[i5] = iArr2[i4];
        }
        int i6 = this.f11058i[i4];
        if (i6 != -1) {
            iArr[i6] = iArr[i4];
        }
        this.f11059j--;
        iVar.f11035m--;
        if (z3) {
            iVar.f(this.f11061l);
        }
        return f4;
    }

    @Override // s.b.a
    public void clear() {
        int i4 = this.f11059j;
        for (int i5 = 0; i5 < i4; i5++) {
            i iVarF = f(i5);
            if (iVarF != null) {
                iVarF.f(this.f11061l);
            }
        }
        for (int i6 = 0; i6 < this.f11051b; i6++) {
            this.f11055f[i6] = -1;
            this.f11054e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f11052c; i7++) {
            this.f11053d[i7] = -1;
        }
        this.f11059j = 0;
        this.f11060k = -1;
    }

    @Override // s.b.a
    public int d() {
        return 0;
    }

    @Override // s.b.a
    public void e() {
        int i4 = this.f11059j;
        System.out.print("{ ");
        for (int i5 = 0; i5 < i4; i5++) {
            i iVarF = f(i5);
            if (iVarF != null) {
                System.out.print(iVarF + " = " + a(i5) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // s.b.a
    public i f(int i4) {
        int i5 = this.f11059j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f11060k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f11062m.f10944d[this.f11055f[i6]];
            }
            i6 = this.f11058i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.b.a
    public float g(i iVar) {
        int i4 = i(iVar);
        if (i4 != -1) {
            return this.f11056g[i4];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean h(i iVar) {
        return i(iVar) != -1;
    }

    @Override // s.b.a
    public int i(i iVar) {
        if (this.f11059j != 0 && iVar != null) {
            int i4 = iVar.f11025c;
            int i5 = this.f11053d[i4 % this.f11052c];
            if (i5 == -1) {
                return -1;
            }
            if (this.f11055f[i5] == i4) {
                return i5;
            }
            do {
                i5 = this.f11054e[i5];
                if (i5 == -1) {
                    break;
                }
            } while (this.f11055f[i5] != i4);
            if (i5 != -1 && this.f11055f[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // s.b.a
    public void j(float f4) {
        int i4 = this.f11059j;
        int i5 = this.f11060k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f11056g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f11058i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f4, boolean z3) {
        float f5 = f11049p;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = i(iVar);
            if (i4 == -1) {
                l(iVar, f4);
                return;
            }
            float[] fArr = this.f11056g;
            float f6 = fArr[i4] + f4;
            fArr[i4] = f6;
            float f7 = f11049p;
            if (f6 <= (-f7) || f6 >= f7) {
                return;
            }
            fArr[i4] = 0.0f;
            c(iVar, z3);
        }
    }

    @Override // s.b.a
    public void l(i iVar, float f4) {
        float f5 = f11049p;
        if (f4 > (-f5) && f4 < f5) {
            c(iVar, true);
            return;
        }
        if (this.f11059j == 0) {
            p(0, iVar, f4);
            o(iVar, 0);
            this.f11060k = 0;
            return;
        }
        int i4 = i(iVar);
        if (i4 != -1) {
            this.f11056g[i4] = f4;
            return;
        }
        if (this.f11059j + 1 >= this.f11051b) {
            s();
        }
        int i5 = this.f11059j;
        int i6 = this.f11060k;
        int i7 = -1;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.f11055f[i6];
            int i10 = iVar.f11025c;
            if (i9 == i10) {
                this.f11056g[i6] = f4;
                return;
            }
            if (i9 < i10) {
                i7 = i6;
            }
            i6 = this.f11058i[i6];
            if (i6 == -1) {
                break;
            }
        }
        t(i7, iVar, f4);
    }

    @Override // s.b.a
    public void m() {
        int i4 = this.f11059j;
        int i5 = this.f11060k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f11056g;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f11058i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public int n() {
        return this.f11059j;
    }

    public final void o(i iVar, int i4) {
        int[] iArr;
        int i5 = iVar.f11025c % this.f11052c;
        int[] iArr2 = this.f11053d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f11054e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                } else {
                    i6 = i7;
                }
            }
            iArr[i6] = i4;
        }
        this.f11054e[i4] = -1;
    }

    public final void p(int i4, i iVar, float f4) {
        this.f11055f[i4] = iVar.f11025c;
        this.f11056g[i4] = f4;
        this.f11057h[i4] = -1;
        this.f11058i[i4] = -1;
        iVar.a(this.f11061l);
        iVar.f11035m++;
        this.f11059j++;
    }

    public final void q() {
        for (int i4 = 0; i4 < this.f11052c; i4++) {
            if (this.f11053d[i4] != -1) {
                String str = hashCode() + " hash [" + i4 + "] => ";
                int i5 = this.f11053d[i4];
                boolean z3 = false;
                while (!z3) {
                    str = str + " " + this.f11055f[i5];
                    int i6 = this.f11054e[i5];
                    if (i6 != -1) {
                        i5 = i6;
                    } else {
                        z3 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    public final int r() {
        for (int i4 = 0; i4 < this.f11051b; i4++) {
            if (this.f11055f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    public final void s() {
        int i4 = this.f11051b * 2;
        this.f11055f = Arrays.copyOf(this.f11055f, i4);
        this.f11056g = Arrays.copyOf(this.f11056g, i4);
        this.f11057h = Arrays.copyOf(this.f11057h, i4);
        this.f11058i = Arrays.copyOf(this.f11058i, i4);
        this.f11054e = Arrays.copyOf(this.f11054e, i4);
        for (int i5 = this.f11051b; i5 < i4; i5++) {
            this.f11055f[i5] = -1;
            this.f11054e[i5] = -1;
        }
        this.f11051b = i4;
    }

    public final void t(int i4, i iVar, float f4) {
        int iR = r();
        p(iR, iVar, f4);
        if (i4 != -1) {
            this.f11057h[iR] = i4;
            int[] iArr = this.f11058i;
            iArr[iR] = iArr[i4];
            iArr[i4] = iR;
        } else {
            this.f11057h[iR] = -1;
            if (this.f11059j > 0) {
                this.f11058i[iR] = this.f11060k;
                this.f11060k = iR;
            } else {
                this.f11058i[iR] = -1;
            }
        }
        int i5 = this.f11058i[iR];
        if (i5 != -1) {
            this.f11057h[i5] = iR;
        }
        o(iVar, iR);
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i4 = this.f11059j;
        for (int i5 = 0; i5 < i4; i5++) {
            i iVarF = f(i5);
            if (iVarF != null) {
                String str2 = str + iVarF + " = " + a(i5) + " ";
                int i6 = i(iVarF);
                String str3 = str2 + "[p: ";
                if (this.f11057h[i6] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f11062m.f10944d[this.f11055f[this.f11057h[i6]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f11058i[i6] != -1 ? str4 + this.f11062m.f10944d[this.f11055f[this.f11058i[i6]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    public final void u(i iVar) {
        int[] iArr;
        int i4;
        int i5 = iVar.f11025c;
        int i6 = i5 % this.f11052c;
        int[] iArr2 = this.f11053d;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            return;
        }
        if (this.f11055f[i7] == i5) {
            int[] iArr3 = this.f11054e;
            iArr2[i6] = iArr3[i7];
            iArr3[i7] = -1;
            return;
        }
        while (true) {
            iArr = this.f11054e;
            i4 = iArr[i7];
            if (i4 == -1 || this.f11055f[i4] == i5) {
                break;
            } else {
                i7 = i4;
            }
        }
        if (i4 == -1 || this.f11055f[i4] != i5) {
            return;
        }
        iArr[i7] = iArr[i4];
        iArr[i4] = -1;
    }
}
