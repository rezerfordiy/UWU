package l2;

import android.graphics.PointF;
import com.sonoptek.pvus_android.h;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static float a(String str, boolean z3) {
        if (z3) {
            if (str.startsWith("SH-1C")) {
                return 24.0f;
            }
            if (str.startsWith("SH-2C")) {
                return 20.0f;
            }
            if (str.startsWith("SL-7C")) {
                return 14.0f;
            }
        } else {
            if (str.startsWith("UX-8TA")) {
                return 3.0f;
            }
            if (str.startsWith("SX-1CTA") || str.startsWith("SX-1CTSA") || str.startsWith("SX-2CTA") || str.startsWith("US-1C") || str.startsWith("SS-5H") || str.startsWith("SS-5HS")) {
                return 3.5f;
            }
            if (str.startsWith("UX-8CA")) {
                return 3.2f;
            }
            if (str.startsWith("SX-1CTB") || str.startsWith("SX-1CTSB") || str.startsWith("UX-8CB")) {
                return 7.5f;
            }
            if (str.startsWith("UX-8PB")) {
                return 7.0f;
            }
            if (str.startsWith("SX-2CTB")) {
                return 6.0f;
            }
            if (str.startsWith("SH-1C")) {
                return 18.0f;
            }
            if (str.startsWith("SH-2C")) {
                return 16.0f;
            }
        }
        return z3 ? h.M() : h.J();
    }

    public static float b(String str) {
        if (str.startsWith("SX-1CTA") || str.startsWith("SX-1CTSA") || str.startsWith("SX-2CTA") || str.startsWith("US-1C") || str.startsWith("SS-5H") || str.startsWith("SS-5HS") || str.startsWith("UX-8CA") || str.startsWith("PA-2C") || str.startsWith("UX-8PA")) {
            return 2.5f;
        }
        if (str.startsWith("SX-1CTB") || str.startsWith("SX-1CTSB") || str.startsWith("SX-2CTB") || str.startsWith("UX-8CB") || str.startsWith("SL-5C") || str.startsWith("SL-5H") || str.startsWith("UL-1C") || str.startsWith("US-2T")) {
            return 6.6f;
        }
        if (str.startsWith("UX-8PB")) {
            return 5.0f;
        }
        return str.startsWith("SH-1C") ? 10.0f : -1.0f;
    }

    public static int[] c(int[] iArr, int i4, int i5) {
        double d4;
        double d5;
        int i6;
        int i7 = i4 / 128;
        if (i5 == 0) {
            d4 = 128;
            d5 = 2.0d;
            i6 = (int) ((d4 * d5) / 4.0d);
        } else {
            if (i5 == 1) {
                d4 = 128;
                d5 = 3.0d;
            } else if (i5 != 3) {
                if (i5 != 4) {
                    i6 = 0;
                }
                d4 = 128;
                d5 = 2.0d;
            } else {
                d4 = 128;
                d5 = 1.0d;
            }
            i6 = (int) ((d4 * d5) / 4.0d);
        }
        if (i6 != 0) {
            int[] iArr2 = new int[i4];
            for (int i8 = 0; i8 < i7; i8++) {
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = (i8 * 128) + i9;
                    iArr2[i10] = iArr[(128 - i6) + i10];
                }
                for (int i11 = 0; i11 < 128 - i6; i11++) {
                    int i12 = (i8 * 128) + i11;
                    iArr2[i12 + i6] = iArr[i12];
                }
            }
            System.arraycopy(iArr2, 0, iArr, 0, iArr.length);
        }
        return iArr;
    }

    public static PointF d(PointF pointF, float f4, PointF pointF2) {
        PointF pointF3 = new PointF();
        double d4 = (float) (((double) (f4 / 180.0f)) * 3.141592653589793d);
        double d5 = pointF.x - pointF2.x;
        double d6 = pointF.y - pointF2.y;
        float fCos = (float) ((Math.cos(d4) * d5) - (Math.sin(d4) * d6));
        float fSin = (float) ((Math.sin(d4) * d5) + (Math.cos(d4) * d6));
        pointF3.x = fCos + pointF2.x;
        pointF3.y = fSin + pointF2.y;
        return pointF3;
    }
}
