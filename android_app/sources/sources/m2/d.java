package m2;

import android.os.AsyncTask;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import com.sonoptek.vulkan.VKDSCJni;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static boolean f8739d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f8740e0 = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f8741f0 = 8;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ boolean f8742g0 = false;
    public byte[] A;
    public byte[] B;
    public byte[] C;
    public Allocation D;
    public n2.d0 E;
    public int F;
    public float[] G;
    public Allocation H;
    public n2.d0 I;
    public RenderScript J;
    public n2.y K;
    public int[] U;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f8744a0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8754i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f8758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f8759n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Allocation f8761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Allocation f8762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Allocation f8763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Allocation f8764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Allocation f8765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Allocation f8766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Allocation f8767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Allocation f8768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Allocation f8769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Allocation f8770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f8771z;
    public float L = 0.0f;
    public double M = Math.sin(0.0d);
    public double N = Math.cos(0.0d);
    public float O = 0.0f;
    public double P = Math.sin(0.0d);
    public double Q = Math.cos(0.0d);
    public double R = Math.tan(0.0d);
    public int S = 2;
    public int T = 2;
    public f V = null;
    public AsyncTaskC0081d W = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f8746b0 = 0.0f;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f8748c0 = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f8743a = 0.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f8745b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f8747c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8749d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8750e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8751f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8752g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8755j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8756k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f8760o = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f8757l = new e();

    public class b extends AsyncTask<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8773b;

        public b() {
            this.f8772a = 2;
            this.f8773b = 2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            int i4;
            g gVar = new g();
            gVar.f8783b = d.this.X;
            gVar.f8782a = d.this.f8744a0;
            g gVar2 = new g();
            gVar2.f8783b = d.this.Y;
            gVar2.f8782a = d.this.Z;
            g gVar3 = new g();
            gVar3.f8783b = d.this.X;
            gVar3.f8782a = d.this.Z;
            g gVar4 = new g();
            gVar4.f8783b = d.this.Y;
            gVar4.f8782a = d.this.f8744a0;
            g gVar5 = new g();
            gVar5.f8783b = d.this.Y;
            d dVar = d.this;
            gVar5.f8782a = dVar.f8749d / 2;
            if (dVar.f8746b0 != 0.0f) {
                d dVar2 = d.this;
                i4 = (dVar2.f8753h - dVar2.f8751f) / 2;
            } else {
                i4 = 0;
            }
            d dVar3 = d.this;
            e eVarK = dVar3.k(gVar, dVar3.f8746b0);
            double d4 = i4;
            eVarK.f8779a += d4;
            d dVar4 = d.this;
            e eVarK2 = dVar4.k(gVar2, dVar4.f8746b0);
            eVarK2.f8779a += d4;
            d dVar5 = d.this;
            e eVarK3 = dVar5.k(gVar3, dVar5.f8746b0);
            eVarK3.f8779a += d4;
            d dVar6 = d.this;
            e eVarK4 = dVar6.k(gVar4, dVar6.f8746b0);
            eVarK4.f8779a += d4;
            d dVar7 = d.this;
            e eVarK5 = dVar7.k(gVar5, dVar7.f8746b0);
            eVarK5.f8779a += d4;
            double d5 = eVarK3.f8779a;
            double d6 = eVarK2.f8779a;
            if (d5 >= d6) {
                d5 = d6;
            }
            double d7 = eVarK.f8779a;
            double d8 = eVarK4.f8779a;
            if (d7 <= d8) {
                d7 = d8;
            }
            double d9 = eVarK3.f8780b;
            double d10 = eVarK.f8780b;
            if (d9 >= d10) {
                d9 = d10;
            }
            double d11 = eVarK2.f8780b;
            double d12 = eVarK4.f8780b;
            if (d11 <= d12) {
                d11 = d12;
            }
            int i5 = d.this.Z;
            d dVar8 = d.this;
            if (i5 <= dVar8.f8749d / 2 && dVar8.f8744a0 >= d.this.f8749d / 2) {
                double d13 = eVarK5.f8780b;
                if (d11 <= d13) {
                    d11 = d13;
                }
            }
            int iMax = Math.max((int) (d5 + 0.9999999d), this.f8773b);
            int iMax2 = Math.max((int) (d9 + 0.9999999d), this.f8773b);
            int iMin = Math.min((int) d7, (d.this.f8753h - 1) - this.f8773b);
            int iMin2 = Math.min((int) d11, (d.this.f8754i - 1) - this.f8773b);
            if (d.f8739d0) {
                float f4 = d.this.f8746b0;
                d dVar9 = d.this;
                int i6 = dVar9.f8749d;
                int i7 = dVar9.f8750e;
                int i8 = dVar9.X;
                int i9 = d.this.Y;
                int i10 = d.this.Z;
                int i11 = d.this.f8744a0;
                d dVar10 = d.this;
                int i12 = dVar10.f8753h;
                int i13 = dVar10.f8754i;
                byte[] bArr = dVar10.B;
                byte[] bArrVulkanColorDSCImage = VKDSCJni.vulkanColorDSCImage(iMax, iMin, iMax2, iMin2, f4, i6, i7, i8, i9, i10, i11, i12, i13, bArr, bArr.length, i12 * i13);
                byte[] bArr2 = new byte[bArrVulkanColorDSCImage.length / 2];
                byte[] bArr3 = new byte[bArrVulkanColorDSCImage.length / 2];
                for (int i14 = 0; i14 < bArrVulkanColorDSCImage.length - 2; i14 += 2) {
                    int i15 = i14 / 2;
                    bArr2[i15] = bArrVulkanColorDSCImage[i14];
                    bArr3[i15] = bArrVulkanColorDSCImage[i14 + 1];
                }
                d dVar11 = d.this;
                byte[] bArrG = t.g(bArr2, dVar11.f8753h, dVar11.f8754i, this.f8772a, iMax + 1, iMin, iMax2 + 1, iMin2, this.f8773b);
                d dVar12 = d.this;
                byte[] bArr4 = dVar12.C;
                if (bArr4 == null || bArr4.length != bArrVulkanColorDSCImage.length * 2) {
                    dVar12.C = new byte[bArrVulkanColorDSCImage.length * 2];
                } else {
                    Arrays.fill(bArr4, (byte) 0);
                }
                d dVar13 = d.this;
                t.d(dVar13.C, bArrG, bArr3, dVar13.f8753h, iMax - 20, iMin, iMax2 - 20, iMin2);
            } else {
                d.this.K.R0();
                d.this.K.Q0(d.this.X, d.this.Y, d.this.Z, d.this.f8744a0, d.this.f8746b0, d.this.f8750e);
                n2.y yVar = d.this.K;
                Allocation allocation = d.this.f8766u;
                yVar.r(allocation, allocation);
                n2.y yVar2 = d.this.K;
                Allocation allocation2 = d.this.f8765t;
                yVar2.z(allocation2, allocation2);
                d.this.K.M0(iMax, iMin, iMax2, iMin2, this.f8772a, this.f8773b);
                n2.y yVar3 = d.this.K;
                d dVar14 = d.this;
                yVar3.p(dVar14.f8766u, dVar14.D);
                d.this.D.copyTo(d.this.C);
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        
            if (r4 != 3) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(int r4) {
            /*
                r3 = this;
                r0 = 1
                if (r4 == 0) goto L16
                if (r4 == r0) goto L13
                r1 = 2
                if (r4 == r1) goto Le
                r2 = 3
                r3.f8772a = r1
                if (r4 == r2) goto L19
                goto L10
            Le:
                r3.f8772a = r0
            L10:
                r3.f8773b = r1
                goto L1b
            L13:
                r3.f8772a = r0
                goto L19
            L16:
                r4 = 0
                r3.f8772a = r4
            L19:
                r3.f8773b = r0
            L1b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.d.b.b(int):void");
        }
    }

    public class c extends AsyncTask<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8776b;

        public c() {
            this.f8775a = 2;
            this.f8776b = 2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            int i4;
            g gVar = new g();
            gVar.f8783b = d.this.X;
            gVar.f8782a = d.this.f8744a0;
            g gVar2 = new g();
            gVar2.f8783b = d.this.Y;
            gVar2.f8782a = d.this.Z;
            g gVar3 = new g();
            gVar3.f8783b = d.this.X;
            gVar3.f8782a = d.this.Z;
            g gVar4 = new g();
            gVar4.f8783b = d.this.Y;
            gVar4.f8782a = d.this.f8744a0;
            g gVar5 = new g();
            gVar5.f8783b = d.this.Y;
            d dVar = d.this;
            gVar5.f8782a = dVar.f8749d / 2;
            if (dVar.f8748c0 != 0.0f) {
                d dVar2 = d.this;
                i4 = (dVar2.f8753h - dVar2.f8751f) / 2;
            } else {
                i4 = 0;
            }
            d dVar3 = d.this;
            e eVarK = dVar3.k(gVar, dVar3.f8748c0);
            double d4 = i4;
            eVarK.f8779a += d4;
            d dVar4 = d.this;
            e eVarK2 = dVar4.k(gVar2, dVar4.f8748c0);
            eVarK2.f8779a += d4;
            d dVar5 = d.this;
            e eVarK3 = dVar5.k(gVar3, dVar5.f8748c0);
            eVarK3.f8779a += d4;
            d dVar6 = d.this;
            e eVarK4 = dVar6.k(gVar4, dVar6.f8748c0);
            eVarK4.f8779a += d4;
            d dVar7 = d.this;
            e eVarK5 = dVar7.k(gVar5, dVar7.f8748c0);
            eVarK5.f8779a += d4;
            double d5 = eVarK3.f8779a;
            double d6 = eVarK2.f8779a;
            if (d5 >= d6) {
                d5 = d6;
            }
            double d7 = eVarK.f8779a;
            double d8 = eVarK4.f8779a;
            if (d7 <= d8) {
                d7 = d8;
            }
            double d9 = eVarK3.f8780b;
            double d10 = eVarK.f8780b;
            if (d9 >= d10) {
                d9 = d10;
            }
            double d11 = eVarK2.f8780b;
            double d12 = eVarK4.f8780b;
            if (d11 <= d12) {
                d11 = d12;
            }
            int i5 = d.this.Z;
            d dVar8 = d.this;
            if (i5 <= dVar8.f8749d / 2 && dVar8.f8744a0 >= d.this.f8749d / 2) {
                double d13 = eVarK5.f8780b;
                if (d11 <= d13) {
                    d11 = d13;
                }
            }
            int iMax = Math.max((int) (d5 + 0.9999999d), this.f8776b);
            int iMax2 = Math.max((int) (d9 + 0.9999999d), this.f8776b);
            int iMin = Math.min((int) d7, (d.this.f8753h - 1) - this.f8776b);
            int iMin2 = Math.min((int) d11, (d.this.f8754i - 1) - this.f8776b);
            if (d.f8739d0) {
                float f4 = d.this.f8748c0;
                d dVar9 = d.this;
                int i6 = dVar9.f8749d;
                int i7 = dVar9.f8750e;
                int i8 = dVar9.X;
                int i9 = d.this.Y;
                int i10 = d.this.Z;
                int i11 = d.this.f8744a0;
                d dVar10 = d.this;
                int i12 = dVar10.f8753h;
                int i13 = dVar10.f8754i;
                byte[] bArr = dVar10.B;
                byte[] bArrVulkanPowerDSCImage = VKDSCJni.vulkanPowerDSCImage(iMax, iMin, iMax2, iMin2, f4, i6, i7, i8, i9, i10, i11, i12, i13, bArr, bArr.length, i12 * i13);
                byte[] bArr2 = new byte[bArrVulkanPowerDSCImage.length / 2];
                byte[] bArr3 = new byte[bArrVulkanPowerDSCImage.length / 2];
                for (int i14 = 0; i14 < bArrVulkanPowerDSCImage.length - 2; i14 += 2) {
                    int i15 = i14 / 2;
                    bArr2[i15] = bArrVulkanPowerDSCImage[i14];
                    bArr3[i15] = bArrVulkanPowerDSCImage[i14 + 1];
                }
                d dVar11 = d.this;
                byte[] bArrG = t.g(bArr2, dVar11.f8753h, dVar11.f8754i, this.f8775a, iMax + 1, iMin, iMax2 + 1, iMin2, this.f8776b);
                d dVar12 = d.this;
                byte[] bArr4 = dVar12.C;
                if (bArr4 == null || bArr4.length != bArrVulkanPowerDSCImage.length * 2) {
                    dVar12.C = new byte[bArrVulkanPowerDSCImage.length * 2];
                } else {
                    Arrays.fill(bArr4, (byte) 0);
                }
                d dVar13 = d.this;
                t.d(dVar13.C, bArrG, bArr3, dVar13.f8753h, iMax, iMin, iMax2, iMin2);
            } else {
                d.this.K.Q0(d.this.X, d.this.Y, d.this.Z, d.this.f8744a0, d.this.f8748c0, d.this.f8750e);
                n2.y yVar = d.this.K;
                Allocation allocation = d.this.f8769x;
                yVar.t(allocation, allocation);
                n2.y yVar2 = d.this.K;
                Allocation allocation2 = d.this.f8768w;
                yVar2.H(allocation2, allocation2);
                d.this.K.O0(iMax, iMin, iMax2, iMin2, this.f8775a, this.f8776b);
                n2.y yVar3 = d.this.K;
                d dVar14 = d.this;
                yVar3.L(dVar14.f8769x, dVar14.D);
                d.this.D.copyTo(d.this.C);
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        
            if (r4 != 3) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(int r4) {
            /*
                r3 = this;
                r0 = 1
                if (r4 == 0) goto L16
                if (r4 == r0) goto L13
                r1 = 2
                if (r4 == r1) goto Le
                r2 = 3
                r3.f8775a = r1
                if (r4 == r2) goto L19
                goto L10
            Le:
                r3.f8775a = r0
            L10:
                r3.f8776b = r1
                goto L1b
            L13:
                r3.f8775a = r0
                goto L19
            L16:
                r4 = 0
                r3.f8775a = r4
            L19:
                r3.f8776b = r0
            L1b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.d.c.b(int):void");
        }
    }

    /* JADX INFO: renamed from: m2.d$d, reason: collision with other inner class name */
    public class AsyncTaskC0081d extends AsyncTask<Integer, Integer, Integer> {
        public AsyncTaskC0081d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            if (d.f8739d0) {
                byte[] bArr = d.this.f8771z;
                d dVar = d.this;
                int[] iArrVulkanDSCImage = VKDSCJni.vulkanDSCImage(bArr, dVar.f8751f, dVar.f8752g, dVar.f8756k, dVar.f8749d, dVar.f8750e);
                d.this.A = t.f(iArrVulkanDSCImage);
            } else {
                d.this.K.B(d.this.f8770y, d.this.f8770y);
                d.this.f8770y.copyTo(d.this.A);
            }
            return 0;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f8779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f8780b;
    }

    public class f extends AsyncTask<Integer, Integer, Integer> {
        public f() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            if (!d.f8739d0) {
                n2.y yVar = d.this.K;
                d dVar = d.this;
                long j4 = dVar.f8749d;
                long j5 = dVar.f8750e;
                float f4 = (float) dVar.f8743a;
                float f5 = (float) dVar.f8745b;
                float f6 = (float) dVar.f8758m;
                float f7 = (float) dVar.f8759n;
                e eVar = dVar.f8757l;
                yVar.P0(j4, j5, f4, f5, f6, f7, (float) eVar.f8779a, (float) eVar.f8780b);
                d.this.K.l(d.this.E.getAllocation(), d.this.E.getAllocation());
            }
            return 0;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f8782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f8783b;
    }

    public void A(int[] iArr) {
        if (iArr != this.U) {
            this.U = iArr;
            if (this.f8762q == null) {
                RenderScript renderScript = this.J;
                this.f8762q = Allocation.createSized(renderScript, Element.U32(renderScript), 256);
            }
            this.f8762q.copy1DRangeFrom(0, 256, iArr);
            this.K.b(this.f8762q);
        }
    }

    public byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i4 = this.f8749d;
            int i5 = this.f8750e;
            if (length == i4 * i5) {
                try {
                    if (f8739d0) {
                        this.f8771z = bArr;
                    } else {
                        this.f8761p.copy1DRangeFrom(0, i4 * i5, bArr);
                        this.K.g(this.f8761p);
                        this.K.Z0(this.f8749d);
                        this.K.a1(this.f8750e);
                    }
                    AsyncTaskC0081d asyncTaskC0081d = new AsyncTaskC0081d();
                    asyncTaskC0081d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 0);
                    asyncTaskC0081d.get();
                    return this.A;
                } catch (Exception unused) {
                    return this.A;
                }
            }
        }
        return null;
    }

    public e b(g gVar) {
        double d4 = gVar.f8783b * this.f8759n;
        double d5 = this.f8743a;
        double d6 = (d4 + d5) / this.f8758m;
        if (d5 < 0.0d) {
            d6 = -d6;
        }
        double d7 = this.f8745b;
        int i4 = this.f8749d;
        double d8 = (d7 / ((double) (i4 - 1))) * (gVar.f8782a - (((double) (i4 - 1)) / 2.0d));
        double dSin = Math.sin(d8) * d6;
        double dCos = d6 * Math.cos(d8);
        e eVar = new e();
        e eVar2 = this.f8757l;
        eVar.f8779a = dSin + eVar2.f8779a;
        eVar.f8780b = eVar2.f8780b + dCos;
        if (this.f8743a < 0.0d) {
            eVar.f8780b = (-dCos) + eVar2.f8780b;
        }
        return eVar;
    }

    public byte[] c(byte[] bArr, int i4, int i5, int i6, int i7, float f4, int i8, boolean z3) {
        this.X = i4;
        this.Y = i5;
        this.Z = i6;
        this.f8744a0 = i7;
        this.f8753h = this.f8751f;
        int i9 = this.f8752g;
        this.f8754i = i9;
        if (f8739d0) {
            this.B = bArr;
            if (f4 != 0.0f) {
                this.f8753h = this.f8751f + (((int) ((((double) i9) * Math.sin((((double) Math.abs(f4)) / 180.0d) * 3.141592653589793d)) + 0.5d)) * 2);
            }
            if (f4 != this.f8746b0) {
                this.f8746b0 = f4;
                VKDSCJni.initDSCTableWithSteer(this.f8753h / 2.0f, (float) this.f8757l.f8780b, Math.abs(f4), this.f8753h, this.f8754i, this.f8749d, this.f8750e, (float) this.f8745b, this.f8759n, this.f8743a, this.f8758m);
                return this.C;
            }
        } else {
            this.K.T0(f4);
            this.K.V0(this.f8753h);
            this.K.U0(this.f8754i);
            if (f4 != this.f8746b0 || this.f8765t == null) {
                if (f4 != 0.0f) {
                    int iSin = this.f8751f + (((int) ((((double) this.f8752g) * Math.sin((((double) Math.abs(f4)) / 180.0d) * 3.141592653589793d)) + 0.5d)) * 2);
                    this.f8753h = iSin;
                    this.K.V0(iSin);
                    n2.d0 d0VarD = n2.d0.d(this.J, this.f8753h * this.f8754i);
                    this.I = d0VarD;
                    this.K.a(d0VarD);
                    this.K.J(this.I.getAllocation(), this.I.getAllocation());
                }
                RenderScript renderScript = this.J;
                Type typeCreateX = Type.createX(renderScript, Element.U8_4(renderScript), this.f8753h * this.f8754i);
                this.C = new byte[this.f8753h * this.f8754i * 4];
                this.D = Allocation.createTyped(this.J, typeCreateX);
                RenderScript renderScript2 = this.J;
                Type typeCreateX2 = Type.createX(renderScript2, Element.I8(renderScript2), this.f8753h * this.f8754i);
                this.f8765t = Allocation.createTyped(this.J, typeCreateX2);
                this.K.Y0(this.f8753h);
                this.f8766u = Allocation.createTyped(this.J, typeCreateX2);
                this.f8746b0 = f4;
            }
            this.f8763r.copy1DRangeFrom(0, ((i7 - i6) + 1) * this.f8750e, bArr);
            this.K.c(this.f8763r);
            this.K.h(this.f8765t);
            this.K.e(this.f8766u);
        }
        try {
            b bVar = new b();
            bVar.b(i8);
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 0);
            bVar.get();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return this.C;
    }

    public byte[] d(byte[] bArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        this.X = i4;
        this.Y = i5;
        this.Z = i6;
        this.f8744a0 = i7;
        this.f8753h = this.f8751f;
        int i9 = this.f8752g;
        this.f8754i = i9;
        if (f8739d0) {
            this.B = bArr;
            if (f4 != 0.0f) {
                this.f8753h = this.f8751f + (((int) ((((double) i9) * Math.sin((((double) Math.abs(f4)) / 180.0d) * 3.141592653589793d)) + 0.5d)) * 2);
            }
            if (f4 != this.f8748c0) {
                this.f8748c0 = f4;
                VKDSCJni.initDSCTableWithSteer(this.f8753h / 2.0f, (float) this.f8757l.f8780b, Math.abs(f4), this.f8753h, this.f8754i, this.f8749d, this.f8750e, (float) this.f8745b, this.f8759n, this.f8743a, this.f8758m);
                return this.C;
            }
        } else {
            this.K.T0(f4);
            this.K.V0(this.f8753h);
            this.K.U0(this.f8754i);
            if (f4 != this.f8748c0 || this.f8768w == null) {
                if (f4 != 0.0f) {
                    int iSin = this.f8751f + (((int) ((((double) this.f8752g) * Math.sin((((double) Math.abs(f4)) / 180.0d) * 3.141592653589793d)) + 0.5d)) * 2);
                    this.f8753h = iSin;
                    this.K.V0(iSin);
                    n2.d0 d0VarD = n2.d0.d(this.J, this.f8753h * this.f8754i);
                    this.I = d0VarD;
                    this.K.a(d0VarD);
                    this.K.J(this.I.getAllocation(), this.I.getAllocation());
                }
                RenderScript renderScript = this.J;
                Type typeCreateX = Type.createX(renderScript, Element.U8_4(renderScript), this.f8753h * this.f8754i);
                this.C = new byte[this.f8753h * this.f8754i * 4];
                this.D = Allocation.createTyped(this.J, typeCreateX);
                RenderScript renderScript2 = this.J;
                Type typeCreateX2 = Type.createX(renderScript2, Element.U8(renderScript2), this.f8753h * this.f8754i);
                this.f8768w = Allocation.createTyped(this.J, typeCreateX2);
                this.K.Y0(this.f8753h);
                this.f8769x = Allocation.createTyped(this.J, typeCreateX2);
                this.f8748c0 = f4;
            }
            this.f8767v.copy1DRangeFrom(0, ((i7 - i6) + 1) * this.f8750e, bArr);
            this.K.d(this.f8767v);
            this.K.i(this.f8768w);
            this.K.f(this.f8769x);
        }
        try {
            c cVar = new c();
            cVar.b(i8);
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 0);
            cVar.get();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return this.C;
    }

    public boolean e(int i4, int i5, double d4, double d5, double d6, int i6, int i7, int i8, int[] iArr) {
        this.F = 0;
        this.f8743a = d4;
        this.f8745b = d5;
        this.f8747c = d6;
        this.f8749d = i6;
        this.f8750e = i7;
        this.f8751f = i4;
        this.f8752g = i5;
        this.f8755j = i8;
        this.K.X0(i4);
        this.K.W0(this.f8752g);
        this.f8756k = 4;
        this.f8759n = 780000.0d / this.f8747c;
        double dCos = this.f8743a * (1.0d - Math.cos(this.f8745b / 2.0d));
        double d7 = this.f8759n;
        int i9 = this.f8755j;
        double dCos2 = dCos + (((double) i9) * d7);
        double d8 = this.f8743a;
        if (d8 < 0.0d) {
            double d9 = d7 * ((double) i9);
            dCos2 = (((-d8) - d9) * (1.0d - Math.cos(this.f8745b / 2.0d))) + d9;
        }
        this.f8758m = dCos2 / ((double) this.f8752g);
        e eVar = this.f8757l;
        eVar.f8779a = ((double) (this.f8751f - 1)) / 2.0d;
        double dCos3 = (-this.f8743a) * Math.cos(this.f8745b / 2.0d);
        double d10 = this.f8758m;
        eVar.f8780b = dCos3 / d10;
        double d11 = this.f8743a;
        if (d11 < 0.0d) {
            this.f8757l.f8780b = (-d11) / d10;
        }
        this.f8746b0 = 0.0f;
        this.f8748c0 = 0.0f;
        int i10 = this.f8751f;
        this.f8753h = i10;
        int i11 = this.f8752g;
        this.f8754i = i11;
        try {
            if (f8739d0) {
                float f4 = (float) this.f8745b;
                int i12 = this.f8749d;
                int i13 = this.f8750e;
                e eVar2 = this.f8757l;
                VKDSCJni.vulkanInitDSC(s.f8872f, i10, i11, (float) this.f8759n, (float) d10, (float) d11, f4, i12, i13, (float) eVar2.f8779a, (float) eVar2.f8780b);
                VKDSCJni.updateDscParams(iArr, iArr.length, this.f8751f, this.f8752g, this.f8756k, this.f8749d, this.f8750e);
                e eVar3 = this.f8757l;
                VKDSCJni.initDSCTableWithSteer((float) eVar3.f8779a, (float) eVar3.f8780b, this.f8746b0, this.f8753h, this.f8754i, this.f8749d, this.f8750e, (float) this.f8745b, this.f8759n, this.f8743a, this.f8758m);
                if (f8740e0) {
                    return true;
                }
                int i14 = this.f8751f;
                int i15 = this.f8752g;
                VKDSCJni.init_VulkanDSCImage(iArr, iArr.length, new byte[i14 * i15], i14, i15, this.f8756k, this.f8749d, this.f8750e);
                f8740e0 = true;
                return true;
            }
            byte[] bArr = this.A;
            if (bArr == null) {
                RenderScript renderScript = this.J;
                this.f8770y = Allocation.createTyped(this.J, Type.createXY(renderScript, Element.U8_4(renderScript), this.f8751f, this.f8752g));
                this.A = new byte[this.f8751f * this.f8752g * 4];
            } else if (bArr.length != i10 * i11 * 4) {
                RenderScript renderScript2 = this.J;
                this.f8770y = Allocation.createTyped(this.J, Type.createXY(renderScript2, Element.U8_4(renderScript2), this.f8751f, this.f8752g));
                this.A = new byte[this.f8751f * this.f8752g * 4];
            }
            RenderScript renderScript3 = this.J;
            Allocation allocationCreateSized = Allocation.createSized(renderScript3, Element.U8(renderScript3), this.f8749d * this.f8750e);
            this.f8761p = allocationCreateSized;
            this.K.g(allocationCreateSized);
            RenderScript renderScript4 = this.J;
            Allocation allocationCreateSized2 = Allocation.createSized(renderScript4, Element.U32(renderScript4), 256);
            this.f8762q = allocationCreateSized2;
            allocationCreateSized2.copy1DRangeFrom(0, 256, iArr);
            this.K.b(this.f8762q);
            n2.d0 d0VarD = n2.d0.d(this.J, (this.f8751f / 2) * this.f8752g);
            this.E = d0VarD;
            this.K.k(d0VarD);
            int iSin = this.f8751f + (((int) ((((double) this.f8752g) * Math.sin(0.20943951023931953d)) + 0.5d)) * 2);
            RenderScript renderScript5 = this.J;
            this.f8767v = Allocation.createTyped(this.J, Type.createX(renderScript5, Element.U8(renderScript5), this.f8754i * iSin));
            RenderScript renderScript6 = this.J;
            this.f8763r = Allocation.createTyped(this.J, Type.createX(renderScript6, Element.I8(renderScript6), iSin * this.f8754i));
            f fVar = new f();
            this.V = fVar;
            fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 0);
            this.V.get();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public int f() {
        return this.f8749d;
    }

    public g g(e eVar) {
        double d4 = eVar.f8779a;
        e eVar2 = this.f8757l;
        double d5 = d4 - eVar2.f8779a;
        double d6 = this.f8758m;
        double d7 = d5 * d6;
        double d8 = (eVar.f8780b - eVar2.f8780b) * d6;
        double dSqrt = Math.sqrt((d7 * d7) + (d8 * d8));
        double dAtan = Math.atan(d7 / d8);
        double d9 = this.f8743a;
        if (d9 < 0.0d) {
            dSqrt = -dSqrt;
            dAtan = -dAtan;
        }
        double d10 = (dSqrt - d9) / this.f8759n;
        double d11 = this.f8745b;
        double d12 = ((d11 / 2.0d) + dAtan) / (d11 / (((double) this.f8749d) - 1.0d));
        g gVar = new g();
        gVar.f8782a = d12;
        gVar.f8783b = d10;
        return gVar;
    }

    public int h() {
        return this.f8750e;
    }

    public double i() {
        return this.f8758m;
    }

    public double j() {
        return this.f8759n;
    }

    public e k(g gVar, float f4) {
        e eVarB = b(gVar);
        if (f4 != this.L) {
            this.L = f4;
            double d4 = (((double) f4) / 180.0d) * 3.141592653589793d;
            this.N = Math.cos(d4);
            this.M = Math.sin(d4);
        }
        double d5 = this.f8743a;
        if (d5 >= 99999.0d) {
            double d6 = eVarB.f8780b;
            double d7 = (((double) f4) / 180.0d) * 3.141592653589793d;
            eVarB.f8779a -= Math.sin(d7) * d6;
            eVarB.f8780b = d6 * Math.cos(d7);
            return eVarB;
        }
        gVar.f8783b = 0.0d;
        e eVarB2 = b(gVar);
        double d8 = eVarB.f8779a;
        double d9 = eVarB2.f8779a;
        double d10 = d8 - d9;
        double d11 = eVarB.f8780b;
        if (d5 < 0.0d) {
            double d12 = eVarB2.f8780b;
            double d13 = d11 - d12;
            double d14 = this.N;
            double d15 = this.M;
            eVarB.f8779a = d9 + ((d10 * d14) - (d13 * d15));
            eVarB.f8780b = d12 + (d10 * d15) + (d13 * d14);
            return eVarB;
        }
        double d16 = eVarB2.f8780b;
        double d17 = d11 - d16;
        double d18 = this.N;
        double d19 = this.M;
        eVarB.f8779a = d9 + ((d10 * d18) - (d17 * d19));
        eVarB.f8780b = d16 + (d10 * d19) + (d17 * d18);
        return eVarB;
    }

    public g l(e eVar, float f4) {
        e eVar2;
        if (f4 != this.O) {
            this.O = f4;
            double d4 = (((double) f4) / 180.0d) * 3.141592653589793d;
            this.P = Math.sin(d4);
            this.Q = Math.cos(d4);
            this.R = Math.tan(d4);
        }
        e eVar3 = new e();
        double d5 = this.f8743a;
        if (d5 > 99999.0d) {
            double d6 = eVar.f8780b;
            double d7 = d6 / this.Q;
            eVar3.f8779a = eVar.f8779a + (d6 * this.R);
            eVar3.f8780b = d7;
        } else {
            if (d5 < 0.0d) {
                double d8 = (-d5) / this.f8758m;
                double d9 = this.P * d8;
                double d10 = eVar.f8779a;
                e eVar4 = this.f8757l;
                double d11 = eVar4.f8779a;
                double d12 = (d10 - d11) * (d10 - d11);
                double d13 = eVar.f8780b;
                double d14 = eVar4.f8780b;
                double dSqrt = Math.sqrt(d12 + ((d13 - d14) * (d13 - d14)));
                double d15 = (((double) f4) / 180.0d) * 3.141592653589793d;
                double dAcos = d15 >= 0.0d ? (1.5707963267948966d - d15) - Math.acos(d9 / dSqrt) : -((1.5707963267948966d - (-d15)) - Math.acos((-d9) / dSqrt));
                double d16 = eVar.f8779a;
                e eVar5 = this.f8757l;
                eVar3.f8779a = d16 - eVar5.f8779a;
                eVar3.f8780b = eVar.f8780b - eVar5.f8780b;
                eVar2 = new e();
                eVar2.f8779a = (eVar3.f8779a * Math.cos(dAcos)) - (eVar3.f8780b * Math.sin(dAcos));
                eVar2.f8780b = (eVar3.f8779a * Math.sin(dAcos)) + (eVar3.f8780b * Math.cos(dAcos));
                e eVar6 = new e();
                double d17 = (eVar2.f8779a * d8) / dSqrt;
                e eVar7 = this.f8757l;
                double d18 = d17 + eVar7.f8779a;
                eVar6.f8779a = d18;
                double d19 = ((eVar2.f8780b * d8) / dSqrt) + eVar7.f8780b;
                eVar6.f8780b = d19;
                double d20 = eVar.f8779a - d18;
                eVar3.f8779a = d20;
                double d21 = eVar.f8780b - d19;
                eVar3.f8780b = d21;
                double d22 = this.Q;
                double d23 = this.P;
                eVar2.f8779a = ((d20 * d22) - ((-d23) * d21)) + eVar6.f8779a;
                eVar2.f8780b = (eVar3.f8779a * (-d23)) + (d21 * d22) + eVar6.f8780b;
            } else {
                double d24 = d5 / this.f8758m;
                double d25 = this.P * d24;
                double d26 = eVar.f8779a;
                e eVar8 = this.f8757l;
                double d27 = eVar8.f8779a;
                double d28 = (d26 - d27) * (d26 - d27);
                double d29 = eVar.f8780b;
                double d30 = eVar8.f8780b;
                double dSqrt2 = Math.sqrt(d28 + ((d29 - d30) * (d29 - d30)));
                double d31 = (((double) f4) / 180.0d) * 3.141592653589793d;
                double dAsin = d31 >= 0.0d ? d31 - Math.asin(d25 / dSqrt2) : d31 + Math.asin((-d25) / dSqrt2);
                double d32 = eVar.f8779a;
                e eVar9 = this.f8757l;
                eVar3.f8779a = d32 - eVar9.f8779a;
                eVar3.f8780b = eVar.f8780b - eVar9.f8780b;
                eVar2 = new e();
                double d33 = -dAsin;
                eVar2.f8779a = (eVar3.f8779a * Math.cos(d33)) - (eVar3.f8780b * Math.sin(d33));
                eVar2.f8780b = (eVar3.f8779a * Math.sin(d33)) + (eVar3.f8780b * Math.cos(d33));
                e eVar10 = new e();
                double d34 = (eVar2.f8779a * d24) / dSqrt2;
                e eVar11 = this.f8757l;
                double d35 = d34 + eVar11.f8779a;
                eVar10.f8779a = d35;
                double d36 = ((eVar2.f8780b * d24) / dSqrt2) + eVar11.f8780b;
                eVar10.f8780b = d36;
                double d37 = eVar.f8779a - d35;
                eVar3.f8779a = d37;
                double d38 = eVar.f8780b - d36;
                eVar3.f8780b = d38;
                double d39 = this.Q;
                double d40 = this.P;
                eVar2.f8779a = ((d37 * d39) - ((-d40) * d38)) + eVar10.f8779a;
                eVar2.f8780b = (eVar3.f8779a * (-d40)) + (d38 * d39) + eVar10.f8780b;
            }
            eVar3 = eVar2;
        }
        return g(eVar3);
    }

    public int[] y() {
        return this.U;
    }

    public void z(RenderScript renderScript, n2.y yVar) {
        this.J = renderScript;
        this.K = yVar;
    }
}
