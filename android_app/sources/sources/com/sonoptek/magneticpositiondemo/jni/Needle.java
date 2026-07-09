package com.sonoptek.magneticpositiondemo.jni;

import android.util.Log;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import y1.d;
import y1.f;

/* JADX INFO: loaded from: classes.dex */
public class Needle {
    public static double[] A = null;
    public static boolean B = false;
    public static byte[] C = null;
    public static double[] D = null;
    public static double[] E = null;
    public static double[] F = null;
    public static final short G = -21555;
    public static int H = 0;
    public static a I = null;
    public static b J = null;
    public static boolean K = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4776a = -65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4777b = -16750951;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4778c = -7829368;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f4779d = -16737946;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f4780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f4781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f4782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static double f4783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f4784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static double f4785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f4786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static double f4787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f4788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static double f4789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f4790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static double f4791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f4792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static double f4793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f4794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static double f4795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static String f4796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static double f4797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f4798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static double[] f4799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static ArrayList<ArrayList<Double>> f4800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static double[] f4801z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f4802a = new int[5];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4803b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4804c = s0.a.f11071l;
    }

    public interface b {
        void a();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f4806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f4807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f4808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f4809e = 0.0d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f4810f = 0.0d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f4811g = 0.0d;

        public c(double[] dArr) {
            f fVar = new f(dArr[0], dArr[1], dArr[2]);
            f fVar2 = new f(dArr[3], dArr[4], dArr[5]);
            this.f4806b = e(fVar);
            this.f4807c = e(fVar2);
            this.f4808d = b();
        }

        public f a(double d4, double d5, double d6) {
            f fVarC = c(new f(d4, d5, d6), 1.5d, -5.2d, -14.9d, 1.5707963267948966d + this.f4809e, 0.0d + this.f4810f, 1.5707963267948966d + this.f4811g);
            fVarC.f12843a *= 1.0d;
            double d7 = fVarC.f12844b * 1.0d;
            fVarC.f12844b = d7;
            fVarC.f12845c *= 1.0d;
            if (Needle.f4781f > 0.0d) {
                fVarC.f12844b = d7 + 0.0d;
            }
            return fVarC;
        }

        public final f b() {
            f fVar = this.f4806b;
            double d4 = fVar.f12844b;
            f fVar2 = this.f4807c;
            double d5 = fVar2.f12844b;
            if (d4 - d5 == 0.0d) {
                return null;
            }
            double d6 = d4 / (d4 - d5);
            double d7 = fVar.f12843a;
            double d8 = d7 + ((fVar2.f12843a - d7) * d6);
            double d9 = fVar.f12845c;
            return new f(d8, 0.0d, d9 + (d6 * (fVar2.f12845c - d9)));
        }

        public f c(f fVar, double d4, double d5, double d6, double d7, double d8, double d9) {
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double dCos3 = Math.cos(d9);
            double dSin3 = Math.sin(d9);
            double d10 = fVar.f12843a;
            double d11 = dCos2 * dCos3 * d10;
            double d12 = dCos2 * dSin3;
            double d13 = fVar.f12844b;
            double d14 = d11 - (d12 * d13);
            double d15 = fVar.f12845c;
            return new f(d14 + (dSin2 * d15) + d4, ((((((dSin * dSin2) * dCos3) + (dCos * dSin3)) * d10) + (((((-dSin) * dSin2) * dSin3) + (dCos * dCos3)) * d13)) - ((dSin * dCos2) * d15)) + d5, ((((-dCos) * dSin2 * dCos3) + (dSin * dSin3)) * d10) + (((dCos * dSin2 * dSin3) + (dSin * dCos3)) * d13) + (dCos * dCos2 * d15) + d6);
        }

        public String d() {
            return String.format("%b, p1(%.2f,%.2f,%.2f), p2(%.2f,%.2f,%.2f),biopsyP(%.2f,%.2f,%.2f)", Boolean.valueOf(this.f4805a), Double.valueOf(this.f4806b.f12843a), Double.valueOf(this.f4806b.f12844b), Double.valueOf(this.f4806b.f12845c), Double.valueOf(this.f4807c.f12843a), Double.valueOf(this.f4807c.f12844b), Double.valueOf(this.f4807c.f12845c), Double.valueOf(this.f4808d.f12843a), Double.valueOf(this.f4808d.f12844b), Double.valueOf(this.f4808d.f12845c));
        }

        public f e(f fVar) {
            return c(fVar, 1.5d, -5.2d, -15.9d, 1.5707963267948966d + this.f4809e, 0.0d + this.f4810f, 1.5707963267948966d + this.f4811g);
        }
    }

    static {
        System.loadLibrary("needle_location");
        f4780e = "lse";
        f4781f = -1.0d;
        f4782g = "needlelength";
        f4783h = 35.0d;
        f4784i = "needleParam_se";
        f4785j = 2.0d;
        f4786k = "needleParam_sl";
        f4787l = 10.0d;
        f4788m = "needleParam_lm";
        f4789n = 41.0d;
        f4790o = "needleParam_hd";
        f4791p = 25.0d;
        f4792q = "needleParam_dh";
        f4793r = 5.0d;
        f4794s = "needleParam_sd";
        f4795t = 0.0d;
        f4796u = "needleParam_lengthen";
        f4797v = 2.0d;
        f4798w = false;
        f4800y = new ArrayList<>();
        A = new double[48];
        B = true;
        D = new double[192];
        E = new double[144];
        F = new double[48];
        I = new a();
    }

    public static double A() {
        return f4785j;
    }

    public static String B() {
        return f4784i;
    }

    public static double C() {
        return f4787l;
    }

    public static String D() {
        return f4786k;
    }

    public static boolean E() {
        return ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void F(b bVar) {
        K = true;
        J = bVar;
        H = 0;
    }

    public static void G(double[] dArr, double[] dArr2, double[] dArr3) {
        if (x()) {
            return;
        }
        Y(true);
        setSensorParam(dArr, dArr2, dArr3);
    }

    public static void H(double[] dArr) {
        f4801z = dArr;
    }

    public static void I(double d4) {
        f4793r = d4;
    }

    public static void J(String str) {
        f4792q = str;
    }

    public static void K(double[] dArr) {
        A = dArr;
    }

    public static void L(double d4) {
        f4791p = d4;
    }

    public static void M(String str) {
        f4790o = str;
    }

    public static void N(ArrayList<ArrayList<Double>> arrayList) {
        f4800y = arrayList;
    }

    public static void O(double d4) {
        f4781f = d4;
    }

    public static void P(double d4) {
        f4789n = d4;
    }

    public static void Q(String str) {
        f4788m = str;
    }

    public static void R(String str) {
        f4780e = str;
    }

    public static void S(double d4) {
        f4783h = d4;
    }

    public static void T(String str) {
        f4782g = str;
    }

    public static void U(double d4) {
        f4797v = d4;
    }

    public static void V(String str) {
        f4796u = str;
    }

    public static void W(double[] dArr) {
        f4799x = dArr;
    }

    public static void X(d dVar) {
        O(dVar.f12830a);
        S(dVar.f12831b);
        b0(dVar.f12832c);
        e0(dVar.f12833d);
        P(dVar.f12834e);
        L(dVar.f12835f);
        I(dVar.f12836g);
        Z(dVar.f12837h);
        U(dVar.f12838i);
    }

    public static void Y(boolean z3) {
        f4798w = z3;
    }

    public static void Z(double d4) {
        f4795t = d4;
    }

    public static boolean a() {
        return H >= 16;
    }

    public static void a0(String str) {
        f4794s = str;
    }

    public static void b(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        setLocationParam(d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, -1.0d, -1.0d, -1.0d, -1.0d);
    }

    public static void b0(double d4) {
        f4785j = d4;
    }

    public static float[] c(byte[] bArr) {
        int length = bArr.length / 4;
        float[] fArr = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                i5 |= (bArr[(i4 * 4) + i6] & 255) << (i6 * 8);
            }
            fArr[i4] = Float.intBitsToFloat(i5);
        }
        return fArr;
    }

    public static void c0(String str) {
        f4784i = str;
    }

    public static c d(double[] dArr) {
        i0(C);
        if (!a()) {
            g0(dArr);
            H++;
            return null;
        }
        b(f4781f, f4783h, f4785j, f4787l, f4789n, 0.0d, f4791p, f4793r, f4795t, f4797v, -1.0d, -1.0d);
        double[] dArrNeedleLocation = needleLocation(dArr, new double[48]);
        d0(dArrNeedleLocation);
        boolean z3 = dArrNeedleLocation[7] == -1.0d;
        if (K) {
            if (z3) {
                b bVar = J;
                if (bVar != null) {
                    bVar.a();
                }
                K = false;
            } else {
                H = 0;
            }
        }
        c cVar = new c(dArrNeedleLocation);
        if (getPOSIsRight()) {
            cVar.f4805a = true;
        } else {
            cVar.f4806b = null;
            cVar.f4807c = null;
            cVar.f4805a = z3;
        }
        return cVar;
    }

    public static void d0(double[] dArr) {
        if (dArr == null || dArr.length != 8) {
            Arrays.fill(I.f4802a, f4776a);
            return;
        }
        double d4 = dArr[7];
        if (d4 == -1.0d) {
            Arrays.fill(I.f4802a, f4777b);
            I.f4804c = String.valueOf(d4);
            I.f4803b = 4;
            return;
        }
        if (dArr[0] != 0.0d || dArr[1] != 0.0d || dArr[2] != 0.0d || dArr[3] != 0.0d || dArr[4] != 0.0d || dArr[5] != 0.0d) {
            a aVar = I;
            aVar.f4804c = "有针";
            aVar.f4803b = 0;
            Arrays.fill(aVar.f4802a, f4777b);
            return;
        }
        int iLog10 = (int) Math.log10(d4);
        I.f4804c = String.valueOf(iLog10);
        a aVar2 = I;
        aVar2.f4803b = 4;
        if (iLog10 >= 5) {
            Arrays.fill(aVar2.f4802a, f4778c);
            I.f4802a[0] = f4776a;
            return;
        }
        if (iLog10 == 4) {
            Arrays.fill(aVar2.f4802a, f4778c);
            int[] iArr = I.f4802a;
            iArr[1] = f4779d;
            iArr[0] = f4776a;
            return;
        }
        if (iLog10 == 3) {
            Arrays.fill(aVar2.f4802a, f4778c);
            int[] iArr2 = I.f4802a;
            int i4 = f4779d;
            iArr2[1] = i4;
            iArr2[2] = i4;
            iArr2[0] = f4776a;
            return;
        }
        if (iLog10 == 2) {
            Arrays.fill(aVar2.f4802a, f4778c);
            int[] iArr3 = I.f4802a;
            int i5 = f4779d;
            iArr3[1] = i5;
            iArr3[2] = i5;
            iArr3[0] = f4776a;
            return;
        }
        if (iLog10 != 1) {
            if (iLog10 == 0) {
                Arrays.fill(aVar2.f4802a, f4777b);
                return;
            }
            return;
        }
        Arrays.fill(aVar2.f4802a, f4778c);
        int[] iArr4 = I.f4802a;
        int i6 = f4779d;
        iArr4[0] = i6;
        iArr4[1] = i6;
        iArr4[2] = i6;
        iArr4[3] = i6;
        iArr4[4] = f4778c;
    }

    public static byte[] e() {
        float[] fArr = new float[384];
        for (int i4 = 0; i4 < 192; i4++) {
            fArr[i4] = (float) D[i4];
        }
        for (int i5 = 0; i5 < 144; i5++) {
            fArr[192 + i5] = (float) E[i5];
        }
        for (int i6 = 0; i6 < 48; i6++) {
            fArr[336 + i6] = (float) F[i6];
        }
        return f(fArr);
    }

    public static void e0(double d4) {
        f4787l = d4;
    }

    public static byte[] f(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        byte[] bArr = new byte[fArr.length * 4];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            int iFloatToIntBits = Float.floatToIntBits(fArr[i4]);
            int i5 = i4 * 4;
            bArr[i5] = (byte) (iFloatToIntBits & 255);
            bArr[i5 + 1] = (byte) ((iFloatToIntBits >> 8) & 255);
            bArr[i5 + 2] = (byte) ((iFloatToIntBits >> 16) & 255);
            bArr[i5 + 3] = (byte) ((iFloatToIntBits >> 24) & 255);
        }
        return bArr;
    }

    public static void f0(String str) {
        f4786k = str;
    }

    public static a g() {
        return I;
    }

    public static void g0(double[] dArr) {
        sensorCalibration(dArr);
    }

    public static native boolean getPOSIsRight();

    public static double[] h() {
        return f4801z;
    }

    public static double i() {
        return f4793r;
    }

    public static void i0(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr.length != 1536) {
            Log.e("参数长度不正确 ", s0.a.f11071l + bArr.length);
        }
        float[] fArrC = c(bArr);
        for (int i4 = 0; i4 < 192; i4++) {
            D[i4] = fArrC[i4];
        }
        for (int i5 = 0; i5 < 144; i5++) {
            E[i5] = fArrC[192 + i5];
        }
        for (int i6 = 0; i6 < 48; i6++) {
            F[i6] = fArrC[336 + i6];
        }
        G(D, E, F);
        C = bArr;
    }

    public static String j() {
        return f4792q;
    }

    public static double[] k() {
        return A;
    }

    public static double l() {
        return f4791p;
    }

    public static String m() {
        return f4790o;
    }

    public static ArrayList<ArrayList<Double>> n() {
        return f4800y;
    }

    public static native double[] needleLocation(double[] dArr, double[] dArr2);

    public static double o() {
        return f4781f;
    }

    public static double p() {
        return f4789n;
    }

    public static String q() {
        return f4788m;
    }

    public static String r() {
        return f4780e;
    }

    public static double s() {
        return f4783h;
    }

    public static native int sensorCalibration(double[] dArr);

    public static native int setLocationParam(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19);

    public static native int setSensorParam(double[] dArr, double[] dArr2, double[] dArr3);

    public static String t() {
        return f4782g;
    }

    public static double u() {
        return f4797v;
    }

    public static String v() {
        return f4796u;
    }

    public static double[] w() {
        return f4799x;
    }

    public static boolean x() {
        return f4798w;
    }

    public static double y() {
        return f4795t;
    }

    public static String z() {
        return f4794s;
    }

    public void h0(float[] fArr) {
        if (fArr.length != 192) {
            Log.e("内参数据设置错误", s0.a.f11071l + fArr.length);
        }
        for (int i4 = 0; i4 < fArr.length; i4++) {
            D[i4] = fArr[i4];
        }
        G(D, E, F);
    }
}
