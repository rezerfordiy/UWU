package s;

import java.util.Arrays;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f10918l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f10919m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f10920n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static float f10921o = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f10923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10922a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10925d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f10926e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f10927f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f10928g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f10929h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10930i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10931j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10932k = false;

    public a(b bVar, c cVar) {
        this.f10923b = bVar;
        this.f10924c = cVar;
    }

    @Override // s.b.a
    public float a(int i4) {
        int i5 = this.f10930i;
        for (int i6 = 0; i5 != -1 && i6 < this.f10922a; i6++) {
            if (i6 == i4) {
                return this.f10929h[i5];
            }
            i5 = this.f10928g[i5];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public float b(b bVar, boolean z3) {
        float fG = g(bVar.f10935a);
        c(bVar.f10935a, z3);
        b.a aVar = bVar.f10939e;
        int iN = aVar.n();
        for (int i4 = 0; i4 < iN; i4++) {
            i iVarF = aVar.f(i4);
            k(iVarF, aVar.g(iVarF) * fG, z3);
        }
        return fG;
    }

    @Override // s.b.a
    public final float c(i iVar, boolean z3) {
        if (this.f10926e == iVar) {
            this.f10926e = null;
        }
        int i4 = this.f10930i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f10922a) {
            if (this.f10927f[i4] == iVar.f11025c) {
                if (i4 == this.f10930i) {
                    this.f10930i = this.f10928g[i4];
                } else {
                    int[] iArr = this.f10928g;
                    iArr[i6] = iArr[i4];
                }
                if (z3) {
                    iVar.f(this.f10923b);
                }
                iVar.f11035m--;
                this.f10922a--;
                this.f10927f[i4] = -1;
                if (this.f10932k) {
                    this.f10931j = i4;
                }
                return this.f10929h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f10928g[i4];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public final void clear() {
        int i4 = this.f10930i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            i iVar = this.f10924c.f10944d[this.f10927f[i4]];
            if (iVar != null) {
                iVar.f(this.f10923b);
            }
            i4 = this.f10928g[i4];
        }
        this.f10930i = -1;
        this.f10931j = -1;
        this.f10932k = false;
        this.f10922a = 0;
    }

    @Override // s.b.a
    public int d() {
        return (this.f10927f.length * 4 * 3) + 0 + 36;
    }

    @Override // s.b.a
    public void e() {
        int i4 = this.f10922a;
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
        int i5 = this.f10930i;
        for (int i6 = 0; i5 != -1 && i6 < this.f10922a; i6++) {
            if (i6 == i4) {
                return this.f10924c.f10944d[this.f10927f[i5]];
            }
            i5 = this.f10928g[i5];
        }
        return null;
    }

    @Override // s.b.a
    public final float g(i iVar) {
        int i4 = this.f10930i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            if (this.f10927f[i4] == iVar.f11025c) {
                return this.f10929h[i4];
            }
            i4 = this.f10928g[i4];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean h(i iVar) {
        int i4 = this.f10930i;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            if (this.f10927f[i4] == iVar.f11025c) {
                return true;
            }
            i4 = this.f10928g[i4];
        }
        return false;
    }

    @Override // s.b.a
    public int i(i iVar) {
        int i4 = this.f10930i;
        if (i4 == -1) {
            return -1;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            if (this.f10927f[i4] == iVar.f11025c) {
                return i4;
            }
            i4 = this.f10928g[i4];
        }
        return -1;
    }

    @Override // s.b.a
    public void j(float f4) {
        int i4 = this.f10930i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            float[] fArr = this.f10929h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f10928g[i4];
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f4, boolean z3) {
        float f5 = f10921o;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f10930i;
            if (i4 == -1) {
                this.f10930i = 0;
                this.f10929h[0] = f4;
                this.f10927f[0] = iVar.f11025c;
                this.f10928g[0] = -1;
                iVar.f11035m++;
                iVar.a(this.f10923b);
                this.f10922a++;
                if (this.f10932k) {
                    return;
                }
                int i5 = this.f10931j + 1;
                this.f10931j = i5;
                int[] iArr = this.f10927f;
                if (i5 >= iArr.length) {
                    this.f10932k = true;
                    this.f10931j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f10922a; i7++) {
                int i8 = this.f10927f[i4];
                int i9 = iVar.f11025c;
                if (i8 == i9) {
                    float[] fArr = this.f10929h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f10921o;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f10930i) {
                            this.f10930i = this.f10928g[i4];
                        } else {
                            int[] iArr2 = this.f10928g;
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z3) {
                            iVar.f(this.f10923b);
                        }
                        if (this.f10932k) {
                            this.f10931j = i4;
                        }
                        iVar.f11035m--;
                        this.f10922a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i4;
                }
                i4 = this.f10928g[i4];
            }
            int length = this.f10931j;
            int i10 = length + 1;
            if (this.f10932k) {
                int[] iArr3 = this.f10927f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i10;
            }
            int[] iArr4 = this.f10927f;
            if (length >= iArr4.length && this.f10922a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f10927f;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f10927f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i12 = this.f10925d * 2;
                this.f10925d = i12;
                this.f10932k = false;
                this.f10931j = length - 1;
                this.f10929h = Arrays.copyOf(this.f10929h, i12);
                this.f10927f = Arrays.copyOf(this.f10927f, this.f10925d);
                this.f10928g = Arrays.copyOf(this.f10928g, this.f10925d);
            }
            this.f10927f[length] = iVar.f11025c;
            this.f10929h[length] = f4;
            int[] iArr7 = this.f10928g;
            if (i6 != -1) {
                iArr7[length] = iArr7[i6];
                iArr7[i6] = length;
            } else {
                iArr7[length] = this.f10930i;
                this.f10930i = length;
            }
            iVar.f11035m++;
            iVar.a(this.f10923b);
            this.f10922a++;
            if (!this.f10932k) {
                this.f10931j++;
            }
            int i13 = this.f10931j;
            int[] iArr8 = this.f10927f;
            if (i13 >= iArr8.length) {
                this.f10932k = true;
                this.f10931j = iArr8.length - 1;
            }
        }
    }

    @Override // s.b.a
    public final void l(i iVar, float f4) {
        if (f4 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i4 = this.f10930i;
        if (i4 == -1) {
            this.f10930i = 0;
            this.f10929h[0] = f4;
            this.f10927f[0] = iVar.f11025c;
            this.f10928g[0] = -1;
            iVar.f11035m++;
            iVar.a(this.f10923b);
            this.f10922a++;
            if (this.f10932k) {
                return;
            }
            int i5 = this.f10931j + 1;
            this.f10931j = i5;
            int[] iArr = this.f10927f;
            if (i5 >= iArr.length) {
                this.f10932k = true;
                this.f10931j = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f10922a; i7++) {
            int i8 = this.f10927f[i4];
            int i9 = iVar.f11025c;
            if (i8 == i9) {
                this.f10929h[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f10928g[i4];
        }
        int length = this.f10931j;
        int i10 = length + 1;
        if (this.f10932k) {
            int[] iArr2 = this.f10927f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.f10927f;
        if (length >= iArr3.length && this.f10922a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f10927f;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f10927f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.f10925d * 2;
            this.f10925d = i12;
            this.f10932k = false;
            this.f10931j = length - 1;
            this.f10929h = Arrays.copyOf(this.f10929h, i12);
            this.f10927f = Arrays.copyOf(this.f10927f, this.f10925d);
            this.f10928g = Arrays.copyOf(this.f10928g, this.f10925d);
        }
        this.f10927f[length] = iVar.f11025c;
        this.f10929h[length] = f4;
        int[] iArr6 = this.f10928g;
        if (i6 != -1) {
            iArr6[length] = iArr6[i6];
            iArr6[i6] = length;
        } else {
            iArr6[length] = this.f10930i;
            this.f10930i = length;
        }
        iVar.f11035m++;
        iVar.a(this.f10923b);
        int i13 = this.f10922a + 1;
        this.f10922a = i13;
        if (!this.f10932k) {
            this.f10931j++;
        }
        int[] iArr7 = this.f10927f;
        if (i13 >= iArr7.length) {
            this.f10932k = true;
        }
        if (this.f10931j >= iArr7.length) {
            this.f10932k = true;
            this.f10931j = iArr7.length - 1;
        }
    }

    @Override // s.b.a
    public void m() {
        int i4 = this.f10930i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            float[] fArr = this.f10929h;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f10928g[i4];
        }
    }

    @Override // s.b.a
    public int n() {
        return this.f10922a;
    }

    public int o() {
        return this.f10930i;
    }

    public final int p(int i4) {
        return this.f10927f[i4];
    }

    public final int q(int i4) {
        return this.f10928g[i4];
    }

    public i r() {
        i iVar = this.f10926e;
        if (iVar != null) {
            return iVar;
        }
        int i4 = this.f10930i;
        i iVar2 = null;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            if (this.f10929h[i4] < 0.0f) {
                i iVar3 = this.f10924c.f10944d[this.f10927f[i4]];
                if (iVar2 == null || iVar2.f11027e < iVar3.f11027e) {
                    iVar2 = iVar3;
                }
            }
            i4 = this.f10928g[i4];
        }
        return iVar2;
    }

    public final float s(int i4) {
        return this.f10929h[i4];
    }

    public boolean t() {
        int i4 = this.f10930i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            if (this.f10929h[i4] > 0.0f) {
                return true;
            }
            i4 = this.f10928g[i4];
        }
        return false;
    }

    public String toString() {
        int i4 = this.f10930i;
        String str = s0.a.f11071l;
        for (int i5 = 0; i4 != -1 && i5 < this.f10922a; i5++) {
            str = ((str + " -> ") + this.f10929h[i4] + " : ") + this.f10924c.f10944d[this.f10927f[i4]];
            i4 = this.f10928g[i4];
        }
        return str;
    }
}
