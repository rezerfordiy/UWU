package z1;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f13650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f13651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f13652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f13653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f13654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f13655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a[] f13656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a[] f13657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13658k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f13660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short f13661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public short f13662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public short f13663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public short f13664f;
    }

    public n() {
        this.f13654g = (short) 4;
        this.f13655h = null;
        this.f13656i = null;
        this.f13657j = null;
        this.f13658k = false;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        while (true) {
            int i11 = this.f13648a;
            int i12 = this.f13649b;
            if (i10 >= i11 * i12) {
                return this.f13655h;
            }
            int i13 = 4;
            int i14 = (bArr2[i10] & 255) * 4;
            a aVar = this.f13656i[i10];
            if (aVar.f13659a) {
                short s4 = aVar.f13660b;
                short s5 = aVar.f13661c;
                int i15 = (s4 * i12) + s5;
                if (s4 < i11 - 1) {
                    i7 = i15 + i12;
                    i8 = i15 + i12;
                } else {
                    i7 = i15;
                    i8 = i7;
                }
                if (s5 < i12 - 1) {
                    i9 = i15 + 1;
                    i8++;
                } else {
                    i9 = i15;
                }
                short s6 = (short) (bArr[i15] & 255);
                short s7 = (short) (bArr[i7] & 255);
                short s8 = (short) (bArr[i9] & 255);
                short s9 = (short) (bArr[i8] & 255);
                short s10 = aVar.f13664f;
                short s11 = aVar.f13663e;
                int i16 = ((((s6 * s10) + (s8 * (256 - s10))) * s11) + (((s7 * s10) + (s9 * (256 - s10))) * (256 - s11))) >> 16;
                if (i16 > 255) {
                    i16 = 255;
                }
                short s12 = aVar.f13662d;
                i14 += i16 * s12;
                i13 = 4 + s12;
            }
            a aVar2 = this.f13657j[i10];
            if (aVar2.f13659a) {
                short s13 = aVar2.f13660b;
                short s14 = aVar2.f13661c;
                int i17 = (s13 * i12) + s14;
                if (s13 < i11 - 1) {
                    i4 = i17 + i12;
                    i5 = i17 + i12;
                } else {
                    i4 = i17;
                    i5 = i4;
                }
                if (s14 < i12 - 1) {
                    i6 = i17 + 1;
                    i5++;
                } else {
                    i6 = i17;
                }
                short s15 = (short) (bArr3[i17] & 255);
                short s16 = (short) (bArr3[i4] & 255);
                short s17 = (short) (bArr3[i6] & 255);
                short s18 = (short) (bArr3[i5] & 255);
                short s19 = aVar2.f13664f;
                short s20 = aVar2.f13663e;
                int i18 = ((((s15 * s19) + (s17 * (256 - s19))) * s20) + (((s16 * s19) + (s18 * (256 - s19))) * (256 - s20))) >> 16;
                if (i18 > 255) {
                    i18 = 255;
                }
                short s21 = aVar2.f13662d;
                i14 += i18 * s21;
                i13 += s21;
            }
            int i19 = i14 / i13;
            if (i19 > 255) {
                i19 = 255;
            }
            if (i19 < 0) {
                i19 = 0;
            }
            this.f13655h[i10] = (byte) (i19 & 255);
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.n.b():void");
    }

    public n(int i4, int i5, double d4, double d5, double d6, double d7) {
        this.f13654g = (short) 4;
        this.f13655h = null;
        this.f13656i = null;
        this.f13657j = null;
        this.f13658k = false;
        this.f13648a = i4;
        this.f13649b = i5;
        this.f13655h = new byte[i4 * i5];
        this.f13650c = d4;
        this.f13651d = d5;
        this.f13652e = d6;
        this.f13653f = d7;
        this.f13656i = null;
        this.f13657j = null;
        int i6 = i4 * i5;
        this.f13656i = new a[i6];
        this.f13657j = new a[i6];
        b();
    }
}
