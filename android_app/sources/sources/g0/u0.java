package g0;

import android.graphics.Path;
import android.util.Log;
import androidx.constraintlayout.widget.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7810a = "PathParser";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7812b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f7813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f7814b;

        public b(char c4, float[] fArr) {
            this.f7813a = c4;
            this.f7814b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void a(Path path, float[] fArr, char c4, char c5, float[] fArr2) {
            int i4;
            int i5;
            int i6;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c6 = c5;
            boolean z3 = false;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i4 = 7;
                    i5 = i4;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    i5 = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case e.m.f3291t3 /* 118 */:
                    i5 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case e.m.f3281r3 /* 116 */:
                default:
                    i5 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case e.m.x3 /* 122 */:
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    i5 = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i7 = 0;
            char c7 = c4;
            while (i7 < fArr2.length) {
                if (c6 != 'A') {
                    if (c6 == 'C') {
                        i6 = i7;
                        int i8 = i6 + 2;
                        int i9 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        f18 = fArr2[i10];
                        float f22 = fArr2[i11];
                        float f23 = fArr2[i8];
                        float f24 = fArr2[i9];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c6 == 'H') {
                        i6 = i7;
                        int i12 = i6 + 0;
                        path.lineTo(fArr2[i12], f19);
                        f18 = fArr2[i12];
                    } else if (c6 == 'Q') {
                        i6 = i7;
                        int i13 = i6 + 0;
                        int i14 = i6 + 1;
                        int i15 = i6 + 2;
                        int i16 = i6 + 3;
                        path.quadTo(fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f25 = fArr2[i13];
                        float f26 = fArr2[i14];
                        f18 = fArr2[i15];
                        f19 = fArr2[i16];
                        f14 = f25;
                        f15 = f26;
                    } else if (c6 == 'V') {
                        i6 = i7;
                        int i17 = i6 + 0;
                        path.lineTo(f18, fArr2[i17]);
                        f19 = fArr2[i17];
                    } else if (c6 != 'a') {
                        if (c6 != 'c') {
                            if (c6 == 'h') {
                                int i18 = i7 + 0;
                                path.rLineTo(fArr2[i18], 0.0f);
                                f18 += fArr2[i18];
                            } else if (c6 != 'q') {
                                if (c6 == 'v') {
                                    int i19 = i7 + 0;
                                    path.rLineTo(0.0f, fArr2[i19]);
                                    f7 = fArr2[i19];
                                } else if (c6 == 'L') {
                                    int i20 = i7 + 0;
                                    int i21 = i7 + 1;
                                    path.lineTo(fArr2[i20], fArr2[i21]);
                                    f18 = fArr2[i20];
                                    f19 = fArr2[i21];
                                } else if (c6 == 'M') {
                                    f18 = fArr2[i7 + 0];
                                    f19 = fArr2[i7 + 1];
                                    if (i7 > 0) {
                                        path.lineTo(f18, f19);
                                    } else {
                                        path.moveTo(f18, f19);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 'S') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    float f27 = f19;
                                    int i22 = i7 + 0;
                                    int i23 = i7 + 1;
                                    int i24 = i7 + 2;
                                    int i25 = i7 + 3;
                                    path.cubicTo(f18, f27, fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f4 = fArr2[i22];
                                    f5 = fArr2[i23];
                                    f18 = fArr2[i24];
                                    f19 = fArr2[i25];
                                    f14 = f4;
                                    f15 = f5;
                                } else if (c6 == 'T') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    int i26 = i7 + 0;
                                    int i27 = i7 + 1;
                                    path.quadTo(f18, f19, fArr2[i26], fArr2[i27]);
                                    float f28 = fArr2[i26];
                                    float f29 = fArr2[i27];
                                    i6 = i7;
                                    f15 = f19;
                                    f14 = f18;
                                    f18 = f28;
                                    f19 = f29;
                                } else if (c6 == 'l') {
                                    int i28 = i7 + 0;
                                    int i29 = i7 + 1;
                                    path.rLineTo(fArr2[i28], fArr2[i29]);
                                    f18 += fArr2[i28];
                                    f7 = fArr2[i29];
                                } else if (c6 == 'm') {
                                    float f30 = fArr2[i7 + 0];
                                    f18 += f30;
                                    float f31 = fArr2[i7 + 1];
                                    f19 += f31;
                                    if (i7 > 0) {
                                        path.rLineTo(f30, f31);
                                    } else {
                                        path.rMoveTo(f30, f31);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        float f32 = f18 - f14;
                                        f8 = f19 - f15;
                                        f9 = f32;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i30 = i7 + 0;
                                    int i31 = i7 + 1;
                                    int i32 = i7 + 2;
                                    int i33 = i7 + 3;
                                    path.rCubicTo(f9, f8, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f4 = fArr2[i30] + f18;
                                    f5 = fArr2[i31] + f19;
                                    f18 += fArr2[i32];
                                    f6 = fArr2[i33];
                                } else if (c6 == 't') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f10 = f18 - f14;
                                        f11 = f19 - f15;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i34 = i7 + 0;
                                    int i35 = i7 + 1;
                                    path.rQuadTo(f10, f11, fArr2[i34], fArr2[i35]);
                                    float f33 = f10 + f18;
                                    float f34 = f11 + f19;
                                    f18 += fArr2[i34];
                                    f19 += fArr2[i35];
                                    f15 = f34;
                                    f14 = f33;
                                }
                                f19 += f7;
                            } else {
                                int i36 = i7 + 0;
                                int i37 = i7 + 1;
                                int i38 = i7 + 2;
                                int i39 = i7 + 3;
                                path.rQuadTo(fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                f4 = fArr2[i36] + f18;
                                f5 = fArr2[i37] + f19;
                                f18 += fArr2[i38];
                                f6 = fArr2[i39];
                            }
                            i6 = i7;
                        } else {
                            int i40 = i7 + 2;
                            int i41 = i7 + 3;
                            int i42 = i7 + 4;
                            int i43 = i7 + 5;
                            path.rCubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f4 = fArr2[i40] + f18;
                            f5 = fArr2[i41] + f19;
                            f18 += fArr2[i42];
                            f6 = fArr2[i43];
                        }
                        f19 += f6;
                        f14 = f4;
                        f15 = f5;
                        i6 = i7;
                    } else {
                        int i44 = i7 + 5;
                        int i45 = i7 + 6;
                        i6 = i7;
                        c(path, f18, f19, fArr2[i44] + f18, fArr2[i45] + f19, fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f18 += fArr2[i44];
                        f19 += fArr2[i45];
                    }
                    i7 = i6 + i5;
                    c7 = c5;
                    c6 = c7;
                    z3 = false;
                } else {
                    i6 = i7;
                    int i46 = i6 + 5;
                    int i47 = i6 + 6;
                    c(path, f18, f19, fArr2[i46], fArr2[i47], fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f18 = fArr2[i46];
                    f19 = fArr2[i47];
                }
                f15 = f19;
                f14 = f18;
                i7 = i6 + i5;
                c7 = c5;
                c6 = c7;
                z3 = false;
            }
            fArr[z3 ? 1 : 0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        public static void b(Path path, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
            double d13 = d6;
            int iCeil = (int) Math.ceil(Math.abs((d12 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d10);
            double dSin = Math.sin(d10);
            double dCos2 = Math.cos(d11);
            double dSin2 = Math.sin(d11);
            double d14 = -d13;
            double d15 = d14 * dCos;
            double d16 = d7 * dSin;
            double d17 = (d15 * dSin2) - (d16 * dCos2);
            double d18 = d14 * dSin;
            double d19 = d7 * dCos;
            double d20 = (dSin2 * d18) + (dCos2 * d19);
            double d21 = d12 / ((double) iCeil);
            double d22 = d20;
            double d23 = d17;
            int i4 = 0;
            double d24 = d8;
            double d25 = d9;
            double d26 = d11;
            while (i4 < iCeil) {
                double d27 = d26 + d21;
                double dSin3 = Math.sin(d27);
                double dCos3 = Math.cos(d27);
                double d28 = (d4 + ((d13 * dCos) * dCos3)) - (d16 * dSin3);
                double d29 = d5 + (d13 * dSin * dCos3) + (d19 * dSin3);
                double d30 = (d15 * dSin3) - (d16 * dCos3);
                double d31 = (dSin3 * d18) + (dCos3 * d19);
                double d32 = d27 - d26;
                double dTan = Math.tan(d32 / 2.0d);
                double dSin4 = (Math.sin(d32) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d33 = d24 + (d23 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d33, (float) (d25 + (d22 * dSin4)), (float) (d28 - (dSin4 * d30)), (float) (d29 - (dSin4 * d31)), (float) d28, (float) d29);
                i4++;
                d21 = d21;
                dSin = dSin;
                d24 = d28;
                d18 = d18;
                dCos = dCos;
                d26 = d27;
                d22 = d31;
                d23 = d30;
                iCeil = iCeil;
                d25 = d29;
                d13 = d6;
            }
        }

        public static void c(Path path, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z3, boolean z4) {
            double d4;
            double d5;
            double radians = Math.toRadians(f10);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d6 = f4;
            double d7 = d6 * dCos;
            double d8 = f5;
            double d9 = f8;
            double d10 = (d7 + (d8 * dSin)) / d9;
            double d11 = (((double) (-f4)) * dSin) + (d8 * dCos);
            double d12 = f9;
            double d13 = d11 / d12;
            double d14 = f7;
            double d15 = ((((double) f6) * dCos) + (d14 * dSin)) / d9;
            double d16 = ((((double) (-f6)) * dSin) + (d14 * dCos)) / d12;
            double d17 = d10 - d15;
            double d18 = d13 - d16;
            double d19 = (d10 + d15) / 2.0d;
            double d20 = (d13 + d16) / 2.0d;
            double d21 = (d17 * d17) + (d18 * d18);
            if (d21 == 0.0d) {
                Log.w(u0.f7810a, " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                Log.w(u0.f7810a, "Points are too far apart " + d21);
                float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                c(path, f4, f5, f6, f7, f8 * fSqrt, f9 * fSqrt, f10, z3, z4);
                return;
            }
            double dSqrt = Math.sqrt(d22);
            double d23 = d17 * dSqrt;
            double d24 = dSqrt * d18;
            if (z3 == z4) {
                d4 = d19 - d24;
                d5 = d20 + d23;
            } else {
                d4 = d19 + d24;
                d5 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d13 - d5, d10 - d4);
            double dAtan22 = Math.atan2(d16 - d5, d15 - d4) - dAtan2;
            if (z4 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d4 * d9;
            double d26 = d5 * d12;
            b(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d9, d12, d6, d8, radians, dAtan2, dAtan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c4 = 'm';
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                b bVar = bVarArr[i4];
                a(path, fArr, c4, bVar.f7813a, bVar.f7814b);
                c4 = bVarArr[i4].f7813a;
            }
        }

        public void d(b bVar, b bVar2, float f4) {
            this.f7813a = bVar.f7813a;
            int i4 = 0;
            while (true) {
                float[] fArr = bVar.f7814b;
                if (i4 >= fArr.length) {
                    return;
                }
                this.f7814b[i4] = (fArr[i4] * (1.0f - f4)) + (bVar2.f7814b[i4] * f4);
                i4++;
            }
        }

        public b(b bVar) {
            this.f7813a = bVar.f7813a;
            float[] fArr = bVar.f7814b;
            this.f7814b = u0.c(fArr, 0, fArr.length);
        }
    }

    public static void a(ArrayList<b> arrayList, char c4, float[] fArr) {
        arrayList.add(new b(c4, fArr));
    }

    public static boolean b(@c.k0 b[] bVarArr, @c.k0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            b bVar = bVarArr[i4];
            char c4 = bVar.f7813a;
            b bVar2 = bVarArr2[i4];
            if (c4 != bVar2.f7813a || bVar.f7814b.length != bVar2.f7814b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i4 < 0 || i4 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = i5 - i4;
        int iMin = Math.min(i6, length - i4);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i4, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            int iJ = j(str, i4);
            String strTrim = str.substring(i5, iJ).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i5 = iJ;
            i4 = iJ + 1;
        }
        if (i4 - i5 == 1 && i5 < str.length()) {
            a(arrayList, str.charAt(i5), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing " + str, e4);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr2[i4] = new b(bVarArr[i4]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.String r8, int r9, g0.u0.a r10) {
        /*
            r0 = 0
            r10.f7812b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L35
        L27:
            r10.f7812b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = r0
            goto L35
        L31:
            r2 = r7
            goto L35
        L33:
            r2 = r0
            r4 = r7
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f7811a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.u0.g(java.lang.String, int, g0.u0$a):void");
    }

    public static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i4 = 1;
            int i5 = 0;
            while (i4 < length) {
                g(str, i4, aVar);
                int i6 = aVar.f7811a;
                if (i4 < i6) {
                    fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                    i5++;
                }
                i4 = aVar.f7812b ? i6 : i6 + 1;
            }
            return c(fArr, 0, i5);
        } catch (NumberFormatException e4) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e4);
        }
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f4) {
        if (bVarArr == null || bVarArr2 == null || bVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (bVarArr.length != bVarArr2.length || bVarArr2.length != bVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!b(bVarArr2, bVarArr3)) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr[i4].d(bVarArr2[i4], bVarArr3[i4], f4);
        }
        return true;
    }

    public static int j(String str, int i4) {
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i4 = 0; i4 < bVarArr2.length; i4++) {
            bVarArr[i4].f7813a = bVarArr2[i4].f7813a;
            int i5 = 0;
            while (true) {
                float[] fArr = bVarArr2[i4].f7814b;
                if (i5 < fArr.length) {
                    bVarArr[i4].f7814b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }
}
