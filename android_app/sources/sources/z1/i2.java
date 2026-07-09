package z1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static byte f13321k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static byte f13322l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static byte f13323m = 17;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13324n = 672000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f13327c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f13332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f13333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13334j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13325a = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13326b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13328d = new byte[672000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13329e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f13330f = new byte[672000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13331g = 0;

    public void a() {
        int i4;
        if (this.f13328d.length > 525) {
            int i5 = 0;
            while (true) {
                i4 = this.f13329e;
                if (i5 >= i4 - 525) {
                    i5 = 0;
                    break;
                }
                byte[] bArr = this.f13328d;
                if (bArr[i5 + 0] == 90 && bArr[i5 + 1] == -91 && bArr[i5 + 2] == -1 && bArr[i5 + 3] == 0) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 > 0) {
                byte[] bArr2 = this.f13328d;
                System.arraycopy(bArr2, i5, bArr2, 0, i4 - i5);
                this.f13329e -= i5;
            }
        }
    }

    public void b(byte[] bArr) {
        synchronized (this) {
            h2 h2Var = this.f13327c;
            if (h2Var != null) {
                h2Var.a(bArr, 0);
            }
        }
    }

    public void c(byte[] bArr) {
        if (this.f13328d == null) {
            this.f13328d = new byte[672000];
        }
        System.arraycopy(bArr, 0, this.f13328d, this.f13329e, bArr.length);
        this.f13329e += bArr.length;
        while (true) {
            a();
            if (this.f13329e < 525) {
                return;
            }
            byte[] bArrCopyOf = Arrays.copyOf(this.f13328d, 525);
            byte b4 = bArrCopyOf[7];
            int i4 = ((bArrCopyOf[4] & 255) << 8) | (bArrCopyOf[5] & 255);
            if (i4 > 0 && (b4 == f13321k || b4 == f13322l || b4 == f13323m)) {
                if (this.f13330f == null) {
                    this.f13330f = new byte[672000];
                }
                System.arraycopy(bArrCopyOf, 0, this.f13330f, this.f13331g, bArrCopyOf.length);
                this.f13331g += bArrCopyOf.length;
            }
            if (b4 == f13321k) {
                byte[] bArr2 = this.f13330f;
                if (bArr2 != null) {
                    b(Arrays.copyOf(bArr2, this.f13331g));
                }
            } else if (b4 == f13322l) {
                byte[] bArr3 = this.f13330f;
                if (bArr3 != null) {
                    b(Arrays.copyOf(bArr3, this.f13331g));
                }
            } else if (b4 != f13323m) {
                byte[] bArr4 = this.f13328d;
                System.arraycopy(bArr4, i4, bArr4, 0, this.f13329e - i4);
                this.f13329e -= i4;
            } else {
                byte[] bArr5 = this.f13330f;
                if (bArr5 != null) {
                    b(Arrays.copyOf(bArr5, this.f13331g));
                }
            }
            this.f13331g = 0;
            byte[] bArr42 = this.f13328d;
            System.arraycopy(bArr42, i4, bArr42, 0, this.f13329e - i4);
            this.f13329e -= i4;
        }
    }

    public void d() {
        this.f13328d = null;
        this.f13330f = null;
        this.f13332h = (byte) 0;
        this.f13334j = 0;
    }

    public void e(h2 h2Var) {
        this.f13327c = h2Var;
    }

    public void f() {
    }

    public void g() {
    }
}
