package q;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10145c = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10146d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10147e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10148f = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10154a = "identity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f10144b = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f10151i = "standard";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10150h = "accelerate";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10149g = "decelerate";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10152j = "linear";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String[] f10153k = {f10151i, f10150h, f10149g, f10152j};

    public static class a extends c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static double f10155p = 0.01d;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static double f10156q = 1.0E-4d;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f10157l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f10158m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f10159n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f10160o;

        public a(double d4, double d5, double d6, double d7) {
            h(d4, d5, d6, d7);
        }

        @Override // q.c
        public double a(double d4) {
            if (d4 <= 0.0d) {
                return 0.0d;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f10155p) {
                d5 *= 0.5d;
                d6 = f(d6) < d4 ? d6 + d5 : d6 - d5;
            }
            double d7 = d6 - d5;
            double dF = f(d7);
            double d8 = d6 + d5;
            double dF2 = f(d8);
            double dG = g(d7);
            return (((g(d8) - dG) * (d4 - dF)) / (dF2 - dF)) + dG;
        }

        @Override // q.c
        public double b(double d4) {
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f10156q) {
                d5 *= 0.5d;
                d6 = f(d6) < d4 ? d6 + d5 : d6 - d5;
            }
            double d7 = d6 - d5;
            double d8 = d6 + d5;
            return (g(d8) - g(d7)) / (f(d8) - f(d7));
        }

        public final double d(double d4) {
            double d5 = 1.0d - d4;
            double d6 = this.f10157l;
            double d7 = this.f10159n;
            return (d5 * 3.0d * d5 * d6) + (d5 * 6.0d * d4 * (d7 - d6)) + (3.0d * d4 * d4 * (1.0d - d7));
        }

        public final double e(double d4) {
            double d5 = 1.0d - d4;
            double d6 = this.f10158m;
            double d7 = this.f10160o;
            return (d5 * 3.0d * d5 * d6) + (d5 * 6.0d * d4 * (d7 - d6)) + (3.0d * d4 * d4 * (1.0d - d7));
        }

        public final double f(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f10157l * d5 * d6 * d4) + (this.f10159n * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        public final double g(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f10158m * d5 * d6 * d4) + (this.f10160o * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        public void h(double d4, double d5, double d6, double d7) {
            this.f10157l = d4;
            this.f10158m = d5;
            this.f10159n = d6;
            this.f10160o = d7;
        }

        public a(String str) {
            this.f10154a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f10157l = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i4 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i4);
            this.f10158m = Double.parseDouble(str.substring(i4, iIndexOf3).trim());
            int i5 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i5);
            this.f10159n = Double.parseDouble(str.substring(i5, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            this.f10160o = Double.parseDouble(str.substring(i6, str.indexOf(41, i6)).trim());
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        switch (str) {
            case "accelerate":
                return new a(f10146d);
            case "decelerate":
                return new a(f10147e);
            case "linear":
                return new a(f10148f);
            case "standard":
                return new a(f10145c);
            default:
                Log.e(androidx.constraintlayout.widget.d.f2405e, "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f10153k));
                return f10144b;
        }
    }

    public double a(double d4) {
        return d4;
    }

    public double b(double d4) {
        return 1.0d;
    }

    public String toString() {
        return this.f10154a;
    }
}
