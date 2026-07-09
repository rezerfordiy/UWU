package n2;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f9340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f9341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f9342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f9343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f9344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f9345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a[] f9346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a[] f9347j;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f9349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short f9350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public short f9351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public short f9352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public short f9353f;

        public a() {
        }
    }

    public i() {
        this.f9344g = (short) 4;
        this.f9345h = null;
        this.f9346i = null;
        this.f9347j = null;
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
            int i11 = this.f9338a;
            int i12 = this.f9339b;
            if (i10 >= i11 * i12) {
                return this.f9345h;
            }
            int i13 = 4;
            int i14 = (bArr2[i10] & 255) * 4;
            a aVar = this.f9346i[i10];
            if (aVar.f9348a) {
                short s4 = aVar.f9349b;
                short s5 = aVar.f9350c;
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
                short s10 = aVar.f9353f;
                short s11 = aVar.f9352e;
                int i16 = ((((s6 * s10) + (s8 * (256 - s10))) * s11) + (((s7 * s10) + (s9 * (256 - s10))) * (256 - s11))) >> 16;
                if (i16 > 255) {
                    i16 = 255;
                }
                short s12 = aVar.f9351d;
                i14 += i16 * s12;
                i13 = 4 + s12;
            }
            a aVar2 = this.f9347j[i10];
            if (aVar2.f9348a) {
                short s13 = aVar2.f9349b;
                short s14 = aVar2.f9350c;
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
                short s19 = aVar2.f9353f;
                short s20 = aVar2.f9352e;
                int i18 = ((((s15 * s19) + (s17 * (256 - s19))) * s20) + (((s16 * s19) + (s18 * (256 - s19))) * (256 - s20))) >> 16;
                if (i18 > 255) {
                    i18 = 255;
                }
                short s21 = aVar2.f9351d;
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
            this.f9345h[i10] = (byte) (i19 & 255);
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
        throw new UnsupportedOperationException("Method not decompiled: n2.i.b():void");
    }

    public i(int i4, int i5, double d4, double d5, double d6, double d7) {
        this.f9344g = (short) 4;
        this.f9345h = null;
        this.f9346i = null;
        this.f9347j = null;
        this.f9338a = i4;
        this.f9339b = i5;
        this.f9345h = new byte[i4 * i5];
        this.f9340c = d4;
        this.f9341d = d5;
        this.f9342e = d6;
        this.f9343f = d7;
        this.f9346i = null;
        this.f9347j = null;
        int i6 = i4 * i5;
        this.f9346i = new a[i6];
        this.f9347j = new a[i6];
        b();
    }
}
