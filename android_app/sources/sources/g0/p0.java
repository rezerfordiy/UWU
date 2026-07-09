package g0;

import android.graphics.Color;
import java.util.Objects;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f7794a = 95.047d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f7795b = 100.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f7796c = 108.883d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f7797d = 0.008856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f7798e = 903.3d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7799f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7800g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<double[]> f7801h = new ThreadLocal<>();

    public static double A(double d4) {
        return d4 > 0.008856d ? Math.pow(d4, 0.3333333333333333d) : ((d4 * 903.3d) + 16.0d) / 116.0d;
    }

    @c.l
    public static int B(@c.l int i4, @c.b0(from = 0, to = 255) int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & z1.f12255s) | (i5 << 24);
    }

    @c.l
    public static int a(@c.j0 float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float fAbs = (1.0f - Math.abs((f6 * 2.0f) - 1.0f)) * f5;
        float f7 = f6 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f4 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f4) / 60) {
            case 0:
                iRound = Math.round((fAbs + f7) * 255.0f);
                iRound2 = Math.round((fAbs2 + f7) * 255.0f);
                iRound3 = Math.round(f7 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f7) * 255.0f);
                iRound2 = Math.round((fAbs + f7) * 255.0f);
                iRound3 = Math.round(f7 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f7 * 255.0f);
                iRound2 = Math.round((fAbs + f7) * 255.0f);
                iRound3 = Math.round((fAbs2 + f7) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f7 * 255.0f);
                iRound2 = Math.round((fAbs2 + f7) * 255.0f);
                iRound3 = Math.round((fAbs + f7) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f7) * 255.0f);
                iRound2 = Math.round(f7 * 255.0f);
                iRound3 = Math.round((fAbs + f7) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f7) * 255.0f);
                iRound2 = Math.round(f7 * 255.0f);
                iRound3 = Math.round((fAbs2 + f7) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(x(iRound, 0, 255), x(iRound2, 0, 255), x(iRound3, 0, 255));
    }

    @c.l
    public static int b(@c.t(from = 0.0d, to = f7795b) double d4, @c.t(from = -128.0d, to = 127.0d) double d5, @c.t(from = -128.0d, to = 127.0d) double d6) {
        double[] dArrZ = z();
        c(d4, d5, d6, dArrZ);
        return g(dArrZ[0], dArrZ[1], dArrZ[2]);
    }

    public static void c(@c.t(from = 0.0d, to = f7795b) double d4, @c.t(from = -128.0d, to = 127.0d) double d5, @c.t(from = -128.0d, to = 127.0d) double d6, @c.j0 double[] dArr) {
        double d7 = (d4 + 16.0d) / 116.0d;
        double d8 = (d5 / 500.0d) + d7;
        double d9 = d7 - (d6 / 200.0d);
        double dPow = Math.pow(d8, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d8 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d4 > 7.9996247999999985d ? Math.pow(d7, 3.0d) : d4 / 903.3d;
        double dPow3 = Math.pow(d9, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d9 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    public static void d(@c.b0(from = 0, to = 255) int i4, @c.b0(from = 0, to = 255) int i5, @c.b0(from = 0, to = 255) int i6, @c.j0 float[] fArr) {
        float f4;
        float fAbs;
        float f5 = i4 / 255.0f;
        float f6 = i5 / 255.0f;
        float f7 = i6 / 255.0f;
        float fMax = Math.max(f5, Math.max(f6, f7));
        float fMin = Math.min(f5, Math.min(f6, f7));
        float f8 = fMax - fMin;
        float f9 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f4 = 0.0f;
            fAbs = 0.0f;
        } else {
            f4 = fMax == f5 ? ((f6 - f7) / f8) % 6.0f : fMax == f6 ? ((f7 - f5) / f8) + 2.0f : 4.0f + ((f5 - f6) / f8);
            fAbs = f8 / (1.0f - Math.abs((2.0f * f9) - 1.0f));
        }
        float f10 = (f4 * 60.0f) % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        fArr[0] = w(f10, 0.0f, 360.0f);
        fArr[1] = w(fAbs, 0.0f, 1.0f);
        fArr[2] = w(f9, 0.0f, 1.0f);
    }

    public static void e(@c.b0(from = 0, to = 255) int i4, @c.b0(from = 0, to = 255) int i5, @c.b0(from = 0, to = 255) int i6, @c.j0 double[] dArr) {
        f(i4, i5, i6, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@c.b0(from = 0, to = 255) int i4, @c.b0(from = 0, to = 255) int i5, @c.b0(from = 0, to = 255) int i6, @c.j0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = ((double) i4) / 255.0d;
        double dPow = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) i5) / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = ((double) i6) / 255.0d;
        double dPow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    @c.l
    public static int g(@c.t(from = 0.0d, to = f7794a) double d4, @c.t(from = 0.0d, to = f7795b) double d5, @c.t(from = 0.0d, to = f7796c) double d6) {
        double d7 = (((3.2406d * d4) + ((-1.5372d) * d5)) + ((-0.4986d) * d6)) / 100.0d;
        double d8 = ((((-0.9689d) * d4) + (1.8758d * d5)) + (0.0415d * d6)) / 100.0d;
        double d9 = (((0.0557d * d4) + ((-0.204d) * d5)) + (1.057d * d6)) / 100.0d;
        return Color.rgb(x((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@c.t(from = 0.0d, to = f7794a) double d4, @c.t(from = 0.0d, to = f7795b) double d5, @c.t(from = 0.0d, to = f7796c) double d6, @c.j0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dA = A(d4 / 95.047d);
        double dA2 = A(d5 / 100.0d);
        double dA3 = A(d6 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dA2) - 16.0d);
        dArr[1] = (dA - dA2) * 500.0d;
        dArr[2] = (dA2 - dA3) * 200.0d;
    }

    @c.l
    public static int i(@c.l int i4, @c.l int i5, @c.t(from = 0.0d, to = 1.0d) float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i4) * f5) + (Color.alpha(i5) * f4)), (int) ((Color.red(i4) * f5) + (Color.red(i5) * f4)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f4)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f4)));
    }

    public static void j(@c.j0 float[] fArr, @c.j0 float[] fArr2, @c.t(from = 0.0d, to = 1.0d) float f4, @c.j0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f5 = 1.0f - f4;
        fArr3[0] = o(fArr[0], fArr2[0], f4);
        fArr3[1] = (fArr[1] * f5) + (fArr2[1] * f4);
        fArr3[2] = (fArr[2] * f5) + (fArr2[2] * f4);
    }

    public static void k(@c.j0 double[] dArr, @c.j0 double[] dArr2, @c.t(from = 0.0d, to = 1.0d) double d4, @c.j0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d5 = 1.0d - d4;
        dArr3[0] = (dArr[0] * d5) + (dArr2[0] * d4);
        dArr3[1] = (dArr[1] * d5) + (dArr2[1] * d4);
        dArr3[2] = (dArr[2] * d5) + (dArr2[2] * d4);
    }

    public static double l(@c.l int i4, @c.l int i5) {
        if (Color.alpha(i5) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
        }
        if (Color.alpha(i4) < 255) {
            i4 = t(i4, i5);
        }
        double dM = m(i4) + 0.05d;
        double dM2 = m(i5) + 0.05d;
        return Math.max(dM, dM2) / Math.min(dM, dM2);
    }

    @c.t(from = 0.0d, to = 1.0d)
    public static double m(@c.l int i4) {
        double[] dArrZ = z();
        r(i4, dArrZ);
        return dArrZ[1] / 100.0d;
    }

    public static int n(@c.l int i4, @c.l int i5, float f4) {
        int i6 = 255;
        if (Color.alpha(i5) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
        }
        double d4 = f4;
        if (l(B(i4, 255), i5) < d4) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 <= 10 && i6 - i7 > 1; i8++) {
            int i9 = (i7 + i6) / 2;
            if (l(B(i4, i9), i5) < d4) {
                i7 = i9;
            } else {
                i6 = i9;
            }
        }
        return i6;
    }

    @c.z0
    public static float o(float f4, float f5, float f6) {
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > f4) {
                f4 += 360.0f;
            } else {
                f5 += 360.0f;
            }
        }
        return (f4 + ((f5 - f4) * f6)) % 360.0f;
    }

    public static void p(@c.l int i4, @c.j0 float[] fArr) {
        d(Color.red(i4), Color.green(i4), Color.blue(i4), fArr);
    }

    public static void q(@c.l int i4, @c.j0 double[] dArr) {
        e(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    public static void r(@c.l int i4, @c.j0 double[] dArr) {
        f(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    public static int s(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    public static int t(@c.l int i4, @c.l int i5) {
        int iAlpha = Color.alpha(i5);
        int iAlpha2 = Color.alpha(i4);
        int iS = s(iAlpha2, iAlpha);
        return Color.argb(iS, v(Color.red(i4), iAlpha2, Color.red(i5), iAlpha, iS), v(Color.green(i4), iAlpha2, Color.green(i5), iAlpha, iS), v(Color.blue(i4), iAlpha2, Color.blue(i5), iAlpha, iS));
    }

    @c.o0(26)
    @c.j0
    public static Color u(@c.j0 Color color, @c.j0 Color color2) {
        if (!Objects.equals(color.getModel(), color2.getModel())) {
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
        if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
            color = color.convert(color2.getColorSpace());
        }
        float[] components = color.getComponents();
        float[] components2 = color2.getComponents();
        float fAlpha = color.alpha();
        float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
        int componentCount = color2.getComponentCount() - 1;
        float f4 = fAlpha + fAlpha2;
        components2[componentCount] = f4;
        if (f4 > 0.0f) {
            fAlpha /= f4;
            fAlpha2 /= f4;
        }
        for (int i4 = 0; i4 < componentCount; i4++) {
            components2[i4] = (components[i4] * fAlpha) + (components2[i4] * fAlpha2);
        }
        return Color.valueOf(components2, color2.getColorSpace());
    }

    public static int v(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    public static float w(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    public static int x(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static double y(@c.j0 double[] dArr, @c.j0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static double[] z() {
        ThreadLocal<double[]> threadLocal = f7801h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
